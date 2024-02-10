package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class jamtableviewcamposbuilder_subs_0 {


public static void  _additem(RemoteObject _minfo) throws Exception{
try {
		Debug.PushSubsStack("AddItem (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,523);
if (RapidSub.canDelegate("additem")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","additem", _minfo); return;}
ResumableSub_AddItem rsub = new ResumableSub_AddItem(null,_minfo);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_AddItem extends BA.ResumableSub {
public ResumableSub_AddItem(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _minfo) {
this.parent = parent;
this._minfo = _minfo;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _minfo;
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
RemoteObject _scolorborde = RemoteObject.createImmutable("");
RemoteObject _scolorfondo = RemoteObject.createImmutable("");
RemoteObject _scolortexto = RemoteObject.createImmutable("");
RemoteObject _scolortextoencabezadocolumna = RemoteObject.createImmutable("");
RemoteObject _scolorfondoencabezadocolumna = RemoteObject.createImmutable("");
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
RemoteObject _nativeme = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _indicecontraste = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("AddItem (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,523);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("mInfo", _minfo);
 BA.debugLineNum = 525;BA.debugLine="If ColActual=Col1 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",parent._colactual,BA.numberCast(double.class, parent._col1))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 526;BA.debugLine="ColActual=Col2";
Debug.JustUpdateDeviceLine();
parent._colactual = parent._col2;
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 528;BA.debugLine="ColActual=Col1";
Debug.JustUpdateDeviceLine();
parent._colactual = parent._col1;
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 531;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = parent._xui.runMethod(false,"CreatePanel",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 532;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, clvListaCampos.AsV";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(parent._clvlistacampos.runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 120))))));
 BA.debugLineNum = 534;BA.debugLine="pnl.LoadLayout(\"scrItemCamposBuilder4\")";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrItemCamposBuilder4")),jamtableviewcamposbuilder.ba);
 BA.debugLineNum = 535;BA.debugLine="pnl.Color=ColActual";
Debug.JustUpdateDeviceLine();
_pnl.runMethod(true,"setColor",parent._colactual);
 BA.debugLineNum = 537;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue";
Debug.JustUpdateDeviceLine();
_clviv = RemoteObject.createNew ("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 539;BA.debugLine="clvIV.txtID=txtID";
Debug.JustUpdateDeviceLine();
_clviv.setField ("txtID" /*RemoteObject*/ ,parent._txtid);
 BA.debugLineNum = 540;BA.debugLine="clvIV.B4XPlusMinusAncho=B4XPlusMinusAncho";
Debug.JustUpdateDeviceLine();
_clviv.setField ("B4XPlusMinusAncho" /*RemoteObject*/ ,parent._b4xplusminusancho);
 BA.debugLineNum = 542;BA.debugLine="clvIV.chkboxKeyID=chkboxKeyID";
Debug.JustUpdateDeviceLine();
_clviv.setField ("chkboxKeyID" /*RemoteObject*/ ,parent._chkboxkeyid);
 BA.debugLineNum = 543;BA.debugLine="clvIV.lblOrdenKeyID=lblOrdenKeyID";
Debug.JustUpdateDeviceLine();
_clviv.setField ("lblOrdenKeyID" /*RemoteObject*/ ,parent._lblordenkeyid);
 BA.debugLineNum = 544;BA.debugLine="clvIV.cboCampo=cboCampo";
Debug.JustUpdateDeviceLine();
_clviv.setField ("cboCampo" /*RemoteObject*/ ,parent._cbocampo);
 BA.debugLineNum = 545;BA.debugLine="clvIV.txtAliasCampo=txtAliasCampo";
Debug.JustUpdateDeviceLine();
_clviv.setField ("txtAliasCampo" /*RemoteObject*/ ,parent._txtaliascampo);
 BA.debugLineNum = 546;BA.debugLine="clvIV.chkColumnaTableView=chkColumnaTableView";
Debug.JustUpdateDeviceLine();
_clviv.setField ("chkColumnaTableView" /*RemoteObject*/ ,parent._chkcolumnatableview);
 BA.debugLineNum = 547;BA.debugLine="clvIV.chkColumnaOcultable=chkColumnaOcultable";
Debug.JustUpdateDeviceLine();
_clviv.setField ("chkColumnaOcultable" /*RemoteObject*/ ,parent._chkcolumnaocultable);
 BA.debugLineNum = 548;BA.debugLine="clvIV.chkBoxCampoCalculado=chkBoxCampoCalculado";
Debug.JustUpdateDeviceLine();
_clviv.setField ("chkBoxCampoCalculado" /*RemoteObject*/ ,parent._chkboxcampocalculado);
 BA.debugLineNum = 549;BA.debugLine="clvIV.cboTipoControlFiltro=cboTipoControlFiltro";
Debug.JustUpdateDeviceLine();
_clviv.setField ("cboTipoControlFiltro" /*RemoteObject*/ ,parent._cbotipocontrolfiltro);
 BA.debugLineNum = 550;BA.debugLine="clvIV.txtNombreCampoDialogosAux=txtNombreCampoDia";
Debug.JustUpdateDeviceLine();
_clviv.setField ("txtNombreCampoDialogosAux" /*RemoteObject*/ ,parent._txtnombrecampodialogosaux);
 BA.debugLineNum = 551;BA.debugLine="clvIV.cboTipoDato=cboTipoDato";
Debug.JustUpdateDeviceLine();
_clviv.setField ("cboTipoDato" /*RemoteObject*/ ,parent._cbotipodato);
 BA.debugLineNum = 552;BA.debugLine="clvIV.chkBoxEsFecha=chkBoxEsFecha";
Debug.JustUpdateDeviceLine();
_clviv.setField ("chkBoxEsFecha" /*RemoteObject*/ ,parent._chkboxesfecha);
 BA.debugLineNum = 553;BA.debugLine="clvIV.chkBoxEsBooleano=chkBoxEsBooleano";
Debug.JustUpdateDeviceLine();
_clviv.setField ("chkBoxEsBooleano" /*RemoteObject*/ ,parent._chkboxesbooleano);
 BA.debugLineNum = 554;BA.debugLine="clvIV.txtValorTrueCampoBooleano=txtValorTrueCampo";
Debug.JustUpdateDeviceLine();
_clviv.setField ("txtValorTrueCampoBooleano" /*RemoteObject*/ ,parent._txtvalortruecampobooleano);
 BA.debugLineNum = 555;BA.debugLine="clvIV.txtEncabezadoColumna=txtEncabezadoColumna";
Debug.JustUpdateDeviceLine();
_clviv.setField ("txtEncabezadoColumna" /*RemoteObject*/ ,parent._txtencabezadocolumna);
 BA.debugLineNum = 556;BA.debugLine="clvIV.txtOrdenColumna=txtOrdenColumna";
Debug.JustUpdateDeviceLine();
_clviv.setField ("txtOrdenColumna" /*RemoteObject*/ ,parent._txtordencolumna);
 BA.debugLineNum = 557;BA.debugLine="clvIV.cboAlineacionColumna=cboAlineacionColumna";
Debug.JustUpdateDeviceLine();
_clviv.setField ("cboAlineacionColumna" /*RemoteObject*/ ,parent._cboalineacioncolumna);
 BA.debugLineNum = 558;BA.debugLine="clvIV.chkNoNulo=chkBoxNoNulo";
Debug.JustUpdateDeviceLine();
_clviv.setField ("chkNoNulo" /*RemoteObject*/ ,parent._chkboxnonulo);
 BA.debugLineNum = 559;BA.debugLine="clvIV.chkBoxConValorDefecto=chkBoxConValorDefecto";
Debug.JustUpdateDeviceLine();
_clviv.setField ("chkBoxConValorDefecto" /*RemoteObject*/ ,parent._chkboxconvalordefecto);
 BA.debugLineNum = 560;BA.debugLine="clvIV.txtValorDefecto=txtValorDefecto";
Debug.JustUpdateDeviceLine();
_clviv.setField ("txtValorDefecto" /*RemoteObject*/ ,parent._txtvalordefecto);
 BA.debugLineNum = 561;BA.debugLine="clvIV.cboTipoControlEdicion=cboTipoControlEdicion";
Debug.JustUpdateDeviceLine();
_clviv.setField ("cboTipoControlEdicion" /*RemoteObject*/ ,parent._cbotipocontroledicion);
 BA.debugLineNum = 565;BA.debugLine="clvIV.lblColorBorde=lblColorBorde";
Debug.JustUpdateDeviceLine();
_clviv.setField ("lblColorBorde" /*RemoteObject*/ ,parent._lblcolorborde);
 BA.debugLineNum = 567;BA.debugLine="clvIV.txtRGBColorBorde=txtRGBColorBorde";
Debug.JustUpdateDeviceLine();
_clviv.setField ("txtRGBColorBorde" /*RemoteObject*/ ,parent._txtrgbcolorborde);
 BA.debugLineNum = 568;BA.debugLine="clvIV.lblColorFondo=lblColorFondo";
Debug.JustUpdateDeviceLine();
_clviv.setField ("lblColorFondo" /*RemoteObject*/ ,parent._lblcolorfondo);
 BA.debugLineNum = 570;BA.debugLine="clvIV.txtRGBColorFondo=txtRGBColorFondo";
Debug.JustUpdateDeviceLine();
_clviv.setField ("txtRGBColorFondo" /*RemoteObject*/ ,parent._txtrgbcolorfondo);
 BA.debugLineNum = 571;BA.debugLine="clvIV.lblColorTexto=lblColorTexto";
Debug.JustUpdateDeviceLine();
_clviv.setField ("lblColorTexto" /*RemoteObject*/ ,parent._lblcolortexto);
 BA.debugLineNum = 573;BA.debugLine="clvIV.txtRGBColorTexto=txtRGBColorTexto";
Debug.JustUpdateDeviceLine();
_clviv.setField ("txtRGBColorTexto" /*RemoteObject*/ ,parent._txtrgbcolortexto);
 BA.debugLineNum = 574;BA.debugLine="clvIV.B4XPlusMinusAnchoBorde=B4XPlusMinusAnchoBor";
Debug.JustUpdateDeviceLine();
_clviv.setField ("B4XPlusMinusAnchoBorde" /*RemoteObject*/ ,parent._b4xplusminusanchobordecelda);
 BA.debugLineNum = 578;BA.debugLine="clvIV.lblColorFondoEncabezadoColumna=lblColorFond";
Debug.JustUpdateDeviceLine();
_clviv.setField ("lblColorFondoEncabezadoColumna" /*RemoteObject*/ ,parent._lblcolorfondoencabezadocolumna);
 BA.debugLineNum = 579;BA.debugLine="clvIV.lblColorTextoEncabezadoColumna=lblColorText";
Debug.JustUpdateDeviceLine();
_clviv.setField ("lblColorTextoEncabezadoColumna" /*RemoteObject*/ ,parent._lblcolortextoencabezadocolumna);
 BA.debugLineNum = 581;BA.debugLine="clvIV.txtrgbColorFondoEncabezadoColumna=txtRGBCol";
Debug.JustUpdateDeviceLine();
_clviv.setField ("txtRGBColorFondoEncabezadoColumna" /*RemoteObject*/ ,parent._txtrgbcolorfondoencabezadocolumna);
 BA.debugLineNum = 582;BA.debugLine="clvIV.txtrgbColorTextoEncabezadoColumna=txtRGBCol";
Debug.JustUpdateDeviceLine();
_clviv.setField ("txtRGBColorTextoEncabezadoColumna" /*RemoteObject*/ ,parent._txtrgbcolortextoencabezadocolumna);
 BA.debugLineNum = 584;BA.debugLine="clvIV.txtID.Text=0";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtID" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 585;BA.debugLine="clvIV.cboCampo.Value=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 586;BA.debugLine="clvIV.txtAliasCampo.text=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtAliasCampo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 587;BA.debugLine="clvIV.chkColumnaTableView.Checked=True";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkColumnaTableView" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"True"));
 BA.debugLineNum = 588;BA.debugLine="clvIV.txtEncabezadoColumna.Text=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 589;BA.debugLine="clvIV.txtOrdenColumna.Text=0";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtOrdenColumna" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 590;BA.debugLine="clvIV.chkColumnaOcultable.Checked=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkColumnaOcultable" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 BA.debugLineNum = 591;BA.debugLine="clvIV.cboTipoControlFiltro.Items.AddAll(Array As";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoControlFiltro" /*RemoteObject*/ ).runMethod(false,"getItems").runVoidMethod ("AddAll",(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.ObjectToString(""),BA.ObjectToString("TextField"),BA.ObjectToString("ComboBox"),BA.ObjectToString("CheckBox"),RemoteObject.createImmutable("TextFieldBtn")})))));
 BA.debugLineNum = 592;BA.debugLine="clvIV.cboTipoControlEdicion.Items.AddAll(Array As";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoControlEdicion" /*RemoteObject*/ ).runMethod(false,"getItems").runVoidMethod ("AddAll",(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.ObjectToString(""),BA.ObjectToString("TextField"),BA.ObjectToString("ComboBox"),BA.ObjectToString("CheckBox"),RemoteObject.createImmutable("TextFieldBtn")})))));
 BA.debugLineNum = 593;BA.debugLine="clvIV.cboTipoControlFiltro.Value=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoControlFiltro" /*RemoteObject*/ ).runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 594;BA.debugLine="clvIV.txtNombreCampoDialogosAux.Text=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtNombreCampoDialogosAux" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 595;BA.debugLine="clvIV.cboTipoDato.Items.AddAll(Array As String(\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getItems").runVoidMethod ("AddAll",(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.ObjectToString(""),BA.ObjectToString("TEXT"),BA.ObjectToString("REAL"),BA.ObjectToString("INTEGER"),RemoteObject.createImmutable("BLOB")})))));
 BA.debugLineNum = 596;BA.debugLine="clvIV.cboTipoDato.Value=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 597;BA.debugLine="clvIV.B4XPlusMinusAncho.SetNumericRange(0,1000,10";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"B4XPlusMinusAncho" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xplusminus.class, "_setnumericrange" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 1000)),(Object)(BA.numberCast(double.class, 10)));
 BA.debugLineNum = 598;BA.debugLine="clvIV.B4XPlusMinusAncho.SelectedValue=100";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"B4XPlusMinusAncho" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xplusminus.class, "_setselectedvalue" /*RemoteObject*/ ,RemoteObject.createImmutable((100)));
 BA.debugLineNum = 601;BA.debugLine="clvIV.chkboxKeyID.Checked=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkboxKeyID" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 BA.debugLineNum = 602;BA.debugLine="clvIV.lblOrdenKeyID.Text=0";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblOrdenKeyID" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 603;BA.debugLine="clvIV.chkBoxEsFecha.Checked=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxEsFecha" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 BA.debugLineNum = 604;BA.debugLine="clvIV.chkBoxEsBooleano.Checked=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxEsBooleano" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 BA.debugLineNum = 605;BA.debugLine="clvIV.txtValorTrueCampoBooleano.Text=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtValorTrueCampoBooleano" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 606;BA.debugLine="clvIV.chkBoxCampoCalculado.Checked=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxCampoCalculado" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 BA.debugLineNum = 607;BA.debugLine="clvIV.B4XPlusMinusAnchoBorde.SetNumericRange(0.5,";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"B4XPlusMinusAnchoBorde" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xplusminus.class, "_setnumericrange" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, 0.5)),(Object)(BA.numberCast(double.class, 3.0)),(Object)(BA.numberCast(double.class, 0.5)));
 BA.debugLineNum = 608;BA.debugLine="clvIV.B4XPlusMinusAnchoBorde.SelectedValue=0.5";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"B4XPlusMinusAnchoBorde" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xplusminus.class, "_setselectedvalue" /*RemoteObject*/ ,RemoteObject.createImmutable((0.5)));
 BA.debugLineNum = 613;BA.debugLine="clvIV.lblColorBorde.Color=0xFF00BFFF";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorBorde" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xff00bfff)));
 BA.debugLineNum = 615;BA.debugLine="clvIV.txtRGBColorBorde.Text=GetCssColorStringFrom";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorBorde" /*RemoteObject*/ ).runMethod(true,"setText",_getcsscolorstringfromintcolor(BA.numberCast(int.class, ((int)0xff00bfff))));
 BA.debugLineNum = 616;BA.debugLine="clvIV.lblColorFondo.Color=0x00FFFFFF";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorFondo" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0x00ffffff)));
 BA.debugLineNum = 618;BA.debugLine="clvIV.txtRGBColorFondo.Text=\"transparent\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorFondo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("transparent"));
 BA.debugLineNum = 619;BA.debugLine="clvIV.lblColorTexto.Color=0xFF000000";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorTexto" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xff000000)));
 BA.debugLineNum = 621;BA.debugLine="clvIV.txtRGBColorTexto.Text=GetCssColorStringFrom";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorTexto" /*RemoteObject*/ ).runMethod(true,"setText",_getcsscolorstringfromintcolor(BA.numberCast(int.class, ((int)0xff000000))));
 BA.debugLineNum = 625;BA.debugLine="clvIV.lblColorFondoEncabezadoColumna.Color=lblCol";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorFondoEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"setColor",parent._lblcolorfondoencabezados.runMethod(true,"getColor"));
 BA.debugLineNum = 626;BA.debugLine="clvIV.lblColorTextoEncabezadoColumna.Color=lblCol";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorTextoEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"setColor",parent._lblcolortextoencabezados.runMethod(true,"getColor"));
 BA.debugLineNum = 627;BA.debugLine="clvIV.txtRGBColorFondoEncabezadoColumna.Text=txtR";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorFondoEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"setText",parent._txtrgbcolorfondoencabezados.runMethod(true,"getText"));
 BA.debugLineNum = 628;BA.debugLine="clvIV.txtRGBColorTextoEncabezadoColumna.Text=txtR";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorTextoEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"setText",parent._txtrgbcolortextoencabezados.runMethod(true,"getText"));
 BA.debugLineNum = 632;BA.debugLine="clvIV.cboAlineacionColumna.Items.AddAll(Array As";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboAlineacionColumna" /*RemoteObject*/ ).runMethod(false,"getItems").runVoidMethod ("AddAll",(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("CENTER"),BA.ObjectToString("CENTER-LEFT"),RemoteObject.createImmutable("CENTER-RIGHT")})))));
 BA.debugLineNum = 633;BA.debugLine="clvIV.cboAlineacionColumna.Value=\"CENTER-LEFT\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboAlineacionColumna" /*RemoteObject*/ ).runMethod(false,"setValue",RemoteObject.createImmutable(("CENTER-LEFT")));
 BA.debugLineNum = 635;BA.debugLine="clvIV.chkNoNulo.Checked=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkNoNulo" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 BA.debugLineNum = 636;BA.debugLine="clvIV.chkBoxConValorDefecto.Checked=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxConValorDefecto" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 BA.debugLineNum = 637;BA.debugLine="clvIV.txtValorDefecto.Text=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtValorDefecto" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 644;BA.debugLine="If mInfo.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 62;
if (_minfo.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 645;BA.debugLine="clvIV.cboCampo.Value=mInfo.GetDefault(\"Campo\",\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"setValue",_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Campo"))),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 646;BA.debugLine="If False=mInfo.GetDefault(\"CampoCalculado\",False";
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
 BA.debugLineNum = 647;BA.debugLine="clvIV.txtAliasCampo.text=mInfo.GetDefault(\"Alia";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtAliasCampo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("AliasCampo"))),(Object)(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Campo"))),(Object)((RemoteObject.createImmutable(""))))))));
 BA.debugLineNum = 648;BA.debugLine="If clvIV.txtAliasCampo.text=\"\" Then clvIV.txtAl";
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
 BA.debugLineNum = 650;BA.debugLine="clvIV.txtAliasCampo.text=mInfo.GetDefault(\"Alia";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtAliasCampo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("AliasCampo"))),(Object)((RemoteObject.createImmutable(""))))));
 if (true) break;

case 21:
//C
this.state = 22;
;
 BA.debugLineNum = 653;BA.debugLine="clvIV.chkColumnaTableView.Checked=mInfo.GetDefau";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkColumnaTableView" /*RemoteObject*/ ).runMethod(true,"setChecked",BA.ObjectToBoolean(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ColumnaTableView"))),(Object)((parent.__c.getField(true,"True"))))));
 BA.debugLineNum = 654;BA.debugLine="clvIV.chkColumnaOcultable.Checked=mInfo.GetDefau";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkColumnaOcultable" /*RemoteObject*/ ).runMethod(true,"setChecked",BA.ObjectToBoolean(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ColumnaOcultable"))),(Object)((parent.__c.getField(true,"False"))))));
 BA.debugLineNum = 655;BA.debugLine="clvIV.txtEncabezadoColumna.text=mInfo.GetDefault";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("EncabezadoColumna"))),(Object)(_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue")))));
 BA.debugLineNum = 656;BA.debugLine="clvIV.B4XPlusMinusAncho.SelectedValue=mInfo.GetD";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"B4XPlusMinusAncho" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xplusminus.class, "_setselectedvalue" /*RemoteObject*/ ,_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("AnchoColumna"))),(Object)(RemoteObject.createImmutable((100)))));
 BA.debugLineNum = 658;BA.debugLine="clvIV.lblOrdenKeyID.Text=mInfo.GetDefault(\"KeyID";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblOrdenKeyID" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("KeyID"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 659;BA.debugLine="clvIV.chkboxKeyID.Checked=0<>mInfo.GetDefault(\"K";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkboxKeyID" /*RemoteObject*/ ).runMethod(true,"setChecked",BA.ObjectToBoolean(RemoteObject.solveBoolean("!",RemoteObject.createImmutable(0),BA.numberCast(double.class, _minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("KeyID"))),(Object)(RemoteObject.createImmutable((0))))))));
 BA.debugLineNum = 660;BA.debugLine="If 0<>mInfo.GetDefault(\"KeyID\",0) Then lstPrimar";
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
parent._lstprimarykey.runVoidMethod ("Add",(Object)(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Campo"))),(Object)((RemoteObject.createImmutable(""))))));
if (true) break;

case 27:
//C
this.state = 28;
;
 BA.debugLineNum = 661;BA.debugLine="clvIV.cboTipoControlFiltro.Value=mInfo.GetDefaul";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoControlFiltro" /*RemoteObject*/ ).runMethod(false,"setValue",_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("TipoControlFiltro"))),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 665;BA.debugLine="If mInfo.GetDefault(\"NombreCampoDialogosAux\",\"\"";
Debug.JustUpdateDeviceLine();
if (true) break;

case 28:
//if
this.state = 33;
if (RemoteObject.solveBoolean("=",_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("NombreCampoDialogosAux"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("")))) { 
this.state = 30;
}else {
this.state = 32;
}if (true) break;

case 30:
//C
this.state = 33;
 BA.debugLineNum = 666;BA.debugLine="clvIV.txtNombreCampoDialogosAux.Text=clvIV.txt";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtNombreCampoDialogosAux" /*RemoteObject*/ ).runMethod(true,"setText",_clviv.getField(false,"txtAliasCampo" /*RemoteObject*/ ).runMethod(true,"getText"));
 if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 668;BA.debugLine="clvIV.txtNombreCampoDialogosAux.Text=mInfo.Get";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtNombreCampoDialogosAux" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("NombreCampoDialogosAux"))),(Object)((RemoteObject.createImmutable(""))))));
 if (true) break;

case 33:
//C
this.state = 34;
;
 BA.debugLineNum = 671;BA.debugLine="clvIV.cboTipoControlEdicion.Value=mInfo.GetDefau";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoControlEdicion" /*RemoteObject*/ ).runMethod(false,"setValue",_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("TipoControlEdicion"))),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 672;BA.debugLine="clvIV.cboTipoDato.Value=mInfo.GetDefault(\"TipoDa";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"setValue",_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("TipoDato"))),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 673;BA.debugLine="If clvIV.cboTipoDato.Value=\"REAL\" Or clvIV.cboTi";
Debug.JustUpdateDeviceLine();
if (true) break;

case 34:
//if
this.state = 39;
if (RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("REAL"))) || RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("INTEGER"))) && RemoteObject.solveBoolean("=",_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("AlineacionColumna"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("")))) { 
this.state = 36;
}else {
this.state = 38;
}if (true) break;

case 36:
//C
this.state = 39;
 BA.debugLineNum = 674;BA.debugLine="clvIV.cboAlineacionColumna.Value=\"CENTER-RIGHT\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboAlineacionColumna" /*RemoteObject*/ ).runMethod(false,"setValue",RemoteObject.createImmutable(("CENTER-RIGHT")));
 if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 676;BA.debugLine="clvIV.cboAlineacionColumna.Value=mInfo.GetDefau";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboAlineacionColumna" /*RemoteObject*/ ).runMethod(false,"setValue",_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("AlineacionColumna"))),(Object)((RemoteObject.createImmutable("CENTER-LEFT")))));
 if (true) break;

case 39:
//C
this.state = 40;
;
 BA.debugLineNum = 678;BA.debugLine="clvIV.chkBoxEsFecha.Checked=mInfo.GetDefault(\"Es";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxEsFecha" /*RemoteObject*/ ).runMethod(true,"setChecked",BA.ObjectToBoolean(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("EsFecha"))),(Object)((parent.__c.getField(true,"False"))))));
 BA.debugLineNum = 679;BA.debugLine="clvIV.chkBoxEsBooleano.Checked=mInfo.GetDefault(";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxEsBooleano" /*RemoteObject*/ ).runMethod(true,"setChecked",BA.ObjectToBoolean(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("EsBooleano"))),(Object)((parent.__c.getField(true,"False"))))));
 BA.debugLineNum = 680;BA.debugLine="clvIV.txtValorTrueCampoBooleano.text=mInfo.GetDe";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtValorTrueCampoBooleano" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ValorTrueCampoBooleano"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 681;BA.debugLine="clvIV.chkBoxCampoCalculado.Checked=mInfo.GetDefa";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxCampoCalculado" /*RemoteObject*/ ).runMethod(true,"setChecked",BA.ObjectToBoolean(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("CampoCalculado"))),(Object)((parent.__c.getField(true,"False"))))));
 BA.debugLineNum = 682;BA.debugLine="clvIV.chkNoNulo.Checked=mInfo.GetDefault(\"NoNulo";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkNoNulo" /*RemoteObject*/ ).runMethod(true,"setChecked",BA.ObjectToBoolean(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("NoNulo"))),(Object)((parent.__c.getField(true,"False"))))));
 BA.debugLineNum = 683;BA.debugLine="clvIV.chkBoxConValorDefecto.Checked=mInfo.GetDef";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxConValorDefecto" /*RemoteObject*/ ).runMethod(true,"setChecked",BA.ObjectToBoolean(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ConValorDefecto"))),(Object)((parent.__c.getField(true,"False"))))));
 BA.debugLineNum = 684;BA.debugLine="clvIV.txtValorDefecto.Text=mInfo.GetDefault(\"Val";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtValorDefecto" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ValorDefecto"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 685;BA.debugLine="clvIV.B4XPlusMinusAnchoBorde.SelectedValue=mInfo";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"B4XPlusMinusAnchoBorde" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xplusminus.class, "_setselectedvalue" /*RemoteObject*/ ,_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("AnchoBorde"))),(Object)(RemoteObject.createImmutable((1)))));
 BA.debugLineNum = 697;BA.debugLine="Dim sColorBorde As String=mInfo.GetDefault(\"Colo";
Debug.JustUpdateDeviceLine();
_scolorborde = BA.ObjectToString(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ColorBordeCeldaSeleccionada"))),(Object)((RemoteObject.createImmutable("#00BFFF")))));Debug.locals.put("sColorBorde", _scolorborde);Debug.locals.put("sColorBorde", _scolorborde);
 BA.debugLineNum = 698;BA.debugLine="Dim sColorFondo As String=mInfo.GetDefault(\"Colo";
Debug.JustUpdateDeviceLine();
_scolorfondo = BA.ObjectToString(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ColorFondo"))),(Object)((RemoteObject.createImmutable("transparent")))));Debug.locals.put("sColorFondo", _scolorfondo);Debug.locals.put("sColorFondo", _scolorfondo);
 BA.debugLineNum = 699;BA.debugLine="Dim sColorTexto As String=mInfo.GetDefault(\"Colo";
Debug.JustUpdateDeviceLine();
_scolortexto = BA.ObjectToString(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ColorTexto"))),(Object)((RemoteObject.createImmutable("black")))));Debug.locals.put("sColorTexto", _scolortexto);Debug.locals.put("sColorTexto", _scolortexto);
 BA.debugLineNum = 701;BA.debugLine="Dim sColorTextoEncabezadoColumna As String=mInfo";
Debug.JustUpdateDeviceLine();
_scolortextoencabezadocolumna = BA.ObjectToString(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ColorTextoEncabezadoColumna"))),(Object)((parent._txtrgbcolortextoencabezados.runMethod(true,"getText")))));Debug.locals.put("sColorTextoEncabezadoColumna", _scolortextoencabezadocolumna);Debug.locals.put("sColorTextoEncabezadoColumna", _scolortextoencabezadocolumna);
 BA.debugLineNum = 702;BA.debugLine="Dim sColorFondoEncabezadoColumna As String=mInfo";
Debug.JustUpdateDeviceLine();
_scolorfondoencabezadocolumna = BA.ObjectToString(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ColorFondoEncabezadoColumna"))),(Object)((parent._txtrgbcolorfondoencabezados.runMethod(true,"getText")))));Debug.locals.put("sColorFondoEncabezadoColumna", _scolorfondoencabezadocolumna);Debug.locals.put("sColorFondoEncabezadoColumna", _scolorfondoencabezadocolumna);
 BA.debugLineNum = 704;BA.debugLine="Dim bc As ByteConverter";
Debug.JustUpdateDeviceLine();
_bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 709;BA.debugLine="clvIV.txtRGBColorBorde.Text=sColorBorde";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorBorde" /*RemoteObject*/ ).runMethod(true,"setText",_scolorborde);
 BA.debugLineNum = 710;BA.debugLine="clvIV.txtRGBColorFondo.Text=sColorFondo";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorFondo" /*RemoteObject*/ ).runMethod(true,"setText",_scolorfondo);
 BA.debugLineNum = 711;BA.debugLine="clvIV.txtRGBColorTexto.Text=sColorTexto";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorTexto" /*RemoteObject*/ ).runMethod(true,"setText",_scolortexto);
 BA.debugLineNum = 713;BA.debugLine="clvIV.txtRGBColorTextoEncabezadoColumna.text=sCo";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorTextoEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"setText",_scolortextoencabezadocolumna);
 BA.debugLineNum = 714;BA.debugLine="clvIV.lblColorTextoEncabezadoColumna.color=bc.In";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorTextoEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),_scolortextoencabezadocolumna.runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 715;BA.debugLine="clvIV.txtRGBColorFondoEncabezadoColumna.text=sCo";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorFondoEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"setText",_scolorfondoencabezadocolumna);
 BA.debugLineNum = 716;BA.debugLine="clvIV.lblColorFondoEncabezadoColumna.color=bc.In";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorFondoEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),_scolorfondoencabezadocolumna.runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 721;BA.debugLine="If sColorBorde=\"transparent\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 40:
//if
this.state = 45;
if (RemoteObject.solveBoolean("=",_scolorborde,BA.ObjectToString("transparent"))) { 
this.state = 42;
}else {
this.state = 44;
}if (true) break;

case 42:
//C
this.state = 45;
 BA.debugLineNum = 723;BA.debugLine="clvIV.lblColorBorde.Color=0x00FFFFFF";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorBorde" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0x00ffffff)));
 if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 727;BA.debugLine="clvIV.lblColorBorde.Color=bc.IntsFromBytes(bc.H";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorBorde" /*RemoteObject*/ ).runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),_scolorborde.runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 if (true) break;
;
 BA.debugLineNum = 730;BA.debugLine="If sColorFondo=\"transparent\" Then";
Debug.JustUpdateDeviceLine();

case 45:
//if
this.state = 50;
if (RemoteObject.solveBoolean("=",_scolorfondo,BA.ObjectToString("transparent"))) { 
this.state = 47;
}else {
this.state = 49;
}if (true) break;

case 47:
//C
this.state = 50;
 BA.debugLineNum = 732;BA.debugLine="clvIV.lblColorFondo.Color=0x00FFFFFF";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorFondo" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0x00ffffff)));
 if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 736;BA.debugLine="clvIV.lblColorFondo.Color=bc.IntsFromBytes(bc.H";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorFondo" /*RemoteObject*/ ).runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),_scolorfondo.runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 if (true) break;
;
 BA.debugLineNum = 739;BA.debugLine="If sColorTexto=\"transparent\" Then";
Debug.JustUpdateDeviceLine();

case 50:
//if
this.state = 61;
if (RemoteObject.solveBoolean("=",_scolortexto,BA.ObjectToString("transparent"))) { 
this.state = 52;
}else {
this.state = 54;
}if (true) break;

case 52:
//C
this.state = 61;
 BA.debugLineNum = 741;BA.debugLine="clvIV.lblColorTexto.Color=0x00FFFFFF";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorTexto" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0x00ffffff)));
 if (true) break;

case 54:
//C
this.state = 55;
 BA.debugLineNum = 745;BA.debugLine="If sColorTexto=\"black\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 55:
//if
this.state = 60;
if (RemoteObject.solveBoolean("=",_scolortexto,BA.ObjectToString("black"))) { 
this.state = 57;
}else {
this.state = 59;
}if (true) break;

case 57:
//C
this.state = 60;
 BA.debugLineNum = 747;BA.debugLine="clvIV.lblColorTexto.Color=0xFF000000";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorTexto" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xff000000)));
 if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 753;BA.debugLine="clvIV.lblColorTexto.Color=bc.IntsFromBytes(bc.";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorTexto" /*RemoteObject*/ ).runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),_scolortexto.runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 if (true) break;

case 60:
//C
this.state = 61;
;
 if (true) break;

case 61:
//C
this.state = 62;
;
 if (true) break;

case 62:
//C
this.state = 63;
;
 BA.debugLineNum = 785;BA.debugLine="clvIV.chkBoxCampoCalculado.Enabled= True";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxCampoCalculado" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 789;BA.debugLine="txtValorDefecto.Visible= clvIV.chkBoxConValorDefe";
Debug.JustUpdateDeviceLine();
parent._txtvalordefecto.runMethod(true,"setVisible",_clviv.getField(false,"chkBoxConValorDefecto" /*RemoteObject*/ ).runMethod(true,"getChecked"));
 BA.debugLineNum = 792;BA.debugLine="clvListaCampos.Add(pnl, clvIV)";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.runVoidMethod ("_add",(Object)(_pnl),(Object)((_clviv)));
 BA.debugLineNum = 797;BA.debugLine="If clvIV.chkColumnaTableView.Checked Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 63:
//if
this.state = 80;
if (_clviv.getField(false,"chkColumnaTableView" /*RemoteObject*/ ).runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 65;
}else {
this.state = 79;
}if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 799;BA.debugLine="Dim NativeMe As JavaObject=Me";
Debug.JustUpdateDeviceLine();
_nativeme = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_nativeme = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), jamtableviewcamposbuilder.getObject());Debug.locals.put("NativeMe", _nativeme);Debug.locals.put("NativeMe", _nativeme);
 BA.debugLineNum = 800;BA.debugLine="Dim sColorFondo As String=clvIV.txtRGBColorFondo";
Debug.JustUpdateDeviceLine();
_scolorfondo = _clviv.getField(false,"txtRGBColorFondo" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("sColorFondo", _scolorfondo);Debug.locals.put("sColorFondo", _scolorfondo);
 BA.debugLineNum = 801;BA.debugLine="Select sColorFondo";
Debug.JustUpdateDeviceLine();
if (true) break;

case 66:
//select
this.state = 71;
switch (BA.switchObjectToInt(_scolorfondo,BA.ObjectToString("transparent"),BA.ObjectToString("black"))) {
case 0: {
this.state = 68;
if (true) break;
}
case 1: {
this.state = 70;
if (true) break;
}
}
if (true) break;

case 68:
//C
this.state = 71;
 BA.debugLineNum = 803;BA.debugLine="sColorFondo=\"#ffffffff\"";
Debug.JustUpdateDeviceLine();
_scolorfondo = BA.ObjectToString("#ffffffff");Debug.locals.put("sColorFondo", _scolorfondo);
 if (true) break;

case 70:
//C
this.state = 71;
 BA.debugLineNum = 805;BA.debugLine="sColorFondo=\"#00000000\"";
Debug.JustUpdateDeviceLine();
_scolorfondo = BA.ObjectToString("#00000000");Debug.locals.put("sColorFondo", _scolorfondo);
 if (true) break;

case 71:
//C
this.state = 72;
;
 BA.debugLineNum = 807;BA.debugLine="Dim sColorBorde As String=clvIV.txtRGBColorBorde";
Debug.JustUpdateDeviceLine();
_scolorborde = _clviv.getField(false,"txtRGBColorBorde" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("sColorBorde", _scolorborde);Debug.locals.put("sColorBorde", _scolorborde);
 BA.debugLineNum = 808;BA.debugLine="Select sColorBorde";
Debug.JustUpdateDeviceLine();
if (true) break;

case 72:
//select
this.state = 77;
switch (BA.switchObjectToInt(_scolorborde,BA.ObjectToString("transparent"),BA.ObjectToString("black"))) {
case 0: {
this.state = 74;
if (true) break;
}
case 1: {
this.state = 76;
if (true) break;
}
}
if (true) break;

case 74:
//C
this.state = 77;
 BA.debugLineNum = 810;BA.debugLine="sColorBorde=\"#ffffffff\"";
Debug.JustUpdateDeviceLine();
_scolorborde = BA.ObjectToString("#ffffffff");Debug.locals.put("sColorBorde", _scolorborde);
 if (true) break;

case 76:
//C
this.state = 77;
 BA.debugLineNum = 812;BA.debugLine="sColorBorde=\"#00000000\"";
Debug.JustUpdateDeviceLine();
_scolorborde = BA.ObjectToString("#00000000");Debug.locals.put("sColorBorde", _scolorborde);
 if (true) break;

case 77:
//C
this.state = 80;
;
 BA.debugLineNum = 814;BA.debugLine="Dim IndiceContraste As Double=NativeMe.RunMethod";
Debug.JustUpdateDeviceLine();
_indicecontraste = BA.numberCast(double.class, _nativeme.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("DistanceLuminosityColors")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_scolorfondo),(_scolorborde)}))));Debug.locals.put("IndiceContraste", _indicecontraste);Debug.locals.put("IndiceContraste", _indicecontraste);
 BA.debugLineNum = 815;BA.debugLine="lblContrasteFondoVsBordeSeleccionOK.Text= Round2";
Debug.JustUpdateDeviceLine();
parent._lblcontrastefondovsbordeseleccionok.runMethod(true,"setText",BA.NumberToString(parent.__c.runMethod(true,"Round2",(Object)(_indicecontraste),(Object)(BA.numberCast(int.class, 2)))));
 if (true) break;

case 79:
//C
this.state = 80;
 BA.debugLineNum = 817;BA.debugLine="lblContrasteFondoVsBordeSeleccionOK.Text= 100";
Debug.JustUpdateDeviceLine();
parent._lblcontrastefondovsbordeseleccionok.runMethod(true,"setText",BA.NumberToString(100));
 if (true) break;

case 80:
//C
this.state = -1;
;
 BA.debugLineNum = 819;BA.debugLine="lblContrasteFondoVsBordeSeleccionOK.TextColor=fx.";
Debug.JustUpdateDeviceLine();
parent._lblcontrastefondovsbordeseleccionok.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 820;BA.debugLine="Log(\"** Contraste \" & clvIV.txtAliasCampo.Text)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9204603689",RemoteObject.concat(RemoteObject.createImmutable("** Contraste "),_clviv.getField(false,"txtAliasCampo" /*RemoteObject*/ ).runMethod(true,"getText")),0);
 BA.debugLineNum = 821;BA.debugLine="Log(\"clvIV.txtRGBColorFondo.Text \" & clvIV.txtRGB";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9204603690",RemoteObject.concat(RemoteObject.createImmutable("clvIV.txtRGBColorFondo.Text "),_clviv.getField(false,"txtRGBColorFondo" /*RemoteObject*/ ).runMethod(true,"getText")),0);
 BA.debugLineNum = 822;BA.debugLine="Log(\"\")";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9204603691",RemoteObject.createImmutable(""),0);
 BA.debugLineNum = 823;BA.debugLine="Log(\"scolorfondo \" & sColorFondo)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9204603692",RemoteObject.concat(RemoteObject.createImmutable("scolorfondo "),_scolorfondo),0);
 BA.debugLineNum = 824;BA.debugLine="Log(\"\")";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9204603693",RemoteObject.createImmutable(""),0);
 BA.debugLineNum = 825;BA.debugLine="Log(\"scolorBorde \" & sColorBorde)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9204603694",RemoteObject.concat(RemoteObject.createImmutable("scolorBorde "),_scolorborde),0);
 BA.debugLineNum = 826;BA.debugLine="Log(\"\")";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9204603695",RemoteObject.createImmutable(""),0);
 BA.debugLineNum = 827;BA.debugLine="Log(\"IndiceContraste \" & IndiceContraste)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9204603696",RemoteObject.concat(RemoteObject.createImmutable("IndiceContraste "),_indicecontraste),0);
 BA.debugLineNum = 829;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",jamtableviewcamposbuilder.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "additem"),BA.numberCast(int.class, 0));
this.state = 81;
return;
case 81:
//C
this.state = -1;
;
 BA.debugLineNum = 831;BA.debugLine="End Sub";
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
public static RemoteObject  _additemsfromstring(RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("AddItemsFromString (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,1621);
if (RapidSub.canDelegate("additemsfromstring")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","additemsfromstring", _s);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("s", _s);
 BA.debugLineNum = 1621;BA.debugLine="private Sub AddItemsFromString (s As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1623;BA.debugLine="Dim parser As JSONParser";
Debug.JustUpdateDeviceLine();
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 1624;BA.debugLine="parser.Initialize(s)";
Debug.JustUpdateDeviceLine();
_parser.runVoidMethod ("Initialize",(Object)(_s));
 BA.debugLineNum = 1625;BA.debugLine="Dim m As Map = parser.NextObject";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = _parser.runMethod(false,"NextObject");Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 1626;BA.debugLine="FechaUltimaModificacion=m.getdefault(\"FechaUltima";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._fechaultimamodificacion = BA.numberCast(long.class, _m.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("FechaUltimaModificacion"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));
 BA.debugLineNum = 1627;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(m.Get(\"Tip";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._datosorigendatos = _createtipoorigendatos(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TipoOrigenDatos"))))),BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IpJRDC"))))),BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PuertoJRDC"))))),BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ComandoJRDC"))))),BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ParametrosJRDC"))))));
 BA.debugLineNum = 1628;BA.debugLine="MostrarDatosOrigenDatos";
Debug.JustUpdateDeviceLine();
_mostrardatosorigendatos();
 BA.debugLineNum = 1630;BA.debugLine="Dim bc As ByteConverter";
Debug.JustUpdateDeviceLine();
_bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 1632;BA.debugLine="txtRGBColorFondoEncabezados.Text=m.Getdefault(\"Co";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._txtrgbcolorfondoencabezados.runMethod(true,"setText",BA.ObjectToString(_m.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ColorFondoEncabezados"))),(Object)((RemoteObject.createImmutable("#004B55"))))));
 BA.debugLineNum = 1633;BA.debugLine="If txtRGBColorFondoEncabezados.Text=\"transparent\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",jamtableviewcamposbuilder._txtrgbcolorfondoencabezados.runMethod(true,"getText"),BA.ObjectToString("transparent"))) { 
 BA.debugLineNum = 1634;BA.debugLine="lblColorFondoEncabezados.Color=0";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._lblcolorfondoencabezados.runMethod(true,"setColor",BA.numberCast(int.class, 0));
 }else {
 BA.debugLineNum = 1637;BA.debugLine="lblColorFondoEncabezados.Color=bc.IntsFromBytes(";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._lblcolorfondoencabezados.runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),jamtableviewcamposbuilder._txtrgbcolorfondoencabezados.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 1640;BA.debugLine="txtRGBColorTextoEncabezados.Text=m.Getdefault(\"Co";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._txtrgbcolortextoencabezados.runMethod(true,"setText",BA.ObjectToString(_m.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ColorTextoEncabezados"))),(Object)((_getcsscolorstringfromintcolor(jamtableviewcamposbuilder._xui.getField(true,"Color_White")))))));
 BA.debugLineNum = 1641;BA.debugLine="If txtRGBColorTextoEncabezados.text=\"transparent\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",jamtableviewcamposbuilder._txtrgbcolortextoencabezados.runMethod(true,"getText"),BA.ObjectToString("transparent"))) { 
 BA.debugLineNum = 1642;BA.debugLine="lblColorTextoEncabezados.Color=0";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._lblcolortextoencabezados.runMethod(true,"setColor",BA.numberCast(int.class, 0));
 }else {
 BA.debugLineNum = 1645;BA.debugLine="lblColorTextoEncabezados.Color=bc.IntsFromBytes(";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._lblcolortextoencabezados.runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),jamtableviewcamposbuilder._txtrgbcolortextoencabezados.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 1649;BA.debugLine="txtRGBColorFondoPanelInfo.Text=m.Getdefault(\"Colo";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._txtrgbcolorfondopanelinfo.runMethod(true,"setText",BA.ObjectToString(_m.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ColorFondoPanelInfo"))),(Object)((RemoteObject.createImmutable("#FFF8C3"))))));
 BA.debugLineNum = 1650;BA.debugLine="If txtRGBColorFondoPanelInfo.Text=\"transparent\" T";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",jamtableviewcamposbuilder._txtrgbcolorfondopanelinfo.runMethod(true,"getText"),BA.ObjectToString("transparent"))) { 
 BA.debugLineNum = 1651;BA.debugLine="lblColorFondoPanelInfo.Color=0";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._lblcolorfondopanelinfo.runMethod(true,"setColor",BA.numberCast(int.class, 0));
 }else {
 BA.debugLineNum = 1653;BA.debugLine="lblColorFondoPanelInfo.Color=bc.IntsFromBytes(bc";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._lblcolorfondopanelinfo.runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),jamtableviewcamposbuilder._txtrgbcolorfondopanelinfo.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 1656;BA.debugLine="txtRGBColorTextoPanelInfo.Text=m.Getdefault(\"Colo";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._txtrgbcolortextopanelinfo.runMethod(true,"setText",BA.ObjectToString(_m.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ColorTextoPanelInfo"))),(Object)((_getcsscolorstringfromintcolor(jamtableviewcamposbuilder._xui.getField(true,"Color_Black")))))));
 BA.debugLineNum = 1657;BA.debugLine="If txtRGBColorTextoPanelInfo.text=\"transparent\" T";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",jamtableviewcamposbuilder._txtrgbcolortextopanelinfo.runMethod(true,"getText"),BA.ObjectToString("transparent"))) { 
 BA.debugLineNum = 1658;BA.debugLine="lblColorTextoPanelInfo.Color=0";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._lblcolortextopanelinfo.runMethod(true,"setColor",BA.numberCast(int.class, 0));
 }else {
 BA.debugLineNum = 1660;BA.debugLine="lblColorTextoPanelInfo.Color=bc.IntsFromBytes(bc";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._lblcolortextopanelinfo.runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),jamtableviewcamposbuilder._txtrgbcolortextopanelinfo.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 1663;BA.debugLine="txtRGBColorFondoFilasImpares.Text=m.Getdefault(\"C";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._txtrgbcolorfondofilasimpares.runMethod(true,"setText",BA.ObjectToString(_m.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ColorFondoFilasImpares"))),(Object)((_getcsscolorstringfromintcolor(jamtableviewcamposbuilder._xui.getField(true,"Color_White")))))));
 BA.debugLineNum = 1664;BA.debugLine="If txtRGBColorFondoFilasImpares.Text=\"transparent";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",jamtableviewcamposbuilder._txtrgbcolorfondofilasimpares.runMethod(true,"getText"),BA.ObjectToString("transparent"))) { 
 BA.debugLineNum = 1665;BA.debugLine="lblColorFondoFilasImpares.Color=0";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._lblcolorfondofilasimpares.runMethod(true,"setColor",BA.numberCast(int.class, 0));
 }else {
 BA.debugLineNum = 1668;BA.debugLine="lblColorFondoFilasImpares.Color=bc.IntsFromBytes";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._lblcolorfondofilasimpares.runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),jamtableviewcamposbuilder._txtrgbcolorfondofilasimpares.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 1671;BA.debugLine="txtRGBColorFondoFilasPares.Text=m.Getdefault(\"Col";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._txtrgbcolorfondofilaspares.runMethod(true,"setText",BA.ObjectToString(_m.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ColorFondoFilasPares"))),(Object)((RemoteObject.createImmutable("#F1F1F1"))))));
 BA.debugLineNum = 1672;BA.debugLine="If txtRGBColorFondoFilasPares.Text=\"transparent\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",jamtableviewcamposbuilder._txtrgbcolorfondofilaspares.runMethod(true,"getText"),BA.ObjectToString("transparent"))) { 
 BA.debugLineNum = 1673;BA.debugLine="lblColorFondoFilasPares.Color=0";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._lblcolorfondofilaspares.runMethod(true,"setColor",BA.numberCast(int.class, 0));
 }else {
 BA.debugLineNum = 1676;BA.debugLine="lblColorFondoFilasPares.Color=bc.IntsFromBytes(b";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._lblcolorfondofilaspares.runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),jamtableviewcamposbuilder._txtrgbcolorfondofilaspares.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 1684;BA.debugLine="Dim Items As List = m.Get(\"Items\")";
Debug.JustUpdateDeviceLine();
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_items = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Items")))));Debug.locals.put("Items", _items);Debug.locals.put("Items", _items);
 BA.debugLineNum = 1685;BA.debugLine="For Each item As Map In Items";
Debug.JustUpdateDeviceLine();
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group45 = _items;
final int groupLen45 = group45.runMethod(true,"getSize").<Integer>get()
;int index45 = 0;
;
for (; index45 < groupLen45;index45++){
_item = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group45.runMethod(false,"Get",index45));Debug.locals.put("item", _item);
Debug.locals.put("item", _item);
 BA.debugLineNum = 1687;BA.debugLine="AddItem(item)";
Debug.JustUpdateDeviceLine();
_additem(_item);
 }
}Debug.locals.put("item", _item);
;
 BA.debugLineNum = 1692;BA.debugLine="CallSubDelayed(Me,\"AddItemsFromString_Completed\")";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder.__c.runVoidMethod ("CallSubDelayed",jamtableviewcamposbuilder.ba,(Object)(jamtableviewcamposbuilder.getObject()),(Object)(RemoteObject.createImmutable("AddItemsFromString_Completed")));
 BA.debugLineNum = 1693;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addkeypressedlistener() throws Exception{
try {
		Debug.PushSubsStack("AddKeyPressedListener (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,311);
if (RapidSub.canDelegate("addkeypressedlistener")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","addkeypressedlistener");}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4j.agraham.reflection.Reflection");
 BA.debugLineNum = 311;BA.debugLine="private Sub AddKeyPressedListener";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 312;BA.debugLine="Dim r As Reflector";
Debug.JustUpdateDeviceLine();
_r = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 313;BA.debugLine="r.Target = frm.RootPane";
Debug.JustUpdateDeviceLine();
_r.setField ("Target",(jamtableviewcamposbuilder._frm.runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 314;BA.debugLine="r.AddEventHandler(\"keypressed\", \"javafx.scene.inp";
Debug.JustUpdateDeviceLine();
_r.runVoidMethod ("AddEventHandler",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("keypressed")),(Object)(RemoteObject.createImmutable("javafx.scene.input.KeyEvent.KEY_PRESSED")));
 BA.debugLineNum = 315;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
		Debug.PushSubsStack("asJO (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,318);
if (RapidSub.canDelegate("asjo")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","asjo", _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 318;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 319;BA.debugLine="Return o";
Debug.JustUpdateDeviceLine();
if (true) return _o;
 BA.debugLineNum = 320;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnadd_click() throws Exception{
try {
		Debug.PushSubsStack("btnAdd_Click (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,1197);
if (RapidSub.canDelegate("btnadd_click")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","btnadd_click"); return;}
ResumableSub_btnAdd_Click rsub = new ResumableSub_btnAdd_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnAdd_Click extends BA.ResumableSub {
public ResumableSub_btnAdd_Click(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnAdd_Click (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,1197);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1198;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",parent._datosorigendatos.getField(true,"TipoOrigenDatos" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1199;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Aún no se h";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("Aún no se ha definido el tipo de origen de datos.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1200;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "btnadd_click"), _msa);
this.state = 5;
return;
case 5:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1201;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1203;BA.debugLine="CargandoDatos=True";
Debug.JustUpdateDeviceLine();
parent._cargandodatos = parent.__c.getField(true,"True");
 BA.debugLineNum = 1210;BA.debugLine="AddItem(Null)";
Debug.JustUpdateDeviceLine();
_additem(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 1214;BA.debugLine="dragger.AddDragButtons";
Debug.JustUpdateDeviceLine();
parent._dragger.runClassMethod (b4j.docU.jamtableviewclvdragger.class, "_adddragbuttons" /*RemoteObject*/ );
 BA.debugLineNum = 1215;BA.debugLine="CargandoDatos=False";
Debug.JustUpdateDeviceLine();
parent._cargandodatos = parent.__c.getField(true,"False");
 BA.debugLineNum = 1216;BA.debugLine="RecalcularIDOrdenColumnas";
Debug.JustUpdateDeviceLine();
_recalcularidordencolumnas();
 BA.debugLineNum = 1217;BA.debugLine="Sleep(100)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",jamtableviewcamposbuilder.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "btnadd_click"),BA.numberCast(int.class, 100));
this.state = 6;
return;
case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 1218;BA.debugLine="clvListaCampos.JumpToItem(clvListaCampos.Size - 1";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.runVoidMethod ("_jumptoitem",(Object)(RemoteObject.solve(new RemoteObject[] {parent._clvlistacampos.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 1219;BA.debugLine="End Sub";
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
public static void  _msgbox_result(RemoteObject _result) throws Exception{
}
public static void  _btnayudacolorcontrastebordeseleccion_click() throws Exception{
try {
		Debug.PushSubsStack("btnAyudaColorContrasteBordeSeleccion_Click (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,4016);
if (RapidSub.canDelegate("btnayudacolorcontrastebordeseleccion_click")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","btnayudacolorcontrastebordeseleccion_click"); return;}
ResumableSub_btnAyudaColorContrasteBordeSeleccion_Click rsub = new ResumableSub_btnAyudaColorContrasteBordeSeleccion_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnAyudaColorContrasteBordeSeleccion_Click extends BA.ResumableSub {
public ResumableSub_btnAyudaColorContrasteBordeSeleccion_Click(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _fvidx = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _sbl = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnAyudaColorContrasteBordeSeleccion_Click (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,4016);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 4017;BA.debugLine="Dim FVidx As Int=clvListaCampos.FirstVisibleIndex";
Debug.JustUpdateDeviceLine();
_fvidx = parent._clvlistacampos.runMethod(true,"_getfirstvisibleindex");Debug.locals.put("FVidx", _fvidx);Debug.locals.put("FVidx", _fvidx);
 BA.debugLineNum = 4018;BA.debugLine="Dim lbl As B4XView=Sender";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.__c.runMethod(false,"Sender",jamtableviewcamposbuilder.ba));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 4019;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(l";
Debug.JustUpdateDeviceLine();
_index = parent._clvlistacampos.runMethod(true,"_getitemfromview",(Object)(_lbl));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 4020;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 4021;BA.debugLine="Select clvIV.txtRGBColorFondo.Text";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//select
this.state = 8;
switch (BA.switchObjectToInt(_clviv.getField(false,"txtRGBColorFondo" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("transparent"),BA.ObjectToString("black"))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
default: {
this.state = 7;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 8;
 BA.debugLineNum = 4023;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"En el caso";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("En el caso de color de fondo transparente, dejar el color de borde por defecto")),(Object)(RemoteObject.createImmutable("Información")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 4024;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "btnayudacolorcontrastebordeseleccion_click"), _msa);
this.state = 9;
return;
case 9:
//C
this.state = 8;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 4025;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 5:
//C
this.state = 8;
 BA.debugLineNum = 4027;BA.debugLine="fx.Clipboard.SetString(\"#ffffff\")";
Debug.JustUpdateDeviceLine();
parent._fx.getField(false,"Clipboard").runVoidMethod ("SetString",(Object)(RemoteObject.createImmutable("#ffffff")));
 if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 4029;BA.debugLine="fx.Clipboard.SetString(clvIV.txtRGBColorFondo.T";
Debug.JustUpdateDeviceLine();
parent._fx.getField(false,"Clipboard").runVoidMethod ("SetString",(Object)(_clviv.getField(false,"txtRGBColorFondo" /*RemoteObject*/ ).runMethod(true,"getText")));
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 4032;BA.debugLine="Dim sbl As StringBuilder";
Debug.JustUpdateDeviceLine();
_sbl = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbl", _sbl);
 BA.debugLineNum = 4033;BA.debugLine="sbl.Initialize";
Debug.JustUpdateDeviceLine();
_sbl.runVoidMethod ("Initialize");
 BA.debugLineNum = 4037;BA.debugLine="sbl.Append(\"Buscar en la web www.color-hex.com el";
Debug.JustUpdateDeviceLine();
_sbl.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Buscar en la web www.color-hex.com el color que mejor constraste genere con respecto al fondo."))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 4038;BA.debugLine="sbl.Append(\"Mirar entre los shades, tints, blanco";
Debug.JustUpdateDeviceLine();
_sbl.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Mirar entre los shades, tints, blanco o negro")));
 BA.debugLineNum = 4039;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(sbl.ToString";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(_sbl.runMethod(true,"ToString")),(Object)(RemoteObject.createImmutable("Información")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 4040;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "btnayudacolorcontrastebordeseleccion_click"), _msa);
this.state = 10;
return;
case 10:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 4042;BA.debugLine="fx.ShowExternalDocument(\"https://www.color-hex.co";
Debug.JustUpdateDeviceLine();
parent._fx.runVoidMethod ("ShowExternalDocument",(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://www.color-hex.com/color/"),_clviv.getField(false,"txtRGBColorFondo" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 4043;BA.debugLine="End Sub";
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
public static void  _btnbuscaraliascampo_click() throws Exception{
try {
		Debug.PushSubsStack("btnBuscarAliasCampo_Click (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,4129);
if (RapidSub.canDelegate("btnbuscaraliascampo_click")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","btnbuscaraliascampo_click"); return;}
ResumableSub_btnBuscarAliasCampo_Click rsub = new ResumableSub_btnBuscarAliasCampo_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnBuscarAliasCampo_Click extends BA.ResumableSub {
public ResumableSub_btnBuscarAliasCampo_Click(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
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
		Debug.PushSubsStack("btnBuscarAliasCampo_Click (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,4129);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 4130;BA.debugLine="Dialog.Title=\"Selecciona Campo\"";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona Campo")));
 BA.debugLineNum = 4131;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 4132;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_titlebarfont" /*RemoteObject*/ ,parent._xui.runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 18))));
 BA.debugLineNum = 4133;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_buttonsfont" /*RemoteObject*/ ,parent._xui.runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 4135;BA.debugLine="Dim lstCamposCLV As List=CargaCamposCLV";
Debug.JustUpdateDeviceLine();
_lstcamposclv = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstcamposclv = _cargacamposclv();Debug.locals.put("lstCamposCLV", _lstcamposclv);Debug.locals.put("lstCamposCLV", _lstcamposclv);
 BA.debugLineNum = 4137;BA.debugLine="Dim lstOpciones As List";
Debug.JustUpdateDeviceLine();
_lstopciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstOpciones", _lstopciones);
 BA.debugLineNum = 4138;BA.debugLine="lstOpciones.Initialize";
Debug.JustUpdateDeviceLine();
_lstopciones.runVoidMethod ("Initialize");
 BA.debugLineNum = 4140;BA.debugLine="For Each mDataCampo As Map In lstCamposCLV";
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
 BA.debugLineNum = 4141;BA.debugLine="lstOpciones.Add(mDataCampo.Get(\"AliasCampo\"))";
Debug.JustUpdateDeviceLine();
_lstopciones.runVoidMethod ("Add",(Object)(_mdatacampo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("AliasCampo"))))));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
Debug.locals.put("mDataCampo", _mdatacampo);
;
 BA.debugLineNum = 4144;BA.debugLine="Dim B4XSearchListDlg As B4XSearchTemplate";
Debug.JustUpdateDeviceLine();
_b4xsearchlistdlg = RemoteObject.createNew ("b4j.docU.b4xsearchtemplate");Debug.locals.put("B4XSearchListDlg", _b4xsearchlistdlg);
 BA.debugLineNum = 4145;BA.debugLine="B4XSearchListDlg.Initialize";
Debug.JustUpdateDeviceLine();
_b4xsearchlistdlg.runClassMethod (b4j.docU.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,jamtableviewcamposbuilder.ba);
 BA.debugLineNum = 4146;BA.debugLine="B4XSearchListDlg.SetItems(lstOpciones)";
Debug.JustUpdateDeviceLine();
_b4xsearchlistdlg.runClassMethod (b4j.docU.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_lstopciones));
 BA.debugLineNum = 4147;BA.debugLine="B4XSearchListDlg.SearchField.HintText=\"Buscar\"";
Debug.JustUpdateDeviceLine();
_b4xsearchlistdlg.getField(false,"_searchfield" /*RemoteObject*/ ).setField ("_hinttext" /*RemoteObject*/ ,BA.ObjectToString("Buscar"));
 BA.debugLineNum = 4148;BA.debugLine="B4XSearchListDlg.SearchField.Update";
Debug.JustUpdateDeviceLine();
_b4xsearchlistdlg.getField(false,"_searchfield" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xfloattextfield.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 4149;BA.debugLine="B4XSearchListDlg.ItemHightlightColor=0xFF87CEFA";
Debug.JustUpdateDeviceLine();
_b4xsearchlistdlg.setField ("_itemhightlightcolor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff87cefa)));
 BA.debugLineNum = 4150;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XS";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xsearchlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 4151;BA.debugLine="Dim btCancelDlg As B4XView=Dialog.GetButton(xui.D";
Debug.JustUpdateDeviceLine();
_btcanceldlg = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_btcanceldlg = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(parent._xui.getField(true,"DialogResponse_Cancel")));Debug.locals.put("btCancelDlg", _btcanceldlg);Debug.locals.put("btCancelDlg", _btcanceldlg);
 BA.debugLineNum = 4152;BA.debugLine="btCancelDlg.TextSize=14";
Debug.JustUpdateDeviceLine();
_btcanceldlg.runMethod(true,"setTextSize",BA.numberCast(double.class, 14));
 BA.debugLineNum = 4154;BA.debugLine="SetLightThemeDialog(Dialog)";
Debug.JustUpdateDeviceLine();
_setlightthemedialog(parent._dialog);
 BA.debugLineNum = 4155;BA.debugLine="SetLightThemeSearch(B4XSearchListDlg)";
Debug.JustUpdateDeviceLine();
_setlightthemesearch(_b4xsearchlistdlg);
 BA.debugLineNum = 4157;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
Debug.JustUpdateDeviceLine();
_textsize = BA.numberCast(float.class, 18);Debug.locals.put("TextSize", _textsize);Debug.locals.put("TextSize", _textsize);
 BA.debugLineNum = 4158;BA.debugLine="Dim xclv As CustomListView=B4XSearchListDlg.Custo";
Debug.JustUpdateDeviceLine();
_xclv = _b4xsearchlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ );Debug.locals.put("xclv", _xclv);Debug.locals.put("xclv", _xclv);
 BA.debugLineNum = 4159;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Gr";
Debug.JustUpdateDeviceLine();
_xclv.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",parent._xui.getField(true,"Color_Gray"));
 BA.debugLineNum = 4161;BA.debugLine="B4XSearchListDlg.Resize(400dip,0.75*Dialog.mParen";
Debug.JustUpdateDeviceLine();
_b4xsearchlistdlg.runClassMethod (b4j.docU.b4xsearchtemplate.class, "_resize" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 400)))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.75),parent._dialog.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 0))));
 BA.debugLineNum = 4163;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XS";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xsearchlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 4169;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
Debug.JustUpdateDeviceLine();
_dlbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_dlbl = _xclv.getField(false,"_designerlabel");Debug.locals.put("dlbl", _dlbl);Debug.locals.put("dlbl", _dlbl);
 BA.debugLineNum = 4170;BA.debugLine="dlbl.TextSize=TextSize";
Debug.JustUpdateDeviceLine();
_dlbl.runMethod(true,"setTextSize",BA.numberCast(double.class, _textsize));
 BA.debugLineNum = 4171;BA.debugLine="Dim lblB4Xv As B4XView=dlbl";
Debug.JustUpdateDeviceLine();
_lblb4xv = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lblb4xv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _dlbl.getObject());Debug.locals.put("lblB4Xv", _lblb4xv);Debug.locals.put("lblB4Xv", _lblb4xv);
 BA.debugLineNum = 4172;BA.debugLine="lblB4Xv.SetTextAlignment(\"CENTER\",\"LEFT\")";
Debug.JustUpdateDeviceLine();
_lblb4xv.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("LEFT")));
 BA.debugLineNum = 4174;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(parent._xui.getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 4175;BA.debugLine="If bCancel.IsInitialized Then";
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
 BA.debugLineNum = 4176;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 0));
 BA.debugLineNum = 4177;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 0));
 BA.debugLineNum = 4178;BA.debugLine="bCancel.TextSize=18";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 4181;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "btnbuscaraliascampo_click"), _rsub);
this.state = 17;
return;
case 17:
//C
this.state = 9;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 4182;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 9:
//if
this.state = 14;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 4184;BA.debugLine="Dim sOpcionSel As String=B4XSearchListDlg.Selecte";
Debug.JustUpdateDeviceLine();
_sopcionsel = _b4xsearchlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("sOpcionSel", _sopcionsel);Debug.locals.put("sOpcionSel", _sopcionsel);
 BA.debugLineNum = 4186;BA.debugLine="clvListaCampos.ScrollToItem(lstOpciones.IndexOf(s";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.runVoidMethod ("_scrolltoitem",(Object)(_lstopciones.runMethod(true,"IndexOf",(Object)((_sopcionsel)))));
 BA.debugLineNum = 4188;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject _rint) throws Exception{
}
public static void  _btncopy_click() throws Exception{
try {
		Debug.PushSubsStack("btnCopy_Click (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,499);
if (RapidSub.canDelegate("btncopy_click")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","btncopy_click"); return;}
ResumableSub_btnCopy_Click rsub = new ResumableSub_btnCopy_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnCopy_Click extends BA.ResumableSub {
public ResumableSub_btnCopy_Click(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _minfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _he = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnCopy_Click (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,499);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 500;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(parent._clvlistacampos.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.__c.runMethod(false,"Sender",jamtableviewcamposbuilder.ba))))));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 501;BA.debugLine="Dialog.Title=\"Copiar Campo\"";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Copiar Campo")));
 BA.debugLineNum = 502;BA.debugLine="Wait For (Dialog.Show(\"¿Crear un campo nuevo copi";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "btncopy_click"), parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_show" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("¿Crear un campo nuevo copiando los datos del campo "),_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable("?")))),(Object)(RemoteObject.createImmutable(("Sí"))),(Object)(RemoteObject.createImmutable(("No"))),(Object)((RemoteObject.createImmutable("")))));
this.state = 14;
return;
case 14:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 503;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 504;BA.debugLine="Dim mInfo As Map=ItemValueToMap(clvIV)";
Debug.JustUpdateDeviceLine();
_minfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_minfo = _itemvaluetomap(_clviv);Debug.locals.put("mInfo", _minfo);Debug.locals.put("mInfo", _minfo);
 BA.debugLineNum = 505;BA.debugLine="If mInfo.Get(\"EncabezadoColumna\")<>\"\" Then";
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
 BA.debugLineNum = 506;BA.debugLine="Dim he As String = mInfo.Get(\"EncabezadoColumna";
Debug.JustUpdateDeviceLine();
_he = BA.ObjectToString(_minfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EncabezadoColumna")))));Debug.locals.put("he", _he);Debug.locals.put("he", _he);
 BA.debugLineNum = 507;BA.debugLine="mInfo.put(\"EncabezadoColumna\", he & \"2\")";
Debug.JustUpdateDeviceLine();
_minfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("EncabezadoColumna"))),(Object)((RemoteObject.concat(_he,RemoteObject.createImmutable("2")))));
 if (true) break;
;
 BA.debugLineNum = 509;BA.debugLine="If 0<>mInfo.Get(\"KeyID\") Then mInfo.put(\"KeyID\",";
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
 BA.debugLineNum = 511;BA.debugLine="CargandoDatos=True";
Debug.JustUpdateDeviceLine();
parent._cargandodatos = parent.__c.getField(true,"True");
 BA.debugLineNum = 512;BA.debugLine="AddItem(mInfo)";
Debug.JustUpdateDeviceLine();
_additem(_minfo);
 BA.debugLineNum = 514;BA.debugLine="dragger.AddDragButtons";
Debug.JustUpdateDeviceLine();
parent._dragger.runClassMethod (b4j.docU.jamtableviewclvdragger.class, "_adddragbuttons" /*RemoteObject*/ );
 BA.debugLineNum = 515;BA.debugLine="CargandoDatos=False";
Debug.JustUpdateDeviceLine();
parent._cargandodatos = parent.__c.getField(true,"False");
 BA.debugLineNum = 516;BA.debugLine="RecalcularIDOrdenColumnas";
Debug.JustUpdateDeviceLine();
_recalcularidordencolumnas();
 BA.debugLineNum = 517;BA.debugLine="Sleep(100)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",jamtableviewcamposbuilder.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "btncopy_click"),BA.numberCast(int.class, 100));
this.state = 15;
return;
case 15:
//C
this.state = 13;
;
 BA.debugLineNum = 518;BA.debugLine="clvListaCampos.JumpToItem(clvListaCampos.Size -";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.runVoidMethod ("_jumptoitem",(Object)(RemoteObject.solve(new RemoteObject[] {parent._clvlistacampos.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 if (true) break;

case 13:
//C
this.state = -1;
;
 BA.debugLineNum = 520;BA.debugLine="End Sub";
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
public static void  _btndelete_click() throws Exception{
try {
		Debug.PushSubsStack("btnDelete_Click (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,476);
if (RapidSub.canDelegate("btndelete_click")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","btndelete_click"); return;}
ResumableSub_btnDelete_Click rsub = new ResumableSub_btnDelete_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnDelete_Click extends BA.ResumableSub {
public ResumableSub_btnDelete_Click(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _btndel = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnDelete_Click (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,476);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 477;BA.debugLine="Dim btnDel As Button=Sender";
Debug.JustUpdateDeviceLine();
_btndel = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_btndel = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), parent.__c.runMethod(false,"Sender",jamtableviewcamposbuilder.ba));Debug.locals.put("btnDel", _btndel);Debug.locals.put("btnDel", _btndel);
 BA.debugLineNum = 478;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(b";
Debug.JustUpdateDeviceLine();
_index = parent._clvlistacampos.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btndel.getObject()));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 479;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 485;BA.debugLine="Dialog.Title=\"Borrar Campo\"";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Borrar Campo")));
 BA.debugLineNum = 487;BA.debugLine="Wait For (Dialog.Show(\"Confirma eliminación del c";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "btndelete_click"), parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_show" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Confirma eliminación del campo "),_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(".")))),(Object)(RemoteObject.createImmutable(("Sí"))),(Object)(RemoteObject.createImmutable(("No"))),(Object)((RemoteObject.createImmutable("")))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 488;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 489;BA.debugLine="clvListaCampos.RemoveAt(index)";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.runVoidMethod ("_removeat",(Object)(_index));
 BA.debugLineNum = 490;BA.debugLine="If lstPrimaryKey.IndexOf(clvIV.cboCampo.Value)>-";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean(">",parent._lstprimarykey.runMethod(true,"IndexOf",(Object)(_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue"))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
parent._lstprimarykey.runVoidMethod ("RemoveAt",(Object)(parent._lstprimarykey.runMethod(true,"IndexOf",(Object)(_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue")))));
if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 491;BA.debugLine="RecalcularIDOrdenColumnas";
Debug.JustUpdateDeviceLine();
_recalcularidordencolumnas();
 BA.debugLineNum = 492;BA.debugLine="Sleep(100)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",jamtableviewcamposbuilder.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "btndelete_click"),BA.numberCast(int.class, 100));
this.state = 16;
return;
case 16:
//C
this.state = 10;
;
 BA.debugLineNum = 493;BA.debugLine="If clvListaCampos.Size>0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean(">",parent._clvlistacampos.runMethod(true,"_getsize"),BA.numberCast(double.class, 0))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 494;BA.debugLine="clvListaCampos.JumpToItem(Max(0,(clvListaCampos";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.runVoidMethod ("_jumptoitem",(Object)(BA.numberCast(int.class, parent.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, (RemoteObject.solve(new RemoteObject[] {parent._clvlistacampos.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1))))))));
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
 BA.debugLineNum = 497;BA.debugLine="End Sub";
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
public static void  _btneditarencabezadocolumna_click() throws Exception{
try {
		Debug.PushSubsStack("btnEditarEncabezadoColumna_Click (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,4252);
if (RapidSub.canDelegate("btneditarencabezadocolumna_click")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","btneditarencabezadocolumna_click"); return;}
ResumableSub_btnEditarEncabezadoColumna_Click rsub = new ResumableSub_btnEditarEncabezadoColumna_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnEditarEncabezadoColumna_Click extends BA.ResumableSub {
public ResumableSub_btnEditarEncabezadoColumna_Click(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
RemoteObject _b4xinputdlg = RemoteObject.declareNull("b4j.docU.b4xinputtemplate");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _btnok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _btncancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnEditarEncabezadoColumna_Click (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,4252);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 4253;BA.debugLine="Dim btn As Button=Sender";
Debug.JustUpdateDeviceLine();
_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), parent.__c.runMethod(false,"Sender",jamtableviewcamposbuilder.ba));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 4254;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(parent._clvlistacampos.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject())))));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 4255;BA.debugLine="Dialog.Title=\"Indica encabezado de la columna\"";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Indica encabezado de la columna")));
 BA.debugLineNum = 4256;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 4257;BA.debugLine="Dim b4xInputDlg As B4XInputTemplate";
Debug.JustUpdateDeviceLine();
_b4xinputdlg = RemoteObject.createNew ("b4j.docU.b4xinputtemplate");Debug.locals.put("b4xInputDlg", _b4xinputdlg);
 BA.debugLineNum = 4258;BA.debugLine="b4xInputDlg.Initialize";
Debug.JustUpdateDeviceLine();
_b4xinputdlg.runClassMethod (b4j.docU.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,jamtableviewcamposbuilder.ba);
 BA.debugLineNum = 4259;BA.debugLine="b4xInputDlg.lblTitle.Text=clvIV.txtAliasCampo.tex";
Debug.JustUpdateDeviceLine();
_b4xinputdlg.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",_clviv.getField(false,"txtAliasCampo" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 4260;BA.debugLine="b4xInputDlg.Text=clvIV.txtEncabezadoColumna.Text";
Debug.JustUpdateDeviceLine();
_b4xinputdlg.setField ("_text" /*RemoteObject*/ ,_clviv.getField(false,"txtEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 4262;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(b4xI";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xinputdlg)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 4263;BA.debugLine="Dim btnOK As B4XView=Dialog.GetButton(xui.DialogR";
Debug.JustUpdateDeviceLine();
_btnok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_btnok = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(parent._xui.getField(true,"DialogResponse_Positive")));Debug.locals.put("btnOK", _btnok);Debug.locals.put("btnOK", _btnok);
 BA.debugLineNum = 4264;BA.debugLine="btnOK.Left=10dip";
Debug.JustUpdateDeviceLine();
_btnok.runMethod(true,"setLeft",BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))));
 BA.debugLineNum = 4266;BA.debugLine="Dim btnCancel As B4XView=Dialog.GetButton(xui.Dia";
Debug.JustUpdateDeviceLine();
_btncancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_btncancel = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(parent._xui.getField(true,"DialogResponse_Cancel")));Debug.locals.put("btnCancel", _btncancel);Debug.locals.put("btnCancel", _btncancel);
 BA.debugLineNum = 4267;BA.debugLine="btnCancel.Left=btnCancel.Left-40dip";
Debug.JustUpdateDeviceLine();
_btncancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_btncancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "-",1, 0));
 BA.debugLineNum = 4268;BA.debugLine="btnCancel.width=btnCancel.width+10dip";
Debug.JustUpdateDeviceLine();
_btncancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_btncancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "+",1, 0));
 BA.debugLineNum = 4269;BA.debugLine="btnCancel.SetTextAlignment(\"CENTER\",\"LEFT\")";
Debug.JustUpdateDeviceLine();
_btncancel.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("LEFT")));
 BA.debugLineNum = 4271;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "btneditarencabezadocolumna_click"), _rsub);
this.state = 17;
return;
case 17:
//C
this.state = 1;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 4272;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 4273;BA.debugLine="clvIV.txtEncabezadoColumna.Text=b4xInputDlg.Text";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"setText",_b4xinputdlg.getField(true,"_text" /*RemoteObject*/ ));
 BA.debugLineNum = 4274;BA.debugLine="If clvIV.txtEncabezadoColumna.Text<>\"\" And clvIV.";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 16;
if (RemoteObject.solveBoolean("!",_clviv.getField(false,"txtEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_clviv.getField(false,"txtNombreCampoDialogosAux" /*RemoteObject*/ ).runMethod(true,"getText"),_clviv.getField(false,"txtEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"getText"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 4275;BA.debugLine="Dim msa As Object = xui.Msgbox2Async($\"El encabe";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"Msgbox2Async",jamtableviewcamposbuilder.ba,(Object)((RemoteObject.concat(RemoteObject.createImmutable("El encabezado de la columna "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clviv.getField(false,"txtAliasCampo" /*RemoteObject*/ ).runMethod(true,"getText")))),RemoteObject.createImmutable(" es distinto al Nombre del campo utilizado en los filtros y diálogos auxiliares.\n"),RemoteObject.createImmutable("¿Cambiar el nombre del campo para los diálogos auxiliares a "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clviv.getField(false,"txtEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"getText")))),RemoteObject.createImmutable("?")))),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 4277;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "btneditarencabezadocolumna_click"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 10;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 4278;BA.debugLine="If rInt <> xui.DialogResponse_Positive Then Retu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) return ;
if (true) break;

case 15:
//C
this.state = 16;
;
 BA.debugLineNum = 4279;BA.debugLine="clvIV.txtNombreCampoDialogosAux.Text=clvIV.txtEn";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtNombreCampoDialogosAux" /*RemoteObject*/ ).runMethod(true,"setText",_clviv.getField(false,"txtEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"getText"));
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 4282;BA.debugLine="End Sub";
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
public static void  _btneditarorigenjrdc_click() throws Exception{
try {
		Debug.PushSubsStack("btnEditarOrigenJRDC_Click (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3100);
if (RapidSub.canDelegate("btneditarorigenjrdc_click")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","btneditarorigenjrdc_click"); return;}
ResumableSub_btnEditarOrigenJRDC_Click rsub = new ResumableSub_btnEditarOrigenJRDC_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnEditarOrigenJRDC_Click extends BA.ResumableSub {
public ResumableSub_btnEditarOrigenJRDC_Click(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnEditarOrigenJRDC_Click (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3100);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 3101;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",parent._datosorigendatos.getField(true,"TipoOrigenDatos" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3102;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Aún no se h";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("Aún no se ha definido un tipo de datos")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3103;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "btneditarorigenjrdc_click"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3104;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 3106;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"Manual\" Then";
Debug.JustUpdateDeviceLine();

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",parent._datosorigendatos.getField(true,"TipoOrigenDatos" /*RemoteObject*/ ),BA.ObjectToString("Manual"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 3107;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"No se puede";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("No se puede editar un origen de datos manual")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3108;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "btneditarorigenjrdc_click"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3109;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 3114;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Editar el";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"Msgbox2Async",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("¿Editar el origen de datos actual?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3115;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "btneditarorigenjrdc_click"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 8;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3116;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 8:
//if
this.state = 13;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 3118;BA.debugLine="prefDialog.Initialize(frm.RootPane,\"Datos JRDC\",8";
Debug.JustUpdateDeviceLine();
parent._prefdialog.runClassMethod (b4j.docU.preferencesdialog.class, "_initialize" /*RemoteObject*/ ,jamtableviewcamposbuilder.ba,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent._frm.runMethod(false,"getRootPane").getObject()),(Object)(RemoteObject.createImmutable(("Datos JRDC"))),(Object)(BA.numberCast(int.class, 800)),(Object)(BA.numberCast(int.class, 600)));
 BA.debugLineNum = 3120;BA.debugLine="prefDialog.LoadFromJson(File.ReadString(File.DirA";
Debug.JustUpdateDeviceLine();
parent._prefdialog.runClassMethod (b4j.docU.preferencesdialog.class, "_loadfromjson" /*RemoteObject*/ ,(Object)(parent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("OrigenDatosJRDC.json")))));
 BA.debugLineNum = 3121;BA.debugLine="Dim mData As Map=CreateMap(\"TipoOrigenDatos\": Dat";
Debug.JustUpdateDeviceLine();
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("TipoOrigenDatos")),(parent._datosorigendatos.getField(true,"TipoOrigenDatos" /*RemoteObject*/ )),RemoteObject.createImmutable(("IpJRDC")),(parent._datosorigendatos.getField(true,"IpJRDC" /*RemoteObject*/ )),RemoteObject.createImmutable(("PuertoJRDC")),(parent._datosorigendatos.getField(true,"PuertoJRDC" /*RemoteObject*/ )),RemoteObject.createImmutable(("ComandoJRDC")),(parent._datosorigendatos.getField(true,"ComandoJRDC" /*RemoteObject*/ )),RemoteObject.createImmutable(("ParametrosJRDC")),(parent._datosorigendatos.getField(true,"ParametrosJRDC" /*RemoteObject*/ ))}));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 3122;BA.debugLine="Wait For (prefDialog.ShowDialog(mData, \"OK\", \"CAN";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "btneditarorigenjrdc_click"), parent._prefdialog.runClassMethod (b4j.docU.preferencesdialog.class, "_showdialog" /*RemoteObject*/ ,(Object)(_mdata),(Object)(RemoteObject.createImmutable(("OK"))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 30;
return;
case 30:
//C
this.state = 14;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3123;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
Debug.JustUpdateDeviceLine();
if (true) break;

case 14:
//if
this.state = 19;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 3124;BA.debugLine="lblTitleIpJRDC.TextColor=fx.Colors.From32Bit(0xFF";
Debug.JustUpdateDeviceLine();
parent._lbltitleipjrdc.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 3125;BA.debugLine="lblTitlePuertoJRDC.TextColor=fx.Colors.From32Bit(";
Debug.JustUpdateDeviceLine();
parent._lbltitlepuertojrdc.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 3126;BA.debugLine="lblTitleComandoJRDC.TextColor=fx.Colors.From32Bit";
Debug.JustUpdateDeviceLine();
parent._lbltitlecomandojrdc.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 3127;BA.debugLine="lblTitleParametrosJRDC.TextColor=fx.Colors.From32";
Debug.JustUpdateDeviceLine();
parent._lbltitleparametrosjrdc.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 3128;BA.debugLine="txtIpJRDC.Enabled=True";
Debug.JustUpdateDeviceLine();
parent._txtipjrdc.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 3129;BA.debugLine="txtParametrosJRDC.Enabled=True";
Debug.JustUpdateDeviceLine();
parent._txtparametrosjrdc.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 3130;BA.debugLine="txtPuertoJRDC.Enabled=True";
Debug.JustUpdateDeviceLine();
parent._txtpuertojrdc.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 3131;BA.debugLine="txtComandoJRDC.ENABLED=True";
Debug.JustUpdateDeviceLine();
parent._txtcomandojrdc.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 3133;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(DatosOrige";
Debug.JustUpdateDeviceLine();
parent._datosorigendatos = _createtipoorigendatos(parent._datosorigendatos.getField(true,"TipoOrigenDatos" /*RemoteObject*/ ),BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("IpJRDC"))),(Object)((RemoteObject.createImmutable(""))))),BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("PuertoJRDC"))),(Object)((RemoteObject.createImmutable(""))))),BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ComandoJRDC"))),(Object)((RemoteObject.createImmutable(""))))),BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ParametrosJRDC"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 3134;BA.debugLine="MostrarDatosOrigenDatos";
Debug.JustUpdateDeviceLine();
_mostrardatosorigendatos();
 BA.debugLineNum = 3135;BA.debugLine="CargandoDatos=True";
Debug.JustUpdateDeviceLine();
parent._cargandodatos = parent.__c.getField(true,"True");
 BA.debugLineNum = 3136;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"JRDC Query\"";
Debug.JustUpdateDeviceLine();
if (true) break;

case 20:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",parent._datosorigendatos.getField(true,"TipoOrigenDatos" /*RemoteObject*/ ),BA.ObjectToString("JRDC Query"))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 3137;BA.debugLine="CargaCamposJRDCQuery(txtIpJRDC.Text,txtPuertoJRD";
Debug.JustUpdateDeviceLine();
_cargacamposjrdcquery(parent._txtipjrdc.runMethod(true,"getText"),BA.numberCast(int.class, parent._txtpuertojrdc.runMethod(true,"getText")),parent._txtcomandojrdc.runMethod(true,"getText"),parent._txtparametrosjrdc.runMethod(true,"getText"));
 BA.debugLineNum = 3138;BA.debugLine="wait for CargaCamposJRDCQuery_Completed";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","cargacamposjrdcquery_completed", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "btneditarorigenjrdc_click"), null);
this.state = 31;
return;
case 31:
//C
this.state = 23;
;
 if (true) break;
;
 BA.debugLineNum = 3140;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"JRDC Table\"";
Debug.JustUpdateDeviceLine();

case 23:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",parent._datosorigendatos.getField(true,"TipoOrigenDatos" /*RemoteObject*/ ),BA.ObjectToString("JRDC Table"))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 3141;BA.debugLine="CargaCamposJRDCTable(txtIpJRDC.Text,txtPuertoJRD";
Debug.JustUpdateDeviceLine();
_cargacamposjrdctable(parent._txtipjrdc.runMethod(true,"getText"),BA.numberCast(int.class, parent._txtpuertojrdc.runMethod(true,"getText")),parent._txtcomandojrdc.runMethod(true,"getText"),parent._txtparametrosjrdc.runMethod(true,"getText"));
 BA.debugLineNum = 3142;BA.debugLine="wait for CargaCamposJRDCTable_Completed";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","cargacamposjrdctable_completed", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "btneditarorigenjrdc_click"), null);
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
 BA.debugLineNum = 3145;BA.debugLine="CargandoDatos=False";
Debug.JustUpdateDeviceLine();
parent._cargandodatos = parent.__c.getField(true,"False");
 BA.debugLineNum = 3146;BA.debugLine="RecalcularIDOrdenColumnas";
Debug.JustUpdateDeviceLine();
_recalcularidordencolumnas();
 BA.debugLineNum = 3147;BA.debugLine="End Sub";
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
public static void  _cargacamposjrdcquery_completed() throws Exception{
}
public static void  _cargacamposjrdctable_completed() throws Exception{
}
public static RemoteObject  _btnorigenjrdc_click() throws Exception{
try {
		Debug.PushSubsStack("btnOrigenJRDC_Click (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3000);
if (RapidSub.canDelegate("btnorigenjrdc_click")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","btnorigenjrdc_click");}
 BA.debugLineNum = 3000;BA.debugLine="private Sub btnOrigenJRDC_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3002;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnvaloresestilodefecto_click() throws Exception{
try {
		Debug.PushSubsStack("btnValoresEstiloDefecto_Click (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3304);
if (RapidSub.canDelegate("btnvaloresestilodefecto_click")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","btnvaloresestilodefecto_click"); return;}
ResumableSub_btnValoresEstiloDefecto_Click rsub = new ResumableSub_btnValoresEstiloDefecto_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnValoresEstiloDefecto_Click extends BA.ResumableSub {
public ResumableSub_btnValoresEstiloDefecto_Click(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnValoresEstiloDefecto_Click (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3304);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 3306;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Funcion desh";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("Funcion deshabilitada desde v6.43.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3307;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "btnvaloresestilodefecto_click"), _msa);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3308;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 BA.debugLineNum = 3310;BA.debugLine="Dim b As Button=Sender";
Debug.JustUpdateDeviceLine();
_b = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), parent.__c.runMethod(false,"Sender",jamtableviewcamposbuilder.ba));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 3311;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(b";
Debug.JustUpdateDeviceLine();
_index = parent._clvlistacampos.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _b.getObject()));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 3312;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 3318;BA.debugLine="clvIV.lblColorBorde.Color=0xFFD3D3D3";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorBorde" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xffd3d3d3)));
 BA.debugLineNum = 3320;BA.debugLine="clvIV.txtRGBColorBorde.Text=GetCssColorStringFrom";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorBorde" /*RemoteObject*/ ).runMethod(true,"setText",_getcsscolorstringfromintcolor(BA.numberCast(int.class, ((int)0xffd3d3d3))));
 BA.debugLineNum = 3321;BA.debugLine="clvIV.lblColorFondo.Color=0x00FFFFFF";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorFondo" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0x00ffffff)));
 BA.debugLineNum = 3323;BA.debugLine="clvIV.txtRGBColorFondo.Text=\"transparent\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorFondo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("transparent"));
 BA.debugLineNum = 3324;BA.debugLine="clvIV.lblColorTexto.Color=0xFF000000";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorTexto" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xff000000)));
 BA.debugLineNum = 3326;BA.debugLine="clvIV.txtRGBColorTexto.Text=\"black\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorTexto" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("black"));
 BA.debugLineNum = 3328;BA.debugLine="clvIV.cboAlineacionColumna.Value=\"CENTER-LEFT\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboAlineacionColumna" /*RemoteObject*/ ).runMethod(false,"setValue",RemoteObject.createImmutable(("CENTER-LEFT")));
 BA.debugLineNum = 3329;BA.debugLine="clvIV.B4XPlusMinusAnchoBorde.SelectedValue=0.5";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"B4XPlusMinusAnchoBorde" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xplusminus.class, "_setselectedvalue" /*RemoteObject*/ ,RemoteObject.createImmutable((0.5)));
 BA.debugLineNum = 3330;BA.debugLine="End Sub";
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
public static void  _btnvaloresestilodefectotodos_click() throws Exception{
try {
		Debug.PushSubsStack("btnValoresEstiloDefectoTodos_Click (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3332);
if (RapidSub.canDelegate("btnvaloresestilodefectotodos_click")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","btnvaloresestilodefectotodos_click"); return;}
ResumableSub_btnValoresEstiloDefectoTodos_Click rsub = new ResumableSub_btnValoresEstiloDefectoTodos_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnValoresEstiloDefectoTodos_Click extends BA.ResumableSub {
public ResumableSub_btnValoresEstiloDefectoTodos_Click(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
int step4;
int limit4;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnValoresEstiloDefectoTodos_Click (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3332);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 3334;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Funcion desh";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("Funcion deshabilitada desde v6.43.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3335;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "btnvaloresestilodefectotodos_click"), _msa);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3336;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 BA.debugLineNum = 3338;BA.debugLine="For i=0 To clvListaCampos.Size-1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//for
this.state = 4;
step4 = 1;
limit4 = RemoteObject.solve(new RemoteObject[] {parent._clvlistacampos.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 6;
if (true) break;

case 6:
//C
this.state = 4;
if ((step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4)) this.state = 3;
if (true) break;

case 7:
//C
this.state = 6;
_i = ((int)(0 + _i + step4)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 7;
 BA.debugLineNum = 3339;BA.debugLine="Dim clviv As clvCamposBuilderItemValue=clvListaC";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("clviv", _clviv);Debug.locals.put("clviv", _clviv);
 BA.debugLineNum = 3344;BA.debugLine="clviv.lblColorBorde.Color=0xFFD3D3D3";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorBorde" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xffd3d3d3)));
 BA.debugLineNum = 3346;BA.debugLine="clviv.txtRGBColorBorde.Text=GetCssColorStringFro";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorBorde" /*RemoteObject*/ ).runMethod(true,"setText",_getcsscolorstringfromintcolor(BA.numberCast(int.class, ((int)0xffd3d3d3))));
 BA.debugLineNum = 3347;BA.debugLine="clviv.lblColorFondo.Color=0x00FFFFFF";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorFondo" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0x00ffffff)));
 BA.debugLineNum = 3349;BA.debugLine="clviv.txtRGBColorFondo.Text=\"transparent\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorFondo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("transparent"));
 BA.debugLineNum = 3350;BA.debugLine="clviv.lblColorTexto.Color=0xFF000000";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorTexto" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xff000000)));
 BA.debugLineNum = 3352;BA.debugLine="clviv.txtRGBColorTexto.Text=\"black\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorTexto" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("black"));
 BA.debugLineNum = 3354;BA.debugLine="clviv.cboAlineacionColumna.Value=\"CENTER-LEFT\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboAlineacionColumna" /*RemoteObject*/ ).runMethod(false,"setValue",RemoteObject.createImmutable(("CENTER-LEFT")));
 BA.debugLineNum = 3355;BA.debugLine="clviv.B4XPlusMinusAnchoBorde.SelectedValue=0.5";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"B4XPlusMinusAnchoBorde" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xplusminus.class, "_setselectedvalue" /*RemoteObject*/ ,RemoteObject.createImmutable((0.5)));
 if (true) break;
if (true) break;

case 4:
//C
this.state = -1;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 3357;BA.debugLine="End Sub";
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
public static RemoteObject  _cargacamposclv() throws Exception{
try {
		Debug.PushSubsStack("CargaCamposCLV (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2139);
if (RapidSub.canDelegate("cargacamposclv")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","cargacamposclv");}
RemoteObject _lstcamposenclv = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
RemoteObject _mc = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 2139;BA.debugLine="private Sub CargaCamposCLV As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2140;BA.debugLine="Dim lstCamposEnCLV As List";
Debug.JustUpdateDeviceLine();
_lstcamposenclv = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCamposEnCLV", _lstcamposenclv);
 BA.debugLineNum = 2141;BA.debugLine="lstCamposEnCLV.Initialize";
Debug.JustUpdateDeviceLine();
_lstcamposenclv.runVoidMethod ("Initialize");
 BA.debugLineNum = 2142;BA.debugLine="For i=0 To clvListaCampos.Size-1";
Debug.JustUpdateDeviceLine();
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {jamtableviewcamposbuilder._clvlistacampos.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2143;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaC";
Debug.JustUpdateDeviceLine();
_clviv = (jamtableviewcamposbuilder._clvlistacampos.runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 2144;BA.debugLine="If clvIV.cboCampo.Value<>\"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 2145;BA.debugLine="Dim mC As Map=ItemValueToMap(clvIV)";
Debug.JustUpdateDeviceLine();
_mc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mc = _itemvaluetomap(_clviv);Debug.locals.put("mC", _mc);Debug.locals.put("mC", _mc);
 BA.debugLineNum = 2146;BA.debugLine="lstCamposEnCLV.Add(mC)";
Debug.JustUpdateDeviceLine();
_lstcamposenclv.runVoidMethod ("Add",(Object)((_mc.getObject())));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2149;BA.debugLine="Return lstCamposEnCLV";
Debug.JustUpdateDeviceLine();
if (true) return _lstcamposenclv;
 BA.debugLineNum = 2150;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _cargacamposjrdcquery(RemoteObject _ipjrdc,RemoteObject _puertojrdc,RemoteObject _comandoconfigprop,RemoteObject _parametros) throws Exception{
try {
		Debug.PushSubsStack("CargaCamposJRDCQuery (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,1965);
if (RapidSub.canDelegate("cargacamposjrdcquery")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","cargacamposjrdcquery", _ipjrdc, _puertojrdc, _comandoconfigprop, _parametros); return;}
ResumableSub_CargaCamposJRDCQuery rsub = new ResumableSub_CargaCamposJRDCQuery(null,_ipjrdc,_puertojrdc,_comandoconfigprop,_parametros);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CargaCamposJRDCQuery extends BA.ResumableSub {
public ResumableSub_CargaCamposJRDCQuery(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _ipjrdc,RemoteObject _puertojrdc,RemoteObject _comandoconfigprop,RemoteObject _parametros) {
this.parent = parent;
this._ipjrdc = _ipjrdc;
this._puertojrdc = _puertojrdc;
this._comandoconfigprop = _comandoconfigprop;
this._parametros = _parametros;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
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
int step37;
int limit37;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaCamposJRDCQuery (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,1965);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("IPJrdc", _ipjrdc);
Debug.locals.put("PuertoJrdc", _puertojrdc);
Debug.locals.put("ComandoConfigProp", _comandoconfigprop);
Debug.locals.put("Parametros", _parametros);
 BA.debugLineNum = 1966;BA.debugLine="Dim rdcLinkQuery As String=\"http://\" & IPJrdc & \"";
Debug.JustUpdateDeviceLine();
_rdclinkquery = RemoteObject.concat(RemoteObject.createImmutable("http://"),_ipjrdc,RemoteObject.createImmutable(":"),_puertojrdc,RemoteObject.createImmutable("/rdc"));Debug.locals.put("rdcLinkQuery", _rdclinkquery);Debug.locals.put("rdcLinkQuery", _rdclinkquery);
 BA.debugLineNum = 1967;BA.debugLine="If Parametros=\"\" Then";
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
 BA.debugLineNum = 1969;BA.debugLine="CargaDatosJRDCQueryTop1(rdcLinkQuery,ComandoConf";
Debug.JustUpdateDeviceLine();
_cargadatosjrdcquerytop1(_rdclinkquery,_comandoconfigprop,(parent.__c.getField(false,"Null")),jamtableviewcamposbuilder.getObject());
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1972;BA.debugLine="Parametros=Parametros.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_parametros = _parametros.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parametros", _parametros);
 BA.debugLineNum = 1973;BA.debugLine="Dim Params() As String=Regex.Split(\";\",Parametro";
Debug.JustUpdateDeviceLine();
_params = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(";")),(Object)(_parametros));Debug.locals.put("Params", _params);Debug.locals.put("Params", _params);
 BA.debugLineNum = 1975;BA.debugLine="CargaDatosJRDCQueryTop1(rdcLinkQuery,ComandoConf";
Debug.JustUpdateDeviceLine();
_cargadatosjrdcquerytop1(_rdclinkquery,_comandoconfigprop,(_params),jamtableviewcamposbuilder.getObject());
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1978;BA.debugLine="Wait For  CargaDatosJRDCQueryTop1_Completed (mRes";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","cargadatosjrdcquerytop1_completed", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "cargacamposjrdcquery"), null);
this.state = 36;
return;
case 36:
//C
this.state = 7;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1979;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.DEFAULT";
Debug.JustUpdateDeviceLine();
parent._frm.runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",parent._fx.getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 1980;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 1981;BA.debugLine="fx.Msgbox(frm,\"Sin conexión con el servidor / ba";
Debug.JustUpdateDeviceLine();
parent._fx.runVoidMethodAndSync ("Msgbox",(Object)(parent._frm),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Sin conexión con el servidor / base de datos / error de consulta"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación"))),(Object)(RemoteObject.createImmutable("Error")));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1983;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
 BA.debugLineNum = 1984;BA.debugLine="fx.Msgbox(frm,\"La consulta no devuelve datos, n";
Debug.JustUpdateDeviceLine();
parent._fx.runVoidMethodAndSync ("Msgbox",(Object)(parent._frm),(Object)(BA.ObjectToString("La consulta no devuelve datos, no es posible configurar sus campos.")),(Object)(RemoteObject.createImmutable("Aviso")));
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1986;BA.debugLine="Dim lstRes As List=mResult.Get(\"lstRes\")";
Debug.JustUpdateDeviceLine();
_lstres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstres = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRes", _lstres);Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 1987;BA.debugLine="Dim mPrimerRegistro As Map=lstRes.get(0)";
Debug.JustUpdateDeviceLine();
_mprimerregistro = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mprimerregistro = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstres.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mPrimerRegistro", _mprimerregistro);Debug.locals.put("mPrimerRegistro", _mprimerregistro);
 BA.debugLineNum = 1988;BA.debugLine="Dim lstNombresCamposCLVNoCalculados As List=Nom";
Debug.JustUpdateDeviceLine();
_lstnombrescamposclvnocalculados = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstnombrescamposclvnocalculados = _nombrescamposclvnocalculados();Debug.locals.put("lstNombresCamposCLVNoCalculados", _lstnombrescamposclvnocalculados);Debug.locals.put("lstNombresCamposCLVNoCalculados", _lstnombrescamposclvnocalculados);
 BA.debugLineNum = 1989;BA.debugLine="Dim lstCamposSQL As List";
Debug.JustUpdateDeviceLine();
_lstcampossql = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCamposSQL", _lstcampossql);
 BA.debugLineNum = 1990;BA.debugLine="lstCamposSQL.Initialize";
Debug.JustUpdateDeviceLine();
_lstcampossql.runVoidMethod ("Initialize");
 BA.debugLineNum = 1992;BA.debugLine="For i=0 To mPrimerRegistro.Size-1";
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
 BA.debugLineNum = 1993;BA.debugLine="Dim NombreCampoQuerySQL As String=mPrimerRegis";
Debug.JustUpdateDeviceLine();
_nombrecampoquerysql = BA.ObjectToString(_mprimerregistro.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("NombreCampoQuerySQL", _nombrecampoquerysql);Debug.locals.put("NombreCampoQuerySQL", _nombrecampoquerysql);
 BA.debugLineNum = 1994;BA.debugLine="lstCamposSQL.Add(NombreCampoQuerySQL)";
Debug.JustUpdateDeviceLine();
_lstcampossql.runVoidMethod ("Add",(Object)((_nombrecampoquerysql)));
 BA.debugLineNum = 1997;BA.debugLine="If lstNombresCamposCLVNoCalculados.IndexOf(Nom";
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
 BA.debugLineNum = 1998;BA.debugLine="Dim mInfoCampoSQL As Map";
Debug.JustUpdateDeviceLine();
_minfocamposql = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mInfoCampoSQL", _minfocamposql);
 BA.debugLineNum = 1999;BA.debugLine="mInfoCampoSQL.Initialize";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Initialize");
 BA.debugLineNum = 2000;BA.debugLine="mInfoCampoSQL.Put(\"Campo\",mPrimerRegistro.Get";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Campo"))),(Object)(_mprimerregistro.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 2001;BA.debugLine="mInfoCampoSQL.Put(\"AliasCampo\",mPrimerRegistr";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("AliasCampo"))),(Object)(_mprimerregistro.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 2002;BA.debugLine="mInfoCampoSQL.Put(\"EncabezadoColumna\",mPrimer";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("EncabezadoColumna"))),(Object)(_mprimerregistro.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 2003;BA.debugLine="mInfoCampoSQL.Put(\"NombreCampoDialogosAux\",mP";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("NombreCampoDialogosAux"))),(Object)(_mprimerregistro.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 2004;BA.debugLine="AddItem(mInfoCampoSQL)";
Debug.JustUpdateDeviceLine();
_additem(_minfocamposql);
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 2006;BA.debugLine="Continue";
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
 BA.debugLineNum = 2010;BA.debugLine="For i=0 To lstNombresCamposCLVNoCalculados.Size";
Debug.JustUpdateDeviceLine();

case 26:
//for
this.state = 33;
step37 = 1;
limit37 = RemoteObject.solve(new RemoteObject[] {_lstnombrescamposclvnocalculados.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 39;
if (true) break;

case 39:
//C
this.state = 33;
if ((step37 > 0 && _i <= limit37) || (step37 < 0 && _i >= limit37)) this.state = 28;
if (true) break;

case 40:
//C
this.state = 39;
_i = ((int)(0 + _i + step37)) ;
Debug.locals.put("i", _i);
if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 2011;BA.debugLine="If lstCamposSQL.IndexOf(lstNombresCamposCLVNoC";
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
 BA.debugLineNum = 2012;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2013;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2014;BA.debugLine="sb.Append(\"El campo no calculado \" & lstNombr";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("El campo no calculado "),_lstnombrescamposclvnocalculados.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(" no ha sido devuelto por la SQL."))));
 BA.debugLineNum = 2015;BA.debugLine="sb.Append(\" Si esto es un error, se debería e";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" Si esto es un error, se debería eliminar el campo del CLV.")));
 BA.debugLineNum = 2018;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(sb.ToStri";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(_sb.runMethod(true,"ToString")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2019;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "cargacamposjrdcquery"), _msa);
this.state = 41;
return;
case 41:
//C
this.state = 32;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
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
 BA.debugLineNum = 2022;BA.debugLine="dragger.AddDragButtons";
Debug.JustUpdateDeviceLine();
parent._dragger.runClassMethod (b4j.docU.jamtableviewclvdragger.class, "_adddragbuttons" /*RemoteObject*/ );
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
 BA.debugLineNum = 2025;BA.debugLine="CallSubDelayed(Me, \"CargaCamposJRDCQuery_Complete";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("CallSubDelayed",jamtableviewcamposbuilder.ba,(Object)(jamtableviewcamposbuilder.getObject()),(Object)(RemoteObject.createImmutable("CargaCamposJRDCQuery_Completed")));
 BA.debugLineNum = 2026;BA.debugLine="End Sub";
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
public static void  _cargadatosjrdcquerytop1_completed(RemoteObject _mresult) throws Exception{
}
public static void  _cargacamposjrdctable(RemoteObject _ipjrdc,RemoteObject _puertojrdc,RemoteObject _comandoconfigprop,RemoteObject _parametros) throws Exception{
try {
		Debug.PushSubsStack("CargaCamposJRDCTable (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2028);
if (RapidSub.canDelegate("cargacamposjrdctable")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","cargacamposjrdctable", _ipjrdc, _puertojrdc, _comandoconfigprop, _parametros); return;}
ResumableSub_CargaCamposJRDCTable rsub = new ResumableSub_CargaCamposJRDCTable(null,_ipjrdc,_puertojrdc,_comandoconfigprop,_parametros);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CargaCamposJRDCTable extends BA.ResumableSub {
public ResumableSub_CargaCamposJRDCTable(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _ipjrdc,RemoteObject _puertojrdc,RemoteObject _comandoconfigprop,RemoteObject _parametros) {
this.parent = parent;
this._ipjrdc = _ipjrdc;
this._puertojrdc = _puertojrdc;
this._comandoconfigprop = _comandoconfigprop;
this._parametros = _parametros;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
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
int step68;
int limit68;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaCamposJRDCTable (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2028);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("IPJrdc", _ipjrdc);
Debug.locals.put("PuertoJrdc", _puertojrdc);
Debug.locals.put("ComandoConfigProp", _comandoconfigprop);
Debug.locals.put("Parametros", _parametros);
 BA.debugLineNum = 2029;BA.debugLine="Dim rdcLinkQuery As String=\"http://\" & IPJrdc & \"";
Debug.JustUpdateDeviceLine();
_rdclinkquery = RemoteObject.concat(RemoteObject.createImmutable("http://"),_ipjrdc,RemoteObject.createImmutable(":"),_puertojrdc,RemoteObject.createImmutable("/rdc"));Debug.locals.put("rdcLinkQuery", _rdclinkquery);Debug.locals.put("rdcLinkQuery", _rdclinkquery);
 BA.debugLineNum = 2030;BA.debugLine="JRDCQuery.DatosJRDC(rdcLinkQuery,ComandoConfigPro";
Debug.JustUpdateDeviceLine();
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_rdclinkquery),(Object)(_comandoconfigprop),(Object)((RemoteObject.createNewArray("String",new int[] {1},new Object[] {_parametros}))),(Object)(jamtableviewcamposbuilder.getObject()));
 BA.debugLineNum = 2031;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "cargacamposjrdctable"), null);
this.state = 64;
return;
case 64:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 2032;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.DEFAULT";
Debug.JustUpdateDeviceLine();
parent._frm.runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",parent._fx.getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 2033;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 2034;BA.debugLine="fx.Msgbox(frm,\"Sin conexión con el servidor / ba";
Debug.JustUpdateDeviceLine();
parent._fx.runVoidMethodAndSync ("Msgbox",(Object)(parent._frm),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Sin conexión con el servidor / base de datos / error de consulta"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación"))),(Object)(RemoteObject.createImmutable("Error")));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2036;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
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
 BA.debugLineNum = 2037;BA.debugLine="fx.Msgbox(frm,\"La consulta no devuelve datos, n";
Debug.JustUpdateDeviceLine();
parent._fx.runVoidMethodAndSync ("Msgbox",(Object)(parent._frm),(Object)(BA.ObjectToString("La consulta no devuelve datos, no es posible configurar sus campos.")),(Object)(RemoteObject.createImmutable("Aviso")));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 2039;BA.debugLine="Dim lstRes As List=mresult.Get(\"lstRes\")";
Debug.JustUpdateDeviceLine();
_lstres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstres = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRes", _lstres);Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 2040;BA.debugLine="Dim lstNombresCamposCLVNoCalculados As List=Nom";
Debug.JustUpdateDeviceLine();
_lstnombrescamposclvnocalculados = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstnombrescamposclvnocalculados = _nombrescamposclvnocalculados();Debug.locals.put("lstNombresCamposCLVNoCalculados", _lstnombrescamposclvnocalculados);Debug.locals.put("lstNombresCamposCLVNoCalculados", _lstnombrescamposclvnocalculados);
 BA.debugLineNum = 2041;BA.debugLine="Dim lstCamposSQL As List";
Debug.JustUpdateDeviceLine();
_lstcampossql = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCamposSQL", _lstcampossql);
 BA.debugLineNum = 2042;BA.debugLine="lstCamposSQL.Initialize";
Debug.JustUpdateDeviceLine();
_lstcampossql.runVoidMethod ("Initialize");
 BA.debugLineNum = 2043;BA.debugLine="For i=0 To lstRes.Size-1";
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
 BA.debugLineNum = 2044;BA.debugLine="Dim mRes As Map=lstRes.Get(i)";
Debug.JustUpdateDeviceLine();
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mres = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstres.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mRes", _mres);Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 2045;BA.debugLine="Dim NombreCampoQuerySQL As String=mRes.Get(\"CO";
Debug.JustUpdateDeviceLine();
_nombrecampoquerysql = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_NAME")))));Debug.locals.put("NombreCampoQuerySQL", _nombrecampoquerysql);Debug.locals.put("NombreCampoQuerySQL", _nombrecampoquerysql);
 BA.debugLineNum = 2046;BA.debugLine="lstCamposSQL.Add(NombreCampoQuerySQL)";
Debug.JustUpdateDeviceLine();
_lstcampossql.runVoidMethod ("Add",(Object)((_nombrecampoquerysql)));
 BA.debugLineNum = 2048;BA.debugLine="If lstNombresCamposCLVNoCalculados.IndexOf(Nom";
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
 BA.debugLineNum = 2049;BA.debugLine="Dim mInfoCampoSQL As Map";
Debug.JustUpdateDeviceLine();
_minfocamposql = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mInfoCampoSQL", _minfocamposql);
 BA.debugLineNum = 2050;BA.debugLine="mInfoCampoSQL.Initialize";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Initialize");
 BA.debugLineNum = 2051;BA.debugLine="mInfoCampoSQL.Put(\"Campo\",mRes.Get(\"COLUMN_NA";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Campo"))),(Object)(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_NAME"))))));
 BA.debugLineNum = 2052;BA.debugLine="mInfoCampoSQL.Put(\"AliasCampo\",mRes.Get(\"COLU";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("AliasCampo"))),(Object)(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_NAME"))))));
 BA.debugLineNum = 2053;BA.debugLine="mInfoCampoSQL.Put(\"EncabezadoColumna\",mRes.Ge";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("EncabezadoColumna"))),(Object)(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_NAME"))))));
 BA.debugLineNum = 2054;BA.debugLine="mInfoCampoSQL.Put(\"NombreCampoDialogosAux\",mR";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("NombreCampoDialogosAux"))),(Object)(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_NAME"))))));
 BA.debugLineNum = 2055;BA.debugLine="Dim TipoDatoMySQLMySQL As String=mRes.Get(\"DA";
Debug.JustUpdateDeviceLine();
_tipodatomysqlmysql = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DATA_TYPE")))));Debug.locals.put("TipoDatoMySQLMySQL", _tipodatomysqlmysql);Debug.locals.put("TipoDatoMySQLMySQL", _tipodatomysqlmysql);
 BA.debugLineNum = 2056;BA.debugLine="Dim TipoDato As String";
Debug.JustUpdateDeviceLine();
_tipodato = RemoteObject.createImmutable("");Debug.locals.put("TipoDato", _tipodato);
 BA.debugLineNum = 2057;BA.debugLine="Select TipoDatoMySQLMySQL";
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
 BA.debugLineNum = 2079;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 21:
//C
this.state = 50;
 BA.debugLineNum = 2081;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 23:
//C
this.state = 50;
 BA.debugLineNum = 2083;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 25:
//C
this.state = 50;
 BA.debugLineNum = 2085;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 27:
//C
this.state = 50;
 BA.debugLineNum = 2087;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 29:
//C
this.state = 50;
 BA.debugLineNum = 2089;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 31:
//C
this.state = 50;
 BA.debugLineNum = 2091;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 33:
//C
this.state = 50;
 BA.debugLineNum = 2093;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 35:
//C
this.state = 50;
 BA.debugLineNum = 2095;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 37:
//C
this.state = 50;
 BA.debugLineNum = 2097;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 39:
//C
this.state = 50;
 BA.debugLineNum = 2099;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 41:
//C
this.state = 50;
 BA.debugLineNum = 2101;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 43:
//C
this.state = 50;
 BA.debugLineNum = 2103;BA.debugLine="TipoDato=\"REAL\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("REAL");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 45:
//C
this.state = 50;
 BA.debugLineNum = 2105;BA.debugLine="TipoDato=\"REAL\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("REAL");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 47:
//C
this.state = 50;
 BA.debugLineNum = 2107;BA.debugLine="TipoDato=\"REAL\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("REAL");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 2110;BA.debugLine="TipoDato=\"\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 50:
//C
this.state = 53;
;
 BA.debugLineNum = 2112;BA.debugLine="mInfoCampoSQL.Put(\"TipoDato\",TipoDato)";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TipoDato"))),(Object)((_tipodato)));
 BA.debugLineNum = 2113;BA.debugLine="AddItem(mInfoCampoSQL)";
Debug.JustUpdateDeviceLine();
_additem(_minfocamposql);
 if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 2115;BA.debugLine="Continue";
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
 BA.debugLineNum = 2119;BA.debugLine="For i=0 To lstNombresCamposCLVNoCalculados.Size";
Debug.JustUpdateDeviceLine();

case 54:
//for
this.state = 61;
step68 = 1;
limit68 = RemoteObject.solve(new RemoteObject[] {_lstnombrescamposclvnocalculados.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 67;
if (true) break;

case 67:
//C
this.state = 61;
if ((step68 > 0 && _i <= limit68) || (step68 < 0 && _i >= limit68)) this.state = 56;
if (true) break;

case 68:
//C
this.state = 67;
_i = ((int)(0 + _i + step68)) ;
Debug.locals.put("i", _i);
if (true) break;

case 56:
//C
this.state = 57;
 BA.debugLineNum = 2120;BA.debugLine="If lstCamposSQL.IndexOf(lstNombresCamposCLVNoC";
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
 BA.debugLineNum = 2121;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2122;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2123;BA.debugLine="sb.Append(\"El campo no calculado \" & lstNombr";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("El campo no calculado "),_lstnombrescamposclvnocalculados.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(" no ha sido devuelto por la SQL."))));
 BA.debugLineNum = 2124;BA.debugLine="sb.Append(\" Si esto es un error, se debería e";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" Si esto es un error, se debería eliminar el campo del CLV.")));
 BA.debugLineNum = 2127;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(sb.ToStri";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(_sb.runMethod(true,"ToString")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2128;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "cargacamposjrdctable"), _msa);
this.state = 69;
return;
case 69:
//C
this.state = 60;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
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
 BA.debugLineNum = 2133;BA.debugLine="dragger.AddDragButtons";
Debug.JustUpdateDeviceLine();
parent._dragger.runClassMethod (b4j.docU.jamtableviewclvdragger.class, "_adddragbuttons" /*RemoteObject*/ );
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
 BA.debugLineNum = 2136;BA.debugLine="CallSubDelayed(Me, \"CargaCamposJRDCTable_Complete";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("CallSubDelayed",jamtableviewcamposbuilder.ba,(Object)(jamtableviewcamposbuilder.getObject()),(Object)(RemoteObject.createImmutable("CargaCamposJRDCTable_Completed")));
 BA.debugLineNum = 2137;BA.debugLine="End Sub";
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
public static void  _datosjrdc_completed(RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _cargacampostablasqlite(RemoteObject _lstcampostablasqlite) throws Exception{
try {
		Debug.PushSubsStack("CargaCamposTablaSQLite (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,1940);
if (RapidSub.canDelegate("cargacampostablasqlite")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","cargacampostablasqlite", _lstcampostablasqlite);}
RemoteObject _lstnombrescamposclvnocalculados = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstcampossql = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nombrecampoquerysql = RemoteObject.createImmutable("");
RemoteObject _minfocamposql = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tipodatosqlite = RemoteObject.createImmutable("");
Debug.locals.put("lstCamposTablaSQLite", _lstcampostablasqlite);
 BA.debugLineNum = 1940;BA.debugLine="private Sub CargaCamposTablaSQLite(lstCamposTablaS";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1941;BA.debugLine="Dim lstNombresCamposCLVNoCalculados As List=Nombr";
Debug.JustUpdateDeviceLine();
_lstnombrescamposclvnocalculados = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstnombrescamposclvnocalculados = _nombrescamposclvnocalculados();Debug.locals.put("lstNombresCamposCLVNoCalculados", _lstnombrescamposclvnocalculados);Debug.locals.put("lstNombresCamposCLVNoCalculados", _lstnombrescamposclvnocalculados);
 BA.debugLineNum = 1942;BA.debugLine="Dim lstCamposSQL As List";
Debug.JustUpdateDeviceLine();
_lstcampossql = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCamposSQL", _lstcampossql);
 BA.debugLineNum = 1943;BA.debugLine="lstCamposSQL.Initialize";
Debug.JustUpdateDeviceLine();
_lstcampossql.runVoidMethod ("Initialize");
 BA.debugLineNum = 1944;BA.debugLine="For i=0 To lstCamposTablaSQLite.Size-1";
Debug.JustUpdateDeviceLine();
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_lstcampostablasqlite.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1945;BA.debugLine="Dim mRes As Map=lstCamposTablaSQLite.Get(i)";
Debug.JustUpdateDeviceLine();
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mres = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstcampostablasqlite.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mRes", _mres);Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1946;BA.debugLine="Dim NombreCampoQuerySQL As String=mRes.Get(\"name";
Debug.JustUpdateDeviceLine();
_nombrecampoquerysql = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));Debug.locals.put("NombreCampoQuerySQL", _nombrecampoquerysql);Debug.locals.put("NombreCampoQuerySQL", _nombrecampoquerysql);
 BA.debugLineNum = 1947;BA.debugLine="lstCamposSQL.Add(NombreCampoQuerySQL)";
Debug.JustUpdateDeviceLine();
_lstcampossql.runVoidMethod ("Add",(Object)((_nombrecampoquerysql)));
 BA.debugLineNum = 1949;BA.debugLine="If lstNombresCamposCLVNoCalculados.IndexOf(Nombr";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_lstnombrescamposclvnocalculados.runMethod(true,"IndexOf",(Object)((_nombrecampoquerysql))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 1950;BA.debugLine="Dim mInfoCampoSQL As Map";
Debug.JustUpdateDeviceLine();
_minfocamposql = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mInfoCampoSQL", _minfocamposql);
 BA.debugLineNum = 1951;BA.debugLine="mInfoCampoSQL.Initialize";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Initialize");
 BA.debugLineNum = 1952;BA.debugLine="mInfoCampoSQL.Put(\"Campo\",NombreCampoQuerySQL)";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Campo"))),(Object)((_nombrecampoquerysql)));
 BA.debugLineNum = 1953;BA.debugLine="mInfoCampoSQL.Put(\"AliasCampo\",NombreCampoQuery";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("AliasCampo"))),(Object)((_nombrecampoquerysql)));
 BA.debugLineNum = 1954;BA.debugLine="mInfoCampoSQL.Put(\"EncabezadoColumna\",NombreCam";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("EncabezadoColumna"))),(Object)((_nombrecampoquerysql)));
 BA.debugLineNum = 1955;BA.debugLine="mInfoCampoSQL.Put(\"NombreCampoDialogosAux\",Nomb";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("NombreCampoDialogosAux"))),(Object)((_nombrecampoquerysql)));
 BA.debugLineNum = 1956;BA.debugLine="Dim TipoDatoSQLite As String=mRes.Get(\"type\")";
Debug.JustUpdateDeviceLine();
_tipodatosqlite = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type")))));Debug.locals.put("TipoDatoSQLite", _tipodatosqlite);Debug.locals.put("TipoDatoSQLite", _tipodatosqlite);
 BA.debugLineNum = 1957;BA.debugLine="mInfoCampoSQL.Put(\"TipoDato\",TipoDatoSQLite)";
Debug.JustUpdateDeviceLine();
_minfocamposql.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TipoDato"))),(Object)((_tipodatosqlite)));
 BA.debugLineNum = 1958;BA.debugLine="AddItem(mInfoCampoSQL)";
Debug.JustUpdateDeviceLine();
_additem(_minfocamposql);
 }else {
 BA.debugLineNum = 1960;BA.debugLine="Continue";
Debug.JustUpdateDeviceLine();
if (true) continue;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1963;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _cargadatosjrdcquerytop1(RemoteObject _rdclink,RemoteObject _comandoconfigproperties,RemoteObject _parametros,RemoteObject _callmodule) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosJRDCQueryTop1 (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3265);
if (RapidSub.canDelegate("cargadatosjrdcquerytop1")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","cargadatosjrdcquerytop1", _rdclink, _comandoconfigproperties, _parametros, _callmodule); return;}
ResumableSub_CargaDatosJRDCQueryTop1 rsub = new ResumableSub_CargaDatosJRDCQueryTop1(null,_rdclink,_comandoconfigproperties,_parametros,_callmodule);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CargaDatosJRDCQueryTop1 extends BA.ResumableSub {
public ResumableSub_CargaDatosJRDCQueryTop1(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _rdclink,RemoteObject _comandoconfigproperties,RemoteObject _parametros,RemoteObject _callmodule) {
this.parent = parent;
this._rdclink = _rdclink;
this._comandoconfigproperties = _comandoconfigproperties;
this._parametros = _parametros;
this._callmodule = _callmodule;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
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
		Debug.PushSubsStack("CargaDatosJRDCQueryTop1 (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3265);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("rdcLink", _rdclink);
Debug.locals.put("ComandoConfigProperties", _comandoconfigproperties);
Debug.locals.put("Parametros", _parametros);
Debug.locals.put("CallModule", _callmodule);
 BA.debugLineNum = 3267;BA.debugLine="Dim lstRes As List";
Debug.JustUpdateDeviceLine();
_lstres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 3268;BA.debugLine="lstRes.Initialize";
Debug.JustUpdateDeviceLine();
_lstres.runVoidMethod ("Initialize");
 BA.debugLineNum = 3269;BA.debugLine="Dim m As Map";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 3270;BA.debugLine="m.Initialize";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 3271;BA.debugLine="m.Put(\"ConnOK\",False)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ConnOK"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 3272;BA.debugLine="m.Put(\"ReqOK\",False)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ReqOK"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 3273;BA.debugLine="m.Put(\"lstRes\",lstRes)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstRes"))),(Object)((_lstres.getObject())));
 BA.debugLineNum = 3274;BA.debugLine="Dim req As DBRequestManager = CreateRequest(rdcLi";
Debug.JustUpdateDeviceLine();
_req = _createrequest(_rdclink);Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 3275;BA.debugLine="Dim cmd As DBCommand = CreateCommand(ComandoConfi";
Debug.JustUpdateDeviceLine();
_cmd = _createcommand(_comandoconfigproperties,_parametros);Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 3277;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","jobdone", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "cargadatosjrdcquerytop1"), (_req.runClassMethod (b4j.docU.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 3278;BA.debugLine="If j.Success Then";
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
 BA.debugLineNum = 3279;BA.debugLine="m.Put(\"ConnOK\",True)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ConnOK"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 3280;BA.debugLine="req.HandleJobAsync(j, \"req\")";
Debug.JustUpdateDeviceLine();
_req.runClassMethod (b4j.docU.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 3281;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","req_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "cargadatosjrdcquerytop1"), (_req));
this.state = 18;
return;
case 18:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 3283;BA.debugLine="If res.Rows.Size>0 Then";
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
 BA.debugLineNum = 3284;BA.debugLine="m.Put(\"ReqOK\",True)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ReqOK"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 3286;BA.debugLine="Dim record() As Object=res.Rows.Get(0)";
Debug.JustUpdateDeviceLine();
_record = (_res.getField(false,"Rows" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("record", _record);Debug.locals.put("record", _record);
 BA.debugLineNum = 3287;BA.debugLine="Dim mReg As Map";
Debug.JustUpdateDeviceLine();
_mreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mReg", _mreg);
 BA.debugLineNum = 3288;BA.debugLine="mReg.Initialize";
Debug.JustUpdateDeviceLine();
_mreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 3289;BA.debugLine="For i=0 To  res.Columns.Size-1";
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
 BA.debugLineNum = 3290;BA.debugLine="mReg.Put(res.Columns.GetKeyAt(i),record(i))";
Debug.JustUpdateDeviceLine();
_mreg.runVoidMethod ("Put",(Object)(_res.getField(false,"Columns" /*RemoteObject*/ ).runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))),(Object)(_record.getArrayElement(false,BA.numberCast(int.class, _i))));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 13;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 3292;BA.debugLine="lstRes.Add(mReg)";
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
 BA.debugLineNum = 3299;BA.debugLine="j.Release";
Debug.JustUpdateDeviceLine();
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 3300;BA.debugLine="CallSubDelayed2(CallModule, \"CargaDatosJRDCQueryT";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("CallSubDelayed2",jamtableviewcamposbuilder.ba,(Object)(_callmodule),(Object)(BA.ObjectToString("CargaDatosJRDCQueryTop1_Completed")),(Object)((_m)));
 BA.debugLineNum = 3302;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject _j) throws Exception{
}
public static void  _req_result(RemoteObject _res) throws Exception{
}
public static RemoteObject  _cboalineacioncolumna_valuechanged(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("cboAlineacionColumna_ValueChanged (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3151);
if (RapidSub.canDelegate("cboalineacioncolumna_valuechanged")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","cboalineacioncolumna_valuechanged", _value);}
Debug.locals.put("Value", _value);
 BA.debugLineNum = 3151;BA.debugLine="private Sub cboAlineacionColumna_ValueChanged (Val";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3152;BA.debugLine="If CargandoDatos Then Return";
Debug.JustUpdateDeviceLine();
if (jamtableviewcamposbuilder._cargandodatos.<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 3153;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cbocampo_valuechanged(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("cboCampo_ValueChanged (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2746);
if (RapidSub.canDelegate("cbocampo_valuechanged")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","cbocampo_valuechanged", _value);}
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
Debug.locals.put("Value", _value);
 BA.debugLineNum = 2746;BA.debugLine="private Sub cboCampo_ValueChanged (Value As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2747;BA.debugLine="If CargandoDatos Then Return";
Debug.JustUpdateDeviceLine();
if (jamtableviewcamposbuilder._cargandodatos.<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 2748;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(S";
Debug.JustUpdateDeviceLine();
_index = jamtableviewcamposbuilder._clvlistacampos.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), jamtableviewcamposbuilder.__c.runMethod(false,"Sender",jamtableviewcamposbuilder.ba)));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 2749;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
Debug.JustUpdateDeviceLine();
_clviv = (jamtableviewcamposbuilder._clvlistacampos.runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 2751;BA.debugLine="If Not(clvIV.chkBoxCampoCalculado.Checked) Then";
Debug.JustUpdateDeviceLine();
if (jamtableviewcamposbuilder.__c.runMethod(true,"Not",(Object)(_clviv.getField(false,"chkBoxCampoCalculado" /*RemoteObject*/ ).runMethod(true,"getChecked"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2752;BA.debugLine="clvIV.txtEncabezadoColumna.Text=Value";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_value));
 BA.debugLineNum = 2753;BA.debugLine="clvIV.txtAliasCampo.Text=Value";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtAliasCampo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_value));
 BA.debugLineNum = 2754;BA.debugLine="clvIV.txtNombreCampoDialogosAux.Text=Value";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtNombreCampoDialogosAux" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_value));
 BA.debugLineNum = 2758;BA.debugLine="clvIV.txtNombreCampoDialogosAux.Text=Value";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtNombreCampoDialogosAux" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_value));
 };
 BA.debugLineNum = 2761;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _cbotipocontrolfiltro_valuechanged(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("cboTipoControlFiltro_ValueChanged (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2536);
if (RapidSub.canDelegate("cbotipocontrolfiltro_valuechanged")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","cbotipocontrolfiltro_valuechanged", _value); return;}
ResumableSub_cboTipoControlFiltro_ValueChanged rsub = new ResumableSub_cboTipoControlFiltro_ValueChanged(null,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cboTipoControlFiltro_ValueChanged extends BA.ResumableSub {
public ResumableSub_cboTipoControlFiltro_ValueChanged(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _value) {
this.parent = parent;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _value;
RemoteObject _cbotcf = RemoteObject.declareNull("anywheresoftware.b4j.objects.ComboBoxWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cboTipoControlFiltro_ValueChanged (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2536);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Value", _value);
 BA.debugLineNum = 2537;BA.debugLine="If CargandoDatos Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (parent._cargandodatos.<Boolean>get().booleanValue()) { 
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
 BA.debugLineNum = 2538;BA.debugLine="If Value=\"\" Or Value=Null Then Return";
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
 BA.debugLineNum = 2539;BA.debugLine="Dim cboTCF As ComboBox=Sender";
Debug.JustUpdateDeviceLine();
_cbotcf = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");
_cbotcf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ComboBoxWrapper"), parent.__c.runMethod(false,"Sender",jamtableviewcamposbuilder.ba));Debug.locals.put("cboTCF", _cbotcf);Debug.locals.put("cboTCF", _cbotcf);
 BA.debugLineNum = 2540;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
Debug.JustUpdateDeviceLine();
_index = parent._clvlistacampos.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _cbotcf.getObject()));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 2541;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 2542;BA.debugLine="If Value=TipoControlFiltro_TextFieldButton And cl";
Debug.JustUpdateDeviceLine();
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_value,(parent._tipocontrolfiltro_textfieldbutton)) && RemoteObject.solveBoolean("=",_clviv.getField(false,"chkBoxEsFecha" /*RemoteObject*/ ).runMethod(true,"getChecked"),parent.__c.getField(true,"False"))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 2543;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El tipo de control filtro = "),parent._tipocontrolfiltro_textfieldbutton,RemoteObject.createImmutable(" sólo es válidos para campos tipo fecha."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2544;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "cbotipocontrolfiltro_valuechanged"), _msa);
this.state = 26;
return;
case 26:
//C
this.state = 16;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2545;BA.debugLine="cboTCF.Value=\"\"";
Debug.JustUpdateDeviceLine();
_cbotcf.runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 if (true) break;
;
 BA.debugLineNum = 2547;BA.debugLine="If (Value<>TipoControlFiltro_TextFieldButton And";
Debug.JustUpdateDeviceLine();

case 16:
//if
this.state = 19;
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",_value,(parent._tipocontrolfiltro_textfieldbutton)) && RemoteObject.solveBoolean("!",_value,(RemoteObject.createImmutable("")))))) && RemoteObject.solveBoolean("=",_clviv.getField(false,"chkBoxEsFecha" /*RemoteObject*/ ).runMethod(true,"getChecked"),parent.__c.getField(true,"True"))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 2548;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Los campos";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Los campos tipo fecha sólo admiten tipo de control filtro = "),parent._tipocontrolfiltro_textfieldbutton,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2549;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "cbotipocontrolfiltro_valuechanged"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 19;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2550;BA.debugLine="cboTCF.Value=\"\"";
Debug.JustUpdateDeviceLine();
_cbotcf.runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 if (true) break;
;
 BA.debugLineNum = 2552;BA.debugLine="If Value=TipoControlFiltro_CheckBox And clvIV.cbo";
Debug.JustUpdateDeviceLine();

case 19:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",_value,(parent._tipocontrolfiltro_checkbox)) && RemoteObject.solveBoolean("!",_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("INTEGER")))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 2553;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El tipo de control filtro = "),parent._tipocontrolfiltro_checkbox,RemoteObject.createImmutable(" sólo es válidos para campos con tipo de dato = INTEGER."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2554;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "cbotipocontrolfiltro_valuechanged"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 22;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2555;BA.debugLine="cboTCF.Value=\"\"";
Debug.JustUpdateDeviceLine();
_cbotcf.runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 if (true) break;
;
 BA.debugLineNum = 2557;BA.debugLine="If (Value<>TipoControlFiltro_CheckBox And Value<>";
Debug.JustUpdateDeviceLine();

case 22:
//if
this.state = 25;
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",_value,(parent._tipocontrolfiltro_checkbox)) && RemoteObject.solveBoolean("!",_value,(RemoteObject.createImmutable("")))))) && RemoteObject.solveBoolean("=",_clviv.getField(false,"chkBoxEsBooleano" /*RemoteObject*/ ).runMethod(true,"getChecked"),parent.__c.getField(true,"True"))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 2558;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Los campos";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Los campos tipo booleano sólo admiten tipo de control filtro = "),parent._tipocontrolfiltro_checkbox,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2559;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "cbotipocontrolfiltro_valuechanged"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 25;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2560;BA.debugLine="cboTCF.Value=\"\"";
Debug.JustUpdateDeviceLine();
_cbotcf.runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 if (true) break;

case 25:
//C
this.state = -1;
;
 BA.debugLineNum = 2562;BA.debugLine="End Sub";
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
public static void  _cbotipodato_valuechanged(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("cboTipoDato_ValueChanged (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2715);
if (RapidSub.canDelegate("cbotipodato_valuechanged")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","cbotipodato_valuechanged", _value); return;}
ResumableSub_cboTipoDato_ValueChanged rsub = new ResumableSub_cboTipoDato_ValueChanged(null,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cboTipoDato_ValueChanged extends BA.ResumableSub {
public ResumableSub_cboTipoDato_ValueChanged(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _value) {
this.parent = parent;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _value;
RemoteObject _cbotd = RemoteObject.declareNull("anywheresoftware.b4j.objects.ComboBoxWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cboTipoDato_ValueChanged (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2715);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Value", _value);
 BA.debugLineNum = 2716;BA.debugLine="If CargandoDatos Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (parent._cargandodatos.<Boolean>get().booleanValue()) { 
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
 BA.debugLineNum = 2717;BA.debugLine="Dim cboTD As ComboBox=Sender";
Debug.JustUpdateDeviceLine();
_cbotd = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");
_cbotd = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ComboBoxWrapper"), parent.__c.runMethod(false,"Sender",jamtableviewcamposbuilder.ba));Debug.locals.put("cboTD", _cbotd);Debug.locals.put("cboTD", _cbotd);
 BA.debugLineNum = 2718;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
Debug.JustUpdateDeviceLine();
_index = parent._clvlistacampos.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _cbotd.getObject()));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 2719;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 2720;BA.debugLine="If cboTD.Value<>\"REAL\" And clvIV.chkBoxEsFecha.Ch";
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
 BA.debugLineNum = 2721;BA.debugLine="If  cboTD.value<>\"INTEGER\" And clvIV.cboTipoContr";
Debug.JustUpdateDeviceLine();
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("!",_cbotd.runMethod(false,"getValue"),RemoteObject.createImmutable(("INTEGER"))) && RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoControlFiltro" /*RemoteObject*/ ).runMethod(false,"getValue"),(parent._tipocontrolfiltro_checkbox))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 2722;BA.debugLine="clvIV.cboTipoControlFiltro.Value=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoControlFiltro" /*RemoteObject*/ ).runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 2723;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("El tipo de control de filtro checkbox, sólo es compatible con tipo de datos INTEGER. Se quita el tipo de control de filtro.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2724;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "cbotipodato_valuechanged"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 16;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2725;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 2727;BA.debugLine="If cboTD.Value=\"REAL\" Or cboTD.Value=\"INTEGER\" Th";
Debug.JustUpdateDeviceLine();

case 16:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",_cbotd.runMethod(false,"getValue"),RemoteObject.createImmutable(("REAL"))) || RemoteObject.solveBoolean("=",_cbotd.runMethod(false,"getValue"),RemoteObject.createImmutable(("INTEGER")))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 2728;BA.debugLine="clvIV.cboAlineacionColumna.Value=\"CENTER-RIGHT\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboAlineacionColumna" /*RemoteObject*/ ).runMethod(false,"setValue",RemoteObject.createImmutable(("CENTER-RIGHT")));
 if (true) break;

case 19:
//C
this.state = -1;
;
 BA.debugLineNum = 2730;BA.debugLine="End Sub";
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
public static RemoteObject  _checkchanges() throws Exception{
try {
		Debug.PushSubsStack("CheckChanges (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2196);
if (RapidSub.canDelegate("checkchanges")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","checkchanges");}
ResumableSub_CheckChanges rsub = new ResumableSub_CheckChanges(null);
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
public ResumableSub_CheckChanges(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
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
		Debug.PushSubsStack("CheckChanges (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2196);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 2197;BA.debugLine="If CurrentFile=\"\" Then Return False";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",parent._currentfile,BA.ObjectToString(""))) { 
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
 BA.debugLineNum = 2199;BA.debugLine="Dim HayCambios As Boolean=False";
Debug.JustUpdateDeviceLine();
_haycambios = parent.__c.getField(true,"False");Debug.locals.put("HayCambios", _haycambios);Debug.locals.put("HayCambios", _haycambios);
 BA.debugLineNum = 2203;BA.debugLine="Dim sCLV As String = ExportToString";
Debug.JustUpdateDeviceLine();
_sclv = _exporttostring();Debug.locals.put("sCLV", _sclv);Debug.locals.put("sCLV", _sclv);
 BA.debugLineNum = 2205;BA.debugLine="Dim parser As JSONParser";
Debug.JustUpdateDeviceLine();
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 2206;BA.debugLine="parser.Initialize(sCLV)";
Debug.JustUpdateDeviceLine();
_parser.runVoidMethod ("Initialize",(Object)(_sclv));
 BA.debugLineNum = 2207;BA.debugLine="Dim msCLV As Map = parser.NextObject";
Debug.JustUpdateDeviceLine();
_msclv = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_msclv = _parser.runMethod(false,"NextObject");Debug.locals.put("msCLV", _msclv);Debug.locals.put("msCLV", _msclv);
 BA.debugLineNum = 2209;BA.debugLine="parser.Initialize(CurrentFileString)";
Debug.JustUpdateDeviceLine();
_parser.runVoidMethod ("Initialize",(Object)(parent._currentfilestring));
 BA.debugLineNum = 2210;BA.debugLine="Dim msCheck As Map = parser.NextObject";
Debug.JustUpdateDeviceLine();
_mscheck = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mscheck = _parser.runMethod(false,"NextObject");Debug.locals.put("msCheck", _mscheck);Debug.locals.put("msCheck", _mscheck);
 BA.debugLineNum = 2213;BA.debugLine="msCLV.Remove(\"FechaUltimaModificacion\")";
Debug.JustUpdateDeviceLine();
_msclv.runVoidMethod ("Remove",(Object)((RemoteObject.createImmutable("FechaUltimaModificacion"))));
 BA.debugLineNum = 2214;BA.debugLine="msCheck.Remove(\"FechaUltimaModificacion\")";
Debug.JustUpdateDeviceLine();
_mscheck.runVoidMethod ("Remove",(Object)((RemoteObject.createImmutable("FechaUltimaModificacion"))));
 BA.debugLineNum = 2216;BA.debugLine="Dim Check1 As Boolean=Comparar2Mapas(msCLV,msChec";
Debug.JustUpdateDeviceLine();
_check1 = _comparar2mapas(_msclv,_mscheck);Debug.locals.put("Check1", _check1);Debug.locals.put("Check1", _check1);
 BA.debugLineNum = 2217;BA.debugLine="Dim Check2 As Boolean=Comparar2Mapas(msCheck,msCL";
Debug.JustUpdateDeviceLine();
_check2 = _comparar2mapas(_mscheck,_msclv);Debug.locals.put("Check2", _check2);Debug.locals.put("Check2", _check2);
 BA.debugLineNum = 2219;BA.debugLine="HayCambios=(Not(Check1) Or Not(Check2))";
Debug.JustUpdateDeviceLine();
_haycambios = BA.ObjectToBoolean((RemoteObject.solveBoolean(".",parent.__c.runMethod(true,"Not",(Object)(_check1))) || RemoteObject.solveBoolean(".",parent.__c.runMethod(true,"Not",(Object)(_check2)))));Debug.locals.put("HayCambios", _haycambios);
 BA.debugLineNum = 2222;BA.debugLine="If HayCambios Then";
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
 BA.debugLineNum = 2223;BA.debugLine="Wait For (Dialog.Show(\"¿Grabar Cambios?\", \"Sí\",";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "checkchanges"), parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_show" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(("¿Grabar Cambios?"))),(Object)(RemoteObject.createImmutable(("Sí"))),(Object)(RemoteObject.createImmutable(("No"))),(Object)((RemoteObject.createImmutable("Cancel")))));
this.state = 23;
return;
case 23:
//C
this.state = 10;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2224;BA.debugLine="Select Result";
Debug.JustUpdateDeviceLine();
if (true) break;

case 10:
//select
this.state = 19;
switch (BA.switchObjectToInt(_result,parent._xui.getField(true,"DialogResponse_Cancel"),parent._xui.getField(true,"DialogResponse_Positive"),parent._xui.getField(true,"DialogResponse_Negative"))) {
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
 BA.debugLineNum = 2226;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 14:
//C
this.state = 19;
 BA.debugLineNum = 2228;BA.debugLine="mnuSave_Action";
Debug.JustUpdateDeviceLine();
_mnusave_action();
 BA.debugLineNum = 2229;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 16:
//C
this.state = 19;
 BA.debugLineNum = 2231;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 2233;BA.debugLine="Return True";
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
 BA.debugLineNum = 2236;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 22:
//C
this.state = -1;
;
 BA.debugLineNum = 2238;BA.debugLine="End Sub";
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
public static RemoteObject  _checkforwarnings() throws Exception{
try {
		Debug.PushSubsStack("CheckForWarnings (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2276);
if (RapidSub.canDelegate("checkforwarnings")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","checkforwarnings");}
ResumableSub_CheckForWarnings rsub = new ResumableSub_CheckForWarnings(null);
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
public ResumableSub_CheckForWarnings(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _lstcampos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstaliascampos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstencabezados = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstnombrescamposdialogosaux = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstprimarykeys = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _omprimarykeys = RemoteObject.declareNull("b4j.docU.b4xorderedmap");
RemoteObject _numcolumnastableview = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _nombrecampopk = RemoteObject.createImmutable("");
RemoteObject _lstnombrescamposclvincluidosenformulascamposcalculados = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int step14;
int limit14;
RemoteObject group102;
int index102;
int groupLen102;
int step113;
int limit113;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CheckForWarnings (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2276);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 2277;BA.debugLine="Dim lstCampos As List";
Debug.JustUpdateDeviceLine();
_lstcampos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCampos", _lstcampos);
 BA.debugLineNum = 2278;BA.debugLine="lstCampos.Initialize";
Debug.JustUpdateDeviceLine();
_lstcampos.runVoidMethod ("Initialize");
 BA.debugLineNum = 2279;BA.debugLine="Dim lstAliasCampos As List";
Debug.JustUpdateDeviceLine();
_lstaliascampos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstAliasCampos", _lstaliascampos);
 BA.debugLineNum = 2280;BA.debugLine="lstAliasCampos.Initialize";
Debug.JustUpdateDeviceLine();
_lstaliascampos.runVoidMethod ("Initialize");
 BA.debugLineNum = 2281;BA.debugLine="Dim lstEncabezados As List";
Debug.JustUpdateDeviceLine();
_lstencabezados = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstEncabezados", _lstencabezados);
 BA.debugLineNum = 2282;BA.debugLine="lstEncabezados.Initialize";
Debug.JustUpdateDeviceLine();
_lstencabezados.runVoidMethod ("Initialize");
 BA.debugLineNum = 2283;BA.debugLine="Dim lstNombresCamposDialogosAux As List";
Debug.JustUpdateDeviceLine();
_lstnombrescamposdialogosaux = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstNombresCamposDialogosAux", _lstnombrescamposdialogosaux);
 BA.debugLineNum = 2284;BA.debugLine="lstNombresCamposDialogosAux.Initialize";
Debug.JustUpdateDeviceLine();
_lstnombrescamposdialogosaux.runVoidMethod ("Initialize");
 BA.debugLineNum = 2286;BA.debugLine="Dim lstPrimaryKeys As List";
Debug.JustUpdateDeviceLine();
_lstprimarykeys = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstPrimaryKeys", _lstprimarykeys);
 BA.debugLineNum = 2287;BA.debugLine="lstPrimaryKeys.Initialize";
Debug.JustUpdateDeviceLine();
_lstprimarykeys.runVoidMethod ("Initialize");
 BA.debugLineNum = 2290;BA.debugLine="Dim omPrimaryKeys As B4XOrderedMap";
Debug.JustUpdateDeviceLine();
_omprimarykeys = RemoteObject.createNew ("b4j.docU.b4xorderedmap");Debug.locals.put("omPrimaryKeys", _omprimarykeys);
 BA.debugLineNum = 2291;BA.debugLine="omPrimaryKeys.Initialize";
Debug.JustUpdateDeviceLine();
_omprimarykeys.runClassMethod (b4j.docU.b4xorderedmap.class, "_initialize" /*RemoteObject*/ ,jamtableviewcamposbuilder.ba);
 BA.debugLineNum = 2293;BA.debugLine="Dim NumColumnasTableView As Int";
Debug.JustUpdateDeviceLine();
_numcolumnastableview = RemoteObject.createImmutable(0);Debug.locals.put("NumColumnasTableView", _numcolumnastableview);
 BA.debugLineNum = 2295;BA.debugLine="For i = 0 To clvListaCampos.Size - 1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//for
this.state = 68;
step14 = 1;
limit14 = RemoteObject.solve(new RemoteObject[] {parent._clvlistacampos.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 100;
if (true) break;

case 100:
//C
this.state = 68;
if ((step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14)) this.state = 3;
if (true) break;

case 101:
//C
this.state = 100;
_i = ((int)(0 + _i + step14)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2297;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaC";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 2299;BA.debugLine="If clvIV.cboCampo.Value=\"\" Then";
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
 BA.debugLineNum = 2300;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El campo n";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El campo nº "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable(" está en blanco. Es un dato obligatorio"))),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2301;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 102;
return;
case 102:
//C
this.state = 15;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2302;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 2304;BA.debugLine="If lstCampos.IndexOf(clvIV.cboCampo.Value)=-1 T";
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
 BA.debugLineNum = 2305;BA.debugLine="lstCampos.Add(clvIV.cboCampo.Value)";
Debug.JustUpdateDeviceLine();
_lstcampos.runVoidMethod ("Add",(Object)(_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue")));
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 2308;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El campo";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El campo nº "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable("("),_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(") está repetido."))),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2309;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 103;
return;
case 103:
//C
this.state = 14;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2310;BA.debugLine="Return False";
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
 BA.debugLineNum = 2314;BA.debugLine="If clvIV.txtAliasCampo.text=\"\" Then";
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
 BA.debugLineNum = 2315;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El alias d";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El alias del campo nº "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable(" está en blanco. Es un dato obligatorio"))),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2316;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 104;
return;
case 104:
//C
this.state = 26;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2317;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 2319;BA.debugLine="If lstAliasCampos.IndexOf(clvIV.txtAliasCampo.t";
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
 BA.debugLineNum = 2320;BA.debugLine="lstAliasCampos.Add(clvIV.txtAliasCampo.text)";
Debug.JustUpdateDeviceLine();
_lstaliascampos.runVoidMethod ("Add",(Object)((_clviv.getField(false,"txtAliasCampo" /*RemoteObject*/ ).runMethod(true,"getText"))));
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 2322;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El alias";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El alias del campo nº "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable("("),_clviv.getField(false,"txtAliasCampo" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(") está repetido."))),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2323;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 105;
return;
case 105:
//C
this.state = 25;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2324;BA.debugLine="Return False";
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
 BA.debugLineNum = 2339;BA.debugLine="If clvIV.cboTipoDato.value=\"\" Then";
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
 BA.debugLineNum = 2340;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El tipo de dato de la columna nº "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable(" está en blanco. Es un dato obligatorio."))),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2341;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 106;
return;
case 106:
//C
this.state = 29;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2342;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 2357;BA.debugLine="If clvIV.chkBoxCampoCalculado.Checked=True And c";
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
 BA.debugLineNum = 2358;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El alias d";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El alias de la columna nº "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable(" está en blanco. Un campo calculado siempre debe tener un alias de campo."))),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2359;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 107;
return;
case 107:
//C
this.state = 32;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2360;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 2363;BA.debugLine="If clvIV.chkBoxCampoCalculado.Checked=True And c";
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
 BA.debugLineNum = 2364;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un campo c";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("Un campo calculado no puede ser clave primaria de la tabla.")),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2365;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 108;
return;
case 108:
//C
this.state = 35;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2366;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 2380;BA.debugLine="If clvIV.cboTipoDato.Value<>\"INTEGER\" And clvIV.";
Debug.JustUpdateDeviceLine();

case 35:
//if
this.state = 38;
if (RemoteObject.solveBoolean("!",_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("INTEGER"))) && RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoControlFiltro" /*RemoteObject*/ ).runMethod(false,"getValue"),(parent._tipocontrolfiltro_checkbox))) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 2381;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo co";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El tipo control de filtro "),parent._tipocontrolfiltro_checkbox,RemoteObject.createImmutable(" sólo es compatible con tipo de datos INTEGER ."))),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2382;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 109;
return;
case 109:
//C
this.state = 38;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2383;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 2387;BA.debugLine="If clvIV.cboTipoDato.Value<>\"REAL\"  And clvIV.cb";
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
 BA.debugLineNum = 2388;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un campo t";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("Un campo tipo fecha sólo es compatible con tipo de datos REAL o INTEGER .")),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2389;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 110;
return;
case 110:
//C
this.state = 41;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2390;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 2394;BA.debugLine="If (clvIV.cboTipoDato.Value<>\"INTEGER\" And clvIV";
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
 BA.debugLineNum = 2395;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un campo t";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Un campo tipo booleano sólo es compatible con tipos de datos INTEGER y TEXT ."),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("("),_clviv.getField(false,"txtAliasCampo" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(")"))),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2396;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 111;
return;
case 111:
//C
this.state = 44;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2397;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 2402;BA.debugLine="If clvIV.chkboxKeyID.Checked Then";
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
 BA.debugLineNum = 2403;BA.debugLine="omPrimaryKeys.Put(clvIV.lblOrdenKeyID.Text,clvI";
Debug.JustUpdateDeviceLine();
_omprimarykeys.runClassMethod (b4j.docU.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)((_clviv.getField(false,"lblOrdenKeyID" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue")));
 if (true) break;
;
 BA.debugLineNum = 2406;BA.debugLine="If clvIV.cboTipoControlFiltro.Value<>\"\" Then";
Debug.JustUpdateDeviceLine();

case 47:
//if
this.state = 64;
if (RemoteObject.solveBoolean("!",_clviv.getField(false,"cboTipoControlFiltro" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("")))) { 
this.state = 49;
}else {
this.state = 63;
}if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 2407;BA.debugLine="If clvIV.txtNombreCampoDialogosAux.Text=\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 50:
//if
this.state = 61;
if (RemoteObject.solveBoolean("=",_clviv.getField(false,"txtNombreCampoDialogosAux" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 52;
}else {
this.state = 54;
}if (true) break;

case 52:
//C
this.state = 61;
 BA.debugLineNum = 2408;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un campo";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Un campo con Tipo Control Filtro<>vacío, debe tener un NombreCampoDialogosAux<>vacío."),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Este nombre se mostrará en los selectores de filtros, diálogos tipo ordenación, ..."),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("("),_clviv.getField(false,"txtAliasCampo" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(")"))),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2409;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 112;
return;
case 112:
//C
this.state = 61;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2410;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 54:
//C
this.state = 55;
 BA.debugLineNum = 2412;BA.debugLine="If lstNombresCamposDialogosAux.IndexOf(clvIV.t";
Debug.JustUpdateDeviceLine();
if (true) break;

case 55:
//if
this.state = 60;
if (RemoteObject.solveBoolean(">",_lstnombrescamposdialogosaux.runMethod(true,"IndexOf",(Object)((_clviv.getField(false,"txtNombreCampoDialogosAux" /*RemoteObject*/ ).runMethod(true,"getText")))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 57;
}else {
this.state = 59;
}if (true) break;

case 57:
//C
this.state = 60;
 BA.debugLineNum = 2413;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El nombr";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El nombre de campo dialogos aux para el alias campo nº "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable("("),_clviv.getField(false,"txtAliasCampo" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(") está repetido."))),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2414;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 113;
return;
case 113:
//C
this.state = 60;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2415;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 2417;BA.debugLine="lstNombresCamposDialogosAux.Add(clvIV.txtNomb";
Debug.JustUpdateDeviceLine();
_lstnombrescamposdialogosaux.runVoidMethod ("Add",(Object)((_clviv.getField(false,"txtNombreCampoDialogosAux" /*RemoteObject*/ ).runMethod(true,"getText"))));
 if (true) break;

case 60:
//C
this.state = 61;
;
 if (true) break;

case 61:
//C
this.state = 64;
;
 if (true) break;

case 63:
//C
this.state = 64;
 if (true) break;
;
 BA.debugLineNum = 2429;BA.debugLine="If clvIV.chkColumnaTableView.Checked Then";
Debug.JustUpdateDeviceLine();

case 64:
//if
this.state = 67;
if (_clviv.getField(false,"chkColumnaTableView" /*RemoteObject*/ ).runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 66;
}if (true) break;

case 66:
//C
this.state = 67;
 BA.debugLineNum = 2438;BA.debugLine="NumColumnasTableView=NumColumnasTableView+1";
Debug.JustUpdateDeviceLine();
_numcolumnastableview = RemoteObject.solve(new RemoteObject[] {_numcolumnastableview,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("NumColumnasTableView", _numcolumnastableview);
 if (true) break;

case 67:
//C
this.state = 101;
;
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2448;BA.debugLine="If NumColumnasTableView=0 Then";
Debug.JustUpdateDeviceLine();

case 68:
//if
this.state = 71;
if (RemoteObject.solveBoolean("=",_numcolumnastableview,BA.numberCast(double.class, 0))) { 
this.state = 70;
}if (true) break;

case 70:
//C
this.state = 71;
 BA.debugLineNum = 2449;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Debe haber";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("Debe haber al menos una columna para mostrar en la tabla (se crearán las columnas para los campo con checkbox = true.")),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2450;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 114;
return;
case 114:
//C
this.state = 71;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2451;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 2454;BA.debugLine="If omPrimaryKeys.Size>0 Then";
Debug.JustUpdateDeviceLine();

case 71:
//if
this.state = 78;
if (RemoteObject.solveBoolean(">",_omprimarykeys.runClassMethod (b4j.docU.b4xorderedmap.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 73;
}if (true) break;

case 73:
//C
this.state = 74;
 BA.debugLineNum = 2455;BA.debugLine="omPrimaryKeys.Keys.Sort(True)";
Debug.JustUpdateDeviceLine();
_omprimarykeys.runClassMethod (b4j.docU.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ ).runVoidMethod ("Sort",(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 2456;BA.debugLine="For Each NombreCampoPK As String In omPrimaryKey";
Debug.JustUpdateDeviceLine();
if (true) break;

case 74:
//for
this.state = 77;
group102 = _omprimarykeys.runClassMethod (b4j.docU.b4xorderedmap.class, "_getvalues" /*RemoteObject*/ );
index102 = 0;
groupLen102 = group102.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("NombreCampoPK", _nombrecampopk);
this.state = 115;
if (true) break;

case 115:
//C
this.state = 77;
if (index102 < groupLen102) {
this.state = 76;
_nombrecampopk = BA.ObjectToString(group102.runMethod(false,"Get",index102));Debug.locals.put("NombreCampoPK", _nombrecampopk);}
if (true) break;

case 116:
//C
this.state = 115;
index102++;
Debug.locals.put("NombreCampoPK", _nombrecampopk);
if (true) break;

case 76:
//C
this.state = 116;
 BA.debugLineNum = 2457;BA.debugLine="lstPrimaryKeys.Add(NombreCampoPK)";
Debug.JustUpdateDeviceLine();
_lstprimarykeys.runVoidMethod ("Add",(Object)((_nombrecampopk)));
 if (true) break;
if (true) break;

case 77:
//C
this.state = 78;
Debug.locals.put("NombreCampoPK", _nombrecampopk);
;
 if (true) break;
;
 BA.debugLineNum = 2461;BA.debugLine="If lstPrimaryKeys.Size=0 Then";
Debug.JustUpdateDeviceLine();

case 78:
//if
this.state = 87;
if (RemoteObject.solveBoolean("=",_lstprimarykeys.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 80;
}if (true) break;

case 80:
//C
this.state = 81;
 BA.debugLineNum = 2468;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"No hay nin";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"Msgbox2Async",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("No hay ningún campo definido como clave primaria"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("La tabla será de tipo ReadOnly (SIN control por medio de la clase. Controlar via código)."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("¿Continuar?"))),(Object)(BA.ObjectToString("No hay clave primaria definida")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2469;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 117;
return;
case 117:
//C
this.state = 81;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2470;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Re";
Debug.JustUpdateDeviceLine();
if (true) break;

case 81:
//if
this.state = 86;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 83;
;}if (true) break;

case 83:
//C
this.state = 86;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 86:
//C
this.state = 87;
;
 if (true) break;

case 87:
//C
this.state = 88;
;
 BA.debugLineNum = 2502;BA.debugLine="Dim lstNombresCamposCLVIncluidosEnFormulasCamposC";
Debug.JustUpdateDeviceLine();
_lstnombrescamposclvincluidosenformulascamposcalculados = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstnombrescamposclvincluidosenformulascamposcalculados = _nombrescamposclvincluidosenformulascamposcalculados();Debug.locals.put("lstNombresCamposCLVIncluidosEnFormulasCamposCalculados", _lstnombrescamposclvincluidosenformulascamposcalculados);Debug.locals.put("lstNombresCamposCLVIncluidosEnFormulasCamposCalculados", _lstnombrescamposclvincluidosenformulascamposcalculados);
 BA.debugLineNum = 2503;BA.debugLine="If lstNombresCamposCLVIncluidosEnFormulasCamposCa";
Debug.JustUpdateDeviceLine();
if (true) break;

case 88:
//if
this.state = 99;
if (RemoteObject.solveBoolean(">",_lstnombrescamposclvincluidosenformulascamposcalculados.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 90;
}if (true) break;

case 90:
//C
this.state = 91;
 BA.debugLineNum = 2504;BA.debugLine="For i=0 To lstNombresCamposCLVIncluidosEnFormula";
Debug.JustUpdateDeviceLine();
if (true) break;

case 91:
//for
this.state = 98;
step113 = 1;
limit113 = RemoteObject.solve(new RemoteObject[] {_lstnombrescamposclvincluidosenformulascamposcalculados.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 118;
if (true) break;

case 118:
//C
this.state = 98;
if ((step113 > 0 && _i <= limit113) || (step113 < 0 && _i >= limit113)) this.state = 93;
if (true) break;

case 119:
//C
this.state = 118;
_i = ((int)(0 + _i + step113)) ;
Debug.locals.put("i", _i);
if (true) break;

case 93:
//C
this.state = 94;
 BA.debugLineNum = 2506;BA.debugLine="If lstAliasCampos.IndexOf(lstNombresCamposCLVIn";
Debug.JustUpdateDeviceLine();
if (true) break;

case 94:
//if
this.state = 97;
if (RemoteObject.solveBoolean("=",_lstaliascampos.runMethod(true,"IndexOf",(Object)(_lstnombrescamposclvincluidosenformulascamposcalculados.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 96;
}if (true) break;

case 96:
//C
this.state = 97;
 BA.debugLineNum = 2508;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El campo";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El campo "),_lstnombrescamposclvincluidosenformulascamposcalculados.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(" está incluido en un campo calculado, pero no está en los alias de campos definidos."))),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2509;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 120;
return;
case 120:
//C
this.state = 97;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2510;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 97:
//C
this.state = 119;
;
 if (true) break;
if (true) break;

case 98:
//C
this.state = 99;
Debug.locals.put("i", _i);
;
 if (true) break;

case 99:
//C
this.state = -1;
;
 BA.debugLineNum = 2521;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 2522;BA.debugLine="End Sub";
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
public static RemoteObject  _chkboxcampocalculado_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkBoxCampoCalculado_CheckedChange (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2697);
if (RapidSub.canDelegate("chkboxcampocalculado_checkedchange")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","chkboxcampocalculado_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 2697;BA.debugLine="private Sub chkBoxCampoCalculado_CheckedChange(Che";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2698;BA.debugLine="If CargandoDatos Then Return";
Debug.JustUpdateDeviceLine();
if (jamtableviewcamposbuilder._cargandodatos.<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 2711;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chkboxconvalordefecto_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkBoxConValorDefecto_CheckedChange (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3214);
if (RapidSub.canDelegate("chkboxconvalordefecto_checkedchange")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","chkboxconvalordefecto_checkedchange", _checked);}
RemoteObject _chkvf = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
RemoteObject _txtvf = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 3214;BA.debugLine="Private Sub chkBoxConValorDefecto_CheckedChange(Ch";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3215;BA.debugLine="If CargandoDatos Then Return";
Debug.JustUpdateDeviceLine();
if (jamtableviewcamposbuilder._cargandodatos.<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 3216;BA.debugLine="Dim chkVF As CheckBox=Sender";
Debug.JustUpdateDeviceLine();
_chkvf = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
_chkvf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.CheckboxWrapper"), jamtableviewcamposbuilder.__c.runMethod(false,"Sender",jamtableviewcamposbuilder.ba));Debug.locals.put("chkVF", _chkvf);Debug.locals.put("chkVF", _chkvf);
 BA.debugLineNum = 3217;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
Debug.JustUpdateDeviceLine();
_index = jamtableviewcamposbuilder._clvlistacampos.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _chkvf.getObject()));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 3218;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
Debug.JustUpdateDeviceLine();
_clviv = (jamtableviewcamposbuilder._clvlistacampos.runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 3219;BA.debugLine="Dim txtVF As TextField=clvIV.txtValorDefecto";
Debug.JustUpdateDeviceLine();
_txtvf = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
_txtvf = _clviv.getField(false,"txtValorDefecto" /*RemoteObject*/ );Debug.locals.put("txtVF", _txtvf);Debug.locals.put("txtVF", _txtvf);
 BA.debugLineNum = 3220;BA.debugLine="txtVF.Visible= chkVF.Checked";
Debug.JustUpdateDeviceLine();
_txtvf.runMethod(true,"setVisible",_chkvf.runMethod(true,"getChecked"));
 BA.debugLineNum = 3221;BA.debugLine="If chkVF.Checked=False Then txtVF.Text=\"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_chkvf.runMethod(true,"getChecked"),jamtableviewcamposbuilder.__c.getField(true,"False"))) { 
_txtvf.runMethod(true,"setText",BA.ObjectToString(""));};
 BA.debugLineNum = 3222;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _chkboxesbooleano_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkBoxEsBooleano_CheckedChange (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2602);
if (RapidSub.canDelegate("chkboxesbooleano_checkedchange")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","chkboxesbooleano_checkedchange", _checked); return;}
ResumableSub_chkBoxEsBooleano_CheckedChange rsub = new ResumableSub_chkBoxEsBooleano_CheckedChange(null,_checked);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_chkBoxEsBooleano_CheckedChange extends BA.ResumableSub {
public ResumableSub_chkBoxEsBooleano_CheckedChange(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _checked) {
this.parent = parent;
this._checked = _checked;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _checked;
RemoteObject _chkesb = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _txtesb = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
RemoteObject _cbotd = RemoteObject.declareNull("anywheresoftware.b4j.objects.ComboBoxWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("chkBoxEsBooleano_CheckedChange (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2602);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 2603;BA.debugLine="If CargandoDatos Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (parent._cargandodatos.<Boolean>get().booleanValue()) { 
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
 BA.debugLineNum = 2605;BA.debugLine="If CorrigiendoChkBoxEsBooleano Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 10;
if (parent._corrigiendochkboxesbooleano.<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 2606;BA.debugLine="CorrigiendoChkBoxEsBooleano=False";
Debug.JustUpdateDeviceLine();
parent._corrigiendochkboxesbooleano = parent.__c.getField(true,"False");
 BA.debugLineNum = 2607;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 2610;BA.debugLine="Dim chkEsB As CheckBox=Sender";
Debug.JustUpdateDeviceLine();
_chkesb = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
_chkesb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.CheckboxWrapper"), parent.__c.runMethod(false,"Sender",jamtableviewcamposbuilder.ba));Debug.locals.put("chkEsB", _chkesb);Debug.locals.put("chkEsB", _chkesb);
 BA.debugLineNum = 2611;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
Debug.JustUpdateDeviceLine();
_index = parent._clvlistacampos.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _chkesb.getObject()));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 2612;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 2613;BA.debugLine="If Checked And (clvIV.cboTipoDato.Value<>\"INTEGER";
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
 BA.debugLineNum = 2614;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un campo bo";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("Un campo booleano sólo puede corresponder a tipos de datos TEXT o INTEGER.")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2615;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "chkboxesbooleano_checkedchange"), _msa);
this.state = 34;
return;
case 34:
//C
this.state = 14;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2616;BA.debugLine="CorrigiendoChkBoxEsBooleano=True";
Debug.JustUpdateDeviceLine();
parent._corrigiendochkboxesbooleano = parent.__c.getField(true,"True");
 BA.debugLineNum = 2617;BA.debugLine="chkEsB.Checked=False";
Debug.JustUpdateDeviceLine();
_chkesb.runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 if (true) break;
;
 BA.debugLineNum = 2620;BA.debugLine="If Checked And (clvIV.cboTipoControlFiltro.Value<";
Debug.JustUpdateDeviceLine();

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean(".",_checked) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",_clviv.getField(false,"cboTipoControlFiltro" /*RemoteObject*/ ).runMethod(false,"getValue"),(parent._tipocontrolfiltro_checkbox)) && RemoteObject.solveBoolean("!",_clviv.getField(false,"cboTipoControlFiltro" /*RemoteObject*/ ).runMethod(false,"getValue"),(RemoteObject.createImmutable(""))))))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 2621;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El tipo de control de filtro para un campo tipo Booleano tiene que ser "),parent._tipocontrolfiltro_checkbox,RemoteObject.createImmutable(" o estar en blanco (si no se quiere filtrar por este campo)."),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Si es necesario, deja el tipo de control filtro en blanco."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2622;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "chkboxesbooleano_checkedchange"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 17;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2623;BA.debugLine="CorrigiendoChkBoxEsBooleano=True";
Debug.JustUpdateDeviceLine();
parent._corrigiendochkboxesbooleano = parent.__c.getField(true,"True");
 BA.debugLineNum = 2624;BA.debugLine="chkEsB.Checked=False";
Debug.JustUpdateDeviceLine();
_chkesb.runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 if (true) break;

case 17:
//C
this.state = 18;
;
 BA.debugLineNum = 2627;BA.debugLine="Dim txtEsB As TextField=clvIV.txtValorTrueCampoBo";
Debug.JustUpdateDeviceLine();
_txtesb = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
_txtesb = _clviv.getField(false,"txtValorTrueCampoBooleano" /*RemoteObject*/ );Debug.locals.put("txtEsB", _txtesb);Debug.locals.put("txtEsB", _txtesb);
 BA.debugLineNum = 2628;BA.debugLine="If chkEsB.Checked=False Then txtEsB.Text=\"\"";
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
 BA.debugLineNum = 2629;BA.debugLine="If chkEsB.Checked Then";
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
 BA.debugLineNum = 2630;BA.debugLine="Dim cboTD As ComboBox=clvIV.cboTipoDato";
Debug.JustUpdateDeviceLine();
_cbotd = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");
_cbotd = _clviv.getField(false,"cboTipoDato" /*RemoteObject*/ );Debug.locals.put("cboTD", _cbotd);Debug.locals.put("cboTD", _cbotd);
 BA.debugLineNum = 2631;BA.debugLine="If cboTD.Value=\"TEXT\" Then";
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
 BA.debugLineNum = 2632;BA.debugLine="txtEsB.Text=\"\"";
Debug.JustUpdateDeviceLine();
_txtesb.runMethod(true,"setText",BA.ObjectToString(""));
 if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 2634;BA.debugLine="txtEsB.Text=1";
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
 BA.debugLineNum = 2637;BA.debugLine="End Sub";
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
public static void  _chkboxesfecha_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkBoxEsFecha_CheckedChange (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2571);
if (RapidSub.canDelegate("chkboxesfecha_checkedchange")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","chkboxesfecha_checkedchange", _checked); return;}
ResumableSub_chkBoxEsFecha_CheckedChange rsub = new ResumableSub_chkBoxEsFecha_CheckedChange(null,_checked);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_chkBoxEsFecha_CheckedChange extends BA.ResumableSub {
public ResumableSub_chkBoxEsFecha_CheckedChange(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _checked) {
this.parent = parent;
this._checked = _checked;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _checked;
RemoteObject _chkesf = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("chkBoxEsFecha_CheckedChange (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2571);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 2572;BA.debugLine="If CargandoDatos Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (parent._cargandodatos.<Boolean>get().booleanValue()) { 
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
 BA.debugLineNum = 2574;BA.debugLine="If CorrigiendoChkBoxEsFecha Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 10;
if (parent._corrigiendochkboxesfecha.<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 2575;BA.debugLine="CorrigiendoChkBoxEsFecha=False";
Debug.JustUpdateDeviceLine();
parent._corrigiendochkboxesfecha = parent.__c.getField(true,"False");
 BA.debugLineNum = 2576;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 2579;BA.debugLine="Dim chkEsF As CheckBox=Sender";
Debug.JustUpdateDeviceLine();
_chkesf = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
_chkesf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.CheckboxWrapper"), parent.__c.runMethod(false,"Sender",jamtableviewcamposbuilder.ba));Debug.locals.put("chkEsF", _chkesf);Debug.locals.put("chkEsF", _chkesf);
 BA.debugLineNum = 2580;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
Debug.JustUpdateDeviceLine();
_index = parent._clvlistacampos.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _chkesf.getObject()));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 2581;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 2582;BA.debugLine="If Checked And clvIV.cboTipoDato.Value<>\"REAL\" An";
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
 BA.debugLineNum = 2583;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un tipo de";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Un tipo de dato="),_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(" no puede ser una fecha."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2584;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "chkboxesfecha_checkedchange"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 14;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2585;BA.debugLine="CorrigiendoChkBoxEsFecha=True";
Debug.JustUpdateDeviceLine();
parent._corrigiendochkboxesfecha = parent.__c.getField(true,"True");
 BA.debugLineNum = 2586;BA.debugLine="chkEsF.Checked=False";
Debug.JustUpdateDeviceLine();
_chkesf.runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 if (true) break;
;
 BA.debugLineNum = 2589;BA.debugLine="If Checked=False And clvIV.cboTipoControlFiltro.V";
Debug.JustUpdateDeviceLine();

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_checked,parent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoControlFiltro" /*RemoteObject*/ ).runMethod(false,"getValue"),(parent._tipocontrolfiltro_textfieldbutton))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 2590;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Si el tipo";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Si el tipo de control filtro es = "),parent._tipocontrolfiltro_textfieldbutton,RemoteObject.createImmutable(" , el campo tiene que ser tipo fecha. Si no lo es, deja primero el tipo control filtro en blanco."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2591;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "chkboxesfecha_checkedchange"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 17;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2592;BA.debugLine="CorrigiendoChkBoxEsFecha=True";
Debug.JustUpdateDeviceLine();
parent._corrigiendochkboxesfecha = parent.__c.getField(true,"True");
 BA.debugLineNum = 2593;BA.debugLine="chkEsF.Checked=True";
Debug.JustUpdateDeviceLine();
_chkesf.runMethod(true,"setChecked",parent.__c.getField(true,"True"));
 if (true) break;
;
 BA.debugLineNum = 2596;BA.debugLine="If chkEsF.Checked Then";
Debug.JustUpdateDeviceLine();

case 17:
//if
this.state = 20;
if (_chkesf.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 2597;BA.debugLine="clvIV.cboAlineacionColumna.Value=\"CENTER\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboAlineacionColumna" /*RemoteObject*/ ).runMethod(false,"setValue",RemoteObject.createImmutable(("CENTER")));
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 2600;BA.debugLine="End Sub";
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
public static void  _chkboxkeyid_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkboxKeyID_CheckedChange (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2639);
if (RapidSub.canDelegate("chkboxkeyid_checkedchange")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","chkboxkeyid_checkedchange", _checked); return;}
ResumableSub_chkboxKeyID_CheckedChange rsub = new ResumableSub_chkboxKeyID_CheckedChange(null,_checked);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_chkboxKeyID_CheckedChange extends BA.ResumableSub {
public ResumableSub_chkboxKeyID_CheckedChange(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _checked) {
this.parent = parent;
this._checked = _checked;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _checked;
RemoteObject _chkkid = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _nombrecampokeyeliminada = RemoteObject.createImmutable("");
RemoteObject _keyideliminada = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("chkboxKeyID_CheckedChange (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2639);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 2640;BA.debugLine="If CargandoDatos Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (parent._cargandodatos.<Boolean>get().booleanValue()) { 
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
 BA.debugLineNum = 2642;BA.debugLine="If CorrigiendoChkBoxKeyID Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 10;
if (parent._corrigiendochkboxkeyid.<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 2643;BA.debugLine="CorrigiendoChkBoxKeyID=False";
Debug.JustUpdateDeviceLine();
parent._corrigiendochkboxkeyid = parent.__c.getField(true,"False");
 BA.debugLineNum = 2644;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 2647;BA.debugLine="Dim chkKID As CheckBox=Sender";
Debug.JustUpdateDeviceLine();
_chkkid = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
_chkkid = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.CheckboxWrapper"), parent.__c.runMethod(false,"Sender",jamtableviewcamposbuilder.ba));Debug.locals.put("chkKID", _chkkid);Debug.locals.put("chkKID", _chkkid);
 BA.debugLineNum = 2648;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
Debug.JustUpdateDeviceLine();
_index = parent._clvlistacampos.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _chkkid.getObject()));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 2649;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 2650;BA.debugLine="If Checked Then";
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
 BA.debugLineNum = 2651;BA.debugLine="If clvIV.cboCampo.Value=\"\" Then";
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
 BA.debugLineNum = 2652;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El nombre";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("El nombre del campo no puede estar vacío.")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2653;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "chkboxkeyid_checkedchange"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 17;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2654;BA.debugLine="CorrigiendoChkBoxKeyID=True";
Debug.JustUpdateDeviceLine();
parent._corrigiendochkboxkeyid = parent.__c.getField(true,"True");
 BA.debugLineNum = 2655;BA.debugLine="chkKID.Checked=False";
Debug.JustUpdateDeviceLine();
_chkkid.runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 BA.debugLineNum = 2656;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 2659;BA.debugLine="If Checked And clvIV.chkBoxCampoCalculado.Checke";
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
 BA.debugLineNum = 2660;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un campo c";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("Un campo calculado no puede pertenecer a la clave principal.")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2661;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "chkboxkeyid_checkedchange"), _msa);
this.state = 30;
return;
case 30:
//C
this.state = 20;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2662;BA.debugLine="CorrigiendoChkBoxKeyID=True";
Debug.JustUpdateDeviceLine();
parent._corrigiendochkboxkeyid = parent.__c.getField(true,"True");
 BA.debugLineNum = 2663;BA.debugLine="chkKID.Checked=False";
Debug.JustUpdateDeviceLine();
_chkkid.runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 BA.debugLineNum = 2664;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 2668;BA.debugLine="If lstPrimaryKey.IndexOf(clvIV.cboCampo.Value)>-";
Debug.JustUpdateDeviceLine();

case 20:
//if
this.state = 25;
if (RemoteObject.solveBoolean(">",parent._lstprimarykey.runMethod(true,"IndexOf",(Object)(_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue"))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 25;
 BA.debugLineNum = 2669;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El campo \"";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El campo "),_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(" ya pertenece a la clave principal."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2670;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "chkboxkeyid_checkedchange"), _msa);
this.state = 31;
return;
case 31:
//C
this.state = 25;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2671;BA.debugLine="CorrigiendoChkBoxKeyID=True";
Debug.JustUpdateDeviceLine();
parent._corrigiendochkboxkeyid = parent.__c.getField(true,"True");
 BA.debugLineNum = 2672;BA.debugLine="chkKID.Checked=False";
Debug.JustUpdateDeviceLine();
_chkkid.runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 2674;BA.debugLine="lstPrimaryKey.Add(clvIV.cboCampo.Value)";
Debug.JustUpdateDeviceLine();
parent._lstprimarykey.runVoidMethod ("Add",(Object)(_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue")));
 BA.debugLineNum = 2675;BA.debugLine="clvIV.lblOrdenKeyID.Text=lstPrimaryKey.Size";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblOrdenKeyID" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(parent._lstprimarykey.runMethod(true,"getSize")));
 if (true) break;

case 25:
//C
this.state = 28;
;
 if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 2679;BA.debugLine="Dim NombreCampoKeyEliminada As String=clvIV.cboC";
Debug.JustUpdateDeviceLine();
_nombrecampokeyeliminada = BA.ObjectToString(_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue"));Debug.locals.put("NombreCampoKeyEliminada", _nombrecampokeyeliminada);Debug.locals.put("NombreCampoKeyEliminada", _nombrecampokeyeliminada);
 BA.debugLineNum = 2680;BA.debugLine="lstPrimaryKey.RemoveAt(lstPrimaryKey.IndexOf(Nom";
Debug.JustUpdateDeviceLine();
parent._lstprimarykey.runVoidMethod ("RemoveAt",(Object)(parent._lstprimarykey.runMethod(true,"IndexOf",(Object)((_nombrecampokeyeliminada)))));
 BA.debugLineNum = 2681;BA.debugLine="Dim KeyIDEliminada As Int=clvIV.lblOrdenKeyID.Te";
Debug.JustUpdateDeviceLine();
_keyideliminada = BA.numberCast(int.class, _clviv.getField(false,"lblOrdenKeyID" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("KeyIDEliminada", _keyideliminada);Debug.locals.put("KeyIDEliminada", _keyideliminada);
 BA.debugLineNum = 2682;BA.debugLine="clvIV.lblOrdenKeyID.Text=0";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblOrdenKeyID" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 2683;BA.debugLine="RecalcularOrdenKeyID(KeyIDEliminada)";
Debug.JustUpdateDeviceLine();
_recalcularordenkeyid(_keyideliminada);
 if (true) break;

case 28:
//C
this.state = -1;
;
 BA.debugLineNum = 2686;BA.debugLine="End Sub";
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
public static RemoteObject  _chkcolumnatableview_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkColumnaTableView_CheckedChange (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3205);
if (RapidSub.canDelegate("chkcolumnatableview_checkedchange")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","chkcolumnatableview_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 3205;BA.debugLine="private Sub chkColumnaTableView_CheckedChange(Chec";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3206;BA.debugLine="If CargandoDatos Then Return";
Debug.JustUpdateDeviceLine();
if (jamtableviewcamposbuilder._cargandodatos.<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 3207;BA.debugLine="RecalcularIDOrdenColumnas";
Debug.JustUpdateDeviceLine();
_recalcularidordencolumnas();
 BA.debugLineNum = 3208;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clvlistacampos_reachend() throws Exception{
try {
		Debug.PushSubsStack("clvListaCampos_ReachEnd (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,1132);
if (RapidSub.canDelegate("clvlistacampos_reachend")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","clvlistacampos_reachend");}
 BA.debugLineNum = 1132;BA.debugLine="Sub clvListaCampos_ReachEnd";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1133;BA.debugLine="OffsetAnterior=clvListaCampos.sv.ScrollViewOffset";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._offsetanterior = BA.numberCast(int.class, jamtableviewcamposbuilder._clvlistacampos.getField(false,"_sv").runMethod(true,"getScrollViewOffsetY"));
 BA.debugLineNum = 1134;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clvlistacampos_scrollchanged(RemoteObject _offset) throws Exception{
try {
		Debug.PushSubsStack("clvListaCampos_ScrollChanged (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,1136);
if (RapidSub.canDelegate("clvlistacampos_scrollchanged")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","clvlistacampos_scrollchanged", _offset);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _item = RemoteObject.declareNull("b4j.example.customlistview._clvitem");
RemoteObject _visiblepart = RemoteObject.createImmutable(0);
Debug.locals.put("Offset", _offset);
 BA.debugLineNum = 1136;BA.debugLine="Sub clvListaCampos_ScrollChanged (Offset As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1137;BA.debugLine="If mModoSnap=False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",jamtableviewcamposbuilder._mmodosnap,jamtableviewcamposbuilder.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1141;BA.debugLine="Log(\"clvDatos_ScrollChanged, Offset:\" & Offset)";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder.__c.runVoidMethod ("LogImpl","9204734469",RemoteObject.concat(RemoteObject.createImmutable("clvDatos_ScrollChanged, Offset:"),_offset),0);
 BA.debugLineNum = 1144;BA.debugLine="If Offset=OffsetAnterior Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_offset,BA.numberCast(double.class, jamtableviewcamposbuilder._offsetanterior))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1146;BA.debugLine="If Offset>OffsetAnterior Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_offset,BA.numberCast(double.class, jamtableviewcamposbuilder._offsetanterior))) { 
 BA.debugLineNum = 1147;BA.debugLine="ScrollingDown=True";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._scrollingdown = jamtableviewcamposbuilder.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 1149;BA.debugLine="ScrollingDown=False";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._scrollingdown = jamtableviewcamposbuilder.__c.getField(true,"False");
 };
 BA.debugLineNum = 1152;BA.debugLine="Dim i As Int = clvListaCampos.FirstVisibleIndex";
Debug.JustUpdateDeviceLine();
_i = jamtableviewcamposbuilder._clvlistacampos.runMethod(true,"_getfirstvisibleindex");Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 1153;BA.debugLine="Dim item As CLVItem	 = clvListaCampos.GetRawListI";
Debug.JustUpdateDeviceLine();
_item = jamtableviewcamposbuilder._clvlistacampos.runMethod(false,"_getrawlistitem",(Object)(_i));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 1154;BA.debugLine="Dim visiblepart As Int = item.Offset + item.Size";
Debug.JustUpdateDeviceLine();
_visiblepart = RemoteObject.solve(new RemoteObject[] {_item.getField(true,"Offset"),_item.getField(true,"Size"),_offset}, "+-",2, 1);Debug.locals.put("visiblepart", _visiblepart);Debug.locals.put("visiblepart", _visiblepart);
 BA.debugLineNum = 1156;BA.debugLine="If visiblepart<item.Size Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_visiblepart,BA.numberCast(double.class, _item.getField(true,"Size")))) { 
 BA.debugLineNum = 1157;BA.debugLine="If ScrollingDown Then";
Debug.JustUpdateDeviceLine();
if (jamtableviewcamposbuilder._scrollingdown.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1159;BA.debugLine="clvListaCampos.JumpToItem(i+1)";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._clvlistacampos.runVoidMethod ("_jumptoitem",(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)));
 }else {
 BA.debugLineNum = 1162;BA.debugLine="clvListaCampos.JumpToItem(i)";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._clvlistacampos.runVoidMethod ("_jumptoitem",(Object)(_i));
 };
 }else {
 BA.debugLineNum = 1165;BA.debugLine="OffsetAnterior=Offset";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._offsetanterior = _offset;
 };
 BA.debugLineNum = 1167;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _colortohex(RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("ColorToHex (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,430);
if (RapidSub.canDelegate("colortohex")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","colortohex", _clr);}
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 430;BA.debugLine="Private Sub ColorToHex(clr As Int) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 431;BA.debugLine="Dim bc As ByteConverter";
Debug.JustUpdateDeviceLine();
_bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 432;BA.debugLine="Return bc.HexFromBytes(bc.IntsToBytes(Array As In";
Debug.JustUpdateDeviceLine();
if (true) return _bc.runMethod(true,"HexFromBytes",(Object)(_bc.runMethod(false,"IntsToBytes",(Object)(RemoteObject.createNewArray("int",new int[] {1},new Object[] {_clr})))));
 BA.debugLineNum = 433;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _comparar2mapas(RemoteObject _map1,RemoteObject _map2) throws Exception{
try {
		Debug.PushSubsStack("Comparar2Mapas (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3170);
if (RapidSub.canDelegate("comparar2mapas")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","comparar2mapas", _map1, _map2);}
RemoteObject _flagallkeysok = RemoteObject.createImmutable(false);
RemoteObject _key1 = RemoteObject.createImmutable("");
RemoteObject _value1 = RemoteObject.createImmutable("");
RemoteObject _keyvaluesame = RemoteObject.createImmutable(false);
RemoteObject _value2 = RemoteObject.createImmutable("");
RemoteObject _key2 = RemoteObject.createImmutable("");
Debug.locals.put("Map1", _map1);
Debug.locals.put("Map2", _map2);
 BA.debugLineNum = 3170;BA.debugLine="Sub Comparar2Mapas(Map1 As Map, Map2 As Map) As Bo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3171;BA.debugLine="Dim FlagAllkeysOK As Boolean=True";
Debug.JustUpdateDeviceLine();
_flagallkeysok = jamtableviewcamposbuilder.__c.getField(true,"True");Debug.locals.put("FlagAllkeysOK", _flagallkeysok);Debug.locals.put("FlagAllkeysOK", _flagallkeysok);
 BA.debugLineNum = 3172;BA.debugLine="For Each Key1 As String In Map1.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = _map1.runMethod(false,"Keys");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_key1 = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("Key1", _key1);
Debug.locals.put("Key1", _key1);
 BA.debugLineNum = 3173;BA.debugLine="Dim Value1 As String = Map1.Get(Key1)";
Debug.JustUpdateDeviceLine();
_value1 = BA.ObjectToString(_map1.runMethod(false,"Get",(Object)((_key1))));Debug.locals.put("Value1", _value1);Debug.locals.put("Value1", _value1);
 BA.debugLineNum = 3174;BA.debugLine="Dim KeyValueSame As Boolean = False";
Debug.JustUpdateDeviceLine();
_keyvaluesame = jamtableviewcamposbuilder.__c.getField(true,"False");Debug.locals.put("KeyValueSame", _keyvaluesame);Debug.locals.put("KeyValueSame", _keyvaluesame);
 BA.debugLineNum = 3175;BA.debugLine="If Map2.ContainsKey(Key1) Then";
Debug.JustUpdateDeviceLine();
if (_map2.runMethod(true,"ContainsKey",(Object)((_key1))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3176;BA.debugLine="Dim Value2 As String = Map2.Get(Key1)";
Debug.JustUpdateDeviceLine();
_value2 = BA.ObjectToString(_map2.runMethod(false,"Get",(Object)((_key1))));Debug.locals.put("Value2", _value2);Debug.locals.put("Value2", _value2);
 BA.debugLineNum = 3177;BA.debugLine="KeyValueSame = Value1 = Value2";
Debug.JustUpdateDeviceLine();
_keyvaluesame = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_value1,_value2));Debug.locals.put("KeyValueSame", _keyvaluesame);
 BA.debugLineNum = 3178;BA.debugLine="If KeyValueSame = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_keyvaluesame,jamtableviewcamposbuilder.__c.getField(true,"False"))) { 
 BA.debugLineNum = 3179;BA.debugLine="Log($\"Key: ${Key1} is different\"$)";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder.__c.runVoidMethod ("LogImpl","9207421449",(RemoteObject.concat(RemoteObject.createImmutable("Key: "),jamtableviewcamposbuilder.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_key1))),RemoteObject.createImmutable(" is different"))),0);
 BA.debugLineNum = 3180;BA.debugLine="FlagAllkeysOK=False";
Debug.JustUpdateDeviceLine();
_flagallkeysok = jamtableviewcamposbuilder.__c.getField(true,"False");Debug.locals.put("FlagAllkeysOK", _flagallkeysok);
 };
 }else {
 BA.debugLineNum = 3183;BA.debugLine="Log($\"Key: ${Key1} is not in Map2\"$)";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder.__c.runVoidMethod ("LogImpl","9207421453",(RemoteObject.concat(RemoteObject.createImmutable("Key: "),jamtableviewcamposbuilder.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_key1))),RemoteObject.createImmutable(" is not in Map2"))),0);
 BA.debugLineNum = 3184;BA.debugLine="FlagAllkeysOK=False";
Debug.JustUpdateDeviceLine();
_flagallkeysok = jamtableviewcamposbuilder.__c.getField(true,"False");Debug.locals.put("FlagAllkeysOK", _flagallkeysok);
 };
 }
}Debug.locals.put("Key1", _key1);
;
 BA.debugLineNum = 3187;BA.debugLine="For Each Key2 As String In Map2.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group17 = _map2.runMethod(false,"Keys");
final int groupLen17 = group17.runMethod(true,"getSize").<Integer>get()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_key2 = BA.ObjectToString(group17.runMethod(false,"Get",index17));Debug.locals.put("Key2", _key2);
Debug.locals.put("Key2", _key2);
 BA.debugLineNum = 3188;BA.debugLine="Dim Value2 As String = Map2.Get(Key2)";
Debug.JustUpdateDeviceLine();
_value2 = BA.ObjectToString(_map2.runMethod(false,"Get",(Object)((_key2))));Debug.locals.put("Value2", _value2);Debug.locals.put("Value2", _value2);
 BA.debugLineNum = 3189;BA.debugLine="Dim KeyValueSame As Boolean = False";
Debug.JustUpdateDeviceLine();
_keyvaluesame = jamtableviewcamposbuilder.__c.getField(true,"False");Debug.locals.put("KeyValueSame", _keyvaluesame);Debug.locals.put("KeyValueSame", _keyvaluesame);
 BA.debugLineNum = 3190;BA.debugLine="If Map1.ContainsKey(Key2) Then";
Debug.JustUpdateDeviceLine();
if (_map1.runMethod(true,"ContainsKey",(Object)((_key2))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3191;BA.debugLine="Dim Value1 As String = Map1.Get(Key2)";
Debug.JustUpdateDeviceLine();
_value1 = BA.ObjectToString(_map1.runMethod(false,"Get",(Object)((_key2))));Debug.locals.put("Value1", _value1);Debug.locals.put("Value1", _value1);
 BA.debugLineNum = 3192;BA.debugLine="KeyValueSame = Value1 = Value2";
Debug.JustUpdateDeviceLine();
_keyvaluesame = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_value1,_value2));Debug.locals.put("KeyValueSame", _keyvaluesame);
 BA.debugLineNum = 3193;BA.debugLine="If KeyValueSame = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_keyvaluesame,jamtableviewcamposbuilder.__c.getField(true,"False"))) { 
 BA.debugLineNum = 3194;BA.debugLine="Log($\"Key: ${Key2} is different\"$)";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder.__c.runVoidMethod ("LogImpl","9207421464",(RemoteObject.concat(RemoteObject.createImmutable("Key: "),jamtableviewcamposbuilder.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_key2))),RemoteObject.createImmutable(" is different"))),0);
 BA.debugLineNum = 3195;BA.debugLine="FlagAllkeysOK=False";
Debug.JustUpdateDeviceLine();
_flagallkeysok = jamtableviewcamposbuilder.__c.getField(true,"False");Debug.locals.put("FlagAllkeysOK", _flagallkeysok);
 };
 }else {
 BA.debugLineNum = 3198;BA.debugLine="Log($\"Key: ${Key2} is not in Map1\"$)";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder.__c.runVoidMethod ("LogImpl","9207421468",(RemoteObject.concat(RemoteObject.createImmutable("Key: "),jamtableviewcamposbuilder.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_key2))),RemoteObject.createImmutable(" is not in Map1"))),0);
 BA.debugLineNum = 3199;BA.debugLine="FlagAllkeysOK=False";
Debug.JustUpdateDeviceLine();
_flagallkeysok = jamtableviewcamposbuilder.__c.getField(true,"False");Debug.locals.put("FlagAllkeysOK", _flagallkeysok);
 };
 }
}Debug.locals.put("Key2", _key2);
;
 BA.debugLineNum = 3202;BA.debugLine="Return FlagAllkeysOK";
Debug.JustUpdateDeviceLine();
if (true) return _flagallkeysok;
 BA.debugLineNum = 3203;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _configurarorigendatos() throws Exception{
try {
		Debug.PushSubsStack("ConfigurarOrigenDatos (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,1739);
if (RapidSub.canDelegate("configurarorigendatos")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","configurarorigendatos");}
ResumableSub_ConfigurarOrigenDatos rsub = new ResumableSub_ConfigurarOrigenDatos(null);
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
public ResumableSub_ConfigurarOrigenDatos(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
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
		Debug.PushSubsStack("ConfigurarOrigenDatos (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,1739);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 1741;BA.debugLine="Dialog.Title=\"Selecciona tipo de origen de datos\"";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona tipo de origen de datos")));
 BA.debugLineNum = 1742;BA.debugLine="Dim OptTipoOrigen As B4XListTemplate";
Debug.JustUpdateDeviceLine();
_opttipoorigen = RemoteObject.createNew ("b4j.docU.b4xlisttemplate");Debug.locals.put("OptTipoOrigen", _opttipoorigen);
 BA.debugLineNum = 1743;BA.debugLine="OptTipoOrigen.Initialize";
Debug.JustUpdateDeviceLine();
_opttipoorigen.runClassMethod (b4j.docU.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,jamtableviewcamposbuilder.ba);
 BA.debugLineNum = 1745;BA.debugLine="OptTipoOrigen.Options=Array As String(\"JRDC Table";
Debug.JustUpdateDeviceLine();
_opttipoorigen.setField ("_options" /*RemoteObject*/ ,parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {4},new Object[] {BA.ObjectToString("JRDC Table"),BA.ObjectToString("JRDC Query"),BA.ObjectToString("Manual"),RemoteObject.createImmutable("SQLite Table")}))));
 BA.debugLineNum = 1746;BA.debugLine="OptTipoOrigen.AllowMultiSelection=False";
Debug.JustUpdateDeviceLine();
_opttipoorigen.setField ("_allowmultiselection" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 1747;BA.debugLine="Dim rs As ResumableSub=Dialog.ShowTemplate(OptTip";
Debug.JustUpdateDeviceLine();
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_opttipoorigen)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1748;BA.debugLine="Dim btnCancelar As B4XView=Dialog.GetButton(xui.D";
Debug.JustUpdateDeviceLine();
_btncancelar = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_btncancelar = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(parent._xui.getField(true,"DialogResponse_Cancel")));Debug.locals.put("btnCancelar", _btncancelar);Debug.locals.put("btnCancelar", _btncancelar);
 BA.debugLineNum = 1749;BA.debugLine="btnCancelar.Left=btnCancelar.Left-20dip";
Debug.JustUpdateDeviceLine();
_btncancelar.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_btncancelar.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 1750;BA.debugLine="btnCancelar.Width=btnCancelar.Width+20dip";
Debug.JustUpdateDeviceLine();
_btncancelar.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_btncancelar.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 1751;BA.debugLine="Wait For (rs) complete (result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "configurarorigendatos"), _rs);
this.state = 59;
return;
case 59:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 1752;BA.debugLine="If result=xui.DialogResponse_Positive Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 58;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}else {
this.state = 57;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1753;BA.debugLine="SetCurrentFile(\"\")";
Debug.JustUpdateDeviceLine();
_setcurrentfile(RemoteObject.createImmutable(""));
 BA.debugLineNum = 1754;BA.debugLine="clvListaCampos.Clear";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.runVoidMethod ("_clear");
 BA.debugLineNum = 1755;BA.debugLine="lstPrimaryKey.Initialize";
Debug.JustUpdateDeviceLine();
parent._lstprimarykey.runVoidMethod ("Initialize");
 BA.debugLineNum = 1757;BA.debugLine="Dim TipoOrigenDatos As String=OptTipoOrigen.Sele";
Debug.JustUpdateDeviceLine();
_tipoorigendatos = _opttipoorigen.getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("TipoOrigenDatos", _tipoorigendatos);Debug.locals.put("TipoOrigenDatos", _tipoorigendatos);
 BA.debugLineNum = 1758;BA.debugLine="Select True";
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
 BA.debugLineNum = 1760;BA.debugLine="prefDialog.Initialize(frm.RootPane,\"Datos JRDC";
Debug.JustUpdateDeviceLine();
parent._prefdialog.runClassMethod (b4j.docU.preferencesdialog.class, "_initialize" /*RemoteObject*/ ,jamtableviewcamposbuilder.ba,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent._frm.runMethod(false,"getRootPane").getObject()),(Object)(RemoteObject.createImmutable(("Datos JRDC"))),(Object)(BA.numberCast(int.class, 800)),(Object)(BA.numberCast(int.class, 600)));
 BA.debugLineNum = 1762;BA.debugLine="prefDialog.LoadFromJson(File.ReadString(File.D";
Debug.JustUpdateDeviceLine();
parent._prefdialog.runClassMethod (b4j.docU.preferencesdialog.class, "_loadfromjson" /*RemoteObject*/ ,(Object)(parent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("OrigenDatosJRDCTable.json")))));
 BA.debugLineNum = 1763;BA.debugLine="Dim mData As Map=CreateMap(\"ComandoJRDC\": \"Inf";
Debug.JustUpdateDeviceLine();
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("ComandoJRDC")),(RemoteObject.createImmutable("InfoCamposTabla"))}));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 1764;BA.debugLine="Dim rSub As ResumableSub=prefDialog.ShowDialog";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._prefdialog.runClassMethod (b4j.docU.preferencesdialog.class, "_showdialog" /*RemoteObject*/ ,(Object)(_mdata),(Object)(RemoteObject.createImmutable(("OK"))),(Object)((RemoteObject.createImmutable("CANCEL"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 1765;BA.debugLine="Wait For (rSub) Complete (result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "configurarorigendatos"), _rsub);
this.state = 60;
return;
case 60:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 1767;BA.debugLine="If result <> xui.DialogResponse_Positive Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 1779;BA.debugLine="lblTitleIpJRDC.TextColor=fx.Colors.From32Bit(0";
Debug.JustUpdateDeviceLine();
parent._lbltitleipjrdc.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 1780;BA.debugLine="lblTitlePuertoJRDC.TextColor=fx.Colors.From32B";
Debug.JustUpdateDeviceLine();
parent._lbltitlepuertojrdc.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 1781;BA.debugLine="lblTitleComandoJRDC.TextColor=fx.Colors.From32";
Debug.JustUpdateDeviceLine();
parent._lbltitlecomandojrdc.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 1782;BA.debugLine="lblTitleParametrosJRDC.TextColor=fx.Colors.Fro";
Debug.JustUpdateDeviceLine();
parent._lbltitleparametrosjrdc.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 1783;BA.debugLine="txtIpJRDC.Enabled=True";
Debug.JustUpdateDeviceLine();
parent._txtipjrdc.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1784;BA.debugLine="txtParametrosJRDC.Enabled=True";
Debug.JustUpdateDeviceLine();
parent._txtparametrosjrdc.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1785;BA.debugLine="txtPuertoJRDC.Enabled=True";
Debug.JustUpdateDeviceLine();
parent._txtpuertojrdc.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1786;BA.debugLine="txtComandoJRDC.Enabled=True";
Debug.JustUpdateDeviceLine();
parent._txtcomandojrdc.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1787;BA.debugLine="mData.put(\"ParametrosJRDC\",mData.get(\"NombreTa";
Debug.JustUpdateDeviceLine();
_mdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ParametrosJRDC"))),(Object)(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreTabla"))))));
 BA.debugLineNum = 1789;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(TipoOri";
Debug.JustUpdateDeviceLine();
parent._datosorigendatos = _createtipoorigendatos(_tipoorigendatos,BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("IpJRDC"))),(Object)((RemoteObject.createImmutable(""))))),BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("PuertoJRDC"))),(Object)((RemoteObject.createImmutable(""))))),BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ComandoJRDC"))))),BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ParametrosJRDC"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 1790;BA.debugLine="MostrarDatosOrigenDatos";
Debug.JustUpdateDeviceLine();
_mostrardatosorigendatos();
 BA.debugLineNum = 1791;BA.debugLine="CargandoDatos=True";
Debug.JustUpdateDeviceLine();
parent._cargandodatos = parent.__c.getField(true,"True");
 BA.debugLineNum = 1792;BA.debugLine="CargaCamposJRDCTable(txtIpJRDC.Text,txtPuertoJ";
Debug.JustUpdateDeviceLine();
_cargacamposjrdctable(parent._txtipjrdc.runMethod(true,"getText"),BA.numberCast(int.class, parent._txtpuertojrdc.runMethod(true,"getText")),parent._txtcomandojrdc.runMethod(true,"getText"),parent._txtparametrosjrdc.runMethod(true,"getText"));
 BA.debugLineNum = 1793;BA.debugLine="Wait For CargaCamposJRDCTable_Completed";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","cargacamposjrdctable_completed", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "configurarorigendatos"), null);
this.state = 61;
return;
case 61:
//C
this.state = 55;
;
 BA.debugLineNum = 1794;BA.debugLine="CargandoDatos=False";
Debug.JustUpdateDeviceLine();
parent._cargandodatos = parent.__c.getField(true,"False");
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 1796;BA.debugLine="prefDialog.Initialize(frm.RootPane,\"Datos JRDC";
Debug.JustUpdateDeviceLine();
parent._prefdialog.runClassMethod (b4j.docU.preferencesdialog.class, "_initialize" /*RemoteObject*/ ,jamtableviewcamposbuilder.ba,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent._frm.runMethod(false,"getRootPane").getObject()),(Object)(RemoteObject.createImmutable(("Datos JRDC"))),(Object)(BA.numberCast(int.class, 800)),(Object)(BA.numberCast(int.class, 600)));
 BA.debugLineNum = 1798;BA.debugLine="prefDialog.LoadFromJson(File.ReadString(File.D";
Debug.JustUpdateDeviceLine();
parent._prefdialog.runClassMethod (b4j.docU.preferencesdialog.class, "_loadfromjson" /*RemoteObject*/ ,(Object)(parent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("OrigenDatosJRDCQuery.json")))));
 BA.debugLineNum = 1799;BA.debugLine="Dim mData As Map=CreateMap()";
Debug.JustUpdateDeviceLine();
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 1800;BA.debugLine="Wait For (prefDialog.ShowDialog(mData, \"OK\", \"";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "configurarorigendatos"), parent._prefdialog.runClassMethod (b4j.docU.preferencesdialog.class, "_showdialog" /*RemoteObject*/ ,(Object)(_mdata),(Object)(RemoteObject.createImmutable(("OK"))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 62;
return;
case 62:
//C
this.state = 15;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 1801;BA.debugLine="If result <> xui.DialogResponse_Positive Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 15:
//if
this.state = 20;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 1804;BA.debugLine="lblTitleIpJRDC.TextColor=fx.Colors.From32Bit(0";
Debug.JustUpdateDeviceLine();
parent._lbltitleipjrdc.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 1805;BA.debugLine="lblTitlePuertoJRDC.TextColor=fx.Colors.From32B";
Debug.JustUpdateDeviceLine();
parent._lbltitlepuertojrdc.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 1806;BA.debugLine="lblTitleComandoJRDC.TextColor=fx.Colors.From32";
Debug.JustUpdateDeviceLine();
parent._lbltitlecomandojrdc.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 1807;BA.debugLine="lblTitleParametrosJRDC.TextColor=fx.Colors.Fro";
Debug.JustUpdateDeviceLine();
parent._lbltitleparametrosjrdc.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 1808;BA.debugLine="txtIpJRDC.Enabled=True";
Debug.JustUpdateDeviceLine();
parent._txtipjrdc.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1809;BA.debugLine="txtParametrosJRDC.Enabled=True";
Debug.JustUpdateDeviceLine();
parent._txtparametrosjrdc.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1810;BA.debugLine="txtPuertoJRDC.Enabled=True";
Debug.JustUpdateDeviceLine();
parent._txtpuertojrdc.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1811;BA.debugLine="txtComandoJRDC.Enabled=True";
Debug.JustUpdateDeviceLine();
parent._txtcomandojrdc.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1813;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(TipoOri";
Debug.JustUpdateDeviceLine();
parent._datosorigendatos = _createtipoorigendatos(_tipoorigendatos,BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("IpJRDC"))),(Object)((RemoteObject.createImmutable(""))))),BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("PuertoJRDC"))),(Object)((RemoteObject.createImmutable(""))))),BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ComandoJRDC"))),(Object)((RemoteObject.createImmutable(""))))),BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ParametrosJRDC"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 1814;BA.debugLine="MostrarDatosOrigenDatos";
Debug.JustUpdateDeviceLine();
_mostrardatosorigendatos();
 BA.debugLineNum = 1815;BA.debugLine="CargandoDatos=True";
Debug.JustUpdateDeviceLine();
parent._cargandodatos = parent.__c.getField(true,"True");
 BA.debugLineNum = 1816;BA.debugLine="CargaCamposJRDCQuery(txtIpJRDC.Text,txtPuertoJ";
Debug.JustUpdateDeviceLine();
_cargacamposjrdcquery(parent._txtipjrdc.runMethod(true,"getText"),BA.numberCast(int.class, parent._txtpuertojrdc.runMethod(true,"getText")),parent._txtcomandojrdc.runMethod(true,"getText"),parent._txtparametrosjrdc.runMethod(true,"getText"));
 BA.debugLineNum = 1817;BA.debugLine="Wait For CargaCamposJRDCQuery_Completed";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","cargacamposjrdcquery_completed", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "configurarorigendatos"), null);
this.state = 63;
return;
case 63:
//C
this.state = 55;
;
 BA.debugLineNum = 1818;BA.debugLine="CargandoDatos=False";
Debug.JustUpdateDeviceLine();
parent._cargandodatos = parent.__c.getField(true,"False");
 if (true) break;

case 22:
//C
this.state = 55;
 BA.debugLineNum = 1821;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(TipoOri";
Debug.JustUpdateDeviceLine();
parent._datosorigendatos = _createtipoorigendatos(_tipoorigendatos,BA.ObjectToString(""),BA.ObjectToString(""),BA.ObjectToString(""),BA.ObjectToString(parent.__c.getField(false,"Null")));
 BA.debugLineNum = 1822;BA.debugLine="lblTitleIpJRDC.TextColor=fx.Colors.From32Bit(0";
Debug.JustUpdateDeviceLine();
parent._lbltitleipjrdc.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffd3d3d3))))));
 BA.debugLineNum = 1823;BA.debugLine="lblTitlePuertoJRDC.TextColor=fx.Colors.From32B";
Debug.JustUpdateDeviceLine();
parent._lbltitlepuertojrdc.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffd3d3d3))))));
 BA.debugLineNum = 1824;BA.debugLine="lblTitleComandoJRDC.TextColor=fx.Colors.From32";
Debug.JustUpdateDeviceLine();
parent._lbltitlecomandojrdc.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffd3d3d3))))));
 BA.debugLineNum = 1825;BA.debugLine="lblTitleParametrosJRDC.TextColor=fx.Colors.Fro";
Debug.JustUpdateDeviceLine();
parent._lbltitleparametrosjrdc.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffd3d3d3))))));
 BA.debugLineNum = 1826;BA.debugLine="txtIpJRDC.Enabled=False";
Debug.JustUpdateDeviceLine();
parent._txtipjrdc.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1827;BA.debugLine="txtParametrosJRDC.Enabled=False";
Debug.JustUpdateDeviceLine();
parent._txtparametrosjrdc.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1828;BA.debugLine="txtPuertoJRDC.Enabled=False";
Debug.JustUpdateDeviceLine();
parent._txtpuertojrdc.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1829;BA.debugLine="txtComandoJRDC.ENABLED=False";
Debug.JustUpdateDeviceLine();
parent._txtcomandojrdc.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1834;BA.debugLine="MostrarDatosOrigenDatos";
Debug.JustUpdateDeviceLine();
_mostrardatosorigendatos();
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 1837;BA.debugLine="Dim FcDb As FileChooser";
Debug.JustUpdateDeviceLine();
_fcdb = RemoteObject.createNew ("anywheresoftware.b4j.objects.FileChooserWrapper");Debug.locals.put("FcDb", _fcdb);
 BA.debugLineNum = 1838;BA.debugLine="FcDb.Initialize";
Debug.JustUpdateDeviceLine();
_fcdb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1839;BA.debugLine="FcDb.SetExtensionFilter(\"Ficheros db SQLite\",A";
Debug.JustUpdateDeviceLine();
_fcdb.runVoidMethod ("SetExtensionFilter",(Object)(BA.ObjectToString("Ficheros db SQLite")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("*.db")})))));
 BA.debugLineNum = 1840;BA.debugLine="Dim sFchDB As String=FcDb.ShowOpen(frm)";
Debug.JustUpdateDeviceLine();
_sfchdb = _fcdb.runMethodAndSync(true,"ShowOpen",(Object)(parent._frm));Debug.locals.put("sFchDB", _sfchdb);Debug.locals.put("sFchDB", _sfchdb);
 BA.debugLineNum = 1841;BA.debugLine="If sFchDB=\"\" Then Return False";
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
 BA.debugLineNum = 1842;BA.debugLine="Dim SQLOrigenDatos As SQL";
Debug.JustUpdateDeviceLine();
_sqlorigendatos = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");Debug.locals.put("SQLOrigenDatos", _sqlorigendatos);
 BA.debugLineNum = 1843;BA.debugLine="SQLOrigenDatos.InitializeSQLite(File.GetFilePa";
Debug.JustUpdateDeviceLine();
_sqlorigendatos.runVoidMethod ("InitializeSQLite",(Object)(parent.__c.getField(false,"File").runMethod(true,"GetFileParent",(Object)(_sfchdb))),(Object)(parent.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_sfchdb))),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 1845;BA.debugLine="Dim lstTablasSQLite As List";
Debug.JustUpdateDeviceLine();
_lsttablassqlite = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstTablasSQLite", _lsttablassqlite);
 BA.debugLineNum = 1846;BA.debugLine="lstTablasSQLite.Initialize";
Debug.JustUpdateDeviceLine();
_lsttablassqlite.runVoidMethod ("Initialize");
 BA.debugLineNum = 1847;BA.debugLine="Dim TBName As String";
Debug.JustUpdateDeviceLine();
_tbname = RemoteObject.createImmutable("");Debug.locals.put("TBName", _tbname);
 BA.debugLineNum = 1848;BA.debugLine="Dim DBQuery As String= \"Select name FROM sqlit";
Debug.JustUpdateDeviceLine();
_dbquery = BA.ObjectToString("Select name FROM sqlite_master WHERE Type='table' ORDER BY name");Debug.locals.put("DBQuery", _dbquery);Debug.locals.put("DBQuery", _dbquery);
 BA.debugLineNum = 1849;BA.debugLine="Dim rsDB As ResultSet=SQLOrigenDatos.ExecQuery";
Debug.JustUpdateDeviceLine();
_rsdb = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rsdb = _sqlorigendatos.runMethod(false,"ExecQuery",(Object)(_dbquery));Debug.locals.put("rsDB", _rsdb);Debug.locals.put("rsDB", _rsdb);
 BA.debugLineNum = 1850;BA.debugLine="Do While rsDB.NextRow";
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
 BA.debugLineNum = 1851;BA.debugLine="TBName=rsDB.GetString2(0)";
Debug.JustUpdateDeviceLine();
_tbname = _rsdb.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("TBName", _tbname);
 BA.debugLineNum = 1852;BA.debugLine="Log(\"   Table: \" & TBName)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9205455473",RemoteObject.concat(RemoteObject.createImmutable("   Table: "),_tbname),0);
 BA.debugLineNum = 1853;BA.debugLine="If TBName.StartsWith(\"SQlite\") = False Then l";
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
 BA.debugLineNum = 1855;BA.debugLine="rsDB.Close";
Debug.JustUpdateDeviceLine();
_rsdb.runVoidMethod ("Close");
 BA.debugLineNum = 1857;BA.debugLine="If lstTablasSQLite.Size=0 Then";
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
 BA.debugLineNum = 1858;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"La base";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("La base de datos SQLite"),_sfchdb,RemoteObject.createImmutable(" no contiene tablas."))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1859;BA.debugLine="Wait For (msa) Msgbox_Result (result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "configurarorigendatos"), _msa);
this.state = 64;
return;
case 64:
//C
this.state = 44;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 1860;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 44:
//C
this.state = 45;
;
 BA.debugLineNum = 1863;BA.debugLine="Dim Dlg As B4XDialog";
Debug.JustUpdateDeviceLine();
_dlg = RemoteObject.createNew ("b4j.docU.b4xdialog");Debug.locals.put("Dlg", _dlg);
 BA.debugLineNum = 1864;BA.debugLine="Dlg.Initialize(frm.RootPane)";
Debug.JustUpdateDeviceLine();
_dlg.runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,jamtableviewcamposbuilder.ba,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent._frm.runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 1865;BA.debugLine="Dlg.Title=\"Indica Nombre de la Tabla\"";
Debug.JustUpdateDeviceLine();
_dlg.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Indica Nombre de la Tabla")));
 BA.debugLineNum = 1866;BA.debugLine="Dim B4XList As B4XListTemplate";
Debug.JustUpdateDeviceLine();
_b4xlist = RemoteObject.createNew ("b4j.docU.b4xlisttemplate");Debug.locals.put("B4XList", _b4xlist);
 BA.debugLineNum = 1867;BA.debugLine="B4XList.Initialize";
Debug.JustUpdateDeviceLine();
_b4xlist.runClassMethod (b4j.docU.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,jamtableviewcamposbuilder.ba);
 BA.debugLineNum = 1868;BA.debugLine="B4XList.Options=lstTablasSQLite";
Debug.JustUpdateDeviceLine();
_b4xlist.setField ("_options" /*RemoteObject*/ ,_lsttablassqlite);
 BA.debugLineNum = 1869;BA.debugLine="B4XList.mBase.Width=500dip";
Debug.JustUpdateDeviceLine();
_b4xlist.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 1870;BA.debugLine="Dim rSub As ResumableSub=Dlg.ShowTemplate(B4XL";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = _dlg.runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xlist)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 1871;BA.debugLine="Dim bCancel As Button=Dlg.GetButton(xui.Dialog";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_bcancel = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), _dlg.runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(parent._xui.getField(true,"DialogResponse_Cancel"))).getObject());Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 1872;BA.debugLine="bCancel.TextSize=15";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 1873;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "configurarorigendatos"), _rsub);
this.state = 65;
return;
case 65:
//C
this.state = 45;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1874;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 45:
//if
this.state = 50;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 1875;BA.debugLine="Dim NombreTabla As String=B4XList.SelectedItem";
Debug.JustUpdateDeviceLine();
_nombretabla = _b4xlist.getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("NombreTabla", _nombretabla);Debug.locals.put("NombreTabla", _nombretabla);
 BA.debugLineNum = 1876;BA.debugLine="Dim lstFields As List=GetTablePragma(SQLOrigen";
Debug.JustUpdateDeviceLine();
_lstfields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstfields = _gettablepragma(_sqlorigendatos,_nombretabla);Debug.locals.put("lstFields", _lstfields);Debug.locals.put("lstFields", _lstfields);
 BA.debugLineNum = 1877;BA.debugLine="If lstFields.Size=0 Then";
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
 BA.debugLineNum = 1878;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"La tabla";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("La tabla "),_nombretabla,RemoteObject.createImmutable(" no existe en la base de datos SQLite "),_sfchdb)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1879;BA.debugLine="Wait For (msa) Msgbox_Result (result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "configurarorigendatos"), _msa);
this.state = 66;
return;
case 66:
//C
this.state = 54;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 1880;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 54:
//C
this.state = 55;
;
 BA.debugLineNum = 1883;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(TipoOri";
Debug.JustUpdateDeviceLine();
parent._datosorigendatos = _createtipoorigendatos(_tipoorigendatos,BA.ObjectToString(""),BA.ObjectToString(""),BA.ObjectToString(""),BA.ObjectToString(parent.__c.getField(false,"Null")));
 BA.debugLineNum = 1884;BA.debugLine="lblTitleIpJRDC.TextColor=fx.Colors.From32Bit(0";
Debug.JustUpdateDeviceLine();
parent._lbltitleipjrdc.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffd3d3d3))))));
 BA.debugLineNum = 1885;BA.debugLine="lblTitlePuertoJRDC.TextColor=fx.Colors.From32B";
Debug.JustUpdateDeviceLine();
parent._lbltitlepuertojrdc.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffd3d3d3))))));
 BA.debugLineNum = 1886;BA.debugLine="lblTitleComandoJRDC.TextColor=fx.Colors.From32";
Debug.JustUpdateDeviceLine();
parent._lbltitlecomandojrdc.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffd3d3d3))))));
 BA.debugLineNum = 1887;BA.debugLine="lblTitleParametrosJRDC.TextColor=fx.Colors.Fro";
Debug.JustUpdateDeviceLine();
parent._lbltitleparametrosjrdc.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffd3d3d3))))));
 BA.debugLineNum = 1888;BA.debugLine="txtIpJRDC.Enabled=False";
Debug.JustUpdateDeviceLine();
parent._txtipjrdc.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1889;BA.debugLine="txtParametrosJRDC.Enabled=False";
Debug.JustUpdateDeviceLine();
parent._txtparametrosjrdc.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1890;BA.debugLine="txtPuertoJRDC.Enabled=False";
Debug.JustUpdateDeviceLine();
parent._txtpuertojrdc.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1891;BA.debugLine="txtComandoJRDC.ENABLED=False";
Debug.JustUpdateDeviceLine();
parent._txtcomandojrdc.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1892;BA.debugLine="MostrarDatosOrigenDatos";
Debug.JustUpdateDeviceLine();
_mostrardatosorigendatos();
 BA.debugLineNum = 1894;BA.debugLine="CargaCamposTablaSQLite(lstFields)";
Debug.JustUpdateDeviceLine();
_cargacampostablasqlite(_lstfields);
 BA.debugLineNum = 1895;BA.debugLine="SQLOrigenDatos.Close";
Debug.JustUpdateDeviceLine();
_sqlorigendatos.runVoidMethod ("Close");
 if (true) break;

case 55:
//C
this.state = 58;
;
 BA.debugLineNum = 1902;BA.debugLine="dragger.AddDragButtons";
Debug.JustUpdateDeviceLine();
parent._dragger.runClassMethod (b4j.docU.jamtableviewclvdragger.class, "_adddragbuttons" /*RemoteObject*/ );
 BA.debugLineNum = 1903;BA.debugLine="pnlOrigenSQL.Visible=True";
Debug.JustUpdateDeviceLine();
parent._pnlorigensql.runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 1905;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 58:
//C
this.state = -1;
;
 BA.debugLineNum = 1907;BA.debugLine="RecalcularIDOrdenColumnas";
Debug.JustUpdateDeviceLine();
_recalcularidordencolumnas();
 BA.debugLineNum = 1908;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1909;BA.debugLine="End Sub";
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
public static RemoteObject  _convertintcolor2hexargb(RemoteObject _paintcol) throws Exception{
try {
		Debug.PushSubsStack("ConvertIntColor2HexARGB (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,420);
if (RapidSub.canDelegate("convertintcolor2hexargb")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","convertintcolor2hexargb", _paintcol);}
RemoteObject _hexargb2 = RemoteObject.createImmutable("");
Debug.locals.put("PaintCol", _paintcol);
 BA.debugLineNum = 420;BA.debugLine="Sub ConvertIntColor2HexARGB(PaintCol As Paint) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 421;BA.debugLine="If PaintCol=fx.Colors.From32Bit(0x00FFFFFF) Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_paintcol,jamtableviewcamposbuilder._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0x00ffffff)))))) { 
 BA.debugLineNum = 422;BA.debugLine="Return \"transparent\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("transparent");
 };
 BA.debugLineNum = 425;BA.debugLine="Dim HexARGB2 As String=fx.Colors.To32Bit(PaintCol";
Debug.JustUpdateDeviceLine();
_hexargb2 = BA.NumberToString(jamtableviewcamposbuilder._fx.getField(false,"Colors").runMethod(true,"To32Bit",(Object)((_paintcol.getObject()))));Debug.locals.put("HexARGB2", _hexargb2);Debug.locals.put("HexARGB2", _hexargb2);
 BA.debugLineNum = 427;BA.debugLine="Return HexARGB2";
Debug.JustUpdateDeviceLine();
if (true) return _hexargb2;
 BA.debugLineNum = 428;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcommand(RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3254);
if (RapidSub.canDelegate("createcommand")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","createcommand", _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
Debug.locals.put("name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 3254;BA.debugLine="private Sub CreateCommand(name As String, Paramete";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3255;BA.debugLine="Dim cmd As DBCommand";
Debug.JustUpdateDeviceLine();
_cmd = RemoteObject.createNew ("b4j.docU.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 3256;BA.debugLine="cmd.Initialize";
Debug.JustUpdateDeviceLine();
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 3257;BA.debugLine="cmd.Name = name";
Debug.JustUpdateDeviceLine();
_cmd.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 3258;BA.debugLine="If Parameters <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_parameters)) { 
 BA.debugLineNum = 3259;BA.debugLine="cmd.Parameters = Parameters";
Debug.JustUpdateDeviceLine();
_cmd.setField ("Parameters" /*RemoteObject*/ ,_parameters);
 };
 BA.debugLineNum = 3261;BA.debugLine="Return cmd";
Debug.JustUpdateDeviceLine();
if (true) return _cmd;
 BA.debugLineNum = 3262;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrequest(RemoteObject _rdclink) throws Exception{
try {
		Debug.PushSubsStack("CreateRequest (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3248);
if (RapidSub.canDelegate("createrequest")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","createrequest", _rdclink);}
RemoteObject _req = RemoteObject.declareNull("b4j.docU.dbrequestmanager");
Debug.locals.put("rdcLink", _rdclink);
 BA.debugLineNum = 3248;BA.debugLine="private Sub CreateRequest(rdcLink As String) As DB";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3249;BA.debugLine="Dim req As DBRequestManager";
Debug.JustUpdateDeviceLine();
_req = RemoteObject.createNew ("b4j.docU.dbrequestmanager");Debug.locals.put("req", _req);
 BA.debugLineNum = 3250;BA.debugLine="req.Initialize(Me, rdcLink)";
Debug.JustUpdateDeviceLine();
_req.runClassMethod (b4j.docU.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,jamtableviewcamposbuilder.ba,(Object)(jamtableviewcamposbuilder.getObject()),(Object)(_rdclink));
 BA.debugLineNum = 3251;BA.debugLine="Return req";
Debug.JustUpdateDeviceLine();
if (true) return _req;
 BA.debugLineNum = 3252;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtipoorigendatos(RemoteObject _tipoorigendatos,RemoteObject _ipjrdc,RemoteObject _puertojrdc,RemoteObject _comandojrdc,RemoteObject _parametrosjrdc) throws Exception{
try {
		Debug.PushSubsStack("CreateTipoOrigenDatos (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3089);
if (RapidSub.canDelegate("createtipoorigendatos")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","createtipoorigendatos", _tipoorigendatos, _ipjrdc, _puertojrdc, _comandojrdc, _parametrosjrdc);}
RemoteObject _t1 = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._tipoorigendatos");
Debug.locals.put("TipoOrigenDatos", _tipoorigendatos);
Debug.locals.put("IpJRDC", _ipjrdc);
Debug.locals.put("PuertoJRDC", _puertojrdc);
Debug.locals.put("ComandoJRDC", _comandojrdc);
Debug.locals.put("ParametrosJRDC", _parametrosjrdc);
 BA.debugLineNum = 3089;BA.debugLine="private Sub CreateTipoOrigenDatos (TipoOrigenDatos";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3090;BA.debugLine="Dim t1 As TipoOrigenDatos";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4j.docU.jamtableviewcamposbuilder._tipoorigendatos");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 3091;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 3092;BA.debugLine="t1.TipoOrigenDatos = TipoOrigenDatos";
Debug.JustUpdateDeviceLine();
_t1.setField ("TipoOrigenDatos" /*RemoteObject*/ ,_tipoorigendatos);
 BA.debugLineNum = 3093;BA.debugLine="t1.IpJRDC = IpJRDC";
Debug.JustUpdateDeviceLine();
_t1.setField ("IpJRDC" /*RemoteObject*/ ,_ipjrdc);
 BA.debugLineNum = 3094;BA.debugLine="t1.PuertoJRDC = PuertoJRDC";
Debug.JustUpdateDeviceLine();
_t1.setField ("PuertoJRDC" /*RemoteObject*/ ,_puertojrdc);
 BA.debugLineNum = 3095;BA.debugLine="t1.ComandoJRDC = ComandoJRDC";
Debug.JustUpdateDeviceLine();
_t1.setField ("ComandoJRDC" /*RemoteObject*/ ,_comandojrdc);
 BA.debugLineNum = 3096;BA.debugLine="t1.ParametrosJRDC = ParametrosJRDC";
Debug.JustUpdateDeviceLine();
_t1.setField ("ParametrosJRDC" /*RemoteObject*/ ,_parametrosjrdc);
 BA.debugLineNum = 3097;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 3098;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deshabilitarnodos() throws Exception{
try {
		Debug.PushSubsStack("DeshabilitarNodos (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3226);
if (RapidSub.canDelegate("deshabilitarnodos")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","deshabilitarnodos");}
RemoteObject _lstnodosdeshabilitados = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
 BA.debugLineNum = 3226;BA.debugLine="private Sub DeshabilitarNodos";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3227;BA.debugLine="Dim lstNodosDeshabilitados As List";
Debug.JustUpdateDeviceLine();
_lstnodosdeshabilitados = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstNodosDeshabilitados", _lstnodosdeshabilitados);
 BA.debugLineNum = 3228;BA.debugLine="lstNodosDeshabilitados.Initialize";
Debug.JustUpdateDeviceLine();
_lstnodosdeshabilitados.runVoidMethod ("Initialize");
 BA.debugLineNum = 3229;BA.debugLine="For Each n As Node In frm.RootPane.GetAllViewsRec";
Debug.JustUpdateDeviceLine();
_n = RemoteObject.createNew ("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
{
final RemoteObject group3 = jamtableviewcamposbuilder._frm.runMethod(false,"getRootPane").runMethod(false,"GetAllViewsRecursive");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_n = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), group3.runMethod(false,"Get",index3));Debug.locals.put("n", _n);
Debug.locals.put("n", _n);
 BA.debugLineNum = 3230;BA.debugLine="If n.Enabled=True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_n.runMethod(true,"getEnabled"),jamtableviewcamposbuilder.__c.getField(true,"True"))) { 
 BA.debugLineNum = 3231;BA.debugLine="n.Enabled=False";
Debug.JustUpdateDeviceLine();
_n.runMethod(true,"setEnabled",jamtableviewcamposbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 3232;BA.debugLine="lstNodosDeshabilitados.Add(n)";
Debug.JustUpdateDeviceLine();
_lstnodosdeshabilitados.runVoidMethod ("Add",(Object)((_n.getObject())));
 };
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 3235;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _exporttocss(RemoteObject _nombrejsontv) throws Exception{
try {
		Debug.PushSubsStack("ExportToCSS (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,1255);
if (RapidSub.canDelegate("exporttocss")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","exporttocss", _nombrejsontv);}
RemoteObject _sbcsstotal = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
RemoteObject _mitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sbcsscolumna = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _colortexto = RemoteObject.createImmutable("");
RemoteObject _colorfondo = RemoteObject.createImmutable("");
RemoteObject _colorborde = RemoteObject.createImmutable("");
RemoteObject _alineacion = RemoteObject.createImmutable("");
RemoteObject _colorfondoencabezadocolumna = RemoteObject.createImmutable("");
RemoteObject _colortextoencabezadocolumna = RemoteObject.createImmutable("");
RemoteObject _nativeme = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _shexstringcolorfondosemitransparente = RemoteObject.createImmutable("");
Debug.locals.put("NombreJSONTV", _nombrejsontv);
 BA.debugLineNum = 1255;BA.debugLine="private Sub ExportToCSS(NombreJSONTV As String) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1256;BA.debugLine="Dim sbCSSTotal As StringBuilder";
Debug.JustUpdateDeviceLine();
_sbcsstotal = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCSSTotal", _sbcsstotal);
 BA.debugLineNum = 1257;BA.debugLine="sbCSSTotal.Initialize";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runVoidMethod ("Initialize");
 BA.debugLineNum = 1259;BA.debugLine="sbCSSTotal.Append(\"/* tamaño, bordes y color de f";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("/* tamaño, bordes y color de fondo de los titulos*/"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1260;BA.debugLine="sbCSSTotal.Append(\".\").Append(NombreJSONTV).Appen";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("."))).runMethod(false,"Append",(Object)(_nombrejsontv)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(".table-view "))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(".column-header,"))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("."))).runMethod(false,"Append",(Object)(_nombrejsontv)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(".table-view "))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" .filler {"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1261;BA.debugLine="sbCSSTotal.Append(\"-fx-background-color: \" & txtR";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("-fx-background-color: "),jamtableviewcamposbuilder._txtrgbcolorfondoencabezados.runMethod(true,"getText"),RemoteObject.createImmutable(";")))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1262;BA.debugLine="sbCSSTotal.Append(\"-fx-size: 30;\").Append(CRLF)";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-size: 30;"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1263;BA.debugLine="sbCSSTotal.Append(\"-fx-border-color: -fx-box-bord";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-border-color: -fx-box-border;"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1264;BA.debugLine="sbCSSTotal.Append(\"-fx-border-width: 0 1 1 0;\").A";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-border-width: 0 1 1 0;"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1265;BA.debugLine="sbCSSTotal.Append(\"-fx-border-insets: 0;\").Append";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-border-insets: 0;"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1266;BA.debugLine="sbCSSTotal.Append(\"}\").Append(CRLF)";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("}"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1267;BA.debugLine="sbCSSTotal.Append(CRLF)";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1269;BA.debugLine="sbCSSTotal.Append(\"/* centrar y cambiar color de";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("/* centrar y cambiar color de los titulos de columnas*/"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1270;BA.debugLine="sbCSSTotal.Append(\".\").Append(NombreJSONTV).Appen";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("."))).runMethod(false,"Append",(Object)(_nombrejsontv)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(".table-view "))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" .column-header .label{"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1271;BA.debugLine="sbCSSTotal.Append(\"-fx-text-fill: \" & txtRGBColor";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("-fx-text-fill: "),jamtableviewcamposbuilder._txtrgbcolortextoencabezados.runMethod(true,"getText"),RemoteObject.createImmutable(";")))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1272;BA.debugLine="sbCSSTotal.Append(\"-fx-alignment: CENTER;\").Appen";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-alignment: CENTER;"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1273;BA.debugLine="sbCSSTotal.Append(\"}\").Append(CRLF)";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("}"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1274;BA.debugLine="sbCSSTotal.Append(CRLF)";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1281;BA.debugLine="sbCSSTotal.Append(\"/*ScrollBars*/\").Append(CRLF)";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("/*ScrollBars*/"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1282;BA.debugLine="sbCSSTotal.Append(\".\").Append(NombreJSONTV).Appen";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("."))).runMethod(false,"Append",(Object)(_nombrejsontv)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(".table-view "))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" .scroll-bar:horizontal ,"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1283;BA.debugLine="sbCSSTotal.Append(\".\").Append(NombreJSONTV).Appen";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("."))).runMethod(false,"Append",(Object)(_nombrejsontv)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(".table-view "))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" .scroll-bar:vertical{"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1284;BA.debugLine="sbCSSTotal.Append(\"-fx-background-color:dimgray;\"";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-background-color:dimgray;"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1285;BA.debugLine="sbCSSTotal.Append(\"}\").Append(CRLF)";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("}"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1287;BA.debugLine="sbCSSTotal.Append(\"/* The increment And decrement";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("/* The increment And decrement button CSS class of scrollbar */"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1288;BA.debugLine="sbCSSTotal.Append(\".\").Append(NombreJSONTV).Appen";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("."))).runMethod(false,"Append",(Object)(_nombrejsontv)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(".table-view "))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" .increment-button ,"))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("."))).runMethod(false,"Append",(Object)(_nombrejsontv)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(".table-view "))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" .decrement-button {"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1289;BA.debugLine="sbCSSTotal.Append(\"-fx-background-color:transpare";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-background-color:transparent;"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1290;BA.debugLine="sbCSSTotal.Append(\"-fx-border-color:derive(gray,8";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-border-color:derive(gray,80%);"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1291;BA.debugLine="sbCSSTotal.Append(\"}\").Append(CRLF)";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("}"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1301;BA.debugLine="sbCSSTotal.Append(\"/* The Main scrollbar **thumb*";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("/* The Main scrollbar **thumb** CSS class which we drag every time (movable) */"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1302;BA.debugLine="sbCSSTotal.Append(\".\").Append(NombreJSONTV).Appen";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("."))).runMethod(false,"Append",(Object)(_nombrejsontv)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(".table-view "))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" .scroll-bar:horizontal .thumb,"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1303;BA.debugLine="sbCSSTotal.Append(\".\").Append(NombreJSONTV).Appen";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("."))).runMethod(false,"Append",(Object)(_nombrejsontv)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(".table-view "))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" .scroll-bar:vertical .thumb {"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1304;BA.debugLine="sbCSSTotal.Append(\"-fx-background-color:#AEAEAE;\"";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-background-color:#AEAEAE;"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1305;BA.debugLine="sbCSSTotal.Append(\"-fx-background-insets: 1.5, 1,";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-background-insets: 1.5, 1, 1.5, 1;"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1306;BA.debugLine="sbCSSTotal.Append(\"-fx-background-radius: 0.5em;\"";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-background-radius: 0.5em;"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1307;BA.debugLine="sbCSSTotal.Append(\"}\").Append(CRLF)";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("}"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1308;BA.debugLine="sbCSSTotal.Append(\"/*Fin Scrollbars*/\").Append(CR";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("/*Fin Scrollbars*/"))).runMethod(false,"Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1340;BA.debugLine="sbCSSTotal.Append(\".\").Append(NombreJSONTV).Appen";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("."))).runMethod(false,"Append",(Object)(_nombrejsontv)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(".table-view "))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(".table-row-cell:odd:contains-selection {"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1347;BA.debugLine="sbCSSTotal.Append(\"-fx-border-color: darkred;\").A";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-border-color: darkred;"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1348;BA.debugLine="sbCSSTotal.Append(\"-fx-border-width: 1;\").Append(";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-border-width: 1;"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1349;BA.debugLine="sbCSSTotal.Append(\"-fx-border-insets: 0 -1 0 -1;\"";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-border-insets: 0 -1 0 -1;"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1350;BA.debugLine="sbCSSTotal.Append(\"-fx-border-style: segments(4,4";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-border-style: segments(4,4) hidden segments(4,4) hidden;"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1352;BA.debugLine="sbCSSTotal.Append(\"}\").Append(CRLF)";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("}"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1353;BA.debugLine="sbCSSTotal.Append(CRLF)";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1355;BA.debugLine="sbCSSTotal.Append(\".\").Append(NombreJSONTV).Appen";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("."))).runMethod(false,"Append",(Object)(_nombrejsontv)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(".table-view "))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(".table-row-cell:even:contains-selection {"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1362;BA.debugLine="sbCSSTotal.Append(\"-fx-border-color: darkred;\").A";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-border-color: darkred;"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1363;BA.debugLine="sbCSSTotal.Append(\"-fx-border-width: 1;\").Append(";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-border-width: 1;"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1364;BA.debugLine="sbCSSTotal.Append(\"-fx-border-insets: 0 -1 0 -1;\"";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-border-insets: 0 -1 0 -1;"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1365;BA.debugLine="sbCSSTotal.Append(\"-fx-border-style: segments(4,4";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-border-style: segments(4,4) hidden segments(4,4) hidden;"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1367;BA.debugLine="sbCSSTotal.Append(\"}\").Append(CRLF)";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("}"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1368;BA.debugLine="sbCSSTotal.Append(CRLF)";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1377;BA.debugLine="sbCSSTotal.Append(\".\").Append(NombreJSONTV).Appen";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("."))).runMethod(false,"Append",(Object)(_nombrejsontv)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(".table-view "))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(".table-row-cell:odd{"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1378;BA.debugLine="sbCSSTotal.Append(\"-fx-background:\").Append(txtRG";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-background:"))).runMethod(false,"Append",(Object)(RemoteObject.concat(jamtableviewcamposbuilder._txtrgbcolorfondofilasimpares.runMethod(true,"getText"),RemoteObject.createImmutable(";")))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1379;BA.debugLine="sbCSSTotal.Append(\"}\").Append(CRLF)";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("}"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1380;BA.debugLine="sbCSSTotal.Append(CRLF)";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1382;BA.debugLine="sbCSSTotal.Append(\".\").Append(NombreJSONTV).Appen";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("."))).runMethod(false,"Append",(Object)(_nombrejsontv)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(".table-view "))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(".table-row-cell:even{"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1383;BA.debugLine="sbCSSTotal.Append(\"-fx-background:\").Append(txtRG";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-background:"))).runMethod(false,"Append",(Object)(RemoteObject.concat(jamtableviewcamposbuilder._txtrgbcolorfondofilaspares.runMethod(true,"getText"),RemoteObject.createImmutable(";")))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1384;BA.debugLine="sbCSSTotal.Append(\"}\").Append(CRLF)";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("}"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1385;BA.debugLine="sbCSSTotal.Append(CRLF)";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1387;BA.debugLine="sbCSSTotal.Append(\"/* COLUMNAS*/\").Append(CRLF)";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("/* COLUMNAS*/"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1389;BA.debugLine="For i = 0 To clvListaCampos.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step59 = 1;
final int limit59 = RemoteObject.solve(new RemoteObject[] {jamtableviewcamposbuilder._clvlistacampos.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step59 > 0 && _i <= limit59) || (step59 < 0 && _i >= limit59) ;_i = ((int)(0 + _i + step59))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1391;BA.debugLine="Dim mItem As Map=ItemValueToMap(clvListaCampos.G";
Debug.JustUpdateDeviceLine();
_mitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mitem = _itemvaluetomap((jamtableviewcamposbuilder._clvlistacampos.runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i)))));Debug.locals.put("mItem", _mitem);Debug.locals.put("mItem", _mitem);
 BA.debugLineNum = 1392;BA.debugLine="If False=mItem.get(\"ColumnaTableView\") Then Cont";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",jamtableviewcamposbuilder.__c.getField(true,"False"),BA.ObjectToBoolean(_mitem.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ColumnaTableView"))))))) { 
if (true) continue;};
 BA.debugLineNum = 1393;BA.debugLine="Dim sbCSSColumna As StringBuilder";
Debug.JustUpdateDeviceLine();
_sbcsscolumna = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCSSColumna", _sbcsscolumna);
 BA.debugLineNum = 1394;BA.debugLine="sbCSSColumna.Initialize";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runVoidMethod ("Initialize");
 BA.debugLineNum = 1395;BA.debugLine="Dim ColorTexto As String=mItem.Get(\"ColorTexto\")";
Debug.JustUpdateDeviceLine();
_colortexto = BA.ObjectToString(_mitem.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ColorTexto")))));Debug.locals.put("ColorTexto", _colortexto);Debug.locals.put("ColorTexto", _colortexto);
 BA.debugLineNum = 1396;BA.debugLine="Dim ColorFondo As String=mItem.Get(\"ColorFondo\")";
Debug.JustUpdateDeviceLine();
_colorfondo = BA.ObjectToString(_mitem.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ColorFondo")))));Debug.locals.put("ColorFondo", _colorfondo);Debug.locals.put("ColorFondo", _colorfondo);
 BA.debugLineNum = 1398;BA.debugLine="Dim ColorBorde As String=mItem.Get(\"ColorBordeCe";
Debug.JustUpdateDeviceLine();
_colorborde = BA.ObjectToString(_mitem.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ColorBordeCeldaSeleccionada")))));Debug.locals.put("ColorBorde", _colorborde);Debug.locals.put("ColorBorde", _colorborde);
 BA.debugLineNum = 1400;BA.debugLine="Dim Alineacion As String=mItem.Get(\"AlineacionCo";
Debug.JustUpdateDeviceLine();
_alineacion = BA.ObjectToString(_mitem.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("AlineacionColumna")))));Debug.locals.put("Alineacion", _alineacion);Debug.locals.put("Alineacion", _alineacion);
 BA.debugLineNum = 1402;BA.debugLine="Dim ColorFondoEncabezadoColumna As String=mItem.";
Debug.JustUpdateDeviceLine();
_colorfondoencabezadocolumna = BA.ObjectToString(_mitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ColorFondoEncabezadoColumna"))),(Object)((jamtableviewcamposbuilder._txtrgbcolorfondoencabezados.runMethod(true,"getText")))));Debug.locals.put("ColorFondoEncabezadoColumna", _colorfondoencabezadocolumna);Debug.locals.put("ColorFondoEncabezadoColumna", _colorfondoencabezadocolumna);
 BA.debugLineNum = 1403;BA.debugLine="Dim ColorTextoEncabezadoColumna As String=mItem.";
Debug.JustUpdateDeviceLine();
_colortextoencabezadocolumna = BA.ObjectToString(_mitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ColorTextoEncabezadoColumna"))),(Object)((jamtableviewcamposbuilder._txtrgbcolortextoencabezados.runMethod(true,"getText")))));Debug.locals.put("ColorTextoEncabezadoColumna", _colortextoencabezadocolumna);Debug.locals.put("ColorTextoEncabezadoColumna", _colortextoencabezadocolumna);
 BA.debugLineNum = 1419;BA.debugLine="sbCSSColumna.Append(\".\").append(NombreJSONTV).A";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("."))).runMethod(false,"Append",(Object)(_nombrejsontv)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-"))).runMethod(false,"Append",(Object)(BA.ObjectToString(_mitem.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("AliasCampo"))))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(".table-cell {")));
 BA.debugLineNum = 1424;BA.debugLine="sbCSSColumna.Append(CRLF).Append(\"-fx-text-fil";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runMethod(false,"Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF"))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-text-fill: "))).runMethod(false,"Append",(Object)(_colortexto)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(";")));
 BA.debugLineNum = 1430;BA.debugLine="If ColorFondo<>\"transparent\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_colorfondo,BA.ObjectToString("transparent"))) { 
 BA.debugLineNum = 1432;BA.debugLine="Dim NativeMe As JavaObject=Me";
Debug.JustUpdateDeviceLine();
_nativeme = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_nativeme = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), jamtableviewcamposbuilder.getObject());Debug.locals.put("NativeMe", _nativeme);Debug.locals.put("NativeMe", _nativeme);
 BA.debugLineNum = 1433;BA.debugLine="Dim sHexStringColorFondoSemitransparente As St";
Debug.JustUpdateDeviceLine();
_shexstringcolorfondosemitransparente = BA.ObjectToString(_nativeme.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("ColorStringToHexStringSemiTransparent")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_colorfondo)}))));Debug.locals.put("sHexStringColorFondoSemitransparente", _shexstringcolorfondosemitransparente);Debug.locals.put("sHexStringColorFondoSemitransparente", _shexstringcolorfondosemitransparente);
 BA.debugLineNum = 1435;BA.debugLine="sbCSSColumna.Append(CRLF).Append(\"-fx-backgrou";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runMethod(false,"Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF"))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-background-color: "))).runMethod(false,"Append",(Object)(_shexstringcolorfondosemitransparente)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(";")));
 BA.debugLineNum = 1436;BA.debugLine="sbCSSColumna.Append(CRLF).Append(\"-fx-backgrou";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runMethod(false,"Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("-fx-background-insets: 1;")));
 };
 BA.debugLineNum = 1447;BA.debugLine="sbCSSColumna.Append(CRLF).Append(\"}\").Append(CR";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runMethod(false,"Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF"))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("}"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1452;BA.debugLine="sbCSSColumna.Append(\".\").append(NombreJSONTV).Ap";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("."))).runMethod(false,"Append",(Object)(_nombrejsontv)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-"))).runMethod(false,"Append",(Object)(BA.ObjectToString(_mitem.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("AliasCampo"))))))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(".table-cell:selected {"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1464;BA.debugLine="If ColorFondo<>\"transparent\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_colorfondo,BA.ObjectToString("transparent"))) { 
 BA.debugLineNum = 1465;BA.debugLine="sbCSSColumna.Append(\"-fx-background-color: \").A";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-background-color: "))).runMethod(false,"Append",(Object)(_shexstringcolorfondosemitransparente)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(";"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 }else {
 BA.debugLineNum = 1468;BA.debugLine="sbCSSColumna.Append(\"-fx-background-color: tran";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-background-color: transparent;"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 };
 BA.debugLineNum = 1475;BA.debugLine="sbCSSColumna.Append(\"-fx-border-width: 3 4 3 4;\"";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-border-width: 3 4 3 4;"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1476;BA.debugLine="sbCSSColumna.Append(\"-fx-border-insets: 0 1 1 1;";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-border-insets: 0 1 1 1;"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1477;BA.debugLine="sbCSSColumna.Append(\"-fx-border-color: \").Append";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-border-color: "))).runMethod(false,"Append",(Object)(_colorborde)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(";"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1491;BA.debugLine="sbCSSColumna.Append(\"}\").Append(CRLF)";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("}"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1493;BA.debugLine="If ColorFondoEncabezadoColumna<>txtRGBColorFondo";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_colorfondoencabezadocolumna,jamtableviewcamposbuilder._txtrgbcolorfondoencabezados.runMethod(true,"getText"))) { 
 BA.debugLineNum = 1494;BA.debugLine="sbCSSColumna.Append(\".\").append(NombreJSONTV).A";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("."))).runMethod(false,"Append",(Object)(_nombrejsontv)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(".table-view .column-header."))).runMethod(false,"Append",(Object)(_nombrejsontv)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-"))).runMethod(false,"Append",(Object)(BA.ObjectToString(_mitem.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("AliasCampo"))))))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1495;BA.debugLine="sbCSSColumna.Append(\" {\").Append(CRLF)";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" {"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1496;BA.debugLine="sbCSSColumna.Append(\"-fx-background-color: \").A";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-background-color: "))).runMethod(false,"Append",(Object)(_colorfondoencabezadocolumna)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(";"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1497;BA.debugLine="sbCSSColumna.Append(\"-fx-size: 30;\").Append(CRL";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-size: 30;"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1498;BA.debugLine="sbCSSColumna.Append(\"-fx-border-color: -fx-box-";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-border-color: -fx-box-border;"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1499;BA.debugLine="sbCSSColumna.Append(\"-fx-border-width: 0 1 1 0;";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-border-width: 0 1 1 0;"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1500;BA.debugLine="sbCSSColumna.Append(\"-fx-border-insets: 0;\").Ap";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-border-insets: 0;"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1502;BA.debugLine="sbCSSColumna.Append(\"}\").Append(CRLF)";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("}"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1503;BA.debugLine="sbCSSColumna.Append(CRLF)";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 };
 BA.debugLineNum = 1506;BA.debugLine="If ColorTextoEncabezadoColumna<>txtRGBColorTexto";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_colortextoencabezadocolumna,jamtableviewcamposbuilder._txtrgbcolortextoencabezados.runMethod(true,"getText"))) { 
 BA.debugLineNum = 1507;BA.debugLine="sbCSSColumna.Append(\".\").append(NombreJSONTV).A";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("."))).runMethod(false,"Append",(Object)(_nombrejsontv)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(".table-view .column-header."))).runMethod(false,"Append",(Object)(_nombrejsontv)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-"))).runMethod(false,"Append",(Object)(BA.ObjectToString(_mitem.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("AliasCampo"))))))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" .label"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1508;BA.debugLine="sbCSSColumna.Append(\" {\").Append(CRLF)";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" {"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1509;BA.debugLine="sbCSSColumna.Append(\"-fx-text-fill: \" & ColorTe";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runMethod(false,"Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("-fx-text-fill: "),_colortextoencabezadocolumna,RemoteObject.createImmutable(";")))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1510;BA.debugLine="sbCSSColumna.Append(\"-fx-alignment: CENTER;\").A";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("-fx-alignment: CENTER;"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1511;BA.debugLine="sbCSSColumna.Append(\"}\").Append(CRLF)";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("}"))).runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1512;BA.debugLine="sbCSSColumna.Append(CRLF)";
Debug.JustUpdateDeviceLine();
_sbcsscolumna.runVoidMethod ("Append",(Object)(jamtableviewcamposbuilder.__c.getField(true,"CRLF")));
 };
 BA.debugLineNum = 1516;BA.debugLine="sbCSSTotal.Append(sbCSSColumna.ToString)";
Debug.JustUpdateDeviceLine();
_sbcsstotal.runVoidMethod ("Append",(Object)(_sbcsscolumna.runMethod(true,"ToString")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1519;BA.debugLine="Return sbCSSTotal.ToString";
Debug.JustUpdateDeviceLine();
if (true) return _sbcsstotal.runMethod(true,"ToString");
 BA.debugLineNum = 1540;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _exporttostring() throws Exception{
try {
		Debug.PushSubsStack("ExportToString (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,1222);
if (RapidSub.canDelegate("exporttostring")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","exporttostring");}
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _jg = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");
 BA.debugLineNum = 1222;BA.debugLine="private Sub ExportToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1223;BA.debugLine="Dim Items As List";
Debug.JustUpdateDeviceLine();
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Items", _items);
 BA.debugLineNum = 1224;BA.debugLine="Items.Initialize";
Debug.JustUpdateDeviceLine();
_items.runVoidMethod ("Initialize");
 BA.debugLineNum = 1225;BA.debugLine="For i = 0 To clvListaCampos.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {jamtableviewcamposbuilder._clvlistacampos.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1226;BA.debugLine="Items.Add(ItemValueToMap(clvListaCampos.GetValue";
Debug.JustUpdateDeviceLine();
_items.runVoidMethod ("Add",(Object)((_itemvaluetomap((jamtableviewcamposbuilder._clvlistacampos.runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))))).getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1238;BA.debugLine="Dim jg As JSONGenerator";
Debug.JustUpdateDeviceLine();
_jg = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jg", _jg);
 BA.debugLineNum = 1244;BA.debugLine="jg.Initialize(CreateMap(\"FechaUltimaModificacion\"";
Debug.JustUpdateDeviceLine();
_jg.runVoidMethod ("Initialize",(Object)(jamtableviewcamposbuilder.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("FechaUltimaModificacion")),(jamtableviewcamposbuilder.__c.getField(false,"DateTime").runMethod(true,"getNow")),RemoteObject.createImmutable(("TipoOrigenDatos")),(jamtableviewcamposbuilder._datosorigendatos.getField(true,"TipoOrigenDatos" /*RemoteObject*/ )),RemoteObject.createImmutable(("IpJRDC")),(jamtableviewcamposbuilder._datosorigendatos.getField(true,"IpJRDC" /*RemoteObject*/ )),RemoteObject.createImmutable(("PuertoJRDC")),(jamtableviewcamposbuilder._datosorigendatos.getField(true,"PuertoJRDC" /*RemoteObject*/ )),RemoteObject.createImmutable(("ComandoJRDC")),(jamtableviewcamposbuilder._datosorigendatos.getField(true,"ComandoJRDC" /*RemoteObject*/ )),RemoteObject.createImmutable(("ParametrosJRDC")),(jamtableviewcamposbuilder._datosorigendatos.getField(true,"ParametrosJRDC" /*RemoteObject*/ )),RemoteObject.createImmutable(("ColorFondoEncabezados")),(jamtableviewcamposbuilder._txtrgbcolorfondoencabezados.runMethod(true,"getText")),RemoteObject.createImmutable(("ColorTextoEncabezados")),(jamtableviewcamposbuilder._txtrgbcolortextoencabezados.runMethod(true,"getText")),RemoteObject.createImmutable(("ColorFondoPanelInfo")),(jamtableviewcamposbuilder._txtrgbcolorfondopanelinfo.runMethod(true,"getText")),RemoteObject.createImmutable(("ColorTextoPanelInfo")),(jamtableviewcamposbuilder._txtrgbcolortextopanelinfo.runMethod(true,"getText")),RemoteObject.createImmutable(("ColorFondoFilasImpares")),(jamtableviewcamposbuilder._txtrgbcolorfondofilasimpares.runMethod(true,"getText")),RemoteObject.createImmutable(("ColorFondoFilasPares")),(jamtableviewcamposbuilder._txtrgbcolorfondofilaspares.runMethod(true,"getText")),RemoteObject.createImmutable(("Items")),(_items.getObject())}))));
 BA.debugLineNum = 1251;BA.debugLine="Return jg.ToPrettyString(4)";
Debug.JustUpdateDeviceLine();
if (true) return _jg.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 4)));
 BA.debugLineNum = 1252;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _frm_closerequest(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,281);
if (RapidSub.canDelegate("frm_closerequest")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","frm_closerequest", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 281;BA.debugLine="private Sub frm_CloseRequest (EventData As Event)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 282;BA.debugLine="EventData.Consume";
Debug.JustUpdateDeviceLine();
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 283;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcsscolorstringfromintcolor(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("GetCssColorStringFromIntColor (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,401);
if (RapidSub.canDelegate("getcsscolorstringfromintcolor")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","getcsscolorstringfromintcolor", _value);}
RemoteObject _hexargb = RemoteObject.createImmutable("");
RemoteObject _hexrgb = RemoteObject.createImmutable("");
Debug.locals.put("value", _value);
 BA.debugLineNum = 401;BA.debugLine="Private Sub GetCssColorStringFromIntColor(value As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 402;BA.debugLine="Select value";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_value,jamtableviewcamposbuilder._fx.getField(false,"Colors").runMethod(true,"To32Bit",(Object)(jamtableviewcamposbuilder._fx.getField(false,"Colors").getField(false,"Transparent"))))) {
case 0: {
 BA.debugLineNum = 404;BA.debugLine="Return \"transparent\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("transparent");
 break; }
default: {
 BA.debugLineNum = 408;BA.debugLine="Dim HexARGB As String=ColorToHex(value)";
Debug.JustUpdateDeviceLine();
_hexargb = _colortohex(_value);Debug.locals.put("HexARGB", _hexargb);Debug.locals.put("HexARGB", _hexargb);
 BA.debugLineNum = 409;BA.debugLine="If HexARGB.Length=6 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_hexargb.runMethod(true,"length"),BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 410;BA.debugLine="Return \"#\" & HexARGB";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.concat(RemoteObject.createImmutable("#"),_hexargb);
 }else {
 BA.debugLineNum = 412;BA.debugLine="Dim HexRGB As String=HexARGB.SubString2(2,8)";
Debug.JustUpdateDeviceLine();
_hexrgb = _hexargb.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 8)));Debug.locals.put("HexRGB", _hexrgb);Debug.locals.put("HexRGB", _hexrgb);
 BA.debugLineNum = 413;BA.debugLine="Return \"#\" & HexRGB";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.concat(RemoteObject.createImmutable("#"),_hexrgb);
 };
 break; }
}
;
 BA.debugLineNum = 416;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcsscolorstringfrompaint(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("GetCssColorStringFromPaint (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,382);
if (RapidSub.canDelegate("getcsscolorstringfrompaint")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","getcsscolorstringfrompaint", _value);}
RemoteObject _colorint = RemoteObject.createImmutable(0);
RemoteObject _hexargb = RemoteObject.createImmutable("");
RemoteObject _hexrgb = RemoteObject.createImmutable("");
Debug.locals.put("value", _value);
 BA.debugLineNum = 382;BA.debugLine="Private Sub GetCssColorStringFromPaint(value As Pa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 383;BA.debugLine="Select value";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_value,jamtableviewcamposbuilder._fx.getField(false,"Colors").getField(false,"Transparent"),jamtableviewcamposbuilder._fx.getField(false,"Colors").getField(false,"Black"))) {
case 0: {
 BA.debugLineNum = 385;BA.debugLine="Return \"transparent\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("transparent");
 break; }
case 1: {
 BA.debugLineNum = 387;BA.debugLine="Return \"black\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("black");
 break; }
default: {
 BA.debugLineNum = 389;BA.debugLine="Dim ColorInt As Int=fx.Colors.To32Bit(value)";
Debug.JustUpdateDeviceLine();
_colorint = jamtableviewcamposbuilder._fx.getField(false,"Colors").runMethod(true,"To32Bit",(Object)((_value.getObject())));Debug.locals.put("ColorInt", _colorint);Debug.locals.put("ColorInt", _colorint);
 BA.debugLineNum = 391;BA.debugLine="Dim HexARGB As String=ColorToHex(ColorInt)";
Debug.JustUpdateDeviceLine();
_hexargb = _colortohex(_colorint);Debug.locals.put("HexARGB", _hexargb);Debug.locals.put("HexARGB", _hexargb);
 BA.debugLineNum = 392;BA.debugLine="If HexARGB.Length=6 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_hexargb.runMethod(true,"length"),BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 393;BA.debugLine="Return \"#\" & HexARGB";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.concat(RemoteObject.createImmutable("#"),_hexargb);
 }else {
 BA.debugLineNum = 395;BA.debugLine="Dim HexRGB As String=HexARGB.SubString2(2,8)";
Debug.JustUpdateDeviceLine();
_hexrgb = _hexargb.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 8)));Debug.locals.put("HexRGB", _hexrgb);Debug.locals.put("HexRGB", _hexrgb);
 BA.debugLineNum = 396;BA.debugLine="Return \"#\" & HexRGB";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.concat(RemoteObject.createImmutable("#"),_hexrgb);
 };
 break; }
}
;
 BA.debugLineNum = 399;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettablepragma(RemoteObject _sql,RemoteObject _tablename) throws Exception{
try {
		Debug.PushSubsStack("GetTablePragma (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,1921);
if (RapidSub.canDelegate("gettablepragma")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","gettablepragma", _sql, _tablename);}
RemoteObject _lstfields = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _tbquery = RemoteObject.createImmutable("");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _columnparmsmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
 BA.debugLineNum = 1921;BA.debugLine="Sub GetTablePragma(SQL As SQL,TableName As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1922;BA.debugLine="Private lstFields As List";
Debug.JustUpdateDeviceLine();
_lstfields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstFields", _lstfields);
 BA.debugLineNum = 1923;BA.debugLine="lstFields.Initialize";
Debug.JustUpdateDeviceLine();
_lstfields.runVoidMethod ("Initialize");
 BA.debugLineNum = 1924;BA.debugLine="Private TBQuery As String";
Debug.JustUpdateDeviceLine();
_tbquery = RemoteObject.createImmutable("");Debug.locals.put("TBQuery", _tbquery);
 BA.debugLineNum = 1925;BA.debugLine="TBQuery = \"PRAGMA table_info(\" & TableName & \")\"";
Debug.JustUpdateDeviceLine();
_tbquery = RemoteObject.concat(RemoteObject.createImmutable("PRAGMA table_info("),_tablename,RemoteObject.createImmutable(")"));Debug.locals.put("TBQuery", _tbquery);
 BA.debugLineNum = 1926;BA.debugLine="Dim rs As ResultSet=SQL.ExecQuery(TBQuery)";
Debug.JustUpdateDeviceLine();
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = _sql.runMethod(false,"ExecQuery",(Object)(_tbquery));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1927;BA.debugLine="Do While rs.NextRow";
Debug.JustUpdateDeviceLine();
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1928;BA.debugLine="Dim ColumnParmsMap As Map";
Debug.JustUpdateDeviceLine();
_columnparmsmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("ColumnParmsMap", _columnparmsmap);
 BA.debugLineNum = 1929;BA.debugLine="ColumnParmsMap.Initialize";
Debug.JustUpdateDeviceLine();
_columnparmsmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 1930;BA.debugLine="For i=0 To rs.ColumnCount-1";
Debug.JustUpdateDeviceLine();
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_rs.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1931;BA.debugLine="Log (\"     \" & i & \": \" &  rs.GetColumnName(i)";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder.__c.runVoidMethod ("LogImpl","9205586442",RemoteObject.concat(RemoteObject.createImmutable("     "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable(": "),_rs.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable("->"),_rs.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i)))),0);
 BA.debugLineNum = 1932;BA.debugLine="ColumnParmsMap.Put(rs.GetColumnName(i), rs.GetS";
Debug.JustUpdateDeviceLine();
_columnparmsmap.runVoidMethod ("Put",(Object)((_rs.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))))),(Object)((_rs.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1934;BA.debugLine="lstFields.Add(ColumnParmsMap)";
Debug.JustUpdateDeviceLine();
_lstfields.runVoidMethod ("Add",(Object)((_columnparmsmap.getObject())));
 }
;
 BA.debugLineNum = 1936;BA.debugLine="rs.Close";
Debug.JustUpdateDeviceLine();
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 1937;BA.debugLine="Return lstFields";
Debug.JustUpdateDeviceLine();
if (true) return _lstfields;
 BA.debugLineNum = 1938;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _habilitardeshabilitarcheckbox(RemoteObject _chkboxsel,RemoteObject _habilitado) throws Exception{
try {
		Debug.PushSubsStack("HabilitarDeshabilitarCheckBox (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2688);
if (RapidSub.canDelegate("habilitardeshabilitarcheckbox")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","habilitardeshabilitarcheckbox", _chkboxsel, _habilitado);}
Debug.locals.put("chkboxSel", _chkboxsel);
Debug.locals.put("Habilitado", _habilitado);
 BA.debugLineNum = 2688;BA.debugLine="private Sub HabilitarDeshabilitarCheckBox(chkboxSe";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2689;BA.debugLine="chkboxSel.Enabled=Habilitado";
Debug.JustUpdateDeviceLine();
_chkboxsel.runMethod(true,"setEnabled",_habilitado);
 BA.debugLineNum = 2690;BA.debugLine="If Habilitado Then";
Debug.JustUpdateDeviceLine();
if (_habilitado.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2691;BA.debugLine="chkboxSel.Style=\"-fx-text-fill:black; -fx-border";
Debug.JustUpdateDeviceLine();
_chkboxsel.runMethod(true,"setStyle",BA.ObjectToString("-fx-text-fill:black; -fx-border-color: black"));
 }else {
 BA.debugLineNum = 2693;BA.debugLine="chkboxSel.Style=\"-fx-text-fill:lightgray; -fx-bo";
Debug.JustUpdateDeviceLine();
_chkboxsel.runMethod(true,"setStyle",BA.ObjectToString("-fx-text-fill:lightgray; -fx-border-color: lightgray"));
 };
 BA.debugLineNum = 2695;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _habilitarnodos() throws Exception{
try {
		Debug.PushSubsStack("HabilitarNodos (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3237);
if (RapidSub.canDelegate("habilitarnodos")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","habilitarnodos");}
RemoteObject _lstnodosdeshabilitados = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
 BA.debugLineNum = 3237;BA.debugLine="private Sub HabilitarNodos";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3238;BA.debugLine="Dim lstNodosDeshabilitados As List";
Debug.JustUpdateDeviceLine();
_lstnodosdeshabilitados = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstNodosDeshabilitados", _lstnodosdeshabilitados);
 BA.debugLineNum = 3239;BA.debugLine="lstNodosDeshabilitados.Initialize";
Debug.JustUpdateDeviceLine();
_lstnodosdeshabilitados.runVoidMethod ("Initialize");
 BA.debugLineNum = 3240;BA.debugLine="For Each n As Node In frm.RootPane.GetAllViewsRec";
Debug.JustUpdateDeviceLine();
_n = RemoteObject.createNew ("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
{
final RemoteObject group3 = jamtableviewcamposbuilder._frm.runMethod(false,"getRootPane").runMethod(false,"GetAllViewsRecursive");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_n = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), group3.runMethod(false,"Get",index3));Debug.locals.put("n", _n);
Debug.locals.put("n", _n);
 BA.debugLineNum = 3241;BA.debugLine="If n.Enabled=False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_n.runMethod(true,"getEnabled"),jamtableviewcamposbuilder.__c.getField(true,"False"))) { 
 BA.debugLineNum = 3242;BA.debugLine="n.Enabled=True";
Debug.JustUpdateDeviceLine();
_n.runMethod(true,"setEnabled",jamtableviewcamposbuilder.__c.getField(true,"True"));
 BA.debugLineNum = 3243;BA.debugLine="lstNodosDeshabilitados.Add(n)";
Debug.JustUpdateDeviceLine();
_lstnodosdeshabilitados.runVoidMethod ("Add",(Object)((_n.getObject())));
 };
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 3246;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _help() throws Exception{
try {
		Debug.PushSubsStack("Help (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3022);
if (RapidSub.canDelegate("help")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","help");}
ResumableSub_Help rsub = new ResumableSub_Help(null);
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
public ResumableSub_Help(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
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
		Debug.PushSubsStack("Help (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3022);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
 BA.debugLineNum = 3023;BA.debugLine="Dialog.Title=\"Información\"";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Información")));
 BA.debugLineNum = 3026;BA.debugLine="Dim DlgInfo As B4XLongTextTemplate";
Debug.JustUpdateDeviceLine();
_dlginfo = RemoteObject.createNew ("b4j.docU.b4xlongtexttemplate");Debug.locals.put("DlgInfo", _dlginfo);
 BA.debugLineNum = 3027;BA.debugLine="DlgInfo.Initialize";
Debug.JustUpdateDeviceLine();
_dlginfo.runClassMethod (b4j.docU.b4xlongtexttemplate.class, "_initialize" /*RemoteObject*/ ,jamtableviewcamposbuilder.ba);
 BA.debugLineNum = 3028;BA.debugLine="Dim sbInfo As StringBuilder";
Debug.JustUpdateDeviceLine();
_sbinfo = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbInfo", _sbinfo);
 BA.debugLineNum = 3029;BA.debugLine="sbInfo.Initialize";
Debug.JustUpdateDeviceLine();
_sbinfo.runVoidMethod ("Initialize");
 BA.debugLineNum = 3030;BA.debugLine="sbInfo.Append(\"Instrucciones:\").Append(CRLF).Appe";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Instrucciones:"))).runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 3031;BA.debugLine="sbInfo.Append(\"1) El nombre del campo y su tipo s";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("1) El nombre del campo y su tipo son obligatorios"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 3032;BA.debugLine="sbInfo.Append(\"Los campos tipo fecha (se recupera";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Los campos tipo fecha (se recuperará un Long del origen de datos), hay que marcarlos como \"Es Fecha\"."))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 3033;BA.debugLine="sbInfo.Append(\"Si el origen de datos se obtiene m";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Si el origen de datos se obtiene mediante tabla / vista / query SQL , TODOS los campos devueltos por SQL deben estar definidos. NO se puede eliminar un campo obtenido mediante SQL"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 3035;BA.debugLine="sbInfo.Append(\"En caso de origen de datos tipo Qu";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("En caso de origen de datos tipo Query, si no hay parámetros, dejar en blanco. Si hay más de 1 parámetro, separarlos mediante punto y coma (;)"))).runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 3036;BA.debugLine="sbInfo.Append(\"En caso de carga de 1 JSON ya exis";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("En caso de carga de 1 JSON ya existente, se comparán los campos del JSON, con los devueltos actualmente por la consulta SQL. Casos:"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 3037;BA.debugLine="sbInfo.Append(\"   - El campo de SQL ya existe en";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("   - El campo de SQL ya existe en el JSON: Se mantiene como está definido en el JSON."))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 3038;BA.debugLine="sbInfo.Append(\"   - El campo de SQL NO existe en";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("   - El campo de SQL NO existe en el JSON: Se añade al CLV con el nombre de campo, alias y encabezado de columna = nombre de campo. El resto de datos estará en blanco."))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 3039;BA.debugLine="sbInfo.Append(\"   - El campo está en el JSON, per";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("   - El campo está en el JSON, pero la SQL no lo ha devuelto: Se mostrará una advertencia para confirmar si continuar o detener el proceso (para revisar la SQL por parte del programador."))).runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 3042;BA.debugLine="sbInfo.Append(\"Es posible indicar varios campos d";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Es posible indicar varios campos de clave primeria, ordenados del 1 al X, indicándolo en el valor del KeyID."))).runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 3043;BA.debugLine="sbInfo.Append(\"2) Para los campos que se quiera m";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("2) Para los campos que se quiera mostrar en columnas, hay que marcar el checkbox Columna."))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 3044;BA.debugLine="sbInfo.Append(\"Por defecto, salvo que sea campo c";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Por defecto, salvo que sea campo calculado, se copia el valor del nombre del campo al alias de campo y al encabezado. Se puede editar posteriormente."))).runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 3045;BA.debugLine="sbInfo.Append(\"3) Para los campos por los que se";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("3) Para los campos por los que se quiera poder filtrar, definir un tipo de control para el filtro. Si no se quiere permitir filtrar por un campo, dejarlo en blanco."))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 3046;BA.debugLine="sbInfo.Append(\"En el selector del filtro se mostr";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("En el selector del filtro se mostrará el alias del campo."))).runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 3047;BA.debugLine="sbInfo.Append(\"4) Es posible añadir o eliminar ca";
Debug.JustUpdateDeviceLine();
_sbinfo.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("4) Es posible añadir o eliminar campos manualmente. Los campos calculados deben introducirse en el combo Campo, con sintaxis válida de SQLite, con los ALIAS DE CAMPO correspondientes a los campos entre corchetes.")));
 BA.debugLineNum = 3048;BA.debugLine="sbInfo.Append(\"Si el origen de datos es de tipo S";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Si el origen de datos es de tipo SQL , solo se podrán añadir campos calculados"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 3050;BA.debugLine="sbInfo.Append(\"Un campo transformado a partir de";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Un campo transformado a partir de 1 sola columna no es un campo calculado, se trata como un formato. Ver punto siguiente."))).runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 3051;BA.debugLine="sbInfo.Append(\"5) Los formatos de las columnas se";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("5) Los formatos de las columnas se definen en el evento SetCellFactory las columnas que lo necesiten ."))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 3052;BA.debugLine="sbInfo.Append(\" Los formatos de las columnas se c";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" Los formatos de las columnas se crean mediante código INLINE java. Existen unos formatos predefinidos en la propia clase. Se llaman mediante constantes _CellFactory,"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 3053;BA.debugLine="sbInfo.Append(\" indicando en el método Create que";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" indicando en el método Create que NO están en el módulo CallBack. Para formatos que no estén predefinidos, hay que escribir el código INLINE JAVA en el módulo CallBack."))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 3054;BA.debugLine="sbInfo.Append(\"6) Hay que tener en cuenta , para";
Debug.JustUpdateDeviceLine();
_sbinfo.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("6) Hay que tener en cuenta , para todos los métodos que busquen datos a partir del jamTableView, que la tabla SQLinterna (tblOrigenDatos),se construye con los ALIAS de los campos."))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 3056;BA.debugLine="sbInfo.Append(\"\")";
Debug.JustUpdateDeviceLine();
_sbinfo.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 3058;BA.debugLine="DlgInfo.Text=sbInfo.ToString";
Debug.JustUpdateDeviceLine();
_dlginfo.setField ("_text" /*RemoteObject*/ ,(_sbinfo.runMethod(true,"ToString")));
 BA.debugLineNum = 3059;BA.debugLine="Dim rs As ResumableSub=Dialog.ShowTemplate(DlgInf";
Debug.JustUpdateDeviceLine();
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_dlginfo)),(Object)(RemoteObject.createImmutable(("Ok"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable(""))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 3061;BA.debugLine="Dialog.Base.SetLayoutAnimated(0,0.1*Dialog.mParen";
Debug.JustUpdateDeviceLine();
parent._dialog.getField(false,"_base" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.1),parent._dialog.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(0.8)}, "**",0, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.1),parent._dialog.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(0.8)}, "**",0, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {parent._dialog.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(0.8)}, "*",0, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {parent._dialog.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(0.8)}, "*",0, 0)));
 BA.debugLineNum = 3063;BA.debugLine="Dialog.TitleBar.SetLayoutAnimated(0,0,0,Dialog.Ba";
Debug.JustUpdateDeviceLine();
parent._dialog.getField(false,"_titlebar" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(parent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(BA.numberCast(double.class, parent._dialog.getField(true,"_titlebarheight" /*RemoteObject*/ ))));
 BA.debugLineNum = 3064;BA.debugLine="Dim bOk As Button=Dialog.GetButton(xui.DialogResp";
Debug.JustUpdateDeviceLine();
_bok = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_bok = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(parent._xui.getField(true,"DialogResponse_Positive"))).getObject());Debug.locals.put("bOk", _bok);Debug.locals.put("bOk", _bok);
 BA.debugLineNum = 3065;BA.debugLine="bOk.Top=Dialog.Base.Height-Dialog.ButtonsHeight-5";
Debug.JustUpdateDeviceLine();
_bok.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {parent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),parent._dialog.getField(true,"_buttonsheight" /*RemoteObject*/ ),RemoteObject.createImmutable(5)}, "--",2, 0));
 BA.debugLineNum = 3067;BA.debugLine="Dim pT As Pane=Dialog.TitleBar";
Debug.JustUpdateDeviceLine();
_pt = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_pt = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), parent._dialog.getField(false,"_titlebar" /*RemoteObject*/ ).getObject());Debug.locals.put("pT", _pt);Debug.locals.put("pT", _pt);
 BA.debugLineNum = 3068;BA.debugLine="Dim lblT As Label=pT.GetNode(0)";
Debug.JustUpdateDeviceLine();
_lblt = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_lblt = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), _pt.runMethod(false,"GetNode",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lblT", _lblt);Debug.locals.put("lblT", _lblt);
 BA.debugLineNum = 3069;BA.debugLine="lblT.PrefWidth=lblT.Parent.PrefWidth";
Debug.JustUpdateDeviceLine();
_lblt.runMethod(true,"setPrefWidth",_lblt.runMethod(false,"getParent").runMethod(true,"getPrefWidth"));
 BA.debugLineNum = 3071;BA.debugLine="DlgInfo.mBase.SetLayoutAnimated(100,5,Dialog.Titl";
Debug.JustUpdateDeviceLine();
_dlginfo.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(double.class, 5)),(Object)(BA.numberCast(double.class, parent._dialog.getField(true,"_titlebarheight" /*RemoteObject*/ ))),(Object)(RemoteObject.solve(new RemoteObject[] {parent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(10)}, "-",1, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {parent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),parent._dialog.getField(true,"_titlebarheight" /*RemoteObject*/ ),parent._dialog.getField(true,"_buttonsheight" /*RemoteObject*/ )}, "--",2, 0)));
 BA.debugLineNum = 3073;BA.debugLine="Dim p As Pane=DlgInfo.CustomListView1.GetPanel(0)";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), _dlginfo.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 3074;BA.debugLine="Dim lbl As Label=p.GetNode(0)";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), _p.runMethod(false,"GetNode",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3075;BA.debugLine="lbl.Font=fx.DefaultFont(8)";
Debug.JustUpdateDeviceLine();
_lbl.runMethod(false,"setFont",parent._fx.runMethod(false,"DefaultFont",(Object)(BA.numberCast(double.class, 8))));
 BA.debugLineNum = 3076;BA.debugLine="lbl.TextColor=fx.Colors.From32Bit(0xFFFFFFFF)";
Debug.JustUpdateDeviceLine();
_lbl.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 3085;BA.debugLine="wait for (rs) complete (result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "help"), _rs);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 3086;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 3087;BA.debugLine="End Sub";
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
public static RemoteObject  _hextocolor(RemoteObject _hex) throws Exception{
try {
		Debug.PushSubsStack("HexToColor (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,435);
if (RapidSub.canDelegate("hextocolor")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","hextocolor", _hex);}
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
RemoteObject _ints = null;
Debug.locals.put("Hex", _hex);
 BA.debugLineNum = 435;BA.debugLine="Private Sub HexToColor(Hex As String) As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 436;BA.debugLine="Dim bc As ByteConverter";
Debug.JustUpdateDeviceLine();
_bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 437;BA.debugLine="If Hex.StartsWith(\"#\") Then";
Debug.JustUpdateDeviceLine();
if (_hex.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("#"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 438;BA.debugLine="Hex = Hex.SubString(1)";
Debug.JustUpdateDeviceLine();
_hex = _hex.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("Hex", _hex);
 }else 
{ BA.debugLineNum = 439;BA.debugLine="Else If Hex.StartsWith(\"0x\") Then";
Debug.JustUpdateDeviceLine();
if (_hex.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("0x"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 440;BA.debugLine="Hex = Hex.SubString(2)";
Debug.JustUpdateDeviceLine();
_hex = _hex.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("Hex", _hex);
 }}
;
 BA.debugLineNum = 442;BA.debugLine="If Hex.Length=6 Then Hex=\"FF\" & Hex";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_hex.runMethod(true,"length"),BA.numberCast(double.class, 6))) { 
_hex = RemoteObject.concat(RemoteObject.createImmutable("FF"),_hex);Debug.locals.put("Hex", _hex);};
 BA.debugLineNum = 443;BA.debugLine="Dim ints() As Int = bc.IntsFromBytes(bc.HexToByte";
Debug.JustUpdateDeviceLine();
_ints = _bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(_hex))));Debug.locals.put("ints", _ints);Debug.locals.put("ints", _ints);
 BA.debugLineNum = 444;BA.debugLine="Return ints(0)";
Debug.JustUpdateDeviceLine();
if (true) return _ints.getArrayElement(true,BA.numberCast(int.class, 0));
 BA.debugLineNum = 445;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _inicio(RemoteObject _rutaficherojsonjamtableview) throws Exception{
try {
		Debug.PushSubsStack("Inicio (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,258);
if (RapidSub.canDelegate("inicio")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","inicio", _rutaficherojsonjamtableview); return;}
ResumableSub_Inicio rsub = new ResumableSub_Inicio(null,_rutaficherojsonjamtableview);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Inicio extends BA.ResumableSub {
public ResumableSub_Inicio(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _rutaficherojsonjamtableview) {
this.parent = parent;
this._rutaficherojsonjamtableview = _rutaficherojsonjamtableview;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _rutaficherojsonjamtableview;
RemoteObject _rbool = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Inicio (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,258);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("RutaFicheroJSONjamTableView", _rutaficherojsonjamtableview);
 BA.debugLineNum = 259;BA.debugLine="If RutaFicheroJSONjamTableView=\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_rutaficherojsonjamtableview,BA.ObjectToString(""))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 262;BA.debugLine="mnuNew_Action";
Debug.JustUpdateDeviceLine();
_mnunew_action();
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 264;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.WAIT";
Debug.JustUpdateDeviceLine();
parent._frm.runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",parent._fx.getField(false,"Cursors").getField(false,"WAIT"));
 BA.debugLineNum = 265;BA.debugLine="DeshabilitarNodos";
Debug.JustUpdateDeviceLine();
_deshabilitarnodos();
 BA.debugLineNum = 266;BA.debugLine="wait for (LoadFile(RutaFicheroJSONjamTableView))";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "inicio"), _loadfile(_rutaficherojsonjamtableview));
this.state = 7;
return;
case 7:
//C
this.state = 6;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 267;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
Debug.JustUpdateDeviceLine();
parent._frm.runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",parent._fx.getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 268;BA.debugLine="HabilitarNodos";
Debug.JustUpdateDeviceLine();
_habilitarnodos();
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 270;BA.debugLine="End Sub";
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
public static RemoteObject  _itemvaluetomap(RemoteObject _clviv) throws Exception{
try {
		Debug.PushSubsStack("ItemValueToMap (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,340);
if (RapidSub.canDelegate("itemvaluetomap")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","itemvaluetomap", _clviv);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 340;BA.debugLine="private Sub ItemValueToMap (clvIV As clvCamposBuil";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 341;BA.debugLine="Dim m As Map";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 342;BA.debugLine="m.Initialize";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 343;BA.debugLine="m.put(\"ID\",clvIV.txtID.Text)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ID"))),(Object)((_clviv.getField(false,"txtID" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 344;BA.debugLine="m.Put(\"Campo\",clvIV.cboCampo.Value)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Campo"))),(Object)(_clviv.getField(false,"cboCampo" /*RemoteObject*/ ).runMethod(false,"getValue")));
 BA.debugLineNum = 345;BA.debugLine="m.Put(\"AliasCampo\",clvIV.txtAliasCampo.text)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("AliasCampo"))),(Object)((_clviv.getField(false,"txtAliasCampo" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 346;BA.debugLine="m.Put(\"EncabezadoColumna\",clvIV.txtEncabezadoColu";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("EncabezadoColumna"))),(Object)((_clviv.getField(false,"txtEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 347;BA.debugLine="m.Put(\"AnchoColumna\",clvIV.B4XPlusMinusAncho.Sele";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("AnchoColumna"))),(Object)(_clviv.getField(false,"B4XPlusMinusAncho" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xplusminus.class, "_getselectedvalue" /*RemoteObject*/ )));
 BA.debugLineNum = 348;BA.debugLine="m.Put(\"KeyID\",clvIV.lblOrdenKeyID.Text)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("KeyID"))),(Object)((_clviv.getField(false,"lblOrdenKeyID" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 349;BA.debugLine="m.Put(\"TipoControlFiltro\",clvIV.cboTipoControlFil";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TipoControlFiltro"))),(Object)(_clviv.getField(false,"cboTipoControlFiltro" /*RemoteObject*/ ).runMethod(false,"getValue")));
 BA.debugLineNum = 350;BA.debugLine="m.Put(\"NombreCampoDialogosAux\",clvIV.txtNombreCam";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("NombreCampoDialogosAux"))),(Object)((_clviv.getField(false,"txtNombreCampoDialogosAux" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 352;BA.debugLine="m.Put(\"TipoDato\",clvIV.cboTipoDato.Value)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TipoDato"))),(Object)(_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getValue")));
 BA.debugLineNum = 353;BA.debugLine="m.Put(\"EsFecha\",clvIV.chkBoxEsFecha.Checked)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("EsFecha"))),(Object)((_clviv.getField(false,"chkBoxEsFecha" /*RemoteObject*/ ).runMethod(true,"getChecked"))));
 BA.debugLineNum = 354;BA.debugLine="m.Put(\"EsBooleano\",clvIV.chkBoxEsBooleano.Checked";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("EsBooleano"))),(Object)((_clviv.getField(false,"chkBoxEsBooleano" /*RemoteObject*/ ).runMethod(true,"getChecked"))));
 BA.debugLineNum = 355;BA.debugLine="m.Put(\"ValorTrueCampoBooleano\",clvIV.txtValorTrue";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ValorTrueCampoBooleano"))),(Object)((_clviv.getField(false,"txtValorTrueCampoBooleano" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 356;BA.debugLine="m.Put(\"ColumnaTableView\",clvIV.chkColumnaTableVie";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ColumnaTableView"))),(Object)((_clviv.getField(false,"chkColumnaTableView" /*RemoteObject*/ ).runMethod(true,"getChecked"))));
 BA.debugLineNum = 357;BA.debugLine="m.Put(\"ColumnaOcultable\",clvIV.chkColumnaOcultabl";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ColumnaOcultable"))),(Object)((_clviv.getField(false,"chkColumnaOcultable" /*RemoteObject*/ ).runMethod(true,"getChecked"))));
 BA.debugLineNum = 358;BA.debugLine="m.Put(\"CampoCalculado\",clvIV.chkBoxCampoCalculado";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("CampoCalculado"))),(Object)((_clviv.getField(false,"chkBoxCampoCalculado" /*RemoteObject*/ ).runMethod(true,"getChecked"))));
 BA.debugLineNum = 359;BA.debugLine="m.put(\"OrdenColumna\",clvIV.txtOrdenColumna.Text)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("OrdenColumna"))),(Object)((_clviv.getField(false,"txtOrdenColumna" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 360;BA.debugLine="m.put(\"AlineacionColumna\",clvIV.cboAlineacionColu";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("AlineacionColumna"))),(Object)(_clviv.getField(false,"cboAlineacionColumna" /*RemoteObject*/ ).runMethod(false,"getValue")));
 BA.debugLineNum = 361;BA.debugLine="m.put(\"NoNulo\",clvIV.chkNoNulo.Checked)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("NoNulo"))),(Object)((_clviv.getField(false,"chkNoNulo" /*RemoteObject*/ ).runMethod(true,"getChecked"))));
 BA.debugLineNum = 362;BA.debugLine="m.put(\"ConValorDefecto\",clvIV.chkBoxConValorDefec";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ConValorDefecto"))),(Object)((_clviv.getField(false,"chkBoxConValorDefecto" /*RemoteObject*/ ).runMethod(true,"getChecked"))));
 BA.debugLineNum = 363;BA.debugLine="m.put(\"ValorDefecto\",clvIV.txtValorDefecto.text)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ValorDefecto"))),(Object)((_clviv.getField(false,"txtValorDefecto" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 370;BA.debugLine="m.put(\"ColorTexto\",clvIV.txtRGBColorTexto.Text)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ColorTexto"))),(Object)((_clviv.getField(false,"txtRGBColorTexto" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 371;BA.debugLine="m.put(\"ColorFondo\",clvIV.txtRGBColorFondo.Text)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ColorFondo"))),(Object)((_clviv.getField(false,"txtRGBColorFondo" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 372;BA.debugLine="m.put(\"ColorBorde\",clvIV.txtRGBColorBorde.Text)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ColorBorde"))),(Object)((_clviv.getField(false,"txtRGBColorBorde" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 373;BA.debugLine="m.put(\"ColorBordeCeldaSeleccionada\",clvIV.txtRGBC";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ColorBordeCeldaSeleccionada"))),(Object)((_clviv.getField(false,"txtRGBColorBorde" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 374;BA.debugLine="m.Put(\"AnchoBorde\",clvIV.B4XPlusMinusAnchoBorde.S";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("AnchoBorde"))),(Object)(_clviv.getField(false,"B4XPlusMinusAnchoBorde" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xplusminus.class, "_getselectedvalue" /*RemoteObject*/ )));
 BA.debugLineNum = 375;BA.debugLine="m.Put(\"TipoControlEdicion\",clvIV.cboTipoControlEd";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TipoControlEdicion"))),(Object)(_clviv.getField(false,"cboTipoControlEdicion" /*RemoteObject*/ ).runMethod(false,"getValue")));
 BA.debugLineNum = 377;BA.debugLine="m.Put(\"ColorTextoEncabezadoColumna\",clvIV.txtRGBC";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ColorTextoEncabezadoColumna"))),(Object)((_clviv.getField(false,"txtRGBColorTextoEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 378;BA.debugLine="m.Put(\"ColorFondoEncabezadoColumna\",clvIV.txtRGBC";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ColorFondoEncabezadoColumna"))),(Object)((_clviv.getField(false,"txtRGBColorFondoEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 379;BA.debugLine="Return m";
Debug.JustUpdateDeviceLine();
if (true) return _m;
 BA.debugLineNum = 380;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _lblcolorborde_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblColorBorde_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3610);
if (RapidSub.canDelegate("lblcolorborde_mouseclicked")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","lblcolorborde_mouseclicked", _eventdata); return;}
ResumableSub_lblColorBorde_MouseClicked rsub = new ResumableSub_lblColorBorde_MouseClicked(null,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblColorBorde_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorBorde_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _fvidx = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblColorBorde_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3610);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3621;BA.debugLine="Dim FVidx As Int=clvListaCampos.FirstVisibleIndex";
Debug.JustUpdateDeviceLine();
_fvidx = parent._clvlistacampos.runMethod(true,"_getfirstvisibleindex");Debug.locals.put("FVidx", _fvidx);Debug.locals.put("FVidx", _fvidx);
 BA.debugLineNum = 3623;BA.debugLine="Dim lbl As Label=Sender";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), parent.__c.runMethod(false,"Sender",jamtableviewcamposbuilder.ba));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3624;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(l";
Debug.JustUpdateDeviceLine();
_index = parent._clvlistacampos.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject()));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 3625;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 3627;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"desde versio";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("desde version 6.44, el color del borde es sólo para el formato de celda SELECCIONADA.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3628;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblcolorborde_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3651;BA.debugLine="Dialog.Title=\"Selecciona color Borde Celda SELECC";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona color Borde Celda SELECCIONADA")));
 BA.debugLineNum = 3652;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = parent._xui.runMethod(false,"CreatePanel",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 3653;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))));
 BA.debugLineNum = 3654;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrBCColorPickerJamTableView")),jamtableviewcamposbuilder.ba);
 BA.debugLineNum = 3655;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",jamtableviewcamposbuilder.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblcolorborde_mouseclicked"),BA.numberCast(int.class, 0));
this.state = 8;
return;
case 8:
//C
this.state = 1;
;
 BA.debugLineNum = 3657;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 3658;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 3659;BA.debugLine="BCColorPickerjamTableView.SelectedColor=clvIV.lbl";
Debug.JustUpdateDeviceLine();
parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_setselectedcolor" /*RemoteObject*/ ,_clviv.getField(false,"lblColorBorde" /*RemoteObject*/ ).runMethod(true,"getColor"));
 BA.debugLineNum = 3660;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(parent._xui.getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 3661;BA.debugLine="bCancel.left=bCancel.left-20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 3662;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 3663;BA.debugLine="bCancel.Textsize=16";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 3664;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblcolorborde_mouseclicked"), _rsub);
this.state = 9;
return;
case 9:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3665;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 3666;BA.debugLine="clvIV.lblColorBorde.Color=BCColorPickerjamTableVi";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorBorde" /*RemoteObject*/ ).runMethod(true,"setColor",parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_getselectedcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 3667;BA.debugLine="clvIV.txtRGBColorBorde.Text=GetCssColorStringFrom";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorBorde" /*RemoteObject*/ ).runMethod(true,"setText",_getcsscolorstringfromintcolor(_clviv.getField(false,"lblColorBorde" /*RemoteObject*/ ).runMethod(true,"getColor")));
 BA.debugLineNum = 3669;BA.debugLine="clvListaCampos.ScrollToItem(FVidx)";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.runVoidMethod ("_scrolltoitem",(Object)(_fvidx));
 BA.debugLineNum = 3670;BA.debugLine="End Sub";
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
public static void  _lblcolorfondo_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblColorFondo_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3672);
if (RapidSub.canDelegate("lblcolorfondo_mouseclicked")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","lblcolorfondo_mouseclicked", _eventdata); return;}
ResumableSub_lblColorFondo_MouseClicked rsub = new ResumableSub_lblColorFondo_MouseClicked(null,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblColorFondo_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorFondo_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _fvidx = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblColorFondo_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3672);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3678;BA.debugLine="Dim FVidx As Int=clvListaCampos.FirstVisibleIndex";
Debug.JustUpdateDeviceLine();
_fvidx = parent._clvlistacampos.runMethod(true,"_getfirstvisibleindex");Debug.locals.put("FVidx", _fvidx);Debug.locals.put("FVidx", _fvidx);
 BA.debugLineNum = 3680;BA.debugLine="Dim lbl As Label=Sender";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), parent.__c.runMethod(false,"Sender",jamtableviewcamposbuilder.ba));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3681;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(l";
Debug.JustUpdateDeviceLine();
_index = parent._clvlistacampos.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject()));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 3682;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 3704;BA.debugLine="Dialog.Title=\"Selecciona color Fondo Celdas Colum";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona color Fondo Celdas Columna")));
 BA.debugLineNum = 3705;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = parent._xui.runMethod(false,"CreatePanel",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 3706;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))));
 BA.debugLineNum = 3707;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrBCColorPickerJamTableView")),jamtableviewcamposbuilder.ba);
 BA.debugLineNum = 3708;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",jamtableviewcamposbuilder.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblcolorfondo_mouseclicked"),BA.numberCast(int.class, 0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 3710;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 3711;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 3712;BA.debugLine="BCColorPickerjamTableView.SelectedColor=clvIV.lbl";
Debug.JustUpdateDeviceLine();
parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_setselectedcolor" /*RemoteObject*/ ,_clviv.getField(false,"lblColorFondo" /*RemoteObject*/ ).runMethod(true,"getColor"));
 BA.debugLineNum = 3713;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(parent._xui.getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 3714;BA.debugLine="bCancel.left=bCancel.left-20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 3715;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 3716;BA.debugLine="bCancel.Textsize=16";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 3717;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblcolorfondo_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3718;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 3719;BA.debugLine="clvIV.lblColorFondo.Color=BCColorPickerjamTableVi";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorFondo" /*RemoteObject*/ ).runMethod(true,"setColor",parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_getselectedcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 3720;BA.debugLine="clvIV.txtRGBColorfondo.Text=GetCssColorStringFrom";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorFondo" /*RemoteObject*/ ).runMethod(true,"setText",_getcsscolorstringfromintcolor(_clviv.getField(false,"lblColorFondo" /*RemoteObject*/ ).runMethod(true,"getColor")));
 BA.debugLineNum = 3721;BA.debugLine="clvListaCampos.ScrollToItem(FVidx)";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.runVoidMethod ("_scrolltoitem",(Object)(_fvidx));
 BA.debugLineNum = 3722;BA.debugLine="End Sub";
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
public static void  _lblcolorfondoencabezadocolumna_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblColorFondoEncabezadoColumna_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3975);
if (RapidSub.canDelegate("lblcolorfondoencabezadocolumna_mouseclicked")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","lblcolorfondoencabezadocolumna_mouseclicked", _eventdata); return;}
ResumableSub_lblColorFondoEncabezadoColumna_MouseClicked rsub = new ResumableSub_lblColorFondoEncabezadoColumna_MouseClicked(null,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblColorFondoEncabezadoColumna_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorFondoEncabezadoColumna_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _fvidx = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblColorFondoEncabezadoColumna_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3975);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3976;BA.debugLine="Dim FVidx As Int=clvListaCampos.FirstVisibleIndex";
Debug.JustUpdateDeviceLine();
_fvidx = parent._clvlistacampos.runMethod(true,"_getfirstvisibleindex");Debug.locals.put("FVidx", _fvidx);Debug.locals.put("FVidx", _fvidx);
 BA.debugLineNum = 3977;BA.debugLine="Dim lbl As B4XView=Sender";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.__c.runMethod(false,"Sender",jamtableviewcamposbuilder.ba));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3978;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(l";
Debug.JustUpdateDeviceLine();
_index = parent._clvlistacampos.runMethod(true,"_getitemfromview",(Object)(_lbl));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 3979;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 3981;BA.debugLine="Dialog.Title=\"Selecciona color Fondo Encabezado C";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona color Fondo Encabezado Columna")));
 BA.debugLineNum = 3982;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = parent._xui.runMethod(false,"CreatePanel",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 3983;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))));
 BA.debugLineNum = 3984;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrBCColorPickerJamTableView")),jamtableviewcamposbuilder.ba);
 BA.debugLineNum = 3985;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",jamtableviewcamposbuilder.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblcolorfondoencabezadocolumna_mouseclicked"),BA.numberCast(int.class, 0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 3987;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 3988;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 3989;BA.debugLine="BCColorPickerjamTableView.SelectedColor=clvIV.lbl";
Debug.JustUpdateDeviceLine();
parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_setselectedcolor" /*RemoteObject*/ ,_clviv.getField(false,"lblColorFondoEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"getColor"));
 BA.debugLineNum = 3990;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(parent._xui.getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 3991;BA.debugLine="bCancel.left=bCancel.left-20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 3992;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 3993;BA.debugLine="bCancel.Textsize=16";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 3994;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblcolorfondoencabezadocolumna_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3995;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 3996;BA.debugLine="clvIV.lblColorFondoEncabezadocolumna.Color=BCColo";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorFondoEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"setColor",parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_getselectedcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 3997;BA.debugLine="clvIV.txtRGBColorFondoEncabezadocolumna.Text=GetC";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorFondoEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"setText",_getcsscolorstringfromintcolor(_clviv.getField(false,"lblColorFondoEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"getColor")));
 BA.debugLineNum = 3998;BA.debugLine="clvListaCampos.ScrollToItem(FVidx)";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.runVoidMethod ("_scrolltoitem",(Object)(_fvidx));
 BA.debugLineNum = 3999;BA.debugLine="End Sub";
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
public static void  _lblcolorfondoencabezados_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblColorFondoEncabezados_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3453);
if (RapidSub.canDelegate("lblcolorfondoencabezados_mouseclicked")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","lblcolorfondoencabezados_mouseclicked", _eventdata); return;}
ResumableSub_lblColorFondoEncabezados_MouseClicked rsub = new ResumableSub_lblColorFondoEncabezados_MouseClicked(null,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblColorFondoEncabezados_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorFondoEncabezados_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
int _idx = 0;
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
int step21;
int limit21;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblColorFondoEncabezados_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3453);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3454;BA.debugLine="Dialog.Title=\"Selecciona color Fondo Encabezados\"";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona color Fondo Encabezados")));
 BA.debugLineNum = 3455;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = parent._xui.runMethod(false,"CreatePanel",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 3456;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))));
 BA.debugLineNum = 3457;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrBCColorPickerJamTableView")),jamtableviewcamposbuilder.ba);
 BA.debugLineNum = 3458;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",jamtableviewcamposbuilder.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblcolorfondoencabezados_mouseclicked"),BA.numberCast(int.class, 0));
this.state = 21;
return;
case 21:
//C
this.state = 1;
;
 BA.debugLineNum = 3460;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 3461;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 3462;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorF";
Debug.JustUpdateDeviceLine();
parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_setselectedcolor" /*RemoteObject*/ ,parent._lblcolorfondoencabezados.runMethod(true,"getColor"));
 BA.debugLineNum = 3463;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(parent._xui.getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 3464;BA.debugLine="bCancel.left=bCancel.left-20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 3465;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 3466;BA.debugLine="bCancel.Textsize=16";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 3467;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblcolorfondoencabezados_mouseclicked"), _rsub);
this.state = 22;
return;
case 22:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3468;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 3469;BA.debugLine="lblColorFondoEncabezados.Color=BCColorPickerjamTa";
Debug.JustUpdateDeviceLine();
parent._lblcolorfondoencabezados.runMethod(true,"setColor",parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_getselectedcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 3470;BA.debugLine="txtRGBColorFondoEncabezados.Text=GetCssColorStrin";
Debug.JustUpdateDeviceLine();
parent._txtrgbcolorfondoencabezados.runMethod(true,"setText",_getcsscolorstringfromintcolor(parent._lblcolorfondoencabezados.runMethod(true,"getColor")));
 BA.debugLineNum = 3471;BA.debugLine="If clvListaCampos.Size>0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 20;
if (RemoteObject.solveBoolean(">",parent._clvlistacampos.runMethod(true,"_getsize"),BA.numberCast(double.class, 0))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 3472;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Actualiza";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"Msgbox2Async",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("¿Actualizar el color fondo encabezados para todos los campos?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3473;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblcolorfondoencabezados_mouseclicked"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 10;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 3474;BA.debugLine="If rInt <> xui.DialogResponse_Positive Then Retu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) return ;
if (true) break;

case 15:
//C
this.state = 16;
;
 BA.debugLineNum = 3475;BA.debugLine="For iDx=0 To clvListaCampos.Size-1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 16:
//for
this.state = 19;
step21 = 1;
limit21 = RemoteObject.solve(new RemoteObject[] {parent._clvlistacampos.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_idx = 0 ;
Debug.locals.put("iDx", _idx);
this.state = 24;
if (true) break;

case 24:
//C
this.state = 19;
if ((step21 > 0 && _idx <= limit21) || (step21 < 0 && _idx >= limit21)) this.state = 18;
if (true) break;

case 25:
//C
this.state = 24;
_idx = ((int)(0 + _idx + step21)) ;
Debug.locals.put("iDx", _idx);
if (true) break;

case 18:
//C
this.state = 25;
 BA.debugLineNum = 3476;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvLista";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _idx))));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 3477;BA.debugLine="clvIV.lblColorFondoEncabezadocolumna.Color=BCCo";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorFondoEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"setColor",parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_getselectedcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 3478;BA.debugLine="clvIV.txtRGBColorFondoEncabezadocolumna.Text=Ge";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorFondoEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"setText",_getcsscolorstringfromintcolor(parent._lblcolorfondoencabezados.runMethod(true,"getColor")));
 if (true) break;
if (true) break;

case 19:
//C
this.state = 20;
Debug.locals.put("iDx", _idx);
;
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 3481;BA.debugLine="End Sub";
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
public static void  _lblcolorfondofilasimpares_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblColorFondoFilasImpares_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3566);
if (RapidSub.canDelegate("lblcolorfondofilasimpares_mouseclicked")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","lblcolorfondofilasimpares_mouseclicked", _eventdata); return;}
ResumableSub_lblColorFondoFilasImpares_MouseClicked rsub = new ResumableSub_lblColorFondoFilasImpares_MouseClicked(null,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblColorFondoFilasImpares_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorFondoFilasImpares_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblColorFondoFilasImpares_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3566);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3567;BA.debugLine="Dialog.Title=\"Selecciona color Fondo Filas Impare";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona color Fondo Filas Impares")));
 BA.debugLineNum = 3568;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = parent._xui.runMethod(false,"CreatePanel",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 3569;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))));
 BA.debugLineNum = 3570;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrBCColorPickerJamTableView")),jamtableviewcamposbuilder.ba);
 BA.debugLineNum = 3571;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",jamtableviewcamposbuilder.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblcolorfondofilasimpares_mouseclicked"),BA.numberCast(int.class, 0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 3573;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 3574;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 3575;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorF";
Debug.JustUpdateDeviceLine();
parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_setselectedcolor" /*RemoteObject*/ ,parent._lblcolorfondofilasimpares.runMethod(true,"getColor"));
 BA.debugLineNum = 3576;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(parent._xui.getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 3577;BA.debugLine="bCancel.left=bCancel.left-20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 3578;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 3579;BA.debugLine="bCancel.Textsize=16";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 3580;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblcolorfondofilasimpares_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3581;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 3582;BA.debugLine="lblColorFondoFilasImpares.Color=BCColorPickerjamT";
Debug.JustUpdateDeviceLine();
parent._lblcolorfondofilasimpares.runMethod(true,"setColor",parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_getselectedcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 3583;BA.debugLine="txtRGBColorFondoFilasImpares.Text=GetCssColorStri";
Debug.JustUpdateDeviceLine();
parent._txtrgbcolorfondofilasimpares.runMethod(true,"setText",_getcsscolorstringfromintcolor(parent._lblcolorfondofilasimpares.runMethod(true,"getColor")));
 BA.debugLineNum = 3584;BA.debugLine="End Sub";
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
public static void  _lblcolorfondofilaspares_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblColorFondoFilasPares_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3586);
if (RapidSub.canDelegate("lblcolorfondofilaspares_mouseclicked")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","lblcolorfondofilaspares_mouseclicked", _eventdata); return;}
ResumableSub_lblColorFondoFilasPares_MouseClicked rsub = new ResumableSub_lblColorFondoFilasPares_MouseClicked(null,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblColorFondoFilasPares_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorFondoFilasPares_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblColorFondoFilasPares_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3586);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3587;BA.debugLine="Dialog.Title=\"Selecciona color Fondo Filas Impare";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona color Fondo Filas Impares")));
 BA.debugLineNum = 3588;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = parent._xui.runMethod(false,"CreatePanel",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 3589;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))));
 BA.debugLineNum = 3590;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrBCColorPickerJamTableView")),jamtableviewcamposbuilder.ba);
 BA.debugLineNum = 3591;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",jamtableviewcamposbuilder.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblcolorfondofilaspares_mouseclicked"),BA.numberCast(int.class, 0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 3593;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 3594;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 3595;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorF";
Debug.JustUpdateDeviceLine();
parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_setselectedcolor" /*RemoteObject*/ ,parent._lblcolorfondofilaspares.runMethod(true,"getColor"));
 BA.debugLineNum = 3596;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(parent._xui.getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 3597;BA.debugLine="bCancel.left=bCancel.left-20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 3598;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 3599;BA.debugLine="bCancel.Textsize=16";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 3600;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblcolorfondofilaspares_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3601;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 3602;BA.debugLine="lblColorFondoFilasPares.Color=BCColorPickerjamTab";
Debug.JustUpdateDeviceLine();
parent._lblcolorfondofilaspares.runMethod(true,"setColor",parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_getselectedcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 3603;BA.debugLine="txtRGBColorFondoFilasPares.Text=GetCssColorString";
Debug.JustUpdateDeviceLine();
parent._txtrgbcolorfondofilaspares.runMethod(true,"setText",_getcsscolorstringfromintcolor(parent._lblcolorfondofilaspares.runMethod(true,"getColor")));
 BA.debugLineNum = 3604;BA.debugLine="End Sub";
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
public static void  _lblcolorfondopanelinfo_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblColorFondoPanelInfo_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3546);
if (RapidSub.canDelegate("lblcolorfondopanelinfo_mouseclicked")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","lblcolorfondopanelinfo_mouseclicked", _eventdata); return;}
ResumableSub_lblColorFondoPanelInfo_MouseClicked rsub = new ResumableSub_lblColorFondoPanelInfo_MouseClicked(null,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblColorFondoPanelInfo_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorFondoPanelInfo_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblColorFondoPanelInfo_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3546);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3547;BA.debugLine="Dialog.Title=\"Selecciona color Fondo Panel Info\"";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona color Fondo Panel Info")));
 BA.debugLineNum = 3548;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = parent._xui.runMethod(false,"CreatePanel",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 3549;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))));
 BA.debugLineNum = 3550;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrBCColorPickerJamTableView")),jamtableviewcamposbuilder.ba);
 BA.debugLineNum = 3551;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",jamtableviewcamposbuilder.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblcolorfondopanelinfo_mouseclicked"),BA.numberCast(int.class, 0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 3553;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 3554;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 3555;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorF";
Debug.JustUpdateDeviceLine();
parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_setselectedcolor" /*RemoteObject*/ ,parent._lblcolorfondopanelinfo.runMethod(true,"getColor"));
 BA.debugLineNum = 3556;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(parent._xui.getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 3557;BA.debugLine="bCancel.left=bCancel.left-20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 3558;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 3559;BA.debugLine="bCancel.Textsize=16";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 3560;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblcolorfondopanelinfo_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3561;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 3562;BA.debugLine="lblColorFondoPanelInfo.Color=BCColorPickerjamTabl";
Debug.JustUpdateDeviceLine();
parent._lblcolorfondopanelinfo.runMethod(true,"setColor",parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_getselectedcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 3563;BA.debugLine="txtRGBColorFondoPanelInfo.Text=GetCssColorStringF";
Debug.JustUpdateDeviceLine();
parent._txtrgbcolorfondopanelinfo.runMethod(true,"setText",_getcsscolorstringfromintcolor(parent._lblcolorfondopanelinfo.runMethod(true,"getColor")));
 BA.debugLineNum = 3564;BA.debugLine="End Sub";
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
public static void  _lblcolortexto_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblColorTexto_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3724);
if (RapidSub.canDelegate("lblcolortexto_mouseclicked")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","lblcolortexto_mouseclicked", _eventdata); return;}
ResumableSub_lblColorTexto_MouseClicked rsub = new ResumableSub_lblColorTexto_MouseClicked(null,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblColorTexto_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorTexto_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _fvidx = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblColorTexto_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3724);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3726;BA.debugLine="Dim FVidx As Int=clvListaCampos.FirstVisibleIndex";
Debug.JustUpdateDeviceLine();
_fvidx = parent._clvlistacampos.runMethod(true,"_getfirstvisibleindex");Debug.locals.put("FVidx", _fvidx);Debug.locals.put("FVidx", _fvidx);
 BA.debugLineNum = 3727;BA.debugLine="Dim lbl As Label=Sender";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), parent.__c.runMethod(false,"Sender",jamtableviewcamposbuilder.ba));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3728;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(l";
Debug.JustUpdateDeviceLine();
_index = parent._clvlistacampos.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject()));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 3729;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 3752;BA.debugLine="Dialog.Title=\"Selecciona color Texto Celdas Colum";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona color Texto Celdas Columna")));
 BA.debugLineNum = 3753;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = parent._xui.runMethod(false,"CreatePanel",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 3754;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))));
 BA.debugLineNum = 3755;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrBCColorPickerJamTableView")),jamtableviewcamposbuilder.ba);
 BA.debugLineNum = 3756;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",jamtableviewcamposbuilder.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblcolortexto_mouseclicked"),BA.numberCast(int.class, 0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 3758;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 3759;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 3760;BA.debugLine="BCColorPickerjamTableView.SelectedColor=clvIV.lbl";
Debug.JustUpdateDeviceLine();
parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_setselectedcolor" /*RemoteObject*/ ,_clviv.getField(false,"lblColorTexto" /*RemoteObject*/ ).runMethod(true,"getColor"));
 BA.debugLineNum = 3761;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(parent._xui.getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 3762;BA.debugLine="bCancel.left=bCancel.left-20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 3763;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 3764;BA.debugLine="bCancel.Textsize=16";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 3765;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblcolortexto_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3766;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 3767;BA.debugLine="clvIV.lblColorTexto.Color=BCColorPickerjamTableVi";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorTexto" /*RemoteObject*/ ).runMethod(true,"setColor",parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_getselectedcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 3768;BA.debugLine="clvIV.txtRGBColorTexto.Text=GetCssColorStringFrom";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorTexto" /*RemoteObject*/ ).runMethod(true,"setText",_getcsscolorstringfromintcolor(_clviv.getField(false,"lblColorTexto" /*RemoteObject*/ ).runMethod(true,"getColor")));
 BA.debugLineNum = 3769;BA.debugLine="clvListaCampos.ScrollToItem(FVidx)";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.runVoidMethod ("_scrolltoitem",(Object)(_fvidx));
 BA.debugLineNum = 3770;BA.debugLine="End Sub";
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
public static void  _lblcolortextoencabezadocolumna_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblColorTextoEncabezadoColumna_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3934);
if (RapidSub.canDelegate("lblcolortextoencabezadocolumna_mouseclicked")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","lblcolortextoencabezadocolumna_mouseclicked", _eventdata); return;}
ResumableSub_lblColorTextoEncabezadoColumna_MouseClicked rsub = new ResumableSub_lblColorTextoEncabezadoColumna_MouseClicked(null,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblColorTextoEncabezadoColumna_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorTextoEncabezadoColumna_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _fvidx = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblColorTextoEncabezadoColumna_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3934);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3935;BA.debugLine="Dim FVidx As Int=clvListaCampos.FirstVisibleIndex";
Debug.JustUpdateDeviceLine();
_fvidx = parent._clvlistacampos.runMethod(true,"_getfirstvisibleindex");Debug.locals.put("FVidx", _fvidx);Debug.locals.put("FVidx", _fvidx);
 BA.debugLineNum = 3936;BA.debugLine="Dim lbl As B4XView=Sender";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.__c.runMethod(false,"Sender",jamtableviewcamposbuilder.ba));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3937;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(l";
Debug.JustUpdateDeviceLine();
_index = parent._clvlistacampos.runMethod(true,"_getitemfromview",(Object)(_lbl));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 3938;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 3940;BA.debugLine="Dialog.Title=\"Selecciona color Texto Encabezado C";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona color Texto Encabezado Columna")));
 BA.debugLineNum = 3941;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = parent._xui.runMethod(false,"CreatePanel",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 3942;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))));
 BA.debugLineNum = 3943;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrBCColorPickerJamTableView")),jamtableviewcamposbuilder.ba);
 BA.debugLineNum = 3944;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",jamtableviewcamposbuilder.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblcolortextoencabezadocolumna_mouseclicked"),BA.numberCast(int.class, 0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 3946;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 3947;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 3948;BA.debugLine="BCColorPickerjamTableView.SelectedColor=clvIV.lbl";
Debug.JustUpdateDeviceLine();
parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_setselectedcolor" /*RemoteObject*/ ,_clviv.getField(false,"lblColorTextoEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"getColor"));
 BA.debugLineNum = 3949;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(parent._xui.getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 3950;BA.debugLine="bCancel.left=bCancel.left-20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 3951;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 3952;BA.debugLine="bCancel.Textsize=16";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 3953;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblcolortextoencabezadocolumna_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3954;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 3955;BA.debugLine="clvIV.lblColorTextoEncabezadocolumna.Color=BCColo";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorTextoEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"setColor",parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_getselectedcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 3956;BA.debugLine="clvIV.txtRGBColorTextoEncabezadocolumna.Text=GetC";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorTextoEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"setText",_getcsscolorstringfromintcolor(_clviv.getField(false,"lblColorTextoEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"getColor")));
 BA.debugLineNum = 3957;BA.debugLine="clvListaCampos.ScrollToItem(FVidx)";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.runVoidMethod ("_scrolltoitem",(Object)(_fvidx));
 BA.debugLineNum = 3958;BA.debugLine="End Sub";
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
public static void  _lblcolortextoencabezados_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblColorTextoEncabezados_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3402);
if (RapidSub.canDelegate("lblcolortextoencabezados_mouseclicked")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","lblcolortextoencabezados_mouseclicked", _eventdata); return;}
ResumableSub_lblColorTextoEncabezados_MouseClicked rsub = new ResumableSub_lblColorTextoEncabezados_MouseClicked(null,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblColorTextoEncabezados_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorTextoEncabezados_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
int _idx = 0;
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
int step21;
int limit21;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblColorTextoEncabezados_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3402);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3403;BA.debugLine="Dialog.Title=\"Selecciona color Texto Encabezados\"";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona color Texto Encabezados")));
 BA.debugLineNum = 3404;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = parent._xui.runMethod(false,"CreatePanel",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 3405;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))));
 BA.debugLineNum = 3406;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrBCColorPickerJamTableView")),jamtableviewcamposbuilder.ba);
 BA.debugLineNum = 3407;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",jamtableviewcamposbuilder.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblcolortextoencabezados_mouseclicked"),BA.numberCast(int.class, 0));
this.state = 21;
return;
case 21:
//C
this.state = 1;
;
 BA.debugLineNum = 3409;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 3410;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 3411;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorT";
Debug.JustUpdateDeviceLine();
parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_setselectedcolor" /*RemoteObject*/ ,parent._lblcolortextoencabezados.runMethod(true,"getColor"));
 BA.debugLineNum = 3412;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(parent._xui.getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 3413;BA.debugLine="bCancel.left=bCancel.left-20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 3414;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 3415;BA.debugLine="bCancel.Textsize=16";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 3416;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblcolortextoencabezados_mouseclicked"), _rsub);
this.state = 22;
return;
case 22:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3417;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 3418;BA.debugLine="lblColorTextoEncabezados.Color=BCColorPickerjamTa";
Debug.JustUpdateDeviceLine();
parent._lblcolortextoencabezados.runMethod(true,"setColor",parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_getselectedcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 3419;BA.debugLine="txtRGBColorTextoEncabezados.Text=GetCssColorStrin";
Debug.JustUpdateDeviceLine();
parent._txtrgbcolortextoencabezados.runMethod(true,"setText",_getcsscolorstringfromintcolor(parent._lblcolortextoencabezados.runMethod(true,"getColor")));
 BA.debugLineNum = 3420;BA.debugLine="If clvListaCampos.Size>0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 20;
if (RemoteObject.solveBoolean(">",parent._clvlistacampos.runMethod(true,"_getsize"),BA.numberCast(double.class, 0))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 3421;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Actualiza";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"Msgbox2Async",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("¿Actualizar el color texto encabezados para todos los campos?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3422;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblcolortextoencabezados_mouseclicked"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 10;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 3423;BA.debugLine="If rInt <> xui.DialogResponse_Positive Then Retu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) return ;
if (true) break;

case 15:
//C
this.state = 16;
;
 BA.debugLineNum = 3424;BA.debugLine="For iDx=0 To clvListaCampos.Size-1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 16:
//for
this.state = 19;
step21 = 1;
limit21 = RemoteObject.solve(new RemoteObject[] {parent._clvlistacampos.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_idx = 0 ;
Debug.locals.put("iDx", _idx);
this.state = 24;
if (true) break;

case 24:
//C
this.state = 19;
if ((step21 > 0 && _idx <= limit21) || (step21 < 0 && _idx >= limit21)) this.state = 18;
if (true) break;

case 25:
//C
this.state = 24;
_idx = ((int)(0 + _idx + step21)) ;
Debug.locals.put("iDx", _idx);
if (true) break;

case 18:
//C
this.state = 25;
 BA.debugLineNum = 3425;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvLista";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _idx))));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 3426;BA.debugLine="clvIV.lblColorTextoEncabezadocolumna.Color=BCCo";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorTextoEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"setColor",parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_getselectedcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 3427;BA.debugLine="clvIV.txtRGBColorTextoEncabezadocolumna.Text=Ge";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorTextoEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"setText",_getcsscolorstringfromintcolor(parent._lblcolortextoencabezados.runMethod(true,"getColor")));
 if (true) break;
if (true) break;

case 19:
//C
this.state = 20;
Debug.locals.put("iDx", _idx);
;
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 3430;BA.debugLine="End Sub";
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
public static void  _lblcolortextopanelinfo_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblColorTextoPanelInfo_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3505);
if (RapidSub.canDelegate("lblcolortextopanelinfo_mouseclicked")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","lblcolortextopanelinfo_mouseclicked", _eventdata); return;}
ResumableSub_lblColorTextoPanelInfo_MouseClicked rsub = new ResumableSub_lblColorTextoPanelInfo_MouseClicked(null,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblColorTextoPanelInfo_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorTextoPanelInfo_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblColorTextoPanelInfo_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3505);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3506;BA.debugLine="Dialog.Title=\"Selecciona color Texto Panel Info\"";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona color Texto Panel Info")));
 BA.debugLineNum = 3507;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = parent._xui.runMethod(false,"CreatePanel",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 3508;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))));
 BA.debugLineNum = 3509;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrBCColorPickerJamTableView")),jamtableviewcamposbuilder.ba);
 BA.debugLineNum = 3510;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",jamtableviewcamposbuilder.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblcolortextopanelinfo_mouseclicked"),BA.numberCast(int.class, 0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 3512;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 3513;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 3514;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorT";
Debug.JustUpdateDeviceLine();
parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_setselectedcolor" /*RemoteObject*/ ,parent._lblcolortextopanelinfo.runMethod(true,"getColor"));
 BA.debugLineNum = 3515;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(parent._xui.getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 3516;BA.debugLine="bCancel.left=bCancel.left-20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 3517;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 3518;BA.debugLine="bCancel.Textsize=16";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 3519;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblcolortextopanelinfo_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3520;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 3521;BA.debugLine="lblColorTextoPanelInfo.Color=BCColorPickerjamTabl";
Debug.JustUpdateDeviceLine();
parent._lblcolortextopanelinfo.runMethod(true,"setColor",parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_getselectedcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 3522;BA.debugLine="txtRGBColorTextoPanelInfo.Text=GetCssColorStringF";
Debug.JustUpdateDeviceLine();
parent._txtrgbcolortextopanelinfo.runMethod(true,"setText",_getcsscolorstringfromintcolor(parent._lblcolortextopanelinfo.runMethod(true,"getColor")));
 BA.debugLineNum = 3523;BA.debugLine="End Sub";
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
public static RemoteObject  _lblinfo_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblInfo_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2996);
if (RapidSub.canDelegate("lblinfo_mouseclicked")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","lblinfo_mouseclicked", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 2996;BA.debugLine="private Sub lblInfo_MouseClicked (EventData As Mou";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2998;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _lblresetcolorborde_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorBorde_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3882);
if (RapidSub.canDelegate("lblresetcolorborde_mouseclicked")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","lblresetcolorborde_mouseclicked", _eventdata); return;}
ResumableSub_lblResetColorBorde_MouseClicked rsub = new ResumableSub_lblResetColorBorde_MouseClicked(null,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblResetColorBorde_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorBorde_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _fvidx = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorBorde_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3882);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3883;BA.debugLine="Dim FVidx As Int=clvListaCampos.FirstVisibleIndex";
Debug.JustUpdateDeviceLine();
_fvidx = parent._clvlistacampos.runMethod(true,"_getfirstvisibleindex");Debug.locals.put("FVidx", _fvidx);Debug.locals.put("FVidx", _fvidx);
 BA.debugLineNum = 3884;BA.debugLine="Dim lbl As B4XView=Sender";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.__c.runMethod(false,"Sender",jamtableviewcamposbuilder.ba));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3885;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(l";
Debug.JustUpdateDeviceLine();
_index = parent._clvlistacampos.runMethod(true,"_getitemfromview",(Object)(_lbl));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 3886;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 3889;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"Msgbox2Async",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("¿Resetear el color del borde de las celda SELECCIONADA a su valor por defecto?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3890;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblresetcolorborde_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3891;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 3894;BA.debugLine="clvIV.txtRGBColorBorde.Text=\"#00BFFF\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorBorde" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("#00BFFF"));
 BA.debugLineNum = 3896;BA.debugLine="clvIV.lblColorBorde.Color=HexToColor(\"#00BFFF\")";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorBorde" /*RemoteObject*/ ).runMethod(true,"setColor",_hextocolor(RemoteObject.createImmutable("#00BFFF")));
 BA.debugLineNum = 3901;BA.debugLine="clvListaCampos.ScrollToItem(FVidx)";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.runVoidMethod ("_scrolltoitem",(Object)(_fvidx));
 BA.debugLineNum = 3903;BA.debugLine="End Sub";
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
public static void  _lblresetcolorfondo_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorFondo_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3905);
if (RapidSub.canDelegate("lblresetcolorfondo_mouseclicked")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","lblresetcolorfondo_mouseclicked", _eventdata); return;}
ResumableSub_lblResetColorFondo_MouseClicked rsub = new ResumableSub_lblResetColorFondo_MouseClicked(null,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblResetColorFondo_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorFondo_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _fvidx = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorFondo_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3905);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3906;BA.debugLine="Dim FVidx As Int=clvListaCampos.FirstVisibleIndex";
Debug.JustUpdateDeviceLine();
_fvidx = parent._clvlistacampos.runMethod(true,"_getfirstvisibleindex");Debug.locals.put("FVidx", _fvidx);Debug.locals.put("FVidx", _fvidx);
 BA.debugLineNum = 3907;BA.debugLine="Dim lbl As B4XView=Sender";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.__c.runMethod(false,"Sender",jamtableviewcamposbuilder.ba));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3908;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(l";
Debug.JustUpdateDeviceLine();
_index = parent._clvlistacampos.runMethod(true,"_getitemfromview",(Object)(_lbl));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 3909;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 3911;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"Msgbox2Async",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("¿Resetear el color de Fondo de las celdas de la columna a su valor por defecto?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3912;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblresetcolorfondo_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3913;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 3915;BA.debugLine="clvIV.txtRGBColorFondo.Text=\"transparent\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorFondo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("transparent"));
 BA.debugLineNum = 3916;BA.debugLine="clvIV.lblColorFondo.Color=0x00FFFFFF";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorFondo" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0x00ffffff)));
 BA.debugLineNum = 3917;BA.debugLine="clvListaCampos.ScrollToItem(FVidx)";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.runVoidMethod ("_scrolltoitem",(Object)(_fvidx));
 BA.debugLineNum = 3918;BA.debugLine="End Sub";
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
public static void  _lblresetcolorfondoencabezadocolumna_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorFondoEncabezadoColumna_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3960);
if (RapidSub.canDelegate("lblresetcolorfondoencabezadocolumna_mouseclicked")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","lblresetcolorfondoencabezadocolumna_mouseclicked", _eventdata); return;}
ResumableSub_lblResetColorFondoEncabezadoColumna_MouseClicked rsub = new ResumableSub_lblResetColorFondoEncabezadoColumna_MouseClicked(null,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblResetColorFondoEncabezadoColumna_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorFondoEncabezadoColumna_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _fvidx = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorFondoEncabezadoColumna_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3960);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3961;BA.debugLine="Dim FVidx As Int=clvListaCampos.FirstVisibleIndex";
Debug.JustUpdateDeviceLine();
_fvidx = parent._clvlistacampos.runMethod(true,"_getfirstvisibleindex");Debug.locals.put("FVidx", _fvidx);Debug.locals.put("FVidx", _fvidx);
 BA.debugLineNum = 3962;BA.debugLine="Dim lbl As B4XView=Sender";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.__c.runMethod(false,"Sender",jamtableviewcamposbuilder.ba));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3963;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(l";
Debug.JustUpdateDeviceLine();
_index = parent._clvlistacampos.runMethod(true,"_getitemfromview",(Object)(_lbl));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 3964;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 3965;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"Msgbox2Async",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("¿Resetear el color de Fondo del Encabezado de la columna a su valor por defecto?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3967;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblresetcolorfondoencabezadocolumna_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3968;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 3970;BA.debugLine="clvIV.txtRGBColorFondoEncabezadoColumna.Text=txtR";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorFondoEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"setText",parent._txtrgbcolorfondoencabezados.runMethod(true,"getText"));
 BA.debugLineNum = 3971;BA.debugLine="clvIV.lblColorFondoEncabezadoColumna.Color=lblCol";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorFondoEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"setColor",parent._lblcolorfondoencabezados.runMethod(true,"getColor"));
 BA.debugLineNum = 3972;BA.debugLine="clvListaCampos.ScrollToItem(FVidx)";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.runVoidMethod ("_scrolltoitem",(Object)(_fvidx));
 BA.debugLineNum = 3973;BA.debugLine="End Sub";
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
public static void  _lblresetcolorfondoencabezados_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorFondoEncabezados_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3834);
if (RapidSub.canDelegate("lblresetcolorfondoencabezados_mouseclicked")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","lblresetcolorfondoencabezados_mouseclicked", _eventdata); return;}
ResumableSub_lblResetColorFondoEncabezados_MouseClicked rsub = new ResumableSub_lblResetColorFondoEncabezados_MouseClicked(null,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblResetColorFondoEncabezados_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorFondoEncabezados_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorFondoEncabezados_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3834);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3835;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"Msgbox2Async",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("¿Resetear el color de Fondo de los Encabezados a su valor por defecto?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3836;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblresetcolorfondoencabezados_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3837;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 3838;BA.debugLine="txtRGBColorFondoEncabezados.Text=\"#004B55\"";
Debug.JustUpdateDeviceLine();
parent._txtrgbcolorfondoencabezados.runMethod(true,"setText",BA.ObjectToString("#004B55"));
 BA.debugLineNum = 3839;BA.debugLine="lblColorFondoEncabezados.Color=HexToColor(\"#004B5";
Debug.JustUpdateDeviceLine();
parent._lblcolorfondoencabezados.runMethod(true,"setColor",_hextocolor(RemoteObject.createImmutable("#004B55")));
 BA.debugLineNum = 3840;BA.debugLine="End Sub";
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
public static void  _lblresetcolorfondofilaspares_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorFondoFilasPares_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3874);
if (RapidSub.canDelegate("lblresetcolorfondofilaspares_mouseclicked")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","lblresetcolorfondofilaspares_mouseclicked", _eventdata); return;}
ResumableSub_lblResetColorFondoFilasPares_MouseClicked rsub = new ResumableSub_lblResetColorFondoFilasPares_MouseClicked(null,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblResetColorFondoFilasPares_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorFondoFilasPares_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorFondoFilasPares_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3874);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3875;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"Msgbox2Async",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("¿Resetear el color de Fondo de las Filas Pares a su valor por defecto?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3876;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblresetcolorfondofilaspares_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3877;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 3878;BA.debugLine="txtRGBColorFondoFilasPares.Text=\"black\"";
Debug.JustUpdateDeviceLine();
parent._txtrgbcolorfondofilaspares.runMethod(true,"setText",BA.ObjectToString("black"));
 BA.debugLineNum = 3879;BA.debugLine="lblColorFondoFilasPares.Color=HexToColor(\"#F1F1F1";
Debug.JustUpdateDeviceLine();
parent._lblcolorfondofilaspares.runMethod(true,"setColor",_hextocolor(RemoteObject.createImmutable("#F1F1F1")));
 BA.debugLineNum = 3880;BA.debugLine="End Sub";
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
public static void  _lblresetcolorfondopanelinfo_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorFondoPanelInfo_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3850);
if (RapidSub.canDelegate("lblresetcolorfondopanelinfo_mouseclicked")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","lblresetcolorfondopanelinfo_mouseclicked", _eventdata); return;}
ResumableSub_lblResetColorFondoPanelInfo_MouseClicked rsub = new ResumableSub_lblResetColorFondoPanelInfo_MouseClicked(null,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblResetColorFondoPanelInfo_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorFondoPanelInfo_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorFondoPanelInfo_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3850);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3851;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"Msgbox2Async",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("¿Resetear el color de Fondo del Panel Info a su valor por defecto?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3852;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblresetcolorfondopanelinfo_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3853;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 3854;BA.debugLine="txtRGBColorFondoPanelInfo.Text=\"#FFF8C3\"";
Debug.JustUpdateDeviceLine();
parent._txtrgbcolorfondopanelinfo.runMethod(true,"setText",BA.ObjectToString("#FFF8C3"));
 BA.debugLineNum = 3855;BA.debugLine="lblColorFondoPanelInfo.Color=HexToColor(\"#FFF8C3\"";
Debug.JustUpdateDeviceLine();
parent._lblcolorfondopanelinfo.runMethod(true,"setColor",_hextocolor(RemoteObject.createImmutable("#FFF8C3")));
 BA.debugLineNum = 3856;BA.debugLine="End Sub";
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
public static void  _lblresetcolortexto_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorTexto_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,4001);
if (RapidSub.canDelegate("lblresetcolortexto_mouseclicked")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","lblresetcolortexto_mouseclicked", _eventdata); return;}
ResumableSub_lblResetColorTexto_MouseClicked rsub = new ResumableSub_lblResetColorTexto_MouseClicked(null,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblResetColorTexto_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorTexto_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _fvidx = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorTexto_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,4001);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 4002;BA.debugLine="Dim FVidx As Int=clvListaCampos.FirstVisibleIndex";
Debug.JustUpdateDeviceLine();
_fvidx = parent._clvlistacampos.runMethod(true,"_getfirstvisibleindex");Debug.locals.put("FVidx", _fvidx);Debug.locals.put("FVidx", _fvidx);
 BA.debugLineNum = 4003;BA.debugLine="Dim lbl As B4XView=Sender";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.__c.runMethod(false,"Sender",jamtableviewcamposbuilder.ba));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 4004;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(l";
Debug.JustUpdateDeviceLine();
_index = parent._clvlistacampos.runMethod(true,"_getitemfromview",(Object)(_lbl));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 4005;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 4007;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"Msgbox2Async",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("¿Resetear el color de texto de las celdas de la columna a su valor por defecto?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 4008;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblresetcolortexto_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 4009;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 4011;BA.debugLine="clvIV.txtRGBColorTexto.Text=\"black\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorTexto" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("black"));
 BA.debugLineNum = 4012;BA.debugLine="clvIV.lblColorTexto.Color=0xFF000000";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorTexto" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xff000000)));
 BA.debugLineNum = 4013;BA.debugLine="clvListaCampos.ScrollToItem(FVidx)";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.runVoidMethod ("_scrolltoitem",(Object)(_fvidx));
 BA.debugLineNum = 4014;BA.debugLine="End Sub";
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
public static void  _lblresetcolortextoencabezadocolumna_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorTextoEncabezadoColumna_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3920);
if (RapidSub.canDelegate("lblresetcolortextoencabezadocolumna_mouseclicked")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","lblresetcolortextoencabezadocolumna_mouseclicked", _eventdata); return;}
ResumableSub_lblResetColorTextoEncabezadoColumna_MouseClicked rsub = new ResumableSub_lblResetColorTextoEncabezadoColumna_MouseClicked(null,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblResetColorTextoEncabezadoColumna_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorTextoEncabezadoColumna_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _fvidx = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorTextoEncabezadoColumna_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3920);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3921;BA.debugLine="Dim FVidx As Int=clvListaCampos.FirstVisibleIndex";
Debug.JustUpdateDeviceLine();
_fvidx = parent._clvlistacampos.runMethod(true,"_getfirstvisibleindex");Debug.locals.put("FVidx", _fvidx);Debug.locals.put("FVidx", _fvidx);
 BA.debugLineNum = 3922;BA.debugLine="Dim lbl As B4XView=Sender";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.__c.runMethod(false,"Sender",jamtableviewcamposbuilder.ba));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3923;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(l";
Debug.JustUpdateDeviceLine();
_index = parent._clvlistacampos.runMethod(true,"_getitemfromview",(Object)(_lbl));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 3924;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 3926;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"Msgbox2Async",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("¿Resetear el color del texto del encabezado de la columna a su valor por defecto?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3927;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblresetcolortextoencabezadocolumna_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3928;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 3929;BA.debugLine="clvIV.txtRGBColorTextoEncabezadoColumna.Text=txtR";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtRGBColorTextoEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"setText",parent._txtrgbcolortextoencabezados.runMethod(true,"getText"));
 BA.debugLineNum = 3930;BA.debugLine="clvIV.lblColorTextoEncabezadoColumna.Color=lblCol";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblColorTextoEncabezadoColumna" /*RemoteObject*/ ).runMethod(true,"setColor",parent._lblcolortextoencabezadocolumna.runMethod(true,"getColor"));
 BA.debugLineNum = 3931;BA.debugLine="clvListaCampos.ScrollToItem(FVidx)";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.runVoidMethod ("_scrolltoitem",(Object)(_fvidx));
 BA.debugLineNum = 3932;BA.debugLine="End Sub";
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
public static void  _lblresetcolortextoencabezados_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorTextoEncabezados_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3842);
if (RapidSub.canDelegate("lblresetcolortextoencabezados_mouseclicked")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","lblresetcolortextoencabezados_mouseclicked", _eventdata); return;}
ResumableSub_lblResetColorTextoEncabezados_MouseClicked rsub = new ResumableSub_lblResetColorTextoEncabezados_MouseClicked(null,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblResetColorTextoEncabezados_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorTextoEncabezados_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorTextoEncabezados_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3842);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3843;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"Msgbox2Async",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("¿Resetear el color del Texto de los Encabezados a su valor por defecto?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3844;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblresetcolortextoencabezados_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3845;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 3846;BA.debugLine="txtRGBColorTextoEncabezados.Text=GetCssColorStrin";
Debug.JustUpdateDeviceLine();
parent._txtrgbcolortextoencabezados.runMethod(true,"setText",_getcsscolorstringfromintcolor(parent._xui.getField(true,"Color_White")));
 BA.debugLineNum = 3847;BA.debugLine="lblColorTextoEncabezados.Color=xui.Color_White";
Debug.JustUpdateDeviceLine();
parent._lblcolortextoencabezados.runMethod(true,"setColor",parent._xui.getField(true,"Color_White"));
 BA.debugLineNum = 3848;BA.debugLine="End Sub";
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
public static void  _lblresetcolortextopanelinfo_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorTextoPanelInfo_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3858);
if (RapidSub.canDelegate("lblresetcolortextopanelinfo_mouseclicked")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","lblresetcolortextopanelinfo_mouseclicked", _eventdata); return;}
ResumableSub_lblResetColorTextoPanelInfo_MouseClicked rsub = new ResumableSub_lblResetColorTextoPanelInfo_MouseClicked(null,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblResetColorTextoPanelInfo_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorTextoPanelInfo_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorTextoPanelInfo_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3858);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3859;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"Msgbox2Async",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("¿Resetear el color del Texto del Panel Info a su valor por defecto?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3860;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "lblresetcolortextopanelinfo_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3861;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 3862;BA.debugLine="txtRGBColorTextoPanelInfo.Text=GetCssColorStringF";
Debug.JustUpdateDeviceLine();
parent._txtrgbcolortextopanelinfo.runMethod(true,"setText",_getcsscolorstringfromintcolor(parent._xui.getField(true,"Color_Black")));
 BA.debugLineNum = 3863;BA.debugLine="lblColorTextoPanelInfo.Color=xui.Color_Black";
Debug.JustUpdateDeviceLine();
parent._lblcolortextopanelinfo.runMethod(true,"setColor",parent._xui.getField(true,"Color_Black"));
 BA.debugLineNum = 3864;BA.debugLine="End Sub";
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
public static RemoteObject  _loadfile(RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("LoadFile (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,1571);
if (RapidSub.canDelegate("loadfile")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","loadfile", _f);}
ResumableSub_LoadFile rsub = new ResumableSub_LoadFile(null,_f);
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
public ResumableSub_LoadFile(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _f) {
this.parent = parent;
this._f = _f;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _f;
RemoteObject _cancel = RemoteObject.createImmutable(false);
RemoteObject _s = RemoteObject.createImmutable("");
RemoteObject _datetimeformatant = RemoteObject.createImmutable("");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LoadFile (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,1571);
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
Debug.locals.put("f", _f);
 BA.debugLineNum = 1572;BA.debugLine="Wait For (CheckChanges) Complete (Cancel As Boole";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "loadfile"), _checkchanges());
this.state = 23;
return;
case 23:
//C
this.state = 1;
_cancel = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Cancel", _cancel);
;
 BA.debugLineNum = 1573;BA.debugLine="If Cancel Then Return False";
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
 BA.debugLineNum = 1574;BA.debugLine="CargandoDatos=True";
Debug.JustUpdateDeviceLine();
parent._cargandodatos = parent.__c.getField(true,"True");
 BA.debugLineNum = 1575;BA.debugLine="Try";
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
 BA.debugLineNum = 1576;BA.debugLine="Dim s As String = File.ReadString(f, \"\")";
Debug.JustUpdateDeviceLine();
_s = parent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(_f),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 1577;BA.debugLine="CurrentFileString = s";
Debug.JustUpdateDeviceLine();
parent._currentfilestring = _s;
 BA.debugLineNum = 1578;BA.debugLine="clvListaCampos.Clear";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.runVoidMethod ("_clear");
 BA.debugLineNum = 1579;BA.debugLine="lstPrimaryKey.Initialize";
Debug.JustUpdateDeviceLine();
parent._lstprimarykey.runVoidMethod ("Initialize");
 BA.debugLineNum = 1580;BA.debugLine="SetCurrentFile(f)";
Debug.JustUpdateDeviceLine();
_setcurrentfile(_f);
 BA.debugLineNum = 1582;BA.debugLine="AddItemsFromString(s)";
Debug.JustUpdateDeviceLine();
_additemsfromstring(_s);
 BA.debugLineNum = 1583;BA.debugLine="Wait For AddItemsFromString_Completed";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","additemsfromstring_completed", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "loadfile"), null);
this.state = 24;
return;
case 24:
//C
this.state = 10;
;
 BA.debugLineNum = 1585;BA.debugLine="dragger.AddDragButtons";
Debug.JustUpdateDeviceLine();
parent._dragger.runClassMethod (b4j.docU.jamtableviewclvdragger.class, "_adddragbuttons" /*RemoteObject*/ );
 BA.debugLineNum = 1587;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"JRDC Query\"";
Debug.JustUpdateDeviceLine();
if (true) break;

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",parent._datosorigendatos.getField(true,"TipoOrigenDatos" /*RemoteObject*/ ),BA.ObjectToString("JRDC Query"))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1588;BA.debugLine="CargaCamposJRDCQuery(txtIpJRDC.Text,txtPuertoJR";
Debug.JustUpdateDeviceLine();
_cargacamposjrdcquery(parent._txtipjrdc.runMethod(true,"getText"),BA.numberCast(int.class, parent._txtpuertojrdc.runMethod(true,"getText")),parent._txtcomandojrdc.runMethod(true,"getText"),parent._txtparametrosjrdc.runMethod(true,"getText"));
 BA.debugLineNum = 1589;BA.debugLine="wait for CargaCamposJRDCQuery_Completed";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","cargacamposjrdcquery_completed", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "loadfile"), null);
this.state = 25;
return;
case 25:
//C
this.state = 13;
;
 if (true) break;
;
 BA.debugLineNum = 1591;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"JRDC Table\"";
Debug.JustUpdateDeviceLine();

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",parent._datosorigendatos.getField(true,"TipoOrigenDatos" /*RemoteObject*/ ),BA.ObjectToString("JRDC Table"))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1592;BA.debugLine="CargaCamposJRDCTable(txtIpJRDC.Text,txtPuertoJR";
Debug.JustUpdateDeviceLine();
_cargacamposjrdctable(parent._txtipjrdc.runMethod(true,"getText"),BA.numberCast(int.class, parent._txtpuertojrdc.runMethod(true,"getText")),parent._txtcomandojrdc.runMethod(true,"getText"),parent._txtparametrosjrdc.runMethod(true,"getText"));
 BA.debugLineNum = 1593;BA.debugLine="Wait For CargaCamposJRDCTable_Completed";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","cargacamposjrdctable_completed", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "loadfile"), null);
this.state = 26;
return;
case 26:
//C
this.state = 16;
;
 if (true) break;
;
 BA.debugLineNum = 1595;BA.debugLine="If FechaUltimaModificacion>-1 Then";
Debug.JustUpdateDeviceLine();

case 16:
//if
this.state = 19;
if (RemoteObject.solveBoolean(">",parent._fechaultimamodificacion,BA.numberCast(long.class, -(double) (0 + 1)))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 1596;BA.debugLine="Dim DateTimeFormatAnt As String=DateTime.DateFo";
Debug.JustUpdateDeviceLine();
_datetimeformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateTimeFormatAnt", _datetimeformatant);Debug.locals.put("DateTimeFormatAnt", _datetimeformatant);
 BA.debugLineNum = 1597;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.JustUpdateDeviceLine();
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 1598;BA.debugLine="frm.Title=frm.Title & \"   Fecha última modifica";
Debug.JustUpdateDeviceLine();
parent._frm.runMethod(true,"setTitle",RemoteObject.concat(parent._frm.runMethod(true,"getTitle"),RemoteObject.createImmutable("   Fecha última modificación: "),parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent._fechaultimamodificacion))));
 BA.debugLineNum = 1599;BA.debugLine="DateTime.DateFormat=DateTimeFormatAnt";
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
 BA.debugLineNum = 1602;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
Debug.JustUpdateDeviceLine();
parent._frm.runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",parent._fx.getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 1603;BA.debugLine="wait for (Dialog.Show(LastException.Message, \"Ok";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "loadfile"), parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_show" /*RemoteObject*/ ,(Object)((parent.__c.runMethod(false,"LastException",jamtableviewcamposbuilder.ba).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable(("Ok"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("")))));
this.state = 27;
return;
case 27:
//C
this.state = 22;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1604;BA.debugLine="Return False";
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
 BA.debugLineNum = 1607;BA.debugLine="RecalcularIDOrdenColumnas";
Debug.JustUpdateDeviceLine();
_recalcularidordencolumnas();
 BA.debugLineNum = 1608;BA.debugLine="CargandoDatos=False";
Debug.JustUpdateDeviceLine();
parent._cargandodatos = parent.__c.getField(true,"False");
 BA.debugLineNum = 1609;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1610;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",jamtableviewcamposbuilder.ba, e0.toString());}
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
public static void  _additemsfromstring_completed() throws Exception{
}
public static RemoteObject  _mainform_resize(RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("MainForm_Resize (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,336);
if (RapidSub.canDelegate("mainform_resize")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","mainform_resize", _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 336;BA.debugLine="private Sub MainForm_Resize (Width As Double, Heig";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 337;BA.debugLine="dragger.Resize";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._dragger.runClassMethod (b4j.docU.jamtableviewclvdragger.class, "_resize" /*RemoteObject*/ );
 BA.debugLineNum = 338;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _mnuhelp_action() throws Exception{
try {
		Debug.PushSubsStack("mnuHelp_Action (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3018);
if (RapidSub.canDelegate("mnuhelp_action")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","mnuhelp_action"); return;}
ResumableSub_mnuHelp_Action rsub = new ResumableSub_mnuHelp_Action(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_mnuHelp_Action extends BA.ResumableSub {
public ResumableSub_mnuHelp_Action(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _rbool = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("mnuHelp_Action (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3018);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 3019;BA.debugLine="wait for (Help) complete (rBool As Boolean)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "mnuhelp_action"), _help());
this.state = 1;
return;
case 1:
//C
this.state = -1;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 3020;BA.debugLine="End Sub";
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
public static void  _mnuload_action() throws Exception{
try {
		Debug.PushSubsStack("mnuLoad_Action (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,1560);
if (RapidSub.canDelegate("mnuload_action")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","mnuload_action"); return;}
ResumableSub_mnuLoad_Action rsub = new ResumableSub_mnuLoad_Action(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_mnuLoad_Action extends BA.ResumableSub {
public ResumableSub_mnuLoad_Action(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _f = RemoteObject.createImmutable("");
RemoteObject _rbool = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("mnuLoad_Action (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,1560);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1561;BA.debugLine="Dim f As String = FileChooser.ShowOpen(frm)";
Debug.JustUpdateDeviceLine();
_f = parent._filechooser.runMethodAndSync(true,"ShowOpen",(Object)(parent._frm));Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 1562;BA.debugLine="If f <> \"\" Then";
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
 BA.debugLineNum = 1563;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.WAIT";
Debug.JustUpdateDeviceLine();
parent._frm.runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",parent._fx.getField(false,"Cursors").getField(false,"WAIT"));
 BA.debugLineNum = 1564;BA.debugLine="DeshabilitarNodos";
Debug.JustUpdateDeviceLine();
_deshabilitarnodos();
 BA.debugLineNum = 1565;BA.debugLine="wait for (LoadFile(f)) complete (rBool As Boolea";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "mnuload_action"), _loadfile(_f));
this.state = 5;
return;
case 5:
//C
this.state = 4;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 1566;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
Debug.JustUpdateDeviceLine();
parent._frm.runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",parent._fx.getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 1567;BA.debugLine="HabilitarNodos";
Debug.JustUpdateDeviceLine();
_habilitarnodos();
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1569;BA.debugLine="End Sub";
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
public static void  _mnunew_action() throws Exception{
try {
		Debug.PushSubsStack("mnuNew_Action (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,1695);
if (RapidSub.canDelegate("mnunew_action")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","mnunew_action"); return;}
ResumableSub_mnuNew_Action rsub = new ResumableSub_mnuNew_Action(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_mnuNew_Action extends BA.ResumableSub {
public ResumableSub_mnuNew_Action(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _cancel = RemoteObject.createImmutable(false);
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("mnuNew_Action (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,1695);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1696;BA.debugLine="Wait For (CheckChanges) Complete (Cancel As Boole";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "mnunew_action"), _checkchanges());
this.state = 7;
return;
case 7:
//C
this.state = 1;
_cancel = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Cancel", _cancel);
;
 BA.debugLineNum = 1697;BA.debugLine="If Cancel Then Return";
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
 BA.debugLineNum = 1698;BA.debugLine="CreateTipoOrigenDatos(\"\",\"\",\"\",\"\",Null)";
Debug.JustUpdateDeviceLine();
_createtipoorigendatos(BA.ObjectToString(""),BA.ObjectToString(""),BA.ObjectToString(""),BA.ObjectToString(""),BA.ObjectToString(parent.__c.getField(false,"Null")));
 BA.debugLineNum = 1701;BA.debugLine="Dim bc As ByteConverter";
Debug.JustUpdateDeviceLine();
_bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 1702;BA.debugLine="txtRGBColorFondoEncabezados.Text=\"#004B55\"";
Debug.JustUpdateDeviceLine();
parent._txtrgbcolorfondoencabezados.runMethod(true,"setText",BA.ObjectToString("#004B55"));
 BA.debugLineNum = 1703;BA.debugLine="lblColorFondoEncabezados.Color=bc.IntsFromBytes(b";
Debug.JustUpdateDeviceLine();
parent._lblcolorfondoencabezados.runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),parent._txtrgbcolorfondoencabezados.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1705;BA.debugLine="txtRGBColorTextoEncabezados.Text=GetCssColorStrin";
Debug.JustUpdateDeviceLine();
parent._txtrgbcolortextoencabezados.runMethod(true,"setText",_getcsscolorstringfromintcolor(parent._xui.getField(true,"Color_White")));
 BA.debugLineNum = 1706;BA.debugLine="lblColorTextoEncabezados.Color=bc.IntsFromBytes(b";
Debug.JustUpdateDeviceLine();
parent._lblcolortextoencabezados.runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),parent._txtrgbcolortextoencabezados.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1708;BA.debugLine="txtRGBColorFondoPanelInfo.Text=\"#FFF8C3\"";
Debug.JustUpdateDeviceLine();
parent._txtrgbcolorfondopanelinfo.runMethod(true,"setText",BA.ObjectToString("#FFF8C3"));
 BA.debugLineNum = 1709;BA.debugLine="lblColorFondoPanelInfo.Color=bc.IntsFromBytes(bc.";
Debug.JustUpdateDeviceLine();
parent._lblcolorfondopanelinfo.runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),parent._txtrgbcolorfondopanelinfo.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1711;BA.debugLine="txtRGBColorTextoPanelInfo.Text=GetCssColorStringF";
Debug.JustUpdateDeviceLine();
parent._txtrgbcolortextopanelinfo.runMethod(true,"setText",_getcsscolorstringfromintcolor(parent._xui.getField(true,"Color_Black")));
 BA.debugLineNum = 1712;BA.debugLine="lblColorTextoPanelInfo.Color=bc.IntsFromBytes(bc.";
Debug.JustUpdateDeviceLine();
parent._lblcolortextopanelinfo.runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),parent._txtrgbcolortextopanelinfo.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1714;BA.debugLine="txtRGBColorFondoFilasImpares.Text=GetCssColorStri";
Debug.JustUpdateDeviceLine();
parent._txtrgbcolorfondofilasimpares.runMethod(true,"setText",_getcsscolorstringfromintcolor(parent._xui.getField(true,"Color_White")));
 BA.debugLineNum = 1715;BA.debugLine="lblColorFondoFilasImpares.Color=bc.IntsFromBytes(";
Debug.JustUpdateDeviceLine();
parent._lblcolorfondofilasimpares.runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),parent._txtrgbcolorfondofilasimpares.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1717;BA.debugLine="txtRGBColorFondoFilasPares.Text=\"#F1F1F1\"";
Debug.JustUpdateDeviceLine();
parent._txtrgbcolorfondofilaspares.runMethod(true,"setText",BA.ObjectToString("#F1F1F1"));
 BA.debugLineNum = 1718;BA.debugLine="lblColorFondoFilasPares.Color=bc.IntsFromBytes(bc";
Debug.JustUpdateDeviceLine();
parent._lblcolorfondofilaspares.runMethod(true,"setColor",_bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FF"),parent._txtrgbcolorfondofilaspares.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")))))))).getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1720;BA.debugLine="NewFile";
Debug.JustUpdateDeviceLine();
_newfile();
 BA.debugLineNum = 1721;BA.debugLine="wait for NewFile_Completed";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","newfile_completed", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "mnunew_action"), null);
this.state = 8;
return;
case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 1723;BA.debugLine="End Sub";
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
public static void  _newfile_completed() throws Exception{
}
public static void  _mnusalir_action() throws Exception{
try {
		Debug.PushSubsStack("mnuSalir_Action (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,287);
if (RapidSub.canDelegate("mnusalir_action")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","mnusalir_action"); return;}
ResumableSub_mnuSalir_Action rsub = new ResumableSub_mnuSalir_Action(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_mnuSalir_Action extends BA.ResumableSub {
public ResumableSub_mnuSalir_Action(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _cancel = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("mnuSalir_Action (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,287);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 288;BA.debugLine="Wait For (CheckChanges) Complete (Cancel As Boole";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "mnusalir_action"), _checkchanges());
this.state = 7;
return;
case 7:
//C
this.state = 1;
_cancel = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Cancel", _cancel);
;
 BA.debugLineNum = 289;BA.debugLine="If Cancel Then Return";
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
 BA.debugLineNum = 295;BA.debugLine="frm.Close";
Debug.JustUpdateDeviceLine();
parent._frm.runVoidMethod ("Close");
 BA.debugLineNum = 296;BA.debugLine="End Sub";
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
public static void  _mnusave_action() throws Exception{
try {
		Debug.PushSubsStack("mnuSave_Action (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2240);
if (RapidSub.canDelegate("mnusave_action")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","mnusave_action"); return;}
ResumableSub_mnuSave_Action rsub = new ResumableSub_mnuSave_Action(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_mnuSave_Action extends BA.ResumableSub {
public ResumableSub_mnuSave_Action(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _camposok = RemoteObject.createImmutable(false);
RemoteObject _dirjson = RemoteObject.createImmutable("");
RemoteObject _nombrejson = RemoteObject.createImmutable("");
RemoteObject _nombrecss = RemoteObject.createImmutable("");
RemoteObject _scss = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("mnuSave_Action (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2240);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 2241;BA.debugLine="If CurrentFile = \"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",parent._currentfile,BA.ObjectToString(""))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 24;
 BA.debugLineNum = 2242;BA.debugLine="mnuSaveAs_Action";
Debug.JustUpdateDeviceLine();
_mnusaveas_action();
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2245;BA.debugLine="Wait For (CheckForWarnings) Complete (CamposOK A";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "mnusave_action"), _checkforwarnings());
this.state = 25;
return;
case 25:
//C
this.state = 6;
_camposok = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("CamposOK", _camposok);
;
 BA.debugLineNum = 2246;BA.debugLine="If CamposOK Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 6:
//if
this.state = 23;
if (_camposok.<Boolean>get().booleanValue()) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 2247;BA.debugLine="CurrentFileString = ExportToString";
Debug.JustUpdateDeviceLine();
parent._currentfilestring = _exporttostring();
 BA.debugLineNum = 2248;BA.debugLine="Dim DirJSON As String=File.GetFileParent(Curren";
Debug.JustUpdateDeviceLine();
_dirjson = parent.__c.getField(false,"File").runMethod(true,"GetFileParent",(Object)(parent._currentfile));Debug.locals.put("DirJSON", _dirjson);Debug.locals.put("DirJSON", _dirjson);
 BA.debugLineNum = 2249;BA.debugLine="Dim NombreJSON As String=File.GetName(CurrentFi";
Debug.JustUpdateDeviceLine();
_nombrejson = parent.__c.getField(false,"File").runMethod(true,"GetName",(Object)(parent._currentfile));Debug.locals.put("NombreJSON", _nombrejson);Debug.locals.put("NombreJSON", _nombrejson);
 BA.debugLineNum = 2250;BA.debugLine="Dim NombreCSS As String=NombreJSON.Replace(\".js";
Debug.JustUpdateDeviceLine();
_nombrecss = _nombrejson.runMethod(true,"replace",(Object)(BA.ObjectToString(".json")),(Object)(RemoteObject.createImmutable(".css")));Debug.locals.put("NombreCSS", _nombrecss);Debug.locals.put("NombreCSS", _nombrecss);
 BA.debugLineNum = 2251;BA.debugLine="Dim sCSS As String=ExportToCSS(NombreJSON.Repla";
Debug.JustUpdateDeviceLine();
_scss = _exporttocss(_nombrejson.runMethod(true,"replace",(Object)(BA.ObjectToString(".json")),(Object)(RemoteObject.createImmutable(""))));Debug.locals.put("sCSS", _scss);Debug.locals.put("sCSS", _scss);
 BA.debugLineNum = 2252;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
if (true) break;

case 9:
//try
this.state = 18;
this.catchState = 17;
this.state = 11;
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 17;
 BA.debugLineNum = 2253;BA.debugLine="File.WriteString(CurrentFile, \"\", CurrentFileS";
Debug.JustUpdateDeviceLine();
parent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent._currentfile),(Object)(BA.ObjectToString("")),(Object)(parent._currentfilestring));
 BA.debugLineNum = 2255;BA.debugLine="File.Delete(DirJSON,NombreCSS)";
Debug.JustUpdateDeviceLine();
parent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(_dirjson),(Object)(_nombrecss));
 BA.debugLineNum = 2256;BA.debugLine="If sCSS.Length>0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 12:
//if
this.state = 15;
if (RemoteObject.solveBoolean(">",_scss.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 2257;BA.debugLine="File.WriteString(DirJSON,NombreCSS, sCSS)";
Debug.JustUpdateDeviceLine();
parent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(_dirjson),(Object)(_nombrecss),(Object)(_scss));
 if (true) break;

case 15:
//C
this.state = 18;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
 BA.debugLineNum = 2260;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"No ha sid";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible grabar el fichero."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),parent.__c.runMethod(false,"LastException",jamtableviewcamposbuilder.ba).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2261;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "mnusave_action"), _msa);
this.state = 26;
return;
case 26:
//C
this.state = 18;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2262;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;
if (true) break;

case 18:
//C
this.state = 19;
this.catchState = 0;
;
 BA.debugLineNum = 2264;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Fichero gr";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Fichero grabado."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("("),parent._currentfile,RemoteObject.createImmutable(")"))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2265;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "mnusave_action"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 19;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2266;BA.debugLine="If sCSS.Length>0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 19:
//if
this.state = 22;
if (RemoteObject.solveBoolean(">",_scss.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 2267;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Fichero g";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Fichero grabado."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("("),parent.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(_dirjson),(Object)(_nombrecss)),RemoteObject.createImmutable(")"))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2268;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "mnusave_action"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 22;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 2270;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"No olvides";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("No olvides SINCRONIZAR la carpeta Files en el IDE")),(Object)(RemoteObject.createImmutable("IMPORTANTE")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2271;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "mnusave_action"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 23;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 23:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = -1;
;
 BA.debugLineNum = 2274;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",jamtableviewcamposbuilder.ba, e0.toString());}
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
public static void  _mnusaveas_action() throws Exception{
try {
		Debug.PushSubsStack("mnuSaveAs_Action (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2524);
if (RapidSub.canDelegate("mnusaveas_action")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","mnusaveas_action"); return;}
ResumableSub_mnuSaveAs_Action rsub = new ResumableSub_mnuSaveAs_Action(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_mnuSaveAs_Action extends BA.ResumableSub {
public ResumableSub_mnuSaveAs_Action(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _camposok = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _f = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("mnuSaveAs_Action (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2524);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 2525;BA.debugLine="Wait For (CheckForWarnings) Complete (CamposOK As";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "mnusaveas_action"), _checkforwarnings());
this.state = 11;
return;
case 11:
//C
this.state = 1;
_camposok = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("CamposOK", _camposok);
;
 BA.debugLineNum = 2526;BA.debugLine="If CamposOK Then";
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
 BA.debugLineNum = 2527;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Ubicar el f";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("Ubicar el fichero en el directorio FILES de la aplicación en la que se vaya a usar.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2528;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "mnusaveas_action"), _msa);
this.state = 12;
return;
case 12:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2529;BA.debugLine="Dim f As String = FileChooser.ShowSave(frm)";
Debug.JustUpdateDeviceLine();
_f = parent._filechooser.runMethodAndSync(true,"ShowSave",(Object)(parent._frm));Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 2530;BA.debugLine="If f = \"\" Then Return";
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
 BA.debugLineNum = 2531;BA.debugLine="SetCurrentFile(f)";
Debug.JustUpdateDeviceLine();
_setcurrentfile(_f);
 BA.debugLineNum = 2532;BA.debugLine="mnuSave_Action";
Debug.JustUpdateDeviceLine();
_mnusave_action();
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 2534;BA.debugLine="End Sub";
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
public static RemoteObject  _mostrardatosorigendatos() throws Exception{
try {
		Debug.PushSubsStack("MostrarDatosOrigenDatos (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,1911);
if (RapidSub.canDelegate("mostrardatosorigendatos")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","mostrardatosorigendatos");}
RemoteObject _paramtext = RemoteObject.createImmutable("");
 BA.debugLineNum = 1911;BA.debugLine="private Sub MostrarDatosOrigenDatos";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1912;BA.debugLine="txtTipoOrigenDatos.Text=DatosOrigenDatos.TipoOrig";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._txttipoorigendatos.runMethod(true,"setText",jamtableviewcamposbuilder._datosorigendatos.getField(true,"TipoOrigenDatos" /*RemoteObject*/ ));
 BA.debugLineNum = 1913;BA.debugLine="txtIpJRDC.Text=DatosOrigenDatos.IpJRDC";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._txtipjrdc.runMethod(true,"setText",jamtableviewcamposbuilder._datosorigendatos.getField(true,"IpJRDC" /*RemoteObject*/ ));
 BA.debugLineNum = 1914;BA.debugLine="txtPuertoJRDC.Text=DatosOrigenDatos.PuertoJRDC";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._txtpuertojrdc.runMethod(true,"setText",jamtableviewcamposbuilder._datosorigendatos.getField(true,"PuertoJRDC" /*RemoteObject*/ ));
 BA.debugLineNum = 1915;BA.debugLine="txtComandoJRDC.Text=DatosOrigenDatos.ComandoJRDC";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._txtcomandojrdc.runMethod(true,"setText",jamtableviewcamposbuilder._datosorigendatos.getField(true,"ComandoJRDC" /*RemoteObject*/ ));
 BA.debugLineNum = 1916;BA.debugLine="Dim paramText As String=DatosOrigenDatos.Parametr";
Debug.JustUpdateDeviceLine();
_paramtext = jamtableviewcamposbuilder._datosorigendatos.getField(true,"ParametrosJRDC" /*RemoteObject*/ );Debug.locals.put("paramText", _paramtext);Debug.locals.put("paramText", _paramtext);
 BA.debugLineNum = 1917;BA.debugLine="txtParametrosJRDC.Text=paramText.Trim";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._txtparametrosjrdc.runMethod(true,"setText",_paramtext.runMethod(true,"trim"));
 BA.debugLineNum = 1918;BA.debugLine="pnlOrigenSQL.Visible=True";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._pnlorigensql.runMethod(true,"setVisible",jamtableviewcamposbuilder.__c.getField(true,"True"));
 BA.debugLineNum = 1919;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _newfile() throws Exception{
try {
		Debug.PushSubsStack("NewFile (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,1733);
if (RapidSub.canDelegate("newfile")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","newfile"); return;}
ResumableSub_NewFile rsub = new ResumableSub_NewFile(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_NewFile extends BA.ResumableSub {
public ResumableSub_NewFile(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _rbool = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("NewFile (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,1733);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 1734;BA.debugLine="wait for (ConfigurarOrigenDatos) complete (rBool";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "newfile"), _configurarorigendatos());
this.state = 1;
return;
case 1:
//C
this.state = -1;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 1735;BA.debugLine="CurrentFileString=ExportToString  ' crea un JSON";
Debug.JustUpdateDeviceLine();
parent._currentfilestring = _exporttostring();
 BA.debugLineNum = 1736;BA.debugLine="CallSubDelayed(Me,\"NewFile_Completed\")";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("CallSubDelayed",jamtableviewcamposbuilder.ba,(Object)(jamtableviewcamposbuilder.getObject()),(Object)(RemoteObject.createImmutable("NewFile_Completed")));
 BA.debugLineNum = 1737;BA.debugLine="End Sub";
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
public static RemoteObject  _nombrescamposclvincluidosenformulascamposcalculados() throws Exception{
try {
		Debug.PushSubsStack("NombresCamposCLVIncluidosEnFormulasCamposCalculados (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2165);
if (RapidSub.canDelegate("nombrescamposclvincluidosenformulascamposcalculados")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","nombrescamposclvincluidosenformulascamposcalculados");}
RemoteObject _lstnombrescamposclvincluidosenformulascamposcalculados = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstcamposenclv = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _formulacampocalculado = RemoteObject.createImmutable("");
RemoteObject _lstnombrescamposincluidosenformula = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _pattern = RemoteObject.createImmutable("");
RemoteObject _matcher1 = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
int _k = 0;
 BA.debugLineNum = 2165;BA.debugLine="private Sub NombresCamposCLVIncluidosEnFormulasCam";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2166;BA.debugLine="Dim lstNombresCamposCLVIncluidosEnFormulasCamposC";
Debug.JustUpdateDeviceLine();
_lstnombrescamposclvincluidosenformulascamposcalculados = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstNombresCamposCLVIncluidosEnFormulasCamposCalculados", _lstnombrescamposclvincluidosenformulascamposcalculados);
 BA.debugLineNum = 2167;BA.debugLine="lstNombresCamposCLVIncluidosEnFormulasCamposCalcu";
Debug.JustUpdateDeviceLine();
_lstnombrescamposclvincluidosenformulascamposcalculados.runVoidMethod ("Initialize");
 BA.debugLineNum = 2168;BA.debugLine="Dim lstCamposEnCLV As List=CargaCamposCLV";
Debug.JustUpdateDeviceLine();
_lstcamposenclv = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstcamposenclv = _cargacamposclv();Debug.locals.put("lstCamposEnCLV", _lstcamposenclv);Debug.locals.put("lstCamposEnCLV", _lstcamposenclv);
 BA.debugLineNum = 2169;BA.debugLine="For i=0 To lstCamposEnCLV.Size-1";
Debug.JustUpdateDeviceLine();
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_lstcamposenclv.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2170;BA.debugLine="Dim m As Map=lstCamposEnCLV.Get(i)";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstcamposenclv.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 2171;BA.debugLine="If True=m.Get(\"CampoCalculado\") Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",jamtableviewcamposbuilder.__c.getField(true,"True"),BA.ObjectToBoolean(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoCalculado"))))))) { 
 BA.debugLineNum = 2172;BA.debugLine="Dim FormulaCampoCalculado As String=m.Get(\"Camp";
Debug.JustUpdateDeviceLine();
_formulacampocalculado = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Campo")))));Debug.locals.put("FormulaCampoCalculado", _formulacampocalculado);Debug.locals.put("FormulaCampoCalculado", _formulacampocalculado);
 BA.debugLineNum = 2173;BA.debugLine="Dim lstNombresCamposIncluidosEnFormula As List";
Debug.JustUpdateDeviceLine();
_lstnombrescamposincluidosenformula = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstNombresCamposIncluidosEnFormula", _lstnombrescamposincluidosenformula);
 BA.debugLineNum = 2174;BA.debugLine="lstNombresCamposIncluidosEnFormula.Initialize";
Debug.JustUpdateDeviceLine();
_lstnombrescamposincluidosenformula.runVoidMethod ("Initialize");
 BA.debugLineNum = 2175;BA.debugLine="Dim pattern As String";
Debug.JustUpdateDeviceLine();
_pattern = RemoteObject.createImmutable("");Debug.locals.put("pattern", _pattern);
 BA.debugLineNum = 2176;BA.debugLine="pattern = \"\\[(.*?)\\]\"  ' texto entre brackets";
Debug.JustUpdateDeviceLine();
_pattern = BA.ObjectToString("\\[(.*?)\\]");Debug.locals.put("pattern", _pattern);
 BA.debugLineNum = 2177;BA.debugLine="Dim Matcher1 As Matcher";
Debug.JustUpdateDeviceLine();
_matcher1 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");Debug.locals.put("Matcher1", _matcher1);
 BA.debugLineNum = 2178;BA.debugLine="Matcher1 = Regex.Matcher(pattern, FormulaCampoC";
Debug.JustUpdateDeviceLine();
_matcher1 = jamtableviewcamposbuilder.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(_pattern),(Object)(_formulacampocalculado));Debug.locals.put("Matcher1", _matcher1);
 BA.debugLineNum = 2179;BA.debugLine="Do While Matcher1.Find";
Debug.JustUpdateDeviceLine();
while (_matcher1.runMethod(true,"Find").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 2180;BA.debugLine="Log(\"Found: \" & Matcher1.Match)";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder.__c.runVoidMethod ("LogImpl","9205979663",RemoteObject.concat(RemoteObject.createImmutable("Found: "),_matcher1.runMethod(true,"getMatch")),0);
 BA.debugLineNum = 2182;BA.debugLine="lstNombresCamposIncluidosEnFormula.Add(Matcher";
Debug.JustUpdateDeviceLine();
_lstnombrescamposincluidosenformula.runVoidMethod ("Add",(Object)((_matcher1.runMethod(true,"getMatch").runMethod(true,"replace",(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString("]")),(Object)(RemoteObject.createImmutable(""))))));
 }
;
 BA.debugLineNum = 2185;BA.debugLine="For k=0 To lstNombresCamposIncluidosEnFormula.S";
Debug.JustUpdateDeviceLine();
{
final int step18 = 1;
final int limit18 = RemoteObject.solve(new RemoteObject[] {_lstnombrescamposincluidosenformula.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_k = 0 ;
for (;(step18 > 0 && _k <= limit18) || (step18 < 0 && _k >= limit18) ;_k = ((int)(0 + _k + step18))  ) {
Debug.locals.put("k", _k);
 BA.debugLineNum = 2186;BA.debugLine="If lstNombresCamposCLVIncluidosEnFormulasCampo";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_lstnombrescamposclvincluidosenformulascamposcalculados.runMethod(true,"IndexOf",(Object)(_lstnombrescamposincluidosenformula.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _k))))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 2187;BA.debugLine="lstNombresCamposCLVIncluidosEnFormulasCamposC";
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
 BA.debugLineNum = 2192;BA.debugLine="Return lstNombresCamposCLVIncluidosEnFormulasCamp";
Debug.JustUpdateDeviceLine();
if (true) return _lstnombrescamposclvincluidosenformulascamposcalculados;
 BA.debugLineNum = 2193;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nombrescamposclvnocalculados() throws Exception{
try {
		Debug.PushSubsStack("NombresCamposCLVNoCalculados (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2152);
if (RapidSub.canDelegate("nombrescamposclvnocalculados")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","nombrescamposclvnocalculados");}
RemoteObject _lstnombrescamposclvnocalculados = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstcamposenclv = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 2152;BA.debugLine="private Sub NombresCamposCLVNoCalculados As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2153;BA.debugLine="Dim lstNombresCamposCLVNoCalculados As List";
Debug.JustUpdateDeviceLine();
_lstnombrescamposclvnocalculados = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstNombresCamposCLVNoCalculados", _lstnombrescamposclvnocalculados);
 BA.debugLineNum = 2154;BA.debugLine="lstNombresCamposCLVNoCalculados.Initialize";
Debug.JustUpdateDeviceLine();
_lstnombrescamposclvnocalculados.runVoidMethod ("Initialize");
 BA.debugLineNum = 2155;BA.debugLine="Dim lstCamposEnCLV As List=CargaCamposCLV";
Debug.JustUpdateDeviceLine();
_lstcamposenclv = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstcamposenclv = _cargacamposclv();Debug.locals.put("lstCamposEnCLV", _lstcamposenclv);Debug.locals.put("lstCamposEnCLV", _lstcamposenclv);
 BA.debugLineNum = 2156;BA.debugLine="For i=0 To lstCamposEnCLV.Size-1";
Debug.JustUpdateDeviceLine();
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_lstcamposenclv.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2157;BA.debugLine="Dim m As Map=lstCamposEnCLV.Get(i)";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstcamposenclv.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 2158;BA.debugLine="If False=m.Get(\"CampoCalculado\") Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",jamtableviewcamposbuilder.__c.getField(true,"False"),BA.ObjectToBoolean(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoCalculado"))))))) { 
 BA.debugLineNum = 2159;BA.debugLine="lstNombresCamposCLVNoCalculados.Add(m.Get(\"Camp";
Debug.JustUpdateDeviceLine();
_lstnombrescamposclvnocalculados.runVoidMethod ("Add",(Object)(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Campo"))))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2162;BA.debugLine="Return lstNombresCamposCLVNoCalculados";
Debug.JustUpdateDeviceLine();
if (true) return _lstnombrescamposclvnocalculados;
 BA.debugLineNum = 2163;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private version As Float = 4.01";
jamtableviewcamposbuilder._version = BA.numberCast(float.class, 4.01);
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
jamtableviewcamposbuilder._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 8;BA.debugLine="Private frm As Form";
jamtableviewcamposbuilder._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 9;BA.debugLine="Private clvListaCampos As CustomListView";
jamtableviewcamposbuilder._clvlistacampos = RemoteObject.createNew ("b4j.example.customlistview");
 //BA.debugLineNum = 10;BA.debugLine="Private Dialog As B4XDialog";
jamtableviewcamposbuilder._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");
 //BA.debugLineNum = 11;BA.debugLine="Private xui As XUI";
jamtableviewcamposbuilder._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 12;BA.debugLine="Private dragger As jamTableViewCLVDragger";
jamtableviewcamposbuilder._dragger = RemoteObject.createNew ("b4j.docU.jamtableviewclvdragger");
 //BA.debugLineNum = 13;BA.debugLine="Private FileChooser As FileChooser";
jamtableviewcamposbuilder._filechooser = RemoteObject.createNew ("anywheresoftware.b4j.objects.FileChooserWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private CurrentFile As String";
jamtableviewcamposbuilder._currentfile = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="Private CurrentFileString As String";
jamtableviewcamposbuilder._currentfilestring = RemoteObject.createImmutable("");
 //BA.debugLineNum = 18;BA.debugLine="Private MenuBar1 As MenuBar";
jamtableviewcamposbuilder._menubar1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private cmbTheme As ComboBox";
jamtableviewcamposbuilder._cmbtheme = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private txtID As TextField";
jamtableviewcamposbuilder._txtid = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private cboCampo As ComboBox";
jamtableviewcamposbuilder._cbocampo = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private txtAliasCampo As TextField";
jamtableviewcamposbuilder._txtaliascampo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private cboTipoDato As ComboBox";
jamtableviewcamposbuilder._cbotipodato = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private chkColumnaTableView As CheckBox";
jamtableviewcamposbuilder._chkcolumnatableview = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private chkBoxEsFecha As CheckBox";
jamtableviewcamposbuilder._chkboxesfecha = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private chkBoxCampoCalculado As CheckBox";
jamtableviewcamposbuilder._chkboxcampocalculado = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private txtEncabezadoColumna As TextField";
jamtableviewcamposbuilder._txtencabezadocolumna = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private B4XPlusMinusAncho As B4XPlusMinus";
jamtableviewcamposbuilder._b4xplusminusancho = RemoteObject.createNew ("b4j.docU.b4xplusminus");
 //BA.debugLineNum = 31;BA.debugLine="Private txtOrdenColumna As TextField";
jamtableviewcamposbuilder._txtordencolumna = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private chkColumnaOcultable As CheckBox";
jamtableviewcamposbuilder._chkcolumnaocultable = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private cboTipoControlFiltro As ComboBox";
jamtableviewcamposbuilder._cbotipocontrolfiltro = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private chkboxKeyID As CheckBox";
jamtableviewcamposbuilder._chkboxkeyid = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private lblOrdenKeyID As Label";
jamtableviewcamposbuilder._lblordenkeyid = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private chkBoxNoNulo As CheckBox";
jamtableviewcamposbuilder._chkboxnonulo = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private chkBoxConValorDefecto As CheckBox";
jamtableviewcamposbuilder._chkboxconvalordefecto = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private txtValorDefecto As TextField";
jamtableviewcamposbuilder._txtvalordefecto = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private B4XPlusMinusAnchoBordeCelda As B4XPlusMin";
jamtableviewcamposbuilder._b4xplusminusanchobordecelda = RemoteObject.createNew ("b4j.docU.b4xplusminus");
 //BA.debugLineNum = 43;BA.debugLine="Private cboAlineacionColumna As ComboBox";
jamtableviewcamposbuilder._cboalineacioncolumna = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private cboTipoControlEdicion As ComboBox";
jamtableviewcamposbuilder._cbotipocontroledicion = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private chkBoxEsBooleano As CheckBox";
jamtableviewcamposbuilder._chkboxesbooleano = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private txtValorTrueCampoBooleano As TextField";
jamtableviewcamposbuilder._txtvalortruecampobooleano = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private txtNombreCampoDialogosAux As TextField";
jamtableviewcamposbuilder._txtnombrecampodialogosaux = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Type clvCamposBuilderItemValue(txtID As TextField";
;
 //BA.debugLineNum = 70;BA.debugLine="Type TipoOrigenDatos (TipoOrigenDatos As String,";
;
 //BA.debugLineNum = 72;BA.debugLine="Public TipoControlFiltro_TextField, TipoControlFi";
jamtableviewcamposbuilder._tipocontrolfiltro_textfield = RemoteObject.createImmutable("");
jamtableviewcamposbuilder._tipocontrolfiltro_combobox = RemoteObject.createImmutable("");
jamtableviewcamposbuilder._tipocontrolfiltro_checkbox = RemoteObject.createImmutable("");
jamtableviewcamposbuilder._tipocontrolfiltro_textfieldbutton = RemoteObject.createImmutable("");
 //BA.debugLineNum = 73;BA.debugLine="TipoControlFiltro_TextField = \"TextField\"";
jamtableviewcamposbuilder._tipocontrolfiltro_textfield = BA.ObjectToString("TextField");
 //BA.debugLineNum = 74;BA.debugLine="TipoControlFiltro_ComboBox = \"ComboBox\"";
jamtableviewcamposbuilder._tipocontrolfiltro_combobox = BA.ObjectToString("ComboBox");
 //BA.debugLineNum = 75;BA.debugLine="TipoControlFiltro_CheckBox = \"CheckBox\"";
jamtableviewcamposbuilder._tipocontrolfiltro_checkbox = BA.ObjectToString("CheckBox");
 //BA.debugLineNum = 76;BA.debugLine="TipoControlFiltro_TextFieldButton = \"TextFieldBtn";
jamtableviewcamposbuilder._tipocontrolfiltro_textfieldbutton = BA.ObjectToString("TextFieldBtn");
 //BA.debugLineNum = 78;BA.debugLine="Private CargandoDatos As Boolean";
jamtableviewcamposbuilder._cargandodatos = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 80;BA.debugLine="Private btnCargarListaCamposQuerySQL As Button";
jamtableviewcamposbuilder._btncargarlistacamposquerysql = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 83;BA.debugLine="Private btnCamposToText As Button";
jamtableviewcamposbuilder._btncampostotext = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 85;BA.debugLine="Private btnTextToCampos As Button";
jamtableviewcamposbuilder._btntexttocampos = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 86;BA.debugLine="Private lblTitleCampo As Label";
jamtableviewcamposbuilder._lbltitlecampo = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 87;BA.debugLine="Private lblTitleEncabezado As Label";
jamtableviewcamposbuilder._lbltitleencabezado = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 88;BA.debugLine="Private lblTitleTipoDato As Label";
jamtableviewcamposbuilder._lbltitletipodato = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 89;BA.debugLine="Private lblInfo As Label";
jamtableviewcamposbuilder._lblinfo = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 91;BA.debugLine="Private ColActual, Col1, Col2 As Int";
jamtableviewcamposbuilder._colactual = RemoteObject.createImmutable(0);
jamtableviewcamposbuilder._col1 = RemoteObject.createImmutable(0);
jamtableviewcamposbuilder._col2 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 93;BA.debugLine="Private prefDialog As PreferencesDialog";
jamtableviewcamposbuilder._prefdialog = RemoteObject.createNew ("b4j.docU.preferencesdialog");
 //BA.debugLineNum = 95;BA.debugLine="Private txtIpJRDC As TextField";
jamtableviewcamposbuilder._txtipjrdc = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 96;BA.debugLine="Private txtPuertoJRDC As TextField";
jamtableviewcamposbuilder._txtpuertojrdc = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 97;BA.debugLine="Private txtComandoJRDC As TextField";
jamtableviewcamposbuilder._txtcomandojrdc = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 98;BA.debugLine="Private txtParametrosJRDC As TextField";
jamtableviewcamposbuilder._txtparametrosjrdc = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 100;BA.debugLine="Private txtTipoOrigenDatos As TextField";
jamtableviewcamposbuilder._txttipoorigendatos = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 101;BA.debugLine="Private pnlOrigenSQL As Pane";
jamtableviewcamposbuilder._pnlorigensql = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
 //BA.debugLineNum = 102;BA.debugLine="Private lblTitleTipoOrigenDatos As Label";
jamtableviewcamposbuilder._lbltitletipoorigendatos = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 103;BA.debugLine="Private lblTitleIpJRDC As Label";
jamtableviewcamposbuilder._lbltitleipjrdc = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 104;BA.debugLine="Private lblTitlePuertoJRDC As Label";
jamtableviewcamposbuilder._lbltitlepuertojrdc = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 105;BA.debugLine="Private lblTitleComandoJRDC As Label";
jamtableviewcamposbuilder._lbltitlecomandojrdc = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 106;BA.debugLine="Private lblTitleParametrosJRDC As Label";
jamtableviewcamposbuilder._lbltitleparametrosjrdc = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 108;BA.debugLine="Public DatosOrigenDatos As TipoOrigenDatos";
jamtableviewcamposbuilder._datosorigendatos = RemoteObject.createNew ("b4j.docU.jamtableviewcamposbuilder._tipoorigendatos");
 //BA.debugLineNum = 109;BA.debugLine="Private FechaUltimaModificacion As Long";
jamtableviewcamposbuilder._fechaultimamodificacion = RemoteObject.createImmutable(0L);
 //BA.debugLineNum = 110;BA.debugLine="Private btnEditarOrigenJRDC As Button";
jamtableviewcamposbuilder._btneditarorigenjrdc = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 112;BA.debugLine="Private lstPrimaryKey As List";
jamtableviewcamposbuilder._lstprimarykey = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 113;BA.debugLine="Private CorrigiendoChkBoxEsFecha, CorrigiendoChkB";
jamtableviewcamposbuilder._corrigiendochkboxesfecha = RemoteObject.createImmutable(false);
jamtableviewcamposbuilder._corrigiendochkboxkeyid = RemoteObject.createImmutable(false);
jamtableviewcamposbuilder._corrigiendochkboxesbooleano = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 116;BA.debugLine="Private btnValoresEstiloDefecto As Button";
jamtableviewcamposbuilder._btnvaloresestilodefecto = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 117;BA.debugLine="Private btnValoresEstiloDefectoTodos As Button";
jamtableviewcamposbuilder._btnvaloresestilodefectotodos = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 119;BA.debugLine="Private lblColorFondoEncabezados As B4XView";
jamtableviewcamposbuilder._lblcolorfondoencabezados = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 120;BA.debugLine="Private lblColorTextoEncabezados As B4XView";
jamtableviewcamposbuilder._lblcolortextoencabezados = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 122;BA.debugLine="Private txtRGBColorFondoEncabezados As B4XView";
jamtableviewcamposbuilder._txtrgbcolorfondoencabezados = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 124;BA.debugLine="Private txtRGBColorTextoEncabezados As B4XView";
jamtableviewcamposbuilder._txtrgbcolortextoencabezados = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 125;BA.debugLine="Private lblResetColorFondoEncabezados As B4XView";
jamtableviewcamposbuilder._lblresetcolorfondoencabezados = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 126;BA.debugLine="Private lblResetColorTextoEncabezados As B4XView";
jamtableviewcamposbuilder._lblresetcolortextoencabezados = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 129;BA.debugLine="Private lblColorFondoPanelInfo As B4XView";
jamtableviewcamposbuilder._lblcolorfondopanelinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 130;BA.debugLine="Private lblColorTextoPanelInfo As B4XView";
jamtableviewcamposbuilder._lblcolortextopanelinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 132;BA.debugLine="Private txtRGBColorFondoPanelInfo As B4XView";
jamtableviewcamposbuilder._txtrgbcolorfondopanelinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 133;BA.debugLine="Private lblResetColorFondoPanelInfo As B4XView";
jamtableviewcamposbuilder._lblresetcolorfondopanelinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 134;BA.debugLine="Private txtRGBColorTextoPanelInfo As B4XView";
jamtableviewcamposbuilder._txtrgbcolortextopanelinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 135;BA.debugLine="Private lblResetColorTextoPanelInfo As B4XView";
jamtableviewcamposbuilder._lblresetcolortextopanelinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 138;BA.debugLine="Private lblColorTexto As B4XView";
jamtableviewcamposbuilder._lblcolortexto = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 140;BA.debugLine="Private lblColorFondo As B4XView";
jamtableviewcamposbuilder._lblcolorfondo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 142;BA.debugLine="Private lblColorBorde As B4XView";
jamtableviewcamposbuilder._lblcolorborde = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 147;BA.debugLine="Private lblColorFondoFilasImpares As B4XView";
jamtableviewcamposbuilder._lblcolorfondofilasimpares = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 151;BA.debugLine="Private lblColorFondoFilasPares As B4XView";
jamtableviewcamposbuilder._lblcolorfondofilaspares = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 153;BA.debugLine="Private txtRGBColorFondoFilasImpares As B4XView";
jamtableviewcamposbuilder._txtrgbcolorfondofilasimpares = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 154;BA.debugLine="Private txtRGBColorFondoFilasPares As B4XView";
jamtableviewcamposbuilder._txtrgbcolorfondofilaspares = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 155;BA.debugLine="Private ResetColorFondoFilasImpares As Label";
jamtableviewcamposbuilder._resetcolorfondofilasimpares = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 156;BA.debugLine="Private lblResetColorFondoFilasPares As Label";
jamtableviewcamposbuilder._lblresetcolorfondofilaspares = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 159;BA.debugLine="Private BCColorPickerjamTableView As BCColorPicke";
jamtableviewcamposbuilder._bccolorpickerjamtableview = RemoteObject.createNew ("b4j.docU.bccolorpicker");
 //BA.debugLineNum = 164;BA.debugLine="Private lblColorFondoEncabezadoColumna As B4XView";
jamtableviewcamposbuilder._lblcolorfondoencabezadocolumna = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 165;BA.debugLine="Private txtRGBColorFondoEncabezadoColumna As B4XV";
jamtableviewcamposbuilder._txtrgbcolorfondoencabezadocolumna = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 166;BA.debugLine="Private lblResetColorFondoEncabezadoColumna As B4";
jamtableviewcamposbuilder._lblresetcolorfondoencabezadocolumna = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 167;BA.debugLine="Private lblColorTextoEncabezadoColumna As B4XView";
jamtableviewcamposbuilder._lblcolortextoencabezadocolumna = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 168;BA.debugLine="Private txtRGBColorTextoEncabezadoColumna As B4XV";
jamtableviewcamposbuilder._txtrgbcolortextoencabezadocolumna = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 169;BA.debugLine="Private lblResetColorTextoEncabezadoColumna As B4";
jamtableviewcamposbuilder._lblresetcolortextoencabezadocolumna = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 170;BA.debugLine="Private txtRGBColorTexto As B4XView";
jamtableviewcamposbuilder._txtrgbcolortexto = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 171;BA.debugLine="Private txtRGBColorFondo As B4XView";
jamtableviewcamposbuilder._txtrgbcolorfondo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 172;BA.debugLine="Private lblResetColorFondo As B4XView";
jamtableviewcamposbuilder._lblresetcolorfondo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 173;BA.debugLine="Private txtRGBColorBorde As B4XView";
jamtableviewcamposbuilder._txtrgbcolorborde = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 174;BA.debugLine="Private lblResetColorBorde As B4XView";
jamtableviewcamposbuilder._lblresetcolorborde = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 175;BA.debugLine="Private lblResetColorTexto As B4XView";
jamtableviewcamposbuilder._lblresetcolortexto = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 176;BA.debugLine="Private btnAyudaColorContrasteBordeSeleccion As B";
jamtableviewcamposbuilder._btnayudacolorcontrastebordeseleccion = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 177;BA.debugLine="Private lblContrasteFondoVsBordeSeleccionOK As La";
jamtableviewcamposbuilder._lblcontrastefondovsbordeseleccionok = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 179;BA.debugLine="Private mModoSnap As Boolean=True  ' true: scroll";
jamtableviewcamposbuilder._mmodosnap = jamtableviewcamposbuilder.__c.getField(true,"True");
 //BA.debugLineNum = 180;BA.debugLine="Private OffsetAnterior As Int=1";
jamtableviewcamposbuilder._offsetanterior = BA.numberCast(int.class, 1);
 //BA.debugLineNum = 181;BA.debugLine="Private PrimerPanelVisibleAnterior As Int";
jamtableviewcamposbuilder._primerpanelvisibleanterior = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 182;BA.debugLine="Private ScrollingDown As Boolean";
jamtableviewcamposbuilder._scrollingdown = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 185;BA.debugLine="Private btnBuscarAliasCampo As B4XView";
jamtableviewcamposbuilder._btnbuscaraliascampo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 187;BA.debugLine="Private btnEditarEncabezadoColumna As B4XView";
jamtableviewcamposbuilder._btneditarencabezadocolumna = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _recalcularidordencolumnas() throws Exception{
try {
		Debug.PushSubsStack("RecalcularIDOrdenColumnas (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2844);
if (RapidSub.canDelegate("recalcularidordencolumnas")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","recalcularidordencolumnas");}
RemoteObject _ordencolacum = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 2844;BA.debugLine="private Sub RecalcularIDOrdenColumnas";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2845;BA.debugLine="Dim OrdenColAcum As Int";
Debug.JustUpdateDeviceLine();
_ordencolacum = RemoteObject.createImmutable(0);Debug.locals.put("OrdenColAcum", _ordencolacum);
 BA.debugLineNum = 2846;BA.debugLine="For i=0 To clvListaCampos.Size-1";
Debug.JustUpdateDeviceLine();
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {jamtableviewcamposbuilder._clvlistacampos.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2847;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaC";
Debug.JustUpdateDeviceLine();
_clviv = (jamtableviewcamposbuilder._clvlistacampos.runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 2848;BA.debugLine="clvIV.txtID.Text=i";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtID" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(_i));
 BA.debugLineNum = 2849;BA.debugLine="If clvIV.chkColumnaTableView.Checked Then";
Debug.JustUpdateDeviceLine();
if (_clviv.getField(false,"chkColumnaTableView" /*RemoteObject*/ ).runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2850;BA.debugLine="clvIV.txtOrdenColumna.Text=OrdenColAcum";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtOrdenColumna" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(_ordencolacum));
 BA.debugLineNum = 2851;BA.debugLine="OrdenColAcum=OrdenColAcum+1";
Debug.JustUpdateDeviceLine();
_ordencolacum = RemoteObject.solve(new RemoteObject[] {_ordencolacum,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("OrdenColAcum", _ordencolacum);
 }else {
 BA.debugLineNum = 2853;BA.debugLine="clvIV.txtOrdenColumna.Text=-1";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtOrdenColumna" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(-(double) (0 + 1)));
 };
 BA.debugLineNum = 2855;BA.debugLine="If ColActual=Col1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",jamtableviewcamposbuilder._colactual,BA.numberCast(double.class, jamtableviewcamposbuilder._col1))) { 
 BA.debugLineNum = 2856;BA.debugLine="ColActual=Col2";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._colactual = jamtableviewcamposbuilder._col2;
 }else {
 BA.debugLineNum = 2858;BA.debugLine="ColActual=Col1";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._colactual = jamtableviewcamposbuilder._col1;
 };
 BA.debugLineNum = 2860;BA.debugLine="Dim p As B4XView=clvListaCampos.GetPanel(i)";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = jamtableviewcamposbuilder._clvlistacampos.runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 2861;BA.debugLine="p.Color=ColActual";
Debug.JustUpdateDeviceLine();
_p.runMethod(true,"setColor",jamtableviewcamposbuilder._colactual);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2863;BA.debugLine="Log(\"RecalcularIDOrdenColumnas\")";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder.__c.runVoidMethod ("LogImpl","9206831635",RemoteObject.createImmutable("RecalcularIDOrdenColumnas"),0);
 BA.debugLineNum = 2864;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _recalcularordenkeyid(RemoteObject _keyideliminada) throws Exception{
try {
		Debug.PushSubsStack("RecalcularOrdenKeyID (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,2866);
if (RapidSub.canDelegate("recalcularordenkeyid")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","recalcularordenkeyid", _keyideliminada);}
int _i = 0;
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue");
RemoteObject _keyidlineaclv = RemoteObject.createImmutable(0);
Debug.locals.put("KeyIDEliminada", _keyideliminada);
 BA.debugLineNum = 2866;BA.debugLine="private Sub RecalcularOrdenKeyID(KeyIDEliminada As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2867;BA.debugLine="For i=0 To clvListaCampos.Size-1";
Debug.JustUpdateDeviceLine();
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {jamtableviewcamposbuilder._clvlistacampos.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2868;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaC";
Debug.JustUpdateDeviceLine();
_clviv = (jamtableviewcamposbuilder._clvlistacampos.runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 2869;BA.debugLine="Dim KeyIDLineaCLV As Int=clvIV.lblOrdenKeyID.Tex";
Debug.JustUpdateDeviceLine();
_keyidlineaclv = BA.numberCast(int.class, _clviv.getField(false,"lblOrdenKeyID" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("KeyIDLineaCLV", _keyidlineaclv);Debug.locals.put("KeyIDLineaCLV", _keyidlineaclv);
 BA.debugLineNum = 2870;BA.debugLine="If KeyIDLineaCLV>KeyIDEliminada Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_keyidlineaclv,BA.numberCast(double.class, _keyideliminada))) { 
 BA.debugLineNum = 2871;BA.debugLine="clvIV.lblOrdenKeyID.Text=(KeyIDLineaCLV-1)";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblOrdenKeyID" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString((RemoteObject.solve(new RemoteObject[] {_keyidlineaclv,RemoteObject.createImmutable(1)}, "-",1, 1))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2874;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _recent_click(RemoteObject _recentfile) throws Exception{
try {
		Debug.PushSubsStack("Recent_Click (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,299);
if (RapidSub.canDelegate("recent_click")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","recent_click", _recentfile); return;}
ResumableSub_Recent_Click rsub = new ResumableSub_Recent_Click(null,_recentfile);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Recent_Click extends BA.ResumableSub {
public ResumableSub_Recent_Click(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _recentfile) {
this.parent = parent;
this._recentfile = _recentfile;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _recentfile;
RemoteObject _rbool = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Recent_Click (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,299);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("RecentFile", _recentfile);
 BA.debugLineNum = 300;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.WAIT";
Debug.JustUpdateDeviceLine();
parent._frm.runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",parent._fx.getField(false,"Cursors").getField(false,"WAIT"));
 BA.debugLineNum = 301;BA.debugLine="DeshabilitarNodos";
Debug.JustUpdateDeviceLine();
_deshabilitarnodos();
 BA.debugLineNum = 302;BA.debugLine="wait for (LoadFile(RecentFile)) complete (rBool A";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "recent_click"), _loadfile(_recentfile));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 303;BA.debugLine="HabilitarNodos";
Debug.JustUpdateDeviceLine();
_habilitarnodos();
 BA.debugLineNum = 304;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
Debug.JustUpdateDeviceLine();
parent._frm.runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",parent._fx.getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 305;BA.debugLine="End Sub";
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
public static RemoteObject  _removecss(RemoteObject _n,RemoteObject _csselement) throws Exception{
try {
		Debug.PushSubsStack("RemoveCSS (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,1543);
if (RapidSub.canDelegate("removecss")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","removecss", _n, _csselement);}
RemoteObject _elements = null;
RemoteObject _style = RemoteObject.createImmutable("");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _e = RemoteObject.createImmutable("");
RemoteObject _stringclass = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("N", _n);
Debug.locals.put("CSSElement", _csselement);
 BA.debugLineNum = 1543;BA.debugLine="private Sub RemoveCSS(N As Node, CSSElement As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1545;BA.debugLine="Dim Elements() As String = Regex.Split(\";\",N.Styl";
Debug.JustUpdateDeviceLine();
_elements = jamtableviewcamposbuilder.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(";")),(Object)(_n.runMethod(true,"getStyle")));Debug.locals.put("Elements", _elements);Debug.locals.put("Elements", _elements);
 BA.debugLineNum = 1546;BA.debugLine="Dim Style As String";
Debug.JustUpdateDeviceLine();
_style = RemoteObject.createImmutable("");Debug.locals.put("Style", _style);
 BA.debugLineNum = 1547;BA.debugLine="Dim L As List";
Debug.JustUpdateDeviceLine();
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("L", _l);
 BA.debugLineNum = 1548;BA.debugLine="L.Initialize";
Debug.JustUpdateDeviceLine();
_l.runVoidMethod ("Initialize");
 BA.debugLineNum = 1549;BA.debugLine="For Each E As String In Elements";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group5 = _elements;
final int groupLen5 = group5.getField(true,"length").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_e = group5.getArrayElement(true,RemoteObject.createImmutable(index5));Debug.locals.put("E", _e);
Debug.locals.put("E", _e);
 BA.debugLineNum = 1550;BA.debugLine="If E.Contains(CSSElement) Then Continue";
Debug.JustUpdateDeviceLine();
if (_e.runMethod(true,"contains",(Object)(_csselement)).<Boolean>get().booleanValue()) { 
if (true) continue;};
 BA.debugLineNum = 1551;BA.debugLine="L.Add(E)";
Debug.JustUpdateDeviceLine();
_l.runVoidMethod ("Add",(Object)((_e)));
 }
}Debug.locals.put("E", _e);
;
 BA.debugLineNum = 1555;BA.debugLine="Dim StringClass As JavaObject = \"\"											'ign";
Debug.JustUpdateDeviceLine();
_stringclass = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_stringclass = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), RemoteObject.createImmutable(""));Debug.locals.put("StringClass", _stringclass);Debug.locals.put("StringClass", _stringclass);
 BA.debugLineNum = 1556;BA.debugLine="Style = StringClass.RunMethod(\"join\",Array(\";\",L)";
Debug.JustUpdateDeviceLine();
_style = BA.ObjectToString(_stringclass.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("join")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable((";")),(_l.getObject())}))));Debug.locals.put("Style", _style);
 BA.debugLineNum = 1557;BA.debugLine="Return Style";
Debug.JustUpdateDeviceLine();
if (true) return _style;
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
public static void  _resetcolorfondofilasimpares_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("ResetColorFondoFilasImpares_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3866);
if (RapidSub.canDelegate("resetcolorfondofilasimpares_mouseclicked")) { b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","resetcolorfondofilasimpares_mouseclicked", _eventdata); return;}
ResumableSub_ResetColorFondoFilasImpares_MouseClicked rsub = new ResumableSub_ResetColorFondoFilasImpares_MouseClicked(null,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ResetColorFondoFilasImpares_MouseClicked extends BA.ResumableSub {
public ResumableSub_ResetColorFondoFilasImpares_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,RemoteObject _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamtableviewcamposbuilder parent;
RemoteObject _eventdata;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ResetColorFondoFilasImpares_MouseClicked (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,3866);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 3867;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"Msgbox2Async",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("¿Resetear el color de Fondo de las Filas Impares a su valor por defecto?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3868;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamtableviewcamposbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamtableviewcamposbuilder", "resetcolorfondofilasimpares_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3869;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 3870;BA.debugLine="txtRGBColorFondoFilasImpares.Text=GetCssColorStri";
Debug.JustUpdateDeviceLine();
parent._txtrgbcolorfondofilasimpares.runMethod(true,"setText",_getcsscolorstringfromintcolor(parent._xui.getField(true,"Color_White")));
 BA.debugLineNum = 3871;BA.debugLine="lblColorFondoFilasImpares.Color=xui.Color_White";
Debug.JustUpdateDeviceLine();
parent._lblcolorfondofilasimpares.runMethod(true,"setColor",parent._xui.getField(true,"Color_White"));
 BA.debugLineNum = 3872;BA.debugLine="End Sub";
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
public static RemoteObject  _setcurrentfile(RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetCurrentFile (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,1612);
if (RapidSub.canDelegate("setcurrentfile")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","setcurrentfile", _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 1612;BA.debugLine="private Sub SetCurrentFile (f As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1613;BA.debugLine="CurrentFile = f";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._currentfile = _f;
 BA.debugLineNum = 1614;BA.debugLine="frm.Title = $\"CamposBuilder ($1.2{version})\"$";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._frm.runMethod(true,"setTitle",(RemoteObject.concat(RemoteObject.createImmutable("CamposBuilder ("),jamtableviewcamposbuilder.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((jamtableviewcamposbuilder._version))),RemoteObject.createImmutable(")"))));
 BA.debugLineNum = 1615;BA.debugLine="If f <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_f,BA.ObjectToString(""))) { 
 BA.debugLineNum = 1616;BA.debugLine="frm.Title = frm.Title & \" - \" & File.GetName(f)";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._frm.runMethod(true,"setTitle",RemoteObject.concat(jamtableviewcamposbuilder._frm.runMethod(true,"getTitle"),RemoteObject.createImmutable(" - "),jamtableviewcamposbuilder.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_f))));
 };
 BA.debugLineNum = 1619;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setformmaximized(RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetFormMaximized (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,272);
if (RapidSub.canDelegate("setformmaximized")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","setformmaximized", _f);}
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("f", _f);
 BA.debugLineNum = 272;BA.debugLine="private Sub SetFormMaximized(f As Form)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 274;BA.debugLine="Dim joForm As JavaObject = f";
Debug.JustUpdateDeviceLine();
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _f);Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 276;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.JustUpdateDeviceLine();
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 278;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.JustUpdateDeviceLine();
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(jamtableviewcamposbuilder.__c.getField(true,"True"))})));
 BA.debugLineNum = 279;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlightthemedate(RemoteObject _datetemplate) throws Exception{
try {
		Debug.PushSubsStack("SetLightThemeDate (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,4225);
if (RapidSub.canDelegate("setlightthemedate")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","setlightthemedate", _datetemplate);}
RemoteObject _textcolor = RemoteObject.createImmutable(0);
RemoteObject _x = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("datetemplate", _datetemplate);
 BA.debugLineNum = 4225;BA.debugLine="Sub SetLightThemeDate(datetemplate As B4XDateTempl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 4226;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
Debug.JustUpdateDeviceLine();
_textcolor = jamtableviewcamposbuilder._xui.runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))));Debug.locals.put("TextColor", _textcolor);Debug.locals.put("TextColor", _textcolor);
 BA.debugLineNum = 4227;BA.debugLine="datetemplate.DaysInWeekColor = xui.Color_Black";
Debug.JustUpdateDeviceLine();
_datetemplate.setField ("_daysinweekcolor" /*RemoteObject*/ ,jamtableviewcamposbuilder._xui.getField(true,"Color_Black"));
 BA.debugLineNum = 4228;BA.debugLine="datetemplate.SelectedColor = xui.Color_ARGB(0xFF,";
Debug.JustUpdateDeviceLine();
_datetemplate.setField ("_selectedcolor" /*RemoteObject*/ ,jamtableviewcamposbuilder._xui.runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x39))),(Object)(BA.numberCast(int.class, ((int)0xd7))),(Object)(BA.numberCast(int.class, ((int)0xce)))));
 BA.debugLineNum = 4229;BA.debugLine="datetemplate.HighlightedColor = xui.Color_ARGB(0x";
Debug.JustUpdateDeviceLine();
_datetemplate.setField ("_highlightedcolor" /*RemoteObject*/ ,jamtableviewcamposbuilder._xui.runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x00))),(Object)(BA.numberCast(int.class, ((int)0xce))),(Object)(BA.numberCast(int.class, ((int)0xff)))));
 BA.debugLineNum = 4230;BA.debugLine="datetemplate.DaysInMonthColor = TextColor";
Debug.JustUpdateDeviceLine();
_datetemplate.setField ("_daysinmonthcolor" /*RemoteObject*/ ,_textcolor);
 BA.debugLineNum = 4231;BA.debugLine="datetemplate.lblMonth.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
_datetemplate.getField(false,"_lblmonth" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);
 BA.debugLineNum = 4232;BA.debugLine="datetemplate.lblYear.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
_datetemplate.getField(false,"_lblyear" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);
 BA.debugLineNum = 4233;BA.debugLine="datetemplate.SelectedColor = xui.Color_ARGB(0xFF,";
Debug.JustUpdateDeviceLine();
_datetemplate.setField ("_selectedcolor" /*RemoteObject*/ ,jamtableviewcamposbuilder._xui.runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0xa7))),(Object)(BA.numberCast(int.class, ((int)0x61)))));
 BA.debugLineNum = 4234;BA.debugLine="For Each x As B4XView In Array(datetemplate.btnMo";
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
 BA.debugLineNum = 4235;BA.debugLine="x.Color = xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
_x.runMethod(true,"setColor",jamtableviewcamposbuilder._xui.getField(true,"Color_Transparent"));
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 4237;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlightthemedialog(RemoteObject _dlg) throws Exception{
try {
		Debug.PushSubsStack("SetLightThemeDialog (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,4191);
if (RapidSub.canDelegate("setlightthemedialog")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","setlightthemedialog", _dlg);}
Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 4191;BA.debugLine="Sub SetLightThemeDialog(dlg As B4XDialog)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 4192;BA.debugLine="dlg.BackgroundColor = xui.Color_White";
Debug.JustUpdateDeviceLine();
_dlg.setField ("_backgroundcolor" /*RemoteObject*/ ,jamtableviewcamposbuilder._xui.getField(true,"Color_White"));
 BA.debugLineNum = 4193;BA.debugLine="dlg.ButtonsColor = xui.Color_White";
Debug.JustUpdateDeviceLine();
_dlg.setField ("_buttonscolor" /*RemoteObject*/ ,jamtableviewcamposbuilder._xui.getField(true,"Color_White"));
 BA.debugLineNum = 4194;BA.debugLine="dlg.BorderColor = xui.Color_Gray";
Debug.JustUpdateDeviceLine();
_dlg.setField ("_bordercolor" /*RemoteObject*/ ,jamtableviewcamposbuilder._xui.getField(true,"Color_Gray"));
 BA.debugLineNum = 4195;BA.debugLine="dlg.ButtonsTextColor = xui.Color_ARGB(0xFF, 0x00,";
Debug.JustUpdateDeviceLine();
_dlg.setField ("_buttonstextcolor" /*RemoteObject*/ ,jamtableviewcamposbuilder._xui.runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x00))),(Object)(BA.numberCast(int.class, ((int)0x7d))),(Object)(BA.numberCast(int.class, ((int)0xc3)))));
 BA.debugLineNum = 4196;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlightthemeinput(RemoteObject _input) throws Exception{
try {
		Debug.PushSubsStack("SetLightThemeInput (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,4206);
if (RapidSub.canDelegate("setlightthemeinput")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","setlightthemeinput", _input);}
RemoteObject _textcolor = RemoteObject.createImmutable(0);
Debug.locals.put("input", _input);
 BA.debugLineNum = 4206;BA.debugLine="Sub SetLightThemeInput(input As B4XInputTemplate)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 4207;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
Debug.JustUpdateDeviceLine();
_textcolor = jamtableviewcamposbuilder._xui.runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))));Debug.locals.put("TextColor", _textcolor);Debug.locals.put("TextColor", _textcolor);
 BA.debugLineNum = 4208;BA.debugLine="input.TextField1.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
_input.getField(false,"_textfield1" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);
 BA.debugLineNum = 4209;BA.debugLine="input.lblTitle.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
_input.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);
 BA.debugLineNum = 4210;BA.debugLine="input.SetBorderColor(TextColor, xui.Color_Red)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.docU.b4xinputtemplate.class, "_setbordercolor" /*RemoteObject*/ ,(Object)(_textcolor),(Object)(jamtableviewcamposbuilder._xui.getField(true,"Color_Red")));
 BA.debugLineNum = 4211;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlightthemelist(RemoteObject _list) throws Exception{
try {
		Debug.PushSubsStack("SetLightThemeList (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,4198);
if (RapidSub.canDelegate("setlightthemelist")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","setlightthemelist", _list);}
RemoteObject _textcolor = RemoteObject.createImmutable(0);
Debug.locals.put("list", _list);
 BA.debugLineNum = 4198;BA.debugLine="Sub SetLightThemeList(list As B4XListTemplate)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 4199;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
Debug.JustUpdateDeviceLine();
_textcolor = jamtableviewcamposbuilder._xui.runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))));Debug.locals.put("TextColor", _textcolor);Debug.locals.put("TextColor", _textcolor);
 BA.debugLineNum = 4200;BA.debugLine="list.CustomListView1.sv.ScrollViewInnerPanel.Colo";
Debug.JustUpdateDeviceLine();
_list.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",jamtableviewcamposbuilder._xui.runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0xdf))),(Object)(BA.numberCast(int.class, ((int)0xdf))),(Object)(BA.numberCast(int.class, ((int)0xdf)))));
 BA.debugLineNum = 4201;BA.debugLine="list.CustomListView1.sv.Color = xui.Color_White";
Debug.JustUpdateDeviceLine();
_list.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"setColor",jamtableviewcamposbuilder._xui.getField(true,"Color_White"));
 BA.debugLineNum = 4202;BA.debugLine="list.CustomListView1.DefaultTextBackgroundColor =";
Debug.JustUpdateDeviceLine();
_list.getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_defaulttextbackgroundcolor",jamtableviewcamposbuilder._xui.getField(true,"Color_White"));
 BA.debugLineNum = 4203;BA.debugLine="list.CustomListView1.DefaultTextColor = TextColor";
Debug.JustUpdateDeviceLine();
_list.getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_defaulttextcolor",_textcolor);
 BA.debugLineNum = 4204;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlightthemesearch(RemoteObject _search) throws Exception{
try {
		Debug.PushSubsStack("SetLightThemeSearch (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,4213);
if (RapidSub.canDelegate("setlightthemesearch")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","setlightthemesearch", _search);}
RemoteObject _textcolor = RemoteObject.createImmutable(0);
Debug.locals.put("search", _search);
 BA.debugLineNum = 4213;BA.debugLine="Sub SetLightThemeSearch(search As B4XSearchTemplat";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 4214;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
Debug.JustUpdateDeviceLine();
_textcolor = jamtableviewcamposbuilder._xui.runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))));Debug.locals.put("TextColor", _textcolor);Debug.locals.put("TextColor", _textcolor);
 BA.debugLineNum = 4215;BA.debugLine="search.SearchField.TextField.TextColor = TextColo";
Debug.JustUpdateDeviceLine();
_search.getField(false,"_searchfield" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xfloattextfield.class, "_gettextfield" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);
 BA.debugLineNum = 4216;BA.debugLine="search.SearchField.NonFocusedHintColor = TextColo";
Debug.JustUpdateDeviceLine();
_search.getField(false,"_searchfield" /*RemoteObject*/ ).setField ("_nonfocusedhintcolor" /*RemoteObject*/ ,_textcolor);
 BA.debugLineNum = 4217;BA.debugLine="search.CustomListView1.sv.ScrollViewInnerPanel.Co";
Debug.JustUpdateDeviceLine();
_search.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",jamtableviewcamposbuilder._xui.runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0xdf))),(Object)(BA.numberCast(int.class, ((int)0xdf))),(Object)(BA.numberCast(int.class, ((int)0xdf)))));
 BA.debugLineNum = 4218;BA.debugLine="search.CustomListView1.sv.Color = xui.Color_White";
Debug.JustUpdateDeviceLine();
_search.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"setColor",jamtableviewcamposbuilder._xui.getField(true,"Color_White"));
 BA.debugLineNum = 4219;BA.debugLine="search.CustomListView1.DefaultTextBackgroundColor";
Debug.JustUpdateDeviceLine();
_search.getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_defaulttextbackgroundcolor",jamtableviewcamposbuilder._xui.getField(true,"Color_White"));
 BA.debugLineNum = 4220;BA.debugLine="search.CustomListView1.DefaultTextColor = TextCol";
Debug.JustUpdateDeviceLine();
_search.getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_defaulttextcolor",_textcolor);
 BA.debugLineNum = 4221;BA.debugLine="If search.SearchField.lblV.IsInitialized Then sea";
Debug.JustUpdateDeviceLine();
if (_search.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblv" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_search.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblv" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);};
 BA.debugLineNum = 4222;BA.debugLine="If search.SearchField.lblClear.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_search.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_search.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);};
 BA.debugLineNum = 4223;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject _rutaficherojsonjamtableview) throws Exception{
try {
		Debug.PushSubsStack("Show (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,193);
if (RapidSub.canDelegate("show")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","show", _rutaficherojsonjamtableview);}
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
RemoteObject _joclvdatosscrollpane = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("RutaFicheroJSONjamTableView", _rutaficherojsonjamtableview);
 BA.debugLineNum = 193;BA.debugLine="Sub Show(RutaFicheroJSONjamTableView As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 196;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(\"\",\"\",\"\",\"";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._datosorigendatos = _createtipoorigendatos(BA.ObjectToString(""),BA.ObjectToString(""),BA.ObjectToString(""),BA.ObjectToString(""),BA.ObjectToString(jamtableviewcamposbuilder.__c.getField(false,"Null")));
 BA.debugLineNum = 197;BA.debugLine="FechaUltimaModificacion=-1";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._fechaultimamodificacion = BA.numberCast(long.class, -(double) (0 + 1));
 BA.debugLineNum = 199;BA.debugLine="If frm.IsInitialized=False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",jamtableviewcamposbuilder._frm.runMethod(true,"IsInitialized"),jamtableviewcamposbuilder.__c.getField(true,"False"))) { 
 BA.debugLineNum = 200;BA.debugLine="Col2=0XFF696969";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._col2 = BA.numberCast(int.class, ((int)0xff696969));
 BA.debugLineNum = 202;BA.debugLine="Col1=0xFF424242";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._col1 = BA.numberCast(int.class, ((int)0xff424242));
 BA.debugLineNum = 204;BA.debugLine="frm.Initialize(\"frm\",1024,768)";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._frm.runVoidMethod ("Initialize",jamtableviewcamposbuilder.ba,(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, 1024)),(Object)(BA.numberCast(double.class, 768)));
 BA.debugLineNum = 205;BA.debugLine="frm.RootPane.LoadLayout(\"scrCamposJAMTableViewBu";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._frm.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",jamtableviewcamposbuilder.ba,(Object)(RemoteObject.createImmutable("scrCamposJAMTableViewBuilder")));
 BA.debugLineNum = 206;BA.debugLine="clvListaCampos.DefaultTextColor = xui.Color_Whit";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._clvlistacampos.setField ("_defaulttextcolor",jamtableviewcamposbuilder._xui.getField(true,"Color_White"));
 BA.debugLineNum = 207;BA.debugLine="Dialog.Initialize(frm.RootPane)";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,jamtableviewcamposbuilder.ba,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), jamtableviewcamposbuilder._frm.runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 208;BA.debugLine="Dialog.Title = \"Campos Builder\"";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Campos Builder")));
 BA.debugLineNum = 209;BA.debugLine="Dim n As Node = clvListaCampos.sv";
Debug.JustUpdateDeviceLine();
_n = RemoteObject.createNew ("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
_n = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), jamtableviewcamposbuilder._clvlistacampos.getField(false,"_sv").getObject());Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 210;BA.debugLine="n.StyleClasses.Add(\"b4xdialog\")";
Debug.JustUpdateDeviceLine();
_n.runMethod(false,"getStyleClasses").runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("b4xdialog"))));
 BA.debugLineNum = 211;BA.debugLine="Log(\"pnlOrigenSQL.IsInitialized: \" & pnlOrigenSQ";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder.__c.runVoidMethod ("LogImpl","9203489298",RemoteObject.concat(RemoteObject.createImmutable("pnlOrigenSQL.IsInitialized: "),jamtableviewcamposbuilder._pnlorigensql.runMethod(true,"IsInitialized")),0);
 BA.debugLineNum = 212;BA.debugLine="pnlOrigenSQL.Visible=False";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._pnlorigensql.runMethod(true,"setVisible",jamtableviewcamposbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 216;BA.debugLine="Dim JOClvDatosScrollpane As JavaObject=clvListaC";
Debug.JustUpdateDeviceLine();
_joclvdatosscrollpane = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joclvdatosscrollpane = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), jamtableviewcamposbuilder._clvlistacampos.getField(false,"_sv").getObject());Debug.locals.put("JOClvDatosScrollpane", _joclvdatosscrollpane);Debug.locals.put("JOClvDatosScrollpane", _joclvdatosscrollpane);
 BA.debugLineNum = 217;BA.debugLine="JOClvDatosScrollpane.RunMethod(\"setHbarPolicy\",A";
Debug.JustUpdateDeviceLine();
_joclvdatosscrollpane.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setHbarPolicy")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("ALWAYS"))})));
 BA.debugLineNum = 218;BA.debugLine="JOClvDatosScrollpane.RunMethod(\"setVbarPolicy\",A";
Debug.JustUpdateDeviceLine();
_joclvdatosscrollpane.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setVbarPolicy")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("ALWAYS"))})));
 BA.debugLineNum = 220;BA.debugLine="dragger.Initialize(clvListaCampos)";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._dragger.runClassMethod (b4j.docU.jamtableviewclvdragger.class, "_initialize" /*RemoteObject*/ ,jamtableviewcamposbuilder.ba,(Object)(jamtableviewcamposbuilder._clvlistacampos));
 BA.debugLineNum = 223;BA.debugLine="FileChooser.Initialize";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._filechooser.runVoidMethod ("Initialize");
 BA.debugLineNum = 225;BA.debugLine="FileChooser.SetExtensionFilter(\"JSON\", Array(\"*.";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._filechooser.runVoidMethod ("SetExtensionFilter",(Object)(BA.ObjectToString("JSON")),(Object)(jamtableviewcamposbuilder.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("*.json"))})))));
 BA.debugLineNum = 229;BA.debugLine="cmbTheme.SelectedIndex = 0";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._cmbtheme.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 234;BA.debugLine="CurrentFile=\"\"";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._currentfile = BA.ObjectToString("");
 BA.debugLineNum = 235;BA.debugLine="SetFormMaximized(frm)";
Debug.JustUpdateDeviceLine();
_setformmaximized(jamtableviewcamposbuilder._frm);
 BA.debugLineNum = 236;BA.debugLine="clvListaCampos.Clear";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._clvlistacampos.runVoidMethod ("_clear");
 BA.debugLineNum = 237;BA.debugLine="MostrarDatosOrigenDatos";
Debug.JustUpdateDeviceLine();
_mostrardatosorigendatos();
 BA.debugLineNum = 238;BA.debugLine="frm.Show";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._frm.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 240;BA.debugLine="frm.Title = $\"CamposBuilder ($1.2{version})\"$";
Debug.JustUpdateDeviceLine();
jamtableviewcamposbuilder._frm.runMethod(true,"setTitle",(RemoteObject.concat(RemoteObject.createImmutable("CamposBuilder ("),jamtableviewcamposbuilder.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((jamtableviewcamposbuilder._version))),RemoteObject.createImmutable(")"))));
 BA.debugLineNum = 241;BA.debugLine="Inicio(RutaFicheroJSONjamTableView)";
Debug.JustUpdateDeviceLine();
_inicio(_rutaficherojsonjamtableview);
 BA.debugLineNum = 242;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtencabezadocolumna_action() throws Exception{
try {
		Debug.PushSubsStack("txtEncabezadoColumna_Action (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,4240);
if (RapidSub.canDelegate("txtencabezadocolumna_action")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","txtencabezadocolumna_action");}
 BA.debugLineNum = 4240;BA.debugLine="Private Sub txtEncabezadoColumna_Action";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 4242;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtencabezadocolumna_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("txtEncabezadoColumna_FocusChanged (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,4244);
if (RapidSub.canDelegate("txtencabezadocolumna_focuschanged")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","txtencabezadocolumna_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 4244;BA.debugLine="Private Sub txtEncabezadoColumna_FocusChanged (Has";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 4246;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtencabezadocolumna_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("txtEncabezadoColumna_TextChanged (jamtableviewcamposbuilder) ","jamtableviewcamposbuilder",96,jamtableviewcamposbuilder.ba,jamtableviewcamposbuilder.mostCurrent,4248);
if (RapidSub.canDelegate("txtencabezadocolumna_textchanged")) { return b4j.docU.jamtableviewcamposbuilder.remoteMe.runUserSub(false, "jamtableviewcamposbuilder","txtencabezadocolumna_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 4248;BA.debugLine="Private Sub txtEncabezadoColumna_TextChanged (Old";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 4250;BA.debugLine="End Sub";
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