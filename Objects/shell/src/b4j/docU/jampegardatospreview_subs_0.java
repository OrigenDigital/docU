package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class jampegardatospreview_subs_0 {


public static void  _analisisrobotclipboard(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AnalisisRobotClipBoard (jampegardatospreview) ","jampegardatospreview",87,__ref.getField(false, "ba"),__ref,180);
if (RapidSub.canDelegate("analisisrobotclipboard")) { __ref.runUserSub(false, "jampegardatospreview","analisisrobotclipboard", __ref); return;}
ResumableSub_AnalisisRobotClipBoard rsub = new ResumableSub_AnalisisRobotClipBoard(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_AnalisisRobotClipBoard extends BA.ResumableSub {
public ResumableSub_AnalisisRobotClipBoard(b4j.docU.jampegardatospreview parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jampegardatospreview parent;
RemoteObject _jawt = RemoteObject.declareNull("butt.droid.awtRobot.AWTRobot");
RemoteObject _sclip = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _bcancelar = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _nfilas = RemoteObject.createImmutable(0);
RemoteObject _ncols = RemoteObject.createImmutable(0);
RemoteObject _primerafila = RemoteObject.createImmutable(false);
int _i = 0;
RemoteObject _schar = RemoteObject.createImmutable("");
RemoteObject _sbcontenidocelda = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _lstencabezados = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mfila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _colact = RemoteObject.createImmutable(0);
RemoteObject _filaact = RemoteObject.createImmutable(0);
RemoteObject _celdas = null;
RemoteObject _currfila = RemoteObject.createImmutable(0);
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.createImmutable("");
int _nf = 0;
int _nc = 0;
RemoteObject _flagencabezadosok = RemoteObject.createImmutable(false);
RemoteObject _lstencabezadosfaltantes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _scampo = RemoteObject.createImmutable("");
RemoteObject _sberrencabezados = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _serrenc = RemoteObject.createImmutable("");
int _idxcol = 0;
RemoteObject _row = null;
RemoteObject _numcol = RemoteObject.createImmutable(0);
int step28;
int limit28;
int step52;
int limit52;
RemoteObject group90;
int index90;
int groupLen90;
RemoteObject group91;
int index91;
int groupLen91;
int step97;
int limit97;
int step98;
int limit98;
RemoteObject group105;
int index105;
int groupLen105;
RemoteObject group116;
int index116;
int groupLen116;
int step123;
int limit123;
RemoteObject group126;
int index126;
int groupLen126;
RemoteObject group128;
int index128;
int groupLen128;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("AnalisisRobotClipBoard (jampegardatospreview) ","jampegardatospreview",87,__ref.getField(false, "ba"),__ref,180);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 181;BA.debugLine="Dim jAWT As AWTRobot";
Debug.JustUpdateDeviceLine();
_jawt = RemoteObject.createNew ("butt.droid.awtRobot.AWTRobot");Debug.locals.put("jAWT", _jawt);
 BA.debugLineNum = 182;BA.debugLine="Dim sClip As String=jAWT.ClipboardStringGet";
Debug.JustUpdateDeviceLine();
_sclip = _jawt.runMethod(true,"ClipboardStringGet");Debug.locals.put("sClip", _sclip);Debug.locals.put("sClip", _sclip);
 BA.debugLineNum = 184;BA.debugLine="Log(sClip)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9157679620",_sclip,0);
 BA.debugLineNum = 185;BA.debugLine="Log(\"**************** String\")";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9157679621",RemoteObject.createImmutable("**************** String"),0);
 BA.debugLineNum = 188;BA.debugLine="If sClip.Length<1 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("<",_sclip.runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 189;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay nada c";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay nada copiado")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 190;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jampegardatospreview", "analisisrobotclipboard"), _msa);
this.state = 110;
return;
case 110:
//C
this.state = 4;
;
 BA.debugLineNum = 191;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 198;BA.debugLine="Dialog.Title=\"Vista Preliminar Datos a Pegar\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Vista Preliminar Datos a Pegar")));
 BA.debugLineNum = 200;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 201;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, frm.RootPane.Width*0";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(true,"getWidth"),RemoteObject.createImmutable(0.8)}, "*",0, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(true,"getHeight"),RemoteObject.createImmutable(0.8)}, "*",0, 0)));
 BA.debugLineNum = 202;BA.debugLine="p.LoadLayout(\"scrDlgTextArea\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrDlgTextArea")),__ref.getField(false, "ba"));
 BA.debugLineNum = 203;BA.debugLine="Dim rs As ResumableSub = Dialog.ShowCustom(p, \"Co";
Debug.JustUpdateDeviceLine();
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("Continuar"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 204;BA.debugLine="Dialog.Resize(frm.RootPane.Width,frm.RootPane.Hei";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(true,"getWidth"))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(true,"getHeight"))));
 BA.debugLineNum = 205;BA.debugLine="TextAreaDlg.Text=sClip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textareadlg" /*RemoteObject*/ ).runMethod(true,"setText",_sclip);
 BA.debugLineNum = 206;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
Debug.JustUpdateDeviceLine();
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOK", _bok);Debug.locals.put("bOK", _bok);
 BA.debugLineNum = 207;BA.debugLine="bOK.Left=bOK.Left-200dip";
Debug.JustUpdateDeviceLine();
_bok.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bok.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))}, "-",1, 0));
 BA.debugLineNum = 208;BA.debugLine="bOK.Width=bOK.Width+100dip";
Debug.JustUpdateDeviceLine();
_bok.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bok.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))}, "+",1, 0));
 BA.debugLineNum = 209;BA.debugLine="Dim bCancelar As B4XView=Dialog.GetButton(xui.Dia";
Debug.JustUpdateDeviceLine();
_bcancelar = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancelar = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancelar", _bcancelar);Debug.locals.put("bCancelar", _bcancelar);
 BA.debugLineNum = 210;BA.debugLine="bCancelar.Left=bCancelar.Left-100dip";
Debug.JustUpdateDeviceLine();
_bcancelar.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancelar.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))}, "-",1, 0));
 BA.debugLineNum = 211;BA.debugLine="bCancelar.Width=bCancelar.Width+100dip";
Debug.JustUpdateDeviceLine();
_bcancelar.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancelar.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))}, "+",1, 0));
 BA.debugLineNum = 212;BA.debugLine="Wait For (rs) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jampegardatospreview", "analisisrobotclipboard"), _rs);
this.state = 111;
return;
case 111:
//C
this.state = 5;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 213;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 219;BA.debugLine="Dim nFilas As Int=1";
Debug.JustUpdateDeviceLine();
_nfilas = BA.numberCast(int.class, 1);Debug.locals.put("nFilas", _nfilas);Debug.locals.put("nFilas", _nfilas);
 BA.debugLineNum = 220;BA.debugLine="Dim nCols As Int=1";
