package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class mainmenu2 extends Object{
public static mainmenu2 mostCurrent = new mainmenu2();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.mainmenu2", null);
		ba.loadHtSubs(mainmenu2.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.docU.mainmenu2", ba);
		}
	}
    public static Class<?> getObject() {
		return mainmenu2.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _frm = null;
public static anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pnlfondomainmenu = null;
public static anywheresoftware.b4j.objects.TreeViewWrapper _treeviewmainmenu = null;
public static b4j.docU.b4xdialog _dialog = null;
public static anywheresoftware.b4j.objects.SplitPaneWrapper _splitpanemainmenu = null;
public static b4j.docU.bctextengine _textengine1 = null;
public static b4j.docU.bbcodeview _bbcodeviewelementosmainmenu = null;
public static b4j.docU.jamloadingindicator _jamloadingindicator1 = null;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.docU.main _main = null;
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
public static void  _show() throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(null);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.mainmenu2 parent) {
this.parent = parent;
}
b4j.docU.mainmenu2 parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
int _i = 0;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _ti = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tiopen = null;
String _accion = "";
int step37;
int limit37;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu2";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="If frm.IsInitialized=False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._frm.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
parent._frm.Initialize(ba,"frm",parent._main._xscreen /*int*/ ,parent._main._yscreen /*int*/ );
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(parent._frm));
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"sta";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.True)});
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="frm.Icon = Main.IconoFormularios";
parent._frm.setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="frm.RootPane.LoadLayout(\"scrMainMenu2\")";
parent._frm.getRootPane().LoadLayout(ba,"scrMainMenu2");
RDebugUtils.currentLine=786442;
 //BA.debugLineNum = 786442;BA.debugLine="SplitPaneMainMenu.LoadLayout(\"scrMainMenuTreeVie";
parent._splitpanemainmenu.LoadLayout(ba,"scrMainMenuTreeView");
RDebugUtils.currentLine=786444;
 //BA.debugLineNum = 786444;BA.debugLine="SplitPaneMainMenu.LoadLayout(\"scrMainMenuBBCodeE";
parent._splitpanemainmenu.LoadLayout(ba,"scrMainMenuBBCodeElementos");
RDebugUtils.currentLine=786445;
 //BA.debugLineNum = 786445;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"   \" & \"Menú";
parent._frm.setTitle(parent._main._prefijotitleforms /*String*/ +"   "+"Menú Inicio");
RDebugUtils.currentLine=786447;
 //BA.debugLineNum = 786447;BA.debugLine="Dialog.Initialize (frm.RootPane)";
parent._dialog._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._frm.getRootPane().getObject())));
RDebugUtils.currentLine=786449;
 //BA.debugLineNum = 786449;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=786450;
 //BA.debugLineNum = 786450;BA.debugLine="jo=SplitPaneMainMenu";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(parent._splitpanemainmenu.getObject()));
RDebugUtils.currentLine=786453;
 //BA.debugLineNum = 786453;BA.debugLine="CSSUtils.SetStyleProperty(TreeViewMainMenu,\"-fx-";
parent._cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(parent._treeviewmainmenu.getObject())),"-fx-selection-bar","#00FA9A");
RDebugUtils.currentLine=786455;
 //BA.debugLineNum = 786455;BA.debugLine="frm.Title=\"Menú Inicio \" & Main.SufijoTitleForms";
parent._frm.setTitle("Menú Inicio "+parent._main._sufijotitleforms /*String*/ );
RDebugUtils.currentLine=786457;
 //BA.debugLineNum = 786457;BA.debugLine="Dialog.Initialize (frm.RootPane)";
parent._dialog._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._frm.getRootPane().getObject())));
RDebugUtils.currentLine=786458;
 //BA.debugLineNum = 786458;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
parent._jamloadingindicator1._initialize /*String*/ (null,ba,mainmenu2.getObject(),(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._frm.getRootPane().getObject())));
RDebugUtils.currentLine=786459;
 //BA.debugLineNum = 786459;BA.debugLine="jamLoadingIndicator1.EstiloLoadingIndicator=\"Fiv";
parent._jamloadingindicator1._setestiloloadingindicator(null,"Five Lines 1");
RDebugUtils.currentLine=786461;
 //BA.debugLineNum = 786461;BA.debugLine="jamLoadingIndicator1.ColorPanelFondo=xui.Color_T";
parent._jamloadingindicator1._setcolorpanelfondo /*int*/ (null,parent._xui.Color_Transparent);
RDebugUtils.currentLine=786462;
 //BA.debugLineNum = 786462;BA.debugLine="jamLoadingIndicator1.ColorLoadingIndicator=0xFF6";
parent._jamloadingindicator1._setcolorloadingindicator(null,((int)0xff696969));
RDebugUtils.currentLine=786463;
 //BA.debugLineNum = 786463;BA.debugLine="jamLoadingIndicator1.ColorMensaje=0xFF696969";
parent._jamloadingindicator1._setcolormensaje(null,((int)0xff696969));
RDebugUtils.currentLine=786465;
 //BA.debugLineNum = 786465;BA.debugLine="SplitPaneMainMenu.DividerPositions=Array As Doub";
parent._splitpanemainmenu.setDividerPositions(new double[]{0.30});
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=786476;
 //BA.debugLineNum = 786476;BA.debugLine="CargaTreeView";
_cargatreeview();
RDebugUtils.currentLine=786478;
 //BA.debugLineNum = 786478;BA.debugLine="frm.Show";
parent._frm.Show();
RDebugUtils.currentLine=786480;
 //BA.debugLineNum = 786480;BA.debugLine="TreeViewMainMenu.ClearSelection";
parent._treeviewmainmenu.ClearSelection();
RDebugUtils.currentLine=786482;
 //BA.debugLineNum = 786482;BA.debugLine="jamLoadingIndicator1.Close";
parent._jamloadingindicator1._close /*String*/ (null);
RDebugUtils.currentLine=786484;
 //BA.debugLineNum = 786484;BA.debugLine="If TextEngine1.IsInitialized=False Then";
if (true) break;

case 5:
//if
this.state = 8;
if (parent._textengine1.IsInitialized /*boolean*/ ()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=786485;
 //BA.debugLineNum = 786485;BA.debugLine="TextEngine1.Initialize(frm.RootPane)";
parent._textengine1._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._frm.getRootPane().getObject())));
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=786523;
 //BA.debugLineNum = 786523;BA.debugLine="Main.lstSelItem.Clear";
parent._main._lstselitem /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=786524;
 //BA.debugLineNum = 786524;BA.debugLine="If Main.TreeItemMenuAbreForm.IsInitialized Then";
if (true) break;

case 9:
//if
this.state = 34;
if (parent._main._treeitemmenuabreform /*anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper*/ .IsInitialized()) { 
this.state = 11;
}else {
this.state = 33;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=786526;
 //BA.debugLineNum = 786526;BA.debugLine="Log(Main.TreeItemMenuAbreForm.Text)";
anywheresoftware.b4a.keywords.Common.LogImpl("8786526",parent._main._treeitemmenuabreform /*anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper*/ .getText(),0);
RDebugUtils.currentLine=786528;
 //BA.debugLineNum = 786528;BA.debugLine="If Main.TreeItemMenuAbreForm<>Null Then";
if (true) break;

case 12:
//if
this.state = 31;
if (parent._main._treeitemmenuabreform /*anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper*/ != null) { 
this.state = 14;
}else {
this.state = 30;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=786529;
 //BA.debugLineNum = 786529;BA.debugLine="SearchParentsTreeItem(Main.TreeItemMenuAbreForm";
_searchparentstreeitem(parent._main._treeitemmenuabreform /*anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper*/ );
RDebugUtils.currentLine=786530;
 //BA.debugLineNum = 786530;BA.debugLine="If Main.lstSelItem.Size>0 Then";
if (true) break;

case 15:
//if
this.state = 28;
if (parent._main._lstselitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=786531;
 //BA.debugLineNum = 786531;BA.debugLine="For i=Main.lstSelItem.Size-2 To 0 Step-1";
if (true) break;

case 18:
//for
this.state = 27;
step37 = -1;
limit37 = (int) (0);
_i = (int) (parent._main._lstselitem /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-2) ;
this.state = 39;
if (true) break;

case 39:
//C
this.state = 27;
if ((step37 > 0 && _i <= limit37) || (step37 < 0 && _i >= limit37)) this.state = 20;
if (true) break;

case 40:
//C
this.state = 39;
_i = ((int)(0 + _i + step37)) ;
if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=786532;
 //BA.debugLineNum = 786532;BA.debugLine="Dim ti As TreeItem=Main.lstSelItem.Get(i)";
_ti = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_ti = (anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper(), (javafx.scene.control.TreeItem)(parent._main._lstselitem /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=786534;
 //BA.debugLineNum = 786534;BA.debugLine="Log(\"ti.text \" & ti.Text)";
anywheresoftware.b4a.keywords.Common.LogImpl("8786534","ti.text "+_ti.getText(),0);
RDebugUtils.currentLine=786536;
 //BA.debugLineNum = 786536;BA.debugLine="Dim tiOpen As TreeItem=SearchTreeItem(TreeVie";
_tiopen = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_tiopen = _searchtreeitem(parent._treeviewmainmenu.getRoot(),_ti.getText());
RDebugUtils.currentLine=786537;
 //BA.debugLineNum = 786537;BA.debugLine="If tiOpen.Text=\"root\" Then Continue";
if (true) break;

case 21:
//if
this.state = 26;
if ((_tiopen.getText()).equals("root")) { 
this.state = 23;
;}if (true) break;

case 23:
//C
this.state = 26;
this.state = 40;
if (true) break;;
if (true) break;

case 26:
//C
this.state = 40;
;
RDebugUtils.currentLine=786539;
 //BA.debugLineNum = 786539;BA.debugLine="Log(\"tiOpen.text \" & tiOpen.Text)";
anywheresoftware.b4a.keywords.Common.LogImpl("8786539","tiOpen.text "+_tiopen.getText(),0);
RDebugUtils.currentLine=786544;
 //BA.debugLineNum = 786544;BA.debugLine="Dim jo As JavaObject=tiOpen";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_tiopen.getObject()));
RDebugUtils.currentLine=786545;
 //BA.debugLineNum = 786545;BA.debugLine="jo.RunMethod(\"setExpanded\", Array(True))";
_jo.RunMethod("setExpanded",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.True)});
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = 31;
;
RDebugUtils.currentLine=786549;
 //BA.debugLineNum = 786549;BA.debugLine="ScrollToItem(TreeViewMainMenu,Main.TreeItemMenu";
_scrolltoitem(parent._treeviewmainmenu,parent._main._treeitemmenuabreform /*anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper*/ );
RDebugUtils.currentLine=786551;
 //BA.debugLineNum = 786551;BA.debugLine="CrearAccesosDirectosItem3(TreeItemMayorNivelExp";
_crearaccesosdirectositem3(_treeitemmayornivelexpandido(parent._treeviewmainmenu.getRoot()));
 if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=786554;
 //BA.debugLineNum = 786554;BA.debugLine="CrearAccesosDirectosItem3(TreeItemMayorNivelExp";
_crearaccesosdirectositem3(_treeitemmayornivelexpandido(parent._treeviewmainmenu.getRoot()));
 if (true) break;

case 31:
//C
this.state = 34;
;
 if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=786558;
 //BA.debugLineNum = 786558;BA.debugLine="CrearAccesosDirectosItem3(TreeItemMayorNivelExpa";
_crearaccesosdirectositem3(_treeitemmayornivelexpandido(parent._treeviewmainmenu.getRoot()));
 if (true) break;

case 34:
//C
this.state = 35;
;
RDebugUtils.currentLine=786561;
 //BA.debugLineNum = 786561;BA.debugLine="wait for(VerificarVersionActual) complete (Accion";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "show"), _verificarversionactual());
this.state = 41;
return;
case 41:
//C
this.state = 35;
_accion = (String) result[0];
;
RDebugUtils.currentLine=786562;
 //BA.debugLineNum = 786562;BA.debugLine="If Accion=\"ExitApp\" Then";
if (true) break;

case 35:
//if
this.state = 38;
if ((_accion).equals("ExitApp")) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=786563;
 //BA.debugLineNum = 786563;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 if (true) break;

case 38:
//C
this.state = -1;
;
RDebugUtils.currentLine=786599;
 //BA.debugLineNum = 786599;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _abrirfichero(String _fsel) throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "abrirfichero", false))
	 {Debug.delegate(ba, "abrirfichero", new Object[] {_fsel}); return;}
ResumableSub_AbrirFichero rsub = new ResumableSub_AbrirFichero(null,_fsel);
rsub.resume(ba, null);
}
public static class ResumableSub_AbrirFichero extends BA.ResumableSub {
public ResumableSub_AbrirFichero(b4j.docU.mainmenu2 parent,String _fsel) {
this.parent = parent;
this._fsel = _fsel;
}
b4j.docU.mainmenu2 parent;
String _fsel;
String _nombref = "";
String _dirf = "";
Object _msa = null;
butt.droid.awtRobot.AWTRobot _jr = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu2";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Dim nombreF As String=File.GetName(fSel)";
_nombref = anywheresoftware.b4a.keywords.Common.File.GetName(_fsel);
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="Dim DirF As String=File.GetFileParent(fSel)";
_dirf = anywheresoftware.b4a.keywords.Common.File.GetFileParent(_fsel);
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="If File.Exists(DirF,\"\") =False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (anywheresoftware.b4a.keywords.Common.File.Exists(_dirf,"")==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = parent._xui.MsgboxAsync(ba,"No ha sido posible acceder a la carpeta "+_dirf+"."+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Verifica si tienes acceso a la red. En caso afirmativo, es posible que la carpeta haya sido eliminada o cambiada de ubicación","Error");
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "abrirfichero"), _msa);
this.state = 13;
return;
case 13:
//C
this.state = 4;
;
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="If File.Exists(fSel,\"\") =False Then";

case 4:
//if
this.state = 7;
if (anywheresoftware.b4a.keywords.Common.File.Exists(_fsel,"")==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = parent._xui.MsgboxAsync(ba,"No ha sido posible acceder al fichero "+_nombref+"."+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Verifica si tienes acceso a la red. En caso afirmativo, es posible que el fichero haya sido eliminada o cambiado de ubicación","Error");
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "abrirfichero"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 7;
;
RDebugUtils.currentLine=1376267;
 //BA.debugLineNum = 1376267;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=1376269;
 //BA.debugLineNum = 1376269;BA.debugLine="Try";

case 7:
//try
this.state = 12;
this.catchState = 11;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 12;
this.catchState = 11;
RDebugUtils.currentLine=1376270;
 //BA.debugLineNum = 1376270;BA.debugLine="Dim jR As AWTRobot";
_jr = new butt.droid.awtRobot.AWTRobot();
RDebugUtils.currentLine=1376271;
 //BA.debugLineNum = 1376271;BA.debugLine="jR.SystemOpenExternalFile(fSel)";
_jr.SystemOpenExternalFile(_fsel);
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=1376273;
 //BA.debugLineNum = 1376273;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = parent._xui.MsgboxAsync(ba,"No ha sido posible abrir el fichero seleccionado."+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Verifica si tienes acceso a la red. En caso afirmativo, es posible que el fichero haya sido eliminado o cambiado de ubicación","Error");
RDebugUtils.currentLine=1376274;
 //BA.debugLineNum = 1376274;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "abrirfichero"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 12;
;
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=1376276;
 //BA.debugLineNum = 1376276;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public static String  _appstartotros(String _surl) throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "appstartotros", false))
	 {return ((String) Debug.delegate(ba, "appstartotros", new Object[] {_surl}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub AppStartOtros(sURL As String)";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="fx.ShowExternalDocument(sURL)";
_fx.ShowExternalDocument(_surl);
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.object.JavaObject  _asjo(anywheresoftware.b4j.object.JavaObject _o) throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "asjo", false))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "asjo", new Object[] {_o}));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Return o";
if (true) return _o;
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="End Sub";
return null;
}
public static void  _bbcodeviewelementosmainmenu_linkclicked(String _url) throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "bbcodeviewelementosmainmenu_linkclicked", false))
	 {Debug.delegate(ba, "bbcodeviewelementosmainmenu_linkclicked", new Object[] {_url}); return;}
ResumableSub_BBCodeViewElementosMainMenu_LinkClicked rsub = new ResumableSub_BBCodeViewElementosMainMenu_LinkClicked(null,_url);
rsub.resume(ba, null);
}
public static class ResumableSub_BBCodeViewElementosMainMenu_LinkClicked extends BA.ResumableSub {
public ResumableSub_BBCodeViewElementosMainMenu_LinkClicked(b4j.docU.mainmenu2 parent,String _url) {
this.parent = parent;
this._url = _url;
}
b4j.docU.mainmenu2 parent;
String _url;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tiurl = null;
Object _robj = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu2";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Log(URL)";
anywheresoftware.b4a.keywords.Common.LogImpl("82359297",_url,0);
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Dim tIURL As TreeItem=SearchTreeItem(TreeViewMain";
_tiurl = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_tiurl = _searchtreeitem(parent._treeviewmainmenu.getRoot(),_url);
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="If tIURL.IsInitialized Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_tiurl.IsInitialized()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=2359307;
 //BA.debugLineNum = 2359307;BA.debugLine="SeleccionarMenuItem(tIURL)";
_seleccionarmenuitem(_tiurl);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=2359309;
 //BA.debugLineNum = 2359309;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Error\",\"Error en";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "bbcodeviewelementosmainmenu_linkclicked"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Error","Error en URL treeItem..."));
this.state = 7;
return;
case 7:
//C
this.state = 6;
_robj = (Object) result[0];
;
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=2359311;
 //BA.debugLineNum = 2359311;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper  _searchtreeitem(anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _parent,String _s) throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "searchtreeitem", false))
	 {return ((anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper) Debug.delegate(ba, "searchtreeitem", new Object[] {_parent,_s}));}
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _ti = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _res = null;
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub SearchTreeItem(Parent As TreeItem, s As String";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="For Each ti As TreeItem In Parent.Children";
_ti = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = _parent.getChildren();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_ti = (anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper(), (javafx.scene.control.TreeItem)(group1.Get(index1)));
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="If ti.Text = s Then";
if ((_ti.getText()).equals(_s)) { 
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="Return ti";
if (true) return _ti;
 };
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="If ti.Children.Size > 0 Then";
if (_ti.getChildren().getSize()>0) { 
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="Dim res As TreeItem = SearchTreeItem(ti, s)";
_res = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_res = _searchtreeitem(_ti,_s);
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="If res.IsInitialized Then Return res";
if (_res.IsInitialized()) { 
if (true) return _res;};
 };
 }
};
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="Dim res As TreeItem";
_res = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="End Sub";
return null;
}
public static String  _seleccionarmenuitem(anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _ti) throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "seleccionarmenuitem", false))
	 {return ((String) Debug.delegate(ba, "seleccionarmenuitem", new Object[] {_ti}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub SeleccionarMenuItem(ti As TreeItem)";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Dim jo As JavaObject = TreeViewMainMenu";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_treeviewmainmenu.getObject()));
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="jo.RunMethodJO(\"getSelectionModel\", Null).RunMeth";
_jo.RunMethodJO("getSelectionModel",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethod("select",new Object[]{(Object)(_ti.getObject())});
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="End Sub";
return "";
}
public static String  _cargatreeview() throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "cargatreeview", false))
	 {return ((String) Debug.delegate(ba, "cargatreeview", null));}
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _imgtreeitemgo = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tidocumentos = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _ticontroldocumentosnogestionados = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _ticontroldocumentosperiodo = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _ticontrolosubspendientesnoconfeccion = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tifasesdocumento = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _timarcaralbaranfisico = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tilogistica = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _titransportes = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _titxt = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _titxtexpedicionessinentregar = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _titxtexpedicionesperiodo = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tidhl = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tidhlexpedicionessinentregar = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _ticorreosexpress = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _ticorreosexpressexpedicionesperiodo = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _ticorreosexpressinfoexpedicion = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _ticompras = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tiseguimientofechasprometidaspedidoscompra = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tievaluacionproveedores = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tiventas = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tigestionventas = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tiinformesexpedicionesclientes = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _ticgeneracionficheroscsvplantillapedidos = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _ticrestartdocuwarebackworker = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tib2b = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _titestsinfomagento = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tipedidosclientes = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tirepsol = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tiimportacionpedidoseessrepsol = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tialbaranesventarepsol = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tianalisisdatos = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tianalisisdisponiblesalmacenarticulotalla = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tiincidencias = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _bombimg = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tiincidenciasproveedor = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tiincidenciasproveedorlista = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tiincidenciasproveedortaeaspendientes = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tiincidenciascliente = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tiincidenciasinternas = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tiutilidades = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tificheroscarpetaexcellinks = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tipermisosaplicacion = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tiacercade = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tisalir = null;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub CargaTreeView";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="TreeViewMainMenu.Root.Children.Clear";
_treeviewmainmenu.getRoot().getChildren().Clear();
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Dim imgTreeItemGo As Image=Main.fx.LoadImageSampl";
_imgtreeitemgo = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_imgtreeitemgo = _main._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImageSample(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"arrow-right16.png",16,16);
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="Dim tiDocumentos As TreeItem";
_tidocumentos = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="tiDocumentos.Initialize(\"tItem\",\"Documentos\")";
_tidocumentos.Initialize(ba,"tItem","Documentos");
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="tiDocumentos.Image=Main.fx.LoadImage(File.Dirasse";
_tidocumentos.setImage((javafx.scene.image.Image)(_main._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"outline_description_black_36dp.png").getObject()));
RDebugUtils.currentLine=983057;
 //BA.debugLineNum = 983057;BA.debugLine="TreeViewMainMenu.Root.Children.Add(tiDocumentos)";
_treeviewmainmenu.getRoot().getChildren().Add((Object)(_tidocumentos.getObject()));
RDebugUtils.currentLine=983059;
 //BA.debugLineNum = 983059;BA.debugLine="Dim tiControlDocumentosNoGestionados As TreeItem";
_ticontroldocumentosnogestionados = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983060;
 //BA.debugLineNum = 983060;BA.debugLine="tiControlDocumentosNoGestionados.Initialize(\"tIte";
_ticontroldocumentosnogestionados.Initialize(ba,"tItem","Documentos No Gestionados");
RDebugUtils.currentLine=983061;
 //BA.debugLineNum = 983061;BA.debugLine="tiControlDocumentosNoGestionados.Image=imgTreeIte";
_ticontroldocumentosnogestionados.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983062;
 //BA.debugLineNum = 983062;BA.debugLine="tiDocumentos.Children.Add(tiControlDocumentosNoGe";
_tidocumentos.getChildren().Add((Object)(_ticontroldocumentosnogestionados.getObject()));
RDebugUtils.currentLine=983064;
 //BA.debugLineNum = 983064;BA.debugLine="Dim tiControlDocumentosPeriodo As TreeItem";
_ticontroldocumentosperiodo = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983065;
 //BA.debugLineNum = 983065;BA.debugLine="tiControlDocumentosPeriodo.Initialize(\"tItem\",\"Do";
_ticontroldocumentosperiodo.Initialize(ba,"tItem","Documentos Periodo");
RDebugUtils.currentLine=983066;
 //BA.debugLineNum = 983066;BA.debugLine="tiControlDocumentosPeriodo.Image=imgTreeItemGo";
_ticontroldocumentosperiodo.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983067;
 //BA.debugLineNum = 983067;BA.debugLine="tiDocumentos.Children.Add(tiControlDocumentosPeri";
_tidocumentos.getChildren().Add((Object)(_ticontroldocumentosperiodo.getObject()));
RDebugUtils.currentLine=983069;
 //BA.debugLineNum = 983069;BA.debugLine="Dim tiControlOSUBsPendientesNoConfeccion As TreeI";
_ticontrolosubspendientesnoconfeccion = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983070;
 //BA.debugLineNum = 983070;BA.debugLine="tiControlOSUBsPendientesNoConfeccion.Initialize(\"";
_ticontrolosubspendientesnoconfeccion.Initialize(ba,"tItem","OSUBs Pendientes No Confección");
RDebugUtils.currentLine=983071;
 //BA.debugLineNum = 983071;BA.debugLine="tiControlOSUBsPendientesNoConfeccion.Image=imgTre";
_ticontrolosubspendientesnoconfeccion.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983072;
 //BA.debugLineNum = 983072;BA.debugLine="tiDocumentos.Children.Add(tiControlOSUBsPendiente";
_tidocumentos.getChildren().Add((Object)(_ticontrolosubspendientesnoconfeccion.getObject()));
RDebugUtils.currentLine=983074;
 //BA.debugLineNum = 983074;BA.debugLine="Dim tiFasesDocumento As TreeItem";
_tifasesdocumento = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983075;
 //BA.debugLineNum = 983075;BA.debugLine="tiFasesDocumento.Initialize(\"tItem\",\"Fases Docume";
_tifasesdocumento.Initialize(ba,"tItem","Fases Documento");
RDebugUtils.currentLine=983076;
 //BA.debugLineNum = 983076;BA.debugLine="tiFasesDocumento.Image=imgTreeItemGo";
_tifasesdocumento.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983077;
 //BA.debugLineNum = 983077;BA.debugLine="tiDocumentos.Children.Add(tiFasesDocumento)";
_tidocumentos.getChildren().Add((Object)(_tifasesdocumento.getObject()));
RDebugUtils.currentLine=983079;
 //BA.debugLineNum = 983079;BA.debugLine="Dim tiMarcarAlbaranFisico As TreeItem";
