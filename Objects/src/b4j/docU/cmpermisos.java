package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class cmpermisos extends Object{
public static cmpermisos mostCurrent = new cmpermisos();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cmpermisos", null);
		ba.loadHtSubs(cmpermisos.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.docU.cmpermisos", ba);
		}
	}
    public static Class<?> getObject() {
		return cmpermisos.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.docU.main _main = null;
public static b4j.docU.mainmenu2 _mainmenu2 = null;
public static b4j.docU.utilidades _utilidades = null;
public static b4j.docU.cmauxcorreosexpress _cmauxcorreosexpress = null;
public static b4j.docU.cmauxtxt _cmauxtxt = null;
public static b4j.docU.jrdcquery _jrdcquery = null;
public static b4j.docU.dbutils _dbutils = null;
public static b4j.docU.transfermode _transfermode = null;
public static b4j.docU.jamrecordformbuilder _jamrecordformbuilder = null;
public static b4j.docU.b4xcollections _b4xcollections = null;
public static b4j.docU.jamlinknavision _jamlinknavision = null;
public static b4j.docU.jamtableviewcamposbuilder _jamtableviewcamposbuilder = null;
public static b4j.docU.httputils2service _httputils2service = null;
public static b4j.docU.xuiviewsutils _xuiviewsutils = null;
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _permisosaplicacionusuarioobjetopermiso(String _rdclinkcommandpermisos,String _comandopermisos,String _aplicacion,String _usuario,String _nombreobjetopermiso) throws Exception{
RDebugUtils.currentModule="cmpermisos";
if (Debug.shouldDelegate(ba, "permisosaplicacionusuarioobjetopermiso", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "permisosaplicacionusuarioobjetopermiso", new Object[] {_rdclinkcommandpermisos,_comandopermisos,_aplicacion,_usuario,_nombreobjetopermiso}));}
ResumableSub_PermisosAplicacionUsuarioObjetoPermiso rsub = new ResumableSub_PermisosAplicacionUsuarioObjetoPermiso(null,_rdclinkcommandpermisos,_comandopermisos,_aplicacion,_usuario,_nombreobjetopermiso);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PermisosAplicacionUsuarioObjetoPermiso extends BA.ResumableSub {
public ResumableSub_PermisosAplicacionUsuarioObjetoPermiso(b4j.docU.cmpermisos parent,String _rdclinkcommandpermisos,String _comandopermisos,String _aplicacion,String _usuario,String _nombreobjetopermiso) {
this.parent = parent;
this._rdclinkcommandpermisos = _rdclinkcommandpermisos;
this._comandopermisos = _comandopermisos;
this._aplicacion = _aplicacion;
this._usuario = _usuario;
this._nombreobjetopermiso = _nombreobjetopermiso;
}
b4j.docU.cmpermisos parent;
String _rdclinkcommandpermisos;
String _comandopermisos;
String _aplicacion;
String _usuario;
String _nombreobjetopermiso;
String _sres = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mperm = null;
String _sperm = "";
String _permisoaplicaciontodosusuariostodosobjetos = "";
String _permisoaplicaciontodosusuariosobjeto = "";
String _permisoaplicacionusuariotodosobjetos = "";
String _permisoaplicacionusuarioobjeto = "";
String _osapp = "";
String _osperm = "";
String _userperm = "";
String _objetoperm = "";
String _tipoperm = "";
anywheresoftware.b4a.BA.IterableList group22;
int index22;
int groupLen22;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cmpermisos";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=157941761;
 //BA.debugLineNum = 157941761;BA.debugLine="Dim sRes As String";
_sres = "";
RDebugUtils.currentLine=157941762;
 //BA.debugLineNum = 157941762;BA.debugLine="JRDCQuery.DatosJRDC(rdcLinkCommandPermisos,Comand";
parent._jrdcquery._datosjrdc /*void*/ (_rdclinkcommandpermisos,_comandopermisos,new Object[]{(Object)(_aplicacion)},cmpermisos.getObject());
RDebugUtils.currentLine=157941763;
 //BA.debugLineNum = 157941763;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
anywheresoftware.b4a.keywords.Common.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmpermisos", "permisosaplicacionusuarioobjetopermiso"), null);
this.state = 112;
return;
case 112:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
RDebugUtils.currentLine=157941764;
 //BA.debugLineNum = 157941764;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 111;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 111;
RDebugUtils.currentLine=157941765;
 //BA.debugLineNum = 157941765;BA.debugLine="sRes=\"ErrConn\"";
_sres = "ErrConn";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=157941767;
 //BA.debugLineNum = 157941767;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
if (true) break;

case 6:
//if
this.state = 110;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 110;
RDebugUtils.currentLine=157941768;
 //BA.debugLineNum = 157941768;BA.debugLine="sRes=\"SinPermiso\"";
_sres = "SinPermiso";
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=157941770;
 //BA.debugLineNum = 157941770;BA.debugLine="Dim lstReg As List=mresult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=157941771;
 //BA.debugLineNum = 157941771;BA.debugLine="Dim mPerm As Map=lstReg.Get(0)";
_mperm = new anywheresoftware.b4a.objects.collections.Map();
_mperm = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=157941772;
 //BA.debugLineNum = 157941772;BA.debugLine="Dim sPerm As String=mPerm.GetValueAt(0)";
_sperm = BA.ObjectToString(_mperm.GetValueAt((int) (0)));
RDebugUtils.currentLine=157941773;
 //BA.debugLineNum = 157941773;BA.debugLine="If sPerm.StartsWith(\"ERROR\") Then";
if (true) break;

case 11:
//if
this.state = 109;
if (_sperm.startsWith("ERROR")) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 109;
RDebugUtils.currentLine=157941774;
 //BA.debugLineNum = 157941774;BA.debugLine="sRes=\"ERROR \" & sPerm";
_sres = "ERROR "+_sperm;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=157941776;
 //BA.debugLineNum = 157941776;BA.debugLine="Dim PermisoAplicacionTodosUsuariosTodosObjetos";
_permisoaplicaciontodosusuariostodosobjetos = "";
RDebugUtils.currentLine=157941777;
 //BA.debugLineNum = 157941777;BA.debugLine="Dim PermisoAplicacionTodosUsuariosObjeto As St";
_permisoaplicaciontodosusuariosobjeto = "";
RDebugUtils.currentLine=157941778;
 //BA.debugLineNum = 157941778;BA.debugLine="Dim PermisoAplicacionUsuarioTodosObjetos As St";
_permisoaplicacionusuariotodosobjetos = "";
RDebugUtils.currentLine=157941779;
 //BA.debugLineNum = 157941779;BA.debugLine="Dim PermisoAplicacionUsuarioObjeto As String";
_permisoaplicacionusuarioobjeto = "";
RDebugUtils.currentLine=157941780;
 //BA.debugLineNum = 157941780;BA.debugLine="Dim OSApp As String";
_osapp = "";
RDebugUtils.currentLine=157941782;
 //BA.debugLineNum = 157941782;BA.debugLine="OSApp=\"Windows\"";
_osapp = "Windows";
RDebugUtils.currentLine=157941787;
 //BA.debugLineNum = 157941787;BA.debugLine="For Each mPerm As Map In lstReg";
if (true) break;

case 16:
//for
this.state = 52;
_mperm = new anywheresoftware.b4a.objects.collections.Map();
group22 = _lstreg;
index22 = 0;
groupLen22 = group22.getSize();
this.state = 113;
if (true) break;

case 113:
//C
this.state = 52;
if (index22 < groupLen22) {
this.state = 18;
_mperm = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group22.Get(index22)));}
if (true) break;

