package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cgeneracionficheroscsvplantillapedidosventa_subs_0 {


public static RemoteObject  _actualizardatosclv(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosCLV (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,295);
if (RapidSub.canDelegate("actualizardatosclv")) { return __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","actualizardatosclv", __ref);}
RemoteObject _numpanel = RemoteObject.createImmutable(0);
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _scombi = RemoteObject.createImmutable("");
 BA.debugLineNum = 295;BA.debugLine="Sub ActualizarDatosCLV";
Debug.ShouldStop(64);
 BA.debugLineNum = 297;BA.debugLine="CLVBuscarClienteDireccionEnvio.Clear";
Debug.ShouldStop(256);
__ref.getField(false,"_clvbuscarclientedireccionenvio" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 299;BA.debugLine="Dim NumPanel As Int";
Debug.ShouldStop(1024);
_numpanel = RemoteObject.createImmutable(0);Debug.locals.put("NumPanel", _numpanel);
 BA.debugLineNum = 301;BA.debugLine="AnchoCLV=CLVBuscarClienteDireccionEnvio.AsView.Wi";
Debug.ShouldStop(4096);
__ref.setField ("_anchoclv" /*RemoteObject*/ ,__ref.getField(false,"_clvbuscarclientedireccionenvio" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth"));
 BA.debugLineNum = 302;BA.debugLine="mAlturaItems=25dip";
Debug.ShouldStop(8192);
__ref.setField ("_malturaitems" /*RemoteObject*/ ,BA.numberCast(double.class, cgeneracionficheroscsvplantillapedidosventa.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25)))));
 BA.debugLineNum = 307;BA.debugLine="Select Case CampoBusqueda";
Debug.ShouldStop(262144);
switch (BA.switchObjectToInt(__ref.getField(true,"_campobusqueda" /*RemoteObject*/ ),BA.ObjectToString("Cliente"),BA.ObjectToString("DireccionEnvio"))) {
case 0: {
 BA.debugLineNum = 309;BA.debugLine="If chkboxFiltroCIF.Checked Then";
Debug.ShouldStop(1048576);
if (__ref.getField(false,"_chkboxfiltrocif" /*RemoteObject*/ ).runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 310;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery2($\"Select d";
Debug.ShouldStop(2097152);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)((RemoteObject.createImmutable("Select distinct ClienteComb from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW where ClienteComb like ? order by CodigoCliente"))),(Object)(cgeneracionficheroscsvplantillapedidosventa.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {(RemoteObject.concat(RemoteObject.createImmutable("%"),cgeneracionficheroscsvplantillapedidosventa.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"CIFCliente" /*RemoteObject*/ )))),RemoteObject.createImmutable("%")))})))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 }else {
 BA.debugLineNum = 313;BA.debugLine="If txtBuscarClienteDireccionEnvio.Text=\"\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtbuscarclientedireccionenvio" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 314;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery($\"Select d";
Debug.ShouldStop(33554432);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)((RemoteObject.createImmutable("Select distinct ClienteComb from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW order by CodigoCliente"))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 }else {
 BA.debugLineNum = 316;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery2($\"Select";
Debug.ShouldStop(134217728);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)((RemoteObject.createImmutable("Select distinct ClienteComb from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW where ClienteComb like ? order by CodigoCliente"))),(Object)(cgeneracionficheroscsvplantillapedidosventa.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {(RemoteObject.concat(RemoteObject.createImmutable("%"),cgeneracionficheroscsvplantillapedidosventa.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_txtbuscarclientedireccionenvio" /*RemoteObject*/ ).runMethod(true,"getText")))),RemoteObject.createImmutable("%")))})))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 };
 };
 break; }
case 1: {
 BA.debugLineNum = 322;BA.debugLine="If txtBuscarClienteDireccionEnvio.Text=\"\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtbuscarclientedireccionenvio" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 323;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery2($\"Select D";
Debug.ShouldStop(4);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)((RemoteObject.createImmutable("Select DireccionEnvioComb from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW where CodigoCliente=? order by CodigoDireccionEnvio"))),(Object)(cgeneracionficheroscsvplantillapedidosventa.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"CodigoCliente" /*RemoteObject*/ )})))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 }else {
 BA.debugLineNum = 326;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery2($\"Select D";
Debug.ShouldStop(32);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)((RemoteObject.createImmutable("Select DireccionEnvioComb from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW where CodigoCliente=? and DireccionEnvioComb like ? order by CodigoDireccionEnvio"))),(Object)(cgeneracionficheroscsvplantillapedidosventa.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"CodigoCliente" /*RemoteObject*/ ),(RemoteObject.concat(RemoteObject.createImmutable("%"),cgeneracionficheroscsvplantillapedidosventa.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_txtbuscarclientedireccionenvio" /*RemoteObject*/ ).runMethod(true,"getText")))),RemoteObject.createImmutable("%")))})))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 };
 break; }
}
;
 BA.debugLineNum = 332;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(2048);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 333;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(Null)";
Debug.ShouldStop(4096);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(cgeneracionficheroscsvplantillapedidosventa.__c.getField(false,"Null"))));Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 334;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, AnchoCLV, mAltura";
Debug.ShouldStop(8192);
_pnl.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(true,"_anchoclv" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_malturaitems" /*RemoteObject*/ )));
 BA.debugLineNum = 338;BA.debugLine="pnl.Color=0xFFDCDCDC";
Debug.ShouldStop(131072);
_pnl.runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xffdcdcdc)));
 BA.debugLineNum = 339;BA.debugLine="Dim sCombi As String=rs.GetString2(0)";
Debug.ShouldStop(262144);
_scombi = _rs.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("sCombi", _scombi);Debug.locals.put("sCombi", _scombi);
 BA.debugLineNum = 340;BA.debugLine="CLVBuscarClienteDireccionEnvio.Add(pnl,sCombi)";
Debug.ShouldStop(524288);
__ref.getField(false,"_clvbuscarclientedireccionenvio" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(_pnl),(Object)((_scombi)));
 BA.debugLineNum = 341;BA.debugLine="NumPanel=NumPanel+1";
Debug.ShouldStop(1048576);
_numpanel = RemoteObject.solve(new RemoteObject[] {_numpanel,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("NumPanel", _numpanel);
 }
;
 BA.debugLineNum = 343;BA.debugLine="rs.Close";
Debug.ShouldStop(4194304);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 346;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsalir_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSalir_Click (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","btnsalir_click", __ref);}
 BA.debugLineNum = 139;BA.debugLine="Private Sub btnSalir_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 140;BA.debugLine="SalirModulo";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.docU.cgeneracionficheroscsvplantillapedidosventa.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnselalmacen_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelAlmacen_Click (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,611);
if (RapidSub.canDelegate("btnselalmacen_click")) { __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","btnselalmacen_click", __ref); return;}
ResumableSub_btnSelAlmacen_Click rsub = new ResumableSub_btnSelAlmacen_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSelAlmacen_Click extends BA.ResumableSub {
public ResumableSub_btnSelAlmacen_Click(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
RemoteObject _b4xinput = RemoteObject.declareNull("b4j.docU.b4xinputtemplate");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSelAlmacen_Click (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,611);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 612;BA.debugLine="Dialog.Title=\"Indica el Almacén Origen\"";
Debug.ShouldStop(8);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Indica el Almacén Origen")));
 BA.debugLineNum = 613;BA.debugLine="Dim B4XInput As B4XInputTemplate";
Debug.ShouldStop(16);
_b4xinput = RemoteObject.createNew ("b4j.docU.b4xinputtemplate");Debug.locals.put("B4XInput", _b4xinput);
 BA.debugLineNum = 614;BA.debugLine="B4XInput.Initialize";
Debug.ShouldStop(32);
_b4xinput.runClassMethod (b4j.docU.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 615;BA.debugLine="B4XInput.Text=IIf(DatosPlantillaPedidoVentaCab.Al";
Debug.ShouldStop(64);
_b4xinput.setField ("_text" /*RemoteObject*/ ,BA.ObjectToString(((RemoteObject.solveBoolean("=",__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"AlmacenOrigen" /*RemoteObject*/ ),BA.ObjectToString(""))) ? (RemoteObject.createImmutable(("0001"))) : ((__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"AlmacenOrigen" /*RemoteObject*/ ))))));
 BA.debugLineNum = 616;BA.debugLine="B4XInput.lblTitle.Text=$\"\"$";
Debug.ShouldStop(128);
_b4xinput.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",(RemoteObject.createImmutable("")));
 BA.debugLineNum = 618;BA.debugLine="B4XInput.mBase.Width=450dip";
Debug.ShouldStop(512);
_b4xinput.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 450)))));
 BA.debugLineNum = 619;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XI";
Debug.ShouldStop(1024);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xinput)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 620;BA.debugLine="Dim bOk As B4XView=Dialog.GetButton(xui.DialogRes";
Debug.ShouldStop(2048);
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOk", _bok);Debug.locals.put("bOk", _bok);
 BA.debugLineNum = 621;BA.debugLine="bOk.TextSize=16";
Debug.ShouldStop(4096);
_bok.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 622;BA.debugLine="bOk.Left=(Dialog.Base.Width-bOk.Width)/2";
Debug.ShouldStop(8192);
_bok.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth"),_bok.runMethod(true,"getWidth")}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));
 BA.debugLineNum = 623;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(16384);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 624;BA.debugLine="bCancel.TextSize=16";
Debug.ShouldStop(32768);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 625;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
Debug.ShouldStop(65536);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 626;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.ShouldStop(131072);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 627;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "btnselalmacen_click"), _rsub);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 628;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 629;BA.debugLine="DatosPlantillaPedidoVentaCab.AlmacenOrigen=B4XInp";
Debug.ShouldStop(1048576);
__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).setField ("AlmacenOrigen" /*RemoteObject*/ ,_b4xinput.getField(true,"_text" /*RemoteObject*/ ));
 BA.debugLineNum = 630;BA.debugLine="txtAlmacen.Text=DatosPlantillaPedidoVentaCab.Alma";
Debug.ShouldStop(2097152);
__ref.getField(false,"_txtalmacen" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"AlmacenOrigen" /*RemoteObject*/ ));
 BA.debugLineNum = 631;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
public static void  _complete(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static void  _btnselcliente_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelCliente_Click (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,524);
if (RapidSub.canDelegate("btnselcliente_click")) { __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","btnselcliente_click", __ref); return;}
ResumableSub_btnSelCliente_Click rsub = new ResumableSub_btnSelCliente_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSelCliente_Click extends BA.ResumableSub {
public ResumableSub_btnSelCliente_Click(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSelCliente_Click (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,524);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 525;BA.debugLine="If DatosPlantillaPedidoVentaCab.CodigoCliente<>\"\"";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"CodigoCliente" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 526;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",$\"Ya h";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "btnselcliente_click"), parent._utilidades.runMethod(false,"_msgbox2xui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Confirma")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Ya hay seleccionado un cliente.\n"),RemoteObject.createImmutable("Seleccionar otro cliente?")))),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), parent.__c.getField(false,"Null"))));
this.state = 11;
return;
case 11:
//C
this.state = 4;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 528;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(32768);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
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
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 531;BA.debugLine="CampoBusqueda=\"Cliente\"";
Debug.ShouldStop(262144);
__ref.setField ("_campobusqueda" /*RemoteObject*/ ,BA.ObjectToString("Cliente"));
 BA.debugLineNum = 532;BA.debugLine="DatosPlantillaPedidoVentaCab.CodigoCliente=\"\"";
Debug.ShouldStop(524288);
__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).setField ("CodigoCliente" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 533;BA.debugLine="DatosPlantillaPedidoVentaCab.NombreCliente=\"\"";
Debug.ShouldStop(1048576);
__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).setField ("NombreCliente" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 534;BA.debugLine="DatosPlantillaPedidoVentaCab.CodigoDireccionEnvio";
Debug.ShouldStop(2097152);
__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).setField ("CodigoDireccionEnvio" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 535;BA.debugLine="DatosPlantillaPedidoVentaCab.NombreDireccionEnvio";
Debug.ShouldStop(4194304);
__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).setField ("NombreDireccionEnvio" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 536;BA.debugLine="txtCodigoCliente.Text=\"\"";
Debug.ShouldStop(8388608);
__ref.getField(false,"_txtcodigocliente" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 537;BA.debugLine="txtNombreCliente.Text=\"\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_txtnombrecliente" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 538;BA.debugLine="txtCodigoDireccionEnvio.Text=\"\"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_txtcodigodireccionenvio" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 539;BA.debugLine="txtNombreDireccionEnvio.Text=\"\"";
Debug.ShouldStop(67108864);
__ref.getField(false,"_txtnombredireccionenvio" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 541;BA.debugLine="MostrarPanelBuscarClienteDireccionEnvio";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.docU.cgeneracionficheroscsvplantillapedidosventa.class, "_mostrarpanelbuscarclientedireccionenvio" /*RemoteObject*/ );
 BA.debugLineNum = 543;BA.debugLine="chkboxFiltroCIF.Checked=True";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_chkboxfiltrocif" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"True"));
 BA.debugLineNum = 544;BA.debugLine="ActualizarDatosCLV";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.docU.cgeneracionficheroscsvplantillapedidosventa.class, "_actualizardatosclv" /*RemoteObject*/ );
 BA.debugLineNum = 545;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
public static void  _btnseldireccionenvio_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelDireccionEnvio_Click (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,547);
if (RapidSub.canDelegate("btnseldireccionenvio_click")) { __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","btnseldireccionenvio_click", __ref); return;}
ResumableSub_btnSelDireccionEnvio_Click rsub = new ResumableSub_btnSelDireccionEnvio_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSelDireccionEnvio_Click extends BA.ResumableSub {
public ResumableSub_btnSelDireccionEnvio_Click(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _numdirenv = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSelDireccionEnvio_Click (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,547);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 548;BA.debugLine="If DatosPlantillaPedidoVentaCab.CodigoCliente=\"\"";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"CodigoCliente" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 549;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha sele";
Debug.ShouldStop(16);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se ha seleccionado cliente")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 550;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "btnseldireccionenvio_click"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 4;
;
 BA.debugLineNum = 551;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 554;BA.debugLine="If DatosPlantillaPedidoVentaCab.CodigoDireccionEn";
Debug.ShouldStop(512);

case 4:
//if
this.state = 13;
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"CodigoDireccionEnvio" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 555;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",$\"Ya h";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "btnseldireccionenvio_click"), parent._utilidades.runMethod(false,"_msgbox2xui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Confirma")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Ya hay seleccionada una dirección de envío.\n"),RemoteObject.createImmutable("Seleccionar otra dirección de envío?")))),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), parent.__c.getField(false,"Null"))));
this.state = 19;
return;
case 19:
//C
this.state = 7;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 557;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 560;BA.debugLine="Dim NumDirEnv As Int=mSQL.ExecQuerySingleResult2(";
Debug.ShouldStop(32768);
_numdirenv = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select count(*) from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW where CodigoCliente=? and CodigoDireccionEnvio<>?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"CodigoCliente" /*RemoteObject*/ ),RemoteObject.createImmutable("")}))))));Debug.locals.put("NumDirEnv", _numdirenv);Debug.locals.put("NumDirEnv", _numdirenv);
 BA.debugLineNum = 563;BA.debugLine="If NumDirEnv=0 Then";
Debug.ShouldStop(262144);
if (true) break;

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_numdirenv,BA.numberCast(double.class, 0))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 564;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"El Cliente s";
Debug.ShouldStop(524288);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("El Cliente seleccionado ("),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"CodigoCliente" /*RemoteObject*/ )))),RemoteObject.createImmutable(") no tiene direcciones de envío.")))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 565;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "btnseldireccionenvio_click"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 17;
;
 BA.debugLineNum = 566;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return ;
 if (true) break;

case 17:
//C
this.state = -1;
;
 BA.debugLineNum = 569;BA.debugLine="CampoBusqueda=\"DireccionEnvio\"";
Debug.ShouldStop(16777216);
__ref.setField ("_campobusqueda" /*RemoteObject*/ ,BA.ObjectToString("DireccionEnvio"));
 BA.debugLineNum = 570;BA.debugLine="DatosPlantillaPedidoVentaCab.CodigoDireccionEnvio";
Debug.ShouldStop(33554432);
__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).setField ("CodigoDireccionEnvio" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 571;BA.debugLine="DatosPlantillaPedidoVentaCab.NombreDireccionEnvio";
Debug.ShouldStop(67108864);
__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).setField ("NombreDireccionEnvio" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 572;BA.debugLine="txtCodigoDireccionEnvio.Text=\"\"";
Debug.ShouldStop(134217728);
__ref.getField(false,"_txtcodigodireccionenvio" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 573;BA.debugLine="txtNombreDireccionEnvio.Text=\"\"";
Debug.ShouldStop(268435456);
__ref.getField(false,"_txtnombredireccionenvio" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 574;BA.debugLine="MostrarPanelBuscarClienteDireccionEnvio";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.docU.cgeneracionficheroscsvplantillapedidosventa.class, "_mostrarpanelbuscarclientedireccionenvio" /*RemoteObject*/ );
 BA.debugLineNum = 576;BA.debugLine="chkboxFiltroCIF.Checked=True";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_chkboxfiltrocif" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"True"));
 BA.debugLineNum = 577;BA.debugLine="ActualizarDatosCLV";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.docU.cgeneracionficheroscsvplantillapedidosventa.class, "_actualizardatosclv" /*RemoteObject*/ );
 BA.debugLineNum = 580;BA.debugLine="End Sub";
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
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static void  _btnseldocumentoexterno_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelDocumentoExterno_Click (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,670);
if (RapidSub.canDelegate("btnseldocumentoexterno_click")) { __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","btnseldocumentoexterno_click", __ref); return;}
ResumableSub_btnSelDocumentoExterno_Click rsub = new ResumableSub_btnSelDocumentoExterno_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSelDocumentoExterno_Click extends BA.ResumableSub {
public ResumableSub_btnSelDocumentoExterno_Click(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
RemoteObject _b4xinput = RemoteObject.declareNull("b4j.docU.b4xinputtemplate");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSelDocumentoExterno_Click (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,670);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 671;BA.debugLine="Dialog.Title=\"Indica el Documento Externo\"";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Indica el Documento Externo")));
 BA.debugLineNum = 672;BA.debugLine="Dim B4XInput As B4XInputTemplate";
Debug.ShouldStop(-2147483648);
_b4xinput = RemoteObject.createNew ("b4j.docU.b4xinputtemplate");Debug.locals.put("B4XInput", _b4xinput);
 BA.debugLineNum = 673;BA.debugLine="B4XInput.Initialize";
Debug.ShouldStop(1);
_b4xinput.runClassMethod (b4j.docU.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 674;BA.debugLine="B4XInput.Text=DatosPlantillaPedidoVentaCab.Docume";
Debug.ShouldStop(2);
_b4xinput.setField ("_text" /*RemoteObject*/ ,__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"DocumentoExterno" /*RemoteObject*/ ));
 BA.debugLineNum = 675;BA.debugLine="B4XInput.lblTitle.Text=$\"(Pedido del Cliente)\"$";
Debug.ShouldStop(4);
_b4xinput.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",(RemoteObject.createImmutable("(Pedido del Cliente)")));
 BA.debugLineNum = 677;BA.debugLine="B4XInput.mBase.Width=450dip";
Debug.ShouldStop(16);
_b4xinput.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 450)))));
 BA.debugLineNum = 678;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XI";