_timarcaralbaranfisico = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983080;
 //BA.debugLineNum = 983080;BA.debugLine="tiMarcarAlbaranFisico.Initialize(\"tItem\",\"Marcar";
_timarcaralbaranfisico.Initialize(ba,"tItem","Marcar Albarán Físico");
RDebugUtils.currentLine=983081;
 //BA.debugLineNum = 983081;BA.debugLine="tiMarcarAlbaranFisico.Image=imgTreeItemGo";
_timarcaralbaranfisico.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983082;
 //BA.debugLineNum = 983082;BA.debugLine="tiDocumentos.Children.Add(tiMarcarAlbaranFisico)";
_tidocumentos.getChildren().Add((Object)(_timarcaralbaranfisico.getObject()));
RDebugUtils.currentLine=983084;
 //BA.debugLineNum = 983084;BA.debugLine="Dim tiLogistica As TreeItem";
_tilogistica = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983085;
 //BA.debugLineNum = 983085;BA.debugLine="tiLogistica.Initialize(\"tItem\",\"Logística\")";
_tilogistica.Initialize(ba,"tItem","Logística");
RDebugUtils.currentLine=983087;
 //BA.debugLineNum = 983087;BA.debugLine="tiLogistica.Image=Main.fx.LoadImage(File.Dirasset";
_tilogistica.setImage((javafx.scene.image.Image)(_main._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"outline_local_shipping_black_36dp.png").getObject()));
RDebugUtils.currentLine=983089;
 //BA.debugLineNum = 983089;BA.debugLine="TreeViewMainMenu.Root.Children.Add(tiLogistica)";
_treeviewmainmenu.getRoot().getChildren().Add((Object)(_tilogistica.getObject()));
RDebugUtils.currentLine=983091;
 //BA.debugLineNum = 983091;BA.debugLine="Dim tiTransportes As TreeItem";
_titransportes = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983092;
 //BA.debugLineNum = 983092;BA.debugLine="tiTransportes.Initialize(\"tItem\",\"Transportes\")";
_titransportes.Initialize(ba,"tItem","Transportes");
RDebugUtils.currentLine=983094;
 //BA.debugLineNum = 983094;BA.debugLine="tiTransportes.Image=imgTreeItemGo";
_titransportes.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983095;
 //BA.debugLineNum = 983095;BA.debugLine="tiLogistica.Children.Add(tiTransportes)";
_tilogistica.getChildren().Add((Object)(_titransportes.getObject()));
RDebugUtils.currentLine=983097;
 //BA.debugLineNum = 983097;BA.debugLine="Dim tiTXT As TreeItem";
_titxt = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983098;
 //BA.debugLineNum = 983098;BA.debugLine="tiTXT.Initialize(\"tItem\",\"TXT\")";
_titxt.Initialize(ba,"tItem","TXT");
RDebugUtils.currentLine=983099;
 //BA.debugLineNum = 983099;BA.debugLine="tiTXT.Image=Main.fx.LoadImageSample(File.Dirasset";
_titxt.setImage((javafx.scene.image.Image)(_main._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImageSample(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"txttransporte.jpg",32,32).getObject()));
RDebugUtils.currentLine=983100;
 //BA.debugLineNum = 983100;BA.debugLine="tiTransportes.Children.Add(tiTXT)";
_titransportes.getChildren().Add((Object)(_titxt.getObject()));
RDebugUtils.currentLine=983102;
 //BA.debugLineNum = 983102;BA.debugLine="Dim tiTXTExpedicionesSinEntregar As TreeItem";
_titxtexpedicionessinentregar = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983103;
 //BA.debugLineNum = 983103;BA.debugLine="tiTXTExpedicionesSinEntregar.Initialize(\"tItem\",\"";
_titxtexpedicionessinentregar.Initialize(ba,"tItem","Expediciones Sin Entregar TXT");
RDebugUtils.currentLine=983104;
 //BA.debugLineNum = 983104;BA.debugLine="tiTXTExpedicionesSinEntregar.Image=imgTreeItemGo";
_titxtexpedicionessinentregar.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983105;
 //BA.debugLineNum = 983105;BA.debugLine="tiTXT.Children.Add(tiTXTExpedicionesSinEntregar)";
_titxt.getChildren().Add((Object)(_titxtexpedicionessinentregar.getObject()));
RDebugUtils.currentLine=983107;
 //BA.debugLineNum = 983107;BA.debugLine="Dim tiTXTExpedicionesPeriodo As TreeItem";
_titxtexpedicionesperiodo = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983108;
 //BA.debugLineNum = 983108;BA.debugLine="tiTXTExpedicionesPeriodo.Initialize(\"tItem\",\"Expe";
_titxtexpedicionesperiodo.Initialize(ba,"tItem","Expediciones Periodo TXT");
RDebugUtils.currentLine=983109;
 //BA.debugLineNum = 983109;BA.debugLine="tiTXTExpedicionesPeriodo.Image=imgTreeItemGo";
_titxtexpedicionesperiodo.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983110;
 //BA.debugLineNum = 983110;BA.debugLine="tiTXT.Children.Add(tiTXTExpedicionesPeriodo)";
_titxt.getChildren().Add((Object)(_titxtexpedicionesperiodo.getObject()));
RDebugUtils.currentLine=983112;
 //BA.debugLineNum = 983112;BA.debugLine="Dim tiDHL As TreeItem";
_tidhl = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983113;
 //BA.debugLineNum = 983113;BA.debugLine="tiDHL.Initialize(\"tiItem\",\"DHL\")";
_tidhl.Initialize(ba,"tiItem","DHL");
RDebugUtils.currentLine=983114;
 //BA.debugLineNum = 983114;BA.debugLine="tiDHL.Image=Main.fx.LoadImageSample(File.Dirasset";
_tidhl.setImage((javafx.scene.image.Image)(_main._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImageSample(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"DHLsq.png",32,32).getObject()));
RDebugUtils.currentLine=983115;
 //BA.debugLineNum = 983115;BA.debugLine="tiTransportes.Children.Add(tiDHL)";
_titransportes.getChildren().Add((Object)(_tidhl.getObject()));
RDebugUtils.currentLine=983117;
 //BA.debugLineNum = 983117;BA.debugLine="Dim tiDHLExpedicionesSinEntregar As TreeItem";
_tidhlexpedicionessinentregar = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983118;
 //BA.debugLineNum = 983118;BA.debugLine="tiDHLExpedicionesSinEntregar.Initialize(\"tItem\",\"";
_tidhlexpedicionessinentregar.Initialize(ba,"tItem","Expediciones Sin Entregar DHL");
RDebugUtils.currentLine=983119;
 //BA.debugLineNum = 983119;BA.debugLine="tiDHLExpedicionesSinEntregar.Image=imgTreeItemGo";
_tidhlexpedicionessinentregar.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983120;
 //BA.debugLineNum = 983120;BA.debugLine="tiDHL.Children.Add(tiDHLExpedicionesSinEntregar)";
_tidhl.getChildren().Add((Object)(_tidhlexpedicionessinentregar.getObject()));
RDebugUtils.currentLine=983122;
 //BA.debugLineNum = 983122;BA.debugLine="Dim tiCorreosExpress As TreeItem";
_ticorreosexpress = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983123;
 //BA.debugLineNum = 983123;BA.debugLine="tiCorreosExpress.Initialize(\"tiItem\",\"Correos Exp";
_ticorreosexpress.Initialize(ba,"tiItem","Correos Express");
RDebugUtils.currentLine=983124;
 //BA.debugLineNum = 983124;BA.debugLine="tiCorreosExpress.Image=Main.fx.LoadImageSample(Fi";
_ticorreosexpress.setImage((javafx.scene.image.Image)(_main._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImageSample(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"correosexpress.jpg",32,32).getObject()));
RDebugUtils.currentLine=983125;
 //BA.debugLineNum = 983125;BA.debugLine="tiTransportes.Children.Add(tiCorreosExpress)";
_titransportes.getChildren().Add((Object)(_ticorreosexpress.getObject()));
RDebugUtils.currentLine=983127;
 //BA.debugLineNum = 983127;BA.debugLine="Dim tiCorreosExpressExpedicionesPeriodo As TreeIt";
_ticorreosexpressexpedicionesperiodo = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983128;
 //BA.debugLineNum = 983128;BA.debugLine="tiCorreosExpressExpedicionesPeriodo.Initialize(\"t";
_ticorreosexpressexpedicionesperiodo.Initialize(ba,"tItem","Expediciones Periodo Correos Express");
RDebugUtils.currentLine=983129;
 //BA.debugLineNum = 983129;BA.debugLine="tiCorreosExpressExpedicionesPeriodo.Image=imgTree";
_ticorreosexpressexpedicionesperiodo.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983130;
 //BA.debugLineNum = 983130;BA.debugLine="tiCorreosExpress.Children.Add(tiCorreosExpressExp";
_ticorreosexpress.getChildren().Add((Object)(_ticorreosexpressexpedicionesperiodo.getObject()));
RDebugUtils.currentLine=983132;
 //BA.debugLineNum = 983132;BA.debugLine="Dim tiCorreosExpressInfoExpedicion As TreeItem";
_ticorreosexpressinfoexpedicion = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983133;
 //BA.debugLineNum = 983133;BA.debugLine="tiCorreosExpressInfoExpedicion.Initialize(\"tItem\"";
_ticorreosexpressinfoexpedicion.Initialize(ba,"tItem","Info Expedición Correos Express");
RDebugUtils.currentLine=983134;
 //BA.debugLineNum = 983134;BA.debugLine="tiCorreosExpressInfoExpedicion.Image=imgTreeItemG";
_ticorreosexpressinfoexpedicion.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983135;
 //BA.debugLineNum = 983135;BA.debugLine="tiCorreosExpress.Children.Add(tiCorreosExpressInf";
_ticorreosexpress.getChildren().Add((Object)(_ticorreosexpressinfoexpedicion.getObject()));
RDebugUtils.currentLine=983142;
 //BA.debugLineNum = 983142;BA.debugLine="Dim tiCompras As TreeItem";
_ticompras = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983143;
 //BA.debugLineNum = 983143;BA.debugLine="tiCompras.Initialize(\"tItem\",\"Compras\")";
_ticompras.Initialize(ba,"tItem","Compras");
RDebugUtils.currentLine=983145;
 //BA.debugLineNum = 983145;BA.debugLine="tiCompras.Image=Main.fx.LoadImage(File.Dirassets,";
_ticompras.setImage((javafx.scene.image.Image)(_main._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"outline_shopping_cart_IN_black_36dp.png").getObject()));
RDebugUtils.currentLine=983146;
 //BA.debugLineNum = 983146;BA.debugLine="TreeViewMainMenu.Root.Children.Add(tiCompras)";
_treeviewmainmenu.getRoot().getChildren().Add((Object)(_ticompras.getObject()));
RDebugUtils.currentLine=983148;
 //BA.debugLineNum = 983148;BA.debugLine="Dim tiSeguimientoFechasPrometidasPedidosCompra As";
_tiseguimientofechasprometidaspedidoscompra = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983149;
 //BA.debugLineNum = 983149;BA.debugLine="tiSeguimientoFechasPrometidasPedidosCompra.Initia";
_tiseguimientofechasprometidaspedidoscompra.Initialize(ba,"tItem","Seguimiento Fechas Prometidas Pedidos Compra");
RDebugUtils.currentLine=983150;
 //BA.debugLineNum = 983150;BA.debugLine="tiSeguimientoFechasPrometidasPedidosCompra.Image=";
_tiseguimientofechasprometidaspedidoscompra.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983151;
 //BA.debugLineNum = 983151;BA.debugLine="tiCompras.Children.Add(tiSeguimientoFechasPrometi";
_ticompras.getChildren().Add((Object)(_tiseguimientofechasprometidaspedidoscompra.getObject()));
RDebugUtils.currentLine=983163;
 //BA.debugLineNum = 983163;BA.debugLine="Dim tiEvaluacionProveedores As TreeItem";
_tievaluacionproveedores = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983164;
 //BA.debugLineNum = 983164;BA.debugLine="tiEvaluacionProveedores.Initialize(\"tItem\",\"Evalu";
_tievaluacionproveedores.Initialize(ba,"tItem","Evaluación Proveedores");
RDebugUtils.currentLine=983165;
 //BA.debugLineNum = 983165;BA.debugLine="tiEvaluacionProveedores.Image=imgTreeItemGo";
_tievaluacionproveedores.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983166;
 //BA.debugLineNum = 983166;BA.debugLine="tiCompras.Children.Add(tiEvaluacionProveedores)";
_ticompras.getChildren().Add((Object)(_tievaluacionproveedores.getObject()));
RDebugUtils.currentLine=983168;
 //BA.debugLineNum = 983168;BA.debugLine="Dim tiVentas As TreeItem";
_tiventas = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983169;
 //BA.debugLineNum = 983169;BA.debugLine="tiVentas.Initialize(\"tItem\",\"Ventas\")";
_tiventas.Initialize(ba,"tItem","Ventas");
RDebugUtils.currentLine=983171;
 //BA.debugLineNum = 983171;BA.debugLine="tiVentas.Image=Main.fx.LoadImage(File.Dirassets,";
_tiventas.setImage((javafx.scene.image.Image)(_main._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"outline_shopping_cart_OUT_black_36dp.png").getObject()));
RDebugUtils.currentLine=983172;
 //BA.debugLineNum = 983172;BA.debugLine="TreeViewMainMenu.Root.Children.Add(tiVentas)";
_treeviewmainmenu.getRoot().getChildren().Add((Object)(_tiventas.getObject()));
RDebugUtils.currentLine=983174;
 //BA.debugLineNum = 983174;BA.debugLine="Dim tiGestionVentas As TreeItem";
_tigestionventas = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983175;
 //BA.debugLineNum = 983175;BA.debugLine="tiGestionVentas.Initialize(\"tItem\",\"Gestión Venta";
_tigestionventas.Initialize(ba,"tItem","Gestión Ventas");
RDebugUtils.currentLine=983176;
 //BA.debugLineNum = 983176;BA.debugLine="tiGestionVentas.Image=imgTreeItemGo";
_tigestionventas.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983177;
 //BA.debugLineNum = 983177;BA.debugLine="tiVentas.Children.Add(tiGestionVentas)";
_tiventas.getChildren().Add((Object)(_tigestionventas.getObject()));
RDebugUtils.currentLine=983179;
 //BA.debugLineNum = 983179;BA.debugLine="Dim tiInformesExpedicionesClientes As TreeItem";
_tiinformesexpedicionesclientes = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983180;
 //BA.debugLineNum = 983180;BA.debugLine="tiInformesExpedicionesClientes.Initialize(\"tItem\"";
_tiinformesexpedicionesclientes.Initialize(ba,"tItem","Informes Expediciones Clientes");
RDebugUtils.currentLine=983181;
 //BA.debugLineNum = 983181;BA.debugLine="tiInformesExpedicionesClientes.Image=imgTreeItemG";
_tiinformesexpedicionesclientes.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983182;
 //BA.debugLineNum = 983182;BA.debugLine="tiVentas.Children.Add(tiInformesExpedicionesClien";
_tiventas.getChildren().Add((Object)(_tiinformesexpedicionesclientes.getObject()));
RDebugUtils.currentLine=983184;
 //BA.debugLineNum = 983184;BA.debugLine="Dim ticGeneracionFicherosCSVPlantillaPedidos As T";
_ticgeneracionficheroscsvplantillapedidos = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983185;
 //BA.debugLineNum = 983185;BA.debugLine="ticGeneracionFicherosCSVPlantillaPedidos.Initiali";
_ticgeneracionficheroscsvplantillapedidos.Initialize(ba,"tItem","Generación Ficheros CSV Plantilla Pedidos Venta");
RDebugUtils.currentLine=983186;
 //BA.debugLineNum = 983186;BA.debugLine="ticGeneracionFicherosCSVPlantillaPedidos.Image=im";
_ticgeneracionficheroscsvplantillapedidos.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983187;
 //BA.debugLineNum = 983187;BA.debugLine="tiVentas.Children.Add(ticGeneracionFicherosCSVPla";
_tiventas.getChildren().Add((Object)(_ticgeneracionficheroscsvplantillapedidos.getObject()));
RDebugUtils.currentLine=983189;
 //BA.debugLineNum = 983189;BA.debugLine="Dim ticRestartDocuwareBackworker As TreeItem";
_ticrestartdocuwarebackworker = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983190;
 //BA.debugLineNum = 983190;BA.debugLine="ticRestartDocuwareBackworker.Initialize(\"tItem\",\"";
_ticrestartdocuwarebackworker.Initialize(ba,"tItem","Reiniciar sincronización Docuware");
RDebugUtils.currentLine=983191;
 //BA.debugLineNum = 983191;BA.debugLine="ticRestartDocuwareBackworker.Image=imgTreeItemGo";
_ticrestartdocuwarebackworker.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983192;
 //BA.debugLineNum = 983192;BA.debugLine="tiVentas.Children.Add(ticRestartDocuwareBackworke";
_tiventas.getChildren().Add((Object)(_ticrestartdocuwarebackworker.getObject()));
RDebugUtils.currentLine=983201;
 //BA.debugLineNum = 983201;BA.debugLine="Dim tiB2B As TreeItem";
_tib2b = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983202;
 //BA.debugLineNum = 983202;BA.debugLine="tiB2B.Initialize(\"tItem\",\"B2B\")";
_tib2b.Initialize(ba,"tItem","B2B");
RDebugUtils.currentLine=983204;
 //BA.debugLineNum = 983204;BA.debugLine="tiVentas.Children.Add(tiB2B)";
_tiventas.getChildren().Add((Object)(_tib2b.getObject()));
RDebugUtils.currentLine=983206;
 //BA.debugLineNum = 983206;BA.debugLine="Dim tiTestsInfoMagento As TreeItem";
_titestsinfomagento = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983207;
 //BA.debugLineNum = 983207;BA.debugLine="tiTestsInfoMagento.Initialize(\"tItem\",\"Tests Info";
_titestsinfomagento.Initialize(ba,"tItem","Tests Info Magento");
RDebugUtils.currentLine=983208;
 //BA.debugLineNum = 983208;BA.debugLine="tiTestsInfoMagento.Image=imgTreeItemGo";
_titestsinfomagento.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983209;
 //BA.debugLineNum = 983209;BA.debugLine="tiB2B.Children.Add(tiTestsInfoMagento)";
_tib2b.getChildren().Add((Object)(_titestsinfomagento.getObject()));
RDebugUtils.currentLine=983211;
 //BA.debugLineNum = 983211;BA.debugLine="Dim tiPedidosClientes As TreeItem";
_tipedidosclientes = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983212;
 //BA.debugLineNum = 983212;BA.debugLine="tiPedidosClientes.Initialize(\"tItem\",\"Pedidos Cli";
_tipedidosclientes.Initialize(ba,"tItem","Pedidos Clientes");
RDebugUtils.currentLine=983213;
 //BA.debugLineNum = 983213;BA.debugLine="tiPedidosClientes.Image=imgTreeItemGo";
_tipedidosclientes.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983214;
 //BA.debugLineNum = 983214;BA.debugLine="tiB2B.Children.Add(tiPedidosClientes)";
_tib2b.getChildren().Add((Object)(_tipedidosclientes.getObject()));
RDebugUtils.currentLine=983231;
 //BA.debugLineNum = 983231;BA.debugLine="Dim tiRepsol As TreeItem";
_tirepsol = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983232;
 //BA.debugLineNum = 983232;BA.debugLine="tiRepsol.Initialize(\"tItem\",\"Repsol\")";
_tirepsol.Initialize(ba,"tItem","Repsol");
RDebugUtils.currentLine=983234;
 //BA.debugLineNum = 983234;BA.debugLine="tiVentas.Children.Add(tiRepsol)";
_tiventas.getChildren().Add((Object)(_tirepsol.getObject()));
RDebugUtils.currentLine=983236;
 //BA.debugLineNum = 983236;BA.debugLine="Dim tiImportacionPedidosEESSRepsol As TreeItem";
_tiimportacionpedidoseessrepsol = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983237;
 //BA.debugLineNum = 983237;BA.debugLine="tiImportacionPedidosEESSRepsol.Initialize(\"tItem\"";
_tiimportacionpedidoseessrepsol.Initialize(ba,"tItem","Importacion Pedidos EESS Repsol");
RDebugUtils.currentLine=983238;
 //BA.debugLineNum = 983238;BA.debugLine="tiImportacionPedidosEESSRepsol.Image=imgTreeItemG";
_tiimportacionpedidoseessrepsol.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983239;
 //BA.debugLineNum = 983239;BA.debugLine="tiRepsol.Children.Add(tiImportacionPedidosEESSRep";
_tirepsol.getChildren().Add((Object)(_tiimportacionpedidoseessrepsol.getObject()));
RDebugUtils.currentLine=983241;
 //BA.debugLineNum = 983241;BA.debugLine="Dim tiAlbaranesVentaRepsol As TreeItem";
_tialbaranesventarepsol = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983242;
 //BA.debugLineNum = 983242;BA.debugLine="tiAlbaranesVentaRepsol.Initialize(\"tItem\",\"Albara";
_tialbaranesventarepsol.Initialize(ba,"tItem","Albaranes Venta Repsol");
RDebugUtils.currentLine=983243;
 //BA.debugLineNum = 983243;BA.debugLine="tiAlbaranesVentaRepsol.Image=imgTreeItemGo";
_tialbaranesventarepsol.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983244;
 //BA.debugLineNum = 983244;BA.debugLine="tiRepsol.Children.Add(tiAlbaranesVentaRepsol)";
_tirepsol.getChildren().Add((Object)(_tialbaranesventarepsol.getObject()));
RDebugUtils.currentLine=983261;
 //BA.debugLineNum = 983261;BA.debugLine="Dim tiAnalisisDatos As TreeItem";
_tianalisisdatos = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983262;
 //BA.debugLineNum = 983262;BA.debugLine="tiAnalisisDatos.Initialize(\"tItem\",\"Análisis de D";
_tianalisisdatos.Initialize(ba,"tItem","Análisis de Datos");
RDebugUtils.currentLine=983265;
 //BA.debugLineNum = 983265;BA.debugLine="tiAnalisisDatos.Image=Main.fx.LoadImageSample(Fil";
_tianalisisdatos.setImage((javafx.scene.image.Image)(_main._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImageSample(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"outline_analytics_black_36dp.png",36,36).getObject()));
RDebugUtils.currentLine=983266;
 //BA.debugLineNum = 983266;BA.debugLine="TreeViewMainMenu.Root.Children.Add(tiAnalisisDato";
_treeviewmainmenu.getRoot().getChildren().Add((Object)(_tianalisisdatos.getObject()));
RDebugUtils.currentLine=983268;
 //BA.debugLineNum = 983268;BA.debugLine="Dim tiAnalisisDisponiblesAlmacenArticuloTalla As";
_tianalisisdisponiblesalmacenarticulotalla = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983269;
 //BA.debugLineNum = 983269;BA.debugLine="tiAnalisisDisponiblesAlmacenArticuloTalla.Initial";
_tianalisisdisponiblesalmacenarticulotalla.Initialize(ba,"tItem","Análisis Disponibles Almacén Artículo Talla");
RDebugUtils.currentLine=983270;
 //BA.debugLineNum = 983270;BA.debugLine="tiAnalisisDisponiblesAlmacenArticuloTalla.Image=i";
_tianalisisdisponiblesalmacenarticulotalla.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983271;
 //BA.debugLineNum = 983271;BA.debugLine="tiAnalisisDatos.Children.Add(tiAnalisisDisponible";
_tianalisisdatos.getChildren().Add((Object)(_tianalisisdisponiblesalmacenarticulotalla.getObject()));
RDebugUtils.currentLine=983280;
 //BA.debugLineNum = 983280;BA.debugLine="Dim tiIncidencias As TreeItem";
_tiincidencias = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983281;
 //BA.debugLineNum = 983281;BA.debugLine="tiIncidencias.Initialize(\"tItem\",\"Incidencias\")";
_tiincidencias.Initialize(ba,"tItem","Incidencias");
RDebugUtils.currentLine=983284;
 //BA.debugLineNum = 983284;BA.debugLine="Dim BombImg As Image=Utilidades.SetFontToBitmap(C";
_bombimg = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_bombimg = (anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(_utilidades._setfonttobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr(((int)0xf690))),_utilidades._createb4xfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ("materialdesignicons-webfont.ttf",(float) (32),(float) (32)),(float) (32),_xui.Color_Black).getObject()));
RDebugUtils.currentLine=983285;
 //BA.debugLineNum = 983285;BA.debugLine="tiIncidencias.Image=BombImg";
_tiincidencias.setImage((javafx.scene.image.Image)(_bombimg.getObject()));
RDebugUtils.currentLine=983286;
 //BA.debugLineNum = 983286;BA.debugLine="TreeViewMainMenu.Root.Children.Add(tiIncidencias)";
_treeviewmainmenu.getRoot().getChildren().Add((Object)(_tiincidencias.getObject()));
RDebugUtils.currentLine=983288;
 //BA.debugLineNum = 983288;BA.debugLine="Dim tiIncidenciasProveedor As TreeItem";
_tiincidenciasproveedor = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983289;
 //BA.debugLineNum = 983289;BA.debugLine="tiIncidenciasProveedor.Initialize(\"tItem\",\"Provee";
_tiincidenciasproveedor.Initialize(ba,"tItem","Proveedores");
RDebugUtils.currentLine=983290;
 //BA.debugLineNum = 983290;BA.debugLine="tiIncidenciasProveedor.Image=imgTreeItemGo";
