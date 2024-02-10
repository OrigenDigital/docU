package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mainmenu2_subs_0 {


public static void  _abrirfichero(RemoteObject _fsel) throws Exception{
try {
		Debug.PushSubsStack("AbrirFichero (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,1597);
if (RapidSub.canDelegate("abrirfichero")) { b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","abrirfichero", _fsel); return;}
ResumableSub_AbrirFichero rsub = new ResumableSub_AbrirFichero(null,_fsel);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_AbrirFichero extends BA.ResumableSub {
public ResumableSub_AbrirFichero(b4j.docU.mainmenu2 parent,RemoteObject _fsel) {
this.parent = parent;
this._fsel = _fsel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.mainmenu2 parent;
RemoteObject _fsel;
RemoteObject _nombref = RemoteObject.createImmutable("");
RemoteObject _dirf = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _jr = RemoteObject.declareNull("butt.droid.awtRobot.AWTRobot");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("AbrirFichero (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,1597);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("fSel", _fsel);
 BA.debugLineNum = 1598;BA.debugLine="Dim nombreF As String=File.GetName(fSel)";
Debug.ShouldStop(536870912);
_nombref = parent.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_fsel));Debug.locals.put("nombreF", _nombref);Debug.locals.put("nombreF", _nombref);
 BA.debugLineNum = 1599;BA.debugLine="Dim DirF As String=File.GetFileParent(fSel)";
Debug.ShouldStop(1073741824);
_dirf = parent.__c.getField(false,"File").runMethod(true,"GetFileParent",(Object)(_fsel));Debug.locals.put("DirF", _dirf);Debug.locals.put("DirF", _dirf);
 BA.debugLineNum = 1600;BA.debugLine="If File.Exists(DirF,\"\") =False Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_dirf),(Object)(RemoteObject.createImmutable(""))),parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1601;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(1);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible acceder a la carpeta "),_dirf,RemoteObject.createImmutable("."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Verifica si tienes acceso a la red. En caso afirmativo, es posible que la carpeta haya sido eliminada o cambiada de ubicación"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1602;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "abrirfichero"), _msa);
this.state = 13;
return;
case 13:
//C
this.state = 4;
;
 BA.debugLineNum = 1603;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 1605;BA.debugLine="If File.Exists(fSel,\"\") =False Then";
Debug.ShouldStop(16);

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_fsel),(Object)(RemoteObject.createImmutable(""))),parent.__c.getField(true,"False"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1606;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(32);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible acceder al fichero "),_nombref,RemoteObject.createImmutable("."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Verifica si tienes acceso a la red. En caso afirmativo, es posible que el fichero haya sido eliminada o cambiado de ubicación"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1607;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "abrirfichero"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 7;
;
 BA.debugLineNum = 1608;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 1610;BA.debugLine="Try";
Debug.ShouldStop(512);

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
 BA.debugLineNum = 1611;BA.debugLine="Dim jR As AWTRobot";
Debug.ShouldStop(1024);
_jr = RemoteObject.createNew ("butt.droid.awtRobot.AWTRobot");Debug.locals.put("jR", _jr);
 BA.debugLineNum = 1612;BA.debugLine="jR.SystemOpenExternalFile(fSel)";
Debug.ShouldStop(2048);
_jr.runVoidMethod ("SystemOpenExternalFile",(Object)(_fsel));
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 1614;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(8192);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible abrir el fichero seleccionado."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Verifica si tienes acceso a la red. En caso afirmativo, es posible que el fichero haya sido eliminado o cambiado de ubicación"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1615;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "abrirfichero"), _msa);
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
 BA.debugLineNum = 1617;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",mainmenu2.ba, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _msgbox_result() throws Exception{
}
public static RemoteObject  _appstartotros(RemoteObject _surl) throws Exception{
try {
		Debug.PushSubsStack("AppStartOtros (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,1639);
if (RapidSub.canDelegate("appstartotros")) { return b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","appstartotros", _surl);}
Debug.locals.put("sURL", _surl);
 BA.debugLineNum = 1639;BA.debugLine="Sub AppStartOtros(sURL As String)";
Debug.ShouldStop(64);
 BA.debugLineNum = 1640;BA.debugLine="fx.ShowExternalDocument(sURL)";
Debug.ShouldStop(128);
mainmenu2._fx.runVoidMethod ("ShowExternalDocument",(Object)(_surl));
 BA.debugLineNum = 1641;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _asjo(RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("asJO (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,2212);
if (RapidSub.canDelegate("asjo")) { return b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","asjo", _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 2212;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
Debug.ShouldStop(8);
 BA.debugLineNum = 2213;BA.debugLine="Return o";
Debug.ShouldStop(16);
if (true) return _o;
 BA.debugLineNum = 2214;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _bbcodeviewelementosmainmenu_linkclicked(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("BBCodeViewElementosMainMenu_LinkClicked (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,2137);
if (RapidSub.canDelegate("bbcodeviewelementosmainmenu_linkclicked")) { b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","bbcodeviewelementosmainmenu_linkclicked", _url); return;}
ResumableSub_BBCodeViewElementosMainMenu_LinkClicked rsub = new ResumableSub_BBCodeViewElementosMainMenu_LinkClicked(null,_url);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_BBCodeViewElementosMainMenu_LinkClicked extends BA.ResumableSub {
public ResumableSub_BBCodeViewElementosMainMenu_LinkClicked(b4j.docU.mainmenu2 parent,RemoteObject _url) {
this.parent = parent;
this._url = _url;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.mainmenu2 parent;
RemoteObject _url;
RemoteObject _tiurl = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _robj = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BBCodeViewElementosMainMenu_LinkClicked (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,2137);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("URL", _url);
 BA.debugLineNum = 2138;BA.debugLine="Log(URL)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","82359297",_url,0);
 BA.debugLineNum = 2139;BA.debugLine="Dim tIURL As TreeItem=SearchTreeItem(TreeViewMain";
Debug.ShouldStop(67108864);
_tiurl = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_tiurl = _searchtreeitem(parent._treeviewmainmenu.runMethod(false,"getRoot"),_url);Debug.locals.put("tIURL", _tiurl);Debug.locals.put("tIURL", _tiurl);
 BA.debugLineNum = 2140;BA.debugLine="If tIURL.IsInitialized Then";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 6;
if (_tiurl.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 2148;BA.debugLine="SeleccionarMenuItem(tIURL)";
Debug.ShouldStop(8);
_seleccionarmenuitem(_tiurl);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2150;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Error\",\"Error en";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","complete", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "bbcodeviewelementosmainmenu_linkclicked"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Error")),(Object)(RemoteObject.createImmutable("Error en URL treeItem..."))));
this.state = 7;
return;
case 7:
//C
this.state = 6;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("rObj", _robj);
;
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 2152;BA.debugLine="End Sub";
Debug.ShouldStop(128);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject _robj) throws Exception{
}
public static RemoteObject  _cargatreeview() throws Exception{
try {
		Debug.PushSubsStack("CargaTreeView (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,305);
if (RapidSub.canDelegate("cargatreeview")) { return b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","cargatreeview");}
RemoteObject _imgtreeitemgo = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
RemoteObject _tidocumentos = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _ticontroldocumentosnogestionados = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _ticontroldocumentosperiodo = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _ticontrolosubspendientesnoconfeccion = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tifasesdocumento = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _timarcaralbaranfisico = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tilogistica = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _titransportes = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _titxt = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _titxtexpedicionessinentregar = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _titxtexpedicionesperiodo = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tidhl = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tidhlexpedicionessinentregar = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _ticorreosexpress = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _ticorreosexpressexpedicionesperiodo = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _ticorreosexpressinfoexpedicion = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _ticompras = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tiseguimientofechasprometidaspedidoscompra = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tievaluacionproveedores = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tiventas = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tigestionventas = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tiinformesexpedicionesclientes = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _ticgeneracionficheroscsvplantillapedidos = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _ticrestartdocuwarebackworker = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tib2b = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _titestsinfomagento = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tipedidosclientes = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tirepsol = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tiimportacionpedidoseessrepsol = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tialbaranesventarepsol = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tianalisisdatos = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tianalisisdisponiblesalmacenarticulotalla = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tiincidencias = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _bombimg = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
RemoteObject _tiincidenciasproveedor = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tiincidenciasproveedorlista = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tiincidenciasproveedortaeaspendientes = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tiincidenciascliente = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tiincidenciasinternas = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tiutilidades = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tificheroscarpetaexcellinks = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tipermisosaplicacion = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tiacercade = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tisalir = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
 BA.debugLineNum = 305;BA.debugLine="Sub CargaTreeView";
Debug.ShouldStop(65536);
 BA.debugLineNum = 307;BA.debugLine="TreeViewMainMenu.Root.Children.Clear";
Debug.ShouldStop(262144);
mainmenu2._treeviewmainmenu.runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Clear");
 BA.debugLineNum = 309;BA.debugLine="Dim imgTreeItemGo As Image=Main.fx.LoadImageSampl";
Debug.ShouldStop(1048576);
_imgtreeitemgo = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
_imgtreeitemgo = mainmenu2._main._fx /*RemoteObject*/ .runMethod(false,"LoadImageSample",(Object)(mainmenu2.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("arrow-right16.png")),(Object)(BA.numberCast(double.class, 16)),(Object)(BA.numberCast(double.class, 16)));Debug.locals.put("imgTreeItemGo", _imgtreeitemgo);Debug.locals.put("imgTreeItemGo", _imgtreeitemgo);
 BA.debugLineNum = 317;BA.debugLine="Dim tiDocumentos As TreeItem";
Debug.ShouldStop(268435456);
_tidocumentos = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiDocumentos", _tidocumentos);
 BA.debugLineNum = 318;BA.debugLine="tiDocumentos.Initialize(\"tItem\",\"Documentos\")";
Debug.ShouldStop(536870912);
_tidocumentos.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Documentos")));
 BA.debugLineNum = 321;BA.debugLine="tiDocumentos.Image=Main.fx.LoadImage(File.Dirasse";
Debug.ShouldStop(1);
_tidocumentos.runMethod(false,"setImage",(mainmenu2._main._fx /*RemoteObject*/ .runMethod(false,"LoadImage",(Object)(mainmenu2.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("outline_description_black_36dp.png"))).getObject()));
 BA.debugLineNum = 322;BA.debugLine="TreeViewMainMenu.Root.Children.Add(tiDocumentos)";
Debug.ShouldStop(2);
mainmenu2._treeviewmainmenu.runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tidocumentos.getObject())));
 BA.debugLineNum = 324;BA.debugLine="Dim tiControlDocumentosNoGestionados As TreeItem";
Debug.ShouldStop(8);
_ticontroldocumentosnogestionados = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiControlDocumentosNoGestionados", _ticontroldocumentosnogestionados);
 BA.debugLineNum = 325;BA.debugLine="tiControlDocumentosNoGestionados.Initialize(\"tIte";
Debug.ShouldStop(16);
_ticontroldocumentosnogestionados.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Documentos No Gestionados")));
 BA.debugLineNum = 326;BA.debugLine="tiControlDocumentosNoGestionados.Image=imgTreeIte";
Debug.ShouldStop(32);
_ticontroldocumentosnogestionados.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 327;BA.debugLine="tiDocumentos.Children.Add(tiControlDocumentosNoGe";
Debug.ShouldStop(64);
_tidocumentos.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_ticontroldocumentosnogestionados.getObject())));
 BA.debugLineNum = 329;BA.debugLine="Dim tiControlDocumentosPeriodo As TreeItem";
Debug.ShouldStop(256);
_ticontroldocumentosperiodo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiControlDocumentosPeriodo", _ticontroldocumentosperiodo);
 BA.debugLineNum = 330;BA.debugLine="tiControlDocumentosPeriodo.Initialize(\"tItem\",\"Do";
Debug.ShouldStop(512);
_ticontroldocumentosperiodo.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Documentos Periodo")));
 BA.debugLineNum = 331;BA.debugLine="tiControlDocumentosPeriodo.Image=imgTreeItemGo";
Debug.ShouldStop(1024);
_ticontroldocumentosperiodo.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 332;BA.debugLine="tiDocumentos.Children.Add(tiControlDocumentosPeri";
Debug.ShouldStop(2048);
_tidocumentos.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_ticontroldocumentosperiodo.getObject())));
 BA.debugLineNum = 334;BA.debugLine="Dim tiControlOSUBsPendientesNoConfeccion As TreeI";
Debug.ShouldStop(8192);
_ticontrolosubspendientesnoconfeccion = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiControlOSUBsPendientesNoConfeccion", _ticontrolosubspendientesnoconfeccion);
 BA.debugLineNum = 335;BA.debugLine="tiControlOSUBsPendientesNoConfeccion.Initialize(\"";
Debug.ShouldStop(16384);
_ticontrolosubspendientesnoconfeccion.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("OSUBs Pendientes No Confección")));
 BA.debugLineNum = 336;BA.debugLine="tiControlOSUBsPendientesNoConfeccion.Image=imgTre";
Debug.ShouldStop(32768);
_ticontrolosubspendientesnoconfeccion.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 337;BA.debugLine="tiDocumentos.Children.Add(tiControlOSUBsPendiente";
Debug.ShouldStop(65536);
_tidocumentos.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_ticontrolosubspendientesnoconfeccion.getObject())));
 BA.debugLineNum = 339;BA.debugLine="Dim tiFasesDocumento As TreeItem";
Debug.ShouldStop(262144);
_tifasesdocumento = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiFasesDocumento", _tifasesdocumento);
 BA.debugLineNum = 340;BA.debugLine="tiFasesDocumento.Initialize(\"tItem\",\"Fases Docume";
Debug.ShouldStop(524288);
_tifasesdocumento.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Fases Documento")));
 BA.debugLineNum = 341;BA.debugLine="tiFasesDocumento.Image=imgTreeItemGo";
Debug.ShouldStop(1048576);
_tifasesdocumento.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 342;BA.debugLine="tiDocumentos.Children.Add(tiFasesDocumento)";
Debug.ShouldStop(2097152);
_tidocumentos.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tifasesdocumento.getObject())));
 BA.debugLineNum = 344;BA.debugLine="Dim tiMarcarAlbaranFisico As TreeItem";
Debug.ShouldStop(8388608);
_timarcaralbaranfisico = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiMarcarAlbaranFisico", _timarcaralbaranfisico);
 BA.debugLineNum = 345;BA.debugLine="tiMarcarAlbaranFisico.Initialize(\"tItem\",\"Marcar";
Debug.ShouldStop(16777216);
_timarcaralbaranfisico.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Marcar Albarán Físico")));
 BA.debugLineNum = 346;BA.debugLine="tiMarcarAlbaranFisico.Image=imgTreeItemGo";
Debug.ShouldStop(33554432);
_timarcaralbaranfisico.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 347;BA.debugLine="tiDocumentos.Children.Add(tiMarcarAlbaranFisico)";
Debug.ShouldStop(67108864);
_tidocumentos.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_timarcaralbaranfisico.getObject())));
 BA.debugLineNum = 349;BA.debugLine="Dim tiLogistica As TreeItem";
Debug.ShouldStop(268435456);
_tilogistica = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiLogistica", _tilogistica);
 BA.debugLineNum = 350;BA.debugLine="tiLogistica.Initialize(\"tItem\",\"Logística\")";
Debug.ShouldStop(536870912);
_tilogistica.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Logística")));
 BA.debugLineNum = 352;BA.debugLine="tiLogistica.Image=Main.fx.LoadImage(File.Dirasset";
Debug.ShouldStop(-2147483648);
_tilogistica.runMethod(false,"setImage",(mainmenu2._main._fx /*RemoteObject*/ .runMethod(false,"LoadImage",(Object)(mainmenu2.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("outline_local_shipping_black_36dp.png"))).getObject()));
 BA.debugLineNum = 354;BA.debugLine="TreeViewMainMenu.Root.Children.Add(tiLogistica)";
Debug.ShouldStop(2);
mainmenu2._treeviewmainmenu.runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tilogistica.getObject())));
 BA.debugLineNum = 356;BA.debugLine="Dim tiTransportes As TreeItem";
Debug.ShouldStop(8);
_titransportes = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiTransportes", _titransportes);
 BA.debugLineNum = 357;BA.debugLine="tiTransportes.Initialize(\"tItem\",\"Transportes\")";
Debug.ShouldStop(16);
_titransportes.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Transportes")));
 BA.debugLineNum = 359;BA.debugLine="tiTransportes.Image=imgTreeItemGo";
Debug.ShouldStop(64);
_titransportes.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 360;BA.debugLine="tiLogistica.Children.Add(tiTransportes)";
Debug.ShouldStop(128);
_tilogistica.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_titransportes.getObject())));
 BA.debugLineNum = 362;BA.debugLine="Dim tiTXT As TreeItem";
Debug.ShouldStop(512);
_titxt = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiTXT", _titxt);
 BA.debugLineNum = 363;BA.debugLine="tiTXT.Initialize(\"tItem\",\"TXT\")";
Debug.ShouldStop(1024);
_titxt.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("TXT")));
 BA.debugLineNum = 364;BA.debugLine="tiTXT.Image=Main.fx.LoadImageSample(File.Dirasset";
Debug.ShouldStop(2048);
_titxt.runMethod(false,"setImage",(mainmenu2._main._fx /*RemoteObject*/ .runMethod(false,"LoadImageSample",(Object)(mainmenu2.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("txttransporte.jpg")),(Object)(BA.numberCast(double.class, 32)),(Object)(BA.numberCast(double.class, 32))).getObject()));
 BA.debugLineNum = 365;BA.debugLine="tiTransportes.Children.Add(tiTXT)";
Debug.ShouldStop(4096);
_titransportes.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_titxt.getObject())));
 BA.debugLineNum = 367;BA.debugLine="Dim tiTXTExpedicionesSinEntregar As TreeItem";
Debug.ShouldStop(16384);
_titxtexpedicionessinentregar = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiTXTExpedicionesSinEntregar", _titxtexpedicionessinentregar);
 BA.debugLineNum = 368;BA.debugLine="tiTXTExpedicionesSinEntregar.Initialize(\"tItem\",\"";
Debug.ShouldStop(32768);
_titxtexpedicionessinentregar.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Expediciones Sin Entregar TXT")));
 BA.debugLineNum = 369;BA.debugLine="tiTXTExpedicionesSinEntregar.Image=imgTreeItemGo";
Debug.ShouldStop(65536);
_titxtexpedicionessinentregar.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 370;BA.debugLine="tiTXT.Children.Add(tiTXTExpedicionesSinEntregar)";
Debug.ShouldStop(131072);
_titxt.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_titxtexpedicionessinentregar.getObject())));
 BA.debugLineNum = 372;BA.debugLine="Dim tiTXTExpedicionesPeriodo As TreeItem";
Debug.ShouldStop(524288);
_titxtexpedicionesperiodo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiTXTExpedicionesPeriodo", _titxtexpedicionesperiodo);
 BA.debugLineNum = 373;BA.debugLine="tiTXTExpedicionesPeriodo.Initialize(\"tItem\",\"Expe";
Debug.ShouldStop(1048576);
_titxtexpedicionesperiodo.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Expediciones Periodo TXT")));
 BA.debugLineNum = 374;BA.debugLine="tiTXTExpedicionesPeriodo.Image=imgTreeItemGo";
Debug.ShouldStop(2097152);
_titxtexpedicionesperiodo.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 375;BA.debugLine="tiTXT.Children.Add(tiTXTExpedicionesPeriodo)";
Debug.ShouldStop(4194304);
_titxt.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_titxtexpedicionesperiodo.getObject())));
 BA.debugLineNum = 377;BA.debugLine="Dim tiDHL As TreeItem";
Debug.ShouldStop(16777216);
_tidhl = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiDHL", _tidhl);
 BA.debugLineNum = 378;BA.debugLine="tiDHL.Initialize(\"tiItem\",\"DHL\")";
Debug.ShouldStop(33554432);
_tidhl.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tiItem")),(Object)(RemoteObject.createImmutable("DHL")));
 BA.debugLineNum = 379;BA.debugLine="tiDHL.Image=Main.fx.LoadImageSample(File.Dirasset";
Debug.ShouldStop(67108864);
_tidhl.runMethod(false,"setImage",(mainmenu2._main._fx /*RemoteObject*/ .runMethod(false,"LoadImageSample",(Object)(mainmenu2.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("DHLsq.png")),(Object)(BA.numberCast(double.class, 32)),(Object)(BA.numberCast(double.class, 32))).getObject()));
 BA.debugLineNum = 380;BA.debugLine="tiTransportes.Children.Add(tiDHL)";
Debug.ShouldStop(134217728);
_titransportes.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tidhl.getObject())));
 BA.debugLineNum = 382;BA.debugLine="Dim tiDHLExpedicionesSinEntregar As TreeItem";
Debug.ShouldStop(536870912);
_tidhlexpedicionessinentregar = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiDHLExpedicionesSinEntregar", _tidhlexpedicionessinentregar);
 BA.debugLineNum = 383;BA.debugLine="tiDHLExpedicionesSinEntregar.Initialize(\"tItem\",\"";
Debug.ShouldStop(1073741824);
_tidhlexpedicionessinentregar.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Expediciones Sin Entregar DHL")));
 BA.debugLineNum = 384;BA.debugLine="tiDHLExpedicionesSinEntregar.Image=imgTreeItemGo";
Debug.ShouldStop(-2147483648);
_tidhlexpedicionessinentregar.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 385;BA.debugLine="tiDHL.Children.Add(tiDHLExpedicionesSinEntregar)";
Debug.ShouldStop(1);
_tidhl.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tidhlexpedicionessinentregar.getObject())));
 BA.debugLineNum = 387;BA.debugLine="Dim tiCorreosExpress As TreeItem";
Debug.ShouldStop(4);
_ticorreosexpress = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiCorreosExpress", _ticorreosexpress);
 BA.debugLineNum = 388;BA.debugLine="tiCorreosExpress.Initialize(\"tiItem\",\"Correos Exp";
Debug.ShouldStop(8);
_ticorreosexpress.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tiItem")),(Object)(RemoteObject.createImmutable("Correos Express")));
 BA.debugLineNum = 389;BA.debugLine="tiCorreosExpress.Image=Main.fx.LoadImageSample(Fi";
Debug.ShouldStop(16);
_ticorreosexpress.runMethod(false,"setImage",(mainmenu2._main._fx /*RemoteObject*/ .runMethod(false,"LoadImageSample",(Object)(mainmenu2.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("correosexpress.jpg")),(Object)(BA.numberCast(double.class, 32)),(Object)(BA.numberCast(double.class, 32))).getObject()));
 BA.debugLineNum = 390;BA.debugLine="tiTransportes.Children.Add(tiCorreosExpress)";
Debug.ShouldStop(32);
_titransportes.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_ticorreosexpress.getObject())));
 BA.debugLineNum = 392;BA.debugLine="Dim tiCorreosExpressExpedicionesPeriodo As TreeIt";
Debug.ShouldStop(128);
_ticorreosexpressexpedicionesperiodo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiCorreosExpressExpedicionesPeriodo", _ticorreosexpressexpedicionesperiodo);
 BA.debugLineNum = 393;BA.debugLine="tiCorreosExpressExpedicionesPeriodo.Initialize(\"t";
Debug.ShouldStop(256);
_ticorreosexpressexpedicionesperiodo.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Expediciones Periodo Correos Express")));
 BA.debugLineNum = 394;BA.debugLine="tiCorreosExpressExpedicionesPeriodo.Image=imgTree";
Debug.ShouldStop(512);
_ticorreosexpressexpedicionesperiodo.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 395;BA.debugLine="tiCorreosExpress.Children.Add(tiCorreosExpressExp";
Debug.ShouldStop(1024);
_ticorreosexpress.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_ticorreosexpressexpedicionesperiodo.getObject())));
 BA.debugLineNum = 397;BA.debugLine="Dim tiCorreosExpressInfoExpedicion As TreeItem";
Debug.ShouldStop(4096);
_ticorreosexpressinfoexpedicion = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiCorreosExpressInfoExpedicion", _ticorreosexpressinfoexpedicion);
 BA.debugLineNum = 398;BA.debugLine="tiCorreosExpressInfoExpedicion.Initialize(\"tItem\"";
Debug.ShouldStop(8192);
_ticorreosexpressinfoexpedicion.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Info Expedición Correos Express")));
 BA.debugLineNum = 399;BA.debugLine="tiCorreosExpressInfoExpedicion.Image=imgTreeItemG";
Debug.ShouldStop(16384);
_ticorreosexpressinfoexpedicion.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 400;BA.debugLine="tiCorreosExpress.Children.Add(tiCorreosExpressInf";
Debug.ShouldStop(32768);
_ticorreosexpress.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_ticorreosexpressinfoexpedicion.getObject())));
 BA.debugLineNum = 407;BA.debugLine="Dim tiCompras As TreeItem";
Debug.ShouldStop(4194304);
_ticompras = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiCompras", _ticompras);
 BA.debugLineNum = 408;BA.debugLine="tiCompras.Initialize(\"tItem\",\"Compras\")";
Debug.ShouldStop(8388608);
_ticompras.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Compras")));
 BA.debugLineNum = 410;BA.debugLine="tiCompras.Image=Main.fx.LoadImage(File.Dirassets,";
Debug.ShouldStop(33554432);
_ticompras.runMethod(false,"setImage",(mainmenu2._main._fx /*RemoteObject*/ .runMethod(false,"LoadImage",(Object)(mainmenu2.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("outline_shopping_cart_IN_black_36dp.png"))).getObject()));
 BA.debugLineNum = 411;BA.debugLine="TreeViewMainMenu.Root.Children.Add(tiCompras)";
Debug.ShouldStop(67108864);
mainmenu2._treeviewmainmenu.runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_ticompras.getObject())));
 BA.debugLineNum = 413;BA.debugLine="Dim tiSeguimientoFechasPrometidasPedidosCompra As";
Debug.ShouldStop(268435456);
_tiseguimientofechasprometidaspedidoscompra = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiSeguimientoFechasPrometidasPedidosCompra", _tiseguimientofechasprometidaspedidoscompra);
 BA.debugLineNum = 414;BA.debugLine="tiSeguimientoFechasPrometidasPedidosCompra.Initia";
Debug.ShouldStop(536870912);
_tiseguimientofechasprometidaspedidoscompra.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Seguimiento Fechas Prometidas Pedidos Compra")));
 BA.debugLineNum = 415;BA.debugLine="tiSeguimientoFechasPrometidasPedidosCompra.Image=";
Debug.ShouldStop(1073741824);
_tiseguimientofechasprometidaspedidoscompra.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 416;BA.debugLine="tiCompras.Children.Add(tiSeguimientoFechasPrometi";
Debug.ShouldStop(-2147483648);
_ticompras.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tiseguimientofechasprometidaspedidoscompra.getObject())));
 BA.debugLineNum = 428;BA.debugLine="Dim tiEvaluacionProveedores As TreeItem";
Debug.ShouldStop(2048);
_tievaluacionproveedores = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiEvaluacionProveedores", _tievaluacionproveedores);
 BA.debugLineNum = 429;BA.debugLine="tiEvaluacionProveedores.Initialize(\"tItem\",\"Evalu";
Debug.ShouldStop(4096);
_tievaluacionproveedores.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Evaluación Proveedores")));
 BA.debugLineNum = 430;BA.debugLine="tiEvaluacionProveedores.Image=imgTreeItemGo";
Debug.ShouldStop(8192);
_tievaluacionproveedores.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 431;BA.debugLine="tiCompras.Children.Add(tiEvaluacionProveedores)";
Debug.ShouldStop(16384);
_ticompras.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tievaluacionproveedores.getObject())));
 BA.debugLineNum = 433;BA.debugLine="Dim tiVentas As TreeItem";
Debug.ShouldStop(65536);
_tiventas = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiVentas", _tiventas);
 BA.debugLineNum = 434;BA.debugLine="tiVentas.Initialize(\"tItem\",\"Ventas\")";
