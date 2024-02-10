package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class jamtableclvcamposbuilder_subs_0 {


public static void  _additem(RemoteObject __ref,RemoteObject _minfo) throws Exception{
try {
		Debug.PushSubsStack("AddItem (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,488);
if (RapidSub.canDelegate("additem")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","additem", __ref, _minfo); return;}
ResumableSub_AddItem rsub = new ResumableSub_AddItem(null,__ref,_minfo);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_AddItem extends BA.ResumableSub {
public ResumableSub_AddItem(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref,RemoteObject _minfo) {
this.parent = parent;
this.__ref = __ref;
this._minfo = _minfo;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _minfo;
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("AddItem (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,488);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("mInfo", _minfo);
 BA.debugLineNum = 490;BA.debugLine="If ColActualCLV=Col1 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_colactualclv" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_col1" /*RemoteObject*/ )))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 491;BA.debugLine="ColActualCLV=Col2";
Debug.JustUpdateDeviceLine();
__ref.setField ("_colactualclv" /*RemoteObject*/ ,__ref.getField(true,"_col2" /*RemoteObject*/ ));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 493;BA.debugLine="ColActualCLV=Col1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_colactualclv" /*RemoteObject*/ ,__ref.getField(true,"_col1" /*RemoteObject*/ ));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 496;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 497;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, clvListaCampos.AsV";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))))));
 BA.debugLineNum = 498;BA.debugLine="pnl.LoadLayout(\"scrItemJamTableCLVCamposBuilder\")";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrItemJamTableCLVCamposBuilder")),__ref.getField(false, "ba"));
 BA.debugLineNum = 499;BA.debugLine="pnl.Color=ColActualCLV";
Debug.JustUpdateDeviceLine();
_pnl.runMethod(true,"setColor",__ref.getField(true,"_colactualclv" /*RemoteObject*/ ));
 BA.debugLineNum = 501;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValue";
Debug.JustUpdateDeviceLine();
_clviv = RemoteObject.createNew ("b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue");Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 503;BA.debugLine="clvIV.txtID=txtID";
Debug.JustUpdateDeviceLine();
_clviv.setField ("txtID" /*RemoteObject*/ ,__ref.getField(false,"_txtid" /*RemoteObject*/ ));
 BA.debugLineNum = 506;BA.debugLine="clvIV.chkboxKeyID=chkboxKeyID";
Debug.JustUpdateDeviceLine();
_clviv.setField ("chkboxKeyID" /*RemoteObject*/ ,__ref.getField(false,"_chkboxkeyid" /*RemoteObject*/ ));
 BA.debugLineNum = 507;BA.debugLine="clvIV.lblOrdenKeyID=lblOrdenKeyID";
Debug.JustUpdateDeviceLine();
_clviv.setField ("lblOrdenKeyID" /*RemoteObject*/ ,__ref.getField(false,"_lblordenkeyid" /*RemoteObject*/ ));
 BA.debugLineNum = 508;BA.debugLine="clvIV.cboCampo=cboCampo";
Debug.JustUpdateDeviceLine();
_clviv.setField ("cboCampo" /*RemoteObject*/ ,__ref.getField(false,"_cbocampo" /*RemoteObject*/ ));
 BA.debugLineNum = 509;BA.debugLine="clvIV.txtAliasCampo=txtAliasCampo";
Debug.JustUpdateDeviceLine();
_clviv.setField ("txtAliasCampo" /*RemoteObject*/ ,__ref.getField(false,"_txtaliascampo" /*RemoteObject*/ ));
 BA.debugLineNum = 512;BA.debugLine="clvIV.chkBoxCampoCalculado=chkBoxCampoCalculado";
Debug.JustUpdateDeviceLine();
_clviv.setField ("chkBoxCampoCalculado" /*RemoteObject*/ ,__ref.getField(false,"_chkboxcampocalculado" /*RemoteObject*/ ));
 BA.debugLineNum = 513;BA.debugLine="clvIV.cboTipoControlFiltro=cboTipoControlFiltro";
Debug.JustUpdateDeviceLine();
_clviv.setField ("cboTipoControlFiltro" /*RemoteObject*/ ,__ref.getField(false,"_cbotipocontrolfiltro" /*RemoteObject*/ ));
 BA.debugLineNum = 514;BA.debugLine="clvIV.cboTipoDato=cboTipoDato";
Debug.JustUpdateDeviceLine();
_clviv.setField ("cboTipoDato" /*RemoteObject*/ ,__ref.getField(false,"_cbotipodato" /*RemoteObject*/ ));
 BA.debugLineNum = 515;BA.debugLine="clvIV.chkBoxEsFecha=chkBoxEsFecha";
Debug.JustUpdateDeviceLine();
_clviv.setField ("chkBoxEsFecha" /*RemoteObject*/ ,__ref.getField(false,"_chkboxesfecha" /*RemoteObject*/ ));
 BA.debugLineNum = 516;BA.debugLine="clvIV.chkBoxEsBooleano=chkBoxEsBooleano";
Debug.JustUpdateDeviceLine();
_clviv.setField ("chkBoxEsBooleano" /*RemoteObject*/ ,__ref.getField(false,"_chkboxesbooleano" /*RemoteObject*/ ));
 BA.debugLineNum = 517;BA.debugLine="clvIV.txtValorTrueCampoBooleano=txtValorTrueCampo";
Debug.JustUpdateDeviceLine();
_clviv.setField ("txtValorTrueCampoBooleano" /*RemoteObject*/ ,__ref.getField(false,"_txtvalortruecampobooleano" /*RemoteObject*/ ));
 BA.debugLineNum = 521;BA.debugLine="clvIV.chkNoNulo=chkBoxNoNulo";
Debug.JustUpdateDeviceLine();
_clviv.setField ("chkNoNulo" /*RemoteObject*/ ,__ref.getField(false,"_chkboxnonulo" /*RemoteObject*/ ));
 BA.debugLineNum = 522;BA.debugLine="clvIV.chkBoxConValorDefecto=chkBoxConValorDefecto";
Debug.JustUpdateDeviceLine();
_clviv.setField ("chkBoxConValorDefecto" /*RemoteObject*/ ,__ref.getField(false,"_chkboxconvalordefecto" /*RemoteObject*/ ));
 BA.debugLineNum = 523;BA.debugLine="clvIV.txtValorDefecto=txtValorDefecto";
Debug.JustUpdateDeviceLine();
_clviv.setField ("txtValorDefecto" /*RemoteObject*/ ,__ref.getField(false,"_txtvalordefecto" /*RemoteObject*/ ));
 BA.debugLineNum = 547;BA.debugLine="clvIV.txtID.Text=0";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtID" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 548;BA.debugLine="clvIV.cboCampo.Value=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 549;BA.debugLine="clvIV.txtAliasCampo.text=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtAliasCampo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 554;BA.debugLine="clvIV.cboTipoControlFiltro.Items.AddAll(Array As";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoControlFiltro" /*RemoteObject*/ ).runMethod(false,"getItems").runVoidMethod ("AddAll",(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.ObjectToString(""),BA.ObjectToString("TextField"),BA.ObjectToString("ComboBox"),BA.ObjectToString("CheckBox"),RemoteObject.createImmutable("TextFieldBtn")})))));
 BA.debugLineNum = 556;BA.debugLine="clvIV.cboTipoControlFiltro.Value=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoControlFiltro" /*RemoteObject*/ ).runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 557;BA.debugLine="clvIV.cboTipoDato.Items.AddAll(Array As String(\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getItems").runVoidMethod ("AddAll",(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.ObjectToString(""),BA.ObjectToString("TEXT"),BA.ObjectToString("REAL"),BA.ObjectToString("INTEGER"),RemoteObject.createImmutable("BLOB")})))));
 BA.debugLineNum = 558;BA.debugLine="clvIV.cboTipoDato.Value=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 563;BA.debugLine="clvIV.chkboxKeyID.Checked=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkboxKeyID" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 BA.debugLineNum = 564;BA.debugLine="clvIV.lblOrdenKeyID.Text=0";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblOrdenKeyID" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 565;BA.debugLine="clvIV.chkBoxEsFecha.Checked=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxEsFecha" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 BA.debugLineNum = 566;BA.debugLine="clvIV.chkBoxEsBooleano.Checked=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxEsBooleano" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 BA.debugLineNum = 567;BA.debugLine="clvIV.txtValorTrueCampoBooleano.Text=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtValorTrueCampoBooleano" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 568;BA.debugLine="clvIV.chkBoxCampoCalculado.Checked=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxCampoCalculado" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 BA.debugLineNum = 597;BA.debugLine="clvIV.chkNoNulo.Checked=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkNoNulo" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 BA.debugLineNum = 598;BA.debugLine="clvIV.chkBoxConValorDefecto.Checked=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxConValorDefecto" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 BA.debugLineNum = 599;BA.debugLine="clvIV.txtValorDefecto.Text=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtValorDefecto" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 606;BA.debugLine="If mInfo.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 28;
if (_minfo.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 607;BA.debugLine="clvIV.cboCampo.Value=mInfo.GetDefault(\"Campo\",\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"setValue",_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Campo"))),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 608;BA.debugLine="If False=mInfo.GetDefault(\"CampoCalculado\",False";
Debug.JustUpdateDeviceLine();
if (true) break;

case 10:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"False"),BA.ObjectToBoolean(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("CampoCalculado"))),(Object)((parent.__c.getField(true,"False"))))))) { 
this.state = 12;
}else {
this.state = 20;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 609;BA.debugLine="clvIV.txtAliasCampo.text=mInfo.GetDefault(\"Alia";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtAliasCampo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("AliasCampo"))),(Object)(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Campo"))),(Object)((RemoteObject.createImmutable(""))))))));
 BA.debugLineNum = 610;BA.debugLine="If clvIV.txtAliasCampo.text=\"\" Then clvIV.txtAl";
Debug.JustUpdateDeviceLine();
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_clviv.getField(false,"txtAliasCampo" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
_clviv.getField(false,"txtAliasCampo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue")));
if (true) break;

case 18:
//C
this.state = 21;
;
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 612;BA.debugLine="clvIV.txtAliasCampo.text=mInfo.GetDefault(\"Alia";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtAliasCampo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("AliasCampo"))),(Object)((RemoteObject.createImmutable(""))))));
 if (true) break;

case 21:
//C
this.state = 22;
;
 BA.debugLineNum = 620;BA.debugLine="clvIV.lblOrdenKeyID.Text=mInfo.GetDefault(\"KeyID";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblOrdenKeyID" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("KeyID"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 621;BA.debugLine="clvIV.chkboxKeyID.Checked=0<>mInfo.GetDefault(\"K";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkboxKeyID" /*RemoteObject*/ ).runMethod(true,"setChecked",BA.ObjectToBoolean(RemoteObject.solveBoolean("!",RemoteObject.createImmutable(0),BA.numberCast(double.class, _minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("KeyID"))),(Object)(RemoteObject.createImmutable((0))))))));
 BA.debugLineNum = 622;BA.debugLine="If 0<>mInfo.GetDefault(\"KeyID\",0) Then lstPrimar";
Debug.JustUpdateDeviceLine();
if (true) break;

case 22:
//if
this.state = 27;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(0),BA.numberCast(double.class, _minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("KeyID"))),(Object)(RemoteObject.createImmutable((0))))))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
__ref.getField(false,"_lstprimarykey" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Campo"))),(Object)((RemoteObject.createImmutable(""))))));
if (true) break;

case 27:
//C
this.state = 28;
;
 BA.debugLineNum = 623;BA.debugLine="clvIV.cboTipoControlFiltro.Value=mInfo.GetDefaul";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoControlFiltro" /*RemoteObject*/ ).runMethod(false,"setValue",_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("TipoControlFiltro"))),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 625;BA.debugLine="clvIV.cboTipoDato.Value=mInfo.GetDefault(\"TipoDa";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"setValue",_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("TipoDato"))),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 627;BA.debugLine="clvIV.chkBoxEsFecha.Checked=mInfo.GetDefault(\"Es";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxEsFecha" /*RemoteObject*/ ).runMethod(true,"setChecked",BA.ObjectToBoolean(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("EsFecha"))),(Object)((parent.__c.getField(true,"False"))))));
 BA.debugLineNum = 628;BA.debugLine="clvIV.chkBoxEsBooleano.Checked=mInfo.GetDefault(";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxEsBooleano" /*RemoteObject*/ ).runMethod(true,"setChecked",BA.ObjectToBoolean(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("EsBooleano"))),(Object)((parent.__c.getField(true,"False"))))));
 BA.debugLineNum = 629;BA.debugLine="clvIV.txtValorTrueCampoBooleano.text=mInfo.GetDe";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtValorTrueCampoBooleano" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ValorTrueCampoBooleano"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 630;BA.debugLine="clvIV.chkBoxCampoCalculado.Checked=mInfo.GetDefa";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxCampoCalculado" /*RemoteObject*/ ).runMethod(true,"setChecked",BA.ObjectToBoolean(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("CampoCalculado"))),(Object)((parent.__c.getField(true,"False"))))));
 BA.debugLineNum = 631;BA.debugLine="clvIV.chkNoNulo.Checked=mInfo.GetDefault(\"NoNulo";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkNoNulo" /*RemoteObject*/ ).runMethod(true,"setChecked",BA.ObjectToBoolean(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("NoNulo"))),(Object)((parent.__c.getField(true,"False"))))));
 BA.debugLineNum = 632;BA.debugLine="clvIV.chkBoxConValorDefecto.Checked=mInfo.GetDef";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxConValorDefecto" /*RemoteObject*/ ).runMethod(true,"setChecked",BA.ObjectToBoolean(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ConValorDefecto"))),(Object)((parent.__c.getField(true,"False"))))));
 BA.debugLineNum = 633;BA.debugLine="clvIV.txtValorDefecto.Text=mInfo.GetDefault(\"Val";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtValorDefecto" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ValorDefecto"))),(Object)((RemoteObject.createImmutable(""))))));
 if (true) break;

case 28:
//C
this.state = -1;
;
 BA.debugLineNum = 734;BA.debugLine="clvIV.chkBoxCampoCalculado.Enabled= True";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxCampoCalculado" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 738;BA.debugLine="txtValorDefecto.Visible= clvIV.chkBoxConValorDefe";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtvalordefecto" /*RemoteObject*/ ).runMethod(true,"setVisible",_clviv.getField(false,"chkBoxConValorDefecto" /*RemoteObject*/ ).runMethod(true,"getChecked"));
 BA.debugLineNum = 741;BA.debugLine="clvListaCampos.Add(pnl, clvIV)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(_pnl),(Object)((_clviv)));
 BA.debugLineNum = 744;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "additem"),BA.numberCast(int.class, 0));
this.state = 29;
return;
case 29:
//C
this.state = -1;
;
 BA.debugLineNum = 745;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _additemsfromstring(RemoteObject __ref,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("AddItemsFromString (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1206);
if (RapidSub.canDelegate("additemsfromstring")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","additemsfromstring", __ref, _s);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("s", _s);
 BA.debugLineNum = 1206;BA.debugLine="private Sub AddItemsFromString (s As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1208;BA.debugLine="Dim parser As JSONParser";
Debug.JustUpdateDeviceLine();
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 1209;BA.debugLine="parser.Initialize(s)";
Debug.JustUpdateDeviceLine();
_parser.runVoidMethod ("Initialize",(Object)(_s));
 BA.debugLineNum = 1210;BA.debugLine="Dim m As Map = parser.NextObject";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = _parser.runMethod(false,"NextObject");Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 1211;BA.debugLine="FechaUltimaModificacion=m.getdefault(\"FechaUltima";
Debug.JustUpdateDeviceLine();
__ref.setField ("_fechaultimamodificacion" /*RemoteObject*/ ,BA.numberCast(long.class, _m.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("FechaUltimaModificacion"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1)))))));
 BA.debugLineNum = 1212;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(m.Get(\"Tip";
Debug.JustUpdateDeviceLine();
__ref.setField ("_datosorigendatos" /*RemoteObject*/ ,__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_createtipoorigendatos" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TipoOrigenDatos")))))),(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IpJRDC")))))),(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PuertoJRDC")))))),(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ComandoJRDC")))))),(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ParametrosJRDC"))))))));
 BA.debugLineNum = 1213;BA.debugLine="MostrarDatosOrigenDatos";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_mostrardatosorigendatos" /*RemoteObject*/ );
 BA.debugLineNum = 1215;BA.debugLine="Dim bc As ByteConverter";
Debug.JustUpdateDeviceLine();
_bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 1217;BA.debugLine="txtRGBColorFondoEncabezados.Text=m.Getdefault(\"Co";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtrgbcolorfondoencabezados" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_m.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ColorFondoEncabezados"))),(Object)((RemoteObject.createImmutable("#004B55"))))));
 BA.debugLineNum = 1218;BA.debugLine="If txtRGBColorFondoEncabezados.Text=\"transparent\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtrgbcolorfondoencabezados" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("transparent"))) { 
 BA.debugLineNum = 1219;BA.debugLine="lblColorFondoEncabezados.Color=0";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolorfondoencabezados" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, 0));
 }else {
 BA.debugLineNum = 1222;BA.debugLine="lblColorFondoEncabezados.Color=bc.IntsFromBytes(";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolorfondoencabezados" /*RemoteObject*/ ).runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),__ref.getField(false,"_txtrgbcolorfondoencabezados" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 1225;BA.debugLine="txtRGBColorTextoEncabezados.Text=m.Getdefault(\"Co";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtrgbcolortextoencabezados" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_m.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ColorTextoEncabezados"))),(Object)((__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_getcsscolorstringfromintcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"))))))));
 BA.debugLineNum = 1226;BA.debugLine="If txtRGBColorTextoEncabezados.text=\"transparent\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtrgbcolortextoencabezados" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("transparent"))) { 
 BA.debugLineNum = 1227;BA.debugLine="lblColorTextoEncabezados.Color=0";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolortextoencabezados" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, 0));
 }else {
 BA.debugLineNum = 1230;BA.debugLine="lblColorTextoEncabezados.Color=bc.IntsFromBytes(";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolortextoencabezados" /*RemoteObject*/ ).runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),__ref.getField(false,"_txtrgbcolortextoencabezados" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 1234;BA.debugLine="txtRGBColorFondoPanelInfo.Text=m.Getdefault(\"Colo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtrgbcolorfondopanelinfo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_m.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ColorFondoPanelInfo"))),(Object)((RemoteObject.createImmutable("#FFF8C3"))))));
 BA.debugLineNum = 1235;BA.debugLine="If txtRGBColorFondoPanelInfo.Text=\"transparent\" T";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtrgbcolorfondopanelinfo" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("transparent"))) { 
 BA.debugLineNum = 1236;BA.debugLine="lblColorFondoPanelInfo.Color=0";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolorfondopanelinfo" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, 0));
 }else {
 BA.debugLineNum = 1238;BA.debugLine="lblColorFondoPanelInfo.Color=bc.IntsFromBytes(bc";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolorfondopanelinfo" /*RemoteObject*/ ).runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),__ref.getField(false,"_txtrgbcolorfondopanelinfo" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 1241;BA.debugLine="txtRGBColorTextoPanelInfo.Text=m.Getdefault(\"Colo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtrgbcolortextopanelinfo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_m.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ColorTextoPanelInfo"))),(Object)((__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_getcsscolorstringfromintcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"))))))));
 BA.debugLineNum = 1242;BA.debugLine="If txtRGBColorTextoPanelInfo.text=\"transparent\" T";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtrgbcolortextopanelinfo" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("transparent"))) { 
 BA.debugLineNum = 1243;BA.debugLine="lblColorTextoPanelInfo.Color=0";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolortextopanelinfo" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, 0));
 }else {
 BA.debugLineNum = 1245;BA.debugLine="lblColorTextoPanelInfo.Color=bc.IntsFromBytes(bc";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolortextopanelinfo" /*RemoteObject*/ ).runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),__ref.getField(false,"_txtrgbcolortextopanelinfo" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 1248;BA.debugLine="txtRGBColorFondoFilasImpares.Text=m.Getdefault(\"C";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtrgbcolorfondofilasimpares" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_m.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ColorFondoPanelItemsImpares"))),(Object)((__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_getcsscolorstringfromintcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"))))))));
 BA.debugLineNum = 1249;BA.debugLine="If txtRGBColorFondoFilasImpares.Text=\"transparent";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtrgbcolorfondofilasimpares" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("transparent"))) { 
 BA.debugLineNum = 1250;BA.debugLine="lblColorFondoFilasImpares.Color=0";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolorfondofilasimpares" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, 0));
 }else {
 BA.debugLineNum = 1253;BA.debugLine="lblColorFondoFilasImpares.Color=bc.IntsFromBytes";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolorfondofilasimpares" /*RemoteObject*/ ).runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),__ref.getField(false,"_txtrgbcolorfondofilasimpares" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 1256;BA.debugLine="txtRGBColorFondoFilasPares.Text=m.Getdefault(\"Col";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtrgbcolorfondofilaspares" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_m.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ColorFondoPanelItemsPares"))),(Object)((RemoteObject.createImmutable("#F1F1F1"))))));
 BA.debugLineNum = 1257;BA.debugLine="If txtRGBColorFondoFilasPares.Text=\"transparent\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtrgbcolorfondofilaspares" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("transparent"))) { 
 BA.debugLineNum = 1258;BA.debugLine="lblColorFondoFilasPares.Color=0";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolorfondofilaspares" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, 0));
 }else {
 BA.debugLineNum = 1261;BA.debugLine="lblColorFondoFilasPares.Color=bc.IntsFromBytes(b";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolorfondofilaspares" /*RemoteObject*/ ).runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),__ref.getField(false,"_txtrgbcolorfondofilaspares" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 1264;BA.debugLine="txtRGBColorBordeItems.Text=m.Getdefault(\"ColorBor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtrgbcolorbordeitems" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_m.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ColorBordeItems"))),(Object)((RemoteObject.createImmutable("#808080"))))));
 BA.debugLineNum = 1265;BA.debugLine="If txtRGBColorBordeItems.Text=\"\" Then txtRGBColor";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtrgbcolorbordeitems" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
__ref.getField(false,"_txtrgbcolorbordeitems" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("#808080"));};
 BA.debugLineNum = 1266;BA.debugLine="If txtRGBColorBordeItems.Text=\"transparent\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtrgbcolorbordeitems" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("transparent"))) { 
 BA.debugLineNum = 1267;BA.debugLine="lblColorBordeItems.Color=0";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolorbordeitems" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, 0));
 }else {
 BA.debugLineNum = 1270;BA.debugLine="lblColorBordeItems.Color=bc.IntsFromBytes(bc.Hex";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolorbordeitems" /*RemoteObject*/ ).runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),__ref.getField(false,"_txtrgbcolorbordeitems" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 1273;BA.debugLine="B4XPlusMinusAnchoBordeItems.SelectedValue=m.Getde";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_b4xplusminusanchobordeitems" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xplusminus.class, "_setselectedvalue" /*RemoteObject*/ ,_m.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("AnchoBordeItems"))),(Object)(RemoteObject.createImmutable((1)))));
 BA.debugLineNum = 1280;BA.debugLine="Dim Items As List = m.Get(\"Items\")";
Debug.JustUpdateDeviceLine();
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_items = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Items")))));Debug.locals.put("Items", _items);Debug.locals.put("Items", _items);
 BA.debugLineNum = 1281;BA.debugLine="For Each item As Map In Items";
Debug.JustUpdateDeviceLine();
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group53 = _items;
final int groupLen53 = group53.runMethod(true,"getSize").<Integer>get()
;int index53 = 0;
;
for (; index53 < groupLen53;index53++){
_item = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group53.runMethod(false,"Get",index53));Debug.locals.put("item", _item);
Debug.locals.put("item", _item);
 BA.debugLineNum = 1283;BA.debugLine="AddItem(item)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_additem" /*void*/ ,(Object)(_item));
 }
}Debug.locals.put("item", _item);
;
 BA.debugLineNum = 1288;BA.debugLine="CallSubDelayed(Me,\"AddItemsFromString_Completed\")";
Debug.JustUpdateDeviceLine();
jamtableclvcamposbuilder.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.createImmutable("AddItemsFromString_Completed")));
 BA.debugLineNum = 1289;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnadd_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnAdd_Click (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,774);
if (RapidSub.canDelegate("btnadd_click")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","btnadd_click", __ref); return;}
ResumableSub_btnAdd_Click rsub = new ResumableSub_btnAdd_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnAdd_Click extends BA.ResumableSub {
public ResumableSub_btnAdd_Click(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnAdd_Click (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,774);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 775;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_datosorigendatos" /*RemoteObject*/ ).getField(true,"TipoOrigenDatos" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 776;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Aún no se h";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Aún no se ha definido el tipo de origen de datos.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 777;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "btnadd_click"), _msa);
this.state = 5;
return;
case 5:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 778;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 780;BA.debugLine="CargandoDatos=True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_cargandodatos" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 787;BA.debugLine="AddItem(Null)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_additem" /*void*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 791;BA.debugLine="dragger.AddDragButtons";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dragger" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclvclvdragger.class, "_adddragbuttons" /*RemoteObject*/ );
 BA.debugLineNum = 792;BA.debugLine="CargandoDatos=False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_cargandodatos" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 793;BA.debugLine="RecalcularIDOrdenColumnas";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_recalcularidordencolumnas" /*RemoteObject*/ );
 BA.debugLineNum = 794;BA.debugLine="Sleep(100)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "btnadd_click"),BA.numberCast(int.class, 100));
this.state = 6;
return;
case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 795;BA.debugLine="clvListaCampos.JumpToItem(clvListaCampos.Size - 1";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runVoidMethod ("_jumptoitem",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 796;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _msgbox_result(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static void  _btnbuscaraliascampo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnBuscarAliasCampo_Click (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3610);
if (RapidSub.canDelegate("btnbuscaraliascampo_click")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","btnbuscaraliascampo_click", __ref); return;}
ResumableSub_btnBuscarAliasCampo_Click rsub = new ResumableSub_btnBuscarAliasCampo_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnBuscarAliasCampo_Click extends BA.ResumableSub {
public ResumableSub_btnBuscarAliasCampo_Click(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _lstcamposclv = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstopciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdatacampo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _b4xsearchlistdlg = RemoteObject.declareNull("b4j.docU.b4xsearchtemplate");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _btcanceldlg = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _textsize = RemoteObject.createImmutable(0f);
RemoteObject _xclv = RemoteObject.declareNull("b4j.example.customlistview");
RemoteObject _dlbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _lblb4xv = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _sopcionsel = RemoteObject.createImmutable("");
RemoteObject group8;
int index8;
int groupLen8;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnBuscarAliasCampo_Click (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3610);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 3611;BA.debugLine="Dialog.Title=\"Selecciona Campo\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona Campo")));
 BA.debugLineNum = 3612;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 3613;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 18))));
 BA.debugLineNum = 3614;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonsfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 3616;BA.debugLine="Dim lstCamposCLV As List=CargaCamposCLV";
Debug.JustUpdateDeviceLine();
_lstcamposclv = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstcamposclv = __ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_cargacamposclv" /*RemoteObject*/ );Debug.locals.put("lstCamposCLV", _lstcamposclv);Debug.locals.put("lstCamposCLV", _lstcamposclv);
 BA.debugLineNum = 3618;BA.debugLine="Dim lstOpciones As List";
Debug.JustUpdateDeviceLine();
_lstopciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstOpciones", _lstopciones);
 BA.debugLineNum = 3619;BA.debugLine="lstOpciones.Initialize";
Debug.JustUpdateDeviceLine();
_lstopciones.runVoidMethod ("Initialize");
 BA.debugLineNum = 3621;BA.debugLine="For Each mDataCampo As Map In lstCamposCLV";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//for
this.state = 4;
_mdatacampo = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group8 = _lstcamposclv;
index8 = 0;
groupLen8 = group8.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mDataCampo", _mdatacampo);
this.state = 15;
if (true) break;

case 15:
//C
this.state = 4;
if (index8 < groupLen8) {
this.state = 3;
_mdatacampo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group8.runMethod(false,"Get",index8));Debug.locals.put("mDataCampo", _mdatacampo);}
if (true) break;

case 16:
//C
this.state = 15;
index8++;
Debug.locals.put("mDataCampo", _mdatacampo);
if (true) break;

case 3:
//C
this.state = 16;
 BA.debugLineNum = 3622;BA.debugLine="lstOpciones.Add(mDataCampo.Get(\"AliasCampo\"))";
Debug.JustUpdateDeviceLine();
_lstopciones.runVoidMethod ("Add",(Object)(_mdatacampo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("AliasCampo"))))));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
Debug.locals.put("mDataCampo", _mdatacampo);
;
 BA.debugLineNum = 3625;BA.debugLine="Dim B4XSearchListDlg As B4XSearchTemplate";
Debug.JustUpdateDeviceLine();
_b4xsearchlistdlg = RemoteObject.createNew ("b4j.docU.b4xsearchtemplate");Debug.locals.put("B4XSearchListDlg", _b4xsearchlistdlg);
 BA.debugLineNum = 3626;BA.debugLine="B4XSearchListDlg.Initialize";
Debug.JustUpdateDeviceLine();
_b4xsearchlistdlg.runClassMethod (b4j.docU.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 3627;BA.debugLine="B4XSearchListDlg.SetItems(lstOpciones)";
Debug.JustUpdateDeviceLine();
_b4xsearchlistdlg.runClassMethod (b4j.docU.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_lstopciones));
 BA.debugLineNum = 3628;BA.debugLine="B4XSearchListDlg.SearchField.HintText=\"Buscar\"";
Debug.JustUpdateDeviceLine();
_b4xsearchlistdlg.getField(false,"_searchfield" /*RemoteObject*/ ).setField ("_hinttext" /*RemoteObject*/ ,BA.ObjectToString("Buscar"));
 BA.debugLineNum = 3629;BA.debugLine="B4XSearchListDlg.SearchField.Update";
Debug.JustUpdateDeviceLine();
_b4xsearchlistdlg.getField(false,"_searchfield" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xfloattextfield.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 3630;BA.debugLine="B4XSearchListDlg.ItemHightlightColor=0xFF87CEFA";
Debug.JustUpdateDeviceLine();
_b4xsearchlistdlg.setField ("_itemhightlightcolor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff87cefa)));
 BA.debugLineNum = 3631;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XS";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xsearchlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 3632;BA.debugLine="Dim btCancelDlg As B4XView=Dialog.GetButton(xui.D";
Debug.JustUpdateDeviceLine();
_btcanceldlg = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_btcanceldlg = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("btCancelDlg", _btcanceldlg);Debug.locals.put("btCancelDlg", _btcanceldlg);
 BA.debugLineNum = 3633;BA.debugLine="btCancelDlg.TextSize=14";
Debug.JustUpdateDeviceLine();
_btcanceldlg.runMethod(true,"setTextSize",BA.numberCast(double.class, 14));
 BA.debugLineNum = 3635;BA.debugLine="SetLightThemeDialog(Dialog)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_setlightthemedialog" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_dialog" /*RemoteObject*/ )));
 BA.debugLineNum = 3636;BA.debugLine="SetLightThemeSearch(B4XSearchListDlg)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_setlightthemesearch" /*RemoteObject*/ ,(Object)(_b4xsearchlistdlg));
 BA.debugLineNum = 3638;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
Debug.JustUpdateDeviceLine();
_textsize = BA.numberCast(float.class, 18);Debug.locals.put("TextSize", _textsize);Debug.locals.put("TextSize", _textsize);
 BA.debugLineNum = 3639;BA.debugLine="Dim xclv As CustomListView=B4XSearchListDlg.Custo";
Debug.JustUpdateDeviceLine();
_xclv = _b4xsearchlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ );Debug.locals.put("xclv", _xclv);Debug.locals.put("xclv", _xclv);
 BA.debugLineNum = 3640;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Gr";
Debug.JustUpdateDeviceLine();
_xclv.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Gray"));
 BA.debugLineNum = 3642;BA.debugLine="B4XSearchListDlg.Resize(400dip,0.75*Dialog.mParen";
Debug.JustUpdateDeviceLine();
_b4xsearchlistdlg.runClassMethod (b4j.docU.b4xsearchtemplate.class, "_resize" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 400)))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.75),__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 0))));
 BA.debugLineNum = 3644;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XS";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xsearchlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 3650;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
Debug.JustUpdateDeviceLine();
_dlbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_dlbl = _xclv.getField(false,"_designerlabel");Debug.locals.put("dlbl", _dlbl);Debug.locals.put("dlbl", _dlbl);
 BA.debugLineNum = 3651;BA.debugLine="dlbl.TextSize=TextSize";
Debug.JustUpdateDeviceLine();
_dlbl.runMethod(true,"setTextSize",BA.numberCast(double.class, _textsize));
 BA.debugLineNum = 3652;BA.debugLine="Dim lblB4Xv As B4XView=dlbl";
Debug.JustUpdateDeviceLine();
_lblb4xv = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lblb4xv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _dlbl.getObject());Debug.locals.put("lblB4Xv", _lblb4xv);Debug.locals.put("lblB4Xv", _lblb4xv);
 BA.debugLineNum = 3653;BA.debugLine="lblB4Xv.SetTextAlignment(\"CENTER\",\"LEFT\")";
Debug.JustUpdateDeviceLine();
_lblb4xv.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("LEFT")));
 BA.debugLineNum = 3655;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 3656;BA.debugLine="If bCancel.IsInitialized Then";
Debug.JustUpdateDeviceLine();
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
 BA.debugLineNum = 3657;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 0));
 BA.debugLineNum = 3658;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 0));
 BA.debugLineNum = 3659;BA.debugLine="bCancel.TextSize=18";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 3662;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "btnbuscaraliascampo_click"), _rsub);
this.state = 17;
return;
case 17:
//C
this.state = 9;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 3663;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 9:
//if
this.state = 14;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 11;
;}if (true) break;

case 11:
//C
this.state = 14;
if (true) return ;
if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 3665;BA.debugLine="Dim sOpcionSel As String=B4XSearchListDlg.Selecte";
Debug.JustUpdateDeviceLine();
_sopcionsel = _b4xsearchlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("sOpcionSel", _sopcionsel);Debug.locals.put("sOpcionSel", _sopcionsel);
 BA.debugLineNum = 3667;BA.debugLine="clvListaCampos.ScrollToItem(lstOpciones.IndexOf(s";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runVoidMethod ("_scrolltoitem",(Object)(_lstopciones.runMethod(true,"IndexOf",(Object)((_sopcionsel)))));
 BA.debugLineNum = 3669;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _complete(RemoteObject __ref,RemoteObject _rint) throws Exception{
}
public static void  _btncopy_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnCopy_Click (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,464);
if (RapidSub.canDelegate("btncopy_click")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","btncopy_click", __ref); return;}
ResumableSub_btnCopy_Click rsub = new ResumableSub_btnCopy_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnCopy_Click extends BA.ResumableSub {
public ResumableSub_btnCopy_Click(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _minfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _he = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnCopy_Click (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,464);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 465;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValue";
Debug.JustUpdateDeviceLine();
_clviv = (__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")))))));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 466;BA.debugLine="Dialog.Title=\"Copiar Campo\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Copiar Campo")));
 BA.debugLineNum = 467;BA.debugLine="Wait For (Dialog.Show(\"¿Crear un campo nuevo copi";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "btncopy_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_show" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("¿Crear un campo nuevo copiando los datos del campo "),_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable("?")))),(Object)(RemoteObject.createImmutable(("Sí"))),(Object)(RemoteObject.createImmutable(("No"))),(Object)((RemoteObject.createImmutable("")))));
this.state = 14;
return;
case 14:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 468;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 469;BA.debugLine="Dim mInfo As Map=ItemValueToMap(clvIV)";
Debug.JustUpdateDeviceLine();
_minfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_minfo = __ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_itemvaluetomap" /*RemoteObject*/ ,(Object)(_clviv));Debug.locals.put("mInfo", _minfo);Debug.locals.put("mInfo", _minfo);
 BA.debugLineNum = 470;BA.debugLine="If mInfo.Get(\"EncabezadoColumna\")<>\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("!",_minfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EncabezadoColumna")))),RemoteObject.createImmutable(("")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 471;BA.debugLine="Dim he As String = mInfo.Get(\"EncabezadoColumna";
Debug.JustUpdateDeviceLine();
_he = BA.ObjectToString(_minfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EncabezadoColumna")))));Debug.locals.put("he", _he);Debug.locals.put("he", _he);
 BA.debugLineNum = 472;BA.debugLine="mInfo.put(\"EncabezadoColumna\", he & \"2\")";
Debug.JustUpdateDeviceLine();
_minfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("EncabezadoColumna"))),(Object)((RemoteObject.concat(_he,RemoteObject.createImmutable("2")))));
 if (true) break;
;
 BA.debugLineNum = 474;BA.debugLine="If 0<>mInfo.Get(\"KeyID\") Then mInfo.put(\"KeyID\",";
Debug.JustUpdateDeviceLine();

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(0),BA.numberCast(double.class, _minfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KeyID"))))))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
_minfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("KeyID"))),(Object)(RemoteObject.createImmutable((0))));
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 476;BA.debugLine="CargandoDatos=True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_cargandodatos" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 477;BA.debugLine="AddItem(mInfo)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_additem" /*void*/ ,(Object)(_minfo));
 BA.debugLineNum = 479;BA.debugLine="dragger.AddDragButtons";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dragger" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclvclvdragger.class, "_adddragbuttons" /*RemoteObject*/ );
 BA.debugLineNum = 480;BA.debugLine="CargandoDatos=False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_cargandodatos" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 481;BA.debugLine="RecalcularIDOrdenColumnas";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_recalcularidordencolumnas" /*RemoteObject*/ );
 BA.debugLineNum = 482;BA.debugLine="Sleep(100)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "btncopy_click"),BA.numberCast(int.class, 100));
this.state = 15;
return;
case 15:
//C
this.state = 13;
;
 BA.debugLineNum = 483;BA.debugLine="clvListaCampos.JumpToItem(clvListaCampos.Size -";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runVoidMethod ("_jumptoitem",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 if (true) break;

case 13:
//C
this.state = -1;
;
 BA.debugLineNum = 485;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _btndelete_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnDelete_Click (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,441);
if (RapidSub.canDelegate("btndelete_click")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","btndelete_click", __ref); return;}
ResumableSub_btnDelete_Click rsub = new ResumableSub_btnDelete_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnDelete_Click extends BA.ResumableSub {
public ResumableSub_btnDelete_Click(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _btndel = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnDelete_Click (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,441);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 442;BA.debugLine="Dim btnDel As Button=Sender";
Debug.JustUpdateDeviceLine();
_btndel = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_btndel = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btnDel", _btndel);Debug.locals.put("btnDel", _btndel);
 BA.debugLineNum = 443;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(b";
Debug.JustUpdateDeviceLine();
_index = __ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btndel.getObject()));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 444;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValue";
Debug.JustUpdateDeviceLine();
_clviv = (__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 450;BA.debugLine="Dialog.Title=\"Borrar Campo\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Borrar Campo")));
 BA.debugLineNum = 452;BA.debugLine="Wait For (Dialog.Show(\"Confirma eliminación del c";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "btndelete_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_show" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Confirma eliminación del campo "),_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(".")))),(Object)(RemoteObject.createImmutable(("Sí"))),(Object)(RemoteObject.createImmutable(("No"))),(Object)((RemoteObject.createImmutable("")))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 453;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 454;BA.debugLine="clvListaCampos.RemoveAt(index)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(_index));
 BA.debugLineNum = 455;BA.debugLine="If lstPrimaryKey.IndexOf(clvIV.cboCampo.Value)>-";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_lstprimarykey" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)(_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue"))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
