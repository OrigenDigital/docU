package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class jamrecordformbuilder_subs_0 {


public static RemoteObject  _additem(RemoteObject _minfo) throws Exception{
try {
		Debug.PushSubsStack("AddItem (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,403);
if (RapidSub.canDelegate("additem")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","additem", _minfo);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamrecordformbuilder._clvrecordformitemvalue");
RemoteObject _mextras = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("mInfo", _minfo);
 BA.debugLineNum = 403;BA.debugLine="Sub AddItem (mInfo As Map)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 405;BA.debugLine="If ColActual=Col1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",jamrecordformbuilder._colactual,BA.numberCast(double.class, jamrecordformbuilder._col1))) { 
 BA.debugLineNum = 406;BA.debugLine="ColActual=Col2";
Debug.JustUpdateDeviceLine();
jamrecordformbuilder._colactual = jamrecordformbuilder._col2;
 }else {
 BA.debugLineNum = 408;BA.debugLine="ColActual=Col1";
Debug.JustUpdateDeviceLine();
jamrecordformbuilder._colactual = jamrecordformbuilder._col1;
 };
 BA.debugLineNum = 411;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = jamrecordformbuilder._xui.runMethod(false,"CreatePanel",jamrecordformbuilder.ba,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 412;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, clvListaCampos.AsV";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(jamrecordformbuilder._clvlistacampos.runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(BA.numberCast(double.class, jamrecordformbuilder.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 105))))));
 BA.debugLineNum = 413;BA.debugLine="pnl.LoadLayout(\"scrItemRecordForm2\")";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrItemRecordForm2")),jamrecordformbuilder.ba);
 BA.debugLineNum = 414;BA.debugLine="pnl.Color=ColActual";
Debug.JustUpdateDeviceLine();
_pnl.runMethod(true,"setColor",jamrecordformbuilder._colactual);
 BA.debugLineNum = 416;BA.debugLine="Dim clvIV As clvRecordFormItemValue";
Debug.JustUpdateDeviceLine();
_clviv = RemoteObject.createNew ("b4j.docU.jamrecordformbuilder._clvrecordformitemvalue");Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 418;BA.debugLine="clvIV.btnBorrarItem=btnDelete";
Debug.JustUpdateDeviceLine();
_clviv.setField ("btnBorrarItem" /*RemoteObject*/ ,jamrecordformbuilder._btndelete);
 BA.debugLineNum = 419;BA.debugLine="clvIV.chkBoxControlIndependiente=chkBoxControlInd";
Debug.JustUpdateDeviceLine();
_clviv.setField ("chkBoxControlIndependiente" /*RemoteObject*/ ,jamrecordformbuilder._chkboxcontrolindependiente);
 BA.debugLineNum = 420;BA.debugLine="clvIV.chkboxKeyID=chkboxKeyID";
Debug.JustUpdateDeviceLine();
_clviv.setField ("chkboxKeyID" /*RemoteObject*/ ,jamrecordformbuilder._chkboxkeyid);
 BA.debugLineNum = 422;BA.debugLine="clvIV.txtCampo=txtCampo";
Debug.JustUpdateDeviceLine();
_clviv.setField ("txtCampo" /*RemoteObject*/ ,jamrecordformbuilder._txtcampo);
 BA.debugLineNum = 423;BA.debugLine="clvIV.cboTipoDato=cboTipoDato";
Debug.JustUpdateDeviceLine();
_clviv.setField ("cboTipoDato" /*RemoteObject*/ ,jamrecordformbuilder._cbotipodato);
 BA.debugLineNum = 424;BA.debugLine="clvIV.chkBoxEsFecha=chkBoxEsFecha";
Debug.JustUpdateDeviceLine();
_clviv.setField ("chkBoxEsFecha" /*RemoteObject*/ ,jamrecordformbuilder._chkboxesfecha);
 BA.debugLineNum = 425;BA.debugLine="clvIV.txtTituloCampo=txtTituloCampo";
Debug.JustUpdateDeviceLine();
_clviv.setField ("txtTituloCampo" /*RemoteObject*/ ,jamrecordformbuilder._txttitulocampo);
 BA.debugLineNum = 426;BA.debugLine="clvIV.txtOrdenColumna=txtOrdenColumna";
Debug.JustUpdateDeviceLine();
_clviv.setField ("txtOrdenColumna" /*RemoteObject*/ ,jamrecordformbuilder._txtordencolumna);
 BA.debugLineNum = 427;BA.debugLine="clvIV.cboTipoControl=cboTipoControl";
Debug.JustUpdateDeviceLine();
_clviv.setField ("cboTipoControl" /*RemoteObject*/ ,jamrecordformbuilder._cbotipocontrol);
 BA.debugLineNum = 428;BA.debugLine="clvIV.chkBoxControlEditable=chkBoxControlEditable";
Debug.JustUpdateDeviceLine();
_clviv.setField ("chkBoxControlEditable" /*RemoteObject*/ ,jamrecordformbuilder._chkboxcontroleditable);
 BA.debugLineNum = 429;BA.debugLine="clvIV.chkBoxAutoIncremental=chkBoxAutoIncremental";
Debug.JustUpdateDeviceLine();
_clviv.setField ("chkBoxAutoIncremental" /*RemoteObject*/ ,jamrecordformbuilder._chkboxautoincremental);
 BA.debugLineNum = 430;BA.debugLine="clvIV.chkBoxNoNulo=chkBoxNoNulo";
Debug.JustUpdateDeviceLine();
_clviv.setField ("chkBoxNoNulo" /*RemoteObject*/ ,jamrecordformbuilder._chkboxnonulo);
 BA.debugLineNum = 431;BA.debugLine="clvIV.txtTipoDatoMySQL=txtTipoDatoMySQL";
Debug.JustUpdateDeviceLine();
_clviv.setField ("txtTipoDatoMySQL" /*RemoteObject*/ ,jamrecordformbuilder._txttipodatomysql);
 BA.debugLineNum = 432;BA.debugLine="clvIV.txtValorCampoPorDefecto=txtValorCampoPorDef";
Debug.JustUpdateDeviceLine();
_clviv.setField ("txtValorCampoPorDefecto" /*RemoteObject*/ ,jamrecordformbuilder._txtvalorcampopordefecto);
 BA.debugLineNum = 433;BA.debugLine="clvIV.txtInfoCampo=txtInfoCampo";
Debug.JustUpdateDeviceLine();
_clviv.setField ("txtInfoCampo" /*RemoteObject*/ ,jamrecordformbuilder._txtinfocampo);
 BA.debugLineNum = 447;BA.debugLine="clvIV.lblTitleTipoDatosAux=lblTitleTipoDatosAux";
Debug.JustUpdateDeviceLine();
_clviv.setField ("lblTitleTipoDatosAux" /*RemoteObject*/ ,jamrecordformbuilder._lbltitletipodatosaux);
 BA.debugLineNum = 448;BA.debugLine="clvIV.cboTipoDatosAux=cboTipoDatosAux";
Debug.JustUpdateDeviceLine();
_clviv.setField ("cboTipoDatosAux" /*RemoteObject*/ ,jamrecordformbuilder._cbotipodatosaux);
 BA.debugLineNum = 450;BA.debugLine="clvIV.lblTitleListaValoresDatosAux=lblTitleListaV";
Debug.JustUpdateDeviceLine();
_clviv.setField ("lblTitleListaValoresDatosAux" /*RemoteObject*/ ,jamrecordformbuilder._lbltitlelistavaloresdatosaux);
 BA.debugLineNum = 451;BA.debugLine="clvIV.txtListaValoresDatosAux=txtListaValoresDato";
Debug.JustUpdateDeviceLine();
_clviv.setField ("txtListaValoresDatosAux" /*RemoteObject*/ ,jamrecordformbuilder._txtlistavaloresdatosaux);
 BA.debugLineNum = 453;BA.debugLine="clvIV.btnIgualOrigenDatosAux=btnIgualOrigenDatosA";
Debug.JustUpdateDeviceLine();
_clviv.setField ("btnIgualOrigenDatosAux" /*RemoteObject*/ ,jamrecordformbuilder._btnigualorigendatosaux);
 BA.debugLineNum = 454;BA.debugLine="clvIV.lblTitleIPJrdcOrigenDatosAux=lblTitleIPJrdc";
Debug.JustUpdateDeviceLine();
_clviv.setField ("lblTitleIPJrdcOrigenDatosAux" /*RemoteObject*/ ,jamrecordformbuilder._lbltitleipjrdcorigendatosaux);
 BA.debugLineNum = 455;BA.debugLine="clvIV.txtIPJrdcOrigenDatosAux=txtIPJrdcOrigenDato";
Debug.JustUpdateDeviceLine();
_clviv.setField ("txtIPJrdcOrigenDatosAux" /*RemoteObject*/ ,jamrecordformbuilder._txtipjrdcorigendatosaux);
 BA.debugLineNum = 456;BA.debugLine="clvIV.lblTitlePuertoJrdcOrigenDatosAux=lblTitlePu";
Debug.JustUpdateDeviceLine();
_clviv.setField ("lblTitlePuertoJrdcOrigenDatosAux" /*RemoteObject*/ ,jamrecordformbuilder._lbltitlepuertojrdcorigendatosaux);
 BA.debugLineNum = 457;BA.debugLine="clvIV.txtPuertoJrdcOrigenDatosAux=txtPuertoJrdcOr";
Debug.JustUpdateDeviceLine();
_clviv.setField ("txtPuertoJrdcOrigenDatosAux" /*RemoteObject*/ ,jamrecordformbuilder._txtpuertojrdcorigendatosaux);
 BA.debugLineNum = 458;BA.debugLine="clvIV.lblTitleComandoConfigDatosAux=lblTitleComan";
Debug.JustUpdateDeviceLine();
_clviv.setField ("lblTitleComandoConfigDatosAux" /*RemoteObject*/ ,jamrecordformbuilder._lbltitlecomandoconfigdatosaux);
 BA.debugLineNum = 459;BA.debugLine="clvIV.txtComandoConfigDatosAux=txtComandoConfigDa";
Debug.JustUpdateDeviceLine();
_clviv.setField ("txtComandoConfigDatosAux" /*RemoteObject*/ ,jamrecordformbuilder._txtcomandoconfigdatosaux);
 BA.debugLineNum = 460;BA.debugLine="clvIV.lblTitleParametrosComandoDatosAux=lblTitleP";
Debug.JustUpdateDeviceLine();
_clviv.setField ("lblTitleParametrosComandoDatosAux" /*RemoteObject*/ ,jamrecordformbuilder._lbltitleparametroscomandodatosaux);
 BA.debugLineNum = 461;BA.debugLine="clvIV.txtParametrosComandoDatosAux=txtParametrosC";
Debug.JustUpdateDeviceLine();
_clviv.setField ("txtParametrosComandoDatosAux" /*RemoteObject*/ ,jamrecordformbuilder._txtparametroscomandodatosaux);
 BA.debugLineNum = 462;BA.debugLine="clvIV.lblTitleNumCamposDatosAux=lblTitleNumCampos";
Debug.JustUpdateDeviceLine();
_clviv.setField ("lblTitleNumCamposDatosAux" /*RemoteObject*/ ,jamrecordformbuilder._lbltitlenumcamposdatosaux);
 BA.debugLineNum = 463;BA.debugLine="clvIV.B4XPlusMinusNumCamposDatosAux=B4XPlusMinusN";
Debug.JustUpdateDeviceLine();
_clviv.setField ("B4XPlusMinusNumCamposDatosAux" /*RemoteObject*/ ,jamrecordformbuilder._b4xplusminusnumcamposdatosaux);
 BA.debugLineNum = 465;BA.debugLine="clvIV.btnBorrarItem.Visible=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"btnBorrarItem" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 466;BA.debugLine="clvIV.chkBoxControlIndependiente.Checked=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxControlIndependiente" /*RemoteObject*/ ).runMethod(true,"setChecked",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 467;BA.debugLine="clvIV.txtCampo.text=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtCampo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 469;BA.debugLine="clvIV.cboTipoControl.Items.AddAll(Array As String";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoControl" /*RemoteObject*/ ).runMethod(false,"getItems").runVoidMethod ("AddAll",(Object)(jamrecordformbuilder.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {9},new Object[] {BA.ObjectToString(""),jamrecordformbuilder._tipocontrol_textfield,jamrecordformbuilder._tipocontrol_b4xinputdialogtextfield,jamrecordformbuilder._tipocontrol_b4xlistdialogtextfield,jamrecordformbuilder._tipocontrol_b4xsearchlistdialogtextfield,jamrecordformbuilder._tipocontrol_checkbox,jamrecordformbuilder._tipocontrol_textfieldbuttonselfecha,jamrecordformbuilder._tipocontrol_textfieldbuttonselfile,jamrecordformbuilder._tipocontrol_textfieldbuttonselext})))));
 BA.debugLineNum = 472;BA.debugLine="clvIV.cboTipoControl.Value=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoControl" /*RemoteObject*/ ).runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 473;BA.debugLine="clvIV.cboTipoDato.Items.AddAll(Array As String(\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getItems").runVoidMethod ("AddAll",(Object)(jamrecordformbuilder.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.ObjectToString(""),BA.ObjectToString("TEXT"),BA.ObjectToString("REAL"),BA.ObjectToString("INTEGER"),RemoteObject.createImmutable("BLOB")})))));
 BA.debugLineNum = 474;BA.debugLine="clvIV.cboTipoDato.Value=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 475;BA.debugLine="clvIV.chkBoxControlEditable.Checked=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"setChecked",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 476;BA.debugLine="clvIV.txtTipoDatoMySQL.Text=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtTipoDatoMySQL" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 477;BA.debugLine="clvIV.chkboxKeyID.Checked=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkboxKeyID" /*RemoteObject*/ ).runMethod(true,"setChecked",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 479;BA.debugLine="clvIV.chkBoxEsFecha.Checked=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxEsFecha" /*RemoteObject*/ ).runMethod(true,"setChecked",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 480;BA.debugLine="clvIV.txtValorCampoPorDefecto.Text=Null";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtValorCampoPorDefecto" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(jamrecordformbuilder.__c.getField(false,"Null")));
 BA.debugLineNum = 481;BA.debugLine="clvIV.txtInfoCampo.Text=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtInfoCampo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 508;BA.debugLine="clvIV.cboTipoDatosAux.Items.AddAll(Array As Strin";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoDatosAux" /*RemoteObject*/ ).runMethod(false,"getItems").runVoidMethod ("AddAll",(Object)(jamrecordformbuilder.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString(""),BA.ObjectToString("Lista"),RemoteObject.createImmutable("Consulta")})))));
 BA.debugLineNum = 509;BA.debugLine="clvIV.cboTipoDatosAux.Value=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoDatosAux" /*RemoteObject*/ ).runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 511;BA.debugLine="B4XPlusMinusNumCamposDatosAux.SetNumericRange(1,2";
Debug.JustUpdateDeviceLine();
jamrecordformbuilder._b4xplusminusnumcamposdatosaux.runClassMethod (b4j.docU.b4xplusminus.class, "_setnumericrange" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, 1)),(Object)(BA.numberCast(double.class, 2)),(Object)(BA.numberCast(double.class, 1)));
 BA.debugLineNum = 513;BA.debugLine="clvIV.lblTitleTipoDatosAux.Visible=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleTipoDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 514;BA.debugLine="clvIV.cboTipoDatosAux.Visible=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 516;BA.debugLine="clvIV.lblTitleListaValoresDatosAux.Visible=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleListaValoresDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 517;BA.debugLine="clvIV.txtListaValoresDatosAux.Visible=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtListaValoresDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 519;BA.debugLine="clvIV.btnIgualOrigenDatosAux.Visible=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"btnIgualOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 520;BA.debugLine="clvIV.lblTitleIPJrdcOrigenDatosAux.Visible=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleIPJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 521;BA.debugLine="clvIV.txtIPJrdcOrigenDatosAux.Visible=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtIPJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 522;BA.debugLine="clvIV.lblTitlePuertoJrdcOrigenDatosAux.Visible=Fa";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitlePuertoJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 523;BA.debugLine="clvIV.txtPuertoJrdcOrigenDatosAux.Visible=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtPuertoJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 524;BA.debugLine="clvIV.lblTitleComandoConfigDatosAux.Visible=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleComandoConfigDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 525;BA.debugLine="clvIV.txtComandoConfigDatosAux.Visible=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtComandoConfigDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 526;BA.debugLine="clvIV.lblTitleParametrosComandoDatosAux.Visible=F";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleParametrosComandoDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 527;BA.debugLine="clvIV.txtParametrosComandoDatosAux.Visible=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtParametrosComandoDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 528;BA.debugLine="clvIV.lblTitleNumCamposDatosAux.Visible=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleNumCamposDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 529;BA.debugLine="clvIV.B4XPlusMinusNumCamposDatosAux.mBase.Visible";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"B4XPlusMinusNumCamposDatosAux" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 532;BA.debugLine="clvIV.cboTipoDatosAux.Value=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoDatosAux" /*RemoteObject*/ ).runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 533;BA.debugLine="clvIV.txtListaValoresDatosAux.Text=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtListaValoresDatosAux" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 534;BA.debugLine="clvIV.txtComandoConfigDatosAux.Text=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtComandoConfigDatosAux" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 535;BA.debugLine="clvIV.txtParametrosComandoDatosAux.Text=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtParametrosComandoDatosAux" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 536;BA.debugLine="clvIV.B4XPlusMinusNumCamposDatosAux.SelectedValue";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"B4XPlusMinusNumCamposDatosAux" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xplusminus.class, "_setselectedvalue" /*RemoteObject*/ ,RemoteObject.createImmutable((1)));
 BA.debugLineNum = 538;BA.debugLine="If mInfo.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_minfo.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 540;BA.debugLine="clvIV.chkBoxControlIndependiente.Checked=mInfo.G";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxControlIndependiente" /*RemoteObject*/ ).runMethod(true,"setChecked",BA.ObjectToBoolean(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ControlIndependiente"))),(Object)((jamrecordformbuilder.__c.getField(true,"False"))))));
 BA.debugLineNum = 541;BA.debugLine="clvIV.txtCampo.Text=mInfo.GetDefault(\"Campo\",\"\")";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtCampo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Campo"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 542;BA.debugLine="clvIV.txtTituloCampo.text=mInfo.GetDefault(\"Titu";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtTituloCampo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("TituloCampo"))),(Object)((_clviv.getField(false,"txtCampo" /*RemoteObject*/ ).runMethod(true,"getText"))))));
 BA.debugLineNum = 544;BA.debugLine="clvIV.chkboxKeyID.Checked=mInfo.GetDefault(\"Prim";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkboxKeyID" /*RemoteObject*/ ).runMethod(true,"setChecked",BA.ObjectToBoolean(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("PrimaryKey"))),(Object)((jamrecordformbuilder.__c.getField(true,"False"))))));
 BA.debugLineNum = 545;BA.debugLine="clvIV.txtTipoDatoMySQL.Text=mInfo.Get(\"TipoDatoM";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtTipoDatoMySQL" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_minfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TipoDatoMySQL"))))));
 BA.debugLineNum = 546;BA.debugLine="If mInfo.Getdefault(\"PrimaryKey\",False) Then lst";
Debug.JustUpdateDeviceLine();
if (BA.ObjectToBoolean(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("PrimaryKey"))),(Object)((jamrecordformbuilder.__c.getField(true,"False"))))).<Boolean>get().booleanValue()) { 
jamrecordformbuilder._lstprimarykey.runVoidMethod ("Add",(Object)(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Campo"))),(Object)((RemoteObject.createImmutable(""))))));};
 BA.debugLineNum = 547;BA.debugLine="clvIV.cboTipoControl.Value=mInfo.GetDefault(\"Tip";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoControl" /*RemoteObject*/ ).runMethod(false,"setValue",_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("TipoControl"))),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 548;BA.debugLine="clvIV.chkBoxControlEditable.Checked=mInfo.GetDef";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"setChecked",BA.ObjectToBoolean(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ControlEditable"))),(Object)((jamrecordformbuilder.__c.getField(true,"False"))))));
 BA.debugLineNum = 549;BA.debugLine="clvIV.cboTipoDato.Value=mInfo.GetDefault(\"TipoDa";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"setValue",_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("TipoDato"))),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 550;BA.debugLine="clvIV.chkBoxEsFecha.Checked=mInfo.GetDefault(\"Es";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxEsFecha" /*RemoteObject*/ ).runMethod(true,"setChecked",BA.ObjectToBoolean(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("EsFecha"))),(Object)((jamrecordformbuilder.__c.getField(true,"False"))))));
 BA.debugLineNum = 551;BA.debugLine="clvIV.chkBoxAutoIncremental.Checked=mInfo.Getdef";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxAutoIncremental" /*RemoteObject*/ ).runMethod(true,"setChecked",BA.ObjectToBoolean(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("AutoIncremental"))),(Object)((jamrecordformbuilder.__c.getField(true,"False"))))));
 BA.debugLineNum = 552;BA.debugLine="clvIV.chkBoxNoNulo.Checked=mInfo.Getdefault(\"NoN";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxNoNulo" /*RemoteObject*/ ).runMethod(true,"setChecked",BA.ObjectToBoolean(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("NoNulo"))),(Object)((jamrecordformbuilder.__c.getField(true,"False"))))));
 BA.debugLineNum = 553;BA.debugLine="clvIV.txtValorCampoPorDefecto.Text=mInfo.Getdefa";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtValorCampoPorDefecto" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ValorCampoPorDefecto"))),(Object)(jamrecordformbuilder.__c.getField(false,"Null")))));
 BA.debugLineNum = 554;BA.debugLine="clvIV.txtInfoCampo.Text=mInfo.GetDefault(\"InfoCa";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtInfoCampo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("InfoCampo"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 555;BA.debugLine="If mInfo.Get(\"Extras\")<>Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_minfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Extras")))))) { 
 BA.debugLineNum = 556;BA.debugLine="Dim mExtras As Map=mInfo.Get(\"Extras\")";
Debug.JustUpdateDeviceLine();
_mextras = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mextras = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _minfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Extras")))));Debug.locals.put("mExtras", _mextras);Debug.locals.put("mExtras", _mextras);
 BA.debugLineNum = 557;BA.debugLine="clvIV.cboTipoDatosAux.Value=mExtras.Getdefault(";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoDatosAux" /*RemoteObject*/ ).runMethod(false,"setValue",_mextras.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("TipoDatosAux"))),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 558;BA.debugLine="If mExtras.Getdefault(\"TipoDatosAux\",\"\")=\"Lista";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_mextras.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("TipoDatosAux"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("Lista")))) { 
 BA.debugLineNum = 559;BA.debugLine="clvIV.lblTitleTipoDatosAux.Visible=True";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleTipoDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"True"));
 BA.debugLineNum = 560;BA.debugLine="clvIV.cboTipoDatosAux.Visible=True";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"True"));
 BA.debugLineNum = 561;BA.debugLine="clvIV.lblTitleListaValoresDatosAux.Visible=Tru";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleListaValoresDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"True"));
 BA.debugLineNum = 562;BA.debugLine="clvIV.txtListaValoresDatosAux.Visible=True";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtListaValoresDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"True"));
 BA.debugLineNum = 563;BA.debugLine="clvIV.txtListaValoresDatosAux.Text=mExtras.Get";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtListaValoresDatosAux" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mextras.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaValoresDatosAux"))))));
 };
 BA.debugLineNum = 565;BA.debugLine="If mExtras.Getdefault(\"TipoDatosAux\",\"\")=\"Consu";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_mextras.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("TipoDatosAux"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("Consulta")))) { 
 BA.debugLineNum = 566;BA.debugLine="clvIV.lblTitleTipoDatosAux.Visible=True";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleTipoDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"True"));
 BA.debugLineNum = 567;BA.debugLine="clvIV.cboTipoDatosAux.Visible=True";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"True"));
 BA.debugLineNum = 568;BA.debugLine="clvIV.btnIgualOrigenDatosAux.Visible=True";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"btnIgualOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"True"));
 BA.debugLineNum = 569;BA.debugLine="clvIV.lblTitleIPJrdcOrigenDatosAux.Visible=Tru";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleIPJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"True"));
 BA.debugLineNum = 570;BA.debugLine="clvIV.txtIPJrdcOrigenDatosAux.Visible=True";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtIPJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"True"));
 BA.debugLineNum = 571;BA.debugLine="clvIV.txtIPJrdcOrigenDatosAux.text=mExtras.Get";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtIPJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mextras.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IPJrdcOrigenDatosAux"))))));
 BA.debugLineNum = 572;BA.debugLine="clvIV.lblTitlePuertoJrdcOrigenDatosAux.Visible";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitlePuertoJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"True"));
 BA.debugLineNum = 573;BA.debugLine="clvIV.txtPuertoJrdcOrigenDatosAux.Visible=True";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtPuertoJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"True"));
 BA.debugLineNum = 574;BA.debugLine="clvIV.txtPuertoJrdcOrigenDatosAux.text=mExtras";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtPuertoJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mextras.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PuertoJrdcOrigenDatosAux"))))));
 BA.debugLineNum = 575;BA.debugLine="clvIV.lblTitleComandoConfigDatosAux.Visible=Tr";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleComandoConfigDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"True"));
 BA.debugLineNum = 576;BA.debugLine="clvIV.txtComandoConfigDatosAux.Visible=True";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtComandoConfigDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"True"));
 BA.debugLineNum = 577;BA.debugLine="clvIV.txtComandoConfigDatosAux.text=mExtras.Ge";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtComandoConfigDatosAux" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mextras.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ComandoConfigDatosAux"))))));
 BA.debugLineNum = 578;BA.debugLine="clvIV.lblTitleParametrosComandoDatosAux.Visibl";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleParametrosComandoDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"True"));
 BA.debugLineNum = 579;BA.debugLine="clvIV.txtParametrosComandoDatosAux.Visible=Tru";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtParametrosComandoDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"True"));
 BA.debugLineNum = 580;BA.debugLine="clvIV.txtParametrosComandoDatosAux.text=mExtra";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtParametrosComandoDatosAux" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mextras.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ParametrosComandoDatosAux"))))));
 BA.debugLineNum = 581;BA.debugLine="clvIV.lblTitleNumCamposDatosAux.Visible=True";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleNumCamposDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"True"));
 BA.debugLineNum = 582;BA.debugLine="clvIV.B4XPlusMinusNumCamposDatosAux.mBase.Visi";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"B4XPlusMinusNumCamposDatosAux" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"True"));
 BA.debugLineNum = 583;BA.debugLine="clvIV.B4XPlusMinusNumCamposDatosAux.SelectedVa";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"B4XPlusMinusNumCamposDatosAux" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xplusminus.class, "_setselectedvalue" /*RemoteObject*/ ,_mextras.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NumCamposDatosAux")))));
 };
 };
 BA.debugLineNum = 618;BA.debugLine="If True=mInfo.GetDefault(\"ControlIndependiente\",";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",jamrecordformbuilder.__c.getField(true,"True"),BA.ObjectToBoolean(_minfo.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ControlIndependiente"))),(Object)((jamrecordformbuilder.__c.getField(true,"False"))))))) { 
 BA.debugLineNum = 619;BA.debugLine="clvIV.btnBorrarItem.Visible=True";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"btnBorrarItem" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"True"));
 BA.debugLineNum = 620;BA.debugLine="clvIV.cboTipoControl.Items.Clear";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoControl" /*RemoteObject*/ ).runMethod(false,"getItems").runVoidMethod ("Clear");
 BA.debugLineNum = 622;BA.debugLine="clvIV.cboTipoControl.Value=TipoControl_TextFiel";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoControl" /*RemoteObject*/ ).runMethod(false,"setValue",(jamrecordformbuilder._tipocontrol_textfield));
 BA.debugLineNum = 628;BA.debugLine="clvIV.txtCampo.Editable=True";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtCampo" /*RemoteObject*/ ).runMethod(true,"setEditable",jamrecordformbuilder.__c.getField(true,"True"));
 BA.debugLineNum = 629;BA.debugLine="clvIV.cboTipoDato.Items.Clear";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getItems").runVoidMethod ("Clear");
 BA.debugLineNum = 630;BA.debugLine="clvIV.cboTipoDato.Value=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 631;BA.debugLine="clvIV.chkBoxEsFecha.Enabled=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxEsFecha" /*RemoteObject*/ ).runMethod(true,"setEnabled",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 632;BA.debugLine="clvIV.chkBoxControlEditable.Enabled=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"setEnabled",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 633;BA.debugLine="clvIV.txtValorCampoPorDefecto.Text=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtValorCampoPorDefecto" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 634;BA.debugLine="clvIV.txtTipoDatoMySQL.text=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtTipoDatoMySQL" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 };
 };
 BA.debugLineNum = 639;BA.debugLine="clvIV.txtOrdenColumna.Text=clvListaCampos.Size";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtOrdenColumna" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(jamrecordformbuilder._clvlistacampos.runMethod(true,"_getsize")));
 BA.debugLineNum = 641;BA.debugLine="clvListaCampos.Add(pnl, clvIV)";
Debug.JustUpdateDeviceLine();
jamrecordformbuilder._clvlistacampos.runVoidMethod ("_add",(Object)(_pnl),(Object)((_clviv)));
 BA.debugLineNum = 642;BA.debugLine="dragger.AddDragButtons";
Debug.JustUpdateDeviceLine();
jamrecordformbuilder._dragger.runClassMethod (b4j.docU.jamrecordformclvdragger.class, "_adddragbuttons" /*RemoteObject*/ );
 BA.debugLineNum = 644;BA.debugLine="CallSubDelayed(Me,\"AddItem_Completed\")";
Debug.JustUpdateDeviceLine();
jamrecordformbuilder.__c.runVoidMethod ("CallSubDelayed",jamrecordformbuilder.ba,(Object)(jamrecordformbuilder.getObject()),(Object)(RemoteObject.createImmutable("AddItem_Completed")));
 BA.debugLineNum = 645;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddKeyPressedListener (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,276);
if (RapidSub.canDelegate("addkeypressedlistener")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","addkeypressedlistener");}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4j.agraham.reflection.Reflection");
 BA.debugLineNum = 276;BA.debugLine="Sub AddKeyPressedListener";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 277;BA.debugLine="Dim r As Reflector";
