
package b4j.docU;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class cgestionventas {
    public static RemoteObject myClass;
	public cgestionventas() {
	}
    public static PCBA staticBA = new PCBA(null, cgestionventas.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _jamtableviewgestionventas = RemoteObject.declareNull("b4j.docU.jamtableview");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _frm = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _dialog = RemoteObject.declareNull("b4j.docU.b4xdialog");
public static RemoteObject _jamloadingindicator1 = RemoteObject.declareNull("b4j.docU.jamloadingindicator");
public static RemoteObject _msqlgestionventas = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL");
public static RemoteObject _txtcodigovendedor = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtnombrevendedor = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _btnsalir = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _calcularfechas = RemoteObject.createImmutable(false);
public static RemoteObject _cal = RemoteObject.declareNull("flm.b4j.calendar.b4jCalendar");
public static RemoteObject _locale = RemoteObject.declareNull("flm.b4j.calendar.b4jLocale");
public static RemoteObject _permisomodulousuario = RemoteObject.createImmutable("");
public static RemoteObject _carpetaficheroscsvrepsol = RemoteObject.createImmutable("");
public static RemoteObject _carpetaficherospdfrepsol = RemoteObject.createImmutable("");
public static RemoteObject _buzoncompartidoemailenvioinforepsol = RemoteObject.createImmutable("");
public static RemoteObject _direccionseleccionadaremitenteemailsrepsol = RemoteObject.createImmutable("");
public static RemoteObject _direcciondestinoemailsrepsol = RemoteObject.createImmutable("");
public static RemoteObject _direccionccdestinoemailsrepsol = RemoteObject.createImmutable("");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
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
public static b4j.docU.cmpermisos _cmpermisos = null;
public static b4j.docU.jamtableviewcamposbuilder _jamtableviewcamposbuilder = null;
public static b4j.docU.httputils2service _httputils2service = null;
public static b4j.docU.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"btnSalir",_ref.getField(false, "_btnsalir"),"BuzonCompartidoEmailEnvioInfoRepsol",_ref.getField(false, "_buzoncompartidoemailenvioinforepsol"),"Cal",_ref.getField(false, "_cal"),"CalcularFechas",_ref.getField(false, "_calcularfechas"),"CarpetaFicherosCSVRepsol",_ref.getField(false, "_carpetaficheroscsvrepsol"),"CarpetaFicherosPDFRepsol",_ref.getField(false, "_carpetaficherospdfrepsol"),"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"Dialog",_ref.getField(false, "_dialog"),"DireccionCCDestinoEmailsRepsol",_ref.getField(false, "_direccionccdestinoemailsrepsol"),"DireccionDestinoEmailsRepsol",_ref.getField(false, "_direcciondestinoemailsrepsol"),"DireccionSeleccionadaRemitenteEmailsRepsol",_ref.getField(false, "_direccionseleccionadaremitenteemailsrepsol"),"frm",_ref.getField(false, "_frm"),"fx",_ref.getField(false, "_fx"),"JamLoadingIndicator1",_ref.getField(false, "_jamloadingindicator1"),"jamTableViewGestionVentas",_ref.getField(false, "_jamtableviewgestionventas"),"Locale",_ref.getField(false, "_locale"),"mSQLGestionventas",_ref.getField(false, "_msqlgestionventas"),"PermisoModuloUsuario",_ref.getField(false, "_permisomodulousuario"),"txtCodigoVendedor",_ref.getField(false, "_txtcodigovendedor"),"txtNombreVendedor",_ref.getField(false, "_txtnombrevendedor"),"xui",_ref.getField(false, "_xui")};
}
}