_tiincidenciasproveedor.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983291;
 //BA.debugLineNum = 983291;BA.debugLine="tiIncidencias.Children.Add(tiIncidenciasProveedor";
_tiincidencias.getChildren().Add((Object)(_tiincidenciasproveedor.getObject()));
RDebugUtils.currentLine=983293;
 //BA.debugLineNum = 983293;BA.debugLine="Dim tiIncidenciasProveedorLista As TreeItem";
_tiincidenciasproveedorlista = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983294;
 //BA.debugLineNum = 983294;BA.debugLine="tiIncidenciasProveedorLista.Initialize(\"tItem\",\"I";
_tiincidenciasproveedorlista.Initialize(ba,"tItem","Incidencias Proveedor");
RDebugUtils.currentLine=983295;
 //BA.debugLineNum = 983295;BA.debugLine="tiIncidenciasProveedorLista.Image=imgTreeItemGo";
_tiincidenciasproveedorlista.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983296;
 //BA.debugLineNum = 983296;BA.debugLine="tiIncidenciasProveedor.Children.Add(tiIncidencias";
_tiincidenciasproveedor.getChildren().Add((Object)(_tiincidenciasproveedorlista.getObject()));
RDebugUtils.currentLine=983298;
 //BA.debugLineNum = 983298;BA.debugLine="Dim tiIncidenciasProveedorTaeasPendientes As Tree";
_tiincidenciasproveedortaeaspendientes = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983299;
 //BA.debugLineNum = 983299;BA.debugLine="tiIncidenciasProveedorTaeasPendientes.Initialize(";
_tiincidenciasproveedortaeaspendientes.Initialize(ba,"tItem","Tareas Pendientes Incidencias Proveedor");
RDebugUtils.currentLine=983300;
 //BA.debugLineNum = 983300;BA.debugLine="tiIncidenciasProveedorTaeasPendientes.Image=imgTr";
_tiincidenciasproveedortaeaspendientes.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983301;
 //BA.debugLineNum = 983301;BA.debugLine="tiIncidenciasProveedor.Children.Add(tiIncidencias";
_tiincidenciasproveedor.getChildren().Add((Object)(_tiincidenciasproveedortaeaspendientes.getObject()));
RDebugUtils.currentLine=983305;
 //BA.debugLineNum = 983305;BA.debugLine="Dim tiIncidenciasCliente As TreeItem";
_tiincidenciascliente = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983306;
 //BA.debugLineNum = 983306;BA.debugLine="tiIncidenciasCliente.Initialize(\"tItem\",\"Clientes";
_tiincidenciascliente.Initialize(ba,"tItem","Clientes");
RDebugUtils.currentLine=983307;
 //BA.debugLineNum = 983307;BA.debugLine="tiIncidenciasCliente.Image=imgTreeItemGo";
_tiincidenciascliente.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983308;
 //BA.debugLineNum = 983308;BA.debugLine="tiIncidencias.Children.Add(tiIncidenciasCliente)";
_tiincidencias.getChildren().Add((Object)(_tiincidenciascliente.getObject()));
RDebugUtils.currentLine=983311;
 //BA.debugLineNum = 983311;BA.debugLine="Dim tiIncidenciasInternas As TreeItem";
_tiincidenciasinternas = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983312;
 //BA.debugLineNum = 983312;BA.debugLine="tiIncidenciasInternas.Initialize(\"tItem\",\"Interna";
_tiincidenciasinternas.Initialize(ba,"tItem","Internas");
RDebugUtils.currentLine=983313;
 //BA.debugLineNum = 983313;BA.debugLine="tiIncidenciasInternas.Image=imgTreeItemGo";
_tiincidenciasinternas.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983314;
 //BA.debugLineNum = 983314;BA.debugLine="tiIncidencias.Children.Add(tiIncidenciasInternas)";
_tiincidencias.getChildren().Add((Object)(_tiincidenciasinternas.getObject()));
RDebugUtils.currentLine=983410;
 //BA.debugLineNum = 983410;BA.debugLine="Dim tiUtilidades As TreeItem";
_tiutilidades = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983411;
 //BA.debugLineNum = 983411;BA.debugLine="tiUtilidades.Initialize(\"tItem\",\"Utilidades\")";
_tiutilidades.Initialize(ba,"tItem","Utilidades");
RDebugUtils.currentLine=983413;
 //BA.debugLineNum = 983413;BA.debugLine="tiUtilidades.Image=Main.fx.LoadImage(File.Dirasse";
_tiutilidades.setImage((javafx.scene.image.Image)(_main._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"outline_handyman_black_36dp.png").getObject()));
RDebugUtils.currentLine=983414;
 //BA.debugLineNum = 983414;BA.debugLine="TreeViewMainMenu.Root.Children.Add(tiUtilidades)";
_treeviewmainmenu.getRoot().getChildren().Add((Object)(_tiutilidades.getObject()));
RDebugUtils.currentLine=983416;
 //BA.debugLineNum = 983416;BA.debugLine="Dim tiFicherosCarpetaExcelLinks As TreeItem";
_tificheroscarpetaexcellinks = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983417;
 //BA.debugLineNum = 983417;BA.debugLine="tiFicherosCarpetaExcelLinks.Initialize(\"tItem\",\"C";
_tificheroscarpetaexcellinks.Initialize(ba,"tItem","Crear Excel Links Ficheros Carpeta");
RDebugUtils.currentLine=983419;
 //BA.debugLineNum = 983419;BA.debugLine="tiFicherosCarpetaExcelLinks.Image=imgTreeItemGo";
_tificheroscarpetaexcellinks.setImage((javafx.scene.image.Image)(_imgtreeitemgo.getObject()));
RDebugUtils.currentLine=983420;
 //BA.debugLineNum = 983420;BA.debugLine="tiUtilidades.Children.Add(tiFicherosCarpetaExcelL";
_tiutilidades.getChildren().Add((Object)(_tificheroscarpetaexcellinks.getObject()));
RDebugUtils.currentLine=983422;
 //BA.debugLineNum = 983422;BA.debugLine="If Main.DatosUsuario.Administrador Then";
if (_main._datosusuario /*b4j.docU.main._datosusuario*/ .Administrador /*boolean*/ ) { 
RDebugUtils.currentLine=983423;
 //BA.debugLineNum = 983423;BA.debugLine="Dim tiPermisosAplicacion As TreeItem";
_tipermisosaplicacion = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983424;
 //BA.debugLineNum = 983424;BA.debugLine="tiPermisosAplicacion.Initialize(\"tItem\",\"Permiso";
_tipermisosaplicacion.Initialize(ba,"tItem","Permisos Aplicacion");
RDebugUtils.currentLine=983426;
 //BA.debugLineNum = 983426;BA.debugLine="tiPermisosAplicacion.Image=Main.fx.LoadImage(Fil";
_tipermisosaplicacion.setImage((javafx.scene.image.Image)(_main._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"outline_vpn_key_black_36dp.png").getObject()));
RDebugUtils.currentLine=983427;
 //BA.debugLineNum = 983427;BA.debugLine="TreeViewMainMenu.Root.Children.Add(tiPermisosApl";
_treeviewmainmenu.getRoot().getChildren().Add((Object)(_tipermisosaplicacion.getObject()));
 };
RDebugUtils.currentLine=983430;
 //BA.debugLineNum = 983430;BA.debugLine="Dim tiAcercaDe As TreeItem";
_tiacercade = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983431;
 //BA.debugLineNum = 983431;BA.debugLine="tiAcercaDe.Initialize(\"tItem\",\"Acerca De\")";
_tiacercade.Initialize(ba,"tItem","Acerca De");
RDebugUtils.currentLine=983434;
 //BA.debugLineNum = 983434;BA.debugLine="tiAcercaDe.Image=Main.fx.LoadImage(File.Dirassets";
_tiacercade.setImage((javafx.scene.image.Image)(_main._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"outline_info_black_36dp.png").getObject()));
RDebugUtils.currentLine=983435;
 //BA.debugLineNum = 983435;BA.debugLine="TreeViewMainMenu.Root.Children.Add(tiAcercaDe)";
_treeviewmainmenu.getRoot().getChildren().Add((Object)(_tiacercade.getObject()));
RDebugUtils.currentLine=983437;
 //BA.debugLineNum = 983437;BA.debugLine="Dim tiSalir As TreeItem";
_tisalir = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=983438;
 //BA.debugLineNum = 983438;BA.debugLine="tiSalir.Initialize(\"tItem\",\"Salir de la aplicació";
_tisalir.Initialize(ba,"tItem","Salir de la aplicación");
RDebugUtils.currentLine=983441;
 //BA.debugLineNum = 983441;BA.debugLine="tiSalir.Image=Main.fx.LoadImage(File.Dirassets, \"";
_tisalir.setImage((javafx.scene.image.Image)(_main._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"outline_logout_black_36dp.png").getObject()));
RDebugUtils.currentLine=983442;
 //BA.debugLineNum = 983442;BA.debugLine="TreeViewMainMenu.Root.Children.Add(tiSalir)";
_treeviewmainmenu.getRoot().getChildren().Add((Object)(_tisalir.getObject()));
RDebugUtils.currentLine=983485;
 //BA.debugLineNum = 983485;BA.debugLine="End Sub";
return "";
}
public static String  _contraeritemschildren(anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _ti) throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "contraeritemschildren", false))
	 {return ((String) Debug.delegate(ba, "contraeritemschildren", new Object[] {_ti}));}
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _mi = null;
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub ContraerItemsChildren(ti As TreeItem)";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="For Each mI As TreeItem In ti.Children";
_mi = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = _ti.getChildren();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_mi = (anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper(), (javafx.scene.control.TreeItem)(group1.Get(index1)));
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="Log(mI.Text)";
anywheresoftware.b4a.keywords.Common.LogImpl("82555907",_mi.getText(),0);
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="If mI.Expanded Then";
if (_mi.getExpanded()) { 
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="mI.Expanded=False";
_mi.setExpanded(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="ContraerItemsChildren(mI)";
_contraeritemschildren(_mi);
 }
};
RDebugUtils.currentLine=2555914;
 //BA.debugLineNum = 2555914;BA.debugLine="End Sub";
return "";
}
public static String  _contraeritemsotrasramas2(anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tisel) throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "contraeritemsotrasramas2", false))
	 {return ((String) Debug.delegate(ba, "contraeritemsotrasramas2", new Object[] {_tisel}));}
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tip = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _mi = null;
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub ContraerItemsOtrasRamas2(tiSel As TreeItem)";
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="Dim tiP As TreeItem=tiSel.Parent";
_tip = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_tip = _tisel.getParent();
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="If tiP.IsInitialized=False Then Return";
if (_tip.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return "";};
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="For Each mI As TreeItem In tiP.Children";
_mi = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
{
final anywheresoftware.b4a.BA.IterableList group3 = _tip.getChildren();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_mi = (anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper(), (javafx.scene.control.TreeItem)(group3.Get(index3)));
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="Log(mI.Text)";
anywheresoftware.b4a.keywords.Common.LogImpl("82490374",_mi.getText(),0);
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="If mI=tiSel Then Continue";
if ((_mi).equals(_tisel)) { 
if (true) continue;};
RDebugUtils.currentLine=2490377;
 //BA.debugLineNum = 2490377;BA.debugLine="If mI.Expanded Then";
if (_mi.getExpanded()) { 
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="mI.Expanded=False";
_mi.setExpanded(anywheresoftware.b4a.keywords.Common.False);
 };
 }
};
RDebugUtils.currentLine=2490382;
 //BA.debugLineNum = 2490382;BA.debugLine="End Sub";
return "";
}
public static int  _countvisiblechildren(anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _ti,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _target,boolean[] _found) throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "countvisiblechildren", false))
	 {return ((Integer) Debug.delegate(ba, "countvisiblechildren", new Object[] {_ti,_target,_found}));}
int _c = 0;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _child = null;
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub CountVisibleChildren(ti As TreeItem, Target As";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Dim c As Int = 1";
_c = (int) (1);
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="If ti = Target Then";
if ((_ti).equals(_target)) { 
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="Found(0) = True";
_found[(int) (0)] = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="Return -1";
if (true) return (int) (-1);
 };
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="If ti.Expanded Then";
if (_ti.getExpanded()) { 
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="For Each child As TreeItem In ti.Children";
_child = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
{
final anywheresoftware.b4a.BA.IterableList group7 = _ti.getChildren();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_child = (anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper(), (javafx.scene.control.TreeItem)(group7.Get(index7)));
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="c = c + CountVisibleChildren(child, Target, Fou";
_c = (int) (_c+_countvisiblechildren(_child,_target,_found));
RDebugUtils.currentLine=1769481;
 //BA.debugLineNum = 1769481;BA.debugLine="If Found(0) = True Then Return c";
if (_found[(int) (0)]==anywheresoftware.b4a.keywords.Common.True) { 
if (true) return _c;};
 }
};
 };
RDebugUtils.currentLine=1769484;
 //BA.debugLineNum = 1769484;BA.debugLine="Return c";
if (true) return _c;
RDebugUtils.currentLine=1769485;
 //BA.debugLineNum = 1769485;BA.debugLine="End Sub";
return 0;
}
public static String  _crearaccesosdirectositem3(anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tisel) throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "crearaccesosdirectositem3", false))
	 {return ((String) Debug.delegate(ba, "crearaccesosdirectositem3", new Object[] {_tisel}));}
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _imgtreeitemgo = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _stextobbcodeview = null;
int _niveltisel = 0;
float _textsizetisel = 0f;
float _textsizenivel0 = 0f;
float _textsizenivel1 = 0f;
float _textsizenivel2 = 0f;
String _sindentniveltisel = "";
String _sindentnivel0 = "";
String _sindentnivel1 = "";
String _sindentnivel2 = "";
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tich1 = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tich2 = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tich3 = null;
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub CrearAccesosDirectosItem3(tISel As TreeItem)";
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="Dim imgTreeItemGo As Image=Main.fx.LoadImage(File";
_imgtreeitemgo = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_imgtreeitemgo = _main._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"outline_arrow_circle_right_black_18dp.png");
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="Dim sTextoBBCodeView As StringBuilder";
_stextobbcodeview = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="sTextoBBCodeView.Initialize";
_stextobbcodeview.Initialize();
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="BBCodeViewElementosMainMenu.Text=$\"\"$";
_bbcodeviewelementosmainmenu._settext /*String*/ (null,(""));
RDebugUtils.currentLine=2031627;
 //BA.debugLineNum = 2031627;BA.debugLine="Dim NivelTiSel As Int=NivelTreeItem(tISel)";
_niveltisel = _niveltreeitem(_tisel);
RDebugUtils.currentLine=2031629;
 //BA.debugLineNum = 2031629;BA.debugLine="Dim TextSizeTISel As Float";
_textsizetisel = 0f;
RDebugUtils.currentLine=2031630;
 //BA.debugLineNum = 2031630;BA.debugLine="Dim TextSizeNivel0 As Float=18";
_textsizenivel0 = (float) (18);
RDebugUtils.currentLine=2031631;
 //BA.debugLineNum = 2031631;BA.debugLine="Dim TextSizeNivel1 As Float=16";
_textsizenivel1 = (float) (16);
RDebugUtils.currentLine=2031632;
 //BA.debugLineNum = 2031632;BA.debugLine="Dim TextSizeNivel2 As Float=14";
_textsizenivel2 = (float) (14);
RDebugUtils.currentLine=2031633;
 //BA.debugLineNum = 2031633;BA.debugLine="Dim sIndentNivelTISel As String";
_sindentniveltisel = "";
RDebugUtils.currentLine=2031634;
 //BA.debugLineNum = 2031634;BA.debugLine="Dim sIndentNivel0 As String=$\"${TAB}\"$";
_sindentnivel0 = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.TAB))+"");
RDebugUtils.currentLine=2031635;
 //BA.debugLineNum = 2031635;BA.debugLine="Dim sIndentNivel1 As String=$\"${TAB}${TAB}\"$";
_sindentnivel1 = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.TAB))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.TAB))+"");
RDebugUtils.currentLine=2031636;
 //BA.debugLineNum = 2031636;BA.debugLine="Dim sIndentNivel2 As String=$\"${TAB}${TAB}${TAB}\"";
_sindentnivel2 = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.TAB))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.TAB))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.TAB))+"");
RDebugUtils.currentLine=2031638;
 //BA.debugLineNum = 2031638;BA.debugLine="If tISel<>TreeViewMainMenu.Root Then";
if ((_tisel).equals(_treeviewmainmenu.getRoot()) == false) { 
RDebugUtils.currentLine=2031639;
 //BA.debugLineNum = 2031639;BA.debugLine="If tISel.Children.Size=0 Then";
if (_tisel.getChildren().getSize()==0) { 
RDebugUtils.currentLine=2031640;
 //BA.debugLineNum = 2031640;BA.debugLine="sTextoBBCodeView.Append($\"${sIndentNivel0}[Vert";
_stextobbcodeview.Append((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sindentnivel0))+"[Vertical=5][img dir=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.getDirAssets()))+"\" FileName=\"outline_arrow_circle_right_black_24dp.png\" width=24/][/vertical] [TextSize="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.0",(Object)(_textsizenivel0))+"][url]"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tisel.getText()))+"[/url][/textsize]\n"+"	"));
 }else {
RDebugUtils.currentLine=2031643;
 //BA.debugLineNum = 2031643;BA.debugLine="sTextoBBCodeView.Append($\"${sIndentNivel0}[Text";
_stextobbcodeview.Append((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sindentnivel0))+"[TextSize="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.0",(Object)(_textsizenivel0))+"][Color=#191970][b]"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tisel.getText()))+"[/b][/color][/textsize]\n"+"	"));
 };
RDebugUtils.currentLine=2031647;
 //BA.debugLineNum = 2031647;BA.debugLine="For Each tiCh1 As TreeItem In tISel.Children";
_tich1 = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
{
final anywheresoftware.b4a.BA.IterableList group20 = _tisel.getChildren();
final int groupLen20 = group20.getSize()
;int index20 = 0;
;
for (; index20 < groupLen20;index20++){
_tich1 = (anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper(), (javafx.scene.control.TreeItem)(group20.Get(index20)));
RDebugUtils.currentLine=2031648;
 //BA.debugLineNum = 2031648;BA.debugLine="If tiCh1.Children.Size=0 Then";
if (_tich1.getChildren().getSize()==0) { 
RDebugUtils.currentLine=2031649;
 //BA.debugLineNum = 2031649;BA.debugLine="sTextoBBCodeView.Append($\"${sIndentNivel1}[Ver";
_stextobbcodeview.Append((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sindentnivel1))+"[Vertical=5][img dir=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.getDirAssets()))+"\" FileName=\"outline_arrow_circle_right_black_24dp.png\" width=24/][/vertical] [TextSize="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.0",(Object)(_textsizenivel1))+"][url]"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tich1.getText()))+"[/url][/textsize]\n"+"	"));
 }else {
RDebugUtils.currentLine=2031652;
 //BA.debugLineNum = 2031652;BA.debugLine="sTextoBBCodeView.Append($\"${sIndentNivel1}[Tex";
_stextobbcodeview.Append((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sindentnivel1))+"[TextSize="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.0",(Object)(_textsizenivel1))+"][Color=#191970][b]"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tich1.getText()))+"[/b][/color][/textsize]\n"+"	"));
 };
RDebugUtils.currentLine=2031656;
 //BA.debugLineNum = 2031656;BA.debugLine="Log(\"tiCh.Children \" & tiCh1.Children)";
anywheresoftware.b4a.keywords.Common.LogImpl("82031656","tiCh.Children "+BA.ObjectToString(_tich1.getChildren()),0);
RDebugUtils.currentLine=2031657;
 //BA.debugLineNum = 2031657;BA.debugLine="For Each tiCh2 As TreeItem In tiCh1.Children";
_tich2 = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
{
final anywheresoftware.b4a.BA.IterableList group27 = _tich1.getChildren();
final int groupLen27 = group27.getSize()
;int index27 = 0;
;
for (; index27 < groupLen27;index27++){
_tich2 = (anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper(), (javafx.scene.control.TreeItem)(group27.Get(index27)));
RDebugUtils.currentLine=2031658;
 //BA.debugLineNum = 2031658;BA.debugLine="Log(\"tiCh2.Children \" & tiCh2.Children)";
anywheresoftware.b4a.keywords.Common.LogImpl("82031658","tiCh2.Children "+BA.ObjectToString(_tich2.getChildren()),0);
RDebugUtils.currentLine=2031659;
 //BA.debugLineNum = 2031659;BA.debugLine="If tiCh2.Children.Size=0 Then";
if (_tich2.getChildren().getSize()==0) { 
RDebugUtils.currentLine=2031660;
 //BA.debugLineNum = 2031660;BA.debugLine="sTextoBBCodeView.Append($\"${sIndentNivel2}[Ve";
_stextobbcodeview.Append((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sindentnivel2))+"[Vertical=5][img dir=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.getDirAssets()))+"\" FileName=\"outline_arrow_circle_right_black_18dp.png\" width=18/][/vertical] [TextSize="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.0",(Object)(_textsizenivel2))+"][url]"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tich2.getText()))+"[/url][/textsize]\n"+"	"));
 }else {
RDebugUtils.currentLine=2031663;
 //BA.debugLineNum = 2031663;BA.debugLine="sTextoBBCodeView.Append($\"${sIndentNivel2}[Te";
_stextobbcodeview.Append((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sindentnivel2))+"[TextSize="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.0",(Object)(_textsizenivel2))+"][Color=#191970][b][url]"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tich2.getText()))+"[/url][/b][/color][/textsize]\n"+"	"));
 };
 }
};
 }
};
 }else {
RDebugUtils.currentLine=2031671;
 //BA.debugLineNum = 2031671;BA.debugLine="For Each tiCh1 As TreeItem In tISel.Children";
_tich1 = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
{
final anywheresoftware.b4a.BA.IterableList group37 = _tisel.getChildren();
final int groupLen37 = group37.getSize()
;int index37 = 0;
;
for (; index37 < groupLen37;index37++){
_tich1 = (anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper(), (javafx.scene.control.TreeItem)(group37.Get(index37)));
RDebugUtils.currentLine=2031672;
 //BA.debugLineNum = 2031672;BA.debugLine="If tiCh1.Children.Size=0 Then";
if (_tich1.getChildren().getSize()==0) { 
RDebugUtils.currentLine=2031673;
 //BA.debugLineNum = 2031673;BA.debugLine="sTextoBBCodeView.Append($\"${sIndentNivel0}[Ver";
_stextobbcodeview.Append((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sindentnivel0))+"[Vertical=5][img dir=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.getDirAssets()))+"\" FileName=\"outline_arrow_circle_right_black_24dp.png\" width=24/][/vertical] [TextSize="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.0",(Object)(_textsizenivel0))+"][url]"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tich1.getText()))+"[/url][/textsize]\n"+"	"));
 }else {
RDebugUtils.currentLine=2031676;
 //BA.debugLineNum = 2031676;BA.debugLine="sTextoBBCodeView.Append($\"${sIndentNivel0}[Tex";
_stextobbcodeview.Append((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sindentnivel0))+"[TextSize="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.0",(Object)(_textsizenivel0))+"][Color=#191970][b]"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tich1.getText()))+"[/b][/color][/textsize]\n"+"	"));
 };
RDebugUtils.currentLine=2031680;
 //BA.debugLineNum = 2031680;BA.debugLine="Log(\"tiCh.Children \" & tiCh1.Children)";
anywheresoftware.b4a.keywords.Common.LogImpl("82031680","tiCh.Children "+BA.ObjectToString(_tich1.getChildren()),0);
RDebugUtils.currentLine=2031681;
 //BA.debugLineNum = 2031681;BA.debugLine="For Each tiCh2 As TreeItem In tiCh1.Children";
_tich2 = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
{
final anywheresoftware.b4a.BA.IterableList group44 = _tich1.getChildren();
final int groupLen44 = group44.getSize()
;int index44 = 0;
;
for (; index44 < groupLen44;index44++){
_tich2 = (anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper(), (javafx.scene.control.TreeItem)(group44.Get(index44)));
RDebugUtils.currentLine=2031682;
 //BA.debugLineNum = 2031682;BA.debugLine="Log(\"tiCh1.Children \" & tiCh2.Children)";
anywheresoftware.b4a.keywords.Common.LogImpl("82031682","tiCh1.Children "+BA.ObjectToString(_tich2.getChildren()),0);
RDebugUtils.currentLine=2031683;
 //BA.debugLineNum = 2031683;BA.debugLine="If tiCh2.Children.Size=0 Then";
if (_tich2.getChildren().getSize()==0) { 
RDebugUtils.currentLine=2031684;
 //BA.debugLineNum = 2031684;BA.debugLine="sTextoBBCodeView.Append($\"${sIndentNivel1}[Ve";
_stextobbcodeview.Append((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sindentnivel1))+"[Vertical=5][img dir=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.getDirAssets()))+"\" FileName=\"outline_arrow_circle_right_black_24dp.png\" width=24/][/vertical] [TextSize="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.0",(Object)(_textsizenivel1))+"][url]"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tich2.getText()))+"[/url][/textsize]\n"+"	"));
 }else {
RDebugUtils.currentLine=2031687;
 //BA.debugLineNum = 2031687;BA.debugLine="sTextoBBCodeView.Append($\"${sIndentNivel1}[Te";
_stextobbcodeview.Append((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sindentnivel1))+"[TextSize="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.0",(Object)(_textsizenivel1))+"][Color=#191970][b]"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tich2.getText()))+"[/b][/color][/textsize]\n"+"	"));
RDebugUtils.currentLine=2031689;
 //BA.debugLineNum = 2031689;BA.debugLine="For Each tiCh3 As TreeItem In tiCh2.Children";
_tich3 = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
{
final anywheresoftware.b4a.BA.IterableList group50 = _tich2.getChildren();
final int groupLen50 = group50.getSize()
;int index50 = 0;
;
for (; index50 < groupLen50;index50++){
_tich3 = (anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper(), (javafx.scene.control.TreeItem)(group50.Get(index50)));
RDebugUtils.currentLine=2031690;
 //BA.debugLineNum = 2031690;BA.debugLine="Log(\"tiCh3.Children \" & tiCh3.Children)";
anywheresoftware.b4a.keywords.Common.LogImpl("82031690","tiCh3.Children "+BA.ObjectToString(_tich3.getChildren()),0);
RDebugUtils.currentLine=2031691;
 //BA.debugLineNum = 2031691;BA.debugLine="If tiCh3.Children.Size=0 Then";
if (_tich3.getChildren().getSize()==0) { 
RDebugUtils.currentLine=2031693;
 //BA.debugLineNum = 2031693;BA.debugLine="sTextoBBCodeView.Append($\"${sIndentNivel2}[";
_stextobbcodeview.Append((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sindentnivel2))+"[Vertical=5][img dir=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.getDirAssets()))+"\" FileName=\"outline_arrow_circle_right_black_18dp.png\" width=18/][/vertical] [TextSize="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.0",(Object)(_textsizenivel2))+"][url]"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tich3.getText()))+"[/url][/textsize]\n"+"	"));
 }else {
RDebugUtils.currentLine=2031696;
 //BA.debugLineNum = 2031696;BA.debugLine="sTextoBBCodeView.Append($\"${sIndentNivel2}[";
_stextobbcodeview.Append((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sindentnivel2))+"[TextSize="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.0",(Object)(_textsizenivel2))+"][Color=#191970][b][url]"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tich3.getText()))+"[/url][/b][/color][/textsize]\n"+"	"));
 };
 }
};
 };
 }
};
 }
};
 };