Debug.JustUpdateDeviceLine();
_r = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 278;BA.debugLine="r.Target = frm.RootPane";
Debug.JustUpdateDeviceLine();
_r.setField ("Target",(jamrecordformbuilder._frm.runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 279;BA.debugLine="r.AddEventHandler(\"keypressed\", \"javafx.scene.inp";
Debug.JustUpdateDeviceLine();
_r.runVoidMethod ("AddEventHandler",jamrecordformbuilder.ba,(Object)(BA.ObjectToString("keypressed")),(Object)(RemoteObject.createImmutable("javafx.scene.input.KeyEvent.KEY_PRESSED")));
 BA.debugLineNum = 280;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnadd_click() throws Exception{
try {
		Debug.PushSubsStack("btnAdd_Click (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,2113);
if (RapidSub.canDelegate("btnadd_click")) { b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","btnadd_click"); return;}
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
public ResumableSub_btnAdd_Click(b4j.docU.jamrecordformbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _numeradorcamposindep = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamrecordformbuilder._clvrecordformitemvalue");
RemoteObject _nombrecampo = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int step10;
int limit10;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnAdd_Click (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,2113);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 2114;BA.debugLine="If clvListaCampos.Size=0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",parent._clvlistacampos.runMethod(true,"_getsize"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2115;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"para poder";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(BA.ObjectToString("para poder añadir un control independiente, debe haber al menos un campo dependiente de la tabla.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2116;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "btnadd_click"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2117;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 2119;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"Sólo es pos";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"Msgbox2Async",jamrecordformbuilder.ba,(Object)(BA.ObjectToString("Sólo es posible añadir controles independientes de la tabla. ¿Añadir control independiente?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2120;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "btnadd_click"), _msa);
this.state = 24;
return;
case 24:
//C
this.state = 5;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2121;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 7;
;}if (true) break;

case 7:
//C
this.state = 10;
if (true) return ;
if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 2122;BA.debugLine="Dim NumeradorCamposIndep As Int=1";
Debug.JustUpdateDeviceLine();
_numeradorcamposindep = BA.numberCast(int.class, 1);Debug.locals.put("NumeradorCamposIndep", _numeradorcamposindep);Debug.locals.put("NumeradorCamposIndep", _numeradorcamposindep);
 BA.debugLineNum = 2123;BA.debugLine="For i = 0 To clvListaCampos.Size - 1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 11:
//for
this.state = 22;
step10 = 1;
limit10 = RemoteObject.solve(new RemoteObject[] {parent._clvlistacampos.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 25;
if (true) break;

case 25:
//C
this.state = 22;
if ((step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10)) this.state = 13;
if (true) break;

case 26:
//C
this.state = 25;
_i = ((int)(0 + _i + step10)) ;
Debug.locals.put("i", _i);
if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 2124;BA.debugLine="Dim clvIV As clvRecordFormItemValue=clvListaCamp";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 2125;BA.debugLine="If clvIV.chkBoxControlIndependiente.Checked Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 14:
//if
this.state = 21;
if (_clviv.getField(false,"chkBoxControlIndependiente" /*RemoteObject*/ ).runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 2126;BA.debugLine="Dim NombreCampo As String=clvIV.txtCampo.Text";
Debug.JustUpdateDeviceLine();
_nombrecampo = _clviv.getField(false,"txtCampo" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("NombreCampo", _nombrecampo);Debug.locals.put("NombreCampo", _nombrecampo);
 BA.debugLineNum = 2127;BA.debugLine="If NombreCampo.StartsWith(\"ControlIndependiente";
Debug.JustUpdateDeviceLine();
if (true) break;

case 17:
//if
this.state = 20;
if (_nombrecampo.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ControlIndependiente"))).<Boolean>get().booleanValue()) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 2128;BA.debugLine="NumeradorCamposIndep=NumeradorCamposIndep+1";
Debug.JustUpdateDeviceLine();
_numeradorcamposindep = RemoteObject.solve(new RemoteObject[] {_numeradorcamposindep,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("NumeradorCamposIndep", _numeradorcamposindep);
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 26;
;
 if (true) break;
if (true) break;

case 22:
//C
this.state = -1;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2132;BA.debugLine="Dim m As Map";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 2133;BA.debugLine="m.Initialize";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 2134;BA.debugLine="m.Put(\"ControlIndependiente\",True)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ControlIndependiente"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 2135;BA.debugLine="m.put(\"Campo\",\"ControlIndependiente\" & NumeradorC";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Campo"))),(Object)((RemoteObject.concat(RemoteObject.createImmutable("ControlIndependiente"),_numeradorcamposindep))));
 BA.debugLineNum = 2136;BA.debugLine="m.put(\"TituloCampo\",\"TituloControlIndependiente\"";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TituloCampo"))),(Object)((RemoteObject.concat(RemoteObject.createImmutable("TituloControlIndependiente"),_numeradorcamposindep))));
 BA.debugLineNum = 2137;BA.debugLine="CargandoDatos=True";
Debug.JustUpdateDeviceLine();
parent._cargandodatos = parent.__c.getField(true,"True");
 BA.debugLineNum = 2138;BA.debugLine="AddItem(m)";
Debug.JustUpdateDeviceLine();
_additem(_m);
 BA.debugLineNum = 2139;BA.debugLine="Wait For AddItemControlIndependiente_Completed";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","additemcontrolindependiente_completed", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "btnadd_click"), null);
this.state = 27;
return;
case 27:
//C
this.state = -1;
;
 BA.debugLineNum = 2140;BA.debugLine="CargandoDatos=False";
Debug.JustUpdateDeviceLine();
parent._cargandodatos = parent.__c.getField(true,"False");
 BA.debugLineNum = 2141;BA.debugLine="End Sub";
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
public static void  _additemcontrolindependiente_completed() throws Exception{
}
public static void  _btndelete_click() throws Exception{
try {
		Debug.PushSubsStack("btnDelete_Click (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,2143);
if (RapidSub.canDelegate("btndelete_click")) { b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","btndelete_click"); return;}
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
public ResumableSub_btnDelete_Click(b4j.docU.jamrecordformbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamrecordformbuilder._clvrecordformitemvalue");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnDelete_Click (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,2143);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 2144;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(S";
Debug.JustUpdateDeviceLine();
_index = parent._clvlistacampos.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.__c.runMethod(false,"Sender",jamrecordformbuilder.ba)));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 2145;BA.debugLine="Dim clvIV As clvRecordFormItemValue=clvListaCampo";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 2146;BA.debugLine="If clvIV.chkBoxControlIndependiente.Checked Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 10;
if (_clviv.getField(false,"chkBoxControlIndependiente" /*RemoteObject*/ ).runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2147;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Borrar el";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"Msgbox2Async",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("¿Borrar el ítem del control independiente "),_clviv.getField(false,"txtCampo" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable("?"))),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2148;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "btndelete_click"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2149;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Ret";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 2150;BA.debugLine="clvListaCampos.RemoveAt(index)";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.runVoidMethod ("_removeat",(Object)(_index));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 2152;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("btnEditarOrigenJRDC_Click (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1703);
if (RapidSub.canDelegate("btneditarorigenjrdc_click")) { b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","btneditarorigenjrdc_click"); return;}
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
public ResumableSub_btnEditarOrigenJRDC_Click(b4j.docU.jamrecordformbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstcampossql = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnEditarOrigenJRDC_Click (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1703);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1706;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Editar el";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"Msgbox2Async",jamrecordformbuilder.ba,(Object)(BA.ObjectToString("¿Editar el origen de datos actual?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1707;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "btneditarorigenjrdc_click"), _msa);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1708;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
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
 BA.debugLineNum = 1710;BA.debugLine="prefDialog.Initialize(frm.RootPane,\"Datos JRDC\",8";
Debug.JustUpdateDeviceLine();
parent._prefdialog.runClassMethod (b4j.docU.preferencesdialog.class, "_initialize" /*RemoteObject*/ ,jamrecordformbuilder.ba,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent._frm.runMethod(false,"getRootPane").getObject()),(Object)(RemoteObject.createImmutable(("Datos JRDC"))),(Object)(BA.numberCast(int.class, 800)),(Object)(BA.numberCast(int.class, 600)));
 BA.debugLineNum = 1712;BA.debugLine="prefDialog.LoadFromJson(File.ReadString(File.DirA";
Debug.JustUpdateDeviceLine();
parent._prefdialog.runClassMethod (b4j.docU.preferencesdialog.class, "_loadfromjson" /*RemoteObject*/ ,(Object)(parent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("OrigenDatosJrdcRecordFormBuilder.json")))));
 BA.debugLineNum = 1713;BA.debugLine="Dim mData As Map=CreateMap(\"IpJRDC\":DatosOrigenDa";
Debug.JustUpdateDeviceLine();
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("IpJRDC")),(parent._datosorigendatos.getField(true,"IpJRDC" /*RemoteObject*/ )),RemoteObject.createImmutable(("PuertoJRDC")),(parent._datosorigendatos.getField(true,"PuertoJRDC" /*RemoteObject*/ )),RemoteObject.createImmutable(("NombreTabla")),(parent._datosorigendatos.getField(true,"NombreTabla" /*RemoteObject*/ ))}));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 1714;BA.debugLine="Dim rSub As ResumableSub=prefDialog.ShowDialog(mD";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._prefdialog.runClassMethod (b4j.docU.preferencesdialog.class, "_showdialog" /*RemoteObject*/ ,(Object)(_mdata),(Object)(RemoteObject.createImmutable(("OK"))),(Object)((RemoteObject.createImmutable("CANCEL"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 1716;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "btneditarorigenjrdc_click"), _rsub);
this.state = 20;
return;
case 20:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1717;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
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
if (true) return ;
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 1719;BA.debugLine="LimpiarControlesOrigenDatos";
Debug.JustUpdateDeviceLine();
_limpiarcontrolesorigendatos();
 BA.debugLineNum = 1720;BA.debugLine="clvListaCampos.Clear";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.runVoidMethod ("_clear");
 BA.debugLineNum = 1722;BA.debugLine="lblTitleIpJRDC.TextColor=fx.Colors.From32Bit(0xFF";
Debug.JustUpdateDeviceLine();
parent._lbltitleipjrdc.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 1723;BA.debugLine="lblTitlePuertoJRDC.TextColor=fx.Colors.From32Bit(";
Debug.JustUpdateDeviceLine();
parent._lbltitlepuertojrdc.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 1724;BA.debugLine="lblTitleNombreTabla.TextColor=fx.Colors.From32Bit";
Debug.JustUpdateDeviceLine();
parent._lbltitlenombretabla.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 1725;BA.debugLine="lblTitleDBMS.TextColor=fx.Colors.From32Bit(0xFFFF";
Debug.JustUpdateDeviceLine();
parent._lbltitledbms.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 1726;BA.debugLine="txtIpJRDC.Enabled=True";
Debug.JustUpdateDeviceLine();
parent._txtipjrdc.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1727;BA.debugLine="txtPuertoJRDC.Enabled=True";
Debug.JustUpdateDeviceLine();
parent._txtpuertojrdc.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1728;BA.debugLine="txtNombreTabla.ENABLED=True";
Debug.JustUpdateDeviceLine();
parent._txtnombretabla.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1729;BA.debugLine="txtDBMS.ENABLED=True";
Debug.JustUpdateDeviceLine();
parent._txtdbms.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1731;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(mData.GetD";
Debug.JustUpdateDeviceLine();
parent._datosorigendatos = _createtipoorigendatos(BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("IpJRDC"))),(Object)((RemoteObject.createImmutable(""))))),BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("PuertoJRDC"))),(Object)((RemoteObject.createImmutable(""))))),BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("NombreTabla"))),(Object)((RemoteObject.createImmutable(""))))),BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("NombreTabla"))),(Object)((RemoteObject.createImmutable("MySQL"))))));
 BA.debugLineNum = 1732;BA.debugLine="MostrarDatosOrigenDatos";
Debug.JustUpdateDeviceLine();
_mostrardatosorigendatos();
 BA.debugLineNum = 1735;BA.debugLine="Select Case txtDBMS.Text";
Debug.JustUpdateDeviceLine();
if (true) break;

case 13:
//select
this.state = 18;
switch (BA.switchObjectToInt(parent._txtdbms.runMethod(true,"getText"),BA.ObjectToString("MySQL"),BA.ObjectToString("SQLServer"))) {
case 0: {
this.state = 15;
if (true) break;
}
case 1: {
this.state = 17;
if (true) break;
}
}
if (true) break;

case 15:
//C
this.state = 18;
 BA.debugLineNum = 1737;BA.debugLine="CargaCamposJRDCMySQL(txtIpJRDC.Text,txtPuertoJR";
Debug.JustUpdateDeviceLine();
_cargacamposjrdcmysql(parent._txtipjrdc.runMethod(true,"getText"),BA.numberCast(int.class, parent._txtpuertojrdc.runMethod(true,"getText")),parent._txtnombretabla.runMethod(true,"getText"));
 BA.debugLineNum = 1738;BA.debugLine="Wait For CargaCamposJRDCMySQL_Completed (Accion";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","cargacamposjrdcmysql_completed", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "btneditarorigenjrdc_click"), null);
this.state = 21;
return;
case 21:
//C
this.state = 18;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Accion", _accion);
_lstcampossql = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("lstCamposSQL", _lstcampossql);
;
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 1741;BA.debugLine="CargaCamposJRDCSQLServer(txtIpJRDC.Text,txtPuer";
Debug.JustUpdateDeviceLine();
_cargacamposjrdcsqlserver(parent._txtipjrdc.runMethod(true,"getText"),BA.numberCast(int.class, parent._txtpuertojrdc.runMethod(true,"getText")),parent._txtnombretabla.runMethod(true,"getText"));
 BA.debugLineNum = 1742;BA.debugLine="Wait For CargaCamposJRDCSQLServer_Completed (Ac";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","cargacamposjrdcsqlserver_completed", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "btneditarorigenjrdc_click"), null);
this.state = 22;
return;
case 22:
//C
this.state = 18;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Accion", _accion);
_lstcampossql = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("lstCamposSQL", _lstcampossql);
;
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 1746;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject _result) throws Exception{
}
public static void  _cargacamposjrdcmysql_completed(RemoteObject _accion,RemoteObject _lstcampossql) throws Exception{
}
public static void  _cargacamposjrdcsqlserver_completed(RemoteObject _accion,RemoteObject _lstcampossql) throws Exception{
}
public static RemoteObject  _btnigualorigendatosaux_click() throws Exception{
try {
		Debug.PushSubsStack("btnIgualOrigenDatosAux_Click (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,2104);
if (RapidSub.canDelegate("btnigualorigendatosaux_click")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","btnigualorigendatosaux_click");}
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamrecordformbuilder._clvrecordformitemvalue");
 BA.debugLineNum = 2104;BA.debugLine="Sub btnIgualOrigenDatosAux_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2105;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(S";
Debug.JustUpdateDeviceLine();
_index = jamrecordformbuilder._clvlistacampos.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), jamrecordformbuilder.__c.runMethod(false,"Sender",jamrecordformbuilder.ba)));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 2106;BA.debugLine="Dim clvIV As clvRecordFormItemValue=clvListaCampo";
Debug.JustUpdateDeviceLine();
_clviv = (jamrecordformbuilder._clvlistacampos.runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 2107;BA.debugLine="If clvIV.cboTipoDatosAux.value=\"Consulta\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoDatosAux" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("Consulta")))) { 
 BA.debugLineNum = 2108;BA.debugLine="clvIV.txtIPJrdcOrigenDatosAux.Text=DatosOrigenDa";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtIPJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setText",jamrecordformbuilder._datosorigendatos.getField(true,"IpJRDC" /*RemoteObject*/ ));
 BA.debugLineNum = 2109;BA.debugLine="clvIV.txtPuertoJrdcOrigenDatosAux.Text=DatosOrig";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtPuertoJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setText",jamrecordformbuilder._datosorigendatos.getField(true,"PuertoJRDC" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 2111;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnorigenjrdc_click() throws Exception{
try {
		Debug.PushSubsStack("btnOrigenJRDC_Click (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1608);
if (RapidSub.canDelegate("btnorigenjrdc_click")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","btnorigenjrdc_click");}
 BA.debugLineNum = 1608;BA.debugLine="Sub btnOrigenJRDC_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1610;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _cargacamposjrdcmysql(RemoteObject _ipjrdc,RemoteObject _puertojrdc,RemoteObject _nombretabla) throws Exception{
try {
		Debug.PushSubsStack("CargaCamposJRDCMySQL (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1057);
if (RapidSub.canDelegate("cargacamposjrdcmysql")) { b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","cargacamposjrdcmysql", _ipjrdc, _puertojrdc, _nombretabla); return;}
ResumableSub_CargaCamposJRDCMySQL rsub = new ResumableSub_CargaCamposJRDCMySQL(null,_ipjrdc,_puertojrdc,_nombretabla);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CargaCamposJRDCMySQL extends BA.ResumableSub {
public ResumableSub_CargaCamposJRDCMySQL(b4j.docU.jamrecordformbuilder parent,RemoteObject _ipjrdc,RemoteObject _puertojrdc,RemoteObject _nombretabla) {
this.parent = parent;
this._ipjrdc = _ipjrdc;
this._puertojrdc = _puertojrdc;
this._nombretabla = _nombretabla;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
RemoteObject _ipjrdc;
RemoteObject _puertojrdc;
RemoteObject _nombretabla;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstcampossql = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rdclinkquery = RemoteObject.createImmutable("");
RemoteObject _comandoconfigprop = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tipodato = RemoteObject.createImmutable("");
RemoteObject _tipodatomysql = RemoteObject.createImmutable("");
RemoteObject _lstres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _mreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mdatacampo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int step20;
int limit20;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaCamposJRDCMySQL (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1057);
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
Debug.locals.put("NombreTabla", _nombretabla);
 BA.debugLineNum = 1058;BA.debugLine="Dim Accion As String";
Debug.JustUpdateDeviceLine();
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1059;BA.debugLine="Dim lstCamposSQL As List";
Debug.JustUpdateDeviceLine();
_lstcampossql = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCamposSQL", _lstcampossql);
 BA.debugLineNum = 1060;BA.debugLine="lstCamposSQL.Initialize";
Debug.JustUpdateDeviceLine();
_lstcampossql.runVoidMethod ("Initialize");
 BA.debugLineNum = 1061;BA.debugLine="Dim rdcLinkQuery As String=\"http://\" & IPJrdc & \"";
Debug.JustUpdateDeviceLine();
_rdclinkquery = RemoteObject.concat(RemoteObject.createImmutable("http://"),_ipjrdc,RemoteObject.createImmutable(":"),_puertojrdc,RemoteObject.createImmutable("/rdc"));Debug.locals.put("rdcLinkQuery", _rdclinkquery);Debug.locals.put("rdcLinkQuery", _rdclinkquery);
 BA.debugLineNum = 1062;BA.debugLine="Dim ComandoConfigProp As String=\"InfoCamposTabla\"";
Debug.JustUpdateDeviceLine();
_comandoconfigprop = BA.ObjectToString("InfoCamposTabla");Debug.locals.put("ComandoConfigProp", _comandoconfigprop);Debug.locals.put("ComandoConfigProp", _comandoconfigprop);
 BA.debugLineNum = 1064;BA.debugLine="JRDCQuery.DatosJRDC(rdcLinkQuery,ComandoConfigPro";
Debug.JustUpdateDeviceLine();
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_rdclinkquery),(Object)(_comandoconfigprop),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_nombretabla)})),(Object)(jamrecordformbuilder.getObject()));
 BA.debugLineNum = 1065;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "cargacamposjrdcmysql"), null);
this.state = 56;
return;
case 56:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 1066;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.DEFAULT";
Debug.JustUpdateDeviceLine();
parent._frm.runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",parent._fx.getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 1067;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 55;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 55;
 BA.debugLineNum = 1068;BA.debugLine="Accion=\"ErrorServer\"";
Debug.JustUpdateDeviceLine();
_accion = BA.ObjectToString("ErrorServer");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1069;BA.debugLine="fx.Msgbox(frm,\"Sin conexión con el servidor / ba";
Debug.JustUpdateDeviceLine();
parent._fx.runVoidMethodAndSync ("Msgbox",(Object)(parent._frm),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Sin conexión con el servidor / base de datos / error de consulta"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación"))),(Object)(RemoteObject.createImmutable("Error")));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1071;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 6:
//if
this.state = 54;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 54;
 BA.debugLineNum = 1072;BA.debugLine="Accion=\"TablaNoExiste\"";
Debug.JustUpdateDeviceLine();
_accion = BA.ObjectToString("TablaNoExiste");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1073;BA.debugLine="fx.Msgbox(frm,\"La tabla \" & NombreTabla & \" no";
Debug.JustUpdateDeviceLine();
parent._fx.runVoidMethodAndSync ("Msgbox",(Object)(parent._frm),(Object)(RemoteObject.concat(RemoteObject.createImmutable("La tabla "),_nombretabla,RemoteObject.createImmutable(" no existe en la base de datos correspondiente a los parámetros JRDC, no es posible configurar sus campos."))),(Object)(RemoteObject.createImmutable("Aviso")));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1075;BA.debugLine="Dim TipoDato As String";
Debug.JustUpdateDeviceLine();
_tipodato = RemoteObject.createImmutable("");Debug.locals.put("TipoDato", _tipodato);
 BA.debugLineNum = 1076;BA.debugLine="Dim TipoDatoMySQL As String";
Debug.JustUpdateDeviceLine();
_tipodatomysql = RemoteObject.createImmutable("");Debug.locals.put("TipoDatoMySQL", _tipodatomysql);
 BA.debugLineNum = 1077;BA.debugLine="Dim lstRes As List=mresult.Get(\"lstRes\")";
Debug.JustUpdateDeviceLine();
_lstres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstres = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRes", _lstres);Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 1080;BA.debugLine="For i=0 To lstRes.Size-1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 11:
//for
this.state = 48;
step20 = 1;
limit20 = RemoteObject.solve(new RemoteObject[] {_lstres.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 57;
if (true) break;

case 57:
//C
this.state = 48;
if ((step20 > 0 && _i <= limit20) || (step20 < 0 && _i >= limit20)) this.state = 13;
if (true) break;

case 58:
//C
this.state = 57;
_i = ((int)(0 + _i + step20)) ;
Debug.locals.put("i", _i);
if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1081;BA.debugLine="Dim mReg As Map=lstRes.Get(i)";
Debug.JustUpdateDeviceLine();
_mreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstres.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mReg", _mreg);Debug.locals.put("mReg", _mreg);
 BA.debugLineNum = 1082;BA.debugLine="Dim mDataCampo As Map";
Debug.JustUpdateDeviceLine();
_mdatacampo = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mDataCampo", _mdatacampo);
 BA.debugLineNum = 1083;BA.debugLine="mDataCampo.Initialize";
Debug.JustUpdateDeviceLine();
_mdatacampo.runVoidMethod ("Initialize");
 BA.debugLineNum = 1084;BA.debugLine="mDataCampo.Put(\"Campo\",mReg.Get(\"COLUMN_NAME\")";
Debug.JustUpdateDeviceLine();
_mdatacampo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Campo"))),(Object)(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_NAME"))))));
 BA.debugLineNum = 1085;BA.debugLine="mDataCampo.Put(\"TituloCampo\",mReg.Get(\"COLUMN_";
Debug.JustUpdateDeviceLine();
_mdatacampo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TituloCampo"))),(Object)(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_NAME"))))));
 BA.debugLineNum = 1086;BA.debugLine="mDataCampo.Put(\"TipoDatoMySQL\",mReg.Get(\"DATA_";
Debug.JustUpdateDeviceLine();
_mdatacampo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TipoDatoMySQL"))),(Object)(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DATA_TYPE"))))));
 BA.debugLineNum = 1087;BA.debugLine="mDataCampo.Put(\"TipoColumna\",mReg.Get(\"COLUMN_";
Debug.JustUpdateDeviceLine();
_mdatacampo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TipoColumna"))),(Object)(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_TYPE"))))));
 BA.debugLineNum = 1088;BA.debugLine="mDataCampo.Put(\"NoNulo\",\"NO\"=mReg.Get(\"IS_NULL";
Debug.JustUpdateDeviceLine();
_mdatacampo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("NoNulo"))),(Object)(RemoteObject.createImmutable((RemoteObject.solveBoolean("=",RemoteObject.createImmutable("NO"),BA.ObjectToString(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IS_NULLABLE"))))))))));
 BA.debugLineNum = 1089;BA.debugLine="mDataCampo.Put(\"PrimaryKey\",\"PRI\"=mReg.Get(\"CO";
Debug.JustUpdateDeviceLine();
_mdatacampo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("PrimaryKey"))),(Object)(RemoteObject.createImmutable((RemoteObject.solveBoolean("=",RemoteObject.createImmutable("PRI"),BA.ObjectToString(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_KEY"))))))))));
 BA.debugLineNum = 1090;BA.debugLine="mDataCampo.Put(\"AutoIncremental\",\"auto_increme";
Debug.JustUpdateDeviceLine();
_mdatacampo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("AutoIncremental"))),(Object)(RemoteObject.createImmutable((RemoteObject.solveBoolean("=",RemoteObject.createImmutable("auto_increment"),BA.ObjectToString(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EXTRA"))))))))));
 BA.debugLineNum = 1091;BA.debugLine="mDataCampo.Put(\"ValorCampoPorDefecto\",mReg.Get";
Debug.JustUpdateDeviceLine();
_mdatacampo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ValorCampoPorDefecto"))),(Object)(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_DEFAULT"))))));
 BA.debugLineNum = 1093;BA.debugLine="TipoDatoMySQL=mReg.Get(\"DATA_TYPE\")";
Debug.JustUpdateDeviceLine();
_tipodatomysql = BA.ObjectToString(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DATA_TYPE")))));Debug.locals.put("TipoDatoMySQL", _tipodatomysql);
 BA.debugLineNum = 1095;BA.debugLine="Select TipoDatoMySQL";
Debug.JustUpdateDeviceLine();
if (true) break;

case 14:
//select
this.state = 47;
switch (BA.switchObjectToInt(_tipodatomysql,BA.ObjectToString("smallint"),BA.ObjectToString("int"),BA.ObjectToString("tinyint"),BA.ObjectToString("bit"),BA.ObjectToString("bigint"),BA.ObjectToString("varchar"),BA.ObjectToString("char"),BA.ObjectToString("text"),BA.ObjectToString("nchar"),BA.ObjectToString("ntext"),BA.ObjectToString("nvarchar"),BA.ObjectToString("enum"),BA.ObjectToString("double"),BA.ObjectToString("decimal"),BA.ObjectToString("float"))) {
case 0: {
this.state = 16;
if (true) break;
}
case 1: {
this.state = 18;
if (true) break;
}
case 2: {
this.state = 20;
if (true) break;
}
case 3: {
this.state = 22;
if (true) break;
}
case 4: {
this.state = 24;
if (true) break;
}
case 5: {
this.state = 26;
if (true) break;
}
case 6: {
this.state = 28;
if (true) break;
}
case 7: {
this.state = 30;
if (true) break;
}
case 8: {
this.state = 32;
if (true) break;
}
case 9: {
this.state = 34;
if (true) break;
}
case 10: {
this.state = 36;
if (true) break;
}
case 11: {
this.state = 38;
if (true) break;
}
case 12: {
this.state = 40;
if (true) break;
}
case 13: {
this.state = 42;
if (true) break;
}
case 14: {
this.state = 44;
if (true) break;
}
default: {
this.state = 46;
if (true) break;
}
}
if (true) break;

case 16:
//C
this.state = 47;
 BA.debugLineNum = 1122;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 18:
//C
this.state = 47;
 BA.debugLineNum = 1124;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 20:
//C
this.state = 47;
 BA.debugLineNum = 1126;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 22:
//C
this.state = 47;
 BA.debugLineNum = 1128;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 24:
//C
this.state = 47;
 BA.debugLineNum = 1130;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 26:
//C
this.state = 47;
 BA.debugLineNum = 1132;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 28:
//C
this.state = 47;
 BA.debugLineNum = 1134;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 30:
//C
this.state = 47;
 BA.debugLineNum = 1136;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 32:
//C
this.state = 47;
 BA.debugLineNum = 1138;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 34:
//C
this.state = 47;
 BA.debugLineNum = 1140;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 36:
//C
this.state = 47;
 BA.debugLineNum = 1142;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 38:
//C
this.state = 47;
 BA.debugLineNum = 1144;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 40:
//C
this.state = 47;
 BA.debugLineNum = 1146;BA.debugLine="TipoDato=\"REAL\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("REAL");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 42:
//C
this.state = 47;
 BA.debugLineNum = 1148;BA.debugLine="TipoDato=\"REAL\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("REAL");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 44:
//C
this.state = 47;
 BA.debugLineNum = 1150;BA.debugLine="TipoDato=\"REAL\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("REAL");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 1153;BA.debugLine="TipoDato=\"\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 47:
//C
this.state = 58;
;
 BA.debugLineNum = 1156;BA.debugLine="mDataCampo.Put(\"TipoDato\",TipoDato)";
Debug.JustUpdateDeviceLine();
_mdatacampo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TipoDato"))),(Object)((_tipodato)));
 BA.debugLineNum = 1157;BA.debugLine="lstCamposSQL.Add(mDataCampo)";
Debug.JustUpdateDeviceLine();
_lstcampossql.runVoidMethod ("Add",(Object)((_mdatacampo.getObject())));
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1160;BA.debugLine="If lstCamposSQL.Size=0 Then";
Debug.JustUpdateDeviceLine();

case 48:
//if
this.state = 53;
if (RemoteObject.solveBoolean("=",_lstcampossql.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 50;
}else {
this.state = 52;
}if (true) break;

case 50:
//C
this.state = 53;
 BA.debugLineNum = 1161;BA.debugLine="Accion=\"TablaExisteSinCampos\"";
Debug.JustUpdateDeviceLine();
_accion = BA.ObjectToString("TablaExisteSinCampos");Debug.locals.put("Accion", _accion);
 if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 1163;BA.debugLine="Accion=\"OK\"";
Debug.JustUpdateDeviceLine();
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 53:
//C
this.state = 54;
;
 if (true) break;

case 54:
//C
this.state = 55;
;
 if (true) break;

case 55:
//C
this.state = -1;
;
 BA.debugLineNum = 1167;BA.debugLine="CallSubDelayed3(Me,\"CargaCamposJRDCMySQL_Complete";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("CallSubDelayed3",jamrecordformbuilder.ba,(Object)(jamrecordformbuilder.getObject()),(Object)(BA.ObjectToString("CargaCamposJRDCMySQL_Completed")),(Object)((_accion)),(Object)((_lstcampossql)));
 BA.debugLineNum = 1168;BA.debugLine="End Sub";
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
public static void  _cargacamposjrdcsqlserver(RemoteObject _ipjrdc,RemoteObject _puertojrdc,RemoteObject _nombretabla) throws Exception{
try {
		Debug.PushSubsStack("CargaCamposJRDCSQLServer (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1171);
if (RapidSub.canDelegate("cargacamposjrdcsqlserver")) { b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","cargacamposjrdcsqlserver", _ipjrdc, _puertojrdc, _nombretabla); return;}
ResumableSub_CargaCamposJRDCSQLServer rsub = new ResumableSub_CargaCamposJRDCSQLServer(null,_ipjrdc,_puertojrdc,_nombretabla);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CargaCamposJRDCSQLServer extends BA.ResumableSub {
public ResumableSub_CargaCamposJRDCSQLServer(b4j.docU.jamrecordformbuilder parent,RemoteObject _ipjrdc,RemoteObject _puertojrdc,RemoteObject _nombretabla) {
this.parent = parent;
this._ipjrdc = _ipjrdc;
this._puertojrdc = _puertojrdc;
this._nombretabla = _nombretabla;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
RemoteObject _ipjrdc;
RemoteObject _puertojrdc;
RemoteObject _nombretabla;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstcampossql = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rdclinkquery = RemoteObject.createImmutable("");
RemoteObject _comandoconfigprop = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _tipodato = RemoteObject.createImmutable("");
RemoteObject _tipodatosqlserver = RemoteObject.createImmutable("");
RemoteObject _lstres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _mreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mdatacampo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int step24;
int limit24;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaCamposJRDCSQLServer (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1171);
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
Debug.locals.put("NombreTabla", _nombretabla);
 BA.debugLineNum = 1172;BA.debugLine="Dim Accion As String";
Debug.JustUpdateDeviceLine();
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1173;BA.debugLine="Dim lstCamposSQL As List";
Debug.JustUpdateDeviceLine();
_lstcampossql = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCamposSQL", _lstcampossql);
 BA.debugLineNum = 1174;BA.debugLine="lstCamposSQL.Initialize";
Debug.JustUpdateDeviceLine();
_lstcampossql.runVoidMethod ("Initialize");
 BA.debugLineNum = 1176;BA.debugLine="Dim rdcLinkQuery As String=\"http://\" & IPJrdc & \"";
Debug.JustUpdateDeviceLine();
_rdclinkquery = RemoteObject.concat(RemoteObject.createImmutable("http://"),_ipjrdc,RemoteObject.createImmutable(":"),_puertojrdc,RemoteObject.createImmutable("/rdc"));Debug.locals.put("rdcLinkQuery", _rdclinkquery);Debug.locals.put("rdcLinkQuery", _rdclinkquery);
 BA.debugLineNum = 1178;BA.debugLine="Dim ComandoConfigProp As String=\"InfoTotalCamposT";
Debug.JustUpdateDeviceLine();
_comandoconfigprop = BA.ObjectToString("InfoTotalCamposTabla");Debug.locals.put("ComandoConfigProp", _comandoconfigprop);Debug.locals.put("ComandoConfigProp", _comandoconfigprop);
 BA.debugLineNum = 1180;BA.debugLine="Log(\"Antes de CargaCamposJRDC \" & IPJrdc & \", \" &";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9129892361",RemoteObject.concat(RemoteObject.createImmutable("Antes de CargaCamposJRDC "),_ipjrdc,RemoteObject.createImmutable(", "),_puertojrdc,RemoteObject.createImmutable(", "),_nombretabla),0);
 BA.debugLineNum = 1181;BA.debugLine="JRDCQuery.DatosJRDC(rdcLinkQuery,ComandoConfigPro";
Debug.JustUpdateDeviceLine();
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_rdclinkquery),(Object)(_comandoconfigprop),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_nombretabla),(_nombretabla)})),(Object)(jamrecordformbuilder.getObject()));
 BA.debugLineNum = 1182;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "cargacamposjrdcsqlserver"), null);
this.state = 56;
return;
case 56:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 1183;BA.debugLine="Log (\"Despues de CargaCamposJRDC, mresult \" & mre";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9129892364",RemoteObject.concat(RemoteObject.createImmutable("Despues de CargaCamposJRDC, mresult "),_mresult),0);
 BA.debugLineNum = 1184;BA.debugLine="frm.rootpane.MouseCursor = fx.Cursors.DEFAULT";
Debug.JustUpdateDeviceLine();
parent._frm.runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",parent._fx.getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 1185;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 55;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 55;
 BA.debugLineNum = 1186;BA.debugLine="Accion=\"ErrorServer\"";
Debug.JustUpdateDeviceLine();
_accion = BA.ObjectToString("ErrorServer");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1188;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Sin conexión";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Sin conexión con el servidor / base de datos / error de consulta"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1189;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "cargacamposjrdcsqlserver"), _msa);
this.state = 57;
return;
case 57:
//C
this.state = 55;
;
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1191;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 6:
//if
this.state = 54;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 54;
 BA.debugLineNum = 1192;BA.debugLine="Accion=\"TablaNoExiste\"";
Debug.JustUpdateDeviceLine();
_accion = BA.ObjectToString("TablaNoExiste");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1194;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La tabla \" &";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("La tabla "),_nombretabla,RemoteObject.createImmutable(" no existe en la base de datos correspondiente a los parámetros JRDC, no es posible configurar sus campos."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1195;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "cargacamposjrdcsqlserver"), _msa);
this.state = 58;
return;
case 58:
//C
this.state = 54;
;
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1197;BA.debugLine="Dim TipoDato As String";
Debug.JustUpdateDeviceLine();
_tipodato = RemoteObject.createImmutable("");Debug.locals.put("TipoDato", _tipodato);
 BA.debugLineNum = 1198;BA.debugLine="Dim TipoDatoSQLServer As String";
Debug.JustUpdateDeviceLine();
_tipodatosqlserver = RemoteObject.createImmutable("");Debug.locals.put("TipoDatoSQLServer", _tipodatosqlserver);
 BA.debugLineNum = 1199;BA.debugLine="Dim lstRes As List=mresult.Get(\"lstRes\")";
Debug.JustUpdateDeviceLine();
_lstres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstres = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRes", _lstres);Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 1202;BA.debugLine="For i=0 To lstRes.Size-1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 11:
//for
this.state = 48;
step24 = 1;
limit24 = RemoteObject.solve(new RemoteObject[] {_lstres.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 59;
if (true) break;

case 59:
//C
this.state = 48;
if ((step24 > 0 && _i <= limit24) || (step24 < 0 && _i >= limit24)) this.state = 13;
if (true) break;

case 60:
//C
this.state = 59;
_i = ((int)(0 + _i + step24)) ;
Debug.locals.put("i", _i);
if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1203;BA.debugLine="Dim mReg As Map=lstRes.Get(i)";
Debug.JustUpdateDeviceLine();
_mreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstres.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mReg", _mreg);Debug.locals.put("mReg", _mreg);
 BA.debugLineNum = 1204;BA.debugLine="Dim mDataCampo As Map";
Debug.JustUpdateDeviceLine();
_mdatacampo = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mDataCampo", _mdatacampo);
 BA.debugLineNum = 1205;BA.debugLine="mDataCampo.Initialize";
Debug.JustUpdateDeviceLine();
_mdatacampo.runVoidMethod ("Initialize");
 BA.debugLineNum = 1206;BA.debugLine="mDataCampo.Put(\"Campo\",mReg.Get(\"COLUMN_NAME\")";
Debug.JustUpdateDeviceLine();
_mdatacampo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Campo"))),(Object)(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_NAME"))))));
 BA.debugLineNum = 1207;BA.debugLine="mDataCampo.Put(\"TituloCampo\",mReg.Get(\"COLUMN_";
Debug.JustUpdateDeviceLine();
_mdatacampo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TituloCampo"))),(Object)(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_NAME"))))));
 BA.debugLineNum = 1208;BA.debugLine="mDataCampo.Put(\"TipoDatoMySQL\",mReg.Get(\"DATA_";
Debug.JustUpdateDeviceLine();
_mdatacampo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TipoDatoMySQL"))),(Object)(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DATA_TYPE"))))));
 BA.debugLineNum = 1209;BA.debugLine="mDataCampo.Put(\"TipoColumna\",mReg.Get(\"COLUMN_";
Debug.JustUpdateDeviceLine();
_mdatacampo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TipoColumna"))),(Object)(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_TYPE"))))));
 BA.debugLineNum = 1210;BA.debugLine="mDataCampo.Put(\"NoNulo\",\"NO\"=mReg.Get(\"IS_NULL";