Debug.ShouldStop(32);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xinput)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 679;BA.debugLine="Dim bOk As B4XView=Dialog.GetButton(xui.DialogRes";
Debug.ShouldStop(64);
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOk", _bok);Debug.locals.put("bOk", _bok);
 BA.debugLineNum = 680;BA.debugLine="bOk.TextSize=16";
Debug.ShouldStop(128);
_bok.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 681;BA.debugLine="bOk.Left=(Dialog.Base.Width-bOk.Width)/2";
Debug.ShouldStop(256);
_bok.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth"),_bok.runMethod(true,"getWidth")}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));
 BA.debugLineNum = 682;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(512);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 683;BA.debugLine="bCancel.TextSize=16";
Debug.ShouldStop(1024);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 684;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
Debug.ShouldStop(2048);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 685;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.ShouldStop(4096);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 686;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "btnseldocumentoexterno_click"), _rsub);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 687;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 688;BA.debugLine="DatosPlantillaPedidoVentaCab.DocumentoExterno=B4X";
Debug.ShouldStop(32768);
__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).setField ("DocumentoExterno" /*RemoteObject*/ ,_b4xinput.getField(true,"_text" /*RemoteObject*/ ).runMethod(true,"toUpperCase"));
 BA.debugLineNum = 689;BA.debugLine="txtDocumentoExterno.Text=DatosPlantillaPedidoVent";
Debug.ShouldStop(65536);
__ref.getField(false,"_txtdocumentoexterno" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"DocumentoExterno" /*RemoteObject*/ ));
 BA.debugLineNum = 690;BA.debugLine="End Sub";
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
public static void  _btnselfechapedidocliente_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelFechaPedidoCliente_Click (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,633);
if (RapidSub.canDelegate("btnselfechapedidocliente_click")) { __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","btnselfechapedidocliente_click", __ref); return;}
ResumableSub_btnSelFechaPedidoCliente_Click rsub = new ResumableSub_btnSelFechaPedidoCliente_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSelFechaPedidoCliente_Click extends BA.ResumableSub {
public ResumableSub_btnSelFechaPedidoCliente_Click(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _b4xdatedlg = RemoteObject.declareNull("b4j.docU.b4xdatetemplate");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _fechapedcli = RemoteObject.createImmutable(0L);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSelFechaPedidoCliente_Click (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,633);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 635;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(67108864);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 636;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(134217728);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 639;BA.debugLine="Dialog.Title=\"Indica Fecha Pedido Cliente\"";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Indica Fecha Pedido Cliente")));
 BA.debugLineNum = 641;BA.debugLine="Dim B4XDateDlg As B4XDateTemplate";
Debug.ShouldStop(1);
_b4xdatedlg = RemoteObject.createNew ("b4j.docU.b4xdatetemplate");Debug.locals.put("B4XDateDlg", _b4xdatedlg);
 BA.debugLineNum = 642;BA.debugLine="B4XDateDlg.Initialize";
Debug.ShouldStop(2);
_b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 643;BA.debugLine="If DatosPlantillaPedidoVentaCab.FechaPedidoClient";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"FechaPedidoCliente" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 644;BA.debugLine="B4XDateDlg.Date=DateTime.now";
Debug.ShouldStop(8);
_b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_setdate" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 646;BA.debugLine="B4XDateDlg.Date=DatosPlantillaPedidoVentaCab.Fec";
Debug.ShouldStop(32);
_b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_setdate" /*RemoteObject*/ ,__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"FechaPedidoCliente" /*RemoteObject*/ ));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 648;BA.debugLine="B4XDateDlg.CloseOnSelection=True";
Debug.ShouldStop(128);
_b4xdatedlg.setField ("_closeonselection" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 649;BA.debugLine="B4XDateDlg.FirstDay=1";
Debug.ShouldStop(256);
_b4xdatedlg.setField ("_firstday" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 650;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XD";
Debug.ShouldStop(512);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xdatedlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 653;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(4096);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 654;BA.debugLine="bCancel.TextSize=15";
Debug.ShouldStop(8192);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 655;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
Debug.ShouldStop(16384);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 656;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.ShouldStop(32768);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 657;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "btnselfechapedidocliente_click"), _rsub);
this.state = 11;
return;
case 11:
//C
this.state = 7;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 659;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 660;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(524288);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 661;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) return ;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 663;BA.debugLine="Dim FechaPedCli As Long=B4XDateDlg.Date";
Debug.ShouldStop(4194304);
_fechapedcli = _b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ );Debug.locals.put("FechaPedCli", _fechapedcli);Debug.locals.put("FechaPedCli", _fechapedcli);
 BA.debugLineNum = 664;BA.debugLine="DatosPlantillaPedidoVentaCab.FechaPedidoCliente=F";
Debug.ShouldStop(8388608);
__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).setField ("FechaPedidoCliente" /*RemoteObject*/ ,_fechapedcli);
 BA.debugLineNum = 665;BA.debugLine="txtFechaPedidoCliente.Text=DateTime.Date(DatosPla";
Debug.ShouldStop(16777216);
__ref.getField(false,"_txtfechapedidocliente" /*RemoteObject*/ ).runMethod(true,"setText",parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"FechaPedidoCliente" /*RemoteObject*/ ))));
 BA.debugLineNum = 667;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(67108864);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 668;BA.debugLine="End Sub";
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
public static void  _btnselficheroplantillapedidoventa_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelFicheroPlantillaPedidoVenta_Click (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,193);
if (RapidSub.canDelegate("btnselficheroplantillapedidoventa_click")) { __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","btnselficheroplantillapedidoventa_click", __ref); return;}
ResumableSub_btnSelFicheroPlantillaPedidoVenta_Click rsub = new ResumableSub_btnSelFicheroPlantillaPedidoVenta_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSelFicheroPlantillaPedidoVenta_Click extends BA.ResumableSub {
public ResumableSub_btnSelFicheroPlantillaPedidoVenta_Click(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _srutaficherosel = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSelFicheroPlantillaPedidoVenta_Click (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,193);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 195;BA.debugLine="If RutaFicheroSeleccionado<>\"\" Then";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_rutaficheroseleccionado" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 196;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",$\"Ya s";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "btnselficheroplantillapedidoventa_click"), parent._utilidades.runMethod(false,"_msgbox2xui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Confirma")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Ya se ha seleccionado previamente un fichero.\n"),RemoteObject.createImmutable("¿Continuar?")))),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), parent.__c.getField(false,"Null"))));
this.state = 15;
return;
case 15:
//C
this.state = 4;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 198;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(32);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
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
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 201;BA.debugLine="RutaFicheroSeleccionado=\"\"";
Debug.ShouldStop(256);
__ref.setField ("_rutaficheroseleccionado" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 202;BA.debugLine="LimpiarDatos";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.docU.cgeneracionficheroscsvplantillapedidosventa.class, "_limpiardatos" /*RemoteObject*/ );
 BA.debugLineNum = 204;BA.debugLine="wait for(SeleccionFicheroCarpetaRed) complete (sR";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "btnselficheroplantillapedidoventa_click"), __ref.runClassMethod (b4j.docU.cgeneracionficheroscsvplantillapedidosventa.class, "_seleccionficherocarpetared" /*RemoteObject*/ ));
this.state = 16;
return;
case 16:
//C
this.state = 11;
_srutaficherosel = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sRutaFicheroSel", _srutaficherosel);
;
 BA.debugLineNum = 205;BA.debugLine="If sRutaFicheroSel=\"\" Then";
Debug.ShouldStop(4096);
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_srutaficherosel,BA.ObjectToString(""))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 206;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha sele";
Debug.ShouldStop(8192);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se ha seleccionado fichero")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 207;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "btnselficheroplantillapedidoventa_click"), _msa);
this.state = 17;
return;
case 17:
//C
this.state = 14;
;
 BA.debugLineNum = 208;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return ;
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 210;BA.debugLine="RutaFicheroSeleccionado=sRutaFicheroSel";
Debug.ShouldStop(131072);
__ref.setField ("_rutaficheroseleccionado" /*RemoteObject*/ ,_srutaficherosel);
 BA.debugLineNum = 211;BA.debugLine="txtFicheroSeleccionado.Text=RutaFicheroSelecciona";
Debug.ShouldStop(262144);
__ref.getField(false,"_txtficheroseleccionado" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(true,"_rutaficheroseleccionado" /*RemoteObject*/ ));
 BA.debugLineNum = 213;BA.debugLine="ProcesoCabeceraFicheroSeleccionado";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.docU.cgeneracionficheroscsvplantillapedidosventa.class, "_procesocabeceraficheroseleccionado" /*RemoteObject*/ );
 BA.debugLineNum = 214;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
public static RemoteObject  _cargaclientesdireccionesenviodw(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaClientesDireccionesEnvioDW (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,252);
if (RapidSub.canDelegate("cargaclientesdireccionesenviodw")) { return __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","cargaclientesdireccionesenviodw", __ref);}
ResumableSub_CargaClientesDireccionesEnvioDW rsub = new ResumableSub_CargaClientesDireccionesEnvioDW(null,__ref);
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
public static class ResumableSub_CargaClientesDireccionesEnvioDW extends BA.ResumableSub {
public ResumableSub_CargaClientesDireccionesEnvioDW(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdata0 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaClientesDireccionesEnvioDW (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,252);
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
 BA.debugLineNum = 254;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblGeneracionFiche";
Debug.ShouldStop(536870912);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW")));
 BA.debugLineNum = 256;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(-2147483648);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 257;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(1);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 258;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(2);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 259;BA.debugLine="Dim Comando As String=\"ClientesDireccionesEnvioDW";
Debug.ShouldStop(4);
_comando = BA.ObjectToString("ClientesDireccionesEnvioDW");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 260;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Null,";
Debug.ShouldStop(8);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 262;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "cargaclientesdireccionesenviodw"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 264;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(128);
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
 BA.debugLineNum = 265;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(256);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 266;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(512);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 267;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "cargaclientesdireccionesenviodw"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 268;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(2048);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 269;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4096);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 272;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 273;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(65536);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 274;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(131072);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos de clientes-direcciones envío de navision.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 275;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "cargaclientesdireccionesenviodw"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 276;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(524288);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 277;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1048576);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 279;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(4194304);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 280;BA.debugLine="Dim mData0 As Map=lstReg.Get(0)";
Debug.ShouldStop(8388608);
_mdata0 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata0 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mData0", _mdata0);Debug.locals.put("mData0", _mdata0);
 BA.debugLineNum = 281;BA.debugLine="Utilidades.LogStringCrearTablaDesdeMap(\"tblEval";
Debug.ShouldStop(16777216);
parent._utilidades.runVoidMethod ("_logstringcreartabladesdemap" /*RemoteObject*/ ,(Object)(BA.ObjectToString("tblEvaluacionProveedores")),(Object)(_mdata0),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 282;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(33554432);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 283;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(67108864);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 284;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
Debug.ShouldStop(134217728);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW")),(Object)(_lstreg));
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
 BA.debugLineNum = 287;BA.debugLine="Return mRes";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 288;BA.debugLine="End Sub";
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
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _cargagrpclientepedido(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaGRPClientePedido (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,973);
if (RapidSub.canDelegate("cargagrpclientepedido")) { return __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","cargagrpclientepedido", __ref);}
ResumableSub_CargaGRPClientePedido rsub = new ResumableSub_CargaGRPClientePedido(null,__ref);
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
public static class ResumableSub_CargaGRPClientePedido extends BA.ResumableSub {
public ResumableSub_CargaGRPClientePedido(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaGRPClientePedido (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,973);
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
 BA.debugLineNum = 975;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(16384);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 976;BA.debugLine="Dim lstReg As List";
Debug.ShouldStop(32768);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 977;BA.debugLine="lstReg.Initialize";
Debug.ShouldStop(65536);
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 978;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(131072);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 979;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(262144);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 980;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(524288);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 981;BA.debugLine="mRes.Put(\"lstReg\",lstReg)";
Debug.ShouldStop(1048576);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 982;BA.debugLine="Dim Comando As String=\"GRPCodigoCliente\"";
Debug.ShouldStop(2097152);
_comando = BA.ObjectToString("GRPCodigoCliente");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 983;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
Debug.ShouldStop(4194304);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"CodigoCliente" /*RemoteObject*/ ))})),(Object)(__ref));
 BA.debugLineNum = 984;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "cargagrpclientepedido"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 986;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 987;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 988;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(134217728);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 989;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "cargagrpclientepedido"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 990;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(536870912);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 991;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1073741824);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 993;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(1);
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
 BA.debugLineNum = 994;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(2);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 995;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No hay dato";
Debug.ShouldStop(4);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("No hay datos navision para el cliente "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"CodigoCliente" /*RemoteObject*/ )))),RemoteObject.createImmutable(".")))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 996;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "cargagrpclientepedido"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 997;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(16);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 998;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(32);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1000;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(128);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1001;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(256);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1002;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(512);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1003;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(1024);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
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
 BA.debugLineNum = 1007;BA.debugLine="Return mRes";
Debug.ShouldStop(16384);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1008;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
public static RemoteObject  _cargatarifaventavalidaactualaplicableclientepedido(RemoteObject __ref,RemoteObject _tipotarifa,RemoteObject _codigotarifa,RemoteObject _borrartabla) throws Exception{
try {
		Debug.PushSubsStack("CargaTarifaVentaValidaActualAplicableClientePedido (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,1011);
if (RapidSub.canDelegate("cargatarifaventavalidaactualaplicableclientepedido")) { return __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","cargatarifaventavalidaactualaplicableclientepedido", __ref, _tipotarifa, _codigotarifa, _borrartabla);}
ResumableSub_CargaTarifaVentaValidaActualAplicableClientePedido rsub = new ResumableSub_CargaTarifaVentaValidaActualAplicableClientePedido(null,__ref,_tipotarifa,_codigotarifa,_borrartabla);
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
public static class ResumableSub_CargaTarifaVentaValidaActualAplicableClientePedido extends BA.ResumableSub {
public ResumableSub_CargaTarifaVentaValidaActualAplicableClientePedido(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,RemoteObject __ref,RemoteObject _tipotarifa,RemoteObject _codigotarifa,RemoteObject _borrartabla) {
this.parent = parent;
this.__ref = __ref;
this._tipotarifa = _tipotarifa;
this._codigotarifa = _codigotarifa;
this._borrartabla = _borrartabla;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
RemoteObject _tipotarifa;
RemoteObject _codigotarifa;
RemoteObject _borrartabla;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaTarifaVentaValidaActualAplicableClientePedido (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,1011);
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
Debug.locals.put("TipoTarifa", _tipotarifa);
Debug.locals.put("CodigoTarifa", _codigotarifa);
Debug.locals.put("BorrarTabla", _borrartabla);
 BA.debugLineNum = 1013;BA.debugLine="If BorrarTabla Then mSQL.ExecNonQuery(\"delete fro";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 6;
if (_borrartabla.<Boolean>get().booleanValue()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblGeneracionFicherosCSVPlantillaPedidosVentaTarifaVentaAplicableCliente")));
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1015;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(4194304);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1016;BA.debugLine="Dim lstReg As List";
Debug.ShouldStop(8388608);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1017;BA.debugLine="lstReg.Initialize";
Debug.ShouldStop(16777216);
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 1018;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(33554432);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1019;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(67108864);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1020;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(134217728);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1021;BA.debugLine="mRes.Put(\"lstReg\",lstReg)";
Debug.ShouldStop(268435456);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 1022;BA.debugLine="Dim Comando As String=\"TarifaVentaActualTipoTarif";
Debug.ShouldStop(536870912);
_comando = BA.ObjectToString("TarifaVentaActualTipoTarifaCodigoTarifa");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 1023;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
Debug.ShouldStop(1073741824);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_tipotarifa),(_codigotarifa)})),(Object)(__ref));
 BA.debugLineNum = 1025;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "cargatarifaventavalidaactualaplicableclientepedido"), null);
this.state = 19;
return;
case 19:
//C
this.state = 7;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1027;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(4);
if (true) break;

case 7:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 18;
 BA.debugLineNum = 1028;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(8);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1029;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(16);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1030;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "cargatarifaventavalidaactualaplicableclientepedido"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
 BA.debugLineNum = 1031;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(64);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1032;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(128);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1034;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(512);
if (true) break;

case 12:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
 BA.debugLineNum = 1035;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(1024);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1038;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(8192);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1039;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(16384);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1041;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(65536);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1042;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(131072);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1043;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(262144);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1044;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(524288);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 1047;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
Debug.ShouldStop(4194304);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblGeneracionFicherosCSVPlantillaPedidosVentaTarifaVentaAplicableCliente")),(Object)(_lstreg));
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
 BA.debugLineNum = 1050;BA.debugLine="Return mRes";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1051;BA.debugLine="End Sub";
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
public static RemoteObject  _checkdatoscabeceraobligatorios(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckDatosCabeceraObligatorios (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,718);
if (RapidSub.canDelegate("checkdatoscabeceraobligatorios")) { return __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","checkdatoscabeceraobligatorios", __ref);}
ResumableSub_CheckDatosCabeceraObligatorios rsub = new ResumableSub_CheckDatosCabeceraObligatorios(null,__ref);
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
public static class ResumableSub_CheckDatosCabeceraObligatorios extends BA.ResumableSub {
public ResumableSub_CheckDatosCabeceraObligatorios(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _numdirenv = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CheckDatosCabeceraObligatorios (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,718);
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
 BA.debugLineNum = 720;BA.debugLine="If DatosPlantillaPedidoVentaCab.CodigoCliente=\"\"";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"CodigoCliente" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 721;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"El Código de";
Debug.ShouldStop(65536);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("El Código de Cliente es obligatorio.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 722;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "checkdatoscabeceraobligatorios"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 4;
;
 BA.debugLineNum = 723;BA.debugLine="Return False";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 726;BA.debugLine="Dim NumDirEnv As Int=mSQL.ExecQuerySingleResult2(";
Debug.ShouldStop(2097152);
_numdirenv = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select count(*) from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW where CodigoCliente=? and CodigoDireccionEnvio<>?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"CodigoCliente" /*RemoteObject*/ ),RemoteObject.createImmutable("")}))))));Debug.locals.put("NumDirEnv", _numdirenv);Debug.locals.put("NumDirEnv", _numdirenv);
 BA.debugLineNum = 729;BA.debugLine="If NumDirEnv>0 And DatosPlantillaPedidoVentaCab.C";