RDebugUtils.currentLine=2031707;
 //BA.debugLineNum = 2031707;BA.debugLine="BBCodeViewElementosMainMenu.Text=sTextoBBCodeView";
_bbcodeviewelementosmainmenu._settext /*String*/ (null,_stextobbcodeview.ToString());
RDebugUtils.currentLine=2031708;
 //BA.debugLineNum = 2031708;BA.debugLine="End Sub";
return "";
}
public static int  _niveltreeitem(anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _ti) throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "niveltreeitem", false))
	 {return ((Integer) Debug.delegate(ba, "niveltreeitem", new Object[] {_ti}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
Object _nivelti = null;
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub NivelTreeItem(tI As TreeItem) As Int";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Dim jo As JavaObject = TreeViewMainMenu";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_treeviewmainmenu.getObject()));
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="Dim NivelTI As Object=jo.RunMethodJO(\"getTreeItem";
_nivelti = (Object)(_jo.RunMethodJO("getTreeItemLevel",new Object[]{(Object)(_ti.getObject())}).getObject());
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="Return NivelTI";
if (true) return (int)(BA.ObjectToNumber(_nivelti));
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="End Sub";
return 0;
}
public static void  _crearexcellinksficheroscarpeta() throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "crearexcellinksficheroscarpeta", false))
	 {Debug.delegate(ba, "crearexcellinksficheroscarpeta", null); return;}
ResumableSub_CrearExcelLinksFicherosCarpeta rsub = new ResumableSub_CrearExcelLinksFicherosCarpeta(null);
rsub.resume(ba, null);
}
public static class ResumableSub_CrearExcelLinksFicherosCarpeta extends BA.ResumableSub {
public ResumableSub_CrearExcelLinksFicherosCarpeta(b4j.docU.mainmenu2 parent) {
this.parent = parent;
}
b4j.docU.mainmenu2 parent;
String _sres = "";
String _permisomodulousuario = "";
Object _msa = null;
int _rint = 0;
String _userdocfolder = "";
anywheresoftware.b4j.objects.DirectoryChooserWrapper _dirch = null;
String _searchdirname = "";
b4j.docU.wildcardlisting _wcl = null;
anywheresoftware.b4a.objects.collections.List _filelisting = null;
int _i = 0;
anywheresoftware.b4j.objects.FileChooserWrapper _fc = null;
String _filename = "";
String _nombreficheroexcel = "";
String _dirficheroexcel = "";
boolean _success = false;
int step29;
int limit29;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu2";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1900568;
 //BA.debugLineNum = 1900568;BA.debugLine="jamLoadingIndicator1.show";
parent._jamloadingindicator1._show /*String*/ (null);
RDebugUtils.currentLine=1900569;
 //BA.debugLineNum = 1900569;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsuari";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "crearexcellinksficheroscarpeta"), parent._utilidades._checkpermisosaplicacionusuarioobjetopermiso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"PermisosAplicacion",parent._main._nombreaplicacion /*String*/ ,parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ,"CrearExcelLinksFicherosCarpeta"));
this.state = 44;
return;
case 44:
//C
this.state = 1;
_sres = (String) result[0];
;
RDebugUtils.currentLine=1900570;
 //BA.debugLineNum = 1900570;BA.debugLine="jamLoadingIndicator1.Close";
parent._jamloadingindicator1._close /*String*/ (null);
RDebugUtils.currentLine=1900571;
 //BA.debugLineNum = 1900571;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\" The";
if (true) break;

case 1:
//if
this.state = 6;
if ((_sres).equals("NO") || (_sres).equals("ERROR") || (_sres).equals("DENIED")) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=1900572;
 //BA.debugLineNum = 1900572;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
_permisomodulousuario = _sres;
RDebugUtils.currentLine=1900574;
 //BA.debugLineNum = 1900574;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Crear exce";
_msa = parent._xui.Msgbox2Async(ba,"¿Crear excel con los nombres de ficheros contenidos en la carpeta seleccionada como links?","Confirma","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=1900575;
 //BA.debugLineNum = 1900575;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "crearexcellinksficheroscarpeta"), _msa);
this.state = 45;
return;
case 45:
//C
this.state = 7;
_rint = (int) result[0];
;
RDebugUtils.currentLine=1900576;
 //BA.debugLineNum = 1900576;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 7:
//if
this.state = 12;
if (_rint!=parent._xui.DialogResponse_Positive) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) return ;
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=1900578;
 //BA.debugLineNum = 1900578;BA.debugLine="Dim UserDocFolder As String=Utilidades.FindUserDo";
_userdocfolder = parent._utilidades._finduserdocumentsfolder /*String*/ ();
RDebugUtils.currentLine=1900580;
 //BA.debugLineNum = 1900580;BA.debugLine="Dim DirCh As DirectoryChooser";
_dirch = new anywheresoftware.b4j.objects.DirectoryChooserWrapper();
RDebugUtils.currentLine=1900581;
 //BA.debugLineNum = 1900581;BA.debugLine="DirCh.Initialize";
_dirch.Initialize();
RDebugUtils.currentLine=1900582;
 //BA.debugLineNum = 1900582;BA.debugLine="DirCh.InitialDirectory=UserDocFolder";
_dirch.setInitialDirectory(_userdocfolder);
RDebugUtils.currentLine=1900583;
 //BA.debugLineNum = 1900583;BA.debugLine="Dim SearchDirName As String = DirCh.Show(frm)";
_searchdirname = _dirch.Show(parent._frm);
RDebugUtils.currentLine=1900584;
 //BA.debugLineNum = 1900584;BA.debugLine="If SearchDirName=\"\" Then Return";
if (true) break;

case 13:
//if
this.state = 18;
if ((_searchdirname).equals("")) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) return ;
if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=1900585;
 //BA.debugLineNum = 1900585;BA.debugLine="Log(\"DirName: \" & SearchDirName)";
anywheresoftware.b4a.keywords.Common.LogImpl("81900585","DirName: "+_searchdirname,0);
RDebugUtils.currentLine=1900587;
 //BA.debugLineNum = 1900587;BA.debugLine="Dim wcl As wildcardlisting";
_wcl = new b4j.docU.wildcardlisting();
RDebugUtils.currentLine=1900589;
 //BA.debugLineNum = 1900589;BA.debugLine="If File.Exists(SearchDirName,\"\") =False Then";
if (true) break;

case 19:
//if
this.state = 28;
if (anywheresoftware.b4a.keywords.Common.File.Exists(_searchdirname,"")==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 28;
RDebugUtils.currentLine=1900590;
 //BA.debugLineNum = 1900590;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.default";
parent._frm.getRootPane().setMouseCursor(parent._fx.Cursors.DEFAULT);
RDebugUtils.currentLine=1900591;
 //BA.debugLineNum = 1900591;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = parent._xui.MsgboxAsync(ba,"No ha sido posible acceder a la carpeta "+_searchdirname,"Error");
RDebugUtils.currentLine=1900592;
 //BA.debugLineNum = 1900592;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "crearexcellinksficheroscarpeta"), _msa);
this.state = 46;
return;
case 46:
//C
this.state = 28;
;
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=1900594;
 //BA.debugLineNum = 1900594;BA.debugLine="wcl.Initialize(Me,\"wcl\")";
_wcl._initialize /*String*/ (null,ba,mainmenu2.getObject(),"wcl");
RDebugUtils.currentLine=1900595;
 //BA.debugLineNum = 1900595;BA.debugLine="wcl.ClearLists";
_wcl._clearlists /*String*/ (null);
RDebugUtils.currentLine=1900596;
 //BA.debugLineNum = 1900596;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.WAIT";
parent._frm.getRootPane().setMouseCursor(parent._fx.Cursors.WAIT);
RDebugUtils.currentLine=1900597;
 //BA.debugLineNum = 1900597;BA.debugLine="wcl.ListFiles(SearchDirName,True,\"*.*\",True,True";
_wcl._listfiles /*String*/ (null,_searchdirname,anywheresoftware.b4a.keywords.Common.True,"*.*",anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1900598;
 //BA.debugLineNum = 1900598;BA.debugLine="wait for wcl_ListFilesFinish(FileListing As List";
anywheresoftware.b4a.keywords.Common.WaitFor("wcl_listfilesfinish", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "crearexcellinksficheroscarpeta"), null);
this.state = 47;
return;
case 47:
//C
this.state = 24;
_filelisting = (anywheresoftware.b4a.objects.collections.List) result[0];
;
RDebugUtils.currentLine=1900599;
 //BA.debugLineNum = 1900599;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
parent._frm.getRootPane().setMouseCursor(parent._fx.Cursors.DEFAULT);
RDebugUtils.currentLine=1900600;
 //BA.debugLineNum = 1900600;BA.debugLine="Log(\"wcl_ListFilesFinish(\" & FileListing.Size &";
anywheresoftware.b4a.keywords.Common.LogImpl("81900600","wcl_ListFilesFinish("+BA.NumberToString(_filelisting.getSize())+")",0);
RDebugUtils.currentLine=1900601;
 //BA.debugLineNum = 1900601;BA.debugLine="For i = 0 To FileListing.Size -1";
if (true) break;

case 24:
//for
this.state = 27;
step29 = 1;
limit29 = (int) (_filelisting.getSize()-1);
_i = (int) (0) ;
this.state = 48;
if (true) break;

case 48:
//C
this.state = 27;
if ((step29 > 0 && _i <= limit29) || (step29 < 0 && _i >= limit29)) this.state = 26;
if (true) break;

case 49:
//C
this.state = 48;
_i = ((int)(0 + _i + step29)) ;
if (true) break;

case 26:
//C
this.state = 49;
RDebugUtils.currentLine=1900602;
 //BA.debugLineNum = 1900602;BA.debugLine="Log(FileListing.Get(i))";
anywheresoftware.b4a.keywords.Common.LogImpl("81900602",BA.ObjectToString(_filelisting.Get(_i)),0);
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;
;
RDebugUtils.currentLine=1900607;
 //BA.debugLineNum = 1900607;BA.debugLine="If FileListing.Size=0 Then";

case 28:
//if
this.state = 31;
if (_filelisting.getSize()==0) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=1900608;
 //BA.debugLineNum = 1900608;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La carpeta se";
_msa = parent._xui.MsgboxAsync(ba,"La carpeta seleccionada ("+_searchdirname+") no contiene ficheros.","Aviso");
RDebugUtils.currentLine=1900609;
 //BA.debugLineNum = 1900609;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "crearexcellinksficheroscarpeta"), _msa);
this.state = 50;
return;
case 50:
//C
this.state = 31;
;
RDebugUtils.currentLine=1900610;
 //BA.debugLineNum = 1900610;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 31:
//C
this.state = 32;
;
RDebugUtils.currentLine=1900613;
 //BA.debugLineNum = 1900613;BA.debugLine="Dim fc As FileChooser";
_fc = new anywheresoftware.b4j.objects.FileChooserWrapper();
RDebugUtils.currentLine=1900614;
 //BA.debugLineNum = 1900614;BA.debugLine="fc.Initialize";
_fc.Initialize();
RDebugUtils.currentLine=1900615;
 //BA.debugLineNum = 1900615;BA.debugLine="fc.Title=\"Indica Fichero Excel destino\"";
_fc.setTitle("Indica Fichero Excel destino");
RDebugUtils.currentLine=1900616;
 //BA.debugLineNum = 1900616;BA.debugLine="fc.SetExtensionFilter(\"Ficheros Excel\", Array As";
_fc.SetExtensionFilter("Ficheros Excel",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"*.xlsx","*.xlsm","*.xls"}));
RDebugUtils.currentLine=1900618;
 //BA.debugLineNum = 1900618;BA.debugLine="fc.InitialDirectory=UserDocFolder";
_fc.setInitialDirectory(_userdocfolder);
RDebugUtils.currentLine=1900619;
 //BA.debugLineNum = 1900619;BA.debugLine="Dim fileName As String = fc.ShowSave(frm)";
_filename = _fc.ShowSave(parent._frm);
RDebugUtils.currentLine=1900620;
 //BA.debugLineNum = 1900620;BA.debugLine="If fileName = \"\" Then Return";
if (true) break;

case 32:
//if
this.state = 37;
if ((_filename).equals("")) { 
this.state = 34;
;}if (true) break;

case 34:
//C
this.state = 37;
if (true) return ;
if (true) break;

case 37:
//C
this.state = 38;
;
RDebugUtils.currentLine=1900622;
 //BA.debugLineNum = 1900622;BA.debugLine="Dim NombreFicheroExcel As String=File.GetName(fil";
_nombreficheroexcel = anywheresoftware.b4a.keywords.Common.File.GetName(_filename);
RDebugUtils.currentLine=1900623;
 //BA.debugLineNum = 1900623;BA.debugLine="Dim DirFicheroExcel As String=File.GetFileParent(";
_dirficheroexcel = anywheresoftware.b4a.keywords.Common.File.GetFileParent(_filename);
RDebugUtils.currentLine=1900625;
 //BA.debugLineNum = 1900625;BA.debugLine="wait For (ExportarExcelFicherosCarpeta(DirFichero";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "crearexcellinksficheroscarpeta"), _exportarexcelficheroscarpeta(_dirficheroexcel,_nombreficheroexcel,_filelisting));
this.state = 51;
return;
case 51:
//C
this.state = 38;
_success = (boolean) result[0];
;
RDebugUtils.currentLine=1900626;
 //BA.debugLineNum = 1900626;BA.debugLine="If Success Then";
if (true) break;

case 38:
//if
this.state = 43;
if (_success) { 
this.state = 40;
}else {
this.state = 42;
}if (true) break;

case 40:
//C
this.state = 43;
RDebugUtils.currentLine=1900627;
 //BA.debugLineNum = 1900627;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Fichero excel";
_msa = parent._xui.MsgboxAsync(ba,"Fichero excel "+_filename+" grabado."+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+".","Aviso");
RDebugUtils.currentLine=1900628;
 //BA.debugLineNum = 1900628;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "crearexcellinksficheroscarpeta"), _msa);
this.state = 52;
return;
case 52:
//C
this.state = 43;
;
RDebugUtils.currentLine=1900629;
 //BA.debugLineNum = 1900629;BA.debugLine="fx.ShowExternalDocument(File.GetUri(DirFicheroEx";
parent._fx.ShowExternalDocument(anywheresoftware.b4a.keywords.Common.File.GetUri(_dirficheroexcel,_nombreficheroexcel));
RDebugUtils.currentLine=1900630;
 //BA.debugLineNum = 1900630;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=1900632;
 //BA.debugLineNum = 1900632;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = parent._xui.MsgboxAsync(ba,"No ha sido posible grabar el fichero. Verifica si tienes excel en el equipo, y que no esté abierto ya un fichero con el nombre "+_nombreficheroexcel,"Error");
RDebugUtils.currentLine=1900633;
 //BA.debugLineNum = 1900633;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "crearexcellinksficheroscarpeta"), _msa);
this.state = 53;
return;
case 53:
//C
this.state = 43;
;
RDebugUtils.currentLine=1900634;
 //BA.debugLineNum = 1900634;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 43:
//C
this.state = -1;
;
RDebugUtils.currentLine=1900637;
 //BA.debugLineNum = 1900637;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _exportarexcelficheroscarpeta(String _directorioficheroexcel,String _nombreficheroexcel,anywheresoftware.b4a.objects.collections.List _lstficheros) throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "exportarexcelficheroscarpeta", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "exportarexcelficheroscarpeta", new Object[] {_directorioficheroexcel,_nombreficheroexcel,_lstficheros}));}
ResumableSub_ExportarExcelFicherosCarpeta rsub = new ResumableSub_ExportarExcelFicherosCarpeta(null,_directorioficheroexcel,_nombreficheroexcel,_lstficheros);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ExportarExcelFicherosCarpeta extends BA.ResumableSub {
public ResumableSub_ExportarExcelFicherosCarpeta(b4j.docU.mainmenu2 parent,String _directorioficheroexcel,String _nombreficheroexcel,anywheresoftware.b4a.objects.collections.List _lstficheros) {
this.parent = parent;
this._directorioficheroexcel = _directorioficheroexcel;
this._nombreficheroexcel = _nombreficheroexcel;
this._lstficheros = _lstficheros;
}
b4j.docU.mainmenu2 parent;
String _directorioficheroexcel;
String _nombreficheroexcel;
anywheresoftware.b4a.objects.collections.List _lstficheros;
anywheresoftware.b4a.objects.collections.List _lstheaders = null;
b4j.docU.xlutils _xl = null;
b4j.docU.xlworkbookwriter _workbook = null;
b4j.docU.xlsheetwriter _sheet1 = null;
String _dateformatant = "";
int _numcolsrs = 0;
b4j.docU.xlstyle _headerstyle = null;
int _idxcol = 0;
b4j.docU.xlstyle _fechasstyle = null;
anywheresoftware.b4a.objects.collections.List _rowstyles = null;
b4j.docU.xlstyle _linkstyle = null;
int _idxfila = 0;
String _nombrefichero = "";
int _ultimafila = 0;
int _i = 0;
String _filename = "";
Object _msa = null;
int step10;
int limit10;
anywheresoftware.b4a.BA.IterableList group17;
int index17;
int groupLen17;
int step24;
int limit24;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu2";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Dim lstHeaders As List=Array As String(\"Fichero\")";
_lstheaders = new anywheresoftware.b4a.objects.collections.List();
_lstheaders = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Fichero"});
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="Dim xl As XLUtils";
_xl = new b4j.docU.xlutils();
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="xl.Initialize";
_xl._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="Dim Workbook As XLWorkbookWriter = xl.CreateWrite";
_workbook = _xl._createwriterblank /*b4j.docU.xlworkbookwriter*/ (null);
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="Dim sheet1 As XLSheetWriter = Workbook.CreateShee";
_sheet1 = _workbook._createsheetwriterbyname /*b4j.docU.xlsheetwriter*/ (null,"Datos");
RDebugUtils.currentLine=1966090;
 //BA.debugLineNum = 1966090;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = anywheresoftware.b4a.keywords.Common.DateTime.getDateFormat();
RDebugUtils.currentLine=1966091;
 //BA.debugLineNum = 1966091;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=1966093;
 //BA.debugLineNum = 1966093;BA.debugLine="Dim NumColsRs As Int=lstHeaders.Size";
_numcolsrs = _lstheaders.getSize();
RDebugUtils.currentLine=1966094;
 //BA.debugLineNum = 1966094;BA.debugLine="Dim HeaderStyle As XLStyle=Workbook.CreateStyle.F";
_headerstyle = _workbook._createstyle /*b4j.docU.xlstyle*/ (null)._fontcolor /*b4j.docU.xlstyle*/ (null,(short) (12),(int) (_xl._color_black /*short*/ ))._foregroundcolor /*b4j.docU.xlstyle*/ (null,_xl._color_grey_25_percent /*short*/ );
RDebugUtils.currentLine=1966096;
 //BA.debugLineNum = 1966096;BA.debugLine="For idxCol=0 To lstHeaders.Size-1";
if (true) break;

case 1:
//for
this.state = 4;
step10 = 1;
limit10 = (int) (_lstheaders.getSize()-1);
_idxcol = (int) (0) ;
this.state = 17;
if (true) break;

case 17:
//C
this.state = 4;
if ((step10 > 0 && _idxcol <= limit10) || (step10 < 0 && _idxcol >= limit10)) this.state = 3;
if (true) break;

case 18:
//C
this.state = 17;
_idxcol = ((int)(0 + _idxcol + step10)) ;
if (true) break;

case 3:
//C
this.state = 18;
RDebugUtils.currentLine=1966098;
 //BA.debugLineNum = 1966098;BA.debugLine="sheet1.PutString(xl.AddressZero(idxCol,0), lstHe";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addresszero /*b4j.docU.xlutils._xladdress*/ (null,_idxcol,(int) (0)),BA.ObjectToString(_lstheaders.Get(_idxcol)));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=1966101;
 //BA.debugLineNum = 1966101;BA.debugLine="Dim FechasStyle As XLStyle = Workbook.CreateStyle";
_fechasstyle = _workbook._createstyle /*b4j.docU.xlstyle*/ (null)._dataformat /*b4j.docU.xlstyle*/ (null,("dd\"/\"mm\"/\"yyyy"));
RDebugUtils.currentLine=1966102;
 //BA.debugLineNum = 1966102;BA.debugLine="Dim RowStyles As List = Array(Workbook.CreateStyl";
_rowstyles = new anywheresoftware.b4a.objects.collections.List();
_rowstyles = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_workbook._createstyle /*b4j.docU.xlstyle*/ (null)._foregroundcolor /*b4j.docU.xlstyle*/ (null,_xl._color_orange /*short*/ )),(Object)(_workbook._createstyle /*b4j.docU.xlstyle*/ (null)._foregroundcolor /*b4j.docU.xlstyle*/ (null,_xl._color_white /*short*/ ))});
RDebugUtils.currentLine=1966104;
 //BA.debugLineNum = 1966104;BA.debugLine="Dim LinkStyle As XLStyle = Workbook.CreateStyle.F";
_linkstyle = _workbook._createstyle /*b4j.docU.xlstyle*/ (null)._fontlink /*b4j.docU.xlstyle*/ (null,(short) (11))._horizontalalignment /*b4j.docU.xlstyle*/ (null,"LEFT");
RDebugUtils.currentLine=1966109;
 //BA.debugLineNum = 1966109;BA.debugLine="Dim idxFila As Int=1";
_idxfila = (int) (1);
RDebugUtils.currentLine=1966111;
 //BA.debugLineNum = 1966111;BA.debugLine="For Each NombreFichero As String In lstFicheros";
if (true) break;

case 5:
//for
this.state = 8;
group17 = _lstficheros;
index17 = 0;
groupLen17 = group17.getSize();
this.state = 19;
if (true) break;

case 19:
//C
this.state = 8;
if (index17 < groupLen17) {
this.state = 7;
_nombrefichero = BA.ObjectToString(group17.Get(index17));}
if (true) break;

case 20:
//C
this.state = 19;
index17++;
if (true) break;

case 7:
//C
this.state = 20;
RDebugUtils.currentLine=1966149;
 //BA.debugLineNum = 1966149;BA.debugLine="sheet1.PutString(xl.AddressZero(0,idxFila),Nombr";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addresszero /*b4j.docU.xlutils._xladdress*/ (null,(int) (0),_idxfila),_nombrefichero)._setstyle /*b4j.docU.xlsheetwriter*/ (null,_sheet1._lastaccessed /*b4j.docU.xlutils._xladdress*/ ,_linkstyle);
RDebugUtils.currentLine=1966150;
 //BA.debugLineNum = 1966150;BA.debugLine="sheet1.CreateHyperlink(sheet1.LastAccessed, \"FIL";
_sheet1._createhyperlink /*b4j.docU.xlsheetwriter*/ (null,_sheet1._lastaccessed /*b4j.docU.xlutils._xladdress*/ ,"FILE","file://"+_nombrefichero.replace("\\","/").replace(" ","%20"));
RDebugUtils.currentLine=1966153;
 //BA.debugLineNum = 1966153;BA.debugLine="idxFila=idxFila+1";
_idxfila = (int) (_idxfila+1);
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=1966159;
 //BA.debugLineNum = 1966159;BA.debugLine="Dim UltimaFila As Int=idxFila";
_ultimafila = _idxfila;
RDebugUtils.currentLine=1966165;
 //BA.debugLineNum = 1966165;BA.debugLine="sheet1.SetAutoFilter(xl.CreateXLRange(xl.AddressZ";