__ref.getField(false,"_lstprimarykey" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(__ref.getField(false,"_lstprimarykey" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)(_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue")))));
if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 456;BA.debugLine="RecalcularIDOrdenColumnas";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_recalcularidordencolumnas" /*RemoteObject*/ );
 BA.debugLineNum = 457;BA.debugLine="Sleep(100)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "btndelete_click"),BA.numberCast(int.class, 100));
this.state = 16;
return;
case 16:
//C
this.state = 10;
;
 BA.debugLineNum = 458;BA.debugLine="If clvListaCampos.Size>0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(true,"_getsize"),BA.numberCast(double.class, 0))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 459;BA.debugLine="clvListaCampos.JumpToItem(Max(0,(clvListaCampos";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runVoidMethod ("_jumptoitem",(Object)(BA.numberCast(int.class, parent.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, (RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1))))))));
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 462;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _btneditarorigenjrdc_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnEditarOrigenJRDC_Click (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2655);
if (RapidSub.canDelegate("btneditarorigenjrdc_click")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","btneditarorigenjrdc_click", __ref); return;}
ResumableSub_btnEditarOrigenJRDC_Click rsub = new ResumableSub_btnEditarOrigenJRDC_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnEditarOrigenJRDC_Click extends BA.ResumableSub {
public ResumableSub_btnEditarOrigenJRDC_Click(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnEditarOrigenJRDC_Click (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2655);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 2656;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_datosorigendatos" /*RemoteObject*/ ).getField(true,"TipoOrigenDatos" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2657;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Aún no se h";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Aún no se ha definido un tipo de datos")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2658;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "btneditarorigenjrdc_click"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2659;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 2661;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"Manual\" Then";
Debug.JustUpdateDeviceLine();

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_datosorigendatos" /*RemoteObject*/ ).getField(true,"TipoOrigenDatos" /*RemoteObject*/ ),BA.ObjectToString("Manual"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 2662;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"No se puede";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se puede editar un origen de datos manual")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2663;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "btneditarorigenjrdc_click"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2664;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 2669;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Editar el";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Editar el origen de datos actual?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2670;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "btneditarorigenjrdc_click"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 8;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2671;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 8:
//if
this.state = 13;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 10;
;}if (true) break;

case 10:
//C
this.state = 13;
if (true) return ;
if (true) break;

case 13:
//C
this.state = 14;
;
 BA.debugLineNum = 2673;BA.debugLine="prefDialog.Initialize(frm.RootPane,\"Datos JRDC\",8";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefdialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.preferencesdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()),(Object)(RemoteObject.createImmutable(("Datos JRDC"))),(Object)(BA.numberCast(int.class, 800)),(Object)(BA.numberCast(int.class, 600)));
 BA.debugLineNum = 2675;BA.debugLine="prefDialog.LoadFromJson(File.ReadString(File.DirA";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefdialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.preferencesdialog.class, "_loadfromjson" /*RemoteObject*/ ,(Object)(parent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("OrigenDatosJRDC.json")))));
 BA.debugLineNum = 2676;BA.debugLine="Dim mData As Map=CreateMap(\"TipoOrigenDatos\": Dat";
Debug.JustUpdateDeviceLine();
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("TipoOrigenDatos")),(__ref.getField(false,"_datosorigendatos" /*RemoteObject*/ ).getField(true,"TipoOrigenDatos" /*RemoteObject*/ )),RemoteObject.createImmutable(("IpJRDC")),(__ref.getField(false,"_datosorigendatos" /*RemoteObject*/ ).getField(true,"IpJRDC" /*RemoteObject*/ )),RemoteObject.createImmutable(("PuertoJRDC")),(__ref.getField(false,"_datosorigendatos" /*RemoteObject*/ ).getField(true,"PuertoJRDC" /*RemoteObject*/ )),RemoteObject.createImmutable(("ComandoJRDC")),(__ref.getField(false,"_datosorigendatos" /*RemoteObject*/ ).getField(true,"ComandoJRDC" /*RemoteObject*/ )),RemoteObject.createImmutable(("ParametrosJRDC")),(__ref.getField(false,"_datosorigendatos" /*RemoteObject*/ ).getField(true,"ParametrosJRDC" /*RemoteObject*/ ))}));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 2677;BA.debugLine="Wait For (prefDialog.ShowDialog(mData, \"OK\", \"CAN";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "btneditarorigenjrdc_click"), __ref.getField(false,"_prefdialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.preferencesdialog.class, "_showdialog" /*RemoteObject*/ ,(Object)(_mdata),(Object)(RemoteObject.createImmutable(("OK"))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 30;
return;
case 30:
//C
this.state = 14;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2678;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
Debug.JustUpdateDeviceLine();
if (true) break;

case 14:
//if
this.state = 19;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 16;
;}if (true) break;

case 16:
//C
this.state = 19;
if (true) return ;
if (true) break;

case 19:
//C
this.state = 20;
;
 BA.debugLineNum = 2679;BA.debugLine="lblTitleIpJRDC.TextColor=fx.Colors.From32Bit(0xFF";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbltitleipjrdc" /*RemoteObject*/ ).runMethod(false,"setTextColor",(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 2680;BA.debugLine="lblTitlePuertoJRDC.TextColor=fx.Colors.From32Bit(";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbltitlepuertojrdc" /*RemoteObject*/ ).runMethod(false,"setTextColor",(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 2681;BA.debugLine="lblTitleComandoJRDC.TextColor=fx.Colors.From32Bit";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbltitlecomandojrdc" /*RemoteObject*/ ).runMethod(false,"setTextColor",(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 2682;BA.debugLine="lblTitleParametrosJRDC.TextColor=fx.Colors.From32";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbltitleparametrosjrdc" /*RemoteObject*/ ).runMethod(false,"setTextColor",(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 2683;BA.debugLine="txtIpJRDC.Enabled=True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtipjrdc" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 2684;BA.debugLine="txtParametrosJRDC.Enabled=True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtparametrosjrdc" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 2685;BA.debugLine="txtPuertoJRDC.Enabled=True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtpuertojrdc" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 2686;BA.debugLine="txtComandoJRDC.ENABLED=True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtcomandojrdc" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 2688;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(DatosOrige";
Debug.JustUpdateDeviceLine();
__ref.setField ("_datosorigendatos" /*RemoteObject*/ ,__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_createtipoorigendatos" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_datosorigendatos" /*RemoteObject*/ ).getField(true,"TipoOrigenDatos" /*RemoteObject*/ )),(Object)(BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("IpJRDC"))),(Object)((RemoteObject.createImmutable("")))))),(Object)(BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("PuertoJRDC"))),(Object)((RemoteObject.createImmutable("")))))),(Object)(BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ComandoJRDC"))),(Object)((RemoteObject.createImmutable("")))))),(Object)(BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ParametrosJRDC"))),(Object)((RemoteObject.createImmutable(""))))))));
 BA.debugLineNum = 2689;BA.debugLine="MostrarDatosOrigenDatos";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_mostrardatosorigendatos" /*RemoteObject*/ );
 BA.debugLineNum = 2690;BA.debugLine="CargandoDatos=True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_cargandodatos" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 2691;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"JRDC Query\"";
Debug.JustUpdateDeviceLine();
if (true) break;

