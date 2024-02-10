package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cnuevafasedocumento_subs_0 {


public static RemoteObject  _actualizardatosopcionseleccionada(RemoteObject __ref,RemoteObject _id,RemoteObject _textoopcionseleccionada) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosOpcionSeleccionada (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,579);
if (RapidSub.canDelegate("actualizardatosopcionseleccionada")) { return __ref.runUserSub(false, "cnuevafasedocumento","actualizardatosopcionseleccionada", __ref, _id, _textoopcionseleccionada);}
RemoteObject _responsablenuevafasevisible = RemoteObject.createImmutable(false);
RemoteObject _infoadicionalnuevafasevisible = RemoteObject.createImmutable(false);
RemoteObject _responsablefasedestinopreparacionvisible = RemoteObject.createImmutable(false);
RemoteObject _infoadicionaldestinopreparacionvisible = RemoteObject.createImmutable(false);
Debug.locals.put("ID", _id);
Debug.locals.put("TextoOpcionSeleccionada", _textoopcionseleccionada);
 BA.debugLineNum = 579;BA.debugLine="Sub ActualizarDatosOpcionSeleccionada(ID As Int, T";
Debug.ShouldStop(4);
 BA.debugLineNum = 580;BA.debugLine="Select True";
Debug.ShouldStop(8);
switch (BA.switchObjectToInt(cnuevafasedocumento.__c.getField(true,"True"),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_datosseleccionados" /*RemoteObject*/ ),BA.ObjectToString("NuevaFase"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_datosseleccionados" /*RemoteObject*/ ),BA.ObjectToString("ResponsableNuevaFase"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_datosseleccionados" /*RemoteObject*/ ),BA.ObjectToString("InfoAdicionalNuevaFase"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_datosseleccionados" /*RemoteObject*/ ),BA.ObjectToString("NuevaFaseAdicional"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_datosseleccionados" /*RemoteObject*/ ),BA.ObjectToString("ResponsableFaseAdicional"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_datosseleccionados" /*RemoteObject*/ ),BA.ObjectToString("InfoAdicionalFaseAdicional"))))) {
case 0: {
 BA.debugLineNum = 582;BA.debugLine="If ID>0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_id,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 583;BA.debugLine="ResetNuevaFase(False)";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_resetnuevafase" /*RemoteObject*/ ,(Object)(cnuevafasedocumento.__c.getField(true,"False")));
 BA.debugLineNum = 584;BA.debugLine="mNuevaFaseDocumento.IDFase=ID";
Debug.ShouldStop(128);
__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).setField ("IDFase" /*RemoteObject*/ ,_id);
 BA.debugLineNum = 585;BA.debugLine="txtNuevaFase.Text=TextoOpcionSeleccionada";
Debug.ShouldStop(256);
__ref.getField(false,"_txtnuevafase" /*RemoteObject*/ ).runMethod(true,"setText",_textoopcionseleccionada);
 BA.debugLineNum = 586;BA.debugLine="Dim ResponsableNuevaFaseVisible As Boolean";
Debug.ShouldStop(512);
_responsablenuevafasevisible = RemoteObject.createImmutable(false);Debug.locals.put("ResponsableNuevaFaseVisible", _responsablenuevafasevisible);
 BA.debugLineNum = 587;BA.debugLine="If mSQL.ExecQuerySingleResult2(\"select cboResp";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select cboResponsableVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?")),(Object)(cnuevafasedocumento.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.NumberToString(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFase" /*RemoteObject*/ )),__ref.getField(true,"_mtipodocumento" /*RemoteObject*/ )}))))),BA.NumberToString(0))) { 
 BA.debugLineNum = 588;BA.debugLine="ResponsableNuevaFaseVisible =False";
Debug.ShouldStop(2048);
_responsablenuevafasevisible = cnuevafasedocumento.__c.getField(true,"False");Debug.locals.put("ResponsableNuevaFaseVisible", _responsablenuevafasevisible);
 }else {
 BA.debugLineNum = 590;BA.debugLine="ResponsableNuevaFaseVisible=True";
Debug.ShouldStop(8192);
_responsablenuevafasevisible = cnuevafasedocumento.__c.getField(true,"True");Debug.locals.put("ResponsableNuevaFaseVisible", _responsablenuevafasevisible);
 };
 BA.debugLineNum = 592;BA.debugLine="lblTitleResponsableNuevaFase.Visible=Responsab";
Debug.ShouldStop(32768);
__ref.getField(false,"_lbltitleresponsablenuevafase" /*RemoteObject*/ ).runMethod(true,"setVisible",_responsablenuevafasevisible);
 BA.debugLineNum = 593;BA.debugLine="txtResponsableNuevaFase.Visible = ResponsableN";
Debug.ShouldStop(65536);
__ref.getField(false,"_txtresponsablenuevafase" /*RemoteObject*/ ).runMethod(true,"setVisible",_responsablenuevafasevisible);
 BA.debugLineNum = 594;BA.debugLine="btnSelResponsableNuevaFase.Visible = Responsab";
Debug.ShouldStop(131072);
__ref.getField(false,"_btnselresponsablenuevafase" /*RemoteObject*/ ).runMethod(true,"setVisible",_responsablenuevafasevisible);
 BA.debugLineNum = 596;BA.debugLine="If ResponsableNuevaFaseVisible Then";
Debug.ShouldStop(524288);
if (_responsablenuevafasevisible.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 597;BA.debugLine="lblTitleResponsableNuevaFase.Text=mSQL.ExecQu";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lbltitleresponsablenuevafase" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select TextoEtiquetaResponsable from tblFasesDoc where IDFase=?  and TipoOrigenDoc=?")),(Object)(cnuevafasedocumento.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.NumberToString(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFase" /*RemoteObject*/ )),__ref.getField(true,"_mtipodocumento" /*RemoteObject*/ )}))))));
 }else {
 BA.debugLineNum = 601;BA.debugLine="lblTitleResponsableNuevaFase.Text=\"\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lbltitleresponsablenuevafase" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 };
 BA.debugLineNum = 604;BA.debugLine="Dim InfoAdicionalNuevaFaseVisible As Boolea";
Debug.ShouldStop(134217728);
_infoadicionalnuevafasevisible = RemoteObject.createImmutable(false);Debug.locals.put("InfoAdicionalNuevaFaseVisible", _infoadicionalnuevafasevisible);
 BA.debugLineNum = 605;BA.debugLine="If mSQL.ExecQuerySingleResult2(\"select cboInfo";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select cboInfoAdicionalVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?")),(Object)(cnuevafasedocumento.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.NumberToString(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFase" /*RemoteObject*/ )),__ref.getField(true,"_mtipodocumento" /*RemoteObject*/ )})))))),BA.numberCast(double.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select txtInfoAdicionalVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?")),(Object)(cnuevafasedocumento.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.NumberToString(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFase" /*RemoteObject*/ )),__ref.getField(true,"_mtipodocumento" /*RemoteObject*/ )}))))))}, "+",1, 0),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 606;BA.debugLine="InfoAdicionalNuevaFaseVisible=False";
Debug.ShouldStop(536870912);
_infoadicionalnuevafasevisible = cnuevafasedocumento.__c.getField(true,"False");Debug.locals.put("InfoAdicionalNuevaFaseVisible", _infoadicionalnuevafasevisible);
 }else {
 BA.debugLineNum = 608;BA.debugLine="InfoAdicionalNuevaFaseVisible=True";
Debug.ShouldStop(-2147483648);
_infoadicionalnuevafasevisible = cnuevafasedocumento.__c.getField(true,"True");Debug.locals.put("InfoAdicionalNuevaFaseVisible", _infoadicionalnuevafasevisible);
 };
 BA.debugLineNum = 610;BA.debugLine="If InfoAdicionalNuevaFaseVisible=False Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_infoadicionalnuevafasevisible,cnuevafasedocumento.__c.getField(true,"False"))) { 
 BA.debugLineNum = 611;BA.debugLine="lblTitleInfoAdicionalDoc.Visible =False";
Debug.ShouldStop(4);
__ref.getField(false,"_lbltitleinfoadicionaldoc" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"False"));
 BA.debugLineNum = 612;BA.debugLine="txtInfoAdicionalDoc.Visible=False";
Debug.ShouldStop(8);
__ref.getField(false,"_txtinfoadicionaldoc" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"False"));
 BA.debugLineNum = 613;BA.debugLine="txtInfoAdicionalDoc.Text=\"\"";
Debug.ShouldStop(16);
__ref.getField(false,"_txtinfoadicionaldoc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 614;BA.debugLine="btnSelInfoAdicionalDoc.Visible=False";
Debug.ShouldStop(32);
__ref.getField(false,"_btnselinfoadicionaldoc" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 616;BA.debugLine="lblTitleInfoAdicionalDoc.text = mSQL.ExecQuer";
Debug.ShouldStop(128);
__ref.getField(false,"_lbltitleinfoadicionaldoc" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select TextoEtiquetaInfoAdicional from tblFasesDoc where IDFase=? and TipoOrigenDoc=?")),(Object)(cnuevafasedocumento.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.NumberToString(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFase" /*RemoteObject*/ )),__ref.getField(true,"_mtipodocumento" /*RemoteObject*/ )}))))));
 BA.debugLineNum = 617;BA.debugLine="lblTitleInfoAdicionalDoc.Visible =True";
Debug.ShouldStop(256);
__ref.getField(false,"_lbltitleinfoadicionaldoc" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"True"));
 BA.debugLineNum = 619;BA.debugLine="txtInfoAdicionalDoc.Visible=True";
Debug.ShouldStop(1024);
__ref.getField(false,"_txtinfoadicionaldoc" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"True"));
 BA.debugLineNum = 620;BA.debugLine="txtInfoAdicionalDoc.text=\"\"";
Debug.ShouldStop(2048);
__ref.getField(false,"_txtinfoadicionaldoc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 621;BA.debugLine="btnSelInfoAdicionalDoc.Visible=True";
Debug.ShouldStop(4096);
__ref.getField(false,"_btnselinfoadicionaldoc" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"True"));
 };
 BA.debugLineNum = 624;BA.debugLine="txtInfoAdicionalDoc.Text=\"\"";
Debug.ShouldStop(32768);
__ref.getField(false,"_txtinfoadicionaldoc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 }else {
 BA.debugLineNum = 633;BA.debugLine="ResetNuevaFase(False)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_resetnuevafase" /*RemoteObject*/ ,(Object)(cnuevafasedocumento.__c.getField(true,"False")));
 };
 break; }
case 1: {
 BA.debugLineNum = 640;BA.debugLine="mNuevaFaseDocumento.IDRespFase=ID";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).setField ("IDRespFase" /*RemoteObject*/ ,_id);
 BA.debugLineNum = 641;BA.debugLine="txtResponsableNuevaFase.Text=TextoOpcionSelecci";
Debug.ShouldStop(1);
__ref.getField(false,"_txtresponsablenuevafase" /*RemoteObject*/ ).runMethod(true,"setText",_textoopcionseleccionada);
 BA.debugLineNum = 642;BA.debugLine="If mNuevaFaseDocumento.IDFase=15 And mNuevaFase";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFase" /*RemoteObject*/ ),BA.numberCast(double.class, 15)) && RemoteObject.solveBoolean("!",__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDRespFase" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 643;BA.debugLine="pnlNuevaFaseComplementaria.Visible=True";
Debug.ShouldStop(4);
__ref.getField(false,"_pnlnuevafasecomplementaria" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 646;BA.debugLine="pnlNuevaFaseComplementaria.Visible=False";
Debug.ShouldStop(32);
__ref.getField(false,"_pnlnuevafasecomplementaria" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"False"));
 };
 break; }
case 2: {
 BA.debugLineNum = 653;BA.debugLine="mNuevaFaseDocumento.IDInfoAdicionalFase=ID";
Debug.ShouldStop(4096);
__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).setField ("IDInfoAdicionalFase" /*RemoteObject*/ ,_id);
 BA.debugLineNum = 654;BA.debugLine="txtInfoAdicionalDoc.Text=TextoOpcionSeleccionad";
Debug.ShouldStop(8192);
__ref.getField(false,"_txtinfoadicionaldoc" /*RemoteObject*/ ).runMethod(true,"setText",_textoopcionseleccionada);
 break; }
case 3: {
 BA.debugLineNum = 657;BA.debugLine="If ID>0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_id,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 658;BA.debugLine="ResetNuevaFaseAdicional";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_resetnuevafaseadicional" /*RemoteObject*/ );
 BA.debugLineNum = 662;BA.debugLine="mNuevaFaseDocumento.IDFaseDest=ID";
Debug.ShouldStop(2097152);
__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).setField ("IDFaseDest" /*RemoteObject*/ ,_id);
 BA.debugLineNum = 663;BA.debugLine="txtNuevaFaseDestinoPreparacion.Text=TextoOpcio";
Debug.ShouldStop(4194304);
__ref.getField(false,"_txtnuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setText",_textoopcionseleccionada);
 BA.debugLineNum = 664;BA.debugLine="Dim ResponsableFaseDestinoPreparacionVisible A";
Debug.ShouldStop(8388608);
_responsablefasedestinopreparacionvisible = RemoteObject.createImmutable(false);Debug.locals.put("ResponsableFaseDestinoPreparacionVisible", _responsablefasedestinopreparacionvisible);
 BA.debugLineNum = 665;BA.debugLine="If mSQL.ExecQuerySingleResult2(\"select cboResp";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select cboResponsableVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?")),(Object)(cnuevafasedocumento.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.NumberToString(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFaseDest" /*RemoteObject*/ )),__ref.getField(true,"_mtipodocumento" /*RemoteObject*/ )}))))),BA.NumberToString(0))) { 
 BA.debugLineNum = 666;BA.debugLine="ResponsableFaseDestinoPreparacionVisible =Fal";
Debug.ShouldStop(33554432);
_responsablefasedestinopreparacionvisible = cnuevafasedocumento.__c.getField(true,"False");Debug.locals.put("ResponsableFaseDestinoPreparacionVisible", _responsablefasedestinopreparacionvisible);
 }else {
 BA.debugLineNum = 668;BA.debugLine="ResponsableFaseDestinoPreparacionVisible =Tru";
Debug.ShouldStop(134217728);
_responsablefasedestinopreparacionvisible = cnuevafasedocumento.__c.getField(true,"True");Debug.locals.put("ResponsableFaseDestinoPreparacionVisible", _responsablefasedestinopreparacionvisible);
 };
 BA.debugLineNum = 670;BA.debugLine="lblTitleResponsableNuevaFaseDestinoPreparacion";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lbltitleresponsablenuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setVisible",_responsablefasedestinopreparacionvisible);
 BA.debugLineNum = 671;BA.debugLine="txtResponsableNuevaFaseDestinoPreparacion.Visi";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_txtresponsablenuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setVisible",_responsablefasedestinopreparacionvisible);
 BA.debugLineNum = 672;BA.debugLine="btnSelResponsableNuevaFaseDestinoPreparacion.V";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_btnselresponsablenuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setVisible",_responsablefasedestinopreparacionvisible);
 BA.debugLineNum = 674;BA.debugLine="If ResponsableFaseDestinoPreparacionVisible Th";
Debug.ShouldStop(2);
if (_responsablefasedestinopreparacionvisible.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 675;BA.debugLine="lblTitleResponsableNuevaFaseDestinoPreparacio";
Debug.ShouldStop(4);
__ref.getField(false,"_lbltitleresponsablenuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select TextoEtiquetaResponsable from tblFasesDoc where IDFase=? and TipoOrigenDoc=?")),(Object)(cnuevafasedocumento.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.NumberToString(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFaseDest" /*RemoteObject*/ )),__ref.getField(true,"_mtipodocumento" /*RemoteObject*/ )}))))));
 }else {
 };
 BA.debugLineNum = 682;BA.debugLine="Dim InfoAdicionalDestinoPreparacionVisible As";
Debug.ShouldStop(512);
_infoadicionaldestinopreparacionvisible = RemoteObject.createImmutable(false);Debug.locals.put("InfoAdicionalDestinoPreparacionVisible", _infoadicionaldestinopreparacionvisible);
 BA.debugLineNum = 683;BA.debugLine="If mSQL.ExecQuerySingleResult2(\"select cboInfo";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select cboInfoAdicionalVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?")),(Object)(cnuevafasedocumento.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.NumberToString(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFaseDest" /*RemoteObject*/ )),__ref.getField(true,"_mtipodocumento" /*RemoteObject*/ )})))))),BA.numberCast(double.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select txtInfoAdicionalVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?")),(Object)(cnuevafasedocumento.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.NumberToString(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFaseDest" /*RemoteObject*/ )),__ref.getField(true,"_mtipodocumento" /*RemoteObject*/ )}))))))}, "+",1, 0),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 684;BA.debugLine="InfoAdicionalDestinoPreparacionVisible=False";