_sheet1._setautofilter /*b4j.docU.xlsheetwriter*/ (null,_xl._createxlrange /*b4j.docU.xlutils._xlrange*/ (null,_xl._addresszero /*b4j.docU.xlutils._xladdress*/ (null,(int) (0),(int) (0)),_xl._addresszero /*b4j.docU.xlutils._xladdress*/ (null,(int) (0),_ultimafila)));
RDebugUtils.currentLine=1966167;
 //BA.debugLineNum = 1966167;BA.debugLine="For i=0 To idxCol+1 ' +1 ,  porque hemos añadido";
if (true) break;

case 9:
//for
this.state = 12;
step24 = 1;
limit24 = (int) (_idxcol+1);
_i = (int) (0) ;
this.state = 21;
if (true) break;

case 21:
//C
this.state = 12;
if ((step24 > 0 && _i <= limit24) || (step24 < 0 && _i >= limit24)) this.state = 11;
if (true) break;

case 22:
//C
this.state = 21;
_i = ((int)(0 + _i + step24)) ;
if (true) break;

case 11:
//C
this.state = 22;
RDebugUtils.currentLine=1966168;
 //BA.debugLineNum = 1966168;BA.debugLine="sheet1.AutoSizeColumn(i)";
_sheet1._autosizecolumn /*b4j.docU.xlsheetwriter*/ (null,_i);
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=1966179;
 //BA.debugLineNum = 1966179;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=1966195;
 //BA.debugLineNum = 1966195;BA.debugLine="Dim filename As String = Workbook.SaveAs(Director";
_filename = _workbook._saveas /*String*/ (null,_directorioficheroexcel,_nombreficheroexcel,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1966196;
 //BA.debugLineNum = 1966196;BA.debugLine="If filename<>DirectorioFicheroExcel & \"\\\" & Nombr";
if (true) break;

case 13:
//if
this.state = 16;
if ((_filename).equals(_directorioficheroexcel+"\\"+_nombreficheroexcel) == false) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=1966197;
 //BA.debugLineNum = 1966197;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error al grab";
_msa = parent._xui.MsgboxAsync(ba,"Error al grabar el fichero excel.","Error");
RDebugUtils.currentLine=1966198;
 //BA.debugLineNum = 1966198;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "exportarexcelficheroscarpeta"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 16;
;
RDebugUtils.currentLine=1966199;
 //BA.debugLineNum = 1966199;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=1966202;
 //BA.debugLineNum = 1966202;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=1966203;
 //BA.debugLineNum = 1966203;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.objects.collections.List  _crearlistaparentsmenuitem(anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tior) throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "crearlistaparentsmenuitem", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "crearlistaparentsmenuitem", new Object[] {_tior}));}
anywheresoftware.b4a.objects.collections.List _lstparents = null;
int _numniveles = 0;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tip = null;
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub CrearListaParentsMenuItem(tiOr As TreeItem) As";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Dim lstParents As List";
_lstparents = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="lstParents.Initialize";
_lstparents.Initialize();
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="Dim NumNiveles As Int";
_numniveles = 0;
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="Dim tiP As TreeItem=tiOr.Parent";
_tip = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_tip = _tior.getParent();
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="If tiP.IsInitialized Then";
if (_tip.IsInitialized()) { 
RDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="Log(\"Parent treeitem: \" & tiP.Text)";
anywheresoftware.b4a.keywords.Common.LogImpl("82228231","Parent treeitem: "+_tip.getText(),0);
RDebugUtils.currentLine=2228234;
 //BA.debugLineNum = 2228234;BA.debugLine="If tiP.Text<>\"root\" Then";
if ((_tip.getText()).equals("root") == false) { 
RDebugUtils.currentLine=2228235;
 //BA.debugLineNum = 2228235;BA.debugLine="NumNiveles=NumNiveles+1";
_numniveles = (int) (_numniveles+1);
RDebugUtils.currentLine=2228236;
 //BA.debugLineNum = 2228236;BA.debugLine="lstParents.Add(tiP)";
_lstparents.Add((Object)(_tip.getObject()));
RDebugUtils.currentLine=2228237;
 //BA.debugLineNum = 2228237;BA.debugLine="CrearListaParentsMenuItem(tiP)";
_crearlistaparentsmenuitem(_tip);
 };
 };
RDebugUtils.currentLine=2228240;
 //BA.debugLineNum = 2228240;BA.debugLine="Return lstParents";
if (true) return _lstparents;
RDebugUtils.currentLine=2228241;
 //BA.debugLineNum = 2228241;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _downloadfile(String _link,String _dirdestino,String _nombrficherodestino) throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "downloadfile", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "downloadfile", new Object[] {_link,_dirdestino,_nombrficherodestino}));}
ResumableSub_DownloadFile rsub = new ResumableSub_DownloadFile(null,_link,_dirdestino,_nombrficherodestino);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DownloadFile extends BA.ResumableSub {
public ResumableSub_DownloadFile(b4j.docU.mainmenu2 parent,String _link,String _dirdestino,String _nombrficherodestino) {
this.parent = parent;
this._link = _link;
this._dirdestino = _dirdestino;
this._nombrficherodestino = _nombrficherodestino;
}
b4j.docU.mainmenu2 parent;
String _link;
String _dirdestino;
String _nombrficherodestino;
anywheresoftware.b4a.objects.collections.Map _m = null;
b4j.docU.httpjob _job = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu2";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="m.Put(\"DownLoadOK\",False)";
_m.Put((Object)("DownLoadOK"),(Object)(anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="job.Initialize(\"\", Me)";
_job._initialize /*String*/ (null,ba,"",mainmenu2.getObject());
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="job.Download(Link)";
_job._download /*String*/ (null,_link);
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="Wait For (job) JobDone(job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "downloadfile"), (Object)(_job));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_job = (b4j.docU.httpjob) result[0];
;
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="If job.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1835017;
 //BA.debugLineNum = 1835017;BA.debugLine="m.Put(\"DownLoadOK\",True)";
_m.Put((Object)("DownLoadOK"),(Object)(anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=1835018;
 //BA.debugLineNum = 1835018;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=1835019;
 //BA.debugLineNum = 1835019;BA.debugLine="out = File.OpenOutput(DirDestino,NombrFicheroDes";
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(_dirdestino,_nombrficherodestino,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1835020;
 //BA.debugLineNum = 1835020;BA.debugLine="File.Copy2(job.GetInputStream, out)";
anywheresoftware.b4a.keywords.Common.File.Copy2((java.io.InputStream)(_job._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=1835021;
 //BA.debugLineNum = 1835021;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=1835022;
 //BA.debugLineNum = 1835022;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "downloadfile"),(int) (100));
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=1835024;
 //BA.debugLineNum = 1835024;BA.debugLine="job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=1835025;
 //BA.debugLineNum = 1835025;BA.debugLine="Return m";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_m));return;};
RDebugUtils.currentLine=1835026;
 //BA.debugLineNum = 1835026;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _iterateoverchildren(anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _parent) throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "iterateoverchildren", false))
	 {return ((String) Debug.delegate(ba, "iterateoverchildren", new Object[] {_parent}));}
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tti = null;
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub IterateOverChildren(parent As TreeItem)";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="For Each tti As TreeItem In parent.Children";
_tti = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = _parent.getChildren();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_tti = (anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper(), (javafx.scene.control.TreeItem)(group1.Get(index1)));
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="If tti.Children.Size > 0 Then";
if (_tti.getChildren().getSize()>0) { 
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="IterateOverChildren(tti)";
_iterateoverchildren(_tti);
 };
 }
};
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _reiniciarsincronizaciondocuware() throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "reiniciarsincronizaciondocuware", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "reiniciarsincronizaciondocuware", null));}
ResumableSub_ReiniciarSincronizacionDocuware rsub = new ResumableSub_ReiniciarSincronizacionDocuware(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ReiniciarSincronizacionDocuware extends BA.ResumableSub {
public ResumableSub_ReiniciarSincronizacionDocuware(b4j.docU.mainmenu2 parent) {
this.parent = parent;
}
b4j.docU.mainmenu2 parent;
String _sresp = "";
b4j.docU.httpjob _job = null;
String _urlsincronizaciondocuware = "";
anywheresoftware.b4a.randomaccessfile.B4XSerializator _ser = null;
byte[] _data = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu2";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=254935041;
 //BA.debugLineNum = 254935041;BA.debugLine="Dim sResp As String";
_sresp = "";
RDebugUtils.currentLine=254935043;
 //BA.debugLineNum = 254935043;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=254935044;
 //BA.debugLineNum = 254935044;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",mainmenu2.getObject());
RDebugUtils.currentLine=254935045;
 //BA.debugLineNum = 254935045;BA.debugLine="Dim URLSincronizacionDocuware As String=\"http://1";
_urlsincronizaciondocuware = "http://192.168.10.20:17501/RebootDocuwareTimer";
RDebugUtils.currentLine=254935046;
 //BA.debugLineNum = 254935046;BA.debugLine="Dim ser As B4XSerializator";
_ser = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
RDebugUtils.currentLine=254935047;
 //BA.debugLineNum = 254935047;BA.debugLine="Dim data() As Byte = ser.ConvertObjectToBytes(\"\")";
_data = _ser.ConvertObjectToBytes((Object)(""));
RDebugUtils.currentLine=254935048;
 //BA.debugLineNum = 254935048;BA.debugLine="job.PostBytes(URLSincronizacionDocuware,data)";
_job._postbytes /*String*/ (null,_urlsincronizaciondocuware,_data);
RDebugUtils.currentLine=254935049;
 //BA.debugLineNum = 254935049;BA.debugLine="job.GetRequest.Timeout=10000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (10000));
RDebugUtils.currentLine=254935050;
 //BA.debugLineNum = 254935050;BA.debugLine="Wait For (job) JobDone(job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "reiniciarsincronizaciondocuware"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (b4j.docU.httpjob) result[0];
;
RDebugUtils.currentLine=254935052;
 //BA.debugLineNum = 254935052;BA.debugLine="Log(\"Success ReiniciarSincronizacionDocuware: \" &";
anywheresoftware.b4a.keywords.Common.LogImpl("8254935052","Success ReiniciarSincronizacionDocuware: "+BA.ObjectToString(_job._success /*boolean*/ ),0);
RDebugUtils.currentLine=254935054;
 //BA.debugLineNum = 254935054;BA.debugLine="If Not(job.Success) Then";
if (true) break;

case 1:
//if
this.state = 6;
if (anywheresoftware.b4a.keywords.Common.Not(_job._success /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=254935055;
 //BA.debugLineNum = 254935055;BA.debugLine="Log(\"jobTest.Response.ErrorMessage: \" & job.Erro";
anywheresoftware.b4a.keywords.Common.LogImpl("8254935055","jobTest.Response.ErrorMessage: "+_job._errormessage /*String*/ ,0);
RDebugUtils.currentLine=254935056;
 //BA.debugLineNum = 254935056;BA.debugLine="sResp=$\"ERROR, ${job.ErrorMessage}\"$";
_sresp = ("ERROR, "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_job._errormessage /*String*/ ))+"");
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=254935058;
 //BA.debugLineNum = 254935058;BA.debugLine="sResp=\"OK\"";
_sresp = "OK";
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=254935060;
 //BA.debugLineNum = 254935060;BA.debugLine="job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=254935061;
 //BA.debugLineNum = 254935061;BA.debugLine="Return sResp";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_sresp));return;};
RDebugUtils.currentLine=254935062;
 //BA.debugLineNum = 254935062;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _scrolltoitem(anywheresoftware.b4j.objects.TreeViewWrapper _tree,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _ti) throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "scrolltoitem", false))
	 {return ((String) Debug.delegate(ba, "scrolltoitem", new Object[] {_tree,_ti}));}
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _p = null;
int _index = 0;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub ScrollToItem (tree As TreeView, ti As TreeItem";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Dim p As TreeItem = ti.Parent";
_p = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_p = _ti.getParent();
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="Do While p.Root = False";
while (_p.getRoot()==anywheresoftware.b4a.keywords.Common.False) {
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="p.Expanded = True";
_p.setExpanded(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="p = p.Parent";
_p = _p.getParent();
 }
;
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="Dim index As Int = CountVisibleChildren(tree.Root";
_index = _countvisiblechildren(_tree.getRoot(),_ti,new boolean[]{anywheresoftware.b4a.keywords.Common.False});
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="Dim jo As JavaObject = tree";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_tree.getObject()));
RDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="Log(index)";
anywheresoftware.b4a.keywords.Common.LogImpl("81703944",BA.NumberToString(_index),0);
RDebugUtils.currentLine=1703945;
 //BA.debugLineNum = 1703945;BA.debugLine="jo.RunMethod(\"scrollTo\", Array(index))";
_jo.RunMethod("scrollTo",new Object[]{(Object)(_index)});
RDebugUtils.currentLine=1703946;
 //BA.debugLineNum = 1703946;BA.debugLine="End Sub";
return "";
}
public static String  _searchparentstreeitem(anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tior) throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "searchparentstreeitem", false))
	 {return ((String) Debug.delegate(ba, "searchparentstreeitem", new Object[] {_tior}));}
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tip = null;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub SearchParentsTreeItem(tiOR As TreeItem)";
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="Dim tiP As TreeItem=tiOR.Parent";
_tip = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_tip = _tior.getParent();
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="If tiP.IsInitialized Then";
if (_tip.IsInitialized()) { 
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="Log(tiP.Text)";
anywheresoftware.b4a.keywords.Common.LogImpl("81114116",_tip.getText(),0);
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="Main.lstSelItem.Add(tiP)";
_main._lstselitem /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_tip.getObject()));
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="SearchParentsTreeItem(tiP)";
_searchparentstreeitem(_tip);
 };
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _seleccionaralmacen() throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "seleccionaralmacen", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "seleccionaralmacen", null));}
ResumableSub_SeleccionarAlmacen rsub = new ResumableSub_SeleccionarAlmacen(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SeleccionarAlmacen extends BA.ResumableSub {
public ResumableSub_SeleccionarAlmacen(b4j.docU.mainmenu2 parent) {
this.parent = parent;
}
b4j.docU.mainmenu2 parent;
b4j.docU.b4xlisttemplate _b4xlistdlg = null;
float _textsize = 0f;
b4j.example.customlistview _xclv = null;
anywheresoftware.b4j.objects.LabelWrapper _dlbl = null;
anywheresoftware.b4a.objects.collections.List _lstopciones = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
Object _msa = null;
int step15;
int limit15;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu2";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Dialog.Title=\"Selecciona Almacén de Conexión\"";
parent._dialog._title /*Object*/  = (Object)("Selecciona Almacén de Conexión");
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Dialog.TitleBarHeight=60dip";
parent._dialog._titlebarheight /*int*/  = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60));
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
parent._dialog._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = parent._xui.CreateDefaultFont((float) (18));
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
parent._dialog._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = parent._xui.CreateDefaultFont((float) (20));
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
_b4xlistdlg = new b4j.docU.b4xlisttemplate();
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="B4XListDlg.Initialize";
_b4xlistdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
_textsize = (float) (18);
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
_xclv = _b4xlistdlg._customlistview1 /*b4j.example.customlistview*/ ;
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
_xclv._sv.getScrollViewInnerPanel().setColor(parent._xui.Color_White);
RDebugUtils.currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
_dlbl = new anywheresoftware.b4j.objects.LabelWrapper();
_dlbl = _xclv._designerlabel;
RDebugUtils.currentLine=851982;
 //BA.debugLineNum = 851982;BA.debugLine="dlbl.TextSize=TextSize";
_dlbl.setTextSize(_textsize);
RDebugUtils.currentLine=851984;
 //BA.debugLineNum = 851984;BA.debugLine="Dim lstOpciones As List=Array As String(\"PROIN\",\"";
_lstopciones = new anywheresoftware.b4a.objects.collections.List();
_lstopciones = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"PROIN","PROTEC"});
RDebugUtils.currentLine=851986;
 //BA.debugLineNum = 851986;BA.debugLine="B4XListDlg.Options=lstOpciones";
_b4xlistdlg._options /*anywheresoftware.b4a.objects.collections.List*/  = _lstopciones;
RDebugUtils.currentLine=851988;
 //BA.debugLineNum = 851988;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=851990;
 //BA.debugLineNum = 851990;BA.debugLine="For i=0 To lstOpciones.size-1";
if (true) break;

case 1:
//for
this.state = 4;
step15 = 1;
limit15 = (int) (_lstopciones.getSize()-1);
_i = (int) (0) ;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 4;
if ((step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15)) this.state = 3;
if (true) break;

case 26:
//C
this.state = 25;
_i = ((int)(0 + _i + step15)) ;
if (true) break;

case 3:
//C
this.state = 26;
RDebugUtils.currentLine=851991;
 //BA.debugLineNum = 851991;BA.debugLine="xclv.ResizeItem(i,80dip)";
_xclv._resizeitem(_i,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=851995;
 //BA.debugLineNum = 851995;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = parent._dialog._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,parent._xui.DialogResponse_Cancel);
RDebugUtils.currentLine=851996;
 //BA.debugLineNum = 851996;BA.debugLine="If bCancel.IsInitialized Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_bcancel.IsInitialized()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=851998;
 //BA.debugLineNum = 851998;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
_bcancel.setLeft(_bcancel.getLeft()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=851999;
 //BA.debugLineNum = 851999;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
_bcancel.setWidth(_bcancel.getWidth()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (30)));
RDebugUtils.currentLine=852000;
 //BA.debugLineNum = 852000;BA.debugLine="bCancel.TextSize=18";
_bcancel.setTextSize(18);
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=852003;
 //BA.debugLineNum = 852003;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "seleccionaralmacen"), _rsub);
this.state = 27;
return;
case 27:
//C
this.state = 9;
_rint = (int) result[0];
;
RDebugUtils.currentLine=852004;
 //BA.debugLineNum = 852004;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
if (true) break;

case 9:
//if
this.state = 24;
if (_rint!=parent._xui.DialogResponse_Positive) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 24;
RDebugUtils.currentLine=852005;
 //BA.debugLineNum = 852005;BA.debugLine="Return \"\"";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(""));return;};
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=852008;
 //BA.debugLineNum = 852008;BA.debugLine="If Main.AlmacenIPConexion<>\"\" And Main.AlmacenIP";
if (true) break;

case 14:
//if
this.state = 23;
if ((parent._main._almacenipconexion /*String*/ ).equals("") == false && (parent._main._almacenipconexion /*String*/ ).equals(_b4xlistdlg._selecteditem /*String*/ ) == false) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=852009;
 //BA.debugLineNum = 852009;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"Se ha sel";
_msa = parent._xui.Msgbox2Async(ba,"Se ha seleccionado un almacén distinto al almacén en el que te has conectado por red."+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Esto afecta a los datos de Almacen que se pueden ver/editar y a las impresoras que se pueden seleccionar."+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"¿Continuar?","Confirma","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=852011;
 //BA.debugLineNum = 852011;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "seleccionaralmacen"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 17;
_rint = (int) result[0];
;
RDebugUtils.currentLine=852012;
 //BA.debugLineNum = 852012;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
if (true) break;

case 17:
//if
this.state = 22;
if (_rint!=parent._xui.DialogResponse_Positive) { 
this.state = 19;
;}if (true) break;

case 19:
//C
this.state = 22;
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(""));return;};
if (true) break;

case 22:
//C
this.state = 23;
;
 if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=852015;
 //BA.debugLineNum = 852015;BA.debugLine="Return B4XListDlg.SelectedItem";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_b4xlistdlg._selecteditem /*String*/ ));return;};
 if (true) break;