case 20:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_datosorigendatos" /*RemoteObject*/ ).getField(true,"TipoOrigenDatos" /*RemoteObject*/ ),BA.ObjectToString("JRDC Query"))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 2692;BA.debugLine="CargaCamposJRDCQuery(txtIpJRDC.Text,txtPuertoJRD";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_cargacamposjrdcquery" /*void*/ ,(Object)(__ref.getField(false,"_txtipjrdc" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtpuertojrdc" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(__ref.getField(false,"_txtcomandojrdc" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txtparametrosjrdc" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 2693;BA.debugLine="wait for CargaCamposJRDCQuery_Completed";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","cargacamposjrdcquery_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "btneditarorigenjrdc_click"), null);
this.state = 31;
return;
case 31:
//C
this.state = 23;
;
 if (true) break;
;
 BA.debugLineNum = 2695;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"JRDC Table\"";
Debug.JustUpdateDeviceLine();

case 23:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_datosorigendatos" /*RemoteObject*/ ).getField(true,"TipoOrigenDatos" /*RemoteObject*/ ),BA.ObjectToString("JRDC Table"))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 2696;BA.debugLine="CargaCamposJRDCTable(txtIpJRDC.Text,txtPuertoJRD";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_cargacamposjrdctable" /*void*/ ,(Object)(__ref.getField(false,"_txtipjrdc" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtpuertojrdc" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(__ref.getField(false,"_txtcomandojrdc" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txtparametrosjrdc" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 2697;BA.debugLine="wait for CargaCamposJRDCTable_Completed";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","cargacamposjrdctable_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "btneditarorigenjrdc_click"), null);
this.state = 32;
return;
case 32:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = -1;
;
 BA.debugLineNum = 2700;BA.debugLine="CargandoDatos=False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_cargandodatos" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 2701;BA.debugLine="RecalcularIDOrdenColumnas";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_recalcularidordencolumnas" /*RemoteObject*/ );
 BA.debugLineNum = 2702;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _cargacamposjrdcquery_completed(RemoteObject __ref) throws Exception{
}
public static void  _cargacamposjrdctable_completed(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _btnorigenjrdc_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnOrigenJRDC_Click (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2555);
if (RapidSub.canDelegate("btnorigenjrdc_click")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","btnorigenjrdc_click", __ref);}
 BA.debugLineNum = 2555;BA.debugLine="private Sub btnOrigenJRDC_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2557;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargacamposclv(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaCamposCLV (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1732);
if (RapidSub.canDelegate("cargacamposclv")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","cargacamposclv", __ref);}
RemoteObject _lstcamposenclv = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue");
RemoteObject _mc = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 1732;BA.debugLine="private Sub CargaCamposCLV As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1733;BA.debugLine="Dim lstCamposEnCLV As List";
Debug.JustUpdateDeviceLine();
_lstcamposenclv = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCamposEnCLV", _lstcamposenclv);
 BA.debugLineNum = 1734;BA.debugLine="lstCamposEnCLV.Initialize";
Debug.JustUpdateDeviceLine();
_lstcamposenclv.runVoidMethod ("Initialize");
 BA.debugLineNum = 1735;BA.debugLine="For i=0 To clvListaCampos.Size-1";
Debug.JustUpdateDeviceLine();
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1736;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValu";
Debug.JustUpdateDeviceLine();
_clviv = (__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 1737;BA.debugLine="If clvIV.cboCampo.Value<>\"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 1738;BA.debugLine="Dim mC As Map=ItemValueToMap(clvIV)";
Debug.JustUpdateDeviceLine();
_mc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mc = __ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_itemvaluetomap" /*RemoteObject*/ ,(Object)(_clviv));Debug.locals.put("mC", _mc);Debug.locals.put("mC", _mc);
 BA.debugLineNum = 1739;BA.debugLine="lstCamposEnCLV.Add(mC)";
Debug.JustUpdateDeviceLine();
_lstcamposenclv.runVoidMethod ("Add",(Object)((_mc.getObject())));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1742;BA.debugLine="Return lstCamposEnCLV";
Debug.JustUpdateDeviceLine();
if (true) return _lstcamposenclv;
 BA.debugLineNum = 1743;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _cargacamposjrdcquery(RemoteObject __ref,RemoteObject _ipjrdc,RemoteObject _puertojrdc,RemoteObject _comandoconfigprop,RemoteObject _parametros) throws Exception{
try {
		Debug.PushSubsStack("CargaCamposJRDCQuery (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1560);
if (RapidSub.canDelegate("cargacamposjrdcquery")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","cargacamposjrdcquery", __ref, _ipjrdc, _puertojrdc, _comandoconfigprop, _parametros); return;}
ResumableSub_CargaCamposJRDCQuery rsub = new ResumableSub_CargaCamposJRDCQuery(null,__ref,_ipjrdc,_puertojrdc,_comandoconfigprop,_parametros);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CargaCamposJRDCQuery extends BA.ResumableSub {
public ResumableSub_CargaCamposJRDCQuery(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref,RemoteObject _ipjrdc,RemoteObject _puertojrdc,RemoteObject _comandoconfigprop,RemoteObject _parametros) {
this.parent = parent;
this.__ref = __ref;
this._ipjrdc = _ipjrdc;
this._puertojrdc = _puertojrdc;
this._comandoconfigprop = _comandoconfigprop;
this._parametros = _parametros;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _ipjrdc;
RemoteObject _puertojrdc;
RemoteObject _comandoconfigprop;
RemoteObject _parametros;
RemoteObject _rdclinkquery = RemoteObject.createImmutable("");
RemoteObject _params = null;
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mprimerregistro = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstnombrescamposclvnocalculados = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstcampossql = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _nombrecampoquerysql = RemoteObject.createImmutable("");
RemoteObject _minfocamposql = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
int step22;
int limit22;
int step36;
int limit36;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaCamposJRDCQuery (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1560);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("IPJrdc", _ipjrdc);
Debug.locals.put("PuertoJrdc", _puertojrdc);
Debug.locals.put("ComandoConfigProp", _comandoconfigprop);
Debug.locals.put("Parametros", _parametros);
 BA.debugLineNum = 1561;BA.debugLine="Dim rdcLinkQuery As String=\"http://\" & IPJrdc & \"";
Debug.JustUpdateDeviceLine();
_rdclinkquery = RemoteObject.concat(RemoteObject.createImmutable("http://"),_ipjrdc,RemoteObject.createImmutable(":"),_puertojrdc,RemoteObject.createImmutable("/rdc"));Debug.locals.put("rdcLinkQuery", _rdclinkquery);Debug.locals.put("rdcLinkQuery", _rdclinkquery);
 BA.debugLineNum = 1562;BA.debugLine="If Parametros=\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_parametros,BA.ObjectToString(""))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1564;BA.debugLine="CargaDatosJRDCQueryTop1(rdcLinkQuery,ComandoConf";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_cargadatosjrdcquerytop1" /*void*/ ,(Object)(_rdclinkquery),(Object)(_comandoconfigprop),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1567;BA.debugLine="Parametros=Parametros.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_parametros = _parametros.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parametros", _parametros);
 BA.debugLineNum = 1568;BA.debugLine="Dim Params() As String=Regex.Split(\";\",Parametro";
Debug.JustUpdateDeviceLine();
_params = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(";")),(Object)(_parametros));Debug.locals.put("Params", _params);Debug.locals.put("Params", _params);
 BA.debugLineNum = 1570;BA.debugLine="CargaDatosJRDCQueryTop1(rdcLinkQuery,ComandoConf";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_cargadatosjrdcquerytop1" /*void*/ ,(Object)(_rdclinkquery),(Object)(_comandoconfigprop),(Object)((_params)),(Object)(__ref));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1573;BA.debugLine="Wait For  CargaDatosJRDCQueryTop1_Completed (mRes";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","cargadatosjrdcquerytop1_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "cargacamposjrdcquery"), null);
this.state = 36;
return;
case 36:
//C
this.state = 7;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1574;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.DEFAULT";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 1575;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 35;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 35;
 BA.debugLineNum = 1576;BA.debugLine="fx.Msgbox(frm,\"Sin conexión con el servidor / ba";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fx" /*RemoteObject*/ ).runVoidMethodAndSync ("Msgbox",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Sin conexión con el servidor / base de datos / error de consulta"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación"))),(Object)(RemoteObject.createImmutable("Error")));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1578;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 12:
//if
this.state = 34;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 34;
 BA.debugLineNum = 1579;BA.debugLine="fx.Msgbox(frm,\"La consulta no devuelve datos, n";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fx" /*RemoteObject*/ ).runVoidMethodAndSync ("Msgbox",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )),(Object)(BA.ObjectToString("La consulta no devuelve datos, no es posible configurar sus campos.")),(Object)(RemoteObject.createImmutable("Aviso")));
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1581;BA.debugLine="Dim lstRes As List=mResult.Get(\"lstRes\")";
Debug.JustUpdateDeviceLine();
_lstres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstres = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRes", _lstres);Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 1582;BA.debugLine="Dim mPrimerRegistro As Map=lstRes.get(0)";
Debug.JustUpdateDeviceLine();
_mprimerregistro = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mprimerregistro = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstres.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mPrimerRegistro", _mprimerregistro);Debug.locals.put("mPrimerRegistro", _mprimerregistro);
 BA.debugLineNum = 1583;BA.debugLine="Dim lstNombresCamposCLVNoCalculados As List=Nom";
Debug.JustUpdateDeviceLine();
_lstnombrescamposclvnocalculados = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstnombrescamposclvnocalculados = __ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_nombrescamposclvnocalculados" /*RemoteObject*/ );Debug.locals.put("lstNombresCamposCLVNoCalculados", _lstnombrescamposclvnocalculados);Debug.locals.put("lstNombresCamposCLVNoCalculados", _lstnombrescamposclvnocalculados);
 BA.debugLineNum = 1584;BA.debugLine="Dim lstCamposSQL As List";
Debug.JustUpdateDeviceLine();
_lstcampossql = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCamposSQL", _lstcampossql);
 BA.debugLineNum = 1585;BA.debugLine="lstCamposSQL.Initialize";
Debug.JustUpdateDeviceLine();
_lstcampossql.runVoidMethod ("Initialize");
 BA.debugLineNum = 1587;BA.debugLine="For i=0 To mPrimerRegistro.Size-1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 17:
//for
this.state = 26;
step22 = 1;
limit22 = RemoteObject.solve(new RemoteObject[] {_mprimerregistro.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 37;
if (true) break;

case 37:
//C
this.state = 26;
if ((step22 > 0 && _i <= limit22) || (step22 < 0 && _i >= limit22)) this.state = 19;
if (true) break;

case 38:
//C
this.state = 37;
_i = ((int)(0 + _i + step22)) ;
Debug.locals.put("i", _i);
if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 1588;BA.debugLine="Dim NombreCampoQuerySQL As String=mPrimerRegis";
Debug.JustUpdateDeviceLine();
_nombrecampoquerysql = BA.ObjectToString(_mprimerregistro.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("NombreCampoQuerySQL", _nombrecampoquerysql);Debug.locals.put("NombreCampoQuerySQL", _nombrecampoquerysql);
 BA.debugLineNum = 1589;BA.debugLine="lstCamposSQL.Add(NombreCampoQuerySQL)";
Debug.JustUpdateDeviceLine();
_lstcampossql.runVoidMethod ("Add",(Object)((_nombrecampoquerysql)));
 BA.debugLineNum = 1592;BA.debugLine="If lstNombresCamposCLVNoCalculados.IndexOf(Nom";
Debug.JustUpdateDeviceLine();
if (true) break;

case 20:
//if
this.state = 25;
if (RemoteObject.solveBoolean("=",_lstnombrescamposclvnocalculados.runMethod(true,"IndexOf",(Object)((_nombrecampoquerysql))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 25;
 BA.debugLineNum = 1593;BA.debugLine="Dim mInfoCampoSQL As Map";
Debug.JustUpdateDeviceLine();
_minfocamposql = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mInfoCampoSQL", _minfocamposql);
 BA.debugLineNum = 1594;BA.debugLine="mInfoCampoSQL.Initialize";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Initialize");
 BA.debugLineNum = 1595;BA.debugLine="mInfoCampoSQL.Put(\"Campo\",mPrimerRegistro.Get";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Campo"))),(Object)(_mprimerregistro.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 1596;BA.debugLine="mInfoCampoSQL.Put(\"AliasCampo\",mPrimerRegistr";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("AliasCampo"))),(Object)(_mprimerregistro.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 1597;BA.debugLine="mInfoCampoSQL.Put(\"EncabezadoColumna\",mPrimer";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("EncabezadoColumna"))),(Object)(_mprimerregistro.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 1598;BA.debugLine="AddItem(mInfoCampoSQL)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_additem" /*void*/ ,(Object)(_minfocamposql));
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 1600;BA.debugLine="Continue";
Debug.JustUpdateDeviceLine();
this.state = 38;
if (true) break;;
 if (true) break;

case 25:
//C
this.state = 38;
;
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1604;BA.debugLine="For i=0 To lstNombresCamposCLVNoCalculados.Size";
Debug.JustUpdateDeviceLine();

case 26:
//for
this.state = 33;
step36 = 1;
limit36 = RemoteObject.solve(new RemoteObject[] {_lstnombrescamposclvnocalculados.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 39;
if (true) break;

case 39:
//C
this.state = 33;
if ((step36 > 0 && _i <= limit36) || (step36 < 0 && _i >= limit36)) this.state = 28;
if (true) break;

case 40:
//C
this.state = 39;
_i = ((int)(0 + _i + step36)) ;
Debug.locals.put("i", _i);
if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 1605;BA.debugLine="If lstCamposSQL.IndexOf(lstNombresCamposCLVNoC";
Debug.JustUpdateDeviceLine();
if (true) break;

case 29:
//if
this.state = 32;
if (RemoteObject.solveBoolean("=",_lstcampossql.runMethod(true,"IndexOf",(Object)(_lstnombrescamposclvnocalculados.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 1606;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1607;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1608;BA.debugLine="sb.Append(\"El campo no calculado \" & lstNombr";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("El campo no calculado "),_lstnombrescamposclvnocalculados.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(" no ha sido devuelto por la SQL."))));
 BA.debugLineNum = 1609;BA.debugLine="sb.Append(\" Si esto es un error, se debería e";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" Si esto es un error, se debería eliminar el campo del CLV.")));
 BA.debugLineNum = 1612;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(sb.ToStri";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(_sb.runMethod(true,"ToString")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1613;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "cargacamposjrdcquery"), _msa);
this.state = 41;
return;
case 41:
//C
this.state = 32;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 if (true) break;

case 32:
//C
this.state = 40;
;
 if (true) break;
if (true) break;

case 33:
//C
this.state = 34;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1616;BA.debugLine="dragger.AddDragButtons";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dragger" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclvclvdragger.class, "_adddragbuttons" /*RemoteObject*/ );
 if (true) break;

case 34:
//C
this.state = 35;
;
 if (true) break;

case 35:
//C
this.state = -1;
;
 BA.debugLineNum = 1619;BA.debugLine="CallSubDelayed(Me, \"CargaCamposJRDCQuery_Complete";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.createImmutable("CargaCamposJRDCQuery_Completed")));
 BA.debugLineNum = 1620;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _cargadatosjrdcquerytop1_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static void  _cargacamposjrdctable(RemoteObject __ref,RemoteObject _ipjrdc,RemoteObject _puertojrdc,RemoteObject _comandoconfigprop,RemoteObject _parametros) throws Exception{
try {
		Debug.PushSubsStack("CargaCamposJRDCTable (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1622);
if (RapidSub.canDelegate("cargacamposjrdctable")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","cargacamposjrdctable", __ref, _ipjrdc, _puertojrdc, _comandoconfigprop, _parametros); return;}
ResumableSub_CargaCamposJRDCTable rsub = new ResumableSub_CargaCamposJRDCTable(null,__ref,_ipjrdc,_puertojrdc,_comandoconfigprop,_parametros);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CargaCamposJRDCTable extends BA.ResumableSub {
public ResumableSub_CargaCamposJRDCTable(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref,RemoteObject _ipjrdc,RemoteObject _puertojrdc,RemoteObject _comandoconfigprop,RemoteObject _parametros) {
this.parent = parent;
this.__ref = __ref;
this._ipjrdc = _ipjrdc;
this._puertojrdc = _puertojrdc;
this._comandoconfigprop = _comandoconfigprop;
this._parametros = _parametros;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _ipjrdc;
RemoteObject _puertojrdc;
RemoteObject _comandoconfigprop;
RemoteObject _parametros;
RemoteObject _rdclinkquery = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstnombrescamposclvnocalculados = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstcampossql = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nombrecampoquerysql = RemoteObject.createImmutable("");
RemoteObject _minfocamposql = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tipodatomysqlmysql = RemoteObject.createImmutable("");
RemoteObject _tipodato = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
int step15;
int limit15;
int step67;
int limit67;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaCamposJRDCTable (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1622);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("IPJrdc", _ipjrdc);
Debug.locals.put("PuertoJrdc", _puertojrdc);
Debug.locals.put("ComandoConfigProp", _comandoconfigprop);
Debug.locals.put("Parametros", _parametros);
 BA.debugLineNum = 1623;BA.debugLine="Dim rdcLinkQuery As String=\"http://\" & IPJrdc & \"";
Debug.JustUpdateDeviceLine();
_rdclinkquery = RemoteObject.concat(RemoteObject.createImmutable("http://"),_ipjrdc,RemoteObject.createImmutable(":"),_puertojrdc,RemoteObject.createImmutable("/rdc"));Debug.locals.put("rdcLinkQuery", _rdclinkquery);Debug.locals.put("rdcLinkQuery", _rdclinkquery);
 BA.debugLineNum = 1624;BA.debugLine="JRDCQuery.DatosJRDC(rdcLinkQuery,ComandoConfigPro";
Debug.JustUpdateDeviceLine();
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_rdclinkquery),(Object)(_comandoconfigprop),(Object)((RemoteObject.createNewArray("String",new int[] {1},new Object[] {_parametros}))),(Object)(__ref));
 BA.debugLineNum = 1625;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "cargacamposjrdctable"), null);
this.state = 64;
return;
case 64:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 1626;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.DEFAULT";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 1627;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 63;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 63;
 BA.debugLineNum = 1628;BA.debugLine="fx.Msgbox(frm,\"Sin conexión con el servidor / ba";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fx" /*RemoteObject*/ ).runVoidMethodAndSync ("Msgbox",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Sin conexión con el servidor / base de datos / error de consulta"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación"))),(Object)(RemoteObject.createImmutable("Error")));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1630;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 6:
//if
this.state = 62;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 62;
 BA.debugLineNum = 1631;BA.debugLine="fx.Msgbox(frm,\"La consulta no devuelve datos, n";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fx" /*RemoteObject*/ ).runVoidMethodAndSync ("Msgbox",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )),(Object)(BA.ObjectToString("La consulta no devuelve datos, no es posible configurar sus campos.")),(Object)(RemoteObject.createImmutable("Aviso")));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1633;BA.debugLine="Dim lstRes As List=mresult.Get(\"lstRes\")";
Debug.JustUpdateDeviceLine();
_lstres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstres = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRes", _lstres);Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 1634;BA.debugLine="Dim lstNombresCamposCLVNoCalculados As List=Nom";
Debug.JustUpdateDeviceLine();
_lstnombrescamposclvnocalculados = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstnombrescamposclvnocalculados = __ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_nombrescamposclvnocalculados" /*RemoteObject*/ );Debug.locals.put("lstNombresCamposCLVNoCalculados", _lstnombrescamposclvnocalculados);Debug.locals.put("lstNombresCamposCLVNoCalculados", _lstnombrescamposclvnocalculados);
 BA.debugLineNum = 1635;BA.debugLine="Dim lstCamposSQL As List";
Debug.JustUpdateDeviceLine();
_lstcampossql = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCamposSQL", _lstcampossql);
 BA.debugLineNum = 1636;BA.debugLine="lstCamposSQL.Initialize";
Debug.JustUpdateDeviceLine();
_lstcampossql.runVoidMethod ("Initialize");
 BA.debugLineNum = 1637;BA.debugLine="For i=0 To lstRes.Size-1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 11:
//for
this.state = 54;
step15 = 1;
limit15 = RemoteObject.solve(new RemoteObject[] {_lstres.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 65;
if (true) break;

case 65:
//C
this.state = 54;
if ((step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15)) this.state = 13;
if (true) break;

case 66:
//C
this.state = 65;
_i = ((int)(0 + _i + step15)) ;
Debug.locals.put("i", _i);
if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1638;BA.debugLine="Dim mRes As Map=lstRes.Get(i)";
Debug.JustUpdateDeviceLine();
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mres = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstres.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mRes", _mres);Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1639;BA.debugLine="Dim NombreCampoQuerySQL As String=mRes.Get(\"CO";
Debug.JustUpdateDeviceLine();
_nombrecampoquerysql = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_NAME")))));Debug.locals.put("NombreCampoQuerySQL", _nombrecampoquerysql);Debug.locals.put("NombreCampoQuerySQL", _nombrecampoquerysql);
 BA.debugLineNum = 1640;BA.debugLine="lstCamposSQL.Add(NombreCampoQuerySQL)";
Debug.JustUpdateDeviceLine();
_lstcampossql.runVoidMethod ("Add",(Object)((_nombrecampoquerysql)));
 BA.debugLineNum = 1642;BA.debugLine="If lstNombresCamposCLVNoCalculados.IndexOf(Nom";
Debug.JustUpdateDeviceLine();
if (true) break;

case 14:
//if
this.state = 53;
if (RemoteObject.solveBoolean("=",_lstnombrescamposclvnocalculados.runMethod(true,"IndexOf",(Object)((_nombrecampoquerysql))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 16;
}else {
this.state = 52;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1643;BA.debugLine="Dim mInfoCampoSQL As Map";
Debug.JustUpdateDeviceLine();
_minfocamposql = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mInfoCampoSQL", _minfocamposql);
 BA.debugLineNum = 1644;BA.debugLine="mInfoCampoSQL.Initialize";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Initialize");
 BA.debugLineNum = 1645;BA.debugLine="mInfoCampoSQL.Put(\"Campo\",mRes.Get(\"COLUMN_NA";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Campo"))),(Object)(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_NAME"))))));
 BA.debugLineNum = 1646;BA.debugLine="mInfoCampoSQL.Put(\"AliasCampo\",mRes.Get(\"COLU";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("AliasCampo"))),(Object)(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_NAME"))))));
 BA.debugLineNum = 1647;BA.debugLine="mInfoCampoSQL.Put(\"EncabezadoColumna\",mRes.Ge";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("EncabezadoColumna"))),(Object)(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_NAME"))))));
 BA.debugLineNum = 1648;BA.debugLine="Dim TipoDatoMySQLMySQL As String=mRes.Get(\"DA";
Debug.JustUpdateDeviceLine();
_tipodatomysqlmysql = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DATA_TYPE")))));Debug.locals.put("TipoDatoMySQLMySQL", _tipodatomysqlmysql);Debug.locals.put("TipoDatoMySQLMySQL", _tipodatomysqlmysql);
 BA.debugLineNum = 1649;BA.debugLine="Dim TipoDato As String";
Debug.JustUpdateDeviceLine();
_tipodato = RemoteObject.createImmutable("");Debug.locals.put("TipoDato", _tipodato);
 BA.debugLineNum = 1650;BA.debugLine="Select TipoDatoMySQLMySQL";
Debug.JustUpdateDeviceLine();
if (true) break;

case 17:
//select
this.state = 50;
switch (BA.switchObjectToInt(_tipodatomysqlmysql,BA.ObjectToString("smallint"),BA.ObjectToString("int"),BA.ObjectToString("tinyint"),BA.ObjectToString("bit"),BA.ObjectToString("bigint"),BA.ObjectToString("varchar"),BA.ObjectToString("char"),BA.ObjectToString("text"),BA.ObjectToString("nchar"),BA.ObjectToString("ntext"),BA.ObjectToString("nvarchar"),BA.ObjectToString("enum"),BA.ObjectToString("double"),BA.ObjectToString("decimal"),BA.ObjectToString("float"))) {
case 0: {
this.state = 19;
if (true) break;
}
case 1: {
this.state = 21;
if (true) break;
}
case 2: {
this.state = 23;
if (true) break;
}
case 3: {
this.state = 25;
if (true) break;
}
case 4: {
this.state = 27;
if (true) break;
}
case 5: {
this.state = 29;
if (true) break;
}
case 6: {
this.state = 31;
if (true) break;
}
case 7: {
this.state = 33;
if (true) break;
}
case 8: {
this.state = 35;
if (true) break;
}
case 9: {
this.state = 37;
if (true) break;
}
case 10: {
this.state = 39;
if (true) break;
}
case 11: {
this.state = 41;
if (true) break;
}
case 12: {
this.state = 43;
if (true) break;
}
case 13: {
this.state = 45;
if (true) break;
}
case 14: {
this.state = 47;
if (true) break;
}
default: {
this.state = 49;
if (true) break;
}
}
if (true) break;

case 19:
//C
this.state = 50;
 BA.debugLineNum = 1672;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 21:
//C
this.state = 50;
 BA.debugLineNum = 1674;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 23:
//C
this.state = 50;
 BA.debugLineNum = 1676;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 25:
//C
this.state = 50;
 BA.debugLineNum = 1678;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 27:
//C
this.state = 50;
 BA.debugLineNum = 1680;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 29:
//C
this.state = 50;
 BA.debugLineNum = 1682;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 31:
//C
this.state = 50;
 BA.debugLineNum = 1684;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 33:
//C
this.state = 50;
 BA.debugLineNum = 1686;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 35:
//C
this.state = 50;
 BA.debugLineNum = 1688;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 37:
//C
this.state = 50;
 BA.debugLineNum = 1690;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 39:
//C
this.state = 50;
 BA.debugLineNum = 1692;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 41:
//C
this.state = 50;
 BA.debugLineNum = 1694;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 43:
//C
this.state = 50;
 BA.debugLineNum = 1696;BA.debugLine="TipoDato=\"REAL\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("REAL");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 45:
//C
this.state = 50;
 BA.debugLineNum = 1698;BA.debugLine="TipoDato=\"REAL\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("REAL");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 47:
//C
this.state = 50;
 BA.debugLineNum = 1700;BA.debugLine="TipoDato=\"REAL\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("REAL");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 1703;BA.debugLine="TipoDato=\"\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 50:
//C
this.state = 53;
;
 BA.debugLineNum = 1705;BA.debugLine="mInfoCampoSQL.Put(\"TipoDato\",TipoDato)";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TipoDato"))),(Object)((_tipodato)));
 BA.debugLineNum = 1706;BA.debugLine="AddItem(mInfoCampoSQL)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_additem" /*void*/ ,(Object)(_minfocamposql));
 if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 1708;BA.debugLine="Continue";
Debug.JustUpdateDeviceLine();
this.state = 66;
if (true) break;;
 if (true) break;

case 53:
//C
this.state = 66;
;
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1712;BA.debugLine="For i=0 To lstNombresCamposCLVNoCalculados.Size";
Debug.JustUpdateDeviceLine();

case 54:
//for
this.state = 61;
step67 = 1;
limit67 = RemoteObject.solve(new RemoteObject[] {_lstnombrescamposclvnocalculados.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 67;
if (true) break;

case 67:
//C
this.state = 61;
if ((step67 > 0 && _i <= limit67) || (step67 < 0 && _i >= limit67)) this.state = 56;
if (true) break;

case 68:
//C
this.state = 67;
_i = ((int)(0 + _i + step67)) ;
Debug.locals.put("i", _i);
if (true) break;

case 56:
//C
this.state = 57;
 BA.debugLineNum = 1713;BA.debugLine="If lstCamposSQL.IndexOf(lstNombresCamposCLVNoC";
Debug.JustUpdateDeviceLine();
if (true) break;

case 57:
//if
this.state = 60;
if (RemoteObject.solveBoolean("=",_lstcampossql.runMethod(true,"IndexOf",(Object)(_lstnombrescamposclvnocalculados.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 59;
}if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 1714;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1715;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1716;BA.debugLine="sb.Append(\"El campo no calculado \" & lstNombr";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("El campo no calculado "),_lstnombrescamposclvnocalculados.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(" no ha sido devuelto por la SQL."))));
 BA.debugLineNum = 1717;BA.debugLine="sb.Append(\" Si esto es un error, se debería e";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" Si esto es un error, se debería eliminar el campo del CLV.")));
 BA.debugLineNum = 1720;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(sb.ToStri";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(_sb.runMethod(true,"ToString")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1721;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "cargacamposjrdctable"), _msa);
this.state = 69;
return;
case 69:
//C
this.state = 60;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 if (true) break;

case 60:
//C
this.state = 68;
;
 if (true) break;
if (true) break;

case 61:
//C
this.state = 62;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1726;BA.debugLine="dragger.AddDragButtons";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dragger" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclvclvdragger.class, "_adddragbuttons" /*RemoteObject*/ );
 if (true) break;

case 62:
//C
this.state = 63;
;
 if (true) break;

case 63:
//C
this.state = -1;
;
 BA.debugLineNum = 1729;BA.debugLine="CallSubDelayed(Me, \"CargaCamposJRDCTable_Complete";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.createImmutable("CargaCamposJRDCTable_Completed")));
 BA.debugLineNum = 1730;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _cargacampostablasqlite(RemoteObject __ref,RemoteObject _lstcampostablasqlite) throws Exception{
try {
		Debug.PushSubsStack("CargaCamposTablaSQLite (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1536);
if (RapidSub.canDelegate("cargacampostablasqlite")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","cargacampostablasqlite", __ref, _lstcampostablasqlite);}
RemoteObject _lstnombrescamposclvnocalculados = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstcampossql = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nombrecampoquerysql = RemoteObject.createImmutable("");
RemoteObject _minfocamposql = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tipodatosqlite = RemoteObject.createImmutable("");
Debug.locals.put("lstCamposTablaSQLite", _lstcampostablasqlite);
 BA.debugLineNum = 1536;BA.debugLine="private Sub CargaCamposTablaSQLite(lstCamposTablaS";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1537;BA.debugLine="Dim lstNombresCamposCLVNoCalculados As List=Nombr";
Debug.JustUpdateDeviceLine();
_lstnombrescamposclvnocalculados = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstnombrescamposclvnocalculados = __ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_nombrescamposclvnocalculados" /*RemoteObject*/ );Debug.locals.put("lstNombresCamposCLVNoCalculados", _lstnombrescamposclvnocalculados);Debug.locals.put("lstNombresCamposCLVNoCalculados", _lstnombrescamposclvnocalculados);
 BA.debugLineNum = 1538;BA.debugLine="Dim lstCamposSQL As List";
Debug.JustUpdateDeviceLine();
_lstcampossql = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCamposSQL", _lstcampossql);
 BA.debugLineNum = 1539;BA.debugLine="lstCamposSQL.Initialize";
Debug.JustUpdateDeviceLine();
_lstcampossql.runVoidMethod ("Initialize");
 BA.debugLineNum = 1540;BA.debugLine="For i=0 To lstCamposTablaSQLite.Size-1";
Debug.JustUpdateDeviceLine();
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_lstcampostablasqlite.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1541;BA.debugLine="Dim mRes As Map=lstCamposTablaSQLite.Get(i)";
Debug.JustUpdateDeviceLine();
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mres = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstcampostablasqlite.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mRes", _mres);Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1542;BA.debugLine="Dim NombreCampoQuerySQL As String=mRes.Get(\"name";
Debug.JustUpdateDeviceLine();
_nombrecampoquerysql = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));Debug.locals.put("NombreCampoQuerySQL", _nombrecampoquerysql);Debug.locals.put("NombreCampoQuerySQL", _nombrecampoquerysql);
 BA.debugLineNum = 1543;BA.debugLine="lstCamposSQL.Add(NombreCampoQuerySQL)";
Debug.JustUpdateDeviceLine();
_lstcampossql.runVoidMethod ("Add",(Object)((_nombrecampoquerysql)));
 BA.debugLineNum = 1545;BA.debugLine="If lstNombresCamposCLVNoCalculados.IndexOf(Nombr";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_lstnombrescamposclvnocalculados.runMethod(true,"IndexOf",(Object)((_nombrecampoquerysql))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 1546;BA.debugLine="Dim mInfoCampoSQL As Map";
Debug.JustUpdateDeviceLine();
_minfocamposql = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mInfoCampoSQL", _minfocamposql);
 BA.debugLineNum = 1547;BA.debugLine="mInfoCampoSQL.Initialize";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Initialize");
 BA.debugLineNum = 1548;BA.debugLine="mInfoCampoSQL.Put(\"Campo\",NombreCampoQuerySQL)";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Campo"))),(Object)((_nombrecampoquerysql)));
 BA.debugLineNum = 1549;BA.debugLine="mInfoCampoSQL.Put(\"AliasCampo\",NombreCampoQuery";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("AliasCampo"))),(Object)((_nombrecampoquerysql)));
 BA.debugLineNum = 1550;BA.debugLine="mInfoCampoSQL.Put(\"EncabezadoColumna\",NombreCam";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("EncabezadoColumna"))),(Object)((_nombrecampoquerysql)));
 BA.debugLineNum = 1551;BA.debugLine="Dim TipoDatoSQLite As String=mRes.Get(\"type\")";
Debug.JustUpdateDeviceLine();
_tipodatosqlite = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type")))));Debug.locals.put("TipoDatoSQLite", _tipodatosqlite);Debug.locals.put("TipoDatoSQLite", _tipodatosqlite);
 BA.debugLineNum = 1552;BA.debugLine="mInfoCampoSQL.Put(\"TipoDato\",TipoDatoSQLite)";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TipoDato"))),(Object)((_tipodatosqlite)));
 BA.debugLineNum = 1553;BA.debugLine="AddItem(mInfoCampoSQL)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_additem" /*void*/ ,(Object)(_minfocamposql));
 }else {
 BA.debugLineNum = 1555;BA.debugLine="Continue";
Debug.JustUpdateDeviceLine();
if (true) continue;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1558;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _cargadatosjrdcquerytop1(RemoteObject __ref,RemoteObject _rdclink,RemoteObject _comandoconfigproperties,RemoteObject _parametros,RemoteObject _callmodule) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosJRDCQueryTop1 (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2820);
if (RapidSub.canDelegate("cargadatosjrdcquerytop1")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","cargadatosjrdcquerytop1", __ref, _rdclink, _comandoconfigproperties, _parametros, _callmodule); return;}
ResumableSub_CargaDatosJRDCQueryTop1 rsub = new ResumableSub_CargaDatosJRDCQueryTop1(null,__ref,_rdclink,_comandoconfigproperties,_parametros,_callmodule);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CargaDatosJRDCQueryTop1 extends BA.ResumableSub {
public ResumableSub_CargaDatosJRDCQueryTop1(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref,RemoteObject _rdclink,RemoteObject _comandoconfigproperties,RemoteObject _parametros,RemoteObject _callmodule) {
this.parent = parent;
this.__ref = __ref;
this._rdclink = _rdclink;
this._comandoconfigproperties = _comandoconfigproperties;
this._parametros = _parametros;
this._callmodule = _callmodule;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _rdclink;
RemoteObject _comandoconfigproperties;
RemoteObject _parametros;
RemoteObject _callmodule;
RemoteObject _lstres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _req = RemoteObject.declareNull("b4j.docU.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4j.docU.main._dbresult");
RemoteObject _record = null;
RemoteObject _mreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
int step20;
int limit20;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosJRDCQueryTop1 (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2820);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("rdcLink", _rdclink);
Debug.locals.put("ComandoConfigProperties", _comandoconfigproperties);
Debug.locals.put("Parametros", _parametros);
Debug.locals.put("CallModule", _callmodule);
 BA.debugLineNum = 2822;BA.debugLine="Dim lstRes As List";
Debug.JustUpdateDeviceLine();
_lstres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 2823;BA.debugLine="lstRes.Initialize";
Debug.JustUpdateDeviceLine();
_lstres.runVoidMethod ("Initialize");
 BA.debugLineNum = 2824;BA.debugLine="Dim m As Map";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 2825;BA.debugLine="m.Initialize";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 2826;BA.debugLine="m.Put(\"ConnOK\",False)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ConnOK"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 2827;BA.debugLine="m.Put(\"ReqOK\",False)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ReqOK"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 2828;BA.debugLine="m.Put(\"lstRes\",lstRes)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstRes"))),(Object)((_lstres.getObject())));
 BA.debugLineNum = 2829;BA.debugLine="Dim req As DBRequestManager = CreateRequest(rdcLi";
Debug.JustUpdateDeviceLine();
_req = __ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_createrequest" /*RemoteObject*/ ,(Object)(_rdclink));Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 2830;BA.debugLine="Dim cmd As DBCommand = CreateCommand(ComandoConfi";
Debug.JustUpdateDeviceLine();
_cmd = __ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_createcommand" /*RemoteObject*/ ,(Object)(_comandoconfigproperties),(Object)(_parametros));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 2832;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "cargadatosjrdcquerytop1"), (_req.runClassMethod (b4j.docU.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 2833;BA.debugLine="If j.Success Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 16;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 15;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2834;BA.debugLine="m.Put(\"ConnOK\",True)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ConnOK"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 2835;BA.debugLine="req.HandleJobAsync(j, \"req\")";
Debug.JustUpdateDeviceLine();
_req.runClassMethod (b4j.docU.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 2836;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "cargadatosjrdcquerytop1"), (_req));
this.state = 18;
return;
case 18:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 2838;BA.debugLine="If res.Rows.Size>0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 13;
if (RemoteObject.solveBoolean(">",_res.getField(false,"Rows" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 2839;BA.debugLine="m.Put(\"ReqOK\",True)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ReqOK"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 2841;BA.debugLine="Dim record() As Object=res.Rows.Get(0)";
Debug.JustUpdateDeviceLine();
_record = (_res.getField(false,"Rows" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("record", _record);Debug.locals.put("record", _record);
 BA.debugLineNum = 2842;BA.debugLine="Dim mReg As Map";
Debug.JustUpdateDeviceLine();
_mreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mReg", _mreg);
 BA.debugLineNum = 2843;BA.debugLine="mReg.Initialize";
Debug.JustUpdateDeviceLine();
_mreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 2844;BA.debugLine="For i=0 To  res.Columns.Size-1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//for
this.state = 10;
step20 = 1;
limit20 = RemoteObject.solve(new RemoteObject[] {_res.getField(false,"Columns" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 19;
if (true) break;

case 19:
//C
this.state = 10;
if ((step20 > 0 && _i <= limit20) || (step20 < 0 && _i >= limit20)) this.state = 9;
if (true) break;

case 20:
//C
this.state = 19;
_i = ((int)(0 + _i + step20)) ;
Debug.locals.put("i", _i);
if (true) break;

case 9:
//C
this.state = 20;
 BA.debugLineNum = 2845;BA.debugLine="mReg.Put(res.Columns.GetKeyAt(i),record(i))";
Debug.JustUpdateDeviceLine();
_mreg.runVoidMethod ("Put",(Object)(_res.getField(false,"Columns" /*RemoteObject*/ ).runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))),(Object)(_record.getArrayElement(false,BA.numberCast(int.class, _i))));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 13;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2847;BA.debugLine="lstRes.Add(mReg)";
Debug.JustUpdateDeviceLine();
_lstres.runVoidMethod ("Add",(Object)((_mreg.getObject())));
 if (true) break;

case 12:
//C
this.state = 13;
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 2854;BA.debugLine="j.Release";
Debug.JustUpdateDeviceLine();
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 2855;BA.debugLine="CallSubDelayed2(CallModule, \"CargaDatosJRDCQueryT";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(_callmodule),(Object)(BA.ObjectToString("CargaDatosJRDCQueryTop1_Completed")),(Object)((_m)));
 BA.debugLineNum = 2857;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _j) throws Exception{
}
public static void  _req_result(RemoteObject __ref,RemoteObject _res) throws Exception{
}
public static RemoteObject  _cboalineacioncolumna_valuechanged(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("cboAlineacionColumna_ValueChanged (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2706);
if (RapidSub.canDelegate("cboalineacioncolumna_valuechanged")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","cboalineacioncolumna_valuechanged", __ref, _value);}
Debug.locals.put("Value", _value);
 BA.debugLineNum = 2706;BA.debugLine="private Sub cboAlineacionColumna_ValueChanged (Val";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2707;BA.debugLine="If CargandoDatos Then Return";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_cargandodatos" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 2708;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cbocampo_valuechanged(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("cboCampo_ValueChanged (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2307);
if (RapidSub.canDelegate("cbocampo_valuechanged")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","cbocampo_valuechanged", __ref, _value);}
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue");
Debug.locals.put("Value", _value);
 BA.debugLineNum = 2307;BA.debugLine="private Sub cboCampo_ValueChanged (Value As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2308;BA.debugLine="If CargandoDatos Then Return";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_cargandodatos" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 2309;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(S";
Debug.JustUpdateDeviceLine();
_index = __ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), jamtableclvcamposbuilder.__c.runMethod(false,"Sender",__ref.getField(false, "ba"))));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 2310;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValue";
Debug.JustUpdateDeviceLine();
_clviv = (__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 2312;BA.debugLine="If Not(clvIV.chkBoxCampoCalculado.Checked) Then";
Debug.JustUpdateDeviceLine();
if (jamtableclvcamposbuilder.__c.runMethod(true,"Not",(Object)(_clviv.getField(false,"chkBoxCampoCalculado" /*RemoteObject*/ ).runMethod(true,"getChecked"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2314;BA.debugLine="clvIV.txtAliasCampo.Text=Value";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtAliasCampo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_value));
 };
 BA.debugLineNum = 2316;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _cbotipocontrolfiltro_valuechanged(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("cboTipoControlFiltro_ValueChanged (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2105);
if (RapidSub.canDelegate("cbotipocontrolfiltro_valuechanged")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","cbotipocontrolfiltro_valuechanged", __ref, _value); return;}
ResumableSub_cboTipoControlFiltro_ValueChanged rsub = new ResumableSub_cboTipoControlFiltro_ValueChanged(null,__ref,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cboTipoControlFiltro_ValueChanged extends BA.ResumableSub {
public ResumableSub_cboTipoControlFiltro_ValueChanged(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref,RemoteObject _value) {
this.parent = parent;
this.__ref = __ref;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _value;
RemoteObject _cbotcf = RemoteObject.declareNull("anywheresoftware.b4j.objects.ComboBoxWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cboTipoControlFiltro_ValueChanged (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2105);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 2106;BA.debugLine="If CargandoDatos Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (__ref.getField(true,"_cargandodatos" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
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
 BA.debugLineNum = 2107;BA.debugLine="If Value=\"\" Or Value=Null Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable((""))) || RemoteObject.solveBoolean("n",_value)) { 
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
 BA.debugLineNum = 2108;BA.debugLine="Dim cboTCF As ComboBox=Sender";
Debug.JustUpdateDeviceLine();
_cbotcf = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");
_cbotcf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ComboBoxWrapper"), parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("cboTCF", _cbotcf);Debug.locals.put("cboTCF", _cbotcf);
 BA.debugLineNum = 2109;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
Debug.JustUpdateDeviceLine();
_index = __ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _cbotcf.getObject()));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 2110;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValue";
Debug.JustUpdateDeviceLine();
_clviv = (__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 2111;BA.debugLine="If Value=TipoControlFiltro_TextFieldButton And cl";
Debug.JustUpdateDeviceLine();
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_value,(__ref.getField(true,"_tipocontrolfiltro_textfieldbutton" /*RemoteObject*/ ))) && RemoteObject.solveBoolean("=",_clviv.getField(false,"chkBoxEsFecha" /*RemoteObject*/ ).runMethod(true,"getChecked"),parent.__c.getField(true,"False"))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 2112;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("El tipo de control filtro = "),__ref.getField(true,"_tipocontrolfiltro_textfieldbutton" /*RemoteObject*/ ),RemoteObject.createImmutable(" sólo es válidos para campos tipo fecha."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2113;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "cbotipocontrolfiltro_valuechanged"), _msa);
this.state = 26;
return;
case 26:
//C
this.state = 16;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2114;BA.debugLine="cboTCF.Value=\"\"";
Debug.JustUpdateDeviceLine();
_cbotcf.runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 if (true) break;
;
 BA.debugLineNum = 2116;BA.debugLine="If (Value<>TipoControlFiltro_TextFieldButton And";
Debug.JustUpdateDeviceLine();

case 16:
//if
this.state = 19;
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",_value,(__ref.getField(true,"_tipocontrolfiltro_textfieldbutton" /*RemoteObject*/ ))) && RemoteObject.solveBoolean("!",_value,(RemoteObject.createImmutable("")))))) && RemoteObject.solveBoolean("=",_clviv.getField(false,"chkBoxEsFecha" /*RemoteObject*/ ).runMethod(true,"getChecked"),parent.__c.getField(true,"True"))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 2117;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Los campos";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Los campos tipo fecha sólo admiten tipo de control filtro = "),__ref.getField(true,"_tipocontrolfiltro_textfieldbutton" /*RemoteObject*/ ),RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2118;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "cbotipocontrolfiltro_valuechanged"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 19;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2119;BA.debugLine="cboTCF.Value=\"\"";
Debug.JustUpdateDeviceLine();
_cbotcf.runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 if (true) break;
;
 BA.debugLineNum = 2121;BA.debugLine="If Value=TipoControlFiltro_CheckBox And clvIV.cbo";
Debug.JustUpdateDeviceLine();

case 19:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",_value,(__ref.getField(true,"_tipocontrolfiltro_checkbox" /*RemoteObject*/ ))) && RemoteObject.solveBoolean("!",_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("INTEGER")))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 2122;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("El tipo de control filtro = "),__ref.getField(true,"_tipocontrolfiltro_checkbox" /*RemoteObject*/ ),RemoteObject.createImmutable(" sólo es válidos para campos con tipo de dato = INTEGER."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2123;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "cbotipocontrolfiltro_valuechanged"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 22;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2124;BA.debugLine="cboTCF.Value=\"\"";
Debug.JustUpdateDeviceLine();
_cbotcf.runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 if (true) break;
;
 BA.debugLineNum = 2126;BA.debugLine="If (Value<>TipoControlFiltro_CheckBox And Value<>";
Debug.JustUpdateDeviceLine();

case 22:
//if
this.state = 25;
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",_value,(__ref.getField(true,"_tipocontrolfiltro_checkbox" /*RemoteObject*/ ))) && RemoteObject.solveBoolean("!",_value,(RemoteObject.createImmutable("")))))) && RemoteObject.solveBoolean("=",_clviv.getField(false,"chkBoxEsBooleano" /*RemoteObject*/ ).runMethod(true,"getChecked"),parent.__c.getField(true,"True"))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 2127;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Los campos";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Los campos tipo booleano sólo admiten tipo de control filtro = "),__ref.getField(true,"_tipocontrolfiltro_checkbox" /*RemoteObject*/ ),RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2128;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "cbotipocontrolfiltro_valuechanged"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 25;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2129;BA.debugLine="cboTCF.Value=\"\"";
Debug.JustUpdateDeviceLine();
_cbotcf.runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 if (true) break;

case 25:
//C
this.state = -1;
;
 BA.debugLineNum = 2131;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _cbotipodato_valuechanged(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("cboTipoDato_ValueChanged (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2279);
if (RapidSub.canDelegate("cbotipodato_valuechanged")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","cbotipodato_valuechanged", __ref, _value); return;}
ResumableSub_cboTipoDato_ValueChanged rsub = new ResumableSub_cboTipoDato_ValueChanged(null,__ref,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cboTipoDato_ValueChanged extends BA.ResumableSub {
public ResumableSub_cboTipoDato_ValueChanged(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref,RemoteObject _value) {
this.parent = parent;
this.__ref = __ref;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _value;
RemoteObject _cbotd = RemoteObject.declareNull("anywheresoftware.b4j.objects.ComboBoxWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cboTipoDato_ValueChanged (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2279);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 2280;BA.debugLine="If CargandoDatos Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (__ref.getField(true,"_cargandodatos" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
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
 BA.debugLineNum = 2281;BA.debugLine="Dim cboTD As ComboBox=Sender";
Debug.JustUpdateDeviceLine();
_cbotd = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");
_cbotd = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ComboBoxWrapper"), parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("cboTD", _cbotd);Debug.locals.put("cboTD", _cbotd);
 BA.debugLineNum = 2282;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
Debug.JustUpdateDeviceLine();
_index = __ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _cbotd.getObject()));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 2283;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValue";
Debug.JustUpdateDeviceLine();
_clviv = (__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 2284;BA.debugLine="If cboTD.Value<>\"REAL\" And clvIV.chkBoxEsFecha.Ch";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("!",_cbotd.runMethod(false,"getValue"),RemoteObject.createImmutable(("REAL"))) && RemoteObject.solveBoolean(".",_clviv.getField(false,"chkBoxEsFecha" /*RemoteObject*/ ).runMethod(true,"getChecked"))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
_clviv.getField(false,"chkBoxEsFecha" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"False"));
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 2285;BA.debugLine="If  cboTD.value<>\"INTEGER\" And clvIV.cboTipoContr";
Debug.JustUpdateDeviceLine();
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("!",_cbotd.runMethod(false,"getValue"),RemoteObject.createImmutable(("INTEGER"))) && RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoControlFiltro" /*RemoteObject*/ ).runMethod(false,"getValue"),(__ref.getField(true,"_tipocontrolfiltro_checkbox" /*RemoteObject*/ )))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 2286;BA.debugLine="clvIV.cboTipoControlFiltro.Value=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoControlFiltro" /*RemoteObject*/ ).runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 2287;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("El tipo de control de filtro checkbox, sólo es compatible con tipo de datos INTEGER. Se quita el tipo de control de filtro.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2288;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "cbotipodato_valuechanged"), _msa);
this.state = 17;
return;
case 17:
//C
this.state = 16;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2289;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 2291;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _checkchanges(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckChanges (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1789);
if (RapidSub.canDelegate("checkchanges")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","checkchanges", __ref);}
ResumableSub_CheckChanges rsub = new ResumableSub_CheckChanges(null,__ref);
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
public static class ResumableSub_CheckChanges extends BA.ResumableSub {
public ResumableSub_CheckChanges(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _haycambios = RemoteObject.createImmutable(false);
RemoteObject _sclv = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _msclv = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mscheck = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _check1 = RemoteObject.createImmutable(false);
RemoteObject _check2 = RemoteObject.createImmutable(false);
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CheckChanges (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1789);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1790;BA.debugLine="If CurrentFile=\"\" Then Return False";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_currentfile" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1792;BA.debugLine="Dim HayCambios As Boolean=False";
Debug.JustUpdateDeviceLine();
_haycambios = parent.__c.getField(true,"False");Debug.locals.put("HayCambios", _haycambios);Debug.locals.put("HayCambios", _haycambios);
 BA.debugLineNum = 1796;BA.debugLine="Dim sCLV As String = ExportToString";
Debug.JustUpdateDeviceLine();
_sclv = __ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_exporttostring" /*RemoteObject*/ );Debug.locals.put("sCLV", _sclv);Debug.locals.put("sCLV", _sclv);
 BA.debugLineNum = 1798;BA.debugLine="Dim parser As JSONParser";
Debug.JustUpdateDeviceLine();
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 1799;BA.debugLine="parser.Initialize(sCLV)";
Debug.JustUpdateDeviceLine();
_parser.runVoidMethod ("Initialize",(Object)(_sclv));
 BA.debugLineNum = 1800;BA.debugLine="Dim msCLV As Map = parser.NextObject";
Debug.JustUpdateDeviceLine();
_msclv = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_msclv = _parser.runMethod(false,"NextObject");Debug.locals.put("msCLV", _msclv);Debug.locals.put("msCLV", _msclv);
 BA.debugLineNum = 1802;BA.debugLine="parser.Initialize(CurrentFileString)";
Debug.JustUpdateDeviceLine();
_parser.runVoidMethod ("Initialize",(Object)(__ref.getField(true,"_currentfilestring" /*RemoteObject*/ )));
 BA.debugLineNum = 1803;BA.debugLine="Dim msCheck As Map = parser.NextObject";
Debug.JustUpdateDeviceLine();
_mscheck = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mscheck = _parser.runMethod(false,"NextObject");Debug.locals.put("msCheck", _mscheck);Debug.locals.put("msCheck", _mscheck);
 BA.debugLineNum = 1806;BA.debugLine="msCLV.Remove(\"FechaUltimaModificacion\")";
Debug.JustUpdateDeviceLine();
_msclv.runVoidMethod ("Remove",(Object)((RemoteObject.createImmutable("FechaUltimaModificacion"))));
 BA.debugLineNum = 1807;BA.debugLine="msCheck.Remove(\"FechaUltimaModificacion\")";
Debug.JustUpdateDeviceLine();
_mscheck.runVoidMethod ("Remove",(Object)((RemoteObject.createImmutable("FechaUltimaModificacion"))));
 BA.debugLineNum = 1809;BA.debugLine="Dim Check1 As Boolean=Comparar2Mapas(msCLV,msChec";
Debug.JustUpdateDeviceLine();
_check1 = __ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_comparar2mapas" /*RemoteObject*/ ,(Object)(_msclv),(Object)(_mscheck));Debug.locals.put("Check1", _check1);Debug.locals.put("Check1", _check1);
 BA.debugLineNum = 1810;BA.debugLine="Dim Check2 As Boolean=Comparar2Mapas(msCheck,msCL";
Debug.JustUpdateDeviceLine();
_check2 = __ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_comparar2mapas" /*RemoteObject*/ ,(Object)(_mscheck),(Object)(_msclv));Debug.locals.put("Check2", _check2);Debug.locals.put("Check2", _check2);
 BA.debugLineNum = 1812;BA.debugLine="HayCambios=(Not(Check1) Or Not(Check2))";
Debug.JustUpdateDeviceLine();
_haycambios = BA.ObjectToBoolean((RemoteObject.solveBoolean(".",parent.__c.runMethod(true,"Not",(Object)(_check1))) || RemoteObject.solveBoolean(".",parent.__c.runMethod(true,"Not",(Object)(_check2)))));Debug.locals.put("HayCambios", _haycambios);
 BA.debugLineNum = 1815;BA.debugLine="If HayCambios Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 22;
if (_haycambios.<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 21;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1816;BA.debugLine="Wait For (Dialog.Show(\"¿Grabar Cambios?\", \"Sí\",";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "checkchanges"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_show" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(("¿Grabar Cambios?"))),(Object)(RemoteObject.createImmutable(("Sí"))),(Object)(RemoteObject.createImmutable(("No"))),(Object)((RemoteObject.createImmutable("Cancelar")))));
this.state = 23;
return;
case 23:
//C
this.state = 10;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1817;BA.debugLine="Select Result";
Debug.JustUpdateDeviceLine();
if (true) break;

case 10:
//select
this.state = 19;
switch (BA.switchObjectToInt(_result,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel"),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive"),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Negative"))) {
case 0: {
this.state = 12;
if (true) break;
}
case 1: {
this.state = 14;
if (true) break;
}
case 2: {
this.state = 16;
if (true) break;
}
default: {
this.state = 18;
if (true) break;
}
}
if (true) break;

case 12:
//C
this.state = 19;
 BA.debugLineNum = 1819;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 14:
//C
this.state = 19;
 BA.debugLineNum = 1821;BA.debugLine="mnuSave_Action";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_mnusave_action" /*void*/ );
 BA.debugLineNum = 1822;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 16:
//C
this.state = 19;
 BA.debugLineNum = 1824;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 1826;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 19:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 1829;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 22:
//C
this.state = -1;
;
 BA.debugLineNum = 1831;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _checkforwarnings(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckForWarnings (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1869);
if (RapidSub.canDelegate("checkforwarnings")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","checkforwarnings", __ref);}
ResumableSub_CheckForWarnings rsub = new ResumableSub_CheckForWarnings(null,__ref);
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
public static class ResumableSub_CheckForWarnings extends BA.ResumableSub {
public ResumableSub_CheckForWarnings(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _lstcampos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstaliascampos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstencabezados = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstprimarykeys = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _omprimarykeys = RemoteObject.declareNull("b4j.docU.b4xorderedmap");
int _i = 0;
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _nombrecampopk = RemoteObject.createImmutable("");
RemoteObject _lstnombrescamposclvincluidosenformulascamposcalculados = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int step11;
int limit11;
RemoteObject group75;
int index75;
int groupLen75;
int step86;
int limit86;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CheckForWarnings (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1869);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1870;BA.debugLine="Dim lstCampos As List";
Debug.JustUpdateDeviceLine();
_lstcampos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCampos", _lstcampos);
 BA.debugLineNum = 1871;BA.debugLine="lstCampos.Initialize";
Debug.JustUpdateDeviceLine();
_lstcampos.runVoidMethod ("Initialize");
 BA.debugLineNum = 1872;BA.debugLine="Dim lstAliasCampos As List";
Debug.JustUpdateDeviceLine();
_lstaliascampos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstAliasCampos", _lstaliascampos);
 BA.debugLineNum = 1873;BA.debugLine="lstAliasCampos.Initialize";
Debug.JustUpdateDeviceLine();
_lstaliascampos.runVoidMethod ("Initialize");
 BA.debugLineNum = 1874;BA.debugLine="Dim lstEncabezados As List";
Debug.JustUpdateDeviceLine();
_lstencabezados = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstEncabezados", _lstencabezados);
 BA.debugLineNum = 1875;BA.debugLine="lstEncabezados.Initialize";
Debug.JustUpdateDeviceLine();
_lstencabezados.runVoidMethod ("Initialize");
 BA.debugLineNum = 1877;BA.debugLine="Dim lstPrimaryKeys As List";
Debug.JustUpdateDeviceLine();
_lstprimarykeys = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstPrimaryKeys", _lstprimarykeys);
 BA.debugLineNum = 1878;BA.debugLine="lstPrimaryKeys.Initialize";
Debug.JustUpdateDeviceLine();
_lstprimarykeys.runVoidMethod ("Initialize");
 BA.debugLineNum = 1881;BA.debugLine="Dim omPrimaryKeys As B4XOrderedMap";
Debug.JustUpdateDeviceLine();
_omprimarykeys = RemoteObject.createNew ("b4j.docU.b4xorderedmap");Debug.locals.put("omPrimaryKeys", _omprimarykeys);
 BA.debugLineNum = 1882;BA.debugLine="omPrimaryKeys.Initialize";
Debug.JustUpdateDeviceLine();
_omprimarykeys.runClassMethod (b4j.docU.b4xorderedmap.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 1886;BA.debugLine="For i = 0 To clvListaCampos.Size - 1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//for
this.state = 48;
step11 = 1;
limit11 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 77;
if (true) break;

case 77:
//C
this.state = 48;
if ((step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11)) this.state = 3;
if (true) break;

case 78:
//C
this.state = 77;
_i = ((int)(0 + _i + step11)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1888;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValu";
Debug.JustUpdateDeviceLine();
_clviv = (__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 1890;BA.debugLine="If clvIV.cboCampo.Value=\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 15;
if (RemoteObject.solveBoolean("=",_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("")))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 15;
 BA.debugLineNum = 1891;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El campo n";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("El campo nº "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable(" está en blanco. Es un dato obligatorio"))),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1892;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "checkforwarnings"), _msa);
this.state = 79;
return;
case 79:
//C
this.state = 15;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1893;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1895;BA.debugLine="If lstCampos.IndexOf(clvIV.cboCampo.Value)=-1 T";
Debug.JustUpdateDeviceLine();
if (true) break;

case 9:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_lstcampos.runMethod(true,"IndexOf",(Object)(_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue"))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 1896;BA.debugLine="lstCampos.Add(clvIV.cboCampo.Value)";
Debug.JustUpdateDeviceLine();
_lstcampos.runVoidMethod ("Add",(Object)(_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue")));
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1899;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El campo";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("El campo nº "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable("("),_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(") está repetido."))),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1900;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "checkforwarnings"), _msa);
this.state = 80;
return;
case 80:
//C
this.state = 14;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1901;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 14:
//C
this.state = 15;
;
 if (true) break;
;
 BA.debugLineNum = 1905;BA.debugLine="If clvIV.txtAliasCampo.text=\"\" Then";
Debug.JustUpdateDeviceLine();

case 15:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",_clviv.getField(false,"txtAliasCampo" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 26;
 BA.debugLineNum = 1906;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El alias d";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("El alias del campo nº "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable(" está en blanco. Es un dato obligatorio"))),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1907;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "checkforwarnings"), _msa);
this.state = 81;
return;
case 81:
//C
this.state = 26;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1908;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 1910;BA.debugLine="If lstAliasCampos.IndexOf(clvIV.txtAliasCampo.t";
Debug.JustUpdateDeviceLine();
if (true) break;

case 20:
//if
this.state = 25;
if (RemoteObject.solveBoolean("=",_lstaliascampos.runMethod(true,"IndexOf",(Object)((_clviv.getField(false,"txtAliasCampo" /*RemoteObject*/ ).runMethod(true,"getText")))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 25;
 BA.debugLineNum = 1911;BA.debugLine="lstAliasCampos.Add(clvIV.txtAliasCampo.text)";
Debug.JustUpdateDeviceLine();
_lstaliascampos.runVoidMethod ("Add",(Object)((_clviv.getField(false,"txtAliasCampo" /*RemoteObject*/ ).runMethod(true,"getText"))));
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 1913;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El alias";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("El alias del campo nº "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable("("),_clviv.getField(false,"txtAliasCampo" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(") está repetido."))),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1914;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "checkforwarnings"), _msa);
this.state = 82;
return;
case 82:
//C
this.state = 25;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1915;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 25:
//C
this.state = 26;
;
 if (true) break;
;
 BA.debugLineNum = 1930;BA.debugLine="If clvIV.cboTipoDato.value=\"\" Then";
Debug.JustUpdateDeviceLine();

case 26:
//if
this.state = 29;
if (RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("")))) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 1931;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("El tipo de dato de la columna nº "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable(" está en blanco. Es un dato obligatorio."))),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1932;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "checkforwarnings"), _msa);
this.state = 83;
return;
case 83:
//C
this.state = 29;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1933;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 1948;BA.debugLine="If clvIV.chkBoxCampoCalculado.Checked=True And c";
Debug.JustUpdateDeviceLine();

case 29:
//if
this.state = 32;
if (RemoteObject.solveBoolean("=",_clviv.getField(false,"chkBoxCampoCalculado" /*RemoteObject*/ ).runMethod(true,"getChecked"),parent.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",_clviv.getField(false,"txtAliasCampo" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 1949;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El alias d";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("El alias de la columna nº "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable(" está en blanco. Un campo calculado siempre debe tener un alias de campo."))),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1950;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "checkforwarnings"), _msa);
this.state = 84;
return;
case 84:
//C
this.state = 32;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1951;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 1954;BA.debugLine="If clvIV.chkBoxCampoCalculado.Checked=True And c";
Debug.JustUpdateDeviceLine();

case 32:
//if
this.state = 35;
if (RemoteObject.solveBoolean("=",_clviv.getField(false,"chkBoxCampoCalculado" /*RemoteObject*/ ).runMethod(true,"getChecked"),parent.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",_clviv.getField(false,"chkboxKeyID" /*RemoteObject*/ ).runMethod(true,"getChecked"),parent.__c.getField(true,"True"))) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 1955;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un campo c";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Un campo calculado no puede ser clave primaria de la tabla.")),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1956;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "checkforwarnings"), _msa);
this.state = 85;
return;
case 85:
//C
this.state = 35;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1957;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 1971;BA.debugLine="If clvIV.cboTipoDato.Value<>\"INTEGER\" And clvIV.";
Debug.JustUpdateDeviceLine();

case 35:
//if
this.state = 38;
if (RemoteObject.solveBoolean("!",_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("INTEGER"))) && RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoControlFiltro" /*RemoteObject*/ ).runMethod(false,"getValue"),(__ref.getField(true,"_tipocontrolfiltro_checkbox" /*RemoteObject*/ )))) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 1972;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo co";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("El tipo control de filtro "),__ref.getField(true,"_tipocontrolfiltro_checkbox" /*RemoteObject*/ ),RemoteObject.createImmutable(" sólo es compatible con tipo de datos INTEGER ."))),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1973;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "checkforwarnings"), _msa);
this.state = 86;
return;
case 86:
//C
this.state = 38;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1974;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 1978;BA.debugLine="If clvIV.cboTipoDato.Value<>\"REAL\" And clvIV.cbo";
Debug.JustUpdateDeviceLine();

case 38:
//if
this.state = 41;
if (RemoteObject.solveBoolean("!",_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("REAL"))) && RemoteObject.solveBoolean("!",_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("INTEGER"))) && RemoteObject.solveBoolean(".",_clviv.getField(false,"chkBoxEsFecha" /*RemoteObject*/ ).runMethod(true,"getChecked"))) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 1979;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un campo t";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Un campo tipo fecha sólo es compatible con tipo de datos REAL o INTEGER.")),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1980;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "checkforwarnings"), _msa);
this.state = 87;
return;
case 87:
//C
this.state = 41;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1981;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 1985;BA.debugLine="If (clvIV.cboTipoDato.Value<>\"INTEGER\" And clvIV";
Debug.JustUpdateDeviceLine();

case 41:
//if
this.state = 44;
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("INTEGER"))) && RemoteObject.solveBoolean("!",_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getValue"),(RemoteObject.createImmutable("TEXT")))))) && RemoteObject.solveBoolean(".",_clviv.getField(false,"chkBoxEsBooleano" /*RemoteObject*/ ).runMethod(true,"getChecked"))) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 1986;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un campo t";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Un campo tipo booleano sólo es compatible con tipos de datos INTEGER y TEXT ."),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("("),_clviv.getField(false,"txtAliasCampo" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(")"))),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1987;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "checkforwarnings"), _msa);
this.state = 88;
return;
case 88:
//C
this.state = 44;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1988;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 1993;BA.debugLine="If clvIV.chkboxKeyID.Checked Then";
Debug.JustUpdateDeviceLine();

case 44:
//if
this.state = 47;
if (_clviv.getField(false,"chkboxKeyID" /*RemoteObject*/ ).runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 46;
}if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 1994;BA.debugLine="omPrimaryKeys.Put(clvIV.lblOrdenKeyID.Text,clvI";
Debug.JustUpdateDeviceLine();
_omprimarykeys.runClassMethod (b4j.docU.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)((_clviv.getField(false,"lblOrdenKeyID" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue")));
 if (true) break;

case 47:
//C
this.state = 78;
;
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2023;BA.debugLine="If omPrimaryKeys.Size>0 Then";
Debug.JustUpdateDeviceLine();

case 48:
//if
this.state = 55;
if (RemoteObject.solveBoolean(">",_omprimarykeys.runClassMethod (b4j.docU.b4xorderedmap.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
 BA.debugLineNum = 2024;BA.debugLine="omPrimaryKeys.Keys.Sort(True)";
Debug.JustUpdateDeviceLine();
_omprimarykeys.runClassMethod (b4j.docU.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ ).runVoidMethod ("Sort",(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 2025;BA.debugLine="For Each NombreCampoPK As String In omPrimaryKey";
Debug.JustUpdateDeviceLine();
if (true) break;

case 51:
//for
this.state = 54;
group75 = _omprimarykeys.runClassMethod (b4j.docU.b4xorderedmap.class, "_getvalues" /*RemoteObject*/ );
index75 = 0;
groupLen75 = group75.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("NombreCampoPK", _nombrecampopk);
this.state = 89;
if (true) break;

case 89:
//C
this.state = 54;
if (index75 < groupLen75) {
this.state = 53;
_nombrecampopk = BA.ObjectToString(group75.runMethod(false,"Get",index75));Debug.locals.put("NombreCampoPK", _nombrecampopk);}
if (true) break;

case 90:
//C
this.state = 89;
index75++;
Debug.locals.put("NombreCampoPK", _nombrecampopk);
if (true) break;

case 53:
//C
this.state = 90;
 BA.debugLineNum = 2026;BA.debugLine="lstPrimaryKeys.Add(NombreCampoPK)";
Debug.JustUpdateDeviceLine();
_lstprimarykeys.runVoidMethod ("Add",(Object)((_nombrecampopk)));
 if (true) break;
if (true) break;

case 54:
//C
this.state = 55;
Debug.locals.put("NombreCampoPK", _nombrecampopk);
;
 if (true) break;
;
 BA.debugLineNum = 2030;BA.debugLine="If lstPrimaryKeys.Size=0 Then";
Debug.JustUpdateDeviceLine();

case 55:
//if
this.state = 64;
if (RemoteObject.solveBoolean("=",_lstprimarykeys.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 57;
}if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 2037;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"No hay nin";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No hay ningún campo definido como clave primaria"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("La tabla será de tipo ReadOnly (SIN control por medio de la clase. Controlar via código)."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("¿Continuar?"))),(Object)(BA.ObjectToString("No hay clave primaria definida")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2038;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "checkforwarnings"), _msa);
this.state = 91;
return;
case 91:
//C
this.state = 58;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2039;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Re";
Debug.JustUpdateDeviceLine();
if (true) break;

case 58:
//if
this.state = 63;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 60;
;}if (true) break;

case 60:
//C
this.state = 63;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 63:
//C
this.state = 64;
;
 if (true) break;

case 64:
//C
this.state = 65;
;
 BA.debugLineNum = 2071;BA.debugLine="Dim lstNombresCamposCLVIncluidosEnFormulasCamposC";
Debug.JustUpdateDeviceLine();
_lstnombrescamposclvincluidosenformulascamposcalculados = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstnombrescamposclvincluidosenformulascamposcalculados = __ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_nombrescamposclvincluidosenformulascamposcalculados" /*RemoteObject*/ );Debug.locals.put("lstNombresCamposCLVIncluidosEnFormulasCamposCalculados", _lstnombrescamposclvincluidosenformulascamposcalculados);Debug.locals.put("lstNombresCamposCLVIncluidosEnFormulasCamposCalculados", _lstnombrescamposclvincluidosenformulascamposcalculados);
 BA.debugLineNum = 2072;BA.debugLine="If lstNombresCamposCLVIncluidosEnFormulasCamposCa";
Debug.JustUpdateDeviceLine();
if (true) break;

case 65:
//if
this.state = 76;
if (RemoteObject.solveBoolean(">",_lstnombrescamposclvincluidosenformulascamposcalculados.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 67;
}if (true) break;

case 67:
//C
this.state = 68;
 BA.debugLineNum = 2073;BA.debugLine="For i=0 To lstNombresCamposCLVIncluidosEnFormula";
Debug.JustUpdateDeviceLine();
if (true) break;

case 68:
//for
this.state = 75;
step86 = 1;
limit86 = RemoteObject.solve(new RemoteObject[] {_lstnombrescamposclvincluidosenformulascamposcalculados.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 92;
if (true) break;

case 92:
//C
this.state = 75;
if ((step86 > 0 && _i <= limit86) || (step86 < 0 && _i >= limit86)) this.state = 70;
if (true) break;

case 93:
//C
this.state = 92;
_i = ((int)(0 + _i + step86)) ;
Debug.locals.put("i", _i);
if (true) break;

case 70:
//C
this.state = 71;
 BA.debugLineNum = 2075;BA.debugLine="If lstAliasCampos.IndexOf(lstNombresCamposCLVIn";
Debug.JustUpdateDeviceLine();
if (true) break;

case 71:
//if
this.state = 74;
if (RemoteObject.solveBoolean("=",_lstaliascampos.runMethod(true,"IndexOf",(Object)(_lstnombrescamposclvincluidosenformulascamposcalculados.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 73;
}if (true) break;

case 73:
//C
this.state = 74;
 BA.debugLineNum = 2077;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El campo";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("El campo "),_lstnombrescamposclvincluidosenformulascamposcalculados.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(" está incluido en un campo calculado, pero no está en los alias de campos definidos."))),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2078;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "checkforwarnings"), _msa);
this.state = 94;
return;
case 94:
//C
this.state = 74;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2079;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 74:
//C
this.state = 93;
;
 if (true) break;
if (true) break;

case 75:
//C
this.state = 76;
Debug.locals.put("i", _i);
;
 if (true) break;

case 76:
//C
this.state = -1;
;
 BA.debugLineNum = 2090;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 2091;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _chkboxcampocalculado_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkBoxCampoCalculado_CheckedChange (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2261);
if (RapidSub.canDelegate("chkboxcampocalculado_checkedchange")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","chkboxcampocalculado_checkedchange", __ref, _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 2261;BA.debugLine="private Sub chkBoxCampoCalculado_CheckedChange(Che";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2262;BA.debugLine="If CargandoDatos Then Return";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_cargandodatos" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 2275;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chkboxconvalordefecto_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkBoxConValorDefecto_CheckedChange (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2769);
if (RapidSub.canDelegate("chkboxconvalordefecto_checkedchange")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","chkboxconvalordefecto_checkedchange", __ref, _checked);}
RemoteObject _chkvf = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue");
RemoteObject _txtvf = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 2769;BA.debugLine="Private Sub chkBoxConValorDefecto_CheckedChange(Ch";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2770;BA.debugLine="If CargandoDatos Then Return";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_cargandodatos" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 2771;BA.debugLine="Dim chkVF As CheckBox=Sender";
Debug.JustUpdateDeviceLine();
_chkvf = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
_chkvf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.CheckboxWrapper"), jamtableclvcamposbuilder.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("chkVF", _chkvf);Debug.locals.put("chkVF", _chkvf);
 BA.debugLineNum = 2772;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
Debug.JustUpdateDeviceLine();
_index = __ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _chkvf.getObject()));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 2773;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValue";
Debug.JustUpdateDeviceLine();
_clviv = (__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 2774;BA.debugLine="Dim txtVF As TextField=clvIV.txtValorDefecto";
Debug.JustUpdateDeviceLine();
_txtvf = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
_txtvf = _clviv.getField(false,"txtValorDefecto" /*RemoteObject*/ );Debug.locals.put("txtVF", _txtvf);Debug.locals.put("txtVF", _txtvf);
 BA.debugLineNum = 2775;BA.debugLine="txtVF.Visible= chkVF.Checked";
Debug.JustUpdateDeviceLine();
_txtvf.runMethod(true,"setVisible",_chkvf.runMethod(true,"getChecked"));
 BA.debugLineNum = 2776;BA.debugLine="If chkVF.Checked=False Then txtVF.Text=\"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_chkvf.runMethod(true,"getChecked"),jamtableclvcamposbuilder.__c.getField(true,"False"))) { 
_txtvf.runMethod(true,"setText",BA.ObjectToString(""));};
 BA.debugLineNum = 2777;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _chkboxesbooleano_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkBoxEsBooleano_CheckedChange (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2166);
if (RapidSub.canDelegate("chkboxesbooleano_checkedchange")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","chkboxesbooleano_checkedchange", __ref, _checked); return;}
ResumableSub_chkBoxEsBooleano_CheckedChange rsub = new ResumableSub_chkBoxEsBooleano_CheckedChange(null,__ref,_checked);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_chkBoxEsBooleano_CheckedChange extends BA.ResumableSub {
public ResumableSub_chkBoxEsBooleano_CheckedChange(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref,RemoteObject _checked) {
this.parent = parent;
this.__ref = __ref;
this._checked = _checked;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _checked;
RemoteObject _chkesb = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _txtesb = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
RemoteObject _cbotd = RemoteObject.declareNull("anywheresoftware.b4j.objects.ComboBoxWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("chkBoxEsBooleano_CheckedChange (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2166);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 2167;BA.debugLine="If CargandoDatos Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (__ref.getField(true,"_cargandodatos" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
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
 BA.debugLineNum = 2169;BA.debugLine="If CorrigiendoChkBoxEsBooleano Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 10;
if (__ref.getField(true,"_corrigiendochkboxesbooleano" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 2170;BA.debugLine="CorrigiendoChkBoxEsBooleano=False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_corrigiendochkboxesbooleano" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 2171;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 2174;BA.debugLine="Dim chkEsB As CheckBox=Sender";
Debug.JustUpdateDeviceLine();
_chkesb = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
_chkesb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.CheckboxWrapper"), parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("chkEsB", _chkesb);Debug.locals.put("chkEsB", _chkesb);
 BA.debugLineNum = 2175;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
Debug.JustUpdateDeviceLine();
_index = __ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _chkesb.getObject()));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 2176;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValue";
Debug.JustUpdateDeviceLine();
_clviv = (__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 2177;BA.debugLine="If Checked And (clvIV.cboTipoDato.Value<>\"INTEGER";
Debug.JustUpdateDeviceLine();
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean(".",_checked) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("INTEGER"))) && RemoteObject.solveBoolean("!",_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getValue"),(RemoteObject.createImmutable("TEXT"))))))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 2178;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un campo bo";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Un campo booleano sólo puede corresponder a tipos de datos TEXT o INTEGER.")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2179;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "chkboxesbooleano_checkedchange"), _msa);
this.state = 34;
return;
case 34:
//C
this.state = 14;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2180;BA.debugLine="CorrigiendoChkBoxEsBooleano=True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_corrigiendochkboxesbooleano" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 2181;BA.debugLine="chkEsB.Checked=False";
Debug.JustUpdateDeviceLine();
_chkesb.runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 if (true) break;
;
 BA.debugLineNum = 2184;BA.debugLine="If Checked And (clvIV.cboTipoControlFiltro.Value<";
Debug.JustUpdateDeviceLine();

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean(".",_checked) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",_clviv.getField(false,"cboTipoControlFiltro" /*RemoteObject*/ ).runMethod(false,"getValue"),(__ref.getField(true,"_tipocontrolfiltro_checkbox" /*RemoteObject*/ ))) && RemoteObject.solveBoolean("!",_clviv.getField(false,"cboTipoControlFiltro" /*RemoteObject*/ ).runMethod(false,"getValue"),(RemoteObject.createImmutable(""))))))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 2185;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("El tipo de control de filtro para un campo tipo Booleano tiene que ser "),__ref.getField(true,"_tipocontrolfiltro_checkbox" /*RemoteObject*/ ),RemoteObject.createImmutable(" o estar en blanco (si no se quiere filtrar por este campo)."),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Si es necesario, deja el tipo de control filtro en blanco."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2186;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "chkboxesbooleano_checkedchange"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 17;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2187;BA.debugLine="CorrigiendoChkBoxEsBooleano=True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_corrigiendochkboxesbooleano" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 2188;BA.debugLine="chkEsB.Checked=False";
Debug.JustUpdateDeviceLine();
_chkesb.runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 if (true) break;

case 17:
//C
this.state = 18;
;
 BA.debugLineNum = 2191;BA.debugLine="Dim txtEsB As TextField=clvIV.txtValorTrueCampoBo";
Debug.JustUpdateDeviceLine();
_txtesb = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
_txtesb = _clviv.getField(false,"txtValorTrueCampoBooleano" /*RemoteObject*/ );Debug.locals.put("txtEsB", _txtesb);Debug.locals.put("txtEsB", _txtesb);
 BA.debugLineNum = 2192;BA.debugLine="If chkEsB.Checked=False Then txtEsB.Text=\"\"";
Debug.JustUpdateDeviceLine();
if (true) break;

case 18:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",_chkesb.runMethod(true,"getChecked"),parent.__c.getField(true,"False"))) { 
this.state = 20;
;}if (true) break;

case 20:
//C
this.state = 23;
_txtesb.runMethod(true,"setText",BA.ObjectToString(""));
if (true) break;

case 23:
//C
this.state = 24;
;
 BA.debugLineNum = 2193;BA.debugLine="If chkEsB.Checked Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 24:
//if
this.state = 33;
if (_chkesb.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 2194;BA.debugLine="Dim cboTD As ComboBox=clvIV.cboTipoDato";
Debug.JustUpdateDeviceLine();
_cbotd = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");
_cbotd = _clviv.getField(false,"cboTipoDato" /*RemoteObject*/ );Debug.locals.put("cboTD", _cbotd);Debug.locals.put("cboTD", _cbotd);
 BA.debugLineNum = 2195;BA.debugLine="If cboTD.Value=\"TEXT\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 27:
//if
this.state = 32;
if (RemoteObject.solveBoolean("=",_cbotd.runMethod(false,"getValue"),RemoteObject.createImmutable(("TEXT")))) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 32;
 BA.debugLineNum = 2196;BA.debugLine="txtEsB.Text=\"\"";
Debug.JustUpdateDeviceLine();
_txtesb.runMethod(true,"setText",BA.ObjectToString(""));
 if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 2198;BA.debugLine="txtEsB.Text=1";
Debug.JustUpdateDeviceLine();
_txtesb.runMethod(true,"setText",BA.NumberToString(1));
 if (true) break;

case 32:
//C
this.state = 33;
;
 if (true) break;

case 33:
//C
this.state = -1;
;
 BA.debugLineNum = 2201;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _chkboxesfecha_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkBoxEsFecha_CheckedChange (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2140);
if (RapidSub.canDelegate("chkboxesfecha_checkedchange")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","chkboxesfecha_checkedchange", __ref, _checked); return;}
ResumableSub_chkBoxEsFecha_CheckedChange rsub = new ResumableSub_chkBoxEsFecha_CheckedChange(null,__ref,_checked);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_chkBoxEsFecha_CheckedChange extends BA.ResumableSub {
public ResumableSub_chkBoxEsFecha_CheckedChange(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref,RemoteObject _checked) {
this.parent = parent;
this.__ref = __ref;
this._checked = _checked;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _checked;
RemoteObject _chkesf = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("chkBoxEsFecha_CheckedChange (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2140);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 2141;BA.debugLine="If CargandoDatos Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (__ref.getField(true,"_cargandodatos" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
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
 BA.debugLineNum = 2143;BA.debugLine="If CorrigiendoChkBoxEsFecha Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 10;
if (__ref.getField(true,"_corrigiendochkboxesfecha" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 2144;BA.debugLine="CorrigiendoChkBoxEsFecha=False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_corrigiendochkboxesfecha" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 2145;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 2148;BA.debugLine="Dim chkEsF As CheckBox=Sender";
Debug.JustUpdateDeviceLine();
_chkesf = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
_chkesf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.CheckboxWrapper"), parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("chkEsF", _chkesf);Debug.locals.put("chkEsF", _chkesf);
 BA.debugLineNum = 2149;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
Debug.JustUpdateDeviceLine();
_index = __ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _chkesf.getObject()));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 2150;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValue";
Debug.JustUpdateDeviceLine();
_clviv = (__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 2151;BA.debugLine="If Checked And clvIV.cboTipoDato.Value<>\"REAL\" An";
Debug.JustUpdateDeviceLine();
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean(".",_checked) && RemoteObject.solveBoolean("!",_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("REAL"))) && RemoteObject.solveBoolean("!",_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("INTEGER")))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 2152;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un tipo de";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Un tipo de dato="),_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(" no puede ser una fecha."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2153;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "chkboxesfecha_checkedchange"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 14;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2154;BA.debugLine="CorrigiendoChkBoxEsFecha=True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_corrigiendochkboxesfecha" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 2155;BA.debugLine="chkEsF.Checked=False";
Debug.JustUpdateDeviceLine();
_chkesf.runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 if (true) break;
;
 BA.debugLineNum = 2158;BA.debugLine="If Checked=False And clvIV.cboTipoControlFiltro.V";
Debug.JustUpdateDeviceLine();

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_checked,parent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoControlFiltro" /*RemoteObject*/ ).runMethod(false,"getValue"),(__ref.getField(true,"_tipocontrolfiltro_textfieldbutton" /*RemoteObject*/ )))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 2159;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Si el tipo";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Si el tipo de control filtro es = "),__ref.getField(true,"_tipocontrolfiltro_textfieldbutton" /*RemoteObject*/ ),RemoteObject.createImmutable(" , el campo tiene que ser tipo fecha. Si no lo es, deja primero el tipo control filtro en blanco."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2160;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "chkboxesfecha_checkedchange"), _msa);
this.state = 19;
return;
case 19:
//C
this.state = 17;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2161;BA.debugLine="CorrigiendoChkBoxEsFecha=True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_corrigiendochkboxesfecha" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 2162;BA.debugLine="chkEsF.Checked=True";
Debug.JustUpdateDeviceLine();
_chkesf.runMethod(true,"setChecked",parent.__c.getField(true,"True"));
 if (true) break;

case 17:
//C
this.state = -1;
;
 BA.debugLineNum = 2164;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _chkboxkeyid_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkboxKeyID_CheckedChange (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2203);
if (RapidSub.canDelegate("chkboxkeyid_checkedchange")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","chkboxkeyid_checkedchange", __ref, _checked); return;}
ResumableSub_chkboxKeyID_CheckedChange rsub = new ResumableSub_chkboxKeyID_CheckedChange(null,__ref,_checked);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_chkboxKeyID_CheckedChange extends BA.ResumableSub {
public ResumableSub_chkboxKeyID_CheckedChange(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref,RemoteObject _checked) {
this.parent = parent;
this.__ref = __ref;
this._checked = _checked;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _checked;
RemoteObject _chkkid = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _nombrecampokeyeliminada = RemoteObject.createImmutable("");
RemoteObject _keyideliminada = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("chkboxKeyID_CheckedChange (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2203);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 2204;BA.debugLine="If CargandoDatos Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (__ref.getField(true,"_cargandodatos" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
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
 BA.debugLineNum = 2206;BA.debugLine="If CorrigiendoChkBoxKeyID Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 10;
if (__ref.getField(true,"_corrigiendochkboxkeyid" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 2207;BA.debugLine="CorrigiendoChkBoxKeyID=False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_corrigiendochkboxkeyid" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 2208;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 2211;BA.debugLine="Dim chkKID As CheckBox=Sender";
Debug.JustUpdateDeviceLine();
_chkkid = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
_chkkid = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.CheckboxWrapper"), parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("chkKID", _chkkid);Debug.locals.put("chkKID", _chkkid);
 BA.debugLineNum = 2212;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
Debug.JustUpdateDeviceLine();
_index = __ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _chkkid.getObject()));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 2213;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValue";
Debug.JustUpdateDeviceLine();
_clviv = (__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 2214;BA.debugLine="If Checked Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 11:
//if
this.state = 28;
if (_checked.<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 27;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 2215;BA.debugLine="If clvIV.cboCampo.Value=\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("")))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 2216;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El nombre";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("El nombre del campo no puede estar vacío.")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2217;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "chkboxkeyid_checkedchange"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 17;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2218;BA.debugLine="CorrigiendoChkBoxKeyID=True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_corrigiendochkboxkeyid" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 2219;BA.debugLine="chkKID.Checked=False";
Debug.JustUpdateDeviceLine();
_chkkid.runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 BA.debugLineNum = 2220;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 2223;BA.debugLine="If Checked And clvIV.chkBoxCampoCalculado.Checke";
Debug.JustUpdateDeviceLine();

case 17:
//if
this.state = 20;
if (RemoteObject.solveBoolean(".",_checked) && RemoteObject.solveBoolean(".",_clviv.getField(false,"chkBoxCampoCalculado" /*RemoteObject*/ ).runMethod(true,"getChecked"))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 2224;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un campo c";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Un campo calculado no puede pertenecer a la clave principal.")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2225;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "chkboxkeyid_checkedchange"), _msa);
this.state = 30;
return;
case 30:
//C
this.state = 20;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2226;BA.debugLine="CorrigiendoChkBoxKeyID=True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_corrigiendochkboxkeyid" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 2227;BA.debugLine="chkKID.Checked=False";
Debug.JustUpdateDeviceLine();
_chkkid.runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 BA.debugLineNum = 2228;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 2232;BA.debugLine="If lstPrimaryKey.IndexOf(clvIV.cboCampo.Value)>-";
Debug.JustUpdateDeviceLine();

case 20:
//if
this.state = 25;
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_lstprimarykey" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)(_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue"))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 25;
 BA.debugLineNum = 2233;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El campo \"";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("El campo "),_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(" ya pertenece a la clave principal."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2234;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "chkboxkeyid_checkedchange"), _msa);
this.state = 31;
return;
case 31:
//C
this.state = 25;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2235;BA.debugLine="CorrigiendoChkBoxKeyID=True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_corrigiendochkboxkeyid" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 2236;BA.debugLine="chkKID.Checked=False";
Debug.JustUpdateDeviceLine();
_chkkid.runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 2238;BA.debugLine="lstPrimaryKey.Add(clvIV.cboCampo.Value)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lstprimarykey" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue")));
 BA.debugLineNum = 2239;BA.debugLine="clvIV.lblOrdenKeyID.Text=lstPrimaryKey.Size";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblOrdenKeyID" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(__ref.getField(false,"_lstprimarykey" /*RemoteObject*/ ).runMethod(true,"getSize")));
 if (true) break;

case 25:
//C
this.state = 28;
;
 if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 2243;BA.debugLine="Dim NombreCampoKeyEliminada As String=clvIV.cboC";
Debug.JustUpdateDeviceLine();
_nombrecampokeyeliminada = BA.ObjectToString(_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue"));Debug.locals.put("NombreCampoKeyEliminada", _nombrecampokeyeliminada);Debug.locals.put("NombreCampoKeyEliminada", _nombrecampokeyeliminada);
 BA.debugLineNum = 2244;BA.debugLine="lstPrimaryKey.RemoveAt(lstPrimaryKey.IndexOf(Nom";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lstprimarykey" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(__ref.getField(false,"_lstprimarykey" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_nombrecampokeyeliminada)))));
 BA.debugLineNum = 2245;BA.debugLine="Dim KeyIDEliminada As Int=clvIV.lblOrdenKeyID.Te";
Debug.JustUpdateDeviceLine();
_keyideliminada = BA.numberCast(int.class, _clviv.getField(false,"lblOrdenKeyID" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("KeyIDEliminada", _keyideliminada);Debug.locals.put("KeyIDEliminada", _keyideliminada);
 BA.debugLineNum = 2246;BA.debugLine="clvIV.lblOrdenKeyID.Text=0";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblOrdenKeyID" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 2247;BA.debugLine="RecalcularOrdenKeyID(KeyIDEliminada)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_recalcularordenkeyid" /*RemoteObject*/ ,(Object)(_keyideliminada));
 if (true) break;

case 28:
//C
this.state = -1;
;
 BA.debugLineNum = 2250;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private version As Float = 0.01";
jamtableclvcamposbuilder._version = BA.numberCast(float.class, 0.01);__ref.setField("_version",jamtableclvcamposbuilder._version);
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
jamtableclvcamposbuilder._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",jamtableclvcamposbuilder._fx);
 //BA.debugLineNum = 8;BA.debugLine="Private fx As JFX";
jamtableclvcamposbuilder._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",jamtableclvcamposbuilder._fx);
 //BA.debugLineNum = 9;BA.debugLine="Private frm As Form";
jamtableclvcamposbuilder._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",jamtableclvcamposbuilder._frm);
 //BA.debugLineNum = 10;BA.debugLine="Private clvListaCampos As CustomListView";
jamtableclvcamposbuilder._clvlistacampos = RemoteObject.createNew ("b4j.example.customlistview");__ref.setField("_clvlistacampos",jamtableclvcamposbuilder._clvlistacampos);
 //BA.debugLineNum = 11;BA.debugLine="Private Dialog As B4XDialog";
jamtableclvcamposbuilder._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",jamtableclvcamposbuilder._dialog);
 //BA.debugLineNum = 12;BA.debugLine="Private xui As XUI";
jamtableclvcamposbuilder._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",jamtableclvcamposbuilder._xui);
 //BA.debugLineNum = 13;BA.debugLine="Private dragger As jamTableCLVCLVDragger";
jamtableclvcamposbuilder._dragger = RemoteObject.createNew ("b4j.docU.jamtableclvclvdragger");__ref.setField("_dragger",jamtableclvcamposbuilder._dragger);
 //BA.debugLineNum = 14;BA.debugLine="Private FileChooser As FileChooser";
jamtableclvcamposbuilder._filechooser = RemoteObject.createNew ("anywheresoftware.b4j.objects.FileChooserWrapper");__ref.setField("_filechooser",jamtableclvcamposbuilder._filechooser);
 //BA.debugLineNum = 15;BA.debugLine="Private CurrentFile As String";
jamtableclvcamposbuilder._currentfile = RemoteObject.createImmutable("");__ref.setField("_currentfile",jamtableclvcamposbuilder._currentfile);
 //BA.debugLineNum = 16;BA.debugLine="Private CurrentFileString As String";
jamtableclvcamposbuilder._currentfilestring = RemoteObject.createImmutable("");__ref.setField("_currentfilestring",jamtableclvcamposbuilder._currentfilestring);
 //BA.debugLineNum = 19;BA.debugLine="Private MenuBar1 As MenuBar";
jamtableclvcamposbuilder._menubar1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper");__ref.setField("_menubar1",jamtableclvcamposbuilder._menubar1);
 //BA.debugLineNum = 21;BA.debugLine="Private cmbTheme As ComboBox";
jamtableclvcamposbuilder._cmbtheme = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");__ref.setField("_cmbtheme",jamtableclvcamposbuilder._cmbtheme);
 //BA.debugLineNum = 23;BA.debugLine="Private txtID As TextField";
jamtableclvcamposbuilder._txtid = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtid",jamtableclvcamposbuilder._txtid);
 //BA.debugLineNum = 24;BA.debugLine="Private cboCampo As ComboBox";
jamtableclvcamposbuilder._cbocampo = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");__ref.setField("_cbocampo",jamtableclvcamposbuilder._cbocampo);
 //BA.debugLineNum = 25;BA.debugLine="Private txtAliasCampo As TextField";
jamtableclvcamposbuilder._txtaliascampo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtaliascampo",jamtableclvcamposbuilder._txtaliascampo);
 //BA.debugLineNum = 26;BA.debugLine="Private cboTipoDato As ComboBox";
jamtableclvcamposbuilder._cbotipodato = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");__ref.setField("_cbotipodato",jamtableclvcamposbuilder._cbotipodato);
 //BA.debugLineNum = 28;BA.debugLine="Private chkBoxEsFecha As CheckBox";
jamtableclvcamposbuilder._chkboxesfecha = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");__ref.setField("_chkboxesfecha",jamtableclvcamposbuilder._chkboxesfecha);
 //BA.debugLineNum = 29;BA.debugLine="Private chkBoxCampoCalculado As CheckBox";
jamtableclvcamposbuilder._chkboxcampocalculado = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");__ref.setField("_chkboxcampocalculado",jamtableclvcamposbuilder._chkboxcampocalculado);
 //BA.debugLineNum = 34;BA.debugLine="Private cboTipoControlFiltro As ComboBox";
jamtableclvcamposbuilder._cbotipocontrolfiltro = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");__ref.setField("_cbotipocontrolfiltro",jamtableclvcamposbuilder._cbotipocontrolfiltro);
 //BA.debugLineNum = 35;BA.debugLine="Private chkboxKeyID As CheckBox";
jamtableclvcamposbuilder._chkboxkeyid = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");__ref.setField("_chkboxkeyid",jamtableclvcamposbuilder._chkboxkeyid);
 //BA.debugLineNum = 36;BA.debugLine="Private lblOrdenKeyID As Label";
jamtableclvcamposbuilder._lblordenkeyid = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblordenkeyid",jamtableclvcamposbuilder._lblordenkeyid);
 //BA.debugLineNum = 37;BA.debugLine="Private chkBoxNoNulo As CheckBox";
jamtableclvcamposbuilder._chkboxnonulo = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");__ref.setField("_chkboxnonulo",jamtableclvcamposbuilder._chkboxnonulo);
 //BA.debugLineNum = 38;BA.debugLine="Private chkBoxConValorDefecto As CheckBox";
jamtableclvcamposbuilder._chkboxconvalordefecto = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");__ref.setField("_chkboxconvalordefecto",jamtableclvcamposbuilder._chkboxconvalordefecto);
 //BA.debugLineNum = 39;BA.debugLine="Private txtValorDefecto As TextField";
jamtableclvcamposbuilder._txtvalordefecto = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtvalordefecto",jamtableclvcamposbuilder._txtvalordefecto);
 //BA.debugLineNum = 46;BA.debugLine="Private chkBoxEsBooleano As CheckBox";
jamtableclvcamposbuilder._chkboxesbooleano = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");__ref.setField("_chkboxesbooleano",jamtableclvcamposbuilder._chkboxesbooleano);
 //BA.debugLineNum = 47;BA.debugLine="Private txtValorTrueCampoBooleano As TextField";
jamtableclvcamposbuilder._txtvalortruecampobooleano = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtvalortruecampobooleano",jamtableclvcamposbuilder._txtvalortruecampobooleano);
 //BA.debugLineNum = 58;BA.debugLine="Type clvJamTableCVLCamposBuilderItemValue(txtID A";
;
 //BA.debugLineNum = 64;BA.debugLine="Type TipoOrigenDatosJamTableCLV (TipoOrigenDatos";
;
 //BA.debugLineNum = 66;BA.debugLine="Public TipoControlFiltro_TextField, TipoControlFi";
jamtableclvcamposbuilder._tipocontrolfiltro_textfield = RemoteObject.createImmutable("");__ref.setField("_tipocontrolfiltro_textfield",jamtableclvcamposbuilder._tipocontrolfiltro_textfield);
jamtableclvcamposbuilder._tipocontrolfiltro_combobox = RemoteObject.createImmutable("");__ref.setField("_tipocontrolfiltro_combobox",jamtableclvcamposbuilder._tipocontrolfiltro_combobox);
jamtableclvcamposbuilder._tipocontrolfiltro_checkbox = RemoteObject.createImmutable("");__ref.setField("_tipocontrolfiltro_checkbox",jamtableclvcamposbuilder._tipocontrolfiltro_checkbox);
jamtableclvcamposbuilder._tipocontrolfiltro_textfieldbutton = RemoteObject.createImmutable("");__ref.setField("_tipocontrolfiltro_textfieldbutton",jamtableclvcamposbuilder._tipocontrolfiltro_textfieldbutton);
 //BA.debugLineNum = 67;BA.debugLine="TipoControlFiltro_TextField = \"TextField\"";
__ref.setField ("_tipocontrolfiltro_textfield" /*RemoteObject*/ ,BA.ObjectToString("TextField"));
 //BA.debugLineNum = 68;BA.debugLine="TipoControlFiltro_ComboBox = \"ComboBox\"";
__ref.setField ("_tipocontrolfiltro_combobox" /*RemoteObject*/ ,BA.ObjectToString("ComboBox"));
 //BA.debugLineNum = 69;BA.debugLine="TipoControlFiltro_CheckBox = \"CheckBox\"";
__ref.setField ("_tipocontrolfiltro_checkbox" /*RemoteObject*/ ,BA.ObjectToString("CheckBox"));
 //BA.debugLineNum = 70;BA.debugLine="TipoControlFiltro_TextFieldButton = \"TextFieldBtn";
__ref.setField ("_tipocontrolfiltro_textfieldbutton" /*RemoteObject*/ ,BA.ObjectToString("TextFieldBtn"));
 //BA.debugLineNum = 73;BA.debugLine="Private CargandoDatos As Boolean";
jamtableclvcamposbuilder._cargandodatos = RemoteObject.createImmutable(false);__ref.setField("_cargandodatos",jamtableclvcamposbuilder._cargandodatos);
 //BA.debugLineNum = 75;BA.debugLine="Private btnCargarListaCamposQuerySQL As Button";
jamtableclvcamposbuilder._btncargarlistacamposquerysql = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btncargarlistacamposquerysql",jamtableclvcamposbuilder._btncargarlistacamposquerysql);
 //BA.debugLineNum = 78;BA.debugLine="Private btnCamposToText As Button";
jamtableclvcamposbuilder._btncampostotext = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btncampostotext",jamtableclvcamposbuilder._btncampostotext);
 //BA.debugLineNum = 80;BA.debugLine="Private btnTextToCampos As Button";
jamtableclvcamposbuilder._btntexttocampos = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btntexttocampos",jamtableclvcamposbuilder._btntexttocampos);
 //BA.debugLineNum = 81;BA.debugLine="Private lblTitleCampo As Label";
jamtableclvcamposbuilder._lbltitlecampo = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltitlecampo",jamtableclvcamposbuilder._lbltitlecampo);
 //BA.debugLineNum = 82;BA.debugLine="Private lblTitleEncabezado As Label";
jamtableclvcamposbuilder._lbltitleencabezado = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltitleencabezado",jamtableclvcamposbuilder._lbltitleencabezado);
 //BA.debugLineNum = 83;BA.debugLine="Private lblTitleTipoDato As Label";
jamtableclvcamposbuilder._lbltitletipodato = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltitletipodato",jamtableclvcamposbuilder._lbltitletipodato);
 //BA.debugLineNum = 84;BA.debugLine="Private lblInfo As Label";
jamtableclvcamposbuilder._lblinfo = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblinfo",jamtableclvcamposbuilder._lblinfo);
 //BA.debugLineNum = 86;BA.debugLine="Private ColActualCLV, Col1, Col2 As Int";
jamtableclvcamposbuilder._colactualclv = RemoteObject.createImmutable(0);__ref.setField("_colactualclv",jamtableclvcamposbuilder._colactualclv);
jamtableclvcamposbuilder._col1 = RemoteObject.createImmutable(0);__ref.setField("_col1",jamtableclvcamposbuilder._col1);
jamtableclvcamposbuilder._col2 = RemoteObject.createImmutable(0);__ref.setField("_col2",jamtableclvcamposbuilder._col2);
 //BA.debugLineNum = 88;BA.debugLine="Private prefDialog As PreferencesDialog";
jamtableclvcamposbuilder._prefdialog = RemoteObject.createNew ("b4j.docU.preferencesdialog");__ref.setField("_prefdialog",jamtableclvcamposbuilder._prefdialog);
 //BA.debugLineNum = 90;BA.debugLine="Private txtIpJRDC As TextField";
jamtableclvcamposbuilder._txtipjrdc = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtipjrdc",jamtableclvcamposbuilder._txtipjrdc);
 //BA.debugLineNum = 91;BA.debugLine="Private txtPuertoJRDC As TextField";
jamtableclvcamposbuilder._txtpuertojrdc = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtpuertojrdc",jamtableclvcamposbuilder._txtpuertojrdc);
 //BA.debugLineNum = 92;BA.debugLine="Private txtComandoJRDC As TextField";
jamtableclvcamposbuilder._txtcomandojrdc = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcomandojrdc",jamtableclvcamposbuilder._txtcomandojrdc);
 //BA.debugLineNum = 93;BA.debugLine="Private txtParametrosJRDC As TextField";
jamtableclvcamposbuilder._txtparametrosjrdc = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtparametrosjrdc",jamtableclvcamposbuilder._txtparametrosjrdc);
 //BA.debugLineNum = 95;BA.debugLine="Private txtTipoOrigenDatos As TextField";
jamtableclvcamposbuilder._txttipoorigendatos = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txttipoorigendatos",jamtableclvcamposbuilder._txttipoorigendatos);
 //BA.debugLineNum = 96;BA.debugLine="Private pnlOrigenSQL As Pane";
jamtableclvcamposbuilder._pnlorigensql = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_pnlorigensql",jamtableclvcamposbuilder._pnlorigensql);
 //BA.debugLineNum = 97;BA.debugLine="Private lblTitleTipoOrigenDatos As Label";
jamtableclvcamposbuilder._lbltitletipoorigendatos = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltitletipoorigendatos",jamtableclvcamposbuilder._lbltitletipoorigendatos);
 //BA.debugLineNum = 98;BA.debugLine="Private lblTitleIpJRDC As Label";
jamtableclvcamposbuilder._lbltitleipjrdc = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltitleipjrdc",jamtableclvcamposbuilder._lbltitleipjrdc);
 //BA.debugLineNum = 99;BA.debugLine="Private lblTitlePuertoJRDC As Label";
jamtableclvcamposbuilder._lbltitlepuertojrdc = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltitlepuertojrdc",jamtableclvcamposbuilder._lbltitlepuertojrdc);
 //BA.debugLineNum = 100;BA.debugLine="Private lblTitleComandoJRDC As Label";
jamtableclvcamposbuilder._lbltitlecomandojrdc = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltitlecomandojrdc",jamtableclvcamposbuilder._lbltitlecomandojrdc);
 //BA.debugLineNum = 101;BA.debugLine="Private lblTitleParametrosJRDC As Label";
jamtableclvcamposbuilder._lbltitleparametrosjrdc = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltitleparametrosjrdc",jamtableclvcamposbuilder._lbltitleparametrosjrdc);
 //BA.debugLineNum = 103;BA.debugLine="Public DatosOrigenDatos As TipoOrigenDatos";
jamtableclvcamposbuilder._datosorigendatos = RemoteObject.createNew ("b4j.docU.jamtableviewcamposbuilder._tipoorigendatos");__ref.setField("_datosorigendatos",jamtableclvcamposbuilder._datosorigendatos);
 //BA.debugLineNum = 104;BA.debugLine="Private FechaUltimaModificacion As Long";
jamtableclvcamposbuilder._fechaultimamodificacion = RemoteObject.createImmutable(0L);__ref.setField("_fechaultimamodificacion",jamtableclvcamposbuilder._fechaultimamodificacion);
 //BA.debugLineNum = 105;BA.debugLine="Private btnEditarOrigenJRDC As Button";
jamtableclvcamposbuilder._btneditarorigenjrdc = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btneditarorigenjrdc",jamtableclvcamposbuilder._btneditarorigenjrdc);
 //BA.debugLineNum = 107;BA.debugLine="Private lstPrimaryKey As List";
jamtableclvcamposbuilder._lstprimarykey = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstprimarykey",jamtableclvcamposbuilder._lstprimarykey);
 //BA.debugLineNum = 108;BA.debugLine="Private CorrigiendoChkBoxEsFecha, CorrigiendoChkB";
jamtableclvcamposbuilder._corrigiendochkboxesfecha = RemoteObject.createImmutable(false);__ref.setField("_corrigiendochkboxesfecha",jamtableclvcamposbuilder._corrigiendochkboxesfecha);
jamtableclvcamposbuilder._corrigiendochkboxkeyid = RemoteObject.createImmutable(false);__ref.setField("_corrigiendochkboxkeyid",jamtableclvcamposbuilder._corrigiendochkboxkeyid);
jamtableclvcamposbuilder._corrigiendochkboxesbooleano = RemoteObject.createImmutable(false);__ref.setField("_corrigiendochkboxesbooleano",jamtableclvcamposbuilder._corrigiendochkboxesbooleano);
 //BA.debugLineNum = 111;BA.debugLine="Private btnValoresEstiloDefecto As Button";
jamtableclvcamposbuilder._btnvaloresestilodefecto = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnvaloresestilodefecto",jamtableclvcamposbuilder._btnvaloresestilodefecto);
 //BA.debugLineNum = 112;BA.debugLine="Private btnValoresEstiloDefectoTodos As Button";
jamtableclvcamposbuilder._btnvaloresestilodefectotodos = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnvaloresestilodefectotodos",jamtableclvcamposbuilder._btnvaloresestilodefectotodos);
 //BA.debugLineNum = 114;BA.debugLine="Private lblColorFondoEncabezados As B4XView";
jamtableclvcamposbuilder._lblcolorfondoencabezados = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblcolorfondoencabezados",jamtableclvcamposbuilder._lblcolorfondoencabezados);
 //BA.debugLineNum = 115;BA.debugLine="Private lblColorTextoEncabezados As B4XView";
jamtableclvcamposbuilder._lblcolortextoencabezados = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblcolortextoencabezados",jamtableclvcamposbuilder._lblcolortextoencabezados);
 //BA.debugLineNum = 117;BA.debugLine="Private txtRGBColorFondoEncabezados As B4XView";
jamtableclvcamposbuilder._txtrgbcolorfondoencabezados = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtrgbcolorfondoencabezados",jamtableclvcamposbuilder._txtrgbcolorfondoencabezados);
 //BA.debugLineNum = 119;BA.debugLine="Private txtRGBColorTextoEncabezados As B4XView";
jamtableclvcamposbuilder._txtrgbcolortextoencabezados = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtrgbcolortextoencabezados",jamtableclvcamposbuilder._txtrgbcolortextoencabezados);
 //BA.debugLineNum = 120;BA.debugLine="Private lblResetColorFondoEncabezados As B4XView";
jamtableclvcamposbuilder._lblresetcolorfondoencabezados = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblresetcolorfondoencabezados",jamtableclvcamposbuilder._lblresetcolorfondoencabezados);
 //BA.debugLineNum = 121;BA.debugLine="Private lblResetColorTextoEncabezados As B4XView";
jamtableclvcamposbuilder._lblresetcolortextoencabezados = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblresetcolortextoencabezados",jamtableclvcamposbuilder._lblresetcolortextoencabezados);
 //BA.debugLineNum = 124;BA.debugLine="Private lblColorFondoPanelInfo As B4XView";
jamtableclvcamposbuilder._lblcolorfondopanelinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblcolorfondopanelinfo",jamtableclvcamposbuilder._lblcolorfondopanelinfo);
 //BA.debugLineNum = 125;BA.debugLine="Private lblColorTextoPanelInfo As B4XView";
jamtableclvcamposbuilder._lblcolortextopanelinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblcolortextopanelinfo",jamtableclvcamposbuilder._lblcolortextopanelinfo);
 //BA.debugLineNum = 127;BA.debugLine="Private txtRGBColorFondoPanelInfo As B4XView";
jamtableclvcamposbuilder._txtrgbcolorfondopanelinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtrgbcolorfondopanelinfo",jamtableclvcamposbuilder._txtrgbcolorfondopanelinfo);
 //BA.debugLineNum = 128;BA.debugLine="Private lblResetColorFondoPanelInfo As B4XView";
jamtableclvcamposbuilder._lblresetcolorfondopanelinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblresetcolorfondopanelinfo",jamtableclvcamposbuilder._lblresetcolorfondopanelinfo);
 //BA.debugLineNum = 129;BA.debugLine="Private txtRGBColorTextoPanelInfo As B4XView";
jamtableclvcamposbuilder._txtrgbcolortextopanelinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtrgbcolortextopanelinfo",jamtableclvcamposbuilder._txtrgbcolortextopanelinfo);
 //BA.debugLineNum = 130;BA.debugLine="Private lblResetColorTextoPanelInfo As B4XView";
jamtableclvcamposbuilder._lblresetcolortextopanelinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblresetcolortextopanelinfo",jamtableclvcamposbuilder._lblresetcolortextopanelinfo);
 //BA.debugLineNum = 142;BA.debugLine="Private lblColorFondoFilasImpares As B4XView";
jamtableclvcamposbuilder._lblcolorfondofilasimpares = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblcolorfondofilasimpares",jamtableclvcamposbuilder._lblcolorfondofilasimpares);
 //BA.debugLineNum = 146;BA.debugLine="Private lblColorFondoFilasPares As B4XView";
jamtableclvcamposbuilder._lblcolorfondofilaspares = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblcolorfondofilaspares",jamtableclvcamposbuilder._lblcolorfondofilaspares);
 //BA.debugLineNum = 148;BA.debugLine="Private txtRGBColorFondoFilasImpares As B4XView";
jamtableclvcamposbuilder._txtrgbcolorfondofilasimpares = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtrgbcolorfondofilasimpares",jamtableclvcamposbuilder._txtrgbcolorfondofilasimpares);
 //BA.debugLineNum = 149;BA.debugLine="Private txtRGBColorFondoFilasPares As B4XView";
jamtableclvcamposbuilder._txtrgbcolorfondofilaspares = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtrgbcolorfondofilaspares",jamtableclvcamposbuilder._txtrgbcolorfondofilaspares);
 //BA.debugLineNum = 150;BA.debugLine="Private ResetColorFondoFilasImpares As Label";
jamtableclvcamposbuilder._resetcolorfondofilasimpares = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_resetcolorfondofilasimpares",jamtableclvcamposbuilder._resetcolorfondofilasimpares);
 //BA.debugLineNum = 151;BA.debugLine="Private lblResetColorFondoFilasPares As Label";
jamtableclvcamposbuilder._lblresetcolorfondofilaspares = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblresetcolorfondofilaspares",jamtableclvcamposbuilder._lblresetcolorfondofilaspares);
 //BA.debugLineNum = 153;BA.debugLine="Private B4XPlusMinusAnchoBordeItems As B4XPlusMin";
jamtableclvcamposbuilder._b4xplusminusanchobordeitems = RemoteObject.createNew ("b4j.docU.b4xplusminus");__ref.setField("_b4xplusminusanchobordeitems",jamtableclvcamposbuilder._b4xplusminusanchobordeitems);
 //BA.debugLineNum = 154;BA.debugLine="Private lblColorBordeItems As B4XView";
jamtableclvcamposbuilder._lblcolorbordeitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblcolorbordeitems",jamtableclvcamposbuilder._lblcolorbordeitems);
 //BA.debugLineNum = 155;BA.debugLine="Private txtRGBColorBordeItems As TextField";
jamtableclvcamposbuilder._txtrgbcolorbordeitems = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtrgbcolorbordeitems",jamtableclvcamposbuilder._txtrgbcolorbordeitems);
 //BA.debugLineNum = 156;BA.debugLine="Private lblResetColorBordeItems As B4XView";
jamtableclvcamposbuilder._lblresetcolorbordeitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblresetcolorbordeitems",jamtableclvcamposbuilder._lblresetcolorbordeitems);
 //BA.debugLineNum = 159;BA.debugLine="Private BCColorPickerjamTableView As BCColorPicke";
jamtableclvcamposbuilder._bccolorpickerjamtableview = RemoteObject.createNew ("b4j.docU.bccolorpicker");__ref.setField("_bccolorpickerjamtableview",jamtableclvcamposbuilder._bccolorpickerjamtableview);
 //BA.debugLineNum = 164;BA.debugLine="Private lblColorFondoEncabezadoColumna As B4XView";
jamtableclvcamposbuilder._lblcolorfondoencabezadocolumna = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblcolorfondoencabezadocolumna",jamtableclvcamposbuilder._lblcolorfondoencabezadocolumna);
 //BA.debugLineNum = 165;BA.debugLine="Private txtRGBColorFondoEncabezadoColumna As B4XV";
jamtableclvcamposbuilder._txtrgbcolorfondoencabezadocolumna = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtrgbcolorfondoencabezadocolumna",jamtableclvcamposbuilder._txtrgbcolorfondoencabezadocolumna);
 //BA.debugLineNum = 166;BA.debugLine="Private lblResetColorFondoEncabezadoColumna As B4";
jamtableclvcamposbuilder._lblresetcolorfondoencabezadocolumna = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblresetcolorfondoencabezadocolumna",jamtableclvcamposbuilder._lblresetcolorfondoencabezadocolumna);
 //BA.debugLineNum = 167;BA.debugLine="Private lblColorTextoEncabezadoColumna As B4XView";
jamtableclvcamposbuilder._lblcolortextoencabezadocolumna = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblcolortextoencabezadocolumna",jamtableclvcamposbuilder._lblcolortextoencabezadocolumna);
 //BA.debugLineNum = 168;BA.debugLine="Private txtRGBColorTextoEncabezadoColumna As B4XV";
jamtableclvcamposbuilder._txtrgbcolortextoencabezadocolumna = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtrgbcolortextoencabezadocolumna",jamtableclvcamposbuilder._txtrgbcolortextoencabezadocolumna);
 //BA.debugLineNum = 169;BA.debugLine="Private lblResetColorTextoEncabezadoColumna As B4";
jamtableclvcamposbuilder._lblresetcolortextoencabezadocolumna = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblresetcolortextoencabezadocolumna",jamtableclvcamposbuilder._lblresetcolortextoencabezadocolumna);
 //BA.debugLineNum = 179;BA.debugLine="Private btnBuscarAliasCampo As B4XView";
jamtableclvcamposbuilder._btnbuscaraliascampo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnbuscaraliascampo",jamtableclvcamposbuilder._btnbuscaraliascampo);
 //BA.debugLineNum = 181;BA.debugLine="Private mModoSnap As Boolean=True  ' true: scroll";
jamtableclvcamposbuilder._mmodosnap = jamtableclvcamposbuilder.__c.getField(true,"True");__ref.setField("_mmodosnap",jamtableclvcamposbuilder._mmodosnap);
 //BA.debugLineNum = 182;BA.debugLine="Private OffsetAnterior As Int=1";
jamtableclvcamposbuilder._offsetanterior = BA.numberCast(int.class, 1);__ref.setField("_offsetanterior",jamtableclvcamposbuilder._offsetanterior);
 //BA.debugLineNum = 183;BA.debugLine="Private PrimerPanelVisibleAnterior As Int";
jamtableclvcamposbuilder._primerpanelvisibleanterior = RemoteObject.createImmutable(0);__ref.setField("_primerpanelvisibleanterior",jamtableclvcamposbuilder._primerpanelvisibleanterior);
 //BA.debugLineNum = 184;BA.debugLine="Private ScrollingDown As Boolean";
jamtableclvcamposbuilder._scrollingdown = RemoteObject.createImmutable(false);__ref.setField("_scrollingdown",jamtableclvcamposbuilder._scrollingdown);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clvlistacampos_scrollchanged(RemoteObject __ref,RemoteObject _offset) throws Exception{
try {
		Debug.PushSubsStack("clvListaCampos_ScrollChanged (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3672);
if (RapidSub.canDelegate("clvlistacampos_scrollchanged")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","clvlistacampos_scrollchanged", __ref, _offset);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _item = RemoteObject.declareNull("b4j.example.customlistview._clvitem");
RemoteObject _visiblepart = RemoteObject.createImmutable(0);
Debug.locals.put("Offset", _offset);
 BA.debugLineNum = 3672;BA.debugLine="Sub clvListaCampos_ScrollChanged (Offset As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3673;BA.debugLine="If mModoSnap=False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mmodosnap" /*RemoteObject*/ ),jamtableclvcamposbuilder.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 3677;BA.debugLine="Log(\"clvDatos_ScrollChanged, Offset:\" & Offset)";
Debug.JustUpdateDeviceLine();
jamtableclvcamposbuilder.__c.runVoidMethod ("LogImpl","9180944901",RemoteObject.concat(RemoteObject.createImmutable("clvDatos_ScrollChanged, Offset:"),_offset),0);
 BA.debugLineNum = 3680;BA.debugLine="If Offset=OffsetAnterior Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_offset,BA.numberCast(double.class, __ref.getField(true,"_offsetanterior" /*RemoteObject*/ )))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 3682;BA.debugLine="If Offset>OffsetAnterior Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_offset,BA.numberCast(double.class, __ref.getField(true,"_offsetanterior" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 3683;BA.debugLine="ScrollingDown=True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_scrollingdown" /*RemoteObject*/ ,jamtableclvcamposbuilder.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 3685;BA.debugLine="ScrollingDown=False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_scrollingdown" /*RemoteObject*/ ,jamtableclvcamposbuilder.__c.getField(true,"False"));
 };
 BA.debugLineNum = 3688;BA.debugLine="Dim i As Int = clvListaCampos.FirstVisibleIndex";
Debug.JustUpdateDeviceLine();
_i = __ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(true,"_getfirstvisibleindex");Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 3689;BA.debugLine="Dim item As CLVItem	 = clvListaCampos.GetRawListI";
Debug.JustUpdateDeviceLine();
_item = __ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(false,"_getrawlistitem",(Object)(_i));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 3690;BA.debugLine="Dim visiblepart As Int = item.Offset + item.Size";
Debug.JustUpdateDeviceLine();
_visiblepart = RemoteObject.solve(new RemoteObject[] {_item.getField(true,"Offset"),_item.getField(true,"Size"),_offset}, "+-",2, 1);Debug.locals.put("visiblepart", _visiblepart);Debug.locals.put("visiblepart", _visiblepart);
 BA.debugLineNum = 3692;BA.debugLine="If visiblepart<item.Size Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_visiblepart,BA.numberCast(double.class, _item.getField(true,"Size")))) { 
 BA.debugLineNum = 3693;BA.debugLine="If ScrollingDown Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_scrollingdown" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3695;BA.debugLine="clvListaCampos.JumpToItem(i+1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runVoidMethod ("_jumptoitem",(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)));
 }else {
 BA.debugLineNum = 3698;BA.debugLine="clvListaCampos.JumpToItem(i)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runVoidMethod ("_jumptoitem",(Object)(_i));
 };
 }else {
 BA.debugLineNum = 3701;BA.debugLine="OffsetAnterior=Offset";
Debug.JustUpdateDeviceLine();
__ref.setField ("_offsetanterior" /*RemoteObject*/ ,_offset);
 };
 BA.debugLineNum = 3703;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _colortohex(RemoteObject __ref,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("ColorToHex (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,395);
if (RapidSub.canDelegate("colortohex")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","colortohex", __ref, _clr);}
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 395;BA.debugLine="Private Sub ColorToHex(clr As Int) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 396;BA.debugLine="Dim bc As ByteConverter";
Debug.JustUpdateDeviceLine();
_bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 397;BA.debugLine="Return bc.HexFromBytes(bc.IntsToBytes(Array As In";
Debug.JustUpdateDeviceLine();
if (true) return _bc.runMethod(true,"HexFromBytes",(Object)(_bc.runMethod(false,"IntsToBytes",(Object)(RemoteObject.createNewArray("int",new int[] {1},new Object[] {_clr})))));
 BA.debugLineNum = 398;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _comparar2mapas(RemoteObject __ref,RemoteObject _map1,RemoteObject _map2) throws Exception{
try {
		Debug.PushSubsStack("Comparar2Mapas (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2725);
if (RapidSub.canDelegate("comparar2mapas")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","comparar2mapas", __ref, _map1, _map2);}
RemoteObject _flagallkeysok = RemoteObject.createImmutable(false);
RemoteObject _key1 = RemoteObject.createImmutable("");
RemoteObject _value1 = RemoteObject.createImmutable("");
RemoteObject _keyvaluesame = RemoteObject.createImmutable(false);
RemoteObject _value2 = RemoteObject.createImmutable("");
RemoteObject _key2 = RemoteObject.createImmutable("");
Debug.locals.put("Map1", _map1);
Debug.locals.put("Map2", _map2);
 BA.debugLineNum = 2725;BA.debugLine="Sub Comparar2Mapas(Map1 As Map, Map2 As Map) As Bo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2726;BA.debugLine="Dim FlagAllkeysOK As Boolean=True";
Debug.JustUpdateDeviceLine();
_flagallkeysok = jamtableclvcamposbuilder.__c.getField(true,"True");Debug.locals.put("FlagAllkeysOK", _flagallkeysok);Debug.locals.put("FlagAllkeysOK", _flagallkeysok);
 BA.debugLineNum = 2727;BA.debugLine="For Each Key1 As String In Map1.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = _map1.runMethod(false,"Keys");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_key1 = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("Key1", _key1);
Debug.locals.put("Key1", _key1);
 BA.debugLineNum = 2728;BA.debugLine="Dim Value1 As String = Map1.Get(Key1)";
Debug.JustUpdateDeviceLine();
_value1 = BA.ObjectToString(_map1.runMethod(false,"Get",(Object)((_key1))));Debug.locals.put("Value1", _value1);Debug.locals.put("Value1", _value1);
 BA.debugLineNum = 2729;BA.debugLine="Dim KeyValueSame As Boolean = False";
Debug.JustUpdateDeviceLine();
_keyvaluesame = jamtableclvcamposbuilder.__c.getField(true,"False");Debug.locals.put("KeyValueSame", _keyvaluesame);Debug.locals.put("KeyValueSame", _keyvaluesame);
 BA.debugLineNum = 2730;BA.debugLine="If Map2.ContainsKey(Key1) Then";
Debug.JustUpdateDeviceLine();
if (_map2.runMethod(true,"ContainsKey",(Object)((_key1))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2731;BA.debugLine="Dim Value2 As String = Map2.Get(Key1)";
Debug.JustUpdateDeviceLine();
_value2 = BA.ObjectToString(_map2.runMethod(false,"Get",(Object)((_key1))));Debug.locals.put("Value2", _value2);Debug.locals.put("Value2", _value2);
 BA.debugLineNum = 2732;BA.debugLine="KeyValueSame = Value1 = Value2";
Debug.JustUpdateDeviceLine();
_keyvaluesame = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_value1,_value2));Debug.locals.put("KeyValueSame", _keyvaluesame);
 BA.debugLineNum = 2733;BA.debugLine="If KeyValueSame = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_keyvaluesame,jamtableclvcamposbuilder.__c.getField(true,"False"))) { 
 BA.debugLineNum = 2734;BA.debugLine="Log($\"Key: ${Key1} is different\"$)";
Debug.JustUpdateDeviceLine();
jamtableclvcamposbuilder.__c.runVoidMethod ("LogImpl","9179503113",(RemoteObject.concat(RemoteObject.createImmutable("Key: "),jamtableclvcamposbuilder.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_key1))),RemoteObject.createImmutable(" is different"))),0);
 BA.debugLineNum = 2735;BA.debugLine="FlagAllkeysOK=False";
Debug.JustUpdateDeviceLine();
_flagallkeysok = jamtableclvcamposbuilder.__c.getField(true,"False");Debug.locals.put("FlagAllkeysOK", _flagallkeysok);
 };
 }else {
 BA.debugLineNum = 2738;BA.debugLine="Log($\"Key: ${Key1} is not in Map2\"$)";
Debug.JustUpdateDeviceLine();
jamtableclvcamposbuilder.__c.runVoidMethod ("LogImpl","9179503117",(RemoteObject.concat(RemoteObject.createImmutable("Key: "),jamtableclvcamposbuilder.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_key1))),RemoteObject.createImmutable(" is not in Map2"))),0);
 BA.debugLineNum = 2739;BA.debugLine="FlagAllkeysOK=False";
Debug.JustUpdateDeviceLine();
_flagallkeysok = jamtableclvcamposbuilder.__c.getField(true,"False");Debug.locals.put("FlagAllkeysOK", _flagallkeysok);
 };
 }
}Debug.locals.put("Key1", _key1);
;
 BA.debugLineNum = 2742;BA.debugLine="For Each Key2 As String In Map2.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group17 = _map2.runMethod(false,"Keys");
final int groupLen17 = group17.runMethod(true,"getSize").<Integer>get()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_key2 = BA.ObjectToString(group17.runMethod(false,"Get",index17));Debug.locals.put("Key2", _key2);
Debug.locals.put("Key2", _key2);
 BA.debugLineNum = 2743;BA.debugLine="Dim Value2 As String = Map2.Get(Key2)";
Debug.JustUpdateDeviceLine();
_value2 = BA.ObjectToString(_map2.runMethod(false,"Get",(Object)((_key2))));Debug.locals.put("Value2", _value2);Debug.locals.put("Value2", _value2);
 BA.debugLineNum = 2744;BA.debugLine="Dim KeyValueSame As Boolean = False";
Debug.JustUpdateDeviceLine();
_keyvaluesame = jamtableclvcamposbuilder.__c.getField(true,"False");Debug.locals.put("KeyValueSame", _keyvaluesame);Debug.locals.put("KeyValueSame", _keyvaluesame);
 BA.debugLineNum = 2745;BA.debugLine="If Map1.ContainsKey(Key2) Then";
Debug.JustUpdateDeviceLine();
if (_map1.runMethod(true,"ContainsKey",(Object)((_key2))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2746;BA.debugLine="Dim Value1 As String = Map1.Get(Key2)";
Debug.JustUpdateDeviceLine();
_value1 = BA.ObjectToString(_map1.runMethod(false,"Get",(Object)((_key2))));Debug.locals.put("Value1", _value1);Debug.locals.put("Value1", _value1);
 BA.debugLineNum = 2747;BA.debugLine="KeyValueSame = Value1 = Value2";
Debug.JustUpdateDeviceLine();
_keyvaluesame = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_value1,_value2));Debug.locals.put("KeyValueSame", _keyvaluesame);
 BA.debugLineNum = 2748;BA.debugLine="If KeyValueSame = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_keyvaluesame,jamtableclvcamposbuilder.__c.getField(true,"False"))) { 
 BA.debugLineNum = 2749;BA.debugLine="Log($\"Key: ${Key2} is different\"$)";
Debug.JustUpdateDeviceLine();
jamtableclvcamposbuilder.__c.runVoidMethod ("LogImpl","9179503128",(RemoteObject.concat(RemoteObject.createImmutable("Key: "),jamtableclvcamposbuilder.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_key2))),RemoteObject.createImmutable(" is different"))),0);
 BA.debugLineNum = 2750;BA.debugLine="FlagAllkeysOK=False";
Debug.JustUpdateDeviceLine();
_flagallkeysok = jamtableclvcamposbuilder.__c.getField(true,"False");Debug.locals.put("FlagAllkeysOK", _flagallkeysok);
 };
 }else {
 BA.debugLineNum = 2753;BA.debugLine="Log($\"Key: ${Key2} is not in Map1\"$)";
Debug.JustUpdateDeviceLine();
jamtableclvcamposbuilder.__c.runVoidMethod ("LogImpl","9179503132",(RemoteObject.concat(RemoteObject.createImmutable("Key: "),jamtableclvcamposbuilder.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_key2))),RemoteObject.createImmutable(" is not in Map1"))),0);
 BA.debugLineNum = 2754;BA.debugLine="FlagAllkeysOK=False";
Debug.JustUpdateDeviceLine();
_flagallkeysok = jamtableclvcamposbuilder.__c.getField(true,"False");Debug.locals.put("FlagAllkeysOK", _flagallkeysok);
 };
 }
}Debug.locals.put("Key2", _key2);
;
 BA.debugLineNum = 2757;BA.debugLine="Return FlagAllkeysOK";
Debug.JustUpdateDeviceLine();
if (true) return _flagallkeysok;
 BA.debugLineNum = 2758;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _configurarorigendatos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ConfigurarOrigenDatos (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1335);
if (RapidSub.canDelegate("configurarorigendatos")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","configurarorigendatos", __ref);}
ResumableSub_ConfigurarOrigenDatos rsub = new ResumableSub_ConfigurarOrigenDatos(null,__ref);
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
public static class ResumableSub_ConfigurarOrigenDatos extends BA.ResumableSub {
public ResumableSub_ConfigurarOrigenDatos(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _opttipoorigen = RemoteObject.declareNull("b4j.docU.b4xlisttemplate");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _btncancelar = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _tipoorigendatos = RemoteObject.createImmutable("");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _fcdb = RemoteObject.declareNull("anywheresoftware.b4j.objects.FileChooserWrapper");
RemoteObject _sfchdb = RemoteObject.createImmutable("");
RemoteObject _sqlorigendatos = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL");
RemoteObject _lsttablassqlite = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _tbname = RemoteObject.createImmutable("");
RemoteObject _dbquery = RemoteObject.createImmutable("");
RemoteObject _rsdb = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _dlg = RemoteObject.declareNull("b4j.docU.b4xdialog");
RemoteObject _b4xlist = RemoteObject.declareNull("b4j.docU.b4xlisttemplate");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _nombretabla = RemoteObject.createImmutable("");
RemoteObject _lstfields = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ConfigurarOrigenDatos (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1335);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1337;BA.debugLine="Dialog.Title=\"Selecciona tipo de origen de datos\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona tipo de origen de datos")));
 BA.debugLineNum = 1338;BA.debugLine="Dim OptTipoOrigen As B4XListTemplate";
Debug.JustUpdateDeviceLine();
_opttipoorigen = RemoteObject.createNew ("b4j.docU.b4xlisttemplate");Debug.locals.put("OptTipoOrigen", _opttipoorigen);
 BA.debugLineNum = 1339;BA.debugLine="OptTipoOrigen.Initialize";
Debug.JustUpdateDeviceLine();
_opttipoorigen.runClassMethod (b4j.docU.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 1341;BA.debugLine="OptTipoOrigen.Options=Array As String(\"JRDC Table";
Debug.JustUpdateDeviceLine();
_opttipoorigen.setField ("_options" /*RemoteObject*/ ,parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {4},new Object[] {BA.ObjectToString("JRDC Table"),BA.ObjectToString("JRDC Query"),BA.ObjectToString("Manual"),RemoteObject.createImmutable("SQLite Table")}))));
 BA.debugLineNum = 1342;BA.debugLine="OptTipoOrigen.AllowMultiSelection=False";
Debug.JustUpdateDeviceLine();
_opttipoorigen.setField ("_allowmultiselection" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 1343;BA.debugLine="Dim rs As ResumableSub=Dialog.ShowTemplate(OptTip";
Debug.JustUpdateDeviceLine();
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_opttipoorigen)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1344;BA.debugLine="Dim btnCancelar As B4XView=Dialog.GetButton(xui.D";
Debug.JustUpdateDeviceLine();
_btncancelar = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_btncancelar = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("btnCancelar", _btncancelar);Debug.locals.put("btnCancelar", _btncancelar);
 BA.debugLineNum = 1345;BA.debugLine="btnCancelar.Left=btnCancelar.Left-20dip";
Debug.JustUpdateDeviceLine();
_btncancelar.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_btncancelar.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 1346;BA.debugLine="btnCancelar.Width=btnCancelar.Width+20dip";
Debug.JustUpdateDeviceLine();
_btncancelar.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_btncancelar.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 1347;BA.debugLine="Wait For (rs) complete (result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "configurarorigendatos"), _rs);
this.state = 59;
return;
case 59:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 1348;BA.debugLine="If result=xui.DialogResponse_Positive Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 58;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}else {
this.state = 57;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1349;BA.debugLine="SetCurrentFile(\"\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_setcurrentfile" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1350;BA.debugLine="clvListaCampos.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 1351;BA.debugLine="lstPrimaryKey.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lstprimarykey" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1353;BA.debugLine="Dim TipoOrigenDatos As String=OptTipoOrigen.Sele";
Debug.JustUpdateDeviceLine();
_tipoorigendatos = _opttipoorigen.getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("TipoOrigenDatos", _tipoorigendatos);Debug.locals.put("TipoOrigenDatos", _tipoorigendatos);
 BA.debugLineNum = 1354;BA.debugLine="Select True";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//select
this.state = 55;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_tipoorigendatos,BA.ObjectToString("JRDC Table"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_tipoorigendatos,BA.ObjectToString("JRDC Query"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_tipoorigendatos,BA.ObjectToString("Manual"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_tipoorigendatos,BA.ObjectToString("SQLite Table"))))) {
case 0: {
this.state = 6;
if (true) break;
}
case 1: {
this.state = 14;
if (true) break;
}
case 2: {
this.state = 22;
if (true) break;
}
case 3: {
this.state = 24;
if (true) break;
}
}
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1356;BA.debugLine="prefDialog.Initialize(frm.RootPane,\"Datos JRDC";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefdialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.preferencesdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()),(Object)(RemoteObject.createImmutable(("Datos JRDC"))),(Object)(BA.numberCast(int.class, 800)),(Object)(BA.numberCast(int.class, 600)));
 BA.debugLineNum = 1358;BA.debugLine="prefDialog.LoadFromJson(File.ReadString(File.D";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefdialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.preferencesdialog.class, "_loadfromjson" /*RemoteObject*/ ,(Object)(parent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("OrigenDatosJRDCTable.json")))));
 BA.debugLineNum = 1359;BA.debugLine="Dim mData As Map=CreateMap(\"ComandoJRDC\": \"Inf";
Debug.JustUpdateDeviceLine();
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("ComandoJRDC")),(RemoteObject.createImmutable("InfoCamposTabla"))}));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 1360;BA.debugLine="Dim rSub As ResumableSub=prefDialog.ShowDialog";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_prefdialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.preferencesdialog.class, "_showdialog" /*RemoteObject*/ ,(Object)(_mdata),(Object)(RemoteObject.createImmutable(("OK"))),(Object)((RemoteObject.createImmutable("CANCEL"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 1361;BA.debugLine="Wait For (rSub) Complete (result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "configurarorigendatos"), _rsub);
this.state = 60;
return;
case 60:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 1363;BA.debugLine="If result <> xui.DialogResponse_Positive Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 12:
//C
this.state = 55;
;
 BA.debugLineNum = 1375;BA.debugLine="lblTitleIpJRDC.TextColor=fx.Colors.From32Bit(0";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbltitleipjrdc" /*RemoteObject*/ ).runMethod(false,"setTextColor",(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 1376;BA.debugLine="lblTitlePuertoJRDC.TextColor=fx.Colors.From32B";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbltitlepuertojrdc" /*RemoteObject*/ ).runMethod(false,"setTextColor",(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 1377;BA.debugLine="lblTitleComandoJRDC.TextColor=fx.Colors.From32";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbltitlecomandojrdc" /*RemoteObject*/ ).runMethod(false,"setTextColor",(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 1378;BA.debugLine="lblTitleParametrosJRDC.TextColor=fx.Colors.Fro";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbltitleparametrosjrdc" /*RemoteObject*/ ).runMethod(false,"setTextColor",(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 1379;BA.debugLine="txtIpJRDC.Enabled=True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtipjrdc" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1380;BA.debugLine="txtParametrosJRDC.Enabled=True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtparametrosjrdc" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1381;BA.debugLine="txtPuertoJRDC.Enabled=True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtpuertojrdc" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1382;BA.debugLine="txtComandoJRDC.Enabled=True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtcomandojrdc" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1383;BA.debugLine="mData.put(\"ParametrosJRDC\",mData.get(\"NombreTa";
Debug.JustUpdateDeviceLine();
_mdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ParametrosJRDC"))),(Object)(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreTabla"))))));
 BA.debugLineNum = 1385;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(TipoOri";
Debug.JustUpdateDeviceLine();
__ref.setField ("_datosorigendatos" /*RemoteObject*/ ,__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_createtipoorigendatos" /*RemoteObject*/ ,(Object)(_tipoorigendatos),(Object)(BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("IpJRDC"))),(Object)((RemoteObject.createImmutable("")))))),(Object)(BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("PuertoJRDC"))),(Object)((RemoteObject.createImmutable("")))))),(Object)(BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ComandoJRDC")))))),(Object)(BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ParametrosJRDC"))),(Object)((RemoteObject.createImmutable(""))))))));
 BA.debugLineNum = 1386;BA.debugLine="MostrarDatosOrigenDatos";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_mostrardatosorigendatos" /*RemoteObject*/ );
 BA.debugLineNum = 1387;BA.debugLine="CargandoDatos=True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_cargandodatos" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1388;BA.debugLine="CargaCamposJRDCTable(txtIpJRDC.Text,txtPuertoJ";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_cargacamposjrdctable" /*void*/ ,(Object)(__ref.getField(false,"_txtipjrdc" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtpuertojrdc" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(__ref.getField(false,"_txtcomandojrdc" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txtparametrosjrdc" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 1389;BA.debugLine="Wait For CargaCamposJRDCTable_Completed";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","cargacamposjrdctable_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "configurarorigendatos"), null);
this.state = 61;
return;
case 61:
//C
this.state = 55;
;
 BA.debugLineNum = 1390;BA.debugLine="CargandoDatos=False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_cargandodatos" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 1392;BA.debugLine="prefDialog.Initialize(frm.RootPane,\"Datos JRDC";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefdialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.preferencesdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()),(Object)(RemoteObject.createImmutable(("Datos JRDC"))),(Object)(BA.numberCast(int.class, 800)),(Object)(BA.numberCast(int.class, 600)));
 BA.debugLineNum = 1394;BA.debugLine="prefDialog.LoadFromJson(File.ReadString(File.D";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefdialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.preferencesdialog.class, "_loadfromjson" /*RemoteObject*/ ,(Object)(parent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("OrigenDatosJRDCQuery.json")))));
 BA.debugLineNum = 1395;BA.debugLine="Dim mData As Map=CreateMap()";
Debug.JustUpdateDeviceLine();
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 1396;BA.debugLine="Wait For (prefDialog.ShowDialog(mData, \"OK\", \"";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "configurarorigendatos"), __ref.getField(false,"_prefdialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.preferencesdialog.class, "_showdialog" /*RemoteObject*/ ,(Object)(_mdata),(Object)(RemoteObject.createImmutable(("OK"))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 62;
return;
case 62:
//C
this.state = 15;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 1397;BA.debugLine="If result <> xui.DialogResponse_Positive Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 15:
//if
this.state = 20;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 17;
;}if (true) break;

case 17:
//C
this.state = 20;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 20:
//C
this.state = 55;
;
 BA.debugLineNum = 1400;BA.debugLine="lblTitleIpJRDC.TextColor=fx.Colors.From32Bit(0";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbltitleipjrdc" /*RemoteObject*/ ).runMethod(false,"setTextColor",(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 1401;BA.debugLine="lblTitlePuertoJRDC.TextColor=fx.Colors.From32B";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbltitlepuertojrdc" /*RemoteObject*/ ).runMethod(false,"setTextColor",(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 1402;BA.debugLine="lblTitleComandoJRDC.TextColor=fx.Colors.From32";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbltitlecomandojrdc" /*RemoteObject*/ ).runMethod(false,"setTextColor",(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 1403;BA.debugLine="lblTitleParametrosJRDC.TextColor=fx.Colors.Fro";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbltitleparametrosjrdc" /*RemoteObject*/ ).runMethod(false,"setTextColor",(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 1404;BA.debugLine="txtIpJRDC.Enabled=True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtipjrdc" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1405;BA.debugLine="txtParametrosJRDC.Enabled=True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtparametrosjrdc" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1406;BA.debugLine="txtPuertoJRDC.Enabled=True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtpuertojrdc" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1407;BA.debugLine="txtComandoJRDC.Enabled=True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtcomandojrdc" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1409;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(TipoOri";
Debug.JustUpdateDeviceLine();
__ref.setField ("_datosorigendatos" /*RemoteObject*/ ,__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_createtipoorigendatos" /*RemoteObject*/ ,(Object)(_tipoorigendatos),(Object)(BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("IpJRDC"))),(Object)((RemoteObject.createImmutable("")))))),(Object)(BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("PuertoJRDC"))),(Object)((RemoteObject.createImmutable("")))))),(Object)(BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ComandoJRDC"))),(Object)((RemoteObject.createImmutable("")))))),(Object)(BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ParametrosJRDC"))),(Object)((RemoteObject.createImmutable(""))))))));
 BA.debugLineNum = 1410;BA.debugLine="MostrarDatosOrigenDatos";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_mostrardatosorigendatos" /*RemoteObject*/ );
 BA.debugLineNum = 1411;BA.debugLine="CargandoDatos=True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_cargandodatos" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1412;BA.debugLine="CargaCamposJRDCQuery(txtIpJRDC.Text,txtPuertoJ";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_cargacamposjrdcquery" /*void*/ ,(Object)(__ref.getField(false,"_txtipjrdc" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtpuertojrdc" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(__ref.getField(false,"_txtcomandojrdc" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txtparametrosjrdc" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 1413;BA.debugLine="Wait For CargaCamposJRDCQuery_Completed";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","cargacamposjrdcquery_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "configurarorigendatos"), null);
this.state = 63;
return;
case 63:
//C
this.state = 55;
;
 BA.debugLineNum = 1414;BA.debugLine="CargandoDatos=False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_cargandodatos" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 if (true) break;

case 22:
//C
this.state = 55;
 BA.debugLineNum = 1417;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(TipoOri";
Debug.JustUpdateDeviceLine();
__ref.setField ("_datosorigendatos" /*RemoteObject*/ ,__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_createtipoorigendatos" /*RemoteObject*/ ,(Object)(_tipoorigendatos),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString(parent.__c.getField(false,"Null")))));
 BA.debugLineNum = 1418;BA.debugLine="lblTitleIpJRDC.TextColor=fx.Colors.From32Bit(0";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbltitleipjrdc" /*RemoteObject*/ ).runMethod(false,"setTextColor",(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffd3d3d3))))));
 BA.debugLineNum = 1419;BA.debugLine="lblTitlePuertoJRDC.TextColor=fx.Colors.From32B";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbltitlepuertojrdc" /*RemoteObject*/ ).runMethod(false,"setTextColor",(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffd3d3d3))))));
 BA.debugLineNum = 1420;BA.debugLine="lblTitleComandoJRDC.TextColor=fx.Colors.From32";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbltitlecomandojrdc" /*RemoteObject*/ ).runMethod(false,"setTextColor",(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffd3d3d3))))));
 BA.debugLineNum = 1421;BA.debugLine="lblTitleParametrosJRDC.TextColor=fx.Colors.Fro";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbltitleparametrosjrdc" /*RemoteObject*/ ).runMethod(false,"setTextColor",(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffd3d3d3))))));
 BA.debugLineNum = 1422;BA.debugLine="txtIpJRDC.Enabled=False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtipjrdc" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1423;BA.debugLine="txtParametrosJRDC.Enabled=False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtparametrosjrdc" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1424;BA.debugLine="txtPuertoJRDC.Enabled=False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtpuertojrdc" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1425;BA.debugLine="txtComandoJRDC.ENABLED=False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtcomandojrdc" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1430;BA.debugLine="MostrarDatosOrigenDatos";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_mostrardatosorigendatos" /*RemoteObject*/ );
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 1433;BA.debugLine="Dim FcDb As FileChooser";
Debug.JustUpdateDeviceLine();
_fcdb = RemoteObject.createNew ("anywheresoftware.b4j.objects.FileChooserWrapper");Debug.locals.put("FcDb", _fcdb);
 BA.debugLineNum = 1434;BA.debugLine="FcDb.Initialize";
Debug.JustUpdateDeviceLine();
_fcdb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1435;BA.debugLine="FcDb.SetExtensionFilter(\"Ficheros db SQLite\",A";
Debug.JustUpdateDeviceLine();
_fcdb.runVoidMethod ("SetExtensionFilter",(Object)(BA.ObjectToString("Ficheros db SQLite")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("*.db")})))));
 BA.debugLineNum = 1436;BA.debugLine="Dim sFchDB As String=FcDb.ShowOpen(frm)";
Debug.JustUpdateDeviceLine();
_sfchdb = _fcdb.runMethodAndSync(true,"ShowOpen",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )));Debug.locals.put("sFchDB", _sfchdb);Debug.locals.put("sFchDB", _sfchdb);
 BA.debugLineNum = 1437;BA.debugLine="If sFchDB=\"\" Then Return False";
Debug.JustUpdateDeviceLine();
if (true) break;

case 25:
//if
this.state = 30;
if (RemoteObject.solveBoolean("=",_sfchdb,BA.ObjectToString(""))) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 30:
//C
this.state = 31;
;
 BA.debugLineNum = 1438;BA.debugLine="Dim SQLOrigenDatos As SQL";
Debug.JustUpdateDeviceLine();
_sqlorigendatos = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");Debug.locals.put("SQLOrigenDatos", _sqlorigendatos);
 BA.debugLineNum = 1439;BA.debugLine="SQLOrigenDatos.InitializeSQLite(File.GetFilePa";
Debug.JustUpdateDeviceLine();
_sqlorigendatos.runVoidMethod ("InitializeSQLite",(Object)(parent.__c.getField(false,"File").runMethod(true,"GetFileParent",(Object)(_sfchdb))),(Object)(parent.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_sfchdb))),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 1441;BA.debugLine="Dim lstTablasSQLite As List";
Debug.JustUpdateDeviceLine();
_lsttablassqlite = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstTablasSQLite", _lsttablassqlite);
 BA.debugLineNum = 1442;BA.debugLine="lstTablasSQLite.Initialize";
Debug.JustUpdateDeviceLine();
_lsttablassqlite.runVoidMethod ("Initialize");
 BA.debugLineNum = 1443;BA.debugLine="Dim TBName As String";
Debug.JustUpdateDeviceLine();
_tbname = RemoteObject.createImmutable("");Debug.locals.put("TBName", _tbname);
 BA.debugLineNum = 1444;BA.debugLine="Dim DBQuery As String= \"Select name FROM sqlit";
Debug.JustUpdateDeviceLine();
_dbquery = BA.ObjectToString("Select name FROM sqlite_master WHERE Type='table' ORDER BY name");Debug.locals.put("DBQuery", _dbquery);Debug.locals.put("DBQuery", _dbquery);
 BA.debugLineNum = 1445;BA.debugLine="Dim rsDB As ResultSet=SQLOrigenDatos.ExecQuery";
Debug.JustUpdateDeviceLine();
_rsdb = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rsdb = _sqlorigendatos.runMethod(false,"ExecQuery",(Object)(_dbquery));Debug.locals.put("rsDB", _rsdb);Debug.locals.put("rsDB", _rsdb);
 BA.debugLineNum = 1446;BA.debugLine="Do While rsDB.NextRow";
Debug.JustUpdateDeviceLine();
if (true) break;

case 31:
//do while
this.state = 40;
while (_rsdb.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 33;
if (true) break;
}
if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 1447;BA.debugLine="TBName=rsDB.GetString2(0)";
Debug.JustUpdateDeviceLine();
_tbname = _rsdb.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("TBName", _tbname);
 BA.debugLineNum = 1448;BA.debugLine="Log(\"   Table: \" & TBName)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9177537137",RemoteObject.concat(RemoteObject.createImmutable("   Table: "),_tbname),0);
 BA.debugLineNum = 1449;BA.debugLine="If TBName.StartsWith(\"SQlite\") = False Then l";
Debug.JustUpdateDeviceLine();
if (true) break;

case 34:
//if
this.state = 39;
if (RemoteObject.solveBoolean("=",_tbname.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("SQlite"))),parent.__c.getField(true,"False"))) { 
this.state = 36;
;}if (true) break;

case 36:
//C
this.state = 39;
_lsttablassqlite.runVoidMethod ("Add",(Object)((_tbname)));
if (true) break;

case 39:
//C
this.state = 31;
;
 if (true) break;

case 40:
//C
this.state = 41;
;
 BA.debugLineNum = 1451;BA.debugLine="rsDB.Close";
Debug.JustUpdateDeviceLine();
_rsdb.runVoidMethod ("Close");
 BA.debugLineNum = 1453;BA.debugLine="If lstTablasSQLite.Size=0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 41:
//if
this.state = 44;
if (RemoteObject.solveBoolean("=",_lsttablassqlite.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 1454;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"La base";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("La base de datos SQLite"),_sfchdb,RemoteObject.createImmutable(" no contiene tablas."))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1455;BA.debugLine="Wait For (msa) Msgbox_Result (result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "configurarorigendatos"), _msa);
this.state = 64;
return;
case 64:
//C
this.state = 44;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 1456;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 44:
//C
this.state = 45;
;
 BA.debugLineNum = 1459;BA.debugLine="Dim Dlg As B4XDialog";
Debug.JustUpdateDeviceLine();
_dlg = RemoteObject.createNew ("b4j.docU.b4xdialog");Debug.locals.put("Dlg", _dlg);
 BA.debugLineNum = 1460;BA.debugLine="Dlg.Initialize(frm.RootPane)";
Debug.JustUpdateDeviceLine();
_dlg.runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 1461;BA.debugLine="Dlg.Title=\"Indica Nombre de la Tabla\"";
Debug.JustUpdateDeviceLine();
_dlg.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Indica Nombre de la Tabla")));
 BA.debugLineNum = 1462;BA.debugLine="Dim B4XList As B4XListTemplate";
Debug.JustUpdateDeviceLine();
_b4xlist = RemoteObject.createNew ("b4j.docU.b4xlisttemplate");Debug.locals.put("B4XList", _b4xlist);
 BA.debugLineNum = 1463;BA.debugLine="B4XList.Initialize";
Debug.JustUpdateDeviceLine();
_b4xlist.runClassMethod (b4j.docU.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 1464;BA.debugLine="B4XList.Options=lstTablasSQLite";
Debug.JustUpdateDeviceLine();
_b4xlist.setField ("_options" /*RemoteObject*/ ,_lsttablassqlite);
 BA.debugLineNum = 1465;BA.debugLine="B4XList.mBase.Width=500dip";
Debug.JustUpdateDeviceLine();
_b4xlist.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 1466;BA.debugLine="Dim rSub As ResumableSub=Dlg.ShowTemplate(B4XL";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = _dlg.runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xlist)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 1467;BA.debugLine="Dim bCancel As Button=Dlg.GetButton(xui.Dialog";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_bcancel = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), _dlg.runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel"))).getObject());Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 1468;BA.debugLine="bCancel.TextSize=15";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 1469;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "configurarorigendatos"), _rsub);
this.state = 65;
return;
case 65:
//C
this.state = 45;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1470;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 45:
//if
this.state = 50;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 47;
;}if (true) break;

case 47:
//C
this.state = 50;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 50:
//C
this.state = 51;
;
 BA.debugLineNum = 1471;BA.debugLine="Dim NombreTabla As String=B4XList.SelectedItem";
Debug.JustUpdateDeviceLine();
_nombretabla = _b4xlist.getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("NombreTabla", _nombretabla);Debug.locals.put("NombreTabla", _nombretabla);
 BA.debugLineNum = 1472;BA.debugLine="Dim lstFields As List=GetTablePragma(SQLOrigen";
Debug.JustUpdateDeviceLine();
_lstfields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstfields = __ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_gettablepragma" /*RemoteObject*/ ,(Object)(_sqlorigendatos),(Object)(_nombretabla));Debug.locals.put("lstFields", _lstfields);Debug.locals.put("lstFields", _lstfields);
 BA.debugLineNum = 1473;BA.debugLine="If lstFields.Size=0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 51:
//if
this.state = 54;
if (RemoteObject.solveBoolean("=",_lstfields.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 53;
}if (true) break;

case 53:
//C
this.state = 54;
 BA.debugLineNum = 1474;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"La tabla";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("La tabla "),_nombretabla,RemoteObject.createImmutable(" no existe en la base de datos SQLite "),_sfchdb)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1475;BA.debugLine="Wait For (msa) Msgbox_Result (result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "configurarorigendatos"), _msa);
this.state = 66;
return;
case 66:
//C
this.state = 54;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 1476;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 54:
//C
this.state = 55;
;
 BA.debugLineNum = 1479;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(TipoOri";
Debug.JustUpdateDeviceLine();
__ref.setField ("_datosorigendatos" /*RemoteObject*/ ,__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_createtipoorigendatos" /*RemoteObject*/ ,(Object)(_tipoorigendatos),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString(parent.__c.getField(false,"Null")))));
 BA.debugLineNum = 1480;BA.debugLine="lblTitleIpJRDC.TextColor=fx.Colors.From32Bit(0";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbltitleipjrdc" /*RemoteObject*/ ).runMethod(false,"setTextColor",(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffd3d3d3))))));
 BA.debugLineNum = 1481;BA.debugLine="lblTitlePuertoJRDC.TextColor=fx.Colors.From32B";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbltitlepuertojrdc" /*RemoteObject*/ ).runMethod(false,"setTextColor",(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffd3d3d3))))));
 BA.debugLineNum = 1482;BA.debugLine="lblTitleComandoJRDC.TextColor=fx.Colors.From32";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbltitlecomandojrdc" /*RemoteObject*/ ).runMethod(false,"setTextColor",(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffd3d3d3))))));
 BA.debugLineNum = 1483;BA.debugLine="lblTitleParametrosJRDC.TextColor=fx.Colors.Fro";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbltitleparametrosjrdc" /*RemoteObject*/ ).runMethod(false,"setTextColor",(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffd3d3d3))))));
 BA.debugLineNum = 1484;BA.debugLine="txtIpJRDC.Enabled=False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtipjrdc" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1485;BA.debugLine="txtParametrosJRDC.Enabled=False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtparametrosjrdc" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1486;BA.debugLine="txtPuertoJRDC.Enabled=False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtpuertojrdc" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1487;BA.debugLine="txtComandoJRDC.ENABLED=False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtcomandojrdc" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1488;BA.debugLine="MostrarDatosOrigenDatos";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_mostrardatosorigendatos" /*RemoteObject*/ );
 BA.debugLineNum = 1490;BA.debugLine="CargaCamposTablaSQLite(lstFields)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_cargacampostablasqlite" /*RemoteObject*/ ,(Object)(_lstfields));
 BA.debugLineNum = 1491;BA.debugLine="SQLOrigenDatos.Close";
Debug.JustUpdateDeviceLine();
_sqlorigendatos.runVoidMethod ("Close");
 if (true) break;

case 55:
//C
this.state = 58;
;
 BA.debugLineNum = 1498;BA.debugLine="dragger.AddDragButtons";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dragger" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclvclvdragger.class, "_adddragbuttons" /*RemoteObject*/ );
 BA.debugLineNum = 1499;BA.debugLine="pnlOrigenSQL.Visible=True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pnlorigensql" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 1501;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 58:
//C
this.state = -1;
;
 BA.debugLineNum = 1503;BA.debugLine="RecalcularIDOrdenColumnas";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_recalcularidordencolumnas" /*RemoteObject*/ );
 BA.debugLineNum = 1504;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1505;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _createcommand(RemoteObject __ref,RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2809);
if (RapidSub.canDelegate("createcommand")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","createcommand", __ref, _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
Debug.locals.put("name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 2809;BA.debugLine="private Sub CreateCommand(name As String, Paramete";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2810;BA.debugLine="Dim cmd As DBCommand";
Debug.JustUpdateDeviceLine();
_cmd = RemoteObject.createNew ("b4j.docU.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 2811;BA.debugLine="cmd.Initialize";
Debug.JustUpdateDeviceLine();
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 2812;BA.debugLine="cmd.Name = name";
Debug.JustUpdateDeviceLine();
_cmd.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 2813;BA.debugLine="If Parameters <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_parameters)) { 
 BA.debugLineNum = 2814;BA.debugLine="cmd.Parameters = Parameters";
Debug.JustUpdateDeviceLine();
_cmd.setField ("Parameters" /*RemoteObject*/ ,_parameters);
 };
 BA.debugLineNum = 2816;BA.debugLine="Return cmd";
Debug.JustUpdateDeviceLine();
if (true) return _cmd;
 BA.debugLineNum = 2817;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrequest(RemoteObject __ref,RemoteObject _rdclink) throws Exception{
try {
		Debug.PushSubsStack("CreateRequest (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2803);
if (RapidSub.canDelegate("createrequest")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","createrequest", __ref, _rdclink);}
RemoteObject _req = RemoteObject.declareNull("b4j.docU.dbrequestmanager");
Debug.locals.put("rdcLink", _rdclink);
 BA.debugLineNum = 2803;BA.debugLine="private Sub CreateRequest(rdcLink As String) As DB";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2804;BA.debugLine="Dim req As DBRequestManager";
Debug.JustUpdateDeviceLine();
_req = RemoteObject.createNew ("b4j.docU.dbrequestmanager");Debug.locals.put("req", _req);
 BA.debugLineNum = 2805;BA.debugLine="req.Initialize(Me, rdcLink)";
Debug.JustUpdateDeviceLine();
_req.runClassMethod (b4j.docU.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(_rdclink));
 BA.debugLineNum = 2806;BA.debugLine="Return req";
Debug.JustUpdateDeviceLine();
if (true) return _req;
 BA.debugLineNum = 2807;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtipoorigendatos(RemoteObject __ref,RemoteObject _tipoorigendatos,RemoteObject _ipjrdc,RemoteObject _puertojrdc,RemoteObject _comandojrdc,RemoteObject _parametrosjrdc) throws Exception{
try {
		Debug.PushSubsStack("CreateTipoOrigenDatos (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2644);
if (RapidSub.canDelegate("createtipoorigendatos")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","createtipoorigendatos", __ref, _tipoorigendatos, _ipjrdc, _puertojrdc, _comandojrdc, _parametrosjrdc);}
RemoteObject _t1 = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._tipoorigendatos");
Debug.locals.put("TipoOrigenDatos", _tipoorigendatos);
Debug.locals.put("IpJRDC", _ipjrdc);
Debug.locals.put("PuertoJRDC", _puertojrdc);
Debug.locals.put("ComandoJRDC", _comandojrdc);
Debug.locals.put("ParametrosJRDC", _parametrosjrdc);
 BA.debugLineNum = 2644;BA.debugLine="private Sub CreateTipoOrigenDatos (TipoOrigenDatos";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2645;BA.debugLine="Dim t1 As TipoOrigenDatos";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4j.docU.jamtableviewcamposbuilder._tipoorigendatos");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 2646;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 2647;BA.debugLine="t1.TipoOrigenDatos = TipoOrigenDatos";
Debug.JustUpdateDeviceLine();
_t1.setField ("TipoOrigenDatos" /*RemoteObject*/ ,_tipoorigendatos);
 BA.debugLineNum = 2648;BA.debugLine="t1.IpJRDC = IpJRDC";
Debug.JustUpdateDeviceLine();
_t1.setField ("IpJRDC" /*RemoteObject*/ ,_ipjrdc);
 BA.debugLineNum = 2649;BA.debugLine="t1.PuertoJRDC = PuertoJRDC";
Debug.JustUpdateDeviceLine();
_t1.setField ("PuertoJRDC" /*RemoteObject*/ ,_puertojrdc);
 BA.debugLineNum = 2650;BA.debugLine="t1.ComandoJRDC = ComandoJRDC";
Debug.JustUpdateDeviceLine();
_t1.setField ("ComandoJRDC" /*RemoteObject*/ ,_comandojrdc);
 BA.debugLineNum = 2651;BA.debugLine="t1.ParametrosJRDC = ParametrosJRDC";
Debug.JustUpdateDeviceLine();
_t1.setField ("ParametrosJRDC" /*RemoteObject*/ ,_parametrosjrdc);
 BA.debugLineNum = 2652;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 2653;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deshabilitarnodos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DeshabilitarNodos (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2781);
if (RapidSub.canDelegate("deshabilitarnodos")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","deshabilitarnodos", __ref);}
RemoteObject _lstnodosdeshabilitados = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
 BA.debugLineNum = 2781;BA.debugLine="private Sub DeshabilitarNodos";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2782;BA.debugLine="Dim lstNodosDeshabilitados As List";
Debug.JustUpdateDeviceLine();
_lstnodosdeshabilitados = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstNodosDeshabilitados", _lstnodosdeshabilitados);
 BA.debugLineNum = 2783;BA.debugLine="lstNodosDeshabilitados.Initialize";
Debug.JustUpdateDeviceLine();
_lstnodosdeshabilitados.runVoidMethod ("Initialize");
 BA.debugLineNum = 2784;BA.debugLine="For Each n As Node In frm.RootPane.GetAllViewsRec";
Debug.JustUpdateDeviceLine();
_n = RemoteObject.createNew ("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
{
final RemoteObject group3 = __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"GetAllViewsRecursive");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_n = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), group3.runMethod(false,"Get",index3));Debug.locals.put("n", _n);
Debug.locals.put("n", _n);
 BA.debugLineNum = 2785;BA.debugLine="If n.Enabled=True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_n.runMethod(true,"getEnabled"),jamtableclvcamposbuilder.__c.getField(true,"True"))) { 
 BA.debugLineNum = 2786;BA.debugLine="n.Enabled=False";
Debug.JustUpdateDeviceLine();
_n.runMethod(true,"setEnabled",jamtableclvcamposbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 2787;BA.debugLine="lstNodosDeshabilitados.Add(n)";
Debug.JustUpdateDeviceLine();
_lstnodosdeshabilitados.runVoidMethod ("Add",(Object)((_n.getObject())));
 };
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 2790;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _exporttostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ExportToString (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,799);
if (RapidSub.canDelegate("exporttostring")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","exporttostring", __ref);}
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _jg = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");
 BA.debugLineNum = 799;BA.debugLine="private Sub ExportToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 800;BA.debugLine="Dim Items As List";
Debug.JustUpdateDeviceLine();
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Items", _items);
 BA.debugLineNum = 801;BA.debugLine="Items.Initialize";
Debug.JustUpdateDeviceLine();
_items.runVoidMethod ("Initialize");
 BA.debugLineNum = 802;BA.debugLine="For i = 0 To clvListaCampos.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 803;BA.debugLine="Items.Add(ItemValueToMap(clvListaCampos.GetValue";
Debug.JustUpdateDeviceLine();
_items.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_itemvaluetomap" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i)))))).getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 815;BA.debugLine="Dim jg As JSONGenerator";
Debug.JustUpdateDeviceLine();
_jg = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jg", _jg);
 BA.debugLineNum = 828;BA.debugLine="jg.Initialize(CreateMap(\"FechaUltimaModificacion\"";
Debug.JustUpdateDeviceLine();
_jg.runVoidMethod ("Initialize",(Object)(jamtableclvcamposbuilder.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("FechaUltimaModificacion")),(jamtableclvcamposbuilder.__c.getField(false,"DateTime").runMethod(true,"getNow")),RemoteObject.createImmutable(("TipoOrigenDatos")),(__ref.getField(false,"_datosorigendatos" /*RemoteObject*/ ).getField(true,"TipoOrigenDatos" /*RemoteObject*/ )),RemoteObject.createImmutable(("IpJRDC")),(__ref.getField(false,"_datosorigendatos" /*RemoteObject*/ ).getField(true,"IpJRDC" /*RemoteObject*/ )),RemoteObject.createImmutable(("PuertoJRDC")),(__ref.getField(false,"_datosorigendatos" /*RemoteObject*/ ).getField(true,"PuertoJRDC" /*RemoteObject*/ )),RemoteObject.createImmutable(("ComandoJRDC")),(__ref.getField(false,"_datosorigendatos" /*RemoteObject*/ ).getField(true,"ComandoJRDC" /*RemoteObject*/ )),RemoteObject.createImmutable(("ParametrosJRDC")),(__ref.getField(false,"_datosorigendatos" /*RemoteObject*/ ).getField(true,"ParametrosJRDC" /*RemoteObject*/ )),RemoteObject.createImmutable(("ColorFondoEncabezados")),(__ref.getField(false,"_txtrgbcolorfondoencabezados" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(("ColorTextoEncabezados")),(__ref.getField(false,"_txtrgbcolortextoencabezados" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(("ColorFondoPanelInfo")),(__ref.getField(false,"_txtrgbcolorfondopanelinfo" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(("ColorTextoPanelInfo")),(__ref.getField(false,"_txtrgbcolortextopanelinfo" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(("ColorFondoPanelItemsImpares")),(__ref.getField(false,"_txtrgbcolorfondofilasimpares" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(("ColorFondoPanelItemsPares")),(__ref.getField(false,"_txtrgbcolorfondofilaspares" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(("AnchoBordeItems")),__ref.getField(false,"_b4xplusminusanchobordeitems" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xplusminus.class, "_getselectedvalue" /*RemoteObject*/ ),RemoteObject.createImmutable(("ColorBordeItems")),(__ref.getField(false,"_txtrgbcolorbordeitems" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(("Items")),(_items.getObject())}))));
 BA.debugLineNum = 836;BA.debugLine="Return jg.ToPrettyString(4)";
Debug.JustUpdateDeviceLine();
if (true) return _jg.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 4)));
 BA.debugLineNum = 837;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,261);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 261;BA.debugLine="private Sub frm_CloseRequest (EventData As Event)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 262;BA.debugLine="EventData.Consume";
Debug.JustUpdateDeviceLine();
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcsscolorstringfromintcolor(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("GetCssColorStringFromIntColor (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,375);
if (RapidSub.canDelegate("getcsscolorstringfromintcolor")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","getcsscolorstringfromintcolor", __ref, _value);}
RemoteObject _hexargb = RemoteObject.createImmutable("");
RemoteObject _hexrgb = RemoteObject.createImmutable("");
Debug.locals.put("value", _value);
 BA.debugLineNum = 375;BA.debugLine="Private Sub GetCssColorStringFromIntColor(value As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 376;BA.debugLine="Select value";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_value,__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(true,"To32Bit",(Object)(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").getField(false,"Transparent"))))) {
case 0: {
 BA.debugLineNum = 378;BA.debugLine="Return \"transparent\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("transparent");
 break; }
default: {
 BA.debugLineNum = 382;BA.debugLine="Dim HexARGB As String=ColorToHex(value)";
Debug.JustUpdateDeviceLine();
_hexargb = __ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_colortohex" /*RemoteObject*/ ,(Object)(_value));Debug.locals.put("HexARGB", _hexargb);Debug.locals.put("HexARGB", _hexargb);
 BA.debugLineNum = 383;BA.debugLine="If HexARGB.Length=6 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_hexargb.runMethod(true,"length"),BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 384;BA.debugLine="Return \"#\" & HexARGB";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.concat(RemoteObject.createImmutable("#"),_hexargb);
 }else {
 BA.debugLineNum = 386;BA.debugLine="Dim HexRGB As String=HexARGB.SubString2(2,8)";
Debug.JustUpdateDeviceLine();
_hexrgb = _hexargb.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 8)));Debug.locals.put("HexRGB", _hexrgb);Debug.locals.put("HexRGB", _hexrgb);
 BA.debugLineNum = 387;BA.debugLine="Return \"#\" & HexRGB";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.concat(RemoteObject.createImmutable("#"),_hexrgb);
 };
 break; }
}
;
 BA.debugLineNum = 390;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettablepragma(RemoteObject __ref,RemoteObject _sql,RemoteObject _tablename) throws Exception{
try {
		Debug.PushSubsStack("GetTablePragma (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1517);
if (RapidSub.canDelegate("gettablepragma")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","gettablepragma", __ref, _sql, _tablename);}
RemoteObject _lstfields = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _tbquery = RemoteObject.createImmutable("");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _columnparmsmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
 BA.debugLineNum = 1517;BA.debugLine="Sub GetTablePragma(SQL As SQL,TableName As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1518;BA.debugLine="Private lstFields As List";
Debug.JustUpdateDeviceLine();
_lstfields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstFields", _lstfields);
 BA.debugLineNum = 1519;BA.debugLine="lstFields.Initialize";
Debug.JustUpdateDeviceLine();
_lstfields.runVoidMethod ("Initialize");
 BA.debugLineNum = 1520;BA.debugLine="Private TBQuery As String";
Debug.JustUpdateDeviceLine();
_tbquery = RemoteObject.createImmutable("");Debug.locals.put("TBQuery", _tbquery);
 BA.debugLineNum = 1521;BA.debugLine="TBQuery = \"PRAGMA table_info(\" & TableName & \")\"";
Debug.JustUpdateDeviceLine();
_tbquery = RemoteObject.concat(RemoteObject.createImmutable("PRAGMA table_info("),_tablename,RemoteObject.createImmutable(")"));Debug.locals.put("TBQuery", _tbquery);
 BA.debugLineNum = 1522;BA.debugLine="Dim rs As ResultSet=SQL.ExecQuery(TBQuery)";
Debug.JustUpdateDeviceLine();
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = _sql.runMethod(false,"ExecQuery",(Object)(_tbquery));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1523;BA.debugLine="Do While rs.NextRow";
Debug.JustUpdateDeviceLine();
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1524;BA.debugLine="Dim ColumnParmsMap As Map";
Debug.JustUpdateDeviceLine();
_columnparmsmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("ColumnParmsMap", _columnparmsmap);
 BA.debugLineNum = 1525;BA.debugLine="ColumnParmsMap.Initialize";
Debug.JustUpdateDeviceLine();
_columnparmsmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 1526;BA.debugLine="For i=0 To rs.ColumnCount-1";
Debug.JustUpdateDeviceLine();
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_rs.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1527;BA.debugLine="Log (\"     \" & i & \": \" &  rs.GetColumnName(i)";
Debug.JustUpdateDeviceLine();
jamtableclvcamposbuilder.__c.runVoidMethod ("LogImpl","9177668106",RemoteObject.concat(RemoteObject.createImmutable("     "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable(": "),_rs.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable("->"),_rs.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i)))),0);
 BA.debugLineNum = 1528;BA.debugLine="ColumnParmsMap.Put(rs.GetColumnName(i), rs.GetS";
Debug.JustUpdateDeviceLine();
_columnparmsmap.runVoidMethod ("Put",(Object)((_rs.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))))),(Object)((_rs.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1530;BA.debugLine="lstFields.Add(ColumnParmsMap)";
Debug.JustUpdateDeviceLine();
_lstfields.runVoidMethod ("Add",(Object)((_columnparmsmap.getObject())));
 }
;
 BA.debugLineNum = 1532;BA.debugLine="rs.Close";
Debug.JustUpdateDeviceLine();
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 1533;BA.debugLine="Return lstFields";
Debug.JustUpdateDeviceLine();
if (true) return _lstfields;
 BA.debugLineNum = 1534;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _habilitardeshabilitarcheckbox(RemoteObject __ref,RemoteObject _chkboxsel,RemoteObject _habilitado) throws Exception{
try {
		Debug.PushSubsStack("HabilitarDeshabilitarCheckBox (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2252);
if (RapidSub.canDelegate("habilitardeshabilitarcheckbox")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","habilitardeshabilitarcheckbox", __ref, _chkboxsel, _habilitado);}
Debug.locals.put("chkboxSel", _chkboxsel);
Debug.locals.put("Habilitado", _habilitado);
 BA.debugLineNum = 2252;BA.debugLine="private Sub HabilitarDeshabilitarCheckBox(chkboxSe";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2253;BA.debugLine="chkboxSel.Enabled=Habilitado";
Debug.JustUpdateDeviceLine();
_chkboxsel.runMethod(true,"setEnabled",_habilitado);
 BA.debugLineNum = 2254;BA.debugLine="If Habilitado Then";
Debug.JustUpdateDeviceLine();
if (_habilitado.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2255;BA.debugLine="chkboxSel.Style=\"-fx-text-fill:black; -fx-border";
Debug.JustUpdateDeviceLine();
_chkboxsel.runMethod(true,"setStyle",BA.ObjectToString("-fx-text-fill:black; -fx-border-color: black"));
 }else {
 BA.debugLineNum = 2257;BA.debugLine="chkboxSel.Style=\"-fx-text-fill:lightgray; -fx-bo";
Debug.JustUpdateDeviceLine();
_chkboxsel.runMethod(true,"setStyle",BA.ObjectToString("-fx-text-fill:lightgray; -fx-border-color: lightgray"));
 };
 BA.debugLineNum = 2259;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _habilitarnodos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HabilitarNodos (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2792);
if (RapidSub.canDelegate("habilitarnodos")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","habilitarnodos", __ref);}
RemoteObject _lstnodosdeshabilitados = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
 BA.debugLineNum = 2792;BA.debugLine="private Sub HabilitarNodos";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2793;BA.debugLine="Dim lstNodosDeshabilitados As List";
Debug.JustUpdateDeviceLine();
_lstnodosdeshabilitados = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstNodosDeshabilitados", _lstnodosdeshabilitados);
 BA.debugLineNum = 2794;BA.debugLine="lstNodosDeshabilitados.Initialize";
Debug.JustUpdateDeviceLine();
_lstnodosdeshabilitados.runVoidMethod ("Initialize");
 BA.debugLineNum = 2795;BA.debugLine="For Each n As Node In frm.RootPane.GetAllViewsRec";
Debug.JustUpdateDeviceLine();
_n = RemoteObject.createNew ("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
{
final RemoteObject group3 = __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"GetAllViewsRecursive");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_n = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), group3.runMethod(false,"Get",index3));Debug.locals.put("n", _n);
Debug.locals.put("n", _n);
 BA.debugLineNum = 2796;BA.debugLine="If n.Enabled=False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_n.runMethod(true,"getEnabled"),jamtableclvcamposbuilder.__c.getField(true,"False"))) { 
 BA.debugLineNum = 2797;BA.debugLine="n.Enabled=True";
Debug.JustUpdateDeviceLine();
_n.runMethod(true,"setEnabled",jamtableclvcamposbuilder.__c.getField(true,"True"));
 BA.debugLineNum = 2798;BA.debugLine="lstNodosDeshabilitados.Add(n)";
Debug.JustUpdateDeviceLine();
_lstnodosdeshabilitados.runVoidMethod ("Add",(Object)((_n.getObject())));
 };
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 2801;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _help(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Help (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2577);
if (RapidSub.canDelegate("help")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","help", __ref);}
ResumableSub_Help rsub = new ResumableSub_Help(null,__ref);
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
public static class ResumableSub_Help extends BA.ResumableSub {
public ResumableSub_Help(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _dlginfo = RemoteObject.declareNull("b4j.docU.b4xlongtexttemplate");
RemoteObject _sbinfo = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bok = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
RemoteObject _pt = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
RemoteObject _lblt = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Help (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2577);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 2578;BA.debugLine="Dialog.Title=\"Información\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Información")));
 BA.debugLineNum = 2581;BA.debugLine="Dim DlgInfo As B4XLongTextTemplate";
Debug.JustUpdateDeviceLine();
_dlginfo = RemoteObject.createNew ("b4j.docU.b4xlongtexttemplate");Debug.locals.put("DlgInfo", _dlginfo);
 BA.debugLineNum = 2582;BA.debugLine="DlgInfo.Initialize";
Debug.JustUpdateDeviceLine();
_dlginfo.runClassMethod (b4j.docU.b4xlongtexttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 2583;BA.debugLine="Dim sbInfo As StringBuilder";
Debug.JustUpdateDeviceLine();
_sbinfo = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbInfo", _sbinfo);
 BA.debugLineNum = 2584;BA.debugLine="sbInfo.Initialize";
Debug.JustUpdateDeviceLine();
_sbinfo.runVoidMethod ("Initialize");
 BA.debugLineNum = 2585;BA.debugLine="sbInfo.Append(\"Instrucciones:\").Append(CRLF).Appe";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Instrucciones:"))).runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 2586;BA.debugLine="sbInfo.Append(\"1) El nombre del campo y su tipo s";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("1) El nombre del campo y su tipo son obligatorios"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 2587;BA.debugLine="sbInfo.Append(\"Los campos tipo fecha (se recupera";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Los campos tipo fecha (se recuperará un Long del origen de datos), hay que marcarlos como \"Es Fecha\"."))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 2588;BA.debugLine="sbInfo.Append(\"Si el origen de datos se obtiene m";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Si el origen de datos se obtiene mediante tabla / vista / query SQL , TODOS los campos devueltos por SQL deben estar definidos. NO se puede eliminar un campo obtenido mediante SQL"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 2590;BA.debugLine="sbInfo.Append(\"En caso de origen de datos tipo Qu";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("En caso de origen de datos tipo Query, si no hay parámetros, dejar en blanco. Si hay más de 1 parámetro, separarlos mediante punto y coma (;)"))).runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 2591;BA.debugLine="sbInfo.Append(\"En caso de carga de 1 JSON ya exis";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("En caso de carga de 1 JSON ya existente, se comparán los campos del JSON, con los devueltos actualmente por la consulta SQL. Casos:"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 2592;BA.debugLine="sbInfo.Append(\"   - El campo de SQL ya existe en";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("   - El campo de SQL ya existe en el JSON: Se mantiene como está definido en el JSON."))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 2593;BA.debugLine="sbInfo.Append(\"   - El campo de SQL NO existe en";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("   - El campo de SQL NO existe en el JSON: Se añade al CLV con el nombre de campo, alias y encabezado de columna = nombre de campo. El resto de datos estará en blanco."))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 2594;BA.debugLine="sbInfo.Append(\"   - El campo está en el JSON, per";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("   - El campo está en el JSON, pero la SQL no lo ha devuelto: Se mostrará una advertencia para confirmar si continuar o detener el proceso (para revisar la SQL por parte del programador."))).runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 2597;BA.debugLine="sbInfo.Append(\"Es posible indicar varios campos d";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Es posible indicar varios campos de clave primeria, ordenados del 1 al X, indicándolo en el valor del KeyID."))).runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 2598;BA.debugLine="sbInfo.Append(\"2) Para los campos que se quiera m";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("2) Para los campos que se quiera mostrar en columnas, hay que marcar el checkbox Columna."))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 2599;BA.debugLine="sbInfo.Append(\"Por defecto, salvo que sea campo c";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Por defecto, salvo que sea campo calculado, se copia el valor del nombre del campo al alias de campo y al encabezado. Se puede editar posteriormente."))).runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 2600;BA.debugLine="sbInfo.Append(\"3) Para los campos por los que se";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("3) Para los campos por los que se quiera poder filtrar, definir un tipo de control para el filtro. Si no se quiere permitir filtrar por un campo, dejarlo en blanco."))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 2601;BA.debugLine="sbInfo.Append(\"En el selector del filtro se mostr";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("En el selector del filtro se mostrará el alias del campo."))).runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 2602;BA.debugLine="sbInfo.Append(\"4) Es posible añadir o eliminar ca";
Debug.JustUpdateDeviceLine();
_sbinfo.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("4) Es posible añadir o eliminar campos manualmente. Los campos calculados deben introducirse en el combo Campo, con sintaxis válida de SQLite, con los ALIAS DE CAMPO correspondientes a los campos entre corchetes.")));
 BA.debugLineNum = 2603;BA.debugLine="sbInfo.Append(\"Si el origen de datos es de tipo S";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Si el origen de datos es de tipo SQL , solo se podrán añadir campos calculados"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 2605;BA.debugLine="sbInfo.Append(\"Un campo transformado a partir de";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Un campo transformado a partir de 1 sola columna no es un campo calculado, se trata como un formato. Ver punto siguiente."))).runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 2606;BA.debugLine="sbInfo.Append(\"5) Los formatos de las columnas se";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("5) Los formatos de las columnas se definen en el evento SetCellFactory las columnas que lo necesiten ."))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 2607;BA.debugLine="sbInfo.Append(\" Los formatos de las columnas se c";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" Los formatos de las columnas se crean mediante código INLINE java. Existen unos formatos predefinidos en la propia clase. Se llaman mediante constantes _CellFactory,"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 2608;BA.debugLine="sbInfo.Append(\" indicando en el método Create que";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" indicando en el método Create que NO están en el módulo CallBack. Para formatos que no estén predefinidos, hay que escribir el código INLINE JAVA en el módulo CallBack."))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 2609;BA.debugLine="sbInfo.Append(\"6) Hay que tener en cuenta , para";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("6) Hay que tener en cuenta , para todos los métodos que busquen datos a partir del jamTableCLV, que la tabla SQLinterna (tblOrigenDatos),se construye con los ALIAS de los campos."))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 2611;BA.debugLine="sbInfo.Append(\"\")";
Debug.JustUpdateDeviceLine();
_sbinfo.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2613;BA.debugLine="DlgInfo.Text=sbInfo.ToString";
Debug.JustUpdateDeviceLine();
_dlginfo.setField ("_text" /*RemoteObject*/ ,(_sbinfo.runMethod(true,"ToString")));
 BA.debugLineNum = 2614;BA.debugLine="Dim rs As ResumableSub=Dialog.ShowTemplate(DlgInf";
Debug.JustUpdateDeviceLine();
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_dlginfo)),(Object)(RemoteObject.createImmutable(("Ok"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable(""))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 2616;BA.debugLine="Dialog.Base.SetLayoutAnimated(0,0.1*Dialog.mParen";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.1),__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(0.8)}, "**",0, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.1),__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(0.8)}, "**",0, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(0.8)}, "*",0, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(0.8)}, "*",0, 0)));
 BA.debugLineNum = 2618;BA.debugLine="Dialog.TitleBar.SetLayoutAnimated(0,0,0,Dialog.Ba";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(BA.numberCast(double.class, __ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(true,"_titlebarheight" /*RemoteObject*/ ))));
 BA.debugLineNum = 2619;BA.debugLine="Dim bOk As Button=Dialog.GetButton(xui.DialogResp";
Debug.JustUpdateDeviceLine();
_bok = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_bok = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive"))).getObject());Debug.locals.put("bOk", _bok);Debug.locals.put("bOk", _bok);
 BA.debugLineNum = 2620;BA.debugLine="bOk.Top=Dialog.Base.Height-Dialog.ButtonsHeight-5";
Debug.JustUpdateDeviceLine();
_bok.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(true,"_buttonsheight" /*RemoteObject*/ ),RemoteObject.createImmutable(5)}, "--",2, 0));
 BA.debugLineNum = 2622;BA.debugLine="Dim pT As Pane=Dialog.TitleBar";
Debug.JustUpdateDeviceLine();
_pt = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_pt = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).getObject());Debug.locals.put("pT", _pt);Debug.locals.put("pT", _pt);
 BA.debugLineNum = 2623;BA.debugLine="Dim lblT As Label=pT.GetNode(0)";
Debug.JustUpdateDeviceLine();
_lblt = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_lblt = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), _pt.runMethod(false,"GetNode",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lblT", _lblt);Debug.locals.put("lblT", _lblt);
 BA.debugLineNum = 2624;BA.debugLine="lblT.PrefWidth=lblT.Parent.PrefWidth";
Debug.JustUpdateDeviceLine();
_lblt.runMethod(true,"setPrefWidth",_lblt.runMethod(false,"getParent").runMethod(true,"getPrefWidth"));
 BA.debugLineNum = 2626;BA.debugLine="DlgInfo.mBase.SetLayoutAnimated(100,5,Dialog.Titl";
Debug.JustUpdateDeviceLine();
_dlginfo.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(double.class, 5)),(Object)(BA.numberCast(double.class, __ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(true,"_titlebarheight" /*RemoteObject*/ ))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(10)}, "-",1, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(true,"_titlebarheight" /*RemoteObject*/ ),__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(true,"_buttonsheight" /*RemoteObject*/ )}, "--",2, 0)));
 BA.debugLineNum = 2628;BA.debugLine="Dim p As Pane=DlgInfo.CustomListView1.GetPanel(0)";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), _dlginfo.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 2629;BA.debugLine="Dim lbl As Label=p.GetNode(0)";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), _p.runMethod(false,"GetNode",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2630;BA.debugLine="lbl.Font=fx.DefaultFont(8)";
Debug.JustUpdateDeviceLine();
_lbl.runMethod(false,"setFont",__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"DefaultFont",(Object)(BA.numberCast(double.class, 8))));
 BA.debugLineNum = 2631;BA.debugLine="lbl.TextColor=fx.Colors.From32Bit(0xFFFFFFFF)";
Debug.JustUpdateDeviceLine();
_lbl.runMethod(false,"setTextColor",(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 2640;BA.debugLine="wait for (rs) complete (result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "help"), _rs);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 2641;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 2642;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _hextocolor(RemoteObject __ref,RemoteObject _hex) throws Exception{
try {
		Debug.PushSubsStack("HexToColor (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,400);
if (RapidSub.canDelegate("hextocolor")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","hextocolor", __ref, _hex);}
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
RemoteObject _ints = null;
Debug.locals.put("Hex", _hex);
 BA.debugLineNum = 400;BA.debugLine="Private Sub HexToColor(Hex As String) As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 401;BA.debugLine="Dim bc As ByteConverter";
Debug.JustUpdateDeviceLine();
_bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 402;BA.debugLine="If Hex.StartsWith(\"#\") Then";
Debug.JustUpdateDeviceLine();
if (_hex.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("#"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 403;BA.debugLine="Hex = Hex.SubString(1)";
Debug.JustUpdateDeviceLine();
_hex = _hex.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("Hex", _hex);
 }else 
{ BA.debugLineNum = 404;BA.debugLine="Else If Hex.StartsWith(\"0x\") Then";
Debug.JustUpdateDeviceLine();
if (_hex.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("0x"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 405;BA.debugLine="Hex = Hex.SubString(2)";
Debug.JustUpdateDeviceLine();
_hex = _hex.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("Hex", _hex);
 }}
;
 BA.debugLineNum = 407;BA.debugLine="If Hex.Length=6 Then Hex=\"FF\" & Hex";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_hex.runMethod(true,"length"),BA.numberCast(double.class, 6))) { 
_hex = RemoteObject.concat(RemoteObject.createImmutable("FF"),_hex);Debug.locals.put("Hex", _hex);};
 BA.debugLineNum = 408;BA.debugLine="Dim ints() As Int = bc.IntsFromBytes(bc.HexToByte";
Debug.JustUpdateDeviceLine();
_ints = _bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(_hex))));Debug.locals.put("ints", _ints);Debug.locals.put("ints", _ints);
 BA.debugLineNum = 409;BA.debugLine="Return ints(0)";
Debug.JustUpdateDeviceLine();
if (true) return _ints.getArrayElement(true,BA.numberCast(int.class, 0));
 BA.debugLineNum = 410;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _inicio(RemoteObject __ref,RemoteObject _rutaficherojsonjamtableclv) throws Exception{
try {
		Debug.PushSubsStack("Inicio (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,238);
if (RapidSub.canDelegate("inicio")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","inicio", __ref, _rutaficherojsonjamtableclv); return;}
ResumableSub_Inicio rsub = new ResumableSub_Inicio(null,__ref,_rutaficherojsonjamtableclv);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Inicio extends BA.ResumableSub {
public ResumableSub_Inicio(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref,RemoteObject _rutaficherojsonjamtableclv) {
this.parent = parent;
this.__ref = __ref;
this._rutaficherojsonjamtableclv = _rutaficherojsonjamtableclv;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _rutaficherojsonjamtableclv;
RemoteObject _rbool = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Inicio (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,238);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("RutaFicheroJSONjamTableCLV", _rutaficherojsonjamtableclv);
 BA.debugLineNum = 239;BA.debugLine="If RutaFicheroJSONjamTableCLV=\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_rutaficherojsonjamtableclv,BA.ObjectToString(""))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 242;BA.debugLine="mnuNew_Action";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_mnunew_action" /*void*/ );
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 244;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.WAIT";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"));
 BA.debugLineNum = 245;BA.debugLine="DeshabilitarNodos";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_deshabilitarnodos" /*RemoteObject*/ );
 BA.debugLineNum = 246;BA.debugLine="wait for (LoadFile(RutaFicheroJSONjamTableCLV))";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "inicio"), __ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_loadfile" /*RemoteObject*/ ,(Object)(_rutaficherojsonjamtableclv)));
this.state = 7;
return;
case 7:
//C
this.state = 6;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 247;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 248;BA.debugLine="HabilitarNodos";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_habilitarnodos" /*RemoteObject*/ );
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 250;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,188);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 188;BA.debugLine="Public Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 190;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _itemvaluetomap(RemoteObject __ref,RemoteObject _clviv) throws Exception{
try {
		Debug.PushSubsStack("ItemValueToMap (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,315);
if (RapidSub.canDelegate("itemvaluetomap")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","itemvaluetomap", __ref, _clviv);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 315;BA.debugLine="private Sub ItemValueToMap (clvIV As clvJamTableCV";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 316;BA.debugLine="Dim m As Map";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 317;BA.debugLine="m.Initialize";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 318;BA.debugLine="m.put(\"ID\",clvIV.txtID.Text)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ID"))),(Object)((_clviv.getField(false,"txtID" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 319;BA.debugLine="m.Put(\"Campo\",clvIV.cboCampo.Value)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Campo"))),(Object)(_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue")));
 BA.debugLineNum = 320;BA.debugLine="m.Put(\"AliasCampo\",clvIV.txtAliasCampo.text)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("AliasCampo"))),(Object)((_clviv.getField(false,"txtAliasCampo" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 323;BA.debugLine="m.Put(\"KeyID\",clvIV.lblOrdenKeyID.Text)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("KeyID"))),(Object)((_clviv.getField(false,"lblOrdenKeyID" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 324;BA.debugLine="m.Put(\"TipoControlFiltro\",clvIV.cboTipoControlFil";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TipoControlFiltro"))),(Object)(_clviv.getField(false,"cboTipoControlFiltro" /*RemoteObject*/ ).runMethod(false,"getValue")));
 BA.debugLineNum = 326;BA.debugLine="m.Put(\"TipoDato\",clvIV.cboTipoDato.Value)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TipoDato"))),(Object)(_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getValue")));
 BA.debugLineNum = 327;BA.debugLine="m.Put(\"EsFecha\",clvIV.chkBoxEsFecha.Checked)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("EsFecha"))),(Object)((_clviv.getField(false,"chkBoxEsFecha" /*RemoteObject*/ ).runMethod(true,"getChecked"))));
 BA.debugLineNum = 328;BA.debugLine="m.Put(\"EsBooleano\",clvIV.chkBoxEsBooleano.Checked";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("EsBooleano"))),(Object)((_clviv.getField(false,"chkBoxEsBooleano" /*RemoteObject*/ ).runMethod(true,"getChecked"))));
 BA.debugLineNum = 329;BA.debugLine="m.Put(\"ValorTrueCampoBooleano\",clvIV.txtValorTrue";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ValorTrueCampoBooleano"))),(Object)((_clviv.getField(false,"txtValorTrueCampoBooleano" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 332;BA.debugLine="m.Put(\"CampoCalculado\",clvIV.chkBoxCampoCalculado";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("CampoCalculado"))),(Object)((_clviv.getField(false,"chkBoxCampoCalculado" /*RemoteObject*/ ).runMethod(true,"getChecked"))));
 BA.debugLineNum = 335;BA.debugLine="m.put(\"NoNulo\",clvIV.chkNoNulo.Checked)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("NoNulo"))),(Object)((_clviv.getField(false,"chkNoNulo" /*RemoteObject*/ ).runMethod(true,"getChecked"))));
 BA.debugLineNum = 336;BA.debugLine="m.put(\"ConValorDefecto\",clvIV.chkBoxConValorDefec";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ConValorDefecto"))),(Object)((_clviv.getField(false,"chkBoxConValorDefecto" /*RemoteObject*/ ).runMethod(true,"getChecked"))));
 BA.debugLineNum = 337;BA.debugLine="m.put(\"ValorDefecto\",clvIV.txtValorDefecto.text)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ValorDefecto"))),(Object)((_clviv.getField(false,"txtValorDefecto" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 353;BA.debugLine="Return m";
Debug.JustUpdateDeviceLine();
if (true) return _m;
 BA.debugLineNum = 354;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _lblcolorbordeitems_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblColorBordeItems_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3141);
if (RapidSub.canDelegate("lblcolorbordeitems_mouseclicked")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","lblcolorbordeitems_mouseclicked", __ref, _eventdata); return;}
ResumableSub_lblColorBordeItems_MouseClicked rsub = new ResumableSub_lblColorBordeItems_MouseClicked(null,__ref,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblColorBordeItems_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorBordeItems_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref,RemoteObject _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblColorBordeItems_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3141);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3142;BA.debugLine="Dialog.Title=\"Selecciona color Borde para los Ite";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona color Borde para los Items")));
 BA.debugLineNum = 3143;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 3144;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))));
 BA.debugLineNum = 3145;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrBCColorPickerJamTableView")),__ref.getField(false, "ba"));
 BA.debugLineNum = 3146;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "lblcolorbordeitems_mouseclicked"),BA.numberCast(int.class, 0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 3148;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 3149;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 3150;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorB";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bccolorpickerjamtableview" /*RemoteObject*/ ).runClassMethod (b4j.docU.bccolorpicker.class, "_setselectedcolor" /*RemoteObject*/ ,__ref.getField(false,"_lblcolorbordeitems" /*RemoteObject*/ ).runMethod(true,"getColor"));
 BA.debugLineNum = 3151;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 3152;BA.debugLine="bCancel.left=bCancel.left-20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 3153;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 3154;BA.debugLine="bCancel.Textsize=16";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 3155;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "lblcolorbordeitems_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3156;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 3157;BA.debugLine="lblColorBordeItems.Color=BCColorPickerjamTableVie";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolorbordeitems" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_bccolorpickerjamtableview" /*RemoteObject*/ ).runClassMethod (b4j.docU.bccolorpicker.class, "_getselectedcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 3158;BA.debugLine="txtRGBColorBordeItems.Text=GetCssColorStringFromI";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtrgbcolorbordeitems" /*RemoteObject*/ ).runMethod(true,"setText",__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_getcsscolorstringfromintcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lblcolorbordeitems" /*RemoteObject*/ ).runMethod(true,"getColor"))));
 BA.debugLineNum = 3159;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _lblcolorfondoencabezados_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblColorFondoEncabezados_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2998);
if (RapidSub.canDelegate("lblcolorfondoencabezados_mouseclicked")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","lblcolorfondoencabezados_mouseclicked", __ref, _eventdata); return;}
ResumableSub_lblColorFondoEncabezados_MouseClicked rsub = new ResumableSub_lblColorFondoEncabezados_MouseClicked(null,__ref,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblColorFondoEncabezados_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorFondoEncabezados_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref,RemoteObject _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblColorFondoEncabezados_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2998);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 2999;BA.debugLine="Dialog.Title=\"Selecciona color Fondo Encabezados\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona color Fondo Encabezados")));
 BA.debugLineNum = 3000;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 3001;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))));
 BA.debugLineNum = 3002;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrBCColorPickerJamTableView")),__ref.getField(false, "ba"));
 BA.debugLineNum = 3003;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "lblcolorfondoencabezados_mouseclicked"),BA.numberCast(int.class, 0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 3005;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 3006;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 3007;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorF";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bccolorpickerjamtableview" /*RemoteObject*/ ).runClassMethod (b4j.docU.bccolorpicker.class, "_setselectedcolor" /*RemoteObject*/ ,__ref.getField(false,"_lblcolorfondoencabezados" /*RemoteObject*/ ).runMethod(true,"getColor"));
 BA.debugLineNum = 3008;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 3009;BA.debugLine="bCancel.left=bCancel.left-20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 3010;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 3011;BA.debugLine="bCancel.Textsize=16";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 3012;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "lblcolorfondoencabezados_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3013;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 3014;BA.debugLine="lblColorFondoEncabezados.Color=BCColorPickerjamTa";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolorfondoencabezados" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_bccolorpickerjamtableview" /*RemoteObject*/ ).runClassMethod (b4j.docU.bccolorpicker.class, "_getselectedcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 3015;BA.debugLine="txtRGBColorFondoEncabezados.Text=GetCssColorStrin";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtrgbcolorfondoencabezados" /*RemoteObject*/ ).runMethod(true,"setText",__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_getcsscolorstringfromintcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lblcolorfondoencabezados" /*RemoteObject*/ ).runMethod(true,"getColor"))));
 BA.debugLineNum = 3016;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _lblcolorfondofilasimpares_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblColorFondoFilasImpares_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3101);