Debug.ShouldStop(2048);
_infoadicionaldestinopreparacionvisible = cnuevafasedocumento.__c.getField(true,"False");Debug.locals.put("InfoAdicionalDestinoPreparacionVisible", _infoadicionaldestinopreparacionvisible);
 }else {
 BA.debugLineNum = 686;BA.debugLine="InfoAdicionalDestinoPreparacionVisible=True";
Debug.ShouldStop(8192);
_infoadicionaldestinopreparacionvisible = cnuevafasedocumento.__c.getField(true,"True");Debug.locals.put("InfoAdicionalDestinoPreparacionVisible", _infoadicionaldestinopreparacionvisible);
 };
 BA.debugLineNum = 688;BA.debugLine="If InfoAdicionalDestinoPreparacionVisible=Fals";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_infoadicionaldestinopreparacionvisible,cnuevafasedocumento.__c.getField(true,"False"))) { 
 BA.debugLineNum = 689;BA.debugLine="lblTitleInfoAdicionalNuevaFaseDestinoPreparac";
Debug.ShouldStop(65536);
__ref.getField(false,"_lbltitleinfoadicionalnuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"False"));
 BA.debugLineNum = 690;BA.debugLine="txtInfoAdicionalNuevaFaseDestinoPreparacion.V";
Debug.ShouldStop(131072);
__ref.getField(false,"_txtinfoadicionalnuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"False"));
 BA.debugLineNum = 691;BA.debugLine="btnSelInfoAdicionalDocNuevaFaseDestinoPrepara";
Debug.ShouldStop(262144);
__ref.getField(false,"_btnselinfoadicionaldocnuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 693;BA.debugLine="lblTitleInfoAdicionalNuevaFaseDestinoPreparac";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lbltitleinfoadicionalnuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select TextoEtiquetaInfoAdicional from tblFasesDoc where IDFase=? and TipoOrigenDoc=?")),(Object)(cnuevafasedocumento.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.NumberToString(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFaseDest" /*RemoteObject*/ )),__ref.getField(true,"_mtipodocumento" /*RemoteObject*/ )}))))));
 BA.debugLineNum = 694;BA.debugLine="lblTitleInfoAdicionalNuevaFaseDestinoPreparac";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lbltitleinfoadicionalnuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"True"));
 BA.debugLineNum = 696;BA.debugLine="txtInfoAdicionalNuevaFaseDestinoPreparacion.V";
Debug.ShouldStop(8388608);
__ref.getField(false,"_txtinfoadicionalnuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"True"));
 BA.debugLineNum = 697;BA.debugLine="btnSelInfoAdicionalDocNuevaFaseDestinoPrepara";
Debug.ShouldStop(16777216);
__ref.getField(false,"_btnselinfoadicionaldocnuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"True"));
 };
 BA.debugLineNum = 702;BA.debugLine="txtInfoAdicionalNuevaFaseDestinoPreparacion.Te";
Debug.ShouldStop(536870912);
__ref.getField(false,"_txtinfoadicionalnuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 }else {
 BA.debugLineNum = 711;BA.debugLine="ResetNuevaFaseAdicional";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_resetnuevafaseadicional" /*RemoteObject*/ );
 };
 break; }
case 4: {
 BA.debugLineNum = 718;BA.debugLine="mNuevaFaseDocumento.IDRespFaseDest=ID";
Debug.ShouldStop(8192);
__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).setField ("IDRespFaseDest" /*RemoteObject*/ ,_id);
 BA.debugLineNum = 719;BA.debugLine="txtResponsableNuevaFaseDestinoPreparacion.Text=";
Debug.ShouldStop(16384);
__ref.getField(false,"_txtresponsablenuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setText",_textoopcionseleccionada);
 break; }
case 5: {
 BA.debugLineNum = 725;BA.debugLine="mNuevaFaseDocumento.IDInfoAdicionalFaseDest=ID";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).setField ("IDInfoAdicionalFaseDest" /*RemoteObject*/ ,_id);
 BA.debugLineNum = 726;BA.debugLine="txtInfoAdicionalNuevaFaseDestinoPreparacion.Tex";
Debug.ShouldStop(2097152);
__ref.getField(false,"_txtinfoadicionalnuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setText",_textoopcionseleccionada);
 break; }
}
;
 BA.debugLineNum = 730;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _actualizarfases(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarFases (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,252);
if (RapidSub.canDelegate("actualizarfases")) { return __ref.runUserSub(false, "cnuevafasedocumento","actualizarfases", __ref);}
ResumableSub_ActualizarFases rsub = new ResumableSub_ActualizarFases(null,__ref);
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
public static class ResumableSub_ActualizarFases extends BA.ResumableSub {
public ResumableSub_ActualizarFases(b4j.docU.cnuevafasedocumento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cnuevafasedocumento parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarFases (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,252);
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
 BA.debugLineNum = 254;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from tblFasesDoc\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DELETE from tblFasesDoc")));
 BA.debugLineNum = 255;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(1073741824);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 258;BA.debugLine="Dim Comando As String=\"FasesDocumentos\"";
Debug.ShouldStop(2);
_comando = BA.ObjectToString("FasesDocumentos");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 259;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(4);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 261;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "actualizarfases"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 263;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 264;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(128);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 265;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "actualizarfases"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 266;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(512);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 270;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 271;BA.debugLine="Accion=\"Sin Datos\"";
Debug.ShouldStop(16384);
_accion = BA.ObjectToString("Sin Datos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 273;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(65536);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos de Fases de Documentos")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 274;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "actualizarfases"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 276;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(524288);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 277;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(1048576);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 278;BA.debugLine="DBUtils.InsertMaps(mSQL,\"tblFasesDoc\",lstReg)";
Debug.ShouldStop(2097152);
parent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblFasesDoc")),(Object)(_lstreg));
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
 BA.debugLineNum = 281;BA.debugLine="Return Accion";
Debug.ShouldStop(16777216);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 BA.debugLineNum = 282;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _actualizartipificacioninfoadicionalfases(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarTipificacionInfoAdicionalFases (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1481);
if (RapidSub.canDelegate("actualizartipificacioninfoadicionalfases")) { return __ref.runUserSub(false, "cnuevafasedocumento","actualizartipificacioninfoadicionalfases", __ref);}
ResumableSub_ActualizarTipificacionInfoAdicionalFases rsub = new ResumableSub_ActualizarTipificacionInfoAdicionalFases(null,__ref);
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
public static class ResumableSub_ActualizarTipificacionInfoAdicionalFases extends BA.ResumableSub {
public ResumableSub_ActualizarTipificacionInfoAdicionalFases(b4j.docU.cnuevafasedocumento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cnuevafasedocumento parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarTipificacionInfoAdicionalFases (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1481);
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
 BA.debugLineNum = 1483;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from tblTipificacionInf";
Debug.ShouldStop(1024);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DELETE from tblTipificacionInfoAdicionalFases")));
 BA.debugLineNum = 1484;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(2048);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1487;BA.debugLine="Dim Comando As String=\"TipificacionInfoAdicionalF";
Debug.ShouldStop(16384);
_comando = BA.ObjectToString("TipificacionInfoAdicionalFases");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 1488;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(32768);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 1490;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "actualizartipificacioninfoadicionalfases"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1492;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 1493;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(1048576);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1494;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "actualizartipificacioninfoadicionalfases"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 1495;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(4194304);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1497;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 1498;BA.debugLine="Accion=\"Sin Datos\"";
Debug.ShouldStop(33554432);
_accion = BA.ObjectToString("Sin Datos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1499;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(67108864);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos de Tipificacion Info Adicional Fases")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1500;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "actualizartipificacioninfoadicionalfases"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1502;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(536870912);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1503;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(1073741824);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1504;BA.debugLine="DBUtils.InsertMaps(mSQL,\"tblTipificacionInfoAdi";
Debug.ShouldStop(-2147483648);
parent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblTipificacionInfoAdicionalFases")),(Object)(_lstreg));
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
 BA.debugLineNum = 1507;BA.debugLine="Return Accion";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 BA.debugLineNum = 1508;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
public static RemoteObject  _actualizartransportes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarTransportes (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1443);
if (RapidSub.canDelegate("actualizartransportes")) { return __ref.runUserSub(false, "cnuevafasedocumento","actualizartransportes", __ref);}
ResumableSub_ActualizarTransportes rsub = new ResumableSub_ActualizarTransportes(null,__ref);
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
public static class ResumableSub_ActualizarTransportes extends BA.ResumableSub {
public ResumableSub_ActualizarTransportes(b4j.docU.cnuevafasedocumento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cnuevafasedocumento parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarTransportes (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1443);
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
 BA.debugLineNum = 1445;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from tblTransporte\")";
Debug.ShouldStop(16);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DELETE from tblTransporte")));
 BA.debugLineNum = 1446;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(32);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1449;BA.debugLine="Dim Comando As String=\"Transportes\"";
Debug.ShouldStop(256);
_comando = BA.ObjectToString("Transportes");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 1450;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(512);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 1452;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "actualizartransportes"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1454;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 1455;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(16384);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1456;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "actualizartransportes"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 1457;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(65536);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1459;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 1460;BA.debugLine="Accion=\"Sin Datos\"";
Debug.ShouldStop(524288);
_accion = BA.ObjectToString("Sin Datos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1461;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(1048576);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos de transportes")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1462;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "actualizartransportes"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1464;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(8388608);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1465;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(16777216);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1466;BA.debugLine="DBUtils.InsertMaps(mSQL,\"tblTransporte\",lstReg)";
Debug.ShouldStop(33554432);
parent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblTransporte")),(Object)(_lstreg));
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
 BA.debugLineNum = 1469;BA.debugLine="Return Accion";
Debug.ShouldStop(268435456);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 BA.debugLineNum = 1470;BA.debugLine="End Sub";
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
public static RemoteObject  _actualizarvwempleadosactivos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Actualizarvwempleadosactivos (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1519);
if (RapidSub.canDelegate("actualizarvwempleadosactivos")) { return __ref.runUserSub(false, "cnuevafasedocumento","actualizarvwempleadosactivos", __ref);}
ResumableSub_Actualizarvwempleadosactivos rsub = new ResumableSub_Actualizarvwempleadosactivos(null,__ref);
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
public static class ResumableSub_Actualizarvwempleadosactivos extends BA.ResumableSub {
public ResumableSub_Actualizarvwempleadosactivos(b4j.docU.cnuevafasedocumento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cnuevafasedocumento parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Actualizarvwempleadosactivos (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1519);
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
 BA.debugLineNum = 1521;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from vwempleadosactivos";
Debug.ShouldStop(65536);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DELETE from vwempleadosactivos")));
 BA.debugLineNum = 1522;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(131072);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1525;BA.debugLine="Dim Comando As String=\"vwempleadosactivos\"";
Debug.ShouldStop(1048576);
_comando = BA.ObjectToString("vwempleadosactivos");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 1526;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(2097152);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 1528;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "actualizarvwempleadosactivos"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1530;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 1531;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(67108864);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1532;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "actualizarvwempleadosactivos"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 1533;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(268435456);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1535;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 1536;BA.debugLine="Accion=\"Sin Datos\"";
Debug.ShouldStop(-2147483648);
_accion = BA.ObjectToString("Sin Datos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1537;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(1);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos de empleados activos")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1538;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "actualizarvwempleadosactivos"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1540;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(8);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1541;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(16);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1542;BA.debugLine="DBUtils.InsertMaps(mSQL,\"vwempleadosactivos\",ls";
Debug.ShouldStop(32);
parent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("vwempleadosactivos")),(Object)(_lstreg));
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
 BA.debugLineNum = 1545;BA.debugLine="Return Accion";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 BA.debugLineNum = 1546;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
public static RemoteObject  _background_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("Background_MouseClicked (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("background_mouseclicked")) { return __ref.runUserSub(false, "cnuevafasedocumento","background_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 87;BA.debugLine="Private Sub Background_MouseClicked (EventData As";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="EventData.Consume";
Debug.ShouldStop(8388608);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btncancelargrabarnuevafase_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnCancelarGrabarNuevaFase_Click (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1386);
if (RapidSub.canDelegate("btncancelargrabarnuevafase_click")) { __ref.runUserSub(false, "cnuevafasedocumento","btncancelargrabarnuevafase_click", __ref); return;}
ResumableSub_btnCancelarGrabarNuevaFase_Click rsub = new ResumableSub_btnCancelarGrabarNuevaFase_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnCancelarGrabarNuevaFase_Click extends BA.ResumableSub {
public ResumableSub_btnCancelarGrabarNuevaFase_Click(b4j.docU.cnuevafasedocumento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cnuevafasedocumento parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnCancelarGrabarNuevaFase_Click (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1386);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1387;BA.debugLine="If txtFechaNuevaFase.Text=\"\" Then";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtfechanuevafase" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1389;BA.debugLine="SalirModulo";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 1390;BA.debugLine="Return";
Debug.ShouldStop(8192);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1393;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Salir sin";
Debug.ShouldStop(65536);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Salir sin grabar la nueva fase?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1394;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "btncancelargrabarnuevafase_click"), _msa);
this.state = 9;
return;
case 9:
//C
this.state = 5;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1395;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(262144);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 1396;BA.debugLine="SalirModulo";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 1397;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 1400;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
public static void  _btngrabarnuevafase_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnGrabarNuevaFase_Click (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1058);
if (RapidSub.canDelegate("btngrabarnuevafase_click")) { __ref.runUserSub(false, "cnuevafasedocumento","btngrabarnuevafase_click", __ref); return;}
ResumableSub_btnGrabarNuevaFase_Click rsub = new ResumableSub_btnGrabarNuevaFase_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnGrabarNuevaFase_Click extends BA.ResumableSub {
public ResumableSub_btnGrabarNuevaFase_Click(b4j.docU.cnuevafasedocumento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cnuevafasedocumento parent;
RemoteObject _rbool = RemoteObject.createImmutable(false);
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _fn = RemoteObject.createImmutable("");
RemoteObject _sresp = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnGrabarNuevaFase_Click (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1058);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1059;BA.debugLine="btnGrabarNuevaFase.Enabled=False";
Debug.ShouldStop(4);
__ref.getField(false,"_btngrabarnuevafase" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1060;BA.debugLine="Wait For(checkNuevosDatosOk) complete (rBool As B";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "btngrabarnuevafase_click"), __ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_checknuevosdatosok" /*RemoteObject*/ ));
this.state = 61;
return;
case 61:
//C
this.state = 1;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 1061;BA.debugLine="If rBool Then";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 60;
if (_rbool.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 59;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1062;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(32);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 1063;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
Debug.ShouldStop(64);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 1064;BA.debugLine="Dim Fn As String=DateUtils.TicksToString(mNuevaF";
Debug.ShouldStop(128);
_fn = parent._dateutils.runMethod(true,"_tickstostring",(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"FechaFase" /*RemoteObject*/ )));Debug.locals.put("Fn", _fn);Debug.locals.put("Fn", _fn);
 BA.debugLineNum = 1065;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(256);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 1067;BA.debugLine="If mNuevaFaseDocumento.IDFase = 15 Then";
Debug.ShouldStop(1024);
if (true) break;

case 4:
//if
this.state = 57;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFase" /*RemoteObject*/ ),BA.numberCast(double.class, 15))) { 
this.state = 6;
}else {
this.state = 42;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1073;BA.debugLine="If mNuevaFaseDocumento.IDInfoAdicionalFase<>0 T";
Debug.ShouldStop(65536);
if (true) break;

case 7:
//if
this.state = 40;
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDInfoAdicionalFase" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 9;
}else {
this.state = 25;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1075;BA.debugLine="If mDestinatarioTaller Then";
Debug.ShouldStop(262144);
if (true) break;

case 10:
//if
this.state = 23;
if (__ref.getField(true,"_mdestinatariotaller" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 12;
}else {
this.state = 18;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1076;BA.debugLine="wait for(RegistroPreparacionRTFab(mNuevaFaseD";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "btngrabarnuevafase_click"), __ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_registropreparacionrtfab" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFase" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDRespFase" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_txtresponsablenuevafase" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFaseDest" /*RemoteObject*/ )),(Object)(_fn),(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDRespFaseDest" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_txtresponsablenuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDInfoAdicionalFase" /*RemoteObject*/ )),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(true,"_mordenfab" /*RemoteObject*/ ))));
this.state = 62;
return;
case 62:
//C
this.state = 13;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 1078;BA.debugLine="If sResp=\"OK\" Then";
Debug.ShouldStop(2097152);
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_sresp,BA.ObjectToString("OK"))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1079;BA.debugLine="NuevaFaseDocumentoRegistrada=True";
Debug.ShouldStop(4194304);
__ref.setField ("_nuevafasedocumentoregistrada" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1080;BA.debugLine="SalirModulo";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 1081;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return ;
 if (true) break;

case 16:
//C
this.state = 23;
;
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 1084;BA.debugLine="wait for(RegistroPreparacion(mNuevaFaseDocume";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "btngrabarnuevafase_click"), __ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_registropreparacion" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFase" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDRespFase" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_txtresponsablenuevafase" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFaseDest" /*RemoteObject*/ )),(Object)(_fn),(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDRespFaseDest" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_txtresponsablenuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDInfoAdicionalFase" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable(""))));
this.state = 63;
return;
case 63:
//C
this.state = 19;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 1086;BA.debugLine="If sResp=\"OK\" Then";
Debug.ShouldStop(536870912);
if (true) break;

case 19:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",_sresp,BA.ObjectToString("OK"))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 1087;BA.debugLine="NuevaFaseDocumentoRegistrada=True";
Debug.ShouldStop(1073741824);
__ref.setField ("_nuevafasedocumentoregistrada" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1088;BA.debugLine="SalirModulo";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 1089;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return ;
 if (true) break;

case 22:
//C
this.state = 23;
;
 if (true) break;

case 23:
//C
this.state = 40;
;
 BA.debugLineNum = 1092;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return ;
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 1094;BA.debugLine="If mDestinatarioTaller Then";
Debug.ShouldStop(32);
if (true) break;

case 26:
//if
this.state = 39;
if (__ref.getField(true,"_mdestinatariotaller" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 28;
}else {
this.state = 34;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 1095;BA.debugLine="wait for(RegistroPreparacionRTFab(mNuevaFaseD";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "btngrabarnuevafase_click"), __ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_registropreparacionrtfab" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFase" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDRespFase" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_txtresponsablenuevafase" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFaseDest" /*RemoteObject*/ )),(Object)(_fn),(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDRespFaseDest" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_txtresponsablenuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"NumExpFaseAdicional" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mordenfab" /*RemoteObject*/ ))));
this.state = 64;
return;
case 64:
//C
this.state = 29;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 1097;BA.debugLine="If sResp=\"OK\" Then";
Debug.ShouldStop(256);
if (true) break;

case 29:
//if
this.state = 32;
if (RemoteObject.solveBoolean("=",_sresp,BA.ObjectToString("OK"))) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 1098;BA.debugLine="NuevaFaseDocumentoRegistrada=True";
Debug.ShouldStop(512);
__ref.setField ("_nuevafasedocumentoregistrada" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1099;BA.debugLine="SalirModulo";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 1100;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return ;
 if (true) break;

case 32:
//C
this.state = 39;
;
 if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 1104;BA.debugLine="wait for(RegistroPreparacion(mNuevaFaseDocume";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "btngrabarnuevafase_click"), __ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_registropreparacion" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFase" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDRespFase" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_txtresponsablenuevafase" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFaseDest" /*RemoteObject*/ )),(Object)(_fn),(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDRespFaseDest" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_txtresponsablenuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"NumExpFaseAdicional" /*RemoteObject*/ ))));
this.state = 65;
return;
case 65:
//C
this.state = 35;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 1106;BA.debugLine="If sResp=\"OK\" Then";
Debug.ShouldStop(131072);
if (true) break;

case 35:
//if
this.state = 38;
if (RemoteObject.solveBoolean("=",_sresp,BA.ObjectToString("OK"))) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 1107;BA.debugLine="NuevaFaseDocumentoRegistrada=True";
Debug.ShouldStop(262144);
__ref.setField ("_nuevafasedocumentoregistrada" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1108;BA.debugLine="SalirModulo";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 1109;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) return ;
 if (true) break;

case 38:
//C
this.state = 39;
;
 if (true) break;

case 39:
//C
this.state = 40;
;
 BA.debugLineNum = 1112;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return ;
 if (true) break;

case 40:
//C
this.state = 57;
;
 if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 1127;BA.debugLine="If mNuevaFaseDocumento.IDInfoAdicionalFase>0 Th";
Debug.ShouldStop(64);
if (true) break;

case 43:
//if
this.state = 56;
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDInfoAdicionalFase" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 45;
}else {
this.state = 51;
}if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 1129;BA.debugLine="wait for(RegistroNuevaFase(mNuevaFaseDocumento";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "btngrabarnuevafase_click"), __ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_registronuevafase" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFase" /*RemoteObject*/ )),(Object)(_fn),(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDRespFase" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_txtresponsablenuevafase" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDInfoAdicionalFase" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable(""))));
this.state = 66;
return;
case 66:
//C
this.state = 46;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 1130;BA.debugLine="If sResp=\"OK\" Then";
Debug.ShouldStop(512);
if (true) break;

case 46:
//if
this.state = 49;
if (RemoteObject.solveBoolean("=",_sresp,BA.ObjectToString("OK"))) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 1131;BA.debugLine="NuevaFaseDocumentoRegistrada=True";
Debug.ShouldStop(1024);
__ref.setField ("_nuevafasedocumentoregistrada" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1132;BA.debugLine="SalirModulo";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 1133;BA.debugLine="Return";
Debug.ShouldStop(4096);
if (true) return ;
 if (true) break;

case 49:
//C
this.state = 56;
;
 BA.debugLineNum = 1135;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return ;
 if (true) break;

case 51:
//C
this.state = 52;
 BA.debugLineNum = 1137;BA.debugLine="wait for(RegistroNuevaFase(mNuevaFaseDocumento";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "btngrabarnuevafase_click"), __ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_registronuevafase" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFase" /*RemoteObject*/ )),(Object)(_fn),(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDRespFase" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_txtresponsablenuevafase" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"NumExpFaseActual" /*RemoteObject*/ ))));
this.state = 67;
return;
case 67:
//C
this.state = 52;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 1138;BA.debugLine="If sResp=\"OK\" Then";
Debug.ShouldStop(131072);
if (true) break;

case 52:
//if
this.state = 55;
if (RemoteObject.solveBoolean("=",_sresp,BA.ObjectToString("OK"))) { 
this.state = 54;
}if (true) break;

case 54:
//C
this.state = 55;
 BA.debugLineNum = 1139;BA.debugLine="NuevaFaseDocumentoRegistrada=True";
Debug.ShouldStop(262144);
__ref.setField ("_nuevafasedocumentoregistrada" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1140;BA.debugLine="SalirModulo";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 1141;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) return ;
 if (true) break;

case 55:
//C
this.state = 56;
;
 BA.debugLineNum = 1143;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return ;
 if (true) break;

case 56:
//C
this.state = 57;
;
 if (true) break;

case 57:
//C
this.state = 60;
;
 if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 1157;BA.debugLine="btnGrabarNuevaFase.Enabled=True";
Debug.ShouldStop(16);
__ref.getField(false,"_btngrabarnuevafase" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 if (true) break;

case 60:
//C
this.state = -1;
;
 BA.debugLineNum = 1159;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
public static void  _complete(RemoteObject __ref,RemoteObject _rbool) throws Exception{
}
public static RemoteObject  _btnsalir_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSalir_Click (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "cnuevafasedocumento","btnsalir_click", __ref);}
 BA.debugLineNum = 96;BA.debugLine="Private Sub btnSalir_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="SalirModulo";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnseldocumento_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelDocumento_Click (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1051);
if (RapidSub.canDelegate("btnseldocumento_click")) { return __ref.runUserSub(false, "cnuevafasedocumento","btnseldocumento_click", __ref);}
 BA.debugLineNum = 1051;BA.debugLine="Private Sub btnSelDocumento_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1056;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnselfechanuevafase_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelFechaNuevaFase_Click (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1009);
if (RapidSub.canDelegate("btnselfechanuevafase_click")) { return __ref.runUserSub(false, "cnuevafasedocumento","btnselfechanuevafase_click", __ref);}
 BA.debugLineNum = 1009;BA.debugLine="Private Sub btnSelFechaNuevaFase_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1010;BA.debugLine="SeleccionarFechaNuevaFase";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_seleccionarfechanuevafase" /*void*/ );
 BA.debugLineNum = 1011;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnselinfoadicionaldoc_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelInfoAdicionalDoc_Click (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,958);
if (RapidSub.canDelegate("btnselinfoadicionaldoc_click")) { __ref.runUserSub(false, "cnuevafasedocumento","btnselinfoadicionaldoc_click", __ref); return;}
ResumableSub_btnSelInfoAdicionalDoc_Click rsub = new ResumableSub_btnSelInfoAdicionalDoc_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSelInfoAdicionalDoc_Click extends BA.ResumableSub {
public ResumableSub_btnSelInfoAdicionalDoc_Click(b4j.docU.cnuevafasedocumento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cnuevafasedocumento parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _srowsource = RemoteObject.createImmutable("");
RemoteObject _inputdlg = RemoteObject.declareNull("b4j.docU.b4xinputtemplate");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _sinfoadicionaldoc = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSelInfoAdicionalDoc_Click (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,958);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 959;BA.debugLine="If txtNuevaFase.Text=\"\" Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtnuevafase" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 960;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Selecciona an";
Debug.ShouldStop(-2147483648);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Selecciona antes la fase.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 961;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "btnselinfoadicionaldoc_click"), _msa);
this.state = 16;
return;
case 16:
//C
this.state = 4;
;
 BA.debugLineNum = 962;BA.debugLine="SeleccionarNuevaFase";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_seleccionarnuevafase" /*void*/ );
 BA.debugLineNum = 963;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 967;BA.debugLine="Select True";
Debug.ShouldStop(64);