Debug.ShouldStop(16777216);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean(">",_numdirenv,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("=",__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"CodigoDireccionEnvio" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 730;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"El Cliente s";
Debug.ShouldStop(33554432);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("El Cliente seleccionado ("),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"CodigoCliente" /*RemoteObject*/ )))),RemoteObject.createImmutable(") tiene direcciones de envío.\n"),RemoteObject.createImmutable("Es obligatorio seleccionar Dirección de envío.")))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 732;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "checkdatoscabeceraobligatorios"), _msa);
this.state = 19;
return;
case 19:
//C
this.state = 8;
;
 BA.debugLineNum = 733;BA.debugLine="Return False";
Debug.ShouldStop(268435456);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 736;BA.debugLine="If DatosPlantillaPedidoVentaCab.AlmacenOrigen=\"\"";
Debug.ShouldStop(-2147483648);

case 8:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"AlmacenOrigen" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 737;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"El Almacén de";
Debug.ShouldStop(1);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("El Almacén de Origen es obligatorio.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 738;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "checkdatoscabeceraobligatorios"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 11;
;
 BA.debugLineNum = 739;BA.debugLine="Return False";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 742;BA.debugLine="If DatosPlantillaPedidoVentaCab.FechaPedidoClient";
Debug.ShouldStop(32);

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"FechaPedidoCliente" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 743;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La Fecha de P";
Debug.ShouldStop(64);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("La Fecha de Pedido de cliente es obligatoria.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 744;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "checkdatoscabeceraobligatorios"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 14;
;
 BA.debugLineNum = 745;BA.debugLine="Return False";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 748;BA.debugLine="If DatosPlantillaPedidoVentaCab.DocumentoExterno=";
Debug.ShouldStop(2048);

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"DocumentoExterno" /*RemoteObject*/ ),BA.NumberToString(0))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 749;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"El documento";
Debug.ShouldStop(4096);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("El documento externo (Pedido de cliente) es obligatorio.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 750;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "checkdatoscabeceraobligatorios"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 17;
;
 BA.debugLineNum = 751;BA.debugLine="Return False";
Debug.ShouldStop(16384);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 17:
//C
this.state = -1;
;
 BA.debugLineNum = 754;BA.debugLine="Return True";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 755;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
public static RemoteObject  _chkboxfiltrocif_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkboxFiltroCIF_CheckedChange (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,695);
if (RapidSub.canDelegate("chkboxfiltrocif_checkedchange")) { return __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","chkboxfiltrocif_checkedchange", __ref, _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 695;BA.debugLine="Private Sub chkboxFiltroCIF_CheckedChange(Checked";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 696;BA.debugLine="txtBuscarClienteDireccionEnvio.Text=\"\"";
Debug.ShouldStop(8388608);
__ref.getField(false,"_txtbuscarclientedireccionenvio" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 697;BA.debugLine="ActualizarDatosCLV";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.docU.cgeneracionficheroscsvplantillapedidosventa.class, "_actualizardatosclv" /*RemoteObject*/ );
 BA.debugLineNum = 698;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
cgeneracionficheroscsvplantillapedidosventa._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cgeneracionficheroscsvplantillapedidosventa._fx);
 //BA.debugLineNum = 3;BA.debugLine="Private frm As Form";
cgeneracionficheroscsvplantillapedidosventa._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",cgeneracionficheroscsvplantillapedidosventa._frm);
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
cgeneracionficheroscsvplantillapedidosventa._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cgeneracionficheroscsvplantillapedidosventa._xui);
 //BA.debugLineNum = 6;BA.debugLine="Private mSQL As SQL";
cgeneracionficheroscsvplantillapedidosventa._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",cgeneracionficheroscsvplantillapedidosventa._msql);
 //BA.debugLineNum = 8;BA.debugLine="Private Dialog As B4XDialog";
cgeneracionficheroscsvplantillapedidosventa._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",cgeneracionficheroscsvplantillapedidosventa._dialog);
 //BA.debugLineNum = 10;BA.debugLine="Public PermisoModuloUsuario As String";
cgeneracionficheroscsvplantillapedidosventa._permisomodulousuario = RemoteObject.createImmutable("");__ref.setField("_permisomodulousuario",cgeneracionficheroscsvplantillapedidosventa._permisomodulousuario);
 //BA.debugLineNum = 11;BA.debugLine="Private btnSalir As B4XView";
cgeneracionficheroscsvplantillapedidosventa._btnsalir = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnsalir",cgeneracionficheroscsvplantillapedidosventa._btnsalir);
 //BA.debugLineNum = 13;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
cgeneracionficheroscsvplantillapedidosventa._jamloadingindicator1 = RemoteObject.createNew ("b4j.docU.jamloadingindicator");__ref.setField("_jamloadingindicator1",cgeneracionficheroscsvplantillapedidosventa._jamloadingindicator1);
 //BA.debugLineNum = 15;BA.debugLine="Private RutaFicheroSeleccionado As String";
cgeneracionficheroscsvplantillapedidosventa._rutaficheroseleccionado = RemoteObject.createImmutable("");__ref.setField("_rutaficheroseleccionado",cgeneracionficheroscsvplantillapedidosventa._rutaficheroseleccionado);
 //BA.debugLineNum = 17;BA.debugLine="Private btnSelFicheroFTP As B4XView";
cgeneracionficheroscsvplantillapedidosventa._btnselficheroftp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnselficheroftp",cgeneracionficheroscsvplantillapedidosventa._btnselficheroftp);
 //BA.debugLineNum = 18;BA.debugLine="Private txtFicheroSeleccionado As B4XView";
cgeneracionficheroscsvplantillapedidosventa._txtficheroseleccionado = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtficheroseleccionado",cgeneracionficheroscsvplantillapedidosventa._txtficheroseleccionado);
 //BA.debugLineNum = 19;BA.debugLine="Private txtCIFCliente As B4XView";
cgeneracionficheroscsvplantillapedidosventa._txtcifcliente = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtcifcliente",cgeneracionficheroscsvplantillapedidosventa._txtcifcliente);
 //BA.debugLineNum = 20;BA.debugLine="Private pnlFondoGeneracionFicherosCSVPedidosVenta";
cgeneracionficheroscsvplantillapedidosventa._pnlfondogeneracionficheroscsvpedidosventa = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlfondogeneracionficheroscsvpedidosventa",cgeneracionficheroscsvplantillapedidosventa._pnlfondogeneracionficheroscsvpedidosventa);
 //BA.debugLineNum = 21;BA.debugLine="Private lblItemBuscarCienteDireccionEnvio As B4XV";
cgeneracionficheroscsvplantillapedidosventa._lblitembuscarcientedireccionenvio = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblitembuscarcientedireccionenvio",cgeneracionficheroscsvplantillapedidosventa._lblitembuscarcientedireccionenvio);
 //BA.debugLineNum = 22;BA.debugLine="Private lblCancelarBuscarClienteDireccionEnvio As";
cgeneracionficheroscsvplantillapedidosventa._lblcancelarbuscarclientedireccionenvio = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblcancelarbuscarclientedireccionenvio",cgeneracionficheroscsvplantillapedidosventa._lblcancelarbuscarclientedireccionenvio);
 //BA.debugLineNum = 23;BA.debugLine="Private lblTitleBuscarClienteDireccionEnvio As B4";
cgeneracionficheroscsvplantillapedidosventa._lbltitlebuscarclientedireccionenvio = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbltitlebuscarclientedireccionenvio",cgeneracionficheroscsvplantillapedidosventa._lbltitlebuscarclientedireccionenvio);
 //BA.debugLineNum = 24;BA.debugLine="Private lblTitleDatoBuscar As B4XView";
cgeneracionficheroscsvplantillapedidosventa._lbltitledatobuscar = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbltitledatobuscar",cgeneracionficheroscsvplantillapedidosventa._lbltitledatobuscar);
 //BA.debugLineNum = 25;BA.debugLine="Private pnlFondoBuscarClienteDireccionEnvio As B4";
cgeneracionficheroscsvplantillapedidosventa._pnlfondobuscarclientedireccionenvio = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlfondobuscarclientedireccionenvio",cgeneracionficheroscsvplantillapedidosventa._pnlfondobuscarclientedireccionenvio);
 //BA.debugLineNum = 26;BA.debugLine="Private txtBuscarClienteDireccionEnvio As B4XView";
cgeneracionficheroscsvplantillapedidosventa._txtbuscarclientedireccionenvio = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtbuscarclientedireccionenvio",cgeneracionficheroscsvplantillapedidosventa._txtbuscarclientedireccionenvio);
 //BA.debugLineNum = 27;BA.debugLine="Private chkboxFiltroCIF As CheckBox";
cgeneracionficheroscsvplantillapedidosventa._chkboxfiltrocif = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");__ref.setField("_chkboxfiltrocif",cgeneracionficheroscsvplantillapedidosventa._chkboxfiltrocif);
 //BA.debugLineNum = 28;BA.debugLine="Private CLVBuscarClienteDireccionEnvio As CustomL";
cgeneracionficheroscsvplantillapedidosventa._clvbuscarclientedireccionenvio = RemoteObject.createNew ("b4j.example.customlistview");__ref.setField("_clvbuscarclientedireccionenvio",cgeneracionficheroscsvplantillapedidosventa._clvbuscarclientedireccionenvio);
 //BA.debugLineNum = 30;BA.debugLine="Private AnchoCLV As Double";
cgeneracionficheroscsvplantillapedidosventa._anchoclv = RemoteObject.createImmutable(0);__ref.setField("_anchoclv",cgeneracionficheroscsvplantillapedidosventa._anchoclv);
 //BA.debugLineNum = 31;BA.debugLine="Private mAlturaItems As Double";
cgeneracionficheroscsvplantillapedidosventa._malturaitems = RemoteObject.createImmutable(0);__ref.setField("_malturaitems",cgeneracionficheroscsvplantillapedidosventa._malturaitems);
 //BA.debugLineNum = 32;BA.debugLine="Public ColorFondoPanelItemsImpares As Int";
cgeneracionficheroscsvplantillapedidosventa._colorfondopanelitemsimpares = RemoteObject.createImmutable(0);__ref.setField("_colorfondopanelitemsimpares",cgeneracionficheroscsvplantillapedidosventa._colorfondopanelitemsimpares);
 //BA.debugLineNum = 33;BA.debugLine="Public ColorFondoPanelItemsPares As Int";
cgeneracionficheroscsvplantillapedidosventa._colorfondopanelitemspares = RemoteObject.createImmutable(0);__ref.setField("_colorfondopanelitemspares",cgeneracionficheroscsvplantillapedidosventa._colorfondopanelitemspares);
 //BA.debugLineNum = 34;BA.debugLine="Private ArrayColoresItems(2) As Int";
cgeneracionficheroscsvplantillapedidosventa._arraycoloresitems = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});__ref.setField("_arraycoloresitems",cgeneracionficheroscsvplantillapedidosventa._arraycoloresitems);
 //BA.debugLineNum = 36;BA.debugLine="Private BackgroundBuscarClienteDireccionEnvio As";
cgeneracionficheroscsvplantillapedidosventa._backgroundbuscarclientedireccionenvio = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_backgroundbuscarclientedireccionenvio",cgeneracionficheroscsvplantillapedidosventa._backgroundbuscarclientedireccionenvio);
 //BA.debugLineNum = 37;BA.debugLine="Private BaseBuscarClienteDireccionEnvio As B4XVie";
cgeneracionficheroscsvplantillapedidosventa._basebuscarclientedireccionenvio = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_basebuscarclientedireccionenvio",cgeneracionficheroscsvplantillapedidosventa._basebuscarclientedireccionenvio);
 //BA.debugLineNum = 38;BA.debugLine="Private CampoBusqueda As String";
cgeneracionficheroscsvplantillapedidosventa._campobusqueda = RemoteObject.createImmutable("");__ref.setField("_campobusqueda",cgeneracionficheroscsvplantillapedidosventa._campobusqueda);
 //BA.debugLineNum = 45;BA.debugLine="Private txtCodigoCliente As B4XView";
cgeneracionficheroscsvplantillapedidosventa._txtcodigocliente = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtcodigocliente",cgeneracionficheroscsvplantillapedidosventa._txtcodigocliente);
 //BA.debugLineNum = 46;BA.debugLine="Private txtNombreCliente As B4XView";
cgeneracionficheroscsvplantillapedidosventa._txtnombrecliente = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtnombrecliente",cgeneracionficheroscsvplantillapedidosventa._txtnombrecliente);
 //BA.debugLineNum = 47;BA.debugLine="Private txtCodigoDireccionEnvio As B4XView";
cgeneracionficheroscsvplantillapedidosventa._txtcodigodireccionenvio = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtcodigodireccionenvio",cgeneracionficheroscsvplantillapedidosventa._txtcodigodireccionenvio);
 //BA.debugLineNum = 48;BA.debugLine="Private txtNombreDireccionEnvio As B4XView";
cgeneracionficheroscsvplantillapedidosventa._txtnombredireccionenvio = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtnombredireccionenvio",cgeneracionficheroscsvplantillapedidosventa._txtnombredireccionenvio);
 //BA.debugLineNum = 49;BA.debugLine="Private btnSelDocumentoExterno As B4XView";
cgeneracionficheroscsvplantillapedidosventa._btnseldocumentoexterno = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnseldocumentoexterno",cgeneracionficheroscsvplantillapedidosventa._btnseldocumentoexterno);
 //BA.debugLineNum = 50;BA.debugLine="Private txtDocumentoExterno As B4XView";
cgeneracionficheroscsvplantillapedidosventa._txtdocumentoexterno = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtdocumentoexterno",cgeneracionficheroscsvplantillapedidosventa._txtdocumentoexterno);
 //BA.debugLineNum = 51;BA.debugLine="Private btnSelFechaPedidoCliente As B4XView";
cgeneracionficheroscsvplantillapedidosventa._btnselfechapedidocliente = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnselfechapedidocliente",cgeneracionficheroscsvplantillapedidosventa._btnselfechapedidocliente);
 //BA.debugLineNum = 52;BA.debugLine="Private txtFechaPedidoCliente As B4XView";
cgeneracionficheroscsvplantillapedidosventa._txtfechapedidocliente = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtfechapedidocliente",cgeneracionficheroscsvplantillapedidosventa._txtfechapedidocliente);
 //BA.debugLineNum = 53;BA.debugLine="Private btnSelAlmacen As B4XView";
cgeneracionficheroscsvplantillapedidosventa._btnselalmacen = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnselalmacen",cgeneracionficheroscsvplantillapedidosventa._btnselalmacen);
 //BA.debugLineNum = 54;BA.debugLine="Private txtAlmacen As B4XView";
cgeneracionficheroscsvplantillapedidosventa._txtalmacen = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtalmacen",cgeneracionficheroscsvplantillapedidosventa._txtalmacen);
 //BA.debugLineNum = 56;BA.debugLine="Type TipoDatosPlantillaPedidoVentaCab (CodigoClie";
;
 //BA.debugLineNum = 59;BA.debugLine="Private DatosPlantillaPedidoVentaCab As TipoDatos";
cgeneracionficheroscsvplantillapedidosventa._datosplantillapedidoventacab = RemoteObject.createNew ("b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab");__ref.setField("_datosplantillapedidoventacab",cgeneracionficheroscsvplantillapedidosventa._datosplantillapedidoventacab);
 //BA.debugLineNum = 62;BA.debugLine="Private jamTableView1 As jamTableView";