Debug.ShouldStop(131072);
_tiventas.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Ventas")));
 BA.debugLineNum = 436;BA.debugLine="tiVentas.Image=Main.fx.LoadImage(File.Dirassets,";
Debug.ShouldStop(524288);
_tiventas.runMethod(false,"setImage",(mainmenu2._main._fx /*RemoteObject*/ .runMethod(false,"LoadImage",(Object)(mainmenu2.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("outline_shopping_cart_OUT_black_36dp.png"))).getObject()));
 BA.debugLineNum = 437;BA.debugLine="TreeViewMainMenu.Root.Children.Add(tiVentas)";
Debug.ShouldStop(1048576);
mainmenu2._treeviewmainmenu.runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tiventas.getObject())));
 BA.debugLineNum = 439;BA.debugLine="Dim tiGestionVentas As TreeItem";
Debug.ShouldStop(4194304);
_tigestionventas = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiGestionVentas", _tigestionventas);
 BA.debugLineNum = 440;BA.debugLine="tiGestionVentas.Initialize(\"tItem\",\"Gestión Venta";
Debug.ShouldStop(8388608);
_tigestionventas.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Gestión Ventas")));
 BA.debugLineNum = 441;BA.debugLine="tiGestionVentas.Image=imgTreeItemGo";
Debug.ShouldStop(16777216);
_tigestionventas.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 442;BA.debugLine="tiVentas.Children.Add(tiGestionVentas)";
Debug.ShouldStop(33554432);
_tiventas.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tigestionventas.getObject())));
 BA.debugLineNum = 444;BA.debugLine="Dim tiInformesExpedicionesClientes As TreeItem";
Debug.ShouldStop(134217728);
_tiinformesexpedicionesclientes = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiInformesExpedicionesClientes", _tiinformesexpedicionesclientes);
 BA.debugLineNum = 445;BA.debugLine="tiInformesExpedicionesClientes.Initialize(\"tItem\"";
Debug.ShouldStop(268435456);
_tiinformesexpedicionesclientes.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Informes Expediciones Clientes")));
 BA.debugLineNum = 446;BA.debugLine="tiInformesExpedicionesClientes.Image=imgTreeItemG";
Debug.ShouldStop(536870912);
_tiinformesexpedicionesclientes.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 447;BA.debugLine="tiVentas.Children.Add(tiInformesExpedicionesClien";
Debug.ShouldStop(1073741824);
_tiventas.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tiinformesexpedicionesclientes.getObject())));
 BA.debugLineNum = 449;BA.debugLine="Dim ticGeneracionFicherosCSVPlantillaPedidos As T";
Debug.ShouldStop(1);
_ticgeneracionficheroscsvplantillapedidos = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("ticGeneracionFicherosCSVPlantillaPedidos", _ticgeneracionficheroscsvplantillapedidos);
 BA.debugLineNum = 450;BA.debugLine="ticGeneracionFicherosCSVPlantillaPedidos.Initiali";
Debug.ShouldStop(2);
_ticgeneracionficheroscsvplantillapedidos.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Generación Ficheros CSV Plantilla Pedidos Venta")));
 BA.debugLineNum = 451;BA.debugLine="ticGeneracionFicherosCSVPlantillaPedidos.Image=im";
Debug.ShouldStop(4);
_ticgeneracionficheroscsvplantillapedidos.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 452;BA.debugLine="tiVentas.Children.Add(ticGeneracionFicherosCSVPla";
Debug.ShouldStop(8);
_tiventas.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_ticgeneracionficheroscsvplantillapedidos.getObject())));
 BA.debugLineNum = 454;BA.debugLine="Dim ticRestartDocuwareBackworker As TreeItem";
Debug.ShouldStop(32);
_ticrestartdocuwarebackworker = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("ticRestartDocuwareBackworker", _ticrestartdocuwarebackworker);
 BA.debugLineNum = 455;BA.debugLine="ticRestartDocuwareBackworker.Initialize(\"tItem\",\"";
Debug.ShouldStop(64);
_ticrestartdocuwarebackworker.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Reiniciar sincronización Docuware")));
 BA.debugLineNum = 456;BA.debugLine="ticRestartDocuwareBackworker.Image=imgTreeItemGo";
Debug.ShouldStop(128);
_ticrestartdocuwarebackworker.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 457;BA.debugLine="tiVentas.Children.Add(ticRestartDocuwareBackworke";
Debug.ShouldStop(256);
_tiventas.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_ticrestartdocuwarebackworker.getObject())));
 BA.debugLineNum = 466;BA.debugLine="Dim tiB2B As TreeItem";
Debug.ShouldStop(131072);
_tib2b = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiB2B", _tib2b);
 BA.debugLineNum = 467;BA.debugLine="tiB2B.Initialize(\"tItem\",\"B2B\")";
Debug.ShouldStop(262144);
_tib2b.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("B2B")));
 BA.debugLineNum = 469;BA.debugLine="tiVentas.Children.Add(tiB2B)";
Debug.ShouldStop(1048576);
_tiventas.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tib2b.getObject())));
 BA.debugLineNum = 471;BA.debugLine="Dim tiTestsInfoMagento As TreeItem";
Debug.ShouldStop(4194304);
_titestsinfomagento = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiTestsInfoMagento", _titestsinfomagento);
 BA.debugLineNum = 472;BA.debugLine="tiTestsInfoMagento.Initialize(\"tItem\",\"Tests Info";
Debug.ShouldStop(8388608);
_titestsinfomagento.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Tests Info Magento")));
 BA.debugLineNum = 473;BA.debugLine="tiTestsInfoMagento.Image=imgTreeItemGo";
Debug.ShouldStop(16777216);
_titestsinfomagento.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 474;BA.debugLine="tiB2B.Children.Add(tiTestsInfoMagento)";
Debug.ShouldStop(33554432);
_tib2b.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_titestsinfomagento.getObject())));
 BA.debugLineNum = 476;BA.debugLine="Dim tiPedidosClientes As TreeItem";
Debug.ShouldStop(134217728);
_tipedidosclientes = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiPedidosClientes", _tipedidosclientes);
 BA.debugLineNum = 477;BA.debugLine="tiPedidosClientes.Initialize(\"tItem\",\"Pedidos Cli";
Debug.ShouldStop(268435456);
_tipedidosclientes.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Pedidos Clientes")));
 BA.debugLineNum = 478;BA.debugLine="tiPedidosClientes.Image=imgTreeItemGo";
Debug.ShouldStop(536870912);
_tipedidosclientes.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 479;BA.debugLine="tiB2B.Children.Add(tiPedidosClientes)";
Debug.ShouldStop(1073741824);
_tib2b.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tipedidosclientes.getObject())));
 BA.debugLineNum = 496;BA.debugLine="Dim tiRepsol As TreeItem";
Debug.ShouldStop(32768);
_tirepsol = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiRepsol", _tirepsol);
 BA.debugLineNum = 497;BA.debugLine="tiRepsol.Initialize(\"tItem\",\"Repsol\")";
Debug.ShouldStop(65536);
_tirepsol.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Repsol")));
 BA.debugLineNum = 499;BA.debugLine="tiVentas.Children.Add(tiRepsol)";
Debug.ShouldStop(262144);
_tiventas.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tirepsol.getObject())));
 BA.debugLineNum = 501;BA.debugLine="Dim tiImportacionPedidosEESSRepsol As TreeItem";
Debug.ShouldStop(1048576);
_tiimportacionpedidoseessrepsol = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiImportacionPedidosEESSRepsol", _tiimportacionpedidoseessrepsol);
 BA.debugLineNum = 502;BA.debugLine="tiImportacionPedidosEESSRepsol.Initialize(\"tItem\"";
Debug.ShouldStop(2097152);
_tiimportacionpedidoseessrepsol.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Importacion Pedidos EESS Repsol")));
 BA.debugLineNum = 503;BA.debugLine="tiImportacionPedidosEESSRepsol.Image=imgTreeItemG";
Debug.ShouldStop(4194304);
_tiimportacionpedidoseessrepsol.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 504;BA.debugLine="tiRepsol.Children.Add(tiImportacionPedidosEESSRep";
Debug.ShouldStop(8388608);
_tirepsol.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tiimportacionpedidoseessrepsol.getObject())));
 BA.debugLineNum = 506;BA.debugLine="Dim tiAlbaranesVentaRepsol As TreeItem";
Debug.ShouldStop(33554432);
_tialbaranesventarepsol = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiAlbaranesVentaRepsol", _tialbaranesventarepsol);
 BA.debugLineNum = 507;BA.debugLine="tiAlbaranesVentaRepsol.Initialize(\"tItem\",\"Albara";
Debug.ShouldStop(67108864);
_tialbaranesventarepsol.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Albaranes Venta Repsol")));
 BA.debugLineNum = 508;BA.debugLine="tiAlbaranesVentaRepsol.Image=imgTreeItemGo";
Debug.ShouldStop(134217728);
_tialbaranesventarepsol.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 509;BA.debugLine="tiRepsol.Children.Add(tiAlbaranesVentaRepsol)";
Debug.ShouldStop(268435456);
_tirepsol.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tialbaranesventarepsol.getObject())));
 BA.debugLineNum = 526;BA.debugLine="Dim tiAnalisisDatos As TreeItem";
Debug.ShouldStop(8192);
_tianalisisdatos = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiAnalisisDatos", _tianalisisdatos);
 BA.debugLineNum = 527;BA.debugLine="tiAnalisisDatos.Initialize(\"tItem\",\"Análisis de D";
Debug.ShouldStop(16384);
_tianalisisdatos.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Análisis de Datos")));
 BA.debugLineNum = 530;BA.debugLine="tiAnalisisDatos.Image=Main.fx.LoadImageSample(Fil";
Debug.ShouldStop(131072);
_tianalisisdatos.runMethod(false,"setImage",(mainmenu2._main._fx /*RemoteObject*/ .runMethod(false,"LoadImageSample",(Object)(mainmenu2.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("outline_analytics_black_36dp.png")),(Object)(BA.numberCast(double.class, 36)),(Object)(BA.numberCast(double.class, 36))).getObject()));
 BA.debugLineNum = 531;BA.debugLine="TreeViewMainMenu.Root.Children.Add(tiAnalisisDato";
Debug.ShouldStop(262144);
mainmenu2._treeviewmainmenu.runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tianalisisdatos.getObject())));
 BA.debugLineNum = 533;BA.debugLine="Dim tiAnalisisDisponiblesAlmacenArticuloTalla As";
Debug.ShouldStop(1048576);
_tianalisisdisponiblesalmacenarticulotalla = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiAnalisisDisponiblesAlmacenArticuloTalla", _tianalisisdisponiblesalmacenarticulotalla);
 BA.debugLineNum = 534;BA.debugLine="tiAnalisisDisponiblesAlmacenArticuloTalla.Initial";
Debug.ShouldStop(2097152);
_tianalisisdisponiblesalmacenarticulotalla.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Análisis Disponibles Almacén Artículo Talla")));
 BA.debugLineNum = 535;BA.debugLine="tiAnalisisDisponiblesAlmacenArticuloTalla.Image=i";
Debug.ShouldStop(4194304);
_tianalisisdisponiblesalmacenarticulotalla.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 536;BA.debugLine="tiAnalisisDatos.Children.Add(tiAnalisisDisponible";
Debug.ShouldStop(8388608);
_tianalisisdatos.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tianalisisdisponiblesalmacenarticulotalla.getObject())));
 BA.debugLineNum = 545;BA.debugLine="Dim tiIncidencias As TreeItem";
Debug.ShouldStop(1);
_tiincidencias = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiIncidencias", _tiincidencias);
 BA.debugLineNum = 546;BA.debugLine="tiIncidencias.Initialize(\"tItem\",\"Incidencias\")";
Debug.ShouldStop(2);
_tiincidencias.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Incidencias")));
 BA.debugLineNum = 549;BA.debugLine="Dim BombImg As Image=Utilidades.SetFontToBitmap(C";
Debug.ShouldStop(16);
_bombimg = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
_bombimg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), mainmenu2._utilidades.runMethod(false,"_setfonttobitmap" /*RemoteObject*/ ,(Object)(BA.ObjectToString(mainmenu2.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf690)))))),(Object)(mainmenu2._utilidades.runMethod(false,"_createb4xfont" /*RemoteObject*/ ,(Object)(BA.ObjectToString("materialdesignicons-webfont.ttf")),(Object)(BA.numberCast(float.class, 32)),(Object)(BA.numberCast(float.class, 32)))),(Object)(BA.numberCast(float.class, 32)),(Object)(mainmenu2._xui.getField(true,"Color_Black"))).getObject());Debug.locals.put("BombImg", _bombimg);Debug.locals.put("BombImg", _bombimg);
 BA.debugLineNum = 550;BA.debugLine="tiIncidencias.Image=BombImg";
Debug.ShouldStop(32);
_tiincidencias.runMethod(false,"setImage",(_bombimg.getObject()));
 BA.debugLineNum = 551;BA.debugLine="TreeViewMainMenu.Root.Children.Add(tiIncidencias)";
Debug.ShouldStop(64);
mainmenu2._treeviewmainmenu.runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tiincidencias.getObject())));
 BA.debugLineNum = 553;BA.debugLine="Dim tiIncidenciasProveedor As TreeItem";
Debug.ShouldStop(256);
_tiincidenciasproveedor = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiIncidenciasProveedor", _tiincidenciasproveedor);
 BA.debugLineNum = 554;BA.debugLine="tiIncidenciasProveedor.Initialize(\"tItem\",\"Provee";
Debug.ShouldStop(512);
_tiincidenciasproveedor.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Proveedores")));
 BA.debugLineNum = 555;BA.debugLine="tiIncidenciasProveedor.Image=imgTreeItemGo";
Debug.ShouldStop(1024);
_tiincidenciasproveedor.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 556;BA.debugLine="tiIncidencias.Children.Add(tiIncidenciasProveedor";
Debug.ShouldStop(2048);
_tiincidencias.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tiincidenciasproveedor.getObject())));
 BA.debugLineNum = 558;BA.debugLine="Dim tiIncidenciasProveedorLista As TreeItem";
Debug.ShouldStop(8192);
_tiincidenciasproveedorlista = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiIncidenciasProveedorLista", _tiincidenciasproveedorlista);
 BA.debugLineNum = 559;BA.debugLine="tiIncidenciasProveedorLista.Initialize(\"tItem\",\"I";
Debug.ShouldStop(16384);
_tiincidenciasproveedorlista.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Incidencias Proveedor")));
 BA.debugLineNum = 560;BA.debugLine="tiIncidenciasProveedorLista.Image=imgTreeItemGo";
Debug.ShouldStop(32768);
_tiincidenciasproveedorlista.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 561;BA.debugLine="tiIncidenciasProveedor.Children.Add(tiIncidencias";
Debug.ShouldStop(65536);
_tiincidenciasproveedor.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tiincidenciasproveedorlista.getObject())));
 BA.debugLineNum = 563;BA.debugLine="Dim tiIncidenciasProveedorTaeasPendientes As Tree";
Debug.ShouldStop(262144);
_tiincidenciasproveedortaeaspendientes = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiIncidenciasProveedorTaeasPendientes", _tiincidenciasproveedortaeaspendientes);
 BA.debugLineNum = 564;BA.debugLine="tiIncidenciasProveedorTaeasPendientes.Initialize(";
Debug.ShouldStop(524288);
_tiincidenciasproveedortaeaspendientes.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Tareas Pendientes Incidencias Proveedor")));
 BA.debugLineNum = 565;BA.debugLine="tiIncidenciasProveedorTaeasPendientes.Image=imgTr";
Debug.ShouldStop(1048576);
_tiincidenciasproveedortaeaspendientes.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 566;BA.debugLine="tiIncidenciasProveedor.Children.Add(tiIncidencias";
Debug.ShouldStop(2097152);
_tiincidenciasproveedor.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tiincidenciasproveedortaeaspendientes.getObject())));
 BA.debugLineNum = 570;BA.debugLine="Dim tiIncidenciasCliente As TreeItem";
Debug.ShouldStop(33554432);
_tiincidenciascliente = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiIncidenciasCliente", _tiincidenciascliente);
 BA.debugLineNum = 571;BA.debugLine="tiIncidenciasCliente.Initialize(\"tItem\",\"Clientes";
Debug.ShouldStop(67108864);
_tiincidenciascliente.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Clientes")));
 BA.debugLineNum = 572;BA.debugLine="tiIncidenciasCliente.Image=imgTreeItemGo";
Debug.ShouldStop(134217728);
_tiincidenciascliente.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 573;BA.debugLine="tiIncidencias.Children.Add(tiIncidenciasCliente)";
Debug.ShouldStop(268435456);
_tiincidencias.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tiincidenciascliente.getObject())));
 BA.debugLineNum = 576;BA.debugLine="Dim tiIncidenciasInternas As TreeItem";
Debug.ShouldStop(-2147483648);
_tiincidenciasinternas = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiIncidenciasInternas", _tiincidenciasinternas);
 BA.debugLineNum = 577;BA.debugLine="tiIncidenciasInternas.Initialize(\"tItem\",\"Interna";
Debug.ShouldStop(1);
_tiincidenciasinternas.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Internas")));
 BA.debugLineNum = 578;BA.debugLine="tiIncidenciasInternas.Image=imgTreeItemGo";
Debug.ShouldStop(2);
_tiincidenciasinternas.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 579;BA.debugLine="tiIncidencias.Children.Add(tiIncidenciasInternas)";
Debug.ShouldStop(4);
_tiincidencias.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tiincidenciasinternas.getObject())));
 BA.debugLineNum = 675;BA.debugLine="Dim tiUtilidades As TreeItem";
Debug.ShouldStop(4);
_tiutilidades = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiUtilidades", _tiutilidades);
 BA.debugLineNum = 676;BA.debugLine="tiUtilidades.Initialize(\"tItem\",\"Utilidades\")";
Debug.ShouldStop(8);
_tiutilidades.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Utilidades")));
 BA.debugLineNum = 678;BA.debugLine="tiUtilidades.Image=Main.fx.LoadImage(File.Dirasse";
Debug.ShouldStop(32);
_tiutilidades.runMethod(false,"setImage",(mainmenu2._main._fx /*RemoteObject*/ .runMethod(false,"LoadImage",(Object)(mainmenu2.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("outline_handyman_black_36dp.png"))).getObject()));
 BA.debugLineNum = 679;BA.debugLine="TreeViewMainMenu.Root.Children.Add(tiUtilidades)";
Debug.ShouldStop(64);
mainmenu2._treeviewmainmenu.runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tiutilidades.getObject())));
 BA.debugLineNum = 681;BA.debugLine="Dim tiFicherosCarpetaExcelLinks As TreeItem";
Debug.ShouldStop(256);
_tificheroscarpetaexcellinks = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiFicherosCarpetaExcelLinks", _tificheroscarpetaexcellinks);
 BA.debugLineNum = 682;BA.debugLine="tiFicherosCarpetaExcelLinks.Initialize(\"tItem\",\"C";
Debug.ShouldStop(512);
_tificheroscarpetaexcellinks.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Crear Excel Links Ficheros Carpeta")));
 BA.debugLineNum = 684;BA.debugLine="tiFicherosCarpetaExcelLinks.Image=imgTreeItemGo";
Debug.ShouldStop(2048);
_tificheroscarpetaexcellinks.runMethod(false,"setImage",(_imgtreeitemgo.getObject()));
 BA.debugLineNum = 685;BA.debugLine="tiUtilidades.Children.Add(tiFicherosCarpetaExcelL";
Debug.ShouldStop(4096);
_tiutilidades.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tificheroscarpetaexcellinks.getObject())));
 BA.debugLineNum = 687;BA.debugLine="If Main.DatosUsuario.Administrador Then";
Debug.ShouldStop(16384);
if (mainmenu2._main._datosusuario /*RemoteObject*/ .getField(true,"Administrador" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 688;BA.debugLine="Dim tiPermisosAplicacion As TreeItem";
Debug.ShouldStop(32768);
_tipermisosaplicacion = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiPermisosAplicacion", _tipermisosaplicacion);
 BA.debugLineNum = 689;BA.debugLine="tiPermisosAplicacion.Initialize(\"tItem\",\"Permiso";
Debug.ShouldStop(65536);
_tipermisosaplicacion.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Permisos Aplicacion")));
 BA.debugLineNum = 691;BA.debugLine="tiPermisosAplicacion.Image=Main.fx.LoadImage(Fil";
Debug.ShouldStop(262144);
_tipermisosaplicacion.runMethod(false,"setImage",(mainmenu2._main._fx /*RemoteObject*/ .runMethod(false,"LoadImage",(Object)(mainmenu2.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("outline_vpn_key_black_36dp.png"))).getObject()));
 BA.debugLineNum = 692;BA.debugLine="TreeViewMainMenu.Root.Children.Add(tiPermisosApl";
Debug.ShouldStop(524288);
mainmenu2._treeviewmainmenu.runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tipermisosaplicacion.getObject())));
 };
 BA.debugLineNum = 695;BA.debugLine="Dim tiAcercaDe As TreeItem";
Debug.ShouldStop(4194304);
_tiacercade = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiAcercaDe", _tiacercade);
 BA.debugLineNum = 696;BA.debugLine="tiAcercaDe.Initialize(\"tItem\",\"Acerca De\")";
Debug.ShouldStop(8388608);
_tiacercade.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Acerca De")));
 BA.debugLineNum = 699;BA.debugLine="tiAcercaDe.Image=Main.fx.LoadImage(File.Dirassets";
Debug.ShouldStop(67108864);
_tiacercade.runMethod(false,"setImage",(mainmenu2._main._fx /*RemoteObject*/ .runMethod(false,"LoadImage",(Object)(mainmenu2.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("outline_info_black_36dp.png"))).getObject()));
 BA.debugLineNum = 700;BA.debugLine="TreeViewMainMenu.Root.Children.Add(tiAcercaDe)";
Debug.ShouldStop(134217728);
mainmenu2._treeviewmainmenu.runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tiacercade.getObject())));
 BA.debugLineNum = 702;BA.debugLine="Dim tiSalir As TreeItem";
Debug.ShouldStop(536870912);
_tisalir = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiSalir", _tisalir);
 BA.debugLineNum = 703;BA.debugLine="tiSalir.Initialize(\"tItem\",\"Salir de la aplicació";
Debug.ShouldStop(1073741824);
_tisalir.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Salir de la aplicación")));
 BA.debugLineNum = 706;BA.debugLine="tiSalir.Image=Main.fx.LoadImage(File.Dirassets, \"";
Debug.ShouldStop(2);
_tisalir.runMethod(false,"setImage",(mainmenu2._main._fx /*RemoteObject*/ .runMethod(false,"LoadImage",(Object)(mainmenu2.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("outline_logout_black_36dp.png"))).getObject()));
 BA.debugLineNum = 707;BA.debugLine="TreeViewMainMenu.Root.Children.Add(tiSalir)";