case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=852017;
 //BA.debugLineNum = 852017;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _sethandler(anywheresoftware.b4j.object.JavaObject _ob,String _eventname,String _handlername) throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "sethandler", false))
	 {return ((String) Debug.delegate(ba, "sethandler", new Object[] {_ob,_eventname,_handlername}));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Private Sub setHandler(ob As JavaObject,eventName";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="ob.RunMethod(eventName, Array(ob.CreateEventFromU";
_ob.RunMethod(_eventname,new Object[]{_ob.CreateEventFromUI(ba,"javafx.event.EventHandler",_handlername,(Object)(anywheresoftware.b4a.keywords.Common.False))});
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="End Sub";
return "";
}
public static String  _shl_processcompleted(boolean _success,int _exitcode,String _stdout,String _stderr) throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "shl_processcompleted", false))
	 {return ((String) Debug.delegate(ba, "shl_processcompleted", new Object[] {_success,_exitcode,_stdout,_stderr}));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub shl_ProcessCompleted (Success As Boolean, Exit";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="If Success And ExitCode = 0 Then";
if (_success && _exitcode==0) { 
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Log(\"Success\")";
anywheresoftware.b4a.keywords.Common.LogImpl("81441794","Success",0);
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="Log(StdOut)";
anywheresoftware.b4a.keywords.Common.LogImpl("81441795",_stdout,0);
 }else {
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="Log(\"Error: \" & StdErr)";
anywheresoftware.b4a.keywords.Common.LogImpl("81441797","Error: "+_stderr,0);
 };
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper  _treeitemmayornivelexpandido(anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _ti) throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "treeitemmayornivelexpandido", false))
	 {return ((anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper) Debug.delegate(ba, "treeitemmayornivelexpandido", new Object[] {_ti}));}
boolean _flagexpanded = false;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tich = null;
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub TreeItemMayorNivelExpandido(tI As TreeItem) As";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="If tI.Children.Size=0 Then Return tI";
if (_ti.getChildren().getSize()==0) { 
if (true) return _ti;};
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="Dim FlagExpanded As Boolean";
_flagexpanded = false;
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="For Each tiCh As TreeItem In tI.Children";
_tich = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
{
final anywheresoftware.b4a.BA.IterableList group3 = _ti.getChildren();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_tich = (anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper(), (javafx.scene.control.TreeItem)(group3.Get(index3)));
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="If tiCh.Expanded Then";
if (_tich.getExpanded()) { 
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="FlagExpanded=True";
_flagexpanded = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="If FlagExpanded Then";
if (_flagexpanded) { 
RDebugUtils.currentLine=2424843;
 //BA.debugLineNum = 2424843;BA.debugLine="Dim tI As TreeItem=TreeItemMayorNivelExpandido(t";
_ti = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_ti = _treeitemmayornivelexpandido(_tich);
RDebugUtils.currentLine=2424844;
 //BA.debugLineNum = 2424844;BA.debugLine="Return tI";
if (true) return _ti;
 }else {
RDebugUtils.currentLine=2424846;
 //BA.debugLineNum = 2424846;BA.debugLine="Return tI";
if (true) return _ti;
 };
RDebugUtils.currentLine=2424848;
 //BA.debugLineNum = 2424848;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _verificarversionactual() throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "verificarversionactual", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "verificarversionactual", null));}
ResumableSub_VerificarVersionActual rsub = new ResumableSub_VerificarVersionActual(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_VerificarVersionActual extends BA.ResumableSub {
public ResumableSub_VerificarVersionActual(b4j.docU.mainmenu2 parent) {
this.parent = parent;
}
b4j.docU.mainmenu2 parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstregistros = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _versionservidor = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu2";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"VersionActualAplicacion",(Object[])(new String[]{parent._main._nombreaplicacion /*String*/ }),mainmenu2.getObject());
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
anywheresoftware.b4a.keywords.Common.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "verificarversionactual"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 12;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = parent._xui.MsgboxAsync(ba,"Error de conexion servidor/query VersionActualAplicacion. Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "verificarversionactual"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="Accion=\"ExitApp\"";
_accion = "ExitApp";
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="Return Accion";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
if (true) break;

case 6:
//if
this.state = 11;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
RDebugUtils.currentLine=917518;
 //BA.debugLineNum = 917518;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = parent._xui.MsgboxAsync(ba,"No hay datos de versión actual en la tabla...","Aviso");
RDebugUtils.currentLine=917519;
 //BA.debugLineNum = 917519;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "verificarversionactual"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=917523;
 //BA.debugLineNum = 917523;BA.debugLine="Accion=\"ExitApp\"";
_accion = "ExitApp";
RDebugUtils.currentLine=917524;
 //BA.debugLineNum = 917524;BA.debugLine="Return Accion";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=917526;
 //BA.debugLineNum = 917526;BA.debugLine="Dim lstRegistros As List=mresult.Get(\"lstRes\")";
_lstregistros = new anywheresoftware.b4a.objects.collections.List();
_lstregistros = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=917527;
 //BA.debugLineNum = 917527;BA.debugLine="Dim m As Map=lstRegistros.Get(0)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstregistros.Get((int) (0))));
RDebugUtils.currentLine=917528;
 //BA.debugLineNum = 917528;BA.debugLine="Dim VersionServidor As String=m.Get(\"VersionAct";
_versionservidor = BA.ObjectToString(_m.Get((Object)("VersionActual")));
RDebugUtils.currentLine=917547;
 //BA.debugLineNum = 917547;BA.debugLine="Return \"OK\"";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)("OK"));return;};
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=917553;
 //BA.debugLineNum = 917553;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _splitpanemainmenu_resize(double _width,double _height) throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "splitpanemainmenu_resize", false))
	 {return ((String) Debug.delegate(ba, "splitpanemainmenu_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub SplitPaneMainMenu_Resize (Width As Double, Hei";
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="End Sub";
return "";
}
public static String  _titem_expandedchanged(boolean _expanded) throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "titem_expandedchanged", false))
	 {return ((String) Debug.delegate(ba, "titem_expandedchanged", new Object[] {_expanded}));}
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _ti = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _timaxnivelexp = null;
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub tItem_ExpandedChanged(Expanded As Boolean)";
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Dim ti As TreeItem=Sender";
_ti = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_ti = (anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper(), (javafx.scene.control.TreeItem)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="Log(ti.Text & \" \" & ti.Expanded)";
anywheresoftware.b4a.keywords.Common.LogImpl("81245187",_ti.getText()+" "+BA.ObjectToString(_ti.getExpanded()),0);
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="If ti.Expanded Then";
if (_ti.getExpanded()) { 
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="ContraerItemsOtrasRamas2(ti)";
_contraeritemsotrasramas2(_ti);
RDebugUtils.currentLine=1245213;
 //BA.debugLineNum = 1245213;BA.debugLine="Main.lstSelItem.Clear";
_main._lstselitem /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=1245214;
 //BA.debugLineNum = 1245214;BA.debugLine="SearchParentsTreeItem(ti)";
_searchparentstreeitem(_ti);
 }else {
RDebugUtils.currentLine=1245223;
 //BA.debugLineNum = 1245223;BA.debugLine="ContraerItemsChildren(ti)";
_contraeritemschildren(_ti);
 };
RDebugUtils.currentLine=1245231;
 //BA.debugLineNum = 1245231;BA.debugLine="Dim tiMaxNivelExp As TreeItem=TreeItemMayorNivelE";
_timaxnivelexp = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_timaxnivelexp = _treeitemmayornivelexpandido(_treeviewmainmenu.getRoot());
RDebugUtils.currentLine=1245232;
 //BA.debugLineNum = 1245232;BA.debugLine="CrearAccesosDirectosItem3(tiMaxNivelExp)";
_crearaccesosdirectositem3(_timaxnivelexp);
RDebugUtils.currentLine=1245233;
 //BA.debugLineNum = 1245233;BA.debugLine="End Sub";
return "";
}
public static void  _titem_mouseclicked_event(String _methodname,Object[] _args) throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "titem_mouseclicked_event", false))
	 {Debug.delegate(ba, "titem_mouseclicked_event", new Object[] {_methodname,_args}); return;}
ResumableSub_tItem_MouseClicked_Event rsub = new ResumableSub_tItem_MouseClicked_Event(null,_methodname,_args);
rsub.resume(ba, null);
}
public static class ResumableSub_tItem_MouseClicked_Event extends BA.ResumableSub {
public ResumableSub_tItem_MouseClicked_Event(b4j.docU.mainmenu2 parent,String _methodname,Object[] _args) {
this.parent = parent;
this._methodname = _methodname;
this._args = _args;
}
b4j.docU.mainmenu2 parent;
String _methodname;
Object[] _args;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _ti = null;
anywheresoftware.b4j.object.JavaObject _jombtn = null;
String _sbtn = "";
boolean _permisocalidadok = false;
String _sres = "";
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _timaxnivelexp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu2";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Dim tI As TreeItem=Sender";
_ti = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_ti = (anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper(), (javafx.scene.control.TreeItem)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Dim JOMbtn As JavaObject=asJO(Args(0)).RunMethodJ";
_jombtn = new anywheresoftware.b4j.object.JavaObject();
_jombtn = _asjo((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_args[(int) (0)]))).RunMethodJO("getButton",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="Dim sBtn As String=JOMbtn.RunMethod(\"name\",Null)";
_sbtn = BA.ObjectToString(_jombtn.RunMethod("name",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="Log(\"tItem_MouseClicked\")";
anywheresoftware.b4a.keywords.Common.LogImpl("81179652","tItem_MouseClicked",0);
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="Log(tI.Text & \" \" & tI.Expanded)";
anywheresoftware.b4a.keywords.Common.LogImpl("81179653",_ti.getText()+" "+BA.ObjectToString(_ti.getExpanded()),0);
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="If tI.Expanded Then";
if (true) break;

case 1:
//if
this.state = 14;
if (_ti.getExpanded()) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="ContraerItemsOtrasRamas2(tI)";
_contraeritemsotrasramas2(_ti);
RDebugUtils.currentLine=1179659;
 //BA.debugLineNum = 1179659;BA.debugLine="Select Case tI.Text   ' con este select se puede";
if (true) break;

case 4:
//select
this.state = 11;
switch (BA.switchObjectToInt(_ti.getText(),"Calidad")) {
case 0: {
this.state = 6;
if (true) break;
}
}
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=1179662;
 //BA.debugLineNum = 1179662;BA.debugLine="jamLoadingIndicator1.show";
parent._jamloadingindicator1._show /*String*/ (null);
RDebugUtils.currentLine=1179663;
 //BA.debugLineNum = 1179663;BA.debugLine="Dim PermisoCalidadOK As Boolean";
_permisocalidadok = false;
RDebugUtils.currentLine=1179664;
 //BA.debugLineNum = 1179664;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsu";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "titem_mouseclicked_event"), parent._utilidades._checkpermisosaplicacionusuarioobjetopermiso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"PermisosAplicacion",parent._main._nombreaplicacion /*String*/ ,parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ,"cImpresionEtiquetasOlano"));
this.state = 15;
return;
case 15:
//C
this.state = 7;
_sres = (String) result[0];
;
RDebugUtils.currentLine=1179665;
 //BA.debugLineNum = 1179665;BA.debugLine="jamLoadingIndicator1.Close";
parent._jamloadingindicator1._close /*String*/ (null);
RDebugUtils.currentLine=1179666;
 //BA.debugLineNum = 1179666;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\"";
if (true) break;

case 7:
//if
this.state = 10;
if ((_sres).equals("NO") || (_sres).equals("ERROR") || (_sres).equals("DENIED")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=1179667;
 //BA.debugLineNum = 1179667;BA.debugLine="tI.Expanded=False";
_ti.setExpanded(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1179668;
 //BA.debugLineNum = 1179668;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 14;
;
RDebugUtils.currentLine=1179680;
 //BA.debugLineNum = 1179680;BA.debugLine="Main.lstSelItem.Clear";
parent._main._lstselitem /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=1179681;
 //BA.debugLineNum = 1179681;BA.debugLine="SearchParentsTreeItem(tI)";
_searchparentstreeitem(_ti);
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=1179690;
 //BA.debugLineNum = 1179690;BA.debugLine="ContraerItemsChildren(tI)";
_contraeritemschildren(_ti);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=1179698;
 //BA.debugLineNum = 1179698;BA.debugLine="Dim tiMaxNivelExp As TreeItem=TreeItemMayorNivelE";
_timaxnivelexp = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_timaxnivelexp = _treeitemmayornivelexpandido(parent._treeviewmainmenu.getRoot());
RDebugUtils.currentLine=1179699;
 //BA.debugLineNum = 1179699;BA.debugLine="CrearAccesosDirectosItem3(tiMaxNivelExp)";
_crearaccesosdirectositem3(_timaxnivelexp);
RDebugUtils.currentLine=1179700;
 //BA.debugLineNum = 1179700;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _treeviewmainmenu_expandedchanged(boolean _expanded) throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "treeviewmainmenu_expandedchanged", false))
	 {return ((String) Debug.delegate(ba, "treeviewmainmenu_expandedchanged", new Object[] {_expanded}));}
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _ti = null;
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub TreeViewMainMenu_ExpandedChanged(Expanded As B";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Dim ti As TreeItem=Sender";
_ti = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_ti = (anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper(), (javafx.scene.control.TreeItem)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="Log(ti.Text & \" \" & ti.Expanded)";
anywheresoftware.b4a.keywords.Common.LogImpl("81572866",_ti.getText()+" "+BA.ObjectToString(_ti.getExpanded()),0);
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="End Sub";
return "";
}
public static void  _treeviewmainmenu_selecteditemchanged(anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _selecteditem) throws Exception{
RDebugUtils.currentModule="mainmenu2";
if (Debug.shouldDelegate(ba, "treeviewmainmenu_selecteditemchanged", false))
	 {Debug.delegate(ba, "treeviewmainmenu_selecteditemchanged", new Object[] {_selecteditem}); return;}
ResumableSub_TreeViewMainMenu_SelectedItemChanged rsub = new ResumableSub_TreeViewMainMenu_SelectedItemChanged(null,_selecteditem);
rsub.resume(ba, null);
}
public static class ResumableSub_TreeViewMainMenu_SelectedItemChanged extends BA.ResumableSub {
public ResumableSub_TreeViewMainMenu_SelectedItemChanged(b4j.docU.mainmenu2 parent,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _selecteditem) {
this.parent = parent;
this._selecteditem = _selecteditem;
}
b4j.docU.mainmenu2 parent;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _selecteditem;
int _answ = 0;
b4j.docU.ccontroldocumentosnogestionados _ccdg = null;
b4j.docU.ccontroldocumentosperiodo _ccdp = null;
b4j.docU.cfasesdocumento _cfdoc = null;
Object _msa = null;
b4j.docU.cmarcaralbaranfisico _cdocfis = null;
b4j.docU.ccontrolosubspendientesnoconfeccion _ccosubspnc = null;
b4j.docU.cexpedicionessinentregartxt _cexpsine = null;
b4j.docU.cexpedicionesperiodotxt _cexpptxt = null;
b4j.docU.cexpedicionesnoentregadasdhl _cexpdhl = null;
b4j.docU.cinfoenviosperiodocorreosexpress2 _cexppcex = null;
b4j.docU.cinfoexpedicioncorreosexpress _cinfoexpedcorreosexp = null;
b4j.docU.cdocumentosnavexpedicion _cdocsexp = null;
String _sres = "";
String _permisomodulousuario = "";
b4j.docU.cseguimientofechasprometidascompra _csegfpc = null;
b4j.docU.cincidenciasproveedorlista _cincprov = null;
b4j.docU.cincidenciasproveedortareasabiertas _ctareasabiertasincprov = null;
b4j.docU.cevaluacionproveedores _cevalprov = null;
b4j.docU.cgestionventas _cgvtas = null;
b4j.docU.clistaanalisistarifasventa _clistaantarifasventa = null;
int _rint = 0;
b4j.docU.ctestsinfomagento _testsinfomagento = null;
b4j.docU.cb2blistapedidoscliente _b2blistapedcli = null;
b4j.docU.crepsol _cpedidosrepsol = null;
b4j.docU.crepsolinformacionlogisticaalbaran _repsolinformacionlogisticaalbaran = null;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa _generacionficheroscsvplantillapedidosventa = null;
b4j.docU.cinformesexpedicionesclientes _cinfexpedcliente = null;
String _sresp = "";
b4j.docU.canalisisdisponiblesalmacenarticulotalla _canalisisdispalmarttalla = null;
Object _robj = null;
b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables _canalisisdisparttallaalmacenescomputables = null;
b4j.docU.cpermisosaplicacion _cpermapl = null;
b4j.docU.b4xlongtexttemplate _b4xlongmsg = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sba = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bok = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu2";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="If SelectedItem.IsInitialized=False Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (_selecteditem.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="Main.TreeItemMenuAbreForm=SelectedItem";
parent._main._treeitemmenuabreform /*anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper*/  = _selecteditem;
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="LogColor(\"SelectedItem \" & SelectedItem.Text,xui.";
anywheresoftware.b4a.keywords.Common.LogImpl("81310726","SelectedItem "+_selecteditem.getText(),parent._xui.Color_Blue);
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="Select SelectedItem.Text";
if (true) break;

case 7:
//select
this.state = 218;
switch (BA.switchObjectToInt(_selecteditem.getText(),"Salir de la aplicación","Documentos No Gestionados","Documentos Periodo","Fases Documento","Marcar Albarán Físico","OSUBs Pendientes No Confección","Expediciones Sin Entregar TXT","Expediciones Periodo TXT","Expediciones Sin Entregar DHL","Expediciones Periodo Correos Express","Info Expedición Correos Express","Documentos Expedición","Seguimiento Fechas Prometidas Pedidos Compra","Incidencias Proveedor","Tareas Pendientes Incidencias Proveedor","Evaluación Proveedores","Gestión Ventas","Análisis Tarifas Venta","Tests Info Magento","Pedidos Clientes","Importacion Pedidos EESS Repsol","Albaranes Venta Repsol","Generación Ficheros CSV Plantilla Pedidos Venta","Informes Expediciones Clientes","Reiniciar sincronización Docuware","Incidencias Proveedor Almacén","Análisis Disponibles Almacén Artículo Talla","Análisis Disponibles Artículo Talla Almacenes Computables","Crear Excel Links Ficheros Carpeta","Permisos Aplicacion","Acerca De")) {
case 0: {
this.state = 9;
if (true) break;
}
case 1: {
this.state = 15;
if (true) break;
}
case 2: {
this.state = 17;
if (true) break;
}
case 3: {
this.state = 19;
if (true) break;
}
case 4: {
this.state = 21;
if (true) break;
}
case 5: {
this.state = 23;
if (true) break;
}
case 6: {
this.state = 25;
if (true) break;
}
case 7: {
this.state = 27;
if (true) break;
}
case 8: {
this.state = 29;
if (true) break;
}
case 9: {
this.state = 31;
if (true) break;
}
case 10: {
this.state = 33;
if (true) break;
}
case 11: {
this.state = 35;
if (true) break;
}
case 12: {
this.state = 37;
if (true) break;
}
case 13: {
this.state = 51;
if (true) break;
}
case 14: {
this.state = 65;
if (true) break;
}
case 15: {
this.state = 67;
if (true) break;
}
case 16: {
this.state = 81;
if (true) break;
}
case 17: {
this.state = 89;
if (true) break;
}
case 18: {
this.state = 97;
if (true) break;
}
case 19: {
this.state = 111;
if (true) break;
}
case 20: {
this.state = 119;
if (true) break;
}
case 21: {
this.state = 127;
if (true) break;
}
case 22: {
this.state = 135;
if (true) break;
}
case 23: {
this.state = 143;
if (true) break;
}
case 24: {
this.state = 151;
if (true) break;
}
case 25: {
this.state = 177;
if (true) break;
}
case 26: {
this.state = 191;
if (true) break;
}
case 27: {
this.state = 199;
if (true) break;
}
case 28: {
this.state = 207;
if (true) break;
}
case 29: {
this.state = 209;
if (true) break;
}
case 30: {
this.state = 211;
if (true) break;
}
default: {
this.state = 213;
if (true) break;
}
}
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="Dim answ As Int";
_answ = 0;
RDebugUtils.currentLine=1310733;
 //BA.debugLineNum = 1310733;BA.debugLine="answ=Main.fx.Msgbox2(frm,\"¿Salir de la aplicaci";
_answ = parent._main._fx /*anywheresoftware.b4j.objects.JFX*/ .Msgbox2(parent._frm,"¿Salir de la aplicación?","Salir","Sí","","No",parent._main._fx /*anywheresoftware.b4j.objects.JFX*/ .MSGBOX_CONFIRMATION);
RDebugUtils.currentLine=1310734;
 //BA.debugLineNum = 1310734;BA.debugLine="If answ=Main.fx.DialogResponse.POSITIVE Then";
if (true) break;

case 10:
//if
this.state = 13;
if (_answ==parent._main._fx /*anywheresoftware.b4j.objects.JFX*/ .DialogResponse.POSITIVE) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=1310737;
 //BA.debugLineNum = 1310737;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 if (true) break;

case 13:
//C
this.state = 218;
;
 if (true) break;

case 15:
//C
this.state = 218;
RDebugUtils.currentLine=1310757;
 //BA.debugLineNum = 1310757;BA.debugLine="Dim cCDG As cControlDocumentosNoGestionados";
_ccdg = new b4j.docU.ccontroldocumentosnogestionados();
RDebugUtils.currentLine=1310758;
 //BA.debugLineNum = 1310758;BA.debugLine="cCDG.Initialize";
_ccdg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1310759;
 //BA.debugLineNum = 1310759;BA.debugLine="cCDG.Show";
_ccdg._show /*void*/ (null);
RDebugUtils.currentLine=1310760;
 //BA.debugLineNum = 1310760;BA.debugLine="frm.Close";
parent._frm.Close();
 if (true) break;

case 17:
//C
this.state = 218;
RDebugUtils.currentLine=1310763;
 //BA.debugLineNum = 1310763;BA.debugLine="Dim cCDP As cControlDocumentosPeriodo";
_ccdp = new b4j.docU.ccontroldocumentosperiodo();
RDebugUtils.currentLine=1310764;
 //BA.debugLineNum = 1310764;BA.debugLine="cCDP.Initialize";
_ccdp._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1310765;
 //BA.debugLineNum = 1310765;BA.debugLine="cCDP.Show";
_ccdp._show /*void*/ (null);
RDebugUtils.currentLine=1310766;
 //BA.debugLineNum = 1310766;BA.debugLine="frm.Close";
parent._frm.Close();
 if (true) break;

case 19:
//C
this.state = 218;
RDebugUtils.currentLine=1310769;
 //BA.debugLineNum = 1310769;BA.debugLine="Dim cFDoc As cFasesDocumento";
_cfdoc = new b4j.docU.cfasesdocumento();
RDebugUtils.currentLine=1310770;
 //BA.debugLineNum = 1310770;BA.debugLine="cFDoc.Initialize(Me, frm.RootPane,\"\")";
_cfdoc._initialize /*String*/ (null,ba,mainmenu2.getObject(),(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._frm.getRootPane().getObject())),"");
RDebugUtils.currentLine=1310771;
 //BA.debugLineNum = 1310771;BA.debugLine="cFDoc.Show";
_cfdoc._show /*void*/ (null);
 if (true) break;

case 21:
//C
this.state = 218;
RDebugUtils.currentLine=1310775;
 //BA.debugLineNum = 1310775;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"pendiente de";
_msa = parent._xui.MsgboxAsync(ba,"pendiente de programar...","Aviso");
RDebugUtils.currentLine=1310776;
 //BA.debugLineNum = 1310776;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 219;
return;
case 219:
//C
this.state = 218;
;
RDebugUtils.currentLine=1310777;
 //BA.debugLineNum = 1310777;BA.debugLine="Return";
if (true) return ;
RDebugUtils.currentLine=1310779;
 //BA.debugLineNum = 1310779;BA.debugLine="Dim cDocFis As cMarcarAlbaranFisico";
_cdocfis = new b4j.docU.cmarcaralbaranfisico();
RDebugUtils.currentLine=1310780;
 //BA.debugLineNum = 1310780;BA.debugLine="cDocFis.Initialize";
_cdocfis._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1310781;
 //BA.debugLineNum = 1310781;BA.debugLine="cDocFis.Show";
_cdocfis._show /*void*/ (null);
RDebugUtils.currentLine=1310782;
 //BA.debugLineNum = 1310782;BA.debugLine="frm.Close";
parent._frm.Close();
 if (true) break;

case 23:
//C
this.state = 218;
RDebugUtils.currentLine=1310785;
 //BA.debugLineNum = 1310785;BA.debugLine="Dim cCOSUBsPNC As cControlOSUBsPendientesNoConf";
_ccosubspnc = new b4j.docU.ccontrolosubspendientesnoconfeccion();
RDebugUtils.currentLine=1310786;
 //BA.debugLineNum = 1310786;BA.debugLine="cCOSUBsPNC.Initialize";
_ccosubspnc._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1310787;
 //BA.debugLineNum = 1310787;BA.debugLine="cCOSUBsPNC.Show";
_ccosubspnc._show /*void*/ (null);
RDebugUtils.currentLine=1310788;
 //BA.debugLineNum = 1310788;BA.debugLine="frm.Close";
parent._frm.Close();
 if (true) break;

case 25:
//C
this.state = 218;
RDebugUtils.currentLine=1310791;
 //BA.debugLineNum = 1310791;BA.debugLine="Dim cExpSinE As cExpedicionesSinEntregarTXT";
_cexpsine = new b4j.docU.cexpedicionessinentregartxt();
RDebugUtils.currentLine=1310792;
 //BA.debugLineNum = 1310792;BA.debugLine="cExpSinE.Initialize";
_cexpsine._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1310793;
 //BA.debugLineNum = 1310793;BA.debugLine="cExpSinE.Show";
_cexpsine._show /*void*/ (null);
RDebugUtils.currentLine=1310794;
 //BA.debugLineNum = 1310794;BA.debugLine="frm.Close";
parent._frm.Close();
 if (true) break;

case 27:
//C
this.state = 218;
RDebugUtils.currentLine=1310797;
 //BA.debugLineNum = 1310797;BA.debugLine="Dim cExpPTXT As cExpedicionesPeriodoTXT";
_cexpptxt = new b4j.docU.cexpedicionesperiodotxt();
RDebugUtils.currentLine=1310798;
 //BA.debugLineNum = 1310798;BA.debugLine="cExpPTXT.Initialize";
_cexpptxt._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1310799;
 //BA.debugLineNum = 1310799;BA.debugLine="cExpPTXT.Show";
_cexpptxt._show /*void*/ (null);
RDebugUtils.currentLine=1310800;
 //BA.debugLineNum = 1310800;BA.debugLine="frm.Close";
parent._frm.Close();
 if (true) break;

case 29:
//C
this.state = 218;
RDebugUtils.currentLine=1310807;
 //BA.debugLineNum = 1310807;BA.debugLine="Dim cExpDHL As cExpedicionesNoEntregadasDHL";
_cexpdhl = new b4j.docU.cexpedicionesnoentregadasdhl();
RDebugUtils.currentLine=1310808;
 //BA.debugLineNum = 1310808;BA.debugLine="cExpDHL.Initialize";
_cexpdhl._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1310809;
 //BA.debugLineNum = 1310809;BA.debugLine="cExpDHL.Show";
_cexpdhl._show /*void*/ (null);
RDebugUtils.currentLine=1310810;
 //BA.debugLineNum = 1310810;BA.debugLine="frm.Close";
parent._frm.Close();
 if (true) break;

case 31:
//C
this.state = 218;
RDebugUtils.currentLine=1310814;
 //BA.debugLineNum = 1310814;BA.debugLine="Dim cExpPCEx As cInfoEnviosPeriodoCorreosExpress";
_cexppcex = new b4j.docU.cinfoenviosperiodocorreosexpress2();
RDebugUtils.currentLine=1310815;
 //BA.debugLineNum = 1310815;BA.debugLine="cExpPCEx.Initialize";
_cexppcex._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1310816;
 //BA.debugLineNum = 1310816;BA.debugLine="cExpPCEx.Show";
_cexppcex._show /*void*/ (null);
RDebugUtils.currentLine=1310817;
 //BA.debugLineNum = 1310817;BA.debugLine="frm.Close";
parent._frm.Close();
 if (true) break;

case 33:
//C
this.state = 218;
RDebugUtils.currentLine=1310821;
 //BA.debugLineNum = 1310821;BA.debugLine="Dim cInfoExpedCorreosExp As cInfoExpedicionCorr";
_cinfoexpedcorreosexp = new b4j.docU.cinfoexpedicioncorreosexpress();
RDebugUtils.currentLine=1310822;
 //BA.debugLineNum = 1310822;BA.debugLine="cInfoExpedCorreosExp.Initialize(\"\")";
_cinfoexpedcorreosexp._initialize /*String*/ (null,ba,"");
RDebugUtils.currentLine=1310823;
 //BA.debugLineNum = 1310823;BA.debugLine="cInfoExpedCorreosExp.Show";
_cinfoexpedcorreosexp._show /*void*/ (null);
 if (true) break;

case 35:
//C
this.state = 218;
RDebugUtils.currentLine=1310827;
 //BA.debugLineNum = 1310827;BA.debugLine="Dim cDocsExp As cDocumentosNAVExpedicion";
_cdocsexp = new b4j.docU.cdocumentosnavexpedicion();
RDebugUtils.currentLine=1310828;
 //BA.debugLineNum = 1310828;BA.debugLine="cDocsExp.Initialize";
_cdocsexp._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1310829;
 //BA.debugLineNum = 1310829;BA.debugLine="cDocsExp.Show";
_cdocsexp._show /*String*/ (null);
RDebugUtils.currentLine=1310830;
 //BA.debugLineNum = 1310830;BA.debugLine="frm.Close";
parent._frm.Close();
 if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=1310834;
 //BA.debugLineNum = 1310834;BA.debugLine="Wait For(cmPermisos.PermisosAplicacionUsuarioOb";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._cmpermisos._permisosaplicacionusuarioobjetopermiso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"PermisosAplicacion",parent._main._nombreaplicacion /*String*/ ,parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ,"cSeguimientoFechasPrometidasCompra"));
this.state = 220;
return;
case 220:
//C
this.state = 38;
_sres = (String) result[0];
;
RDebugUtils.currentLine=1310835;
 //BA.debugLineNum = 1310835;BA.debugLine="Select Case sRes";
if (true) break;

case 38:
//select
this.state = 49;
switch (BA.switchObjectToInt(_sres,"ErrConn","SinPermiso","ERROR","DENIED")) {
case 0: {
this.state = 40;
if (true) break;
}
case 1: {
this.state = 42;
if (true) break;
}
case 2: {
this.state = 44;
if (true) break;
}
case 3: {
this.state = 46;
if (true) break;
}
default: {
this.state = 48;
if (true) break;
}
}
if (true) break;

case 40:
//C
this.state = 49;
RDebugUtils.currentLine=1310837;
 //BA.debugLineNum = 1310837;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de c";
_msa = parent._xui.MsgboxAsync(ba,"Error de conexion servidor/query.","Error");
RDebugUtils.currentLine=1310838;
 //BA.debugLineNum = 1310838;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 221;
return;
case 221:
//C
this.state = 49;
;
RDebugUtils.currentLine=1310839;
 //BA.debugLineNum = 1310839;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 42:
//C
this.state = 49;
RDebugUtils.currentLine=1310841;
 //BA.debugLineNum = 1310841;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes";
_msa = parent._xui.MsgboxAsync(ba,"No tienes permiso para acceder a este módulo.","Aviso");
RDebugUtils.currentLine=1310842;
 //BA.debugLineNum = 1310842;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 222;
return;
case 222:
//C
this.state = 49;
;
RDebugUtils.currentLine=1310843;
 //BA.debugLineNum = 1310843;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 44:
//C
this.state = 49;
RDebugUtils.currentLine=1310845;
 //BA.debugLineNum = 1310845;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sRes,\"Error";
_msa = parent._xui.MsgboxAsync(ba,_sres,"Error");
RDebugUtils.currentLine=1310846;
 //BA.debugLineNum = 1310846;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 223;
return;
case 223:
//C
this.state = 49;
;
RDebugUtils.currentLine=1310847;
 //BA.debugLineNum = 1310847;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 46:
//C
this.state = 49;
RDebugUtils.currentLine=1310849;
 //BA.debugLineNum = 1310849;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes";
_msa = parent._xui.MsgboxAsync(ba,"No tienes permiso para acceder a este módulo.","Aviso");
RDebugUtils.currentLine=1310850;
 //BA.debugLineNum = 1310850;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 224;
return;
case 224:
//C
this.state = 49;
;
RDebugUtils.currentLine=1310851;
 //BA.debugLineNum = 1310851;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=1310853;
 //BA.debugLineNum = 1310853;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
_permisomodulousuario = _sres;
 if (true) break;

case 49:
//C
this.state = 218;
;
RDebugUtils.currentLine=1310857;
 //BA.debugLineNum = 1310857;BA.debugLine="Dim cSegFPC As cSeguimientoFechasPrometidasComp";
_csegfpc = new b4j.docU.cseguimientofechasprometidascompra();
RDebugUtils.currentLine=1310858;
 //BA.debugLineNum = 1310858;BA.debugLine="cSegFPC.Initialize";
_csegfpc._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1310859;
 //BA.debugLineNum = 1310859;BA.debugLine="cSegFPC.PermisoUsuarioModulo=PermisoModuloUsuar";
_csegfpc._permisousuariomodulo /*String*/  = _permisomodulousuario;
RDebugUtils.currentLine=1310860;
 //BA.debugLineNum = 1310860;BA.debugLine="cSegFPC.Show";
_csegfpc._show /*void*/ (null);
RDebugUtils.currentLine=1310861;
 //BA.debugLineNum = 1310861;BA.debugLine="frm.Close";
parent._frm.Close();
 if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=1310864;
 //BA.debugLineNum = 1310864;BA.debugLine="Wait For(cmPermisos.PermisosAplicacionUsuarioOb";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._cmpermisos._permisosaplicacionusuarioobjetopermiso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"PermisosAplicacion",parent._main._nombreaplicacion /*String*/ ,parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ,"IncidenciasProveedorCompras"));
this.state = 225;
return;
case 225:
//C
this.state = 52;
_sres = (String) result[0];
;
RDebugUtils.currentLine=1310865;
 //BA.debugLineNum = 1310865;BA.debugLine="Select Case sRes";
if (true) break;

case 52:
//select
this.state = 63;
switch (BA.switchObjectToInt(_sres,"ErrConn","SinPermiso","ERROR","DENIED")) {
case 0: {
this.state = 54;
if (true) break;
}
case 1: {
this.state = 56;
if (true) break;
}
case 2: {
this.state = 58;
if (true) break;
}
case 3: {
this.state = 60;
if (true) break;
}
default: {
this.state = 62;
if (true) break;
}
}
if (true) break;

case 54:
//C
this.state = 63;
RDebugUtils.currentLine=1310867;
 //BA.debugLineNum = 1310867;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de c";
_msa = parent._xui.MsgboxAsync(ba,"Error de conexion servidor/query.","Error");
RDebugUtils.currentLine=1310868;
 //BA.debugLineNum = 1310868;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 226;
return;
case 226:
//C
this.state = 63;
;
RDebugUtils.currentLine=1310869;
 //BA.debugLineNum = 1310869;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 56:
//C
this.state = 63;
RDebugUtils.currentLine=1310871;
 //BA.debugLineNum = 1310871;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes";
_msa = parent._xui.MsgboxAsync(ba,"No tienes permiso para acceder a este módulo.","Aviso");
RDebugUtils.currentLine=1310872;
 //BA.debugLineNum = 1310872;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 227;
return;
case 227:
//C
this.state = 63;
;
RDebugUtils.currentLine=1310873;
 //BA.debugLineNum = 1310873;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 58:
//C
this.state = 63;
RDebugUtils.currentLine=1310875;
 //BA.debugLineNum = 1310875;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sRes,\"Error";
_msa = parent._xui.MsgboxAsync(ba,_sres,"Error");
RDebugUtils.currentLine=1310876;
 //BA.debugLineNum = 1310876;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 228;
return;
case 228:
//C
this.state = 63;
;
RDebugUtils.currentLine=1310877;
 //BA.debugLineNum = 1310877;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 60:
//C
this.state = 63;
RDebugUtils.currentLine=1310879;
 //BA.debugLineNum = 1310879;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes";
_msa = parent._xui.MsgboxAsync(ba,"No tienes permiso para acceder a este módulo.","Aviso");
RDebugUtils.currentLine=1310880;
 //BA.debugLineNum = 1310880;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 229;
return;
case 229:
//C
this.state = 63;
;
RDebugUtils.currentLine=1310881;
 //BA.debugLineNum = 1310881;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 62:
//C
this.state = 63;
RDebugUtils.currentLine=1310883;
 //BA.debugLineNum = 1310883;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
_permisomodulousuario = _sres;
 if (true) break;

case 63:
//C
this.state = 218;
;
RDebugUtils.currentLine=1310886;
 //BA.debugLineNum = 1310886;BA.debugLine="Dim cIncProv As cIncidenciasProveedorLista";
_cincprov = new b4j.docU.cincidenciasproveedorlista();
RDebugUtils.currentLine=1310887;
 //BA.debugLineNum = 1310887;BA.debugLine="cIncProv.Initialize";
_cincprov._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1310888;
 //BA.debugLineNum = 1310888;BA.debugLine="cIncProv.DepartamentoEmisor=\"COMPRAS\"";
_cincprov._departamentoemisor /*String*/  = "COMPRAS";
RDebugUtils.currentLine=1310889;
 //BA.debugLineNum = 1310889;BA.debugLine="cIncProv.Show";
_cincprov._show /*void*/ (null);
RDebugUtils.currentLine=1310890;
 //BA.debugLineNum = 1310890;BA.debugLine="frm.Close";
parent._frm.Close();
 if (true) break;

case 65:
//C
this.state = 218;
RDebugUtils.currentLine=1310893;
 //BA.debugLineNum = 1310893;BA.debugLine="Dim cTareasAbiertasIncProv As cIncidenciasProve";
_ctareasabiertasincprov = new b4j.docU.cincidenciasproveedortareasabiertas();
RDebugUtils.currentLine=1310894;
 //BA.debugLineNum = 1310894;BA.debugLine="cTareasAbiertasIncProv.Initialize";
_ctareasabiertasincprov._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1310895;
 //BA.debugLineNum = 1310895;BA.debugLine="cTareasAbiertasIncProv.Show";
_ctareasabiertasincprov._show /*void*/ (null);
RDebugUtils.currentLine=1310896;
 //BA.debugLineNum = 1310896;BA.debugLine="frm.Close";
parent._frm.Close();
 if (true) break;

case 67:
//C
this.state = 68;
RDebugUtils.currentLine=1310899;
 //BA.debugLineNum = 1310899;BA.debugLine="Wait For(cmPermisos.PermisosAplicacionUsuarioOb";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._cmpermisos._permisosaplicacionusuarioobjetopermiso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"PermisosAplicacion",parent._main._nombreaplicacion /*String*/ ,parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ,"EvaluacionProveedores"));
this.state = 230;
return;
case 230:
//C
this.state = 68;
_sres = (String) result[0];
;
RDebugUtils.currentLine=1310900;
 //BA.debugLineNum = 1310900;BA.debugLine="Select Case sRes";
if (true) break;

case 68:
//select
this.state = 79;
switch (BA.switchObjectToInt(_sres,"ErrConn","SinPermiso","ERROR","DENIED")) {
case 0: {
this.state = 70;
if (true) break;
}
case 1: {
this.state = 72;
if (true) break;
}
case 2: {
this.state = 74;
if (true) break;
}
case 3: {
this.state = 76;
if (true) break;
}
default: {
this.state = 78;
if (true) break;
}
}
if (true) break;

case 70:
//C
this.state = 79;
RDebugUtils.currentLine=1310902;
 //BA.debugLineNum = 1310902;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de c";
_msa = parent._xui.MsgboxAsync(ba,"Error de conexion servidor/query.","Error");
RDebugUtils.currentLine=1310903;
 //BA.debugLineNum = 1310903;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 231;
return;
case 231:
//C
this.state = 79;
;
RDebugUtils.currentLine=1310904;
 //BA.debugLineNum = 1310904;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 72:
//C
this.state = 79;
RDebugUtils.currentLine=1310906;
 //BA.debugLineNum = 1310906;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes";
_msa = parent._xui.MsgboxAsync(ba,"No tienes permiso para acceder a este módulo.","Aviso");
RDebugUtils.currentLine=1310907;
 //BA.debugLineNum = 1310907;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 232;
return;
case 232:
//C
this.state = 79;
;
RDebugUtils.currentLine=1310908;
 //BA.debugLineNum = 1310908;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 74:
//C
this.state = 79;
RDebugUtils.currentLine=1310910;
 //BA.debugLineNum = 1310910;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sRes,\"Error";
_msa = parent._xui.MsgboxAsync(ba,_sres,"Error");
RDebugUtils.currentLine=1310911;
 //BA.debugLineNum = 1310911;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 233;
return;
case 233:
//C
this.state = 79;
;
RDebugUtils.currentLine=1310912;
 //BA.debugLineNum = 1310912;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 76:
//C
this.state = 79;
RDebugUtils.currentLine=1310914;
 //BA.debugLineNum = 1310914;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes";
_msa = parent._xui.MsgboxAsync(ba,"No tienes permiso para acceder a este módulo.","Aviso");
RDebugUtils.currentLine=1310915;
 //BA.debugLineNum = 1310915;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 234;
return;
case 234:
//C
this.state = 79;
;
RDebugUtils.currentLine=1310916;
 //BA.debugLineNum = 1310916;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 78:
//C
this.state = 79;
RDebugUtils.currentLine=1310918;
 //BA.debugLineNum = 1310918;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
_permisomodulousuario = _sres;
 if (true) break;

case 79:
//C
this.state = 218;
;
RDebugUtils.currentLine=1310921;
 //BA.debugLineNum = 1310921;BA.debugLine="Dim cEvalProv As cEvaluacionProveedores";
_cevalprov = new b4j.docU.cevaluacionproveedores();
RDebugUtils.currentLine=1310922;
 //BA.debugLineNum = 1310922;BA.debugLine="cEvalProv.Initialize";
_cevalprov._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1310923;
 //BA.debugLineNum = 1310923;BA.debugLine="cEvalProv.Show";
_cevalprov._show /*void*/ (null);
RDebugUtils.currentLine=1310924;
 //BA.debugLineNum = 1310924;BA.debugLine="frm.Close";
parent._frm.Close();
 if (true) break;

case 81:
//C
this.state = 82;
RDebugUtils.currentLine=1310951;
 //BA.debugLineNum = 1310951;BA.debugLine="jamLoadingIndicator1.show";
parent._jamloadingindicator1._show /*String*/ (null);
RDebugUtils.currentLine=1310952;
 //BA.debugLineNum = 1310952;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsua";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._utilidades._checkpermisosaplicacionusuarioobjetopermiso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"PermisosAplicacion",parent._main._nombreaplicacion /*String*/ ,parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ,"cGestionVentas"));
this.state = 235;
return;
case 235:
//C
this.state = 82;
_sres = (String) result[0];
;
RDebugUtils.currentLine=1310953;
 //BA.debugLineNum = 1310953;BA.debugLine="jamLoadingIndicator1.Close";
parent._jamloadingindicator1._close /*String*/ (null);
RDebugUtils.currentLine=1310954;
 //BA.debugLineNum = 1310954;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\" T";
if (true) break;

case 82:
//if
this.state = 87;
if ((_sres).equals("NO") || (_sres).equals("ERROR") || (_sres).equals("DENIED")) { 
this.state = 84;
;}if (true) break;

case 84:
//C
this.state = 87;
if (true) return ;
if (true) break;

case 87:
//C
this.state = 218;
;
RDebugUtils.currentLine=1310955;
 //BA.debugLineNum = 1310955;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
_permisomodulousuario = _sres;
RDebugUtils.currentLine=1310957;
 //BA.debugLineNum = 1310957;BA.debugLine="Dim cGVtas As cGestionVentas";
_cgvtas = new b4j.docU.cgestionventas();
RDebugUtils.currentLine=1310958;
 //BA.debugLineNum = 1310958;BA.debugLine="cGVtas.Initialize";
_cgvtas._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1310959;
 //BA.debugLineNum = 1310959;BA.debugLine="cGVtas.PermisoModuloUsuario=PermisoModuloUsuari";
_cgvtas._permisomodulousuario /*String*/  = _permisomodulousuario;
RDebugUtils.currentLine=1310960;
 //BA.debugLineNum = 1310960;BA.debugLine="cGVtas.Show";
_cgvtas._show /*void*/ (null);
RDebugUtils.currentLine=1310961;
 //BA.debugLineNum = 1310961;BA.debugLine="frm.Close";
parent._frm.Close();
 if (true) break;

case 89:
//C
this.state = 90;
RDebugUtils.currentLine=1310987;
 //BA.debugLineNum = 1310987;BA.debugLine="jamLoadingIndicator1.show";
parent._jamloadingindicator1._show /*String*/ (null);
RDebugUtils.currentLine=1310988;
 //BA.debugLineNum = 1310988;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsua";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._utilidades._checkpermisosaplicacionusuarioobjetopermiso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"PermisosAplicacion",parent._main._nombreaplicacion /*String*/ ,parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ,"cAnalisisTarifasVenta"));
this.state = 236;
return;
case 236:
//C
this.state = 90;
_sres = (String) result[0];
;
RDebugUtils.currentLine=1310989;
 //BA.debugLineNum = 1310989;BA.debugLine="jamLoadingIndicator1.Close";
parent._jamloadingindicator1._close /*String*/ (null);
RDebugUtils.currentLine=1310990;
 //BA.debugLineNum = 1310990;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\" T";
if (true) break;

case 90:
//if
this.state = 95;
if ((_sres).equals("NO") || (_sres).equals("ERROR") || (_sres).equals("DENIED")) { 
this.state = 92;
;}if (true) break;

case 92:
//C
this.state = 95;
if (true) return ;
if (true) break;

case 95:
//C
this.state = 218;
;
RDebugUtils.currentLine=1310991;
 //BA.debugLineNum = 1310991;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
_permisomodulousuario = _sres;
RDebugUtils.currentLine=1310996;
 //BA.debugLineNum = 1310996;BA.debugLine="Dim cListaAnTarifasVenta As cListaAnalisisTarif";
_clistaantarifasventa = new b4j.docU.clistaanalisistarifasventa();
RDebugUtils.currentLine=1310997;
 //BA.debugLineNum = 1310997;BA.debugLine="cListaAnTarifasVenta.Initialize";
_clistaantarifasventa._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1310998;
 //BA.debugLineNum = 1310998;BA.debugLine="cListaAnTarifasVenta.PermisoModuloUsuario=Permi";
_clistaantarifasventa._permisomodulousuario /*String*/  = _permisomodulousuario;
RDebugUtils.currentLine=1310999;
 //BA.debugLineNum = 1310999;BA.debugLine="cListaAnTarifasVenta.Show";
_clistaantarifasventa._show /*void*/ (null);
RDebugUtils.currentLine=1311000;
 //BA.debugLineNum = 1311000;BA.debugLine="frm.Close";
parent._frm.Close();
 if (true) break;

case 97:
//C
this.state = 98;
RDebugUtils.currentLine=1311019;
 //BA.debugLineNum = 1311019;BA.debugLine="jamLoadingIndicator1.show";
parent._jamloadingindicator1._show /*String*/ (null);
RDebugUtils.currentLine=1311020;
 //BA.debugLineNum = 1311020;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsua";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._utilidades._checkpermisosaplicacionusuarioobjetopermiso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"PermisosAplicacion",parent._main._nombreaplicacion /*String*/ ,parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ,"cB2B"));
this.state = 237;
return;
case 237:
//C
this.state = 98;
_sres = (String) result[0];
;
RDebugUtils.currentLine=1311021;
 //BA.debugLineNum = 1311021;BA.debugLine="jamLoadingIndicator1.Close";
parent._jamloadingindicator1._close /*String*/ (null);
RDebugUtils.currentLine=1311022;
 //BA.debugLineNum = 1311022;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\" T";
if (true) break;

case 98:
//if
this.state = 103;
if ((_sres).equals("NO") || (_sres).equals("ERROR") || (_sres).equals("DENIED")) { 
this.state = 100;
;}if (true) break;

case 100:
//C
this.state = 103;
if (true) return ;
if (true) break;

case 103:
//C
this.state = 104;
;
RDebugUtils.currentLine=1311023;
 //BA.debugLineNum = 1311023;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
_permisomodulousuario = _sres;
RDebugUtils.currentLine=1311025;
 //BA.debugLineNum = 1311025;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Aviso\",\"Módulo";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._utilidades._msgbox2xui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","Módulo en pruebas. No utilizar. ¿Continuar?","Sí","Cancelar","",(anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null))));
this.state = 238;
return;
case 238:
//C
this.state = 104;
_rint = (int) result[0];
;
RDebugUtils.currentLine=1311026;
 //BA.debugLineNum = 1311026;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
if (true) break;

case 104:
//if
this.state = 109;
if (_rint!=parent._xui.DialogResponse_Positive) { 
this.state = 106;
;}if (true) break;

case 106:
//C
this.state = 109;
if (true) return ;
if (true) break;

case 109:
//C
this.state = 218;
;
RDebugUtils.currentLine=1311028;
 //BA.debugLineNum = 1311028;BA.debugLine="Dim TestsInfoMagento As cTestsInfoMagento";
_testsinfomagento = new b4j.docU.ctestsinfomagento();
RDebugUtils.currentLine=1311029;
 //BA.debugLineNum = 1311029;BA.debugLine="TestsInfoMagento.Initialize";
_testsinfomagento._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1311030;
 //BA.debugLineNum = 1311030;BA.debugLine="TestsInfoMagento.PermisoModuloUsuario=PermisoMo";
_testsinfomagento._permisomodulousuario /*String*/  = _permisomodulousuario;
RDebugUtils.currentLine=1311031;
 //BA.debugLineNum = 1311031;BA.debugLine="TestsInfoMagento.Show";
_testsinfomagento._show /*void*/ (null);
RDebugUtils.currentLine=1311032;
 //BA.debugLineNum = 1311032;BA.debugLine="frm.Close";
parent._frm.Close();
 if (true) break;

case 111:
//C
this.state = 112;
RDebugUtils.currentLine=1311035;
 //BA.debugLineNum = 1311035;BA.debugLine="jamLoadingIndicator1.show";
parent._jamloadingindicator1._show /*String*/ (null);
RDebugUtils.currentLine=1311036;
 //BA.debugLineNum = 1311036;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsua";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._utilidades._checkpermisosaplicacionusuarioobjetopermiso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"PermisosAplicacion",parent._main._nombreaplicacion /*String*/ ,parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ,"cB2B"));
this.state = 239;
return;
case 239:
//C
this.state = 112;
_sres = (String) result[0];
;
RDebugUtils.currentLine=1311037;
 //BA.debugLineNum = 1311037;BA.debugLine="jamLoadingIndicator1.Close";
parent._jamloadingindicator1._close /*String*/ (null);
RDebugUtils.currentLine=1311038;
 //BA.debugLineNum = 1311038;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\" T";
if (true) break;

case 112:
//if
this.state = 117;
if ((_sres).equals("NO") || (_sres).equals("ERROR") || (_sres).equals("DENIED")) { 
this.state = 114;
;}if (true) break;

case 114:
//C
this.state = 117;
if (true) return ;
if (true) break;

case 117:
//C
this.state = 218;
;
RDebugUtils.currentLine=1311039;
 //BA.debugLineNum = 1311039;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
_permisomodulousuario = _sres;
RDebugUtils.currentLine=1311041;
 //BA.debugLineNum = 1311041;BA.debugLine="Dim B2BListaPedCli As cB2BListaPedidosCliente";
_b2blistapedcli = new b4j.docU.cb2blistapedidoscliente();
RDebugUtils.currentLine=1311042;
 //BA.debugLineNum = 1311042;BA.debugLine="B2BListaPedCli.Initialize";
_b2blistapedcli._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1311043;
 //BA.debugLineNum = 1311043;BA.debugLine="frm.Close";
parent._frm.Close();
 if (true) break;

case 119:
//C
this.state = 120;
RDebugUtils.currentLine=1311078;
 //BA.debugLineNum = 1311078;BA.debugLine="jamLoadingIndicator1.show";
parent._jamloadingindicator1._show /*String*/ (null);
RDebugUtils.currentLine=1311079;
 //BA.debugLineNum = 1311079;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsua";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._utilidades._checkpermisosaplicacionusuarioobjetopermiso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"PermisosAplicacion",parent._main._nombreaplicacion /*String*/ ,parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ,"cFTPRepsol"));
this.state = 240;
return;
case 240:
//C
this.state = 120;
_sres = (String) result[0];
;
RDebugUtils.currentLine=1311080;
 //BA.debugLineNum = 1311080;BA.debugLine="jamLoadingIndicator1.Close";
parent._jamloadingindicator1._close /*String*/ (null);
RDebugUtils.currentLine=1311081;
 //BA.debugLineNum = 1311081;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\" T";
if (true) break;

case 120:
//if
this.state = 125;
if ((_sres).equals("NO") || (_sres).equals("ERROR") || (_sres).equals("DENIED")) { 
this.state = 122;
;}if (true) break;

case 122:
//C
this.state = 125;
if (true) return ;
if (true) break;

case 125:
//C
this.state = 218;
;
RDebugUtils.currentLine=1311082;
 //BA.debugLineNum = 1311082;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
_permisomodulousuario = _sres;
RDebugUtils.currentLine=1311087;
 //BA.debugLineNum = 1311087;BA.debugLine="Dim cPedidosRepsol As cRepsol";
_cpedidosrepsol = new b4j.docU.crepsol();
RDebugUtils.currentLine=1311088;
 //BA.debugLineNum = 1311088;BA.debugLine="cPedidosRepsol.Initialize";
_cpedidosrepsol._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1311089;
 //BA.debugLineNum = 1311089;BA.debugLine="cPedidosRepsol.PermisoModuloUsuario=PermisoModu";
_cpedidosrepsol._permisomodulousuario /*String*/  = _permisomodulousuario;
RDebugUtils.currentLine=1311090;
 //BA.debugLineNum = 1311090;BA.debugLine="cPedidosRepsol.Show";
_cpedidosrepsol._show /*void*/ (null);
RDebugUtils.currentLine=1311091;
 //BA.debugLineNum = 1311091;BA.debugLine="frm.Close";
parent._frm.Close();
 if (true) break;

case 127:
//C
this.state = 128;
RDebugUtils.currentLine=1311099;
 //BA.debugLineNum = 1311099;BA.debugLine="jamLoadingIndicator1.show";
parent._jamloadingindicator1._show /*String*/ (null);
RDebugUtils.currentLine=1311100;
 //BA.debugLineNum = 1311100;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsua";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._utilidades._checkpermisosaplicacionusuarioobjetopermiso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"PermisosAplicacion",parent._main._nombreaplicacion /*String*/ ,parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ,"cRepsol"));
this.state = 241;
return;
case 241:
//C
this.state = 128;
_sres = (String) result[0];
;
RDebugUtils.currentLine=1311101;
 //BA.debugLineNum = 1311101;BA.debugLine="jamLoadingIndicator1.Close";
parent._jamloadingindicator1._close /*String*/ (null);
RDebugUtils.currentLine=1311102;
 //BA.debugLineNum = 1311102;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\" T";
if (true) break;

case 128:
//if
this.state = 133;
if ((_sres).equals("NO") || (_sres).equals("ERROR") || (_sres).equals("DENIED")) { 
this.state = 130;
;}if (true) break;

case 130:
//C
this.state = 133;
if (true) return ;
if (true) break;

case 133:
//C
this.state = 218;
;
RDebugUtils.currentLine=1311103;
 //BA.debugLineNum = 1311103;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
_permisomodulousuario = _sres;
RDebugUtils.currentLine=1311108;
 //BA.debugLineNum = 1311108;BA.debugLine="Dim RepsolInformacionLogisticaAlbaran As cRepso";
_repsolinformacionlogisticaalbaran = new b4j.docU.crepsolinformacionlogisticaalbaran();
RDebugUtils.currentLine=1311109;
 //BA.debugLineNum = 1311109;BA.debugLine="RepsolInformacionLogisticaAlbaran.Initialize";
_repsolinformacionlogisticaalbaran._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1311111;
 //BA.debugLineNum = 1311111;BA.debugLine="RepsolInformacionLogisticaAlbaran.Show";
_repsolinformacionlogisticaalbaran._show /*void*/ (null);
RDebugUtils.currentLine=1311112;
 //BA.debugLineNum = 1311112;BA.debugLine="frm.Close";
parent._frm.Close();
 if (true) break;

case 135:
//C
this.state = 136;
RDebugUtils.currentLine=1311115;
 //BA.debugLineNum = 1311115;BA.debugLine="jamLoadingIndicator1.show";
parent._jamloadingindicator1._show /*String*/ (null);
RDebugUtils.currentLine=1311116;
 //BA.debugLineNum = 1311116;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsua";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._utilidades._checkpermisosaplicacionusuarioobjetopermiso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"PermisosAplicacion",parent._main._nombreaplicacion /*String*/ ,parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ,"cGeneracionFicherosCSVPlantillaPedidosVenta"));
this.state = 242;
return;
case 242:
//C
this.state = 136;
_sres = (String) result[0];
;
RDebugUtils.currentLine=1311117;
 //BA.debugLineNum = 1311117;BA.debugLine="jamLoadingIndicator1.Close";
parent._jamloadingindicator1._close /*String*/ (null);
RDebugUtils.currentLine=1311118;
 //BA.debugLineNum = 1311118;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\" T";
if (true) break;

case 136:
//if
this.state = 141;
if ((_sres).equals("NO") || (_sres).equals("ERROR") || (_sres).equals("DENIED")) { 
this.state = 138;
;}if (true) break;

case 138:
//C
this.state = 141;
if (true) return ;
if (true) break;

case 141:
//C
this.state = 218;
;
RDebugUtils.currentLine=1311119;
 //BA.debugLineNum = 1311119;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
_permisomodulousuario = _sres;
RDebugUtils.currentLine=1311124;
 //BA.debugLineNum = 1311124;BA.debugLine="Dim GeneracionFicherosCSVPlantillaPedidosVenta";
_generacionficheroscsvplantillapedidosventa = new b4j.docU.cgeneracionficheroscsvplantillapedidosventa();
RDebugUtils.currentLine=1311125;
 //BA.debugLineNum = 1311125;BA.debugLine="GeneracionFicherosCSVPlantillaPedidosVenta.Init";
_generacionficheroscsvplantillapedidosventa._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1311127;
 //BA.debugLineNum = 1311127;BA.debugLine="GeneracionFicherosCSVPlantillaPedidosVenta.Show";
_generacionficheroscsvplantillapedidosventa._show /*void*/ (null);
RDebugUtils.currentLine=1311128;
 //BA.debugLineNum = 1311128;BA.debugLine="frm.Close";
parent._frm.Close();
 if (true) break;

case 143:
//C
this.state = 144;
RDebugUtils.currentLine=1311154;
 //BA.debugLineNum = 1311154;BA.debugLine="jamLoadingIndicator1.show";
parent._jamloadingindicator1._show /*String*/ (null);
RDebugUtils.currentLine=1311155;
 //BA.debugLineNum = 1311155;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsua";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._utilidades._checkpermisosaplicacionusuarioobjetopermiso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"PermisosAplicacion",parent._main._nombreaplicacion /*String*/ ,parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ,"cInformesExpedicionesClientes"));
this.state = 243;
return;
case 243:
//C
this.state = 144;
_sres = (String) result[0];
;
RDebugUtils.currentLine=1311156;
 //BA.debugLineNum = 1311156;BA.debugLine="jamLoadingIndicator1.Close";
parent._jamloadingindicator1._close /*String*/ (null);
RDebugUtils.currentLine=1311157;
 //BA.debugLineNum = 1311157;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\" T";
if (true) break;

case 144:
//if
this.state = 149;
if ((_sres).equals("NO") || (_sres).equals("ERROR") || (_sres).equals("DENIED")) { 
this.state = 146;
;}if (true) break;

case 146:
//C
this.state = 149;
if (true) return ;
if (true) break;

case 149:
//C
this.state = 218;
;
RDebugUtils.currentLine=1311158;
 //BA.debugLineNum = 1311158;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
_permisomodulousuario = _sres;
RDebugUtils.currentLine=1311160;
 //BA.debugLineNum = 1311160;BA.debugLine="Dim cInfExpedCliente As cInformesExpedicionesCl";
_cinfexpedcliente = new b4j.docU.cinformesexpedicionesclientes();
RDebugUtils.currentLine=1311161;
 //BA.debugLineNum = 1311161;BA.debugLine="cInfExpedCliente.Initialize";
_cinfexpedcliente._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1311163;
 //BA.debugLineNum = 1311163;BA.debugLine="cInfExpedCliente.Show";
_cinfexpedcliente._show /*void*/ (null);
RDebugUtils.currentLine=1311164;
 //BA.debugLineNum = 1311164;BA.debugLine="frm.Close";
parent._frm.Close();
 if (true) break;

case 151:
//C
this.state = 152;
RDebugUtils.currentLine=1311167;
 //BA.debugLineNum = 1311167;BA.debugLine="Wait For(cmPermisos.PermisosAplicacionUsuarioOb";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._cmpermisos._permisosaplicacionusuarioobjetopermiso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"PermisosAplicacion",parent._main._nombreaplicacion /*String*/ ,parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ,"ReiniciarSincronizacionDocuware"));
this.state = 244;
return;
case 244:
//C
this.state = 152;
_sres = (String) result[0];
;
RDebugUtils.currentLine=1311168;
 //BA.debugLineNum = 1311168;BA.debugLine="Select Case sRes";
if (true) break;

case 152:
//select
this.state = 163;
switch (BA.switchObjectToInt(_sres,"ErrConn","SinPermiso","ERROR","DENIED")) {
case 0: {
this.state = 154;
if (true) break;
}
case 1: {
this.state = 156;
if (true) break;
}
case 2: {
this.state = 158;
if (true) break;
}
case 3: {
this.state = 160;
if (true) break;
}
default: {
this.state = 162;
if (true) break;
}
}
if (true) break;

case 154:
//C
this.state = 163;
RDebugUtils.currentLine=1311170;
 //BA.debugLineNum = 1311170;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de c";
_msa = parent._xui.MsgboxAsync(ba,"Error de conexion servidor/query.","Error");
RDebugUtils.currentLine=1311171;
 //BA.debugLineNum = 1311171;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 245;
return;
case 245:
//C
this.state = 163;
;
RDebugUtils.currentLine=1311172;
 //BA.debugLineNum = 1311172;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 156:
//C
this.state = 163;
RDebugUtils.currentLine=1311174;
 //BA.debugLineNum = 1311174;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes";
_msa = parent._xui.MsgboxAsync(ba,"No tienes permiso para acceder a este módulo.","Aviso");
RDebugUtils.currentLine=1311175;
 //BA.debugLineNum = 1311175;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 246;
return;
case 246:
//C
this.state = 163;
;
RDebugUtils.currentLine=1311176;
 //BA.debugLineNum = 1311176;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 158:
//C
this.state = 163;
RDebugUtils.currentLine=1311178;
 //BA.debugLineNum = 1311178;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sRes,\"Error";
_msa = parent._xui.MsgboxAsync(ba,_sres,"Error");
RDebugUtils.currentLine=1311179;
 //BA.debugLineNum = 1311179;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 247;
return;
case 247:
//C
this.state = 163;
;
RDebugUtils.currentLine=1311180;
 //BA.debugLineNum = 1311180;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 160:
//C
this.state = 163;
RDebugUtils.currentLine=1311182;
 //BA.debugLineNum = 1311182;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes";
_msa = parent._xui.MsgboxAsync(ba,"No tienes permiso para acceder a este módulo.","Aviso");
RDebugUtils.currentLine=1311183;
 //BA.debugLineNum = 1311183;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 248;
return;
case 248:
//C
this.state = 163;
;
RDebugUtils.currentLine=1311184;
 //BA.debugLineNum = 1311184;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 162:
//C
this.state = 163;
RDebugUtils.currentLine=1311186;
 //BA.debugLineNum = 1311186;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
_permisomodulousuario = _sres;
 if (true) break;

case 163:
//C
this.state = 164;
;
RDebugUtils.currentLine=1311189;
 //BA.debugLineNum = 1311189;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",\"¿Rei";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._utilidades._msgbox2xui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Confirma","¿Reiniciar la sincronización con Docuware?","Sí","Cancelar","",(anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null))));
this.state = 249;
return;
case 249:
//C
this.state = 164;
_rint = (int) result[0];
;
RDebugUtils.currentLine=1311190;
 //BA.debugLineNum = 1311190;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
if (true) break;

case 164:
//if
this.state = 169;
if (_rint!=parent._xui.DialogResponse_Positive) { 
this.state = 166;
;}if (true) break;

case 166:
//C
this.state = 169;
if (true) return ;
if (true) break;

case 169:
//C
this.state = 170;
;
RDebugUtils.currentLine=1311192;
 //BA.debugLineNum = 1311192;BA.debugLine="Wait For(ReiniciarSincronizacionDocuware) compl";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _reiniciarsincronizaciondocuware());
this.state = 250;
return;
case 250:
//C
this.state = 170;
_sresp = (String) result[0];
;
RDebugUtils.currentLine=1311193;
 //BA.debugLineNum = 1311193;BA.debugLine="If sResp=\"OK\" Then";
if (true) break;

case 170:
//if
this.state = 175;
if ((_sresp).equals("OK")) { 
this.state = 172;
}else {
this.state = 174;
}if (true) break;

case 172:
//C
this.state = 175;
RDebugUtils.currentLine=1311194;
 //BA.debugLineNum = 1311194;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Envío petic";
_msa = parent._xui.MsgboxAsync(ba,"Envío petición reinicio sincronización Docuware, OK","Aviso");
RDebugUtils.currentLine=1311195;
 //BA.debugLineNum = 1311195;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 251;
return;
case 251:
//C
this.state = 175;
;
 if (true) break;

case 174:
//C
this.state = 175;
RDebugUtils.currentLine=1311197;
 //BA.debugLineNum = 1311197;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No ha sido";
_msa = parent._xui.MsgboxAsync(ba,("No ha sido posible enviar la petición de reinicio de la sincronización con Docuware.\n"+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sresp))+""),"Error");
RDebugUtils.currentLine=1311199;
 //BA.debugLineNum = 1311199;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 252;
return;
case 252:
//C
this.state = 175;
;
 if (true) break;

case 175:
//C
this.state = 218;
;
 if (true) break;

case 177:
//C
this.state = 178;
RDebugUtils.currentLine=1311204;
 //BA.debugLineNum = 1311204;BA.debugLine="Wait For(cmPermisos.PermisosAplicacionUsuarioOb";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._cmpermisos._permisosaplicacionusuarioobjetopermiso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"PermisosAplicacion",parent._main._nombreaplicacion /*String*/ ,parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ,"IncidenciasProveedorAlmacen"));
this.state = 253;
return;
case 253:
//C
this.state = 178;
_sres = (String) result[0];
;
RDebugUtils.currentLine=1311205;
 //BA.debugLineNum = 1311205;BA.debugLine="Select Case sRes";
if (true) break;

case 178:
//select
this.state = 189;
switch (BA.switchObjectToInt(_sres,"ErrConn","SinPermiso","ERROR","DENIED")) {
case 0: {
this.state = 180;
if (true) break;
}
case 1: {
this.state = 182;
if (true) break;
}
case 2: {
this.state = 184;
if (true) break;
}
case 3: {
this.state = 186;
if (true) break;
}
default: {
this.state = 188;
if (true) break;
}
}
if (true) break;

case 180:
//C
this.state = 189;
RDebugUtils.currentLine=1311207;
 //BA.debugLineNum = 1311207;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de c";
_msa = parent._xui.MsgboxAsync(ba,"Error de conexion servidor/query.","Error");
RDebugUtils.currentLine=1311208;
 //BA.debugLineNum = 1311208;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 254;
return;
case 254:
//C
this.state = 189;
;
RDebugUtils.currentLine=1311209;
 //BA.debugLineNum = 1311209;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 182:
//C
this.state = 189;
RDebugUtils.currentLine=1311211;
 //BA.debugLineNum = 1311211;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes";
_msa = parent._xui.MsgboxAsync(ba,"No tienes permiso para acceder a este módulo.","Aviso");
RDebugUtils.currentLine=1311212;
 //BA.debugLineNum = 1311212;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 255;
return;
case 255:
//C
this.state = 189;
;
RDebugUtils.currentLine=1311213;
 //BA.debugLineNum = 1311213;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 184:
//C
this.state = 189;
RDebugUtils.currentLine=1311215;
 //BA.debugLineNum = 1311215;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sRes,\"Error";
_msa = parent._xui.MsgboxAsync(ba,_sres,"Error");
RDebugUtils.currentLine=1311216;
 //BA.debugLineNum = 1311216;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 256;
return;
case 256:
//C
this.state = 189;
;
RDebugUtils.currentLine=1311217;
 //BA.debugLineNum = 1311217;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 186:
//C
this.state = 189;
RDebugUtils.currentLine=1311219;
 //BA.debugLineNum = 1311219;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes";
_msa = parent._xui.MsgboxAsync(ba,"No tienes permiso para acceder a este módulo.","Aviso");
RDebugUtils.currentLine=1311220;
 //BA.debugLineNum = 1311220;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 257;
return;
case 257:
//C
this.state = 189;
;
RDebugUtils.currentLine=1311221;
 //BA.debugLineNum = 1311221;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 188:
//C
this.state = 189;
RDebugUtils.currentLine=1311223;
 //BA.debugLineNum = 1311223;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
_permisomodulousuario = _sres;
 if (true) break;

case 189:
//C
this.state = 218;
;
RDebugUtils.currentLine=1311226;
 //BA.debugLineNum = 1311226;BA.debugLine="Dim cIncProv As cIncidenciasProveedorLista";
_cincprov = new b4j.docU.cincidenciasproveedorlista();
RDebugUtils.currentLine=1311227;
 //BA.debugLineNum = 1311227;BA.debugLine="cIncProv.Initialize";
_cincprov._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1311228;
 //BA.debugLineNum = 1311228;BA.debugLine="cIncProv.DepartamentoEmisor=\"ALMACEN\"";
_cincprov._departamentoemisor /*String*/  = "ALMACEN";
RDebugUtils.currentLine=1311229;
 //BA.debugLineNum = 1311229;BA.debugLine="cIncProv.Show";
_cincprov._show /*void*/ (null);
RDebugUtils.currentLine=1311230;
 //BA.debugLineNum = 1311230;BA.debugLine="frm.Close";
parent._frm.Close();
 if (true) break;

case 191:
//C
this.state = 192;
RDebugUtils.currentLine=1311255;
 //BA.debugLineNum = 1311255;BA.debugLine="jamLoadingIndicator1.show";
parent._jamloadingindicator1._show /*String*/ (null);
RDebugUtils.currentLine=1311256;
 //BA.debugLineNum = 1311256;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsua";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._utilidades._checkpermisosaplicacionusuarioobjetopermiso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"PermisosAplicacion",parent._main._nombreaplicacion /*String*/ ,parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ,"AnalisisDisponiblesAlmacenArticuloTalla"));
this.state = 258;
return;
case 258:
//C
this.state = 192;
_sres = (String) result[0];
;
RDebugUtils.currentLine=1311257;
 //BA.debugLineNum = 1311257;BA.debugLine="jamLoadingIndicator1.Close";
parent._jamloadingindicator1._close /*String*/ (null);
RDebugUtils.currentLine=1311258;
 //BA.debugLineNum = 1311258;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\" T";
if (true) break;

case 192:
//if
this.state = 197;
if ((_sres).equals("NO") || (_sres).equals("ERROR") || (_sres).equals("DENIED")) { 
this.state = 194;
;}if (true) break;

case 194:
//C
this.state = 197;
if (true) return ;
if (true) break;

case 197:
//C
this.state = 218;
;
RDebugUtils.currentLine=1311259;
 //BA.debugLineNum = 1311259;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
_permisomodulousuario = _sres;
RDebugUtils.currentLine=1311261;
 //BA.debugLineNum = 1311261;BA.debugLine="Dim cAnalisisDispAlmArtTalla As cAnalisisDispon";
_canalisisdispalmarttalla = new b4j.docU.canalisisdisponiblesalmacenarticulotalla();
RDebugUtils.currentLine=1311262;
 //BA.debugLineNum = 1311262;BA.debugLine="cAnalisisDispAlmArtTalla.Initialize";
_canalisisdispalmarttalla._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1311263;
 //BA.debugLineNum = 1311263;BA.debugLine="cAnalisisDispAlmArtTalla.PermisoModuloUsuario=P";
_canalisisdispalmarttalla._permisomodulousuario /*String*/  = _permisomodulousuario;
RDebugUtils.currentLine=1311264;
 //BA.debugLineNum = 1311264;BA.debugLine="cAnalisisDispAlmArtTalla.Show";
_canalisisdispalmarttalla._show /*void*/ (null);
RDebugUtils.currentLine=1311265;
 //BA.debugLineNum = 1311265;BA.debugLine="frm.Close";
parent._frm.Close();
 if (true) break;

case 199:
//C
this.state = 200;
RDebugUtils.currentLine=1311269;
 //BA.debugLineNum = 1311269;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Pendient";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","Pendiente de programar."));
this.state = 259;
return;
case 259:
//C
this.state = 200;
_robj = (Object) result[0];
;
RDebugUtils.currentLine=1311270;
 //BA.debugLineNum = 1311270;BA.debugLine="Return";
if (true) return ;
RDebugUtils.currentLine=1311294;
 //BA.debugLineNum = 1311294;BA.debugLine="jamLoadingIndicator1.show";
parent._jamloadingindicator1._show /*String*/ (null);
RDebugUtils.currentLine=1311295;
 //BA.debugLineNum = 1311295;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsua";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._utilidades._checkpermisosaplicacionusuarioobjetopermiso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"PermisosAplicacion",parent._main._nombreaplicacion /*String*/ ,parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ,"AnalisisDisponiblesArticuloTallaAlmacenesComputables"));
this.state = 260;
return;
case 260:
//C
this.state = 200;
_sres = (String) result[0];
;
RDebugUtils.currentLine=1311296;
 //BA.debugLineNum = 1311296;BA.debugLine="jamLoadingIndicator1.Close";
parent._jamloadingindicator1._close /*String*/ (null);
RDebugUtils.currentLine=1311297;
 //BA.debugLineNum = 1311297;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\" T";
if (true) break;

case 200:
//if
this.state = 205;
if ((_sres).equals("NO") || (_sres).equals("ERROR") || (_sres).equals("DENIED")) { 
this.state = 202;
;}if (true) break;

case 202:
//C
this.state = 205;
if (true) return ;
if (true) break;

case 205:
//C
this.state = 218;
;
RDebugUtils.currentLine=1311298;
 //BA.debugLineNum = 1311298;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
_permisomodulousuario = _sres;
RDebugUtils.currentLine=1311300;
 //BA.debugLineNum = 1311300;BA.debugLine="Dim cAnalisisDispArtTallaAlmacenesComputables A";
_canalisisdisparttallaalmacenescomputables = new b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables();
RDebugUtils.currentLine=1311301;
 //BA.debugLineNum = 1311301;BA.debugLine="cAnalisisDispArtTallaAlmacenesComputables.Initi";
_canalisisdisparttallaalmacenescomputables._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1311302;
 //BA.debugLineNum = 1311302;BA.debugLine="cAnalisisDispArtTallaAlmacenesComputables.Permi";
_canalisisdisparttallaalmacenescomputables._permisomodulousuario /*String*/  = _permisomodulousuario;
RDebugUtils.currentLine=1311303;
 //BA.debugLineNum = 1311303;BA.debugLine="cAnalisisDispArtTallaAlmacenesComputables.Show";
_canalisisdisparttallaalmacenescomputables._show /*void*/ (null);
RDebugUtils.currentLine=1311304;
 //BA.debugLineNum = 1311304;BA.debugLine="frm.Close";
parent._frm.Close();
 if (true) break;

case 207:
//C
this.state = 218;
RDebugUtils.currentLine=1311373;
 //BA.debugLineNum = 1311373;BA.debugLine="CrearExcelLinksFicherosCarpeta";
_crearexcellinksficheroscarpeta();
 if (true) break;

case 209:
//C
this.state = 218;
RDebugUtils.currentLine=1311376;
 //BA.debugLineNum = 1311376;BA.debugLine="Dim cPermApl As cPermisosAplicacion";
_cpermapl = new b4j.docU.cpermisosaplicacion();
RDebugUtils.currentLine=1311377;
 //BA.debugLineNum = 1311377;BA.debugLine="cPermApl.Initialize";
_cpermapl._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1311378;
 //BA.debugLineNum = 1311378;BA.debugLine="cPermApl.Show";
_cpermapl._show /*void*/ (null);
 if (true) break;

case 211:
//C
this.state = 218;
RDebugUtils.currentLine=1311383;
 //BA.debugLineNum = 1311383;BA.debugLine="Dialog.Title=\"Información\"";
parent._dialog._title /*Object*/  = (Object)("Información");
RDebugUtils.currentLine=1311384;
 //BA.debugLineNum = 1311384;BA.debugLine="Dim B4XLongMsg As B4XLongTextTemplate";
_b4xlongmsg = new b4j.docU.b4xlongtexttemplate();
RDebugUtils.currentLine=1311385;
 //BA.debugLineNum = 1311385;BA.debugLine="B4XLongMsg.Initialize";
_b4xlongmsg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1311386;
 //BA.debugLineNum = 1311386;BA.debugLine="B4XLongMsg.Resize(600dip,500dip)";
_b4xlongmsg._resize /*String*/ (null,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (600)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (500)));
RDebugUtils.currentLine=1311387;
 //BA.debugLineNum = 1311387;BA.debugLine="Dim sbA As StringBuilder";
_sba = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=1311388;
 //BA.debugLineNum = 1311388;BA.debugLine="sbA.Initialize";
_sba.Initialize();
RDebugUtils.currentLine=1311389;
 //BA.debugLineNum = 1311389;BA.debugLine="sbA.Append(Main.NombreAplicacion).Append(\" v\").";
_sba.Append(parent._main._nombreaplicacion /*String*/ ).Append(" v").Append(parent._main._version /*String*/ ).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=1311391;
 //BA.debugLineNum = 1311391;BA.debugLine="sbA.Append(\"(2022-\").Append(DateTime.GetYear(Da";
_sba.Append("(2022-").Append(BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetYear(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))).Append(")").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=1311392;
 //BA.debugLineNum = 1311392;BA.debugLine="sbA.Append(CRLF)";
_sba.Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=1311393;
 //BA.debugLineNum = 1311393;BA.debugLine="sbA.Append(\"Iconos aplicación:\").Append(CRLF)";
_sba.Append("Iconos aplicación:").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=1311395;
 //BA.debugLineNum = 1311395;BA.debugLine="sbA.Append(\"Icons made by Freepik from www.flat";
_sba.Append("Icons made by Freepik from www.flaticon.com").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=1311401;
 //BA.debugLineNum = 1311401;BA.debugLine="sbA.Append(\"Icons made by Flat Icons from www.f";
_sba.Append("Icons made by Flat Icons from www.flaticon.com").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=1311403;
 //BA.debugLineNum = 1311403;BA.debugLine="sbA.Append(\"Icons made by Eucalyp from www.flat";
_sba.Append("Icons made by Eucalyp from www.flaticon.com").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=1311404;
 //BA.debugLineNum = 1311404;BA.debugLine="sbA.Append(\"Icons made by Uniconlabs from www.f";
_sba.Append("Icons made by Uniconlabs from www.flaticon.com").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=1311410;
 //BA.debugLineNum = 1311410;BA.debugLine="B4XLongMsg.Text=sbA.ToString";
_b4xlongmsg._text /*Object*/  = (Object)(_sba.ToString());
RDebugUtils.currentLine=1311411;
 //BA.debugLineNum = 1311411;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xlongmsg),(Object)("OK"),(Object)(""),(Object)(""));
RDebugUtils.currentLine=1311412;
 //BA.debugLineNum = 1311412;BA.debugLine="Dim bOk As B4XView=Dialog.GetButton(xui.DialogR";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = parent._dialog._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,parent._xui.DialogResponse_Positive);
RDebugUtils.currentLine=1311413;
 //BA.debugLineNum = 1311413;BA.debugLine="bOk.TextSize=16";
_bok.setTextSize(16);
RDebugUtils.currentLine=1311414;
 //BA.debugLineNum = 1311414;BA.debugLine="Wait For(rSub) complete (rInt As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _rsub);
this.state = 261;
return;
case 261:
//C
this.state = 218;
_rint = (int) result[0];
;
 if (true) break;

case 213:
//C
this.state = 214;
RDebugUtils.currentLine=1311418;
 //BA.debugLineNum = 1311418;BA.debugLine="If SelectedItem.Children.Size=0 Then";
if (true) break;

case 214:
//if
this.state = 217;
if (_selecteditem.getChildren().getSize()==0) { 
this.state = 216;
}if (true) break;

case 216:
//C
this.state = 217;
RDebugUtils.currentLine=1311419;
 //BA.debugLineNum = 1311419;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Menú Item p";
_msa = parent._xui.MsgboxAsync(ba,"Menú Item pendiente de programar...","Aviso");
RDebugUtils.currentLine=1311420;
 //BA.debugLineNum = 1311420;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 262;
return;
case 262:
//C
this.state = 217;
;
 if (true) break;

case 217:
//C
this.state = 218;
;
 if (true) break;

case 218:
//C
this.state = -1;
;
RDebugUtils.currentLine=1311426;
 //BA.debugLineNum = 1311426;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}