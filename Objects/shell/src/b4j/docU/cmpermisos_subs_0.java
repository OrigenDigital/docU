package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cmpermisos_subs_0 {


public static RemoteObject  _permisosaplicacionusuarioobjetopermiso(RemoteObject _rdclinkcommandpermisos,RemoteObject _comandopermisos,RemoteObject _aplicacion,RemoteObject _usuario,RemoteObject _nombreobjetopermiso) throws Exception{
try {
		Debug.PushSubsStack("PermisosAplicacionUsuarioObjetoPermiso (cmpermisos) ","cmpermisos",88,cmpermisos.ba,cmpermisos.mostCurrent,32);
if (RapidSub.canDelegate("permisosaplicacionusuarioobjetopermiso")) { return b4j.docU.cmpermisos.remoteMe.runUserSub(false, "cmpermisos","permisosaplicacionusuarioobjetopermiso", _rdclinkcommandpermisos, _comandopermisos, _aplicacion, _usuario, _nombreobjetopermiso);}
ResumableSub_PermisosAplicacionUsuarioObjetoPermiso rsub = new ResumableSub_PermisosAplicacionUsuarioObjetoPermiso(null,_rdclinkcommandpermisos,_comandopermisos,_aplicacion,_usuario,_nombreobjetopermiso);
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
public static class ResumableSub_PermisosAplicacionUsuarioObjetoPermiso extends BA.ResumableSub {
public ResumableSub_PermisosAplicacionUsuarioObjetoPermiso(b4j.docU.cmpermisos parent,RemoteObject _rdclinkcommandpermisos,RemoteObject _comandopermisos,RemoteObject _aplicacion,RemoteObject _usuario,RemoteObject _nombreobjetopermiso) {
this.parent = parent;
this._rdclinkcommandpermisos = _rdclinkcommandpermisos;
this._comandopermisos = _comandopermisos;
this._aplicacion = _aplicacion;
this._usuario = _usuario;
this._nombreobjetopermiso = _nombreobjetopermiso;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.cmpermisos parent;
RemoteObject _rdclinkcommandpermisos;
RemoteObject _comandopermisos;
RemoteObject _aplicacion;
RemoteObject _usuario;
RemoteObject _nombreobjetopermiso;
RemoteObject _sres = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mperm = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sperm = RemoteObject.createImmutable("");
RemoteObject _permisoaplicaciontodosusuariostodosobjetos = RemoteObject.createImmutable("");
RemoteObject _permisoaplicaciontodosusuariosobjeto = RemoteObject.createImmutable("");
RemoteObject _permisoaplicacionusuariotodosobjetos = RemoteObject.createImmutable("");
RemoteObject _permisoaplicacionusuarioobjeto = RemoteObject.createImmutable("");
RemoteObject _osapp = RemoteObject.createImmutable("");
RemoteObject _osperm = RemoteObject.createImmutable("");
RemoteObject _userperm = RemoteObject.createImmutable("");
RemoteObject _objetoperm = RemoteObject.createImmutable("");
RemoteObject _tipoperm = RemoteObject.createImmutable("");
RemoteObject group22;
int index22;
int groupLen22;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PermisosAplicacionUsuarioObjetoPermiso (cmpermisos) ","cmpermisos",88,cmpermisos.ba,cmpermisos.mostCurrent,32);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("rdcLinkCommandPermisos", _rdclinkcommandpermisos);
Debug.locals.put("ComandoPermisos", _comandopermisos);
Debug.locals.put("Aplicacion", _aplicacion);
Debug.locals.put("Usuario", _usuario);
Debug.locals.put("NombreObjetoPermiso", _nombreobjetopermiso);
 BA.debugLineNum = 33;BA.debugLine="Dim sRes As String";
Debug.JustUpdateDeviceLine();
_sres = RemoteObject.createImmutable("");Debug.locals.put("sRes", _sres);
 BA.debugLineNum = 34;BA.debugLine="JRDCQuery.DatosJRDC(rdcLinkCommandPermisos,Comand";
Debug.JustUpdateDeviceLine();
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_rdclinkcommandpermisos),(Object)(_comandopermisos),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_aplicacion)})),(Object)(cmpermisos.getObject()));
 BA.debugLineNum = 35;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", cmpermisos.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmpermisos", "permisosaplicacionusuarioobjetopermiso"), null);