Debug.ShouldStop(4);
mainmenu2._treeviewmainmenu.runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tisalir.getObject())));
 BA.debugLineNum = 750;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _contraeritemschildren(RemoteObject _ti) throws Exception{
try {
		Debug.PushSubsStack("ContraerItemsChildren (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,2191);
if (RapidSub.canDelegate("contraeritemschildren")) { return b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","contraeritemschildren", _ti);}
RemoteObject _mi = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 2191;BA.debugLine="Sub ContraerItemsChildren(ti As TreeItem)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 2192;BA.debugLine="For Each mI As TreeItem In ti.Children";
Debug.ShouldStop(32768);
_mi = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
{
final RemoteObject group1 = _ti.runMethod(false,"getChildren");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_mi = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper"), group1.runMethod(false,"Get",index1));Debug.locals.put("mI", _mi);
Debug.locals.put("mI", _mi);
 BA.debugLineNum = 2194;BA.debugLine="Log(mI.Text)";
Debug.ShouldStop(131072);
mainmenu2.__c.runVoidMethod ("LogImpl","82555907",_mi.runMethod(true,"getText"),0);
 BA.debugLineNum = 2196;BA.debugLine="If mI.Expanded Then";
Debug.ShouldStop(524288);
if (_mi.runMethod(true,"getExpanded").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2197;BA.debugLine="mI.Expanded=False";
Debug.ShouldStop(1048576);
_mi.runMethod(true,"setExpanded",mainmenu2.__c.getField(true,"False"));
 };
 BA.debugLineNum = 2199;BA.debugLine="ContraerItemsChildren(mI)";
Debug.ShouldStop(4194304);
_contraeritemschildren(_mi);
 }
}Debug.locals.put("mI", _mi);
;
 BA.debugLineNum = 2201;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _contraeritemsotrasramas2(RemoteObject _tisel) throws Exception{
try {
		Debug.PushSubsStack("ContraerItemsOtrasRamas2 (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,2174);
if (RapidSub.canDelegate("contraeritemsotrasramas2")) { return b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","contraeritemsotrasramas2", _tisel);}
RemoteObject _tip = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _mi = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("tiSel", _tisel);
 BA.debugLineNum = 2174;BA.debugLine="Sub ContraerItemsOtrasRamas2(tiSel As TreeItem)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 2176;BA.debugLine="Dim tiP As TreeItem=tiSel.Parent";
Debug.ShouldStop(-2147483648);
_tip = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_tip = _tisel.runMethod(false,"getParent");Debug.locals.put("tiP", _tip);Debug.locals.put("tiP", _tip);
 BA.debugLineNum = 2177;BA.debugLine="If tiP.IsInitialized=False Then Return";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_tip.runMethod(true,"IsInitialized"),mainmenu2.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 2178;BA.debugLine="For Each mI As TreeItem In tiP.Children";
Debug.ShouldStop(2);
_mi = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
{
final RemoteObject group3 = _tip.runMethod(false,"getChildren");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_mi = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper"), group3.runMethod(false,"Get",index3));Debug.locals.put("mI", _mi);
Debug.locals.put("mI", _mi);
 BA.debugLineNum = 2180;BA.debugLine="Log(mI.Text)";
Debug.ShouldStop(8);
mainmenu2.__c.runVoidMethod ("LogImpl","82490374",_mi.runMethod(true,"getText"),0);
 BA.debugLineNum = 2182;BA.debugLine="If mI=tiSel Then Continue";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_mi,_tisel)) { 
if (true) continue;};
 BA.debugLineNum = 2183;BA.debugLine="If mI.Expanded Then";
Debug.ShouldStop(64);
if (_mi.runMethod(true,"getExpanded").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2184;BA.debugLine="mI.Expanded=False";
Debug.ShouldStop(128);
_mi.runMethod(true,"setExpanded",mainmenu2.__c.getField(true,"False"));
 };
 }
}Debug.locals.put("mI", _mi);
;
 BA.debugLineNum = 2188;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _countvisiblechildren(RemoteObject _ti,RemoteObject _target,RemoteObject _found) throws Exception{
try {
		Debug.PushSubsStack("CountVisibleChildren (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,1689);
if (RapidSub.canDelegate("countvisiblechildren")) { return b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","countvisiblechildren", _ti, _target, _found);}
RemoteObject _c = RemoteObject.createImmutable(0);
RemoteObject _child = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("ti", _ti);
Debug.locals.put("Target", _target);
Debug.locals.put("Found", _found);
 BA.debugLineNum = 1689;BA.debugLine="Sub CountVisibleChildren(ti As TreeItem, Target As";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1690;BA.debugLine="Dim c As Int = 1";
Debug.ShouldStop(33554432);
_c = BA.numberCast(int.class, 1);Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 1691;BA.debugLine="If ti = Target Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_ti,_target)) { 
 BA.debugLineNum = 1692;BA.debugLine="Found(0) = True";
Debug.ShouldStop(134217728);
_found.setArrayElement (mainmenu2.__c.getField(true,"True"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 1693;BA.debugLine="Return -1";
Debug.ShouldStop(268435456);
if (true) return BA.numberCast(int.class, -(double) (0 + 1));
 };
 BA.debugLineNum = 1695;BA.debugLine="If ti.Expanded Then";
Debug.ShouldStop(1073741824);
if (_ti.runMethod(true,"getExpanded").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1696;BA.debugLine="For Each child As TreeItem In ti.Children";
Debug.ShouldStop(-2147483648);
_child = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
{
final RemoteObject group7 = _ti.runMethod(false,"getChildren");
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_child = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper"), group7.runMethod(false,"Get",index7));Debug.locals.put("child", _child);
Debug.locals.put("child", _child);
 BA.debugLineNum = 1697;BA.debugLine="c = c + CountVisibleChildren(child, Target, Fou";
Debug.ShouldStop(1);
_c = RemoteObject.solve(new RemoteObject[] {_c,_countvisiblechildren(_child,_target,_found)}, "+",1, 1);Debug.locals.put("c", _c);
 BA.debugLineNum = 1698;BA.debugLine="If Found(0) = True Then Return c";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_found.getArrayElement(true,BA.numberCast(int.class, 0)),mainmenu2.__c.getField(true,"True"))) { 
if (true) return _c;};
 }
}Debug.locals.put("child", _child);
;
 };
 BA.debugLineNum = 1701;BA.debugLine="Return c";
Debug.ShouldStop(16);
if (true) return _c;
 BA.debugLineNum = 1702;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _crearaccesosdirectositem3(RemoteObject _tisel) throws Exception{
try {
		Debug.PushSubsStack("CrearAccesosDirectosItem3 (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,2004);
if (RapidSub.canDelegate("crearaccesosdirectositem3")) { return b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","crearaccesosdirectositem3", _tisel);}
RemoteObject _imgtreeitemgo = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
RemoteObject _stextobbcodeview = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _niveltisel = RemoteObject.createImmutable(0);
RemoteObject _textsizetisel = RemoteObject.createImmutable(0f);
RemoteObject _textsizenivel0 = RemoteObject.createImmutable(0f);
RemoteObject _textsizenivel1 = RemoteObject.createImmutable(0f);
RemoteObject _textsizenivel2 = RemoteObject.createImmutable(0f);
RemoteObject _sindentniveltisel = RemoteObject.createImmutable("");
RemoteObject _sindentnivel0 = RemoteObject.createImmutable("");
RemoteObject _sindentnivel1 = RemoteObject.createImmutable("");
RemoteObject _sindentnivel2 = RemoteObject.createImmutable("");
RemoteObject _tich1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tich2 = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tich3 = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("tISel", _tisel);
 BA.debugLineNum = 2004;BA.debugLine="Sub CrearAccesosDirectosItem3(tISel As TreeItem)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 2006;BA.debugLine="Dim imgTreeItemGo As Image=Main.fx.LoadImage(File";
Debug.ShouldStop(2097152);
_imgtreeitemgo = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
_imgtreeitemgo = mainmenu2._main._fx /*RemoteObject*/ .runMethod(false,"LoadImage",(Object)(mainmenu2.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("outline_arrow_circle_right_black_18dp.png")));Debug.locals.put("imgTreeItemGo", _imgtreeitemgo);Debug.locals.put("imgTreeItemGo", _imgtreeitemgo);
 BA.debugLineNum = 2008;BA.debugLine="Dim sTextoBBCodeView As StringBuilder";
Debug.ShouldStop(8388608);
_stextobbcodeview = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sTextoBBCodeView", _stextobbcodeview);
 BA.debugLineNum = 2009;BA.debugLine="sTextoBBCodeView.Initialize";
Debug.ShouldStop(16777216);
_stextobbcodeview.runVoidMethod ("Initialize");
 BA.debugLineNum = 2010;BA.debugLine="BBCodeViewElementosMainMenu.Text=$\"\"$";
Debug.ShouldStop(33554432);
mainmenu2._bbcodeviewelementosmainmenu.runClassMethod (b4j.docU.bbcodeview.class, "_settext" /*RemoteObject*/ ,(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2015;BA.debugLine="Dim NivelTiSel As Int=NivelTreeItem(tISel)";
Debug.ShouldStop(1073741824);
_niveltisel = _niveltreeitem(_tisel);Debug.locals.put("NivelTiSel", _niveltisel);Debug.locals.put("NivelTiSel", _niveltisel);
 BA.debugLineNum = 2017;BA.debugLine="Dim TextSizeTISel As Float";
Debug.ShouldStop(1);
_textsizetisel = RemoteObject.createImmutable(0f);Debug.locals.put("TextSizeTISel", _textsizetisel);
 BA.debugLineNum = 2018;BA.debugLine="Dim TextSizeNivel0 As Float=18";
Debug.ShouldStop(2);
_textsizenivel0 = BA.numberCast(float.class, 18);Debug.locals.put("TextSizeNivel0", _textsizenivel0);Debug.locals.put("TextSizeNivel0", _textsizenivel0);
 BA.debugLineNum = 2019;BA.debugLine="Dim TextSizeNivel1 As Float=16";
Debug.ShouldStop(4);
_textsizenivel1 = BA.numberCast(float.class, 16);Debug.locals.put("TextSizeNivel1", _textsizenivel1);Debug.locals.put("TextSizeNivel1", _textsizenivel1);
 BA.debugLineNum = 2020;BA.debugLine="Dim TextSizeNivel2 As Float=14";
Debug.ShouldStop(8);
_textsizenivel2 = BA.numberCast(float.class, 14);Debug.locals.put("TextSizeNivel2", _textsizenivel2);Debug.locals.put("TextSizeNivel2", _textsizenivel2);
 BA.debugLineNum = 2021;BA.debugLine="Dim sIndentNivelTISel As String";
Debug.ShouldStop(16);
_sindentniveltisel = RemoteObject.createImmutable("");Debug.locals.put("sIndentNivelTISel", _sindentniveltisel);
 BA.debugLineNum = 2022;BA.debugLine="Dim sIndentNivel0 As String=$\"${TAB}\"$";
Debug.ShouldStop(32);
_sindentnivel0 = (RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((mainmenu2.__c.getField(true,"TAB")))),RemoteObject.createImmutable("")));Debug.locals.put("sIndentNivel0", _sindentnivel0);Debug.locals.put("sIndentNivel0", _sindentnivel0);
 BA.debugLineNum = 2023;BA.debugLine="Dim sIndentNivel1 As String=$\"${TAB}${TAB}\"$";
Debug.ShouldStop(64);
_sindentnivel1 = (RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((mainmenu2.__c.getField(true,"TAB")))),RemoteObject.createImmutable(""),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((mainmenu2.__c.getField(true,"TAB")))),RemoteObject.createImmutable("")));Debug.locals.put("sIndentNivel1", _sindentnivel1);Debug.locals.put("sIndentNivel1", _sindentnivel1);
 BA.debugLineNum = 2024;BA.debugLine="Dim sIndentNivel2 As String=$\"${TAB}${TAB}${TAB}\"";
Debug.ShouldStop(128);
_sindentnivel2 = (RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((mainmenu2.__c.getField(true,"TAB")))),RemoteObject.createImmutable(""),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((mainmenu2.__c.getField(true,"TAB")))),RemoteObject.createImmutable(""),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((mainmenu2.__c.getField(true,"TAB")))),RemoteObject.createImmutable("")));Debug.locals.put("sIndentNivel2", _sindentnivel2);Debug.locals.put("sIndentNivel2", _sindentnivel2);
 BA.debugLineNum = 2026;BA.debugLine="If tISel<>TreeViewMainMenu.Root Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("!",_tisel,mainmenu2._treeviewmainmenu.runMethod(false,"getRoot"))) { 
 BA.debugLineNum = 2027;BA.debugLine="If tISel.Children.Size=0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_tisel.runMethod(false,"getChildren").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2028;BA.debugLine="sTextoBBCodeView.Append($\"${sIndentNivel0}[Vert";
Debug.ShouldStop(2048);
_stextobbcodeview.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sindentnivel0))),RemoteObject.createImmutable("[Vertical=5][img dir=\""),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((mainmenu2.__c.getField(false,"File").runMethod(true,"getDirAssets")))),RemoteObject.createImmutable("\" FileName=\"outline_arrow_circle_right_black_24dp.png\" width=24/][/vertical] [TextSize="),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((_textsizenivel0))),RemoteObject.createImmutable("][url]"),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tisel.runMethod(true,"getText")))),RemoteObject.createImmutable("[/url][/textsize]\n"),RemoteObject.createImmutable("	")))));
 }else {
 BA.debugLineNum = 2031;BA.debugLine="sTextoBBCodeView.Append($\"${sIndentNivel0}[Text";
Debug.ShouldStop(16384);
_stextobbcodeview.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sindentnivel0))),RemoteObject.createImmutable("[TextSize="),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((_textsizenivel0))),RemoteObject.createImmutable("][Color=#191970][b]"),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tisel.runMethod(true,"getText")))),RemoteObject.createImmutable("[/b][/color][/textsize]\n"),RemoteObject.createImmutable("	")))));
 };
 BA.debugLineNum = 2035;BA.debugLine="For Each tiCh1 As TreeItem In tISel.Children";
Debug.ShouldStop(262144);
_tich1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
{
final RemoteObject group20 = _tisel.runMethod(false,"getChildren");
final int groupLen20 = group20.runMethod(true,"getSize").<Integer>get()
;int index20 = 0;
;
for (; index20 < groupLen20;index20++){
_tich1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper"), group20.runMethod(false,"Get",index20));Debug.locals.put("tiCh1", _tich1);
Debug.locals.put("tiCh1", _tich1);
 BA.debugLineNum = 2036;BA.debugLine="If tiCh1.Children.Size=0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_tich1.runMethod(false,"getChildren").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2037;BA.debugLine="sTextoBBCodeView.Append($\"${sIndentNivel1}[Ver";
Debug.ShouldStop(1048576);
_stextobbcodeview.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sindentnivel1))),RemoteObject.createImmutable("[Vertical=5][img dir=\""),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((mainmenu2.__c.getField(false,"File").runMethod(true,"getDirAssets")))),RemoteObject.createImmutable("\" FileName=\"outline_arrow_circle_right_black_24dp.png\" width=24/][/vertical] [TextSize="),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((_textsizenivel1))),RemoteObject.createImmutable("][url]"),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tich1.runMethod(true,"getText")))),RemoteObject.createImmutable("[/url][/textsize]\n"),RemoteObject.createImmutable("	")))));
 }else {
 BA.debugLineNum = 2040;BA.debugLine="sTextoBBCodeView.Append($\"${sIndentNivel1}[Tex";
Debug.ShouldStop(8388608);
_stextobbcodeview.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sindentnivel1))),RemoteObject.createImmutable("[TextSize="),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((_textsizenivel1))),RemoteObject.createImmutable("][Color=#191970][b]"),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tich1.runMethod(true,"getText")))),RemoteObject.createImmutable("[/b][/color][/textsize]\n"),RemoteObject.createImmutable("	")))));
 };
 BA.debugLineNum = 2044;BA.debugLine="Log(\"tiCh.Children \" & tiCh1.Children)";
Debug.ShouldStop(134217728);
mainmenu2.__c.runVoidMethod ("LogImpl","82031656",RemoteObject.concat(RemoteObject.createImmutable("tiCh.Children "),_tich1.runMethod(false,"getChildren")),0);
 BA.debugLineNum = 2045;BA.debugLine="For Each tiCh2 As TreeItem In tiCh1.Children";
Debug.ShouldStop(268435456);
_tich2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
{
final RemoteObject group27 = _tich1.runMethod(false,"getChildren");
final int groupLen27 = group27.runMethod(true,"getSize").<Integer>get()
;int index27 = 0;
;
for (; index27 < groupLen27;index27++){
_tich2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper"), group27.runMethod(false,"Get",index27));Debug.locals.put("tiCh2", _tich2);
Debug.locals.put("tiCh2", _tich2);
 BA.debugLineNum = 2046;BA.debugLine="Log(\"tiCh2.Children \" & tiCh2.Children)";
Debug.ShouldStop(536870912);
mainmenu2.__c.runVoidMethod ("LogImpl","82031658",RemoteObject.concat(RemoteObject.createImmutable("tiCh2.Children "),_tich2.runMethod(false,"getChildren")),0);
 BA.debugLineNum = 2047;BA.debugLine="If tiCh2.Children.Size=0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_tich2.runMethod(false,"getChildren").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2048;BA.debugLine="sTextoBBCodeView.Append($\"${sIndentNivel2}[Ve";
Debug.ShouldStop(-2147483648);
_stextobbcodeview.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sindentnivel2))),RemoteObject.createImmutable("[Vertical=5][img dir=\""),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((mainmenu2.__c.getField(false,"File").runMethod(true,"getDirAssets")))),RemoteObject.createImmutable("\" FileName=\"outline_arrow_circle_right_black_18dp.png\" width=18/][/vertical] [TextSize="),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((_textsizenivel2))),RemoteObject.createImmutable("][url]"),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tich2.runMethod(true,"getText")))),RemoteObject.createImmutable("[/url][/textsize]\n"),RemoteObject.createImmutable("	")))));
 }else {
 BA.debugLineNum = 2051;BA.debugLine="sTextoBBCodeView.Append($\"${sIndentNivel2}[Te";
Debug.ShouldStop(4);
_stextobbcodeview.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sindentnivel2))),RemoteObject.createImmutable("[TextSize="),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((_textsizenivel2))),RemoteObject.createImmutable("][Color=#191970][b][url]"),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tich2.runMethod(true,"getText")))),RemoteObject.createImmutable("[/url][/b][/color][/textsize]\n"),RemoteObject.createImmutable("	")))));
 };
 }
}Debug.locals.put("tiCh2", _tich2);
;
 }
}Debug.locals.put("tiCh1", _tich1);
;
 }else {
 BA.debugLineNum = 2059;BA.debugLine="For Each tiCh1 As TreeItem In tISel.Children";
Debug.ShouldStop(1024);
_tich1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
{
final RemoteObject group37 = _tisel.runMethod(false,"getChildren");
final int groupLen37 = group37.runMethod(true,"getSize").<Integer>get()
;int index37 = 0;
;
for (; index37 < groupLen37;index37++){
_tich1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper"), group37.runMethod(false,"Get",index37));Debug.locals.put("tiCh1", _tich1);
Debug.locals.put("tiCh1", _tich1);
 BA.debugLineNum = 2060;BA.debugLine="If tiCh1.Children.Size=0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_tich1.runMethod(false,"getChildren").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2061;BA.debugLine="sTextoBBCodeView.Append($\"${sIndentNivel0}[Ver";
Debug.ShouldStop(4096);
_stextobbcodeview.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sindentnivel0))),RemoteObject.createImmutable("[Vertical=5][img dir=\""),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((mainmenu2.__c.getField(false,"File").runMethod(true,"getDirAssets")))),RemoteObject.createImmutable("\" FileName=\"outline_arrow_circle_right_black_24dp.png\" width=24/][/vertical] [TextSize="),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((_textsizenivel0))),RemoteObject.createImmutable("][url]"),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tich1.runMethod(true,"getText")))),RemoteObject.createImmutable("[/url][/textsize]\n"),RemoteObject.createImmutable("	")))));
 }else {
 BA.debugLineNum = 2064;BA.debugLine="sTextoBBCodeView.Append($\"${sIndentNivel0}[Tex";
Debug.ShouldStop(32768);
_stextobbcodeview.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sindentnivel0))),RemoteObject.createImmutable("[TextSize="),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((_textsizenivel0))),RemoteObject.createImmutable("][Color=#191970][b]"),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tich1.runMethod(true,"getText")))),RemoteObject.createImmutable("[/b][/color][/textsize]\n"),RemoteObject.createImmutable("	")))));
 };
 BA.debugLineNum = 2068;BA.debugLine="Log(\"tiCh.Children \" & tiCh1.Children)";
Debug.ShouldStop(524288);
mainmenu2.__c.runVoidMethod ("LogImpl","82031680",RemoteObject.concat(RemoteObject.createImmutable("tiCh.Children "),_tich1.runMethod(false,"getChildren")),0);
 BA.debugLineNum = 2069;BA.debugLine="For Each tiCh2 As TreeItem In tiCh1.Children";
Debug.ShouldStop(1048576);
_tich2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
{
final RemoteObject group44 = _tich1.runMethod(false,"getChildren");
final int groupLen44 = group44.runMethod(true,"getSize").<Integer>get()
;int index44 = 0;
;
for (; index44 < groupLen44;index44++){
_tich2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper"), group44.runMethod(false,"Get",index44));Debug.locals.put("tiCh2", _tich2);
Debug.locals.put("tiCh2", _tich2);
 BA.debugLineNum = 2070;BA.debugLine="Log(\"tiCh1.Children \" & tiCh2.Children)";
Debug.ShouldStop(2097152);
mainmenu2.__c.runVoidMethod ("LogImpl","82031682",RemoteObject.concat(RemoteObject.createImmutable("tiCh1.Children "),_tich2.runMethod(false,"getChildren")),0);
 BA.debugLineNum = 2071;BA.debugLine="If tiCh2.Children.Size=0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_tich2.runMethod(false,"getChildren").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2072;BA.debugLine="sTextoBBCodeView.Append($\"${sIndentNivel1}[Ve";
Debug.ShouldStop(8388608);
_stextobbcodeview.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sindentnivel1))),RemoteObject.createImmutable("[Vertical=5][img dir=\""),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((mainmenu2.__c.getField(false,"File").runMethod(true,"getDirAssets")))),RemoteObject.createImmutable("\" FileName=\"outline_arrow_circle_right_black_24dp.png\" width=24/][/vertical] [TextSize="),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((_textsizenivel1))),RemoteObject.createImmutable("][url]"),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tich2.runMethod(true,"getText")))),RemoteObject.createImmutable("[/url][/textsize]\n"),RemoteObject.createImmutable("	")))));
 }else {
 BA.debugLineNum = 2075;BA.debugLine="sTextoBBCodeView.Append($\"${sIndentNivel1}[Te";
Debug.ShouldStop(67108864);
_stextobbcodeview.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sindentnivel1))),RemoteObject.createImmutable("[TextSize="),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((_textsizenivel1))),RemoteObject.createImmutable("][Color=#191970][b]"),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tich2.runMethod(true,"getText")))),RemoteObject.createImmutable("[/b][/color][/textsize]\n"),RemoteObject.createImmutable("	")))));
 BA.debugLineNum = 2077;BA.debugLine="For Each tiCh3 As TreeItem In tiCh2.Children";
Debug.ShouldStop(268435456);
_tich3 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
{
final RemoteObject group50 = _tich2.runMethod(false,"getChildren");
final int groupLen50 = group50.runMethod(true,"getSize").<Integer>get()
;int index50 = 0;
;
for (; index50 < groupLen50;index50++){
_tich3 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper"), group50.runMethod(false,"Get",index50));Debug.locals.put("tiCh3", _tich3);
Debug.locals.put("tiCh3", _tich3);
 BA.debugLineNum = 2078;BA.debugLine="Log(\"tiCh3.Children \" & tiCh3.Children)";
Debug.ShouldStop(536870912);
mainmenu2.__c.runVoidMethod ("LogImpl","82031690",RemoteObject.concat(RemoteObject.createImmutable("tiCh3.Children "),_tich3.runMethod(false,"getChildren")),0);
 BA.debugLineNum = 2079;BA.debugLine="If tiCh3.Children.Size=0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_tich3.runMethod(false,"getChildren").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2081;BA.debugLine="sTextoBBCodeView.Append($\"${sIndentNivel2}[";
Debug.ShouldStop(1);
_stextobbcodeview.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sindentnivel2))),RemoteObject.createImmutable("[Vertical=5][img dir=\""),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((mainmenu2.__c.getField(false,"File").runMethod(true,"getDirAssets")))),RemoteObject.createImmutable("\" FileName=\"outline_arrow_circle_right_black_18dp.png\" width=18/][/vertical] [TextSize="),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((_textsizenivel2))),RemoteObject.createImmutable("][url]"),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tich3.runMethod(true,"getText")))),RemoteObject.createImmutable("[/url][/textsize]\n"),RemoteObject.createImmutable("	")))));
 }else {
 BA.debugLineNum = 2084;BA.debugLine="sTextoBBCodeView.Append($\"${sIndentNivel2}[";
Debug.ShouldStop(8);
_stextobbcodeview.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sindentnivel2))),RemoteObject.createImmutable("[TextSize="),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((_textsizenivel2))),RemoteObject.createImmutable("][Color=#191970][b][url]"),mainmenu2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tich3.runMethod(true,"getText")))),RemoteObject.createImmutable("[/url][/b][/color][/textsize]\n"),RemoteObject.createImmutable("	")))));
 };
 }
}Debug.locals.put("tiCh3", _tich3);
;
 };
 }
}Debug.locals.put("tiCh2", _tich2);
;
 }
}Debug.locals.put("tiCh1", _tich1);
;
 };
 BA.debugLineNum = 2095;BA.debugLine="BBCodeViewElementosMainMenu.Text=sTextoBBCodeView";
Debug.ShouldStop(16384);
mainmenu2._bbcodeviewelementosmainmenu.runClassMethod (b4j.docU.bbcodeview.class, "_settext" /*RemoteObject*/ ,_stextobbcodeview.runMethod(true,"ToString"));
 BA.debugLineNum = 2096;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _crearexcellinksficheroscarpeta() throws Exception{
try {
		Debug.PushSubsStack("CrearExcelLinksFicherosCarpeta (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,1758);
if (RapidSub.canDelegate("crearexcellinksficheroscarpeta")) { b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","crearexcellinksficheroscarpeta"); return;}
ResumableSub_CrearExcelLinksFicherosCarpeta rsub = new ResumableSub_CrearExcelLinksFicherosCarpeta(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CrearExcelLinksFicherosCarpeta extends BA.ResumableSub {
public ResumableSub_CrearExcelLinksFicherosCarpeta(b4j.docU.mainmenu2 parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.mainmenu2 parent;
RemoteObject _sres = RemoteObject.createImmutable("");
RemoteObject _permisomodulousuario = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _userdocfolder = RemoteObject.createImmutable("");
RemoteObject _dirch = RemoteObject.declareNull("anywheresoftware.b4j.objects.DirectoryChooserWrapper");
RemoteObject _searchdirname = RemoteObject.createImmutable("");
RemoteObject _wcl = RemoteObject.declareNull("b4j.docU.wildcardlisting");
RemoteObject _filelisting = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _fc = RemoteObject.declareNull("anywheresoftware.b4j.objects.FileChooserWrapper");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _nombreficheroexcel = RemoteObject.createImmutable("");
RemoteObject _dirficheroexcel = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
int step29;
int limit29;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CrearExcelLinksFicherosCarpeta (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,1758);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1782;BA.debugLine="jamLoadingIndicator1.show";
Debug.ShouldStop(2097152);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 1783;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsuari";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "crearexcellinksficheroscarpeta"), parent._utilidades.runMethod(false,"_checkpermisosaplicacionusuarioobjetopermiso" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("PermisosAplicacion")),(Object)(parent._main._nombreaplicacion /*RemoteObject*/ ),(Object)(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("CrearExcelLinksFicherosCarpeta"))));
this.state = 44;
return;
case 44:
//C
this.state = 1;
_sres = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sRes", _sres);
;
 BA.debugLineNum = 1784;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(8388608);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1785;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\" The";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("NO")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("ERROR")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("DENIED"))) { 
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
 BA.debugLineNum = 1786;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
Debug.ShouldStop(33554432);
_permisomodulousuario = _sres;Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);
 BA.debugLineNum = 1788;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Crear exce";
Debug.ShouldStop(134217728);
_msa = parent._xui.runMethod(false,"Msgbox2Async",mainmenu2.ba,(Object)(BA.ObjectToString("¿Crear excel con los nombres de ficheros contenidos en la carpeta seleccionada como links?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1789;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "crearexcellinksficheroscarpeta"), _msa);
this.state = 45;
return;
case 45:
//C
this.state = 7;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1790;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(536870912);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 1792;BA.debugLine="Dim UserDocFolder As String=Utilidades.FindUserDo";
Debug.ShouldStop(-2147483648);
_userdocfolder = parent._utilidades.runMethod(true,"_finduserdocumentsfolder" /*RemoteObject*/ );Debug.locals.put("UserDocFolder", _userdocfolder);Debug.locals.put("UserDocFolder", _userdocfolder);
 BA.debugLineNum = 1794;BA.debugLine="Dim DirCh As DirectoryChooser";
Debug.ShouldStop(2);
_dirch = RemoteObject.createNew ("anywheresoftware.b4j.objects.DirectoryChooserWrapper");Debug.locals.put("DirCh", _dirch);
 BA.debugLineNum = 1795;BA.debugLine="DirCh.Initialize";
Debug.ShouldStop(4);
_dirch.runVoidMethod ("Initialize");
 BA.debugLineNum = 1796;BA.debugLine="DirCh.InitialDirectory=UserDocFolder";
Debug.ShouldStop(8);
_dirch.runMethod(true,"setInitialDirectory",_userdocfolder);
 BA.debugLineNum = 1797;BA.debugLine="Dim SearchDirName As String = DirCh.Show(frm)";
Debug.ShouldStop(16);
_searchdirname = _dirch.runMethodAndSync(true,"Show",(Object)(parent._frm));Debug.locals.put("SearchDirName", _searchdirname);Debug.locals.put("SearchDirName", _searchdirname);
 BA.debugLineNum = 1798;BA.debugLine="If SearchDirName=\"\" Then Return";
Debug.ShouldStop(32);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_searchdirname,BA.ObjectToString(""))) { 
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
 BA.debugLineNum = 1799;BA.debugLine="Log(\"DirName: \" & SearchDirName)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","81900585",RemoteObject.concat(RemoteObject.createImmutable("DirName: "),_searchdirname),0);
 BA.debugLineNum = 1801;BA.debugLine="Dim wcl As wildcardlisting";
Debug.ShouldStop(256);
_wcl = RemoteObject.createNew ("b4j.docU.wildcardlisting");Debug.locals.put("wcl", _wcl);
 BA.debugLineNum = 1803;BA.debugLine="If File.Exists(SearchDirName,\"\") =False Then";
Debug.ShouldStop(1024);
if (true) break;

case 19:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_searchdirname),(Object)(RemoteObject.createImmutable(""))),parent.__c.getField(true,"False"))) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 28;
 BA.debugLineNum = 1804;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.default";
Debug.ShouldStop(2048);
parent._frm.runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",parent._fx.getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 1805;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(4096);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible acceder a la carpeta "),_searchdirname)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1806;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "crearexcellinksficheroscarpeta"), _msa);
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
 BA.debugLineNum = 1808;BA.debugLine="wcl.Initialize(Me,\"wcl\")";
Debug.ShouldStop(32768);
_wcl.runClassMethod (b4j.docU.wildcardlisting.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba,(Object)(mainmenu2.getObject()),(Object)(RemoteObject.createImmutable("wcl")));
 BA.debugLineNum = 1809;BA.debugLine="wcl.ClearLists";
Debug.ShouldStop(65536);
_wcl.runClassMethod (b4j.docU.wildcardlisting.class, "_clearlists" /*RemoteObject*/ );
 BA.debugLineNum = 1810;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.WAIT";
Debug.ShouldStop(131072);
parent._frm.runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",parent._fx.getField(false,"Cursors").getField(false,"WAIT"));
 BA.debugLineNum = 1811;BA.debugLine="wcl.ListFiles(SearchDirName,True,\"*.*\",True,True";