cgeneracionficheroscsvplantillapedidosventa._jamtableview1 = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableview1",cgeneracionficheroscsvplantillapedidosventa._jamtableview1);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _clvbuscarclientedireccionenvio_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLVBuscarClienteDireccionEnvio_ItemClick (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,415);
if (RapidSub.canDelegate("clvbuscarclientedireccionenvio_itemclick")) { __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","clvbuscarclientedireccionenvio_itemclick", __ref, _index, _value); return;}
ResumableSub_CLVBuscarClienteDireccionEnvio_ItemClick rsub = new ResumableSub_CLVBuscarClienteDireccionEnvio_ItemClick(null,__ref,_index,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CLVBuscarClienteDireccionEnvio_ItemClick extends BA.ResumableSub {
public ResumableSub_CLVBuscarClienteDireccionEnvio_ItemClick(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,RemoteObject __ref,RemoteObject _index,RemoteObject _value) {
this.parent = parent;
this.__ref = __ref;
this._index = _index;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
RemoteObject _index;
RemoteObject _value;
RemoteObject _sdata = RemoteObject.createImmutable("");
RemoteObject _clientesel = RemoteObject.createImmutable("");
RemoteObject _primerguion = RemoteObject.createImmutable(0);
RemoteObject _segundoguion = RemoteObject.createImmutable(0);
RemoteObject _nombreclientesel = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdatareg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _direnviosel = RemoteObject.createImmutable("");
RemoteObject _nombredirenviosel = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CLVBuscarClienteDireccionEnvio_ItemClick (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,415);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 417;BA.debugLine="Dim sData As String=Value";
Debug.ShouldStop(1);
_sdata = BA.ObjectToString(_value);Debug.locals.put("sData", _sdata);Debug.locals.put("sData", _sdata);
 BA.debugLineNum = 418;BA.debugLine="Log(\"Datos Item seleccionado (\" & Index & \"): \" )";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","836765699",RemoteObject.concat(RemoteObject.createImmutable("Datos Item seleccionado ("),_index,RemoteObject.createImmutable("): ")),0);
 BA.debugLineNum = 420;BA.debugLine="BackgroundBuscarClienteDireccionEnvio.RemoveAllVi";
Debug.ShouldStop(8);
__ref.getField(false,"_backgroundbuscarclientedireccionenvio" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 421;BA.debugLine="BackgroundBuscarClienteDireccionEnvio.RemoveViewF";
Debug.ShouldStop(16);
__ref.getField(false,"_backgroundbuscarclientedireccionenvio" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 423;BA.debugLine="Select Case CampoBusqueda";
Debug.ShouldStop(64);
if (true) break;

case 1:
//select
this.state = 21;
switch (BA.switchObjectToInt(__ref.getField(true,"_campobusqueda" /*RemoteObject*/ ),BA.ObjectToString("Cliente"),BA.ObjectToString("DireccionEnvio"))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 20;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 426;BA.debugLine="jamLoadingIndicator1.MensajeLoading=$\"Cargando";
Debug.ShouldStop(512);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",((RemoteObject.createImmutable("Cargando datos de cliente..."))));
 BA.debugLineNum = 427;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(1024);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 428;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblGeneracionFic";
Debug.ShouldStop(2048);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblGeneracionFicherosCSVPlantillaPedidosVentaTarifaVentaAplicableCliente")));
 BA.debugLineNum = 430;BA.debugLine="Dim ClienteSel As String=mSQL.ExecQuerySingleRe";
Debug.ShouldStop(8192);
_clientesel = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select distinct CodigoCliente from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW where ClienteComb=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_sdata})))));Debug.locals.put("ClienteSel", _clientesel);Debug.locals.put("ClienteSel", _clientesel);
 BA.debugLineNum = 432;BA.debugLine="Dim PrimerGuion As Int=sData.IndexOf2(\"_\",0)";
Debug.ShouldStop(32768);
_primerguion = _sdata.runMethod(true,"indexOf",(Object)(BA.ObjectToString("_")),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("PrimerGuion", _primerguion);Debug.locals.put("PrimerGuion", _primerguion);
 BA.debugLineNum = 433;BA.debugLine="Dim SegundoGuion As Int=sData.IndexOf2(\"_\",Prim";
Debug.ShouldStop(65536);
_segundoguion = _sdata.runMethod(true,"indexOf",(Object)(BA.ObjectToString("_")),(Object)(RemoteObject.solve(new RemoteObject[] {_primerguion,RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("SegundoGuion", _segundoguion);Debug.locals.put("SegundoGuion", _segundoguion);
 BA.debugLineNum = 434;BA.debugLine="Dim NombreClienteSel As String=sData.SubString2";
Debug.ShouldStop(131072);
_nombreclientesel = _sdata.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_primerguion,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_segundoguion));Debug.locals.put("NombreClienteSel", _nombreclientesel);Debug.locals.put("NombreClienteSel", _nombreclientesel);
 BA.debugLineNum = 435;BA.debugLine="DatosPlantillaPedidoVentaCab.CodigoCliente=Clie";
Debug.ShouldStop(262144);
__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).setField ("CodigoCliente" /*RemoteObject*/ ,_clientesel);
 BA.debugLineNum = 436;BA.debugLine="DatosPlantillaPedidoVentaCab.NombreCliente=Nomb";
Debug.ShouldStop(524288);
__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).setField ("NombreCliente" /*RemoteObject*/ ,_nombreclientesel);
 BA.debugLineNum = 437;BA.debugLine="txtCodigoCliente.Text=DatosPlantillaPedidoVenta";
Debug.ShouldStop(1048576);
__ref.getField(false,"_txtcodigocliente" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"CodigoCliente" /*RemoteObject*/ ));
 BA.debugLineNum = 438;BA.debugLine="txtNombreCliente.Text=DatosPlantillaPedidoVenta";
Debug.ShouldStop(2097152);
__ref.getField(false,"_txtnombrecliente" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"NombreCliente" /*RemoteObject*/ ));
 BA.debugLineNum = 440;BA.debugLine="jamLoadingIndicator1.MensajeLoading=$\"Cargando";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",((RemoteObject.concat(RemoteObject.createImmutable("Cargando datos de tipo tarifa y codigo tarifa precios venta cliente "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"CodigoCliente" /*RemoteObject*/ )))),RemoteObject.createImmutable("...")))));
 BA.debugLineNum = 441;BA.debugLine="Wait For(CargaGRPClientePedido) complete (mRes";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "clvbuscarclientedireccionenvio_itemclick"), __ref.runClassMethod (b4j.docU.cgeneracionficheroscsvplantillapedidosventa.class, "_cargagrpclientepedido" /*RemoteObject*/ ));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 442;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(33554432);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 443;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(67108864);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("NOK"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 444;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 445;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No ha sido";
Debug.ShouldStop(268435456);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible cargar el tipo tarifa y código tarifa de precios aplicables al cliente seleccionado "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"CodigoCliente" /*RemoteObject*/ )))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 446;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "clvbuscarclientedireccionenvio_itemclick"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 7;
;
 BA.debugLineNum = 447;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 449;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(1);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 450;BA.debugLine="Dim mDataReg As Map=lstReg.Get(0)";
Debug.ShouldStop(2);
_mdatareg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdatareg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mDataReg", _mdatareg);Debug.locals.put("mDataReg", _mdatareg);
 BA.debugLineNum = 451;BA.debugLine="DatosPlantillaPedidoVentaCab.GRPCliente=mDataRe";
Debug.ShouldStop(4);
__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).setField ("GRPCliente" /*RemoteObject*/ ,BA.ObjectToString(_mdatareg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("GRP"))))));
 BA.debugLineNum = 453;BA.debugLine="jamLoadingIndicator1.MensajeLoading=$\"Cargando";
Debug.ShouldStop(16);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",((RemoteObject.concat(RemoteObject.createImmutable("Cargando datos de precios venta del cliente "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"CodigoCliente" /*RemoteObject*/ )))),RemoteObject.createImmutable("...")))));
 BA.debugLineNum = 454;BA.debugLine="Wait For(CargaTarifaVentaValidaActualAplicableC";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "clvbuscarclientedireccionenvio_itemclick"), __ref.runClassMethod (b4j.docU.cgeneracionficheroscsvplantillapedidosventa.class, "_cargatarifaventavalidaactualaplicableclientepedido" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"CodigoCliente" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True"))));
this.state = 24;
return;
case 24:
//C
this.state = 8;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 455;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(64);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 456;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(128);
if (true) break;

case 8:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("NOK"))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 457;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(256);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 458;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No ha sido";
Debug.ShouldStop(512);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible cargar los datos de la tarifa de precios del cliente seleccionado "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"CodigoCliente" /*RemoteObject*/ )))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 459;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "clvbuscarclientedireccionenvio_itemclick"), _msa);
this.state = 25;
return;
case 25:
//C
this.state = 11;
;
 if (true) break;
;
 BA.debugLineNum = 462;BA.debugLine="If DatosPlantillaPedidoVentaCab.GRPCliente<>\"\"";
Debug.ShouldStop(8192);

case 11:
//if
this.state = 18;
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"GRPCliente" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 463;BA.debugLine="jamLoadingIndicator1.MensajeLoading=$\"Cargando";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",((RemoteObject.concat(RemoteObject.createImmutable("Cargando datos de precios venta del grupo precios cliente "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"GRPCliente" /*RemoteObject*/ )))),RemoteObject.createImmutable("...")))));
 BA.debugLineNum = 464;BA.debugLine="Wait For(CargaTarifaVentaValidaActualAplicable";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "clvbuscarclientedireccionenvio_itemclick"), __ref.runClassMethod (b4j.docU.cgeneracionficheroscsvplantillapedidosventa.class, "_cargatarifaventavalidaactualaplicableclientepedido" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"GRPCliente" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False"))));
this.state = 26;
return;
case 26:
//C
this.state = 14;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 465;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(65536);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 466;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(131072);
if (true) break;

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("NOK"))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 467;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(262144);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 468;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No ha sid";
Debug.ShouldStop(524288);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible cargar los datos de la tarifa de precios del grupo precios cliente seleccionado "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"GRPCliente" /*RemoteObject*/ )))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 469;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "clvbuscarclientedireccionenvio_itemclick"), _msa);
this.state = 27;
return;
case 27:
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
this.state = 21;
;
 BA.debugLineNum = 473;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 478;BA.debugLine="Dim DirEnvioSel As String=mSQL.ExecQuerySingleR";
Debug.ShouldStop(536870912);
_direnviosel = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select distinct CodigoDireccionEnvio from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW where DireccionEnvioComb=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_sdata})))));Debug.locals.put("DirEnvioSel", _direnviosel);Debug.locals.put("DirEnvioSel", _direnviosel);
 BA.debugLineNum = 480;BA.debugLine="Dim PrimerGuion As Int=sData.IndexOf2(\"_\",0)";
Debug.ShouldStop(-2147483648);
_primerguion = _sdata.runMethod(true,"indexOf",(Object)(BA.ObjectToString("_")),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("PrimerGuion", _primerguion);Debug.locals.put("PrimerGuion", _primerguion);
 BA.debugLineNum = 481;BA.debugLine="Dim SegundoGuion As Int=sData.IndexOf2(\"_\",Prim";
Debug.ShouldStop(1);
_segundoguion = _sdata.runMethod(true,"indexOf",(Object)(BA.ObjectToString("_")),(Object)(RemoteObject.solve(new RemoteObject[] {_primerguion,RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("SegundoGuion", _segundoguion);Debug.locals.put("SegundoGuion", _segundoguion);
 BA.debugLineNum = 482;BA.debugLine="Dim NombreDirEnvioSel As String=sData.SubString";
Debug.ShouldStop(2);
_nombredirenviosel = _sdata.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_primerguion,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_segundoguion));Debug.locals.put("NombreDirEnvioSel", _nombredirenviosel);Debug.locals.put("NombreDirEnvioSel", _nombredirenviosel);
 BA.debugLineNum = 483;BA.debugLine="DatosPlantillaPedidoVentaCab.CodigoDireccionEnv";
Debug.ShouldStop(4);
__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).setField ("CodigoDireccionEnvio" /*RemoteObject*/ ,_direnviosel);
 BA.debugLineNum = 484;BA.debugLine="DatosPlantillaPedidoVentaCab.NombreDireccionEnv";
Debug.ShouldStop(8);
__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).setField ("NombreDireccionEnvio" /*RemoteObject*/ ,_nombredirenviosel);
 BA.debugLineNum = 485;BA.debugLine="txtCodigoDireccionEnvio.Text=DatosPlantillaPedi";
Debug.ShouldStop(16);
__ref.getField(false,"_txtcodigodireccionenvio" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"CodigoDireccionEnvio" /*RemoteObject*/ ));
 BA.debugLineNum = 487;BA.debugLine="txtNombreDireccionEnvio.Text=sData.Replace(\"_\",";
Debug.ShouldStop(64);
__ref.getField(false,"_txtnombredireccionenvio" /*RemoteObject*/ ).runMethod(true,"setText",_sdata.runMethod(true,"replace",(Object)(BA.ObjectToString("_")),(Object)(RemoteObject.createImmutable("   "))));
 if (true) break;

case 21:
//C
this.state = -1;
;
 BA.debugLineNum = 495;BA.debugLine="End Sub";
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
public static RemoteObject  _clvbuscarclientedireccionenvio_itemlongclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLVBuscarClienteDireccionEnvio_ItemLongClick (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,498);
if (RapidSub.canDelegate("clvbuscarclientedireccionenvio_itemlongclick")) { return __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","clvbuscarclientedireccionenvio_itemlongclick", __ref, _index, _value);}
RemoteObject _sdata = RemoteObject.createImmutable("");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 498;BA.debugLine="Sub CLVBuscarClienteDireccionEnvio_ItemLongClick(I";
Debug.ShouldStop(131072);
 BA.debugLineNum = 500;BA.debugLine="Dim sData As String=Value";
Debug.ShouldStop(524288);
_sdata = BA.ObjectToString(_value);Debug.locals.put("sData", _sdata);Debug.locals.put("sData", _sdata);
 BA.debugLineNum = 501;BA.debugLine="Log(\"Datos Item seleccionado botón secundario (\"";
Debug.ShouldStop(1048576);
cgeneracionficheroscsvplantillapedidosventa.__c.runVoidMethod ("LogImpl","836831235",RemoteObject.concat(RemoteObject.createImmutable("Datos Item seleccionado botón secundario ("),_index,RemoteObject.createImmutable("): ")),0);
 BA.debugLineNum = 505;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clvbuscarclientedireccionenvio_visiblerangechanged(RemoteObject __ref,RemoteObject _firstindex,RemoteObject _lastindex) throws Exception{
try {
		Debug.PushSubsStack("CLVBuscarClienteDireccionEnvio_VisibleRangeChanged (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,349);
if (RapidSub.canDelegate("clvbuscarclientedireccionenvio_visiblerangechanged")) { return __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","clvbuscarclientedireccionenvio_visiblerangechanged", __ref, _firstindex, _lastindex);}
RemoteObject _extrasize = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _sdata = RemoteObject.createImmutable("");
Debug.locals.put("FirstIndex", _firstindex);
Debug.locals.put("LastIndex", _lastindex);
 BA.debugLineNum = 349;BA.debugLine="Sub CLVBuscarClienteDireccionEnvio_VisibleRangeCha";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 350;BA.debugLine="Dim ExtraSize As Int = 30 'Add 5 items at a time,";
Debug.ShouldStop(536870912);
_extrasize = BA.numberCast(int.class, 30);Debug.locals.put("ExtraSize", _extrasize);Debug.locals.put("ExtraSize", _extrasize);
 BA.debugLineNum = 351;BA.debugLine="For i = Max(0, FirstIndex - ExtraSize) To Min(Las";
Debug.ShouldStop(1073741824);
{
final int step2 = 1;
final int limit2 = (int) (0 + cgeneracionficheroscsvplantillapedidosventa.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_lastindex,_extrasize}, "+",1, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvbuscarclientedireccionenvio" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1)))).<Double>get().doubleValue());
_i = (int) (0 + cgeneracionficheroscsvplantillapedidosventa.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_firstindex,_extrasize}, "-",1, 1)))).<Double>get().doubleValue()) ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 352;BA.debugLine="Dim Pnl As B4XView = CLVBuscarClienteDireccionEn";
Debug.ShouldStop(-2147483648);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = __ref.getField(false,"_clvbuscarclientedireccionenvio" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("Pnl", _pnl);Debug.locals.put("Pnl", _pnl);
 BA.debugLineNum = 360;BA.debugLine="If i > FirstIndex - ExtraSize And i < LastIndex";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_firstindex,_extrasize}, "-",1, 1))) && RemoteObject.solveBoolean("<",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_lastindex,_extrasize}, "+",1, 1)))) { 
 BA.debugLineNum = 361;BA.debugLine="If Pnl.NumberOfViews = 0 Then 'Add items to the";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_pnl.runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 363;BA.debugLine="Dim sData As String = CLVBuscarClienteDireccio";
Debug.ShouldStop(1024);
_sdata = BA.ObjectToString(__ref.getField(false,"_clvbuscarclientedireccionenvio" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("sData", _sdata);Debug.locals.put("sData", _sdata);
 BA.debugLineNum = 364;BA.debugLine="Pnl.LoadLayout(\"scrGeneracionFicherosCSVPlanti";
Debug.ShouldStop(2048);
_pnl.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrGeneracionFicherosCSVPlantillaPedidosVentaItemListaBuscar")),__ref.getField(false, "ba"));
 BA.debugLineNum = 366;BA.debugLine="lblItemBuscarCienteDireccionEnvio.Text=sData";
Debug.ShouldStop(8192);
__ref.getField(false,"_lblitembuscarcientedireccionenvio" /*RemoteObject*/ ).runMethod(true,"setText",_sdata);
 };
 }else {
 BA.debugLineNum = 407;BA.debugLine="If Pnl.NumberOfViews > 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_pnl.runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 408;BA.debugLine="Pnl.RemoveAllViews 'Remove none visible item f";
Debug.ShouldStop(8388608);
_pnl.runVoidMethod ("RemoveAllViews");
 };
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 413;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _creaciontablassqlite(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreacionTablasSQLite (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("creaciontablassqlite")) { return __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","creaciontablassqlite", __ref);}
RemoteObject _screartabla = RemoteObject.createImmutable("");
 BA.debugLineNum = 150;BA.debugLine="Sub CreacionTablasSQLite";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 154;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblGenera";
Debug.ShouldStop(33554432);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW")));
 BA.debugLineNum = 156;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
Debug.ShouldStop(134217728);
_screartabla = (RemoteObject.createImmutable("CREATE TABLE If Not EXISTS tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW ([Fila] INTEGER, [CodigoCliente] TEXT, [ClienteComb] TEXT, [CodigoDireccionEnvio] TEXT, [DireccionEnvioComb] TEXT)"));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 157;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 159;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblGenera";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido")));
 BA.debugLineNum = 161;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
Debug.ShouldStop(1);
_screartabla = (RemoteObject.createImmutable("CREATE TABLE If Not EXISTS tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido ( [ReferenciaCruzada] TEXT, [CodigoArticulo] TEXT, [DescripcionArticulo] TEXT, [Talla] TEXT, [Cantidad] INTEGER, [Precio] REAL)"));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 162;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(2);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 164;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblGenera";
Debug.ShouldStop(8);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblGeneracionFicherosCSVPlantillaPedidosVentaTotalesLineasPedidoPorArticulo")));
 BA.debugLineNum = 166;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
Debug.ShouldStop(32);
_screartabla = (RemoteObject.createImmutable("CREATE TABLE If Not EXISTS tblGeneracionFicherosCSVPlantillaPedidosVentaTotalesLineasPedidoPorArticulo ([CodigoArticulo] TEXT, [TotalCantidad] INTEGER)"));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 167;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(64);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 169;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblGenera";
Debug.ShouldStop(256);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblGeneracionFicherosCSVPlantillaPedidosVentaTarifaVentaAplicableCliente")));
 BA.debugLineNum = 170;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
