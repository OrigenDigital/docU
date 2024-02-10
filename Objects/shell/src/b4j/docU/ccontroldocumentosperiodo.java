
package b4j.docU;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class ccontroldocumentosperiodo {
    public static RemoteObject myClass;
	public ccontroldocumentosperiodo() {
	}
    public static PCBA staticBA = new PCBA(null, ccontroldocumentosperiodo.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _frm = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _dialog = RemoteObject.declareNull("b4j.docU.b4xdialog");
public static RemoteObject _msql = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL");
public static RemoteObject _jamtableclv1 = RemoteObject.declareNull("b4j.docU.jamtableclv");
public static RemoteObject _txtalmacendocumento = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtalmacenfisico = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtcliente = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtdiasacum = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtdocumento = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtfase = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtfechadocumento = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtfechafase = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtfechareferencia = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtinfoadicionalfase = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtnombrecliente = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtobservaciones = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtpersonalizado = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtprioridad = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtresponsablefase = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txttipodocumento = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txttotalimp = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txttotalqty = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _timestampbatchfasedocs = RemoteObject.createImmutable(0L);
public static RemoteObject _uuidsesion = RemoteObject.createImmutable("");
public static RemoteObject _txtfechainicial = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _btnselfechainicial = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _txtfechafinal = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _btnselfechafinal = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btngetinfo = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _fechainiciallong = RemoteObject.createImmutable(0L);
public static RemoteObject _fechafinallong = RemoteObject.createImmutable(0L);
public static RemoteObject _txtnumexpedicion = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _btntrazabilidadtransporte = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _jamloadingindicator1 = RemoteObject.declareNull("b4j.docU.jamloadingindicator");
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
		return new Object[] {"btnGetInfo",_ref.getField(false, "_btngetinfo"),"btnSelFechaFinal",_ref.getField(false, "_btnselfechafinal"),"btnSelFechaInicial",_ref.getField(false, "_btnselfechainicial"),"btnTrazabilidadTransporte",_ref.getField(false, "_btntrazabilidadtransporte"),"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"Dialog",_ref.getField(false, "_dialog"),"FechaFinalLong",_ref.getField(false, "_fechafinallong"),"FechaInicialLong",_ref.getField(false, "_fechainiciallong"),"frm",_ref.getField(false, "_frm"),"fx",_ref.getField(false, "_fx"),"JamLoadingIndicator1",_ref.getField(false, "_jamloadingindicator1"),"JamTableCLV1",_ref.getField(false, "_jamtableclv1"),"mSQL",_ref.getField(false, "_msql"),"TimestampBatchFaseDocs",_ref.getField(false, "_timestampbatchfasedocs"),"txtAlmacenDocumento",_ref.getField(false, "_txtalmacendocumento"),"txtAlmacenFisico",_ref.getField(false, "_txtalmacenfisico"),"txtCliente",_ref.getField(false, "_txtcliente"),"txtDiasAcum",_ref.getField(false, "_txtdiasacum"),"txtDocumento",_ref.getField(false, "_txtdocumento"),"txtFase",_ref.getField(false, "_txtfase"),"txtFechaDocumento",_ref.getField(false, "_txtfechadocumento"),"txtFechaFase",_ref.getField(false, "_txtfechafase"),"txtFechaFinal",_ref.getField(false, "_txtfechafinal"),"txtFechaInicial",_ref.getField(false, "_txtfechainicial"),"txtFechaReferencia",_ref.getField(false, "_txtfechareferencia"),"txtInfoAdicionalFase",_ref.getField(false, "_txtinfoadicionalfase"),"txtNombreCliente",_ref.getField(false, "_txtnombrecliente"),"txtNumExpedicion",_ref.getField(false, "_txtnumexpedicion"),"txtObservaciones",_ref.getField(false, "_txtobservaciones"),"txtPersonalizado",_ref.getField(false, "_txtpersonalizado"),"txtPrioridad",_ref.getField(false, "_txtprioridad"),"txtResponsableFase",_ref.getField(false, "_txtresponsablefase"),"txtTipoDocumento",_ref.getField(false, "_txttipodocumento"),"txtTotalImp",_ref.getField(false, "_txttotalimp"),"txtTotalQty",_ref.getField(false, "_txttotalqty"),"UUIDSesion",_ref.getField(false, "_uuidsesion"),"xui",_ref.getField(false, "_xui")};
}
}