this.state = 112;
return;
case 112:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 36;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 111;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 111;
 BA.debugLineNum = 37;BA.debugLine="sRes=\"ErrConn\"";
Debug.JustUpdateDeviceLine();
_sres = BA.ObjectToString("ErrConn");Debug.locals.put("sRes", _sres);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 39;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 6:
//if
this.state = 110;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 110;
 BA.debugLineNum = 40;BA.debugLine="sRes=\"SinPermiso\"";
Debug.JustUpdateDeviceLine();
_sres = BA.ObjectToString("SinPermiso");Debug.locals.put("sRes", _sres);
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 42;BA.debugLine="Dim lstReg As List=mresult.Get(\"lstRes\")";
Debug.JustUpdateDeviceLine();
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 43;BA.debugLine="Dim mPerm As Map=lstReg.Get(0)";
Debug.JustUpdateDeviceLine();
_mperm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mperm = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mPerm", _mperm);Debug.locals.put("mPerm", _mperm);
 BA.debugLineNum = 44;BA.debugLine="Dim sPerm As String=mPerm.GetValueAt(0)";
Debug.JustUpdateDeviceLine();
_sperm = BA.ObjectToString(_mperm.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("sPerm", _sperm);Debug.locals.put("sPerm", _sperm);
 BA.debugLineNum = 45;BA.debugLine="If sPerm.StartsWith(\"ERROR\") Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 11:
//if
this.state = 109;
if (_sperm.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 109;
 BA.debugLineNum = 46;BA.debugLine="sRes=\"ERROR \" & sPerm";
Debug.JustUpdateDeviceLine();
_sres = RemoteObject.concat(RemoteObject.createImmutable("ERROR "),_sperm);Debug.locals.put("sRes", _sres);
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 48;BA.debugLine="Dim PermisoAplicacionTodosUsuariosTodosObjetos";
Debug.JustUpdateDeviceLine();
_permisoaplicaciontodosusuariostodosobjetos = RemoteObject.createImmutable("");Debug.locals.put("PermisoAplicacionTodosUsuariosTodosObjetos", _permisoaplicaciontodosusuariostodosobjetos);
 BA.debugLineNum = 49;BA.debugLine="Dim PermisoAplicacionTodosUsuariosObjeto As St";
Debug.JustUpdateDeviceLine();
_permisoaplicaciontodosusuariosobjeto = RemoteObject.createImmutable("");Debug.locals.put("PermisoAplicacionTodosUsuariosObjeto", _permisoaplicaciontodosusuariosobjeto);
 BA.debugLineNum = 50;BA.debugLine="Dim PermisoAplicacionUsuarioTodosObjetos As St";
Debug.JustUpdateDeviceLine();
_permisoaplicacionusuariotodosobjetos = RemoteObject.createImmutable("");Debug.locals.put("PermisoAplicacionUsuarioTodosObjetos", _permisoaplicacionusuariotodosobjetos);
 BA.debugLineNum = 51;BA.debugLine="Dim PermisoAplicacionUsuarioObjeto As String";
Debug.JustUpdateDeviceLine();
_permisoaplicacionusuarioobjeto = RemoteObject.createImmutable("");Debug.locals.put("PermisoAplicacionUsuarioObjeto", _permisoaplicacionusuarioobjeto);
 BA.debugLineNum = 52;BA.debugLine="Dim OSApp As String";
Debug.JustUpdateDeviceLine();
_osapp = RemoteObject.createImmutable("");Debug.locals.put("OSApp", _osapp);
 BA.debugLineNum = 54;BA.debugLine="OSApp=\"Windows\"";
Debug.JustUpdateDeviceLine();
_osapp = BA.ObjectToString("Windows");Debug.locals.put("OSApp", _osapp);
 BA.debugLineNum = 59;BA.debugLine="For Each mPerm As Map In lstReg";
Debug.JustUpdateDeviceLine();
if (true) break;

case 16:
//for
this.state = 52;
_mperm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group22 = _lstreg;
index22 = 0;
groupLen22 = group22.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mPerm", _mperm);
this.state = 113;
if (true) break;

case 113:
//C
this.state = 52;
if (index22 < groupLen22) {
this.state = 18;
_mperm = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group22.runMethod(false,"Get",index22));Debug.locals.put("mPerm", _mperm);}
if (true) break;

case 114:
//C
this.state = 113;
index22++;
Debug.locals.put("mPerm", _mperm);
if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 60;BA.debugLine="Dim OSPerm As String=mPerm.Get(\"OS\")";
Debug.JustUpdateDeviceLine();
_osperm = BA.ObjectToString(_mperm.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("OS")))));Debug.locals.put("OSPerm", _osperm);Debug.locals.put("OSPerm", _osperm);
 BA.debugLineNum = 61;BA.debugLine="If OSPerm<>\"\" And OSPerm.ToUpperCase<>OSApp.T";