Debug.ShouldStop(512);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblGeneracionFicherosCSVPlantillaPedidosVentaTarifaVentaAplicableCliente] ([TipoTarifa] INTEGER, [CodigoTarifa] TEXT\n"),RemoteObject.createImmutable("	, [Articulo] TEXT, [DescripcionArticulo] TEXT, [Variante] TEXT, [Moneda] TEXT, [UM] TEXT, [CantidadMinima] REAL, [PrecioUnitario] REAL, [FechaInicial] INTEGER, [FechaFinal] INTEGER\n"),RemoteObject.createImmutable("	, [NumTarifa] INTEGER, [UMVenta] TEXT, [FechaCreacion] INTEGER, [CosteUnitario] REAL, [CosteSTD] REAL, [FechaCosteSTD] INTEGER, [GRC] TEXT, [CompraFab] INTEGER\n"),RemoteObject.createImmutable("	, [CosteRazonable] REAL, [FechaCosteRazonable] INTEGER, [Ruta] TEXT, [NombreRuta] TEXT, [LM] TEXT\n"),RemoteObject.createImmutable("	)")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 175;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(16384);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 177;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("frm_CloseRequest (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 135;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="EventData.Consume";
Debug.ShouldStop(128);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _generarficherocsvpedidoventa(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GenerarFicheroCSVPedidoVenta (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,902);
if (RapidSub.canDelegate("generarficherocsvpedidoventa")) { __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","generarficherocsvpedidoventa", __ref); return;}
ResumableSub_GenerarFicheroCSVPedidoVenta rsub = new ResumableSub_GenerarFicheroCSVPedidoVenta(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GenerarFicheroCSVPedidoVenta extends BA.ResumableSub {
public ResumableSub_GenerarFicheroCSVPedidoVenta(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
RemoteObject _numlinpedido = RemoteObject.createImmutable(0);
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _carpetaficherocsv = RemoteObject.createImmutable("");
RemoteObject _uuidpedido = RemoteObject.createImmutable("");
RemoteObject _idpedido = RemoteObject.createImmutable("");
RemoteObject _nombreficherocsv = RemoteObject.createImmutable("");
RemoteObject _codigoclientenav = RemoteObject.createImmutable("");
RemoteObject _codigodireccionenvionav = RemoteObject.createImmutable("");
RemoteObject _almacenorigen = RemoteObject.createImmutable("");
RemoteObject _documentoexterno = RemoteObject.createImmutable("");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _sfechapedidocliente = RemoteObject.createImmutable("");
RemoteObject _lstheaders = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstlineaspedidoventa = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rslineaspedido = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _arrdatoslineapedido = null;
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GenerarFicheroCSVPedidoVenta (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,902);
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
 BA.debugLineNum = 904;BA.debugLine="Dim NumLinPedido As Int=mSQL.ExecQuerySingleResul";
Debug.ShouldStop(128);
_numlinpedido = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult",(Object)(RemoteObject.createImmutable("select count(*) from tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido"))));Debug.locals.put("NumLinPedido", _numlinpedido);Debug.locals.put("NumLinPedido", _numlinpedido);
 BA.debugLineNum = 905;BA.debugLine="If NumLinPedido=0 Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_numlinpedido,BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 906;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se han pro";
Debug.ShouldStop(512);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se han procesado líneas de pedido")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 907;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "generarficherocsvpedidoventa"), _msa);
this.state = 25;
return;
case 25:
//C
this.state = 4;
;
 BA.debugLineNum = 908;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 911;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",\"¿Gener";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "generarficherocsvpedidoventa"), parent._utilidades.runMethod(false,"_msgbox2xui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("¿Generar Fichero CSV para su integración en navision como pedido de venta?")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), parent.__c.getField(false,"Null"))));
this.state = 26;
return;
case 26:
//C
this.state = 5;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 912;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(32768);
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 914;BA.debugLine="Dim CarpetaFicheroCSV As String=\"\\\\192.168.10.6\\P";
Debug.ShouldStop(131072);
_carpetaficherocsv = BA.ObjectToString("\\\\192.168.10.6\\PendientesNAV");Debug.locals.put("CarpetaFicheroCSV", _carpetaficherocsv);Debug.locals.put("CarpetaFicheroCSV", _carpetaficherocsv);
 BA.debugLineNum = 916;BA.debugLine="Dim UUIDPedido As String=Utilidades.GenerarUUIDv4";
Debug.ShouldStop(524288);
_uuidpedido = parent._utilidades.runMethod(true,"_generaruuidv4" /*RemoteObject*/ );Debug.locals.put("UUIDPedido", _uuidpedido);Debug.locals.put("UUIDPedido", _uuidpedido);
 BA.debugLineNum = 917;BA.debugLine="Dim IDPedido As String=$\"PlantillaPedidosVenta_${";
Debug.ShouldStop(1048576);
_idpedido = (RemoteObject.concat(RemoteObject.createImmutable("PlantillaPedidosVenta_"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uuidpedido))),RemoteObject.createImmutable("")));Debug.locals.put("IDPedido", _idpedido);Debug.locals.put("IDPedido", _idpedido);
 BA.debugLineNum = 918;BA.debugLine="Dim NombreFicheroCSV As String=$\"${IDPedido}.csv\"";
Debug.ShouldStop(2097152);
_nombreficherocsv = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_idpedido))),RemoteObject.createImmutable(".csv")));Debug.locals.put("NombreFicheroCSV", _nombreficherocsv);Debug.locals.put("NombreFicheroCSV", _nombreficherocsv);
 BA.debugLineNum = 920;BA.debugLine="Dim CodigoClienteNAV As String=DatosPlantillaPedi";
Debug.ShouldStop(8388608);
_codigoclientenav = __ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"CodigoCliente" /*RemoteObject*/ );Debug.locals.put("CodigoClienteNAV", _codigoclientenav);Debug.locals.put("CodigoClienteNAV", _codigoclientenav);
 BA.debugLineNum = 921;BA.debugLine="Dim CodigoDireccionEnvioNAV As String=DatosPlanti";
Debug.ShouldStop(16777216);
_codigodireccionenvionav = __ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"CodigoDireccionEnvio" /*RemoteObject*/ );Debug.locals.put("CodigoDireccionEnvioNAV", _codigodireccionenvionav);Debug.locals.put("CodigoDireccionEnvioNAV", _codigodireccionenvionav);
 BA.debugLineNum = 922;BA.debugLine="Dim AlmacenOrigen As String=DatosPlantillaPedidoV";
Debug.ShouldStop(33554432);
_almacenorigen = __ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"AlmacenOrigen" /*RemoteObject*/ );Debug.locals.put("AlmacenOrigen", _almacenorigen);Debug.locals.put("AlmacenOrigen", _almacenorigen);
 BA.debugLineNum = 923;BA.debugLine="Dim DocumentoExterno As String=DatosPlantillaPedi";
Debug.ShouldStop(67108864);
_documentoexterno = __ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"DocumentoExterno" /*RemoteObject*/ );Debug.locals.put("DocumentoExterno", _documentoexterno);Debug.locals.put("DocumentoExterno", _documentoexterno);
 BA.debugLineNum = 924;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(134217728);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 925;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(268435456);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 926;BA.debugLine="Dim sFechaPedidoCliente As String=DateTime.Date(D";
Debug.ShouldStop(536870912);
_sfechapedidocliente = parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"FechaPedidoCliente" /*RemoteObject*/ )));Debug.locals.put("sFechaPedidoCliente", _sfechapedidocliente);Debug.locals.put("sFechaPedidoCliente", _sfechapedidocliente);
 BA.debugLineNum = 927;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(1073741824);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 929;BA.debugLine="Dim lstHeaders As List=Array As String(\"Docuware";
Debug.ShouldStop(1);
_lstheaders = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstheaders = parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("Docuware ID"),BA.ObjectToString("Usuario"),BA.ObjectToString("Cliente"),BA.ObjectToString("DireccionEnvio"),BA.ObjectToString("DocumentoExterno"),BA.ObjectToString("AlmacenOrigen"),BA.ObjectToString("FechaPedidoCliente"),BA.ObjectToString("Articulo"),BA.ObjectToString("ReferenciaCruzada"),BA.ObjectToString("Talla"),BA.ObjectToString("Cantidad"),RemoteObject.createImmutable("Precio")})));Debug.locals.put("lstHeaders", _lstheaders);Debug.locals.put("lstHeaders", _lstheaders);
 BA.debugLineNum = 932;BA.debugLine="Dim lstLineasPedidoVenta As List";
Debug.ShouldStop(8);
_lstlineaspedidoventa = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstLineasPedidoVenta", _lstlineaspedidoventa);
 BA.debugLineNum = 933;BA.debugLine="lstLineasPedidoVenta.Initialize";
Debug.ShouldStop(16);
_lstlineaspedidoventa.runVoidMethod ("Initialize");
 BA.debugLineNum = 935;BA.debugLine="Dim rsLineasPedido As ResultSet=mSQL.ExecQuery(\"s";
Debug.ShouldStop(64);
_rslineaspedido = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rslineaspedido = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select ReferenciaCruzada, CodigoArticulo, DescripcionArticulo, Talla, Cantidad, Precio from tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido")));Debug.locals.put("rsLineasPedido", _rslineaspedido);Debug.locals.put("rsLineasPedido", _rslineaspedido);
 BA.debugLineNum = 936;BA.debugLine="Do While rsLineasPedido.NextRow";
Debug.ShouldStop(128);
if (true) break;

case 11:
//do while
this.state = 14;
while (_rslineaspedido.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 13;
if (true) break;
}
if (true) break;

case 13:
//C
this.state = 11;
 BA.debugLineNum = 938;BA.debugLine="Dim ArrDatosLineaPedido(12) As String";
Debug.ShouldStop(512);
_arrdatoslineapedido = RemoteObject.createNewArray ("String", new int[] {12}, new Object[]{});Debug.locals.put("ArrDatosLineaPedido", _arrdatoslineapedido);
 BA.debugLineNum = 939;BA.debugLine="ArrDatosLineaPedido(0)=$\"${UUIDPedido}\"$";
Debug.ShouldStop(1024);
_arrdatoslineapedido.setArrayElement ((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uuidpedido))),RemoteObject.createImmutable(""))),BA.numberCast(int.class, 0));
 BA.debugLineNum = 940;BA.debugLine="ArrDatosLineaPedido(1)=Main.DatosUsuario.NombreA";
Debug.ShouldStop(2048);
_arrdatoslineapedido.setArrayElement (parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreADUsuarioWindows" /*RemoteObject*/ ).runMethod(true,"toUpperCase"),BA.numberCast(int.class, 1));
 BA.debugLineNum = 941;BA.debugLine="ArrDatosLineaPedido(2)=CodigoClienteNAV";
Debug.ShouldStop(4096);
_arrdatoslineapedido.setArrayElement (_codigoclientenav,BA.numberCast(int.class, 2));
 BA.debugLineNum = 942;BA.debugLine="ArrDatosLineaPedido(3)=CodigoDireccionEnvioNAV";
Debug.ShouldStop(8192);
_arrdatoslineapedido.setArrayElement (_codigodireccionenvionav,BA.numberCast(int.class, 3));
 BA.debugLineNum = 943;BA.debugLine="ArrDatosLineaPedido(4)=DocumentoExterno";
Debug.ShouldStop(16384);
_arrdatoslineapedido.setArrayElement (_documentoexterno,BA.numberCast(int.class, 4));
 BA.debugLineNum = 944;BA.debugLine="ArrDatosLineaPedido(5)=AlmacenOrigen";
Debug.ShouldStop(32768);
_arrdatoslineapedido.setArrayElement (_almacenorigen,BA.numberCast(int.class, 5));
 BA.debugLineNum = 945;BA.debugLine="ArrDatosLineaPedido(6)=sFechaPedidoCliente";
Debug.ShouldStop(65536);
_arrdatoslineapedido.setArrayElement (_sfechapedidocliente,BA.numberCast(int.class, 6));
 BA.debugLineNum = 946;BA.debugLine="ArrDatosLineaPedido(7)=rsLineasPedido.GetString(";
Debug.ShouldStop(131072);
_arrdatoslineapedido.setArrayElement (_rslineaspedido.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CodigoArticulo"))),BA.numberCast(int.class, 7));
 BA.debugLineNum = 947;BA.debugLine="ArrDatosLineaPedido(8)=rsLineasPedido.GetString(";
Debug.ShouldStop(262144);
_arrdatoslineapedido.setArrayElement (_rslineaspedido.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ReferenciaCruzada"))),BA.numberCast(int.class, 8));
 BA.debugLineNum = 948;BA.debugLine="ArrDatosLineaPedido(9)=rsLineasPedido.GetString(";
Debug.ShouldStop(524288);
_arrdatoslineapedido.setArrayElement (_rslineaspedido.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Talla"))),BA.numberCast(int.class, 9));
 BA.debugLineNum = 949;BA.debugLine="ArrDatosLineaPedido(10)=rsLineasPedido.GetInt(\"C";
Debug.ShouldStop(1048576);
_arrdatoslineapedido.setArrayElement (BA.NumberToString(_rslineaspedido.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("Cantidad")))),BA.numberCast(int.class, 10));
 BA.debugLineNum = 950;BA.debugLine="ArrDatosLineaPedido(11)=rsLineasPedido.GetDouble";
Debug.ShouldStop(2097152);
_arrdatoslineapedido.setArrayElement (BA.NumberToString(_rslineaspedido.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("Precio")))),BA.numberCast(int.class, 11));
 BA.debugLineNum = 952;BA.debugLine="lstLineasPedidoVenta.Add(ArrDatosLineaPedido)";
Debug.ShouldStop(8388608);
_lstlineaspedidoventa.runVoidMethod ("Add",(Object)((_arrdatoslineapedido)));
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 955;BA.debugLine="rsLineasPedido.Close";
Debug.ShouldStop(67108864);
_rslineaspedido.runVoidMethod ("Close");
 BA.debugLineNum = 957;BA.debugLine="If lstLineasPedidoVenta.Size>0 Then";
Debug.ShouldStop(268435456);
if (true) break;

case 15:
//if
this.state = 24;
if (RemoteObject.solveBoolean(">",_lstlineaspedidoventa.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 958;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(536870912);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 959;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
if (true) break;

case 18:
//try
this.state = 23;
this.catchState = 22;
this.state = 20;
if (true) break;

case 20:
//C
this.state = 23;
this.catchState = 22;
 BA.debugLineNum = 960;BA.debugLine="su.SaveCSV2(CarpetaFicheroCSV,NombreFicheroCSV,";
Debug.ShouldStop(-2147483648);
_su.runVoidMethod ("SaveCSV2",(Object)(_carpetaficherocsv),(Object)(_nombreficherocsv),(Object)(BA.ObjectToChar(";")),(Object)(_lstlineaspedidoventa),(Object)(_lstheaders));
 BA.debugLineNum = 961;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Fichero csv";
Debug.ShouldStop(1);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Fichero csv grabado en el servidor, OK")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 962;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "generarficherocsvpedidoventa"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 23;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 0;
 BA.debugLineNum = 964;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","837814334",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 965;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No ha sido";
Debug.ShouldStop(16);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible generar el fichero csv. \n"),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("ERROR")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 967;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "generarficherocsvpedidoventa"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 23;
;
 if (true) break;
if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
;
 if (true) break;

case 24:
//C
this.state = -1;
;
 BA.debugLineNum = 971;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 66;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(2);
 BA.debugLineNum = 68;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
Debug.ShouldStop(8);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.concat(cgeneracionficheroscsvplantillapedidosventa._main._nombreaplicacion /*RemoteObject*/ ,RemoteObject.createImmutable(".db"))),(Object)(cgeneracionficheroscsvplantillapedidosventa.__c.getField(true,"True")));
 BA.debugLineNum = 72;BA.debugLine="CreacionTablasSQLite";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.docU.cgeneracionficheroscsvplantillapedidosventa.class, "_creaciontablassqlite" /*RemoteObject*/ );
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _jamtableview1_menubarmenuitem_action(RemoteObject __ref,RemoteObject _tagmenuitem) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_MenuBarMenuItem_Action (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,700);
if (RapidSub.canDelegate("jamtableview1_menubarmenuitem_action")) { __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","jamtableview1_menubarmenuitem_action", __ref, _tagmenuitem); return;}
ResumableSub_jamTableView1_MenuBarMenuItem_Action rsub = new ResumableSub_jamTableView1_MenuBarMenuItem_Action(null,__ref,_tagmenuitem);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_jamTableView1_MenuBarMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableView1_MenuBarMenuItem_Action(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,RemoteObject __ref,RemoteObject _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
RemoteObject _tagmenuitem;
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_MenuBarMenuItem_Action (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,700);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("TagMenuItem", _tagmenuitem);
 BA.debugLineNum = 701;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//select
this.state = 12;
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("ProcesarDatosPlantilla"),BA.ObjectToString("GenerarFicheroCSV"))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 704;BA.debugLine="Wait For(CheckDatosCabeceraObligatorios) comple";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "jamtableview1_menubarmenuitem_action"), __ref.runClassMethod (b4j.docU.cgeneracionficheroscsvplantillapedidosventa.class, "_checkdatoscabeceraobligatorios" /*RemoteObject*/ ));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 705;BA.debugLine="If Not(Success) Then Return";
Debug.ShouldStop(1);
if (true) break;

case 4:
//if
this.state = 9;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) return ;
if (true) break;