Debug.ShouldStop(262144);
_wcl.runClassMethod (b4j.docU.wildcardlisting.class, "_listfiles" /*RemoteObject*/ ,(Object)(_searchdirname),(Object)(parent.__c.getField(true,"True")),(Object)(BA.ObjectToString("*.*")),(Object)(parent.__c.getField(true,"True")),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 1812;BA.debugLine="wait for wcl_ListFilesFinish(FileListing As List";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","wcl_listfilesfinish", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "crearexcellinksficheroscarpeta"), null);
this.state = 47;
return;
case 47:
//C
this.state = 24;
_filelisting = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("FileListing", _filelisting);
;
 BA.debugLineNum = 1813;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
Debug.ShouldStop(1048576);
parent._frm.runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",parent._fx.getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 1814;BA.debugLine="Log(\"wcl_ListFilesFinish(\" & FileListing.Size &";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","81900600",RemoteObject.concat(RemoteObject.createImmutable("wcl_ListFilesFinish("),_filelisting.runMethod(true,"getSize"),RemoteObject.createImmutable(")")),0);
 BA.debugLineNum = 1815;BA.debugLine="For i = 0 To FileListing.Size -1";
Debug.ShouldStop(4194304);
if (true) break;

case 24:
//for
this.state = 27;
step29 = 1;
limit29 = RemoteObject.solve(new RemoteObject[] {_filelisting.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 26:
//C
this.state = 49;
 BA.debugLineNum = 1816;BA.debugLine="Log(FileListing.Get(i))";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","81900602",BA.ObjectToString(_filelisting.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),0);
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
Debug.locals.put("i", _i);
;
 if (true) break;
;
 BA.debugLineNum = 1821;BA.debugLine="If FileListing.Size=0 Then";
Debug.ShouldStop(268435456);

case 28:
//if
this.state = 31;
if (RemoteObject.solveBoolean("=",_filelisting.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 1822;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La carpeta se";
Debug.ShouldStop(536870912);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("La carpeta seleccionada ("),_searchdirname,RemoteObject.createImmutable(") no contiene ficheros."))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1823;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "crearexcellinksficheroscarpeta"), _msa);
this.state = 50;
return;
case 50:
//C
this.state = 31;
;
 BA.debugLineNum = 1824;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return ;
 if (true) break;

case 31:
//C
this.state = 32;
;
 BA.debugLineNum = 1827;BA.debugLine="Dim fc As FileChooser";
Debug.ShouldStop(4);
_fc = RemoteObject.createNew ("anywheresoftware.b4j.objects.FileChooserWrapper");Debug.locals.put("fc", _fc);
 BA.debugLineNum = 1828;BA.debugLine="fc.Initialize";
Debug.ShouldStop(8);
_fc.runVoidMethod ("Initialize");
 BA.debugLineNum = 1829;BA.debugLine="fc.Title=\"Indica Fichero Excel destino\"";
Debug.ShouldStop(16);
_fc.runMethod(true,"setTitle",BA.ObjectToString("Indica Fichero Excel destino"));
 BA.debugLineNum = 1830;BA.debugLine="fc.SetExtensionFilter(\"Ficheros Excel\", Array As";
Debug.ShouldStop(32);
_fc.runVoidMethod ("SetExtensionFilter",(Object)(BA.ObjectToString("Ficheros Excel")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("*.xlsx"),BA.ObjectToString("*.xlsm"),RemoteObject.createImmutable("*.xls")})))));
 BA.debugLineNum = 1832;BA.debugLine="fc.InitialDirectory=UserDocFolder";
Debug.ShouldStop(128);
_fc.runMethod(true,"setInitialDirectory",_userdocfolder);
 BA.debugLineNum = 1833;BA.debugLine="Dim fileName As String = fc.ShowSave(frm)";
Debug.ShouldStop(256);
_filename = _fc.runMethodAndSync(true,"ShowSave",(Object)(parent._frm));Debug.locals.put("fileName", _filename);Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 1834;BA.debugLine="If fileName = \"\" Then Return";
Debug.ShouldStop(512);
if (true) break;

case 32:
//if
this.state = 37;
if (RemoteObject.solveBoolean("=",_filename,BA.ObjectToString(""))) { 
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
 BA.debugLineNum = 1836;BA.debugLine="Dim NombreFicheroExcel As String=File.GetName(fil";
Debug.ShouldStop(2048);
_nombreficheroexcel = parent.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_filename));Debug.locals.put("NombreFicheroExcel", _nombreficheroexcel);Debug.locals.put("NombreFicheroExcel", _nombreficheroexcel);
 BA.debugLineNum = 1837;BA.debugLine="Dim DirFicheroExcel As String=File.GetFileParent(";
Debug.ShouldStop(4096);
_dirficheroexcel = parent.__c.getField(false,"File").runMethod(true,"GetFileParent",(Object)(_filename));Debug.locals.put("DirFicheroExcel", _dirficheroexcel);Debug.locals.put("DirFicheroExcel", _dirficheroexcel);
 BA.debugLineNum = 1839;BA.debugLine="wait For (ExportarExcelFicherosCarpeta(DirFichero";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","complete", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "crearexcellinksficheroscarpeta"), _exportarexcelficheroscarpeta(_dirficheroexcel,_nombreficheroexcel,_filelisting));
this.state = 51;
return;
case 51:
//C
this.state = 38;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1840;BA.debugLine="If Success Then";
Debug.ShouldStop(32768);
if (true) break;

case 38:
//if
this.state = 43;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 40;
}else {
this.state = 42;
}if (true) break;

case 40:
//C
this.state = 43;
 BA.debugLineNum = 1841;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Fichero excel";
Debug.ShouldStop(65536);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Fichero excel "),_filename,RemoteObject.createImmutable(" grabado."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1842;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "crearexcellinksficheroscarpeta"), _msa);
this.state = 52;
return;
case 52:
//C
this.state = 43;
;
 BA.debugLineNum = 1843;BA.debugLine="fx.ShowExternalDocument(File.GetUri(DirFicheroEx";
Debug.ShouldStop(262144);
parent._fx.runVoidMethod ("ShowExternalDocument",(Object)(parent.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(_dirficheroexcel),(Object)(_nombreficheroexcel))));
 BA.debugLineNum = 1844;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return ;
 if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 1846;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(2097152);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible grabar el fichero. Verifica si tienes excel en el equipo, y que no esté abierto ya un fichero con el nombre "),_nombreficheroexcel)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1847;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "crearexcellinksficheroscarpeta"), _msa);
this.state = 53;
return;
case 53:
//C
this.state = 43;
;
 BA.debugLineNum = 1848;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return ;
 if (true) break;

case 43:
//C
this.state = -1;
;
 BA.debugLineNum = 1851;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _wcl_listfilesfinish(RemoteObject _filelisting) throws Exception{
}
public static RemoteObject  _crearlistaparentsmenuitem(RemoteObject _tior) throws Exception{
try {
		Debug.PushSubsStack("CrearListaParentsMenuItem (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,2112);
if (RapidSub.canDelegate("crearlistaparentsmenuitem")) { return b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","crearlistaparentsmenuitem", _tior);}
RemoteObject _lstparents = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _numniveles = RemoteObject.createImmutable(0);
RemoteObject _tip = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("tiOr", _tior);
 BA.debugLineNum = 2112;BA.debugLine="Sub CrearListaParentsMenuItem(tiOr As TreeItem) As";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 2113;BA.debugLine="Dim lstParents As List";
Debug.ShouldStop(1);
_lstparents = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstParents", _lstparents);
 BA.debugLineNum = 2114;BA.debugLine="lstParents.Initialize";
Debug.ShouldStop(2);
_lstparents.runVoidMethod ("Initialize");
 BA.debugLineNum = 2115;BA.debugLine="Dim NumNiveles As Int";
Debug.ShouldStop(4);
_numniveles = RemoteObject.createImmutable(0);Debug.locals.put("NumNiveles", _numniveles);
 BA.debugLineNum = 2116;BA.debugLine="Dim tiP As TreeItem=tiOr.Parent";
Debug.ShouldStop(8);
_tip = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_tip = _tior.runMethod(false,"getParent");Debug.locals.put("tiP", _tip);Debug.locals.put("tiP", _tip);
 BA.debugLineNum = 2117;BA.debugLine="If tiP.IsInitialized Then";
Debug.ShouldStop(16);
if (_tip.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2119;BA.debugLine="Log(\"Parent treeitem: \" & tiP.Text)";
Debug.ShouldStop(64);
mainmenu2.__c.runVoidMethod ("LogImpl","82228231",RemoteObject.concat(RemoteObject.createImmutable("Parent treeitem: "),_tip.runMethod(true,"getText")),0);
 BA.debugLineNum = 2122;BA.debugLine="If tiP.Text<>\"root\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("!",_tip.runMethod(true,"getText"),BA.ObjectToString("root"))) { 
 BA.debugLineNum = 2123;BA.debugLine="NumNiveles=NumNiveles+1";
Debug.ShouldStop(1024);
_numniveles = RemoteObject.solve(new RemoteObject[] {_numniveles,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("NumNiveles", _numniveles);
 BA.debugLineNum = 2124;BA.debugLine="lstParents.Add(tiP)";
Debug.ShouldStop(2048);
_lstparents.runVoidMethod ("Add",(Object)((_tip.getObject())));
 BA.debugLineNum = 2125;BA.debugLine="CrearListaParentsMenuItem(tiP)";
Debug.ShouldStop(4096);
_crearlistaparentsmenuitem(_tip);
 };
 };
 BA.debugLineNum = 2128;BA.debugLine="Return lstParents";
Debug.ShouldStop(32768);
if (true) return _lstparents;
 BA.debugLineNum = 2129;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _downloadfile(RemoteObject _link,RemoteObject _dirdestino,RemoteObject _nombrficherodestino) throws Exception{
try {
		Debug.PushSubsStack("DownloadFile (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,1738);
if (RapidSub.canDelegate("downloadfile")) { return b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","downloadfile", _link, _dirdestino, _nombrficherodestino);}
ResumableSub_DownloadFile rsub = new ResumableSub_DownloadFile(null,_link,_dirdestino,_nombrficherodestino);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DownloadFile extends BA.ResumableSub {
public ResumableSub_DownloadFile(b4j.docU.mainmenu2 parent,RemoteObject _link,RemoteObject _dirdestino,RemoteObject _nombrficherodestino) {
this.parent = parent;
this._link = _link;
this._dirdestino = _dirdestino;
this._nombrficherodestino = _nombrficherodestino;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.mainmenu2 parent;
RemoteObject _link;
RemoteObject _dirdestino;
RemoteObject _nombrficherodestino;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadFile (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,1738);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("Link", _link);
Debug.locals.put("DirDestino", _dirdestino);
Debug.locals.put("NombrFicheroDestino", _nombrficherodestino);
 BA.debugLineNum = 1739;BA.debugLine="Dim m As Map";
Debug.ShouldStop(1024);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 1740;BA.debugLine="m.Initialize";
Debug.ShouldStop(2048);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 1741;BA.debugLine="m.Put(\"DownLoadOK\",False)";
Debug.ShouldStop(4096);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DownLoadOK"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 1742;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(8192);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 1743;BA.debugLine="job.Initialize(\"\", Me)";
Debug.ShouldStop(16384);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba,(Object)(BA.ObjectToString("")),(Object)(mainmenu2.getObject()));
 BA.debugLineNum = 1744;BA.debugLine="job.Download(Link)";
Debug.ShouldStop(32768);
_job.runClassMethod (b4j.docU.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_link));
 BA.debugLineNum = 1745;BA.debugLine="Wait For (job) JobDone(job As HttpJob)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","jobdone", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "downloadfile"), (_job));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("job", _job);
;
 BA.debugLineNum = 1746;BA.debugLine="If job.Success Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 4;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1747;BA.debugLine="m.Put(\"DownLoadOK\",True)";
Debug.ShouldStop(262144);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DownLoadOK"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 1748;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(524288);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 1749;BA.debugLine="out = File.OpenOutput(DirDestino,NombrFicheroDes";
Debug.ShouldStop(1048576);
_out = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(_dirdestino),(Object)(_nombrficherodestino),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("out", _out);
 BA.debugLineNum = 1750;BA.debugLine="File.Copy2(job.GetInputStream, out)";
Debug.ShouldStop(2097152);
parent.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_job.runClassMethod (b4j.docU.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject())),(Object)((_out.getObject())));
 BA.debugLineNum = 1751;BA.debugLine="out.Close";
Debug.ShouldStop(4194304);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 1752;BA.debugLine="Sleep(100)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("Sleep",mainmenu2.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "downloadfile"),BA.numberCast(int.class, 100));
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
 BA.debugLineNum = 1754;BA.debugLine="job.Release";
Debug.ShouldStop(33554432);
_job.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1755;BA.debugLine="Return m";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_m));return;};
 BA.debugLineNum = 1756;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject _job) throws Exception{
}
public static RemoteObject  _exportarexcelficheroscarpeta(RemoteObject _directorioficheroexcel,RemoteObject _nombreficheroexcel,RemoteObject _lstficheros) throws Exception{
try {
		Debug.PushSubsStack("ExportarExcelFicherosCarpeta (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,1854);
if (RapidSub.canDelegate("exportarexcelficheroscarpeta")) { return b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","exportarexcelficheroscarpeta", _directorioficheroexcel, _nombreficheroexcel, _lstficheros);}
ResumableSub_ExportarExcelFicherosCarpeta rsub = new ResumableSub_ExportarExcelFicherosCarpeta(null,_directorioficheroexcel,_nombreficheroexcel,_lstficheros);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ExportarExcelFicherosCarpeta extends BA.ResumableSub {
public ResumableSub_ExportarExcelFicherosCarpeta(b4j.docU.mainmenu2 parent,RemoteObject _directorioficheroexcel,RemoteObject _nombreficheroexcel,RemoteObject _lstficheros) {
this.parent = parent;
this._directorioficheroexcel = _directorioficheroexcel;
this._nombreficheroexcel = _nombreficheroexcel;
this._lstficheros = _lstficheros;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.mainmenu2 parent;
RemoteObject _directorioficheroexcel;
RemoteObject _nombreficheroexcel;
RemoteObject _lstficheros;
RemoteObject _lstheaders = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _xl = RemoteObject.declareNull("b4j.docU.xlutils");
RemoteObject _workbook = RemoteObject.declareNull("b4j.docU.xlworkbookwriter");
RemoteObject _sheet1 = RemoteObject.declareNull("b4j.docU.xlsheetwriter");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _numcolsrs = RemoteObject.createImmutable(0);
RemoteObject _headerstyle = RemoteObject.declareNull("b4j.docU.xlstyle");
int _idxcol = 0;
RemoteObject _fechasstyle = RemoteObject.declareNull("b4j.docU.xlstyle");
RemoteObject _rowstyles = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _linkstyle = RemoteObject.declareNull("b4j.docU.xlstyle");
RemoteObject _idxfila = RemoteObject.createImmutable(0);
RemoteObject _nombrefichero = RemoteObject.createImmutable("");
RemoteObject _ultimafila = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
int step10;
int limit10;
RemoteObject group17;
int index17;
int groupLen17;
int step24;
int limit24;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ExportarExcelFicherosCarpeta (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,1854);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("DirectorioFicheroExcel", _directorioficheroexcel);
Debug.locals.put("NombreFicheroExcel", _nombreficheroexcel);
Debug.locals.put("lstFicheros", _lstficheros);
 BA.debugLineNum = 1856;BA.debugLine="Dim lstHeaders As List=Array As String(\"Fichero\")";
Debug.ShouldStop(-2147483648);
_lstheaders = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstheaders = parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("Fichero")})));Debug.locals.put("lstHeaders", _lstheaders);Debug.locals.put("lstHeaders", _lstheaders);
 BA.debugLineNum = 1859;BA.debugLine="Dim xl As XLUtils";
Debug.ShouldStop(4);
_xl = RemoteObject.createNew ("b4j.docU.xlutils");Debug.locals.put("xl", _xl);
 BA.debugLineNum = 1860;BA.debugLine="xl.Initialize";
Debug.ShouldStop(8);
_xl.runClassMethod (b4j.docU.xlutils.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 1861;BA.debugLine="Dim Workbook As XLWorkbookWriter = xl.CreateWrite";
Debug.ShouldStop(16);
_workbook = _xl.runClassMethod (b4j.docU.xlutils.class, "_createwriterblank" /*RemoteObject*/ );Debug.locals.put("Workbook", _workbook);Debug.locals.put("Workbook", _workbook);
 BA.debugLineNum = 1862;BA.debugLine="Dim sheet1 As XLSheetWriter = Workbook.CreateShee";
Debug.ShouldStop(32);
_sheet1 = _workbook.runClassMethod (b4j.docU.xlworkbookwriter.class, "_createsheetwriterbyname" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Datos")));Debug.locals.put("sheet1", _sheet1);Debug.locals.put("sheet1", _sheet1);
 BA.debugLineNum = 1864;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(128);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 1865;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(256);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 1867;BA.debugLine="Dim NumColsRs As Int=lstHeaders.Size";
Debug.ShouldStop(1024);
_numcolsrs = _lstheaders.runMethod(true,"getSize");Debug.locals.put("NumColsRs", _numcolsrs);Debug.locals.put("NumColsRs", _numcolsrs);
 BA.debugLineNum = 1868;BA.debugLine="Dim HeaderStyle As XLStyle=Workbook.CreateStyle.F";
Debug.ShouldStop(2048);
_headerstyle = _workbook.runClassMethod (b4j.docU.xlworkbookwriter.class, "_createstyle" /*RemoteObject*/ ).runClassMethod (b4j.docU.xlstyle.class, "_fontcolor" /*RemoteObject*/ ,(Object)(BA.numberCast(short.class, 12)),(Object)(BA.numberCast(int.class, _xl.getField(true,"_color_black" /*RemoteObject*/ )))).runClassMethod (b4j.docU.xlstyle.class, "_foregroundcolor" /*RemoteObject*/ ,(Object)(_xl.getField(true,"_color_grey_25_percent" /*RemoteObject*/ )));Debug.locals.put("HeaderStyle", _headerstyle);Debug.locals.put("HeaderStyle", _headerstyle);
 BA.debugLineNum = 1870;BA.debugLine="For idxCol=0 To lstHeaders.Size-1";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//for
this.state = 4;
step10 = 1;
limit10 = RemoteObject.solve(new RemoteObject[] {_lstheaders.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_idxcol = 0 ;
Debug.locals.put("idxCol", _idxcol);
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
Debug.locals.put("idxCol", _idxcol);
if (true) break;

case 3:
//C
this.state = 18;
 BA.debugLineNum = 1872;BA.debugLine="sheet1.PutString(xl.AddressZero(idxCol,0), lstHe";
Debug.ShouldStop(32768);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _idxcol)),(Object)(BA.numberCast(int.class, 0)))),(Object)(BA.ObjectToString(_lstheaders.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _idxcol))))));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
Debug.locals.put("idxCol", _idxcol);
;
 BA.debugLineNum = 1875;BA.debugLine="Dim FechasStyle As XLStyle = Workbook.CreateStyle";
Debug.ShouldStop(262144);
_fechasstyle = _workbook.runClassMethod (b4j.docU.xlworkbookwriter.class, "_createstyle" /*RemoteObject*/ ).runClassMethod (b4j.docU.xlstyle.class, "_dataformat" /*RemoteObject*/ ,(Object)((RemoteObject.createImmutable("dd\"/\"mm\"/\"yyyy"))));Debug.locals.put("FechasStyle", _fechasstyle);Debug.locals.put("FechasStyle", _fechasstyle);
 BA.debugLineNum = 1876;BA.debugLine="Dim RowStyles As List = Array(Workbook.CreateStyl";
Debug.ShouldStop(524288);
_rowstyles = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_rowstyles = parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_workbook.runClassMethod (b4j.docU.xlworkbookwriter.class, "_createstyle" /*RemoteObject*/ ).runClassMethod (b4j.docU.xlstyle.class, "_foregroundcolor" /*RemoteObject*/ ,(Object)(_xl.getField(true,"_color_orange" /*RemoteObject*/ )))),(_workbook.runClassMethod (b4j.docU.xlworkbookwriter.class, "_createstyle" /*RemoteObject*/ ).runClassMethod (b4j.docU.xlstyle.class, "_foregroundcolor" /*RemoteObject*/ ,(Object)(_xl.getField(true,"_color_white" /*RemoteObject*/ ))))})));Debug.locals.put("RowStyles", _rowstyles);Debug.locals.put("RowStyles", _rowstyles);
 BA.debugLineNum = 1878;BA.debugLine="Dim LinkStyle As XLStyle = Workbook.CreateStyle.F";
Debug.ShouldStop(2097152);
_linkstyle = _workbook.runClassMethod (b4j.docU.xlworkbookwriter.class, "_createstyle" /*RemoteObject*/ ).runClassMethod (b4j.docU.xlstyle.class, "_fontlink" /*RemoteObject*/ ,(Object)(BA.numberCast(short.class, 11))).runClassMethod (b4j.docU.xlstyle.class, "_horizontalalignment" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("LEFT")));Debug.locals.put("LinkStyle", _linkstyle);Debug.locals.put("LinkStyle", _linkstyle);
 BA.debugLineNum = 1883;BA.debugLine="Dim idxFila As Int=1";
Debug.ShouldStop(67108864);
_idxfila = BA.numberCast(int.class, 1);Debug.locals.put("idxFila", _idxfila);Debug.locals.put("idxFila", _idxfila);
 BA.debugLineNum = 1885;BA.debugLine="For Each NombreFichero As String In lstFicheros";
Debug.ShouldStop(268435456);
if (true) break;

case 5:
//for
this.state = 8;
group17 = _lstficheros;
index17 = 0;
groupLen17 = group17.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("NombreFichero", _nombrefichero);
this.state = 19;
if (true) break;

case 19:
//C
this.state = 8;
if (index17 < groupLen17) {
this.state = 7;
_nombrefichero = BA.ObjectToString(group17.runMethod(false,"Get",index17));Debug.locals.put("NombreFichero", _nombrefichero);}
if (true) break;

case 20:
//C
this.state = 19;
index17++;
Debug.locals.put("NombreFichero", _nombrefichero);
if (true) break;

case 7:
//C
this.state = 20;
 BA.debugLineNum = 1923;BA.debugLine="sheet1.PutString(xl.AddressZero(0,idxFila),Nombr";
Debug.ShouldStop(4);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(_idxfila))),(Object)(_nombrefichero)).runClassMethod (b4j.docU.xlsheetwriter.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sheet1.getField(false,"_lastaccessed" /*RemoteObject*/ )),(Object)(_linkstyle));
 BA.debugLineNum = 1924;BA.debugLine="sheet1.CreateHyperlink(sheet1.LastAccessed, \"FIL";
Debug.ShouldStop(8);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_createhyperlink" /*RemoteObject*/ ,(Object)(_sheet1.getField(false,"_lastaccessed" /*RemoteObject*/ )),(Object)(BA.ObjectToString("FILE")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("file://"),_nombrefichero.runMethod(true,"replace",(Object)(BA.ObjectToString("\\")),(Object)(RemoteObject.createImmutable("/"))).runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("%20"))))));
 BA.debugLineNum = 1927;BA.debugLine="idxFila=idxFila+1";
Debug.ShouldStop(64);
_idxfila = RemoteObject.solve(new RemoteObject[] {_idxfila,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("idxFila", _idxfila);
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
Debug.locals.put("NombreFichero", _nombrefichero);
;
 BA.debugLineNum = 1933;BA.debugLine="Dim UltimaFila As Int=idxFila";
Debug.ShouldStop(4096);
_ultimafila = _idxfila;Debug.locals.put("UltimaFila", _ultimafila);Debug.locals.put("UltimaFila", _ultimafila);
 BA.debugLineNum = 1939;BA.debugLine="sheet1.SetAutoFilter(xl.CreateXLRange(xl.AddressZ";
Debug.ShouldStop(262144);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_setautofilter" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_createxlrange" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(_ultimafila))))));
 BA.debugLineNum = 1941;BA.debugLine="For i=0 To idxCol+1 ' +1 ,  porque hemos añadido";
Debug.ShouldStop(1048576);
if (true) break;

case 9:
//for
this.state = 12;
step24 = 1;
limit24 = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_idxcol),RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 11:
//C
this.state = 22;
 BA.debugLineNum = 1942;BA.debugLine="sheet1.AutoSizeColumn(i)";