if (RapidSub.canDelegate("lblcolorfondofilasimpares_mouseclicked")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","lblcolorfondofilasimpares_mouseclicked", __ref, _eventdata); return;}
ResumableSub_lblColorFondoFilasImpares_MouseClicked rsub = new ResumableSub_lblColorFondoFilasImpares_MouseClicked(null,__ref,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblColorFondoFilasImpares_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorFondoFilasImpares_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref,RemoteObject _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblColorFondoFilasImpares_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3101);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3102;BA.debugLine="Dialog.Title=\"Selecciona color Fondo Filas Impare";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona color Fondo Filas Impares")));
 BA.debugLineNum = 3103;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 3104;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))));
 BA.debugLineNum = 3105;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrBCColorPickerJamTableView")),__ref.getField(false, "ba"));
 BA.debugLineNum = 3106;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "lblcolorfondofilasimpares_mouseclicked"),BA.numberCast(int.class, 0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 3108;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 3109;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 3110;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorF";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bccolorpickerjamtableview" /*RemoteObject*/ ).runClassMethod (b4j.docU.bccolorpicker.class, "_setselectedcolor" /*RemoteObject*/ ,__ref.getField(false,"_lblcolorfondofilasimpares" /*RemoteObject*/ ).runMethod(true,"getColor"));
 BA.debugLineNum = 3111;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 3112;BA.debugLine="bCancel.left=bCancel.left-20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 3113;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 3114;BA.debugLine="bCancel.Textsize=16";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 3115;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "lblcolorfondofilasimpares_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3116;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 3117;BA.debugLine="lblColorFondoFilasImpares.Color=BCColorPickerjamT";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolorfondofilasimpares" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_bccolorpickerjamtableview" /*RemoteObject*/ ).runClassMethod (b4j.docU.bccolorpicker.class, "_getselectedcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 3118;BA.debugLine="txtRGBColorFondoFilasImpares.Text=GetCssColorStri";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtrgbcolorfondofilasimpares" /*RemoteObject*/ ).runMethod(true,"setText",__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_getcsscolorstringfromintcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lblcolorfondofilasimpares" /*RemoteObject*/ ).runMethod(true,"getColor"))));
 BA.debugLineNum = 3119;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _lblcolorfondofilaspares_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblColorFondoFilasPares_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3121);