case 9:
//C
this.state = 12;
;
 BA.debugLineNum = 707;BA.debugLine="ProcesarLineasPlantillaPedidoVenta";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.docU.cgeneracionficheroscsvplantillapedidosventa.class, "_procesarlineasplantillapedidoventa" /*void*/ );
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 711;BA.debugLine="GenerarFicheroCSVPedidoVenta";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.docU.cgeneracionficheroscsvplantillapedidosventa.class, "_generarficherocsvpedidoventa" /*void*/ );
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 715;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
public static RemoteObject  _lblcancelarbuscarclientedireccionenvio_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblCancelarBuscarClienteDireccionEnvio_MouseClicked (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,507);
if (RapidSub.canDelegate("lblcancelarbuscarclientedireccionenvio_mouseclicked")) { return __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","lblcancelarbuscarclientedireccionenvio_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 507;BA.debugLine="Private Sub lblCancelarBuscarClienteDireccionEnvio";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 508;BA.debugLine="BackgroundBuscarClienteDireccionEnvio.RemoveAllVi";
Debug.ShouldStop(134217728);
__ref.getField(false,"_backgroundbuscarclientedireccionenvio" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 509;BA.debugLine="BackgroundBuscarClienteDireccionEnvio.RemoveViewF";
Debug.ShouldStop(268435456);
__ref.getField(false,"_backgroundbuscarclientedireccionenvio" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 510;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblcancelarbuscarclientedireccionenvio_mouseentered(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblCancelarBuscarClienteDireccionEnvio_MouseEntered (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,512);
if (RapidSub.canDelegate("lblcancelarbuscarclientedireccionenvio_mouseentered")) { return __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","lblcancelarbuscarclientedireccionenvio_mouseentered", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 512;BA.debugLine="Private Sub lblCancelarBuscarClienteDireccionEnvio";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 514;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblcancelarbuscarclientedireccionenvio_mouseexited(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblCancelarBuscarClienteDireccionEnvio_MouseExited (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,516);
if (RapidSub.canDelegate("lblcancelarbuscarclientedireccionenvio_mouseexited")) { return __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","lblcancelarbuscarclientedireccionenvio_mouseexited", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 516;BA.debugLine="Private Sub lblCancelarBuscarClienteDireccionEnvio";
Debug.ShouldStop(8);
 BA.debugLineNum = 518;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblcancelarbuscarclientedireccionenvio_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblCancelarBuscarClienteDireccionEnvio_MousePressed (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,520);
if (RapidSub.canDelegate("lblcancelarbuscarclientedireccionenvio_mousepressed")) { return __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","lblcancelarbuscarclientedireccionenvio_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 520;BA.debugLine="Private Sub lblCancelarBuscarClienteDireccionEnvio";
Debug.ShouldStop(128);
 BA.debugLineNum = 522;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _limpiardatos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LimpiarDatos (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,234);
if (RapidSub.canDelegate("limpiardatos")) { return __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","limpiardatos", __ref);}
RemoteObject _xnode = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 234;BA.debugLine="Sub LimpiarDatos";
Debug.ShouldStop(512);
 BA.debugLineNum = 235;BA.debugLine="DatosPlantillaPedidoVentaCab.Initialize";
Debug.ShouldStop(1024);
__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 236;BA.debugLine="CampoBusqueda=\"Cliente\"";
Debug.ShouldStop(2048);
__ref.setField ("_campobusqueda" /*RemoteObject*/ ,BA.ObjectToString("Cliente"));
 BA.debugLineNum = 241;BA.debugLine="For Each xNode As B4XView In pnlFondoGeneracionFi";
Debug.ShouldStop(65536);
_xnode = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group3 = __ref.getField(false,"_pnlfondogeneracionficheroscsvpedidosventa" /*RemoteObject*/ ).runMethod(false,"GetAllViewsRecursive");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_xnode = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group3.runMethod(false,"Get",index3));Debug.locals.put("xNode", _xnode);
Debug.locals.put("xNode", _xnode);
 BA.debugLineNum = 242;BA.debugLine="If xNode Is TextField Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("i",_xnode.getObjectOrNull(), RemoteObject.createImmutable("javafx.scene.control.TextField"))) { 
 BA.debugLineNum = 243;BA.debugLine="xNode.Text=\"\"";
Debug.ShouldStop(262144);
_xnode.runMethod(true,"setText",BA.ObjectToString(""));
 };
 }
}Debug.locals.put("xNode", _xnode);
;
 BA.debugLineNum = 247;BA.debugLine="jamTableView1.LimpiarTabla";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_limpiartabla" /*RemoteObject*/ );
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mostrarpanelbuscarclientedireccionenvio(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MostrarPanelBuscarClienteDireccionEnvio (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,582);
if (RapidSub.canDelegate("mostrarpanelbuscarclientedireccionenvio")) { return __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","mostrarpanelbuscarclientedireccionenvio", __ref);}
RemoteObject _xnode = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 582;BA.debugLine="Sub MostrarPanelBuscarClienteDireccionEnvio";
Debug.ShouldStop(32);
 BA.debugLineNum = 583;BA.debugLine="For Each xNode As B4XView In frm.RootPane";
Debug.ShouldStop(64);
_xnode = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group1 = __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_xnode = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group1.runMethod(false,"Get",index1));Debug.locals.put("xNode", _xnode);
Debug.locals.put("xNode", _xnode);
 BA.debugLineNum = 584;BA.debugLine="If xNode Is Pane Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("i",_xnode.getObjectOrNull(), RemoteObject.createImmutable("javafx.scene.layout.Pane"))) { 
 BA.debugLineNum = 585;BA.debugLine="If xNode.Tag=\"BackgroundBuscarClienteDireccionE";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_xnode.runMethod(false,"getTag"),RemoteObject.createImmutable(("BackgroundBuscarClienteDireccionEnvio")))) { 
 BA.debugLineNum = 586;BA.debugLine="xNode.RemoveViewFromParent";
Debug.ShouldStop(512);
_xnode.runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 587;BA.debugLine="Exit";
Debug.ShouldStop(1024);
if (true) break;
 };
 };
 }
}Debug.locals.put("xNode", _xnode);
;
 BA.debugLineNum = 592;BA.debugLine="BackgroundBuscarClienteDireccionEnvio= xui.Create";
Debug.ShouldStop(32768);
__ref.setField ("_backgroundbuscarclientedireccionenvio" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("BackgroundBuscarClienteDireccionEnvio"))));
 BA.debugLineNum = 593;BA.debugLine="BackgroundBuscarClienteDireccionEnvio.Tag = \"Back";
Debug.ShouldStop(65536);
__ref.getField(false,"_backgroundbuscarclientedireccionenvio" /*RemoteObject*/ ).runMethod(false,"setTag",RemoteObject.createImmutable(("BackgroundBuscarClienteDireccionEnvio")));
 BA.debugLineNum = 595;BA.debugLine="BackgroundBuscarClienteDireccionEnvio.Color=0x3FD";
Debug.ShouldStop(262144);
__ref.getField(false,"_backgroundbuscarclientedireccionenvio" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0x3fd3d3d3)));
 BA.debugLineNum = 596;BA.debugLine="frm.RootPane.AddNode(BackgroundBuscarClienteDirec";
Debug.ShouldStop(524288);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runVoidMethod ("AddNode",(Object)((__ref.getField(false,"_backgroundbuscarclientedireccionenvio" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(true,"getHeight")));
 BA.debugLineNum = 598;BA.debugLine="BaseBuscarClienteDireccionEnvio=xui.CreatePanel(\"";
Debug.ShouldStop(2097152);
__ref.setField ("_basebuscarclientedireccionenvio" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnlBaseBuscarClienteDireccionEnvio"))));
 BA.debugLineNum = 599;BA.debugLine="BaseBuscarClienteDireccionEnvio.SetLayoutAnimated";
Debug.ShouldStop(4194304);
__ref.getField(false,"_basebuscarclientedireccionenvio" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, cgeneracionficheroscsvplantillapedidosventa.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1000))))),(Object)(BA.numberCast(double.class, cgeneracionficheroscsvplantillapedidosventa.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 750))))));
 BA.debugLineNum = 600;BA.debugLine="BaseBuscarClienteDireccionEnvio.LoadLayout(\"scrGe";
Debug.ShouldStop(8388608);
__ref.getField(false,"_basebuscarclientedireccionenvio" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrGeneracionFicherosCSVPlantillaPedidosVentaBuscarClienteDireccionEnvio")),__ref.getField(false, "ba"));
 BA.debugLineNum = 602;BA.debugLine="BackgroundBuscarClienteDireccionEnvio.AddView(Bas";
Debug.ShouldStop(33554432);
__ref.getField(false,"_backgroundbuscarclientedireccionenvio" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_basebuscarclientedireccionenvio" /*RemoteObject*/ ).getObject())),(Object)((RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_backgroundbuscarclientedireccionenvio" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(false,"_basebuscarclientedireccionenvio" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)((RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_backgroundbuscarclientedireccionenvio" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(false,"_basebuscarclientedireccionenvio" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(__ref.getField(false,"_basebuscarclientedireccionenvio" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_basebuscarclientedireccionenvio" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 605;BA.debugLine="chkboxFiltroCIF.Visible=CampoBusqueda=\"Cliente\"";
Debug.ShouldStop(268435456);
__ref.getField(false,"_chkboxfiltrocif" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_campobusqueda" /*RemoteObject*/ ),BA.ObjectToString("Cliente"))));
 BA.debugLineNum = 607;BA.debugLine="lblTitleDatoBuscar.Text=IIf(CampoBusqueda=\"Client";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lbltitledatobuscar" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(((RemoteObject.solveBoolean("=",__ref.getField(true,"_campobusqueda" /*RemoteObject*/ ),BA.ObjectToString("Cliente"))) ? (RemoteObject.createImmutable(("Cliente"))) : ((RemoteObject.createImmutable("Dirección Envío"))))));
 BA.debugLineNum = 609;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _poigetformattedcellvalue(RemoteObject __ref,RemoteObject _excelcell) throws Exception{
try {
		Debug.PushSubsStack("PoiGetFormattedCellValue (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,1092);
if (RapidSub.canDelegate("poigetformattedcellvalue")) { return __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","poigetformattedcellvalue", __ref, _excelcell);}
RemoteObject _jocell = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jodataformatter = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _joconditionalformattingevaluator = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _joformulaevaluator = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("ExcelCell", _excelcell);
 BA.debugLineNum = 1092;BA.debugLine="Sub PoiGetFormattedCellValue(ExcelCell As PoiCell)";
Debug.ShouldStop(8);
 BA.debugLineNum = 1093;BA.debugLine="Dim JOCell As JavaObject = ExcelCell";
Debug.ShouldStop(16);
_jocell = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jocell = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _excelcell.getObject());Debug.locals.put("JOCell", _jocell);Debug.locals.put("JOCell", _jocell);
 BA.debugLineNum = 1094;BA.debugLine="Dim JODataFormatter As JavaObject";
Debug.ShouldStop(32);
_jodataformatter = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("JODataFormatter", _jodataformatter);
 BA.debugLineNum = 1095;BA.debugLine="Dim JOConditionalFormattingEvaluator As JavaObjec";
Debug.ShouldStop(64);
_joconditionalformattingevaluator = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("JOConditionalFormattingEvaluator", _joconditionalformattingevaluator);
 BA.debugLineNum = 1096;BA.debugLine="Dim JOFormulaEvaluator As JavaObject =JOCell.RunM";
Debug.ShouldStop(128);
_joformulaevaluator = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joformulaevaluator = _jocell.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getSheet")),(Object)((cgeneracionficheroscsvplantillapedidosventa.__c.getField(false,"Null")))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getWorkbook")),(Object)((cgeneracionficheroscsvplantillapedidosventa.__c.getField(false,"Null")))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getCreationHelper")),(Object)((cgeneracionficheroscsvplantillapedidosventa.__c.getField(false,"Null")))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("createFormulaEvaluator")),(Object)((cgeneracionficheroscsvplantillapedidosventa.__c.getField(false,"Null"))));Debug.locals.put("JOFormulaEvaluator", _joformulaevaluator);Debug.locals.put("JOFormulaEvaluator", _joformulaevaluator);
 BA.debugLineNum = 1097;BA.debugLine="JOConditionalFormattingEvaluator.InitializeNewIns";
Debug.ShouldStop(256);
_joconditionalformattingevaluator.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("org.apache.poi.ss.formula.ConditionalFormattingEvaluator")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_jocell.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getSheet")),(Object)((cgeneracionficheroscsvplantillapedidosventa.__c.getField(false,"Null")))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getWorkbook")),(Object)((cgeneracionficheroscsvplantillapedidosventa.__c.getField(false,"Null")))).getObject()),(_jocell.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getSheet")),(Object)((cgeneracionficheroscsvplantillapedidosventa.__c.getField(false,"Null")))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getWorkbook")),(Object)((cgeneracionficheroscsvplantillapedidosventa.__c.getField(false,"Null")))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getCreationHelper")),(Object)((cgeneracionficheroscsvplantillapedidosventa.__c.getField(false,"Null")))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("createFormulaEvaluator")),(Object)((cgeneracionficheroscsvplantillapedidosventa.__c.getField(false,"Null")))).getObject())})));
 BA.debugLineNum = 1098;BA.debugLine="Return JODataFormatter.InitializeNewInstance(\"org";
Debug.ShouldStop(512);
if (true) return BA.ObjectToString(_jodataformatter.runMethod(false,"InitializeNewInstance",(Object)(BA.ObjectToString("org.apache.poi.ss.usermodel.DataFormatter")),(Object)((cgeneracionficheroscsvplantillapedidosventa.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("formatCellValue")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_jocell.getObject()),(_joformulaevaluator.getObject()),(_joconditionalformattingevaluator.getObject())}))));
 BA.debugLineNum = 1100;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _precioventaarticulotallacantidadtarifaaplicablecliente(RemoteObject __ref,RemoteObject _articulo,RemoteObject _talla) throws Exception{
try {
		Debug.PushSubsStack("PrecioVentaArticuloTallaCantidadTarifaAplicableCliente (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,1054);
if (RapidSub.canDelegate("precioventaarticulotallacantidadtarifaaplicablecliente")) { return __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","precioventaarticulotallacantidadtarifaaplicablecliente", __ref, _articulo, _talla);}
RemoteObject _qtytotalart = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _precioclientearttalla = RemoteObject.createImmutable(0);
RemoteObject _precioclienteartsintalla = RemoteObject.createImmutable(0);
RemoteObject _preciogrparttalla = RemoteObject.createImmutable(0);
RemoteObject _preciogrpartsintalla = RemoteObject.createImmutable(0);
Debug.locals.put("Articulo", _articulo);
Debug.locals.put("Talla", _talla);
 BA.debugLineNum = 1054;BA.debugLine="Sub PrecioVentaArticuloTallaCantidadTarifaAplicabl";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1056;BA.debugLine="Dim QtyTotalArt As Int=Utilidades.FixNullInt(mSQL";
Debug.ShouldStop(-2147483648);
_qtytotalart = cgeneracionficheroscsvplantillapedidosventa._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)((RemoteObject.createImmutable("select TotalCantidad from tblGeneracionFicherosCSVPlantillaPedidosVentaTotalesLineasPedidoPorArticulo where CodigoArticulo=?"))),(Object)(cgeneracionficheroscsvplantillapedidosventa.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_articulo}))))))));Debug.locals.put("QtyTotalArt", _qtytotalart);Debug.locals.put("QtyTotalArt", _qtytotalart);
 BA.debugLineNum = 1059;BA.debugLine="Dim sSQL As String=$\"select PrecioUnitario from t";
Debug.ShouldStop(4);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select PrecioUnitario from tblGeneracionFicherosCSVPlantillaPedidosVentaTarifaVentaAplicableCliente \n"),RemoteObject.createImmutable("		where TipoTarifa=? and CodigoTarifa=? and Articulo=? and Variante=? and CantidadMinima<=? order by Articulo asc, Variante asc, CantidadMinima desc LIMIT 1")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1061;BA.debugLine="Dim PrecioClienteArtTalla As Double=Utilidades.Fi";
Debug.ShouldStop(16);
_precioclientearttalla = cgeneracionficheroscsvplantillapedidosventa._utilidades.runMethod(true,"_fixnulldouble" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(_ssql),(Object)(cgeneracionficheroscsvplantillapedidosventa.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.NumberToString(0),__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"CodigoCliente" /*RemoteObject*/ ),_articulo,_talla,BA.NumberToString(_qtytotalart)}))))))));Debug.locals.put("PrecioClienteArtTalla", _precioclientearttalla);Debug.locals.put("PrecioClienteArtTalla", _precioclientearttalla);
 BA.debugLineNum = 1062;BA.debugLine="If PrecioClienteArtTalla>0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_precioclientearttalla,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1063;BA.debugLine="Return PrecioClienteArtTalla";
Debug.ShouldStop(64);
if (true) return _precioclientearttalla;
 };
 BA.debugLineNum = 1066;BA.debugLine="Dim sSQL As String=$\"select PrecioUnitario from t";
Debug.ShouldStop(512);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select PrecioUnitario from tblGeneracionFicherosCSVPlantillaPedidosVentaTarifaVentaAplicableCliente\n"),RemoteObject.createImmutable("		where TipoTarifa=? and CodigoTarifa=? and Articulo=? and Variante=? and CantidadMinima<=? order by Articulo asc, CantidadMinima desc LIMIT 1")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1068;BA.debugLine="Dim PrecioClienteArtSinTalla As Double=Utilidades";
Debug.ShouldStop(2048);
_precioclienteartsintalla = cgeneracionficheroscsvplantillapedidosventa._utilidades.runMethod(true,"_fixnulldouble" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(_ssql),(Object)(cgeneracionficheroscsvplantillapedidosventa.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.NumberToString(0),__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"CodigoCliente" /*RemoteObject*/ ),_articulo,BA.ObjectToString(""),BA.NumberToString(_qtytotalart)}))))))));Debug.locals.put("PrecioClienteArtSinTalla", _precioclienteartsintalla);Debug.locals.put("PrecioClienteArtSinTalla", _precioclienteartsintalla);
 BA.debugLineNum = 1069;BA.debugLine="If PrecioClienteArtSinTalla>0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",_precioclienteartsintalla,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1070;BA.debugLine="Return PrecioClienteArtSinTalla";
Debug.ShouldStop(8192);
if (true) return _precioclienteartsintalla;
 };
 BA.debugLineNum = 1074;BA.debugLine="Dim sSQL As String=$\"select PrecioUnitario from t";
Debug.ShouldStop(131072);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select PrecioUnitario from tblGeneracionFicherosCSVPlantillaPedidosVentaTarifaVentaAplicableCliente\n"),RemoteObject.createImmutable("		where TipoTarifa=? and CodigoTarifa=? and Articulo=? and Variante=? and CantidadMinima<=? order by Articulo asc, Variante asc, CantidadMinima desc LIMIT 1")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1076;BA.debugLine="Dim PrecioGRPArtTalla As Double=Utilidades.FixNul";
Debug.ShouldStop(524288);
_preciogrparttalla = cgeneracionficheroscsvplantillapedidosventa._utilidades.runMethod(true,"_fixnulldouble" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(_ssql),(Object)(cgeneracionficheroscsvplantillapedidosventa.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.NumberToString(1),__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"GRPCliente" /*RemoteObject*/ ),_articulo,_talla,BA.NumberToString(_qtytotalart)}))))))));Debug.locals.put("PrecioGRPArtTalla", _preciogrparttalla);Debug.locals.put("PrecioGRPArtTalla", _preciogrparttalla);
 BA.debugLineNum = 1077;BA.debugLine="If PrecioGRPArtTalla>0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",_preciogrparttalla,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1078;BA.debugLine="Return PrecioGRPArtTalla";
Debug.ShouldStop(2097152);
if (true) return _preciogrparttalla;
 };
 BA.debugLineNum = 1081;BA.debugLine="Dim sSQL As String=$\"select PrecioUnitario from t";