Debug.JustUpdateDeviceLine();
if (true) break;

case 19:
//if
this.state = 24;
if (RemoteObject.solveBoolean("!",_osperm,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_osperm.runMethod(true,"toUpperCase"),_osapp.runMethod(true,"toUpperCase"))) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
this.state = 114;
if (true) break;;
if (true) break;

case 24:
//C
this.state = 25;
;
 BA.debugLineNum = 62;BA.debugLine="Dim UserPerm As String=mPerm.Get(\"IDUsuario\")";
Debug.JustUpdateDeviceLine();
_userperm = BA.ObjectToString(_mperm.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IDUsuario")))));Debug.locals.put("UserPerm", _userperm);Debug.locals.put("UserPerm", _userperm);
 BA.debugLineNum = 63;BA.debugLine="Dim ObjetoPerm As String=mPerm.Get(\"ObjetoPer";
Debug.JustUpdateDeviceLine();
_objetoperm = BA.ObjectToString(_mperm.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ObjetoPermiso")))));Debug.locals.put("ObjetoPerm", _objetoperm);Debug.locals.put("ObjetoPerm", _objetoperm);
 BA.debugLineNum = 64;BA.debugLine="Dim TipoPerm As String=mPerm.Get(\"TipoPermiso";
Debug.JustUpdateDeviceLine();
_tipoperm = BA.ObjectToString(_mperm.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TipoPermiso")))));Debug.locals.put("TipoPerm", _tipoperm);Debug.locals.put("TipoPerm", _tipoperm);
 BA.debugLineNum = 66;BA.debugLine="If UserPerm<>\"\" And UserPerm.ToUpperCase<>Usu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 25:
//if
this.state = 30;
if (RemoteObject.solveBoolean("!",_userperm,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_userperm.runMethod(true,"toUpperCase"),_usuario.runMethod(true,"toUpperCase"))) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
this.state = 114;
if (true) break;;
if (true) break;

case 30:
//C
this.state = 31;
;
 BA.debugLineNum = 68;BA.debugLine="If UserPerm.ToUpperCase=Usuario.ToUpperCase A";
Debug.JustUpdateDeviceLine();
if (true) break;

case 31:
//if
this.state = 34;
if (RemoteObject.solveBoolean("=",_userperm.runMethod(true,"toUpperCase"),_usuario.runMethod(true,"toUpperCase")) && RemoteObject.solveBoolean("=",_objetoperm.runMethod(true,"toUpperCase"),_nombreobjetopermiso.runMethod(true,"toUpperCase"))) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 69;BA.debugLine="PermisoAplicacionUsuarioObjeto=TipoPerm";
Debug.JustUpdateDeviceLine();
_permisoaplicacionusuarioobjeto = _tipoperm;Debug.locals.put("PermisoAplicacionUsuarioObjeto", _permisoaplicacionusuarioobjeto);
 BA.debugLineNum = 71;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
this.state = 52;
if (true) break;
 if (true) break;
;
 BA.debugLineNum = 74;BA.debugLine="If UserPerm.ToUpperCase=Usuario.ToUpperCase A";
Debug.JustUpdateDeviceLine();

case 34:
//if
this.state = 39;
if (RemoteObject.solveBoolean("=",_userperm.runMethod(true,"toUpperCase"),_usuario.runMethod(true,"toUpperCase")) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_objetoperm,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_objetoperm,RemoteObject.createImmutable("Aplicacion")))))) { 
this.state = 36;
;}if (true) break;