case 4:
//select
this.state = 15;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),BA.ObjectToBoolean(RemoteObject.solveBoolean("!",__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select cboInfoAdicionalVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.NumberToString(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFase" /*RemoteObject*/ )),__ref.getField(true,"_mtipodocumento" /*RemoteObject*/ )}))))),BA.NumberToString(0))),BA.ObjectToBoolean(RemoteObject.solveBoolean("!",__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select txtInfoAdicionalVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.NumberToString(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFase" /*RemoteObject*/ )),__ref.getField(true,"_mtipodocumento" /*RemoteObject*/ )}))))),BA.NumberToString(0))))) {
case 0: {
this.state = 6;
if (true) break;
}
case 1: {
this.state = 8;
if (true) break;
}
}
if (true) break;

case 6:
//C
this.state = 15;
 BA.debugLineNum = 969;BA.debugLine="Dim sRowSource As String";
Debug.ShouldStop(256);
_srowsource = RemoteObject.createImmutable("");Debug.locals.put("sRowSource", _srowsource);
 BA.debugLineNum = 970;BA.debugLine="sRowSource=mSQL.ExecQuerySingleResult2(\"select";
Debug.ShouldStop(512);
_srowsource = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select OrigenFilacboInfoAdicional from tblFasesDoc where IDFase=? and TipoOrigenDoc=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.NumberToString(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFase" /*RemoteObject*/ )),__ref.getField(true,"_mtipodocumento" /*RemoteObject*/ )})))));Debug.locals.put("sRowSource", _srowsource);
 BA.debugLineNum = 971;BA.debugLine="sRowSource=sRowSource.Replace(\"=true\",\"<>0\")";
Debug.ShouldStop(1024);
_srowsource = _srowsource.runMethod(true,"replace",(Object)(BA.ObjectToString("=true")),(Object)(RemoteObject.createImmutable("<>0")));Debug.locals.put("sRowSource", _srowsource);
 BA.debugLineNum = 972;BA.debugLine="DatosSeleccionados=\"InfoAdicionalNuevaFase\"";
Debug.ShouldStop(2048);
__ref.setField ("_datosseleccionados" /*RemoteObject*/ ,BA.ObjectToString("InfoAdicionalNuevaFase"));
 BA.debugLineNum = 973;BA.debugLine="PreLoadDatosCls(1,sRowSource,mNuevaFaseDocument";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_preloaddatoscls" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(_srowsource),(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFase" /*RemoteObject*/ )));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 977;BA.debugLine="Dialog.Title=\"Selecciona \" & lblTitleInfoAdicio";
Debug.ShouldStop(65536);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("Selecciona "),__ref.getField(false,"_lbltitleinfoadicionaldoc" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 978;BA.debugLine="Dialog.TitleBarHeight=50dip";
Debug.ShouldStop(131072);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 980;BA.debugLine="Dim InputDlg As B4XInputTemplate";
Debug.ShouldStop(524288);
_inputdlg = RemoteObject.createNew ("b4j.docU.b4xinputtemplate");Debug.locals.put("InputDlg", _inputdlg);
 BA.debugLineNum = 981;BA.debugLine="InputDlg.Initialize";
Debug.ShouldStop(1048576);
_inputdlg.runClassMethod (b4j.docU.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 982;BA.debugLine="InputDlg.lblTitle.Text=\"\"";
Debug.ShouldStop(2097152);
_inputdlg.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 983;BA.debugLine="InputDlg.Text=\"\"";
Debug.ShouldStop(4194304);
_inputdlg.setField ("_text" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 986;BA.debugLine="InputDlg.mBase.Width=750dip";
Debug.ShouldStop(33554432);
_inputdlg.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 750)))));
 BA.debugLineNum = 987;BA.debugLine="Utilidades.SetLightThemeInput(InputDlg)";
Debug.ShouldStop(67108864);
parent._utilidades.runVoidMethod ("_setlightthemeinput" /*RemoteObject*/ ,(Object)(_inputdlg));
 BA.debugLineNum = 988;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(In";
Debug.ShouldStop(134217728);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_inputdlg)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 989;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogR";
Debug.ShouldStop(268435456);
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOK", _bok);Debug.locals.put("bOK", _bok);
 BA.debugLineNum = 990;BA.debugLine="bOK.TextSize=15";
Debug.ShouldStop(536870912);
_bok.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 991;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dia";
Debug.ShouldStop(1073741824);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 992;BA.debugLine="bCancel.TextSize=15";
Debug.ShouldStop(-2147483648);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 993;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
Debug.ShouldStop(1);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 994;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.ShouldStop(2);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 995;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "btnselinfoadicionaldoc_click"), _rsub);
this.state = 17;
return;
case 17:
//C
this.state = 9;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 997;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
Debug.ShouldStop(16);
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
this.state = 15;
;
 BA.debugLineNum = 1001;BA.debugLine="Dim sInfoAdicionalDoc As String=InputDlg.Text";
Debug.ShouldStop(256);
_sinfoadicionaldoc = _inputdlg.getField(true,"_text" /*RemoteObject*/ );Debug.locals.put("sInfoAdicionalDoc", _sinfoadicionaldoc);Debug.locals.put("sInfoAdicionalDoc", _sinfoadicionaldoc);
 BA.debugLineNum = 1003;BA.debugLine="txtInfoAdicionalDoc.Text=sInfoAdicionalDoc";
Debug.ShouldStop(1024);
__ref.getField(false,"_txtinfoadicionaldoc" /*RemoteObject*/ ).runMethod(true,"setText",_sinfoadicionaldoc);
 BA.debugLineNum = 1004;BA.debugLine="mNuevaFaseDocumento.NumExpFaseActual=sInfoAdici";
Debug.ShouldStop(2048);
__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).setField ("NumExpFaseActual" /*RemoteObject*/ ,_sinfoadicionaldoc);
 if (true) break;

case 15:
//C
this.state = -1;
;
 BA.debugLineNum = 1007;BA.debugLine="End Sub";
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
public static void  _btnselinfoadicionaldocnuevafasedestinopreparacion_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelInfoAdicionalDocNuevaFaseDestinoPreparacion_Click (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,906);
if (RapidSub.canDelegate("btnselinfoadicionaldocnuevafasedestinopreparacion_click")) { __ref.runUserSub(false, "cnuevafasedocumento","btnselinfoadicionaldocnuevafasedestinopreparacion_click", __ref); return;}
ResumableSub_btnSelInfoAdicionalDocNuevaFaseDestinoPreparacion_Click rsub = new ResumableSub_btnSelInfoAdicionalDocNuevaFaseDestinoPreparacion_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSelInfoAdicionalDocNuevaFaseDestinoPreparacion_Click extends BA.ResumableSub {
public ResumableSub_btnSelInfoAdicionalDocNuevaFaseDestinoPreparacion_Click(b4j.docU.cnuevafasedocumento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cnuevafasedocumento parent;
RemoteObject _srowsource = RemoteObject.createImmutable("");
RemoteObject _inputdlg = RemoteObject.declareNull("b4j.docU.b4xinputtemplate");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _sinfoadicionaldocdestinopreparacion = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSelInfoAdicionalDocNuevaFaseDestinoPreparacion_Click (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,906);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 907;BA.debugLine="Select True";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//select
this.state = 12;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),BA.ObjectToBoolean(RemoteObject.solveBoolean("!",__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select cboInfoAdicionalVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.NumberToString(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFaseDest" /*RemoteObject*/ )),__ref.getField(true,"_mtipodocumento" /*RemoteObject*/ )}))))),BA.NumberToString(0))),BA.ObjectToBoolean(RemoteObject.solveBoolean("!",__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select txtInfoAdicionalVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.NumberToString(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFaseDest" /*RemoteObject*/ )),__ref.getField(true,"_mtipodocumento" /*RemoteObject*/ )}))))),BA.NumberToString(0))))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 12;
 BA.debugLineNum = 909;BA.debugLine="Dim sRowSource As String";
Debug.ShouldStop(4096);
_srowsource = RemoteObject.createImmutable("");Debug.locals.put("sRowSource", _srowsource);
 BA.debugLineNum = 910;BA.debugLine="sRowSource=mSQL.ExecQuerySingleResult2(\"select";
Debug.ShouldStop(8192);
_srowsource = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select OrigenFilacboInfoAdicional from tblFasesDoc where IDFase=? and TipoOrigenDoc=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.NumberToString(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFaseDest" /*RemoteObject*/ )),__ref.getField(true,"_mtipodocumento" /*RemoteObject*/ )})))));Debug.locals.put("sRowSource", _srowsource);
 BA.debugLineNum = 911;BA.debugLine="sRowSource=sRowSource.Replace(\"=true\",\"<>0\")";
Debug.ShouldStop(16384);
_srowsource = _srowsource.runMethod(true,"replace",(Object)(BA.ObjectToString("=true")),(Object)(RemoteObject.createImmutable("<>0")));Debug.locals.put("sRowSource", _srowsource);
 BA.debugLineNum = 912;BA.debugLine="DatosSeleccionados=\"InfoAdicionalFaseAdicional\"";
Debug.ShouldStop(32768);
__ref.setField ("_datosseleccionados" /*RemoteObject*/ ,BA.ObjectToString("InfoAdicionalFaseAdicional"));
 BA.debugLineNum = 913;BA.debugLine="PreLoadDatosCls(1,sRowSource,mNuevaFaseDocument";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_preloaddatoscls" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(_srowsource),(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFaseDest" /*RemoteObject*/ )));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 928;BA.debugLine="Dialog.Title=\"Selecciona \" & lblTitleInfoAdicio";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("Selecciona "),__ref.getField(false,"_lbltitleinfoadicionalnuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 929;BA.debugLine="Dialog.TitleBarHeight=50dip";
Debug.ShouldStop(1);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 930;BA.debugLine="Dim InputDlg As B4XInputTemplate";
Debug.ShouldStop(2);
_inputdlg = RemoteObject.createNew ("b4j.docU.b4xinputtemplate");Debug.locals.put("InputDlg", _inputdlg);
 BA.debugLineNum = 931;BA.debugLine="InputDlg.Initialize";
Debug.ShouldStop(4);
_inputdlg.runClassMethod (b4j.docU.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 932;BA.debugLine="InputDlg.lblTitle.Text=\"\"";
Debug.ShouldStop(8);
_inputdlg.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 933;BA.debugLine="InputDlg.Text=\"\"";
Debug.ShouldStop(16);
_inputdlg.setField ("_text" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 936;BA.debugLine="InputDlg.mBase.Width=750dip";
Debug.ShouldStop(128);
_inputdlg.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 750)))));
 BA.debugLineNum = 938;BA.debugLine="Utilidades.SetLightThemeInput(InputDlg)";
Debug.ShouldStop(512);
parent._utilidades.runVoidMethod ("_setlightthemeinput" /*RemoteObject*/ ,(Object)(_inputdlg));
 BA.debugLineNum = 939;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(In";
Debug.ShouldStop(1024);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_inputdlg)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 940;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogR";
Debug.ShouldStop(2048);
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOK", _bok);Debug.locals.put("bOK", _bok);
 BA.debugLineNum = 941;BA.debugLine="bOK.TextSize=15";
Debug.ShouldStop(4096);
_bok.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 942;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dia";
Debug.ShouldStop(8192);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 943;BA.debugLine="bCancel.TextSize=15";
Debug.ShouldStop(16384);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 944;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
Debug.ShouldStop(32768);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 945;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.ShouldStop(65536);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 946;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "btnselinfoadicionaldocnuevafasedestinopreparacion_click"), _rsub);
this.state = 13;
return;
case 13:
//C
this.state = 6;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 948;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
Debug.ShouldStop(524288);
if (true) break;

case 6:
//if
this.state = 11;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 8;
;}if (true) break;

case 8:
//C
this.state = 11;
if (true) return ;
if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 950;BA.debugLine="Dim sInfoAdicionalDocDestinoPreparacion As Stri";
Debug.ShouldStop(2097152);
_sinfoadicionaldocdestinopreparacion = _inputdlg.getField(true,"_text" /*RemoteObject*/ );Debug.locals.put("sInfoAdicionalDocDestinoPreparacion", _sinfoadicionaldocdestinopreparacion);Debug.locals.put("sInfoAdicionalDocDestinoPreparacion", _sinfoadicionaldocdestinopreparacion);
 BA.debugLineNum = 952;BA.debugLine="txtInfoAdicionalNuevaFaseDestinoPreparacion.Tex";
Debug.ShouldStop(8388608);
__ref.getField(false,"_txtinfoadicionalnuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setText",_sinfoadicionaldocdestinopreparacion);
 BA.debugLineNum = 953;BA.debugLine="mNuevaFaseDocumento.NumExpFaseAdicional=sInfoAd";
Debug.ShouldStop(16777216);
__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).setField ("NumExpFaseAdicional" /*RemoteObject*/ ,_sinfoadicionaldocdestinopreparacion);
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 956;BA.debugLine="End Sub";
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
public static RemoteObject  _btnselnuevafase_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelNuevaFase_Click (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,732);
if (RapidSub.canDelegate("btnselnuevafase_click")) { return __ref.runUserSub(false, "cnuevafasedocumento","btnselnuevafase_click", __ref);}
 BA.debugLineNum = 732;BA.debugLine="Private Sub btnSelNuevaFase_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 733;BA.debugLine="SeleccionarNuevaFase";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_seleccionarnuevafase" /*void*/ );
 BA.debugLineNum = 734;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnselnuevafasedestinopreparacion_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelNuevaFaseDestinoPreparacion_Click (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,896);
if (RapidSub.canDelegate("btnselnuevafasedestinopreparacion_click")) { return __ref.runUserSub(false, "cnuevafasedocumento","btnselnuevafasedestinopreparacion_click", __ref);}
 BA.debugLineNum = 896;BA.debugLine="Private Sub btnSelNuevaFaseDestinoPreparacion_Clic";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 897;BA.debugLine="DatosSeleccionados=\"NuevaFaseAdicional\"";
Debug.ShouldStop(1);
__ref.setField ("_datosseleccionados" /*RemoteObject*/ ,BA.ObjectToString("NuevaFaseAdicional"));
 BA.debugLineNum = 899;BA.debugLine="If mDestinatarioTaller Then";
Debug.ShouldStop(4);
if (__ref.getField(true,"_mdestinatariotaller" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 900;BA.debugLine="LoadDatosB4xSearchList(1,\"SELECT IDFase, Fase FR";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_loaddatosb4xsearchlist" /*void*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT IDFase, Fase FROM tblFasesDoc where TipoOrigenDoc='"),__ref.getField(true,"_mtipodocumento" /*RemoteObject*/ ),RemoteObject.createImmutable("' and DestinoTaller<>0 and DestinoPreparacion<>0 and IDFase=16 ORDER BY tblFasesDoc.OrdenSecuencial"))),(Object)(BA.numberCast(int.class, 0)));
 }else {
 BA.debugLineNum = 902;BA.debugLine="LoadDatosB4xSearchList(1,\"SELECT IDFase, Fase FR";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_loaddatosb4xsearchlist" /*void*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT IDFase, Fase FROM tblFasesDoc where  TipoOrigenDoc='"),__ref.getField(true,"_mtipodocumento" /*RemoteObject*/ ),RemoteObject.createImmutable("' and DestinoPreparacion<>0 and IDFase<>16 ORDER BY tblFasesDoc.OrdenSecuencial"))),(Object)(BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 904;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnselresponsablenuevafase_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelResponsableNuevaFase_Click (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,302);
if (RapidSub.canDelegate("btnselresponsablenuevafase_click")) { __ref.runUserSub(false, "cnuevafasedocumento","btnselresponsablenuevafase_click", __ref); return;}
ResumableSub_btnSelResponsableNuevaFase_Click rsub = new ResumableSub_btnSelResponsableNuevaFase_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSelResponsableNuevaFase_Click extends BA.ResumableSub {
public ResumableSub_btnSelResponsableNuevaFase_Click(b4j.docU.cnuevafasedocumento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cnuevafasedocumento parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _opcionnuevo = RemoteObject.createImmutable(false);
RemoteObject _srowsource = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSelResponsableNuevaFase_Click (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,302);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 303;BA.debugLine="If txtNuevaFase.Text=\"\" Then";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtnuevafase" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 304;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Selecciona an";
Debug.ShouldStop(32768);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Selecciona antes la fase.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 305;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "btnselresponsablenuevafase_click"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 4;
;
 BA.debugLineNum = 306;BA.debugLine="SeleccionarNuevaFase";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_seleccionarnuevafase" /*void*/ );
 BA.debugLineNum = 307;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 310;BA.debugLine="If txtResponsableNuevaFase.Text<>\"\" Then";
Debug.ShouldStop(2097152);

case 4:
//if
this.state = 13;
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_txtresponsablenuevafase" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 311;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Seleccion";
Debug.ShouldStop(4194304);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("¿Seleccionar otro "),__ref.getField(true,"_datosseleccionados" /*RemoteObject*/ ),RemoteObject.createImmutable("?"))),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 312;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "btnselresponsablenuevafase_click"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 7;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 313;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(16777216);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 315;BA.debugLine="txtInfoAdicionalDoc.Text=\"\"";
Debug.ShouldStop(67108864);
__ref.getField(false,"_txtinfoadicionaldoc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 if (true) break;

case 13:
//C
this.state = -1;
;
 BA.debugLineNum = 321;BA.debugLine="Dim OpcionNuevo As Boolean=mSQL.ExecQuerySingleRe";
Debug.ShouldStop(1);
_opcionnuevo = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select LimitarAListaResponsable from tblFasesDoc where IDFase=? And TipoOrigenDoc=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.NumberToString(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFase" /*RemoteObject*/ )),__ref.getField(true,"_mtipodocumento" /*RemoteObject*/ )}))))),BA.NumberToString(1)));Debug.locals.put("OpcionNuevo", _opcionnuevo);Debug.locals.put("OpcionNuevo", _opcionnuevo);
 BA.debugLineNum = 323;BA.debugLine="DatosSeleccionados=\"ResponsableNuevaFase\"";
Debug.ShouldStop(4);
__ref.setField ("_datosseleccionados" /*RemoteObject*/ ,BA.ObjectToString("ResponsableNuevaFase"));
 BA.debugLineNum = 324;BA.debugLine="Dim sRowSource As String";
Debug.ShouldStop(8);
_srowsource = RemoteObject.createImmutable("");Debug.locals.put("sRowSource", _srowsource);
 BA.debugLineNum = 325;BA.debugLine="sRowSource=mSQL.ExecQuerySingleResult2(\"select Or";
Debug.ShouldStop(16);
_srowsource = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select OrigenFilacboResponsable from tblFasesDoc where IDFase=? and TipoOrigenDoc=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.NumberToString(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFase" /*RemoteObject*/ )),__ref.getField(true,"_mtipodocumento" /*RemoteObject*/ )})))));Debug.locals.put("sRowSource", _srowsource);
 BA.debugLineNum = 326;BA.debugLine="sRowSource=sRowSource.Replace(\"=true\",\"<>0\")";
Debug.ShouldStop(32);
_srowsource = _srowsource.runMethod(true,"replace",(Object)(BA.ObjectToString("=true")),(Object)(RemoteObject.createImmutable("<>0")));Debug.locals.put("sRowSource", _srowsource);
 BA.debugLineNum = 328;BA.debugLine="PreLoadDatosCls(1,sRowSource,mNuevaFaseDocumento.";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_preloaddatoscls" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(_srowsource),(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFase" /*RemoteObject*/ )));
 BA.debugLineNum = 377;BA.debugLine="End Sub";
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
public static RemoteObject  _btnselresponsablenuevafasedestinopreparacion_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelResponsableNuevaFaseDestinoPreparacion_Click (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,294);
if (RapidSub.canDelegate("btnselresponsablenuevafasedestinopreparacion_click")) { return __ref.runUserSub(false, "cnuevafasedocumento","btnselresponsablenuevafasedestinopreparacion_click", __ref);}
RemoteObject _srowsource = RemoteObject.createImmutable("");
 BA.debugLineNum = 294;BA.debugLine="Private Sub btnSelResponsableNuevaFaseDestinoPrepa";
Debug.ShouldStop(32);
 BA.debugLineNum = 295;BA.debugLine="DatosSeleccionados=\"ResponsableFaseAdicional\"";
Debug.ShouldStop(64);
__ref.setField ("_datosseleccionados" /*RemoteObject*/ ,BA.ObjectToString("ResponsableFaseAdicional"));
 BA.debugLineNum = 296;BA.debugLine="Dim sRowSource As String";
Debug.ShouldStop(128);
_srowsource = RemoteObject.createImmutable("");Debug.locals.put("sRowSource", _srowsource);
 BA.debugLineNum = 297;BA.debugLine="sRowSource=mSQL.ExecQuerySingleResult2(\"select Or";
Debug.ShouldStop(256);
_srowsource = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select OrigenFilacboResponsable from tblFasesDoc where IDFase=? and TipoOrigenDoc=?")),(Object)(cnuevafasedocumento.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.NumberToString(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFaseDest" /*RemoteObject*/ )),__ref.getField(true,"_mtipodocumento" /*RemoteObject*/ )})))));Debug.locals.put("sRowSource", _srowsource);
 BA.debugLineNum = 298;BA.debugLine="sRowSource=sRowSource.Replace(\"=true\",\"<>0\")";