case 114:
//C
this.state = 113;
index22++;
if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=157941788;
 //BA.debugLineNum = 157941788;BA.debugLine="Dim OSPerm As String=mPerm.Get(\"OS\")";
_osperm = BA.ObjectToString(_mperm.Get((Object)("OS")));
RDebugUtils.currentLine=157941789;
 //BA.debugLineNum = 157941789;BA.debugLine="If OSPerm<>\"\" And OSPerm.ToUpperCase<>OSApp.T";
if (true) break;

case 19:
//if
this.state = 24;
if ((_osperm).equals("") == false && (_osperm.toUpperCase()).equals(_osapp.toUpperCase()) == false) { 
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
RDebugUtils.currentLine=157941790;
 //BA.debugLineNum = 157941790;BA.debugLine="Dim UserPerm As String=mPerm.Get(\"IDUsuario\")";
_userperm = BA.ObjectToString(_mperm.Get((Object)("IDUsuario")));
RDebugUtils.currentLine=157941791;
 //BA.debugLineNum = 157941791;BA.debugLine="Dim ObjetoPerm As String=mPerm.Get(\"ObjetoPer";
_objetoperm = BA.ObjectToString(_mperm.Get((Object)("ObjetoPermiso")));
RDebugUtils.currentLine=157941792;
 //BA.debugLineNum = 157941792;BA.debugLine="Dim TipoPerm As String=mPerm.Get(\"TipoPermiso";
_tipoperm = BA.ObjectToString(_mperm.Get((Object)("TipoPermiso")));
RDebugUtils.currentLine=157941794;
 //BA.debugLineNum = 157941794;BA.debugLine="If UserPerm<>\"\" And UserPerm.ToUpperCase<>Usu";
if (true) break;

case 25:
//if
this.state = 30;
if ((_userperm).equals("") == false && (_userperm.toUpperCase()).equals(_usuario.toUpperCase()) == false) { 
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
RDebugUtils.currentLine=157941796;
 //BA.debugLineNum = 157941796;BA.debugLine="If UserPerm.ToUpperCase=Usuario.ToUpperCase A";
if (true) break;

case 31:
//if
this.state = 34;
if ((_userperm.toUpperCase()).equals(_usuario.toUpperCase()) && (_objetoperm.toUpperCase()).equals(_nombreobjetopermiso.toUpperCase())) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=157941797;
 //BA.debugLineNum = 157941797;BA.debugLine="PermisoAplicacionUsuarioObjeto=TipoPerm";
_permisoaplicacionusuarioobjeto = _tipoperm;
RDebugUtils.currentLine=157941799;
 //BA.debugLineNum = 157941799;BA.debugLine="Exit";
this.state = 52;
if (true) break;
 if (true) break;
;
RDebugUtils.currentLine=157941802;
 //BA.debugLineNum = 157941802;BA.debugLine="If UserPerm.ToUpperCase=Usuario.ToUpperCase A";

case 34:
//if
this.state = 39;
if ((_userperm.toUpperCase()).equals(_usuario.toUpperCase()) && ((_objetoperm).equals("") || (_objetoperm).equals("Aplicacion"))) { 
this.state = 36;
;}if (true) break;

case 36:
//C
this.state = 39;
_permisoaplicacionusuariotodosobjetos = _tipoperm;
if (true) break;

case 39:
//C
this.state = 40;
;
RDebugUtils.currentLine=157941804;
 //BA.debugLineNum = 157941804;BA.debugLine="If ObjetoPerm.ToUpperCase=NombreObjetoPermiso";
if (true) break;

case 40:
//if
this.state = 45;
if ((_objetoperm.toUpperCase()).equals(_nombreobjetopermiso.toUpperCase()) && (_userperm).equals("")) { 
this.state = 42;
;}if (true) break;

case 42:
//C
this.state = 45;
_permisoaplicaciontodosusuariosobjeto = _tipoperm;
if (true) break;

case 45:
//C
this.state = 46;
;
RDebugUtils.currentLine=157941806;
 //BA.debugLineNum = 157941806;BA.debugLine="If UserPerm=\"\" And ObjetoPerm=\"\" Then Permiso";
if (true) break;

case 46:
//if
this.state = 51;
if ((_userperm).equals("") && (_objetoperm).equals("")) { 
this.state = 48;
;}if (true) break;

case 48:
//C
this.state = 51;
_permisoaplicaciontodosusuariostodosobjetos = _tipoperm;
if (true) break;

case 51:
//C
this.state = 114;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=157941811;
 //BA.debugLineNum = 157941811;BA.debugLine="If PermisoAplicacionTodosUsuariosTodosObjetos<";

case 52:
//if
this.state = 57;
if ((_permisoaplicaciontodosusuariostodosobjetos).equals("") == false) { 
this.state = 54;
;}if (true) break;

case 54:
//C
this.state = 57;
_sres = _permisoaplicaciontodosusuariostodosobjetos;
if (true) break;

case 57:
//C
this.state = 58;
;
RDebugUtils.currentLine=157941812;
 //BA.debugLineNum = 157941812;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos<>\"\" Th";
if (true) break;

case 58:
//if
this.state = 63;
if ((_permisoaplicacionusuariotodosobjetos).equals("") == false) { 
this.state = 60;
;}if (true) break;

case 60:
//C
this.state = 63;
_sres = _permisoaplicacionusuariotodosobjetos;
if (true) break;

case 63:
//C
this.state = 64;
;
RDebugUtils.currentLine=157941813;
 //BA.debugLineNum = 157941813;BA.debugLine="If PermisoAplicacionTodosUsuariosObjeto<>\"\" Th";
if (true) break;

case 64:
//if
this.state = 69;
if ((_permisoaplicaciontodosusuariosobjeto).equals("") == false) { 
this.state = 66;
;}if (true) break;

case 66:
//C
this.state = 69;
_sres = _permisoaplicaciontodosusuariosobjeto;
if (true) break;

case 69:
//C
this.state = 70;
;
RDebugUtils.currentLine=157941816;
 //BA.debugLineNum = 157941816;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos<>\"\" An";
if (true) break;

case 70:
//if
this.state = 99;
if ((_permisoaplicacionusuariotodosobjetos).equals("") == false && (_permisoaplicaciontodosusuariosobjeto).equals("") == false && (_permisoaplicacionusuariotodosobjetos).equals(_permisoaplicaciontodosusuariosobjeto) == false) { 
this.state = 72;
}if (true) break;

case 72:
//C
this.state = 73;
RDebugUtils.currentLine=157941817;
 //BA.debugLineNum = 157941817;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos=\"ADMI";
if (true) break;

case 73:
//if
this.state = 98;
if ((_permisoaplicacionusuariotodosobjetos).equals("ADMIN")) { 
this.state = 75;
}else {
this.state = 77;
}if (true) break;

case 75:
//C
this.state = 98;
RDebugUtils.currentLine=157941818;
 //BA.debugLineNum = 157941818;BA.debugLine="sPerm=\"ADMIN\"";
_sperm = "ADMIN";
 if (true) break;

case 77:
//C
this.state = 78;
RDebugUtils.currentLine=157941820;
 //BA.debugLineNum = 157941820;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos=\"DEN";
if (true) break;

case 78:
//if
this.state = 97;
if ((_permisoaplicacionusuariotodosobjetos).equals("DENIED") || (_permisoaplicaciontodosusuariosobjeto).equals("DENIED")) { 
this.state = 80;
}else {
this.state = 82;
}if (true) break;

case 80:
//C
this.state = 97;
RDebugUtils.currentLine=157941821;
 //BA.debugLineNum = 157941821;BA.debugLine="sPerm=\"DENIED\"";
_sperm = "DENIED";
 if (true) break;

case 82:
//C
this.state = 83;
RDebugUtils.currentLine=157941823;
 //BA.debugLineNum = 157941823;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos=\"R\"";
if (true) break;

case 83:
//if
this.state = 96;
if ((_permisoaplicacionusuariotodosobjetos).equals("R") || (_permisoaplicaciontodosusuariosobjeto).equals("R")) { 
this.state = 85;
}else {
this.state = 87;
}if (true) break;

case 85:
//C
this.state = 96;
RDebugUtils.currentLine=157941824;
 //BA.debugLineNum = 157941824;BA.debugLine="sPerm=\"R\"";
_sperm = "R";
 if (true) break;

case 87:
//C
this.state = 88;
RDebugUtils.currentLine=157941826;
 //BA.debugLineNum = 157941826;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos=\"R";
if (true) break;

case 88:
//if
this.state = 95;
if ((_permisoaplicacionusuariotodosobjetos).equals("RW") || (_permisoaplicaciontodosusuariosobjeto).equals("RW")) { 
this.state = 90;
}if (true) break;

case 90:
//C
this.state = 91;
RDebugUtils.currentLine=157941827;
 //BA.debugLineNum = 157941827;BA.debugLine="sPerm=\"RW\"";
_sperm = "RW";
RDebugUtils.currentLine=157941829;
 //BA.debugLineNum = 157941829;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos=\"";
if (true) break;

case 91:
//if
this.state = 94;
if ((_permisoaplicacionusuariotodosobjetos).equals("ADMIN") || (_permisoaplicaciontodosusuariosobjeto).equals("ADMIN")) { 
this.state = 93;
}if (true) break;

case 93:
//C
this.state = 94;
RDebugUtils.currentLine=157941830;
 //BA.debugLineNum = 157941830;BA.debugLine="sPerm=\"ADMIN\"";
_sperm = "ADMIN";
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
RDebugUtils.currentLine=157941837;
 //BA.debugLineNum = 157941837;BA.debugLine="If PermisoAplicacionUsuarioObjeto<>\"\" Then sRe";

case 99:
//if
this.state = 104;
if ((_permisoaplicacionusuarioobjeto).equals("") == false) { 
this.state = 101;
;}if (true) break;

case 101:
//C
this.state = 104;
_sres = _permisoaplicacionusuarioobjeto;
if (true) break;

case 104:
//C
this.state = 105;
;
RDebugUtils.currentLine=157941839;
 //BA.debugLineNum = 157941839;BA.debugLine="If sRes=\"\" Then";
if (true) break;

case 105:
//if
this.state = 108;
if ((_sres).equals("")) { 
this.state = 107;
}if (true) break;

case 107:
//C
this.state = 108;
RDebugUtils.currentLine=157941840;
 //BA.debugLineNum = 157941840;BA.debugLine="sRes=\"SinPermiso\"";
_sres = "SinPermiso";
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
RDebugUtils.currentLine=157941847;
 //BA.debugLineNum = 157941847;BA.debugLine="LogColor(\"Check Permiso \" & Aplicacion & \" USUARI";
anywheresoftware.b4a.keywords.Common.LogImpl("9157941847","Check Permiso "+_aplicacion+" USUARIO: "+_usuario+" Nombre OBJETO Permiso: "+_nombreobjetopermiso+":"+"PERMISO: "+_sres,((int)0xffff1493));
RDebugUtils.currentLine=157941850;
 //BA.debugLineNum = 157941850;BA.debugLine="Return sRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_sres));return;};
RDebugUtils.currentLine=157941851;
 //BA.debugLineNum = 157941851;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}