case 36:
//C
this.state = 39;
_permisoaplicacionusuariotodosobjetos = _tipoperm;Debug.locals.put("PermisoAplicacionUsuarioTodosObjetos", _permisoaplicacionusuariotodosobjetos);
if (true) break;

case 39:
//C
this.state = 40;
;
 BA.debugLineNum = 76;BA.debugLine="If ObjetoPerm.ToUpperCase=NombreObjetoPermiso";
Debug.JustUpdateDeviceLine();
if (true) break;

case 40:
//if
this.state = 45;
if (RemoteObject.solveBoolean("=",_objetoperm.runMethod(true,"toUpperCase"),_nombreobjetopermiso.runMethod(true,"toUpperCase")) && RemoteObject.solveBoolean("=",_userperm,BA.ObjectToString(""))) { 
this.state = 42;
;}if (true) break;

case 42:
//C
this.state = 45;
_permisoaplicaciontodosusuariosobjeto = _tipoperm;Debug.locals.put("PermisoAplicacionTodosUsuariosObjeto", _permisoaplicaciontodosusuariosobjeto);
if (true) break;

case 45:
//C
this.state = 46;
;
 BA.debugLineNum = 78;BA.debugLine="If UserPerm=\"\" And ObjetoPerm=\"\" Then Permiso";
Debug.JustUpdateDeviceLine();
if (true) break;

case 46:
//if
this.state = 51;
if (RemoteObject.solveBoolean("=",_userperm,BA.ObjectToString("")) && RemoteObject.solveBoolean("=",_objetoperm,BA.ObjectToString(""))) { 
this.state = 48;
;}if (true) break;

case 48:
//C
this.state = 51;
_permisoaplicaciontodosusuariostodosobjetos = _tipoperm;Debug.locals.put("PermisoAplicacionTodosUsuariosTodosObjetos", _permisoaplicaciontodosusuariostodosobjetos);
if (true) break;

case 51:
//C
this.state = 114;
;
 if (true) break;
if (true) break;
Debug.locals.put("mPerm", _mperm);
;
 BA.debugLineNum = 83;BA.debugLine="If PermisoAplicacionTodosUsuariosTodosObjetos<";
Debug.JustUpdateDeviceLine();

case 52:
//if
this.state = 57;
if (RemoteObject.solveBoolean("!",_permisoaplicaciontodosusuariostodosobjetos,BA.ObjectToString(""))) { 
this.state = 54;
;}if (true) break;

case 54:
//C
this.state = 57;
_sres = _permisoaplicaciontodosusuariostodosobjetos;Debug.locals.put("sRes", _sres);
if (true) break;

case 57:
//C
this.state = 58;
;
 BA.debugLineNum = 84;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos<>\"\" Th";
Debug.JustUpdateDeviceLine();
if (true) break;

case 58:
//if
this.state = 63;
if (RemoteObject.solveBoolean("!",_permisoaplicacionusuariotodosobjetos,BA.ObjectToString(""))) { 
this.state = 60;
;}if (true) break;