Debug.ShouldStop(512);
_srowsource = _srowsource.runMethod(true,"replace",(Object)(BA.ObjectToString("=true")),(Object)(RemoteObject.createImmutable("<>0")));Debug.locals.put("sRowSource", _srowsource);
 BA.debugLineNum = 299;BA.debugLine="PreLoadDatosCls(1,sRowSource,mNuevaFaseDocumento.";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_preloaddatoscls" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(_srowsource),(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFaseDest" /*RemoteObject*/ )));
 BA.debugLineNum = 300;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checknuevosdatosok(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("checkNuevosDatosOk (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1161);
if (RapidSub.canDelegate("checknuevosdatosok")) { return __ref.runUserSub(false, "cnuevafasedocumento","checknuevosdatosok", __ref);}
ResumableSub_checkNuevosDatosOk rsub = new ResumableSub_checkNuevosDatosOk(null,__ref);
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
public static class ResumableSub_checkNuevosDatosOk extends BA.ResumableSub {
public ResumableSub_checkNuevosDatosOk(b4j.docU.cnuevafasedocumento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cnuevafasedocumento parent;
RemoteObject _checkndatosok = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _expreq = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("checkNuevosDatosOk (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1161);
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
 BA.debugLineNum = 1162;BA.debugLine="Dim checkNDatosOk As Boolean= True";
Debug.ShouldStop(512);
_checkndatosok = parent.__c.getField(true,"True");Debug.locals.put("checkNDatosOk", _checkndatosok);Debug.locals.put("checkNDatosOk", _checkndatosok);
 BA.debugLineNum = 1164;BA.debugLine="If Utilidades.FixNullLong(mNuevaFaseDocumento.Fec";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",parent._utilidades.runMethod(true,"_fixnulllong" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"FechaFase" /*RemoteObject*/ )))),BA.numberCast(long.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1165;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La fecha indi";
Debug.ShouldStop(4096);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("La fecha indicada para la nueva fase no es válida")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1166;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "checknuevosdatosok"), _msa);
this.state = 37;
return;
case 37:
//C
this.state = 4;
;
 BA.debugLineNum = 1167;BA.debugLine="checkNDatosOk = False";
Debug.ShouldStop(16384);
_checkndatosok = parent.__c.getField(true,"False");Debug.locals.put("checkNDatosOk", _checkndatosok);
 if (true) break;
;
 BA.debugLineNum = 1171;BA.debugLine="If Utilidades.FixNullInt(mNuevaFaseDocumento.IDFa";
Debug.ShouldStop(262144);

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFase" /*RemoteObject*/ )))),BA.numberCast(double.class, 0))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1173;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha indi";
Debug.ShouldStop(1048576);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se ha indicado la nueva fase")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1174;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "checknuevosdatosok"), _msa);
this.state = 38;
return;
case 38:
//C
this.state = 7;
;
 BA.debugLineNum = 1175;BA.debugLine="checkNDatosOk = False";
Debug.ShouldStop(4194304);
_checkndatosok = parent.__c.getField(true,"False");Debug.locals.put("checkNDatosOk", _checkndatosok);
 if (true) break;
;
 BA.debugLineNum = 1186;BA.debugLine="If txtResponsableNuevaFase.Visible And Utilidades";
Debug.ShouldStop(2);

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_txtresponsablenuevafase" /*RemoteObject*/ ).runMethod(true,"getVisible")) && RemoteObject.solveBoolean("=",parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDRespFase" /*RemoteObject*/ )))),BA.numberCast(double.class, 0))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1187;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha indi";
Debug.ShouldStop(4);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se ha indicado responsable de la fase")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1188;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "checknuevosdatosok"), _msa);
this.state = 39;
return;
case 39:
//C
this.state = 10;
;
 BA.debugLineNum = 1189;BA.debugLine="checkNDatosOk = False";
Debug.ShouldStop(16);
_checkndatosok = parent.__c.getField(true,"False");Debug.locals.put("checkNDatosOk", _checkndatosok);
 if (true) break;
;
 BA.debugLineNum = 1194;BA.debugLine="If txtInfoAdicionalDoc.Visible And Utilidades.Fix";
Debug.ShouldStop(512);

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_txtinfoadicionaldoc" /*RemoteObject*/ ).runMethod(true,"getVisible")) && RemoteObject.solveBoolean("=",parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDInfoAdicionalFase" /*RemoteObject*/ )))),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("!",parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFase" /*RemoteObject*/ )))),BA.numberCast(double.class, 9)) && RemoteObject.solveBoolean("=",parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"NumExpFaseActual" /*RemoteObject*/ )))),BA.ObjectToString(""))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1195;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Es obligatori";
Debug.ShouldStop(1024);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Es obligatorio seleccionar información adicional para esta fase")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1196;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "checknuevosdatosok"), _msa);
this.state = 40;
return;
case 40:
//C
this.state = 13;
;
 BA.debugLineNum = 1197;BA.debugLine="checkNDatosOk = False";
Debug.ShouldStop(4096);
_checkndatosok = parent.__c.getField(true,"False");Debug.locals.put("checkNDatosOk", _checkndatosok);
 if (true) break;
;
 BA.debugLineNum = 1201;BA.debugLine="If txtInfoAdicionalDoc.Visible And Utilidades.Fix";
Debug.ShouldStop(65536);

case 13:
//if
this.state = 20;
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_txtinfoadicionaldoc" /*RemoteObject*/ ).runMethod(true,"getVisible")) && RemoteObject.solveBoolean("=",parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDInfoAdicionalFase" /*RemoteObject*/ )))),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("=",parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFase" /*RemoteObject*/ )))),BA.numberCast(double.class, 9)) && RemoteObject.solveBoolean("=",parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"NumExpFaseActual" /*RemoteObject*/ )))),BA.ObjectToString(""))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1202;BA.debugLine="Dim expReq As Int";
Debug.ShouldStop(131072);
_expreq = RemoteObject.createImmutable(0);Debug.locals.put("expReq", _expreq);
 BA.debugLineNum = 1203;BA.debugLine="expReq=utilidades.FixNullInt(mSQL.ExecQuerySingl";
Debug.ShouldStop(262144);
_expreq = parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select RequiereNumeroExpedicion from tblTransporte where IDTransporte=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDRespFase" /*RemoteObject*/ )))))}))))))));Debug.locals.put("expReq", _expreq);
 BA.debugLineNum = 1204;BA.debugLine="If expReq<>0 Then";
Debug.ShouldStop(524288);
if (true) break;

case 16:
//if
this.state = 19;
if (RemoteObject.solveBoolean("!",_expreq,BA.numberCast(double.class, 0))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 1205;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Es obligator";
Debug.ShouldStop(1048576);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Es obligatorio indicar Número de expedición para esta fase")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1206;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "checknuevosdatosok"), _msa);
this.state = 41;
return;
case 41:
//C
this.state = 19;
;
 BA.debugLineNum = 1209;BA.debugLine="checkNDatosOk = False";
Debug.ShouldStop(16777216);
_checkndatosok = parent.__c.getField(true,"False");Debug.locals.put("checkNDatosOk", _checkndatosok);
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;
;
 BA.debugLineNum = 1214;BA.debugLine="If Utilidades.FixNullInt(mNuevaFaseDocumento.IDFa";
Debug.ShouldStop(536870912);

case 20:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFase" /*RemoteObject*/ )))),BA.numberCast(double.class, 15)) && RemoteObject.solveBoolean("=",parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFaseDest" /*RemoteObject*/ )))),BA.numberCast(double.class, 0))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 1215;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Es obligatori";
Debug.ShouldStop(1073741824);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Es obligatorio indicar el destino del documento preparado.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1216;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "checknuevosdatosok"), _msa);
this.state = 42;
return;
case 42:
//C
this.state = 23;
;
 BA.debugLineNum = 1217;BA.debugLine="checkNDatosOk = False";
Debug.ShouldStop(1);
_checkndatosok = parent.__c.getField(true,"False");Debug.locals.put("checkNDatosOk", _checkndatosok);
 if (true) break;
;
 BA.debugLineNum = 1222;BA.debugLine="If txtResponsableNuevaFaseDestinoPreparacion.Visi";
Debug.ShouldStop(32);

case 23:
//if
this.state = 26;
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_txtresponsablenuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"getVisible")) && RemoteObject.solveBoolean("=",parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDRespFaseDest" /*RemoteObject*/ )))),BA.numberCast(double.class, 0))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 1223;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha indi";
Debug.ShouldStop(64);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No se ha indicado "),__ref.getField(false,"_lbltitleresponsablenuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1224;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "checknuevosdatosok"), _msa);
this.state = 43;
return;
case 43:
//C
this.state = 26;
;
 BA.debugLineNum = 1225;BA.debugLine="checkNDatosOk = False";
Debug.ShouldStop(256);
_checkndatosok = parent.__c.getField(true,"False");Debug.locals.put("checkNDatosOk", _checkndatosok);
 if (true) break;
;
 BA.debugLineNum = 1230;BA.debugLine="If txtInfoAdicionalNuevaFaseDestinoPreparacion.Vi";
Debug.ShouldStop(8192);

case 26:
//if
this.state = 29;
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_txtinfoadicionalnuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"getVisible")) && RemoteObject.solveBoolean("=",parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDInfoAdicionalFaseDest" /*RemoteObject*/ )))),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("!",parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFaseDest" /*RemoteObject*/ )))),BA.numberCast(double.class, 9)) && RemoteObject.solveBoolean("=",parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"NumExpFaseAdicional" /*RemoteObject*/ )))),BA.ObjectToString(""))) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 1231;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Es obligatori";
Debug.ShouldStop(16384);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Es obligatorio seleccionar información adicional para la fase de destino de preparación")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1232;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "checknuevosdatosok"), _msa);
this.state = 44;
return;
case 44:
//C
this.state = 29;
;
 BA.debugLineNum = 1233;BA.debugLine="checkNDatosOk = False";
Debug.ShouldStop(65536);
_checkndatosok = parent.__c.getField(true,"False");Debug.locals.put("checkNDatosOk", _checkndatosok);
 if (true) break;
;
 BA.debugLineNum = 1237;BA.debugLine="If txtInfoAdicionalNuevaFaseDestinoPreparacion.Vi";
Debug.ShouldStop(1048576);

case 29:
//if
this.state = 36;
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_txtinfoadicionalnuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"getVisible")) && RemoteObject.solveBoolean("=",parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDInfoAdicionalFaseDest" /*RemoteObject*/ )))),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("=",parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFaseDest" /*RemoteObject*/ )))),BA.numberCast(double.class, 9)) && RemoteObject.solveBoolean("=",parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"NumExpFaseAdicional" /*RemoteObject*/ )))),BA.ObjectToString(""))) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 1238;BA.debugLine="Dim expReq As Int";
Debug.ShouldStop(2097152);
_expreq = RemoteObject.createImmutable(0);Debug.locals.put("expReq", _expreq);
 BA.debugLineNum = 1239;BA.debugLine="expReq=Utilidades.FixNullint(mSQL.ExecQuerySingl";
Debug.ShouldStop(4194304);
_expreq = parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select RequiereNumeroExpedicion from tblTransporte where IDTransporte=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDRespFaseDest" /*RemoteObject*/ )))))}))))))));Debug.locals.put("expReq", _expreq);
 BA.debugLineNum = 1240;BA.debugLine="If expReq<>0 Then";
Debug.ShouldStop(8388608);
if (true) break;

case 32:
//if
this.state = 35;
if (RemoteObject.solveBoolean("!",_expreq,BA.numberCast(double.class, 0))) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 1241;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Es obligator";
Debug.ShouldStop(16777216);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Es obligatorio seleccionar información adicional para esta fase de destino de preparación")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1242;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "checknuevosdatosok"), _msa);
this.state = 45;
return;
case 45:
//C
this.state = 35;
;
 BA.debugLineNum = 1243;BA.debugLine="checkNDatosOk = False";
Debug.ShouldStop(67108864);
_checkndatosok = parent.__c.getField(true,"False");Debug.locals.put("checkNDatosOk", _checkndatosok);
 if (true) break;

case 35:
//C
this.state = 36;
;
 if (true) break;

case 36:
//C
this.state = -1;
;
 BA.debugLineNum = 1265;BA.debugLine="Return checkNDatosOk";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_checkndatosok));return;};
 BA.debugLineNum = 1266;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
public static RemoteObject  _chkfijarfechanuevafase_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkFijarFechaNuevaFase_CheckedChange (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,290);
if (RapidSub.canDelegate("chkfijarfechanuevafase_checkedchange")) { return __ref.runUserSub(false, "cnuevafasedocumento","chkfijarfechanuevafase_checkedchange", __ref, _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 290;BA.debugLine="Private Sub chkFijarFechaNuevaFase_CheckedChange(C";
Debug.ShouldStop(2);
 BA.debugLineNum = 292;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chkfijarnuevafase_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkFijarNuevaFase_CheckedChange (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,286);
if (RapidSub.canDelegate("chkfijarnuevafase_checkedchange")) { return __ref.runUserSub(false, "cnuevafasedocumento","chkfijarnuevafase_checkedchange", __ref, _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 286;BA.debugLine="Private Sub chkFijarNuevaFase_CheckedChange(Checke";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 288;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
cnuevafasedocumento._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cnuevafasedocumento._fx);
 //BA.debugLineNum = 3;BA.debugLine="Private frm As Form";
cnuevafasedocumento._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",cnuevafasedocumento._frm);
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
cnuevafasedocumento._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cnuevafasedocumento._xui);
 //BA.debugLineNum = 6;BA.debugLine="Private mCallBack As Object";
cnuevafasedocumento._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",cnuevafasedocumento._mcallback);
 //BA.debugLineNum = 7;BA.debugLine="Private mParent As B4XView";
cnuevafasedocumento._mparent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mparent",cnuevafasedocumento._mparent);
 //BA.debugLineNum = 8;BA.debugLine="Private Background As B4XView";
cnuevafasedocumento._background = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_background",cnuevafasedocumento._background);
 //BA.debugLineNum = 10;BA.debugLine="Private mNuevaFaseDocumento As NuevaFaseDocumento";
cnuevafasedocumento._mnuevafasedocumento = RemoteObject.createNew ("b4j.docU.cnuevafasedocumento._nuevafasedocumento");__ref.setField("_mnuevafasedocumento",cnuevafasedocumento._mnuevafasedocumento);
 //BA.debugLineNum = 11;BA.debugLine="Private mDestinatarioTaller As Boolean";
cnuevafasedocumento._mdestinatariotaller = RemoteObject.createImmutable(false);__ref.setField("_mdestinatariotaller",cnuevafasedocumento._mdestinatariotaller);
 //BA.debugLineNum = 12;BA.debugLine="Private mOrdenFab As String";
cnuevafasedocumento._mordenfab = RemoteObject.createImmutable("");__ref.setField("_mordenfab",cnuevafasedocumento._mordenfab);
 //BA.debugLineNum = 14;BA.debugLine="Private Dialog As B4XDialog";
cnuevafasedocumento._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",cnuevafasedocumento._dialog);
 //BA.debugLineNum = 16;BA.debugLine="Private mSQL As SQL";
cnuevafasedocumento._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",cnuevafasedocumento._msql);
 //BA.debugLineNum = 18;BA.debugLine="Private mDocumentoSel As String";
cnuevafasedocumento._mdocumentosel = RemoteObject.createImmutable("");__ref.setField("_mdocumentosel",cnuevafasedocumento._mdocumentosel);
 //BA.debugLineNum = 19;BA.debugLine="Private mTipoDocumento As String";
cnuevafasedocumento._mtipodocumento = RemoteObject.createImmutable("");__ref.setField("_mtipodocumento",cnuevafasedocumento._mtipodocumento);
 //BA.debugLineNum = 20;BA.debugLine="Private btnCancelarGrabarNuevaFase As Button";
cnuevafasedocumento._btncancelargrabarnuevafase = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btncancelargrabarnuevafase",cnuevafasedocumento._btncancelargrabarnuevafase);
 //BA.debugLineNum = 21;BA.debugLine="Private btnGrabarNuevaFase As Button";
cnuevafasedocumento._btngrabarnuevafase = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btngrabarnuevafase",cnuevafasedocumento._btngrabarnuevafase);
 //BA.debugLineNum = 22;BA.debugLine="Private btnSalir As Button";
cnuevafasedocumento._btnsalir = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnsalir",cnuevafasedocumento._btnsalir);
 //BA.debugLineNum = 23;BA.debugLine="Private btnSelDocumento As Button";
cnuevafasedocumento._btnseldocumento = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnseldocumento",cnuevafasedocumento._btnseldocumento);
 //BA.debugLineNum = 24;BA.debugLine="Private btnSelFechaNuevaFase As Button";
cnuevafasedocumento._btnselfechanuevafase = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnselfechanuevafase",cnuevafasedocumento._btnselfechanuevafase);
 //BA.debugLineNum = 25;BA.debugLine="Private btnSelInfoAdicionalDoc As Button";
cnuevafasedocumento._btnselinfoadicionaldoc = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnselinfoadicionaldoc",cnuevafasedocumento._btnselinfoadicionaldoc);
 //BA.debugLineNum = 26;BA.debugLine="Private btnSelInfoAdicionalDocNuevaFaseDestinoPre";
cnuevafasedocumento._btnselinfoadicionaldocnuevafasedestinopreparacion = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnselinfoadicionaldocnuevafasedestinopreparacion",cnuevafasedocumento._btnselinfoadicionaldocnuevafasedestinopreparacion);
 //BA.debugLineNum = 27;BA.debugLine="Private btnSelNuevaFaseDestinoPreparacion As Butt";
cnuevafasedocumento._btnselnuevafasedestinopreparacion = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnselnuevafasedestinopreparacion",cnuevafasedocumento._btnselnuevafasedestinopreparacion);
 //BA.debugLineNum = 28;BA.debugLine="Private btnSelNuevaFase As Button";
cnuevafasedocumento._btnselnuevafase = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnselnuevafase",cnuevafasedocumento._btnselnuevafase);
 //BA.debugLineNum = 29;BA.debugLine="Private btnSelResponsableNuevaFase As Button";
cnuevafasedocumento._btnselresponsablenuevafase = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnselresponsablenuevafase",cnuevafasedocumento._btnselresponsablenuevafase);
 //BA.debugLineNum = 30;BA.debugLine="Private btnSelResponsableNuevaFaseDestinoPreparac";
cnuevafasedocumento._btnselresponsablenuevafasedestinopreparacion = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnselresponsablenuevafasedestinopreparacion",cnuevafasedocumento._btnselresponsablenuevafasedestinopreparacion);
 //BA.debugLineNum = 31;BA.debugLine="Private chkFijarFechaNuevaFase As CheckBox";
cnuevafasedocumento._chkfijarfechanuevafase = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");__ref.setField("_chkfijarfechanuevafase",cnuevafasedocumento._chkfijarfechanuevafase);
 //BA.debugLineNum = 32;BA.debugLine="Private chkFijarNuevaFase As CheckBox";
cnuevafasedocumento._chkfijarnuevafase = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");__ref.setField("_chkfijarnuevafase",cnuevafasedocumento._chkfijarnuevafase);
 //BA.debugLineNum = 34;BA.debugLine="Private lblTitleDocumento As Label";
cnuevafasedocumento._lbltitledocumento = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltitledocumento",cnuevafasedocumento._lbltitledocumento);
 //BA.debugLineNum = 35;BA.debugLine="Private lblTitleFechaNuevaFase As Label";
cnuevafasedocumento._lbltitlefechanuevafase = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltitlefechanuevafase",cnuevafasedocumento._lbltitlefechanuevafase);
 //BA.debugLineNum = 36;BA.debugLine="Private lblTitleInfoAdicionalDoc As Label";
cnuevafasedocumento._lbltitleinfoadicionaldoc = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltitleinfoadicionaldoc",cnuevafasedocumento._lbltitleinfoadicionaldoc);
 //BA.debugLineNum = 37;BA.debugLine="Private lblTitleNuevaFase As Label";
cnuevafasedocumento._lbltitlenuevafase = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltitlenuevafase",cnuevafasedocumento._lbltitlenuevafase);
 //BA.debugLineNum = 38;BA.debugLine="Private lblTitleResponsableNuevaFase As Label";
cnuevafasedocumento._lbltitleresponsablenuevafase = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltitleresponsablenuevafase",cnuevafasedocumento._lbltitleresponsablenuevafase);
 //BA.debugLineNum = 39;BA.debugLine="Private lblTitleResponsableNuevaFaseDestinoPrepar";
cnuevafasedocumento._lbltitleresponsablenuevafasedestinopreparacion = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltitleresponsablenuevafasedestinopreparacion",cnuevafasedocumento._lbltitleresponsablenuevafasedestinopreparacion);
 //BA.debugLineNum = 40;BA.debugLine="Private txtDocumento As TextField";
cnuevafasedocumento._txtdocumento = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtdocumento",cnuevafasedocumento._txtdocumento);
 //BA.debugLineNum = 41;BA.debugLine="Private txtFechaNuevaFase As TextField";
cnuevafasedocumento._txtfechanuevafase = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfechanuevafase",cnuevafasedocumento._txtfechanuevafase);
 //BA.debugLineNum = 42;BA.debugLine="Private txtInfoAdicionalDoc As TextField";
cnuevafasedocumento._txtinfoadicionaldoc = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtinfoadicionaldoc",cnuevafasedocumento._txtinfoadicionaldoc);
 //BA.debugLineNum = 43;BA.debugLine="Private txtNuevaFaseDestinoPreparacion As TextFie";
cnuevafasedocumento._txtnuevafasedestinopreparacion = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnuevafasedestinopreparacion",cnuevafasedocumento._txtnuevafasedestinopreparacion);
 //BA.debugLineNum = 44;BA.debugLine="Private txtNuevaFase As TextField";
cnuevafasedocumento._txtnuevafase = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnuevafase",cnuevafasedocumento._txtnuevafase);
 //BA.debugLineNum = 45;BA.debugLine="Private txtResponsableNuevaFase As TextField";
cnuevafasedocumento._txtresponsablenuevafase = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtresponsablenuevafase",cnuevafasedocumento._txtresponsablenuevafase);
 //BA.debugLineNum = 46;BA.debugLine="Private txtResponsableNuevaFaseDestinoPreparacion";
cnuevafasedocumento._txtresponsablenuevafasedestinopreparacion = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtresponsablenuevafasedestinopreparacion",cnuevafasedocumento._txtresponsablenuevafasedestinopreparacion);
 //BA.debugLineNum = 47;BA.debugLine="Private lblTitleNuevaFaseDestinoPreparacion As La";
cnuevafasedocumento._lbltitlenuevafasedestinopreparacion = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltitlenuevafasedestinopreparacion",cnuevafasedocumento._lbltitlenuevafasedestinopreparacion);
 //BA.debugLineNum = 48;BA.debugLine="Private lblTitleInfoAdicionalNuevaFaseDestinoPrep";
cnuevafasedocumento._lbltitleinfoadicionalnuevafasedestinopreparacion = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltitleinfoadicionalnuevafasedestinopreparacion",cnuevafasedocumento._lbltitleinfoadicionalnuevafasedestinopreparacion);
 //BA.debugLineNum = 49;BA.debugLine="Private txtInfoAdicionalNuevaFaseDestinoPreparaci";
cnuevafasedocumento._txtinfoadicionalnuevafasedestinopreparacion = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtinfoadicionalnuevafasedestinopreparacion",cnuevafasedocumento._txtinfoadicionalnuevafasedestinopreparacion);
 //BA.debugLineNum = 52;BA.debugLine="Private DatosSeleccionados As String";
cnuevafasedocumento._datosseleccionados = RemoteObject.createImmutable("");__ref.setField("_datosseleccionados",cnuevafasedocumento._datosseleccionados);
 //BA.debugLineNum = 53;BA.debugLine="Private SourceTableCls, stringSourceTableCls,Tipo";
cnuevafasedocumento._sourcetablecls = RemoteObject.createImmutable("");__ref.setField("_sourcetablecls",cnuevafasedocumento._sourcetablecls);
cnuevafasedocumento._stringsourcetablecls = RemoteObject.createImmutable("");__ref.setField("_stringsourcetablecls",cnuevafasedocumento._stringsourcetablecls);
cnuevafasedocumento._tipoqrycls = RemoteObject.createImmutable("");__ref.setField("_tipoqrycls",cnuevafasedocumento._tipoqrycls);
 //BA.debugLineNum = 55;BA.debugLine="Private IDDatosCls As Int";
cnuevafasedocumento._iddatoscls = RemoteObject.createImmutable(0);__ref.setField("_iddatoscls",cnuevafasedocumento._iddatoscls);
 //BA.debugLineNum = 56;BA.debugLine="Private Obstmp As String";
cnuevafasedocumento._obstmp = RemoteObject.createImmutable("");__ref.setField("_obstmp",cnuevafasedocumento._obstmp);
 //BA.debugLineNum = 58;BA.debugLine="Type NuevaFaseDocumento (FechaFase As Long, IDFas";
;
 //BA.debugLineNum = 61;BA.debugLine="Private pnlNuevaFaseComplementaria As Pane";
cnuevafasedocumento._pnlnuevafasecomplementaria = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_pnlnuevafasecomplementaria",cnuevafasedocumento._pnlnuevafasecomplementaria);
 //BA.debugLineNum = 63;BA.debugLine="Private NuevaFaseDocumentoRegistrada As Boolean";
cnuevafasedocumento._nuevafasedocumentoregistrada = RemoteObject.createImmutable(false);__ref.setField("_nuevafasedocumentoregistrada",cnuevafasedocumento._nuevafasedocumentoregistrada);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _creaciontablassqlite(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreacionTablasSQLite (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("creaciontablassqlite")) { return __ref.runUserSub(false, "cnuevafasedocumento","creaciontablassqlite", __ref);}
RemoteObject _ntfp = RemoteObject.createImmutable(0);
RemoteObject _sbcreartabla = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _f = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 151;BA.debugLine="Sub CreacionTablasSQLite";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 153;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
Debug.ShouldStop(16777216);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(cnuevafasedocumento.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblFasesDoc")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 154;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 155;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblFasesDoc\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblFasesDoc")));
 };
 BA.debugLineNum = 157;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(268435456);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 158;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(536870912);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 159;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