Debug.ShouldStop(2097152);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_autosizecolumn" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i)));
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1953;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(1);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 1969;BA.debugLine="Dim filename As String = Workbook.SaveAs(Director";
Debug.ShouldStop(65536);
_filename = _workbook.runClassMethod (b4j.docU.xlworkbookwriter.class, "_saveas" /*RemoteObject*/ ,(Object)(_directorioficheroexcel),(Object)(_nombreficheroexcel),(Object)(parent.__c.getField(true,"True")));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 1970;BA.debugLine="If filename<>DirectorioFicheroExcel & \"\\\" & Nombr";
Debug.ShouldStop(131072);
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("!",_filename,RemoteObject.concat(_directorioficheroexcel,RemoteObject.createImmutable("\\"),_nombreficheroexcel))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1971;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error al grab";
Debug.ShouldStop(262144);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(BA.ObjectToString("Error al grabar el fichero excel.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1972;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "exportarexcelficheroscarpeta"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 16;
;
 BA.debugLineNum = 1973;BA.debugLine="Return False";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 1976;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1977;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _iterateoverchildren(RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("IterateOverChildren (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,2104);
if (RapidSub.canDelegate("iterateoverchildren")) { return b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","iterateoverchildren", _parent);}
RemoteObject _tti = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("parent", _parent);
 BA.debugLineNum = 2104;BA.debugLine="Sub IterateOverChildren(parent As TreeItem)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 2105;BA.debugLine="For Each tti As TreeItem In parent.Children";
Debug.ShouldStop(16777216);
_tti = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
{
final RemoteObject group1 = _parent.runMethod(false,"getChildren");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_tti = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper"), group1.runMethod(false,"Get",index1));Debug.locals.put("tti", _tti);
Debug.locals.put("tti", _tti);
 BA.debugLineNum = 2106;BA.debugLine="If tti.Children.Size > 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_tti.runMethod(false,"getChildren").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2107;BA.debugLine="IterateOverChildren(tti)";
Debug.ShouldStop(67108864);
_iterateoverchildren(_tti);
 };
 }
}Debug.locals.put("tti", _tti);
;
 BA.debugLineNum = 2110;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _niveltreeitem(RemoteObject _ti) throws Exception{
try {
		Debug.PushSubsStack("NivelTreeItem (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,2131);
if (RapidSub.canDelegate("niveltreeitem")) { return b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","niveltreeitem", _ti);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _nivelti = RemoteObject.declareNull("Object");
Debug.locals.put("tI", _ti);
 BA.debugLineNum = 2131;BA.debugLine="Sub NivelTreeItem(tI As TreeItem) As Int";
Debug.ShouldStop(262144);
 BA.debugLineNum = 2132;BA.debugLine="Dim jo As JavaObject = TreeViewMainMenu";
Debug.ShouldStop(524288);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), mainmenu2._treeviewmainmenu.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 2133;BA.debugLine="Dim NivelTI As Object=jo.RunMethodJO(\"getTreeItem";
Debug.ShouldStop(1048576);
_nivelti = (_jo.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getTreeItemLevel")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_ti.getObject())}))).getObject());Debug.locals.put("NivelTI", _nivelti);Debug.locals.put("NivelTI", _nivelti);
 BA.debugLineNum = 2134;BA.debugLine="Return NivelTI";
Debug.ShouldStop(2097152);
if (true) return BA.numberCast(int.class, _nivelti);
 BA.debugLineNum = 2135;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
mainmenu2._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 5;BA.debugLine="Private fx As JFX";
mainmenu2._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 6;BA.debugLine="Private frm As Form";
mainmenu2._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 10;BA.debugLine="Private pnlFondoMainMenu As Pane";
mainmenu2._pnlfondomainmenu = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private TreeViewMainMenu As TreeView";
mainmenu2._treeviewmainmenu = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private Dialog As B4XDialog";
mainmenu2._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");
 //BA.debugLineNum = 23;BA.debugLine="Private SplitPaneMainMenu As SplitPane";
mainmenu2._splitpanemainmenu = RemoteObject.createNew ("anywheresoftware.b4j.objects.SplitPaneWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private TextEngine1 As BCTextEngine";
mainmenu2._textengine1 = RemoteObject.createNew ("b4j.docU.bctextengine");
 //BA.debugLineNum = 26;BA.debugLine="Private BBCodeViewElementosMainMenu As BBCodeView";
mainmenu2._bbcodeviewelementosmainmenu = RemoteObject.createNew ("b4j.docU.bbcodeview");
 //BA.debugLineNum = 31;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
mainmenu2._jamloadingindicator1 = RemoteObject.createNew ("b4j.docU.jamloadingindicator");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _reiniciarsincronizaciondocuware() throws Exception{
try {
		Debug.PushSubsStack("ReiniciarSincronizacionDocuware (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,2216);
if (RapidSub.canDelegate("reiniciarsincronizaciondocuware")) { return b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","reiniciarsincronizaciondocuware");}
ResumableSub_ReiniciarSincronizacionDocuware rsub = new ResumableSub_ReiniciarSincronizacionDocuware(null);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ReiniciarSincronizacionDocuware extends BA.ResumableSub {
public ResumableSub_ReiniciarSincronizacionDocuware(b4j.docU.mainmenu2 parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.mainmenu2 parent;
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _urlsincronizaciondocuware = RemoteObject.createImmutable("");
RemoteObject _ser = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.B4XSerializator");
RemoteObject _data = null;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ReiniciarSincronizacionDocuware (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,2216);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 2217;BA.debugLine="Dim sResp As String";
Debug.ShouldStop(256);
_sresp = RemoteObject.createImmutable("");Debug.locals.put("sResp", _sresp);
 BA.debugLineNum = 2219;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(1024);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 2220;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(2048);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba,(Object)(BA.ObjectToString("")),(Object)(mainmenu2.getObject()));
 BA.debugLineNum = 2221;BA.debugLine="Dim URLSincronizacionDocuware As String=\"http://1";
Debug.ShouldStop(4096);
_urlsincronizaciondocuware = BA.ObjectToString("http://192.168.10.20:17501/RebootDocuwareTimer");Debug.locals.put("URLSincronizacionDocuware", _urlsincronizaciondocuware);Debug.locals.put("URLSincronizacionDocuware", _urlsincronizaciondocuware);
 BA.debugLineNum = 2222;BA.debugLine="Dim ser As B4XSerializator";
Debug.ShouldStop(8192);
_ser = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.B4XSerializator");Debug.locals.put("ser", _ser);
 BA.debugLineNum = 2223;BA.debugLine="Dim data() As Byte = ser.ConvertObjectToBytes(\"\")";
Debug.ShouldStop(16384);
_data = _ser.runMethod(false,"ConvertObjectToBytes",(Object)((RemoteObject.createImmutable(""))));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 2224;BA.debugLine="job.PostBytes(URLSincronizacionDocuware,data)";
Debug.ShouldStop(32768);
_job.runClassMethod (b4j.docU.httpjob.class, "_postbytes" /*RemoteObject*/ ,(Object)(_urlsincronizaciondocuware),(Object)(_data));
 BA.debugLineNum = 2225;BA.debugLine="job.GetRequest.Timeout=10000";
Debug.ShouldStop(65536);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 10000));
 BA.debugLineNum = 2226;BA.debugLine="Wait For (job) JobDone(job As HttpJob)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","jobdone", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "reiniciarsincronizaciondocuware"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("job", _job);
;
 BA.debugLineNum = 2228;BA.debugLine="Log(\"Success ReiniciarSincronizacionDocuware: \" &";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","8254935052",RemoteObject.concat(RemoteObject.createImmutable("Success ReiniciarSincronizacionDocuware: "),_job.getField(true,"_success" /*RemoteObject*/ )),0);
 BA.debugLineNum = 2230;BA.debugLine="If Not(job.Success) Then";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.runMethod(true,"Not",(Object)(_job.getField(true,"_success" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 2231;BA.debugLine="Log(\"jobTest.Response.ErrorMessage: \" & job.Erro";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","8254935055",RemoteObject.concat(RemoteObject.createImmutable("jobTest.Response.ErrorMessage: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 2232;BA.debugLine="sResp=$\"ERROR, ${job.ErrorMessage}\"$";
Debug.ShouldStop(8388608);
_sresp = (RemoteObject.concat(RemoteObject.createImmutable("ERROR, "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_job.getField(true,"_errormessage" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sResp", _sresp);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2234;BA.debugLine="sResp=\"OK\"";
Debug.ShouldStop(33554432);
_sresp = BA.ObjectToString("OK");Debug.locals.put("sResp", _sresp);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 2236;BA.debugLine="job.Release";
Debug.ShouldStop(134217728);
_job.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 2237;BA.debugLine="Return sResp";
Debug.ShouldStop(268435456);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_sresp));return;};
 BA.debugLineNum = 2238;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _scrolltoitem(RemoteObject _tree,RemoteObject _ti) throws Exception{
try {
		Debug.PushSubsStack("ScrollToItem (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,1677);
if (RapidSub.canDelegate("scrolltoitem")) { return b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","scrolltoitem", _tree, _ti);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("tree", _tree);
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 1677;BA.debugLine="Sub ScrollToItem (tree As TreeView, ti As TreeItem";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1678;BA.debugLine="Dim p As TreeItem = ti.Parent";
Debug.ShouldStop(8192);
_p = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_p = _ti.runMethod(false,"getParent");Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 1679;BA.debugLine="Do While p.Root = False";
Debug.ShouldStop(16384);
while (RemoteObject.solveBoolean("=",_p.runMethod(true,"getRoot"),mainmenu2.__c.getField(true,"False"))) {
 BA.debugLineNum = 1680;BA.debugLine="p.Expanded = True";
Debug.ShouldStop(32768);
_p.runMethod(true,"setExpanded",mainmenu2.__c.getField(true,"True"));
 BA.debugLineNum = 1681;BA.debugLine="p = p.Parent";
Debug.ShouldStop(65536);
_p = _p.runMethod(false,"getParent");Debug.locals.put("p", _p);
 }
;
 BA.debugLineNum = 1683;BA.debugLine="Dim index As Int = CountVisibleChildren(tree.Root";
Debug.ShouldStop(262144);
_index = _countvisiblechildren(_tree.runMethod(false,"getRoot"),_ti,RemoteObject.createNewArray("boolean",new int[] {1},new Object[] {mainmenu2.__c.getField(true,"False")}));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 1684;BA.debugLine="Dim jo As JavaObject = tree";
Debug.ShouldStop(524288);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _tree.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 1685;BA.debugLine="Log(index)";
Debug.ShouldStop(1048576);
mainmenu2.__c.runVoidMethod ("LogImpl","81703944",BA.NumberToString(_index),0);
 BA.debugLineNum = 1686;BA.debugLine="jo.RunMethod(\"scrollTo\", Array(index))";
Debug.ShouldStop(2097152);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("scrollTo")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_index)})));
 BA.debugLineNum = 1687;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _searchparentstreeitem(RemoteObject _tior) throws Exception{
try {
		Debug.PushSubsStack("SearchParentsTreeItem (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,766);
if (RapidSub.canDelegate("searchparentstreeitem")) { return b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","searchparentstreeitem", _tior);}
RemoteObject _tip = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("tiOR", _tior);
 BA.debugLineNum = 766;BA.debugLine="Sub SearchParentsTreeItem(tiOR As TreeItem)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 768;BA.debugLine="Dim tiP As TreeItem=tiOR.Parent";
Debug.ShouldStop(-2147483648);
_tip = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_tip = _tior.runMethod(false,"getParent");Debug.locals.put("tiP", _tip);Debug.locals.put("tiP", _tip);
 BA.debugLineNum = 769;BA.debugLine="If tiP.IsInitialized Then";
Debug.ShouldStop(1);
if (_tip.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 770;BA.debugLine="Log(tiP.Text)";
Debug.ShouldStop(2);
mainmenu2.__c.runVoidMethod ("LogImpl","81114116",_tip.runMethod(true,"getText"),0);
 BA.debugLineNum = 772;BA.debugLine="Main.lstSelItem.Add(tiP)";
Debug.ShouldStop(8);
mainmenu2._main._lstselitem /*RemoteObject*/ .runVoidMethod ("Add",(Object)((_tip.getObject())));
 BA.debugLineNum = 773;BA.debugLine="SearchParentsTreeItem(tiP)";
Debug.ShouldStop(16);
_searchparentstreeitem(_tip);
 };
 BA.debugLineNum = 776;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _searchtreeitem(RemoteObject _parent,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("SearchTreeItem (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,752);
if (RapidSub.canDelegate("searchtreeitem")) { return b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","searchtreeitem", _parent, _s);}
RemoteObject _ti = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("Parent", _parent);
Debug.locals.put("s", _s);
 BA.debugLineNum = 752;BA.debugLine="Sub SearchTreeItem(Parent As TreeItem, s As String";
Debug.ShouldStop(32768);
 BA.debugLineNum = 753;BA.debugLine="For Each ti As TreeItem In Parent.Children";
Debug.ShouldStop(65536);
_ti = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
{
final RemoteObject group1 = _parent.runMethod(false,"getChildren");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_ti = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper"), group1.runMethod(false,"Get",index1));Debug.locals.put("ti", _ti);
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 754;BA.debugLine="If ti.Text = s Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_ti.runMethod(true,"getText"),_s)) { 
 BA.debugLineNum = 755;BA.debugLine="Return ti";
Debug.ShouldStop(262144);
if (true) return _ti;
 };
 BA.debugLineNum = 757;BA.debugLine="If ti.Children.Size > 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",_ti.runMethod(false,"getChildren").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 758;BA.debugLine="Dim res As TreeItem = SearchTreeItem(ti, s)";
Debug.ShouldStop(2097152);
_res = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_res = _searchtreeitem(_ti,_s);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 759;BA.debugLine="If res.IsInitialized Then Return res";
Debug.ShouldStop(4194304);
if (_res.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
if (true) return _res;};
 };
 }
}Debug.locals.put("ti", _ti);
;
 BA.debugLineNum = 762;BA.debugLine="Dim res As TreeItem";
Debug.ShouldStop(33554432);
_res = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("res", _res);
 BA.debugLineNum = 763;BA.debugLine="Return res";
Debug.ShouldStop(67108864);
if (true) return _res;
 BA.debugLineNum = 764;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seleccionaralmacen() throws Exception{
try {
		Debug.PushSubsStack("SeleccionarAlmacen (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,203);
if (RapidSub.canDelegate("seleccionaralmacen")) { return b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","seleccionaralmacen");}
ResumableSub_SeleccionarAlmacen rsub = new ResumableSub_SeleccionarAlmacen(null);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SeleccionarAlmacen extends BA.ResumableSub {
public ResumableSub_SeleccionarAlmacen(b4j.docU.mainmenu2 parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.mainmenu2 parent;
RemoteObject _b4xlistdlg = RemoteObject.declareNull("b4j.docU.b4xlisttemplate");
RemoteObject _textsize = RemoteObject.createImmutable(0f);
RemoteObject _xclv = RemoteObject.declareNull("b4j.example.customlistview");
RemoteObject _dlbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _lstopciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
int _i = 0;
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _msa = RemoteObject.declareNull("Object");
int step15;
int limit15;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SeleccionarAlmacen (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,203);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 205;BA.debugLine="Dialog.Title=\"Selecciona Almacén de Conexión\"";
Debug.ShouldStop(4096);
parent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona Almacén de Conexión")));
 BA.debugLineNum = 206;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.ShouldStop(8192);
parent._dialog.setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 207;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
Debug.ShouldStop(16384);
parent._dialog.setField ("_titlebarfont" /*RemoteObject*/ ,parent._xui.runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 18))));
 BA.debugLineNum = 208;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
Debug.ShouldStop(32768);
parent._dialog.setField ("_buttonsfont" /*RemoteObject*/ ,parent._xui.runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 209;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
Debug.ShouldStop(65536);
_b4xlistdlg = RemoteObject.createNew ("b4j.docU.b4xlisttemplate");Debug.locals.put("B4XListDlg", _b4xlistdlg);
 BA.debugLineNum = 210;BA.debugLine="B4XListDlg.Initialize";
Debug.ShouldStop(131072);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 212;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
Debug.ShouldStop(524288);
_textsize = BA.numberCast(float.class, 18);Debug.locals.put("TextSize", _textsize);Debug.locals.put("TextSize", _textsize);
 BA.debugLineNum = 213;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
Debug.ShouldStop(1048576);
_xclv = _b4xlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ );Debug.locals.put("xclv", _xclv);Debug.locals.put("xclv", _xclv);
 BA.debugLineNum = 214;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
Debug.ShouldStop(2097152);
_xclv.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",parent._xui.getField(true,"Color_White"));
 BA.debugLineNum = 216;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
Debug.ShouldStop(8388608);
_dlbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_dlbl = _xclv.getField(false,"_designerlabel");Debug.locals.put("dlbl", _dlbl);Debug.locals.put("dlbl", _dlbl);
 BA.debugLineNum = 217;BA.debugLine="dlbl.TextSize=TextSize";
Debug.ShouldStop(16777216);
_dlbl.runMethod(true,"setTextSize",BA.numberCast(double.class, _textsize));
 BA.debugLineNum = 219;BA.debugLine="Dim lstOpciones As List=Array As String(\"PROIN\",\"";
Debug.ShouldStop(67108864);
_lstopciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstopciones = parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("PROIN"),RemoteObject.createImmutable("PROTEC")})));Debug.locals.put("lstOpciones", _lstopciones);Debug.locals.put("lstOpciones", _lstopciones);
 BA.debugLineNum = 221;BA.debugLine="B4XListDlg.Options=lstOpciones";
Debug.ShouldStop(268435456);
_b4xlistdlg.setField ("_options" /*RemoteObject*/ ,_lstopciones);
 BA.debugLineNum = 223;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
Debug.ShouldStop(1073741824);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 225;BA.debugLine="For i=0 To lstOpciones.size-1";
Debug.ShouldStop(1);
if (true) break;

case 1:
//for
this.state = 4;
step15 = 1;
limit15 = RemoteObject.solve(new RemoteObject[] {_lstopciones.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 26;
 BA.debugLineNum = 226;BA.debugLine="xclv.ResizeItem(i,80dip)";
Debug.ShouldStop(2);
_xclv.runVoidMethod ("_resizeitem",(Object)(BA.numberCast(int.class, _i)),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 230;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(32);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(parent._xui.getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 231;BA.debugLine="If bCancel.IsInitialized Then";
Debug.ShouldStop(64);
if (true) break;

case 5:
//if
this.state = 8;
if (_bcancel.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 233;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
Debug.ShouldStop(256);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 0));
 BA.debugLineNum = 234;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
Debug.ShouldStop(512);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 0));
 BA.debugLineNum = 235;BA.debugLine="bCancel.TextSize=18";
Debug.ShouldStop(1024);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 238;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "seleccionaralmacen"), _rsub);
this.state = 27;
return;
case 27:
//C
this.state = 9;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 239;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
Debug.ShouldStop(16384);
if (true) break;

case 9:
//if
this.state = 24;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 24;
 BA.debugLineNum = 240;BA.debugLine="Return \"\"";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("")));return;};
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 243;BA.debugLine="If Main.AlmacenIPConexion<>\"\" And Main.AlmacenIP";
Debug.ShouldStop(262144);
if (true) break;

case 14:
//if
this.state = 23;
if (RemoteObject.solveBoolean("!",parent._main._almacenipconexion /*RemoteObject*/ ,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",parent._main._almacenipconexion /*RemoteObject*/ ,_b4xlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ ))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 244;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"Se ha sel";
Debug.ShouldStop(524288);
_msa = parent._xui.runMethod(false,"Msgbox2Async",mainmenu2.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Se ha seleccionado un almacén distinto al almacén en el que te has conectado por red."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Esto afecta a los datos de Almacen que se pueden ver/editar y a las impresoras que se pueden seleccionar."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("¿Continuar?"))),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 246;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "seleccionaralmacen"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 17;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 247;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
Debug.ShouldStop(4194304);
if (true) break;

case 17:
//if
this.state = 22;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 19;
;}if (true) break;

case 19:
//C
this.state = 22;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("")));return;};
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
 BA.debugLineNum = 250;BA.debugLine="Return B4XListDlg.SelectedItem";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_b4xlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ )));return;};
 if (true) break;

case 24:
//C
this.state = -1;
;
 BA.debugLineNum = 252;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _seleccionarmenuitem(RemoteObject _ti) throws Exception{
try {
		Debug.PushSubsStack("SeleccionarMenuItem (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,2099);
if (RapidSub.canDelegate("seleccionarmenuitem")) { return b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","seleccionarmenuitem", _ti);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 2099;BA.debugLine="Sub SeleccionarMenuItem(ti As TreeItem)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 2100;BA.debugLine="Dim jo As JavaObject = TreeViewMainMenu";
Debug.ShouldStop(524288);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), mainmenu2._treeviewmainmenu.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 2101;BA.debugLine="jo.RunMethodJO(\"getSelectionModel\", Null).RunMeth";
Debug.ShouldStop(1048576);
_jo.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getSelectionModel")),(Object)((mainmenu2.__c.getField(false,"Null")))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("select")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_ti.getObject())})));
 BA.debugLineNum = 2102;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sethandler(RemoteObject _ob,RemoteObject _eventname,RemoteObject _handlername) throws Exception{
try {
		Debug.PushSubsStack("setHandler (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,2203);
if (RapidSub.canDelegate("sethandler")) { return b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","sethandler", _ob, _eventname, _handlername);}
Debug.locals.put("ob", _ob);
Debug.locals.put("eventName", _eventname);
Debug.locals.put("handlerName", _handlername);
 BA.debugLineNum = 2203;BA.debugLine="Private Sub setHandler(ob As JavaObject,eventName";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 2204;BA.debugLine="ob.RunMethod(eventName, Array(ob.CreateEventFromU";
Debug.ShouldStop(134217728);
_ob.runVoidMethod ("RunMethod",(Object)(_eventname),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_ob.runMethod(false,"CreateEventFromUI",mainmenu2.ba,(Object)(BA.ObjectToString("javafx.event.EventHandler")),(Object)(_handlername),(Object)((mainmenu2.__c.getField(true,"False"))))})));
 BA.debugLineNum = 2205;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _shl_processcompleted(RemoteObject _success,RemoteObject _exitcode,RemoteObject _stdout,RemoteObject _stderr) throws Exception{
try {
		Debug.PushSubsStack("shl_ProcessCompleted (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,1629);
if (RapidSub.canDelegate("shl_processcompleted")) { return b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","shl_processcompleted", _success, _exitcode, _stdout, _stderr);}
Debug.locals.put("Success", _success);
Debug.locals.put("ExitCode", _exitcode);
Debug.locals.put("StdOut", _stdout);
Debug.locals.put("StdErr", _stderr);
 BA.debugLineNum = 1629;BA.debugLine="Sub shl_ProcessCompleted (Success As Boolean, Exit";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1630;BA.debugLine="If Success And ExitCode = 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(".",_success) && RemoteObject.solveBoolean("=",_exitcode,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1631;BA.debugLine="Log(\"Success\")";
Debug.ShouldStop(1073741824);
mainmenu2.__c.runVoidMethod ("LogImpl","81441794",RemoteObject.createImmutable("Success"),0);
 BA.debugLineNum = 1632;BA.debugLine="Log(StdOut)";
Debug.ShouldStop(-2147483648);
mainmenu2.__c.runVoidMethod ("LogImpl","81441795",_stdout,0);
 }else {
 BA.debugLineNum = 1634;BA.debugLine="Log(\"Error: \" & StdErr)";
Debug.ShouldStop(2);
mainmenu2.__c.runVoidMethod ("LogImpl","81441797",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_stderr),0);
 };
 BA.debugLineNum = 1636;BA.debugLine="ExitApplication";
Debug.ShouldStop(8);
mainmenu2.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 1637;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _show() throws Exception{
try {
		Debug.PushSubsStack("Show (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,34);
if (RapidSub.canDelegate("show")) { b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","show"); return;}
ResumableSub_Show rsub = new ResumableSub_Show(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.mainmenu2 parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.mainmenu2 parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
int _i = 0;
RemoteObject _ti = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tiopen = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _accion = RemoteObject.createImmutable("");
int step37;
int limit37;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,34);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 35;BA.debugLine="If frm.IsInitialized=False Then";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",parent._frm.runMethod(true,"IsInitialized"),parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 38;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
Debug.ShouldStop(32);
parent._frm.runVoidMethod ("Initialize",mainmenu2.ba,(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, parent._main._xscreen /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, parent._main._yscreen /*RemoteObject*/ )));
 BA.debugLineNum = 39;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(64);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), parent._frm);Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 40;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"sta";
Debug.ShouldStop(128);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 41;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(256);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 42;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(512);
parent._frm.runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 43;BA.debugLine="frm.RootPane.LoadLayout(\"scrMainMenu2\")";
Debug.ShouldStop(1024);
parent._frm.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",mainmenu2.ba,(Object)(RemoteObject.createImmutable("scrMainMenu2")));
 BA.debugLineNum = 44;BA.debugLine="SplitPaneMainMenu.LoadLayout(\"scrMainMenuTreeVie";
Debug.ShouldStop(2048);
parent._splitpanemainmenu.runVoidMethodAndSync ("LoadLayout",mainmenu2.ba,(Object)(RemoteObject.createImmutable("scrMainMenuTreeView")));
 BA.debugLineNum = 46;BA.debugLine="SplitPaneMainMenu.LoadLayout(\"scrMainMenuBBCodeE";
Debug.ShouldStop(8192);
parent._splitpanemainmenu.runVoidMethodAndSync ("LoadLayout",mainmenu2.ba,(Object)(RemoteObject.createImmutable("scrMainMenuBBCodeElementos")));
 BA.debugLineNum = 47;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"   \" & \"Menú";
Debug.ShouldStop(16384);
parent._frm.runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("   "),RemoteObject.createImmutable("Menú Inicio")));
 BA.debugLineNum = 49;BA.debugLine="Dialog.Initialize (frm.RootPane)";
Debug.ShouldStop(65536);
parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent._frm.runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 51;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(262144);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 52;BA.debugLine="jo=SplitPaneMainMenu";
Debug.ShouldStop(524288);
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), parent._splitpanemainmenu.getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 55;BA.debugLine="CSSUtils.SetStyleProperty(TreeViewMainMenu,\"-fx-";
Debug.ShouldStop(4194304);
parent._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), parent._treeviewmainmenu.getObject()),(Object)(BA.ObjectToString("-fx-selection-bar")),(Object)(RemoteObject.createImmutable("#00FA9A")));
 BA.debugLineNum = 57;BA.debugLine="frm.Title=\"Menú Inicio \" & Main.SufijoTitleForms";
Debug.ShouldStop(16777216);
parent._frm.runMethod(true,"setTitle",RemoteObject.concat(RemoteObject.createImmutable("Menú Inicio "),parent._main._sufijotitleforms /*RemoteObject*/ ));
 BA.debugLineNum = 59;BA.debugLine="Dialog.Initialize (frm.RootPane)";
Debug.ShouldStop(67108864);
parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent._frm.runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 60;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
Debug.ShouldStop(134217728);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba,(Object)(mainmenu2.getObject()),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent._frm.runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 61;BA.debugLine="jamLoadingIndicator1.EstiloLoadingIndicator=\"Fiv";
Debug.ShouldStop(268435456);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_setestiloloadingindicator",BA.ObjectToString("Five Lines 1"));
 BA.debugLineNum = 63;BA.debugLine="jamLoadingIndicator1.ColorPanelFondo=xui.Color_T";
Debug.ShouldStop(1073741824);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_setcolorpanelfondo" /*RemoteObject*/ ,parent._xui.getField(true,"Color_Transparent"));
 BA.debugLineNum = 64;BA.debugLine="jamLoadingIndicator1.ColorLoadingIndicator=0xFF6";
Debug.ShouldStop(-2147483648);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_setcolorloadingindicator",BA.numberCast(int.class, ((int)0xff696969)));
 BA.debugLineNum = 65;BA.debugLine="jamLoadingIndicator1.ColorMensaje=0xFF696969";
Debug.ShouldStop(1);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_setcolormensaje",BA.numberCast(int.class, ((int)0xff696969)));
 BA.debugLineNum = 67;BA.debugLine="SplitPaneMainMenu.DividerPositions=Array As Doub";
Debug.ShouldStop(4);
parent._splitpanemainmenu.runMethod(false,"setDividerPositions",RemoteObject.createNewArray("double",new int[] {1},new Object[] {BA.numberCast(double.class, 0.30)}));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 78;BA.debugLine="CargaTreeView";
Debug.ShouldStop(8192);
_cargatreeview();
 BA.debugLineNum = 80;BA.debugLine="frm.Show";
Debug.ShouldStop(32768);
parent._frm.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 82;BA.debugLine="TreeViewMainMenu.ClearSelection";
Debug.ShouldStop(131072);
parent._treeviewmainmenu.runVoidMethod ("ClearSelection");
 BA.debugLineNum = 84;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(524288);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 86;BA.debugLine="If TextEngine1.IsInitialized=False Then";
Debug.ShouldStop(2097152);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",parent._textengine1.runMethod(true,"IsInitialized" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 87;BA.debugLine="TextEngine1.Initialize(frm.RootPane)";
Debug.ShouldStop(4194304);
parent._textengine1.runClassMethod (b4j.docU.bctextengine.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent._frm.runMethod(false,"getRootPane").getObject()));
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 125;BA.debugLine="Main.lstSelItem.Clear";
Debug.ShouldStop(268435456);
parent._main._lstselitem /*RemoteObject*/ .runVoidMethod ("Clear");
 BA.debugLineNum = 126;BA.debugLine="If Main.TreeItemMenuAbreForm.IsInitialized Then";
Debug.ShouldStop(536870912);
if (true) break;

case 9:
//if
this.state = 34;
if (parent._main._treeitemmenuabreform /*RemoteObject*/ .runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 11;
}else {
this.state = 33;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 128;BA.debugLine="Log(Main.TreeItemMenuAbreForm.Text)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","8786526",parent._main._treeitemmenuabreform /*RemoteObject*/ .runMethod(true,"getText"),0);
 BA.debugLineNum = 130;BA.debugLine="If Main.TreeItemMenuAbreForm<>Null Then";
Debug.ShouldStop(2);
if (true) break;

case 12:
//if
this.state = 31;
if (RemoteObject.solveBoolean("N",parent._main._treeitemmenuabreform /*RemoteObject*/ )) { 
this.state = 14;
}else {
this.state = 30;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 131;BA.debugLine="SearchParentsTreeItem(Main.TreeItemMenuAbreForm";
Debug.ShouldStop(4);
_searchparentstreeitem(parent._main._treeitemmenuabreform /*RemoteObject*/ );
 BA.debugLineNum = 132;BA.debugLine="If Main.lstSelItem.Size>0 Then";
Debug.ShouldStop(8);
if (true) break;

case 15:
//if
this.state = 28;
if (RemoteObject.solveBoolean(">",parent._main._lstselitem /*RemoteObject*/ .runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 133;BA.debugLine="For i=Main.lstSelItem.Size-2 To 0 Step-1";
Debug.ShouldStop(16);
if (true) break;

case 18:
//for
this.state = 27;
step37 = -1;
limit37 = 0;
_i = RemoteObject.solve(new RemoteObject[] {parent._main._lstselitem /*RemoteObject*/ .runMethod(true,"getSize"),RemoteObject.createImmutable(2)}, "-",1, 1).<Integer>get().intValue() ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 134;BA.debugLine="Dim ti As TreeItem=Main.lstSelItem.Get(i)";
Debug.ShouldStop(32);
_ti = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_ti = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper"), parent._main._lstselitem /*RemoteObject*/ .runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ti", _ti);Debug.locals.put("ti", _ti);
 BA.debugLineNum = 136;BA.debugLine="Log(\"ti.text \" & ti.Text)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("LogImpl","8786534",RemoteObject.concat(RemoteObject.createImmutable("ti.text "),_ti.runMethod(true,"getText")),0);
 BA.debugLineNum = 138;BA.debugLine="Dim tiOpen As TreeItem=SearchTreeItem(TreeVie";
Debug.ShouldStop(512);
_tiopen = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_tiopen = _searchtreeitem(parent._treeviewmainmenu.runMethod(false,"getRoot"),_ti.runMethod(true,"getText"));Debug.locals.put("tiOpen", _tiopen);Debug.locals.put("tiOpen", _tiopen);
 BA.debugLineNum = 139;BA.debugLine="If tiOpen.Text=\"root\" Then Continue";
Debug.ShouldStop(1024);
if (true) break;

case 21:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",_tiopen.runMethod(true,"getText"),BA.ObjectToString("root"))) { 
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
 BA.debugLineNum = 141;BA.debugLine="Log(\"tiOpen.text \" & tiOpen.Text)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","8786539",RemoteObject.concat(RemoteObject.createImmutable("tiOpen.text "),_tiopen.runMethod(true,"getText")),0);
 BA.debugLineNum = 146;BA.debugLine="Dim jo As JavaObject=tiOpen";
Debug.ShouldStop(131072);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _tiopen.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 147;BA.debugLine="jo.RunMethod(\"setExpanded\", Array(True))";
Debug.ShouldStop(262144);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setExpanded")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
Debug.locals.put("i", _i);
;
 if (true) break;

case 28:
//C
this.state = 31;
;
 BA.debugLineNum = 151;BA.debugLine="ScrollToItem(TreeViewMainMenu,Main.TreeItemMenu";
Debug.ShouldStop(4194304);
_scrolltoitem(parent._treeviewmainmenu,parent._main._treeitemmenuabreform /*RemoteObject*/ );
 BA.debugLineNum = 153;BA.debugLine="CrearAccesosDirectosItem3(TreeItemMayorNivelExp";
Debug.ShouldStop(16777216);
_crearaccesosdirectositem3(_treeitemmayornivelexpandido(parent._treeviewmainmenu.runMethod(false,"getRoot")));
 if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 156;BA.debugLine="CrearAccesosDirectosItem3(TreeItemMayorNivelExp";
Debug.ShouldStop(134217728);
_crearaccesosdirectositem3(_treeitemmayornivelexpandido(parent._treeviewmainmenu.runMethod(false,"getRoot")));
 if (true) break;

case 31:
//C
this.state = 34;
;
 if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 160;BA.debugLine="CrearAccesosDirectosItem3(TreeItemMayorNivelExpa";
Debug.ShouldStop(-2147483648);
_crearaccesosdirectositem3(_treeitemmayornivelexpandido(parent._treeviewmainmenu.runMethod(false,"getRoot")));
 if (true) break;

case 34:
//C
this.state = 35;
;
 BA.debugLineNum = 163;BA.debugLine="wait for(VerificarVersionActual) complete (Accion";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "show"), _verificarversionactual());
this.state = 41;
return;
case 41:
//C
this.state = 35;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Accion", _accion);
;
 BA.debugLineNum = 164;BA.debugLine="If Accion=\"ExitApp\" Then";
Debug.ShouldStop(8);
if (true) break;

case 35:
//if
this.state = 38;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("ExitApp"))) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 165;BA.debugLine="ExitApplication";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;

case 38:
//C
this.state = -1;
;
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.ShouldStop(256);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _splitpanemainmenu_resize(RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("SplitPaneMainMenu_Resize (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,1673);
if (RapidSub.canDelegate("splitpanemainmenu_resize")) { return b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","splitpanemainmenu_resize", _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 1673;BA.debugLine="Sub SplitPaneMainMenu_Resize (Width As Double, Hei";
Debug.ShouldStop(256);
 BA.debugLineNum = 1675;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _titem_expandedchanged(RemoteObject _expanded) throws Exception{
try {
		Debug.PushSubsStack("tItem_ExpandedChanged (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,837);
if (RapidSub.canDelegate("titem_expandedchanged")) { return b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","titem_expandedchanged", _expanded);}
RemoteObject _ti = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _timaxnivelexp = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("Expanded", _expanded);
 BA.debugLineNum = 837;BA.debugLine="Sub tItem_ExpandedChanged(Expanded As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 839;BA.debugLine="Dim ti As TreeItem=Sender";
Debug.ShouldStop(64);
_ti = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_ti = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper"), mainmenu2.__c.runMethod(false,"Sender",mainmenu2.ba));Debug.locals.put("ti", _ti);Debug.locals.put("ti", _ti);
 BA.debugLineNum = 840;BA.debugLine="Log(ti.Text & \" \" & ti.Expanded)";
Debug.ShouldStop(128);
mainmenu2.__c.runVoidMethod ("LogImpl","81245187",RemoteObject.concat(_ti.runMethod(true,"getText"),RemoteObject.createImmutable(" "),_ti.runMethod(true,"getExpanded")),0);
 BA.debugLineNum = 842;BA.debugLine="If ti.Expanded Then";
Debug.ShouldStop(512);
if (_ti.runMethod(true,"getExpanded").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 844;BA.debugLine="ContraerItemsOtrasRamas2(ti)";
Debug.ShouldStop(2048);
_contraeritemsotrasramas2(_ti);
 BA.debugLineNum = 866;BA.debugLine="Main.lstSelItem.Clear";
Debug.ShouldStop(2);
mainmenu2._main._lstselitem /*RemoteObject*/ .runVoidMethod ("Clear");
 BA.debugLineNum = 867;BA.debugLine="SearchParentsTreeItem(ti)";
Debug.ShouldStop(4);
_searchparentstreeitem(_ti);
 }else {
 BA.debugLineNum = 876;BA.debugLine="ContraerItemsChildren(ti)";
Debug.ShouldStop(2048);
_contraeritemschildren(_ti);
 };
 BA.debugLineNum = 884;BA.debugLine="Dim tiMaxNivelExp As TreeItem=TreeItemMayorNivelE";
Debug.ShouldStop(524288);
_timaxnivelexp = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_timaxnivelexp = _treeitemmayornivelexpandido(mainmenu2._treeviewmainmenu.runMethod(false,"getRoot"));Debug.locals.put("tiMaxNivelExp", _timaxnivelexp);Debug.locals.put("tiMaxNivelExp", _timaxnivelexp);
 BA.debugLineNum = 885;BA.debugLine="CrearAccesosDirectosItem3(tiMaxNivelExp)";
Debug.ShouldStop(1048576);
_crearaccesosdirectositem3(_timaxnivelexp);
 BA.debugLineNum = 886;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _titem_mouseclicked_event(RemoteObject _methodname,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("tItem_MouseClicked_Event (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,782);
if (RapidSub.canDelegate("titem_mouseclicked_event")) { b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","titem_mouseclicked_event", _methodname, _args); return;}
ResumableSub_tItem_MouseClicked_Event rsub = new ResumableSub_tItem_MouseClicked_Event(null,_methodname,_args);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_tItem_MouseClicked_Event extends BA.ResumableSub {
public ResumableSub_tItem_MouseClicked_Event(b4j.docU.mainmenu2 parent,RemoteObject _methodname,RemoteObject _args) {
this.parent = parent;
this._methodname = _methodname;
this._args = _args;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.mainmenu2 parent;
RemoteObject _methodname;
RemoteObject _args;
RemoteObject _ti = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _jombtn = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _sbtn = RemoteObject.createImmutable("");
RemoteObject _permisocalidadok = RemoteObject.createImmutable(false);
RemoteObject _sres = RemoteObject.createImmutable("");
RemoteObject _timaxnivelexp = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("tItem_MouseClicked_Event (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,782);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("MethodName", _methodname);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 783;BA.debugLine="Dim tI As TreeItem=Sender";
Debug.ShouldStop(16384);
_ti = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_ti = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper"), parent.__c.runMethod(false,"Sender",mainmenu2.ba));Debug.locals.put("tI", _ti);Debug.locals.put("tI", _ti);
 BA.debugLineNum = 784;BA.debugLine="Dim JOMbtn As JavaObject=asJO(Args(0)).RunMethodJ";
Debug.ShouldStop(32768);
_jombtn = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jombtn = _asjo(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _args.getArrayElement(false,BA.numberCast(int.class, 0)))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getButton")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("JOMbtn", _jombtn);Debug.locals.put("JOMbtn", _jombtn);
 BA.debugLineNum = 785;BA.debugLine="Dim sBtn As String=JOMbtn.RunMethod(\"name\",Null)";
Debug.ShouldStop(65536);
_sbtn = BA.ObjectToString(_jombtn.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("name")),(Object)((parent.__c.getField(false,"Null")))));Debug.locals.put("sBtn", _sbtn);Debug.locals.put("sBtn", _sbtn);
 BA.debugLineNum = 786;BA.debugLine="Log(\"tItem_MouseClicked\")";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","81179652",RemoteObject.createImmutable("tItem_MouseClicked"),0);
 BA.debugLineNum = 787;BA.debugLine="Log(tI.Text & \" \" & tI.Expanded)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","81179653",RemoteObject.concat(_ti.runMethod(true,"getText"),RemoteObject.createImmutable(" "),_ti.runMethod(true,"getExpanded")),0);
 BA.debugLineNum = 790;BA.debugLine="If tI.Expanded Then";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 14;
if (_ti.runMethod(true,"getExpanded").<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 792;BA.debugLine="ContraerItemsOtrasRamas2(tI)";
Debug.ShouldStop(8388608);
_contraeritemsotrasramas2(_ti);
 BA.debugLineNum = 793;BA.debugLine="Select Case tI.Text   ' con este select se puede";
Debug.ShouldStop(16777216);
if (true) break;

case 4:
//select
this.state = 11;
switch (BA.switchObjectToInt(_ti.runMethod(true,"getText"),BA.ObjectToString("Calidad"))) {
case 0: {
this.state = 6;
if (true) break;
}
}
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 796;BA.debugLine="jamLoadingIndicator1.show";
Debug.ShouldStop(134217728);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 797;BA.debugLine="Dim PermisoCalidadOK As Boolean";
Debug.ShouldStop(268435456);
_permisocalidadok = RemoteObject.createImmutable(false);Debug.locals.put("PermisoCalidadOK", _permisocalidadok);
 BA.debugLineNum = 798;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsu";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "titem_mouseclicked_event"), parent._utilidades.runMethod(false,"_checkpermisosaplicacionusuarioobjetopermiso" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("PermisosAplicacion")),(Object)(parent._main._nombreaplicacion /*RemoteObject*/ ),(Object)(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("cImpresionEtiquetasOlano"))));
this.state = 15;
return;
case 15:
//C
this.state = 7;
_sres = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sRes", _sres);
;
 BA.debugLineNum = 799;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(1073741824);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 800;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\"";
Debug.ShouldStop(-2147483648);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("NO")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("ERROR")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("DENIED"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 801;BA.debugLine="tI.Expanded=False";
Debug.ShouldStop(1);
_ti.runMethod(true,"setExpanded",parent.__c.getField(true,"False"));
 BA.debugLineNum = 802;BA.debugLine="Return";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 814;BA.debugLine="Main.lstSelItem.Clear";
Debug.ShouldStop(8192);
parent._main._lstselitem /*RemoteObject*/ .runVoidMethod ("Clear");
 BA.debugLineNum = 815;BA.debugLine="SearchParentsTreeItem(tI)";
Debug.ShouldStop(16384);
_searchparentstreeitem(_ti);
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 824;BA.debugLine="ContraerItemsChildren(tI)";
Debug.ShouldStop(8388608);
_contraeritemschildren(_ti);
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 832;BA.debugLine="Dim tiMaxNivelExp As TreeItem=TreeItemMayorNivelE";
Debug.ShouldStop(-2147483648);
_timaxnivelexp = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_timaxnivelexp = _treeitemmayornivelexpandido(parent._treeviewmainmenu.runMethod(false,"getRoot"));Debug.locals.put("tiMaxNivelExp", _timaxnivelexp);Debug.locals.put("tiMaxNivelExp", _timaxnivelexp);
 BA.debugLineNum = 833;BA.debugLine="CrearAccesosDirectosItem3(tiMaxNivelExp)";
Debug.ShouldStop(1);
_crearaccesosdirectositem3(_timaxnivelexp);
 BA.debugLineNum = 834;BA.debugLine="End Sub";
Debug.ShouldStop(2);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _treeitemmayornivelexpandido(RemoteObject _ti) throws Exception{
try {
		Debug.PushSubsStack("TreeItemMayorNivelExpandido (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,2155);
if (RapidSub.canDelegate("treeitemmayornivelexpandido")) { return b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","treeitemmayornivelexpandido", _ti);}
RemoteObject _flagexpanded = RemoteObject.createImmutable(false);
RemoteObject _tich = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
 BA.debugLineNum = 2155;BA.debugLine="Sub TreeItemMayorNivelExpandido(tI As TreeItem) As";
Debug.ShouldStop(1024);
 BA.debugLineNum = 2156;BA.debugLine="If tI.Children.Size=0 Then Return tI";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_ti.runMethod(false,"getChildren").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _ti;};
 BA.debugLineNum = 2158;BA.debugLine="Dim FlagExpanded As Boolean";
Debug.ShouldStop(8192);
_flagexpanded = RemoteObject.createImmutable(false);Debug.locals.put("FlagExpanded", _flagexpanded);
 BA.debugLineNum = 2159;BA.debugLine="For Each tiCh As TreeItem In tI.Children";
Debug.ShouldStop(16384);
_tich = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
{
final RemoteObject group3 = _ti.runMethod(false,"getChildren");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_tich = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper"), group3.runMethod(false,"Get",index3));Debug.locals.put("tiCh", _tich);
Debug.locals.put("tiCh", _tich);
 BA.debugLineNum = 2160;BA.debugLine="If tiCh.Expanded Then";
Debug.ShouldStop(32768);
if (_tich.runMethod(true,"getExpanded").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2161;BA.debugLine="FlagExpanded=True";
Debug.ShouldStop(65536);
_flagexpanded = mainmenu2.__c.getField(true,"True");Debug.locals.put("FlagExpanded", _flagexpanded);
 BA.debugLineNum = 2162;BA.debugLine="Exit";
Debug.ShouldStop(131072);
if (true) break;
 };
 }
}Debug.locals.put("tiCh", _tich);
;
 BA.debugLineNum = 2165;BA.debugLine="If FlagExpanded Then";
Debug.ShouldStop(1048576);
if (_flagexpanded.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2166;BA.debugLine="Dim tI As TreeItem=TreeItemMayorNivelExpandido(t";
Debug.ShouldStop(2097152);
_ti = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_ti = _treeitemmayornivelexpandido(_tich);Debug.locals.put("tI", _ti);Debug.locals.put("tI", _ti);
 BA.debugLineNum = 2167;BA.debugLine="Return tI";
Debug.ShouldStop(4194304);
if (true) return _ti;
 }else {
 BA.debugLineNum = 2169;BA.debugLine="Return tI";
Debug.ShouldStop(16777216);
if (true) return _ti;
 };
 BA.debugLineNum = 2171;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _treeviewmainmenu_expandedchanged(RemoteObject _expanded) throws Exception{
try {
		Debug.PushSubsStack("TreeViewMainMenu_ExpandedChanged (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,1644);
if (RapidSub.canDelegate("treeviewmainmenu_expandedchanged")) { return b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","treeviewmainmenu_expandedchanged", _expanded);}
RemoteObject _ti = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("Expanded", _expanded);
 BA.debugLineNum = 1644;BA.debugLine="Sub TreeViewMainMenu_ExpandedChanged(Expanded As B";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1645;BA.debugLine="Dim ti As TreeItem=Sender";
Debug.ShouldStop(4096);
_ti = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_ti = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper"), mainmenu2.__c.runMethod(false,"Sender",mainmenu2.ba));Debug.locals.put("ti", _ti);Debug.locals.put("ti", _ti);
 BA.debugLineNum = 1646;BA.debugLine="Log(ti.Text & \" \" & ti.Expanded)";
Debug.ShouldStop(8192);
mainmenu2.__c.runVoidMethod ("LogImpl","81572866",RemoteObject.concat(_ti.runMethod(true,"getText"),RemoteObject.createImmutable(" "),_ti.runMethod(true,"getExpanded")),0);
 BA.debugLineNum = 1647;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _treeviewmainmenu_selecteditemchanged(RemoteObject _selecteditem) throws Exception{
try {
		Debug.PushSubsStack("TreeViewMainMenu_SelectedItemChanged (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,889);
if (RapidSub.canDelegate("treeviewmainmenu_selecteditemchanged")) { b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","treeviewmainmenu_selecteditemchanged", _selecteditem); return;}
ResumableSub_TreeViewMainMenu_SelectedItemChanged rsub = new ResumableSub_TreeViewMainMenu_SelectedItemChanged(null,_selecteditem);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_TreeViewMainMenu_SelectedItemChanged extends BA.ResumableSub {
public ResumableSub_TreeViewMainMenu_SelectedItemChanged(b4j.docU.mainmenu2 parent,RemoteObject _selecteditem) {
this.parent = parent;
this._selecteditem = _selecteditem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.mainmenu2 parent;
RemoteObject _selecteditem;
RemoteObject _answ = RemoteObject.createImmutable(0);
RemoteObject _ccdg = RemoteObject.declareNull("b4j.docU.ccontroldocumentosnogestionados");
RemoteObject _ccdp = RemoteObject.declareNull("b4j.docU.ccontroldocumentosperiodo");
RemoteObject _cfdoc = RemoteObject.declareNull("b4j.docU.cfasesdocumento");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _cdocfis = RemoteObject.declareNull("b4j.docU.cmarcaralbaranfisico");
RemoteObject _ccosubspnc = RemoteObject.declareNull("b4j.docU.ccontrolosubspendientesnoconfeccion");
RemoteObject _cexpsine = RemoteObject.declareNull("b4j.docU.cexpedicionessinentregartxt");
RemoteObject _cexpptxt = RemoteObject.declareNull("b4j.docU.cexpedicionesperiodotxt");
RemoteObject _cexpdhl = RemoteObject.declareNull("b4j.docU.cexpedicionesnoentregadasdhl");
RemoteObject _cexppcex = RemoteObject.declareNull("b4j.docU.cinfoenviosperiodocorreosexpress2");
RemoteObject _cinfoexpedcorreosexp = RemoteObject.declareNull("b4j.docU.cinfoexpedicioncorreosexpress");
RemoteObject _cdocsexp = RemoteObject.declareNull("b4j.docU.cdocumentosnavexpedicion");
RemoteObject _sres = RemoteObject.createImmutable("");
RemoteObject _permisomodulousuario = RemoteObject.createImmutable("");
RemoteObject _csegfpc = RemoteObject.declareNull("b4j.docU.cseguimientofechasprometidascompra");
RemoteObject _cincprov = RemoteObject.declareNull("b4j.docU.cincidenciasproveedorlista");
RemoteObject _ctareasabiertasincprov = RemoteObject.declareNull("b4j.docU.cincidenciasproveedortareasabiertas");
RemoteObject _cevalprov = RemoteObject.declareNull("b4j.docU.cevaluacionproveedores");
RemoteObject _cgvtas = RemoteObject.declareNull("b4j.docU.cgestionventas");
RemoteObject _clistaantarifasventa = RemoteObject.declareNull("b4j.docU.clistaanalisistarifasventa");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _testsinfomagento = RemoteObject.declareNull("b4j.docU.ctestsinfomagento");
RemoteObject _b2blistapedcli = RemoteObject.declareNull("b4j.docU.cb2blistapedidoscliente");
RemoteObject _cpedidosrepsol = RemoteObject.declareNull("b4j.docU.crepsol");
RemoteObject _repsolinformacionlogisticaalbaran = RemoteObject.declareNull("b4j.docU.crepsolinformacionlogisticaalbaran");
RemoteObject _generacionficheroscsvplantillapedidosventa = RemoteObject.declareNull("b4j.docU.cgeneracionficheroscsvplantillapedidosventa");
RemoteObject _cinfexpedcliente = RemoteObject.declareNull("b4j.docU.cinformesexpedicionesclientes");
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _canalisisdispalmarttalla = RemoteObject.declareNull("b4j.docU.canalisisdisponiblesalmacenarticulotalla");
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _canalisisdisparttallaalmacenescomputables = RemoteObject.declareNull("b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables");
RemoteObject _cpermapl = RemoteObject.declareNull("b4j.docU.cpermisosaplicacion");
RemoteObject _b4xlongmsg = RemoteObject.declareNull("b4j.docU.b4xlongtexttemplate");
RemoteObject _sba = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("TreeViewMainMenu_SelectedItemChanged (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,889);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("SelectedItem", _selecteditem);
 BA.debugLineNum = 890;BA.debugLine="If SelectedItem.IsInitialized=False Then Return";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_selecteditem.runMethod(true,"IsInitialized"),parent.__c.getField(true,"False"))) { 
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
 BA.debugLineNum = 891;BA.debugLine="Main.TreeItemMenuAbreForm=SelectedItem";
Debug.ShouldStop(67108864);
parent._main._treeitemmenuabreform /*RemoteObject*/  = _selecteditem;
 BA.debugLineNum = 895;BA.debugLine="LogColor(\"SelectedItem \" & SelectedItem.Text,xui.";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","81310726",RemoteObject.concat(RemoteObject.createImmutable("SelectedItem "),_selecteditem.runMethod(true,"getText")),parent._xui.getField(true,"Color_Blue"));
 BA.debugLineNum = 899;BA.debugLine="Select SelectedItem.Text";
Debug.ShouldStop(4);
if (true) break;

case 7:
//select
this.state = 218;
switch (BA.switchObjectToInt(_selecteditem.runMethod(true,"getText"),BA.ObjectToString("Salir de la aplicación"),BA.ObjectToString("Documentos No Gestionados"),BA.ObjectToString("Documentos Periodo"),BA.ObjectToString("Fases Documento"),BA.ObjectToString("Marcar Albarán Físico"),BA.ObjectToString("OSUBs Pendientes No Confección"),BA.ObjectToString("Expediciones Sin Entregar TXT"),BA.ObjectToString("Expediciones Periodo TXT"),BA.ObjectToString("Expediciones Sin Entregar DHL"),BA.ObjectToString("Expediciones Periodo Correos Express"),BA.ObjectToString("Info Expedición Correos Express"),BA.ObjectToString("Documentos Expedición"),BA.ObjectToString("Seguimiento Fechas Prometidas Pedidos Compra"),BA.ObjectToString("Incidencias Proveedor"),BA.ObjectToString("Tareas Pendientes Incidencias Proveedor"),BA.ObjectToString("Evaluación Proveedores"),BA.ObjectToString("Gestión Ventas"),BA.ObjectToString("Análisis Tarifas Venta"),BA.ObjectToString("Tests Info Magento"),BA.ObjectToString("Pedidos Clientes"),BA.ObjectToString("Importacion Pedidos EESS Repsol"),BA.ObjectToString("Albaranes Venta Repsol"),BA.ObjectToString("Generación Ficheros CSV Plantilla Pedidos Venta"),BA.ObjectToString("Informes Expediciones Clientes"),BA.ObjectToString("Reiniciar sincronización Docuware"),BA.ObjectToString("Incidencias Proveedor Almacén"),BA.ObjectToString("Análisis Disponibles Almacén Artículo Talla"),BA.ObjectToString("Análisis Disponibles Artículo Talla Almacenes Computables"),BA.ObjectToString("Crear Excel Links Ficheros Carpeta"),BA.ObjectToString("Permisos Aplicacion"),BA.ObjectToString("Acerca De"))) {
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
 BA.debugLineNum = 901;BA.debugLine="Dim answ As Int";
Debug.ShouldStop(16);
_answ = RemoteObject.createImmutable(0);Debug.locals.put("answ", _answ);
 BA.debugLineNum = 902;BA.debugLine="answ=Main.fx.Msgbox2(frm,\"¿Salir de la aplicaci";
Debug.ShouldStop(32);
_answ = parent._main._fx /*RemoteObject*/ .runMethodAndSync(true,"Msgbox2",(Object)(parent._frm),(Object)(BA.ObjectToString("¿Salir de la aplicación?")),(Object)(BA.ObjectToString("Salir")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)(parent._main._fx /*RemoteObject*/ .getField(false,"MSGBOX_CONFIRMATION")));Debug.locals.put("answ", _answ);
 BA.debugLineNum = 903;BA.debugLine="If answ=Main.fx.DialogResponse.POSITIVE Then";
Debug.ShouldStop(64);
if (true) break;

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",_answ,BA.numberCast(double.class, parent._main._fx /*RemoteObject*/ .getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 906;BA.debugLine="ExitApplication";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;

case 13:
//C
this.state = 218;
;
 if (true) break;

case 15:
//C
this.state = 218;
 BA.debugLineNum = 926;BA.debugLine="Dim cCDG As cControlDocumentosNoGestionados";
Debug.ShouldStop(536870912);
_ccdg = RemoteObject.createNew ("b4j.docU.ccontroldocumentosnogestionados");Debug.locals.put("cCDG", _ccdg);
 BA.debugLineNum = 927;BA.debugLine="cCDG.Initialize";
Debug.ShouldStop(1073741824);
_ccdg.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 928;BA.debugLine="cCDG.Show";
Debug.ShouldStop(-2147483648);
_ccdg.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_show" /*void*/ );
 BA.debugLineNum = 929;BA.debugLine="frm.Close";
Debug.ShouldStop(1);
parent._frm.runVoidMethod ("Close");
 if (true) break;

case 17:
//C
this.state = 218;
 BA.debugLineNum = 932;BA.debugLine="Dim cCDP As cControlDocumentosPeriodo";
Debug.ShouldStop(8);
_ccdp = RemoteObject.createNew ("b4j.docU.ccontroldocumentosperiodo");Debug.locals.put("cCDP", _ccdp);
 BA.debugLineNum = 933;BA.debugLine="cCDP.Initialize";
Debug.ShouldStop(16);
_ccdp.runClassMethod (b4j.docU.ccontroldocumentosperiodo.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 934;BA.debugLine="cCDP.Show";
Debug.ShouldStop(32);
_ccdp.runClassMethod (b4j.docU.ccontroldocumentosperiodo.class, "_show" /*void*/ );
 BA.debugLineNum = 935;BA.debugLine="frm.Close";
Debug.ShouldStop(64);
parent._frm.runVoidMethod ("Close");
 if (true) break;

case 19:
//C
this.state = 218;
 BA.debugLineNum = 938;BA.debugLine="Dim cFDoc As cFasesDocumento";
Debug.ShouldStop(512);
_cfdoc = RemoteObject.createNew ("b4j.docU.cfasesdocumento");Debug.locals.put("cFDoc", _cfdoc);
 BA.debugLineNum = 939;BA.debugLine="cFDoc.Initialize(Me, frm.RootPane,\"\")";
Debug.ShouldStop(1024);
_cfdoc.runClassMethod (b4j.docU.cfasesdocumento.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba,(Object)(mainmenu2.getObject()),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent._frm.runMethod(false,"getRootPane").getObject()),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 940;BA.debugLine="cFDoc.Show";
Debug.ShouldStop(2048);
_cfdoc.runClassMethod (b4j.docU.cfasesdocumento.class, "_show" /*void*/ );
 if (true) break;

case 21:
//C
this.state = 218;
 BA.debugLineNum = 944;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"pendiente de";
Debug.ShouldStop(32768);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(BA.ObjectToString("pendiente de programar...")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 945;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 219;
return;
case 219:
//C
this.state = 218;
;
 BA.debugLineNum = 946;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return ;
 BA.debugLineNum = 948;BA.debugLine="Dim cDocFis As cMarcarAlbaranFisico";
Debug.ShouldStop(524288);
_cdocfis = RemoteObject.createNew ("b4j.docU.cmarcaralbaranfisico");Debug.locals.put("cDocFis", _cdocfis);
 BA.debugLineNum = 949;BA.debugLine="cDocFis.Initialize";
Debug.ShouldStop(1048576);
_cdocfis.runClassMethod (b4j.docU.cmarcaralbaranfisico.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 950;BA.debugLine="cDocFis.Show";
Debug.ShouldStop(2097152);
_cdocfis.runClassMethod (b4j.docU.cmarcaralbaranfisico.class, "_show" /*void*/ );
 BA.debugLineNum = 951;BA.debugLine="frm.Close";
Debug.ShouldStop(4194304);
parent._frm.runVoidMethod ("Close");
 if (true) break;

case 23:
//C
this.state = 218;
 BA.debugLineNum = 954;BA.debugLine="Dim cCOSUBsPNC As cControlOSUBsPendientesNoConf";
Debug.ShouldStop(33554432);
_ccosubspnc = RemoteObject.createNew ("b4j.docU.ccontrolosubspendientesnoconfeccion");Debug.locals.put("cCOSUBsPNC", _ccosubspnc);
 BA.debugLineNum = 955;BA.debugLine="cCOSUBsPNC.Initialize";
Debug.ShouldStop(67108864);
_ccosubspnc.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 956;BA.debugLine="cCOSUBsPNC.Show";
Debug.ShouldStop(134217728);
_ccosubspnc.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_show" /*void*/ );
 BA.debugLineNum = 957;BA.debugLine="frm.Close";
Debug.ShouldStop(268435456);
parent._frm.runVoidMethod ("Close");
 if (true) break;

case 25:
//C
this.state = 218;
 BA.debugLineNum = 960;BA.debugLine="Dim cExpSinE As cExpedicionesSinEntregarTXT";
Debug.ShouldStop(-2147483648);
_cexpsine = RemoteObject.createNew ("b4j.docU.cexpedicionessinentregartxt");Debug.locals.put("cExpSinE", _cexpsine);
 BA.debugLineNum = 961;BA.debugLine="cExpSinE.Initialize";
Debug.ShouldStop(1);
_cexpsine.runClassMethod (b4j.docU.cexpedicionessinentregartxt.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 962;BA.debugLine="cExpSinE.Show";
Debug.ShouldStop(2);
_cexpsine.runClassMethod (b4j.docU.cexpedicionessinentregartxt.class, "_show" /*void*/ );
 BA.debugLineNum = 963;BA.debugLine="frm.Close";
Debug.ShouldStop(4);
parent._frm.runVoidMethod ("Close");
 if (true) break;

case 27:
//C
this.state = 218;
 BA.debugLineNum = 966;BA.debugLine="Dim cExpPTXT As cExpedicionesPeriodoTXT";
Debug.ShouldStop(32);
_cexpptxt = RemoteObject.createNew ("b4j.docU.cexpedicionesperiodotxt");Debug.locals.put("cExpPTXT", _cexpptxt);
 BA.debugLineNum = 967;BA.debugLine="cExpPTXT.Initialize";
Debug.ShouldStop(64);
_cexpptxt.runClassMethod (b4j.docU.cexpedicionesperiodotxt.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 968;BA.debugLine="cExpPTXT.Show";
Debug.ShouldStop(128);
_cexpptxt.runClassMethod (b4j.docU.cexpedicionesperiodotxt.class, "_show" /*void*/ );
 BA.debugLineNum = 969;BA.debugLine="frm.Close";
Debug.ShouldStop(256);
parent._frm.runVoidMethod ("Close");
 if (true) break;

case 29:
//C
this.state = 218;
 BA.debugLineNum = 976;BA.debugLine="Dim cExpDHL As cExpedicionesNoEntregadasDHL";
Debug.ShouldStop(32768);
_cexpdhl = RemoteObject.createNew ("b4j.docU.cexpedicionesnoentregadasdhl");Debug.locals.put("cExpDHL", _cexpdhl);
 BA.debugLineNum = 977;BA.debugLine="cExpDHL.Initialize";
Debug.ShouldStop(65536);
_cexpdhl.runClassMethod (b4j.docU.cexpedicionesnoentregadasdhl.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 978;BA.debugLine="cExpDHL.Show";
Debug.ShouldStop(131072);
_cexpdhl.runClassMethod (b4j.docU.cexpedicionesnoentregadasdhl.class, "_show" /*void*/ );
 BA.debugLineNum = 979;BA.debugLine="frm.Close";
Debug.ShouldStop(262144);
parent._frm.runVoidMethod ("Close");
 if (true) break;

case 31:
//C
this.state = 218;
 BA.debugLineNum = 983;BA.debugLine="Dim cExpPCEx As cInfoEnviosPeriodoCorreosExpress";
Debug.ShouldStop(4194304);
_cexppcex = RemoteObject.createNew ("b4j.docU.cinfoenviosperiodocorreosexpress2");Debug.locals.put("cExpPCEx", _cexppcex);
 BA.debugLineNum = 984;BA.debugLine="cExpPCEx.Initialize";
Debug.ShouldStop(8388608);
_cexppcex.runClassMethod (b4j.docU.cinfoenviosperiodocorreosexpress2.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 985;BA.debugLine="cExpPCEx.Show";
Debug.ShouldStop(16777216);
_cexppcex.runClassMethod (b4j.docU.cinfoenviosperiodocorreosexpress2.class, "_show" /*void*/ );
 BA.debugLineNum = 986;BA.debugLine="frm.Close";
Debug.ShouldStop(33554432);
parent._frm.runVoidMethod ("Close");
 if (true) break;

case 33:
//C
this.state = 218;
 BA.debugLineNum = 990;BA.debugLine="Dim cInfoExpedCorreosExp As cInfoExpedicionCorr";
Debug.ShouldStop(536870912);
_cinfoexpedcorreosexp = RemoteObject.createNew ("b4j.docU.cinfoexpedicioncorreosexpress");Debug.locals.put("cInfoExpedCorreosExp", _cinfoexpedcorreosexp);
 BA.debugLineNum = 991;BA.debugLine="cInfoExpedCorreosExp.Initialize(\"\")";
Debug.ShouldStop(1073741824);
_cinfoexpedcorreosexp.runClassMethod (b4j.docU.cinfoexpedicioncorreosexpress.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 992;BA.debugLine="cInfoExpedCorreosExp.Show";
Debug.ShouldStop(-2147483648);
_cinfoexpedcorreosexp.runClassMethod (b4j.docU.cinfoexpedicioncorreosexpress.class, "_show" /*void*/ );
 if (true) break;

case 35:
//C
this.state = 218;
 BA.debugLineNum = 996;BA.debugLine="Dim cDocsExp As cDocumentosNAVExpedicion";
Debug.ShouldStop(8);
_cdocsexp = RemoteObject.createNew ("b4j.docU.cdocumentosnavexpedicion");Debug.locals.put("cDocsExp", _cdocsexp);
 BA.debugLineNum = 997;BA.debugLine="cDocsExp.Initialize";
Debug.ShouldStop(16);
_cdocsexp.runClassMethod (b4j.docU.cdocumentosnavexpedicion.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 998;BA.debugLine="cDocsExp.Show";
Debug.ShouldStop(32);
_cdocsexp.runClassMethod (b4j.docU.cdocumentosnavexpedicion.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 999;BA.debugLine="frm.Close";
Debug.ShouldStop(64);
parent._frm.runVoidMethod ("Close");
 if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 1003;BA.debugLine="Wait For(cmPermisos.PermisosAplicacionUsuarioOb";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","complete", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._cmpermisos.runMethod(false,"_permisosaplicacionusuarioobjetopermiso" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("PermisosAplicacion")),(Object)(parent._main._nombreaplicacion /*RemoteObject*/ ),(Object)(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("cSeguimientoFechasPrometidasCompra"))));
this.state = 220;
return;
case 220:
//C
this.state = 38;
_sres = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sRes", _sres);
;
 BA.debugLineNum = 1004;BA.debugLine="Select Case sRes";
Debug.ShouldStop(2048);
if (true) break;

case 38:
//select
this.state = 49;
switch (BA.switchObjectToInt(_sres,BA.ObjectToString("ErrConn"),BA.ObjectToString("SinPermiso"),BA.ObjectToString("ERROR"),BA.ObjectToString("DENIED"))) {
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
 BA.debugLineNum = 1006;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de c";
Debug.ShouldStop(8192);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(BA.ObjectToString("Error de conexion servidor/query.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1007;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 221;
return;
case 221:
//C
this.state = 49;
;
 BA.debugLineNum = 1008;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return ;
 if (true) break;

case 42:
//C
this.state = 49;
 BA.debugLineNum = 1010;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes";
Debug.ShouldStop(131072);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(BA.ObjectToString("No tienes permiso para acceder a este módulo.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1011;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 222;
return;
case 222:
//C
this.state = 49;
;
 BA.debugLineNum = 1012;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return ;
 if (true) break;

case 44:
//C
this.state = 49;
 BA.debugLineNum = 1014;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sRes,\"Error";
Debug.ShouldStop(2097152);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(_sres),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1015;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 223;
return;
case 223:
//C
this.state = 49;
;
 BA.debugLineNum = 1016;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return ;
 if (true) break;

case 46:
//C
this.state = 49;
 BA.debugLineNum = 1018;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes";
Debug.ShouldStop(33554432);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(BA.ObjectToString("No tienes permiso para acceder a este módulo.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1019;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 224;
return;
case 224:
//C
this.state = 49;
;
 BA.debugLineNum = 1020;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return ;
 if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 1022;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
Debug.ShouldStop(536870912);
_permisomodulousuario = _sres;Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);
 if (true) break;

case 49:
//C
this.state = 218;
;
 BA.debugLineNum = 1026;BA.debugLine="Dim cSegFPC As cSeguimientoFechasPrometidasComp";
Debug.ShouldStop(2);
_csegfpc = RemoteObject.createNew ("b4j.docU.cseguimientofechasprometidascompra");Debug.locals.put("cSegFPC", _csegfpc);
 BA.debugLineNum = 1027;BA.debugLine="cSegFPC.Initialize";
Debug.ShouldStop(4);
_csegfpc.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 1028;BA.debugLine="cSegFPC.PermisoUsuarioModulo=PermisoModuloUsuar";
Debug.ShouldStop(8);
_csegfpc.setField ("_permisousuariomodulo" /*RemoteObject*/ ,_permisomodulousuario);
 BA.debugLineNum = 1029;BA.debugLine="cSegFPC.Show";
Debug.ShouldStop(16);
_csegfpc.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_show" /*void*/ );
 BA.debugLineNum = 1030;BA.debugLine="frm.Close";
Debug.ShouldStop(32);
parent._frm.runVoidMethod ("Close");
 if (true) break;

case 51:
//C
this.state = 52;
 BA.debugLineNum = 1033;BA.debugLine="Wait For(cmPermisos.PermisosAplicacionUsuarioOb";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","complete", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._cmpermisos.runMethod(false,"_permisosaplicacionusuarioobjetopermiso" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("PermisosAplicacion")),(Object)(parent._main._nombreaplicacion /*RemoteObject*/ ),(Object)(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("IncidenciasProveedorCompras"))));
this.state = 225;
return;
case 225:
//C
this.state = 52;
_sres = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sRes", _sres);
;
 BA.debugLineNum = 1034;BA.debugLine="Select Case sRes";
Debug.ShouldStop(512);
if (true) break;

case 52:
//select
this.state = 63;
switch (BA.switchObjectToInt(_sres,BA.ObjectToString("ErrConn"),BA.ObjectToString("SinPermiso"),BA.ObjectToString("ERROR"),BA.ObjectToString("DENIED"))) {
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
 BA.debugLineNum = 1036;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de c";
Debug.ShouldStop(2048);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(BA.ObjectToString("Error de conexion servidor/query.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1037;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 226;
return;
case 226:
//C
this.state = 63;
;
 BA.debugLineNum = 1038;BA.debugLine="Return";
Debug.ShouldStop(8192);
if (true) return ;
 if (true) break;

case 56:
//C
this.state = 63;
 BA.debugLineNum = 1040;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes";
Debug.ShouldStop(32768);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(BA.ObjectToString("No tienes permiso para acceder a este módulo.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1041;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 227;
return;
case 227:
//C
this.state = 63;
;
 BA.debugLineNum = 1042;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return ;
 if (true) break;

case 58:
//C
this.state = 63;
 BA.debugLineNum = 1044;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sRes,\"Error";
Debug.ShouldStop(524288);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(_sres),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1045;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 228;
return;
case 228:
//C
this.state = 63;
;
 BA.debugLineNum = 1046;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return ;
 if (true) break;

case 60:
//C
this.state = 63;
 BA.debugLineNum = 1048;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes";
Debug.ShouldStop(8388608);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(BA.ObjectToString("No tienes permiso para acceder a este módulo.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1049;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 229;
return;
case 229:
//C
this.state = 63;
;
 BA.debugLineNum = 1050;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return ;
 if (true) break;

case 62:
//C
this.state = 63;
 BA.debugLineNum = 1052;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
Debug.ShouldStop(134217728);
_permisomodulousuario = _sres;Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);
 if (true) break;

case 63:
//C
this.state = 218;
;
 BA.debugLineNum = 1055;BA.debugLine="Dim cIncProv As cIncidenciasProveedorLista";
Debug.ShouldStop(1073741824);
_cincprov = RemoteObject.createNew ("b4j.docU.cincidenciasproveedorlista");Debug.locals.put("cIncProv", _cincprov);
 BA.debugLineNum = 1056;BA.debugLine="cIncProv.Initialize";
Debug.ShouldStop(-2147483648);
_cincprov.runClassMethod (b4j.docU.cincidenciasproveedorlista.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 1057;BA.debugLine="cIncProv.DepartamentoEmisor=\"COMPRAS\"";
Debug.ShouldStop(1);
_cincprov.setField ("_departamentoemisor" /*RemoteObject*/ ,BA.ObjectToString("COMPRAS"));
 BA.debugLineNum = 1058;BA.debugLine="cIncProv.Show";
Debug.ShouldStop(2);
_cincprov.runClassMethod (b4j.docU.cincidenciasproveedorlista.class, "_show" /*void*/ );
 BA.debugLineNum = 1059;BA.debugLine="frm.Close";
Debug.ShouldStop(4);
parent._frm.runVoidMethod ("Close");
 if (true) break;

case 65:
//C
this.state = 218;
 BA.debugLineNum = 1062;BA.debugLine="Dim cTareasAbiertasIncProv As cIncidenciasProve";
Debug.ShouldStop(32);
_ctareasabiertasincprov = RemoteObject.createNew ("b4j.docU.cincidenciasproveedortareasabiertas");Debug.locals.put("cTareasAbiertasIncProv", _ctareasabiertasincprov);
 BA.debugLineNum = 1063;BA.debugLine="cTareasAbiertasIncProv.Initialize";
Debug.ShouldStop(64);
_ctareasabiertasincprov.runClassMethod (b4j.docU.cincidenciasproveedortareasabiertas.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 1064;BA.debugLine="cTareasAbiertasIncProv.Show";
Debug.ShouldStop(128);
_ctareasabiertasincprov.runClassMethod (b4j.docU.cincidenciasproveedortareasabiertas.class, "_show" /*void*/ );
 BA.debugLineNum = 1065;BA.debugLine="frm.Close";
Debug.ShouldStop(256);
parent._frm.runVoidMethod ("Close");
 if (true) break;

case 67:
//C
this.state = 68;
 BA.debugLineNum = 1068;BA.debugLine="Wait For(cmPermisos.PermisosAplicacionUsuarioOb";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._cmpermisos.runMethod(false,"_permisosaplicacionusuarioobjetopermiso" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("PermisosAplicacion")),(Object)(parent._main._nombreaplicacion /*RemoteObject*/ ),(Object)(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("EvaluacionProveedores"))));
this.state = 230;
return;
case 230:
//C
this.state = 68;
_sres = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sRes", _sres);
;
 BA.debugLineNum = 1069;BA.debugLine="Select Case sRes";
Debug.ShouldStop(4096);
if (true) break;

case 68:
//select
this.state = 79;
switch (BA.switchObjectToInt(_sres,BA.ObjectToString("ErrConn"),BA.ObjectToString("SinPermiso"),BA.ObjectToString("ERROR"),BA.ObjectToString("DENIED"))) {
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
 BA.debugLineNum = 1071;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de c";
Debug.ShouldStop(16384);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(BA.ObjectToString("Error de conexion servidor/query.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1072;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 231;
return;
case 231:
//C
this.state = 79;
;
 BA.debugLineNum = 1073;BA.debugLine="Return";
Debug.ShouldStop(65536);
if (true) return ;
 if (true) break;

case 72:
//C
this.state = 79;
 BA.debugLineNum = 1075;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes";
Debug.ShouldStop(262144);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(BA.ObjectToString("No tienes permiso para acceder a este módulo.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1076;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 232;
return;
case 232:
//C
this.state = 79;
;
 BA.debugLineNum = 1077;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) return ;
 if (true) break;

case 74:
//C
this.state = 79;
 BA.debugLineNum = 1079;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sRes,\"Error";
Debug.ShouldStop(4194304);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(_sres),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1080;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 233;
return;
case 233:
//C
this.state = 79;
;
 BA.debugLineNum = 1081;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return ;
 if (true) break;

case 76:
//C
this.state = 79;
 BA.debugLineNum = 1083;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes";
Debug.ShouldStop(67108864);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(BA.ObjectToString("No tienes permiso para acceder a este módulo.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1084;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 234;
return;
case 234:
//C
this.state = 79;
;
 BA.debugLineNum = 1085;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return ;
 if (true) break;

case 78:
//C
this.state = 79;
 BA.debugLineNum = 1087;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
Debug.ShouldStop(1073741824);
_permisomodulousuario = _sres;Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);
 if (true) break;

case 79:
//C
this.state = 218;
;
 BA.debugLineNum = 1090;BA.debugLine="Dim cEvalProv As cEvaluacionProveedores";
Debug.ShouldStop(2);
_cevalprov = RemoteObject.createNew ("b4j.docU.cevaluacionproveedores");Debug.locals.put("cEvalProv", _cevalprov);
 BA.debugLineNum = 1091;BA.debugLine="cEvalProv.Initialize";
Debug.ShouldStop(4);
_cevalprov.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 1092;BA.debugLine="cEvalProv.Show";
Debug.ShouldStop(8);
_cevalprov.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_show" /*void*/ );
 BA.debugLineNum = 1093;BA.debugLine="frm.Close";
Debug.ShouldStop(16);
parent._frm.runVoidMethod ("Close");
 if (true) break;

case 81:
//C
this.state = 82;
 BA.debugLineNum = 1120;BA.debugLine="jamLoadingIndicator1.show";
Debug.ShouldStop(-2147483648);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 1121;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsua";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._utilidades.runMethod(false,"_checkpermisosaplicacionusuarioobjetopermiso" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("PermisosAplicacion")),(Object)(parent._main._nombreaplicacion /*RemoteObject*/ ),(Object)(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("cGestionVentas"))));
this.state = 235;
return;
case 235:
//C
this.state = 82;
_sres = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sRes", _sres);
;
 BA.debugLineNum = 1122;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(2);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1123;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\" T";
Debug.ShouldStop(4);
if (true) break;

case 82:
//if
this.state = 87;
if (RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("NO")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("ERROR")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("DENIED"))) { 
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
 BA.debugLineNum = 1124;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
Debug.ShouldStop(8);
_permisomodulousuario = _sres;Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);
 BA.debugLineNum = 1126;BA.debugLine="Dim cGVtas As cGestionVentas";
Debug.ShouldStop(32);
_cgvtas = RemoteObject.createNew ("b4j.docU.cgestionventas");Debug.locals.put("cGVtas", _cgvtas);
 BA.debugLineNum = 1127;BA.debugLine="cGVtas.Initialize";
Debug.ShouldStop(64);
_cgvtas.runClassMethod (b4j.docU.cgestionventas.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 1128;BA.debugLine="cGVtas.PermisoModuloUsuario=PermisoModuloUsuari";
Debug.ShouldStop(128);
_cgvtas.setField ("_permisomodulousuario" /*RemoteObject*/ ,_permisomodulousuario);
 BA.debugLineNum = 1129;BA.debugLine="cGVtas.Show";
Debug.ShouldStop(256);
_cgvtas.runClassMethod (b4j.docU.cgestionventas.class, "_show" /*void*/ );
 BA.debugLineNum = 1130;BA.debugLine="frm.Close";
Debug.ShouldStop(512);
parent._frm.runVoidMethod ("Close");
 if (true) break;

case 89:
//C
this.state = 90;
 BA.debugLineNum = 1156;BA.debugLine="jamLoadingIndicator1.show";
Debug.ShouldStop(8);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 1157;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsua";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","complete", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._utilidades.runMethod(false,"_checkpermisosaplicacionusuarioobjetopermiso" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("PermisosAplicacion")),(Object)(parent._main._nombreaplicacion /*RemoteObject*/ ),(Object)(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("cAnalisisTarifasVenta"))));
this.state = 236;
return;
case 236:
//C
this.state = 90;
_sres = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sRes", _sres);
;
 BA.debugLineNum = 1158;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(32);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1159;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\" T";
Debug.ShouldStop(64);
if (true) break;

case 90:
//if
this.state = 95;
if (RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("NO")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("ERROR")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("DENIED"))) { 
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
 BA.debugLineNum = 1160;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
Debug.ShouldStop(128);
_permisomodulousuario = _sres;Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);
 BA.debugLineNum = 1165;BA.debugLine="Dim cListaAnTarifasVenta As cListaAnalisisTarif";
Debug.ShouldStop(4096);
_clistaantarifasventa = RemoteObject.createNew ("b4j.docU.clistaanalisistarifasventa");Debug.locals.put("cListaAnTarifasVenta", _clistaantarifasventa);
 BA.debugLineNum = 1166;BA.debugLine="cListaAnTarifasVenta.Initialize";
Debug.ShouldStop(8192);
_clistaantarifasventa.runClassMethod (b4j.docU.clistaanalisistarifasventa.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 1167;BA.debugLine="cListaAnTarifasVenta.PermisoModuloUsuario=Permi";
Debug.ShouldStop(16384);
_clistaantarifasventa.setField ("_permisomodulousuario" /*RemoteObject*/ ,_permisomodulousuario);
 BA.debugLineNum = 1168;BA.debugLine="cListaAnTarifasVenta.Show";
Debug.ShouldStop(32768);
_clistaantarifasventa.runClassMethod (b4j.docU.clistaanalisistarifasventa.class, "_show" /*void*/ );
 BA.debugLineNum = 1169;BA.debugLine="frm.Close";
Debug.ShouldStop(65536);
parent._frm.runVoidMethod ("Close");
 if (true) break;

case 97:
//C
this.state = 98;
 BA.debugLineNum = 1188;BA.debugLine="jamLoadingIndicator1.show";
Debug.ShouldStop(8);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 1189;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsua";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","complete", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._utilidades.runMethod(false,"_checkpermisosaplicacionusuarioobjetopermiso" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("PermisosAplicacion")),(Object)(parent._main._nombreaplicacion /*RemoteObject*/ ),(Object)(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("cB2B"))));
this.state = 237;
return;
case 237:
//C
this.state = 98;
_sres = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sRes", _sres);
;
 BA.debugLineNum = 1190;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(32);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1191;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\" T";
Debug.ShouldStop(64);
if (true) break;

case 98:
//if
this.state = 103;
if (RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("NO")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("ERROR")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("DENIED"))) { 
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
 BA.debugLineNum = 1192;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
Debug.ShouldStop(128);
_permisomodulousuario = _sres;Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);
 BA.debugLineNum = 1194;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Aviso\",\"Módulo";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","complete", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._utilidades.runMethod(false,"_msgbox2xui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(BA.ObjectToString("Módulo en pruebas. No utilizar. ¿Continuar?")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), parent.__c.getField(false,"Null"))));
this.state = 238;
return;
case 238:
//C
this.state = 104;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1195;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
Debug.ShouldStop(1024);
if (true) break;

case 104:
//if
this.state = 109;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 1197;BA.debugLine="Dim TestsInfoMagento As cTestsInfoMagento";
Debug.ShouldStop(4096);
_testsinfomagento = RemoteObject.createNew ("b4j.docU.ctestsinfomagento");Debug.locals.put("TestsInfoMagento", _testsinfomagento);
 BA.debugLineNum = 1198;BA.debugLine="TestsInfoMagento.Initialize";
Debug.ShouldStop(8192);
_testsinfomagento.runClassMethod (b4j.docU.ctestsinfomagento.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 1199;BA.debugLine="TestsInfoMagento.PermisoModuloUsuario=PermisoMo";
Debug.ShouldStop(16384);
_testsinfomagento.setField ("_permisomodulousuario" /*RemoteObject*/ ,_permisomodulousuario);
 BA.debugLineNum = 1200;BA.debugLine="TestsInfoMagento.Show";
Debug.ShouldStop(32768);
_testsinfomagento.runClassMethod (b4j.docU.ctestsinfomagento.class, "_show" /*void*/ );
 BA.debugLineNum = 1201;BA.debugLine="frm.Close";
Debug.ShouldStop(65536);
parent._frm.runVoidMethod ("Close");
 if (true) break;

case 111:
//C
this.state = 112;
 BA.debugLineNum = 1204;BA.debugLine="jamLoadingIndicator1.show";
Debug.ShouldStop(524288);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 1205;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsua";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","complete", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._utilidades.runMethod(false,"_checkpermisosaplicacionusuarioobjetopermiso" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("PermisosAplicacion")),(Object)(parent._main._nombreaplicacion /*RemoteObject*/ ),(Object)(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("cB2B"))));
this.state = 239;
return;
case 239:
//C
this.state = 112;
_sres = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sRes", _sres);
;
 BA.debugLineNum = 1206;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(2097152);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1207;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\" T";
Debug.ShouldStop(4194304);
if (true) break;

case 112:
//if
this.state = 117;
if (RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("NO")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("ERROR")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("DENIED"))) { 
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
 BA.debugLineNum = 1208;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
Debug.ShouldStop(8388608);
_permisomodulousuario = _sres;Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);
 BA.debugLineNum = 1210;BA.debugLine="Dim B2BListaPedCli As cB2BListaPedidosCliente";
Debug.ShouldStop(33554432);
_b2blistapedcli = RemoteObject.createNew ("b4j.docU.cb2blistapedidoscliente");Debug.locals.put("B2BListaPedCli", _b2blistapedcli);
 BA.debugLineNum = 1211;BA.debugLine="B2BListaPedCli.Initialize";
Debug.ShouldStop(67108864);
_b2blistapedcli.runClassMethod (b4j.docU.cb2blistapedidoscliente.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 1212;BA.debugLine="frm.Close";
Debug.ShouldStop(134217728);
parent._frm.runVoidMethod ("Close");
 if (true) break;

case 119:
//C
this.state = 120;
 BA.debugLineNum = 1247;BA.debugLine="jamLoadingIndicator1.show";
Debug.ShouldStop(1073741824);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 1248;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsua";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._utilidades.runMethod(false,"_checkpermisosaplicacionusuarioobjetopermiso" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("PermisosAplicacion")),(Object)(parent._main._nombreaplicacion /*RemoteObject*/ ),(Object)(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("cFTPRepsol"))));
this.state = 240;
return;
case 240:
//C
this.state = 120;
_sres = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sRes", _sres);
;
 BA.debugLineNum = 1249;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(1);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1250;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\" T";
Debug.ShouldStop(2);
if (true) break;

case 120:
//if
this.state = 125;
if (RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("NO")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("ERROR")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("DENIED"))) { 
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
 BA.debugLineNum = 1251;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
Debug.ShouldStop(4);
_permisomodulousuario = _sres;Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);
 BA.debugLineNum = 1256;BA.debugLine="Dim cPedidosRepsol As cRepsol";
Debug.ShouldStop(128);
_cpedidosrepsol = RemoteObject.createNew ("b4j.docU.crepsol");Debug.locals.put("cPedidosRepsol", _cpedidosrepsol);
 BA.debugLineNum = 1257;BA.debugLine="cPedidosRepsol.Initialize";
Debug.ShouldStop(256);
_cpedidosrepsol.runClassMethod (b4j.docU.crepsol.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 1258;BA.debugLine="cPedidosRepsol.PermisoModuloUsuario=PermisoModu";
Debug.ShouldStop(512);
_cpedidosrepsol.setField ("_permisomodulousuario" /*RemoteObject*/ ,_permisomodulousuario);
 BA.debugLineNum = 1259;BA.debugLine="cPedidosRepsol.Show";
Debug.ShouldStop(1024);
_cpedidosrepsol.runClassMethod (b4j.docU.crepsol.class, "_show" /*void*/ );
 BA.debugLineNum = 1260;BA.debugLine="frm.Close";
Debug.ShouldStop(2048);
parent._frm.runVoidMethod ("Close");
 if (true) break;

case 127:
//C
this.state = 128;
 BA.debugLineNum = 1268;BA.debugLine="jamLoadingIndicator1.show";
Debug.ShouldStop(524288);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 1269;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsua";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","complete", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._utilidades.runMethod(false,"_checkpermisosaplicacionusuarioobjetopermiso" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("PermisosAplicacion")),(Object)(parent._main._nombreaplicacion /*RemoteObject*/ ),(Object)(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("cRepsol"))));
this.state = 241;
return;
case 241:
//C
this.state = 128;
_sres = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sRes", _sres);
;
 BA.debugLineNum = 1270;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(2097152);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1271;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\" T";
Debug.ShouldStop(4194304);
if (true) break;

case 128:
//if
this.state = 133;
if (RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("NO")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("ERROR")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("DENIED"))) { 
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
 BA.debugLineNum = 1272;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
Debug.ShouldStop(8388608);
_permisomodulousuario = _sres;Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);
 BA.debugLineNum = 1277;BA.debugLine="Dim RepsolInformacionLogisticaAlbaran As cRepso";
Debug.ShouldStop(268435456);
_repsolinformacionlogisticaalbaran = RemoteObject.createNew ("b4j.docU.crepsolinformacionlogisticaalbaran");Debug.locals.put("RepsolInformacionLogisticaAlbaran", _repsolinformacionlogisticaalbaran);
 BA.debugLineNum = 1278;BA.debugLine="RepsolInformacionLogisticaAlbaran.Initialize";
Debug.ShouldStop(536870912);
_repsolinformacionlogisticaalbaran.runClassMethod (b4j.docU.crepsolinformacionlogisticaalbaran.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 1280;BA.debugLine="RepsolInformacionLogisticaAlbaran.Show";
Debug.ShouldStop(-2147483648);
_repsolinformacionlogisticaalbaran.runClassMethod (b4j.docU.crepsolinformacionlogisticaalbaran.class, "_show" /*void*/ );
 BA.debugLineNum = 1281;BA.debugLine="frm.Close";
Debug.ShouldStop(1);
parent._frm.runVoidMethod ("Close");
 if (true) break;

case 135:
//C
this.state = 136;
 BA.debugLineNum = 1284;BA.debugLine="jamLoadingIndicator1.show";
Debug.ShouldStop(8);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 1285;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsua";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","complete", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._utilidades.runMethod(false,"_checkpermisosaplicacionusuarioobjetopermiso" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("PermisosAplicacion")),(Object)(parent._main._nombreaplicacion /*RemoteObject*/ ),(Object)(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("cGeneracionFicherosCSVPlantillaPedidosVenta"))));
this.state = 242;
return;
case 242:
//C
this.state = 136;
_sres = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sRes", _sres);
;
 BA.debugLineNum = 1286;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(32);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1287;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\" T";
Debug.ShouldStop(64);
if (true) break;

case 136:
//if
this.state = 141;
if (RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("NO")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("ERROR")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("DENIED"))) { 
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
 BA.debugLineNum = 1288;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
Debug.ShouldStop(128);
_permisomodulousuario = _sres;Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);
 BA.debugLineNum = 1293;BA.debugLine="Dim GeneracionFicherosCSVPlantillaPedidosVenta";
Debug.ShouldStop(4096);
_generacionficheroscsvplantillapedidosventa = RemoteObject.createNew ("b4j.docU.cgeneracionficheroscsvplantillapedidosventa");Debug.locals.put("GeneracionFicherosCSVPlantillaPedidosVenta", _generacionficheroscsvplantillapedidosventa);
 BA.debugLineNum = 1294;BA.debugLine="GeneracionFicherosCSVPlantillaPedidosVenta.Init";
Debug.ShouldStop(8192);
_generacionficheroscsvplantillapedidosventa.runClassMethod (b4j.docU.cgeneracionficheroscsvplantillapedidosventa.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 1296;BA.debugLine="GeneracionFicherosCSVPlantillaPedidosVenta.Show";
Debug.ShouldStop(32768);
_generacionficheroscsvplantillapedidosventa.runClassMethod (b4j.docU.cgeneracionficheroscsvplantillapedidosventa.class, "_show" /*void*/ );
 BA.debugLineNum = 1297;BA.debugLine="frm.Close";
Debug.ShouldStop(65536);
parent._frm.runVoidMethod ("Close");
 if (true) break;

case 143:
//C
this.state = 144;
 BA.debugLineNum = 1323;BA.debugLine="jamLoadingIndicator1.show";
Debug.ShouldStop(1024);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 1324;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsua";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._utilidades.runMethod(false,"_checkpermisosaplicacionusuarioobjetopermiso" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("PermisosAplicacion")),(Object)(parent._main._nombreaplicacion /*RemoteObject*/ ),(Object)(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("cInformesExpedicionesClientes"))));
this.state = 243;
return;
case 243:
//C
this.state = 144;
_sres = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sRes", _sres);
;
 BA.debugLineNum = 1325;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(4096);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1326;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\" T";
Debug.ShouldStop(8192);
if (true) break;

case 144:
//if
this.state = 149;
if (RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("NO")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("ERROR")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("DENIED"))) { 
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
 BA.debugLineNum = 1327;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
Debug.ShouldStop(16384);
_permisomodulousuario = _sres;Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);
 BA.debugLineNum = 1329;BA.debugLine="Dim cInfExpedCliente As cInformesExpedicionesCl";
Debug.ShouldStop(65536);
_cinfexpedcliente = RemoteObject.createNew ("b4j.docU.cinformesexpedicionesclientes");Debug.locals.put("cInfExpedCliente", _cinfexpedcliente);
 BA.debugLineNum = 1330;BA.debugLine="cInfExpedCliente.Initialize";
Debug.ShouldStop(131072);
_cinfexpedcliente.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 1332;BA.debugLine="cInfExpedCliente.Show";
Debug.ShouldStop(524288);
_cinfexpedcliente.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_show" /*void*/ );
 BA.debugLineNum = 1333;BA.debugLine="frm.Close";
Debug.ShouldStop(1048576);
parent._frm.runVoidMethod ("Close");
 if (true) break;

case 151:
//C
this.state = 152;
 BA.debugLineNum = 1336;BA.debugLine="Wait For(cmPermisos.PermisosAplicacionUsuarioOb";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._cmpermisos.runMethod(false,"_permisosaplicacionusuarioobjetopermiso" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("PermisosAplicacion")),(Object)(parent._main._nombreaplicacion /*RemoteObject*/ ),(Object)(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("ReiniciarSincronizacionDocuware"))));
this.state = 244;
return;
case 244:
//C
this.state = 152;
_sres = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sRes", _sres);
;
 BA.debugLineNum = 1337;BA.debugLine="Select Case sRes";
Debug.ShouldStop(16777216);
if (true) break;

case 152:
//select
this.state = 163;
switch (BA.switchObjectToInt(_sres,BA.ObjectToString("ErrConn"),BA.ObjectToString("SinPermiso"),BA.ObjectToString("ERROR"),BA.ObjectToString("DENIED"))) {
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
 BA.debugLineNum = 1339;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de c";
Debug.ShouldStop(67108864);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(BA.ObjectToString("Error de conexion servidor/query.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1340;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 245;
return;
case 245:
//C
this.state = 163;
;
 BA.debugLineNum = 1341;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return ;
 if (true) break;

case 156:
//C
this.state = 163;
 BA.debugLineNum = 1343;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes";
Debug.ShouldStop(1073741824);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(BA.ObjectToString("No tienes permiso para acceder a este módulo.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1344;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 246;
return;
case 246:
//C
this.state = 163;
;
 BA.debugLineNum = 1345;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return ;
 if (true) break;

case 158:
//C
this.state = 163;
 BA.debugLineNum = 1347;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sRes,\"Error";
Debug.ShouldStop(4);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(_sres),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1348;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 247;
return;
case 247:
//C
this.state = 163;
;
 BA.debugLineNum = 1349;BA.debugLine="Return";
Debug.ShouldStop(16);
if (true) return ;
 if (true) break;

case 160:
//C
this.state = 163;
 BA.debugLineNum = 1351;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes";
Debug.ShouldStop(64);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(BA.ObjectToString("No tienes permiso para acceder a este módulo.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1352;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 248;
return;
case 248:
//C
this.state = 163;
;
 BA.debugLineNum = 1353;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return ;
 if (true) break;

case 162:
//C
this.state = 163;
 BA.debugLineNum = 1355;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
Debug.ShouldStop(1024);
_permisomodulousuario = _sres;Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);
 if (true) break;

case 163:
//C
this.state = 164;
;
 BA.debugLineNum = 1358;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",\"¿Rei";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._utilidades.runMethod(false,"_msgbox2xui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("¿Reiniciar la sincronización con Docuware?")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), parent.__c.getField(false,"Null"))));
this.state = 249;
return;
case 249:
//C
this.state = 164;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1359;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
Debug.ShouldStop(16384);
if (true) break;

case 164:
//if
this.state = 169;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 1361;BA.debugLine="Wait For(ReiniciarSincronizacionDocuware) compl";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _reiniciarsincronizaciondocuware());
this.state = 250;
return;
case 250:
//C
this.state = 170;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 1362;BA.debugLine="If sResp=\"OK\" Then";
Debug.ShouldStop(131072);
if (true) break;

case 170:
//if
this.state = 175;
if (RemoteObject.solveBoolean("=",_sresp,BA.ObjectToString("OK"))) { 
this.state = 172;
}else {
this.state = 174;
}if (true) break;

case 172:
//C
this.state = 175;
 BA.debugLineNum = 1363;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Envío petic";
Debug.ShouldStop(262144);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(BA.ObjectToString("Envío petición reinicio sincronización Docuware, OK")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1364;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
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
 BA.debugLineNum = 1366;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No ha sido";
Debug.ShouldStop(2097152);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)((RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible enviar la petición de reinicio de la sincronización con Docuware.\n"),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sresp))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1368;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
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
 BA.debugLineNum = 1373;BA.debugLine="Wait For(cmPermisos.PermisosAplicacionUsuarioOb";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._cmpermisos.runMethod(false,"_permisosaplicacionusuarioobjetopermiso" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("PermisosAplicacion")),(Object)(parent._main._nombreaplicacion /*RemoteObject*/ ),(Object)(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("IncidenciasProveedorAlmacen"))));
this.state = 253;
return;
case 253:
//C
this.state = 178;
_sres = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sRes", _sres);
;
 BA.debugLineNum = 1374;BA.debugLine="Select Case sRes";
Debug.ShouldStop(536870912);
if (true) break;

case 178:
//select
this.state = 189;
switch (BA.switchObjectToInt(_sres,BA.ObjectToString("ErrConn"),BA.ObjectToString("SinPermiso"),BA.ObjectToString("ERROR"),BA.ObjectToString("DENIED"))) {
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
 BA.debugLineNum = 1376;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de c";
Debug.ShouldStop(-2147483648);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(BA.ObjectToString("Error de conexion servidor/query.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1377;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 254;
return;
case 254:
//C
this.state = 189;
;
 BA.debugLineNum = 1378;BA.debugLine="Return";
Debug.ShouldStop(2);
if (true) return ;
 if (true) break;

case 182:
//C
this.state = 189;
 BA.debugLineNum = 1380;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes";
Debug.ShouldStop(8);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(BA.ObjectToString("No tienes permiso para acceder a este módulo.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1381;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 255;
return;
case 255:
//C
this.state = 189;
;
 BA.debugLineNum = 1382;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return ;
 if (true) break;

case 184:
//C
this.state = 189;
 BA.debugLineNum = 1384;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sRes,\"Error";
Debug.ShouldStop(128);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(_sres),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1385;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 256;
return;
case 256:
//C
this.state = 189;
;
 BA.debugLineNum = 1386;BA.debugLine="Return";
Debug.ShouldStop(512);
if (true) return ;
 if (true) break;

case 186:
//C
this.state = 189;
 BA.debugLineNum = 1388;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes";
Debug.ShouldStop(2048);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(BA.ObjectToString("No tienes permiso para acceder a este módulo.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1389;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
this.state = 257;
return;
case 257:
//C
this.state = 189;
;
 BA.debugLineNum = 1390;BA.debugLine="Return";
Debug.ShouldStop(8192);
if (true) return ;
 if (true) break;

case 188:
//C
this.state = 189;
 BA.debugLineNum = 1392;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
Debug.ShouldStop(32768);
_permisomodulousuario = _sres;Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);
 if (true) break;

case 189:
//C
this.state = 218;
;
 BA.debugLineNum = 1395;BA.debugLine="Dim cIncProv As cIncidenciasProveedorLista";
Debug.ShouldStop(262144);
_cincprov = RemoteObject.createNew ("b4j.docU.cincidenciasproveedorlista");Debug.locals.put("cIncProv", _cincprov);
 BA.debugLineNum = 1396;BA.debugLine="cIncProv.Initialize";
Debug.ShouldStop(524288);
_cincprov.runClassMethod (b4j.docU.cincidenciasproveedorlista.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 1397;BA.debugLine="cIncProv.DepartamentoEmisor=\"ALMACEN\"";
Debug.ShouldStop(1048576);
_cincprov.setField ("_departamentoemisor" /*RemoteObject*/ ,BA.ObjectToString("ALMACEN"));
 BA.debugLineNum = 1398;BA.debugLine="cIncProv.Show";
Debug.ShouldStop(2097152);
_cincprov.runClassMethod (b4j.docU.cincidenciasproveedorlista.class, "_show" /*void*/ );
 BA.debugLineNum = 1399;BA.debugLine="frm.Close";
Debug.ShouldStop(4194304);
parent._frm.runVoidMethod ("Close");
 if (true) break;

case 191:
//C
this.state = 192;
 BA.debugLineNum = 1424;BA.debugLine="jamLoadingIndicator1.show";
Debug.ShouldStop(32768);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 1425;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsua";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._utilidades.runMethod(false,"_checkpermisosaplicacionusuarioobjetopermiso" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("PermisosAplicacion")),(Object)(parent._main._nombreaplicacion /*RemoteObject*/ ),(Object)(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("AnalisisDisponiblesAlmacenArticuloTalla"))));
this.state = 258;
return;
case 258:
//C
this.state = 192;
_sres = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sRes", _sres);
;
 BA.debugLineNum = 1426;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(131072);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1427;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\" T";
Debug.ShouldStop(262144);
if (true) break;

case 192:
//if
this.state = 197;
if (RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("NO")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("ERROR")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("DENIED"))) { 
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
 BA.debugLineNum = 1428;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
Debug.ShouldStop(524288);
_permisomodulousuario = _sres;Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);
 BA.debugLineNum = 1430;BA.debugLine="Dim cAnalisisDispAlmArtTalla As cAnalisisDispon";
Debug.ShouldStop(2097152);
_canalisisdispalmarttalla = RemoteObject.createNew ("b4j.docU.canalisisdisponiblesalmacenarticulotalla");Debug.locals.put("cAnalisisDispAlmArtTalla", _canalisisdispalmarttalla);
 BA.debugLineNum = 1431;BA.debugLine="cAnalisisDispAlmArtTalla.Initialize";
Debug.ShouldStop(4194304);
_canalisisdispalmarttalla.runClassMethod (b4j.docU.canalisisdisponiblesalmacenarticulotalla.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 1432;BA.debugLine="cAnalisisDispAlmArtTalla.PermisoModuloUsuario=P";
Debug.ShouldStop(8388608);
_canalisisdispalmarttalla.setField ("_permisomodulousuario" /*RemoteObject*/ ,_permisomodulousuario);
 BA.debugLineNum = 1433;BA.debugLine="cAnalisisDispAlmArtTalla.Show";
Debug.ShouldStop(16777216);
_canalisisdispalmarttalla.runClassMethod (b4j.docU.canalisisdisponiblesalmacenarticulotalla.class, "_show" /*void*/ );
 BA.debugLineNum = 1434;BA.debugLine="frm.Close";
Debug.ShouldStop(33554432);
parent._frm.runVoidMethod ("Close");
 if (true) break;

case 199:
//C
this.state = 200;
 BA.debugLineNum = 1438;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Pendient";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("Pendiente de programar."))));
this.state = 259;
return;
case 259:
//C
this.state = 200;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 1439;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return ;
 BA.debugLineNum = 1463;BA.debugLine="jamLoadingIndicator1.show";
Debug.ShouldStop(4194304);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 1464;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsua";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), parent._utilidades.runMethod(false,"_checkpermisosaplicacionusuarioobjetopermiso" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("PermisosAplicacion")),(Object)(parent._main._nombreaplicacion /*RemoteObject*/ ),(Object)(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("AnalisisDisponiblesArticuloTallaAlmacenesComputables"))));
this.state = 260;
return;
case 260:
//C
this.state = 200;
_sres = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sRes", _sres);
;
 BA.debugLineNum = 1465;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(16777216);
parent._jamloadingindicator1.runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1466;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\" T";
Debug.ShouldStop(33554432);
if (true) break;

case 200:
//if
this.state = 205;
if (RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("NO")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("ERROR")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("DENIED"))) { 
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
 BA.debugLineNum = 1467;BA.debugLine="Dim PermisoModuloUsuario As String=sRes";
Debug.ShouldStop(67108864);
_permisomodulousuario = _sres;Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);Debug.locals.put("PermisoModuloUsuario", _permisomodulousuario);
 BA.debugLineNum = 1469;BA.debugLine="Dim cAnalisisDispArtTallaAlmacenesComputables A";
Debug.ShouldStop(268435456);
_canalisisdisparttallaalmacenescomputables = RemoteObject.createNew ("b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables");Debug.locals.put("cAnalisisDispArtTallaAlmacenesComputables", _canalisisdisparttallaalmacenescomputables);
 BA.debugLineNum = 1470;BA.debugLine="cAnalisisDispArtTallaAlmacenesComputables.Initi";
Debug.ShouldStop(536870912);
_canalisisdisparttallaalmacenescomputables.runClassMethod (b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 1471;BA.debugLine="cAnalisisDispArtTallaAlmacenesComputables.Permi";
Debug.ShouldStop(1073741824);
_canalisisdisparttallaalmacenescomputables.setField ("_permisomodulousuario" /*RemoteObject*/ ,_permisomodulousuario);
 BA.debugLineNum = 1472;BA.debugLine="cAnalisisDispArtTallaAlmacenesComputables.Show";
Debug.ShouldStop(-2147483648);
_canalisisdisparttallaalmacenescomputables.runClassMethod (b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables.class, "_show" /*void*/ );
 BA.debugLineNum = 1473;BA.debugLine="frm.Close";
Debug.ShouldStop(1);
parent._frm.runVoidMethod ("Close");
 if (true) break;

case 207:
//C
this.state = 218;
 BA.debugLineNum = 1542;BA.debugLine="CrearExcelLinksFicherosCarpeta";
Debug.ShouldStop(32);
_crearexcellinksficheroscarpeta();
 if (true) break;

case 209:
//C
this.state = 218;
 BA.debugLineNum = 1545;BA.debugLine="Dim cPermApl As cPermisosAplicacion";
Debug.ShouldStop(256);
_cpermapl = RemoteObject.createNew ("b4j.docU.cpermisosaplicacion");Debug.locals.put("cPermApl", _cpermapl);
 BA.debugLineNum = 1546;BA.debugLine="cPermApl.Initialize";
Debug.ShouldStop(512);
_cpermapl.runClassMethod (b4j.docU.cpermisosaplicacion.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 1547;BA.debugLine="cPermApl.Show";
Debug.ShouldStop(1024);
_cpermapl.runClassMethod (b4j.docU.cpermisosaplicacion.class, "_show" /*void*/ );
 if (true) break;

case 211:
//C
this.state = 218;
 BA.debugLineNum = 1552;BA.debugLine="Dialog.Title=\"Información\"";
Debug.ShouldStop(32768);
parent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Información")));
 BA.debugLineNum = 1553;BA.debugLine="Dim B4XLongMsg As B4XLongTextTemplate";
Debug.ShouldStop(65536);
_b4xlongmsg = RemoteObject.createNew ("b4j.docU.b4xlongtexttemplate");Debug.locals.put("B4XLongMsg", _b4xlongmsg);
 BA.debugLineNum = 1554;BA.debugLine="B4XLongMsg.Initialize";
Debug.ShouldStop(131072);
_b4xlongmsg.runClassMethod (b4j.docU.b4xlongtexttemplate.class, "_initialize" /*RemoteObject*/ ,mainmenu2.ba);
 BA.debugLineNum = 1555;BA.debugLine="B4XLongMsg.Resize(600dip,500dip)";
Debug.ShouldStop(262144);
_b4xlongmsg.runClassMethod (b4j.docU.b4xlongtexttemplate.class, "_resize" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 1556;BA.debugLine="Dim sbA As StringBuilder";
Debug.ShouldStop(524288);
_sba = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbA", _sba);
 BA.debugLineNum = 1557;BA.debugLine="sbA.Initialize";
Debug.ShouldStop(1048576);
_sba.runVoidMethod ("Initialize");
 BA.debugLineNum = 1558;BA.debugLine="sbA.Append(Main.NombreAplicacion).Append(\" v\").";
Debug.ShouldStop(2097152);
_sba.runMethod(false,"Append",(Object)(parent._main._nombreaplicacion /*RemoteObject*/ )).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" v"))).runMethod(false,"Append",(Object)(parent._main._version /*RemoteObject*/ )).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1560;BA.debugLine="sbA.Append(\"(2022-\").Append(DateTime.GetYear(Da";
Debug.ShouldStop(8388608);
_sba.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("(2022-"))).runMethod(false,"Append",(Object)(BA.NumberToString(parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(")"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1561;BA.debugLine="sbA.Append(CRLF)";
Debug.ShouldStop(16777216);
_sba.runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1562;BA.debugLine="sbA.Append(\"Iconos aplicación:\").Append(CRLF)";
Debug.ShouldStop(33554432);
_sba.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Iconos aplicación:"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1564;BA.debugLine="sbA.Append(\"Icons made by Freepik from www.flat";
Debug.ShouldStop(134217728);
_sba.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Icons made by Freepik from www.flaticon.com"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1570;BA.debugLine="sbA.Append(\"Icons made by Flat Icons from www.f";
Debug.ShouldStop(2);
_sba.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Icons made by Flat Icons from www.flaticon.com"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1572;BA.debugLine="sbA.Append(\"Icons made by Eucalyp from www.flat";
Debug.ShouldStop(8);
_sba.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Icons made by Eucalyp from www.flaticon.com"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1573;BA.debugLine="sbA.Append(\"Icons made by Uniconlabs from www.f";
Debug.ShouldStop(16);
_sba.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Icons made by Uniconlabs from www.flaticon.com"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1579;BA.debugLine="B4XLongMsg.Text=sbA.ToString";
Debug.ShouldStop(1024);
_b4xlongmsg.setField ("_text" /*RemoteObject*/ ,(_sba.runMethod(true,"ToString")));
 BA.debugLineNum = 1580;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4";
Debug.ShouldStop(2048);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xlongmsg)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable(""))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 1581;BA.debugLine="Dim bOk As B4XView=Dialog.GetButton(xui.DialogR";
Debug.ShouldStop(4096);
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(parent._xui.getField(true,"DialogResponse_Positive")));Debug.locals.put("bOk", _bok);Debug.locals.put("bOk", _bok);
 BA.debugLineNum = 1582;BA.debugLine="bOk.TextSize=16";
Debug.ShouldStop(8192);
_bok.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 1583;BA.debugLine="Wait For(rSub) complete (rInt As Int)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","complete", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _rsub);
this.state = 261;
return;
case 261:
//C
this.state = 218;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("rInt", _rint);
;
 if (true) break;

case 213:
//C
this.state = 214;
 BA.debugLineNum = 1587;BA.debugLine="If SelectedItem.Children.Size=0 Then";
Debug.ShouldStop(262144);
if (true) break;

case 214:
//if
this.state = 217;
if (RemoteObject.solveBoolean("=",_selecteditem.runMethod(false,"getChildren").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 216;
}if (true) break;

case 216:
//C
this.state = 217;
 BA.debugLineNum = 1588;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Menú Item p";
Debug.ShouldStop(524288);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(BA.ObjectToString("Menú Item pendiente de programar...")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1589;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "treeviewmainmenu_selecteditemchanged"), _msa);
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
 BA.debugLineNum = 1595;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _verificarversionactual() throws Exception{
try {
		Debug.PushSubsStack("VerificarVersionActual (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,254);
if (RapidSub.canDelegate("verificarversionactual")) { return b4j.docU.mainmenu2.remoteMe.runUserSub(false, "mainmenu2","verificarversionactual");}
ResumableSub_VerificarVersionActual rsub = new ResumableSub_VerificarVersionActual(null);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_VerificarVersionActual extends BA.ResumableSub {
public ResumableSub_VerificarVersionActual(b4j.docU.mainmenu2 parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.mainmenu2 parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _versionservidor = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("VerificarVersionActual (mainmenu2) ","mainmenu2",1,mainmenu2.ba,mainmenu2.mostCurrent,254);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 255;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(1073741824);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 256;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(-2147483648);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("VersionActualAplicacion")),(Object)((RemoteObject.createNewArray("String",new int[] {1},new Object[] {parent._main._nombreaplicacion /*RemoteObject*/ }))),(Object)(mainmenu2.getObject()));
 BA.debugLineNum = 257;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "verificarversionactual"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 259;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
 BA.debugLineNum = 260;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(8);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(BA.ObjectToString("Error de conexion servidor/query VersionActualAplicacion. Avisa al administrador de la aplicación.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 261;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "verificarversionactual"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 264;BA.debugLine="Accion=\"ExitApp\"";
Debug.ShouldStop(128);
_accion = BA.ObjectToString("ExitApp");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 265;BA.debugLine="Return Accion";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 267;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(1024);
if (true) break;

case 6:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
 BA.debugLineNum = 268;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(2048);
_msa = parent._xui.runMethod(false,"MsgboxAsync",mainmenu2.ba,(Object)(BA.ObjectToString("No hay datos de versión actual en la tabla...")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 269;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu2.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu2", "verificarversionactual"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 273;BA.debugLine="Accion=\"ExitApp\"";
Debug.ShouldStop(65536);
_accion = BA.ObjectToString("ExitApp");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 274;BA.debugLine="Return Accion";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 276;BA.debugLine="Dim lstRegistros As List=mresult.Get(\"lstRes\")";
Debug.ShouldStop(524288);
_lstregistros = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRegistros", _lstregistros);Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 277;BA.debugLine="Dim m As Map=lstRegistros.Get(0)";
Debug.ShouldStop(1048576);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstregistros.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 278;BA.debugLine="Dim VersionServidor As String=m.Get(\"VersionAct";
Debug.ShouldStop(2097152);
_versionservidor = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("VersionActual")))));Debug.locals.put("VersionServidor", _versionservidor);Debug.locals.put("VersionServidor", _versionservidor);
 BA.debugLineNum = 297;BA.debugLine="Return \"OK\"";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("OK")));return;};
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
 BA.debugLineNum = 303;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _datosjrdc_completed(RemoteObject _mresult) throws Exception{
}
}