case 60:
//C
this.state = 63;
_sres = _permisoaplicacionusuariotodosobjetos;Debug.locals.put("sRes", _sres);
if (true) break;

case 63:
//C
this.state = 64;
;
 BA.debugLineNum = 85;BA.debugLine="If PermisoAplicacionTodosUsuariosObjeto<>\"\" Th";
Debug.JustUpdateDeviceLine();
if (true) break;

case 64:
//if
this.state = 69;
if (RemoteObject.solveBoolean("!",_permisoaplicaciontodosusuariosobjeto,BA.ObjectToString(""))) { 
this.state = 66;
;}if (true) break;

case 66:
//C
this.state = 69;
_sres = _permisoaplicaciontodosusuariosobjeto;Debug.locals.put("sRes", _sres);
if (true) break;

case 69:
//C
this.state = 70;
;
 BA.debugLineNum = 88;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos<>\"\" An";
Debug.JustUpdateDeviceLine();
if (true) break;

case 70:
//if
this.state = 99;
if (RemoteObject.solveBoolean("!",_permisoaplicacionusuariotodosobjetos,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_permisoaplicaciontodosusuariosobjeto,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_permisoaplicacionusuariotodosobjetos,_permisoaplicaciontodosusuariosobjeto)) { 
this.state = 72;
}if (true) break;

case 72:
//C
this.state = 73;
 BA.debugLineNum = 89;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos=\"ADMI";
Debug.JustUpdateDeviceLine();
if (true) break;

case 73:
//if
this.state = 98;
if (RemoteObject.solveBoolean("=",_permisoaplicacionusuariotodosobjetos,BA.ObjectToString("ADMIN"))) { 
this.state = 75;
}else {
this.state = 77;
}if (true) break;

case 75:
//C
this.state = 98;
 BA.debugLineNum = 90;BA.debugLine="sPerm=\"ADMIN\"";
Debug.JustUpdateDeviceLine();
_sperm = BA.ObjectToString("ADMIN");Debug.locals.put("sPerm", _sperm);
 if (true) break;

case 77:
//C
this.state = 78;
 BA.debugLineNum = 92;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos=\"DEN";
Debug.JustUpdateDeviceLine();
if (true) break;

case 78:
//if
this.state = 97;
if (RemoteObject.solveBoolean("=",_permisoaplicacionusuariotodosobjetos,BA.ObjectToString("DENIED")) || RemoteObject.solveBoolean("=",_permisoaplicaciontodosusuariosobjeto,BA.ObjectToString("DENIED"))) { 
this.state = 80;
}else {
this.state = 82;
}if (true) break;

case 80:
//C
this.state = 97;
 BA.debugLineNum = 93;BA.debugLine="sPerm=\"DENIED\"";
Debug.JustUpdateDeviceLine();
_sperm = BA.ObjectToString("DENIED");Debug.locals.put("sPerm", _sperm);
 if (true) break;

case 82:
//C
this.state = 83;
 BA.debugLineNum = 95;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos=\"R\"";
Debug.JustUpdateDeviceLine();
if (true) break;

case 83:
//if
this.state = 96;
if (RemoteObject.solveBoolean("=",_permisoaplicacionusuariotodosobjetos,BA.ObjectToString("R")) || RemoteObject.solveBoolean("=",_permisoaplicaciontodosusuariosobjeto,BA.ObjectToString("R"))) { 
this.state = 85;
}else {
this.state = 87;
}if (true) break;

case 85:
//C
this.state = 96;
 BA.debugLineNum = 96;BA.debugLine="sPerm=\"R\"";
Debug.JustUpdateDeviceLine();
_sperm = BA.ObjectToString("R");Debug.locals.put("sPerm", _sperm);
 if (true) break;

case 87:
//C
this.state = 88;
 BA.debugLineNum = 98;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos=\"R";
Debug.JustUpdateDeviceLine();
if (true) break;