Debug.ShouldStop(16777216);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select PrecioUnitario from tblGeneracionFicherosCSVPlantillaPedidosVentaTarifaVentaAplicableCliente\n"),RemoteObject.createImmutable("		where TipoTarifa=? and CodigoTarifa=? and Articulo=? and Variante=? and CantidadMinima<=? order by Articulo asc, CantidadMinima desc LIMIT 1")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1083;BA.debugLine="Dim PrecioGRPArtSinTalla As Double=Utilidades.Fix";
Debug.ShouldStop(67108864);
_preciogrpartsintalla = cgeneracionficheroscsvplantillapedidosventa._utilidades.runMethod(true,"_fixnulldouble" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(_ssql),(Object)(cgeneracionficheroscsvplantillapedidosventa.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.NumberToString(1),__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"GRPCliente" /*RemoteObject*/ ),_articulo,BA.ObjectToString(""),BA.NumberToString(_qtytotalart)}))))))));Debug.locals.put("PrecioGRPArtSinTalla", _preciogrpartsintalla);Debug.locals.put("PrecioGRPArtSinTalla", _preciogrpartsintalla);
 BA.debugLineNum = 1084;BA.debugLine="If PrecioGRPArtSinTalla>0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",_preciogrpartsintalla,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1085;BA.debugLine="Return PrecioGRPArtSinTalla";
Debug.ShouldStop(268435456);
if (true) return _preciogrpartsintalla;
 };
 BA.debugLineNum = 1089;BA.debugLine="Return 0";
Debug.ShouldStop(1);
if (true) return BA.numberCast(double.class, 0);
 BA.debugLineNum = 1090;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _procesarlineasplantillapedidoventa(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ProcesarLineasPlantillaPedidoVenta (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,757);
if (RapidSub.canDelegate("procesarlineasplantillapedidoventa")) { __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","procesarlineasplantillapedidoventa", __ref); return;}
ResumableSub_ProcesarLineasPlantillaPedidoVenta rsub = new ResumableSub_ProcesarLineasPlantillaPedidoVenta(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ProcesarLineasPlantillaPedidoVenta extends BA.ResumableSub {
public ResumableSub_ProcesarLineasPlantillaPedidoVenta(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
RemoteObject _numlineasprocesadas = RemoteObject.createImmutable(0);
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _xl = RemoteObject.declareNull("b4j.docU.xlutils");
RemoteObject _workbookwriter = RemoteObject.declareNull("b4j.docU.xlworkbookwriter");
RemoteObject _sheetwriter = RemoteObject.declareNull("b4j.docU.xlsheetwriter");
RemoteObject _xlresult = RemoteObject.declareNull("b4j.docU.xlreaderresult");
RemoteObject _bottomrightaddress = RemoteObject.declareNull("b4j.docU.xlutils._xladdress");
RemoteObject _ultimafila = RemoteObject.createImmutable(0L);
RemoteObject _primerafila = RemoteObject.createImmutable(0L);
int _idx = 0;
RemoteObject _celdax = RemoteObject.createImmutable("");
RemoteObject _reffila = RemoteObject.createImmutable("");
RemoteObject _referenciacruzadafila = RemoteObject.createImmutable("");
RemoteObject _articulofila = RemoteObject.createImmutable("");
RemoteObject _qtyfila = RemoteObject.createImmutable(0);
RemoteObject _descripcionarticulofila = RemoteObject.createImmutable("");
RemoteObject _cell = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiCellWrapper");
RemoteObject _tallafila = RemoteObject.createImmutable("");
RemoteObject _preciofila = RemoteObject.createImmutable(0);
RemoteObject _senderfilter = RemoteObject.declareNull("Object");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _rsprecios = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _artsel = RemoteObject.createImmutable("");
RemoteObject _tallasel = RemoteObject.createImmutable("");
RemoteObject _preciosel = RemoteObject.createImmutable(0);
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int step23;
int limit23;
int step35;
int limit35;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ProcesarLineasPlantillaPedidoVenta (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,757);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 759;BA.debugLine="Dim NumLineasProcesadas As Int=mSQL.ExecQuerySing";
Debug.ShouldStop(4194304);
_numlineasprocesadas = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult",(Object)(RemoteObject.createImmutable("select count(*) from tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido"))));Debug.locals.put("NumLineasProcesadas", _numlineasprocesadas);Debug.locals.put("NumLineasProcesadas", _numlineasprocesadas);
 BA.debugLineNum = 760;BA.debugLine="If NumLineasProcesadas>0 Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean(">",_numlineasprocesadas,BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 761;BA.debugLine="Dim msa As Object = xui.Msgbox2Async($\"Hay ${Num";
Debug.ShouldStop(16777216);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Hay "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_numlineasprocesadas))),RemoteObject.createImmutable(" líneas procesadas.\n"),RemoteObject.createImmutable("¿Eliminar estas líneas y procesar de nuevo el fichero?")))),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 763;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "procesarlineasplantillapedidoventa"), _msa);
this.state = 72;
return;
case 72:
//C
this.state = 4;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 764;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(134217728);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
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
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 767;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblGeneracionFiche";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido")));
 BA.debugLineNum = 768;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblGeneracionFiche";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblGeneracionFicherosCSVPlantillaPedidosVentaTotalesLineasPedidoPorArticulo")));
 BA.debugLineNum = 770;BA.debugLine="If File.Exists(File.GetFileParent(RutaFicheroSele";
Debug.ShouldStop(2);
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.__c.getField(false,"File").runMethod(true,"GetFileParent",(Object)(__ref.getField(true,"_rutaficheroseleccionado" /*RemoteObject*/ )))),(Object)(parent.__c.getField(false,"File").runMethod(true,"GetName",(Object)(__ref.getField(true,"_rutaficheroseleccionado" /*RemoteObject*/ ))))),parent.__c.getField(true,"False"))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 771;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"El fichero s";
Debug.ShouldStop(4);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("El fichero seleccionado "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_rutaficheroseleccionado" /*RemoteObject*/ )))),RemoteObject.createImmutable(" no existe.")))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 772;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "procesarlineasplantillapedidoventa"), _msa);
this.state = 73;
return;
case 73:
//C
this.state = 14;
;
 BA.debugLineNum = 773;BA.debugLine="Return";
Debug.ShouldStop(16);
if (true) return ;
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 776;BA.debugLine="Dim xl As XLUtils";
Debug.ShouldStop(128);
_xl = RemoteObject.createNew ("b4j.docU.xlutils");Debug.locals.put("xl", _xl);
 BA.debugLineNum = 777;BA.debugLine="xl.Initialize";
Debug.ShouldStop(256);
_xl.runClassMethod (b4j.docU.xlutils.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 779;BA.debugLine="Dim WorkbookWriter As XLWorkbookWriter = xl.Creat";
Debug.ShouldStop(1024);
_workbookwriter = _xl.runClassMethod (b4j.docU.xlutils.class, "_createwriterfromtemplate" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_rutaficheroseleccionado" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkbookWriter", _workbookwriter);Debug.locals.put("WorkbookWriter", _workbookwriter);
 BA.debugLineNum = 780;BA.debugLine="Dim SheetWriter As XLSheetWriter=WorkbookWriter.C";
Debug.ShouldStop(2048);
_sheetwriter = _workbookwriter.runClassMethod (b4j.docU.xlworkbookwriter.class, "_createsheetwriterbyindex" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("SheetWriter", _sheetwriter);Debug.locals.put("SheetWriter", _sheetwriter);
 BA.debugLineNum = 792;BA.debugLine="Dim xlResult As XLReaderResult=xl.Reader.ReadShee";
Debug.ShouldStop(8388608);
_xlresult = _xl.getField(false,"_reader" /*RemoteObject*/ ).runClassMethod (b4j.docU.xlreader.class, "_readsheetbyindex" /*RemoteObject*/ ,(Object)(parent.__c.getField(false,"File").runMethod(true,"GetFileParent",(Object)(__ref.getField(true,"_rutaficheroseleccionado" /*RemoteObject*/ )))),(Object)(parent.__c.getField(false,"File").runMethod(true,"GetName",(Object)(__ref.getField(true,"_rutaficheroseleccionado" /*RemoteObject*/ )))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("xlResult", _xlresult);Debug.locals.put("xlResult", _xlresult);
 BA.debugLineNum = 794;BA.debugLine="xlResult.LogResult(True)";
Debug.ShouldStop(33554432);
_xlresult.runClassMethod (b4j.docU.xlreaderresult.class, "_logresult" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 795;BA.debugLine="Dim BottomRightAddress As XLAddress= xlResult.Bot";
Debug.ShouldStop(67108864);
_bottomrightaddress = _xlresult.getField(false,"_bottomright" /*RemoteObject*/ );Debug.locals.put("BottomRightAddress", _bottomrightaddress);Debug.locals.put("BottomRightAddress", _bottomrightaddress);
 BA.debugLineNum = 796;BA.debugLine="Dim UltimaFila As Long=BottomRightAddress.Row0Bas";
Debug.ShouldStop(134217728);
_ultimafila = BA.numberCast(long.class, _bottomrightaddress.getField(true,"Row0Based" /*RemoteObject*/ ));Debug.locals.put("UltimaFila", _ultimafila);Debug.locals.put("UltimaFila", _ultimafila);
 BA.debugLineNum = 797;BA.debugLine="Dim PrimeraFila As Long";
Debug.ShouldStop(268435456);
_primerafila = RemoteObject.createImmutable(0L);Debug.locals.put("PrimeraFila", _primerafila);
 BA.debugLineNum = 799;BA.debugLine="For iDX=0 To UltimaFila";
Debug.ShouldStop(1073741824);
if (true) break;

case 15:
//for
this.state = 22;
step23 = 1;
limit23 = (int) (0 + _ultimafila.<Long>get().longValue());
_idx = 0 ;
Debug.locals.put("iDX", _idx);
this.state = 74;
if (true) break;

case 74:
//C
this.state = 22;
if ((step23 > 0 && _idx <= limit23) || (step23 < 0 && _idx >= limit23)) this.state = 17;
if (true) break;

case 75:
//C
this.state = 74;
_idx = ((int)(0 + _idx + step23)) ;
Debug.locals.put("iDX", _idx);
if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 800;BA.debugLine="Dim CeldaX As String=xlResult.Get(xl.AddressOne(";
Debug.ShouldStop(-2147483648);
_celdax = BA.ObjectToString(_xlresult.runClassMethod (b4j.docU.xlreaderresult.class, "_get" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addressone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("B")),(Object)(BA.numberCast(int.class, _idx))))));Debug.locals.put("CeldaX", _celdax);Debug.locals.put("CeldaX", _celdax);
 BA.debugLineNum = 801;BA.debugLine="If CeldaX=\"REFERENCIA\" Then";
Debug.ShouldStop(1);
if (true) break;

case 18:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",_celdax,BA.ObjectToString("REFERENCIA"))) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 802;BA.debugLine="PrimeraFila=iDX+1";
Debug.ShouldStop(2);
_primerafila = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_idx),RemoteObject.createImmutable(1)}, "+",1, 1));Debug.locals.put("PrimeraFila", _primerafila);
 BA.debugLineNum = 803;BA.debugLine="Exit";
Debug.ShouldStop(4);
this.state = 22;
if (true) break;
 if (true) break;

case 21:
//C
this.state = 75;
;
 if (true) break;
if (true) break;
Debug.locals.put("iDX", _idx);
;
 BA.debugLineNum = 806;BA.debugLine="If PrimeraFila=0 Then";
Debug.ShouldStop(32);

case 22:
//if
this.state = 25;
if (RemoteObject.solveBoolean("=",_primerafila,BA.numberCast(long.class, 0))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 807;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha loca";
Debug.ShouldStop(64);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se ha localizado el encabezado = REFERENCIA.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 808;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "procesarlineasplantillapedidoventa"), _msa);
this.state = 76;
return;
case 76:
//C
this.state = 25;
;
 BA.debugLineNum = 809;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 812;BA.debugLine="For iDX=PrimeraFila To UltimaFila";
Debug.ShouldStop(2048);

case 25:
//for
this.state = 38;
step35 = 1;
limit35 = (int) (0 + _ultimafila.<Long>get().longValue());
_idx = (int) (0 + _primerafila.<Long>get().longValue()) ;
Debug.locals.put("iDX", _idx);
this.state = 77;
if (true) break;

case 77:
//C
this.state = 38;
if ((step35 > 0 && _idx <= limit35) || (step35 < 0 && _idx >= limit35)) this.state = 27;
if (true) break;

case 78:
//C
this.state = 77;
_idx = ((int)(0 + _idx + step35)) ;
Debug.locals.put("iDX", _idx);
if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 813;BA.debugLine="Dim RefFila As String=xlResult.GetDefault(xl.Add";
Debug.ShouldStop(4096);
_reffila = BA.ObjectToString(_xlresult.runClassMethod (b4j.docU.xlreaderresult.class, "_getdefault" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addressone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("B")),(Object)(BA.numberCast(int.class, _idx)))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("RefFila", _reffila);Debug.locals.put("RefFila", _reffila);
 BA.debugLineNum = 814;BA.debugLine="If RefFila=\"\" Then Exit ' se ha llegado al final";
Debug.ShouldStop(8192);
if (true) break;

case 28:
//if
this.state = 33;
if (RemoteObject.solveBoolean("=",_reffila,BA.ObjectToString(""))) { 
this.state = 30;
;}if (true) break;

case 30:
//C
this.state = 33;
this.state = 38;
if (true) break;
if (true) break;

case 33:
//C
this.state = 34;
;
 BA.debugLineNum = 816;BA.debugLine="Dim ReferenciaCruzadaFila As String=\"\"";
Debug.ShouldStop(32768);
_referenciacruzadafila = BA.ObjectToString("");Debug.locals.put("ReferenciaCruzadaFila", _referenciacruzadafila);Debug.locals.put("ReferenciaCruzadaFila", _referenciacruzadafila);
 BA.debugLineNum = 817;BA.debugLine="Dim ArticuloFila As String=RefFila";
Debug.ShouldStop(65536);
_articulofila = _reffila;Debug.locals.put("ArticuloFila", _articulofila);Debug.locals.put("ArticuloFila", _articulofila);
 BA.debugLineNum = 819;BA.debugLine="Dim QtyFila As Double=xlResult.GetDefault(xl.Add";
Debug.ShouldStop(262144);
_qtyfila = BA.numberCast(double.class, _xlresult.runClassMethod (b4j.docU.xlreaderresult.class, "_getdefault" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addressone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("E")),(Object)(BA.numberCast(int.class, _idx)))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("QtyFila", _qtyfila);Debug.locals.put("QtyFila", _qtyfila);
 BA.debugLineNum = 820;BA.debugLine="If QtyFila>0 Then";
Debug.ShouldStop(524288);
if (true) break;

case 34:
//if
this.state = 37;
if (RemoteObject.solveBoolean(">",_qtyfila,BA.numberCast(double.class, 0))) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 821;BA.debugLine="Dim DescripcionArticuloFila As String=xlResult.";
Debug.ShouldStop(1048576);
_descripcionarticulofila = BA.ObjectToString(_xlresult.runClassMethod (b4j.docU.xlreaderresult.class, "_getdefault" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addressone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("C")),(Object)(BA.numberCast(int.class, _idx)))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("DescripcionArticuloFila", _descripcionarticulofila);Debug.locals.put("DescripcionArticuloFila", _descripcionarticulofila);
 BA.debugLineNum = 826;BA.debugLine="Dim Cell As PoiCell=SheetWriter.GetCell(xl.Addr";
Debug.ShouldStop(33554432);
_cell = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiCellWrapper");
_cell = _sheetwriter.runClassMethod (b4j.docU.xlsheetwriter.class, "_getcell" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addressone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("D")),(Object)(BA.numberCast(int.class, _idx)))));Debug.locals.put("Cell", _cell);Debug.locals.put("Cell", _cell);
 BA.debugLineNum = 827;BA.debugLine="Cell.CellType=Cell.TYPE_STRING";
Debug.ShouldStop(67108864);
_cell.runMethod(false,"setCellType",_cell.getField(false,"TYPE_STRING"));
 BA.debugLineNum = 828;BA.debugLine="Dim TallaFila As String=Cell.ValueString";
Debug.ShouldStop(134217728);
_tallafila = _cell.runMethod(true,"getValueString");Debug.locals.put("TallaFila", _tallafila);Debug.locals.put("TallaFila", _tallafila);
 BA.debugLineNum = 829;BA.debugLine="Dim PrecioFila As Double=0 ' los precios se eva";
Debug.ShouldStop(268435456);
_preciofila = BA.numberCast(double.class, 0);Debug.locals.put("PrecioFila", _preciofila);Debug.locals.put("PrecioFila", _preciofila);
 BA.debugLineNum = 831;BA.debugLine="mSQL.AddNonQueryToBatch(\"insert into tblGenerac";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(BA.ObjectToString("insert into tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido (ReferenciaCruzada, CodigoArticulo, DescripcionArticulo, Talla, Cantidad, Precio) values (?,?,?,?,?,?)")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {(_referenciacruzadafila),(_articulofila),(_descripcionarticulofila),(_tallafila),(_qtyfila),(_preciofila)})))));
 if (true) break;

case 37:
//C
this.state = 78;
;
 if (true) break;
if (true) break;

case 38:
//C
this.state = 39;
Debug.locals.put("iDX", _idx);
;
 BA.debugLineNum = 836;BA.debugLine="WorkbookWriter.PoiWorkbook.Close";
Debug.ShouldStop(8);
_workbookwriter.getField(false,"_poiworkbook" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 839;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryBat";
Debug.ShouldStop(64);
_senderfilter = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 840;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "procesarlineasplantillapedidoventa"), _senderfilter);
this.state = 79;
return;
case 79:
//C
this.state = 39;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 841;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","837748820",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 843;BA.debugLine="If Success=False Then";
Debug.ShouldStop(1024);
if (true) break;

case 39:
//if
this.state = 42;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 844;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Ha habido un";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Ha habido un error al procesar las líneas del fichero.\n"),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 847;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "procesarlineasplantillapedidoventa"), _msa);
this.state = 80;
return;
case 80:
//C
this.state = 42;
;
 if (true) break;

case 42:
//C
this.state = 43;
;
 BA.debugLineNum = 850;BA.debugLine="mSQL.ExecNonQuery($\"insert into tblGeneracionFich";
Debug.ShouldStop(131072);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("insert into tblGeneracionFicherosCSVPlantillaPedidosVentaTotalesLineasPedidoPorArticulo\n"),RemoteObject.createImmutable("		select CodigoArticulo, Sum(Cantidad) as TotalCantidad from tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido group by CodigoArticulo")))));
 BA.debugLineNum = 853;BA.debugLine="Dim rsPrecios As ResultSet=mSQL.ExecQuery($\"selec";