if (RapidSub.canDelegate("lblcolorfondofilaspares_mouseclicked")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","lblcolorfondofilaspares_mouseclicked", __ref, _eventdata); return;}
ResumableSub_lblColorFondoFilasPares_MouseClicked rsub = new ResumableSub_lblColorFondoFilasPares_MouseClicked(null,__ref,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblColorFondoFilasPares_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorFondoFilasPares_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref,RemoteObject _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblColorFondoFilasPares_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3121);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3122;BA.debugLine="Dialog.Title=\"Selecciona color Fondo Filas Impare";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona color Fondo Filas Impares")));
 BA.debugLineNum = 3123;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 3124;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))));
 BA.debugLineNum = 3125;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrBCColorPickerJamTableView")),__ref.getField(false, "ba"));
 BA.debugLineNum = 3126;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "lblcolorfondofilaspares_mouseclicked"),BA.numberCast(int.class, 0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 3128;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 3129;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 3130;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorF";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bccolorpickerjamtableview" /*RemoteObject*/ ).runClassMethod (b4j.docU.bccolorpicker.class, "_setselectedcolor" /*RemoteObject*/ ,__ref.getField(false,"_lblcolorfondofilaspares" /*RemoteObject*/ ).runMethod(true,"getColor"));
 BA.debugLineNum = 3131;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 3132;BA.debugLine="bCancel.left=bCancel.left-20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 3133;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 3134;BA.debugLine="bCancel.Textsize=16";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 3135;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "lblcolorfondofilaspares_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3136;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 3137;BA.debugLine="lblColorFondoFilasPares.Color=BCColorPickerjamTab";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolorfondofilaspares" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_bccolorpickerjamtableview" /*RemoteObject*/ ).runClassMethod (b4j.docU.bccolorpicker.class, "_getselectedcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 3138;BA.debugLine="txtRGBColorFondoFilasPares.Text=GetCssColorString";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtrgbcolorfondofilaspares" /*RemoteObject*/ ).runMethod(true,"setText",__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_getcsscolorstringfromintcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lblcolorfondofilaspares" /*RemoteObject*/ ).runMethod(true,"getColor"))));
 BA.debugLineNum = 3139;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _lblcolorfondopanelinfo_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblColorFondoPanelInfo_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3081);
