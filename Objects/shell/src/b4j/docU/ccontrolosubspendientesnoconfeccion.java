
package b4j.docU;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class ccontrolosubspendientesnoconfeccion {
    public static RemoteObject myClass;
	public ccontrolosubspendientesnoconfeccion() {
	}
    public static PCBA staticBA = new PCBA(null, ccontrolosubspendientesnoconfeccion.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _frm = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _dialog = RemoteObject.declareNull("b4j.docU.b4xdialog");
public static RemoteObject _msql = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL");
public static RemoteObject _jamtableclv1 = RemoteObject.declareNull("b4j.docU.jamtableclv");
public static RemoteObject _timestampbatchfasedocs = RemoteObject.createImmutable(0L);
public static RemoteObject _uuidsesion = RemoteObject.createImmutable("");
public static RemoteObject _primeravisoinfoestablecerprioridad = RemoteObject.createImmutable(false);
public static RemoteObject _btnfasesdoc = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btnmostrardocumentoennavision = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btnselfecharequerida = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btnselprioridad = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _txtareafaseactual = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtarticulo = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtdescripcion = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtfaseactual = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtfechafaseactual = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtfechaof = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtfecharequerida = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtfinalizaproducto = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtinfoadicionalfaseactual = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtnombreproveedor = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtobservaciones = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtosub = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtprioridad = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtproveedor = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtqtypte = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtrequieretransferenciacomponentes = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtruta = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtdiasacumulados = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _fechahoyhora0 = RemoteObject.createImmutable(0L);
public static RemoteObject _txtcliente = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtnombrecliente = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtnombreresponsablecuenta = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
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
		return new Object[] {"btnFasesDoc",_ref.getField(false, "_btnfasesdoc"),"btnMostrarDocumentoEnNavision",_ref.getField(false, "_btnmostrardocumentoennavision"),"btnSelFechaRequerida",_ref.getField(false, "_btnselfecharequerida"),"btnSelPrioridad",_ref.getField(false, "_btnselprioridad"),"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"Dialog",_ref.getField(false, "_dialog"),"FechaHoyHora0",_ref.getField(false, "_fechahoyhora0"),"frm",_ref.getField(false, "_frm"),"fx",_ref.getField(false, "_fx"),"JamTableCLV1",_ref.getField(false, "_jamtableclv1"),"mSQL",_ref.getField(false, "_msql"),"PrimerAvisoInfoEstablecerPrioridad",_ref.getField(false, "_primeravisoinfoestablecerprioridad"),"TimestampBatchFaseDocs",_ref.getField(false, "_timestampbatchfasedocs"),"txtAreaFaseActual",_ref.getField(false, "_txtareafaseactual"),"txtArticulo",_ref.getField(false, "_txtarticulo"),"txtCliente",_ref.getField(false, "_txtcliente"),"txtDescripcion",_ref.getField(false, "_txtdescripcion"),"txtDiasAcumulados",_ref.getField(false, "_txtdiasacumulados"),"txtFaseActual",_ref.getField(false, "_txtfaseactual"),"txtFechaFaseActual",_ref.getField(false, "_txtfechafaseactual"),"txtFechaOF",_ref.getField(false, "_txtfechaof"),"txtFechaRequerida",_ref.getField(false, "_txtfecharequerida"),"txtFinalizaProducto",_ref.getField(false, "_txtfinalizaproducto"),"txtInfoAdicionalFaseActual",_ref.getField(false, "_txtinfoadicionalfaseactual"),"txtNombreCliente",_ref.getField(false, "_txtnombrecliente"),"txtNombreProveedor",_ref.getField(false, "_txtnombreproveedor"),"txtNombreResponsableCuenta",_ref.getField(false, "_txtnombreresponsablecuenta"),"txtObservaciones",_ref.getField(false, "_txtobservaciones"),"txtOSUB",_ref.getField(false, "_txtosub"),"txtPrioridad",_ref.getField(false, "_txtprioridad"),"txtProveedor",_ref.getField(false, "_txtproveedor"),"txtQtyPte",_ref.getField(false, "_txtqtypte"),"txtRequiereTransferenciaComponentes",_ref.getField(false, "_txtrequieretransferenciacomponentes"),"txtRuta",_ref.getField(false, "_txtruta"),"UUIDSesion",_ref.getField(false, "_uuidsesion"),"xui",_ref.getField(false, "_xui")};
}
}