Debug.ShouldStop(1048576);
_rsprecios = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rsprecios = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)((RemoteObject.createImmutable("select CodigoArticulo, Talla from tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido"))));Debug.locals.put("rsPrecios", _rsprecios);Debug.locals.put("rsPrecios", _rsprecios);
 BA.debugLineNum = 854;BA.debugLine="Do While rsPrecios.NextRow";
Debug.ShouldStop(2097152);
if (true) break;

case 43:
//do while
this.state = 46;
while (_rsprecios.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 45;
if (true) break;
}
if (true) break;

case 45:
//C
this.state = 43;
 BA.debugLineNum = 855;BA.debugLine="Dim ArtSel As String=rsPrecios.GetString(\"Codigo";
Debug.ShouldStop(4194304);
_artsel = _rsprecios.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CodigoArticulo")));Debug.locals.put("ArtSel", _artsel);Debug.locals.put("ArtSel", _artsel);
 BA.debugLineNum = 856;BA.debugLine="Dim TallaSel As String=rsPrecios.GetString(\"Tall";
Debug.ShouldStop(8388608);
_tallasel = _rsprecios.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Talla")));Debug.locals.put("TallaSel", _tallasel);Debug.locals.put("TallaSel", _tallasel);
 BA.debugLineNum = 857;BA.debugLine="Dim PrecioSel As Double=PrecioVentaArticuloTalla";
Debug.ShouldStop(16777216);
_preciosel = __ref.runClassMethod (b4j.docU.cgeneracionficheroscsvplantillapedidosventa.class, "_precioventaarticulotallacantidadtarifaaplicablecliente" /*RemoteObject*/ ,(Object)(_artsel),(Object)(_tallasel));Debug.locals.put("PrecioSel", _preciosel);Debug.locals.put("PrecioSel", _preciosel);
 BA.debugLineNum = 858;BA.debugLine="mSQL.AddNonQueryToBatch(\"update tblGeneracionFic";
Debug.ShouldStop(33554432);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(BA.ObjectToString("update tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido set precio=? where CodigoArticulo=? and Talla=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_preciosel),(_artsel),(_tallasel)})))));
 if (true) break;

case 46:
//C
this.state = 47;
;
 BA.debugLineNum = 860;BA.debugLine="rsPrecios.Close";
Debug.ShouldStop(134217728);
_rsprecios.runVoidMethod ("Close");
 BA.debugLineNum = 862;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryBat";
Debug.ShouldStop(536870912);
_senderfilter = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 863;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "procesarlineasplantillapedidoventa"), _senderfilter);
this.state = 81;
return;
case 81:
//C
this.state = 47;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 864;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","837748843",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 866;BA.debugLine="If Success=False Then";
Debug.ShouldStop(2);
if (true) break;

case 47:
//if
this.state = 50;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 867;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Ha habido un";
Debug.ShouldStop(4);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Ha habido un error al procesar las líneas del fichero.\n"),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 870;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "procesarlineasplantillapedidoventa"), _msa);
this.state = 82;
return;
case 82:
//C
this.state = 50;
;
 if (true) break;

case 50:
//C
this.state = 51;
;
 BA.debugLineNum = 874;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
Debug.ShouldStop(512);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 876;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
Debug.ShouldStop(2048);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_rs.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 877;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "procesarlineasplantillapedidoventa"), _rsub);
this.state = 83;
return;
case 83:
//C
this.state = 51;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 878;BA.debugLine="rs.Close";
Debug.ShouldStop(8192);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 879;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(16384);
if (true) break;

case 51:
//if
this.state = 71;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 53;
}if (true) break;

case 53:
//C
this.state = 54;
 BA.debugLineNum = 880;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(32768);
if (true) break;

case 54:
//if
this.state = 61;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 56;
}if (true) break;

case 56:
//C
this.state = 57;
 BA.debugLineNum = 881;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(65536);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 882;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "procesarlineasplantillapedidoventa"), _msa);
this.state = 84;
return;
case 84:
//C
this.state = 57;
;
 BA.debugLineNum = 884;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(524288);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 885;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "procesarlineasplantillapedidoventa"), _msa);
this.state = 85;
return;
case 85:
//C
this.state = 57;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 886;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(2097152);
if (true) break;

case 57:
//if
this.state = 60;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 59;
}if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 887;BA.debugLine="jamTableView1.AbrirCamposBuilder";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 888;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return ;
 if (true) break;

case 60:
//C
this.state = 61;
;
 BA.debugLineNum = 891;BA.debugLine="ExitApplication";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 893;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(268435456);

case 61:
//if
this.state = 70;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 63;
}if (true) break;

case 63:
//C
this.state = 64;
 BA.debugLineNum = 894;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
Debug.ShouldStop(536870912);
if (true) break;

case 64:
//if
this.state = 69;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
this.state = 66;
;}if (true) break;

case 66:
//C
this.state = 69;
if (true) return ;
if (true) break;

case 69:
//C
this.state = 70;
;
 BA.debugLineNum = 895;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(1073741824);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 896;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "procesarlineasplantillapedidoventa"), _msa);
this.state = 86;
return;
case 86:
//C
this.state = 70;
;
 if (true) break;

case 70:
//C
this.state = 71;
;
 if (true) break;

case 71:
//C
this.state = -1;
;
 BA.debugLineNum = 900;BA.debugLine="End Sub";
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
public static void  _sql_nonquerycomplete(RemoteObject __ref,RemoteObject _success) throws Exception{
}
public static RemoteObject  _procesocabeceraficheroseleccionado(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ProcesoCabeceraFicheroSeleccionado (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,216);
if (RapidSub.canDelegate("procesocabeceraficheroseleccionado")) { return __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","procesocabeceraficheroseleccionado", __ref);}
RemoteObject _xl = RemoteObject.declareNull("b4j.docU.xlutils");
RemoteObject _xlresult = RemoteObject.declareNull("b4j.docU.xlreaderresult");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
 BA.debugLineNum = 216;BA.debugLine="Sub ProcesoCabeceraFicheroSeleccionado";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 218;BA.debugLine="Dim xl As XLUtils";
Debug.ShouldStop(33554432);
_xl = RemoteObject.createNew ("b4j.docU.xlutils");Debug.locals.put("xl", _xl);
 BA.debugLineNum = 219;BA.debugLine="xl.Initialize";
Debug.ShouldStop(67108864);
_xl.runClassMethod (b4j.docU.xlutils.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 220;BA.debugLine="Dim xlResult As XLReaderResult=xl.Reader.ReadShee";
Debug.ShouldStop(134217728);
_xlresult = _xl.getField(false,"_reader" /*RemoteObject*/ ).runClassMethod (b4j.docU.xlreader.class, "_readsheetbyindex" /*RemoteObject*/ ,(Object)(cgeneracionficheroscsvplantillapedidosventa.__c.getField(false,"File").runMethod(true,"GetFileParent",(Object)(__ref.getField(true,"_rutaficheroseleccionado" /*RemoteObject*/ )))),(Object)(cgeneracionficheroscsvplantillapedidosventa.__c.getField(false,"File").runMethod(true,"GetName",(Object)(__ref.getField(true,"_rutaficheroseleccionado" /*RemoteObject*/ )))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("xlResult", _xlresult);Debug.locals.put("xlResult", _xlresult);
 BA.debugLineNum = 221;BA.debugLine="DatosPlantillaPedidoVentaCab.CIFCliente=xlResult.";
Debug.ShouldStop(268435456);
__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).setField ("CIFCliente" /*RemoteObject*/ ,BA.ObjectToString(_xlresult.runClassMethod (b4j.docU.xlreaderresult.class, "_get" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addressname" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("C5")))))));
 BA.debugLineNum = 222;BA.debugLine="DatosPlantillaPedidoVentaCab.DocumentoExterno=xlR";
Debug.ShouldStop(536870912);
__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).setField ("DocumentoExterno" /*RemoteObject*/ ,BA.ObjectToString(_xlresult.runClassMethod (b4j.docU.xlreaderresult.class, "_get" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addressname" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("C13")))))));
 BA.debugLineNum = 223;BA.debugLine="txtCIFCliente.text=DatosPlantillaPedidoVentaCab.C";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_txtcifcliente" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"CIFCliente" /*RemoteObject*/ ));
 BA.debugLineNum = 224;BA.debugLine="txtDocumentoExterno.text=DatosPlantillaPedidoVent";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_txtdocumentoexterno" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"DocumentoExterno" /*RemoteObject*/ ));
 BA.debugLineNum = 225;BA.debugLine="DatosPlantillaPedidoVentaCab.FechaPedidoCliente=D";
Debug.ShouldStop(1);
__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).setField ("FechaPedidoCliente" /*RemoteObject*/ ,cgeneracionficheroscsvplantillapedidosventa.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 226;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(2);
_dateformatant = cgeneracionficheroscsvplantillapedidosventa.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 227;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(4);
cgeneracionficheroscsvplantillapedidosventa.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 228;BA.debugLine="txtFechaPedidoCliente.Text=DateTime.Date(DatosPla";
Debug.ShouldStop(8);
__ref.getField(false,"_txtfechapedidocliente" /*RemoteObject*/ ).runMethod(true,"setText",cgeneracionficheroscsvplantillapedidosventa.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"FechaPedidoCliente" /*RemoteObject*/ ))));
 BA.debugLineNum = 229;BA.debugLine="DatosPlantillaPedidoVentaCab.AlmacenOrigen=\"0001\"";
Debug.ShouldStop(16);
__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).setField ("AlmacenOrigen" /*RemoteObject*/ ,BA.ObjectToString("0001"));
 BA.debugLineNum = 230;BA.debugLine="txtAlmacen.Text=DatosPlantillaPedidoVentaCab.Alma";
Debug.ShouldStop(32);
__ref.getField(false,"_txtalmacen" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_datosplantillapedidoventacab" /*RemoteObject*/ ).getField(true,"AlmacenOrigen" /*RemoteObject*/ ));
 BA.debugLineNum = 231;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(64);
cgeneracionficheroscsvplantillapedidosventa.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 232;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("SalirModulo (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,144);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","salirmodulo", __ref);}
 BA.debugLineNum = 144;BA.debugLine="private Sub SalirModulo";
Debug.ShouldStop(32768);
 BA.debugLineNum = 145;BA.debugLine="LimpiarDatos";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.docU.cgeneracionficheroscsvplantillapedidosventa.class, "_limpiardatos" /*RemoteObject*/ );
 BA.debugLineNum = 146;BA.debugLine="frm.Close";
Debug.ShouldStop(131072);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 147;BA.debugLine="MainMenu2.Show";
Debug.ShouldStop(262144);
cgeneracionficheroscsvplantillapedidosventa._mainmenu2.runVoidMethod ("_show" /*void*/ );
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seleccionficherocarpetared(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SeleccionFicheroCarpetaRed (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,179);
if (RapidSub.canDelegate("seleccionficherocarpetared")) { return __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","seleccionficherocarpetared", __ref);}
ResumableSub_SeleccionFicheroCarpetaRed rsub = new ResumableSub_SeleccionFicheroCarpetaRed(null,__ref);
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
public static class ResumableSub_SeleccionFicheroCarpetaRed extends BA.ResumableSub {
public ResumableSub_SeleccionFicheroCarpetaRed(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
RemoteObject _fc = RemoteObject.declareNull("anywheresoftware.b4j.objects.FileChooserWrapper");
RemoteObject _filename = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SeleccionFicheroCarpetaRed (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,179);
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
 BA.debugLineNum = 181;BA.debugLine="Dim fc As FileChooser";
Debug.ShouldStop(1048576);
_fc = RemoteObject.createNew ("anywheresoftware.b4j.objects.FileChooserWrapper");Debug.locals.put("fc", _fc);
 BA.debugLineNum = 182;BA.debugLine="fc.Initialize";
Debug.ShouldStop(2097152);
_fc.runVoidMethod ("Initialize");
 BA.debugLineNum = 183;BA.debugLine="fc.Title=\"Selecciona Fichero\"";
Debug.ShouldStop(4194304);
_fc.runMethod(true,"setTitle",BA.ObjectToString("Selecciona Fichero"));
 BA.debugLineNum = 184;BA.debugLine="fc.SetExtensionFilter(\"Ficheros texto\", Array As";
Debug.ShouldStop(8388608);
_fc.runVoidMethod ("SetExtensionFilter",(Object)(BA.ObjectToString("Ficheros texto")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("*.xlsx"),RemoteObject.createImmutable("*.xls")})))));
 BA.debugLineNum = 187;BA.debugLine="fc.InitialDirectory=Utilidades.FindUserDocumentsF";
Debug.ShouldStop(67108864);
_fc.runMethod(true,"setInitialDirectory",parent._utilidades.runMethod(true,"_finduserdocumentsfolder" /*RemoteObject*/ ));
 BA.debugLineNum = 188;BA.debugLine="Dim fileName As String = fc.ShowOpen(frm)";
Debug.ShouldStop(134217728);
_filename = _fc.runMethodAndSync(true,"ShowOpen",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )));Debug.locals.put("fileName", _filename);Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 189;BA.debugLine="Return fileName";
Debug.ShouldStop(268435456);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_filename));return;};
 BA.debugLineNum = 191;BA.debugLine="End Sub";
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
public static void  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _accion = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,75);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 76;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
Debug.ShouldStop(2048);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, parent._main._xscreen /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, parent._main._yscreen /*RemoteObject*/ )));
 BA.debugLineNum = 77;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(4096);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 78;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(8192);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 79;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(16384);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 80;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(32768);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 81;BA.debugLine="frm.RootPane.LoadLayout(\"scrGeneracionFicherosCSV";
Debug.ShouldStop(65536);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrGeneracionFicherosCSVPedidosVenta")));
 BA.debugLineNum = 83;BA.debugLine="Sleep(0)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "show"),BA.numberCast(int.class, 0));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
 BA.debugLineNum = 85;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Generación Fi";
Debug.ShouldStop(1048576);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("Generación Ficheros CSV Plantilla Pedidos Venta")));
 BA.debugLineNum = 87;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 88;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 90;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenuB";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontawesometomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Procesar datos plantilla")),(Object)(BA.ObjectToString("ProcesarDatosPlantilla")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf1c3)))))),(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )));
 BA.debugLineNum = 91;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenuB";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontawesometomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Generar Fichero CSV")),(Object)(BA.ObjectToString("GenerarFicheroCSV")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf016)))))),(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )));
 BA.debugLineNum = 97;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
Debug.ShouldStop(1);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ListaGeneracionFicherosCSVPedidosVentaLineasPedido.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 98;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "show"), _rsub);
this.state = 10;
return;
case 10:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 99;BA.debugLine="Log(mRes)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","835913752",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 100;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 101;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(16);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 102;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "show"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
 BA.debugLineNum = 103;BA.debugLine="frm.Close";
Debug.ShouldStop(64);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 104;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 107;BA.debugLine="jamTableView1.AlturaFilas=0";
Debug.ShouldStop(1024);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setalturafilas",BA.numberCast(double.class, 0));
 BA.debugLineNum = 109;BA.debugLine="Dialog.Initialize (frm.RootPane)";
Debug.ShouldStop(4096);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 110;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
Debug.ShouldStop(8192);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 112;BA.debugLine="ColorFondoPanelItemsImpares=0xFFF1F1F1";
Debug.ShouldStop(32768);
__ref.setField ("_colorfondopanelitemsimpares" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xfff1f1f1)));
 BA.debugLineNum = 113;BA.debugLine="ColorFondoPanelItemsPares=xui.Color_White";
Debug.ShouldStop(65536);
__ref.setField ("_colorfondopanelitemspares" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 115;BA.debugLine="ArrayColoresItems(0)=ColorFondoPanelItemsImpares";
Debug.ShouldStop(262144);
__ref.getField(false,"_arraycoloresitems" /*RemoteObject*/ ).setArrayElement (__ref.getField(true,"_colorfondopanelitemsimpares" /*RemoteObject*/ ),BA.numberCast(int.class, 0));
 BA.debugLineNum = 116;BA.debugLine="ArrayColoresItems(1)=ColorFondoPanelItemsPares";
Debug.ShouldStop(524288);
__ref.getField(false,"_arraycoloresitems" /*RemoteObject*/ ).setArrayElement (__ref.getField(true,"_colorfondopanelitemspares" /*RemoteObject*/ ),BA.numberCast(int.class, 1));
 BA.debugLineNum = 118;BA.debugLine="LimpiarDatos";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.docU.cgeneracionficheroscsvplantillapedidosventa.class, "_limpiardatos" /*RemoteObject*/ );
 BA.debugLineNum = 120;BA.debugLine="frm.Show";
Debug.ShouldStop(8388608);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 122;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando dat";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Cargando datos clientes/direcciones envío...")));
 BA.debugLineNum = 123;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 124;BA.debugLine="Wait For(CargaClientesDireccionesEnvioDW) complet";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgeneracionficheroscsvplantillapedidosventa", "show"), __ref.runClassMethod (b4j.docU.cgeneracionficheroscsvplantillapedidosventa.class, "_cargaclientesdireccionesenviodw" /*RemoteObject*/ ));
this.state = 12;
return;
case 12:
//C
this.state = 5;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 125;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(268435456);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 126;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(536870912);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 127;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("NOK"))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 128;BA.debugLine="SalirModulo";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.docU.cgeneracionficheroscsvplantillapedidosventa.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 129;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 132;BA.debugLine="End Sub";
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
public static RemoteObject  _txtbuscarclientedireccionenvio_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("txtBuscarClienteDireccionEnvio_TextChanged (cgeneracionficheroscsvplantillapedidosventa) ","cgeneracionficheroscsvplantillapedidosventa",11,__ref.getField(false, "ba"),__ref,290);
if (RapidSub.canDelegate("txtbuscarclientedireccionenvio_textchanged")) { return __ref.runUserSub(false, "cgeneracionficheroscsvplantillapedidosventa","txtbuscarclientedireccionenvio_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 290;BA.debugLine="Private Sub txtBuscarClienteDireccionEnvio_TextCha";
Debug.ShouldStop(2);
 BA.debugLineNum = 291;BA.debugLine="ActualizarDatosCLV";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.docU.cgeneracionficheroscsvplantillapedidosventa.class, "_actualizardatosclv" /*RemoteObject*/ );
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
}