if (RapidSub.canDelegate("lblcolorfondopanelinfo_mouseclicked")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","lblcolorfondopanelinfo_mouseclicked", __ref, _eventdata); return;}
ResumableSub_lblColorFondoPanelInfo_MouseClicked rsub = new ResumableSub_lblColorFondoPanelInfo_MouseClicked(null,__ref,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblColorFondoPanelInfo_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorFondoPanelInfo_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref,RemoteObject _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblColorFondoPanelInfo_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3081);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3082;BA.debugLine="Dialog.Title=\"Selecciona color Fondo Panel Info\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona color Fondo Panel Info")));
 BA.debugLineNum = 3083;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 3084;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))));
 BA.debugLineNum = 3085;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrBCColorPickerJamTableView")),__ref.getField(false, "ba"));
 BA.debugLineNum = 3086;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "lblcolorfondopanelinfo_mouseclicked"),BA.numberCast(int.class, 0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 3088;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 3089;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 3090;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorF";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bccolorpickerjamtableview" /*RemoteObject*/ ).runClassMethod (b4j.docU.bccolorpicker.class, "_setselectedcolor" /*RemoteObject*/ ,__ref.getField(false,"_lblcolorfondopanelinfo" /*RemoteObject*/ ).runMethod(true,"getColor"));
 BA.debugLineNum = 3091;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 3092;BA.debugLine="bCancel.left=bCancel.left-20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 3093;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 3094;BA.debugLine="bCancel.Textsize=16";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 3095;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "lblcolorfondopanelinfo_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3096;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 3097;BA.debugLine="lblColorFondoPanelInfo.Color=BCColorPickerjamTabl";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolorfondopanelinfo" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_bccolorpickerjamtableview" /*RemoteObject*/ ).runClassMethod (b4j.docU.bccolorpicker.class, "_getselectedcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 3098;BA.debugLine="txtRGBColorFondoPanelInfo.Text=GetCssColorStringF";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtrgbcolorfondopanelinfo" /*RemoteObject*/ ).runMethod(true,"setText",__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_getcsscolorstringfromintcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lblcolorfondopanelinfo" /*RemoteObject*/ ).runMethod(true,"getColor"))));
 BA.debugLineNum = 3099;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _lblcolortextoencabezados_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblColorTextoEncabezados_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2957);
