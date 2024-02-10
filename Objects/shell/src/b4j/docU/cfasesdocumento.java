
package b4j.docU;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class cfasesdocumento {
    public static RemoteObject myClass;
	public cfasesdocumento() {
	}
    public static PCBA staticBA = new PCBA(null, cfasesdocumento.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _frm = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mparent = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _background = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _dialog = RemoteObject.declareNull("b4j.docU.b4xdialog");
public static RemoteObject _msql = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL");
public static RemoteObject _mdocumentosel = RemoteObject.createImmutable("");
public static RemoteObject _jamtableclvfasesdoc = RemoteObject.declareNull("b4j.docU.jamtableclv");
public static RemoteObject _btnaccionesfase = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _chkfaseactiva = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
public static RemoteObject _txtfase = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtfechafase = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtinfoadicionalfase = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtnumeroexpedicion = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtobservaciones = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtresponsablefase = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtdocumento = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtfechadocumento = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtareafase = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _destinatariotaller = RemoteObject.createImmutable(false);
public static RemoteObject _osubtaller = RemoteObject.createImmutable("");
public static RemoteObject _lbltitlecodigodestinodoc = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _txtcodigodestinodoc = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _lbltitlenombredestinodoc = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _txtnombredestinodoc = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
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
		return new Object[] {"Background",_ref.getField(false, "_background"),"btnAccionesFase",_ref.getField(false, "_btnaccionesfase"),"chkFaseActiva",_ref.getField(false, "_chkfaseactiva"),"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"DestinatarioTaller",_ref.getField(false, "_destinatariotaller"),"Dialog",_ref.getField(false, "_dialog"),"frm",_ref.getField(false, "_frm"),"fx",_ref.getField(false, "_fx"),"JamLoadingIndicator1",_ref.getField(false, "_jamloadingindicator1"),"JamTableCLVFasesDoc",_ref.getField(false, "_jamtableclvfasesdoc"),"lblTitleCodigoDestinoDoc",_ref.getField(false, "_lbltitlecodigodestinodoc"),"lblTitleNombreDestinoDoc",_ref.getField(false, "_lbltitlenombredestinodoc"),"mCallBack",_ref.getField(false, "_mcallback"),"mDocumentoSel",_ref.getField(false, "_mdocumentosel"),"mParent",_ref.getField(false, "_mparent"),"mSQL",_ref.getField(false, "_msql"),"OSUBTaller",_ref.getField(false, "_osubtaller"),"txtAreaFase",_ref.getField(false, "_txtareafase"),"txtCodigoDestinoDoc",_ref.getField(false, "_txtcodigodestinodoc"),"txtDocumento",_ref.getField(false, "_txtdocumento"),"txtFase",_ref.getField(false, "_txtfase"),"txtFechaDocumento",_ref.getField(false, "_txtfechadocumento"),"txtFechaFase",_ref.getField(false, "_txtfechafase"),"txtInfoAdicionalFase",_ref.getField(false, "_txtinfoadicionalfase"),"txtNombreDestinoDoc",_ref.getField(false, "_txtnombredestinodoc"),"txtNumeroExpedicion",_ref.getField(false, "_txtnumeroexpedicion"),"txtObservaciones",_ref.getField(false, "_txtobservaciones"),"txtResponsableFase",_ref.getField(false, "_txtresponsablefase"),"xui",_ref.getField(false, "_xui")};
}
}