case 88:
//if
this.state = 95;
if (RemoteObject.solveBoolean("=",_permisoaplicacionusuariotodosobjetos,BA.ObjectToString("RW")) || RemoteObject.solveBoolean("=",_permisoaplicaciontodosusuariosobjeto,BA.ObjectToString("RW"))) { 
this.state = 90;
}if (true) break;

case 90:
//C
this.state = 91;
 BA.debugLineNum = 99;BA.debugLine="sPerm=\"RW\"";
Debug.JustUpdateDeviceLine();
_sperm = BA.ObjectToString("RW");Debug.locals.put("sPerm", _sperm);
 BA.debugLineNum = 101;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos=\"";
Debug.JustUpdateDeviceLine();
if (true) break;

case 91:
//if
this.state = 94;
if (RemoteObject.solveBoolean("=",_permisoaplicacionusuariotodosobjetos,BA.ObjectToString("ADMIN")) || RemoteObject.solveBoolean("=",_permisoaplicaciontodosusuariosobjeto,BA.ObjectToString("ADMIN"))) { 
this.state = 93;
}if (true) break;

case 93:
//C
this.state = 94;
 BA.debugLineNum = 102;BA.debugLine="sPerm=\"ADMIN\"";
Debug.JustUpdateDeviceLine();
_sperm = BA.ObjectToString("ADMIN");Debug.locals.put("sPerm", _sperm);
 if (true) break;

case 94:
//C
this.state = 95;
;
 if (true) break;

case 95:
//C
this.state = 96;
;
 if (true) break;

case 96:
//C
this.state = 97;
;
 if (true) break;

case 97:
//C
this.state = 98;
;
 if (true) break;

case 98:
//C
this.state = 99;
;
 if (true) break;
;
 BA.debugLineNum = 109;BA.debugLine="If PermisoAplicacionUsuarioObjeto<>\"\" Then sRe";
Debug.JustUpdateDeviceLine();

case 99:
//if
this.state = 104;
if (RemoteObject.solveBoolean("!",_permisoaplicacionusuarioobjeto,BA.ObjectToString(""))) { 
this.state = 101;
;}if (true) break;

case 101:
//C
this.state = 104;
_sres = _permisoaplicacionusuarioobjeto;Debug.locals.put("sRes", _sres);
if (true) break;

case 104:
//C
this.state = 105;
;
 BA.debugLineNum = 111;BA.debugLine="If sRes=\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 105:
//if
this.state = 108;
if (RemoteObject.solveBoolean("=",_sres,BA.ObjectToString(""))) { 
this.state = 107;
}if (true) break;

case 107:
//C
this.state = 108;
 BA.debugLineNum = 112;BA.debugLine="sRes=\"SinPermiso\"";
Debug.JustUpdateDeviceLine();
_sres = BA.ObjectToString("SinPermiso");Debug.locals.put("sRes", _sres);
 if (true) break;

case 108:
//C
this.state = 109;
;
 if (true) break;

case 109:
//C
this.state = 110;
;
 if (true) break;

case 110:
//C
this.state = 111;
;
 if (true) break;

case 111:
//C
this.state = -1;
;
 BA.debugLineNum = 119;BA.debugLine="LogColor(\"Check Permiso \" & Aplicacion & \" USUARI";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9157941847",RemoteObject.concat(RemoteObject.createImmutable("Check Permiso "),_aplicacion,RemoteObject.createImmutable(" USUARIO: "),_usuario,RemoteObject.createImmutable(" Nombre OBJETO Permiso: "),_nombreobjetopermiso,RemoteObject.createImmutable(":"),RemoteObject.createImmutable("PERMISO: "),_sres),BA.numberCast(int.class, ((int)0xffff1493)));
 BA.debugLineNum = 122;BA.debugLine="Return sRes";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_sres));return;};
 BA.debugLineNum = 123;BA.debugLine="End Sub";
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}