Debug.ShouldStop(1073741824);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS tblFasesDoc (")));
 BA.debugLineNum = 161;BA.debugLine="sbCrearTabla.Append(\"TipoOrigenDoc TEXT,\")";
Debug.ShouldStop(1);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("TipoOrigenDoc TEXT,")));
 BA.debugLineNum = 162;BA.debugLine="sbCrearTabla.Append(\"IDFase INTEGER,\")";
Debug.ShouldStop(2);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("IDFase INTEGER,")));
 BA.debugLineNum = 163;BA.debugLine="sbCrearTabla.Append(\"OrdenSecuencial INTEGER,\")";
Debug.ShouldStop(4);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("OrdenSecuencial INTEGER,")));
 BA.debugLineNum = 164;BA.debugLine="sbCrearTabla.Append(\"Agrupable INTEGER,\")";
Debug.ShouldStop(8);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Agrupable INTEGER,")));
 BA.debugLineNum = 165;BA.debugLine="sbCrearTabla.Append(\"Fase TEXT,\")";
Debug.ShouldStop(16);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Fase TEXT,")));
 BA.debugLineNum = 166;BA.debugLine="sbCrearTabla.Append(\"AreaFase TEXT,\")";
Debug.ShouldStop(32);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("AreaFase TEXT,")));
 BA.debugLineNum = 167;BA.debugLine="sbCrearTabla.Append(\"DestinoPreparacion INTEGER,\"";
Debug.ShouldStop(64);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("DestinoPreparacion INTEGER,")));
 BA.debugLineNum = 168;BA.debugLine="sbCrearTabla.Append(\"Gestionado INTEGER,\")";
Debug.ShouldStop(128);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Gestionado INTEGER,")));
 BA.debugLineNum = 169;BA.debugLine="sbCrearTabla.Append(\"cboResponsableVisible INTEGE";
Debug.ShouldStop(256);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("cboResponsableVisible INTEGER,")));
 BA.debugLineNum = 170;BA.debugLine="sbCrearTabla.Append(\"TextoEtiquetaResponsable TEX";
Debug.ShouldStop(512);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("TextoEtiquetaResponsable TEXT,")));
 BA.debugLineNum = 171;BA.debugLine="sbCrearTabla.Append(\"OrigenResponsableMovFase TEX";
Debug.ShouldStop(1024);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("OrigenResponsableMovFase TEXT,")));
 BA.debugLineNum = 172;BA.debugLine="sbCrearTabla.Append(\"OrigenFilaCboResponsable TEX";
Debug.ShouldStop(2048);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("OrigenFilaCboResponsable TEXT,")));
 BA.debugLineNum = 173;BA.debugLine="sbCrearTabla.Append(\"LimitarAListaResponsable INT";
Debug.ShouldStop(4096);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("LimitarAListaResponsable INTEGER,")));
 BA.debugLineNum = 174;BA.debugLine="sbCrearTabla.Append(\"cboInfoAdicionalVisible INTE";
Debug.ShouldStop(8192);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("cboInfoAdicionalVisible INTEGER,")));
 BA.debugLineNum = 175;BA.debugLine="sbCrearTabla.Append(\"txtInfoAdicionalVisible INTE";
Debug.ShouldStop(16384);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("txtInfoAdicionalVisible INTEGER,")));
 BA.debugLineNum = 176;BA.debugLine="sbCrearTabla.Append(\"TextoEtiquetaInfoAdicional T";
Debug.ShouldStop(32768);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("TextoEtiquetaInfoAdicional TEXT,")));
 BA.debugLineNum = 177;BA.debugLine="sbCrearTabla.Append(\"OrigenFilacboInfoAdicional T";
Debug.ShouldStop(65536);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("OrigenFilacboInfoAdicional TEXT,")));
 BA.debugLineNum = 178;BA.debugLine="sbCrearTabla.Append(\"LimitarAListaInfoAdicional I";
Debug.ShouldStop(131072);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("LimitarAListaInfoAdicional INTEGER,")));
 BA.debugLineNum = 179;BA.debugLine="sbCrearTabla.Append(\"InformeExpediciones INTEGER,";
Debug.ShouldStop(262144);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("InformeExpediciones INTEGER,")));
 BA.debugLineNum = 180;BA.debugLine="sbCrearTabla.Append(\"DestinoTaller INTEGER)\")";
Debug.ShouldStop(524288);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("DestinoTaller INTEGER)")));
 BA.debugLineNum = 181;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 183;BA.debugLine="DBUtils.DropTable(mSQL,\"tblTipificacionInfoAdicio";
Debug.ShouldStop(4194304);
cnuevafasedocumento._dbutils.runVoidMethod ("_droptable" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("tblTipificacionInfoAdicionalFases")));
 BA.debugLineNum = 184;BA.debugLine="Dim f As Map";
Debug.ShouldStop(8388608);
_f = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("f", _f);
 BA.debugLineNum = 185;BA.debugLine="f.Initialize";
Debug.ShouldStop(16777216);
_f.runVoidMethod ("Initialize");
 BA.debugLineNum = 186;BA.debugLine="f.Put(\"TipoOrigenDoc\",DBUtils.DB_TEXT)";
Debug.ShouldStop(33554432);
_f.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TipoOrigenDoc"))),(Object)((cnuevafasedocumento._dbutils._db_text /*RemoteObject*/ )));
 BA.debugLineNum = 187;BA.debugLine="f.Put(\"IDFase\",DBUtils.DB_INTEGER)";
Debug.ShouldStop(67108864);
_f.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("IDFase"))),(Object)((cnuevafasedocumento._dbutils._db_integer /*RemoteObject*/ )));
 BA.debugLineNum = 188;BA.debugLine="f.Put(\"IDInfoAdicional\",DBUtils.DB_INTEGER)";
Debug.ShouldStop(134217728);
_f.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("IDInfoAdicional"))),(Object)((cnuevafasedocumento._dbutils._db_integer /*RemoteObject*/ )));
 BA.debugLineNum = 189;BA.debugLine="f.Put(\"InfoAdicional\",DBUtils.DB_TEXT)";
Debug.ShouldStop(268435456);
_f.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("InfoAdicional"))),(Object)((cnuevafasedocumento._dbutils._db_text /*RemoteObject*/ )));
 BA.debugLineNum = 190;BA.debugLine="DBUtils.CreateTable(mSQL,\"tbltipificacioninfoadic";
Debug.ShouldStop(536870912);
cnuevafasedocumento._dbutils.runVoidMethod ("_createtable" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tbltipificacioninfoadicionalfases")),(Object)(_f),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 193;BA.debugLine="DBUtils.DropTable(mSQL,\"tblRowSourceCboResponsabl";
Debug.ShouldStop(1);
cnuevafasedocumento._dbutils.runVoidMethod ("_droptable" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("tblRowSourceCboResponsableNuevafase")));
 BA.debugLineNum = 194;BA.debugLine="Dim f As Map";
Debug.ShouldStop(2);
_f = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("f", _f);
 BA.debugLineNum = 195;BA.debugLine="f.Initialize";
Debug.ShouldStop(4);
_f.runVoidMethod ("Initialize");
 BA.debugLineNum = 196;BA.debugLine="f.Put(\"IDResponsableNuevaFase\",DBUtils.DB_INTEGER";
Debug.ShouldStop(8);
_f.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("IDResponsableNuevaFase"))),(Object)((cnuevafasedocumento._dbutils._db_integer /*RemoteObject*/ )));
 BA.debugLineNum = 197;BA.debugLine="f.Put(\"ResponsableNuevaFase\",DBUtils.DB_INTEGER)";
Debug.ShouldStop(16);
_f.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ResponsableNuevaFase"))),(Object)((cnuevafasedocumento._dbutils._db_integer /*RemoteObject*/ )));
 BA.debugLineNum = 198;BA.debugLine="DBUtils.CreateTable(mSQL,\"tblRowSourceCboResponsa";
Debug.ShouldStop(32);
cnuevafasedocumento._dbutils.runVoidMethod ("_createtable" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblRowSourceCboResponsableNuevafase")),(Object)(_f),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 201;BA.debugLine="DBUtils.DropTable(mSQL,\"tblRowSourceCboResponsabl";
Debug.ShouldStop(256);
cnuevafasedocumento._dbutils.runVoidMethod ("_droptable" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("tblRowSourceCboResponsableNuevaFaseAdicional")));
 BA.debugLineNum = 202;BA.debugLine="Dim f As Map";
Debug.ShouldStop(512);
_f = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("f", _f);
 BA.debugLineNum = 203;BA.debugLine="f.Initialize";
Debug.ShouldStop(1024);
_f.runVoidMethod ("Initialize");
 BA.debugLineNum = 204;BA.debugLine="f.Put(\"IDResponsableNuevaFaseAdicional\",DBUtils.D";
Debug.ShouldStop(2048);
_f.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("IDResponsableNuevaFaseAdicional"))),(Object)((cnuevafasedocumento._dbutils._db_integer /*RemoteObject*/ )));
 BA.debugLineNum = 205;BA.debugLine="f.Put(\"ResponsableNuevaFaseAdicional\",DBUtils.DB_";
Debug.ShouldStop(4096);
_f.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ResponsableNuevaFaseAdicional"))),(Object)((cnuevafasedocumento._dbutils._db_integer /*RemoteObject*/ )));
 BA.debugLineNum = 206;BA.debugLine="DBUtils.CreateTable(mSQL,\"tblRowSourceCboResponsa";
Debug.ShouldStop(8192);
cnuevafasedocumento._dbutils.runVoidMethod ("_createtable" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblRowSourceCboResponsableNuevafaseAdicional")),(Object)(_f),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 209;BA.debugLine="DBUtils.DropTable(mSQL,\"tblRowSourceCboInfoAdicio";
Debug.ShouldStop(65536);
cnuevafasedocumento._dbutils.runVoidMethod ("_droptable" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("tblRowSourceCboInfoAdicionalNuevafase")));
 BA.debugLineNum = 210;BA.debugLine="Dim f As Map";
Debug.ShouldStop(131072);
_f = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("f", _f);
 BA.debugLineNum = 211;BA.debugLine="f.Initialize";
Debug.ShouldStop(262144);
_f.runVoidMethod ("Initialize");
 BA.debugLineNum = 212;BA.debugLine="f.Put(\"IDInfoAdicionalNuevaFase\",DBUtils.DB_INTEG";
Debug.ShouldStop(524288);
_f.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("IDInfoAdicionalNuevaFase"))),(Object)((cnuevafasedocumento._dbutils._db_integer /*RemoteObject*/ )));
 BA.debugLineNum = 213;BA.debugLine="f.Put(\"InfoAdicionalNuevaFase\",DBUtils.DB_INTEGER";
Debug.ShouldStop(1048576);
_f.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("InfoAdicionalNuevaFase"))),(Object)((cnuevafasedocumento._dbutils._db_integer /*RemoteObject*/ )));
 BA.debugLineNum = 214;BA.debugLine="DBUtils.CreateTable(mSQL,\"tblRowSourceCboInfoAdic";
Debug.ShouldStop(2097152);
cnuevafasedocumento._dbutils.runVoidMethod ("_createtable" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblRowSourceCboInfoAdicionalNuevafase")),(Object)(_f),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 216;BA.debugLine="DBUtils.DropTable(mSQL,\"tblRowSourceCboInfoAdicio";
Debug.ShouldStop(8388608);
cnuevafasedocumento._dbutils.runVoidMethod ("_droptable" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("tblRowSourceCboInfoAdicionalNuevafaseAdicional")));
 BA.debugLineNum = 217;BA.debugLine="Dim f As Map";
Debug.ShouldStop(16777216);
_f = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("f", _f);
 BA.debugLineNum = 218;BA.debugLine="f.Initialize";
Debug.ShouldStop(33554432);
_f.runVoidMethod ("Initialize");
 BA.debugLineNum = 219;BA.debugLine="f.Put(\"IDInfoAdicionalNuevaFaseAdicional\",DBUtils";
Debug.ShouldStop(67108864);
_f.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("IDInfoAdicionalNuevaFaseAdicional"))),(Object)((cnuevafasedocumento._dbutils._db_integer /*RemoteObject*/ )));
 BA.debugLineNum = 220;BA.debugLine="f.Put(\"IDInfoAdicionalNuevaFaseAdicional\",DBUtils";
Debug.ShouldStop(134217728);
_f.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("IDInfoAdicionalNuevaFaseAdicional"))),(Object)((cnuevafasedocumento._dbutils._db_integer /*RemoteObject*/ )));
 BA.debugLineNum = 221;BA.debugLine="DBUtils.CreateTable(mSQL,\"tblRowSourceCboInfoAdic";
Debug.ShouldStop(268435456);
cnuevafasedocumento._dbutils.runVoidMethod ("_createtable" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblRowSourceCboInfoAdicionalNuevafaseAdicional")),(Object)(_f),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 223;BA.debugLine="DBUtils.DropTable(mSQL,\"vwEmpleados\")";
Debug.ShouldStop(1073741824);
cnuevafasedocumento._dbutils.runVoidMethod ("_droptable" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("vwEmpleados")));
 BA.debugLineNum = 224;BA.debugLine="Dim f As Map";
Debug.ShouldStop(-2147483648);
_f = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("f", _f);
 BA.debugLineNum = 225;BA.debugLine="f.Initialize";
Debug.ShouldStop(1);
_f.runVoidMethod ("Initialize");
 BA.debugLineNum = 226;BA.debugLine="f.Put(\"IDEmpleado\",DBUtils.DB_INTEGER)";
Debug.ShouldStop(2);
_f.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("IDEmpleado"))),(Object)((cnuevafasedocumento._dbutils._db_integer /*RemoteObject*/ )));
 BA.debugLineNum = 227;BA.debugLine="f.Put(\"Empleado\",DBUtils.DB_TEXT)";
Debug.ShouldStop(4);
_f.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Empleado"))),(Object)((cnuevafasedocumento._dbutils._db_text /*RemoteObject*/ )));
 BA.debugLineNum = 228;BA.debugLine="f.Put(\"Preparacion\",DBUtils.DB_INTEGER)";
Debug.ShouldStop(8);
_f.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Preparacion"))),(Object)((cnuevafasedocumento._dbutils._db_integer /*RemoteObject*/ )));
 BA.debugLineNum = 229;BA.debugLine="DBUtils.CreateTable(mSQL,\"vwEmpleados\",f,\"\")";
Debug.ShouldStop(16);
cnuevafasedocumento._dbutils.runVoidMethod ("_createtable" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("vwEmpleados")),(Object)(_f),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 232;BA.debugLine="DBUtils.DropTable(mSQL,\"vwempleadosactivos\")";
Debug.ShouldStop(128);
cnuevafasedocumento._dbutils.runVoidMethod ("_droptable" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("vwempleadosactivos")));
 BA.debugLineNum = 233;BA.debugLine="Dim f As Map";
Debug.ShouldStop(256);
_f = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("f", _f);
 BA.debugLineNum = 234;BA.debugLine="f.Initialize";
Debug.ShouldStop(512);
_f.runVoidMethod ("Initialize");
 BA.debugLineNum = 235;BA.debugLine="f.Put(\"IDEmpleado\",DBUtils.DB_INTEGER)";
Debug.ShouldStop(1024);
_f.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("IDEmpleado"))),(Object)((cnuevafasedocumento._dbutils._db_integer /*RemoteObject*/ )));
 BA.debugLineNum = 236;BA.debugLine="f.Put(\"Empleado\",DBUtils.DB_TEXT)";
Debug.ShouldStop(2048);
_f.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Empleado"))),(Object)((cnuevafasedocumento._dbutils._db_text /*RemoteObject*/ )));
 BA.debugLineNum = 237;BA.debugLine="f.Put(\"Preparacion\",DBUtils.DB_INTEGER)";
Debug.ShouldStop(4096);
_f.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Preparacion"))),(Object)((cnuevafasedocumento._dbutils._db_integer /*RemoteObject*/ )));
 BA.debugLineNum = 238;BA.debugLine="DBUtils.CreateTable(mSQL,\"vwempleadosactivos\",f,\"";
Debug.ShouldStop(8192);
cnuevafasedocumento._dbutils.runVoidMethod ("_createtable" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("vwempleadosactivos")),(Object)(_f),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 241;BA.debugLine="DBUtils.DropTable(mSQL,\"tblTransporte\")";
Debug.ShouldStop(65536);
cnuevafasedocumento._dbutils.runVoidMethod ("_droptable" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("tblTransporte")));
 BA.debugLineNum = 242;BA.debugLine="Dim f As Map";
Debug.ShouldStop(131072);
_f = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("f", _f);
 BA.debugLineNum = 243;BA.debugLine="f.Initialize";
Debug.ShouldStop(262144);
_f.runVoidMethod ("Initialize");
 BA.debugLineNum = 244;BA.debugLine="f.Put(\"IDTransporte\",DBUtils.DB_INTEGER)";
Debug.ShouldStop(524288);
_f.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("IDTransporte"))),(Object)((cnuevafasedocumento._dbutils._db_integer /*RemoteObject*/ )));
 BA.debugLineNum = 245;BA.debugLine="f.Put(\"Transporte\",DBUtils.DB_TEXT)";