if (RapidSub.canDelegate("lblcolortextoencabezados_mouseclicked")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","lblcolortextoencabezados_mouseclicked", __ref, _eventdata); return;}
ResumableSub_lblColorTextoEncabezados_MouseClicked rsub = new ResumableSub_lblColorTextoEncabezados_MouseClicked(null,__ref,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblColorTextoEncabezados_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorTextoEncabezados_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref,RemoteObject _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblColorTextoEncabezados_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2957);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 2958;BA.debugLine="Dialog.Title=\"Selecciona color Texto Encabezados\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona color Texto Encabezados")));
 BA.debugLineNum = 2959;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 2960;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))));
 BA.debugLineNum = 2961;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrBCColorPickerJamTableView")),__ref.getField(false, "ba"));
 BA.debugLineNum = 2962;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "lblcolortextoencabezados_mouseclicked"),BA.numberCast(int.class, 0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 2964;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 2965;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 2966;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorT";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bccolorpickerjamtableview" /*RemoteObject*/ ).runClassMethod (b4j.docU.bccolorpicker.class, "_setselectedcolor" /*RemoteObject*/ ,__ref.getField(false,"_lblcolortextoencabezados" /*RemoteObject*/ ).runMethod(true,"getColor"));
 BA.debugLineNum = 2967;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 2968;BA.debugLine="bCancel.left=bCancel.left-20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 2969;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 2970;BA.debugLine="bCancel.Textsize=16";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 2971;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "lblcolortextoencabezados_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2972;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 2973;BA.debugLine="lblColorTextoEncabezados.Color=BCColorPickerjamTa";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolortextoencabezados" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_bccolorpickerjamtableview" /*RemoteObject*/ ).runClassMethod (b4j.docU.bccolorpicker.class, "_getselectedcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 2974;BA.debugLine="txtRGBColorTextoEncabezados.Text=GetCssColorStrin";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtrgbcolortextoencabezados" /*RemoteObject*/ ).runMethod(true,"setText",__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_getcsscolorstringfromintcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lblcolortextoencabezados" /*RemoteObject*/ ).runMethod(true,"getColor"))));
 BA.debugLineNum = 2975;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _lblcolortextopanelinfo_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblColorTextoPanelInfo_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3040);
if (RapidSub.canDelegate("lblcolortextopanelinfo_mouseclicked")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","lblcolortextopanelinfo_mouseclicked", __ref, _eventdata); return;}
ResumableSub_lblColorTextoPanelInfo_MouseClicked rsub = new ResumableSub_lblColorTextoPanelInfo_MouseClicked(null,__ref,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblColorTextoPanelInfo_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorTextoPanelInfo_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref,RemoteObject _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblColorTextoPanelInfo_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3040);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3041;BA.debugLine="Dialog.Title=\"Selecciona color Texto Panel Info\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona color Texto Panel Info")));
 BA.debugLineNum = 3042;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 3043;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))));
 BA.debugLineNum = 3044;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrBCColorPickerJamTableView")),__ref.getField(false, "ba"));
 BA.debugLineNum = 3045;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "lblcolortextopanelinfo_mouseclicked"),BA.numberCast(int.class, 0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 3047;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 3048;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 3049;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorT";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bccolorpickerjamtableview" /*RemoteObject*/ ).runClassMethod (b4j.docU.bccolorpicker.class, "_setselectedcolor" /*RemoteObject*/ ,__ref.getField(false,"_lblcolortextopanelinfo" /*RemoteObject*/ ).runMethod(true,"getColor"));
 BA.debugLineNum = 3050;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 3051;BA.debugLine="bCancel.left=bCancel.left-20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 3052;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 3053;BA.debugLine="bCancel.Textsize=16";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 3054;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "lblcolortextopanelinfo_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3055;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 3056;BA.debugLine="lblColorTextoPanelInfo.Color=BCColorPickerjamTabl";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolortextopanelinfo" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_bccolorpickerjamtableview" /*RemoteObject*/ ).runClassMethod (b4j.docU.bccolorpicker.class, "_getselectedcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 3057;BA.debugLine="txtRGBColorTextoPanelInfo.Text=GetCssColorStringF";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtrgbcolortextopanelinfo" /*RemoteObject*/ ).runMethod(true,"setText",__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_getcsscolorstringfromintcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lblcolortextopanelinfo" /*RemoteObject*/ ).runMethod(true,"getColor"))));
 BA.debugLineNum = 3058;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _lblinfo_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblInfo_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2551);
if (RapidSub.canDelegate("lblinfo_mouseclicked")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","lblinfo_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 2551;BA.debugLine="private Sub lblInfo_MouseClicked (EventData As Mou";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2553;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _lblresetcolorbordeitems_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorBordeItems_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3437);
if (RapidSub.canDelegate("lblresetcolorbordeitems_mouseclicked")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","lblresetcolorbordeitems_mouseclicked", __ref, _eventdata); return;}
ResumableSub_lblResetColorBordeItems_MouseClicked rsub = new ResumableSub_lblResetColorBordeItems_MouseClicked(null,__ref,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblResetColorBordeItems_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorBordeItems_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref,RemoteObject _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorBordeItems_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3437);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3438;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Resetear el color del Borde de los Items a su valor por defecto?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3439;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "lblresetcolorbordeitems_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3440;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 3441;BA.debugLine="txtRGBColorBordeItems.Text=GetCssColorStringFromI";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtrgbcolorbordeitems" /*RemoteObject*/ ).runMethod(true,"setText",__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_getcsscolorstringfromintcolor" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, ((int)0xff808080)))));
 BA.debugLineNum = 3442;BA.debugLine="lblColorBordeItems.Color=0xFF808080";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolorbordeitems" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xff808080)));
 BA.debugLineNum = 3443;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _lblresetcolorfondoencabezados_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorFondoEncabezados_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3389);
if (RapidSub.canDelegate("lblresetcolorfondoencabezados_mouseclicked")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","lblresetcolorfondoencabezados_mouseclicked", __ref, _eventdata); return;}
ResumableSub_lblResetColorFondoEncabezados_MouseClicked rsub = new ResumableSub_lblResetColorFondoEncabezados_MouseClicked(null,__ref,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblResetColorFondoEncabezados_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorFondoEncabezados_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref,RemoteObject _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorFondoEncabezados_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3389);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3390;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Resetear el color de Fondo de los Encabezados a su valor por defecto?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3391;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "lblresetcolorfondoencabezados_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3392;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 3393;BA.debugLine="txtRGBColorFondoEncabezados.Text=\"#004B55\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtrgbcolorfondoencabezados" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("#004B55"));
 BA.debugLineNum = 3394;BA.debugLine="lblColorFondoEncabezados.Color=HexToColor(\"#004B5";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolorfondoencabezados" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_hextocolor" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("#004B55"))));
 BA.debugLineNum = 3395;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _lblresetcolorfondofilaspares_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorFondoFilasPares_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3429);
if (RapidSub.canDelegate("lblresetcolorfondofilaspares_mouseclicked")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","lblresetcolorfondofilaspares_mouseclicked", __ref, _eventdata); return;}
ResumableSub_lblResetColorFondoFilasPares_MouseClicked rsub = new ResumableSub_lblResetColorFondoFilasPares_MouseClicked(null,__ref,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblResetColorFondoFilasPares_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorFondoFilasPares_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref,RemoteObject _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorFondoFilasPares_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3429);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3430;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Resetear el color de Fondo de las Filas Pares a su valor por defecto?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3431;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "lblresetcolorfondofilaspares_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3432;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 3433;BA.debugLine="txtRGBColorFondoFilasPares.Text=GetCssColorString";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtrgbcolorfondofilaspares" /*RemoteObject*/ ).runMethod(true,"setText",__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_getcsscolorstringfromintcolor" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, ((int)0xfff1f1f1)))));
 BA.debugLineNum = 3434;BA.debugLine="lblColorFondoFilasPares.Color=0xFFF1F1F1";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolorfondofilaspares" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xfff1f1f1)));
 BA.debugLineNum = 3435;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _lblresetcolorfondopanelinfo_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorFondoPanelInfo_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3405);
if (RapidSub.canDelegate("lblresetcolorfondopanelinfo_mouseclicked")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","lblresetcolorfondopanelinfo_mouseclicked", __ref, _eventdata); return;}
ResumableSub_lblResetColorFondoPanelInfo_MouseClicked rsub = new ResumableSub_lblResetColorFondoPanelInfo_MouseClicked(null,__ref,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblResetColorFondoPanelInfo_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorFondoPanelInfo_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref,RemoteObject _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorFondoPanelInfo_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3405);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3406;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Resetear el color de Fondo del Panel Info a su valor por defecto?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3407;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "lblresetcolorfondopanelinfo_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3408;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 3409;BA.debugLine="txtRGBColorFondoPanelInfo.Text=\"#FFF8C3\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtrgbcolorfondopanelinfo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("#FFF8C3"));
 BA.debugLineNum = 3410;BA.debugLine="lblColorFondoPanelInfo.Color=HexToColor(\"#FFF8C3\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolorfondopanelinfo" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_hextocolor" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("#FFF8C3"))));
 BA.debugLineNum = 3411;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _lblresetcolortextoencabezados_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorTextoEncabezados_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3397);
if (RapidSub.canDelegate("lblresetcolortextoencabezados_mouseclicked")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","lblresetcolortextoencabezados_mouseclicked", __ref, _eventdata); return;}
ResumableSub_lblResetColorTextoEncabezados_MouseClicked rsub = new ResumableSub_lblResetColorTextoEncabezados_MouseClicked(null,__ref,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblResetColorTextoEncabezados_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorTextoEncabezados_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref,RemoteObject _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorTextoEncabezados_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3397);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3398;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Resetear el color del Texto de los Encabezados a su valor por defecto?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3399;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "lblresetcolortextoencabezados_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3400;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 3401;BA.debugLine="txtRGBColorTextoEncabezados.Text=GetCssColorStrin";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtrgbcolortextoencabezados" /*RemoteObject*/ ).runMethod(true,"setText",__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_getcsscolorstringfromintcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"))));
 BA.debugLineNum = 3402;BA.debugLine="lblColorTextoEncabezados.Color=xui.Color_White";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolortextoencabezados" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 3403;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _lblresetcolortextopanelinfo_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorTextoPanelInfo_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3413);
if (RapidSub.canDelegate("lblresetcolortextopanelinfo_mouseclicked")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","lblresetcolortextopanelinfo_mouseclicked", __ref, _eventdata); return;}
ResumableSub_lblResetColorTextoPanelInfo_MouseClicked rsub = new ResumableSub_lblResetColorTextoPanelInfo_MouseClicked(null,__ref,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblResetColorTextoPanelInfo_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorTextoPanelInfo_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref,RemoteObject _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorTextoPanelInfo_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3413);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3414;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Resetear el color del Texto del Panel Info a su valor por defecto?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3415;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "lblresetcolortextopanelinfo_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3416;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 3417;BA.debugLine="txtRGBColorTextoPanelInfo.Text=GetCssColorStringF";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtrgbcolortextopanelinfo" /*RemoteObject*/ ).runMethod(true,"setText",__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_getcsscolorstringfromintcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"))));
 BA.debugLineNum = 3418;BA.debugLine="lblColorTextoPanelInfo.Color=xui.Color_Black";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolortextopanelinfo" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 3419;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _loadfile(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("LoadFile (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1156);
if (RapidSub.canDelegate("loadfile")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","loadfile", __ref, _f);}
ResumableSub_LoadFile rsub = new ResumableSub_LoadFile(null,__ref,_f);
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
public static class ResumableSub_LoadFile extends BA.ResumableSub {
public ResumableSub_LoadFile(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref,RemoteObject _f) {
this.parent = parent;
this.__ref = __ref;
this._f = _f;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _f;
RemoteObject _cancel = RemoteObject.createImmutable(false);
RemoteObject _s = RemoteObject.createImmutable("");
RemoteObject _datetimeformatant = RemoteObject.createImmutable("");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LoadFile (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1156);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("f", _f);
 BA.debugLineNum = 1157;BA.debugLine="Wait For (CheckChanges) Complete (Cancel As Boole";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "loadfile"), __ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_checkchanges" /*RemoteObject*/ ));
this.state = 23;
return;
case 23:
//C
this.state = 1;
_cancel = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Cancel", _cancel);
;
 BA.debugLineNum = 1158;BA.debugLine="If Cancel Then Return False";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (_cancel.<Boolean>get().booleanValue()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1159;BA.debugLine="CargandoDatos=True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_cargandodatos" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1160;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//try
this.state = 22;
this.catchState = 21;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 21;
 BA.debugLineNum = 1161;BA.debugLine="Dim s As String = File.ReadString(f, \"\")";
Debug.JustUpdateDeviceLine();
_s = parent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(_f),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 1162;BA.debugLine="CurrentFileString = s";
Debug.JustUpdateDeviceLine();
__ref.setField ("_currentfilestring" /*RemoteObject*/ ,_s);
 BA.debugLineNum = 1163;BA.debugLine="clvListaCampos.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 1164;BA.debugLine="lstPrimaryKey.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lstprimarykey" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1165;BA.debugLine="SetCurrentFile(f)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_setcurrentfile" /*RemoteObject*/ ,(Object)(_f));
 BA.debugLineNum = 1167;BA.debugLine="AddItemsFromString(s)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_additemsfromstring" /*RemoteObject*/ ,(Object)(_s));
 BA.debugLineNum = 1168;BA.debugLine="Wait For AddItemsFromString_Completed";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","additemsfromstring_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "loadfile"), null);
this.state = 24;
return;
case 24:
//C
this.state = 10;
;
 BA.debugLineNum = 1170;BA.debugLine="dragger.AddDragButtons";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dragger" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclvclvdragger.class, "_adddragbuttons" /*RemoteObject*/ );
 BA.debugLineNum = 1172;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"JRDC Query\"";
Debug.JustUpdateDeviceLine();
if (true) break;

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_datosorigendatos" /*RemoteObject*/ ).getField(true,"TipoOrigenDatos" /*RemoteObject*/ ),BA.ObjectToString("JRDC Query"))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1173;BA.debugLine="CargaCamposJRDCQuery(txtIpJRDC.Text,txtPuertoJR";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_cargacamposjrdcquery" /*void*/ ,(Object)(__ref.getField(false,"_txtipjrdc" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtpuertojrdc" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(__ref.getField(false,"_txtcomandojrdc" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txtparametrosjrdc" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 1174;BA.debugLine="wait for CargaCamposJRDCQuery_Completed";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","cargacamposjrdcquery_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "loadfile"), null);
this.state = 25;
return;
case 25:
//C
this.state = 13;
;
 if (true) break;
;
 BA.debugLineNum = 1176;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"JRDC Table\"";
Debug.JustUpdateDeviceLine();

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_datosorigendatos" /*RemoteObject*/ ).getField(true,"TipoOrigenDatos" /*RemoteObject*/ ),BA.ObjectToString("JRDC Table"))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1177;BA.debugLine="CargaCamposJRDCTable(txtIpJRDC.Text,txtPuertoJR";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_cargacamposjrdctable" /*void*/ ,(Object)(__ref.getField(false,"_txtipjrdc" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtpuertojrdc" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(__ref.getField(false,"_txtcomandojrdc" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txtparametrosjrdc" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 1178;BA.debugLine="Wait For CargaCamposJRDCTable_Completed";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","cargacamposjrdctable_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "loadfile"), null);
this.state = 26;
return;
case 26:
//C
this.state = 16;
;
 if (true) break;
;
 BA.debugLineNum = 1180;BA.debugLine="If FechaUltimaModificacion>-1 Then";
Debug.JustUpdateDeviceLine();

case 16:
//if
this.state = 19;
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_fechaultimamodificacion" /*RemoteObject*/ ),BA.numberCast(long.class, -(double) (0 + 1)))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 1181;BA.debugLine="Dim DateTimeFormatAnt As String=DateTime.DateFo";
Debug.JustUpdateDeviceLine();
_datetimeformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateTimeFormatAnt", _datetimeformatant);Debug.locals.put("DateTimeFormatAnt", _datetimeformatant);
 BA.debugLineNum = 1182;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.JustUpdateDeviceLine();
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 1183;BA.debugLine="frm.Title=frm.Title & \"   Fecha última modifica";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"getTitle"),RemoteObject.createImmutable("   Fecha última modificación: "),parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(true,"_fechaultimamodificacion" /*RemoteObject*/ )))));
 BA.debugLineNum = 1184;BA.debugLine="DateTime.DateFormat=DateTimeFormatAnt";
Debug.JustUpdateDeviceLine();
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_datetimeformatant);
 if (true) break;

case 19:
//C
this.state = 22;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 0;
 BA.debugLineNum = 1187;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 1188;BA.debugLine="wait for (Dialog.Show(LastException.Message, \"Ok";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "loadfile"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_show" /*RemoteObject*/ ,(Object)((parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable(("Ok"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("")))));
this.state = 27;
return;
case 27:
//C
this.state = 22;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1189;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
if (true) break;