Debug.JustUpdateDeviceLine();
_mdatacampo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("NoNulo"))),(Object)(RemoteObject.createImmutable((RemoteObject.solveBoolean("=",RemoteObject.createImmutable("NO"),BA.ObjectToString(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IS_NULLABLE"))))))))));
 BA.debugLineNum = 1211;BA.debugLine="mDataCampo.Put(\"PrimaryKey\",mReg.Get(\"PK\")=mRe";
Debug.JustUpdateDeviceLine();
_mdatacampo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("PrimaryKey"))),(Object)(RemoteObject.createImmutable((RemoteObject.solveBoolean("=",_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PK")))),_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_NAME")))))))));
 BA.debugLineNum = 1212;BA.debugLine="mDataCampo.Put(\"AutoIncremental\",1=mReg.Get(\"I";
Debug.JustUpdateDeviceLine();
_mdatacampo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("AutoIncremental"))),(Object)(RemoteObject.createImmutable((RemoteObject.solveBoolean("=",RemoteObject.createImmutable(1),BA.numberCast(double.class, _mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Identidad"))))))))));
 BA.debugLineNum = 1213;BA.debugLine="mDataCampo.Put(\"ValorCampoPorDefecto\",mReg.Get";
Debug.JustUpdateDeviceLine();
_mdatacampo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ValorCampoPorDefecto"))),(Object)(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_DEFAULT"))))));
 BA.debugLineNum = 1215;BA.debugLine="TipoDatoSQLServer=mReg.Get(\"DATA_TYPE\")";
Debug.JustUpdateDeviceLine();
_tipodatosqlserver = BA.ObjectToString(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DATA_TYPE")))));Debug.locals.put("TipoDatoSQLServer", _tipodatosqlserver);
 BA.debugLineNum = 1216;BA.debugLine="Log(\"TipoDatoSQLServer \" & TipoDatoSQLServer)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9129892397",RemoteObject.concat(RemoteObject.createImmutable("TipoDatoSQLServer "),_tipodatosqlserver),0);
 BA.debugLineNum = 1217;BA.debugLine="Select TipoDatoSQLServer";
Debug.JustUpdateDeviceLine();
if (true) break;

case 14:
//select
this.state = 47;
switch (BA.switchObjectToInt(_tipodatosqlserver,BA.ObjectToString("smallint"),BA.ObjectToString("int"),BA.ObjectToString("tinyint"),BA.ObjectToString("bit"),BA.ObjectToString("bigint"),BA.ObjectToString("varchar"),BA.ObjectToString("char"),BA.ObjectToString("text"),BA.ObjectToString("nchar"),BA.ObjectToString("ntext"),BA.ObjectToString("nvarchar"),BA.ObjectToString("enum"),BA.ObjectToString("double"),BA.ObjectToString("decimal"),BA.ObjectToString("float"))) {
case 0: {
this.state = 16;
if (true) break;
}
case 1: {
this.state = 18;
if (true) break;
}
case 2: {
this.state = 20;
if (true) break;
}
case 3: {
this.state = 22;
if (true) break;
}
case 4: {
this.state = 24;
if (true) break;
}
case 5: {
this.state = 26;
if (true) break;
}
case 6: {
this.state = 28;
if (true) break;
}
case 7: {
this.state = 30;
if (true) break;
}
case 8: {
this.state = 32;
if (true) break;
}
case 9: {
this.state = 34;
if (true) break;
}
case 10: {
this.state = 36;
if (true) break;
}
case 11: {
this.state = 38;
if (true) break;
}
case 12: {
this.state = 40;
if (true) break;
}
case 13: {
this.state = 42;
if (true) break;
}
case 14: {
this.state = 44;
if (true) break;
}
default: {
this.state = 46;
if (true) break;
}
}
if (true) break;

case 16:
//C
this.state = 47;
 BA.debugLineNum = 1219;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 18:
//C
this.state = 47;
 BA.debugLineNum = 1221;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 20:
//C
this.state = 47;
 BA.debugLineNum = 1223;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 22:
//C
this.state = 47;
 BA.debugLineNum = 1225;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 24:
//C
this.state = 47;
 BA.debugLineNum = 1227;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 26:
//C
this.state = 47;
 BA.debugLineNum = 1229;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 28:
//C
this.state = 47;
 BA.debugLineNum = 1231;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 30:
//C
this.state = 47;
 BA.debugLineNum = 1233;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 32:
//C
this.state = 47;
 BA.debugLineNum = 1235;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 34:
//C
this.state = 47;
 BA.debugLineNum = 1237;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 36:
//C
this.state = 47;
 BA.debugLineNum = 1239;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 38:
//C
this.state = 47;
 BA.debugLineNum = 1241;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 40:
//C
this.state = 47;
 BA.debugLineNum = 1243;BA.debugLine="TipoDato=\"REAL\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("REAL");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 42:
//C
this.state = 47;
 BA.debugLineNum = 1245;BA.debugLine="TipoDato=\"REAL\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("REAL");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 44:
//C
this.state = 47;
 BA.debugLineNum = 1247;BA.debugLine="TipoDato=\"REAL\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("REAL");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 1250;BA.debugLine="TipoDato=\"\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 47:
//C
this.state = 60;
;
 BA.debugLineNum = 1252;BA.debugLine="Log(\"TipoDato=\" & TipoDato)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9129892433",RemoteObject.concat(RemoteObject.createImmutable("TipoDato="),_tipodato),0);
 BA.debugLineNum = 1253;BA.debugLine="mDataCampo.Put(\"TipoDato\",TipoDato)";
Debug.JustUpdateDeviceLine();
_mdatacampo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TipoDato"))),(Object)((_tipodato)));
 BA.debugLineNum = 1255;BA.debugLine="lstCamposSQL.Add(mDataCampo)";
Debug.JustUpdateDeviceLine();
_lstcampossql.runVoidMethod ("Add",(Object)((_mdatacampo.getObject())));
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1259;BA.debugLine="If lstCamposSQL.Size=0 Then";
Debug.JustUpdateDeviceLine();

case 48:
//if
this.state = 53;
if (RemoteObject.solveBoolean("=",_lstcampossql.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 50;
}else {
this.state = 52;
}if (true) break;

case 50:
//C
this.state = 53;
 BA.debugLineNum = 1261;BA.debugLine="Accion=\"TablaExisteSinCampos\"";
Debug.JustUpdateDeviceLine();
_accion = BA.ObjectToString("TablaExisteSinCampos");Debug.locals.put("Accion", _accion);
 if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 1263;BA.debugLine="Accion=\"OK\"";
Debug.JustUpdateDeviceLine();
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 53:
//C
this.state = 54;
;
 if (true) break;

case 54:
//C
this.state = 55;
;
 if (true) break;

case 55:
//C
this.state = -1;
;
 BA.debugLineNum = 1268;BA.debugLine="CallSubDelayed3(Me,\"CargaCamposJRDCSQLServer_Comp";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("CallSubDelayed3",jamrecordformbuilder.ba,(Object)(jamrecordformbuilder.getObject()),(Object)(BA.ObjectToString("CargaCamposJRDCSQLServer_Completed")),(Object)((_accion)),(Object)((_lstcampossql)));
 BA.debugLineNum = 1270;BA.debugLine="End Sub";
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
public static RemoteObject  _cargaitemsclv(RemoteObject _lstmapsdata) throws Exception{
try {
		Debug.PushSubsStack("CargaItemsCLV (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1273);
if (RapidSub.canDelegate("cargaitemsclv")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","cargaitemsclv", _lstmapsdata);}
ResumableSub_CargaItemsCLV rsub = new ResumableSub_CargaItemsCLV(null,_lstmapsdata);
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
public static class ResumableSub_CargaItemsCLV extends BA.ResumableSub {
public ResumableSub_CargaItemsCLV(b4j.docU.jamrecordformbuilder parent,RemoteObject _lstmapsdata) {
this.parent = parent;
this._lstmapsdata = _lstmapsdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
RemoteObject _lstmapsdata;
int _i = 0;
RemoteObject _mdatacampo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int step1;
int limit1;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaItemsCLV (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1273);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("lstMapsData", _lstmapsdata);
 BA.debugLineNum = 1274;BA.debugLine="For i=0 To lstMapsData.Size-1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//for
this.state = 4;
step1 = 1;
limit1 = RemoteObject.solve(new RemoteObject[] {_lstmapsdata.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 5;
if (true) break;

case 5:
//C
this.state = 4;
if ((step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1)) this.state = 3;
if (true) break;

case 6:
//C
this.state = 5;
_i = ((int)(0 + _i + step1)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1275;BA.debugLine="CargandoDatos=True";
Debug.JustUpdateDeviceLine();
parent._cargandodatos = parent.__c.getField(true,"True");
 BA.debugLineNum = 1276;BA.debugLine="Dim mDatacampo As Map=lstMapsData.Get(i)";
Debug.JustUpdateDeviceLine();
_mdatacampo = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdatacampo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstmapsdata.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mDatacampo", _mdatacampo);Debug.locals.put("mDatacampo", _mdatacampo);
 BA.debugLineNum = 1277;BA.debugLine="AddItem(mDatacampo)";
Debug.JustUpdateDeviceLine();
_additem(_mdatacampo);
 BA.debugLineNum = 1278;BA.debugLine="Wait For AddItem_Completed";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","additem_completed", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "cargaitemsclv"), null);
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 BA.debugLineNum = 1279;BA.debugLine="CargandoDatos=False";
Debug.JustUpdateDeviceLine();
parent._cargandodatos = parent.__c.getField(true,"False");
 if (true) break;
if (true) break;

case 4:
//C
this.state = -1;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1281;BA.debugLine="Return Null";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 1282;BA.debugLine="End Sub";
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
public static void  _additem_completed() throws Exception{
}
public static void  _cargardatosdesdefichero(RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("CargarDatosDesdeFichero (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,691);
if (RapidSub.canDelegate("cargardatosdesdefichero")) { b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","cargardatosdesdefichero", _f); return;}
ResumableSub_CargarDatosDesdeFichero rsub = new ResumableSub_CargarDatosDesdeFichero(null,_f);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CargarDatosDesdeFichero extends BA.ResumableSub {
public ResumableSub_CargarDatosDesdeFichero(b4j.docU.jamrecordformbuilder parent,RemoteObject _f) {
this.parent = parent;
this._f = _f;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
RemoteObject _f;
RemoteObject _lstitemsjson = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _robj = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargarDatosDesdeFichero (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,691);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("f", _f);
 BA.debugLineNum = 692;BA.debugLine="wait for (CargarDatosJSON(f)) complete (lstItemsJ";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "cargardatosdesdefichero"), _cargardatosjson(_f));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_lstitemsjson = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("lstItemsJSON", _lstitemsjson);
;
 BA.debugLineNum = 693;BA.debugLine="If lstItemsJSON.Size>0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean(">",_lstitemsjson.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 694;BA.debugLine="WAIT FOR (CargaItemsCLV(lstItemsJSON)) COMPLETE";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "cargardatosdesdefichero"), _cargaitemsclv(_lstitemsjson));
this.state = 6;
return;
case 6:
//C
this.state = 4;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("rObj", _robj);
;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 696;BA.debugLine="End Sub";
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
public static RemoteObject  _cargardatosjson(RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("CargarDatosJSON (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,700);
if (RapidSub.canDelegate("cargardatosjson")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","cargardatosjson", _f);}
ResumableSub_CargarDatosJSON rsub = new ResumableSub_CargarDatosJSON(null,_f);
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
public static class ResumableSub_CargarDatosJSON extends BA.ResumableSub {
public ResumableSub_CargarDatosJSON(b4j.docU.jamrecordformbuilder parent,RemoteObject _f) {
this.parent = parent;
this._f = _f;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
RemoteObject _f;
RemoteObject _lstitemsfromstring = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _s = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstdatoscampossql = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _modificacionendatosjson = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _lstidxdel = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _idxjson = 0;
RemoteObject _mjson = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _campojson = RemoteObject.createImmutable("");
RemoteObject _flagcampojsonok = RemoteObject.createImmutable(false);
int _idxmysql = 0;
RemoteObject _mmysql = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _campomysql = RemoteObject.createImmutable("");
RemoteObject _controlindep = RemoteObject.createImmutable(false);
RemoteObject _idxdel = RemoteObject.createImmutable(0);
RemoteObject _lstcamposadd = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _idxsql = 0;
RemoteObject _msql = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tipodatomysqlmysql = RemoteObject.createImmutable("");
RemoteObject _nonulomysql = RemoteObject.createImmutable(false);
RemoteObject _primarykeymysql = RemoteObject.createImmutable(false);
RemoteObject _autoincrementalmysql = RemoteObject.createImmutable(false);
RemoteObject _valorcampopordefectomysql = RemoteObject.createImmutable("");
RemoteObject _flagcampomysqlexisteenjson = RemoteObject.createImmutable(false);
RemoteObject _tipodatomysqljson = RemoteObject.createImmutable("");
RemoteObject _nonulojson = RemoteObject.createImmutable(false);
RemoteObject _primarykeyjson = RemoteObject.createImmutable(false);
RemoteObject _autoincrementaljson = RemoteObject.createImmutable(false);
RemoteObject _valorcampopordefectojson = RemoteObject.createImmutable("");
RemoteObject _tipodato = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
int step43;
int limit43;
int step47;
int limit47;
RemoteObject group67;
int index67;
int groupLen67;
int step72;
int limit72;
int step82;
int limit82;
RemoteObject group147;
int index147;
int groupLen147;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargarDatosJSON (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,700);
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
 BA.debugLineNum = 702;BA.debugLine="Dim lstItemsFromString As List";
Debug.JustUpdateDeviceLine();
_lstitemsfromstring = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstItemsFromString", _lstitemsfromstring);
 BA.debugLineNum = 703;BA.debugLine="lstItemsFromString.Initialize";
Debug.JustUpdateDeviceLine();
_lstitemsfromstring.runVoidMethod ("Initialize");
 BA.debugLineNum = 705;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//try
this.state = 126;
this.catchState = 125;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 125;
 BA.debugLineNum = 706;BA.debugLine="Dim s As String = File.ReadString(f, \"\")";
Debug.JustUpdateDeviceLine();
_s = parent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(_f),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 707;BA.debugLine="CurrentFileString = s";
Debug.JustUpdateDeviceLine();
parent._currentfilestring = _s;
 BA.debugLineNum = 709;BA.debugLine="clvListaCampos.Clear";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.runVoidMethod ("_clear");
 BA.debugLineNum = 710;BA.debugLine="lstPrimaryKey.Initialize";
Debug.JustUpdateDeviceLine();
parent._lstprimarykey.runVoidMethod ("Initialize");
 BA.debugLineNum = 711;BA.debugLine="SetCurrentFile(f)";
Debug.JustUpdateDeviceLine();
_setcurrentfile(_f);
 BA.debugLineNum = 713;BA.debugLine="Dim parser As JSONParser";
Debug.JustUpdateDeviceLine();
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 714;BA.debugLine="parser.Initialize(s)";
Debug.JustUpdateDeviceLine();
_parser.runVoidMethod ("Initialize",(Object)(_s));
 BA.debugLineNum = 715;BA.debugLine="Dim m As Map = parser.NextObject";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = _parser.runMethod(false,"NextObject");Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 718;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(m.Get(\"Ip";
Debug.JustUpdateDeviceLine();
parent._datosorigendatos = _createtipoorigendatos(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IpJRDC"))))),BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PuertoJRDC"))))),BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreTabla"))))),BA.ObjectToString(_m.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("DBMS"))),(Object)((RemoteObject.createImmutable("MySQL"))))));
 BA.debugLineNum = 721;BA.debugLine="ColItemsImpares=m.GetDefault(\"ColorItemsImpares\"";
Debug.JustUpdateDeviceLine();
parent._colitemsimpares = BA.numberCast(int.class, _m.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ColorItemsImpares"))),(Object)((parent._colitemsimparespredeterminado))));
 BA.debugLineNum = 722;BA.debugLine="ColItemsPares=m.GetDefault(\"ColorItemsPares\",Col";
Debug.JustUpdateDeviceLine();
parent._colitemspares = BA.numberCast(int.class, _m.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ColorItemsPares"))),(Object)((parent._colitemsparespredeterminado))));
 BA.debugLineNum = 724;BA.debugLine="txtRGBColorFondoItemsImpares.Text=GetCssColorStr";
Debug.JustUpdateDeviceLine();
parent._txtrgbcolorfondoitemsimpares.runMethod(true,"setText",_getcsscolorstringfromintcolor(parent._colitemsimpares));
 BA.debugLineNum = 725;BA.debugLine="If txtRGBColorFondoItemsImpares.Text=\"transparen";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",parent._txtrgbcolorfondoitemsimpares.runMethod(true,"getText"),BA.ObjectToString("transparent"))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 726;BA.debugLine="lblColorFondoItemsImpares.Color=0";
Debug.JustUpdateDeviceLine();
parent._lblcolorfondoitemsimpares.runMethod(true,"setColor",BA.numberCast(int.class, 0));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 729;BA.debugLine="lblColorFondoItemsImpares.Color=ColItemsImpares";
Debug.JustUpdateDeviceLine();
parent._lblcolorfondoitemsimpares.runMethod(true,"setColor",parent._colitemsimpares);
 if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 732;BA.debugLine="txtRGBColorFondoItemsPares.Text=GetCssColorStrin";
Debug.JustUpdateDeviceLine();
parent._txtrgbcolorfondoitemspares.runMethod(true,"setText",_getcsscolorstringfromintcolor(parent._colitemspares));
 BA.debugLineNum = 733;BA.debugLine="If txtRGBColorFondoItemsPares.Text=\"transparent\"";
Debug.JustUpdateDeviceLine();
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("=",parent._txtrgbcolorfondoitemspares.runMethod(true,"getText"),BA.ObjectToString("transparent"))) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 734;BA.debugLine="lblColorFondoItemsPares.Color=0";
Debug.JustUpdateDeviceLine();
parent._lblcolorfondoitemspares.runMethod(true,"setColor",BA.numberCast(int.class, 0));
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 737;BA.debugLine="lblColorFondoItemsPares.Color=ColItemsPares";
Debug.JustUpdateDeviceLine();
parent._lblcolorfondoitemspares.runMethod(true,"setColor",parent._colitemspares);
 if (true) break;

case 15:
//C
this.state = 16;
;
 BA.debugLineNum = 740;BA.debugLine="lstNombresCamposSQL.Initialize";
Debug.JustUpdateDeviceLine();
parent._lstnombrescampossql.runVoidMethod ("Initialize");
 BA.debugLineNum = 741;BA.debugLine="Select Case DatosOrigenDatos.DBMS";
Debug.JustUpdateDeviceLine();
if (true) break;

case 16:
//select
this.state = 21;
switch (BA.switchObjectToInt(parent._datosorigendatos.getField(true,"DBMS" /*RemoteObject*/ ),BA.ObjectToString("MySQL"),BA.ObjectToString("SQLServer"))) {
case 0: {
this.state = 18;
if (true) break;
}
case 1: {
this.state = 20;
if (true) break;
}
}
if (true) break;

case 18:
//C
this.state = 21;
 BA.debugLineNum = 743;BA.debugLine="CargaCamposJRDCMySQL(DatosOrigenDatos.IpJRDC,D";
Debug.JustUpdateDeviceLine();
_cargacamposjrdcmysql(parent._datosorigendatos.getField(true,"IpJRDC" /*RemoteObject*/ ),BA.numberCast(int.class, parent._datosorigendatos.getField(true,"PuertoJRDC" /*RemoteObject*/ )),parent._datosorigendatos.getField(true,"NombreTabla" /*RemoteObject*/ ));
 BA.debugLineNum = 744;BA.debugLine="Wait For CargaCamposJRDCMySQL_Completed(Accion";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","cargacamposjrdcmysql_completed", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "cargardatosjson"), null);
this.state = 127;
return;
case 127:
//C
this.state = 21;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Accion", _accion);
_lstdatoscampossql = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("lstDatosCamposSQL", _lstdatoscampossql);
;
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 746;BA.debugLine="CargaCamposJRDCSQLServer(DatosOrigenDatos.IpJR";
Debug.JustUpdateDeviceLine();
_cargacamposjrdcsqlserver(parent._datosorigendatos.getField(true,"IpJRDC" /*RemoteObject*/ ),BA.numberCast(int.class, parent._datosorigendatos.getField(true,"PuertoJRDC" /*RemoteObject*/ )),parent._datosorigendatos.getField(true,"NombreTabla" /*RemoteObject*/ ));
 BA.debugLineNum = 747;BA.debugLine="Wait For CargaCamposJRDCSQLServer_Completed(Ac";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","cargacamposjrdcsqlserver_completed", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "cargardatosjson"), null);
this.state = 128;
return;
case 128:
//C
this.state = 21;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Accion", _accion);
_lstdatoscampossql = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("lstDatosCamposSQL", _lstdatoscampossql);
;
 if (true) break;
;
 BA.debugLineNum = 750;BA.debugLine="If Accion<>\"OK\" Then Return lstItemsFromString";
Debug.JustUpdateDeviceLine();

case 21:
//if
this.state = 26;
if (RemoteObject.solveBoolean("!",_accion,BA.ObjectToString("OK"))) { 
this.state = 23;
;}if (true) break;

case 23:
//C
this.state = 26;
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_lstitemsfromstring));return;};
if (true) break;

case 26:
//C
this.state = 27;
;
 BA.debugLineNum = 752;BA.debugLine="MostrarDatosOrigenDatos";
Debug.JustUpdateDeviceLine();
_mostrardatosorigendatos();
 BA.debugLineNum = 754;BA.debugLine="lstItemsFromString= m.Get(\"Items\")";
Debug.JustUpdateDeviceLine();
_lstitemsfromstring = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Items")))));Debug.locals.put("lstItemsFromString", _lstitemsfromstring);
 BA.debugLineNum = 759;BA.debugLine="Dim ModificacionEnDatosJSON As StringBuilder";
Debug.JustUpdateDeviceLine();
_modificacionendatosjson = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("ModificacionEnDatosJSON", _modificacionendatosjson);
 BA.debugLineNum = 760;BA.debugLine="ModificacionEnDatosJSON.Initialize";
Debug.JustUpdateDeviceLine();
_modificacionendatosjson.runVoidMethod ("Initialize");
 BA.debugLineNum = 765;BA.debugLine="Dim lstIDxDel As List";
Debug.JustUpdateDeviceLine();
_lstidxdel = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstIDxDel", _lstidxdel);
 BA.debugLineNum = 766;BA.debugLine="lstIDxDel.Initialize";
Debug.JustUpdateDeviceLine();
_lstidxdel.runVoidMethod ("Initialize");
 BA.debugLineNum = 767;BA.debugLine="For idxJSON =0 To lstItemsFromString.Size-1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 27:
//for
this.state = 47;
step43 = 1;
limit43 = RemoteObject.solve(new RemoteObject[] {_lstitemsfromstring.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_idxjson = 0 ;
Debug.locals.put("idxJSON", _idxjson);
this.state = 129;
if (true) break;

case 129:
//C
this.state = 47;
if ((step43 > 0 && _idxjson <= limit43) || (step43 < 0 && _idxjson >= limit43)) this.state = 29;
if (true) break;

case 130:
//C
this.state = 129;
_idxjson = ((int)(0 + _idxjson + step43)) ;
Debug.locals.put("idxJSON", _idxjson);
if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 768;BA.debugLine="Dim mJSON As Map=lstItemsFromString.Get(idxJSON";
Debug.JustUpdateDeviceLine();
_mjson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mjson = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstitemsfromstring.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _idxjson))));Debug.locals.put("mJSON", _mjson);Debug.locals.put("mJSON", _mjson);
 BA.debugLineNum = 769;BA.debugLine="Dim CampoJSON As String=mJSON.Get(\"Campo\")";
Debug.JustUpdateDeviceLine();
_campojson = BA.ObjectToString(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Campo")))));Debug.locals.put("CampoJSON", _campojson);Debug.locals.put("CampoJSON", _campojson);
 BA.debugLineNum = 770;BA.debugLine="Dim FlagCampoJSONOK As Boolean=False";
Debug.JustUpdateDeviceLine();
_flagcampojsonok = parent.__c.getField(true,"False");Debug.locals.put("FlagCampoJSONOK", _flagcampojsonok);Debug.locals.put("FlagCampoJSONOK", _flagcampojsonok);
 BA.debugLineNum = 771;BA.debugLine="For idxMySQL=0 To lstDatosCamposSQL.Size-1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 30:
//for
this.state = 37;
step47 = 1;
limit47 = RemoteObject.solve(new RemoteObject[] {_lstdatoscampossql.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_idxmysql = 0 ;
Debug.locals.put("idxMySQL", _idxmysql);
this.state = 131;
if (true) break;

case 131:
//C
this.state = 37;
if ((step47 > 0 && _idxmysql <= limit47) || (step47 < 0 && _idxmysql >= limit47)) this.state = 32;
if (true) break;

case 132:
//C
this.state = 131;
_idxmysql = ((int)(0 + _idxmysql + step47)) ;
Debug.locals.put("idxMySQL", _idxmysql);
if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 772;BA.debugLine="Dim mMySQl As Map=lstDatosCamposSQL.Get(idxMyS";
Debug.JustUpdateDeviceLine();
_mmysql = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mmysql = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstdatoscampossql.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _idxmysql))));Debug.locals.put("mMySQl", _mmysql);Debug.locals.put("mMySQl", _mmysql);
 BA.debugLineNum = 773;BA.debugLine="Dim CampoMySQL As String=mMySQl.Get(\"Campo\")";
Debug.JustUpdateDeviceLine();
_campomysql = BA.ObjectToString(_mmysql.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Campo")))));Debug.locals.put("CampoMySQL", _campomysql);Debug.locals.put("CampoMySQL", _campomysql);
 BA.debugLineNum = 774;BA.debugLine="lstNombresCamposSQL.Add(CampoMySQL)";
Debug.JustUpdateDeviceLine();
parent._lstnombrescampossql.runVoidMethod ("Add",(Object)((_campomysql)));
 BA.debugLineNum = 775;BA.debugLine="If CampoJSON=CampoMySQL Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 33:
//if
this.state = 36;
if (RemoteObject.solveBoolean("=",_campojson,_campomysql)) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 776;BA.debugLine="FlagCampoJSONOK=True";
Debug.JustUpdateDeviceLine();
_flagcampojsonok = parent.__c.getField(true,"True");Debug.locals.put("FlagCampoJSONOK", _flagcampojsonok);
 BA.debugLineNum = 777;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
this.state = 37;
if (true) break;
 if (true) break;

case 36:
//C
this.state = 132;
;
 if (true) break;
if (true) break;
Debug.locals.put("idxMySQL", _idxmysql);
;
 BA.debugLineNum = 781;BA.debugLine="If FlagCampoJSONOK=False Then";
Debug.JustUpdateDeviceLine();

case 37:
//if
this.state = 46;
if (RemoteObject.solveBoolean("=",_flagcampojsonok,parent.__c.getField(true,"False"))) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 782;BA.debugLine="Dim ControlIndep As Boolean=mJSON.Get(\"Control";
Debug.JustUpdateDeviceLine();
_controlindep = BA.ObjectToBoolean(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ControlIndependiente")))));Debug.locals.put("ControlIndep", _controlindep);Debug.locals.put("ControlIndep", _controlindep);
 BA.debugLineNum = 783;BA.debugLine="If Not(ControlIndep) Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 40:
//if
this.state = 45;
if (parent.__c.runMethod(true,"Not",(Object)(_controlindep)).<Boolean>get().booleanValue()) { 
this.state = 42;
}else {
this.state = 44;
}if (true) break;

case 42:
//C
this.state = 45;
 BA.debugLineNum = 784;BA.debugLine="Log(\"se elimina Campo \" & CampoJSON & \" por n";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9129368148",RemoteObject.concat(RemoteObject.createImmutable("se elimina Campo "),_campojson,RemoteObject.createImmutable(" por no existir en tabla de la BBDD, index "),RemoteObject.createImmutable(_idxjson)),0);
 BA.debugLineNum = 786;BA.debugLine="lstIDxDel.Add(idxJSON)";
Debug.JustUpdateDeviceLine();
_lstidxdel.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable((_idxjson))));
 BA.debugLineNum = 787;BA.debugLine="ModificacionEnDatosJSON.Append(\"Campo JSON \"";
Debug.JustUpdateDeviceLine();
_modificacionendatosjson.runMethod(false,"Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Campo JSON "),_campojson,RemoteObject.createImmutable(" se elimina, por no existir en tabla de la BBDD")))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 789;BA.debugLine="Log(\"Campo \" & CampoJSON & \" en Control Indep";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9129368153",RemoteObject.concat(RemoteObject.createImmutable("Campo "),_campojson,RemoteObject.createImmutable(" en Control Independiente, index "),RemoteObject.createImmutable(_idxjson)),0);
 if (true) break;

case 45:
//C
this.state = 46;
;
 if (true) break;

case 46:
//C
this.state = 130;
;
 if (true) break;
if (true) break;
Debug.locals.put("idxJSON", _idxjson);
;
 BA.debugLineNum = 795;BA.debugLine="For Each IDxDel As Int In lstIDxDel";
Debug.JustUpdateDeviceLine();

case 47:
//for
this.state = 50;
group67 = _lstidxdel;
index67 = 0;
groupLen67 = group67.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("IDxDel", _idxdel);
this.state = 133;
if (true) break;

case 133:
//C
this.state = 50;
if (index67 < groupLen67) {
this.state = 49;
_idxdel = BA.numberCast(int.class, group67.runMethod(false,"Get",index67));Debug.locals.put("IDxDel", _idxdel);}
if (true) break;

case 134:
//C
this.state = 133;
index67++;
Debug.locals.put("IDxDel", _idxdel);
if (true) break;

case 49:
//C
this.state = 134;
 BA.debugLineNum = 796;BA.debugLine="lstItemsFromString.RemoveAt(IDxDel)";
Debug.JustUpdateDeviceLine();
_lstitemsfromstring.runVoidMethod ("RemoveAt",(Object)(_idxdel));
 if (true) break;
if (true) break;

case 50:
//C
this.state = 51;
Debug.locals.put("IDxDel", _idxdel);
;
 BA.debugLineNum = 806;BA.debugLine="Dim lstCamposAdd As List";
Debug.JustUpdateDeviceLine();
_lstcamposadd = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCamposAdd", _lstcamposadd);
 BA.debugLineNum = 807;BA.debugLine="lstCamposAdd.Initialize";
Debug.JustUpdateDeviceLine();
_lstcamposadd.runVoidMethod ("Initialize");
 BA.debugLineNum = 810;BA.debugLine="For idxSQL =0 To lstDatosCamposSQL.Size-1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 51:
//for
this.state = 117;
step72 = 1;
limit72 = RemoteObject.solve(new RemoteObject[] {_lstdatoscampossql.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_idxsql = 0 ;
Debug.locals.put("idxSQL", _idxsql);
this.state = 135;
if (true) break;

case 135:
//C
this.state = 117;
if ((step72 > 0 && _idxsql <= limit72) || (step72 < 0 && _idxsql >= limit72)) this.state = 53;
if (true) break;

case 136:
//C
this.state = 135;
_idxsql = ((int)(0 + _idxsql + step72)) ;
Debug.locals.put("idxSQL", _idxsql);
if (true) break;

case 53:
//C
this.state = 54;
 BA.debugLineNum = 811;BA.debugLine="Dim mSQL As Map=lstDatosCamposSQL.Get(idxSQL)";
Debug.JustUpdateDeviceLine();
_msql = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_msql = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstdatoscampossql.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _idxsql))));Debug.locals.put("mSQL", _msql);Debug.locals.put("mSQL", _msql);
 BA.debugLineNum = 813;BA.debugLine="Dim CampoMySQL As String=mSQL.Get(\"Campo\")";
Debug.JustUpdateDeviceLine();
_campomysql = BA.ObjectToString(_msql.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Campo")))));Debug.locals.put("CampoMySQL", _campomysql);Debug.locals.put("CampoMySQL", _campomysql);
 BA.debugLineNum = 814;BA.debugLine="Dim TipoDatoMySQLMySQL As String=mSQL.Get(\"Tipo";
Debug.JustUpdateDeviceLine();
_tipodatomysqlmysql = BA.ObjectToString(_msql.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TipoDatoMySQL")))));Debug.locals.put("TipoDatoMySQLMySQL", _tipodatomysqlmysql);Debug.locals.put("TipoDatoMySQLMySQL", _tipodatomysqlmysql);
 BA.debugLineNum = 815;BA.debugLine="Dim NoNuloMySQL As Boolean=mSQL.Get(\"NoNulo\")";
Debug.JustUpdateDeviceLine();
_nonulomysql = BA.ObjectToBoolean(_msql.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NoNulo")))));Debug.locals.put("NoNuloMySQL", _nonulomysql);Debug.locals.put("NoNuloMySQL", _nonulomysql);
 BA.debugLineNum = 816;BA.debugLine="Dim PrimaryKeyMySQL As Boolean=mSQL.Get(\"Primar";
Debug.JustUpdateDeviceLine();
_primarykeymysql = BA.ObjectToBoolean(_msql.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PrimaryKey")))));Debug.locals.put("PrimaryKeyMySQL", _primarykeymysql);Debug.locals.put("PrimaryKeyMySQL", _primarykeymysql);
 BA.debugLineNum = 817;BA.debugLine="Dim AutoIncrementalMySQL As Boolean=mSQL.Get(\"A";
Debug.JustUpdateDeviceLine();
_autoincrementalmysql = BA.ObjectToBoolean(_msql.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("AutoIncremental")))));Debug.locals.put("AutoIncrementalMySQL", _autoincrementalmysql);Debug.locals.put("AutoIncrementalMySQL", _autoincrementalmysql);
 BA.debugLineNum = 818;BA.debugLine="Dim ValorCampoPorDefectoMySQL As String=mSQL.Ge";
Debug.JustUpdateDeviceLine();
_valorcampopordefectomysql = BA.ObjectToString(_msql.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ValorCampoPorDefecto")))));Debug.locals.put("ValorCampoPorDefectoMySQL", _valorcampopordefectomysql);Debug.locals.put("ValorCampoPorDefectoMySQL", _valorcampopordefectomysql);
 BA.debugLineNum = 820;BA.debugLine="Dim FlagCampoJSONOK As Boolean=False";
Debug.JustUpdateDeviceLine();
_flagcampojsonok = parent.__c.getField(true,"False");Debug.locals.put("FlagCampoJSONOK", _flagcampojsonok);Debug.locals.put("FlagCampoJSONOK", _flagcampojsonok);
 BA.debugLineNum = 821;BA.debugLine="Dim FlagCampoMySQLExisteEnJSON As Boolean=False";
Debug.JustUpdateDeviceLine();
_flagcampomysqlexisteenjson = parent.__c.getField(true,"False");Debug.locals.put("FlagCampoMySQLExisteEnJSON", _flagcampomysqlexisteenjson);Debug.locals.put("FlagCampoMySQLExisteEnJSON", _flagcampomysqlexisteenjson);
 BA.debugLineNum = 823;BA.debugLine="For idxJSON =0 To lstItemsFromString.Size-1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 54:
//for
this.state = 67;
step82 = 1;
limit82 = RemoteObject.solve(new RemoteObject[] {_lstitemsfromstring.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_idxjson = 0 ;
Debug.locals.put("idxJSON", _idxjson);
this.state = 137;
if (true) break;

case 137:
//C
this.state = 67;
if ((step82 > 0 && _idxjson <= limit82) || (step82 < 0 && _idxjson >= limit82)) this.state = 56;
if (true) break;

case 138:
//C
this.state = 137;
_idxjson = ((int)(0 + _idxjson + step82)) ;
Debug.locals.put("idxJSON", _idxjson);
if (true) break;

case 56:
//C
this.state = 57;
 BA.debugLineNum = 825;BA.debugLine="Dim mJSON As Map=lstItemsFromString.Get(idxJSO";
Debug.JustUpdateDeviceLine();
_mjson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mjson = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstitemsfromstring.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _idxjson))));Debug.locals.put("mJSON", _mjson);Debug.locals.put("mJSON", _mjson);
 BA.debugLineNum = 826;BA.debugLine="Dim CampoJSON As String=mJSON.Get(\"Campo\")";
Debug.JustUpdateDeviceLine();
_campojson = BA.ObjectToString(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Campo")))));Debug.locals.put("CampoJSON", _campojson);Debug.locals.put("CampoJSON", _campojson);
 BA.debugLineNum = 827;BA.debugLine="If CampoJSON=CampoMySQL Then  ' el campo MySQL";
Debug.JustUpdateDeviceLine();
if (true) break;

case 57:
//if
this.state = 66;
if (RemoteObject.solveBoolean("=",_campojson,_campomysql)) { 
this.state = 59;
}if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 828;BA.debugLine="FlagCampoMySQLExisteEnJSON=True";
Debug.JustUpdateDeviceLine();
_flagcampomysqlexisteenjson = parent.__c.getField(true,"True");Debug.locals.put("FlagCampoMySQLExisteEnJSON", _flagcampomysqlexisteenjson);
 BA.debugLineNum = 829;BA.debugLine="Dim TipoDatoMySQLJSON As String=mJSON.Get(\"Ti";
Debug.JustUpdateDeviceLine();
_tipodatomysqljson = BA.ObjectToString(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TipoDatoMySQL")))));Debug.locals.put("TipoDatoMySQLJSON", _tipodatomysqljson);Debug.locals.put("TipoDatoMySQLJSON", _tipodatomysqljson);
 BA.debugLineNum = 830;BA.debugLine="Dim NoNuloJSON As Boolean=mJSON.Get(\"NoNulo\")";
Debug.JustUpdateDeviceLine();
_nonulojson = BA.ObjectToBoolean(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NoNulo")))));Debug.locals.put("NoNuloJSON", _nonulojson);Debug.locals.put("NoNuloJSON", _nonulojson);
 BA.debugLineNum = 831;BA.debugLine="Dim PrimaryKeyJSON As Boolean=mJSON.Get(\"Prim";
Debug.JustUpdateDeviceLine();
_primarykeyjson = BA.ObjectToBoolean(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PrimaryKey")))));Debug.locals.put("PrimaryKeyJSON", _primarykeyjson);Debug.locals.put("PrimaryKeyJSON", _primarykeyjson);
 BA.debugLineNum = 832;BA.debugLine="Dim AutoIncrementalJSON As Boolean=mJSON.Get(";
Debug.JustUpdateDeviceLine();
_autoincrementaljson = BA.ObjectToBoolean(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("AutoIncremental")))));Debug.locals.put("AutoIncrementalJSON", _autoincrementaljson);Debug.locals.put("AutoIncrementalJSON", _autoincrementaljson);
 BA.debugLineNum = 833;BA.debugLine="Dim ValorCampoPorDefectoJSON As String=mJSON.";
Debug.JustUpdateDeviceLine();
_valorcampopordefectojson = BA.ObjectToString(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ValorCampoPorDefecto")))));Debug.locals.put("ValorCampoPorDefectoJSON", _valorcampopordefectojson);Debug.locals.put("ValorCampoPorDefectoJSON", _valorcampopordefectojson);
 BA.debugLineNum = 835;BA.debugLine="If TipoDatoMySQLJSON=TipoDatoMySQLMySQL And N";
Debug.JustUpdateDeviceLine();
if (true) break;

case 60:
//if
this.state = 65;
if (RemoteObject.solveBoolean("=",_tipodatomysqljson,_tipodatomysqlmysql) && RemoteObject.solveBoolean("=",_nonulojson,_nonulomysql) && RemoteObject.solveBoolean("=",_primarykeyjson,_primarykeymysql) && RemoteObject.solveBoolean("=",_autoincrementaljson,_autoincrementalmysql) && RemoteObject.solveBoolean("=",_valorcampopordefectojson,_valorcampopordefectomysql)) { 
this.state = 62;
}else {
this.state = 64;
}if (true) break;

case 62:
//C
this.state = 65;
 BA.debugLineNum = 837;BA.debugLine="FlagCampoJSONOK=True   ' si todos los valore";
Debug.JustUpdateDeviceLine();
_flagcampojsonok = parent.__c.getField(true,"True");Debug.locals.put("FlagCampoJSONOK", _flagcampojsonok);
 BA.debugLineNum = 838;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
this.state = 67;
if (true) break;
 if (true) break;

case 64:
//C
this.state = 65;
 BA.debugLineNum = 842;BA.debugLine="ModificacionEnDatosJSON.Append(\"Campo JSON \"";
Debug.JustUpdateDeviceLine();
_modificacionendatosjson.runMethod(false,"Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Campo JSON "),_campojson,RemoteObject.createImmutable(" se modifica, por no coincidir datos con los de la tabla de la BBDD")))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 846;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
this.state = 67;
if (true) break;
 if (true) break;

case 65:
//C
this.state = 66;
;
 if (true) break;

case 66:
//C
this.state = 138;
;
 if (true) break;
if (true) break;
Debug.locals.put("idxJSON", _idxjson);
;
 BA.debugLineNum = 853;BA.debugLine="If FlagCampoMySQLExisteEnJSON=False Then Modifi";
Debug.JustUpdateDeviceLine();

case 67:
//if
this.state = 72;
if (RemoteObject.solveBoolean("=",_flagcampomysqlexisteenjson,parent.__c.getField(true,"False"))) { 
this.state = 69;
;}if (true) break;

case 69:
//C
this.state = 72;
_modificacionendatosjson.runMethod(false,"Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Campo JSON "),_campomysql,RemoteObject.createImmutable(" se añade a JSON, por existir en tabla de la BBDD, y no existir en JSON")))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
if (true) break;

case 72:
//C
this.state = 73;
;
 BA.debugLineNum = 854;BA.debugLine="If FlagCampoJSONOK=False Then ' o bien el campo";
Debug.JustUpdateDeviceLine();
if (true) break;

case 73:
//if
this.state = 116;
if (RemoteObject.solveBoolean("=",_flagcampojsonok,parent.__c.getField(true,"False"))) { 
this.state = 75;
}if (true) break;

case 75:
//C
this.state = 76;
 BA.debugLineNum = 855;BA.debugLine="Dim TipoDato As String";
Debug.JustUpdateDeviceLine();
_tipodato = RemoteObject.createImmutable("");Debug.locals.put("TipoDato", _tipodato);
 BA.debugLineNum = 856;BA.debugLine="Select TipoDatoMySQLMySQL";
Debug.JustUpdateDeviceLine();
if (true) break;

case 76:
//select
this.state = 109;
switch (BA.switchObjectToInt(_tipodatomysqlmysql,BA.ObjectToString("smallint"),BA.ObjectToString("int"),BA.ObjectToString("tinyint"),BA.ObjectToString("bit"),BA.ObjectToString("bigint"),BA.ObjectToString("varchar"),BA.ObjectToString("char"),BA.ObjectToString("text"),BA.ObjectToString("nchar"),BA.ObjectToString("ntext"),BA.ObjectToString("nvarchar"),BA.ObjectToString("enum"),BA.ObjectToString("double"),BA.ObjectToString("decimal"),BA.ObjectToString("float"))) {
case 0: {
this.state = 78;
if (true) break;
}
case 1: {
this.state = 80;
if (true) break;
}
case 2: {
this.state = 82;
if (true) break;
}
case 3: {
this.state = 84;
if (true) break;
}
case 4: {
this.state = 86;
if (true) break;
}
case 5: {
this.state = 88;
if (true) break;
}
case 6: {
this.state = 90;
if (true) break;
}
case 7: {
this.state = 92;
if (true) break;
}
case 8: {
this.state = 94;
if (true) break;
}
case 9: {
this.state = 96;
if (true) break;
}
case 10: {
this.state = 98;
if (true) break;
}
case 11: {
this.state = 100;
if (true) break;
}
case 12: {
this.state = 102;
if (true) break;
}
case 13: {
this.state = 104;
if (true) break;
}
case 14: {
this.state = 106;
if (true) break;
}
default: {
this.state = 108;
if (true) break;
}
}
if (true) break;

case 78:
//C
this.state = 109;
 BA.debugLineNum = 876;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 80:
//C
this.state = 109;
 BA.debugLineNum = 878;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 82:
//C
this.state = 109;
 BA.debugLineNum = 880;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 84:
//C
this.state = 109;
 BA.debugLineNum = 882;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 86:
//C
this.state = 109;
 BA.debugLineNum = 884;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 88:
//C
this.state = 109;
 BA.debugLineNum = 886;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 90:
//C
this.state = 109;
 BA.debugLineNum = 888;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 92:
//C
this.state = 109;
 BA.debugLineNum = 890;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 94:
//C
this.state = 109;
 BA.debugLineNum = 892;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 96:
//C
this.state = 109;
 BA.debugLineNum = 894;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 98:
//C
this.state = 109;
 BA.debugLineNum = 896;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 100:
//C
this.state = 109;
 BA.debugLineNum = 898;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 102:
//C
this.state = 109;
 BA.debugLineNum = 900;BA.debugLine="TipoDato=\"REAL\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("REAL");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 104:
//C
this.state = 109;
 BA.debugLineNum = 902;BA.debugLine="TipoDato=\"REAL\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("REAL");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 106:
//C
this.state = 109;
 BA.debugLineNum = 904;BA.debugLine="TipoDato=\"REAL\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("REAL");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 108:
//C
this.state = 109;
 BA.debugLineNum = 907;BA.debugLine="TipoDato=\"\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 109:
//C
this.state = 110;
;
 BA.debugLineNum = 910;BA.debugLine="mSQL.Put(\"TipoDato\",TipoDato)";
Debug.JustUpdateDeviceLine();
_msql.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TipoDato"))),(Object)((_tipodato)));
 BA.debugLineNum = 912;BA.debugLine="If FlagCampoMySQLExisteEnJSON Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 110:
//if
this.state = 115;
if (_flagcampomysqlexisteenjson.<Boolean>get().booleanValue()) { 
this.state = 112;
}else {
this.state = 114;
}if (true) break;

case 112:
//C
this.state = 115;
 BA.debugLineNum = 913;BA.debugLine="lstItemsFromString.RemoveAt(idxJSON)";
Debug.JustUpdateDeviceLine();
_lstitemsfromstring.runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, _idxjson)));
 BA.debugLineNum = 915;BA.debugLine="lstItemsFromString.InsertAt(idxJSON,mSQL)";
Debug.JustUpdateDeviceLine();
_lstitemsfromstring.runVoidMethod ("InsertAt",(Object)(BA.numberCast(int.class, _idxjson)),(Object)((_msql.getObject())));
 if (true) break;

case 114:
//C
this.state = 115;
 BA.debugLineNum = 918;BA.debugLine="lstCamposAdd.Add(mSQL)";
Debug.JustUpdateDeviceLine();
_lstcamposadd.runVoidMethod ("Add",(Object)((_msql.getObject())));
 if (true) break;

case 115:
//C
this.state = 116;
;
 if (true) break;

case 116:
//C
this.state = 136;
;
 if (true) break;
if (true) break;
Debug.locals.put("idxSQL", _idxsql);
;
 BA.debugLineNum = 923;BA.debugLine="For Each m As Map In lstCamposAdd";
Debug.JustUpdateDeviceLine();

case 117:
//for
this.state = 120;
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group147 = _lstcamposadd;
index147 = 0;
groupLen147 = group147.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("m", _m);
this.state = 139;
if (true) break;

case 139:
//C
this.state = 120;
if (index147 < groupLen147) {
this.state = 119;
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group147.runMethod(false,"Get",index147));Debug.locals.put("m", _m);}
if (true) break;

case 140:
//C
this.state = 139;
index147++;
Debug.locals.put("m", _m);
if (true) break;

case 119:
//C
this.state = 140;
 BA.debugLineNum = 924;BA.debugLine="lstItemsFromString.Add(m)";
Debug.JustUpdateDeviceLine();
_lstitemsfromstring.runVoidMethod ("Add",(Object)((_m.getObject())));
 if (true) break;
if (true) break;
Debug.locals.put("m", _m);
;
 BA.debugLineNum = 926;BA.debugLine="If ModificacionEnDatosJSON.Length>0 Then";
Debug.JustUpdateDeviceLine();

case 120:
//if
this.state = 123;
if (RemoteObject.solveBoolean(">",_modificacionendatosjson.runMethod(true,"getLength"),BA.numberCast(double.class, 0))) { 
this.state = 122;
}if (true) break;

case 122:
//C
this.state = 123;
 BA.debugLineNum = 927;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(Modificacio";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(_modificacionendatosjson.runMethod(true,"ToString")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 928;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "cargardatosjson"), _msa);
this.state = 141;
return;
case 141:
//C
this.state = 123;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 123:
//C
this.state = 126;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 125:
//C
this.state = 126;
this.catchState = 0;
 BA.debugLineNum = 933;BA.debugLine="Dim rSub As ResumableSub=Dialog.Show(LastExcepti";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_show" /*RemoteObject*/ ,(Object)((parent.__c.runMethod(false,"LastException",jamrecordformbuilder.ba).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable(("Ok"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable(""))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 934;BA.debugLine="Wait For(rSub) complete (rInt As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "cargardatosjson"), _rsub);
this.state = 142;
return;
case 142:
//C
this.state = 126;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("rInt", _rint);
;
 if (true) break;
if (true) break;

case 126:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 937;BA.debugLine="Return lstItemsFromString";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_lstitemsfromstring));return;};
 BA.debugLineNum = 938;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",jamrecordformbuilder.ba, e0.toString());}
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
public static RemoteObject  _cboalineacioncolumna_valuechanged(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("cboAlineacionColumna_ValueChanged (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1750);
if (RapidSub.canDelegate("cboalineacioncolumna_valuechanged")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","cboalineacioncolumna_valuechanged", _value);}
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1750;BA.debugLine="Sub cboAlineacionColumna_ValueChanged (Value As Ob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1751;BA.debugLine="If CargandoDatos Then Return";
Debug.JustUpdateDeviceLine();
if (jamrecordformbuilder._cargandodatos.<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1752;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cbocampomostrarlmb4xcbo_valuechanged(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("cboCampoMostrarlmB4XCbo_ValueChanged (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,2024);
if (RapidSub.canDelegate("cbocampomostrarlmb4xcbo_valuechanged")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","cbocampomostrarlmb4xcbo_valuechanged", _value);}
Debug.locals.put("Value", _value);
 BA.debugLineNum = 2024;BA.debugLine="Sub cboCampoMostrarlmB4XCbo_ValueChanged (Value As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2026;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _cbotipocontrol_valuechanged(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("cboTipoControl_ValueChanged (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1754);
if (RapidSub.canDelegate("cbotipocontrol_valuechanged")) { b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","cbotipocontrol_valuechanged", _value); return;}
ResumableSub_cboTipoControl_ValueChanged rsub = new ResumableSub_cboTipoControl_ValueChanged(null,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cboTipoControl_ValueChanged extends BA.ResumableSub {
public ResumableSub_cboTipoControl_ValueChanged(b4j.docU.jamrecordformbuilder parent,RemoteObject _value) {
this.parent = parent;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
RemoteObject _value;
RemoteObject _cbotc = RemoteObject.declareNull("anywheresoftware.b4j.objects.ComboBoxWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamrecordformbuilder._clvrecordformitemvalue");
RemoteObject _chk = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cboTipoControl_ValueChanged (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1754);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1755;BA.debugLine="If CargandoDatos Then Return";
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
 BA.debugLineNum = 1756;BA.debugLine="Dim cboTC As ComboBox=Sender";
Debug.JustUpdateDeviceLine();
_cbotc = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");
_cbotc = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ComboBoxWrapper"), parent.__c.runMethod(false,"Sender",jamrecordformbuilder.ba));Debug.locals.put("cboTC", _cbotc);Debug.locals.put("cboTC", _cbotc);
 BA.debugLineNum = 1757;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
Debug.JustUpdateDeviceLine();
_index = parent._clvlistacampos.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _cbotc.getObject()));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 1758;BA.debugLine="Dim clvIV As clvRecordFormItemValue=clvListaCampo";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 1762;BA.debugLine="clvIV.lblTitleTipoDatosAux.Visible=(Value=TipoCon";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleTipoDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_value,(parent._tipocontrol_b4xlistdialogtextfield)) || RemoteObject.solveBoolean("=",_value,(parent._tipocontrol_combobox)) || RemoteObject.solveBoolean("=",_value,(parent._tipocontrol_lmb4xcombobox)) || RemoteObject.solveBoolean("=",_value,(parent._tipocontrol_b4xsearchlistdialogtextfield)))));
 BA.debugLineNum = 1763;BA.debugLine="clvIV.cboTipoDatosAux.Visible=clvIV.lblTitleTipoD";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",_clviv.getField(false,"lblTitleTipoDatosAux" /*RemoteObject*/ ).runMethod(true,"getVisible"));
 BA.debugLineNum = 1765;BA.debugLine="clvIV.lblTitleListaValoresDatosAux.Visible=clvIV.";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleListaValoresDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoDatosAux" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("Lista")))));
 BA.debugLineNum = 1766;BA.debugLine="clvIV.txtListaValoresDatosAux.Visible=clvIV.lblTi";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtListaValoresDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",_clviv.getField(false,"lblTitleListaValoresDatosAux" /*RemoteObject*/ ).runMethod(true,"getVisible"));
 BA.debugLineNum = 1768;BA.debugLine="clvIV.lblTitleIPJrdcOrigenDatosAux.Visible=clvIV.";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleIPJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoDatosAux" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("Consulta")))));
 BA.debugLineNum = 1769;BA.debugLine="clvIV.btnIgualOrigenDatosAux.Visible=clvIV.lblTit";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"btnIgualOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",_clviv.getField(false,"lblTitleIPJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"getVisible"));
 BA.debugLineNum = 1770;BA.debugLine="clvIV.txtIPJrdcOrigenDatosAux.Visible=clvIV.lblTi";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtIPJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",_clviv.getField(false,"lblTitleIPJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"getVisible"));
 BA.debugLineNum = 1771;BA.debugLine="clvIV.lblTitlePuertoJrdcOrigenDatosAux.Visible=cl";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitlePuertoJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",_clviv.getField(false,"lblTitleIPJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"getVisible"));
 BA.debugLineNum = 1772;BA.debugLine="clvIV.txtPuertoJrdcOrigenDatosAux.Visible=clvIV.l";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtPuertoJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",_clviv.getField(false,"lblTitleIPJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"getVisible"));
 BA.debugLineNum = 1773;BA.debugLine="clvIV.lblTitleComandoConfigDatosAux.Visible=clvIV";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleComandoConfigDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",_clviv.getField(false,"lblTitleIPJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"getVisible"));
 BA.debugLineNum = 1774;BA.debugLine="clvIV.txtComandoConfigDatosAux.Visible=clvIV.lblT";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtComandoConfigDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",_clviv.getField(false,"lblTitleIPJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"getVisible"));
 BA.debugLineNum = 1775;BA.debugLine="clvIV.lblTitleParametrosComandoDatosAux.Visible=c";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleParametrosComandoDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",_clviv.getField(false,"lblTitleIPJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"getVisible"));
 BA.debugLineNum = 1776;BA.debugLine="clvIV.txtParametrosComandoDatosAux.Visible=clvIV.";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtParametrosComandoDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",_clviv.getField(false,"lblTitleIPJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"getVisible"));
 BA.debugLineNum = 1778;BA.debugLine="clvIV.txtIPJrdcOrigenDatosAux.Text=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtIPJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 1779;BA.debugLine="clvIV.txtPuertoJrdcOrigenDatosAux.Text=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtPuertoJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 1780;BA.debugLine="clvIV.cboTipoDatosAux.Value=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"cboTipoDatosAux" /*RemoteObject*/ ).runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 1781;BA.debugLine="clvIV.txtListaValoresDatosAux.Text=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtListaValoresDatosAux" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 1782;BA.debugLine="clvIV.txtComandoConfigDatosAux.Text=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtComandoConfigDatosAux" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 1783;BA.debugLine="clvIV.txtParametrosComandoDatosAux.Text=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtParametrosComandoDatosAux" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 1784;BA.debugLine="clvIV.B4XPlusMinusNumCamposDatosAux.SelectedValue";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"B4XPlusMinusNumCamposDatosAux" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xplusminus.class, "_setselectedvalue" /*RemoteObject*/ ,RemoteObject.createImmutable((1)));
 BA.debugLineNum = 1786;BA.debugLine="If Value=\"\" Or Value=Null Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable((""))) || RemoteObject.solveBoolean("n",_value)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1787;BA.debugLine="Dim chk As CheckBox=clvIV.chkBoxControlEditable";