Debug.ShouldStop(1048576);
_f.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Transporte"))),(Object)((cnuevafasedocumento._dbutils._db_text /*RemoteObject*/ )));
 BA.debugLineNum = 246;BA.debugLine="f.Put(\"RequiereNumeroExpedicion\",DBUtils.DB_INTEG";
Debug.ShouldStop(2097152);
_f.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("RequiereNumeroExpedicion"))),(Object)((cnuevafasedocumento._dbutils._db_integer /*RemoteObject*/ )));
 BA.debugLineNum = 247;BA.debugLine="DBUtils.CreateTable(mSQL,\"tblTransporte\",f,\"\")";
Debug.ShouldStop(4194304);
cnuevafasedocumento._dbutils.runVoidMethod ("_createtable" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblTransporte")),(Object)(_f),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 250;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _faseadicionalvisible(RemoteObject __ref,RemoteObject _visible) throws Exception{
try {
		Debug.PushSubsStack("FaseAdicionalVisible (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,880);
if (RapidSub.canDelegate("faseadicionalvisible")) { return __ref.runUserSub(false, "cnuevafasedocumento","faseadicionalvisible", __ref, _visible);}
Debug.locals.put("Visible", _visible);
 BA.debugLineNum = 880;BA.debugLine="Sub FaseAdicionalVisible(Visible As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 893;BA.debugLine="pnlNuevaFaseComplementaria.Visible=Visible";
Debug.ShouldStop(268435456);
__ref.getField(false,"_pnlnuevafasecomplementaria" /*RemoteObject*/ ).runMethod(true,"setVisible",_visible);
 BA.debugLineNum = 894;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("frm_CloseRequest (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "cnuevafasedocumento","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 91;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="EventData.Consume";
Debug.ShouldStop(134217728);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdatefromheaders(RemoteObject __ref,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("GetDateFromHeaders (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1409);
if (RapidSub.canDelegate("getdatefromheaders")) { return __ref.runUserSub(false, "cnuevafasedocumento","getdatefromheaders", __ref, _url);}
ResumableSub_GetDateFromHeaders rsub = new ResumableSub_GetDateFromHeaders(null,__ref,_url);
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
public static class ResumableSub_GetDateFromHeaders extends BA.ResumableSub {
public ResumableSub_GetDateFromHeaders(b4j.docU.cnuevafasedocumento parent,RemoteObject __ref,RemoteObject _url) {
this.parent = parent;
this.__ref = __ref;
this._url = _url;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cnuevafasedocumento parent;
RemoteObject _url;
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _res = RemoteObject.createImmutable(0L);
RemoteObject _date = RemoteObject.createImmutable("");
RemoteObject _f = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetDateFromHeaders (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1409);
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
Debug.locals.put("Url", _url);
 BA.debugLineNum = 1410;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(2);
_j = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 1411;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(4);
_j.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 1412;BA.debugLine="j.Download(Url)";
Debug.ShouldStop(8);
_j.runClassMethod (b4j.docU.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_url));
 BA.debugLineNum = 1413;BA.debugLine="Dim res As Long";
Debug.ShouldStop(16);
_res = RemoteObject.createImmutable(0L);Debug.locals.put("res", _res);
 BA.debugLineNum = 1414;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "getdatefromheaders"), (_j));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1415;BA.debugLine="If j.Success Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 14;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1416;BA.debugLine="If j.Response.GetHeaders.ContainsKey(\"date";
Debug.ShouldStop(128);
if (true) break;

case 4:
//if
this.state = 13;
if (_j.getField(false,"_response" /*RemoteObject*/ ).runMethod(false,"GetHeaders").runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("date")))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1417;BA.debugLine="Dim date As String = j.Response.GetHea";
Debug.ShouldStop(256);
_date = BA.ObjectToString(_j.getField(false,"_response" /*RemoteObject*/ ).runMethod(false,"GetHeaders").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("date")))));Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 1418;BA.debugLine="date = date.Replace(\"[\", \"\").Replace(\"";
Debug.ShouldStop(512);
_date = _date.runMethod(true,"replace",(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString("]")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("date", _date);
 BA.debugLineNum = 1419;BA.debugLine="Dim f As String = DateTime.DateFormat";
Debug.ShouldStop(1024);
_f = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 1420;BA.debugLine="Try";
Debug.ShouldStop(2048);
if (true) break;

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
 BA.debugLineNum = 1421;BA.debugLine="DateTime.DateFormat = \"EEE, dd MMM";
Debug.ShouldStop(4096);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("EEE, dd MMM yyyy HH:mm:ss z"));
 BA.debugLineNum = 1422;BA.debugLine="res = DateTime.DateParse(date)";
Debug.ShouldStop(8192);
_res = parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_date));Debug.locals.put("res", _res);
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 1424;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","897976335",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 0;
;
 BA.debugLineNum = 1426;BA.debugLine="DateTime.DateFormat = f";
Debug.ShouldStop(131072);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_f);
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
 BA.debugLineNum = 1429;BA.debugLine="j.Release";
Debug.ShouldStop(1048576);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1430;BA.debugLine="Return res";
Debug.ShouldStop(2097152);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_res));return;};
 BA.debugLineNum = 1431;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _j) throws Exception{
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _parent,RemoteObject _documento,RemoteObject _tipodocumento,RemoteObject _destinatariotaller,RemoteObject _ordenfab) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cnuevafasedocumento","initialize", __ref, _ba, _callback, _parent, _documento, _tipodocumento, _destinatariotaller, _ordenfab);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("CallBack", _callback);
Debug.locals.put("Parent", _parent);
Debug.locals.put("Documento", _documento);
Debug.locals.put("TipoDocumento", _tipodocumento);
Debug.locals.put("DestinatarioTaller", _destinatariotaller);
Debug.locals.put("OrdenFab", _ordenfab);
 BA.debugLineNum = 67;BA.debugLine="Public Sub Initialize(CallBack As Object, Parent A";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="mCallBack=CallBack";
Debug.ShouldStop(8);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 69;BA.debugLine="mParent=Parent";
Debug.ShouldStop(16);
__ref.setField ("_mparent" /*RemoteObject*/ ,_parent);
 BA.debugLineNum = 70;BA.debugLine="Background= xui.CreatePanel(\"background\")";
Debug.ShouldStop(32);
__ref.setField ("_background" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("background"))));
 BA.debugLineNum = 71;BA.debugLine="Background.Tag = \"b4xdialog_background\"";
Debug.ShouldStop(64);
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(false,"setTag",RemoteObject.createImmutable(("b4xdialog_background")));
 BA.debugLineNum = 72;BA.debugLine="Background.Color=0xaa000000";
Debug.ShouldStop(128);
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xaa000000)));
 BA.debugLineNum = 73;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
Debug.ShouldStop(256);
__ref.getField(false,"_mparent" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_background" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 76;BA.debugLine="mDocumentoSel=Documento";
Debug.ShouldStop(2048);
__ref.setField ("_mdocumentosel" /*RemoteObject*/ ,_documento);
 BA.debugLineNum = 77;BA.debugLine="mTipoDocumento=TipoDocumento";
Debug.ShouldStop(4096);
__ref.setField ("_mtipodocumento" /*RemoteObject*/ ,_tipodocumento);
 BA.debugLineNum = 78;BA.debugLine="mDestinatarioTaller=DestinatarioTaller";
Debug.ShouldStop(8192);
__ref.setField ("_mdestinatariotaller" /*RemoteObject*/ ,_destinatariotaller);
 BA.debugLineNum = 79;BA.debugLine="mOrdenFab=OrdenFab";
Debug.ShouldStop(16384);
__ref.setField ("_mordenfab" /*RemoteObject*/ ,_ordenfab);
 BA.debugLineNum = 81;BA.debugLine="If mSQL.IsInitialized Then mSQL.close";
Debug.ShouldStop(65536);
if (__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("Close");};
 BA.debugLineNum = 83;BA.debugLine="mNuevaFaseDocumento.Initialize";
Debug.ShouldStop(262144);
__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 84;BA.debugLine="NuevaFaseDocumentoRegistrada=False";
Debug.ShouldStop(524288);
__ref.setField ("_nuevafasedocumentoregistrada" /*RemoteObject*/ ,cnuevafasedocumento.__c.getField(true,"False"));
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _loaddatosb4xsearchlist(RemoteObject __ref,RemoteObject _tipoquery,RemoteObject _sclssource,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("LoadDatosB4xSearchList (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,476);
if (RapidSub.canDelegate("loaddatosb4xsearchlist")) { __ref.runUserSub(false, "cnuevafasedocumento","loaddatosb4xsearchlist", __ref, _tipoquery, _sclssource, _id); return;}
ResumableSub_LoadDatosB4xSearchList rsub = new ResumableSub_LoadDatosB4xSearchList(null,__ref,_tipoquery,_sclssource,_id);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LoadDatosB4xSearchList extends BA.ResumableSub {
public ResumableSub_LoadDatosB4xSearchList(b4j.docU.cnuevafasedocumento parent,RemoteObject __ref,RemoteObject _tipoquery,RemoteObject _sclssource,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._tipoquery = _tipoquery;
this._sclssource = _sclssource;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cnuevafasedocumento parent;
RemoteObject _tipoquery;
RemoteObject _sclssource;
RemoteObject _id;
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _lstopcionesmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstopciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _msel = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
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
RemoteObject _indexsel = RemoteObject.createImmutable(0);
RemoteObject _mdatasel = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _idsel = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LoadDatosB4xSearchList (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,476);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("TipoQuery", _tipoquery);
Debug.locals.put("sClsSource", _sclssource);
Debug.locals.put("ID", _id);
 BA.debugLineNum = 478;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(536870912);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 479;BA.debugLine="If TipoQuery=1 Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_tipoquery,BA.numberCast(double.class, 1))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 480;BA.debugLine="rs=mSQL.ExecQuery(sClsSource)";
Debug.ShouldStop(-2147483648);
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(_sclssource));Debug.locals.put("rs", _rs);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 482;BA.debugLine="rs=mSQL.ExecQuery2(sClsSource,Array As String(ID";
Debug.ShouldStop(2);
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)(_sclssource),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_id)})))));Debug.locals.put("rs", _rs);
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 485;BA.debugLine="Dim lstOpcionesMap As List";
Debug.ShouldStop(16);
_lstopcionesmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstOpcionesMap", _lstopcionesmap);
 BA.debugLineNum = 486;BA.debugLine="lstOpcionesMap.Initialize";
Debug.ShouldStop(32);
_lstopcionesmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 488;BA.debugLine="Dim lstOpciones As List";
Debug.ShouldStop(128);
_lstopciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstOpciones", _lstopciones);
 BA.debugLineNum = 489;BA.debugLine="lstOpciones.Initialize";
Debug.ShouldStop(256);
_lstopciones.runVoidMethod ("Initialize");
 BA.debugLineNum = 491;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(1024);
if (true) break;

case 7:
//do while
this.state = 10;
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 9;
if (true) break;
}
if (true) break;

case 9:
//C
this.state = 7;
 BA.debugLineNum = 492;BA.debugLine="Dim mSel As Map";
Debug.ShouldStop(2048);
_msel = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mSel", _msel);
 BA.debugLineNum = 493;BA.debugLine="mSel.Initialize";
Debug.ShouldStop(4096);
_msel.runVoidMethod ("Initialize");
 BA.debugLineNum = 494;BA.debugLine="mSel.Put(\"ID\",rs.getint2(0))";
Debug.ShouldStop(8192);
_msel.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ID"))),(Object)((_rs.runMethod(true,"GetInt2",(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 495;BA.debugLine="mSel.Put(\"Sel\",rs.getstring2(1))";
Debug.ShouldStop(16384);
_msel.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Sel"))),(Object)((_rs.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 496;BA.debugLine="lstOpcionesMap.Add(mSel)";
Debug.ShouldStop(32768);
_lstopcionesmap.runVoidMethod ("Add",(Object)((_msel.getObject())));
 BA.debugLineNum = 497;BA.debugLine="lstOpciones.Add(rs.getstring2(1))";
Debug.ShouldStop(65536);
_lstopciones.runVoidMethod ("Add",(Object)((_rs.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 1))))));
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 499;BA.debugLine="rs.Close";
Debug.ShouldStop(262144);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 501;BA.debugLine="Dialog.Title=\"Selecciona Opción\"";
Debug.ShouldStop(1048576);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona Opción")));
 BA.debugLineNum = 502;BA.debugLine="Dialog.TitleBarHeight=50dip";
Debug.ShouldStop(2097152);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 503;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 18))));
 BA.debugLineNum = 504;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonsfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 508;BA.debugLine="Dim B4XSearchListDlg As B4XSearchTemplate";
Debug.ShouldStop(134217728);
_b4xsearchlistdlg = RemoteObject.createNew ("b4j.docU.b4xsearchtemplate");Debug.locals.put("B4XSearchListDlg", _b4xsearchlistdlg);
 BA.debugLineNum = 509;BA.debugLine="B4XSearchListDlg.Initialize";
Debug.ShouldStop(268435456);
_b4xsearchlistdlg.runClassMethod (b4j.docU.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 510;BA.debugLine="B4XSearchListDlg.SetItems(lstOpciones)";
Debug.ShouldStop(536870912);
_b4xsearchlistdlg.runClassMethod (b4j.docU.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_lstopciones));
 BA.debugLineNum = 511;BA.debugLine="B4XSearchListDlg.SearchField.HintText=\"Buscar\"";
Debug.ShouldStop(1073741824);
_b4xsearchlistdlg.getField(false,"_searchfield" /*RemoteObject*/ ).setField ("_hinttext" /*RemoteObject*/ ,BA.ObjectToString("Buscar"));
 BA.debugLineNum = 512;BA.debugLine="B4XSearchListDlg.SearchField.Update";
Debug.ShouldStop(-2147483648);
_b4xsearchlistdlg.getField(false,"_searchfield" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xfloattextfield.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 513;BA.debugLine="B4XSearchListDlg.ItemHightlightColor=0xFF87CEFA";
Debug.ShouldStop(1);
_b4xsearchlistdlg.setField ("_itemhightlightcolor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff87cefa)));
 BA.debugLineNum = 514;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XS";
Debug.ShouldStop(2);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xsearchlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 517;BA.debugLine="Dim btCancelDlg As B4XView=Dialog.GetButton(xui.D";
Debug.ShouldStop(16);
_btcanceldlg = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_btcanceldlg = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("btCancelDlg", _btcanceldlg);Debug.locals.put("btCancelDlg", _btcanceldlg);
 BA.debugLineNum = 518;BA.debugLine="btCancelDlg.TextSize=14";
Debug.ShouldStop(32);
_btcanceldlg.runMethod(true,"setTextSize",BA.numberCast(double.class, 14));
 BA.debugLineNum = 521;BA.debugLine="Utilidades.SetLightThemeDialog(Dialog)";
Debug.ShouldStop(256);
parent._utilidades.runVoidMethod ("_setlightthemedialog" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_dialog" /*RemoteObject*/ )));
 BA.debugLineNum = 522;BA.debugLine="Utilidades.SetLightThemeSearch(B4XSearchListDlg)";
Debug.ShouldStop(512);
parent._utilidades.runVoidMethod ("_setlightthemesearch" /*RemoteObject*/ ,(Object)(_b4xsearchlistdlg));
 BA.debugLineNum = 524;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
Debug.ShouldStop(2048);
_textsize = BA.numberCast(float.class, 18);Debug.locals.put("TextSize", _textsize);Debug.locals.put("TextSize", _textsize);
 BA.debugLineNum = 525;BA.debugLine="Dim xclv As CustomListView=B4XSearchListDlg.Custo";
Debug.ShouldStop(4096);
_xclv = _b4xsearchlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ );Debug.locals.put("xclv", _xclv);Debug.locals.put("xclv", _xclv);
 BA.debugLineNum = 526;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Gr";
Debug.ShouldStop(8192);
_xclv.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Gray"));
 BA.debugLineNum = 531;BA.debugLine="B4XSearchListDlg.Resize(400dip,0.75*Dialog.mParen";
Debug.ShouldStop(262144);
_b4xsearchlistdlg.runClassMethod (b4j.docU.b4xsearchtemplate.class, "_resize" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 400)))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.75),__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 0))));
 BA.debugLineNum = 533;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XS";
Debug.ShouldStop(1048576);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xsearchlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 539;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
Debug.ShouldStop(67108864);
_dlbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_dlbl = _xclv.getField(false,"_designerlabel");Debug.locals.put("dlbl", _dlbl);Debug.locals.put("dlbl", _dlbl);
 BA.debugLineNum = 540;BA.debugLine="dlbl.TextSize=TextSize";
Debug.ShouldStop(134217728);
_dlbl.runMethod(true,"setTextSize",BA.numberCast(double.class, _textsize));
 BA.debugLineNum = 541;BA.debugLine="Dim lblB4Xv As B4XView=dlbl";
Debug.ShouldStop(268435456);
_lblb4xv = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lblb4xv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _dlbl.getObject());Debug.locals.put("lblB4Xv", _lblb4xv);Debug.locals.put("lblB4Xv", _lblb4xv);
 BA.debugLineNum = 542;BA.debugLine="lblB4Xv.SetTextAlignment(\"CENTER\",\"LEFT\")";
Debug.ShouldStop(536870912);
_lblb4xv.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("LEFT")));
 BA.debugLineNum = 544;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(-2147483648);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 545;BA.debugLine="If bCancel.IsInitialized Then";
Debug.ShouldStop(1);
if (true) break;

case 11:
//if
this.state = 14;
if (_bcancel.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 546;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
Debug.ShouldStop(2);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 0));
 BA.debugLineNum = 547;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
Debug.ShouldStop(4);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 0));
 BA.debugLineNum = 548;BA.debugLine="bCancel.TextSize=18";
Debug.ShouldStop(8);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 551;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "loaddatosb4xsearchlist"), _rsub);
this.state = 21;
return;
case 21:
//C
this.state = 15;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 552;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(128);
if (true) break;

case 15:
//if
this.state = 20;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 17;
;}if (true) break;

case 17:
//C
this.state = 20;
if (true) return ;
if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 554;BA.debugLine="Dim sOpcionSel As String=B4XSearchListDlg.Selecte";
Debug.ShouldStop(512);
_sopcionsel = _b4xsearchlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("sOpcionSel", _sopcionsel);Debug.locals.put("sOpcionSel", _sopcionsel);
 BA.debugLineNum = 555;BA.debugLine="Dim IndexSel As Int=lstOpciones.IndexOf(sOpcionSe";
Debug.ShouldStop(1024);
_indexsel = _lstopciones.runMethod(true,"IndexOf",(Object)((_sopcionsel)));Debug.locals.put("IndexSel", _indexsel);Debug.locals.put("IndexSel", _indexsel);
 BA.debugLineNum = 556;BA.debugLine="Dim mDataSel As Map=lstOpcionesMap.Get(IndexSel)";
Debug.ShouldStop(2048);
_mdatasel = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdatasel = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstopcionesmap.runMethod(false,"Get",(Object)(_indexsel)));Debug.locals.put("mDataSel", _mdatasel);Debug.locals.put("mDataSel", _mdatasel);
 BA.debugLineNum = 557;BA.debugLine="Dim IDSel As Int=mDataSel.Get(\"ID\")";
Debug.ShouldStop(4096);
_idsel = BA.numberCast(int.class, _mdatasel.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ID")))));Debug.locals.put("IDSel", _idsel);Debug.locals.put("IDSel", _idsel);
 BA.debugLineNum = 574;BA.debugLine="ActualizarDatosOpcionSeleccionada(IDSel,sOpcionSe";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_actualizardatosopcionseleccionada" /*RemoteObject*/ ,(Object)(_idsel),(Object)(_sopcionsel));
 BA.debugLineNum = 576;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
public static RemoteObject  _preloaddatoscls(RemoteObject __ref,RemoteObject _tipoquery,RemoteObject _sclssource,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("PreLoadDatosCls (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,459);
if (RapidSub.canDelegate("preloaddatoscls")) { return __ref.runUserSub(false, "cnuevafasedocumento","preloaddatoscls", __ref, _tipoquery, _sclssource, _id);}
RemoteObject _lstclss = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("tipoQuery", _tipoquery);
Debug.locals.put("sClsSource", _sclssource);
Debug.locals.put("ID", _id);
 BA.debugLineNum = 459;BA.debugLine="Sub PreLoadDatosCls(tipoQuery As Int, sClsSource A";
Debug.ShouldStop(1024);
 BA.debugLineNum = 460;BA.debugLine="TipoQryCls=tipoQuery";
Debug.ShouldStop(2048);
__ref.setField ("_tipoqrycls" /*RemoteObject*/ ,BA.NumberToString(_tipoquery));
 BA.debugLineNum = 461;BA.debugLine="stringSourceTableCls=sClsSource";
Debug.ShouldStop(4096);
__ref.setField ("_stringsourcetablecls" /*RemoteObject*/ ,_sclssource);
 BA.debugLineNum = 462;BA.debugLine="IDDatosCls=ID";
Debug.ShouldStop(8192);
__ref.setField ("_iddatoscls" /*RemoteObject*/ ,_id);
 BA.debugLineNum = 464;BA.debugLine="Dim lstClsS As List= Regex.Split(\" \",sClsSource.S";
Debug.ShouldStop(32768);
_lstclss = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstclss = cnuevafasedocumento.__c.runMethod(false, "ArrayToList", (Object)(cnuevafasedocumento.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(" ")),(Object)(_sclssource.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_sclssource.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("from"))),RemoteObject.createImmutable(5)}, "+",1, 1)))))));Debug.locals.put("lstClsS", _lstclss);Debug.locals.put("lstClsS", _lstclss);
 BA.debugLineNum = 465;BA.debugLine="SourceTableCls=lstClsS.Get(0)";