Debug.JustUpdateDeviceLine();
_ncols = BA.numberCast(int.class, 1);Debug.locals.put("nCols", _ncols);Debug.locals.put("nCols", _ncols);
 BA.debugLineNum = 221;BA.debugLine="Dim PrimeraFila As Boolean=True";
Debug.JustUpdateDeviceLine();
_primerafila = parent.__c.getField(true,"True");Debug.locals.put("PrimeraFila", _primerafila);Debug.locals.put("PrimeraFila", _primerafila);
 BA.debugLineNum = 222;BA.debugLine="For i=0 To sClip.Length-1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 11:
//for
this.state = 26;
step28 = 1;
limit28 = RemoteObject.solve(new RemoteObject[] {_sclip.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 112;
if (true) break;

case 112:
//C
this.state = 26;
if ((step28 > 0 && _i <= limit28) || (step28 < 0 && _i >= limit28)) this.state = 13;
if (true) break;

case 113:
//C
this.state = 112;
_i = ((int)(0 + _i + step28)) ;
Debug.locals.put("i", _i);
if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 223;BA.debugLine="Dim sChar As String=sClip.SubString2(i,(i+1))";
Debug.JustUpdateDeviceLine();
_schar = _sclip.runMethod(true,"substring",(Object)(BA.numberCast(int.class, _i)),(Object)((RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))));Debug.locals.put("sChar", _schar);Debug.locals.put("sChar", _schar);
 BA.debugLineNum = 224;BA.debugLine="Select sChar";
Debug.JustUpdateDeviceLine();
if (true) break;

case 14:
//select
this.state = 25;
switch (BA.switchObjectToInt(_schar,parent.__c.getField(true,"TAB"),parent.__c.getField(true,"CRLF"))) {
case 0: {
this.state = 16;
if (true) break;
}
case 1: {
this.state = 22;
if (true) break;
}
default: {
this.state = 24;
if (true) break;
}
}
if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 227;BA.debugLine="If PrimeraFila Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 17:
//if
this.state = 20;
if (_primerafila.<Boolean>get().booleanValue()) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 229;BA.debugLine="nCols=nCols+1";
Debug.JustUpdateDeviceLine();
_ncols = RemoteObject.solve(new RemoteObject[] {_ncols,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("nCols", _ncols);
 if (true) break;

case 20:
//C
this.state = 25;
;
 if (true) break;

case 22:
//C
this.state = 25;
 BA.debugLineNum = 233;BA.debugLine="PrimeraFila=False";
Debug.JustUpdateDeviceLine();
_primerafila = parent.__c.getField(true,"False");Debug.locals.put("PrimeraFila", _primerafila);
 BA.debugLineNum = 234;BA.debugLine="nFilas=nFilas+1";
Debug.JustUpdateDeviceLine();
_nfilas = RemoteObject.solve(new RemoteObject[] {_nfilas,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("nFilas", _nfilas);
 if (true) break;

case 24:
//C
this.state = 25;
 if (true) break;

case 25:
//C
this.state = 113;
;
 if (true) break;
if (true) break;

case 26:
//C
this.state = 27;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 240;BA.debugLine="nFilas=nFilas-1";
Debug.JustUpdateDeviceLine();
_nfilas = RemoteObject.solve(new RemoteObject[] {_nfilas,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("nFilas", _nfilas);
 BA.debugLineNum = 241;BA.debugLine="Log (\"nFilas \" & nFilas & \"  nCols \" & nCols)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9157679677",RemoteObject.concat(RemoteObject.createImmutable("nFilas "),_nfilas,RemoteObject.createImmutable("  nCols "),_ncols),0);
 BA.debugLineNum = 244;BA.debugLine="Dim sbContenidoCelda As StringBuilder";
Debug.JustUpdateDeviceLine();
_sbcontenidocelda = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbContenidoCelda", _sbcontenidocelda);
 BA.debugLineNum = 245;BA.debugLine="sbContenidoCelda.Initialize";
Debug.JustUpdateDeviceLine();
_sbcontenidocelda.runVoidMethod ("Initialize");
 BA.debugLineNum = 246;BA.debugLine="Dim lstEncabezados As List";
Debug.JustUpdateDeviceLine();
_lstencabezados = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstEncabezados", _lstencabezados);
 BA.debugLineNum = 247;BA.debugLine="lstEncabezados.Initialize";
Debug.JustUpdateDeviceLine();
_lstencabezados.runVoidMethod ("Initialize");
 BA.debugLineNum = 249;BA.debugLine="Dim mFila As Map";
Debug.JustUpdateDeviceLine();
_mfila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mFila", _mfila);
 BA.debugLineNum = 250;BA.debugLine="mFila.Initialize";
Debug.JustUpdateDeviceLine();
_mfila.runVoidMethod ("Initialize");
 BA.debugLineNum = 251;BA.debugLine="PrimeraFila=True";
Debug.JustUpdateDeviceLine();
_primerafila = parent.__c.getField(true,"True");Debug.locals.put("PrimeraFila", _primerafila);
 BA.debugLineNum = 252;BA.debugLine="Dim ColAct, FilaAct As Int";
Debug.JustUpdateDeviceLine();
_colact = RemoteObject.createImmutable(0);Debug.locals.put("ColAct", _colact);
_filaact = RemoteObject.createImmutable(0);Debug.locals.put("FilaAct", _filaact);
 BA.debugLineNum = 253;BA.debugLine="Dim Celdas(nFilas,nCols) As String";
Debug.JustUpdateDeviceLine();
_celdas = RemoteObject.createNewArray ("String", new int[] {_nfilas.<Integer>get().intValue(),_ncols.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Celdas", _celdas);
 BA.debugLineNum = 254;BA.debugLine="For i=0 To sClip.Length-1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 27:
//for
this.state = 58;
step52 = 1;
limit52 = RemoteObject.solve(new RemoteObject[] {_sclip.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 114;
if (true) break;

case 114:
//C
this.state = 58;
if ((step52 > 0 && _i <= limit52) || (step52 < 0 && _i >= limit52)) this.state = 29;
if (true) break;

case 115:
//C
this.state = 114;
_i = ((int)(0 + _i + step52)) ;
Debug.locals.put("i", _i);
if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 255;BA.debugLine="Dim sChar As String=sClip.SubString2(i,(i+1))";
Debug.JustUpdateDeviceLine();
_schar = _sclip.runMethod(true,"substring",(Object)(BA.numberCast(int.class, _i)),(Object)((RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))));Debug.locals.put("sChar", _schar);Debug.locals.put("sChar", _schar);
 BA.debugLineNum = 256;BA.debugLine="Select sChar";
Debug.JustUpdateDeviceLine();
if (true) break;

case 30:
//select
this.state = 57;
switch (BA.switchObjectToInt(_schar,parent.__c.getField(true,"TAB"),parent.__c.getField(true,"CRLF"))) {
case 0: {
this.state = 32;
if (true) break;
}
case 1: {
this.state = 44;
if (true) break;
}
default: {
this.state = 56;
if (true) break;
}
}
if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 259;BA.debugLine="If PrimeraFila Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 33:
//if
this.state = 42;
if (_primerafila.<Boolean>get().booleanValue()) { 
this.state = 35;
}else {
this.state = 37;
}if (true) break;

case 35:
//C
this.state = 42;
 BA.debugLineNum = 260;BA.debugLine="Celdas(FilaAct,ColAct)=sbContenidoCelda.ToStr";
Debug.JustUpdateDeviceLine();
_celdas.setArrayElement (_sbcontenidocelda.runMethod(true,"ToString").runMethod(true,"trim"),_filaact,_colact);
 BA.debugLineNum = 261;BA.debugLine="lstEncabezados.Add(sbContenidoCelda.ToString.";
Debug.JustUpdateDeviceLine();
_lstencabezados.runVoidMethod ("Add",(Object)((_sbcontenidocelda.runMethod(true,"ToString").runMethod(true,"toUpperCase").runMethod(true,"trim"))));
 if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 263;BA.debugLine="Celdas(FilaAct,ColAct)=sbContenidoCelda.ToStr";
Debug.JustUpdateDeviceLine();
_celdas.setArrayElement (_sbcontenidocelda.runMethod(true,"ToString"),_filaact,_colact);
 BA.debugLineNum = 264;BA.debugLine="If mlstCamposPegar.IndexOf(lstEncabezados.Get";
Debug.JustUpdateDeviceLine();
if (true) break;

case 38:
//if
this.state = 41;
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_mlstcampospegar" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)(_lstencabezados.runMethod(false,"Get",(Object)(_colact)))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 265;BA.debugLine="mFila.put(lstEncabezados.Get(ColAct),sbConte";
Debug.JustUpdateDeviceLine();
_mfila.runVoidMethod ("Put",(Object)(_lstencabezados.runMethod(false,"Get",(Object)(_colact))),(Object)((_sbcontenidocelda.runMethod(true,"ToString").runMethod(true,"trim"))));
 if (true) break;

case 41:
//C
this.state = 42;
;
 if (true) break;

case 42:
//C
this.state = 57;
;
 BA.debugLineNum = 269;BA.debugLine="sbContenidoCelda.Initialize";
Debug.JustUpdateDeviceLine();
_sbcontenidocelda.runVoidMethod ("Initialize");
 BA.debugLineNum = 270;BA.debugLine="ColAct=ColAct+1";
Debug.JustUpdateDeviceLine();
_colact = RemoteObject.solve(new RemoteObject[] {_colact,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ColAct", _colact);
 if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 273;BA.debugLine="If PrimeraFila Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 45:
//if
this.state = 54;
if (_primerafila.<Boolean>get().booleanValue()) { 
this.state = 47;
}else {
this.state = 49;
}if (true) break;

case 47:
//C
this.state = 54;
 BA.debugLineNum = 274;BA.debugLine="Celdas(FilaAct,ColAct)=sbContenidoCelda.ToStr";
Debug.JustUpdateDeviceLine();
_celdas.setArrayElement (_sbcontenidocelda.runMethod(true,"ToString").runMethod(true,"trim"),_filaact,_colact);
 BA.debugLineNum = 275;BA.debugLine="lstEncabezados.Add(sbContenidoCelda.ToString.";
Debug.JustUpdateDeviceLine();
_lstencabezados.runVoidMethod ("Add",(Object)((_sbcontenidocelda.runMethod(true,"ToString").runMethod(true,"toUpperCase").runMethod(true,"trim"))));
 BA.debugLineNum = 276;BA.debugLine="PrimeraFila=False";
Debug.JustUpdateDeviceLine();
_primerafila = parent.__c.getField(true,"False");Debug.locals.put("PrimeraFila", _primerafila);
 if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 278;BA.debugLine="Celdas(FilaAct,ColAct)=sbContenidoCelda.ToStr";
Debug.JustUpdateDeviceLine();
_celdas.setArrayElement (_sbcontenidocelda.runMethod(true,"ToString").runMethod(true,"trim"),_filaact,_colact);
 BA.debugLineNum = 279;BA.debugLine="If mlstCamposPegar.IndexOf(lstEncabezados.Get";
Debug.JustUpdateDeviceLine();
if (true) break;

case 50:
//if
this.state = 53;
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_mlstcampospegar" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)(_lstencabezados.runMethod(false,"Get",(Object)(_colact)))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 280;BA.debugLine="mFila.put(lstEncabezados.Get(ColAct),sbConte";
Debug.JustUpdateDeviceLine();
_mfila.runVoidMethod ("Put",(Object)(_lstencabezados.runMethod(false,"Get",(Object)(_colact))),(Object)((_sbcontenidocelda.runMethod(true,"ToString").runMethod(true,"trim"))));
 BA.debugLineNum = 281;BA.debugLine="lstDatosPegar.Add(mFila)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lstdatospegar" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_mfila.getObject())));
 if (true) break;

case 53:
//C
this.state = 54;
;
 if (true) break;

case 54:
//C
this.state = 57;
;
 BA.debugLineNum = 285;BA.debugLine="Dim mFila As Map";
Debug.JustUpdateDeviceLine();
_mfila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mFila", _mfila);
 BA.debugLineNum = 286;BA.debugLine="mFila.Initialize";
Debug.JustUpdateDeviceLine();
_mfila.runVoidMethod ("Initialize");
 BA.debugLineNum = 287;BA.debugLine="FilaAct=FilaAct+1";
Debug.JustUpdateDeviceLine();
_filaact = RemoteObject.solve(new RemoteObject[] {_filaact,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("FilaAct", _filaact);
 BA.debugLineNum = 288;BA.debugLine="ColAct=0";
Debug.JustUpdateDeviceLine();
_colact = BA.numberCast(int.class, 0);Debug.locals.put("ColAct", _colact);
 BA.debugLineNum = 289;BA.debugLine="sbContenidoCelda.Initialize";
Debug.JustUpdateDeviceLine();
_sbcontenidocelda.runVoidMethod ("Initialize");
 if (true) break;

case 56:
//C
this.state = 57;
 BA.debugLineNum = 291;BA.debugLine="sbContenidoCelda.Append(sChar)";
Debug.JustUpdateDeviceLine();
_sbcontenidocelda.runVoidMethod ("Append",(Object)(_schar));
 if (true) break;

case 57:
//C
this.state = 115;
;
 if (true) break;
if (true) break;

case 58:
//C
this.state = 59;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 295;BA.debugLine="Log(\"********** Lista de mapas\")";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9157679731",RemoteObject.createImmutable("********** Lista de mapas"),0);
 BA.debugLineNum = 296;BA.debugLine="Dim CurrFila As Int=0";
Debug.JustUpdateDeviceLine();
_currfila = BA.numberCast(int.class, 0);Debug.locals.put("CurrFila", _currfila);Debug.locals.put("CurrFila", _currfila);
 BA.debugLineNum = 297;BA.debugLine="For Each m As Map In lstDatosPegar";
Debug.JustUpdateDeviceLine();
if (true) break;

case 59:
//for
this.state = 66;
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group90 = __ref.getField(false,"_lstdatospegar" /*RemoteObject*/ );
index90 = 0;
groupLen90 = group90.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("m", _m);
this.state = 116;
if (true) break;

case 116:
//C
this.state = 66;
if (index90 < groupLen90) {
this.state = 61;
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group90.runMethod(false,"Get",index90));Debug.locals.put("m", _m);}
if (true) break;

case 117:
//C
this.state = 116;
index90++;
Debug.locals.put("m", _m);
if (true) break;

case 61:
//C
this.state = 62;
 BA.debugLineNum = 299;BA.debugLine="For Each k As String In m.Keys";
Debug.JustUpdateDeviceLine();
if (true) break;

case 62:
//for
this.state = 65;
group91 = _m.runMethod(false,"Keys");
index91 = 0;
groupLen91 = group91.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("k", _k);
this.state = 118;
if (true) break;

case 118:
//C
this.state = 65;
if (index91 < groupLen91) {
this.state = 64;
_k = BA.ObjectToString(group91.runMethod(false,"Get",index91));Debug.locals.put("k", _k);}
if (true) break;

case 119:
//C
this.state = 118;
index91++;
Debug.locals.put("k", _k);
if (true) break;

case 64:
//C
this.state = 119;
 BA.debugLineNum = 300;BA.debugLine="Log(k & \": \" & m.Get(k))";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9157679736",RemoteObject.concat(_k,RemoteObject.createImmutable(": "),_m.runMethod(false,"Get",(Object)((_k)))),0);
 if (true) break;
if (true) break;

case 65:
//C
this.state = 117;
Debug.locals.put("k", _k);
;
 BA.debugLineNum = 302;BA.debugLine="CurrFila=CurrFila+1";
Debug.JustUpdateDeviceLine();
_currfila = RemoteObject.solve(new RemoteObject[] {_currfila,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("CurrFila", _currfila);
 if (true) break;
if (true) break;

case 66:
//C
this.state = 67;
Debug.locals.put("m", _m);
;
 BA.debugLineNum = 304;BA.debugLine="Log(\"********** Array Bidimensional\")";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9157679740",RemoteObject.createImmutable("********** Array Bidimensional"),0);
 BA.debugLineNum = 305;BA.debugLine="For nf=0 To nFilas-1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 67:
//for
this.state = 74;
step97 = 1;
limit97 = RemoteObject.solve(new RemoteObject[] {_nfilas,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_nf = 0 ;
Debug.locals.put("nf", _nf);
this.state = 120;
if (true) break;

case 120:
//C
this.state = 74;
if ((step97 > 0 && _nf <= limit97) || (step97 < 0 && _nf >= limit97)) this.state = 69;
if (true) break;

case 121:
//C
this.state = 120;
_nf = ((int)(0 + _nf + step97)) ;
Debug.locals.put("nf", _nf);
if (true) break;

case 69:
//C
this.state = 70;
 BA.debugLineNum = 306;BA.debugLine="For nc=0 To nCols-1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 70:
//for
this.state = 73;
step98 = 1;
limit98 = RemoteObject.solve(new RemoteObject[] {_ncols,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_nc = 0 ;
Debug.locals.put("nc", _nc);
this.state = 122;
if (true) break;

case 122:
//C
this.state = 73;
if ((step98 > 0 && _nc <= limit98) || (step98 < 0 && _nc >= limit98)) this.state = 72;
if (true) break;

case 123:
//C
this.state = 122;
_nc = ((int)(0 + _nc + step98)) ;
Debug.locals.put("nc", _nc);
if (true) break;

case 72:
//C
this.state = 123;
 BA.debugLineNum = 307;BA.debugLine="Log(\"Celda Excel (\" & (nf+1) & \",\" & (nc+1) & \"";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9157679743",RemoteObject.concat(RemoteObject.createImmutable("Celda Excel ("),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_nf),RemoteObject.createImmutable(1)}, "+",1, 1)),RemoteObject.createImmutable(","),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_nc),RemoteObject.createImmutable(1)}, "+",1, 1)),RemoteObject.createImmutable(") = "),_celdas.getArrayElement(true,BA.numberCast(int.class, _nf),BA.numberCast(int.class, _nc))),0);
 if (true) break;
if (true) break;

case 73:
//C
this.state = 121;
Debug.locals.put("nc", _nc);
;
 if (true) break;
if (true) break;

case 74:
//C
this.state = 75;
Debug.locals.put("nf", _nf);
;
 BA.debugLineNum = 313;BA.debugLine="Dim FlagEncabezadosOK As Boolean=True";
Debug.JustUpdateDeviceLine();
_flagencabezadosok = parent.__c.getField(true,"True");Debug.locals.put("FlagEncabezadosOK", _flagencabezadosok);Debug.locals.put("FlagEncabezadosOK", _flagencabezadosok);
 BA.debugLineNum = 314;BA.debugLine="Dim lstEncabezadosFaltantes As List";
Debug.JustUpdateDeviceLine();
_lstencabezadosfaltantes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstEncabezadosFaltantes", _lstencabezadosfaltantes);
 BA.debugLineNum = 315;BA.debugLine="lstEncabezadosFaltantes.Initialize";
Debug.JustUpdateDeviceLine();
_lstencabezadosfaltantes.runVoidMethod ("Initialize");
 BA.debugLineNum = 316;BA.debugLine="For Each sCampo As String In mlstCamposPegar";
Debug.JustUpdateDeviceLine();
if (true) break;

case 75:
//for
this.state = 82;
group105 = __ref.getField(false,"_mlstcampospegar" /*RemoteObject*/ );
index105 = 0;
groupLen105 = group105.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("sCampo", _scampo);
this.state = 124;
if (true) break;

case 124:
//C
this.state = 82;
if (index105 < groupLen105) {
this.state = 77;
_scampo = BA.ObjectToString(group105.runMethod(false,"Get",index105));Debug.locals.put("sCampo", _scampo);}
if (true) break;

case 125:
//C
this.state = 124;
index105++;
Debug.locals.put("sCampo", _scampo);
if (true) break;

case 77:
//C
this.state = 78;
 BA.debugLineNum = 317;BA.debugLine="If lstEncabezados.IndexOf(sCampo)=-1 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 78:
//if
this.state = 81;
if (RemoteObject.solveBoolean("=",_lstencabezados.runMethod(true,"IndexOf",(Object)((_scampo))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 80;
}if (true) break;

case 80:
//C
this.state = 81;
 BA.debugLineNum = 318;BA.debugLine="lstEncabezadosFaltantes.Add(sCampo)";
Debug.JustUpdateDeviceLine();
_lstencabezadosfaltantes.runVoidMethod ("Add",(Object)((_scampo)));
 BA.debugLineNum = 319;BA.debugLine="FlagEncabezadosOK=False";
Debug.JustUpdateDeviceLine();
_flagencabezadosok = parent.__c.getField(true,"False");Debug.locals.put("FlagEncabezadosOK", _flagencabezadosok);
 if (true) break;

case 81:
//C
this.state = 125;
;
 if (true) break;
if (true) break;

case 82:
//C
this.state = 83;
Debug.locals.put("sCampo", _scampo);
;
 BA.debugLineNum = 322;BA.debugLine="btnOkPegarDatosPreview.Enabled=FlagEncabezadosOK";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btnokpegardatospreview" /*RemoteObject*/ ).runMethod(true,"setEnabled",_flagencabezadosok);
 BA.debugLineNum = 323;BA.debugLine="If FlagEncabezadosOK=False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 83:
//if
this.state = 109;
if (RemoteObject.solveBoolean("=",_flagencabezadosok,parent.__c.getField(true,"False"))) { 
this.state = 85;
}else {
this.state = 91;
}if (true) break;

case 85:
//C
this.state = 86;
 BA.debugLineNum = 324;BA.debugLine="Dim sbErrEncabezados As StringBuilder";
Debug.JustUpdateDeviceLine();
_sberrencabezados = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbErrEncabezados", _sberrencabezados);
 BA.debugLineNum = 325;BA.debugLine="sbErrEncabezados.Initialize";
Debug.JustUpdateDeviceLine();
_sberrencabezados.runVoidMethod ("Initialize");
 BA.debugLineNum = 326;BA.debugLine="sbErrEncabezados.Append(\"Error, faltan los sigui";
Debug.JustUpdateDeviceLine();
_sberrencabezados.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Error, faltan los siguientes encabezados:"))).runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 327;BA.debugLine="For Each sErrEnc As String In lstEncabezadosFalt";
Debug.JustUpdateDeviceLine();
if (true) break;

case 86:
//for
this.state = 89;
group116 = _lstencabezadosfaltantes;
index116 = 0;
groupLen116 = group116.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("sErrEnc", _serrenc);
this.state = 126;
if (true) break;

case 126:
//C
this.state = 89;
if (index116 < groupLen116) {
this.state = 88;
_serrenc = BA.ObjectToString(group116.runMethod(false,"Get",index116));Debug.locals.put("sErrEnc", _serrenc);}
if (true) break;

case 127:
//C
this.state = 126;
index116++;
Debug.locals.put("sErrEnc", _serrenc);
if (true) break;

case 88:
//C
this.state = 127;
 BA.debugLineNum = 328;BA.debugLine="sbErrEncabezados.Append(sErrEnc).Append(CRLF)";
Debug.JustUpdateDeviceLine();
_sberrencabezados.runMethod(false,"Append",(Object)(_serrenc)).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 if (true) break;
if (true) break;

case 89:
//C
this.state = 109;
Debug.locals.put("sErrEnc", _serrenc);
;
 BA.debugLineNum = 330;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sbErrEncabezad";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(_sberrencabezados.runMethod(true,"ToString")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 331;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jampegardatospreview", "analisisrobotclipboard"), _msa);
this.state = 128;
return;
case 128:
//C
this.state = 109;
;
 if (true) break;

case 91:
//C
this.state = 92;
 BA.debugLineNum = 333;BA.debugLine="If tvPegarDatosPreview.ColumnsCount=0 Then tvPeg";
Debug.JustUpdateDeviceLine();
if (true) break;

case 92:
//if
this.state = 97;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_tvpegardatospreview" /*RemoteObject*/ ).runMethod(true,"getColumnsCount"),BA.numberCast(double.class, 0))) { 
this.state = 94;
;}if (true) break;

case 94:
//C
this.state = 97;
__ref.getField(false,"_tvpegardatospreview" /*RemoteObject*/ ).runVoidMethod ("SetColumns",(Object)(__ref.getField(false,"_mlstcampospegar" /*RemoteObject*/ )));
if (true) break;

case 97:
//C
this.state = 98;
;
 BA.debugLineNum = 334;BA.debugLine="For idxCol=0 To tvPegarDatosPreview.ColumnsCount";
Debug.JustUpdateDeviceLine();
if (true) break;

case 98:
//for
this.state = 101;
step123 = 1;
limit123 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_tvpegardatospreview" /*RemoteObject*/ ).runMethod(true,"getColumnsCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_idxcol = 0 ;
Debug.locals.put("idxCol", _idxcol);
this.state = 129;
if (true) break;

case 129:
//C
this.state = 101;
if ((step123 > 0 && _idxcol <= limit123) || (step123 < 0 && _idxcol >= limit123)) this.state = 100;
if (true) break;

case 130:
//C
this.state = 129;
_idxcol = ((int)(0 + _idxcol + step123)) ;
Debug.locals.put("idxCol", _idxcol);
if (true) break;

case 100:
//C
this.state = 130;
 BA.debugLineNum = 335;BA.debugLine="tvPegarDatosPreview.SetColumnWidth(idxCol,150)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tvpegardatospreview" /*RemoteObject*/ ).runVoidMethod ("SetColumnWidth",(Object)(BA.numberCast(int.class, _idxcol)),(Object)(BA.numberCast(double.class, 150)));
 if (true) break;
if (true) break;
Debug.locals.put("idxCol", _idxcol);
;
 BA.debugLineNum = 337;BA.debugLine="For Each m As Map In lstDatosPegar";
Debug.JustUpdateDeviceLine();

case 101:
//for
this.state = 108;
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group126 = __ref.getField(false,"_lstdatospegar" /*RemoteObject*/ );
index126 = 0;
groupLen126 = group126.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("m", _m);
this.state = 131;
if (true) break;

case 131:
//C
this.state = 108;
if (index126 < groupLen126) {
this.state = 103;
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group126.runMethod(false,"Get",index126));Debug.locals.put("m", _m);}
if (true) break;

case 132:
//C
this.state = 131;
index126++;
Debug.locals.put("m", _m);
if (true) break;

case 103:
//C
this.state = 104;
 BA.debugLineNum = 338;BA.debugLine="Dim row(mlstCamposPegar.Size) As Object";
Debug.JustUpdateDeviceLine();
_row = RemoteObject.createNewArray ("Object", new int[] {__ref.getField(false,"_mlstcampospegar" /*RemoteObject*/ ).runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("row", _row);
 BA.debugLineNum = 339;BA.debugLine="For Each k As String In m.Keys";
Debug.JustUpdateDeviceLine();
if (true) break;

case 104:
//for
this.state = 107;
group128 = _m.runMethod(false,"Keys");
index128 = 0;
groupLen128 = group128.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("k", _k);
this.state = 133;
if (true) break;

case 133:
//C
this.state = 107;
if (index128 < groupLen128) {
this.state = 106;
_k = BA.ObjectToString(group128.runMethod(false,"Get",index128));Debug.locals.put("k", _k);}
if (true) break;

case 134:
//C
this.state = 133;
index128++;
Debug.locals.put("k", _k);
if (true) break;

case 106:
//C
this.state = 134;
 BA.debugLineNum = 340;BA.debugLine="Dim NumCol As Int=mlstCamposPegar.IndexOf(k)";
Debug.JustUpdateDeviceLine();
_numcol = __ref.getField(false,"_mlstcampospegar" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_k)));Debug.locals.put("NumCol", _numcol);Debug.locals.put("NumCol", _numcol);
 BA.debugLineNum = 341;BA.debugLine="row(NumCol)=m.Get(k)";
Debug.JustUpdateDeviceLine();
_row.setArrayElement (_m.runMethod(false,"Get",(Object)((_k))),_numcol);
 if (true) break;
if (true) break;

case 107:
//C
this.state = 132;
Debug.locals.put("k", _k);
;
 BA.debugLineNum = 343;BA.debugLine="tvPegarDatosPreview.Items.Add(row)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tvpegardatospreview" /*RemoteObject*/ ).runMethod(false,"getItems").runVoidMethod ("Add",(Object)((_row)));
 if (true) break;
if (true) break;

case 108:
//C
this.state = 109;
Debug.locals.put("m", _m);
;
 if (true) break;

case 109:
//C
this.state = -1;
;
 BA.debugLineNum = 346;BA.debugLine="End Sub";
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
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static void  _complete(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _asjo(RemoteObject __ref,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("asJO (jampegardatospreview) ","jampegardatospreview",87,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("asjo")) { return __ref.runUserSub(false, "jampegardatospreview","asjo", __ref, _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 158;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 159;BA.debugLine="Return o";
Debug.JustUpdateDeviceLine();
if (true) return _o;
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncancelarpegardatospreview_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnCancelarPegarDatosPreview_Click (jampegardatospreview) ","jampegardatospreview",87,__ref.getField(false, "ba"),__ref,167);
if (RapidSub.canDelegate("btncancelarpegardatospreview_click")) { return __ref.runUserSub(false, "jampegardatospreview","btncancelarpegardatospreview_click", __ref);}
 BA.debugLineNum = 167;BA.debugLine="Private Sub btnCancelarPegarDatosPreview_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 168;BA.debugLine="lstDatosPegar.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lstdatospegar" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 169;BA.debugLine="SalirForm";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jampegardatospreview.class, "_salirform" /*void*/ );
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnmsginfo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnMsgInfo_Click (jampegardatospreview) ","jampegardatospreview",87,__ref.getField(false, "ba"),__ref,350);
if (RapidSub.canDelegate("btnmsginfo_click")) { __ref.runUserSub(false, "jampegardatospreview","btnmsginfo_click", __ref); return;}
ResumableSub_btnMsgInfo_Click rsub = new ResumableSub_btnMsgInfo_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnMsgInfo_Click extends BA.ResumableSub {
public ResumableSub_btnMsgInfo_Click(b4j.docU.jampegardatospreview parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jampegardatospreview parent;
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnMsgInfo_Click (jampegardatospreview) ","jampegardatospreview",87,__ref.getField(false, "ba"),__ref,350);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 351;BA.debugLine="Dim sb As StringBuilder=MensajeInfo(mlstCamposPeg";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");
_sb = __ref.runClassMethod (b4j.docU.jampegardatospreview.class, "_mensajeinfo" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mlstcampospegar" /*RemoteObject*/ )));Debug.locals.put("sb", _sb);Debug.locals.put("sb", _sb);
 BA.debugLineNum = 352;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sb.ToString,\"In";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(_sb.runMethod(true,"ToString")),(Object)(RemoteObject.createImmutable("Información")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 353;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jampegardatospreview", "btnmsginfo_click"), _msa);
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 354;BA.debugLine="End Sub";
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
public static RemoteObject  _btnokpegardatospreview_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnOkPegarDatosPreview_Click (jampegardatospreview) ","jampegardatospreview",87,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("btnokpegardatospreview_click")) { return __ref.runUserSub(false, "jampegardatospreview","btnokpegardatospreview_click", __ref);}
 BA.debugLineNum = 163;BA.debugLine="Private Sub btnOkPegarDatosPreview_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 164;BA.debugLine="SalirForm";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jampegardatospreview.class, "_salirform" /*void*/ );
 BA.debugLineNum = 165;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnpegarcontenidoclipboarddatospreview_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnPegarContenidoClipboardDatosPreview_Click (jampegardatospreview) ","jampegardatospreview",87,__ref.getField(false, "ba"),__ref,173);
if (RapidSub.canDelegate("btnpegarcontenidoclipboarddatospreview_click")) { return __ref.runUserSub(false, "jampegardatospreview","btnpegarcontenidoclipboarddatospreview_click", __ref);}
 BA.debugLineNum = 173;BA.debugLine="Private Sub btnPegarContenidoClipboardDatosPreview";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 174;BA.debugLine="lstDatosPegar.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lstdatospegar" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 175;BA.debugLine="tvPegarDatosPreview.Items.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tvpegardatospreview" /*RemoteObject*/ ).runMethod(false,"getItems").runVoidMethod ("Clear");
 BA.debugLineNum = 176;BA.debugLine="AnalisisRobotClipBoard";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jampegardatospreview.class, "_analisisrobotclipboard" /*void*/ );
 BA.debugLineNum = 177;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
jampegardatospreview._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",jampegardatospreview._fx);
 //BA.debugLineNum = 5;BA.debugLine="Private frm As Form";
jampegardatospreview._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",jampegardatospreview._frm);
 //BA.debugLineNum = 6;BA.debugLine="Private xui As XUI";
jampegardatospreview._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",jampegardatospreview._xui);
 //BA.debugLineNum = 7;BA.debugLine="Private mlstCamposPegar As List";
jampegardatospreview._mlstcampospegar = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_mlstcampospegar",jampegardatospreview._mlstcampospegar);
 //BA.debugLineNum = 8;BA.debugLine="Private tvPegarDatosPreview As TableView";
jampegardatospreview._tvpegardatospreview = RemoteObject.createNew ("anywheresoftware.b4j.objects.TableViewWrapper");__ref.setField("_tvpegardatospreview",jampegardatospreview._tvpegardatospreview);
 //BA.debugLineNum = 9;BA.debugLine="Private lstDatosPegar As List  ' lista de mapas c";
jampegardatospreview._lstdatospegar = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstdatospegar",jampegardatospreview._lstdatospegar);
 //BA.debugLineNum = 10;BA.debugLine="Private btnOkPegarDatosPreview As Button";
jampegardatospreview._btnokpegardatospreview = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnokpegardatospreview",jampegardatospreview._btnokpegardatospreview);
 //BA.debugLineNum = 11;BA.debugLine="Private btnCancelarPegarDatosPreview As Button";
jampegardatospreview._btncancelarpegardatospreview = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btncancelarpegardatospreview",jampegardatospreview._btncancelarpegardatospreview);
 //BA.debugLineNum = 12;BA.debugLine="Private btnPegarContenidoClipboardDatosPreview As";
jampegardatospreview._btnpegarcontenidoclipboarddatospreview = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnpegarcontenidoclipboarddatospreview",jampegardatospreview._btnpegarcontenidoclipboarddatospreview);
 //BA.debugLineNum = 13;BA.debugLine="Private btnMsgInfo As Button";
jampegardatospreview._btnmsginfo = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnmsginfo",jampegardatospreview._btnmsginfo);
 //BA.debugLineNum = 15;BA.debugLine="Private mCallBack As Object";
jampegardatospreview._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",jampegardatospreview._mcallback);
 //BA.debugLineNum = 16;BA.debugLine="Private mParent As B4XView";
jampegardatospreview._mparent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mparent",jampegardatospreview._mparent);
 //BA.debugLineNum = 17;BA.debugLine="Dim Background As B4XView";
jampegardatospreview._background = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_background",jampegardatospreview._background);
 //BA.debugLineNum = 20;BA.debugLine="Private Dialog As B4XDialog";
jampegardatospreview._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",jampegardatospreview._dialog);
 //BA.debugLineNum = 21;BA.debugLine="Private TextAreaDlg As B4XView";
jampegardatospreview._textareadlg = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_textareadlg",jampegardatospreview._textareadlg);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (jampegardatospreview) ","jampegardatospreview",87,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "jampegardatospreview","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 112;BA.debugLine="private Sub frm_CloseRequest (EventData As Event)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 113;BA.debugLine="EventData.Consume";
Debug.JustUpdateDeviceLine();
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _parent,RemoteObject _lstcampospegar) throws Exception{
try {
		Debug.PushSubsStack("Initialize (jampegardatospreview) ","jampegardatospreview",87,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "jampegardatospreview","initialize", __ref, _ba, _callback, _parent, _lstcampospegar);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _scampo = RemoteObject.createImmutable("");
Debug.locals.put("ba", _ba);
Debug.locals.put("CallBack", _callback);
Debug.locals.put("Parent", _parent);
Debug.locals.put("lstCamposPegar", _lstcampospegar);
 BA.debugLineNum = 60;BA.debugLine="Public Sub Initialize(CallBack As Object,Parent As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 62;BA.debugLine="mCallBack=CallBack";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 63;BA.debugLine="mParent=Parent";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mparent" /*RemoteObject*/ ,_parent);
 BA.debugLineNum = 66;BA.debugLine="mlstCamposPegar.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlstcampospegar" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 67;BA.debugLine="For Each sCampo As String In lstCamposPegar";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group4 = _lstcampospegar;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_scampo = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("sCampo", _scampo);
Debug.locals.put("sCampo", _scampo);
 BA.debugLineNum = 68;BA.debugLine="mlstCamposPegar.Add(sCampo.ToUpperCase.Trim)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlstcampospegar" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_scampo.runMethod(true,"toUpperCase").runMethod(true,"trim"))));
 }
}Debug.locals.put("sCampo", _scampo);
;
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mensajeinfo(RemoteObject __ref,RemoteObject _lstcampospegar) throws Exception{
try {
		Debug.PushSubsStack("MensajeInfo (jampegardatospreview) ","jampegardatospreview",87,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("mensajeinfo")) { return __ref.runUserSub(false, "jampegardatospreview","mensajeinfo", __ref, _lstcampospegar);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _nombrecampo = RemoteObject.createImmutable("");
Debug.locals.put("lstCamposPegar", _lstcampospegar);
 BA.debugLineNum = 130;BA.debugLine="private Sub MensajeInfo(lstCamposPegar As List) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 131;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 132;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 133;BA.debugLine="sb.Append(\"Condiciones a cumplir para el copiado-";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Condiciones a cumplir para el copiado-pegado de datos:"))).runMethod(false,"Append",(Object)(jampegardatospreview.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(jampegardatospreview.__c.getField(true,"CRLF")));
 BA.debugLineNum = 134;BA.debugLine="sb.Append(\" - Los datos deben copiarse de una tab";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" - Los datos deben copiarse de una tabla EXCEL")));
 BA.debugLineNum = 135;BA.debugLine="sb.Append(\" - Las columnas deben corresponder a l";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" - Las columnas deben corresponder a los siguientes campos:"))).runVoidMethod ("Append",(Object)(jampegardatospreview.__c.getField(true,"CRLF")));
 BA.debugLineNum = 136;BA.debugLine="For Each NombreCampo As String In lstCamposPegar";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group6 = _lstcampospegar;
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_nombrecampo = BA.ObjectToString(group6.runMethod(false,"Get",index6));Debug.locals.put("NombreCampo", _nombrecampo);
Debug.locals.put("NombreCampo", _nombrecampo);
 BA.debugLineNum = 137;BA.debugLine="sb.append(\" - \").Append(NombreCampo).Append(CRLF";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" - "))).runMethod(false,"Append",(Object)(_nombrecampo)).runVoidMethod ("Append",(Object)(jampegardatospreview.__c.getField(true,"CRLF")));
 }
}Debug.locals.put("NombreCampo", _nombrecampo);
;
 BA.debugLineNum = 139;BA.debugLine="sb.Append(CRLF).Append(\"No importa el orden de la";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(jampegardatospreview.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("No importa el orden de las columnas, pero sí el encabezado, el cual debe ser idéntico al indicado anteriormente (no importa mayúsculas o minúsculas).")));
 BA.debugLineNum = 141;BA.debugLine="Return sb";
Debug.JustUpdateDeviceLine();
if (true) return _sb;
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _salirform(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SalirForm (jampegardatospreview) ","jampegardatospreview",87,__ref.getField(false, "ba"),__ref,356);
if (RapidSub.canDelegate("salirform")) { __ref.runUserSub(false, "jampegardatospreview","salirform", __ref); return;}
ResumableSub_SalirForm rsub = new ResumableSub_SalirForm(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SalirForm extends BA.ResumableSub {
public ResumableSub_SalirForm(b4j.docU.jampegardatospreview parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jampegardatospreview parent;
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SalirForm (jampegardatospreview) ","jampegardatospreview",87,__ref.getField(false, "ba"),__ref,356);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 357;BA.debugLine="Background.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_background" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 358;BA.debugLine="frm.Close";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 360;BA.debugLine="If SubExists(mCallBack,\"jamPegarDatos_Done\") Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("jamPegarDatos_Done"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 362;BA.debugLine="CallSubDelayed2(mCallBack, \"jamPegarDatos_Done\",";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(BA.ObjectToString("jamPegarDatos_Done")),(Object)((__ref.getField(false,"_lstdatospegar" /*RemoteObject*/ ))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 364;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de prog";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de programación. Revisar la sintaxis de jamPegarDatos. Ver método en código de ayuda en initialize.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 365;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jampegardatospreview", "salirform"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 367;BA.debugLine="End Sub";
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
public static RemoteObject  _setplaceholdertext(RemoteObject __ref,RemoteObject _textoplaceholder) throws Exception{
try {
		Debug.PushSubsStack("SetPlaceholderText (jampegardatospreview) ","jampegardatospreview",87,__ref.getField(false, "ba"),__ref,144);
if (RapidSub.canDelegate("setplaceholdertext")) { return __ref.runUserSub(false, "jampegardatospreview","setplaceholdertext", __ref, _textoplaceholder);}
RemoteObject _pohjo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _lblph = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
Debug.locals.put("TextoPlaceholder", _textoplaceholder);
 BA.debugLineNum = 144;BA.debugLine="Public Sub SetPlaceholderText(TextoPlaceholder As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 145;BA.debugLine="Dim pohJO As JavaObject=asJO(tvPegarDatosPreview)";
Debug.JustUpdateDeviceLine();
_pohjo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_pohjo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.runClassMethod (b4j.docU.jampegardatospreview.class, "_asjo" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_tvpegardatospreview" /*RemoteObject*/ ).getObject())).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getPlaceholder")),(Object)((jampegardatospreview.__c.getField(false,"Null")))));Debug.locals.put("pohJO", _pohjo);Debug.locals.put("pohJO", _pohjo);
 BA.debugLineNum = 146;BA.debugLine="If pohJO.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_pohjo.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 147;BA.debugLine="If pohJO Is Label Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("i",_pohjo.getObjectOrNull(), RemoteObject.createImmutable("javafx.scene.control.Label"))) { 
 BA.debugLineNum = 148;BA.debugLine="Dim lblPH As Label=pohJO";
Debug.JustUpdateDeviceLine();
_lblph = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_lblph = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), _pohjo.getObject());Debug.locals.put("lblPH", _lblph);Debug.locals.put("lblPH", _lblph);
 BA.debugLineNum = 149;BA.debugLine="lblPH.Text=TextoPlaceholder";
Debug.JustUpdateDeviceLine();
_lblph.runMethod(true,"setText",_textoplaceholder);
 BA.debugLineNum = 150;BA.debugLine="lblPH.TextColor=fx.Colors.From32Bit(0xFFFF0000)";
Debug.JustUpdateDeviceLine();
_lblph.runMethod(false,"setTextColor",(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffff0000))))));
 };
 };
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("show (jampegardatospreview) ","jampegardatospreview",87,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "jampegardatospreview","show", __ref);}
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _mdim = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 73;BA.debugLine="Public Sub show";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 75;BA.debugLine="For Each v As B4XView In mParent.GetAllViewsRecur";
Debug.JustUpdateDeviceLine();
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group1 = __ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(false,"GetAllViewsRecursive");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group1.runMethod(false,"Get",index1));Debug.locals.put("v", _v);
Debug.locals.put("v", _v);
 BA.debugLineNum = 76;BA.debugLine="If v.Tag <> Null And v.Tag = \"jamPegarDatosPrevi";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_v.runMethod(false,"getTag")) && RemoteObject.solveBoolean("=",_v.runMethod(false,"getTag"),RemoteObject.createImmutable(("jamPegarDatosPreview_background")))) { 
 BA.debugLineNum = 77;BA.debugLine="v.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
_v.runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 78;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
if (true) break;
 };
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 82;BA.debugLine="Background= xui.CreatePanel(\"background\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_background" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("background"))));
 BA.debugLineNum = 83;BA.debugLine="Background.Tag = \"jamPegarDatosPreview_background";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(false,"setTag",RemoteObject.createImmutable(("jamPegarDatosPreview_background")));
 BA.debugLineNum = 84;BA.debugLine="Background.Color=0xaa000000";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xaa000000)));
 BA.debugLineNum = 85;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mparent" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_background" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 87;BA.debugLine="Dim mDim As Map";