case 22:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 1192;BA.debugLine="RecalcularIDOrdenColumnas";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_recalcularidordencolumnas" /*RemoteObject*/ );
 BA.debugLineNum = 1193;BA.debugLine="CargandoDatos=False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_cargandodatos" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 1194;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1195;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _additemsfromstring_completed(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _mainform_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("MainForm_Resize (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,311);
if (RapidSub.canDelegate("mainform_resize")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","mainform_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 311;BA.debugLine="private Sub MainForm_Resize (Width As Double, Heig";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 312;BA.debugLine="dragger.Resize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dragger" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclvclvdragger.class, "_resize" /*RemoteObject*/ );
 BA.debugLineNum = 313;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _mnuhelp_action(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("mnuHelp_Action (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2573);
if (RapidSub.canDelegate("mnuhelp_action")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","mnuhelp_action", __ref); return;}
ResumableSub_mnuHelp_Action rsub = new ResumableSub_mnuHelp_Action(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_mnuHelp_Action extends BA.ResumableSub {
public ResumableSub_mnuHelp_Action(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _rbool = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("mnuHelp_Action (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2573);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 2574;BA.debugLine="wait for (Help) complete (rBool As Boolean)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "mnuhelp_action"), __ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_help" /*RemoteObject*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 2575;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _mnuload_action(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("mnuLoad_Action (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1145);
if (RapidSub.canDelegate("mnuload_action")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","mnuload_action", __ref); return;}
ResumableSub_mnuLoad_Action rsub = new ResumableSub_mnuLoad_Action(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_mnuLoad_Action extends BA.ResumableSub {
public ResumableSub_mnuLoad_Action(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _f = RemoteObject.createImmutable("");
RemoteObject _rbool = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("mnuLoad_Action (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1145);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1146;BA.debugLine="Dim f As String = FileChooser.ShowOpen(frm)";
Debug.JustUpdateDeviceLine();
_f = __ref.getField(false,"_filechooser" /*RemoteObject*/ ).runMethodAndSync(true,"ShowOpen",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )));Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 1147;BA.debugLine="If f <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("!",_f,BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1148;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.WAIT";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"));
 BA.debugLineNum = 1149;BA.debugLine="DeshabilitarNodos";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_deshabilitarnodos" /*RemoteObject*/ );
 BA.debugLineNum = 1150;BA.debugLine="wait for (LoadFile(f)) complete (rBool As Boolea";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "mnuload_action"), __ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_loadfile" /*RemoteObject*/ ,(Object)(_f)));
this.state = 5;
return;
case 5:
//C
this.state = 4;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 1151;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 1152;BA.debugLine="HabilitarNodos";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_habilitarnodos" /*RemoteObject*/ );
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1154;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _mnunew_action(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("mnuNew_Action (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1291);
if (RapidSub.canDelegate("mnunew_action")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","mnunew_action", __ref); return;}
ResumableSub_mnuNew_Action rsub = new ResumableSub_mnuNew_Action(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_mnuNew_Action extends BA.ResumableSub {
public ResumableSub_mnuNew_Action(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _cancel = RemoteObject.createImmutable(false);
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("mnuNew_Action (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1291);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1292;BA.debugLine="Wait For (CheckChanges) Complete (Cancel As Boole";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "mnunew_action"), __ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_checkchanges" /*RemoteObject*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_cancel = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Cancel", _cancel);
;
 BA.debugLineNum = 1293;BA.debugLine="If Cancel Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (_cancel.<Boolean>get().booleanValue()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 1294;BA.debugLine="CreateTipoOrigenDatos(\"\",\"\",\"\",\"\",Null)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_createtipoorigendatos" /*RemoteObject*/ ,(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString(parent.__c.getField(false,"Null"))));
 BA.debugLineNum = 1297;BA.debugLine="Dim bc As ByteConverter";
Debug.JustUpdateDeviceLine();
_bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 1298;BA.debugLine="txtRGBColorFondoEncabezados.Text=\"#004B55\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtrgbcolorfondoencabezados" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("#004B55"));
 BA.debugLineNum = 1299;BA.debugLine="lblColorFondoEncabezados.Color=bc.IntsFromBytes(b";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolorfondoencabezados" /*RemoteObject*/ ).runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),__ref.getField(false,"_txtrgbcolorfondoencabezados" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1301;BA.debugLine="txtRGBColorTextoEncabezados.Text=GetCssColorStrin";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtrgbcolortextoencabezados" /*RemoteObject*/ ).runMethod(true,"setText",__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_getcsscolorstringfromintcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"))));
 BA.debugLineNum = 1302;BA.debugLine="lblColorTextoEncabezados.Color=bc.IntsFromBytes(b";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolortextoencabezados" /*RemoteObject*/ ).runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),__ref.getField(false,"_txtrgbcolortextoencabezados" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1304;BA.debugLine="txtRGBColorFondoPanelInfo.Text=\"#FFF8C3\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtrgbcolorfondopanelinfo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("#FFF8C3"));
 BA.debugLineNum = 1305;BA.debugLine="lblColorFondoPanelInfo.Color=bc.IntsFromBytes(bc.";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolorfondopanelinfo" /*RemoteObject*/ ).runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),__ref.getField(false,"_txtrgbcolorfondopanelinfo" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1307;BA.debugLine="txtRGBColorTextoPanelInfo.Text=GetCssColorStringF";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtrgbcolortextopanelinfo" /*RemoteObject*/ ).runMethod(true,"setText",__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_getcsscolorstringfromintcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"))));
 BA.debugLineNum = 1308;BA.debugLine="lblColorTextoPanelInfo.Color=bc.IntsFromBytes(bc.";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolortextopanelinfo" /*RemoteObject*/ ).runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),__ref.getField(false,"_txtrgbcolortextopanelinfo" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1310;BA.debugLine="txtRGBColorFondoFilasImpares.Text=GetCssColorStri";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtrgbcolorfondofilasimpares" /*RemoteObject*/ ).runMethod(true,"setText",__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_getcsscolorstringfromintcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"))));
 BA.debugLineNum = 1311;BA.debugLine="lblColorFondoFilasImpares.Color=bc.IntsFromBytes(";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolorfondofilasimpares" /*RemoteObject*/ ).runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),__ref.getField(false,"_txtrgbcolorfondofilasimpares" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1313;BA.debugLine="txtRGBColorFondoFilasPares.Text=\"#F1F1F1\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtrgbcolorfondofilaspares" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("#F1F1F1"));
 BA.debugLineNum = 1314;BA.debugLine="lblColorFondoFilasPares.Color=bc.IntsFromBytes(bc";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolorfondofilaspares" /*RemoteObject*/ ).runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),__ref.getField(false,"_txtrgbcolorfondofilaspares" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1316;BA.debugLine="NewFile";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_newfile" /*void*/ );
 BA.debugLineNum = 1317;BA.debugLine="wait for NewFile_Completed";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","newfile_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "mnunew_action"), null);
this.state = 8;
return;
case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 1319;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _newfile_completed(RemoteObject __ref) throws Exception{
}
public static void  _mnusalir_action(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("mnuSalir_Action (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,267);
if (RapidSub.canDelegate("mnusalir_action")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","mnusalir_action", __ref); return;}
ResumableSub_mnuSalir_Action rsub = new ResumableSub_mnuSalir_Action(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_mnuSalir_Action extends BA.ResumableSub {
public ResumableSub_mnuSalir_Action(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _cancel = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("mnuSalir_Action (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,267);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 268;BA.debugLine="Wait For (CheckChanges) Complete (Cancel As Boole";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "mnusalir_action"), __ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_checkchanges" /*RemoteObject*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_cancel = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Cancel", _cancel);
;
 BA.debugLineNum = 269;BA.debugLine="If Cancel Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (_cancel.<Boolean>get().booleanValue()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 275;BA.debugLine="frm.Close";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 276;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _mnusave_action(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("mnuSave_Action (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1833);
if (RapidSub.canDelegate("mnusave_action")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","mnusave_action", __ref); return;}
ResumableSub_mnuSave_Action rsub = new ResumableSub_mnuSave_Action(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_mnuSave_Action extends BA.ResumableSub {
public ResumableSub_mnuSave_Action(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _camposok = RemoteObject.createImmutable(false);
RemoteObject _dirjson = RemoteObject.createImmutable("");
RemoteObject _nombrejson = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("mnuSave_Action (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1833);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1834;BA.debugLine="If CurrentFile = \"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_currentfile" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 16;
 BA.debugLineNum = 1835;BA.debugLine="mnuSaveAs_Action";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_mnusaveas_action" /*void*/ );
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1838;BA.debugLine="Wait For (CheckForWarnings) Complete (CamposOK A";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "mnusave_action"), __ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_checkforwarnings" /*RemoteObject*/ ));
this.state = 17;
return;
case 17:
//C
this.state = 6;
_camposok = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("CamposOK", _camposok);
;
 BA.debugLineNum = 1839;BA.debugLine="If CamposOK Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 6:
//if
this.state = 15;
if (_camposok.<Boolean>get().booleanValue()) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1840;BA.debugLine="CurrentFileString = ExportToString";
Debug.JustUpdateDeviceLine();
__ref.setField ("_currentfilestring" /*RemoteObject*/ ,__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_exporttostring" /*RemoteObject*/ ));
 BA.debugLineNum = 1841;BA.debugLine="Dim DirJSON As String=File.GetFileParent(Curren";
Debug.JustUpdateDeviceLine();
_dirjson = parent.__c.getField(false,"File").runMethod(true,"GetFileParent",(Object)(__ref.getField(true,"_currentfile" /*RemoteObject*/ )));Debug.locals.put("DirJSON", _dirjson);Debug.locals.put("DirJSON", _dirjson);
 BA.debugLineNum = 1842;BA.debugLine="Dim NombreJSON As String=File.GetName(CurrentFi";
Debug.JustUpdateDeviceLine();
_nombrejson = parent.__c.getField(false,"File").runMethod(true,"GetName",(Object)(__ref.getField(true,"_currentfile" /*RemoteObject*/ )));Debug.locals.put("NombreJSON", _nombrejson);Debug.locals.put("NombreJSON", _nombrejson);
 BA.debugLineNum = 1845;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
if (true) break;

case 9:
//try
this.state = 14;
this.catchState = 13;
this.state = 11;
if (true) break;

case 11:
//C
this.state = 14;
this.catchState = 13;
 BA.debugLineNum = 1846;BA.debugLine="File.WriteString(CurrentFile, \"\", CurrentFileS";
Debug.JustUpdateDeviceLine();
parent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(__ref.getField(true,"_currentfile" /*RemoteObject*/ )),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(true,"_currentfilestring" /*RemoteObject*/ )));
 Debug.CheckDeviceExceptions();
if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
 BA.debugLineNum = 1853;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"No ha sid";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible grabar el fichero."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1854;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "mnusave_action"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 14;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1855;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
;
 BA.debugLineNum = 1857;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Fichero gr";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Fichero grabado."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("("),__ref.getField(true,"_currentfile" /*RemoteObject*/ ),RemoteObject.createImmutable(")"))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1858;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "mnusave_action"), _msa);
this.state = 19;
return;
case 19:
//C
this.state = 15;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1863;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"No olvides";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No olvides SINCRONIZAR la carpeta Files en el IDE")),(Object)(RemoteObject.createImmutable("IMPORTANTE")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1864;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "mnusave_action"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 15;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 1867;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _mnusaveas_action(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("mnuSaveAs_Action (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2093);
if (RapidSub.canDelegate("mnusaveas_action")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","mnusaveas_action", __ref); return;}
ResumableSub_mnuSaveAs_Action rsub = new ResumableSub_mnuSaveAs_Action(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_mnuSaveAs_Action extends BA.ResumableSub {
public ResumableSub_mnuSaveAs_Action(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _camposok = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _f = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("mnuSaveAs_Action (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2093);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 2094;BA.debugLine="Wait For (CheckForWarnings) Complete (CamposOK As";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "mnusaveas_action"), __ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_checkforwarnings" /*RemoteObject*/ ));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_camposok = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("CamposOK", _camposok);
;
 BA.debugLineNum = 2095;BA.debugLine="If CamposOK Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 10;
if (_camposok.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2096;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Ubicar el f";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Ubicar el fichero en el directorio FILES de la aplicación en la que se vaya a usar.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2097;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "mnusaveas_action"), _msa);
this.state = 12;
return;
case 12:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2098;BA.debugLine="Dim f As String = FileChooser.ShowSave(frm)";
Debug.JustUpdateDeviceLine();
_f = __ref.getField(false,"_filechooser" /*RemoteObject*/ ).runMethodAndSync(true,"ShowSave",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )));Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 2099;BA.debugLine="If f = \"\" Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_f,BA.ObjectToString(""))) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) return ;
if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 2100;BA.debugLine="SetCurrentFile(f)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_setcurrentfile" /*RemoteObject*/ ,(Object)(_f));
 BA.debugLineNum = 2101;BA.debugLine="mnuSave_Action";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_mnusave_action" /*void*/ );
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 2103;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _mostrardatosorigendatos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MostrarDatosOrigenDatos (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1507);
if (RapidSub.canDelegate("mostrardatosorigendatos")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","mostrardatosorigendatos", __ref);}
RemoteObject _paramtext = RemoteObject.createImmutable("");
 BA.debugLineNum = 1507;BA.debugLine="private Sub MostrarDatosOrigenDatos";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1508;BA.debugLine="txtTipoOrigenDatos.Text=DatosOrigenDatos.TipoOrig";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txttipoorigendatos" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_datosorigendatos" /*RemoteObject*/ ).getField(true,"TipoOrigenDatos" /*RemoteObject*/ ));
 BA.debugLineNum = 1509;BA.debugLine="txtIpJRDC.Text=DatosOrigenDatos.IpJRDC";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtipjrdc" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_datosorigendatos" /*RemoteObject*/ ).getField(true,"IpJRDC" /*RemoteObject*/ ));
 BA.debugLineNum = 1510;BA.debugLine="txtPuertoJRDC.Text=DatosOrigenDatos.PuertoJRDC";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtpuertojrdc" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_datosorigendatos" /*RemoteObject*/ ).getField(true,"PuertoJRDC" /*RemoteObject*/ ));
 BA.debugLineNum = 1511;BA.debugLine="txtComandoJRDC.Text=DatosOrigenDatos.ComandoJRDC";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtcomandojrdc" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_datosorigendatos" /*RemoteObject*/ ).getField(true,"ComandoJRDC" /*RemoteObject*/ ));
 BA.debugLineNum = 1512;BA.debugLine="Dim paramText As String=DatosOrigenDatos.Parametr";
Debug.JustUpdateDeviceLine();
_paramtext = __ref.getField(false,"_datosorigendatos" /*RemoteObject*/ ).getField(true,"ParametrosJRDC" /*RemoteObject*/ );Debug.locals.put("paramText", _paramtext);Debug.locals.put("paramText", _paramtext);
 BA.debugLineNum = 1513;BA.debugLine="txtParametrosJRDC.Text=paramText.Trim";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtparametrosjrdc" /*RemoteObject*/ ).runMethod(true,"setText",_paramtext.runMethod(true,"trim"));
 BA.debugLineNum = 1514;BA.debugLine="pnlOrigenSQL.Visible=True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pnlorigensql" /*RemoteObject*/ ).runMethod(true,"setVisible",jamtableclvcamposbuilder.__c.getField(true,"True"));
 BA.debugLineNum = 1515;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _newfile(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("NewFile (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1329);
if (RapidSub.canDelegate("newfile")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","newfile", __ref); return;}
ResumableSub_NewFile rsub = new ResumableSub_NewFile(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_NewFile extends BA.ResumableSub {
public ResumableSub_NewFile(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _rbool = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("NewFile (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1329);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1330;BA.debugLine="wait for (ConfigurarOrigenDatos) complete (rBool";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "newfile"), __ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_configurarorigendatos" /*RemoteObject*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 1331;BA.debugLine="CurrentFileString=ExportToString  ' crea un JSON";
Debug.JustUpdateDeviceLine();
__ref.setField ("_currentfilestring" /*RemoteObject*/ ,__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_exporttostring" /*RemoteObject*/ ));
 BA.debugLineNum = 1332;BA.debugLine="CallSubDelayed(Me,\"NewFile_Completed\")";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.createImmutable("NewFile_Completed")));
 BA.debugLineNum = 1333;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _nombrescamposclvincluidosenformulascamposcalculados(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("NombresCamposCLVIncluidosEnFormulasCamposCalculados (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1758);
if (RapidSub.canDelegate("nombrescamposclvincluidosenformulascamposcalculados")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","nombrescamposclvincluidosenformulascamposcalculados", __ref);}
RemoteObject _lstnombrescamposclvincluidosenformulascamposcalculados = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstcamposenclv = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _formulacampocalculado = RemoteObject.createImmutable("");
RemoteObject _lstnombrescamposincluidosenformula = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _pattern = RemoteObject.createImmutable("");
RemoteObject _matcher1 = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
int _k = 0;
 BA.debugLineNum = 1758;BA.debugLine="private Sub NombresCamposCLVIncluidosEnFormulasCam";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1759;BA.debugLine="Dim lstNombresCamposCLVIncluidosEnFormulasCamposC";
Debug.JustUpdateDeviceLine();
_lstnombrescamposclvincluidosenformulascamposcalculados = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstNombresCamposCLVIncluidosEnFormulasCamposCalculados", _lstnombrescamposclvincluidosenformulascamposcalculados);
 BA.debugLineNum = 1760;BA.debugLine="lstNombresCamposCLVIncluidosEnFormulasCamposCalcu";
Debug.JustUpdateDeviceLine();
_lstnombrescamposclvincluidosenformulascamposcalculados.runVoidMethod ("Initialize");
 BA.debugLineNum = 1761;BA.debugLine="Dim lstCamposEnCLV As List=CargaCamposCLV";
Debug.JustUpdateDeviceLine();
_lstcamposenclv = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstcamposenclv = __ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_cargacamposclv" /*RemoteObject*/ );Debug.locals.put("lstCamposEnCLV", _lstcamposenclv);Debug.locals.put("lstCamposEnCLV", _lstcamposenclv);
 BA.debugLineNum = 1762;BA.debugLine="For i=0 To lstCamposEnCLV.Size-1";
Debug.JustUpdateDeviceLine();
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_lstcamposenclv.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1763;BA.debugLine="Dim m As Map=lstCamposEnCLV.Get(i)";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstcamposenclv.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 1764;BA.debugLine="If True=m.Get(\"CampoCalculado\") Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",jamtableclvcamposbuilder.__c.getField(true,"True"),BA.ObjectToBoolean(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoCalculado"))))))) { 
 BA.debugLineNum = 1765;BA.debugLine="Dim FormulaCampoCalculado As String=m.Get(\"Camp";
Debug.JustUpdateDeviceLine();
_formulacampocalculado = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Campo")))));Debug.locals.put("FormulaCampoCalculado", _formulacampocalculado);Debug.locals.put("FormulaCampoCalculado", _formulacampocalculado);
 BA.debugLineNum = 1766;BA.debugLine="Dim lstNombresCamposIncluidosEnFormula As List";
Debug.JustUpdateDeviceLine();
_lstnombrescamposincluidosenformula = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstNombresCamposIncluidosEnFormula", _lstnombrescamposincluidosenformula);
 BA.debugLineNum = 1767;BA.debugLine="lstNombresCamposIncluidosEnFormula.Initialize";
Debug.JustUpdateDeviceLine();
_lstnombrescamposincluidosenformula.runVoidMethod ("Initialize");
 BA.debugLineNum = 1768;BA.debugLine="Dim pattern As String";
Debug.JustUpdateDeviceLine();
_pattern = RemoteObject.createImmutable("");Debug.locals.put("pattern", _pattern);
 BA.debugLineNum = 1769;BA.debugLine="pattern = \"\\[(.*?)\\]\"  ' texto entre brackets";
Debug.JustUpdateDeviceLine();
_pattern = BA.ObjectToString("\\[(.*?)\\]");Debug.locals.put("pattern", _pattern);
 BA.debugLineNum = 1770;BA.debugLine="Dim Matcher1 As Matcher";
Debug.JustUpdateDeviceLine();
_matcher1 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");Debug.locals.put("Matcher1", _matcher1);
 BA.debugLineNum = 1771;BA.debugLine="Matcher1 = Regex.Matcher(pattern, FormulaCampoC";
Debug.JustUpdateDeviceLine();
_matcher1 = jamtableclvcamposbuilder.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(_pattern),(Object)(_formulacampocalculado));Debug.locals.put("Matcher1", _matcher1);
 BA.debugLineNum = 1772;BA.debugLine="Do While Matcher1.Find";
Debug.JustUpdateDeviceLine();
while (_matcher1.runMethod(true,"Find").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1773;BA.debugLine="Log(\"Found: \" & Matcher1.Match)";
Debug.JustUpdateDeviceLine();
jamtableclvcamposbuilder.__c.runVoidMethod ("LogImpl","9178061327",RemoteObject.concat(RemoteObject.createImmutable("Found: "),_matcher1.runMethod(true,"getMatch")),0);
 BA.debugLineNum = 1775;BA.debugLine="lstNombresCamposIncluidosEnFormula.Add(Matcher";
Debug.JustUpdateDeviceLine();
_lstnombrescamposincluidosenformula.runVoidMethod ("Add",(Object)((_matcher1.runMethod(true,"getMatch").runMethod(true,"replace",(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString("]")),(Object)(RemoteObject.createImmutable(""))))));
 }
;
 BA.debugLineNum = 1778;BA.debugLine="For k=0 To lstNombresCamposIncluidosEnFormula.S";
Debug.JustUpdateDeviceLine();
{
final int step18 = 1;
final int limit18 = RemoteObject.solve(new RemoteObject[] {_lstnombrescamposincluidosenformula.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_k = 0 ;
for (;(step18 > 0 && _k <= limit18) || (step18 < 0 && _k >= limit18) ;_k = ((int)(0 + _k + step18))  ) {
Debug.locals.put("k", _k);
 BA.debugLineNum = 1779;BA.debugLine="If lstNombresCamposCLVIncluidosEnFormulasCampo";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_lstnombrescamposclvincluidosenformulascamposcalculados.runMethod(true,"IndexOf",(Object)(_lstnombrescamposincluidosenformula.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _k))))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 1780;BA.debugLine="lstNombresCamposCLVIncluidosEnFormulasCamposC";
Debug.JustUpdateDeviceLine();
_lstnombrescamposclvincluidosenformulascamposcalculados.runVoidMethod ("Add",(Object)(_lstnombrescamposincluidosenformula.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _k)))));
 };
 }
}Debug.locals.put("k", _k);
;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1785;BA.debugLine="Return lstNombresCamposCLVIncluidosEnFormulasCamp";
Debug.JustUpdateDeviceLine();
if (true) return _lstnombrescamposclvincluidosenformulascamposcalculados;
 BA.debugLineNum = 1786;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nombrescamposclvnocalculados(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("NombresCamposCLVNoCalculados (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1745);
if (RapidSub.canDelegate("nombrescamposclvnocalculados")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","nombrescamposclvnocalculados", __ref);}
RemoteObject _lstnombrescamposclvnocalculados = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstcamposenclv = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 1745;BA.debugLine="private Sub NombresCamposCLVNoCalculados As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1746;BA.debugLine="Dim lstNombresCamposCLVNoCalculados As List";
Debug.JustUpdateDeviceLine();
_lstnombrescamposclvnocalculados = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstNombresCamposCLVNoCalculados", _lstnombrescamposclvnocalculados);
 BA.debugLineNum = 1747;BA.debugLine="lstNombresCamposCLVNoCalculados.Initialize";
Debug.JustUpdateDeviceLine();
_lstnombrescamposclvnocalculados.runVoidMethod ("Initialize");
 BA.debugLineNum = 1748;BA.debugLine="Dim lstCamposEnCLV As List=CargaCamposCLV";
Debug.JustUpdateDeviceLine();
_lstcamposenclv = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstcamposenclv = __ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_cargacamposclv" /*RemoteObject*/ );Debug.locals.put("lstCamposEnCLV", _lstcamposenclv);Debug.locals.put("lstCamposEnCLV", _lstcamposenclv);
 BA.debugLineNum = 1749;BA.debugLine="For i=0 To lstCamposEnCLV.Size-1";
Debug.JustUpdateDeviceLine();
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_lstcamposenclv.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1750;BA.debugLine="Dim m As Map=lstCamposEnCLV.Get(i)";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstcamposenclv.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 1751;BA.debugLine="If False=m.Get(\"CampoCalculado\") Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",jamtableclvcamposbuilder.__c.getField(true,"False"),BA.ObjectToBoolean(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoCalculado"))))))) { 
 BA.debugLineNum = 1752;BA.debugLine="lstNombresCamposCLVNoCalculados.Add(m.Get(\"Camp";
Debug.JustUpdateDeviceLine();
_lstnombrescamposclvnocalculados.runVoidMethod ("Add",(Object)(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Campo"))))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1755;BA.debugLine="Return lstNombresCamposCLVNoCalculados";
Debug.JustUpdateDeviceLine();
if (true) return _lstnombrescamposclvnocalculados;
 BA.debugLineNum = 1756;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _recalcularidordencolumnas(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RecalcularIDOrdenColumnas (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2399);
if (RapidSub.canDelegate("recalcularidordencolumnas")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","recalcularidordencolumnas", __ref);}
RemoteObject _ordencolacum = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 2399;BA.debugLine="private Sub RecalcularIDOrdenColumnas";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2400;BA.debugLine="Dim OrdenColAcum As Int";
Debug.JustUpdateDeviceLine();
_ordencolacum = RemoteObject.createImmutable(0);Debug.locals.put("OrdenColAcum", _ordencolacum);
 BA.debugLineNum = 2401;BA.debugLine="For i=0 To clvListaCampos.Size-1";
Debug.JustUpdateDeviceLine();
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2402;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValu";
Debug.JustUpdateDeviceLine();
_clviv = (__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 2403;BA.debugLine="clvIV.txtID.Text=i";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtID" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(_i));
 BA.debugLineNum = 2406;BA.debugLine="OrdenColAcum=OrdenColAcum+1";
Debug.JustUpdateDeviceLine();
_ordencolacum = RemoteObject.solve(new RemoteObject[] {_ordencolacum,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("OrdenColAcum", _ordencolacum);
 BA.debugLineNum = 2410;BA.debugLine="If ColActualCLV=Col1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_colactualclv" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_col1" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 2411;BA.debugLine="ColActualCLV=Col2";
Debug.JustUpdateDeviceLine();
__ref.setField ("_colactualclv" /*RemoteObject*/ ,__ref.getField(true,"_col2" /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 2413;BA.debugLine="ColActualCLV=Col1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_colactualclv" /*RemoteObject*/ ,__ref.getField(true,"_col1" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 2415;BA.debugLine="Dim p As B4XView=clvListaCampos.GetPanel(i)";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 2416;BA.debugLine="p.Color=ColActualCLV";
Debug.JustUpdateDeviceLine();
_p.runMethod(true,"setColor",__ref.getField(true,"_colactualclv" /*RemoteObject*/ ));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2418;BA.debugLine="Log(\"RecalcularIDOrdenColumnas\")";
Debug.JustUpdateDeviceLine();
jamtableclvcamposbuilder.__c.runVoidMethod ("LogImpl","9178913299",RemoteObject.createImmutable("RecalcularIDOrdenColumnas"),0);
 BA.debugLineNum = 2419;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _recalcularordenkeyid(RemoteObject __ref,RemoteObject _keyideliminada) throws Exception{
try {
		Debug.PushSubsStack("RecalcularOrdenKeyID (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,2421);
if (RapidSub.canDelegate("recalcularordenkeyid")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","recalcularordenkeyid", __ref, _keyideliminada);}
int _i = 0;
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue");
RemoteObject _keyidlineaclv = RemoteObject.createImmutable(0);
Debug.locals.put("KeyIDEliminada", _keyideliminada);
 BA.debugLineNum = 2421;BA.debugLine="private Sub RecalcularOrdenKeyID(KeyIDEliminada As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2422;BA.debugLine="For i=0 To clvListaCampos.Size-1";
Debug.JustUpdateDeviceLine();
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2423;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValu";
Debug.JustUpdateDeviceLine();
_clviv = (__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 2424;BA.debugLine="Dim KeyIDLineaCLV As Int=clvIV.lblOrdenKeyID.Tex";
Debug.JustUpdateDeviceLine();
_keyidlineaclv = BA.numberCast(int.class, _clviv.getField(false,"lblOrdenKeyID" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("KeyIDLineaCLV", _keyidlineaclv);Debug.locals.put("KeyIDLineaCLV", _keyidlineaclv);
 BA.debugLineNum = 2425;BA.debugLine="If KeyIDLineaCLV>KeyIDEliminada Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_keyidlineaclv,BA.numberCast(double.class, _keyideliminada))) { 
 BA.debugLineNum = 2426;BA.debugLine="clvIV.lblOrdenKeyID.Text=(KeyIDLineaCLV-1)";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblOrdenKeyID" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString((RemoteObject.solve(new RemoteObject[] {_keyidlineaclv,RemoteObject.createImmutable(1)}, "-",1, 1))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2429;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _recent_click(RemoteObject __ref,RemoteObject _recentfile) throws Exception{
try {
		Debug.PushSubsStack("Recent_Click (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,279);
if (RapidSub.canDelegate("recent_click")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","recent_click", __ref, _recentfile); return;}
ResumableSub_Recent_Click rsub = new ResumableSub_Recent_Click(null,__ref,_recentfile);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Recent_Click extends BA.ResumableSub {
public ResumableSub_Recent_Click(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref,RemoteObject _recentfile) {
this.parent = parent;
this.__ref = __ref;
this._recentfile = _recentfile;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _recentfile;
RemoteObject _rbool = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Recent_Click (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,279);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("RecentFile", _recentfile);
 BA.debugLineNum = 280;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.WAIT";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"));
 BA.debugLineNum = 281;BA.debugLine="DeshabilitarNodos";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_deshabilitarnodos" /*RemoteObject*/ );
 BA.debugLineNum = 282;BA.debugLine="wait for (LoadFile(RecentFile)) complete (rBool A";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "recent_click"), __ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_loadfile" /*RemoteObject*/ ,(Object)(_recentfile)));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 283;BA.debugLine="HabilitarNodos";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_habilitarnodos" /*RemoteObject*/ );
 BA.debugLineNum = 284;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 285;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _resetcolorfondofilasimpares_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("ResetColorFondoFilasImpares_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3421);
if (RapidSub.canDelegate("resetcolorfondofilasimpares_mouseclicked")) { __ref.runUserSub(false, "jamtableclvcamposbuilder","resetcolorfondofilasimpares_mouseclicked", __ref, _eventdata); return;}
ResumableSub_ResetColorFondoFilasImpares_MouseClicked rsub = new ResumableSub_ResetColorFondoFilasImpares_MouseClicked(null,__ref,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ResetColorFondoFilasImpares_MouseClicked extends BA.ResumableSub {
public ResumableSub_ResetColorFondoFilasImpares_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,RemoteObject __ref,RemoteObject _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamtableclvcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ResetColorFondoFilasImpares_MouseClicked (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3421);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3422;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Resetear el color de Fondo de las Filas Impares a su valor por defecto?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3423;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableclvcamposbuilder", "resetcolorfondofilasimpares_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3424;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 3425;BA.debugLine="txtRGBColorFondoFilasImpares.Text=GetCssColorStri";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtrgbcolorfondofilasimpares" /*RemoteObject*/ ).runMethod(true,"setText",__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_getcsscolorstringfromintcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"))));
 BA.debugLineNum = 3426;BA.debugLine="lblColorFondoFilasImpares.Color=xui.Color_White";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblcolorfondofilasimpares" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 3427;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _setcurrentfile(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetCurrentFile (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,1197);
if (RapidSub.canDelegate("setcurrentfile")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","setcurrentfile", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 1197;BA.debugLine="private Sub SetCurrentFile (f As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1198;BA.debugLine="CurrentFile = f";
Debug.JustUpdateDeviceLine();
__ref.setField ("_currentfile" /*RemoteObject*/ ,_f);
 BA.debugLineNum = 1199;BA.debugLine="frm.Title = $\"CamposBuilder ($1.2{version})\"$";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",(RemoteObject.concat(RemoteObject.createImmutable("CamposBuilder ("),jamtableclvcamposbuilder.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((__ref.getField(true,"_version" /*RemoteObject*/ )))),RemoteObject.createImmutable(")"))));
 BA.debugLineNum = 1200;BA.debugLine="If f <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_f,BA.ObjectToString(""))) { 
 BA.debugLineNum = 1201;BA.debugLine="frm.Title = frm.Title & \" - \" & File.GetName(f)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"getTitle"),RemoteObject.createImmutable(" - "),jamtableclvcamposbuilder.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_f))));
 };
 BA.debugLineNum = 1204;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setformmaximized(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetFormMaximized (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,252);
if (RapidSub.canDelegate("setformmaximized")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","setformmaximized", __ref, _f);}
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("f", _f);
 BA.debugLineNum = 252;BA.debugLine="private Sub SetFormMaximized(f As Form)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 254;BA.debugLine="Dim joForm As JavaObject = f";
Debug.JustUpdateDeviceLine();
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _f);Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 256;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.JustUpdateDeviceLine();
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 258;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.JustUpdateDeviceLine();
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(jamtableclvcamposbuilder.__c.getField(true,"True"))})));
 BA.debugLineNum = 259;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlightthemedate(RemoteObject __ref,RemoteObject _datetemplate) throws Exception{
try {
		Debug.PushSubsStack("SetLightThemeDate (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3740);
if (RapidSub.canDelegate("setlightthemedate")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","setlightthemedate", __ref, _datetemplate);}
RemoteObject _textcolor = RemoteObject.createImmutable(0);
RemoteObject _x = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("datetemplate", _datetemplate);
 BA.debugLineNum = 3740;BA.debugLine="Sub SetLightThemeDate(datetemplate As B4XDateTempl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3741;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
Debug.JustUpdateDeviceLine();
_textcolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))));Debug.locals.put("TextColor", _textcolor);Debug.locals.put("TextColor", _textcolor);
 BA.debugLineNum = 3742;BA.debugLine="datetemplate.DaysInWeekColor = xui.Color_Black";
Debug.JustUpdateDeviceLine();
_datetemplate.setField ("_daysinweekcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 3743;BA.debugLine="datetemplate.SelectedColor = xui.Color_ARGB(0xFF,";
Debug.JustUpdateDeviceLine();
_datetemplate.setField ("_selectedcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x39))),(Object)(BA.numberCast(int.class, ((int)0xd7))),(Object)(BA.numberCast(int.class, ((int)0xce)))));
 BA.debugLineNum = 3744;BA.debugLine="datetemplate.HighlightedColor = xui.Color_ARGB(0x";
Debug.JustUpdateDeviceLine();
_datetemplate.setField ("_highlightedcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x00))),(Object)(BA.numberCast(int.class, ((int)0xce))),(Object)(BA.numberCast(int.class, ((int)0xff)))));
 BA.debugLineNum = 3745;BA.debugLine="datetemplate.DaysInMonthColor = TextColor";
Debug.JustUpdateDeviceLine();
_datetemplate.setField ("_daysinmonthcolor" /*RemoteObject*/ ,_textcolor);
 BA.debugLineNum = 3746;BA.debugLine="datetemplate.lblMonth.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
_datetemplate.getField(false,"_lblmonth" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);
 BA.debugLineNum = 3747;BA.debugLine="datetemplate.lblYear.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
_datetemplate.getField(false,"_lblyear" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);
 BA.debugLineNum = 3748;BA.debugLine="datetemplate.SelectedColor = xui.Color_ARGB(0xFF,";
Debug.JustUpdateDeviceLine();
_datetemplate.setField ("_selectedcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0xa7))),(Object)(BA.numberCast(int.class, ((int)0x61)))));
 BA.debugLineNum = 3749;BA.debugLine="For Each x As B4XView In Array(datetemplate.btnMo";
Debug.JustUpdateDeviceLine();
_x = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group9 = RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_datetemplate.getField(false,"_btnmonthleft" /*RemoteObject*/ ).getObject()),(_datetemplate.getField(false,"_btnmonthright" /*RemoteObject*/ ).getObject()),(_datetemplate.getField(false,"_btnyearleft" /*RemoteObject*/ ).getObject()),(_datetemplate.getField(false,"_btnyearright" /*RemoteObject*/ ).getObject())});
final int groupLen9 = group9.getField(true,"length").<Integer>get()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_x = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group9.getArrayElement(false,RemoteObject.createImmutable(index9)));Debug.locals.put("x", _x);
Debug.locals.put("x", _x);
 BA.debugLineNum = 3750;BA.debugLine="x.Color = xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
_x.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 3752;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlightthemedialog(RemoteObject __ref,RemoteObject _dlg) throws Exception{
try {
		Debug.PushSubsStack("SetLightThemeDialog (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3706);
if (RapidSub.canDelegate("setlightthemedialog")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","setlightthemedialog", __ref, _dlg);}
Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 3706;BA.debugLine="Sub SetLightThemeDialog(dlg As B4XDialog)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3707;BA.debugLine="dlg.BackgroundColor = xui.Color_White";
Debug.JustUpdateDeviceLine();
_dlg.setField ("_backgroundcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 3708;BA.debugLine="dlg.ButtonsColor = xui.Color_White";
Debug.JustUpdateDeviceLine();
_dlg.setField ("_buttonscolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 3709;BA.debugLine="dlg.BorderColor = xui.Color_Gray";
Debug.JustUpdateDeviceLine();
_dlg.setField ("_bordercolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Gray"));
 BA.debugLineNum = 3710;BA.debugLine="dlg.ButtonsTextColor = xui.Color_ARGB(0xFF, 0x00,";
Debug.JustUpdateDeviceLine();
_dlg.setField ("_buttonstextcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x00))),(Object)(BA.numberCast(int.class, ((int)0x7d))),(Object)(BA.numberCast(int.class, ((int)0xc3)))));
 BA.debugLineNum = 3711;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlightthemeinput(RemoteObject __ref,RemoteObject _input) throws Exception{
try {
		Debug.PushSubsStack("SetLightThemeInput (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3721);
if (RapidSub.canDelegate("setlightthemeinput")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","setlightthemeinput", __ref, _input);}
RemoteObject _textcolor = RemoteObject.createImmutable(0);
Debug.locals.put("input", _input);
 BA.debugLineNum = 3721;BA.debugLine="Sub SetLightThemeInput(input As B4XInputTemplate)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3722;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
Debug.JustUpdateDeviceLine();
_textcolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))));Debug.locals.put("TextColor", _textcolor);Debug.locals.put("TextColor", _textcolor);
 BA.debugLineNum = 3723;BA.debugLine="input.TextField1.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
_input.getField(false,"_textfield1" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);
 BA.debugLineNum = 3724;BA.debugLine="input.lblTitle.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
_input.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);
 BA.debugLineNum = 3725;BA.debugLine="input.SetBorderColor(TextColor, xui.Color_Red)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.docU.b4xinputtemplate.class, "_setbordercolor" /*RemoteObject*/ ,(Object)(_textcolor),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red")));
 BA.debugLineNum = 3726;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlightthemelist(RemoteObject __ref,RemoteObject _list) throws Exception{
try {
		Debug.PushSubsStack("SetLightThemeList (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3713);
if (RapidSub.canDelegate("setlightthemelist")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","setlightthemelist", __ref, _list);}
RemoteObject _textcolor = RemoteObject.createImmutable(0);
Debug.locals.put("list", _list);
 BA.debugLineNum = 3713;BA.debugLine="Sub SetLightThemeList(list As B4XListTemplate)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3714;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
Debug.JustUpdateDeviceLine();
_textcolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))));Debug.locals.put("TextColor", _textcolor);Debug.locals.put("TextColor", _textcolor);
 BA.debugLineNum = 3715;BA.debugLine="list.CustomListView1.sv.ScrollViewInnerPanel.Colo";
Debug.JustUpdateDeviceLine();
_list.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0xdf))),(Object)(BA.numberCast(int.class, ((int)0xdf))),(Object)(BA.numberCast(int.class, ((int)0xdf)))));
 BA.debugLineNum = 3716;BA.debugLine="list.CustomListView1.sv.Color = xui.Color_White";
Debug.JustUpdateDeviceLine();
_list.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 3717;BA.debugLine="list.CustomListView1.DefaultTextBackgroundColor =";
Debug.JustUpdateDeviceLine();
_list.getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_defaulttextbackgroundcolor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 3718;BA.debugLine="list.CustomListView1.DefaultTextColor = TextColor";
Debug.JustUpdateDeviceLine();
_list.getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_defaulttextcolor",_textcolor);
 BA.debugLineNum = 3719;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlightthemesearch(RemoteObject __ref,RemoteObject _search) throws Exception{
try {
		Debug.PushSubsStack("SetLightThemeSearch (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,3728);
if (RapidSub.canDelegate("setlightthemesearch")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","setlightthemesearch", __ref, _search);}
RemoteObject _textcolor = RemoteObject.createImmutable(0);
Debug.locals.put("search", _search);
 BA.debugLineNum = 3728;BA.debugLine="Sub SetLightThemeSearch(search As B4XSearchTemplat";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3729;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
Debug.JustUpdateDeviceLine();
_textcolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))));Debug.locals.put("TextColor", _textcolor);Debug.locals.put("TextColor", _textcolor);
 BA.debugLineNum = 3730;BA.debugLine="search.SearchField.TextField.TextColor = TextColo";
Debug.JustUpdateDeviceLine();
_search.getField(false,"_searchfield" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xfloattextfield.class, "_gettextfield" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);
 BA.debugLineNum = 3731;BA.debugLine="search.SearchField.NonFocusedHintColor = TextColo";
Debug.JustUpdateDeviceLine();
_search.getField(false,"_searchfield" /*RemoteObject*/ ).setField ("_nonfocusedhintcolor" /*RemoteObject*/ ,_textcolor);
 BA.debugLineNum = 3732;BA.debugLine="search.CustomListView1.sv.ScrollViewInnerPanel.Co";
Debug.JustUpdateDeviceLine();
_search.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0xdf))),(Object)(BA.numberCast(int.class, ((int)0xdf))),(Object)(BA.numberCast(int.class, ((int)0xdf)))));
 BA.debugLineNum = 3733;BA.debugLine="search.CustomListView1.sv.Color = xui.Color_White";
Debug.JustUpdateDeviceLine();
_search.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 3734;BA.debugLine="search.CustomListView1.DefaultTextBackgroundColor";
Debug.JustUpdateDeviceLine();
_search.getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_defaulttextbackgroundcolor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 3735;BA.debugLine="search.CustomListView1.DefaultTextColor = TextCol";
Debug.JustUpdateDeviceLine();
_search.getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_defaulttextcolor",_textcolor);
 BA.debugLineNum = 3736;BA.debugLine="If search.SearchField.lblV.IsInitialized Then sea";
Debug.JustUpdateDeviceLine();
if (_search.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblv" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_search.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblv" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);};
 BA.debugLineNum = 3737;BA.debugLine="If search.SearchField.lblClear.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_search.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_search.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);};
 BA.debugLineNum = 3738;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref,RemoteObject _rutaficherojsonjamtableclv) throws Exception{
try {
		Debug.PushSubsStack("Show (jamtableclvcamposbuilder) ","jamtableclvcamposbuilder",92,__ref.getField(false, "ba"),__ref,195);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "jamtableclvcamposbuilder","show", __ref, _rutaficherojsonjamtableclv);}
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
RemoteObject _joclvdatosscrollpane = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("RutaFicheroJSONjamTableCLV", _rutaficherojsonjamtableclv);
 BA.debugLineNum = 195;BA.debugLine="Sub Show(RutaFicheroJSONjamTableCLV As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 197;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(\"\",\"\",\"\",\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_datosorigendatos" /*RemoteObject*/ ,__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_createtipoorigendatos" /*RemoteObject*/ ,(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString(jamtableclvcamposbuilder.__c.getField(false,"Null")))));
 BA.debugLineNum = 198;BA.debugLine="FechaUltimaModificacion=-1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_fechaultimamodificacion" /*RemoteObject*/ ,BA.numberCast(long.class, -(double) (0 + 1)));
 BA.debugLineNum = 200;BA.debugLine="If frm.IsInitialized=False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),jamtableclvcamposbuilder.__c.getField(true,"False"))) { 
 BA.debugLineNum = 201;BA.debugLine="Col2=0XFF696969";
Debug.JustUpdateDeviceLine();
__ref.setField ("_col2" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff696969)));
 BA.debugLineNum = 203;BA.debugLine="Col1=0xFF424242";
Debug.JustUpdateDeviceLine();
__ref.setField ("_col1" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff424242)));
 BA.debugLineNum = 205;BA.debugLine="frm.Initialize(\"frm\",1024,768)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, 1024)),(Object)(BA.numberCast(double.class, 768)));
 BA.debugLineNum = 206;BA.debugLine="frm.RootPane.LoadLayout(\"scrCamposJamTableCLVBui";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrCamposJamTableCLVBuilder")));
 BA.debugLineNum = 207;BA.debugLine="B4XPlusMinusAnchoBordeItems.SetNumericRange(0,3,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_b4xplusminusanchobordeitems" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xplusminus.class, "_setnumericrange" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 3)),(Object)(BA.numberCast(double.class, 1)));
 BA.debugLineNum = 208;BA.debugLine="clvListaCampos.DefaultTextColor = xui.Color_Whit";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).setField ("_defaulttextcolor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 209;BA.debugLine="Dialog.Initialize(frm.RootPane)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 210;BA.debugLine="Dialog.Title = \"Campos Builder\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Campos Builder")));
 BA.debugLineNum = 211;BA.debugLine="Dim n As Node = clvListaCampos.sv";
Debug.JustUpdateDeviceLine();
_n = RemoteObject.createNew ("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
_n = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).getField(false,"_sv").getObject());Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 212;BA.debugLine="n.StyleClasses.Add(\"b4xdialog\")";
Debug.JustUpdateDeviceLine();
_n.runMethod(false,"getStyleClasses").runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("b4xdialog"))));
 BA.debugLineNum = 213;BA.debugLine="pnlOrigenSQL.Visible=False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pnlorigensql" /*RemoteObject*/ ).runMethod(true,"setVisible",jamtableclvcamposbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 215;BA.debugLine="Dim JOClvDatosScrollpane As JavaObject=clvListaC";
Debug.JustUpdateDeviceLine();
_joclvdatosscrollpane = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joclvdatosscrollpane = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).getField(false,"_sv").getObject());Debug.locals.put("JOClvDatosScrollpane", _joclvdatosscrollpane);Debug.locals.put("JOClvDatosScrollpane", _joclvdatosscrollpane);
 BA.debugLineNum = 216;BA.debugLine="JOClvDatosScrollpane.RunMethod(\"setHbarPolicy\",A";
Debug.JustUpdateDeviceLine();
_joclvdatosscrollpane.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setHbarPolicy")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("ALWAYS"))})));
 BA.debugLineNum = 217;BA.debugLine="JOClvDatosScrollpane.RunMethod(\"setVbarPolicy\",A";
Debug.JustUpdateDeviceLine();
_joclvdatosscrollpane.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setVbarPolicy")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("ALWAYS"))})));
 BA.debugLineNum = 219;BA.debugLine="dragger.Initialize(Me,clvListaCampos)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dragger" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclvclvdragger.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ )));
 BA.debugLineNum = 221;BA.debugLine="FileChooser.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_filechooser" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 223;BA.debugLine="FileChooser.SetExtensionFilter(\"JSON\", Array(\"*.";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_filechooser" /*RemoteObject*/ ).runVoidMethod ("SetExtensionFilter",(Object)(BA.ObjectToString("JSON")),(Object)(jamtableclvcamposbuilder.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("*.json"))})))));
 };
 BA.debugLineNum = 228;BA.debugLine="CurrentFile=\"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_currentfile" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 229;BA.debugLine="SetFormMaximized(frm)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_setformmaximized" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )));
 BA.debugLineNum = 230;BA.debugLine="clvListaCampos.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvlistacampos" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 231;BA.debugLine="MostrarDatosOrigenDatos";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_mostrardatosorigendatos" /*RemoteObject*/ );
 BA.debugLineNum = 232;BA.debugLine="frm.Show";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 234;BA.debugLine="frm.Title = $\"CamposBuilder ($1.2{version})\"$";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",(RemoteObject.concat(RemoteObject.createImmutable("CamposBuilder ("),jamtableclvcamposbuilder.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((__ref.getField(true,"_version" /*RemoteObject*/ )))),RemoteObject.createImmutable(")"))));
 BA.debugLineNum = 235;BA.debugLine="Inicio(RutaFicheroJSONjamTableCLV)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamtableclvcamposbuilder.class, "_inicio" /*void*/ ,(Object)(_rutaficherojsonjamtableclv));
 BA.debugLineNum = 236;BA.debugLine="End Sub";
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