Debug.JustUpdateDeviceLine();
_chk = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
_chk = _clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ );Debug.locals.put("chk", _chk);Debug.locals.put("chk", _chk);
 BA.debugLineNum = 1788;BA.debugLine="If chk.Checked Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 10:
//if
this.state = 15;
if (_chk.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 1789;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"un campo s";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(BA.ObjectToString("un campo sin control para mostrar su valor no puede ser editable. Se modifica el valor Editable a False.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1790;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "cbotipocontrol_valuechanged"), _msa);
this.state = 53;
return;
case 53:
//C
this.state = 15;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1791;BA.debugLine="clvIV.chkBoxControlEditable.Checked=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1792;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 1794;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;
;
 BA.debugLineNum = 1798;BA.debugLine="If Value=TipoControl_TextFieldButtonSelFecha And";
Debug.JustUpdateDeviceLine();

case 16:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",_value,(parent._tipocontrol_textfieldbuttonselfecha)) && RemoteObject.solveBoolean("=",_clviv.getField(false,"chkBoxEsFecha" /*RemoteObject*/ ).runMethod(true,"getChecked"),parent.__c.getField(true,"False"))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 1799;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El tipo de control = "),parent._tipocontrol_textfieldbuttonselfecha,RemoteObject.createImmutable(" sólo es válidos para campos tipo fecha."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1800;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "cbotipocontrol_valuechanged"), _msa);
this.state = 54;
return;
case 54:
//C
this.state = 19;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1801;BA.debugLine="cboTC.Value=\"\"";
Debug.JustUpdateDeviceLine();
_cbotc.runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 if (true) break;
;
 BA.debugLineNum = 1803;BA.debugLine="If (Value<>TipoControl_TextFieldButtonSelFecha An";
Debug.JustUpdateDeviceLine();

case 19:
//if
this.state = 22;
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",_value,(parent._tipocontrol_textfieldbuttonselfecha)) && RemoteObject.solveBoolean("!",_value,(RemoteObject.createImmutable("")))))) && RemoteObject.solveBoolean("=",_clviv.getField(false,"chkBoxEsFecha" /*RemoteObject*/ ).runMethod(true,"getChecked"),parent.__c.getField(true,"True"))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 1804;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Los campos";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Los campos tipo fecha sólo admiten tipo de control  = "),parent._tipocontrol_textfieldbuttonselfecha,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1805;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "cbotipocontrol_valuechanged"), _msa);
this.state = 55;
return;
case 55:
//C
this.state = 22;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1806;BA.debugLine="cboTC.Value=\"\"";
Debug.JustUpdateDeviceLine();
_cbotc.runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 if (true) break;
;
 BA.debugLineNum = 1808;BA.debugLine="If Value=TipoControl_TextFieldButtonSelFecha And";
Debug.JustUpdateDeviceLine();

case 22:
//if
this.state = 25;
if (RemoteObject.solveBoolean("=",_value,(parent._tipocontrol_textfieldbuttonselfecha)) && RemoteObject.solveBoolean("=",_clviv.getField(false,"chkBoxEsFecha" /*RemoteObject*/ ).runMethod(true,"getChecked"),parent.__c.getField(true,"False"))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 1809;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El tipo de control = "),parent._tipocontrol_textfieldbuttonselfecha,RemoteObject.createImmutable(" sólo es válidos para campos tipo fecha."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1810;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "cbotipocontrol_valuechanged"), _msa);
this.state = 56;
return;
case 56:
//C
this.state = 25;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1811;BA.debugLine="cboTC.Value=\"\"";
Debug.JustUpdateDeviceLine();
_cbotc.runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 if (true) break;
;
 BA.debugLineNum = 1813;BA.debugLine="If Value=TipoControl_ComboBox And clvIV.chkBoxCon";
Debug.JustUpdateDeviceLine();

case 25:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",_value,(parent._tipocontrol_combobox)) && RemoteObject.solveBoolean("=",_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"getChecked"),parent.__c.getField(true,"False"))) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 1814;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El tipo de control = "),parent._tipocontrol_combobox,RemoteObject.createImmutable(" es siempre editable. Se modifica el valor Editable a true."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1815;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "cbotipocontrol_valuechanged"), _msa);
this.state = 57;
return;
case 57:
//C
this.state = 28;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1816;BA.debugLine="clvIV.chkBoxControlEditable.Checked=True";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"True"));
 if (true) break;
;
 BA.debugLineNum = 1818;BA.debugLine="If Value=TipoControl_lmB4XComboBox And clvIV.chkB";
Debug.JustUpdateDeviceLine();

case 28:
//if
this.state = 31;
if (RemoteObject.solveBoolean("=",_value,(parent._tipocontrol_lmb4xcombobox)) && RemoteObject.solveBoolean("=",_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"getChecked"),parent.__c.getField(true,"False"))) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 1819;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El tipo de control = "),parent._tipocontrol_lmb4xcombobox,RemoteObject.createImmutable(" es siempre editable. Se modifica el valor Editable a true."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1820;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "cbotipocontrol_valuechanged"), _msa);
this.state = 58;
return;
case 58:
//C
this.state = 31;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1821;BA.debugLine="clvIV.chkBoxControlEditable.Checked=True";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"True"));
 if (true) break;
;
 BA.debugLineNum = 1824;BA.debugLine="If Value=TipoControl_B4XInputDialogTextField And";
Debug.JustUpdateDeviceLine();

case 31:
//if
this.state = 34;
if (RemoteObject.solveBoolean("=",_value,(parent._tipocontrol_b4xinputdialogtextfield)) && RemoteObject.solveBoolean("=",_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"getChecked"),parent.__c.getField(true,"False"))) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 1825;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El tipo de control = "),parent._tipocontrol_b4xinputdialogtextfield,RemoteObject.createImmutable(" es siempre editable. Se modifica el valor Editable a true."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1826;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "cbotipocontrol_valuechanged"), _msa);
this.state = 59;
return;
case 59:
//C
this.state = 34;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1827;BA.debugLine="clvIV.chkBoxControlEditable.Checked=True";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"True"));
 if (true) break;
;
 BA.debugLineNum = 1830;BA.debugLine="If Value=TipoControl_B4XSearchListDialogTextField";
Debug.JustUpdateDeviceLine();

case 34:
//if
this.state = 37;
if (RemoteObject.solveBoolean("=",_value,(parent._tipocontrol_b4xsearchlistdialogtextfield)) && RemoteObject.solveBoolean("=",_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"getChecked"),parent.__c.getField(true,"False"))) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 1831;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El tipo de control = "),parent._tipocontrol_b4xsearchlistdialogtextfield,RemoteObject.createImmutable(" es siempre editable. Se modifica el valor Editable a true."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1832;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "cbotipocontrol_valuechanged"), _msa);
this.state = 60;
return;
case 60:
//C
this.state = 37;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1833;BA.debugLine="clvIV.chkBoxControlEditable.Checked=True";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"True"));
 if (true) break;
;
 BA.debugLineNum = 1836;BA.debugLine="If Value=TipoControl_B4XListDialogTextField And c";
Debug.JustUpdateDeviceLine();

case 37:
//if
this.state = 40;
if (RemoteObject.solveBoolean("=",_value,(parent._tipocontrol_b4xlistdialogtextfield)) && RemoteObject.solveBoolean("=",_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"getChecked"),parent.__c.getField(true,"False"))) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 1837;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El tipo de control = "),parent._tipocontrol_b4xlistdialogtextfield,RemoteObject.createImmutable(" es siempre editable. Se modifica el valor Editable a true."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1838;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "cbotipocontrol_valuechanged"), _msa);
this.state = 61;
return;
case 61:
//C
this.state = 40;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1839;BA.debugLine="clvIV.chkBoxControlEditable.Checked=True";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"True"));
 if (true) break;
;
 BA.debugLineNum = 1842;BA.debugLine="If Value=TipoControl_TextFieldButtonSelFecha And";
Debug.JustUpdateDeviceLine();

case 40:
//if
this.state = 43;
if (RemoteObject.solveBoolean("=",_value,(parent._tipocontrol_textfieldbuttonselfecha)) && RemoteObject.solveBoolean("=",_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"getChecked"),parent.__c.getField(true,"False"))) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 1843;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El tipo de control = "),parent._tipocontrol_textfieldbuttonselfecha,RemoteObject.createImmutable(" es siempre editable. Se modifica el valor Editable a true."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1844;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "cbotipocontrol_valuechanged"), _msa);
this.state = 62;
return;
case 62:
//C
this.state = 43;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1845;BA.debugLine="clvIV.chkBoxControlEditable.Checked=True";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"True"));
 if (true) break;
;
 BA.debugLineNum = 1848;BA.debugLine="If Value=TipoControl_TextFieldButtonSelFile And c";
Debug.JustUpdateDeviceLine();

case 43:
//if
this.state = 46;
if (RemoteObject.solveBoolean("=",_value,(parent._tipocontrol_textfieldbuttonselfile)) && RemoteObject.solveBoolean("=",_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"getChecked"),parent.__c.getField(true,"False"))) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 1849;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El tipo de control = "),parent._tipocontrol_textfieldbuttonselfile,RemoteObject.createImmutable(" es siempre editable. Se modifica el valor Editable a true."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1850;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "cbotipocontrol_valuechanged"), _msa);
this.state = 63;
return;
case 63:
//C
this.state = 46;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1851;BA.debugLine="clvIV.chkBoxControlEditable.Checked=True";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"True"));
 if (true) break;
;
 BA.debugLineNum = 1854;BA.debugLine="If Value=TipoControl_TextFieldButtonSelExt And cl";
Debug.JustUpdateDeviceLine();

case 46:
//if
this.state = 49;
if (RemoteObject.solveBoolean("=",_value,(parent._tipocontrol_textfieldbuttonselext)) && RemoteObject.solveBoolean("=",_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"getChecked"),parent.__c.getField(true,"False"))) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 1855;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El tipo de control = "),parent._tipocontrol_textfieldbuttonselext,RemoteObject.createImmutable(" es siempre editable. Se modifica el valor Editable a true."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1856;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "cbotipocontrol_valuechanged"), _msa);
this.state = 64;
return;
case 64:
//C
this.state = 49;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1857;BA.debugLine="clvIV.chkBoxControlEditable.Checked=True";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"True"));
 if (true) break;
;
 BA.debugLineNum = 1860;BA.debugLine="If Value=TipoControl_TextField And clvIV.chkBoxCo";
Debug.JustUpdateDeviceLine();

case 49:
//if
this.state = 52;
if (RemoteObject.solveBoolean("=",_value,(parent._tipocontrol_textfield)) && RemoteObject.solveBoolean("=",_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"getChecked"),parent.__c.getField(true,"True"))) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
 BA.debugLineNum = 1861;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El tipo de control = "),parent._tipocontrol_textfield,RemoteObject.createImmutable(" no puede ser editable."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Para los casos de campo editable, usar "),parent._tipocontrol_b4xinputdialogtextfield)),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1862;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "cbotipocontrol_valuechanged"), _msa);
this.state = 65;
return;
case 65:
//C
this.state = 52;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1863;BA.debugLine="clvIV.chkBoxControlEditable.Checked=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 if (true) break;

