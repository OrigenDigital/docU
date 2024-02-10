
package b4j.docU;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class cinformesexpedicionesclientes {
    public static RemoteObject myClass;
	public cinformesexpedicionesclientes() {
	}
    public static PCBA staticBA = new PCBA(null, cinformesexpedicionesclientes.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _frm = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _lblversion = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lblprogress = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _msql = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL");
public static RemoteObject _lstdocumentosexpedidos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lstdocumentosexpedidosunicos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lstinfodocumentos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lstvendedores = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lstresponsablescuenta = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lstcontactospedidos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _dialog = RemoteObject.declareNull("b4j.docU.b4xdialog");
public static RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _datetemplate = RemoteObject.declareNull("b4j.docU.b4xdatetemplate");
public static RemoteObject _btnfechafinal = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btnfechainicial = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _lbltitlefechafin = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbltitlefechain = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _pnlfondoinformeexpediciones = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
public static RemoteObject _txtfechainicial = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtfechafinal = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _fechainicial = RemoteObject.createImmutable(0L);
public static RemoteObject _fechafinal = RemoteObject.createImmutable(0L);
public static RemoteObject _btnsalir = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _chkfechaunica = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
public static RemoteObject _fechaunica = RemoteObject.createImmutable(false);
public static RemoteObject _btnactualizarinfo = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _pnlfondodestinatarios = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
public static RemoteObject _tvdestinatarios = RemoteObject.declareNull("anywheresoftware.b4j.objects.TableViewWrapper");
public static RemoteObject _btnseleccionartodoscontactos = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btnseleccionarninguncontacto = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _cargandodatos = RemoteObject.createImmutable(false);
public static RemoteObject _btngenerarinformesemail = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _tipodestinatarioinforme = RemoteObject.createImmutable("");
public static RemoteObject _periodoinforme = RemoteObject.createImmutable("");
public static RemoteObject _lsterrores = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _cbotipoinforme = RemoteObject.declareNull("anywheresoftware.b4j.objects.ComboBoxWrapper");
public static RemoteObject _cargandoitemscbotipoinforme = RemoteObject.createImmutable(false);
public static RemoteObject _lstcamposinformedocumentosexpedidosclientes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lstcamposinformedocumentosexpedidoscomerciales = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lstcamposinformepedidospendientesclientes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lstcamposinformepedidospendientescomerciales = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lbltipoinforme = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _txtemailalternativo = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _lblinfoemailalternativo = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _emproin = RemoteObject.createImmutable("");
public static RemoteObject _emprotec = RemoteObject.createImmutable("");
public static RemoteObject _passwproin = RemoteObject.createImmutable("");
public static RemoteObject _passprotec = RemoteObject.createImmutable("");
public static RemoteObject _btninformeerroresultimoenvio = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _jamcircularprogressbar1 = RemoteObject.declareNull("b4j.docU.jamcircularprogressbar");
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
		return new Object[] {"Base",_ref.getField(false, "_base"),"btnActualizarInfo",_ref.getField(false, "_btnactualizarinfo"),"btnFechaFinal",_ref.getField(false, "_btnfechafinal"),"btnFechaInicial",_ref.getField(false, "_btnfechainicial"),"btnGenerarInformesEmail",_ref.getField(false, "_btngenerarinformesemail"),"btnInformeErroresUltimoEnvio",_ref.getField(false, "_btninformeerroresultimoenvio"),"btnSalir",_ref.getField(false, "_btnsalir"),"btnSeleccionarNingunContacto",_ref.getField(false, "_btnseleccionarninguncontacto"),"btnSeleccionarTodosContactos",_ref.getField(false, "_btnseleccionartodoscontactos"),"CargandoDatos",_ref.getField(false, "_cargandodatos"),"CargandoItemsCboTipoInforme",_ref.getField(false, "_cargandoitemscbotipoinforme"),"cboTipoInforme",_ref.getField(false, "_cbotipoinforme"),"chkFechaUnica",_ref.getField(false, "_chkfechaunica"),"CSSUtils",_ref.getField(false, "_cssutils"),"DateTemplate",_ref.getField(false, "_datetemplate"),"DateUtils",_ref.getField(false, "_dateutils"),"Dialog",_ref.getField(false, "_dialog"),"EmProin",_ref.getField(false, "_emproin"),"EmProtec",_ref.getField(false, "_emprotec"),"FechaFinal",_ref.getField(false, "_fechafinal"),"FechaInicial",_ref.getField(false, "_fechainicial"),"FechaUnica",_ref.getField(false, "_fechaunica"),"frm",_ref.getField(false, "_frm"),"fx",_ref.getField(false, "_fx"),"jamCircularProgressBar1",_ref.getField(false, "_jamcircularprogressbar1"),"jamLoadingIndicator1",_ref.getField(false, "_jamloadingindicator1"),"lblInfoEmailAlternativo",_ref.getField(false, "_lblinfoemailalternativo"),"lblProgress",_ref.getField(false, "_lblprogress"),"lblTipoInforme",_ref.getField(false, "_lbltipoinforme"),"lblTitleFechaFIn",_ref.getField(false, "_lbltitlefechafin"),"lblTitleFechaIn",_ref.getField(false, "_lbltitlefechain"),"lblVersion",_ref.getField(false, "_lblversion"),"lstCamposInformeDocumentosExpedidosClientes",_ref.getField(false, "_lstcamposinformedocumentosexpedidosclientes"),"lstCamposInformeDocumentosExpedidosComerciales",_ref.getField(false, "_lstcamposinformedocumentosexpedidoscomerciales"),"lstCamposInformePedidosPendientesClientes",_ref.getField(false, "_lstcamposinformepedidospendientesclientes"),"lstCamposInformePedidosPendientesComerciales",_ref.getField(false, "_lstcamposinformepedidospendientescomerciales"),"lstContactosPedidos",_ref.getField(false, "_lstcontactospedidos"),"lstDocumentosExpedidos",_ref.getField(false, "_lstdocumentosexpedidos"),"lstDocumentosExpedidosUnicos",_ref.getField(false, "_lstdocumentosexpedidosunicos"),"lstErrores",_ref.getField(false, "_lsterrores"),"lstInfoDocumentos",_ref.getField(false, "_lstinfodocumentos"),"lstResponsablesCuenta",_ref.getField(false, "_lstresponsablescuenta"),"lstVendedores",_ref.getField(false, "_lstvendedores"),"mSQL",_ref.getField(false, "_msql"),"PassProtec",_ref.getField(false, "_passprotec"),"PasswProin",_ref.getField(false, "_passwproin"),"PeriodoInforme",_ref.getField(false, "_periodoinforme"),"pnlFondoDestinatarios",_ref.getField(false, "_pnlfondodestinatarios"),"pnlFondoInformeExpediciones",_ref.getField(false, "_pnlfondoinformeexpediciones"),"TipoDestinatarioInforme",_ref.getField(false, "_tipodestinatarioinforme"),"tvDestinatarios",_ref.getField(false, "_tvdestinatarios"),"txtEmailAlternativo",_ref.getField(false, "_txtemailalternativo"),"txtFechaFinal",_ref.getField(false, "_txtfechafinal"),"txtFechaInicial",_ref.getField(false, "_txtfechainicial"),"xui",_ref.getField(false, "_xui")};
}
}