Debug.ShouldStop(65536);
__ref.setField ("_sourcetablecls" /*RemoteObject*/ ,BA.ObjectToString(_lstclss.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 467;BA.debugLine="If mSQL.ExecQuerySingleResult(\"select count(*) fr";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult",(Object)(RemoteObject.concat(RemoteObject.createImmutable("select count(*) from "),__ref.getField(true,"_sourcetablecls" /*RemoteObject*/ )))),BA.NumberToString(0))) { 
 BA.debugLineNum = 468;BA.debugLine="CallSub(Me,SourceTableCls)";
Debug.ShouldStop(524288);
cnuevafasedocumento.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref),(Object)(__ref.getField(true,"_sourcetablecls" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 470;BA.debugLine="LoadDatosB4xSearchList(tipoQuery, sClsSource, ID";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_loaddatosb4xsearchlist" /*void*/ ,(Object)(_tipoquery),(Object)(_sclssource),(Object)(_id));
 };
 BA.debugLineNum = 473;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _registronuevafase(RemoteObject __ref,RemoteObject _idfase,RemoteObject _fchmv,RemoteObject _idrfase,RemoteObject _responsfase,RemoteObject _idiafase,RemoteObject _numexpfase) throws Exception{
try {
		Debug.PushSubsStack("RegistroNuevaFase (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1345);
if (RapidSub.canDelegate("registronuevafase")) { return __ref.runUserSub(false, "cnuevafasedocumento","registronuevafase", __ref, _idfase, _fchmv, _idrfase, _responsfase, _idiafase, _numexpfase);}
ResumableSub_RegistroNuevaFase rsub = new ResumableSub_RegistroNuevaFase(null,__ref,_idfase,_fchmv,_idrfase,_responsfase,_idiafase,_numexpfase);
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
public static class ResumableSub_RegistroNuevaFase extends BA.ResumableSub {
public ResumableSub_RegistroNuevaFase(b4j.docU.cnuevafasedocumento parent,RemoteObject __ref,RemoteObject _idfase,RemoteObject _fchmv,RemoteObject _idrfase,RemoteObject _responsfase,RemoteObject _idiafase,RemoteObject _numexpfase) {
this.parent = parent;
this.__ref = __ref;
this._idfase = _idfase;
this._fchmv = _fchmv;
this._idrfase = _idrfase;
this._responsfase = _responsfase;
this._idiafase = _idiafase;
this._numexpfase = _numexpfase;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cnuevafasedocumento parent;
RemoteObject _idfase;
RemoteObject _fchmv;
RemoteObject _idrfase;
RemoteObject _responsfase;
RemoteObject _idiafase;
RemoteObject _numexpfase;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _slinkjrdc = RemoteObject.createImmutable("");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mresp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sresp = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RegistroNuevaFase (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1345);
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
Debug.locals.put("IDFase", _idfase);
Debug.locals.put("Fchmv", _fchmv);
Debug.locals.put("IDRFase", _idrfase);
Debug.locals.put("ResponsFase", _responsfase);
Debug.locals.put("IDIAFase", _idiafase);
Debug.locals.put("NumExpFase", _numexpfase);
 BA.debugLineNum = 1348;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(8);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1349;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
Debug.ShouldStop(16);
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ;Debug.locals.put("sLinkJRDC", _slinkjrdc);Debug.locals.put("sLinkJRDC", _slinkjrdc);
 BA.debugLineNum = 1350;BA.debugLine="Dim Comando As String=\"NuevaFaseDoc\"";
Debug.ShouldStop(32);
_comando = BA.ObjectToString("NuevaFaseDoc");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 1352;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(mTipo";
Debug.ShouldStop(128);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_slinkjrdc),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {10},new Object[] {(__ref.getField(true,"_mtipodocumento" /*RemoteObject*/ )),(__ref.getField(true,"_mdocumentosel" /*RemoteObject*/ )),(_idfase),(_fchmv),(_idrfase),(_responsfase),(_idiafase),(_numexpfase),RemoteObject.createImmutable((1)),RemoteObject.createImmutable((0))})),(Object)(__ref));
 BA.debugLineNum = 1354;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "registronuevafase"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1355;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 18;
 BA.debugLineNum = 1356;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1357;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "registronuevafase"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
 BA.debugLineNum = 1358;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(8192);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1360;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(32768);
if (true) break;

case 6:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 17;
 BA.debugLineNum = 1362;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(131072);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1363;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido p";
Debug.ShouldStop(262144);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible registrar la nueva fase de documento.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1364;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "registronuevafase"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 17;
;
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1366;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(2097152);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1367;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
Debug.ShouldStop(4194304);
_mresp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mresp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mResp", _mresp);Debug.locals.put("mResp", _mresp);
 BA.debugLineNum = 1368;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
Debug.ShouldStop(8388608);
_sresp = BA.ObjectToString(_mresp.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("sResp", _sresp);Debug.locals.put("sResp", _sresp);
 BA.debugLineNum = 1369;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERR\") Then";
Debug.ShouldStop(16777216);
if (true) break;

case 11:
//if
this.state = 16;
if (_sresp.runMethod(true,"toUpperCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERR"))).<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 1370;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
Debug.ShouldStop(33554432);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible registrar la nueva fase de documento.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1371;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "registronuevafase"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
 BA.debugLineNum = 1372;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(134217728);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1374;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(536870912);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1375;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Se ha regis";
Debug.ShouldStop(1073741824);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Se ha registrado la nueva fase de documento.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1376;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "registronuevafase"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 17;
;
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
 BA.debugLineNum = 1381;BA.debugLine="Return Accion";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 BA.debugLineNum = 1383;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
public static RemoteObject  _registropreparacion(RemoteObject __ref,RemoteObject _idfaseprep,RemoteObject _idrfprep,RemoteObject _respfprep,RemoteObject _idfase,RemoteObject _fchmv,RemoteObject _idrfase,RemoteObject _responsfase,RemoteObject _idiafase,RemoteObject _numexpfase) throws Exception{
try {
		Debug.PushSubsStack("RegistroPreparacion (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1268);
if (RapidSub.canDelegate("registropreparacion")) { return __ref.runUserSub(false, "cnuevafasedocumento","registropreparacion", __ref, _idfaseprep, _idrfprep, _respfprep, _idfase, _fchmv, _idrfase, _responsfase, _idiafase, _numexpfase);}
ResumableSub_RegistroPreparacion rsub = new ResumableSub_RegistroPreparacion(null,__ref,_idfaseprep,_idrfprep,_respfprep,_idfase,_fchmv,_idrfase,_responsfase,_idiafase,_numexpfase);
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
public static class ResumableSub_RegistroPreparacion extends BA.ResumableSub {
public ResumableSub_RegistroPreparacion(b4j.docU.cnuevafasedocumento parent,RemoteObject __ref,RemoteObject _idfaseprep,RemoteObject _idrfprep,RemoteObject _respfprep,RemoteObject _idfase,RemoteObject _fchmv,RemoteObject _idrfase,RemoteObject _responsfase,RemoteObject _idiafase,RemoteObject _numexpfase) {
this.parent = parent;
this.__ref = __ref;
this._idfaseprep = _idfaseprep;
this._idrfprep = _idrfprep;
this._respfprep = _respfprep;
this._idfase = _idfase;
this._fchmv = _fchmv;
this._idrfase = _idrfase;
this._responsfase = _responsfase;
this._idiafase = _idiafase;
this._numexpfase = _numexpfase;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cnuevafasedocumento parent;
RemoteObject _idfaseprep;
RemoteObject _idrfprep;
RemoteObject _respfprep;
RemoteObject _idfase;
RemoteObject _fchmv;
RemoteObject _idrfase;
RemoteObject _responsfase;
RemoteObject _idiafase;
RemoteObject _numexpfase;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _slinkjrdc = RemoteObject.createImmutable("");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mresp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sresp = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RegistroPreparacion (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1268);
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
Debug.locals.put("IDFasePrep", _idfaseprep);
Debug.locals.put("IDRFPrep", _idrfprep);
Debug.locals.put("RespFPrep", _respfprep);
Debug.locals.put("IDFase", _idfase);
Debug.locals.put("Fchmv", _fchmv);
Debug.locals.put("IDRFase", _idrfase);
Debug.locals.put("ResponsFase", _responsfase);
Debug.locals.put("IDIAFase", _idiafase);
Debug.locals.put("NumExpFase", _numexpfase);
 BA.debugLineNum = 1270;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(2097152);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1271;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
Debug.ShouldStop(4194304);
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ;Debug.locals.put("sLinkJRDC", _slinkjrdc);Debug.locals.put("sLinkJRDC", _slinkjrdc);
 BA.debugLineNum = 1272;BA.debugLine="Dim Comando As String=\"NuevaFasePreparacionDoc\"";
Debug.ShouldStop(8388608);
_comando = BA.ObjectToString("NuevaFasePreparacionDoc");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 1274;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(mDocu";
Debug.ShouldStop(33554432);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_slinkjrdc),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {12},new Object[] {(__ref.getField(true,"_mdocumentosel" /*RemoteObject*/ )),(_idfaseprep),(_idrfprep),(_respfprep),(_idfase),(_fchmv),(_idrfase),(_responsfase),(_idiafase),(_numexpfase),RemoteObject.createImmutable((1)),RemoteObject.createImmutable((0))})),(Object)(__ref));
 BA.debugLineNum = 1276;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "registropreparacion"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1277;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 18;
 BA.debugLineNum = 1278;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(536870912);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1279;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "registropreparacion"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
 BA.debugLineNum = 1280;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(-2147483648);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1282;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(2);
if (true) break;

case 6:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 17;
 BA.debugLineNum = 1284;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(8);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1285;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido p";
Debug.ShouldStop(16);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible registrar la nueva fase de documento.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1286;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "registropreparacion"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 17;
;
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1288;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(128);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1289;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
Debug.ShouldStop(256);
_mresp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mresp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mResp", _mresp);Debug.locals.put("mResp", _mresp);
 BA.debugLineNum = 1290;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
Debug.ShouldStop(512);
_sresp = BA.ObjectToString(_mresp.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("sResp", _sresp);Debug.locals.put("sResp", _sresp);
 BA.debugLineNum = 1291;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERR\") Then";
Debug.ShouldStop(1024);
if (true) break;

case 11:
//if
this.state = 16;
if (_sresp.runMethod(true,"toUpperCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERR"))).<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 1292;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible registrar la nueva fase de documento.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1293;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "registropreparacion"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
 BA.debugLineNum = 1294;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(8192);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1296;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Se ha regis";
Debug.ShouldStop(32768);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Se ha registrado la nueva fase de documento.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1297;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "registropreparacion"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 16;
;
 BA.debugLineNum = 1298;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(131072);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 16:
//C
this.state = 17;
;
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
 BA.debugLineNum = 1303;BA.debugLine="Return Accion";
Debug.ShouldStop(4194304);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 BA.debugLineNum = 1305;BA.debugLine="End Sub";
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
public static RemoteObject  _registropreparacionrtfab(RemoteObject __ref,RemoteObject _idfaseprep,RemoteObject _idrfprep,RemoteObject _respfprep,RemoteObject _idfase,RemoteObject _fchmv,RemoteObject _idrfase,RemoteObject _responsfase,RemoteObject _idiafase,RemoteObject _numexpfase,RemoteObject _pedfab) throws Exception{
try {
		Debug.PushSubsStack("RegistroPreparacionRTFab (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1307);
if (RapidSub.canDelegate("registropreparacionrtfab")) { return __ref.runUserSub(false, "cnuevafasedocumento","registropreparacionrtfab", __ref, _idfaseprep, _idrfprep, _respfprep, _idfase, _fchmv, _idrfase, _responsfase, _idiafase, _numexpfase, _pedfab);}
ResumableSub_RegistroPreparacionRTFab rsub = new ResumableSub_RegistroPreparacionRTFab(null,__ref,_idfaseprep,_idrfprep,_respfprep,_idfase,_fchmv,_idrfase,_responsfase,_idiafase,_numexpfase,_pedfab);
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
public static class ResumableSub_RegistroPreparacionRTFab extends BA.ResumableSub {
public ResumableSub_RegistroPreparacionRTFab(b4j.docU.cnuevafasedocumento parent,RemoteObject __ref,RemoteObject _idfaseprep,RemoteObject _idrfprep,RemoteObject _respfprep,RemoteObject _idfase,RemoteObject _fchmv,RemoteObject _idrfase,RemoteObject _responsfase,RemoteObject _idiafase,RemoteObject _numexpfase,RemoteObject _pedfab) {
this.parent = parent;
this.__ref = __ref;
this._idfaseprep = _idfaseprep;
this._idrfprep = _idrfprep;
this._respfprep = _respfprep;
this._idfase = _idfase;
this._fchmv = _fchmv;
this._idrfase = _idrfase;
this._responsfase = _responsfase;
this._idiafase = _idiafase;
this._numexpfase = _numexpfase;
this._pedfab = _pedfab;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cnuevafasedocumento parent;
RemoteObject _idfaseprep;
RemoteObject _idrfprep;
RemoteObject _respfprep;
RemoteObject _idfase;
RemoteObject _fchmv;
RemoteObject _idrfase;
RemoteObject _responsfase;
RemoteObject _idiafase;
RemoteObject _numexpfase;
RemoteObject _pedfab;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _slinkjrdc = RemoteObject.createImmutable("");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mresp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sresp = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RegistroPreparacionRTFab (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1307);
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
Debug.locals.put("IDFasePrep", _idfaseprep);
Debug.locals.put("IDRFPrep", _idrfprep);
Debug.locals.put("RespFPrep", _respfprep);
Debug.locals.put("IDFase", _idfase);
Debug.locals.put("Fchmv", _fchmv);
Debug.locals.put("IDRFase", _idrfase);
Debug.locals.put("ResponsFase", _responsfase);
Debug.locals.put("IDIAFase", _idiafase);
Debug.locals.put("NumExpFase", _numexpfase);
Debug.locals.put("PedFab", _pedfab);
 BA.debugLineNum = 1309;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(268435456);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1310;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
Debug.ShouldStop(536870912);
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ;Debug.locals.put("sLinkJRDC", _slinkjrdc);Debug.locals.put("sLinkJRDC", _slinkjrdc);
 BA.debugLineNum = 1311;BA.debugLine="Dim Comando As String=\"NuevaFasePreparacionDocRTF";
Debug.ShouldStop(1073741824);
_comando = BA.ObjectToString("NuevaFasePreparacionDocRTFab");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 1313;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(mDocu";
Debug.ShouldStop(1);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_slinkjrdc),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {13},new Object[] {(__ref.getField(true,"_mdocumentosel" /*RemoteObject*/ )),(_idfaseprep),(_idrfprep),(_respfprep),(_idfase),(_fchmv),(_idrfase),(_responsfase),(_idiafase),(_numexpfase),RemoteObject.createImmutable((1)),RemoteObject.createImmutable((0)),(_pedfab)})),(Object)(__ref));
 BA.debugLineNum = 1315;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "registropreparacionrtfab"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1316;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 18;
 BA.debugLineNum = 1317;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(16);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1318;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "registropreparacionrtfab"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
 BA.debugLineNum = 1319;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(64);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1321;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(256);
if (true) break;

case 6:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 17;
 BA.debugLineNum = 1323;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(1024);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1324;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido p";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible registrar la nueva fase de documento.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1325;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "registropreparacionrtfab"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 17;
;
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1327;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(16384);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1328;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
Debug.ShouldStop(32768);
_mresp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mresp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mResp", _mresp);Debug.locals.put("mResp", _mresp);
 BA.debugLineNum = 1329;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
Debug.ShouldStop(65536);
_sresp = BA.ObjectToString(_mresp.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("sResp", _sresp);Debug.locals.put("sResp", _sresp);
 BA.debugLineNum = 1330;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERR\") Then";
Debug.ShouldStop(131072);
if (true) break;

case 11:
//if
this.state = 16;
if (_sresp.runMethod(true,"toUpperCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERR"))).<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 1331;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
Debug.ShouldStop(262144);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible registrar la nueva fase de documento.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1332;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "registropreparacionrtfab"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
 BA.debugLineNum = 1333;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(1048576);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1335;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(4194304);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1336;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Se ha regis";
Debug.ShouldStop(8388608);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Se ha registrado la nueva fase de documento.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1337;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "registropreparacionrtfab"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 17;
;
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
 BA.debugLineNum = 1342;BA.debugLine="Return Accion";
Debug.ShouldStop(536870912);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 BA.debugLineNum = 1343;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
public static RemoteObject  _resetnuevafase(RemoteObject __ref,RemoteObject _resetfechafase) throws Exception{
try {
		Debug.PushSubsStack("ResetNuevaFase (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,380);
if (RapidSub.canDelegate("resetnuevafase")) { return __ref.runUserSub(false, "cnuevafasedocumento","resetnuevafase", __ref, _resetfechafase);}
RemoteObject _fechaactualfase = RemoteObject.createImmutable(0L);
RemoteObject _dateformatant = RemoteObject.createImmutable("");
Debug.locals.put("ResetFechaFase", _resetfechafase);
 BA.debugLineNum = 380;BA.debugLine="Sub ResetNuevaFase(ResetFechaFase As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 382;BA.debugLine="Dim FechaActualFase As Long=mNuevaFaseDocumento.F";
Debug.ShouldStop(536870912);
_fechaactualfase = __ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"FechaFase" /*RemoteObject*/ );Debug.locals.put("FechaActualFase", _fechaactualfase);Debug.locals.put("FechaActualFase", _fechaactualfase);
 BA.debugLineNum = 383;BA.debugLine="mNuevaFaseDocumento.Initialize";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 385;BA.debugLine="If ResetFechaFase Then";
Debug.ShouldStop(1);
if (_resetfechafase.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 386;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(2);
_dateformatant = cnuevafasedocumento.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 387;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(4);
cnuevafasedocumento.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 388;BA.debugLine="txtFechaNuevaFase.Text=DateTime.Date(DateTime.No";
Debug.ShouldStop(8);
__ref.getField(false,"_txtfechanuevafase" /*RemoteObject*/ ).runMethod(true,"setText",cnuevafasedocumento.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(cnuevafasedocumento.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 389;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(16);
cnuevafasedocumento.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 390;BA.debugLine="mNuevaFaseDocumento.FechaFase=DateTime.Now";
Debug.ShouldStop(32);
__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).setField ("FechaFase" /*RemoteObject*/ ,cnuevafasedocumento.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 }else {
 BA.debugLineNum = 392;BA.debugLine="mNuevaFaseDocumento.FechaFase=FechaActualFase";
Debug.ShouldStop(128);
__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).setField ("FechaFase" /*RemoteObject*/ ,_fechaactualfase);
 };
 BA.debugLineNum = 402;BA.debugLine="txtNuevaFase.Visible=True";
Debug.ShouldStop(131072);
__ref.getField(false,"_txtnuevafase" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"True"));
 BA.debugLineNum = 403;BA.debugLine="btnSelNuevaFase.Visible=True";
Debug.ShouldStop(262144);
__ref.getField(false,"_btnselnuevafase" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"True"));
 BA.debugLineNum = 404;BA.debugLine="txtNuevaFase.Text=\"\"";
Debug.ShouldStop(524288);
__ref.getField(false,"_txtnuevafase" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 405;BA.debugLine="lblTitleResponsableNuevaFase.Visible=False";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lbltitleresponsablenuevafase" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"False"));
 BA.debugLineNum = 406;BA.debugLine="txtResponsableNuevaFase.Visible=False";
Debug.ShouldStop(2097152);
__ref.getField(false,"_txtresponsablenuevafase" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"False"));
 BA.debugLineNum = 407;BA.debugLine="txtResponsableNuevaFase.text=\"\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_txtresponsablenuevafase" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 408;BA.debugLine="btnSelResponsableNuevaFase.Visible=False";
Debug.ShouldStop(8388608);
__ref.getField(false,"_btnselresponsablenuevafase" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"False"));
 BA.debugLineNum = 409;BA.debugLine="lblTitleInfoAdicionalDoc.Visible=False";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lbltitleinfoadicionaldoc" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"False"));
 BA.debugLineNum = 410;BA.debugLine="txtInfoAdicionalDoc.Text=\"\"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_txtinfoadicionaldoc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 411;BA.debugLine="txtInfoAdicionalDoc.visible=False";
Debug.ShouldStop(67108864);
__ref.getField(false,"_txtinfoadicionaldoc" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"False"));
 BA.debugLineNum = 412;BA.debugLine="btnSelInfoAdicionalDoc.Visible=False";
Debug.ShouldStop(134217728);
__ref.getField(false,"_btnselinfoadicionaldoc" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"False"));
 BA.debugLineNum = 414;BA.debugLine="lblTitleNuevaFaseDestinoPreparacion.Visible=True";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lbltitlenuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"True"));
 BA.debugLineNum = 415;BA.debugLine="btnSelNuevaFaseDestinoPreparacion.Visible=True";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_btnselnuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"True"));
 BA.debugLineNum = 416;BA.debugLine="txtNuevaFaseDestinoPreparacion.Text=\"\"";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_txtnuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 417;BA.debugLine="lblTitleResponsableNuevaFaseDestinoPreparacion.Vi";
Debug.ShouldStop(1);
__ref.getField(false,"_lbltitleresponsablenuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"False"));
 BA.debugLineNum = 418;BA.debugLine="txtResponsableNuevaFaseDestinoPreparacion.Visible";
Debug.ShouldStop(2);
__ref.getField(false,"_txtresponsablenuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"False"));
 BA.debugLineNum = 419;BA.debugLine="txtResponsableNuevaFaseDestinoPreparacion.text=\"\"";
Debug.ShouldStop(4);
__ref.getField(false,"_txtresponsablenuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 420;BA.debugLine="btnSelResponsableNuevaFaseDestinoPreparacion.Visi";
Debug.ShouldStop(8);
__ref.getField(false,"_btnselresponsablenuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"False"));
 BA.debugLineNum = 421;BA.debugLine="lblTitleInfoAdicionalNuevaFaseDestinoPreparacion.";
Debug.ShouldStop(16);
__ref.getField(false,"_lbltitleinfoadicionalnuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"False"));
 BA.debugLineNum = 422;BA.debugLine="txtInfoAdicionalNuevaFaseDestinoPreparacion.Visib";
Debug.ShouldStop(32);
__ref.getField(false,"_txtinfoadicionalnuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"False"));
 BA.debugLineNum = 423;BA.debugLine="txtInfoAdicionalNuevaFaseDestinoPreparacion.Text=";
Debug.ShouldStop(64);
__ref.getField(false,"_txtinfoadicionalnuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 424;BA.debugLine="btnSelInfoAdicionalDocNuevaFaseDestinoPreparacion";
Debug.ShouldStop(128);
__ref.getField(false,"_btnselinfoadicionaldocnuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"False"));
 BA.debugLineNum = 435;BA.debugLine="pnlNuevaFaseComplementaria.Visible=False";
Debug.ShouldStop(262144);
__ref.getField(false,"_pnlnuevafasecomplementaria" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"False"));
 BA.debugLineNum = 436;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resetnuevafaseadicional(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResetNuevaFaseAdicional (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,438);
if (RapidSub.canDelegate("resetnuevafaseadicional")) { return __ref.runUserSub(false, "cnuevafasedocumento","resetnuevafaseadicional", __ref);}
 BA.debugLineNum = 438;BA.debugLine="Sub ResetNuevaFaseAdicional";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 439;BA.debugLine="mNuevaFaseDocumento.IDRespFaseDest=0";
Debug.ShouldStop(4194304);
__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).setField ("IDRespFaseDest" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 440;BA.debugLine="mNuevaFaseDocumento.IDInfoAdicionalFaseDest=0";
Debug.ShouldStop(8388608);
__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).setField ("IDInfoAdicionalFaseDest" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 441;BA.debugLine="mNuevaFaseDocumento.NumExpFaseAdicional=\"\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).setField ("NumExpFaseAdicional" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 442;BA.debugLine="mNuevaFaseDocumento.IDFaseDest=0";
Debug.ShouldStop(33554432);
__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).setField ("IDFaseDest" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 444;BA.debugLine="lblTitleNuevaFaseDestinoPreparacion.Visible=True";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lbltitlenuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"True"));
 BA.debugLineNum = 445;BA.debugLine="btnSelNuevaFaseDestinoPreparacion.Visible=True";
Debug.ShouldStop(268435456);
__ref.getField(false,"_btnselnuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"True"));
 BA.debugLineNum = 446;BA.debugLine="txtNuevaFaseDestinoPreparacion.Text=\"\"";
Debug.ShouldStop(536870912);
__ref.getField(false,"_txtnuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 447;BA.debugLine="lblTitleResponsableNuevaFaseDestinoPreparacion.Vi";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lbltitleresponsablenuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"False"));
 BA.debugLineNum = 448;BA.debugLine="txtResponsableNuevaFaseDestinoPreparacion.Visible";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_txtresponsablenuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"False"));
 BA.debugLineNum = 449;BA.debugLine="txtResponsableNuevaFaseDestinoPreparacion.text=\"\"";
Debug.ShouldStop(1);
__ref.getField(false,"_txtresponsablenuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 450;BA.debugLine="btnSelResponsableNuevaFaseDestinoPreparacion.Visi";
Debug.ShouldStop(2);
__ref.getField(false,"_btnselresponsablenuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"False"));
 BA.debugLineNum = 451;BA.debugLine="lblTitleInfoAdicionalNuevaFaseDestinoPreparacion.";
Debug.ShouldStop(4);
__ref.getField(false,"_lbltitleinfoadicionalnuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"False"));
 BA.debugLineNum = 452;BA.debugLine="txtInfoAdicionalNuevaFaseDestinoPreparacion.Visib";
Debug.ShouldStop(8);
__ref.getField(false,"_txtinfoadicionalnuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"False"));
 BA.debugLineNum = 453;BA.debugLine="txtInfoAdicionalNuevaFaseDestinoPreparacion.Text=";
Debug.ShouldStop(16);
__ref.getField(false,"_txtinfoadicionalnuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 454;BA.debugLine="btnSelInfoAdicionalDocNuevaFaseDestinoPreparacion";
Debug.ShouldStop(32);
__ref.getField(false,"_btnselinfoadicionaldocnuevafasedestinopreparacion" /*RemoteObject*/ ).runMethod(true,"setVisible",cnuevafasedocumento.__c.getField(true,"False"));
 BA.debugLineNum = 457;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _salirmodulo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SalirModulo (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,100);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "cnuevafasedocumento","salirmodulo", __ref);}
 BA.debugLineNum = 100;BA.debugLine="private Sub SalirModulo";
Debug.ShouldStop(8);
 BA.debugLineNum = 101;BA.debugLine="Background.RemoveViewFromParent";
Debug.ShouldStop(16);
__ref.getField(false,"_background" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 102;BA.debugLine="mDocumentoSel=\"\"";
Debug.ShouldStop(32);
__ref.setField ("_mdocumentosel" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 103;BA.debugLine="mTipoDocumento=\"\"";
Debug.ShouldStop(64);
__ref.setField ("_mtipodocumento" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 104;BA.debugLine="mNuevaFaseDocumento.Initialize";
Debug.ShouldStop(128);
__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 106;BA.debugLine="If SubExists(mCallBack,\"NuevaFaseDocActualizada\")";
Debug.ShouldStop(512);
if (cnuevafasedocumento.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("NuevaFaseDocActualizada"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 107;BA.debugLine="CallSub2(mCallBack,\"NuevaFaseDocActualizada\",Nue";
Debug.ShouldStop(1024);
cnuevafasedocumento.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(BA.ObjectToString("NuevaFaseDocActualizada")),(Object)((__ref.getField(true,"_nuevafasedocumentoregistrada" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 109;BA.debugLine="frm.Close";
Debug.ShouldStop(4096);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _seleccionarfechanuevafase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SeleccionarFechaNuevaFase (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1013);
if (RapidSub.canDelegate("seleccionarfechanuevafase")) { __ref.runUserSub(false, "cnuevafasedocumento","seleccionarfechanuevafase", __ref); return;}
ResumableSub_SeleccionarFechaNuevaFase rsub = new ResumableSub_SeleccionarFechaNuevaFase(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SeleccionarFechaNuevaFase extends BA.ResumableSub {
public ResumableSub_SeleccionarFechaNuevaFase(b4j.docU.cnuevafasedocumento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cnuevafasedocumento parent;
RemoteObject _b4xdatedlg = RemoteObject.declareNull("b4j.docU.b4xdatetemplate");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _dateformatant = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SeleccionarFechaNuevaFase (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1013);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1014;BA.debugLine="Dialog.Title=\"Indica Fecha Nueva Fase\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Indica Fecha Nueva Fase")));
 BA.debugLineNum = 1016;BA.debugLine="Dim B4XDateDlg As B4XDateTemplate";
Debug.ShouldStop(8388608);
_b4xdatedlg = RemoteObject.createNew ("b4j.docU.b4xdatetemplate");Debug.locals.put("B4XDateDlg", _b4xdatedlg);
 BA.debugLineNum = 1017;BA.debugLine="B4XDateDlg.Initialize";
Debug.ShouldStop(16777216);
_b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 1018;BA.debugLine="If mNuevaFaseDocumento.FechaFase=0 Then";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"FechaFase" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1019;BA.debugLine="B4XDateDlg.Date=DateTime.Now";
Debug.ShouldStop(67108864);
_b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_setdate" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1021;BA.debugLine="B4XDateDlg.Date=mNuevaFaseDocumento.FechaFase";
Debug.ShouldStop(268435456);
_b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_setdate" /*RemoteObject*/ ,__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"FechaFase" /*RemoteObject*/ ));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1023;BA.debugLine="B4XDateDlg.CloseOnSelection=True";
Debug.ShouldStop(1073741824);
_b4xdatedlg.setField ("_closeonselection" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1024;BA.debugLine="B4XDateDlg.FirstDay=1";
Debug.ShouldStop(-2147483648);
_b4xdatedlg.setField ("_firstday" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 1026;BA.debugLine="Utilidades.SetLightThemeDialog(Dialog)";
Debug.ShouldStop(2);
parent._utilidades.runVoidMethod ("_setlightthemedialog" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_dialog" /*RemoteObject*/ )));
 BA.debugLineNum = 1027;BA.debugLine="Utilidades.SetLightThemeDate(B4XDateDlg)";
Debug.ShouldStop(4);
parent._utilidades.runVoidMethod ("_setlightthemedate" /*RemoteObject*/ ,(Object)(_b4xdatedlg));
 BA.debugLineNum = 1029;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XD";
Debug.ShouldStop(16);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xdatedlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 1032;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(128);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 1033;BA.debugLine="bCancel.TextSize=15";
Debug.ShouldStop(256);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 1034;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
Debug.ShouldStop(512);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 1035;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.ShouldStop(1024);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 1036;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "seleccionarfechanuevafase"), _rsub);
this.state = 11;
return;
case 11:
//C
this.state = 7;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1037;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
Debug.ShouldStop(4096);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1038;BA.debugLine="Return";
Debug.ShouldStop(8192);
if (true) return ;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 1040;BA.debugLine="mNuevaFaseDocumento.FechaFase=B4XDateDlg.Date";
Debug.ShouldStop(32768);
__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).setField ("FechaFase" /*RemoteObject*/ ,_b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ ));
 BA.debugLineNum = 1042;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(131072);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 1043;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(262144);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 1046;BA.debugLine="txtFechaNuevaFase.Text=DateTime.Date(mNuevaFaseDo";
Debug.ShouldStop(2097152);
__ref.getField(false,"_txtfechanuevafase" /*RemoteObject*/ ).runMethod(true,"setText",parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"FechaFase" /*RemoteObject*/ ))));
 BA.debugLineNum = 1047;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(4194304);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 1049;BA.debugLine="End Sub";
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
public static void  _seleccionarnuevafase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SeleccionarNuevaFase (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,736);
if (RapidSub.canDelegate("seleccionarnuevafase")) { __ref.runUserSub(false, "cnuevafasedocumento","seleccionarnuevafase", __ref); return;}
ResumableSub_SeleccionarNuevaFase rsub = new ResumableSub_SeleccionarNuevaFase(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SeleccionarNuevaFase extends BA.ResumableSub {
public ResumableSub_SeleccionarNuevaFase(b4j.docU.cnuevafasedocumento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cnuevafasedocumento parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SeleccionarNuevaFase (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,736);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 738;BA.debugLine="If mNuevaFaseDocumento.FechaFase=0 Then";
Debug.ShouldStop(2);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"FechaFase" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 739;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Selecciona an";
Debug.ShouldStop(4);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Selecciona antes la fecha de la nueva fase.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 740;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "seleccionarnuevafase"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 4;
;
 BA.debugLineNum = 741;BA.debugLine="SeleccionarFechaNuevaFase";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_seleccionarfechanuevafase" /*void*/ );
 BA.debugLineNum = 742;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 745;BA.debugLine="If mNuevaFaseDocumento.IDFase<>0 Then";
Debug.ShouldStop(256);

case 4:
//if
this.state = 13;
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_mnuevafasedocumento" /*RemoteObject*/ ).getField(true,"IDFase" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 746;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Seleccion";
Debug.ShouldStop(512);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Seleccionar otra fase?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 747;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "seleccionarnuevafase"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 7;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 748;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(2048);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
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
 if (true) break;

case 13:
//C
this.state = 14;
;
 BA.debugLineNum = 754;BA.debugLine="ResetNuevaFase(False)";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_resetnuevafase" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 755;BA.debugLine="ResetNuevaFaseAdicional";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_resetnuevafaseadicional" /*RemoteObject*/ );
 BA.debugLineNum = 756;BA.debugLine="pnlNuevaFaseComplementaria.Visible=False";
Debug.ShouldStop(524288);
__ref.getField(false,"_pnlnuevafasecomplementaria" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 758;BA.debugLine="DatosSeleccionados=\"NuevaFase\"";
Debug.ShouldStop(2097152);
__ref.setField ("_datosseleccionados" /*RemoteObject*/ ,BA.ObjectToString("NuevaFase"));
 BA.debugLineNum = 759;BA.debugLine="If mDestinatarioTaller Then";
Debug.ShouldStop(4194304);
if (true) break;

case 14:
//if
this.state = 19;
if (__ref.getField(true,"_mdestinatariotaller" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
 BA.debugLineNum = 760;BA.debugLine="LoadDatosB4xSearchList(1,\"SELECT IDFase, Fase FR";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_loaddatosb4xsearchlist" /*void*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT IDFase, Fase FROM tblFasesDoc where TipoOrigenDoc='"),__ref.getField(true,"_mtipodocumento" /*RemoteObject*/ ),RemoteObject.createImmutable("' and DestinoTaller<>0 and IDFase<>16 ORDER BY tblFasesDoc.OrdenSecuencial"))),(Object)(BA.numberCast(int.class, 0)));
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 762;BA.debugLine="LoadDatosB4xSearchList(1,\"SELECT IDFase, Fase FR";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_loaddatosb4xsearchlist" /*void*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT IDFase, Fase FROM tblFasesDoc where TipoOrigenDoc='"),__ref.getField(true,"_mtipodocumento" /*RemoteObject*/ ),RemoteObject.createImmutable("' and IDFase>0 and IDFase<>16 ORDER BY tblFasesDoc.OrdenSecuencial"))),(Object)(BA.numberCast(int.class, 0)));
 if (true) break;

case 19:
//C
this.state = -1;
;
 BA.debugLineNum = 877;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
public static void  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "cnuevafasedocumento","show", __ref); return;}
ResumableSub_Show rsub = new ResumableSub_Show(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.cnuevafasedocumento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cnuevafasedocumento parent;
RemoteObject _sresp = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,113);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 114;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen*0.7, Main.yscre";
Debug.ShouldStop(131072);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(RemoteObject.solve(new RemoteObject[] {parent._main._xscreen /*RemoteObject*/ ,RemoteObject.createImmutable(0.7)}, "*",0, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {parent._main._yscreen /*RemoteObject*/ ,RemoteObject.createImmutable(0.6)}, "*",0, 0)));
 BA.debugLineNum = 118;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(2097152);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 119;BA.debugLine="frm.RootPane.LoadLayout(\"scrNuevaFaseDocumento\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrNuevaFaseDocumento")));
 BA.debugLineNum = 120;BA.debugLine="Sleep(0)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "show"),BA.numberCast(int.class, 0));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
 BA.debugLineNum = 122;BA.debugLine="If mSQL.IsInitialized Then mSQL.close";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//if
this.state = 6;
if (__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("Close");
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 123;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
Debug.ShouldStop(67108864);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.concat(parent._main._nombreaplicacion /*RemoteObject*/ ,RemoteObject.createImmutable(".db"))),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 124;BA.debugLine="CreacionTablasSQLite";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_creaciontablassqlite" /*RemoteObject*/ );
 BA.debugLineNum = 127;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Nueva Fase Do";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("Nueva Fase Documento")));
 BA.debugLineNum = 129;BA.debugLine="Dialog.Initialize (frm.RootPane)";
Debug.ShouldStop(1);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 133;BA.debugLine="ResetNuevaFase(True)";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_resetnuevafase" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 135;BA.debugLine="ResetNuevaFaseAdicional";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_resetnuevafaseadicional" /*RemoteObject*/ );
 BA.debugLineNum = 137;BA.debugLine="FaseAdicionalVisible(False)";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_faseadicionalvisible" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 139;BA.debugLine="txtDocumento.Text=mDocumentoSel";
Debug.ShouldStop(1024);
__ref.getField(false,"_txtdocumento" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(true,"_mdocumentosel" /*RemoteObject*/ ));
 BA.debugLineNum = 141;BA.debugLine="frm.Show";
Debug.ShouldStop(4096);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 143;BA.debugLine="Wait For(ActualizarFases) complete (sResp As Stri";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "show"), __ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_actualizarfases" /*RemoteObject*/ ));
this.state = 12;
return;
case 12:
//C
this.state = 7;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 144;BA.debugLine="If sResp<>\"OK\" Then";
Debug.ShouldStop(32768);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("!",_sresp,BA.ObjectToString("OK"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 145;BA.debugLine="SalirModulo";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 146;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return ;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
public static void  _tbltipificacioninfoadicionalfases(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("tblTipificacionInfoAdicionalFases (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1472);
if (RapidSub.canDelegate("tbltipificacioninfoadicionalfases")) { __ref.runUserSub(false, "cnuevafasedocumento","tbltipificacioninfoadicionalfases", __ref); return;}
ResumableSub_tblTipificacionInfoAdicionalFases rsub = new ResumableSub_tblTipificacionInfoAdicionalFases(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_tblTipificacionInfoAdicionalFases extends BA.ResumableSub {
public ResumableSub_tblTipificacionInfoAdicionalFases(b4j.docU.cnuevafasedocumento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cnuevafasedocumento parent;
RemoteObject _accion = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("tblTipificacionInfoAdicionalFases (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1472);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1473;BA.debugLine="Wait For(ActualizarTipificacionInfoAdicionalFases";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "tbltipificacioninfoadicionalfases"), __ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_actualizartipificacioninfoadicionalfases" /*RemoteObject*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Accion", _accion);
;
 BA.debugLineNum = 1474;BA.debugLine="If Accion=\"Salir\" Then";
Debug.ShouldStop(2);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("Salir"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1475;BA.debugLine="SalirModulo";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 1476;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1478;BA.debugLine="LoadDatosB4xSearchList(TipoQryCls, stringSourceTa";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_loaddatosb4xsearchlist" /*void*/ ,(Object)(BA.numberCast(int.class, __ref.getField(true,"_tipoqrycls" /*RemoteObject*/ ))),(Object)(__ref.getField(true,"_stringsourcetablecls" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_iddatoscls" /*RemoteObject*/ )));
 BA.debugLineNum = 1479;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
public static void  _tbltransporte(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("tblTransporte (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1433);
if (RapidSub.canDelegate("tbltransporte")) { __ref.runUserSub(false, "cnuevafasedocumento","tbltransporte", __ref); return;}
ResumableSub_tblTransporte rsub = new ResumableSub_tblTransporte(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_tblTransporte extends BA.ResumableSub {
public ResumableSub_tblTransporte(b4j.docU.cnuevafasedocumento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cnuevafasedocumento parent;
RemoteObject _accion = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("tblTransporte (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1433);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1434;BA.debugLine="Wait For(ActualizarTransportes) complete (Accion";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "tbltransporte"), __ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_actualizartransportes" /*RemoteObject*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Accion", _accion);
;
 BA.debugLineNum = 1435;BA.debugLine="If Accion=\"Salir\" Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("Salir"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1436;BA.debugLine="SalirModulo";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 1437;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1439;BA.debugLine="LoadDatosB4xSearchList(TipoQryCls, stringSourceTa";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_loaddatosb4xsearchlist" /*void*/ ,(Object)(BA.numberCast(int.class, __ref.getField(true,"_tipoqrycls" /*RemoteObject*/ ))),(Object)(__ref.getField(true,"_stringsourcetablecls" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_iddatoscls" /*RemoteObject*/ )));
 BA.debugLineNum = 1440;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
public static void  _vwempleadosactivos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("vwempleadosactivos (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1510);
if (RapidSub.canDelegate("vwempleadosactivos")) { __ref.runUserSub(false, "cnuevafasedocumento","vwempleadosactivos", __ref); return;}
ResumableSub_vwempleadosactivos rsub = new ResumableSub_vwempleadosactivos(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_vwempleadosactivos extends BA.ResumableSub {
public ResumableSub_vwempleadosactivos(b4j.docU.cnuevafasedocumento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cnuevafasedocumento parent;
RemoteObject _accion = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("vwempleadosactivos (cnuevafasedocumento) ","cnuevafasedocumento",44,__ref.getField(false, "ba"),__ref,1510);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1511;BA.debugLine="Wait For(Actualizarvwempleadosactivos) complete (";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cnuevafasedocumento", "vwempleadosactivos"), __ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_actualizarvwempleadosactivos" /*RemoteObject*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Accion", _accion);
;
 BA.debugLineNum = 1512;BA.debugLine="If Accion=\"Salir\" Then";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("Salir"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1513;BA.debugLine="SalirModulo";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 1514;BA.debugLine="Return";
Debug.ShouldStop(512);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1516;BA.debugLine="LoadDatosB4xSearchList(TipoQryCls, stringSourceTa";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_loaddatosb4xsearchlist" /*void*/ ,(Object)(BA.numberCast(int.class, __ref.getField(true,"_tipoqrycls" /*RemoteObject*/ ))),(Object)(__ref.getField(true,"_stringsourcetablecls" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_iddatoscls" /*RemoteObject*/ )));
 BA.debugLineNum = 1517;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
}