case 52:
//C
this.state = -1;
;
 BA.debugLineNum = 1908;BA.debugLine="End Sub";
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
public static RemoteObject  _cbotipodato_valuechanged(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("cboTipoDato_ValueChanged (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1576);
if (RapidSub.canDelegate("cbotipodato_valuechanged")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","cbotipodato_valuechanged", _value);}
RemoteObject _cbotd = RemoteObject.declareNull("anywheresoftware.b4j.objects.ComboBoxWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamrecordformbuilder._clvrecordformitemvalue");
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1576;BA.debugLine="Sub cboTipoDato_ValueChanged (Value As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1577;BA.debugLine="If CargandoDatos Then Return";
Debug.JustUpdateDeviceLine();
if (jamrecordformbuilder._cargandodatos.<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1578;BA.debugLine="Dim cboTD As ComboBox=Sender";
Debug.JustUpdateDeviceLine();
_cbotd = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");
_cbotd = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ComboBoxWrapper"), jamrecordformbuilder.__c.runMethod(false,"Sender",jamrecordformbuilder.ba));Debug.locals.put("cboTD", _cbotd);Debug.locals.put("cboTD", _cbotd);
 BA.debugLineNum = 1579;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
Debug.JustUpdateDeviceLine();
_index = jamrecordformbuilder._clvlistacampos.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _cbotd.getObject()));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 1580;BA.debugLine="Dim clvIV As clvRecordFormItemValue=clvListaCampo";
Debug.JustUpdateDeviceLine();
_clviv = (jamrecordformbuilder._clvlistacampos.runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 1581;BA.debugLine="If cboTD.value<>\"INTEGER\" And cboTD.Value<>\"REAL\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_cbotd.runMethod(false,"getValue"),RemoteObject.createImmutable(("INTEGER"))) && RemoteObject.solveBoolean("!",_cbotd.runMethod(false,"getValue"),RemoteObject.createImmutable(("REAL"))) && RemoteObject.solveBoolean(".",_clviv.getField(false,"chkBoxEsFecha" /*RemoteObject*/ ).runMethod(true,"getChecked"))) { 
_clviv.getField(false,"chkBoxEsFecha" /*RemoteObject*/ ).runMethod(true,"setChecked",jamrecordformbuilder.__c.getField(true,"False"));};
 BA.debugLineNum = 1582;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cbotipodatosaux_valuechanged(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("cboTipoDatosAux_ValueChanged (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,2052);
if (RapidSub.canDelegate("cbotipodatosaux_valuechanged")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","cbotipodatosaux_valuechanged", _value);}
RemoteObject _cbo = RemoteObject.declareNull("anywheresoftware.b4j.objects.ComboBoxWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamrecordformbuilder._clvrecordformitemvalue");
Debug.locals.put("Value", _value);
 BA.debugLineNum = 2052;BA.debugLine="Sub cboTipoDatosAux_ValueChanged (Value As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2053;BA.debugLine="If CargandoDatos Then Return";
Debug.JustUpdateDeviceLine();
if (jamrecordformbuilder._cargandodatos.<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 2055;BA.debugLine="Dim cbo As ComboBox=Sender";
Debug.JustUpdateDeviceLine();
_cbo = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");
_cbo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ComboBoxWrapper"), jamrecordformbuilder.__c.runMethod(false,"Sender",jamrecordformbuilder.ba));Debug.locals.put("cbo", _cbo);Debug.locals.put("cbo", _cbo);
 BA.debugLineNum = 2057;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
Debug.JustUpdateDeviceLine();
_index = jamrecordformbuilder._clvlistacampos.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _cbo.getObject()));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 2058;BA.debugLine="Dim clvIV As clvRecordFormItemValue=clvListaCampo";
Debug.JustUpdateDeviceLine();
_clviv = (jamrecordformbuilder._clvlistacampos.runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 2062;BA.debugLine="clvIV.lblTitleListaValoresDatosAux.Visible=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleListaValoresDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 2063;BA.debugLine="clvIV.txtListaValoresDatosAux.Visible=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtListaValoresDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 2065;BA.debugLine="clvIV.btnIgualOrigenDatosAux.Visible=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"btnIgualOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 2066;BA.debugLine="clvIV.lblTitleIPJrdcOrigenDatosAux.Visible=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleIPJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 2067;BA.debugLine="clvIV.txtIPJrdcOrigenDatosAux.Visible=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtIPJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 2068;BA.debugLine="clvIV.lblTitlePuertoJrdcOrigenDatosAux.Visible=Fa";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitlePuertoJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 2069;BA.debugLine="clvIV.txtPuertoJrdcOrigenDatosAux.Visible=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtPuertoJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 2070;BA.debugLine="clvIV.lblTitleComandoConfigDatosAux.Visible=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleComandoConfigDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 2071;BA.debugLine="clvIV.txtComandoConfigDatosAux.Visible=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtComandoConfigDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 2072;BA.debugLine="clvIV.lblTitleParametrosComandoDatosAux.Visible=F";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleParametrosComandoDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 2073;BA.debugLine="clvIV.txtParametrosComandoDatosAux.Visible=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtParametrosComandoDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 2074;BA.debugLine="clvIV.lblTitleNumCamposDatosAux.Visible=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleNumCamposDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 2075;BA.debugLine="clvIV.B4XPlusMinusNumCamposDatosAux.mBase.Visible";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"B4XPlusMinusNumCamposDatosAux" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"False"));
 BA.debugLineNum = 2078;BA.debugLine="clvIV.txtListaValoresDatosAux.Text=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtListaValoresDatosAux" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 2079;BA.debugLine="clvIV.txtIPJrdcOrigenDatosAux.text=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtIPJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 2080;BA.debugLine="clvIV.txtPuertoJrdcOrigenDatosAux.text=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtPuertoJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 2081;BA.debugLine="clvIV.txtComandoConfigDatosAux.Text=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtComandoConfigDatosAux" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 2082;BA.debugLine="clvIV.txtParametrosComandoDatosAux.Text=\"\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtParametrosComandoDatosAux" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 2083;BA.debugLine="clvIV.B4XPlusMinusNumCamposDatosAux.SelectedValue";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"B4XPlusMinusNumCamposDatosAux" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xplusminus.class, "_setselectedvalue" /*RemoteObject*/ ,RemoteObject.createImmutable((1)));
 BA.debugLineNum = 2086;BA.debugLine="clvIV.lblTitleListaValoresDatosAux.Visible=Value=";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleListaValoresDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Lista")))));
 BA.debugLineNum = 2087;BA.debugLine="clvIV.txtListaValoresDatosAux.Visible=Value=\"List";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtListaValoresDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Lista")))));
 BA.debugLineNum = 2089;BA.debugLine="clvIV.btnIgualOrigenDatosAux.Visible=Value=\"Consu";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"btnIgualOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Consulta")))));
 BA.debugLineNum = 2090;BA.debugLine="clvIV.lblTitleIPJrdcOrigenDatosAux.Visible=Value=";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleIPJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Consulta")))));
 BA.debugLineNum = 2091;BA.debugLine="clvIV.txtIPJrdcOrigenDatosAux.Visible=Value=\"Cons";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtIPJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Consulta")))));
 BA.debugLineNum = 2092;BA.debugLine="clvIV.lblTitlePuertoJrdcOrigenDatosAux.Visible=Va";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitlePuertoJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Consulta")))));
 BA.debugLineNum = 2093;BA.debugLine="clvIV.txtPuertoJrdcOrigenDatosAux.Visible=Value=\"";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtPuertoJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Consulta")))));
 BA.debugLineNum = 2094;BA.debugLine="clvIV.lblTitleComandoConfigDatosAux.Visible=Value";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleComandoConfigDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Consulta")))));
 BA.debugLineNum = 2095;BA.debugLine="clvIV.txtComandoConfigDatosAux.Visible=Value=\"Con";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtComandoConfigDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Consulta")))));
 BA.debugLineNum = 2096;BA.debugLine="clvIV.lblTitleParametrosComandoDatosAux.Visible=V";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleParametrosComandoDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Consulta")))));
 BA.debugLineNum = 2097;BA.debugLine="clvIV.txtParametrosComandoDatosAux.Visible=Value=";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtParametrosComandoDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Consulta")))));
 BA.debugLineNum = 2098;BA.debugLine="clvIV.lblTitleNumCamposDatosAux.Visible=Value=\"Co";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"lblTitleNumCamposDatosAux" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Consulta")))));
 BA.debugLineNum = 2099;BA.debugLine="clvIV.B4XPlusMinusNumCamposDatosAux.mBase.Visible";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"B4XPlusMinusNumCamposDatosAux" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Consulta")))));
 BA.debugLineNum = 2102;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _cbotipoorigendatos_valuechanged(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("cboTipoOrigenDatos_ValueChanged (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1612);
if (RapidSub.canDelegate("cbotipoorigendatos_valuechanged")) { b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","cbotipoorigendatos_valuechanged", _value); return;}
ResumableSub_cboTipoOrigenDatos_ValueChanged rsub = new ResumableSub_cboTipoOrigenDatos_ValueChanged(null,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cboTipoOrigenDatos_ValueChanged extends BA.ResumableSub {
public ResumableSub_cboTipoOrigenDatos_ValueChanged(b4j.docU.jamrecordformbuilder parent,RemoteObject _value) {
this.parent = parent;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
RemoteObject _value;
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cboTipoOrigenDatos_ValueChanged (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1612);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1613;BA.debugLine="If CargandoDatos Then Return";
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
 BA.debugLineNum = 1614;BA.debugLine="If Value=\"JRDC Query\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("JRDC Query")))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1615;BA.debugLine="prefDialog.Initialize(frm.RootPane,\"Datos JRDC\",";
Debug.JustUpdateDeviceLine();
parent._prefdialog.runClassMethod (b4j.docU.preferencesdialog.class, "_initialize" /*RemoteObject*/ ,jamrecordformbuilder.ba,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent._frm.runMethod(false,"getRootPane").getObject()),(Object)(RemoteObject.createImmutable(("Datos JRDC"))),(Object)(BA.numberCast(int.class, 800)),(Object)(BA.numberCast(int.class, 600)));
 BA.debugLineNum = 1617;BA.debugLine="prefDialog.LoadFromJson(File.ReadString(File.Dir";
Debug.JustUpdateDeviceLine();
parent._prefdialog.runClassMethod (b4j.docU.preferencesdialog.class, "_loadfromjson" /*RemoteObject*/ ,(Object)(parent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("OrigenDatosJrdcRecordFormBuilder.json")))));
 BA.debugLineNum = 1618;BA.debugLine="Dim data As Map=CreateMap(\"DBMS\":\"MySQL\")";
Debug.JustUpdateDeviceLine();
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_data = parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("DBMS")),(RemoteObject.createImmutable("MySQL"))}));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 1619;BA.debugLine="Wait For (prefDialog.ShowDialog(data, \"OK\", \"CAN";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "cbotipoorigendatos_valuechanged"), parent._prefdialog.runClassMethod (b4j.docU.preferencesdialog.class, "_showdialog" /*RemoteObject*/ ,(Object)(_data),(Object)(RemoteObject.createImmutable(("OK"))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 11;
return;
case 11:
//C
this.state = 10;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 1624;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("CheckChanges (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1286);
if (RapidSub.canDelegate("checkchanges")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","checkchanges");}
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
public ResumableSub_CheckChanges(b4j.docU.jamrecordformbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
RemoteObject _s = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CheckChanges (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1286);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 1287;BA.debugLine="If CurrentFile = \"\" Then Return False";
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
 BA.debugLineNum = 1289;BA.debugLine="Dim s As String = ExportDataToString";
Debug.JustUpdateDeviceLine();
_s = _exportdatatostring();Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 1290;BA.debugLine="If s <> CurrentFileString And s <> NewFileString";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 18;
if (RemoteObject.solveBoolean("!",_s,parent._currentfilestring) && RemoteObject.solveBoolean("!",_s,parent._newfilestring)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1291;BA.debugLine="Wait For (Dialog.Show(\"¿Grabar cambios?\", \"Sí\",";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "checkchanges"), parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_show" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(("¿Grabar cambios?"))),(Object)(RemoteObject.createImmutable(("Sí"))),(Object)(RemoteObject.createImmutable(("No"))),(Object)((RemoteObject.createImmutable("Cancelar")))));
this.state = 19;
return;
case 19:
//C
this.state = 10;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1292;BA.debugLine="Select Result";
Debug.JustUpdateDeviceLine();
if (true) break;

case 10:
//select
this.state = 17;
switch (BA.switchObjectToInt(_result,parent._xui.getField(true,"DialogResponse_Cancel"),parent._xui.getField(true,"DialogResponse_Negative"),parent._xui.getField(true,"DialogResponse_Positive"))) {
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
}
if (true) break;

case 12:
//C
this.state = 17;
 BA.debugLineNum = 1294;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 14:
//C
this.state = 17;
 BA.debugLineNum = 1296;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1298;BA.debugLine="mnuSave_Action";
Debug.JustUpdateDeviceLine();
_mnusave_action();
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 1301;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 1302;BA.debugLine="End Sub";
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
public static void  _chkboxcontroleditable_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkBoxControlEditable_CheckedChange (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1914);
if (RapidSub.canDelegate("chkboxcontroleditable_checkedchange")) { b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","chkboxcontroleditable_checkedchange", _checked); return;}
ResumableSub_chkBoxControlEditable_CheckedChange rsub = new ResumableSub_chkBoxControlEditable_CheckedChange(null,_checked);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_chkBoxControlEditable_CheckedChange extends BA.ResumableSub {
public ResumableSub_chkBoxControlEditable_CheckedChange(b4j.docU.jamrecordformbuilder parent,RemoteObject _checked) {
this.parent = parent;
this._checked = _checked;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
RemoteObject _checked;
RemoteObject _chkce = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamrecordformbuilder._clvrecordformitemvalue");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("chkBoxControlEditable_CheckedChange (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1914);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 1915;BA.debugLine="If CargandoDatos Then Return";
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
 BA.debugLineNum = 1917;BA.debugLine="If CorrigiendoChkBoxControlEditable Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 10;
if (parent._corrigiendochkboxcontroleditable.<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1918;BA.debugLine="CorrigiendoChkBoxControlEditable=False";
Debug.JustUpdateDeviceLine();
parent._corrigiendochkboxcontroleditable = parent.__c.getField(true,"False");
 BA.debugLineNum = 1919;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 1922;BA.debugLine="Dim chkCE As CheckBox=Sender";
Debug.JustUpdateDeviceLine();
_chkce = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
_chkce = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.CheckboxWrapper"), parent.__c.runMethod(false,"Sender",jamrecordformbuilder.ba));Debug.locals.put("chkCE", _chkce);Debug.locals.put("chkCE", _chkce);
 BA.debugLineNum = 1923;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
Debug.JustUpdateDeviceLine();
_index = parent._clvlistacampos.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _chkce.getObject()));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 1924;BA.debugLine="Dim clvIV As clvRecordFormItemValue=clvListaCampo";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 1925;BA.debugLine="If Checked And clvIV.chkBoxAutoIncremental.Checke";
Debug.JustUpdateDeviceLine();
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean(".",_checked) && RemoteObject.solveBoolean(".",_clviv.getField(false,"chkBoxAutoIncremental" /*RemoteObject*/ ).runMethod(true,"getChecked"))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1926;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un tipo de";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(BA.ObjectToString("Un tipo de dato Autoincremental no puede ser ser editable.")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1927;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "chkboxcontroleditable_checkedchange"), _msa);
this.state = 39;
return;
case 39:
//C
this.state = 14;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1928;BA.debugLine="CorrigiendoChkBoxControlEditable=True";
Debug.JustUpdateDeviceLine();
parent._corrigiendochkboxcontroleditable = parent.__c.getField(true,"True");
 BA.debugLineNum = 1929;BA.debugLine="chkCE.Checked=False";
Debug.JustUpdateDeviceLine();
_chkce.runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1930;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 1932;BA.debugLine="If Checked And clvIV.cboTipoControl.value=\"\" Then";
Debug.JustUpdateDeviceLine();

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean(".",_checked) && RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoControl" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("")))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1933;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un tipo de";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(BA.ObjectToString("Un tipo de control vacío no puede ser ser editable.")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1934;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "chkboxcontroleditable_checkedchange"), _msa);
this.state = 40;
return;
case 40:
//C
this.state = 17;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1935;BA.debugLine="CorrigiendoChkBoxControlEditable=True";
Debug.JustUpdateDeviceLine();
parent._corrigiendochkboxcontroleditable = parent.__c.getField(true,"True");
 BA.debugLineNum = 1936;BA.debugLine="chkCE.Checked=False";
Debug.JustUpdateDeviceLine();
_chkce.runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1937;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 1939;BA.debugLine="If Checked=False And clvIV.cboTipoControl.value=T";
Debug.JustUpdateDeviceLine();

case 17:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_checked,parent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoControl" /*RemoteObject*/ ).runMethod(false,"getValue"),(parent._tipocontrol_combobox))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 1940;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un tipo de";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(BA.ObjectToString("Un tipo de control ComboBox es siempre editable.")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1941;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "chkboxcontroleditable_checkedchange"), _msa);
this.state = 41;
return;
case 41:
//C
this.state = 20;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1942;BA.debugLine="CorrigiendoChkBoxControlEditable=True";
Debug.JustUpdateDeviceLine();
parent._corrigiendochkboxcontroleditable = parent.__c.getField(true,"True");
 BA.debugLineNum = 1943;BA.debugLine="chkCE.Checked=True";
Debug.JustUpdateDeviceLine();
_chkce.runMethod(true,"setChecked",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1944;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 1946;BA.debugLine="If Checked=False And clvIV.cboTipoControl.value=T";
Debug.JustUpdateDeviceLine();

case 20:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",_checked,parent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoControl" /*RemoteObject*/ ).runMethod(false,"getValue"),(parent._tipocontrol_lmb4xcombobox))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 1947;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un tipo de";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(BA.ObjectToString("Un tipo de control lmB4XComboBox es siempre editable.")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1948;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "chkboxcontroleditable_checkedchange"), _msa);
this.state = 42;
return;
case 42:
//C
this.state = 23;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1949;BA.debugLine="CorrigiendoChkBoxControlEditable=True";
Debug.JustUpdateDeviceLine();
parent._corrigiendochkboxcontroleditable = parent.__c.getField(true,"True");
 BA.debugLineNum = 1950;BA.debugLine="chkCE.Checked=True";
Debug.JustUpdateDeviceLine();
_chkce.runMethod(true,"setChecked",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1951;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 1954;BA.debugLine="If Checked=False And clvIV.cboTipoControl.value=T";
Debug.JustUpdateDeviceLine();

case 23:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",_checked,parent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoControl" /*RemoteObject*/ ).runMethod(false,"getValue"),(parent._tipocontrol_b4xinputdialogtextfield))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 1955;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un tipo de";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Un tipo de control B4XInputDialogTextField es siempre editable."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("En caso de campo no editable, seleccionar "),parent._tipocontrol_textfield,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1956;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "chkboxcontroleditable_checkedchange"), _msa);
this.state = 43;
return;
case 43:
//C
this.state = 26;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1957;BA.debugLine="CorrigiendoChkBoxControlEditable=True";
Debug.JustUpdateDeviceLine();
parent._corrigiendochkboxcontroleditable = parent.__c.getField(true,"True");
 BA.debugLineNum = 1958;BA.debugLine="chkCE.Checked=True";
Debug.JustUpdateDeviceLine();
_chkce.runMethod(true,"setChecked",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1959;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 1962;BA.debugLine="If Checked=False And clvIV.cboTipoControl.value=T";
Debug.JustUpdateDeviceLine();

case 26:
//if
this.state = 29;
if (RemoteObject.solveBoolean("=",_checked,parent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoControl" /*RemoteObject*/ ).runMethod(false,"getValue"),(parent._tipocontrol_b4xlistdialogtextfield))) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 1963;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un tipo de";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Un tipo de control "),parent._tipocontrol_b4xlistdialogtextfield,RemoteObject.createImmutable(" es siempre editable."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("En caso de campo no editable, seleccionar "),parent._tipocontrol_textfield,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1964;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "chkboxcontroleditable_checkedchange"), _msa);
this.state = 44;
return;
case 44:
//C
this.state = 29;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1965;BA.debugLine="CorrigiendoChkBoxControlEditable=True";
Debug.JustUpdateDeviceLine();
parent._corrigiendochkboxcontroleditable = parent.__c.getField(true,"True");
 BA.debugLineNum = 1966;BA.debugLine="chkCE.Checked=True";
Debug.JustUpdateDeviceLine();
_chkce.runMethod(true,"setChecked",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1967;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 1970;BA.debugLine="If Checked=False And clvIV.cboTipoControl.value=T";
Debug.JustUpdateDeviceLine();

case 29:
//if
this.state = 32;
if (RemoteObject.solveBoolean("=",_checked,parent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoControl" /*RemoteObject*/ ).runMethod(false,"getValue"),(parent._tipocontrol_b4xsearchlistdialogtextfield))) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 1971;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un tipo de";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Un tipo de control "),parent._tipocontrol_b4xsearchlistdialogtextfield,RemoteObject.createImmutable(" es siempre editable."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("En caso de campo no editable, seleccionar "),parent._tipocontrol_textfield,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1972;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "chkboxcontroleditable_checkedchange"), _msa);
this.state = 45;
return;
case 45:
//C
this.state = 32;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1973;BA.debugLine="CorrigiendoChkBoxControlEditable=True";
Debug.JustUpdateDeviceLine();
parent._corrigiendochkboxcontroleditable = parent.__c.getField(true,"True");
 BA.debugLineNum = 1974;BA.debugLine="chkCE.Checked=True";
Debug.JustUpdateDeviceLine();
_chkce.runMethod(true,"setChecked",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1975;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 1978;BA.debugLine="If Checked=True And clvIV.cboTipoControl.value=Ti";
Debug.JustUpdateDeviceLine();

case 32:
//if
this.state = 35;
if (RemoteObject.solveBoolean("=",_checked,parent.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoControl" /*RemoteObject*/ ).runMethod(false,"getValue"),(parent._tipocontrol_textfield))) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 1979;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un tipo de";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Un tipo de control "),parent._tipocontrol_textfield,RemoteObject.createImmutable(" es siempre no editable."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1980;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "chkboxcontroleditable_checkedchange"), _msa);
this.state = 46;
return;
case 46:
//C
this.state = 35;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1981;BA.debugLine="CorrigiendoChkBoxControlEditable=True";
Debug.JustUpdateDeviceLine();
parent._corrigiendochkboxcontroleditable = parent.__c.getField(true,"True");
 BA.debugLineNum = 1982;BA.debugLine="chkCE.Checked=False";
Debug.JustUpdateDeviceLine();
_chkce.runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1983;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 1986;BA.debugLine="If Checked=True And clvIV.cboTipoControl.value=Ti";
Debug.JustUpdateDeviceLine();

case 35:
//if
this.state = 38;
if (RemoteObject.solveBoolean("=",_checked,parent.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoControl" /*RemoteObject*/ ).runMethod(false,"getValue"),(parent._tipocontrol_textfield))) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 1987;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un tipo de";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Un tipo de control "),parent._tipocontrol_textfield,RemoteObject.createImmutable(" puede ser editable, pero no tendrá eventos BeforeUpdate ni AfterUpdate."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Para los casos de campo editable en los que sean necesarios los eventos, usar "),parent._tipocontrol_b4xinputdialogtextfield)),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1988;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "chkboxcontroleditable_checkedchange"), _msa);
this.state = 47;
return;
case 47:
//C
this.state = 38;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 38:
//C
this.state = -1;
;
 BA.debugLineNum = 1990;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("chkBoxEsFecha_CheckedChange (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1539);
if (RapidSub.canDelegate("chkboxesfecha_checkedchange")) { b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","chkboxesfecha_checkedchange", _checked); return;}
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
public ResumableSub_chkBoxEsFecha_CheckedChange(b4j.docU.jamrecordformbuilder parent,RemoteObject _checked) {
this.parent = parent;
this._checked = _checked;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
RemoteObject _checked;
RemoteObject _chkesf = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamrecordformbuilder._clvrecordformitemvalue");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("chkBoxEsFecha_CheckedChange (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1539);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 1540;BA.debugLine="If CargandoDatos Then Return";
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
 BA.debugLineNum = 1542;BA.debugLine="If CorrigiendoChkBoxEsFecha Then";
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
 BA.debugLineNum = 1543;BA.debugLine="CorrigiendoChkBoxEsFecha=False";
Debug.JustUpdateDeviceLine();
parent._corrigiendochkboxesfecha = parent.__c.getField(true,"False");
 BA.debugLineNum = 1544;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 1547;BA.debugLine="Dim chkEsF As CheckBox=Sender";
Debug.JustUpdateDeviceLine();
_chkesf = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
_chkesf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.CheckboxWrapper"), parent.__c.runMethod(false,"Sender",jamrecordformbuilder.ba));Debug.locals.put("chkEsF", _chkesf);Debug.locals.put("chkEsF", _chkesf);
 BA.debugLineNum = 1548;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
Debug.JustUpdateDeviceLine();
_index = parent._clvlistacampos.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _chkesf.getObject()));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 1549;BA.debugLine="Dim clvIV As clvRecordFormItemValue=clvListaCampo";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 1550;BA.debugLine="If Checked And clvIV.cboTipoDato.Value<>\"INTEGER\"";
Debug.JustUpdateDeviceLine();
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean(".",_checked) && RemoteObject.solveBoolean("!",_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("INTEGER"))) && RemoteObject.solveBoolean("!",_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("REAL")))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1551;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un tipo de";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Un tipo de dato="),_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(" no puede ser una fecha."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1552;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "chkboxesfecha_checkedchange"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 14;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1553;BA.debugLine="CorrigiendoChkBoxEsFecha=True";
Debug.JustUpdateDeviceLine();
parent._corrigiendochkboxesfecha = parent.__c.getField(true,"True");
 BA.debugLineNum = 1554;BA.debugLine="chkEsF.Checked=False";
Debug.JustUpdateDeviceLine();
_chkesf.runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 if (true) break;
;
 BA.debugLineNum = 1557;BA.debugLine="If Checked=False And clvIV.cboTipoControl.Value=T";
Debug.JustUpdateDeviceLine();

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_checked,parent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoControl" /*RemoteObject*/ ).runMethod(false,"getValue"),(parent._tipocontrol_textfieldbuttonselfecha))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1558;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Si el tipo";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Si el tipo de control edicion es = "),parent._tipocontrol_textfieldbuttonselfecha,RemoteObject.createImmutable(" , el campo tiene que ser tipo fecha. Si no lo es, deja primero el tipo control filtro en blanco."))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1559;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "chkboxesfecha_checkedchange"), _msa);
this.state = 19;
return;
case 19:
//C
this.state = 17;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1560;BA.debugLine="CorrigiendoChkBoxEsFecha=True";
Debug.JustUpdateDeviceLine();
parent._corrigiendochkboxesfecha = parent.__c.getField(true,"True");
 BA.debugLineNum = 1561;BA.debugLine="chkEsF.Checked=True";
Debug.JustUpdateDeviceLine();
_chkesf.runMethod(true,"setChecked",parent.__c.getField(true,"True"));
 if (true) break;

case 17:
//C
this.state = -1;
;
 BA.debugLineNum = 1563;BA.debugLine="End Sub";
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
public static RemoteObject  _colortohex(RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("ColorToHex (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,966);
if (RapidSub.canDelegate("colortohex")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","colortohex", _clr);}
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 966;BA.debugLine="Private Sub ColorToHex(clr As Int) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 967;BA.debugLine="Dim bc As ByteConverter";
Debug.JustUpdateDeviceLine();
_bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 968;BA.debugLine="Return bc.HexFromBytes(bc.IntsToBytes(Array As In";
Debug.JustUpdateDeviceLine();
if (true) return _bc.runMethod(true,"HexFromBytes",(Object)(_bc.runMethod(false,"IntsToBytes",(Object)(RemoteObject.createNewArray("int",new int[] {1},new Object[] {_clr})))));
 BA.debugLineNum = 969;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _comprobaravisosregistro() throws Exception{
try {
		Debug.PushSubsStack("ComprobarAvisosRegistro (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1316);
if (RapidSub.canDelegate("comprobaravisosregistro")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","comprobaravisosregistro");}
ResumableSub_ComprobarAvisosRegistro rsub = new ResumableSub_ComprobarAvisosRegistro(null);
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
public static class ResumableSub_ComprobarAvisosRegistro extends BA.ResumableSub {
public ResumableSub_ComprobarAvisosRegistro(b4j.docU.jamrecordformbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
RemoteObject _lstcampos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstencabezados = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstprimarykeys = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _numerocontrolesformulario = RemoteObject.createImmutable(0);
RemoteObject _numerocontroleseditablesformulario = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamrecordformbuilder._clvrecordformitemvalue");
RemoteObject _nombrecampocontrolindependiente = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _nombrecampo = RemoteObject.createImmutable("");
int step9;
int limit9;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ComprobarAvisosRegistro (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1316);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 1317;BA.debugLine="Dim lstCampos As List";
Debug.JustUpdateDeviceLine();
_lstcampos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCampos", _lstcampos);
 BA.debugLineNum = 1318;BA.debugLine="lstCampos.Initialize";
Debug.JustUpdateDeviceLine();
_lstcampos.runVoidMethod ("Initialize");
 BA.debugLineNum = 1319;BA.debugLine="Dim lstEncabezados As List";
Debug.JustUpdateDeviceLine();
_lstencabezados = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstEncabezados", _lstencabezados);
 BA.debugLineNum = 1320;BA.debugLine="lstEncabezados.Initialize";
Debug.JustUpdateDeviceLine();
_lstencabezados.runVoidMethod ("Initialize");
 BA.debugLineNum = 1322;BA.debugLine="Dim lstPrimaryKeys As List";
Debug.JustUpdateDeviceLine();
_lstprimarykeys = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstPrimaryKeys", _lstprimarykeys);
 BA.debugLineNum = 1323;BA.debugLine="lstPrimaryKeys.Initialize";
Debug.JustUpdateDeviceLine();
_lstprimarykeys.runVoidMethod ("Initialize");
 BA.debugLineNum = 1328;BA.debugLine="Dim NumeroControlesFormulario As Int";
Debug.JustUpdateDeviceLine();
_numerocontrolesformulario = RemoteObject.createImmutable(0);Debug.locals.put("NumeroControlesFormulario", _numerocontrolesformulario);
 BA.debugLineNum = 1329;BA.debugLine="Dim NumeroControlesEditablesFormulario As Int";
Debug.JustUpdateDeviceLine();
_numerocontroleseditablesformulario = RemoteObject.createImmutable(0);Debug.locals.put("NumeroControlesEditablesFormulario", _numerocontroleseditablesformulario);
 BA.debugLineNum = 1331;BA.debugLine="For i = 0 To clvListaCampos.Size - 1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//for
this.state = 77;
step9 = 1;
limit9 = RemoteObject.solve(new RemoteObject[] {parent._clvlistacampos.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 117;
if (true) break;

case 117:
//C
this.state = 77;
if ((step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9)) this.state = 3;
if (true) break;

case 118:
//C
this.state = 117;
_i = ((int)(0 + _i + step9)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1333;BA.debugLine="Dim clvIV As clvRecordFormItemValue=clvListaCamp";
Debug.JustUpdateDeviceLine();
_clviv = (parent._clvlistacampos.runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 1335;BA.debugLine="If clvIV.chkBoxControlIndependiente.Checked Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 11;
if (_clviv.getField(false,"chkBoxControlIndependiente" /*RemoteObject*/ ).runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1336;BA.debugLine="Dim NombreCampoControlIndependiente As String=c";
Debug.JustUpdateDeviceLine();
_nombrecampocontrolindependiente = _clviv.getField(false,"txtCampo" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("NombreCampoControlIndependiente", _nombrecampocontrolindependiente);Debug.locals.put("NombreCampoControlIndependiente", _nombrecampocontrolindependiente);
 BA.debugLineNum = 1337;BA.debugLine="If lstNombresCamposSQL.IndexOf(NombreCampoContr";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean(">",parent._lstnombrescampossql.runMethod(true,"IndexOf",(Object)((_nombrecampocontrolindependiente))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1338;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El nombre";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El nombre de campo del control independiente "),_nombrecampocontrolindependiente,RemoteObject.createImmutable(" coincide con el campo de la tabla."))),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1339;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 119;
return;
case 119:
//C
this.state = 10;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1340;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 1346;BA.debugLine="Dim NombreCampo As String=clvIV.txtCampo.Text";
Debug.JustUpdateDeviceLine();
_nombrecampo = _clviv.getField(false,"txtCampo" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("NombreCampo", _nombrecampo);Debug.locals.put("NombreCampo", _nombrecampo);
 BA.debugLineNum = 1347;BA.debugLine="If lstCampos.IndexOf(NombreCampo)>-1 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 12:
//if
this.state = 15;
if (RemoteObject.solveBoolean(">",_lstcampos.runMethod(true,"IndexOf",(Object)((_nombrecampo))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 1348;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El nombre";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El nombre de campo "),_nombrecampo,RemoteObject.createImmutable(" está repetido."))),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1349;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 120;
return;
case 120:
//C
this.state = 15;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1350;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 1353;BA.debugLine="If clvIV.txtTituloCampo.Text<>\"\" Then";
Debug.JustUpdateDeviceLine();

case 15:
//if
this.state = 24;
if (RemoteObject.solveBoolean("!",_clviv.getField(false,"txtTituloCampo" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 1354;BA.debugLine="If lstEncabezados.IndexOf(clvIV.txtTituloCampo.";
Debug.JustUpdateDeviceLine();
if (true) break;

case 18:
//if
this.state = 23;
if (RemoteObject.solveBoolean(">",_lstencabezados.runMethod(true,"IndexOf",(Object)((_clviv.getField(false,"txtTituloCampo" /*RemoteObject*/ ).runMethod(true,"getText")))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
 BA.debugLineNum = 1355;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El título";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El título de campo "),_clviv.getField(false,"txtTituloCampo" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(" está repetido."))),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1356;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 121;
return;
case 121:
//C
this.state = 23;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1357;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 1359;BA.debugLine="lstEncabezados.Add(clvIV.txtTituloCampo.Text)";
Debug.JustUpdateDeviceLine();
_lstencabezados.runVoidMethod ("Add",(Object)((_clviv.getField(false,"txtTituloCampo" /*RemoteObject*/ ).runMethod(true,"getText"))));
 if (true) break;

case 23:
//C
this.state = 24;
;
 if (true) break;
;
 BA.debugLineNum = 1363;BA.debugLine="If clvIV.cboTipoDato.value=\"\" Then";
Debug.JustUpdateDeviceLine();

case 24:
//if
this.state = 31;
if (RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("")))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 1364;BA.debugLine="If Not(clvIV.chkBoxControlIndependiente.Checked";
Debug.JustUpdateDeviceLine();
if (true) break;

case 27:
//if
this.state = 30;
if (parent.__c.runMethod(true,"Not",(Object)(_clviv.getField(false,"chkBoxControlIndependiente" /*RemoteObject*/ ).runMethod(true,"getChecked"))).<Boolean>get().booleanValue()) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 1365;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo d";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("El tipo de dato para el campo "),_clviv.getField(false,"txtCampo" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(" (fila nº "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable(") está en blanco. Es un dato obligatorio."))),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1366;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 122;
return;
case 122:
//C
this.state = 30;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1367;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;
;
 BA.debugLineNum = 1371;BA.debugLine="If clvIV.chkboxKeyID.Checked Then";
Debug.JustUpdateDeviceLine();

case 31:
//if
this.state = 34;
if (_clviv.getField(false,"chkboxKeyID" /*RemoteObject*/ ).runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 1373;BA.debugLine="lstPrimaryKeys.Add(clvIV.txtCampo.text)";
Debug.JustUpdateDeviceLine();
_lstprimarykeys.runVoidMethod ("Add",(Object)((_clviv.getField(false,"txtCampo" /*RemoteObject*/ ).runMethod(true,"getText"))));
 if (true) break;
;
 BA.debugLineNum = 1376;BA.debugLine="If clvIV.cboTipoControl.Value<>\"\" Then NumeroCon";
Debug.JustUpdateDeviceLine();

case 34:
//if
this.state = 39;
if (RemoteObject.solveBoolean("!",_clviv.getField(false,"cboTipoControl" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("")))) { 
this.state = 36;
;}if (true) break;

case 36:
//C
this.state = 39;
_numerocontrolesformulario = RemoteObject.solve(new RemoteObject[] {_numerocontrolesformulario,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("NumeroControlesFormulario", _numerocontrolesformulario);
if (true) break;

case 39:
//C
this.state = 40;
;
 BA.debugLineNum = 1378;BA.debugLine="If clvIV.chkBoxControlEditable.Checked Then Nume";
Debug.JustUpdateDeviceLine();
if (true) break;

case 40:
//if
this.state = 45;
if (_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 42;
;}if (true) break;

case 42:
//C
this.state = 45;
_numerocontroleseditablesformulario = RemoteObject.solve(new RemoteObject[] {_numerocontroleseditablesformulario,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("NumeroControlesEditablesFormulario", _numerocontroleseditablesformulario);
if (true) break;

case 45:
//C
this.state = 46;
;
 BA.debugLineNum = 1380;BA.debugLine="If (clvIV.cboTipoControl.Value=TipoControl_B4XLi";
Debug.JustUpdateDeviceLine();
if (true) break;

case 46:
//if
this.state = 49;
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoControl" /*RemoteObject*/ ).runMethod(false,"getValue"),(parent._tipocontrol_b4xlistdialogtextfield)) || RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoControl" /*RemoteObject*/ ).runMethod(false,"getValue"),(parent._tipocontrol_combobox)) || RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoControl" /*RemoteObject*/ ).runMethod(false,"getValue"),(parent._tipocontrol_lmb4xcombobox)) || RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoControl" /*RemoteObject*/ ).runMethod(false,"getValue"),(parent._tipocontrol_b4xsearchlistdialogtextfield))))) && RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoDatosAux" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("")))) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 1381;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Hay algún";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(BA.ObjectToString("Hay algún control tipo Lista/Consulta con el campo TipoDatosAux en blanco.")),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1382;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 123;
return;
case 123:
//C
this.state = 49;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1383;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 1388;BA.debugLine="If clvIV.cboTipoControl.Value=TipoControl_ComboB";
Debug.JustUpdateDeviceLine();

case 49:
//if
this.state = 52;
if (RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoControl" /*RemoteObject*/ ).runMethod(false,"getValue"),(parent._tipocontrol_combobox)) && RemoteObject.solveBoolean("=",_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"getChecked"),parent.__c.getField(true,"False"))) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
 BA.debugLineNum = 1389;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un control";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(BA.ObjectToString("Un control tipo ComboBox debe ser editable (en caso contrario debería ser un TextField).")),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1390;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 124;
return;
case 124:
//C
this.state = 52;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1391;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 1394;BA.debugLine="If clvIV.cboTipoControl.Value=TipoControl_lmB4XC";
Debug.JustUpdateDeviceLine();

case 52:
//if
this.state = 55;
if (RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoControl" /*RemoteObject*/ ).runMethod(false,"getValue"),(parent._tipocontrol_lmb4xcombobox)) && RemoteObject.solveBoolean("=",_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"getChecked"),parent.__c.getField(true,"False"))) { 
this.state = 54;
}if (true) break;

case 54:
//C
this.state = 55;
 BA.debugLineNum = 1395;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un control";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(BA.ObjectToString("Un control tipo lmB4XComboBox debe ser editable (en caso contrario debería ser un TextField).")),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1396;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 125;
return;
case 125:
//C
this.state = 55;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1397;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 1401;BA.debugLine="If clvIV.cboTipoControl.Value=TipoControl_TextFi";
Debug.JustUpdateDeviceLine();

case 55:
//if
this.state = 58;
if (RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoControl" /*RemoteObject*/ ).runMethod(false,"getValue"),(parent._tipocontrol_textfield)) && RemoteObject.solveBoolean("=",_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"getChecked"),parent.__c.getField(true,"True"))) { 
this.state = 57;
}if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 1402;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un control";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Un control tipo "),parent._tipocontrol_textfield,RemoteObject.createImmutable(" debe ser no editable (en caso contrario debería ser un "),parent._tipocontrol_b4xinputdialogtextfield,RemoteObject.createImmutable(")."))),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1403;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 126;
return;
case 126:
//C
this.state = 58;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1404;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 1407;BA.debugLine="If clvIV.cboTipoControl.Value=TipoControl_B4XInp";
Debug.JustUpdateDeviceLine();

case 58:
//if
this.state = 61;
if (RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoControl" /*RemoteObject*/ ).runMethod(false,"getValue"),(parent._tipocontrol_b4xinputdialogtextfield)) && RemoteObject.solveBoolean("=",_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"getChecked"),parent.__c.getField(true,"False"))) { 
this.state = 60;
}if (true) break;

case 60:
//C
this.state = 61;
 BA.debugLineNum = 1408;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un control";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(BA.ObjectToString("Un control tipo B4XInputDialogTextField debe ser editable (en caso contrario debería ser un TextField).")),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1409;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 127;
return;
case 127:
//C
this.state = 61;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1410;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 1419;BA.debugLine="If clvIV.cboTipoDatosAux.value=\"Lista\" And clvIV";
Debug.JustUpdateDeviceLine();

case 61:
//if
this.state = 64;
if (RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoDatosAux" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("Lista"))) && RemoteObject.solveBoolean("=",_clviv.getField(false,"txtListaValoresDatosAux" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 63;
}if (true) break;

case 63:
//C
this.state = 64;
 BA.debugLineNum = 1420;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Si el tipo";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(BA.ObjectToString("Si el tipo de datos auxiliares es Lista,  debe haber una lista de valores asignada.")),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1421;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 128;
return;
case 128:
//C
this.state = 64;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1422;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 1425;BA.debugLine="If clvIV.cboTipoDatosAux.value=\"Consulta\" And cl";
Debug.JustUpdateDeviceLine();

case 64:
//if
this.state = 67;
if (RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoDatosAux" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("Consulta"))) && RemoteObject.solveBoolean("=",_clviv.getField(false,"txtIPJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 66;
}if (true) break;

case 66:
//C
this.state = 67;
 BA.debugLineNum = 1426;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Si el tipo";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(BA.ObjectToString("Si el tipo de datos auxiliares es Consulta,  la IP del JRDC da datos auxiliares debe estar asignado.")),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1427;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 129;
return;
case 129:
//C
this.state = 67;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1428;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 1431;BA.debugLine="If clvIV.cboTipoDatosAux.value=\"Consulta\" And cl";
Debug.JustUpdateDeviceLine();

case 67:
//if
this.state = 70;
if (RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoDatosAux" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("Consulta"))) && RemoteObject.solveBoolean("=",_clviv.getField(false,"txtPuertoJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 69;
}if (true) break;

case 69:
//C
this.state = 70;
 BA.debugLineNum = 1432;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Si el tipo";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(BA.ObjectToString("Si el tipo de datos auxiliares es Consulta,  el puerto del JRDC da datos auxiliares debe estar asignado.")),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1433;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 130;
return;
case 130:
//C
this.state = 70;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1434;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 1437;BA.debugLine="If clvIV.cboTipoDatosAux.value=\"Consulta\" And cl";
Debug.JustUpdateDeviceLine();

case 70:
//if
this.state = 73;
if (RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoDatosAux" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("Consulta"))) && RemoteObject.solveBoolean("=",_clviv.getField(false,"txtComandoConfigDatosAux" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 72;
}if (true) break;

case 72:
//C
this.state = 73;
 BA.debugLineNum = 1438;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Si el tipo";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(BA.ObjectToString("Si el tipo de datos auxiliares es Consulta,  debe haber un comando de config properties asignado.")),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1439;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 131;
return;
case 131:
//C
this.state = 73;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1440;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 1467;BA.debugLine="If (clvIV.cboTipoControl.Value=\"\" Or clvIV.cboTi";
Debug.JustUpdateDeviceLine();

case 73:
//if
this.state = 76;
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoControl" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable((""))) || RemoteObject.solveBoolean("n",_clviv.getField(false,"cboTipoControl" /*RemoteObject*/ ).runMethod(false,"getValue"))))) && RemoteObject.solveBoolean(".",_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"getChecked"))) { 
this.state = 75;
}if (true) break;

case 75:
//C
this.state = 76;
 BA.debugLineNum = 1468;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"un campo s";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(BA.ObjectToString("un campo sin control para mostrar su valor (Tipo Control en blanco) no puede ser editable. Se modifica el valor Editable a False.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1469;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 132;
return;
case 132:
//C
this.state = 76;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1470;BA.debugLine="clvIV.chkBoxControlEditable.Checked=False";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1471;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 76:
//C
this.state = 118;
;
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1476;BA.debugLine="If lstEncabezados.Size=0 Then";
Debug.JustUpdateDeviceLine();

case 77:
//if
this.state = 80;
if (RemoteObject.solveBoolean("=",_lstencabezados.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 79;
}if (true) break;

case 79:
//C
this.state = 80;
 BA.debugLineNum = 1477;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Debe haber";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(BA.ObjectToString("Debe haber al menos una columna para mostrar en la tabla (se crearán las columnas cuyos encabezados sean <>\".")),(Object)(RemoteObject.createImmutable("Error!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1478;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 133;
return;
case 133:
//C
this.state = 80;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1479;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 1493;BA.debugLine="If lstPrimaryKeys.Size=0 Then";
Debug.JustUpdateDeviceLine();

case 80:
//if
this.state = 89;
if (RemoteObject.solveBoolean("=",_lstprimarykeys.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 82;
}if (true) break;

case 82:
//C
this.state = 83;
 BA.debugLineNum = 1497;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"No hay nin";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"Msgbox2Async",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("No hay ningún campo definido como clave primaria"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("La acción de grabar registros no estará disponible en el formulario."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("¿Continuar?"))),(Object)(BA.ObjectToString("No hay clave primaria definida")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1498;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 134;
return;
case 134:
//C
this.state = 83;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1499;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Re";
Debug.JustUpdateDeviceLine();
if (true) break;

case 83:
//if
this.state = 88;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 85;
;}if (true) break;

case 85:
//C
this.state = 88;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 88:
//C
this.state = 89;
;
 if (true) break;
;
 BA.debugLineNum = 1503;BA.debugLine="If NumeroControlesFormulario=0 Then";
Debug.JustUpdateDeviceLine();

case 89:
//if
this.state = 98;
if (RemoteObject.solveBoolean("=",_numerocontrolesformulario,BA.numberCast(double.class, 0))) { 
this.state = 91;
}if (true) break;

case 91:
//C
this.state = 92;
 BA.debugLineNum = 1504;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"No hay nin";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"Msgbox2Async",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("No hay ningún campo definido con control en el formulario. El formulario estaría vacío."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("¿Continuar?"))),(Object)(BA.ObjectToString("Formulario sin controles")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1505;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 135;
return;
case 135:
//C
this.state = 92;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1506;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Re";
Debug.JustUpdateDeviceLine();
if (true) break;

case 92:
//if
this.state = 97;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 94;
;}if (true) break;

case 94:
//C
this.state = 97;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 97:
//C
this.state = 98;
;
 if (true) break;
;
 BA.debugLineNum = 1509;BA.debugLine="If NumeroControlesFormulario<clvListaCampos.Size";
Debug.JustUpdateDeviceLine();

case 98:
//if
this.state = 107;
if (RemoteObject.solveBoolean("<",_numerocontrolesformulario,BA.numberCast(double.class, parent._clvlistacampos.runMethod(true,"_getsize")))) { 
this.state = 100;
}if (true) break;

case 100:
//C
this.state = 101;
 BA.debugLineNum = 1510;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"Hay \" & (c";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"Msgbox2Async",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Hay "),(RemoteObject.solve(new RemoteObject[] {parent._clvlistacampos.runMethod(true,"_getsize"),_numerocontrolesformulario}, "-",1, 1)),RemoteObject.createImmutable(" campos sin Tipo de control asignado."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Estos campos no aparecerán en el formulario del registro, por lo que el módulo callback deberá tener controlados sus valores para grabar el registro."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("¿Continuar?"))),(Object)(BA.ObjectToString("Formulario con campos sin Tipo de Control")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1513;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 136;
return;
case 136:
//C
this.state = 101;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1514;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Re";
Debug.JustUpdateDeviceLine();
if (true) break;

case 101:
//if
this.state = 106;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 103;
;}if (true) break;

case 103:
//C
this.state = 106;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 106:
//C
this.state = 107;
;
 if (true) break;
;
 BA.debugLineNum = 1517;BA.debugLine="If NumeroControlesEditablesFormulario=0 Then";
Debug.JustUpdateDeviceLine();

case 107:
//if
this.state = 116;
if (RemoteObject.solveBoolean("=",_numerocontroleseditablesformulario,BA.numberCast(double.class, 0))) { 
this.state = 109;
}if (true) break;

case 109:
//C
this.state = 110;
 BA.debugLineNum = 1518;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"No hay nin";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"Msgbox2Async",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("No hay ningún campo definido con control editable en el formulario."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("¿Continuar?"))),(Object)(BA.ObjectToString("Formulario sin controles editables")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1519;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 137;
return;
case 137:
//C
this.state = 110;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1520;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Re";
Debug.JustUpdateDeviceLine();
if (true) break;

case 110:
//if
this.state = 115;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 112;
;}if (true) break;

case 112:
//C
this.state = 115;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 115:
//C
this.state = 116;
;
 if (true) break;

case 116:
//C
this.state = -1;
;
 BA.debugLineNum = 1523;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1524;BA.debugLine="End Sub";
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
public static RemoteObject  _configurarorigendatos() throws Exception{
try {
		Debug.PushSubsStack("ConfigurarOrigenDatos (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1001);
if (RapidSub.canDelegate("configurarorigendatos")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","configurarorigendatos");}
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
public ResumableSub_ConfigurarOrigenDatos(b4j.docU.jamrecordformbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstcampossql = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _robj = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ConfigurarOrigenDatos (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1001);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 1003;BA.debugLine="SetCurrentFile(\"\")";
Debug.JustUpdateDeviceLine();
_setcurrentfile(RemoteObject.createImmutable(""));
 BA.debugLineNum = 1004;BA.debugLine="clvListaCampos.Clear";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.runVoidMethod ("_clear");
 BA.debugLineNum = 1005;BA.debugLine="lstPrimaryKey.Initialize";
Debug.JustUpdateDeviceLine();
parent._lstprimarykey.runVoidMethod ("Initialize");
 BA.debugLineNum = 1008;BA.debugLine="prefDialog.Initialize(frm.RootPane,\"Datos JRDC\",8";
Debug.JustUpdateDeviceLine();
parent._prefdialog.runClassMethod (b4j.docU.preferencesdialog.class, "_initialize" /*RemoteObject*/ ,jamrecordformbuilder.ba,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent._frm.runMethod(false,"getRootPane").getObject()),(Object)(RemoteObject.createImmutable(("Datos JRDC"))),(Object)(BA.numberCast(int.class, 800)),(Object)(BA.numberCast(int.class, 600)));
 BA.debugLineNum = 1010;BA.debugLine="prefDialog.LoadFromJson(File.ReadString(File.DirA";
Debug.JustUpdateDeviceLine();
parent._prefdialog.runClassMethod (b4j.docU.preferencesdialog.class, "_loadfromjson" /*RemoteObject*/ ,(Object)(parent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("OrigenDatosJrdcRecordFormBuilder.json")))));
 BA.debugLineNum = 1011;BA.debugLine="Dim mData As Map=CreateMap()";
Debug.JustUpdateDeviceLine();
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 1012;BA.debugLine="Wait For (prefDialog.ShowDialog(mData, \"OK\", \"CAN";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "configurarorigendatos"), parent._prefdialog.runClassMethod (b4j.docU.preferencesdialog.class, "_showdialog" /*RemoteObject*/ ,(Object)(_mdata),(Object)(RemoteObject.createImmutable(("OK"))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 18;
return;
case 18:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 1013;BA.debugLine="If result <> xui.DialogResponse_Positive Then Ret";
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
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1014;BA.debugLine="lblTitleIpJRDC.TextColor=fx.Colors.From32Bit(0xFF";
Debug.JustUpdateDeviceLine();
parent._lbltitleipjrdc.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 1015;BA.debugLine="lblTitlePuertoJRDC.TextColor=fx.Colors.From32Bit(";
Debug.JustUpdateDeviceLine();
parent._lbltitlepuertojrdc.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 1016;BA.debugLine="lblTitleNombreTabla.TextColor=fx.Colors.From32Bit";
Debug.JustUpdateDeviceLine();
parent._lbltitlenombretabla.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 1017;BA.debugLine="lblTitleDBMS.TextColor=fx.Colors.From32Bit(0xFFFF";
Debug.JustUpdateDeviceLine();
parent._lbltitledbms.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 1018;BA.debugLine="txtIpJRDC.Enabled=True";
Debug.JustUpdateDeviceLine();
parent._txtipjrdc.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1019;BA.debugLine="txtPuertoJRDC.Enabled=True";
Debug.JustUpdateDeviceLine();
parent._txtpuertojrdc.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1020;BA.debugLine="txtNombreTabla.ENABLED=True";
Debug.JustUpdateDeviceLine();
parent._txtnombretabla.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1021;BA.debugLine="txtDBMS.ENABLED=True";
Debug.JustUpdateDeviceLine();
parent._txtdbms.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1023;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(mData.GetD";
Debug.JustUpdateDeviceLine();
parent._datosorigendatos = _createtipoorigendatos(BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("IpJRDC"))),(Object)((RemoteObject.createImmutable(""))))),BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("PuertoJRDC"))),(Object)((RemoteObject.createImmutable(""))))),BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("NombreTabla"))),(Object)((RemoteObject.createImmutable(""))))),BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("DBMS"))),(Object)((RemoteObject.createImmutable("MySQL"))))));
 BA.debugLineNum = 1026;BA.debugLine="Select Case mData.GetDefault(\"DBMS\",\"MySQL\")";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//select
this.state = 12;
switch (BA.switchObjectToInt(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("DBMS"))),(Object)((RemoteObject.createImmutable("MySQL")))),RemoteObject.createImmutable(("MySQL")),RemoteObject.createImmutable(("SQLServer")))) {
case 0: {
this.state = 9;
if (true) break;
}
case 1: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 1028;BA.debugLine="CargaCamposJRDCMySQL(DatosOrigenDatos.IpJRDC,Da";
Debug.JustUpdateDeviceLine();
_cargacamposjrdcmysql(parent._datosorigendatos.getField(true,"IpJRDC" /*RemoteObject*/ ),BA.numberCast(int.class, parent._datosorigendatos.getField(true,"PuertoJRDC" /*RemoteObject*/ )),parent._datosorigendatos.getField(true,"NombreTabla" /*RemoteObject*/ ));
 BA.debugLineNum = 1029;BA.debugLine="Wait For CargaCamposJRDCMySQL_Completed (Accion";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","cargacamposjrdcmysql_completed", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "configurarorigendatos"), null);
this.state = 19;
return;
case 19:
//C
this.state = 12;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Accion", _accion);
_lstcampossql = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("lstCamposSQL", _lstcampossql);
;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1032;BA.debugLine="CargaCamposJRDCSQLServer(DatosOrigenDatos.IpJRD";
Debug.JustUpdateDeviceLine();
_cargacamposjrdcsqlserver(parent._datosorigendatos.getField(true,"IpJRDC" /*RemoteObject*/ ),BA.numberCast(int.class, parent._datosorigendatos.getField(true,"PuertoJRDC" /*RemoteObject*/ )),parent._datosorigendatos.getField(true,"NombreTabla" /*RemoteObject*/ ));
 BA.debugLineNum = 1033;BA.debugLine="Wait For CargaCamposJRDCSQLServer_Completed (Ac";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","cargacamposjrdcsqlserver_completed", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "configurarorigendatos"), null);
this.state = 20;
return;
case 20:
//C
this.state = 12;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Accion", _accion);
_lstcampossql = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("lstCamposSQL", _lstcampossql);
;
 if (true) break;
;
 BA.debugLineNum = 1038;BA.debugLine="If Accion<>\"OK\" Then Return False";
Debug.JustUpdateDeviceLine();

case 12:
//if
this.state = 17;
if (RemoteObject.solveBoolean("!",_accion,BA.ObjectToString("OK"))) { 
this.state = 14;
;}if (true) break;

case 14:
//C
this.state = 17;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 17:
//C
this.state = -1;
;
 BA.debugLineNum = 1039;BA.debugLine="MostrarDatosOrigenDatos";
Debug.JustUpdateDeviceLine();
_mostrardatosorigendatos();
 BA.debugLineNum = 1040;BA.debugLine="pnlOrigenSQL.Visible=True";
Debug.JustUpdateDeviceLine();
parent._pnlorigensql.runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1042;BA.debugLine="WAIT FOR (CargaItemsCLV(lstCamposSQL)) COMPLETE (";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "configurarorigendatos"), _cargaitemsclv(_lstcampossql));
this.state = 21;
return;
case 21:
//C
this.state = -1;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 1044;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1046;BA.debugLine="End Sub";
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
public static RemoteObject  _createtipoorigendatos(RemoteObject _ipjrdc,RemoteObject _puertojrdc,RemoteObject _nombretabla,RemoteObject _dbms) throws Exception{
try {
		Debug.PushSubsStack("CreateTipoOrigenDatos (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1690);
if (RapidSub.canDelegate("createtipoorigendatos")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","createtipoorigendatos", _ipjrdc, _puertojrdc, _nombretabla, _dbms);}
RemoteObject _t1 = RemoteObject.declareNull("b4j.docU.jamformregistro._tipoorigendatosjamformregistro");
Debug.locals.put("IpJRDC", _ipjrdc);
Debug.locals.put("PuertoJRDC", _puertojrdc);
Debug.locals.put("NombreTabla", _nombretabla);
Debug.locals.put("DBMS", _dbms);
 BA.debugLineNum = 1690;BA.debugLine="Public Sub CreateTipoOrigenDatos (IpJRDC As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1691;BA.debugLine="Dim t1 As TipoOrigenDatosJamFormRegistro";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4j.docU.jamformregistro._tipoorigendatosjamformregistro");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 1692;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 1694;BA.debugLine="t1.IpJRDC = IpJRDC";
Debug.JustUpdateDeviceLine();
_t1.setField ("IpJRDC" /*RemoteObject*/ ,_ipjrdc);
 BA.debugLineNum = 1695;BA.debugLine="t1.PuertoJRDC = PuertoJRDC";
Debug.JustUpdateDeviceLine();
_t1.setField ("PuertoJRDC" /*RemoteObject*/ ,_puertojrdc);
 BA.debugLineNum = 1696;BA.debugLine="t1.NombreTabla = NombreTabla";
Debug.JustUpdateDeviceLine();
_t1.setField ("NombreTabla" /*RemoteObject*/ ,_nombretabla);
 BA.debugLineNum = 1697;BA.debugLine="t1.DBMS = DBMS";
Debug.JustUpdateDeviceLine();
_t1.setField ("DBMS" /*RemoteObject*/ ,_dbms);
 BA.debugLineNum = 1700;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 1701;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _exportdatatostring() throws Exception{
try {
		Debug.PushSubsStack("ExportDataToString (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,651);
if (RapidSub.canDelegate("exportdatatostring")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","exportdatatostring");}
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamrecordformbuilder._clvrecordformitemvalue");
RemoteObject _sbprimarykey = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _jg = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");
 BA.debugLineNum = 651;BA.debugLine="Sub ExportDataToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 652;BA.debugLine="Dim Items As List";
Debug.JustUpdateDeviceLine();
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Items", _items);
 BA.debugLineNum = 653;BA.debugLine="Items.Initialize";
Debug.JustUpdateDeviceLine();
_items.runVoidMethod ("Initialize");
 BA.debugLineNum = 654;BA.debugLine="For i = 0 To clvListaCampos.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {jamrecordformbuilder._clvlistacampos.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 655;BA.debugLine="Dim clvIV As clvRecordFormItemValue=clvListaCamp";
Debug.JustUpdateDeviceLine();
_clviv = (jamrecordformbuilder._clvlistacampos.runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 657;BA.debugLine="Items.Add(ItemValueToMap(clvIV))";
Debug.JustUpdateDeviceLine();
_items.runVoidMethod ("Add",(Object)((_itemvaluetomap(_clviv).getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 660;BA.debugLine="Dim sbPrimaryKey As StringBuilder";
Debug.JustUpdateDeviceLine();
_sbprimarykey = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbPrimaryKey", _sbprimarykey);
 BA.debugLineNum = 661;BA.debugLine="sbPrimaryKey.Initialize";
Debug.JustUpdateDeviceLine();
_sbprimarykey.runVoidMethod ("Initialize");
 BA.debugLineNum = 662;BA.debugLine="If lstPrimaryKey.Size>0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",jamrecordformbuilder._lstprimarykey.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 664;BA.debugLine="For i=0 To lstPrimaryKey.Size-1";
Debug.JustUpdateDeviceLine();
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {jamrecordformbuilder._lstprimarykey.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 665;BA.debugLine="sbPrimaryKey.Append(lstPrimaryKey.Get(i)).Appen";
Debug.JustUpdateDeviceLine();
_sbprimarykey.runMethod(false,"Append",(Object)(BA.ObjectToString(jamrecordformbuilder._lstprimarykey.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(",")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 667;BA.debugLine="sbPrimaryKey.Remove(sbPrimaryKey.Length-1,sbPrim";
Debug.JustUpdateDeviceLine();
_sbprimarykey.runVoidMethod ("Remove",(Object)(RemoteObject.solve(new RemoteObject[] {_sbprimarykey.runMethod(true,"getLength"),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(_sbprimarykey.runMethod(true,"getLength")));
 };
 BA.debugLineNum = 670;BA.debugLine="Dim jg As JSONGenerator";
Debug.JustUpdateDeviceLine();
_jg = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jg", _jg);
 BA.debugLineNum = 672;BA.debugLine="jg.Initialize(CreateMap(\"Version\": Version,  \"IpJ";
Debug.JustUpdateDeviceLine();
_jg.runVoidMethod ("Initialize",(Object)(jamrecordformbuilder.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Version")),(jamrecordformbuilder._version),RemoteObject.createImmutable(("IpJRDC")),(jamrecordformbuilder._datosorigendatos.getField(true,"IpJRDC" /*RemoteObject*/ )),RemoteObject.createImmutable(("PuertoJRDC")),(jamrecordformbuilder._datosorigendatos.getField(true,"PuertoJRDC" /*RemoteObject*/ )),RemoteObject.createImmutable(("NombreTabla")),(jamrecordformbuilder._datosorigendatos.getField(true,"NombreTabla" /*RemoteObject*/ )),RemoteObject.createImmutable(("DBMS")),(jamrecordformbuilder._datosorigendatos.getField(true,"DBMS" /*RemoteObject*/ )),RemoteObject.createImmutable(("PrimaryKey")),(_sbprimarykey.runMethod(true,"ToString")),RemoteObject.createImmutable(("Items")),(_items.getObject()),RemoteObject.createImmutable(("ColorItemsImpares")),(jamrecordformbuilder._colitemsimpares),RemoteObject.createImmutable(("ColorItemsPares")),(jamrecordformbuilder._colitemspares)}))));
 BA.debugLineNum = 675;BA.debugLine="Return jg.ToPrettyString(4)";
Debug.JustUpdateDeviceLine();
if (true) return _jg.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 4)));
 BA.debugLineNum = 676;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("frm_CloseRequest (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,250);
if (RapidSub.canDelegate("frm_closerequest")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","frm_closerequest", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 250;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 251;BA.debugLine="EventData.Consume";
Debug.JustUpdateDeviceLine();
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 252;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _frm_resize(RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("frm_Resize (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,296);
if (RapidSub.canDelegate("frm_resize")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","frm_resize", _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 296;BA.debugLine="Sub frm_Resize (Width As Double, Height As Double)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 297;BA.debugLine="dragger.Resize";
Debug.JustUpdateDeviceLine();
jamrecordformbuilder._dragger.runClassMethod (b4j.docU.jamrecordformclvdragger.class, "_resize" /*RemoteObject*/ );
 BA.debugLineNum = 298;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("GetCssColorStringFromIntColor (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,949);
if (RapidSub.canDelegate("getcsscolorstringfromintcolor")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","getcsscolorstringfromintcolor", _value);}
RemoteObject _hexargb = RemoteObject.createImmutable("");
RemoteObject _hexrgb = RemoteObject.createImmutable("");
Debug.locals.put("value", _value);
 BA.debugLineNum = 949;BA.debugLine="Private Sub GetCssColorStringFromIntColor(value As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 950;BA.debugLine="Select value";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_value,jamrecordformbuilder._fx.getField(false,"Colors").runMethod(true,"To32Bit",(Object)(jamrecordformbuilder._fx.getField(false,"Colors").getField(false,"Transparent"))))) {
case 0: {
 BA.debugLineNum = 952;BA.debugLine="Return \"transparent\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("transparent");
 break; }
default: {
 BA.debugLineNum = 956;BA.debugLine="Dim HexARGB As String=ColorToHex(value)";
Debug.JustUpdateDeviceLine();
_hexargb = _colortohex(_value);Debug.locals.put("HexARGB", _hexargb);Debug.locals.put("HexARGB", _hexargb);
 BA.debugLineNum = 957;BA.debugLine="If HexARGB.Length=6 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_hexargb.runMethod(true,"length"),BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 958;BA.debugLine="Return \"#\" & HexARGB";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.concat(RemoteObject.createImmutable("#"),_hexargb);
 }else {
 BA.debugLineNum = 960;BA.debugLine="Dim HexRGB As String=HexARGB.SubString2(2,8)";
Debug.JustUpdateDeviceLine();
_hexrgb = _hexargb.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 8)));Debug.locals.put("HexRGB", _hexrgb);Debug.locals.put("HexRGB", _hexrgb);
 BA.debugLineNum = 961;BA.debugLine="Return \"#\" & HexRGB";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.concat(RemoteObject.createImmutable("#"),_hexrgb);
 };
 break; }
}
;
 BA.debugLineNum = 964;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _habilitardeshabilitarcheckbox(RemoteObject _chkboxsel,RemoteObject _habilitado) throws Exception{
try {
		Debug.PushSubsStack("HabilitarDeshabilitarCheckBox (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1565);
if (RapidSub.canDelegate("habilitardeshabilitarcheckbox")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","habilitardeshabilitarcheckbox", _chkboxsel, _habilitado);}
Debug.locals.put("chkboxSel", _chkboxsel);
Debug.locals.put("Habilitado", _habilitado);
 BA.debugLineNum = 1565;BA.debugLine="Sub HabilitarDeshabilitarCheckBox(chkboxSel As Che";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1566;BA.debugLine="chkboxSel.Enabled=Habilitado";
Debug.JustUpdateDeviceLine();
_chkboxsel.runMethod(true,"setEnabled",_habilitado);
 BA.debugLineNum = 1567;BA.debugLine="If Habilitado Then";
Debug.JustUpdateDeviceLine();
if (_habilitado.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1568;BA.debugLine="chkboxSel.Style=\"-fx-text-fill:black; -fx-border";
Debug.JustUpdateDeviceLine();
_chkboxsel.runMethod(true,"setStyle",BA.ObjectToString("-fx-text-fill:black; -fx-border-color: black"));
 }else {
 BA.debugLineNum = 1570;BA.debugLine="chkboxSel.Style=\"-fx-text-fill:lightgray; -fx-bo";
Debug.JustUpdateDeviceLine();
_chkboxsel.runMethod(true,"setStyle",BA.ObjectToString("-fx-text-fill:lightgray; -fx-border-color: lightgray"));
 };
 BA.debugLineNum = 1572;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _help() throws Exception{
try {
		Debug.PushSubsStack("Help (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1630);
if (RapidSub.canDelegate("help")) { b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","help"); return;}
ResumableSub_Help rsub = new ResumableSub_Help(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Help extends BA.ResumableSub {
public ResumableSub_Help(b4j.docU.jamrecordformbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
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
		Debug.PushSubsStack("Help (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1630);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 1631;BA.debugLine="Dialog.Title=\"Información\"";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Información")));
 BA.debugLineNum = 1634;BA.debugLine="Dim DlgInfo As B4XLongTextTemplate";
Debug.JustUpdateDeviceLine();
_dlginfo = RemoteObject.createNew ("b4j.docU.b4xlongtexttemplate");Debug.locals.put("DlgInfo", _dlginfo);
 BA.debugLineNum = 1635;BA.debugLine="DlgInfo.Initialize";
Debug.JustUpdateDeviceLine();
_dlginfo.runClassMethod (b4j.docU.b4xlongtexttemplate.class, "_initialize" /*RemoteObject*/ ,jamrecordformbuilder.ba);
 BA.debugLineNum = 1636;BA.debugLine="Dim sbInfo As StringBuilder";
Debug.JustUpdateDeviceLine();
_sbinfo = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbInfo", _sbinfo);
 BA.debugLineNum = 1637;BA.debugLine="sbInfo.Initialize";
Debug.JustUpdateDeviceLine();
_sbinfo.runVoidMethod ("Initialize");
 BA.debugLineNum = 1660;BA.debugLine="DlgInfo.Text=sbInfo.ToString";
Debug.JustUpdateDeviceLine();
_dlginfo.setField ("_text" /*RemoteObject*/ ,(_sbinfo.runMethod(true,"ToString")));
 BA.debugLineNum = 1661;BA.debugLine="Dim rs As ResumableSub=Dialog.ShowTemplate(DlgInf";
Debug.JustUpdateDeviceLine();
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_dlginfo)),(Object)(RemoteObject.createImmutable(("Ok"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable(""))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1663;BA.debugLine="Dialog.Base.SetLayoutAnimated(0,0.1*Dialog.mParen";
Debug.JustUpdateDeviceLine();
parent._dialog.getField(false,"_base" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.1),parent._dialog.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(0.8)}, "**",0, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.1),parent._dialog.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(0.8)}, "**",0, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {parent._dialog.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(0.8)}, "*",0, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {parent._dialog.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(0.8)}, "*",0, 0)));
 BA.debugLineNum = 1665;BA.debugLine="Dialog.TitleBar.SetLayoutAnimated(0,0,0,Dialog.Ba";
Debug.JustUpdateDeviceLine();
parent._dialog.getField(false,"_titlebar" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(parent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(BA.numberCast(double.class, parent._dialog.getField(true,"_titlebarheight" /*RemoteObject*/ ))));
 BA.debugLineNum = 1666;BA.debugLine="Dim bOk As Button=Dialog.GetButton(xui.DialogResp";
Debug.JustUpdateDeviceLine();
_bok = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_bok = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(parent._xui.getField(true,"DialogResponse_Positive"))).getObject());Debug.locals.put("bOk", _bok);Debug.locals.put("bOk", _bok);
 BA.debugLineNum = 1667;BA.debugLine="bOk.Top=Dialog.Base.Height-Dialog.ButtonsHeight-5";
Debug.JustUpdateDeviceLine();
_bok.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {parent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),parent._dialog.getField(true,"_buttonsheight" /*RemoteObject*/ ),RemoteObject.createImmutable(5)}, "--",2, 0));
 BA.debugLineNum = 1669;BA.debugLine="Dim pT As Pane=Dialog.TitleBar";
Debug.JustUpdateDeviceLine();
_pt = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_pt = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), parent._dialog.getField(false,"_titlebar" /*RemoteObject*/ ).getObject());Debug.locals.put("pT", _pt);Debug.locals.put("pT", _pt);
 BA.debugLineNum = 1670;BA.debugLine="Dim lblT As Label=pT.GetNode(0)";
Debug.JustUpdateDeviceLine();
_lblt = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_lblt = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), _pt.runMethod(false,"GetNode",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lblT", _lblt);Debug.locals.put("lblT", _lblt);
 BA.debugLineNum = 1671;BA.debugLine="lblT.PrefWidth=lblT.Parent.PrefWidth";
Debug.JustUpdateDeviceLine();
_lblt.runMethod(true,"setPrefWidth",_lblt.runMethod(false,"getParent").runMethod(true,"getPrefWidth"));
 BA.debugLineNum = 1673;BA.debugLine="DlgInfo.mBase.SetLayoutAnimated(100,5,Dialog.Titl";
Debug.JustUpdateDeviceLine();
_dlginfo.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(double.class, 5)),(Object)(BA.numberCast(double.class, parent._dialog.getField(true,"_titlebarheight" /*RemoteObject*/ ))),(Object)(RemoteObject.solve(new RemoteObject[] {parent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(10)}, "-",1, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {parent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),parent._dialog.getField(true,"_titlebarheight" /*RemoteObject*/ ),parent._dialog.getField(true,"_buttonsheight" /*RemoteObject*/ )}, "--",2, 0)));
 BA.debugLineNum = 1675;BA.debugLine="Dim p As Pane=DlgInfo.CustomListView1.GetPanel(0)";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), _dlginfo.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 1676;BA.debugLine="Dim lbl As Label=p.GetNode(0)";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), _p.runMethod(false,"GetNode",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 1677;BA.debugLine="lbl.Font=fx.DefaultFont(8)";
Debug.JustUpdateDeviceLine();
_lbl.runMethod(false,"setFont",parent._fx.runMethod(false,"DefaultFont",(Object)(BA.numberCast(double.class, 8))));
 BA.debugLineNum = 1678;BA.debugLine="lbl.TextColor=fx.Colors.From32Bit(0xFFFFFFFF)";
Debug.JustUpdateDeviceLine();
_lbl.runMethod(false,"setTextColor",(parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffffffff))))));
 BA.debugLineNum = 1687;BA.debugLine="wait for (rs) complete (result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "help"), _rs);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 1688;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ItemValueToMap (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,308);
if (RapidSub.canDelegate("itemvaluetomap")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","itemvaluetomap", _clviv);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mextras = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 308;BA.debugLine="Sub ItemValueToMap (clvIV As clvRecordFormItemValu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 309;BA.debugLine="Dim m As Map";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 310;BA.debugLine="m.Initialize";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 311;BA.debugLine="m.Put(\"ControlIndependiente\",clvIV.chkBoxControlI";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ControlIndependiente"))),(Object)((_clviv.getField(false,"chkBoxControlIndependiente" /*RemoteObject*/ ).runMethod(true,"getChecked"))));
 BA.debugLineNum = 312;BA.debugLine="m.Put(\"Campo\",clvIV.txtCampo.text)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Campo"))),(Object)((_clviv.getField(false,"txtCampo" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 313;BA.debugLine="m.Put(\"TituloCampo\",clvIV.txtTituloCampo.text)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TituloCampo"))),(Object)((_clviv.getField(false,"txtTituloCampo" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 314;BA.debugLine="m.Put(\"PrimaryKey\",clvIV.chkboxKeyID.Checked)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("PrimaryKey"))),(Object)((_clviv.getField(false,"chkboxKeyID" /*RemoteObject*/ ).runMethod(true,"getChecked"))));
 BA.debugLineNum = 315;BA.debugLine="m.Put(\"TipoDatoMySQL\",clvIV.txtTipoDatoMySQL.text";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TipoDatoMySQL"))),(Object)((_clviv.getField(false,"txtTipoDatoMySQL" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 316;BA.debugLine="m.Put(\"TipoDato\",clvIV.cboTipoDato.value)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TipoDato"))),(Object)(_clviv.getField(false,"cboTipoDato" /*RemoteObject*/ ).runMethod(false,"getValue")));
 BA.debugLineNum = 317;BA.debugLine="m.Put(\"EsFecha\",clvIV.chkBoxEsFecha.Checked)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("EsFecha"))),(Object)((_clviv.getField(false,"chkBoxEsFecha" /*RemoteObject*/ ).runMethod(true,"getChecked"))));
 BA.debugLineNum = 318;BA.debugLine="m.Put(\"NoNulo\",clvIV.chkboxNoNulo.Checked)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("NoNulo"))),(Object)((_clviv.getField(false,"chkBoxNoNulo" /*RemoteObject*/ ).runMethod(true,"getChecked"))));
 BA.debugLineNum = 319;BA.debugLine="m.Put(\"AutoIncremental\",clvIV.chkBoxAutoIncrement";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("AutoIncremental"))),(Object)((_clviv.getField(false,"chkBoxAutoIncremental" /*RemoteObject*/ ).runMethod(true,"getChecked"))));
 BA.debugLineNum = 320;BA.debugLine="m.Put(\"TipoControl\",clvIV.cboTipoControl.value)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TipoControl"))),(Object)(_clviv.getField(false,"cboTipoControl" /*RemoteObject*/ ).runMethod(false,"getValue")));
 BA.debugLineNum = 321;BA.debugLine="m.Put(\"ControlEditable\",clvIV.chkBoxControlEditab";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ControlEditable"))),(Object)((_clviv.getField(false,"chkBoxControlEditable" /*RemoteObject*/ ).runMethod(true,"getChecked"))));
 BA.debugLineNum = 322;BA.debugLine="m.Put(\"InfoCampo\",clvIV.txtInfoCampo.Text)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("InfoCampo"))),(Object)((_clviv.getField(false,"txtInfoCampo" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 323;BA.debugLine="m.Put(\"ValorCampoPorDefecto\",clvIV.txtValorCampoP";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ValorCampoPorDefecto"))),(Object)((_clviv.getField(false,"txtValorCampoPorDefecto" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 324;BA.debugLine="Dim mExtras As Map";
Debug.JustUpdateDeviceLine();
_mextras = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mExtras", _mextras);
 BA.debugLineNum = 325;BA.debugLine="mExtras.Initialize";
Debug.JustUpdateDeviceLine();
_mextras.runVoidMethod ("Initialize");
 BA.debugLineNum = 336;BA.debugLine="If clvIV.cboTipoDatosAux.value=\"Lista\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoDatosAux" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("Lista")))) { 
 BA.debugLineNum = 337;BA.debugLine="mExtras.Put(\"TipoDatosAux\",\"Lista\")";
Debug.JustUpdateDeviceLine();
_mextras.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TipoDatosAux"))),(Object)((RemoteObject.createImmutable("Lista"))));
 BA.debugLineNum = 338;BA.debugLine="mExtras.Put(\"ListaValoresDatosAux\",clvIV.txtList";
Debug.JustUpdateDeviceLine();
_mextras.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ListaValoresDatosAux"))),(Object)((_clviv.getField(false,"txtListaValoresDatosAux" /*RemoteObject*/ ).runMethod(true,"getText"))));
 };
 BA.debugLineNum = 341;BA.debugLine="If clvIV.cboTipoDatosAux.Value=\"Consulta\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_clviv.getField(false,"cboTipoDatosAux" /*RemoteObject*/ ).runMethod(false,"getValue"),RemoteObject.createImmutable(("Consulta")))) { 
 BA.debugLineNum = 342;BA.debugLine="mExtras.Put(\"TipoDatosAux\",\"Consulta\")";
Debug.JustUpdateDeviceLine();
_mextras.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TipoDatosAux"))),(Object)((RemoteObject.createImmutable("Consulta"))));
 BA.debugLineNum = 343;BA.debugLine="mExtras.Put(\"IPJrdcOrigenDatosAux\",clvIV.txtIPJr";
Debug.JustUpdateDeviceLine();
_mextras.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("IPJrdcOrigenDatosAux"))),(Object)((_clviv.getField(false,"txtIPJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 344;BA.debugLine="mExtras.Put(\"PuertoJrdcOrigenDatosAux\",clvIV.txt";
Debug.JustUpdateDeviceLine();
_mextras.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("PuertoJrdcOrigenDatosAux"))),(Object)((_clviv.getField(false,"txtPuertoJrdcOrigenDatosAux" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 345;BA.debugLine="mExtras.Put(\"ComandoConfigDatosAux\",clvIV.txtCom";
Debug.JustUpdateDeviceLine();
_mextras.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ComandoConfigDatosAux"))),(Object)((_clviv.getField(false,"txtComandoConfigDatosAux" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 346;BA.debugLine="mExtras.Put(\"ParametrosComandoDatosAux\",clvIV.tx";
Debug.JustUpdateDeviceLine();
_mextras.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ParametrosComandoDatosAux"))),(Object)((_clviv.getField(false,"txtParametrosComandoDatosAux" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 347;BA.debugLine="mExtras.Put(\"NumCamposDatosAux\",clvIV.B4XPlusMin";
Debug.JustUpdateDeviceLine();
_mextras.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("NumCamposDatosAux"))),(Object)(_clviv.getField(false,"B4XPlusMinusNumCamposDatosAux" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xplusminus.class, "_getselectedvalue" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 349;BA.debugLine="m.Put(\"Extras\",mExtras)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Extras"))),(Object)((_mextras.getObject())));
 BA.debugLineNum = 350;BA.debugLine="Return m";
Debug.JustUpdateDeviceLine();
if (true) return _m;
 BA.debugLineNum = 351;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _lblcolorfondoitemsimpares_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblColorFondoItemsImpares_MouseClicked (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,2176);
if (RapidSub.canDelegate("lblcolorfondoitemsimpares_mouseclicked")) { b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","lblcolorfondoitemsimpares_mouseclicked", _eventdata); return;}
ResumableSub_lblColorFondoItemsImpares_MouseClicked rsub = new ResumableSub_lblColorFondoItemsImpares_MouseClicked(null,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblColorFondoItemsImpares_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorFondoItemsImpares_MouseClicked(b4j.docU.jamrecordformbuilder parent,RemoteObject _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
RemoteObject _eventdata;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblColorFondoItemsImpares_MouseClicked (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,2176);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 2197;BA.debugLine="Dialog.Title=\"Selecciona color Fondo Items Impare";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona color Fondo Items Impares")));
 BA.debugLineNum = 2198;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = parent._xui.runMethod(false,"CreatePanel",jamrecordformbuilder.ba,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 2199;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))));
 BA.debugLineNum = 2200;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrBCColorPickerJamTableView")),jamrecordformbuilder.ba);
 BA.debugLineNum = 2201;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",jamrecordformbuilder.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "lblcolorfondoitemsimpares_mouseclicked"),BA.numberCast(int.class, 0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 2203;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 2204;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 2205;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorF";
Debug.JustUpdateDeviceLine();
parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_setselectedcolor" /*RemoteObject*/ ,parent._lblcolorfondoitemsimpares.runMethod(true,"getColor"));
 BA.debugLineNum = 2206;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(parent._xui.getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 2207;BA.debugLine="bCancel.left=bCancel.left-20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 2208;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 2209;BA.debugLine="bCancel.Textsize=16";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 2210;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "lblcolorfondoitemsimpares_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2211;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
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
 BA.debugLineNum = 2212;BA.debugLine="lblColorFondoItemsImpares.Color=BCColorPickerjamT";
Debug.JustUpdateDeviceLine();
parent._lblcolorfondoitemsimpares.runMethod(true,"setColor",parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_getselectedcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 2213;BA.debugLine="txtRGBColorFondoItemsImpares.Text=GetCssColorStri";
Debug.JustUpdateDeviceLine();
parent._txtrgbcolorfondoitemsimpares.runMethod(true,"setText",_getcsscolorstringfromintcolor(parent._lblcolorfondoitemsimpares.runMethod(true,"getColor")));
 BA.debugLineNum = 2214;BA.debugLine="ColItemsImpares=lblColorFondoItemsImpares.Color";
Debug.JustUpdateDeviceLine();
parent._colitemsimpares = parent._lblcolorfondoitemsimpares.runMethod(true,"getColor");
 BA.debugLineNum = 2216;BA.debugLine="End Sub";
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
public static void  _lblcolorfondoitemspares_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblColorFondoItemsPares_MouseClicked (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,2218);
if (RapidSub.canDelegate("lblcolorfondoitemspares_mouseclicked")) { b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","lblcolorfondoitemspares_mouseclicked", _eventdata); return;}
ResumableSub_lblColorFondoItemsPares_MouseClicked rsub = new ResumableSub_lblColorFondoItemsPares_MouseClicked(null,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblColorFondoItemsPares_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorFondoItemsPares_MouseClicked(b4j.docU.jamrecordformbuilder parent,RemoteObject _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
RemoteObject _eventdata;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblColorFondoItemsPares_MouseClicked (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,2218);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 2240;BA.debugLine="Dialog.Title=\"Selecciona color Fondo Items Pares\"";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona color Fondo Items Pares")));
 BA.debugLineNum = 2241;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = parent._xui.runMethod(false,"CreatePanel",jamrecordformbuilder.ba,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 2242;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))));
 BA.debugLineNum = 2243;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrBCColorPickerJamTableView")),jamrecordformbuilder.ba);
 BA.debugLineNum = 2244;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",jamrecordformbuilder.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "lblcolorfondoitemspares_mouseclicked"),BA.numberCast(int.class, 0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 2246;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 2247;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 2248;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorF";
Debug.JustUpdateDeviceLine();
parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_setselectedcolor" /*RemoteObject*/ ,parent._lblcolorfondoitemspares.runMethod(true,"getColor"));
 BA.debugLineNum = 2249;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(parent._xui.getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 2250;BA.debugLine="bCancel.left=bCancel.left-20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 2251;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 2252;BA.debugLine="bCancel.Textsize=16";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 2253;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "lblcolorfondoitemspares_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2254;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
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
 BA.debugLineNum = 2255;BA.debugLine="lblColorFondoItemsPares.Color=BCColorPickerjamTab";
Debug.JustUpdateDeviceLine();
parent._lblcolorfondoitemspares.runMethod(true,"setColor",parent._bccolorpickerjamtableview.runClassMethod (b4j.docU.bccolorpicker.class, "_getselectedcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 2256;BA.debugLine="txtRGBColorFondoItemsPares.Text=GetCssColorString";
Debug.JustUpdateDeviceLine();
parent._txtrgbcolorfondoitemspares.runMethod(true,"setText",_getcsscolorstringfromintcolor(parent._lblcolorfondoitemspares.runMethod(true,"getColor")));
 BA.debugLineNum = 2257;BA.debugLine="ColItemsPares=lblColorFondoItemsPares.Color";
Debug.JustUpdateDeviceLine();
parent._colitemspares = parent._lblcolorfondoitemspares.runMethod(true,"getColor");
 BA.debugLineNum = 2259;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("lblInfo_MouseClicked (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1602);
if (RapidSub.canDelegate("lblinfo_mouseclicked")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","lblinfo_mouseclicked", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 1602;BA.debugLine="Sub lblInfo_MouseClicked (EventData As MouseEvent)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1604;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _lblresetcolorfondoitemsimpares_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorFondoItemsImpares_MouseClicked (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,2272);
if (RapidSub.canDelegate("lblresetcolorfondoitemsimpares_mouseclicked")) { b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","lblresetcolorfondoitemsimpares_mouseclicked", _eventdata); return;}
ResumableSub_lblResetColorFondoItemsImpares_MouseClicked rsub = new ResumableSub_lblResetColorFondoItemsImpares_MouseClicked(null,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblResetColorFondoItemsImpares_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorFondoItemsImpares_MouseClicked(b4j.docU.jamrecordformbuilder parent,RemoteObject _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
RemoteObject _eventdata;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorFondoItemsImpares_MouseClicked (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,2272);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 2273;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"Msgbox2Async",jamrecordformbuilder.ba,(Object)(BA.ObjectToString("¿Resetear el color de los Items Impares al color por defecto?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2274;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "lblresetcolorfondoitemsimpares_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2275;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
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
 BA.debugLineNum = 2276;BA.debugLine="lblColorFondoItemsImpares.Color=ColItemsImparesPr";
Debug.JustUpdateDeviceLine();
parent._lblcolorfondoitemsimpares.runMethod(true,"setColor",parent._colitemsimparespredeterminado);
 BA.debugLineNum = 2278;BA.debugLine="txtRGBColorFondoItemsImpares.Text=GetCssColorStri";
Debug.JustUpdateDeviceLine();
parent._txtrgbcolorfondoitemsimpares.runMethod(true,"setText",_getcsscolorstringfromintcolor(parent._lblcolorfondoitemsimpares.runMethod(true,"getColor")));
 BA.debugLineNum = 2279;BA.debugLine="ColItemsImpares=lblColorFondoItemsImpares.Color";
Debug.JustUpdateDeviceLine();
parent._colitemsimpares = parent._lblcolorfondoitemsimpares.runMethod(true,"getColor");
 BA.debugLineNum = 2280;BA.debugLine="End Sub";
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
public static void  _lblresetcolorfondoitemspares_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorFondoItemsPares_MouseClicked (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,2262);
if (RapidSub.canDelegate("lblresetcolorfondoitemspares_mouseclicked")) { b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","lblresetcolorfondoitemspares_mouseclicked", _eventdata); return;}
ResumableSub_lblResetColorFondoItemsPares_MouseClicked rsub = new ResumableSub_lblResetColorFondoItemsPares_MouseClicked(null,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblResetColorFondoItemsPares_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorFondoItemsPares_MouseClicked(b4j.docU.jamrecordformbuilder parent,RemoteObject _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
RemoteObject _eventdata;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblResetColorFondoItemsPares_MouseClicked (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,2262);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 2263;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"Msgbox2Async",jamrecordformbuilder.ba,(Object)(BA.ObjectToString("¿Resetear el color de los items pares al color por defecto?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2264;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "lblresetcolorfondoitemspares_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2265;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
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
 BA.debugLineNum = 2266;BA.debugLine="lblColorFondoItemsPares.Color=ColItemsParesPredet";
Debug.JustUpdateDeviceLine();
parent._lblcolorfondoitemspares.runMethod(true,"setColor",parent._colitemsparespredeterminado);
 BA.debugLineNum = 2268;BA.debugLine="txtRGBColorFondoItemsPares.Text=GetCssColorString";
Debug.JustUpdateDeviceLine();
parent._txtrgbcolorfondoitemspares.runMethod(true,"setText",_getcsscolorstringfromintcolor(parent._lblcolorfondoitemspares.runMethod(true,"getColor")));
 BA.debugLineNum = 2269;BA.debugLine="ColItemsPares=lblColorFondoItemsPares.Color";
Debug.JustUpdateDeviceLine();
parent._colitemspares = parent._lblcolorfondoitemspares.runMethod(true,"getColor");
 BA.debugLineNum = 2270;BA.debugLine="End Sub";
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
public static RemoteObject  _limpiarcontrolesorigendatos() throws Exception{
try {
		Debug.PushSubsStack("LimpiarControlesOrigenDatos (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,300);
if (RapidSub.canDelegate("limpiarcontrolesorigendatos")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","limpiarcontrolesorigendatos");}
 BA.debugLineNum = 300;BA.debugLine="Sub LimpiarControlesOrigenDatos";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 301;BA.debugLine="txtIpJRDC.Text=\"\"";
Debug.JustUpdateDeviceLine();
jamrecordformbuilder._txtipjrdc.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 302;BA.debugLine="txtPuertoJRDC.Text=\"\"";
Debug.JustUpdateDeviceLine();
jamrecordformbuilder._txtpuertojrdc.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 303;BA.debugLine="txtNombreTabla.Text=\"\"";
Debug.JustUpdateDeviceLine();
jamrecordformbuilder._txtnombretabla.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 304;BA.debugLine="Log(\"txtDBMS.Text=\"\"\")";
Debug.JustUpdateDeviceLine();
jamrecordformbuilder.__c.runVoidMethod ("LogImpl","9128974852",RemoteObject.createImmutable("txtDBMS.Text=\""),0);
 BA.debugLineNum = 305;BA.debugLine="txtDBMS.Text=\"\"";
Debug.JustUpdateDeviceLine();
jamrecordformbuilder._txtdbms.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 306;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mnuhelp_action() throws Exception{
try {
		Debug.PushSubsStack("mnuHelp_Action (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1626);
if (RapidSub.canDelegate("mnuhelp_action")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","mnuhelp_action");}
 BA.debugLineNum = 1626;BA.debugLine="Sub mnuHelp_Action";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1627;BA.debugLine="Help";
Debug.JustUpdateDeviceLine();
_help();
 BA.debugLineNum = 1628;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _mnuload_action() throws Exception{
try {
		Debug.PushSubsStack("mnuLoad_Action (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,678);
if (RapidSub.canDelegate("mnuload_action")) { b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","mnuload_action"); return;}
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
public ResumableSub_mnuLoad_Action(b4j.docU.jamrecordformbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
RemoteObject _cancel = RemoteObject.createImmutable(false);
RemoteObject _f = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("mnuLoad_Action (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,678);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 679;BA.debugLine="Wait For (CheckChanges) Complete (Cancel As Boole";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "mnuload_action"), _checkchanges());
this.state = 11;
return;
case 11:
//C
this.state = 1;
_cancel = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Cancel", _cancel);
;
 BA.debugLineNum = 680;BA.debugLine="If Cancel Then Return";
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
this.state = 7;
;
 BA.debugLineNum = 681;BA.debugLine="Dim f As String = FileChooser.ShowOpen(frm)";
Debug.JustUpdateDeviceLine();
_f = parent._filechooser.runMethodAndSync(true,"ShowOpen",(Object)(parent._frm));Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 682;BA.debugLine="If f <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("!",_f,BA.ObjectToString(""))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 683;BA.debugLine="clvListaCampos.Clear";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.runVoidMethod ("_clear");
 BA.debugLineNum = 684;BA.debugLine="lstPrimaryKey.Clear";
Debug.JustUpdateDeviceLine();
parent._lstprimarykey.runVoidMethod ("Clear");
 BA.debugLineNum = 685;BA.debugLine="DatosOrigenDatos.Initialize";
Debug.JustUpdateDeviceLine();
parent._datosorigendatos.runVoidMethod ("Initialize");
 BA.debugLineNum = 686;BA.debugLine="CargarDatosDesdeFichero(f)";
Debug.JustUpdateDeviceLine();
_cargardatosdesdefichero(_f);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 688;BA.debugLine="End Sub";
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
public static RemoteObject  _mnunew_action() throws Exception{
try {
		Debug.PushSubsStack("mnuNew_Action (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,972);
if (RapidSub.canDelegate("mnunew_action")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","mnunew_action");}
ResumableSub_mnuNew_Action rsub = new ResumableSub_mnuNew_Action(null);
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
public static class ResumableSub_mnuNew_Action extends BA.ResumableSub {
public ResumableSub_mnuNew_Action(b4j.docU.jamrecordformbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
RemoteObject _cancel = RemoteObject.createImmutable(false);
RemoteObject _rbool = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("mnuNew_Action (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,972);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 973;BA.debugLine="Log(\"mnuNew_Action\")";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9129630209",RemoteObject.createImmutable("mnuNew_Action"),0);
 BA.debugLineNum = 974;BA.debugLine="Wait For (CheckChanges) Complete (Cancel As Boole";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "mnunew_action"), _checkchanges());
this.state = 13;
return;
case 13:
//C
this.state = 1;
_cancel = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Cancel", _cancel);
;
 BA.debugLineNum = 975;BA.debugLine="If Cancel Then Return False";
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
 BA.debugLineNum = 976;BA.debugLine="lstPrimaryKey.Initialize";
Debug.JustUpdateDeviceLine();
parent._lstprimarykey.runVoidMethod ("Initialize");
 BA.debugLineNum = 977;BA.debugLine="clvListaCampos.Clear";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.runVoidMethod ("_clear");
 BA.debugLineNum = 978;BA.debugLine="Log(\"LimpiarControlesOrigenDatos\")";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9129630214",RemoteObject.createImmutable("LimpiarControlesOrigenDatos"),0);
 BA.debugLineNum = 979;BA.debugLine="LimpiarControlesOrigenDatos";
Debug.JustUpdateDeviceLine();
_limpiarcontrolesorigendatos();
 BA.debugLineNum = 981;BA.debugLine="Wait For(ConfigurarOrigenDatos) complete (rBool A";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "mnunew_action"), _configurarorigendatos());
this.state = 14;
return;
case 14:
//C
this.state = 7;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 982;BA.debugLine="If rBool=False Then Return False";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_rbool,parent.__c.getField(true,"False"))) { 
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
this.state = -1;
;
 BA.debugLineNum = 983;BA.debugLine="ColItemsImpares=ColItemsImparesPredeterminado";
Debug.JustUpdateDeviceLine();
parent._colitemsimpares = parent._colitemsimparespredeterminado;
 BA.debugLineNum = 984;BA.debugLine="ColItemsPares=ColItemsParesPredeterminado";
Debug.JustUpdateDeviceLine();
parent._colitemspares = parent._colitemsparespredeterminado;
 BA.debugLineNum = 985;BA.debugLine="NewFileString=ExportDataToString";
Debug.JustUpdateDeviceLine();
parent._newfilestring = _exportdatatostring();
 BA.debugLineNum = 986;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 987;BA.debugLine="End Sub";
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
public static void  _mnusalir_action() throws Exception{
try {
		Debug.PushSubsStack("mnuSalir_Action (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,254);
if (RapidSub.canDelegate("mnusalir_action")) { b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","mnusalir_action"); return;}
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
public ResumableSub_mnuSalir_Action(b4j.docU.jamrecordformbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("mnuSalir_Action (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,254);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 255;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"De momento";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"Msgbox2Async",jamrecordformbuilder.ba,(Object)(BA.ObjectToString("De momento no se ha implantado el control de cambios (no se grabarán los posibles cambios). ¿Salir de la aplicación?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 256;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "mnusalir_action"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 257;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
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
 BA.debugLineNum = 258;BA.debugLine="RecentManager.SaveList";
Debug.JustUpdateDeviceLine();
parent._recentmanager.runClassMethod (b4j.docU.recentfilesmanagerrecordformbuilder.class, "_savelist" /*RemoteObject*/ );
 BA.debugLineNum = 259;BA.debugLine="frm.Close";
Debug.JustUpdateDeviceLine();
parent._frm.runVoidMethod ("Close");
 BA.debugLineNum = 260;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("mnuSave_Action (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1304);
if (RapidSub.canDelegate("mnusave_action")) { b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","mnusave_action"); return;}
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
public ResumableSub_mnuSave_Action(b4j.docU.jamrecordformbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
RemoteObject _camposok = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("mnuSave_Action (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1304);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1305;BA.debugLine="If CurrentFile = \"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",parent._currentfile,BA.ObjectToString(""))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 10;
 BA.debugLineNum = 1306;BA.debugLine="mnuSaveAs_Action";
Debug.JustUpdateDeviceLine();
_mnusaveas_action();
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1308;BA.debugLine="Wait For (ComprobarAvisosRegistro) Complete (Cam";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "mnusave_action"), _comprobaravisosregistro());
this.state = 11;
return;
case 11:
//C
this.state = 6;
_camposok = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("CamposOK", _camposok);
;
 BA.debugLineNum = 1309;BA.debugLine="If CamposOK Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 6:
//if
this.state = 9;
if (_camposok.<Boolean>get().booleanValue()) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1310;BA.debugLine="CurrentFileString = ExportDataToString";
Debug.JustUpdateDeviceLine();
parent._currentfilestring = _exportdatatostring();
 BA.debugLineNum = 1311;BA.debugLine="File.WriteString(CurrentFile, \"\", CurrentFileSt";
Debug.JustUpdateDeviceLine();
parent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent._currentfile),(Object)(BA.ObjectToString("")),(Object)(parent._currentfilestring));
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
 BA.debugLineNum = 1314;BA.debugLine="End Sub";
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
public static void  _mnusaveas_action() throws Exception{
try {
		Debug.PushSubsStack("mnuSaveAs_Action (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1526);
if (RapidSub.canDelegate("mnusaveas_action")) { b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","mnusaveas_action"); return;}
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
public ResumableSub_mnuSaveAs_Action(b4j.docU.jamrecordformbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
RemoteObject _camposok = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _f = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("mnuSaveAs_Action (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1526);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1527;BA.debugLine="Wait For (ComprobarAvisosRegistro) Complete (Camp";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "mnusaveas_action"), _comprobaravisosregistro());
this.state = 11;
return;
case 11:
//C
this.state = 1;
_camposok = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("CamposOK", _camposok);
;
 BA.debugLineNum = 1528;BA.debugLine="If CamposOK Then";
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
 BA.debugLineNum = 1529;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Ubicar el f";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamrecordformbuilder.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Ubicar el fichero en el directorio FILES de la aplicación en la que se vaya a usar."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Recuerda SINCRONIZAR la carpeta Files del proyecto después."))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1530;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "mnusaveas_action"), _msa);
this.state = 12;
return;
case 12:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1531;BA.debugLine="Dim f As String = FileChooser.ShowSave(frm)";
Debug.JustUpdateDeviceLine();
_f = parent._filechooser.runMethodAndSync(true,"ShowSave",(Object)(parent._frm));Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 1532;BA.debugLine="If f = \"\" Then Return";
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
 BA.debugLineNum = 1533;BA.debugLine="SetCurrentFile(f)";
Debug.JustUpdateDeviceLine();
_setcurrentfile(_f);
 BA.debugLineNum = 1534;BA.debugLine="mnuSave_Action";
Debug.JustUpdateDeviceLine();
_mnusave_action();
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 1536;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("MostrarDatosOrigenDatos (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1048);
if (RapidSub.canDelegate("mostrardatosorigendatos")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","mostrardatosorigendatos");}
 BA.debugLineNum = 1048;BA.debugLine="Sub MostrarDatosOrigenDatos";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1050;BA.debugLine="txtIpJRDC.Text=DatosOrigenDatos.IpJRDC";
Debug.JustUpdateDeviceLine();
jamrecordformbuilder._txtipjrdc.runMethod(true,"setText",jamrecordformbuilder._datosorigendatos.getField(true,"IpJRDC" /*RemoteObject*/ ));
 BA.debugLineNum = 1051;BA.debugLine="txtPuertoJRDC.Text=DatosOrigenDatos.PuertoJRDC";
Debug.JustUpdateDeviceLine();
jamrecordformbuilder._txtpuertojrdc.runMethod(true,"setText",jamrecordformbuilder._datosorigendatos.getField(true,"PuertoJRDC" /*RemoteObject*/ ));
 BA.debugLineNum = 1052;BA.debugLine="txtNombreTabla.Text=DatosOrigenDatos.NombreTabla";
Debug.JustUpdateDeviceLine();
jamrecordformbuilder._txtnombretabla.runMethod(true,"setText",jamrecordformbuilder._datosorigendatos.getField(true,"NombreTabla" /*RemoteObject*/ ));
 BA.debugLineNum = 1053;BA.debugLine="txtDBMS.Text=DatosOrigenDatos.DBMS";
Debug.JustUpdateDeviceLine();
jamrecordformbuilder._txtdbms.runMethod(true,"setText",jamrecordformbuilder._datosorigendatos.getField(true,"DBMS" /*RemoteObject*/ ));
 BA.debugLineNum = 1054;BA.debugLine="pnlOrigenSQL.Visible=True";
Debug.JustUpdateDeviceLine();
jamrecordformbuilder._pnlorigensql.runMethod(true,"setVisible",jamrecordformbuilder.__c.getField(true,"True"));
 BA.debugLineNum = 1055;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nuevodesdeformregistro() throws Exception{
try {
		Debug.PushSubsStack("NuevoDesdeFormRegistro (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,225);
if (RapidSub.canDelegate("nuevodesdeformregistro")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","nuevodesdeformregistro");}
ResumableSub_NuevoDesdeFormRegistro rsub = new ResumableSub_NuevoDesdeFormRegistro(null);
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
public static class ResumableSub_NuevoDesdeFormRegistro extends BA.ResumableSub {
public ResumableSub_NuevoDesdeFormRegistro(b4j.docU.jamrecordformbuilder parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
RemoteObject _rbool = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("NuevoDesdeFormRegistro (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,225);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 226;BA.debugLine="lstPrimaryKey.Initialize";
Debug.JustUpdateDeviceLine();
parent._lstprimarykey.runVoidMethod ("Initialize");
 BA.debugLineNum = 227;BA.debugLine="clvListaCampos.Clear";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.runVoidMethod ("_clear");
 BA.debugLineNum = 228;BA.debugLine="LimpiarControlesOrigenDatos";
Debug.JustUpdateDeviceLine();
_limpiarcontrolesorigendatos();
 BA.debugLineNum = 230;BA.debugLine="Wait For(ConfigurarOrigenDatos) complete (rBool A";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "nuevodesdeformregistro"), _configurarorigendatos());
this.state = 7;
return;
case 7:
//C
this.state = 1;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 231;BA.debugLine="If rBool=False Then Return False";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_rbool,parent.__c.getField(true,"False"))) { 
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
this.state = -1;
;
 BA.debugLineNum = 232;BA.debugLine="ColItemsImpares=ColItemsImparesPredeterminado";
Debug.JustUpdateDeviceLine();
parent._colitemsimpares = parent._colitemsimparespredeterminado;
 BA.debugLineNum = 233;BA.debugLine="ColItemsPares=ColItemsParesPredeterminado";
Debug.JustUpdateDeviceLine();
parent._colitemspares = parent._colitemsparespredeterminado;
 BA.debugLineNum = 234;BA.debugLine="NewFileString=ExportDataToString";
Debug.JustUpdateDeviceLine();
parent._newfilestring = _exportdatatostring();
 BA.debugLineNum = 236;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 237;BA.debugLine="End Sub";
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Const Version As String=9.01";
jamrecordformbuilder._version = BA.NumberToString(9.01);
 //BA.debugLineNum = 5;BA.debugLine="Private fx As JFX";
jamrecordformbuilder._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 6;BA.debugLine="Private frm As Form";
jamrecordformbuilder._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 7;BA.debugLine="Private clvListaCampos As CustomListView";
jamrecordformbuilder._clvlistacampos = RemoteObject.createNew ("b4j.example.customlistview");
 //BA.debugLineNum = 8;BA.debugLine="Private Dialog As B4XDialog";
jamrecordformbuilder._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
jamrecordformbuilder._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Private dragger As jamRecordFormCLVDragger";
jamrecordformbuilder._dragger = RemoteObject.createNew ("b4j.docU.jamrecordformclvdragger");
 //BA.debugLineNum = 11;BA.debugLine="Private FileChooser As FileChooser";
jamrecordformbuilder._filechooser = RemoteObject.createNew ("anywheresoftware.b4j.objects.FileChooserWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Private CurrentFile As String";
jamrecordformbuilder._currentfile = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Private CurrentFileString As String";
jamrecordformbuilder._currentfilestring = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Private NewFileString As String";
jamrecordformbuilder._newfilestring = RemoteObject.createImmutable("");
 //BA.debugLineNum = 17;BA.debugLine="Private MenuBar1 As MenuBar";
jamrecordformbuilder._menubar1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private RecentManager As RecentFilesManagerRecord";
jamrecordformbuilder._recentmanager = RemoteObject.createNew ("b4j.docU.recentfilesmanagerrecordformbuilder");
 //BA.debugLineNum = 21;BA.debugLine="Private mModo As String";
jamrecordformbuilder._mmodo = RemoteObject.createImmutable("");
 //BA.debugLineNum = 37;BA.debugLine="Type clvRecordFormItemValue(chkBoxControlIndepend";
;
 //BA.debugLineNum = 48;BA.debugLine="Public TipoControl_TextField, TipoControl_B4XInpu";
jamrecordformbuilder._tipocontrol_textfield = RemoteObject.createImmutable("");
jamrecordformbuilder._tipocontrol_b4xinputdialogtextfield = RemoteObject.createImmutable("");
jamrecordformbuilder._tipocontrol_b4xlistdialogtextfield = RemoteObject.createImmutable("");
jamrecordformbuilder._tipocontrol_b4xsearchlistdialogtextfield = RemoteObject.createImmutable("");
jamrecordformbuilder._tipocontrol_combobox = RemoteObject.createImmutable("");
jamrecordformbuilder._tipocontrol_lmb4xcombobox = RemoteObject.createImmutable("");
jamrecordformbuilder._tipocontrol_checkbox = RemoteObject.createImmutable("");
jamrecordformbuilder._tipocontrol_textfieldbuttonselfile = RemoteObject.createImmutable("");
jamrecordformbuilder._tipocontrol_textfieldbuttonselfecha = RemoteObject.createImmutable("");
jamrecordformbuilder._tipocontrol_textfieldbuttonselext = RemoteObject.createImmutable("");
jamrecordformbuilder._tipocontrol_textfieldindependiente = RemoteObject.createImmutable("");
 //BA.debugLineNum = 51;BA.debugLine="TipoControl_TextField = \"TextField\"";
jamrecordformbuilder._tipocontrol_textfield = BA.ObjectToString("TextField");
 //BA.debugLineNum = 52;BA.debugLine="TipoControl_ComboBox = \"ComboBox\"";
jamrecordformbuilder._tipocontrol_combobox = BA.ObjectToString("ComboBox");
 //BA.debugLineNum = 53;BA.debugLine="TipoControl_lmB4XComboBox = \"lmB4XComboBox\"";
jamrecordformbuilder._tipocontrol_lmb4xcombobox = BA.ObjectToString("lmB4XComboBox");
 //BA.debugLineNum = 54;BA.debugLine="TipoControl_CheckBox = \"CheckBox\"";
jamrecordformbuilder._tipocontrol_checkbox = BA.ObjectToString("CheckBox");
 //BA.debugLineNum = 55;BA.debugLine="TipoControl_TextFieldButtonSelFecha = \"TextFieldB";
jamrecordformbuilder._tipocontrol_textfieldbuttonselfecha = BA.ObjectToString("TextFieldBtnSelFecha");
 //BA.debugLineNum = 56;BA.debugLine="TipoControl_TextFieldButtonSelFile = \"TextFieldBt";
jamrecordformbuilder._tipocontrol_textfieldbuttonselfile = BA.ObjectToString("TextFieldBtnSelFile");
 //BA.debugLineNum = 57;BA.debugLine="TipoControl_TextFieldButtonSelExt = \"TextFieldBtn";
jamrecordformbuilder._tipocontrol_textfieldbuttonselext = BA.ObjectToString("TextFieldBtnSelExt");
 //BA.debugLineNum = 58;BA.debugLine="TipoControl_B4XInputDialogTextField=\"B4XInputDial";
jamrecordformbuilder._tipocontrol_b4xinputdialogtextfield = BA.ObjectToString("B4XInputDialogTextField");
 //BA.debugLineNum = 59;BA.debugLine="TipoControl_B4XListDialogTextField=\"B4XListDialog";
jamrecordformbuilder._tipocontrol_b4xlistdialogtextfield = BA.ObjectToString("B4XListDialogTextField");
 //BA.debugLineNum = 60;BA.debugLine="TipoControl_B4XSearchListDialogTextField=\"B4XSear";
jamrecordformbuilder._tipocontrol_b4xsearchlistdialogtextfield = BA.ObjectToString("B4XSearchListDialogTextField");
 //BA.debugLineNum = 61;BA.debugLine="TipoControl_TextFieldIndependiente=\"TextFieldInde";
jamrecordformbuilder._tipocontrol_textfieldindependiente = BA.ObjectToString("TextFieldIndependiente");
 //BA.debugLineNum = 64;BA.debugLine="Private CargandoDatos As Boolean";
jamrecordformbuilder._cargandodatos = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 70;BA.debugLine="Private TextAreaCamposToText As TextArea";
jamrecordformbuilder._textareacampostotext = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");
 //BA.debugLineNum = 72;BA.debugLine="Private lblTitleCampo As Label";
jamrecordformbuilder._lbltitlecampo = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 74;BA.debugLine="Private lblTitleTipoDato As Label";
jamrecordformbuilder._lbltitletipodato = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 75;BA.debugLine="Private lblInfo As Label";
jamrecordformbuilder._lblinfo = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 77;BA.debugLine="Private ColActual, Col1, Col2 As Int";
jamrecordformbuilder._colactual = RemoteObject.createImmutable(0);
jamrecordformbuilder._col1 = RemoteObject.createImmutable(0);
jamrecordformbuilder._col2 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 78;BA.debugLine="Private ColItemsImpares, ColItemsPares As Int";
jamrecordformbuilder._colitemsimpares = RemoteObject.createImmutable(0);
jamrecordformbuilder._colitemspares = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 79;BA.debugLine="Private ColItemsImparesPredeterminado, ColItemsPa";
jamrecordformbuilder._colitemsimparespredeterminado = RemoteObject.createImmutable(0);
jamrecordformbuilder._colitemsparespredeterminado = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 81;BA.debugLine="Private prefDialog As PreferencesDialog";
jamrecordformbuilder._prefdialog = RemoteObject.createNew ("b4j.docU.preferencesdialog");
 //BA.debugLineNum = 83;BA.debugLine="Private txtIpJRDC As TextField";
jamrecordformbuilder._txtipjrdc = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 84;BA.debugLine="Private txtPuertoJRDC As TextField";
jamrecordformbuilder._txtpuertojrdc = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 85;BA.debugLine="Private txtNombreTabla As TextField";
jamrecordformbuilder._txtnombretabla = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 89;BA.debugLine="Private pnlOrigenSQL As Pane";
jamrecordformbuilder._pnlorigensql = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
 //BA.debugLineNum = 91;BA.debugLine="Private lblTitleIpJRDC As Label";
jamrecordformbuilder._lbltitleipjrdc = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 92;BA.debugLine="Private lblTitlePuertoJRDC As Label";
jamrecordformbuilder._lbltitlepuertojrdc = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 93;BA.debugLine="Private lblTitleNombreTabla As Label";
jamrecordformbuilder._lbltitlenombretabla = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 94;BA.debugLine="Private lblTitleDBMS As Label";
jamrecordformbuilder._lbltitledbms = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 97;BA.debugLine="Public DatosOrigenDatos As TipoOrigenDatosJamForm";
jamrecordformbuilder._datosorigendatos = RemoteObject.createNew ("b4j.docU.jamformregistro._tipoorigendatosjamformregistro");
 //BA.debugLineNum = 98;BA.debugLine="Private btnEditarOrigenJRDC As Button";
jamrecordformbuilder._btneditarorigenjrdc = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 100;BA.debugLine="Private lstNombresCamposSQL As List";
jamrecordformbuilder._lstnombrescampossql = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 102;BA.debugLine="Private lstPrimaryKey As List";
jamrecordformbuilder._lstprimarykey = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 103;BA.debugLine="Private CorrigiendoChkBoxEsFecha, CorrigiendoChkB";
jamrecordformbuilder._corrigiendochkboxesfecha = RemoteObject.createImmutable(false);
jamrecordformbuilder._corrigiendochkboxcontroleditable = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 104;BA.debugLine="Private cboTipoControl As ComboBox";
jamrecordformbuilder._cbotipocontrol = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");
 //BA.debugLineNum = 105;BA.debugLine="Private cboTipoDato As ComboBox";
jamrecordformbuilder._cbotipodato = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");
 //BA.debugLineNum = 106;BA.debugLine="Private chkBoxEsFecha As CheckBox";
jamrecordformbuilder._chkboxesfecha = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
 //BA.debugLineNum = 107;BA.debugLine="Private chkboxKeyID As CheckBox";
jamrecordformbuilder._chkboxkeyid = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
 //BA.debugLineNum = 109;BA.debugLine="Private txtCampo As TextField";
jamrecordformbuilder._txtcampo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 110;BA.debugLine="Private txtTituloCampo As TextField";
jamrecordformbuilder._txttitulocampo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 111;BA.debugLine="Private txtOrdenColumna As TextField";
jamrecordformbuilder._txtordencolumna = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 112;BA.debugLine="Private chkBoxAutoIncremental As CheckBox";
jamrecordformbuilder._chkboxautoincremental = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
 //BA.debugLineNum = 113;BA.debugLine="Private chkBoxNoNulo As CheckBox";
jamrecordformbuilder._chkboxnonulo = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
 //BA.debugLineNum = 114;BA.debugLine="Private txtTipoDatoMySQL As TextField";
jamrecordformbuilder._txttipodatomysql = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 115;BA.debugLine="Private txtValorCampoPorDefecto As TextField";
jamrecordformbuilder._txtvalorcampopordefecto = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 116;BA.debugLine="Private chkBoxControlEditable As CheckBox";
jamrecordformbuilder._chkboxcontroleditable = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
 //BA.debugLineNum = 117;BA.debugLine="Private txtInfoCampo As TextField";
jamrecordformbuilder._txtinfocampo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 118;BA.debugLine="Private lblTitleCampoJoinTablaAuxlmB4XCbo As Labe";
jamrecordformbuilder._lbltitlecampojointablaauxlmb4xcbo = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 119;BA.debugLine="Private lblTitleListaValoresCbo As Label";
jamrecordformbuilder._lbltitlelistavalorescbo = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 120;BA.debugLine="Private txtListaValoresCbo As TextField";
jamrecordformbuilder._txtlistavalorescbo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 127;BA.debugLine="Private lblTitleComandoConfiglmB4XCbo As Label";
jamrecordformbuilder._lbltitlecomandoconfiglmb4xcbo = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 128;BA.debugLine="Private txtComandoConfiglmB4XCbo As TextField";
jamrecordformbuilder._txtcomandoconfiglmb4xcbo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 129;BA.debugLine="Private lblTitleParametrosComandolmB4XCbo As Labe";
jamrecordformbuilder._lbltitleparametroscomandolmb4xcbo = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 130;BA.debugLine="Private txtParametrosComandolmB4XCbo As TextField";
jamrecordformbuilder._txtparametroscomandolmb4xcbo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 131;BA.debugLine="Private lblTitleTipoDatosAux As Label";
jamrecordformbuilder._lbltitletipodatosaux = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 132;BA.debugLine="Private cboTipoDatosAux As ComboBox";
jamrecordformbuilder._cbotipodatosaux = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");
 //BA.debugLineNum = 133;BA.debugLine="Private lblTitleComandoConfigDatosAux As Label";
jamrecordformbuilder._lbltitlecomandoconfigdatosaux = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 134;BA.debugLine="Private txtComandoConfigDatosAux As TextField";
jamrecordformbuilder._txtcomandoconfigdatosaux = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 135;BA.debugLine="Private lblTitleParametrosComandoDatosAux As Labe";
jamrecordformbuilder._lbltitleparametroscomandodatosaux = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 136;BA.debugLine="Private txtParametrosComandoDatosAux As TextField";
jamrecordformbuilder._txtparametroscomandodatosaux = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 137;BA.debugLine="Private lblTitleNumCamposDatosAux As Label";
jamrecordformbuilder._lbltitlenumcamposdatosaux = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 138;BA.debugLine="Private B4XPlusMinusNumCamposDatosAux As B4XPlusM";
jamrecordformbuilder._b4xplusminusnumcamposdatosaux = RemoteObject.createNew ("b4j.docU.b4xplusminus");
 //BA.debugLineNum = 139;BA.debugLine="Private lblTitleListaValoresDatosAux As Label";
jamrecordformbuilder._lbltitlelistavaloresdatosaux = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 140;BA.debugLine="Private txtListaValoresDatosAux As TextField";
jamrecordformbuilder._txtlistavaloresdatosaux = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 141;BA.debugLine="Private lblTitleIPJrdcOrigenDatosAux As Label";
jamrecordformbuilder._lbltitleipjrdcorigendatosaux = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 142;BA.debugLine="Private txtIPJrdcOrigenDatosAux As TextField";
jamrecordformbuilder._txtipjrdcorigendatosaux = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 143;BA.debugLine="Private btnIgualOrigenDatosAux As Button";
jamrecordformbuilder._btnigualorigendatosaux = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 144;BA.debugLine="Private lblTitlePuertoJrdcOrigenDatosAux As Label";
jamrecordformbuilder._lbltitlepuertojrdcorigendatosaux = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 145;BA.debugLine="Private txtPuertoJrdcOrigenDatosAux As TextField";
jamrecordformbuilder._txtpuertojrdcorigendatosaux = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 146;BA.debugLine="Private btnAdd As Button";
jamrecordformbuilder._btnadd = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 147;BA.debugLine="Private chkBoxControlIndependiente As CheckBox";
jamrecordformbuilder._chkboxcontrolindependiente = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
 //BA.debugLineNum = 148;BA.debugLine="Private btnDelete As Button";
jamrecordformbuilder._btndelete = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 151;BA.debugLine="Private lblColorFondoItemsImpares As B4XView";
jamrecordformbuilder._lblcolorfondoitemsimpares = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 152;BA.debugLine="Private lblColorFondoItemsPares As B4XView";
jamrecordformbuilder._lblcolorfondoitemspares = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 154;BA.debugLine="Private lblResetColorFondoItemsImpares As B4XView";
jamrecordformbuilder._lblresetcolorfondoitemsimpares = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 155;BA.debugLine="Private lblResetColorFondoItemsPares As B4XView";
jamrecordformbuilder._lblresetcolorfondoitemspares = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 158;BA.debugLine="Private txtRGBColorFondoItemsImpares As TextField";
jamrecordformbuilder._txtrgbcolorfondoitemsimpares = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 159;BA.debugLine="Private txtRGBColorFondoItemsPares As TextField";
jamrecordformbuilder._txtrgbcolorfondoitemspares = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 161;BA.debugLine="Private BCColorPickerjamTableView As BCColorPicke";
jamrecordformbuilder._bccolorpickerjamtableview = RemoteObject.createNew ("b4j.docU.bccolorpicker");
 //BA.debugLineNum = 162;BA.debugLine="Private txtDBMS As TextField";
jamrecordformbuilder._txtdbms = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _recalcularidordencolumnas() throws Exception{
try {
		Debug.PushSubsStack("RecalcularIDOrdenColumnas (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,2154);
if (RapidSub.canDelegate("recalcularidordencolumnas")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","recalcularidordencolumnas");}
RemoteObject _ordencolacum = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamrecordformbuilder._clvrecordformitemvalue");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 2154;BA.debugLine="private Sub RecalcularIDOrdenColumnas";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2155;BA.debugLine="Dim OrdenColAcum As Int";
Debug.JustUpdateDeviceLine();
_ordencolacum = RemoteObject.createImmutable(0);Debug.locals.put("OrdenColAcum", _ordencolacum);
 BA.debugLineNum = 2156;BA.debugLine="For i=0 To clvListaCampos.Size-1";
Debug.JustUpdateDeviceLine();
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {jamrecordformbuilder._clvlistacampos.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2157;BA.debugLine="Dim clvIV As clvRecordFormItemValue=clvListaCamp";
Debug.JustUpdateDeviceLine();
_clviv = (jamrecordformbuilder._clvlistacampos.runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 2158;BA.debugLine="clvIV.txtOrdenColumna.Text=i";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtOrdenColumna" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(_i));
 BA.debugLineNum = 2165;BA.debugLine="If ColActual=Col1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",jamrecordformbuilder._colactual,BA.numberCast(double.class, jamrecordformbuilder._col1))) { 
 BA.debugLineNum = 2166;BA.debugLine="ColActual=Col2";
Debug.JustUpdateDeviceLine();
jamrecordformbuilder._colactual = jamrecordformbuilder._col2;
 }else {
 BA.debugLineNum = 2168;BA.debugLine="ColActual=Col1";
Debug.JustUpdateDeviceLine();
jamrecordformbuilder._colactual = jamrecordformbuilder._col1;
 };
 BA.debugLineNum = 2170;BA.debugLine="Dim p As B4XView=clvListaCampos.GetPanel(i)";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = jamrecordformbuilder._clvlistacampos.runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 2171;BA.debugLine="p.Color=ColActual";
Debug.JustUpdateDeviceLine();
_p.runMethod(true,"setColor",jamrecordformbuilder._colactual);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2173;BA.debugLine="Log(\"RecalcularIDOrdenColumnas\")";
Debug.JustUpdateDeviceLine();
jamrecordformbuilder.__c.runVoidMethod ("LogImpl","9131596307",RemoteObject.createImmutable("RecalcularIDOrdenColumnas"),0);
 BA.debugLineNum = 2174;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _recalcularordencolumnas() throws Exception{
try {
		Debug.PushSubsStack("RecalcularOrdenColumnas (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1587);
if (RapidSub.canDelegate("recalcularordencolumnas")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","recalcularordencolumnas");}
int _i = 0;
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamrecordformbuilder._clvrecordformitemvalue");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 1587;BA.debugLine="Sub RecalcularOrdenColumnas";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1588;BA.debugLine="For i=0 To clvListaCampos.Size-1";
Debug.JustUpdateDeviceLine();
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {jamrecordformbuilder._clvlistacampos.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1589;BA.debugLine="Dim clvIV As clvRecordFormItemValue=clvListaCamp";
Debug.JustUpdateDeviceLine();
_clviv = (jamrecordformbuilder._clvlistacampos.runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 1590;BA.debugLine="clvIV.txtOrdenColumna.Text=i";
Debug.JustUpdateDeviceLine();
_clviv.getField(false,"txtOrdenColumna" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(_i));
 BA.debugLineNum = 1591;BA.debugLine="If ColActual=Col1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",jamrecordformbuilder._colactual,BA.numberCast(double.class, jamrecordformbuilder._col1))) { 
 BA.debugLineNum = 1592;BA.debugLine="ColActual=Col2";
Debug.JustUpdateDeviceLine();
jamrecordformbuilder._colactual = jamrecordformbuilder._col2;
 }else {
 BA.debugLineNum = 1594;BA.debugLine="ColActual=Col1";
Debug.JustUpdateDeviceLine();
jamrecordformbuilder._colactual = jamrecordformbuilder._col1;
 };
 BA.debugLineNum = 1596;BA.debugLine="Dim p As B4XView=clvListaCampos.GetPanel(i)";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = jamrecordformbuilder._clvlistacampos.runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 1597;BA.debugLine="p.Color=ColActual";
Debug.JustUpdateDeviceLine();
_p.runMethod(true,"setColor",jamrecordformbuilder._colactual);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1599;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Recent_Click (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,263);
if (RapidSub.canDelegate("recent_click")) { b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","recent_click", _recentfile); return;}
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
public ResumableSub_Recent_Click(b4j.docU.jamrecordformbuilder parent,RemoteObject _recentfile) {
this.parent = parent;
this._recentfile = _recentfile;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
RemoteObject _recentfile;
RemoteObject _cancel = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Recent_Click (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,263);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("RecentFile", _recentfile);
 BA.debugLineNum = 264;BA.debugLine="Wait For (CheckChanges) Complete (Cancel As Boole";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "recent_click"), _checkchanges());
this.state = 7;
return;
case 7:
//C
this.state = 1;
_cancel = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Cancel", _cancel);
;
 BA.debugLineNum = 265;BA.debugLine="If Cancel Then Return";
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
 BA.debugLineNum = 266;BA.debugLine="clvListaCampos.Clear";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.runVoidMethod ("_clear");
 BA.debugLineNum = 267;BA.debugLine="lstPrimaryKey.Clear";
Debug.JustUpdateDeviceLine();
parent._lstprimarykey.runVoidMethod ("Clear");
 BA.debugLineNum = 268;BA.debugLine="DatosOrigenDatos.Initialize";
Debug.JustUpdateDeviceLine();
parent._datosorigendatos.runVoidMethod ("Initialize");
 BA.debugLineNum = 269;BA.debugLine="CargarDatosDesdeFichero(RecentFile)";
Debug.JustUpdateDeviceLine();
_cargardatosdesdefichero(_recentfile);
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
public static RemoteObject  _setcurrentfile(RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetCurrentFile (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,940);
if (RapidSub.canDelegate("setcurrentfile")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","setcurrentfile", _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 940;BA.debugLine="Sub SetCurrentFile (f As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 941;BA.debugLine="CurrentFile = f";
Debug.JustUpdateDeviceLine();
jamrecordformbuilder._currentfile = _f;
 BA.debugLineNum = 942;BA.debugLine="frm.Title = $\"RecordsBuilder ($1.2{Version})\"$";
Debug.JustUpdateDeviceLine();
jamrecordformbuilder._frm.runMethod(true,"setTitle",(RemoteObject.concat(RemoteObject.createImmutable("RecordsBuilder ("),jamrecordformbuilder.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((jamrecordformbuilder._version))),RemoteObject.createImmutable(")"))));
 BA.debugLineNum = 943;BA.debugLine="If f <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_f,BA.ObjectToString(""))) { 
 BA.debugLineNum = 944;BA.debugLine="frm.Title = frm.Title & \" - \" & File.GetName(f)";
Debug.JustUpdateDeviceLine();
jamrecordformbuilder._frm.runMethod(true,"setTitle",RemoteObject.concat(jamrecordformbuilder._frm.runMethod(true,"getTitle"),RemoteObject.createImmutable(" - "),jamrecordformbuilder.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_f))));
 };
 BA.debugLineNum = 946;BA.debugLine="RecentManager.AddFile(f)";
Debug.JustUpdateDeviceLine();
jamrecordformbuilder._recentmanager.runClassMethod (b4j.docU.recentfilesmanagerrecordformbuilder.class, "_addfile" /*RemoteObject*/ ,(Object)(_f));
 BA.debugLineNum = 947;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetFormMaximized (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,241);
if (RapidSub.canDelegate("setformmaximized")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","setformmaximized", _f);}
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("f", _f);
 BA.debugLineNum = 241;BA.debugLine="Sub SetFormMaximized(f As Form)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 243;BA.debugLine="Dim joForm As JavaObject = f";
Debug.JustUpdateDeviceLine();
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _f);Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 245;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.JustUpdateDeviceLine();
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 247;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.JustUpdateDeviceLine();
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(jamrecordformbuilder.__c.getField(true,"True"))})));
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _show(RemoteObject _modo,RemoteObject _nombreficherojson) throws Exception{
try {
		Debug.PushSubsStack("Show (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,167);
if (RapidSub.canDelegate("show")) { b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","show", _modo, _nombreficherojson); return;}
ResumableSub_Show rsub = new ResumableSub_Show(null,_modo,_nombreficherojson);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.jamrecordformbuilder parent,RemoteObject _modo,RemoteObject _nombreficherojson) {
this.parent = parent;
this._modo = _modo;
this._nombreficherojson = _nombreficherojson;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamrecordformbuilder parent;
RemoteObject _modo;
RemoteObject _nombreficherojson;
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
RemoteObject _joclvdatosscrollpane = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _robj = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,167);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Modo", _modo);
Debug.locals.put("NombreFicheroJSON", _nombreficherojson);
 BA.debugLineNum = 168;BA.debugLine="mModo=Modo";
Debug.JustUpdateDeviceLine();
parent._mmodo = _modo;
 BA.debugLineNum = 171;BA.debugLine="Col1=0XFF696969";
Debug.JustUpdateDeviceLine();
parent._col1 = BA.numberCast(int.class, ((int)0xff696969));
 BA.debugLineNum = 172;BA.debugLine="Col2=0xFFA1A1A1";
Debug.JustUpdateDeviceLine();
parent._col2 = BA.numberCast(int.class, ((int)0xffa1a1a1));
 BA.debugLineNum = 174;BA.debugLine="ColItemsParesPredeterminado=0xFFD7CCC8";
Debug.JustUpdateDeviceLine();
parent._colitemsparespredeterminado = BA.numberCast(int.class, ((int)0xffd7ccc8));
 BA.debugLineNum = 175;BA.debugLine="ColItemsImparesPredeterminado=0xFFEFEBE9";
Debug.JustUpdateDeviceLine();
parent._colitemsimparespredeterminado = BA.numberCast(int.class, ((int)0xffefebe9));
 BA.debugLineNum = 178;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(\"\",\"\",\"\",\"";
Debug.JustUpdateDeviceLine();
parent._datosorigendatos = _createtipoorigendatos(BA.ObjectToString(""),BA.ObjectToString(""),BA.ObjectToString(""),RemoteObject.createImmutable(""));
 BA.debugLineNum = 179;BA.debugLine="lstPrimaryKey.Initialize";
Debug.JustUpdateDeviceLine();
parent._lstprimarykey.runVoidMethod ("Initialize");
 BA.debugLineNum = 182;BA.debugLine="frm.Initialize(\"frm\",1024,768)";
Debug.JustUpdateDeviceLine();
parent._frm.runVoidMethod ("Initialize",jamrecordformbuilder.ba,(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, 1024)),(Object)(BA.numberCast(double.class, 768)));
 BA.debugLineNum = 183;BA.debugLine="frm.RootPane.LoadLayout(\"scrRecordFormBuilder\")";
Debug.JustUpdateDeviceLine();
parent._frm.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",jamrecordformbuilder.ba,(Object)(RemoteObject.createImmutable("scrRecordFormBuilder")));
 BA.debugLineNum = 184;BA.debugLine="Log(\"scrRecordFormBuilder cargado\")";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9128450577",RemoteObject.createImmutable("scrRecordFormBuilder cargado"),0);
 BA.debugLineNum = 185;BA.debugLine="clvListaCampos.DefaultTextColor = xui.Color_White";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.setField ("_defaulttextcolor",parent._xui.getField(true,"Color_White"));
 BA.debugLineNum = 186;BA.debugLine="Dialog.Initialize(frm.RootPane)";
Debug.JustUpdateDeviceLine();
parent._dialog.runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,jamrecordformbuilder.ba,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent._frm.runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 187;BA.debugLine="Dialog.Title = \"Record Form Builder\"";
Debug.JustUpdateDeviceLine();
parent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Record Form Builder")));
 BA.debugLineNum = 188;BA.debugLine="Dim n As Node = clvListaCampos.sv";
Debug.JustUpdateDeviceLine();
_n = RemoteObject.createNew ("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
_n = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), parent._clvlistacampos.getField(false,"_sv").getObject());Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 189;BA.debugLine="n.StyleClasses.Add(\"b4xdialog\")";
Debug.JustUpdateDeviceLine();
_n.runMethod(false,"getStyleClasses").runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("b4xdialog"))));
 BA.debugLineNum = 190;BA.debugLine="pnlOrigenSQL.Visible=False";
Debug.JustUpdateDeviceLine();
parent._pnlorigensql.runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 191;BA.debugLine="SetFormMaximized(frm)";
Debug.JustUpdateDeviceLine();
_setformmaximized(parent._frm);
 BA.debugLineNum = 192;BA.debugLine="frm.Show";
Debug.JustUpdateDeviceLine();
parent._frm.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 194;BA.debugLine="Dim JOClvDatosScrollpane As JavaObject=clvListaCa";
Debug.JustUpdateDeviceLine();
_joclvdatosscrollpane = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joclvdatosscrollpane = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), parent._clvlistacampos.getField(false,"_sv").getObject());Debug.locals.put("JOClvDatosScrollpane", _joclvdatosscrollpane);Debug.locals.put("JOClvDatosScrollpane", _joclvdatosscrollpane);
 BA.debugLineNum = 195;BA.debugLine="JOClvDatosScrollpane.RunMethod(\"setHbarPolicy\",Ar";
Debug.JustUpdateDeviceLine();
_joclvdatosscrollpane.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setHbarPolicy")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("ALWAYS"))})));
 BA.debugLineNum = 196;BA.debugLine="JOClvDatosScrollpane.RunMethod(\"setVbarPolicy\",Ar";
Debug.JustUpdateDeviceLine();
_joclvdatosscrollpane.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setVbarPolicy")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("ALWAYS"))})));
 BA.debugLineNum = 198;BA.debugLine="dragger.Initialize(clvListaCampos)";
Debug.JustUpdateDeviceLine();
parent._dragger.runClassMethod (b4j.docU.jamrecordformclvdragger.class, "_initialize" /*RemoteObject*/ ,jamrecordformbuilder.ba,(Object)(parent._clvlistacampos));
 BA.debugLineNum = 199;BA.debugLine="frm.Stylesheets.Add(File.GetUri(File.DirAssets, \"";
Debug.JustUpdateDeviceLine();
parent._frm.runMethod(false,"getStylesheets").runVoidMethod ("Add",(Object)((parent.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("styleRecordFormBuilder.css"))))));
 BA.debugLineNum = 200;BA.debugLine="AddKeyPressedListener";
Debug.JustUpdateDeviceLine();
_addkeypressedlistener();
 BA.debugLineNum = 201;BA.debugLine="FileChooser.Initialize";
Debug.JustUpdateDeviceLine();
parent._filechooser.runVoidMethod ("Initialize");
 BA.debugLineNum = 203;BA.debugLine="FileChooser.SetExtensionFilter(\"JSON\", Array(\"*.j";
Debug.JustUpdateDeviceLine();
parent._filechooser.runVoidMethod ("SetExtensionFilter",(Object)(BA.ObjectToString("JSON")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("*.json"))})))));
 BA.debugLineNum = 204;BA.debugLine="xui.SetDataFolder(\"RecordFormBuilder\")";
Debug.JustUpdateDeviceLine();
parent._xui.runVoidMethod ("SetDataFolder",(Object)(RemoteObject.createImmutable("RecordFormBuilder")));
 BA.debugLineNum = 205;BA.debugLine="RecentManager.Initialize(Me, \"Recent\", MenuBar1.M";
Debug.JustUpdateDeviceLine();
parent._recentmanager.runClassMethod (b4j.docU.recentfilesmanagerrecordformbuilder.class, "_initialize" /*RemoteObject*/ ,jamrecordformbuilder.ba,(Object)(jamrecordformbuilder.getObject()),(Object)(BA.ObjectToString("Recent")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper"), parent._menubar1.runMethod(false,"getMenus").runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 212;BA.debugLine="frm.Title = $\"Record Form Builder ($1.2{Version})";
Debug.JustUpdateDeviceLine();
parent._frm.runMethod(true,"setTitle",(RemoteObject.concat(RemoteObject.createImmutable("Record Form Builder ("),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((parent._version))),RemoteObject.createImmutable(")"))));
 BA.debugLineNum = 214;BA.debugLine="If mModo=\"Nuevo\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",parent._mmodo,BA.ObjectToString("Nuevo"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 215;BA.debugLine="wait for(NuevoDesdeFormRegistro) complete (rObj";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", jamrecordformbuilder.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformbuilder", "show"), _nuevodesdeformregistro());
this.state = 7;
return;
case 7:
//C
this.state = 6;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("rObj", _robj);
;
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 218;BA.debugLine="clvListaCampos.Clear";
Debug.JustUpdateDeviceLine();
parent._clvlistacampos.runVoidMethod ("_clear");
 BA.debugLineNum = 219;BA.debugLine="lstPrimaryKey.Clear";
Debug.JustUpdateDeviceLine();
parent._lstprimarykey.runVoidMethod ("Clear");
 BA.debugLineNum = 220;BA.debugLine="DatosOrigenDatos.Initialize";
Debug.JustUpdateDeviceLine();
parent._datosorigendatos.runVoidMethod ("Initialize");
 BA.debugLineNum = 221;BA.debugLine="CargarDatosDesdeFichero(\"../files/\" & NombreFich";
Debug.JustUpdateDeviceLine();
_cargardatosdesdefichero(RemoteObject.concat(RemoteObject.createImmutable("../files/"),_nombreficherojson));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 223;BA.debugLine="End Sub";
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
public static RemoteObject  _txttitulocampo_action() throws Exception{
try {
		Debug.PushSubsStack("txtTituloCampo_Action (jamrecordformbuilder) ","jamrecordformbuilder",67,jamrecordformbuilder.ba,jamrecordformbuilder.mostCurrent,1910);
if (RapidSub.canDelegate("txttitulocampo_action")) { return b4j.docU.jamrecordformbuilder.remoteMe.runUserSub(false, "jamrecordformbuilder","txttitulocampo_action");}
 BA.debugLineNum = 1910;BA.debugLine="Sub txtTituloCampo_Action";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1912;BA.debugLine="End Sub";
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