Debug.JustUpdateDeviceLine();
_mdim = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mDim", _mdim);
 BA.debugLineNum = 88;BA.debugLine="mDim.Initialize";
Debug.JustUpdateDeviceLine();
_mdim.runVoidMethod ("Initialize");
 BA.debugLineNum = 89;BA.debugLine="mDim.Put(\"X\",fx.PrimaryScreen.MaxX - fx.PrimarySc";
Debug.JustUpdateDeviceLine();
_mdim.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("X"))),(Object)((RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMaxX"),__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMinX")}, "-",1, 0))));
 BA.debugLineNum = 90;BA.debugLine="mDim.Put(\"Y\",fx.PrimaryScreen.MaxY - fx.PrimarySc";
Debug.JustUpdateDeviceLine();
_mdim.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Y"))),(Object)((RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMaxY"),__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMinY")}, "-",1, 0))));
 BA.debugLineNum = 92;BA.debugLine="frm.Initialize(\"frm\",mDim.Get(\"X\")*0.75,mDim.Get(";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _mdim.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("X"))))),RemoteObject.createImmutable(0.75)}, "*",0, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _mdim.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Y"))))),RemoteObject.createImmutable(0.75)}, "*",0, 0)));
 BA.debugLineNum = 93;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.JustUpdateDeviceLine();
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 94;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.JustUpdateDeviceLine();
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 95;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.JustUpdateDeviceLine();
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(jampegardatospreview.__c.getField(true,"True"))})));
 BA.debugLineNum = 96;BA.debugLine="frm.RootPane.LoadLayout(\"scrJamPegarDatosPreview\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrJamPegarDatosPreview")));
 BA.debugLineNum = 97;BA.debugLine="frm.Title=\"Pegar Datos Copiados\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",BA.ObjectToString("Pegar Datos Copiados"));
 BA.debugLineNum = 98;BA.debugLine="btnOkPegarDatosPreview.Enabled=False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btnokpegardatospreview" /*RemoteObject*/ ).runMethod(true,"setEnabled",jampegardatospreview.__c.getField(true,"False"));
 BA.debugLineNum = 99;BA.debugLine="btnCancelarPegarDatosPreview.Enabled=True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btncancelarpegardatospreview" /*RemoteObject*/ ).runMethod(true,"setEnabled",jampegardatospreview.__c.getField(true,"True"));
 BA.debugLineNum = 101;BA.debugLine="SetPlaceholderText(\"Tabla sin Datos\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jampegardatospreview.class, "_setplaceholdertext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Tabla sin Datos")));
 BA.debugLineNum = 103;BA.debugLine="lstDatosPegar.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lstdatospegar" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 105;BA.debugLine="Dialog.Initialize(frm.RootPane)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 107;BA.debugLine="frm.Show";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 109;BA.debugLine="End Sub";
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