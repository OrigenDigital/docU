package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class cinformesexpedicionesclientes extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cinformesexpedicionesclientes", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.cinformesexpedicionesclientes.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblversion = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblprogress = null;
public anywheresoftware.b4j.objects.SQL _msql = null;
public anywheresoftware.b4a.objects.collections.List _lstdocumentosexpedidos = null;
public anywheresoftware.b4a.objects.collections.List _lstdocumentosexpedidosunicos = null;
public anywheresoftware.b4a.objects.collections.List _lstinfodocumentos = null;
public anywheresoftware.b4a.objects.collections.List _lstvendedores = null;
public anywheresoftware.b4a.objects.collections.List _lstresponsablescuenta = null;
public anywheresoftware.b4a.objects.collections.List _lstcontactospedidos = null;
public b4j.docU.b4xdialog _dialog = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
public b4j.docU.b4xdatetemplate _datetemplate = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnfechafinal = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnfechainicial = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltitlefechafin = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltitlefechain = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pnlfondoinformeexpediciones = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfechainicial = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfechafinal = null;
public long _fechainicial = 0L;
public long _fechafinal = 0L;
public anywheresoftware.b4j.objects.ButtonWrapper _btnsalir = null;
public anywheresoftware.b4j.objects.CheckboxWrapper _chkfechaunica = null;
public boolean _fechaunica = false;
public anywheresoftware.b4j.objects.ButtonWrapper _btnactualizarinfo = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pnlfondodestinatarios = null;
public anywheresoftware.b4j.objects.TableViewWrapper _tvdestinatarios = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnseleccionartodoscontactos = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnseleccionarninguncontacto = null;
public boolean _cargandodatos = false;
public anywheresoftware.b4j.objects.ButtonWrapper _btngenerarinformesemail = null;
public String _tipodestinatarioinforme = "";
public String _periodoinforme = "";
public anywheresoftware.b4a.objects.collections.List _lsterrores = null;
public anywheresoftware.b4j.objects.ComboBoxWrapper _cbotipoinforme = null;
public boolean _cargandoitemscbotipoinforme = false;
public anywheresoftware.b4a.objects.collections.List _lstcamposinformedocumentosexpedidosclientes = null;
public anywheresoftware.b4a.objects.collections.List _lstcamposinformedocumentosexpedidoscomerciales = null;
public anywheresoftware.b4a.objects.collections.List _lstcamposinformepedidospendientesclientes = null;
public anywheresoftware.b4a.objects.collections.List _lstcamposinformepedidospendientescomerciales = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltipoinforme = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtemailalternativo = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblinfoemailalternativo = null;
public String _emproin = "";
public String _emprotec = "";
public String _passwproin = "";
public String _passprotec = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _btninformeerroresultimoenvio = null;
public b4j.docU.jamcircularprogressbar _jamcircularprogressbar1 = null;
public b4j.docU.jamloadingindicator _jamloadingindicator1 = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.dateutils _dateutils = null;
public b4j.docU.main _main = null;
public b4j.docU.mainmenu2 _mainmenu2 = null;
public b4j.docU.utilidades _utilidades = null;
public b4j.docU.cmauxcorreosexpress _cmauxcorreosexpress = null;
public b4j.docU.cmauxtxt _cmauxtxt = null;
public b4j.docU.jrdcquery _jrdcquery = null;
public b4j.docU.dbutils _dbutils = null;
public b4j.docU.transfermode _transfermode = null;
public b4j.docU.jamrecordformbuilder _jamrecordformbuilder = null;
public b4j.docU.b4xcollections _b4xcollections = null;
public b4j.docU.jamlinknavision _jamlinknavision = null;
public b4j.docU.cmpermisos _cmpermisos = null;
public b4j.docU.jamtableviewcamposbuilder _jamtableviewcamposbuilder = null;
public b4j.docU.httputils2service _httputils2service = null;
public b4j.docU.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4j.docU.cinformesexpedicionesclientes __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=89194496;
 //BA.debugLineNum = 89194496;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=89194497;
 //BA.debugLineNum = 89194497;BA.debugLine="mSQL.InitializeSQLite(\"\", \":memory:\", True)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite("",":memory:",__c.True);
RDebugUtils.currentLine=89194498;
 //BA.debugLineNum = 89194498;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.cinformesexpedicionesclientes __ref) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.cinformesexpedicionesclientes parent,b4j.docU.cinformesexpedicionesclientes __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cinformesexpedicionesclientes __ref;
b4j.docU.cinformesexpedicionesclientes parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4a.objects.collections.Map _u = null;
boolean _rbool = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=89456643;
 //BA.debugLineNum = 89456643;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",parent._main._xscreen /*int*/ ,parent._main._yscreen /*int*/ );
RDebugUtils.currentLine=89456644;
 //BA.debugLineNum = 89456644;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=89456645;
 //BA.debugLineNum = 89456645;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=89456646;
 //BA.debugLineNum = 89456646;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=89456647;
 //BA.debugLineNum = 89456647;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=89456648;
 //BA.debugLineNum = 89456648;BA.debugLine="frm.RootPane.LoadLayout(\"scrInformeExpediciones2\"";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrInformeExpediciones2");
RDebugUtils.currentLine=89456649;
 //BA.debugLineNum = 89456649;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "show"),(int) (0));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
RDebugUtils.currentLine=89456651;
 //BA.debugLineNum = 89456651;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._initialize /*String*/ (null,ba,parent,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=89456653;
 //BA.debugLineNum = 89456653;BA.debugLine="frm.Title=Main.PrefijoTitleForms &  \"  \" & \"Exped";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"  "+"Expediciones Expediciones Cliente");
RDebugUtils.currentLine=89456655;
 //BA.debugLineNum = 89456655;BA.debugLine="lblInfoEmailAlternativo.MouseCursor= fx.cursors.H";
__ref._lblinfoemailalternativo /*anywheresoftware.b4j.objects.LabelWrapper*/ .setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.HAND);
RDebugUtils.currentLine=89456671;
 //BA.debugLineNum = 89456671;BA.debugLine="CargandoItemsCboTipoInforme=True";
__ref._cargandoitemscbotipoinforme /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=89456672;
 //BA.debugLineNum = 89456672;BA.debugLine="cboTipoInforme.Value=\"\"";
__ref._cbotipoinforme /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue((Object)(""));
RDebugUtils.currentLine=89456673;
 //BA.debugLineNum = 89456673;BA.debugLine="CargaItemsCbo";
__ref._cargaitemscbo /*String*/ (null);
RDebugUtils.currentLine=89456674;
 //BA.debugLineNum = 89456674;BA.debugLine="Wait For CargaItemsCbo_Completed";
parent.__c.WaitFor("cargaitemscbo_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "show"), null);
this.state = 6;
return;
case 6:
//C
this.state = 1;
;
RDebugUtils.currentLine=89456676;
 //BA.debugLineNum = 89456676;BA.debugLine="CargandoItemsCboTipoInforme=False";
__ref._cargandoitemscbotipoinforme /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=89456678;
 //BA.debugLineNum = 89456678;BA.debugLine="lblTipoInforme.Visible=False";
__ref._lbltipoinforme /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=89456679;
 //BA.debugLineNum = 89456679;BA.debugLine="cboTipoInforme.Visible=False";
__ref._cbotipoinforme /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=89456780;
 //BA.debugLineNum = 89456780;BA.debugLine="DBUtils.DropTable(mSQL,\"tblDestinatarios\")";
parent._dbutils._droptable /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblDestinatarios");
RDebugUtils.currentLine=89456781;
 //BA.debugLineNum = 89456781;BA.debugLine="Dim u As Map";
_u = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=89456782;
 //BA.debugLineNum = 89456782;BA.debugLine="u.Initialize";
_u.Initialize();
RDebugUtils.currentLine=89456783;
 //BA.debugLineNum = 89456783;BA.debugLine="u.Put(\"ClienteProtec\",DBUtils.DB_INTEGER)";
_u.Put((Object)("ClienteProtec"),(Object)(parent._dbutils._db_integer /*String*/ ));
RDebugUtils.currentLine=89456784;
 //BA.debugLineNum = 89456784;BA.debugLine="u.Put(\"Tipo\",DBUtils.DB_TEXT)";
_u.Put((Object)("Tipo"),(Object)(parent._dbutils._db_text /*String*/ ));
RDebugUtils.currentLine=89456785;
 //BA.debugLineNum = 89456785;BA.debugLine="u.Put(\"Codigo\",DBUtils.DB_TEXT)";
_u.Put((Object)("Codigo"),(Object)(parent._dbutils._db_text /*String*/ ));
RDebugUtils.currentLine=89456786;
 //BA.debugLineNum = 89456786;BA.debugLine="u.Put(\"Nombre\",DBUtils.DB_TEXT)";
_u.Put((Object)("Nombre"),(Object)(parent._dbutils._db_text /*String*/ ));
RDebugUtils.currentLine=89456787;
 //BA.debugLineNum = 89456787;BA.debugLine="u.Put(\"Email\",DBUtils.DB_TEXT)";
_u.Put((Object)("Email"),(Object)(parent._dbutils._db_text /*String*/ ));
RDebugUtils.currentLine=89456788;
 //BA.debugLineNum = 89456788;BA.debugLine="u.Put(\"Cliente\",DBUtils.DB_TEXT)";
_u.Put((Object)("Cliente"),(Object)(parent._dbutils._db_text /*String*/ ));
RDebugUtils.currentLine=89456789;
 //BA.debugLineNum = 89456789;BA.debugLine="u.Put(\"NombreCliente\",DBUtils.DB_TEXT)";
_u.Put((Object)("NombreCliente"),(Object)(parent._dbutils._db_text /*String*/ ));
RDebugUtils.currentLine=89456790;
 //BA.debugLineNum = 89456790;BA.debugLine="u.Put(\"NombreResponsableCuenta\",DBUtils.DB_TEXT)";
_u.Put((Object)("NombreResponsableCuenta"),(Object)(parent._dbutils._db_text /*String*/ ));
RDebugUtils.currentLine=89456791;
 //BA.debugLineNum = 89456791;BA.debugLine="u.Put(\"Seleccionado\",DBUtils.DB_INTEGER)";
_u.Put((Object)("Seleccionado"),(Object)(parent._dbutils._db_integer /*String*/ ));
RDebugUtils.currentLine=89456793;
 //BA.debugLineNum = 89456793;BA.debugLine="u.Put(\"EnviadoEmail\",DBUtils.DB_INTEGER)";
_u.Put((Object)("EnviadoEmail"),(Object)(parent._dbutils._db_integer /*String*/ ));
RDebugUtils.currentLine=89456795;
 //BA.debugLineNum = 89456795;BA.debugLine="DBUtils.CreateTable(mSQL,\"tblDestinatarios\",u,\"\")";
parent._dbutils._createtable /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblDestinatarios",_u,"");
RDebugUtils.currentLine=89456800;
 //BA.debugLineNum = 89456800;BA.debugLine="tvDestinatarios.SetColumns(Array As String(\"Selec";
__ref._tvdestinatarios /*anywheresoftware.b4j.objects.TableViewWrapper*/ .SetColumns(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Seleccionado","Nombre","Email","Email Enviado"}));
RDebugUtils.currentLine=89456803;
 //BA.debugLineNum = 89456803;BA.debugLine="tvDestinatarios.SetColumnWidth(0,100)";
__ref._tvdestinatarios /*anywheresoftware.b4j.objects.TableViewWrapper*/ .SetColumnWidth((int) (0),100);
RDebugUtils.currentLine=89456804;
 //BA.debugLineNum = 89456804;BA.debugLine="tvDestinatarios.SetColumnWidth(1,200)";
__ref._tvdestinatarios /*anywheresoftware.b4j.objects.TableViewWrapper*/ .SetColumnWidth((int) (1),200);
RDebugUtils.currentLine=89456805;
 //BA.debugLineNum = 89456805;BA.debugLine="tvDestinatarios.SetColumnWidth(2,420)";
__ref._tvdestinatarios /*anywheresoftware.b4j.objects.TableViewWrapper*/ .SetColumnWidth((int) (2),420);
RDebugUtils.currentLine=89456806;
 //BA.debugLineNum = 89456806;BA.debugLine="tvDestinatarios.SetColumnWidth(3,100)";
__ref._tvdestinatarios /*anywheresoftware.b4j.objects.TableViewWrapper*/ .SetColumnWidth((int) (3),100);
RDebugUtils.currentLine=89456810;
 //BA.debugLineNum = 89456810;BA.debugLine="lstCamposInformeDocumentosExpedidosClientes.Initi";
__ref._lstcamposinformedocumentosexpedidosclientes /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=89456811;
 //BA.debugLineNum = 89456811;BA.debugLine="lstCamposInformeDocumentosExpedidosClientes.AddAl";
__ref._lstcamposinformedocumentosexpedidosclientes /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Documento","FechaDocumento","Pedido","PedidoCliente","NombreCliente","Ciudad","NombreResponsableCuenta","EmailResponsableCuenta","Articulo","Descripcion","Talla","Cantidad","UM"}));
RDebugUtils.currentLine=89456814;
 //BA.debugLineNum = 89456814;BA.debugLine="lstCamposInformePedidosPendientesClientes.Initial";
__ref._lstcamposinformepedidospendientesclientes /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=89456815;
 //BA.debugLineNum = 89456815;BA.debugLine="lstCamposInformePedidosPendientesClientes.AddAll(";
__ref._lstcamposinformepedidospendientesclientes /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Pedido","FechaPedido","Pedido","PedidoCliente","NombreCliente","Ciudad","NombreResponsableCuenta","EmailResponsableCuenta","Articulo","Descripcion","Talla","Cantidad","UM"}));
RDebugUtils.currentLine=89456818;
 //BA.debugLineNum = 89456818;BA.debugLine="lstCamposInformeDocumentosExpedidosComerciales.In";
__ref._lstcamposinformedocumentosexpedidoscomerciales /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=89456819;
 //BA.debugLineNum = 89456819;BA.debugLine="lstCamposInformeDocumentosExpedidosComerciales.Ad";
__ref._lstcamposinformedocumentosexpedidoscomerciales /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Documento","Fecha","PedidoCliente","NombreCliente","NombreDireccionEnvio","Ciudad","NombreResponsableCuenta","EmailResponsableCuenta","Articulo","Descripcion","Talla","Cantidad","UM"}));
RDebugUtils.currentLine=89456822;
 //BA.debugLineNum = 89456822;BA.debugLine="lstCamposInformePedidosPendientesComerciales.Init";
__ref._lstcamposinformepedidospendientescomerciales /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=89456823;
 //BA.debugLineNum = 89456823;BA.debugLine="lstCamposInformePedidosPendientesComerciales.AddA";
__ref._lstcamposinformepedidospendientescomerciales /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Documento","FechaDocumento","NombreCliente","PedidoCliente","Ciudad","NombreResponsableCuenta","EmailResponsableCuenta","Articulo","Descripcion","Talla","CantidadPte","UM"}));
RDebugUtils.currentLine=89456826;
 //BA.debugLineNum = 89456826;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=89456827;
 //BA.debugLineNum = 89456827;BA.debugLine="chkFechaUnica.Checked=True";
__ref._chkfechaunica /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(parent.__c.True);
RDebugUtils.currentLine=89456828;
 //BA.debugLineNum = 89456828;BA.debugLine="Base = frm.RootPane";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject()));
RDebugUtils.currentLine=89456829;
 //BA.debugLineNum = 89456829;BA.debugLine="Dialog.Initialize (Base)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=89456830;
 //BA.debugLineNum = 89456830;BA.debugLine="Dialog.BlurBackground=False";
__ref._dialog /*b4j.docU.b4xdialog*/ ._blurbackground /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=89456832;
 //BA.debugLineNum = 89456832;BA.debugLine="Dialog.Title = \"Fechas Informe\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Fechas Informe");
RDebugUtils.currentLine=89456835;
 //BA.debugLineNum = 89456835;BA.debugLine="InicializarCalendario";
__ref._inicializarcalendario /*String*/ (null);
RDebugUtils.currentLine=89456836;
 //BA.debugLineNum = 89456836;BA.debugLine="pnlFondoDestinatarios.Visible=False";
__ref._pnlfondodestinatarios /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=89456839;
 //BA.debugLineNum = 89456839;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=89456841;
 //BA.debugLineNum = 89456841;BA.debugLine="wait for (LoadCred) complete (rBool As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "show"), __ref._loadcred /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=89456842;
 //BA.debugLineNum = 89456842;BA.debugLine="If rBool=False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_rbool==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=89456845;
 //BA.debugLineNum = 89456845;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=89456850;
 //BA.debugLineNum = 89456850;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizarlistacontactos(b4j.docU.cinformesexpedicionesclientes __ref) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "actualizarlistacontactos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizarlistacontactos", null));}
ResumableSub_ActualizarListaContactos rsub = new ResumableSub_ActualizarListaContactos(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarListaContactos extends BA.ResumableSub {
public ResumableSub_ActualizarListaContactos(b4j.docU.cinformesexpedicionesclientes parent,b4j.docU.cinformesexpedicionesclientes __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cinformesexpedicionesclientes __ref;
b4j.docU.cinformesexpedicionesclientes parent;
int _i = 0;
b4j.docU.main._contactocliente _ccli = null;
Object _senderfilter = null;
boolean _success = false;
b4j.docU.main._vendedor _cvend = null;
int step5;
int limit5;
int step13;
int limit13;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=90701826;
 //BA.debugLineNum = 90701826;BA.debugLine="tvDestinatarios.Items.Clear";
__ref._tvdestinatarios /*anywheresoftware.b4j.objects.TableViewWrapper*/ .getItems().Clear();
RDebugUtils.currentLine=90701827;
 //BA.debugLineNum = 90701827;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblDestinatarios\")";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblDestinatarios");
RDebugUtils.currentLine=90701828;
 //BA.debugLineNum = 90701828;BA.debugLine="Select True";
if (true) break;

case 1:
//select
this.state = 14;
switch (BA.switchObjectToInt(parent.__c.True,(__ref._tipodestinatarioinforme /*String*/ ).equals("Clientes"),(__ref._tipodestinatarioinforme /*String*/ ).equals("Comerciales"))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 9;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=90701830;
 //BA.debugLineNum = 90701830;BA.debugLine="For i=0 To lstContactosPedidos.Size-1";
if (true) break;

case 4:
//for
this.state = 7;
step5 = 1;
limit5 = (int) (__ref._lstcontactospedidos /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
this.state = 15;
if (true) break;

case 15:
//C
this.state = 7;
if ((step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5)) this.state = 6;
if (true) break;

case 16:
//C
this.state = 15;
_i = ((int)(0 + _i + step5)) ;
if (true) break;

case 6:
//C
this.state = 16;
RDebugUtils.currentLine=90701831;
 //BA.debugLineNum = 90701831;BA.debugLine="Dim cCli As ContactoCliente=lstContactosPedido";
_ccli = (b4j.docU.main._contactocliente)(__ref._lstcontactospedidos /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=90701832;
 //BA.debugLineNum = 90701832;BA.debugLine="mSQL.AddNonQueryToBatch(\"insert into tblDestin";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch("insert into tblDestinatarios (ClienteProtec,Tipo, Codigo, Nombre, Email, Seleccionado, EnviadoEmail, Cliente, NombreCliente, NombreResponsableCuenta) values (?,?,?,?,?,?,?,?,?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_ccli.ClienteProtec /*int*/ ),(Object)("Cliente"),(Object)(_ccli.Codigo /*String*/ ),(Object)(_ccli.Nombre /*String*/ ),(Object)(_ccli.Email /*String*/ ),(Object)(_ccli.Seleccionado /*boolean*/ ),(Object)(0),(Object)(_ccli.Cliente /*String*/ ),(Object)(_ccli.NombreCliente /*String*/ ),(Object)(_ccli.NombreResponsableCuenta /*String*/ )}));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 14;
;
RDebugUtils.currentLine=90701836;
 //BA.debugLineNum = 90701836;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryB";
_senderfilter = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=90701837;
 //BA.debugLineNum = 90701837;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (S";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "actualizarlistacontactos"), _senderfilter);
this.state = 17;
return;
case 17:
//C
this.state = 14;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=90701838;
 //BA.debugLineNum = 90701838;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("890701838","NonQuery: "+BA.ObjectToString(_success),0);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=90701841;
 //BA.debugLineNum = 90701841;BA.debugLine="For i=0 To lstVendedores.Size-1";
if (true) break;

case 10:
//for
this.state = 13;
step13 = 1;
limit13 = (int) (__ref._lstvendedores /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
this.state = 18;
if (true) break;

case 18:
//C
this.state = 13;
if ((step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13)) this.state = 12;
if (true) break;

case 19:
//C
this.state = 18;
_i = ((int)(0 + _i + step13)) ;
if (true) break;

case 12:
//C
this.state = 19;
RDebugUtils.currentLine=90701842;
 //BA.debugLineNum = 90701842;BA.debugLine="Dim cVend As Vendedor=lstVendedores.Get(i)";
_cvend = (b4j.docU.main._vendedor)(__ref._lstvendedores /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=90701843;
 //BA.debugLineNum = 90701843;BA.debugLine="mSQL.AddNonQueryToBatch(\"insert into tblDestin";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch("insert into tblDestinatarios (ClienteProtec,Tipo, Codigo, Nombre, Email, Seleccionado, EnviadoEmail, Cliente, NombreCliente, NombreResponsableCuenta) values (?,?,?,?,?,?,?,?,?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(0),(Object)("Comercial"),(Object)(_cvend.Codigo /*String*/ ),(Object)(_cvend.Nombre /*String*/ ),(Object)(_cvend.Email /*String*/ ),(Object)(_cvend.Seleccionado /*boolean*/ ),(Object)(0),(Object)(""),(Object)(""),(Object)("")}));
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=90701847;
 //BA.debugLineNum = 90701847;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryB";
_senderfilter = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=90701848;
 //BA.debugLineNum = 90701848;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (S";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "actualizarlistacontactos"), _senderfilter);
this.state = 20;
return;
case 20:
//C
this.state = 14;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=90701849;
 //BA.debugLineNum = 90701849;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("890701849","NonQuery: "+BA.ObjectToString(_success),0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=90701851;
 //BA.debugLineNum = 90701851;BA.debugLine="CargandoDatos=True";
__ref._cargandodatos /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=90701852;
 //BA.debugLineNum = 90701852;BA.debugLine="ActualizarTableViewDestinatarios";
__ref._actualizartableviewdestinatarios /*void*/ (null);
RDebugUtils.currentLine=90701853;
 //BA.debugLineNum = 90701853;BA.debugLine="Wait For ActualizarTableViewDestinatarios_Complet";
parent.__c.WaitFor("actualizartableviewdestinatarios_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "actualizarlistacontactos"), null);
this.state = 21;
return;
case 21:
//C
this.state = -1;
;
RDebugUtils.currentLine=90701854;
 //BA.debugLineNum = 90701854;BA.debugLine="CargandoDatos=False";
__ref._cargandodatos /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=90701855;
 //BA.debugLineNum = 90701855;BA.debugLine="pnlFondoDestinatarios.Visible=True";
__ref._pnlfondodestinatarios /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/ .setVisible(parent.__c.True);
RDebugUtils.currentLine=90701856;
 //BA.debugLineNum = 90701856;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=90701857;
 //BA.debugLineNum = 90701857;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _actualizartableviewdestinatarios(b4j.docU.cinformesexpedicionesclientes __ref) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "actualizartableviewdestinatarios", false))
	 {Debug.delegate(ba, "actualizartableviewdestinatarios", null); return;}
ResumableSub_ActualizarTableViewDestinatarios rsub = new ResumableSub_ActualizarTableViewDestinatarios(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ActualizarTableViewDestinatarios extends BA.ResumableSub {
public ResumableSub_ActualizarTableViewDestinatarios(b4j.docU.cinformesexpedicionesclientes parent,b4j.docU.cinformesexpedicionesclientes __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cinformesexpedicionesclientes __ref;
b4j.docU.cinformesexpedicionesclientes parent;
int _ridx = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
Object[] _row = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=90767361;
 //BA.debugLineNum = 90767361;BA.debugLine="tvDestinatarios.Items.Clear";
__ref._tvdestinatarios /*anywheresoftware.b4j.objects.TableViewWrapper*/ .getItems().Clear();
RDebugUtils.currentLine=90767362;
 //BA.debugLineNum = 90767362;BA.debugLine="Dim rIDx As Int";
_ridx = 0;
RDebugUtils.currentLine=90767363;
 //BA.debugLineNum = 90767363;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblDestinatarios");
RDebugUtils.currentLine=90767364;
 //BA.debugLineNum = 90767364;BA.debugLine="Do While rs.NextRow";
if (true) break;

case 1:
//do while
this.state = 4;
while (_rs.NextRow()) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
RDebugUtils.currentLine=90767365;
 //BA.debugLineNum = 90767365;BA.debugLine="Dim Row() As Object=CrearFila(rIDx,rs.GetString(";
_row = __ref._crearfila /*Object[]*/ (null,_ridx,_rs.GetString("Codigo"),_rs.GetString("Nombre"),_rs.GetString("Email"),_rs.GetInt("Seleccionado"),_rs.GetInt("EnviadoEmail"));
RDebugUtils.currentLine=90767367;
 //BA.debugLineNum = 90767367;BA.debugLine="rIDx=rIDx+1";
_ridx = (int) (_ridx+1);
RDebugUtils.currentLine=90767368;
 //BA.debugLineNum = 90767368;BA.debugLine="tvDestinatarios.Items.Add(Row)";
__ref._tvdestinatarios /*anywheresoftware.b4j.objects.TableViewWrapper*/ .getItems().Add((Object)(_row));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=90767370;
 //BA.debugLineNum = 90767370;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=90767371;
 //BA.debugLineNum = 90767371;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "actualizartableviewdestinatarios"),(int) (0));
this.state = 5;
return;
case 5:
//C
this.state = -1;
;
RDebugUtils.currentLine=90767372;
 //BA.debugLineNum = 90767372;BA.debugLine="CallSubDelayed(Me,\"ActualizarTableViewDestinatari";
parent.__c.CallSubDelayed(ba,parent,"ActualizarTableViewDestinatarios_Completed");
RDebugUtils.currentLine=90767373;
 //BA.debugLineNum = 90767373;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object[]  _crearfila(b4j.docU.cinformesexpedicionesclientes __ref,int _rowindex,String _codigo,String _nombre,String _email,int _sel,int _envemail) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "crearfila", false))
	 {return ((Object[]) Debug.delegate(ba, "crearfila", new Object[] {_rowindex,_codigo,_nombre,_email,_sel,_envemail}));}
Object[] _fila = null;
anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper _ap = null;
b4j.docU.main._cellindex _ci = null;
anywheresoftware.b4j.objects.CheckboxWrapper _chbsel = null;
anywheresoftware.b4j.object.JavaObject _jo1 = null;
anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnombre = null;
anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtemail = null;
anywheresoftware.b4j.objects.CheckboxWrapper _chbenviado = null;
RDebugUtils.currentLine=90832896;
 //BA.debugLineNum = 90832896;BA.debugLine="Sub CrearFila(RowIndex As Int, Codigo As String, N";
RDebugUtils.currentLine=90832897;
 //BA.debugLineNum = 90832897;BA.debugLine="Dim Fila(4) As Object";
_fila = new Object[(int) (4)];
{
int d0 = _fila.length;
for (int i0 = 0;i0 < d0;i0++) {
_fila[i0] = new Object();
}
}
;
RDebugUtils.currentLine=90832899;
 //BA.debugLineNum = 90832899;BA.debugLine="Dim ap As AnchorPane";
_ap = new anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper();
RDebugUtils.currentLine=90832900;
 //BA.debugLineNum = 90832900;BA.debugLine="ap.Initialize(\"\")";
_ap.Initialize(ba,"");
RDebugUtils.currentLine=90832901;
 //BA.debugLineNum = 90832901;BA.debugLine="Dim ci As CellIndex";
_ci = new b4j.docU.main._cellindex();
RDebugUtils.currentLine=90832902;
 //BA.debugLineNum = 90832902;BA.debugLine="ci.Initialize";
_ci.Initialize();
RDebugUtils.currentLine=90832903;
 //BA.debugLineNum = 90832903;BA.debugLine="ci.Column=0";
_ci.Column /*int*/  = (int) (0);
RDebugUtils.currentLine=90832904;
 //BA.debugLineNum = 90832904;BA.debugLine="ci.Row=RowIndex";
_ci.Row /*int*/  = _rowindex;
RDebugUtils.currentLine=90832905;
 //BA.debugLineNum = 90832905;BA.debugLine="Dim chbSel As CheckBox";
_chbsel = new anywheresoftware.b4j.objects.CheckboxWrapper();
RDebugUtils.currentLine=90832906;
 //BA.debugLineNum = 90832906;BA.debugLine="chbSel.Initialize(\"chbSel\")";
_chbsel.Initialize(ba,"chbSel");
RDebugUtils.currentLine=90832907;
 //BA.debugLineNum = 90832907;BA.debugLine="chbSel.Tag=ci";
_chbsel.setTag((Object)(_ci));
RDebugUtils.currentLine=90832914;
 //BA.debugLineNum = 90832914;BA.debugLine="CSSUtils.SetStyleProperty(chbSel,\"-fx-text-fill\",";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_chbsel.getObject())),"-fx-text-fill","red");
RDebugUtils.currentLine=90832915;
 //BA.debugLineNum = 90832915;BA.debugLine="chbSel.Visible=True";
_chbsel.setVisible(__c.True);
RDebugUtils.currentLine=90832916;
 //BA.debugLineNum = 90832916;BA.debugLine="If Sel=0 Then";
if (_sel==0) { 
RDebugUtils.currentLine=90832917;
 //BA.debugLineNum = 90832917;BA.debugLine="chbSel.Checked=False";
_chbsel.setChecked(__c.False);
 }else {
RDebugUtils.currentLine=90832919;
 //BA.debugLineNum = 90832919;BA.debugLine="chbSel.Checked=True";
_chbsel.setChecked(__c.True);
 };
RDebugUtils.currentLine=90832921;
 //BA.debugLineNum = 90832921;BA.debugLine="ap.AddNode(chbSel,0,0,-1,-1)";
_ap.AddNode((javafx.scene.Node)(_chbsel.getObject()),0,0,-1,-1);
RDebugUtils.currentLine=90832922;
 //BA.debugLineNum = 90832922;BA.debugLine="Dim jo1 = chbSel As JavaObject";
_jo1 = new anywheresoftware.b4j.object.JavaObject();
_jo1 = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_chbsel.getObject()));
RDebugUtils.currentLine=90832923;
 //BA.debugLineNum = 90832923;BA.debugLine="jo1.RunMethod(\"setAlignment\", Array As Object(\"CE";
_jo1.RunMethod("setAlignment",new Object[]{(Object)("CENTER")});
RDebugUtils.currentLine=90832924;
 //BA.debugLineNum = 90832924;BA.debugLine="ap.FillHorizontally(chbSel, 0, 0)";
_ap.FillHorizontally((javafx.scene.Node)(_chbsel.getObject()),0,0);
RDebugUtils.currentLine=90832925;
 //BA.debugLineNum = 90832925;BA.debugLine="Fila(0)=ap";
_fila[(int) (0)] = (Object)(_ap.getObject());
RDebugUtils.currentLine=90832927;
 //BA.debugLineNum = 90832927;BA.debugLine="Dim ap As AnchorPane";
_ap = new anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper();
RDebugUtils.currentLine=90832928;
 //BA.debugLineNum = 90832928;BA.debugLine="ap.Initialize(\"\")";
_ap.Initialize(ba,"");
RDebugUtils.currentLine=90832929;
 //BA.debugLineNum = 90832929;BA.debugLine="ap.Tag=Codigo";
_ap.setTag((Object)(_codigo));
RDebugUtils.currentLine=90832930;
 //BA.debugLineNum = 90832930;BA.debugLine="Dim ci As CellIndex";
_ci = new b4j.docU.main._cellindex();
RDebugUtils.currentLine=90832931;
 //BA.debugLineNum = 90832931;BA.debugLine="ci.Initialize";
_ci.Initialize();
RDebugUtils.currentLine=90832932;
 //BA.debugLineNum = 90832932;BA.debugLine="ci.Column=0";
_ci.Column /*int*/  = (int) (0);
RDebugUtils.currentLine=90832933;
 //BA.debugLineNum = 90832933;BA.debugLine="ci.Row=RowIndex";
_ci.Row /*int*/  = _rowindex;
RDebugUtils.currentLine=90832934;
 //BA.debugLineNum = 90832934;BA.debugLine="Dim txtNombre As TextField";
_txtnombre = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=90832935;
 //BA.debugLineNum = 90832935;BA.debugLine="txtNombre.Initialize(\"\")";
_txtnombre.Initialize(ba,"");
RDebugUtils.currentLine=90832936;
 //BA.debugLineNum = 90832936;BA.debugLine="txtNombre.Text=Nombre";
_txtnombre.setText(_nombre);
RDebugUtils.currentLine=90832937;
 //BA.debugLineNum = 90832937;BA.debugLine="txtNombre.Tag=ci";
_txtnombre.setTag((Object)(_ci));
RDebugUtils.currentLine=90832938;
 //BA.debugLineNum = 90832938;BA.debugLine="txtNombre.Editable=False";
_txtnombre.setEditable(__c.False);
RDebugUtils.currentLine=90832939;
 //BA.debugLineNum = 90832939;BA.debugLine="ap.AddNode(txtNombre,0,0,-1,-1)";
_ap.AddNode((javafx.scene.Node)(_txtnombre.getObject()),0,0,-1,-1);
RDebugUtils.currentLine=90832940;
 //BA.debugLineNum = 90832940;BA.debugLine="ap.FillHorizontally(txtNombre, 0, 0)";
_ap.FillHorizontally((javafx.scene.Node)(_txtnombre.getObject()),0,0);
RDebugUtils.currentLine=90832941;
 //BA.debugLineNum = 90832941;BA.debugLine="Dim jo1 = txtNombre As JavaObject";
_jo1 = new anywheresoftware.b4j.object.JavaObject();
_jo1 = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_txtnombre.getObject()));
RDebugUtils.currentLine=90832942;
 //BA.debugLineNum = 90832942;BA.debugLine="jo1.RunMethod(\"setAlignment\", Array As Object(\"BA";
_jo1.RunMethod("setAlignment",new Object[]{(Object)("BASELINE_LEFT")});
RDebugUtils.currentLine=90832943;
 //BA.debugLineNum = 90832943;BA.debugLine="Fila(1)=ap";
_fila[(int) (1)] = (Object)(_ap.getObject());
RDebugUtils.currentLine=90832945;
 //BA.debugLineNum = 90832945;BA.debugLine="Dim ap As AnchorPane";
_ap = new anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper();
RDebugUtils.currentLine=90832946;
 //BA.debugLineNum = 90832946;BA.debugLine="ap.Initialize(\"\")";
_ap.Initialize(ba,"");
RDebugUtils.currentLine=90832947;
 //BA.debugLineNum = 90832947;BA.debugLine="ap.Tag=Codigo";
_ap.setTag((Object)(_codigo));
RDebugUtils.currentLine=90832948;
 //BA.debugLineNum = 90832948;BA.debugLine="Dim ci As CellIndex";
_ci = new b4j.docU.main._cellindex();
RDebugUtils.currentLine=90832949;
 //BA.debugLineNum = 90832949;BA.debugLine="ci.Initialize";
_ci.Initialize();
RDebugUtils.currentLine=90832950;
 //BA.debugLineNum = 90832950;BA.debugLine="ci.Column=0";
_ci.Column /*int*/  = (int) (0);
RDebugUtils.currentLine=90832951;
 //BA.debugLineNum = 90832951;BA.debugLine="ci.Row=RowIndex";
_ci.Row /*int*/  = _rowindex;
RDebugUtils.currentLine=90832952;
 //BA.debugLineNum = 90832952;BA.debugLine="Dim txtEmail As TextField";
_txtemail = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=90832953;
 //BA.debugLineNum = 90832953;BA.debugLine="txtEmail.Initialize(\"\")";
_txtemail.Initialize(ba,"");
RDebugUtils.currentLine=90832954;
 //BA.debugLineNum = 90832954;BA.debugLine="txtEmail.Text=Email";
_txtemail.setText(_email);
RDebugUtils.currentLine=90832955;
 //BA.debugLineNum = 90832955;BA.debugLine="txtEmail.Tag=ci";
_txtemail.setTag((Object)(_ci));
RDebugUtils.currentLine=90832956;
 //BA.debugLineNum = 90832956;BA.debugLine="txtEmail.Editable=False";
_txtemail.setEditable(__c.False);
RDebugUtils.currentLine=90832957;
 //BA.debugLineNum = 90832957;BA.debugLine="ap.AddNode(txtEmail,0,0,-1,-1)";
_ap.AddNode((javafx.scene.Node)(_txtemail.getObject()),0,0,-1,-1);
RDebugUtils.currentLine=90832958;
 //BA.debugLineNum = 90832958;BA.debugLine="ap.FillHorizontally(txtEmail, 0, 0)";
_ap.FillHorizontally((javafx.scene.Node)(_txtemail.getObject()),0,0);
RDebugUtils.currentLine=90832959;
 //BA.debugLineNum = 90832959;BA.debugLine="Dim jo1 = txtEmail As JavaObject";
_jo1 = new anywheresoftware.b4j.object.JavaObject();
_jo1 = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_txtemail.getObject()));
RDebugUtils.currentLine=90832960;
 //BA.debugLineNum = 90832960;BA.debugLine="jo1.RunMethod(\"setAlignment\", Array As Object(\"BA";
_jo1.RunMethod("setAlignment",new Object[]{(Object)("BASELINE_LEFT")});
RDebugUtils.currentLine=90832961;
 //BA.debugLineNum = 90832961;BA.debugLine="Fila(2)=ap";
_fila[(int) (2)] = (Object)(_ap.getObject());
RDebugUtils.currentLine=90832982;
 //BA.debugLineNum = 90832982;BA.debugLine="Dim ap As AnchorPane";
_ap = new anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper();
RDebugUtils.currentLine=90832983;
 //BA.debugLineNum = 90832983;BA.debugLine="ap.Initialize(\"\")";
_ap.Initialize(ba,"");
RDebugUtils.currentLine=90832984;
 //BA.debugLineNum = 90832984;BA.debugLine="Dim ci As CellIndex";
_ci = new b4j.docU.main._cellindex();
RDebugUtils.currentLine=90832985;
 //BA.debugLineNum = 90832985;BA.debugLine="ci.Initialize";
_ci.Initialize();
RDebugUtils.currentLine=90832986;
 //BA.debugLineNum = 90832986;BA.debugLine="ci.Column=0";
_ci.Column /*int*/  = (int) (0);
RDebugUtils.currentLine=90832987;
 //BA.debugLineNum = 90832987;BA.debugLine="ci.Row=RowIndex";
_ci.Row /*int*/  = _rowindex;
RDebugUtils.currentLine=90832988;
 //BA.debugLineNum = 90832988;BA.debugLine="Dim chbEnviado As CheckBox";
_chbenviado = new anywheresoftware.b4j.objects.CheckboxWrapper();
RDebugUtils.currentLine=90832989;
 //BA.debugLineNum = 90832989;BA.debugLine="chbEnviado.Initialize(\"\")";
_chbenviado.Initialize(ba,"");
RDebugUtils.currentLine=90832990;
 //BA.debugLineNum = 90832990;BA.debugLine="chbEnviado.Tag=ci";
_chbenviado.setTag((Object)(_ci));
RDebugUtils.currentLine=90832991;
 //BA.debugLineNum = 90832991;BA.debugLine="CSSUtils.SetStyleProperty(chbEnviado,\"-fx-text-fi";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_chbenviado.getObject())),"-fx-text-fill","green");
RDebugUtils.currentLine=90832992;
 //BA.debugLineNum = 90832992;BA.debugLine="chbEnviado.Visible=True";
_chbenviado.setVisible(__c.True);
RDebugUtils.currentLine=90832993;
 //BA.debugLineNum = 90832993;BA.debugLine="If EnvEmail=0 Then";
if (_envemail==0) { 
RDebugUtils.currentLine=90832994;
 //BA.debugLineNum = 90832994;BA.debugLine="chbEnviado.Checked=False";
_chbenviado.setChecked(__c.False);
 }else {
RDebugUtils.currentLine=90832996;
 //BA.debugLineNum = 90832996;BA.debugLine="chbEnviado.Checked=True";
_chbenviado.setChecked(__c.True);
 };
RDebugUtils.currentLine=90832998;
 //BA.debugLineNum = 90832998;BA.debugLine="chbEnviado.Enabled=False";
_chbenviado.setEnabled(__c.False);
RDebugUtils.currentLine=90832999;
 //BA.debugLineNum = 90832999;BA.debugLine="ap.AddNode(chbEnviado,0,0,-1,-1)";
_ap.AddNode((javafx.scene.Node)(_chbenviado.getObject()),0,0,-1,-1);
RDebugUtils.currentLine=90833000;
 //BA.debugLineNum = 90833000;BA.debugLine="Dim jo1 = chbEnviado As JavaObject";
_jo1 = new anywheresoftware.b4j.object.JavaObject();
_jo1 = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_chbenviado.getObject()));
RDebugUtils.currentLine=90833001;
 //BA.debugLineNum = 90833001;BA.debugLine="jo1.RunMethod(\"setAlignment\", Array As Object(\"CE";
_jo1.RunMethod("setAlignment",new Object[]{(Object)("CENTER")});
RDebugUtils.currentLine=90833002;
 //BA.debugLineNum = 90833002;BA.debugLine="ap.FillHorizontally(chbEnviado, 0, 0)";
_ap.FillHorizontally((javafx.scene.Node)(_chbenviado.getObject()),0,0);
RDebugUtils.currentLine=90833003;
 //BA.debugLineNum = 90833003;BA.debugLine="Fila(3)=ap";
_fila[(int) (3)] = (Object)(_ap.getObject());
RDebugUtils.currentLine=90833005;
 //BA.debugLineNum = 90833005;BA.debugLine="Return Fila";
if (true) return _fila;
RDebugUtils.currentLine=90833006;
 //BA.debugLineNum = 90833006;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _analisisdestinatarios(b4j.docU.cinformesexpedicionesclientes __ref) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "analisisdestinatarios", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "analisisdestinatarios", null));}
ResumableSub_AnalisisDestinatarios rsub = new ResumableSub_AnalisisDestinatarios(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_AnalisisDestinatarios extends BA.ResumableSub {
public ResumableSub_AnalisisDestinatarios(b4j.docU.cinformesexpedicionesclientes parent,b4j.docU.cinformesexpedicionesclientes __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cinformesexpedicionesclientes __ref;
b4j.docU.cinformesexpedicionesclientes parent;
int _i = 0;
b4j.docU.main._vendedor _v = null;
b4j.docU.main._responsablecuenta _r = null;
b4j.docU.main._contactocliente _c = null;
anywheresoftware.b4a.objects.collections.Map _ml = null;
boolean _flagenlista = false;
int _j = 0;
b4j.docU.main._vendedor _vlist = null;
b4j.docU.main._responsablecuenta _rlist = null;
b4j.docU.main._contactocliente _clist = null;
Object _msa = null;
Object _robj = null;
int step5;
int limit5;
int step17;
int limit17;
int step32;
int limit32;
int step53;
int limit53;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=90505217;
 //BA.debugLineNum = 90505217;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=90505220;
 //BA.debugLineNum = 90505220;BA.debugLine="lstVendedores.Initialize";
__ref._lstvendedores /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=90505221;
 //BA.debugLineNum = 90505221;BA.debugLine="lstResponsablesCuenta.Initialize";
__ref._lstresponsablescuenta /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=90505222;
 //BA.debugLineNum = 90505222;BA.debugLine="lstContactosPedidos.Initialize";
__ref._lstcontactospedidos /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=90505224;
 //BA.debugLineNum = 90505224;BA.debugLine="For i=0 To lstInfoDocumentos.Size-1";
if (true) break;

case 1:
//for
this.state = 37;
step5 = 1;
limit5 = (int) (__ref._lstinfodocumentos /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
this.state = 56;
if (true) break;

case 56:
//C
this.state = 37;
if ((step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5)) this.state = 3;
if (true) break;

case 57:
//C
this.state = 56;
_i = ((int)(0 + _i + step5)) ;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=90505227;
 //BA.debugLineNum = 90505227;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Analizando";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Analizando Destinatarios Email "+BA.NumberToString((((_i+1)/(double)__ref._lstinfodocumentos /*anywheresoftware.b4a.objects.collections.List*/ .getSize())*100))+"%"));
RDebugUtils.currentLine=90505228;
 //BA.debugLineNum = 90505228;BA.debugLine="Dim V As Vendedor";
_v = new b4j.docU.main._vendedor();
RDebugUtils.currentLine=90505229;
 //BA.debugLineNum = 90505229;BA.debugLine="Dim R As ResponsableCuenta";
_r = new b4j.docU.main._responsablecuenta();
RDebugUtils.currentLine=90505230;
 //BA.debugLineNum = 90505230;BA.debugLine="Dim C As ContactoCliente";
_c = new b4j.docU.main._contactocliente();
RDebugUtils.currentLine=90505232;
 //BA.debugLineNum = 90505232;BA.debugLine="Dim mL As Map=lstInfoDocumentos.Get(i)";
_ml = new anywheresoftware.b4a.objects.collections.Map();
_ml = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._lstinfodocumentos /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=90505233;
 //BA.debugLineNum = 90505233;BA.debugLine="V.Initialize";
_v.Initialize();
RDebugUtils.currentLine=90505234;
 //BA.debugLineNum = 90505234;BA.debugLine="V.Codigo=mL.Get(\"Comercial\")";
_v.Codigo /*String*/  = BA.ObjectToString(_ml.Get((Object)("Comercial")));
RDebugUtils.currentLine=90505235;
 //BA.debugLineNum = 90505235;BA.debugLine="V.Nombre=mL.Get(\"NombreComercial\")";
_v.Nombre /*String*/  = BA.ObjectToString(_ml.Get((Object)("NombreComercial")));
RDebugUtils.currentLine=90505236;
 //BA.debugLineNum = 90505236;BA.debugLine="V.Email=mL.Get(\"EmailComercial\")";
_v.Email /*String*/  = BA.ObjectToString(_ml.Get((Object)("EmailComercial")));
RDebugUtils.currentLine=90505237;
 //BA.debugLineNum = 90505237;BA.debugLine="V.Email=V.Email.ToLowerCase";
_v.Email /*String*/  = _v.Email /*String*/ .toLowerCase();
RDebugUtils.currentLine=90505239;
 //BA.debugLineNum = 90505239;BA.debugLine="Dim FlagEnLista As Boolean";
_flagenlista = false;
RDebugUtils.currentLine=90505240;
 //BA.debugLineNum = 90505240;BA.debugLine="For j=0 To lstVendedores.Size-1";
if (true) break;

case 4:
//for
this.state = 11;
step17 = 1;
limit17 = (int) (__ref._lstvendedores /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_j = (int) (0) ;
this.state = 58;
if (true) break;

case 58:
//C
this.state = 11;
if ((step17 > 0 && _j <= limit17) || (step17 < 0 && _j >= limit17)) this.state = 6;
if (true) break;

case 59:
//C
this.state = 58;
_j = ((int)(0 + _j + step17)) ;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=90505241;
 //BA.debugLineNum = 90505241;BA.debugLine="Dim vList As Vendedor=lstVendedores.Get(j)";
_vlist = (b4j.docU.main._vendedor)(__ref._lstvendedores /*anywheresoftware.b4a.objects.collections.List*/ .Get(_j));
RDebugUtils.currentLine=90505242;
 //BA.debugLineNum = 90505242;BA.debugLine="If vList.Codigo=V.Codigo Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_vlist.Codigo /*String*/ ).equals(_v.Codigo /*String*/ )) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=90505243;
 //BA.debugLineNum = 90505243;BA.debugLine="FlagEnLista=True";
_flagenlista = parent.__c.True;
RDebugUtils.currentLine=90505244;
 //BA.debugLineNum = 90505244;BA.debugLine="Exit";
this.state = 11;
if (true) break;
 if (true) break;

case 10:
//C
this.state = 59;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=90505247;
 //BA.debugLineNum = 90505247;BA.debugLine="If FlagEnLista=False Then";

case 11:
//if
this.state = 14;
if (_flagenlista==parent.__c.False) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=90505248;
 //BA.debugLineNum = 90505248;BA.debugLine="lstVendedores.Add(V)";
__ref._lstvendedores /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_v));
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=90505251;
 //BA.debugLineNum = 90505251;BA.debugLine="R.Initialize";
_r.Initialize();
RDebugUtils.currentLine=90505252;
 //BA.debugLineNum = 90505252;BA.debugLine="R.Codigo=mL.Get(\"ResponsableCuenta\")";
_r.Codigo /*String*/  = BA.ObjectToString(_ml.Get((Object)("ResponsableCuenta")));
RDebugUtils.currentLine=90505253;
 //BA.debugLineNum = 90505253;BA.debugLine="R.Nombre=mL.Get(\"NombreResponsableCuenta\")";
_r.Nombre /*String*/  = BA.ObjectToString(_ml.Get((Object)("NombreResponsableCuenta")));
RDebugUtils.currentLine=90505254;
 //BA.debugLineNum = 90505254;BA.debugLine="R.Email=mL.Get(\"EmailResponsableCuenta\")";
_r.Email /*String*/  = BA.ObjectToString(_ml.Get((Object)("EmailResponsableCuenta")));
RDebugUtils.currentLine=90505256;
 //BA.debugLineNum = 90505256;BA.debugLine="Dim FlagEnLista As Boolean";
_flagenlista = false;
RDebugUtils.currentLine=90505257;
 //BA.debugLineNum = 90505257;BA.debugLine="For j=0 To lstResponsablesCuenta.Size-1";
if (true) break;

case 15:
//for
this.state = 22;
step32 = 1;
limit32 = (int) (__ref._lstresponsablescuenta /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_j = (int) (0) ;
this.state = 60;
if (true) break;

case 60:
//C
this.state = 22;
if ((step32 > 0 && _j <= limit32) || (step32 < 0 && _j >= limit32)) this.state = 17;
if (true) break;

case 61:
//C
this.state = 60;
_j = ((int)(0 + _j + step32)) ;
if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=90505258;
 //BA.debugLineNum = 90505258;BA.debugLine="Dim RList As ResponsableCuenta=lstResponsablesC";
_rlist = (b4j.docU.main._responsablecuenta)(__ref._lstresponsablescuenta /*anywheresoftware.b4a.objects.collections.List*/ .Get(_j));
RDebugUtils.currentLine=90505259;
 //BA.debugLineNum = 90505259;BA.debugLine="If RList.Codigo=R.Codigo Then";
if (true) break;

case 18:
//if
this.state = 21;
if ((_rlist.Codigo /*String*/ ).equals(_r.Codigo /*String*/ )) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=90505260;
 //BA.debugLineNum = 90505260;BA.debugLine="FlagEnLista=True";
_flagenlista = parent.__c.True;
RDebugUtils.currentLine=90505261;
 //BA.debugLineNum = 90505261;BA.debugLine="Exit";
this.state = 22;
if (true) break;
 if (true) break;

case 21:
//C
this.state = 61;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=90505264;
 //BA.debugLineNum = 90505264;BA.debugLine="If FlagEnLista=False Then";

case 22:
//if
this.state = 25;
if (_flagenlista==parent.__c.False) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=90505265;
 //BA.debugLineNum = 90505265;BA.debugLine="lstResponsablesCuenta.Add(R)";
__ref._lstresponsablescuenta /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_r));
 if (true) break;

case 25:
//C
this.state = 26;
;
RDebugUtils.currentLine=90505268;
 //BA.debugLineNum = 90505268;BA.debugLine="C.Initialize";
_c.Initialize();
RDebugUtils.currentLine=90505269;
 //BA.debugLineNum = 90505269;BA.debugLine="C.ClienteProtec=Utilidades.FixNullInt(mL.Get(\"Cl";
_c.ClienteProtec /*int*/  = parent._utilidades._fixnullint /*int*/ (_ml.Get((Object)("ClienteProtec")));
RDebugUtils.currentLine=90505270;
 //BA.debugLineNum = 90505270;BA.debugLine="C.Codigo=mL.Get(\"Contacto\")";
_c.Codigo /*String*/  = BA.ObjectToString(_ml.Get((Object)("Contacto")));
RDebugUtils.currentLine=90505271;
 //BA.debugLineNum = 90505271;BA.debugLine="C.Nombre=mL.Get(\"NombreContacto\")";
_c.Nombre /*String*/  = BA.ObjectToString(_ml.Get((Object)("NombreContacto")));
RDebugUtils.currentLine=90505272;
 //BA.debugLineNum = 90505272;BA.debugLine="C.Email=mL.Get(\"EmailContacto\")";
_c.Email /*String*/  = BA.ObjectToString(_ml.Get((Object)("EmailContacto")));
RDebugUtils.currentLine=90505273;
 //BA.debugLineNum = 90505273;BA.debugLine="C.Email=C.Email.ToLowerCase";
_c.Email /*String*/  = _c.Email /*String*/ .toLowerCase();
RDebugUtils.currentLine=90505274;
 //BA.debugLineNum = 90505274;BA.debugLine="C.Seleccionado=False";
_c.Seleccionado /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=90505275;
 //BA.debugLineNum = 90505275;BA.debugLine="C.Cliente=mL.Get(\"Cliente\")";
_c.Cliente /*String*/  = BA.ObjectToString(_ml.Get((Object)("Cliente")));
RDebugUtils.currentLine=90505276;
 //BA.debugLineNum = 90505276;BA.debugLine="C.NombreCliente=mL.Get(\"NombreCliente\")";
_c.NombreCliente /*String*/  = BA.ObjectToString(_ml.Get((Object)("NombreCliente")));
RDebugUtils.currentLine=90505277;
 //BA.debugLineNum = 90505277;BA.debugLine="C.NombreResponsableCuenta=mL.Get(\"NombreResponsa";
_c.NombreResponsableCuenta /*String*/  = BA.ObjectToString(_ml.Get((Object)("NombreResponsableCuenta")));
RDebugUtils.currentLine=90505279;
 //BA.debugLineNum = 90505279;BA.debugLine="Dim FlagEnLista As Boolean";
_flagenlista = false;
RDebugUtils.currentLine=90505280;
 //BA.debugLineNum = 90505280;BA.debugLine="For j=0 To lstContactosPedidos.Size-1";
if (true) break;

case 26:
//for
this.state = 33;
step53 = 1;
limit53 = (int) (__ref._lstcontactospedidos /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_j = (int) (0) ;
this.state = 62;
if (true) break;

case 62:
//C
this.state = 33;
if ((step53 > 0 && _j <= limit53) || (step53 < 0 && _j >= limit53)) this.state = 28;
if (true) break;

case 63:
//C
this.state = 62;
_j = ((int)(0 + _j + step53)) ;
if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=90505281;
 //BA.debugLineNum = 90505281;BA.debugLine="Dim cList As ContactoCliente=lstContactosPedido";
_clist = (b4j.docU.main._contactocliente)(__ref._lstcontactospedidos /*anywheresoftware.b4a.objects.collections.List*/ .Get(_j));
RDebugUtils.currentLine=90505282;
 //BA.debugLineNum = 90505282;BA.debugLine="If cList.Codigo=C.Codigo Then";
if (true) break;

case 29:
//if
this.state = 32;
if ((_clist.Codigo /*String*/ ).equals(_c.Codigo /*String*/ )) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=90505283;
 //BA.debugLineNum = 90505283;BA.debugLine="FlagEnLista=True";
_flagenlista = parent.__c.True;
RDebugUtils.currentLine=90505284;
 //BA.debugLineNum = 90505284;BA.debugLine="Exit";
this.state = 33;
if (true) break;
 if (true) break;

case 32:
//C
this.state = 63;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=90505287;
 //BA.debugLineNum = 90505287;BA.debugLine="If FlagEnLista=False Then";

case 33:
//if
this.state = 36;
if (_flagenlista==parent.__c.False) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=90505288;
 //BA.debugLineNum = 90505288;BA.debugLine="lstContactosPedidos.Add(C)";
__ref._lstcontactospedidos /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_c));
 if (true) break;

case 36:
//C
this.state = 57;
;
 if (true) break;
if (true) break;

case 37:
//C
this.state = 38;
;
RDebugUtils.currentLine=90505295;
 //BA.debugLineNum = 90505295;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=90505296;
 //BA.debugLineNum = 90505296;BA.debugLine="Select True";
if (true) break;

case 38:
//select
this.state = 55;
switch (BA.switchObjectToInt(parent.__c.True,(__ref._tipodestinatarioinforme /*String*/ ).equals("Clientes"),(__ref._tipodestinatarioinforme /*String*/ ).equals("Comerciales"))) {
case 0: {
this.state = 40;
if (true) break;
}
case 1: {
this.state = 48;
if (true) break;
}
}
if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=90505298;
 //BA.debugLineNum = 90505298;BA.debugLine="If lstContactosPedidos.Size=0 Then";
if (true) break;

case 41:
//if
this.state = 46;
if (__ref._lstcontactospedidos /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
this.state = 43;
}else {
this.state = 45;
}if (true) break;

case 43:
//C
this.state = 46;
RDebugUtils.currentLine=90505299;
 //BA.debugLineNum = 90505299;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay cont";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay contactos con direcciones de email para los documentos del periodo","Aviso");
RDebugUtils.currentLine=90505300;
 //BA.debugLineNum = 90505300;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "analisisdestinatarios"), _msa);
this.state = 64;
return;
case 64:
//C
this.state = 46;
;
 if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=90505303;
 //BA.debugLineNum = 90505303;BA.debugLine="wait for (ActualizarListaContactos) complete (";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "analisisdestinatarios"), __ref._actualizarlistacontactos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 65;
return;
case 65:
//C
this.state = 46;
_robj = (Object) result[1];
;
 if (true) break;

case 46:
//C
this.state = 55;
;
 if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=90505306;
 //BA.debugLineNum = 90505306;BA.debugLine="If lstVendedores.Size=0 Then";
if (true) break;

case 49:
//if
this.state = 54;
if (__ref._lstvendedores /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
this.state = 51;
}else {
this.state = 53;
}if (true) break;

case 51:
//C
this.state = 54;
RDebugUtils.currentLine=90505307;
 //BA.debugLineNum = 90505307;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay cont";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay contactos de comercial con direcciones de email para los documentos del periodo","Aviso");
RDebugUtils.currentLine=90505308;
 //BA.debugLineNum = 90505308;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "analisisdestinatarios"), _msa);
this.state = 66;
return;
case 66:
//C
this.state = 54;
;
 if (true) break;

case 53:
//C
this.state = 54;
RDebugUtils.currentLine=90505311;
 //BA.debugLineNum = 90505311;BA.debugLine="wait for (ActualizarListaContactos) complete (";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "analisisdestinatarios"), __ref._actualizarlistacontactos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 67;
return;
case 67:
//C
this.state = 54;
_robj = (Object) result[1];
;
 if (true) break;

case 54:
//C
this.state = 55;
;
 if (true) break;

case 55:
//C
this.state = -1;
;
RDebugUtils.currentLine=90505315;
 //BA.debugLineNum = 90505315;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=90505316;
 //BA.debugLineNum = 90505316;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnactualizarinfo_click(b4j.docU.cinformesexpedicionesclientes __ref) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "btnactualizarinfo_click", false))
	 {Debug.delegate(ba, "btnactualizarinfo_click", null); return;}
ResumableSub_btnActualizarInfo_Click rsub = new ResumableSub_btnActualizarInfo_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnActualizarInfo_Click extends BA.ResumableSub {
public ResumableSub_btnActualizarInfo_Click(b4j.docU.cinformesexpedicionesclientes parent,b4j.docU.cinformesexpedicionesclientes __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cinformesexpedicionesclientes __ref;
b4j.docU.cinformesexpedicionesclientes parent;
Object _msa = null;
anywheresoftware.b4a.objects.collections.Map _mresult = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=90046468;
 //BA.debugLineNum = 90046468;BA.debugLine="lblTipoInforme.Visible=False";
__ref._lbltipoinforme /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=90046469;
 //BA.debugLineNum = 90046469;BA.debugLine="cboTipoInforme.Visible=False";
__ref._cbotipoinforme /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=90046471;
 //BA.debugLineNum = 90046471;BA.debugLine="pnlFondoDestinatarios.Visible=False";
__ref._pnlfondodestinatarios /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=90046473;
 //BA.debugLineNum = 90046473;BA.debugLine="If FechaFinal=0 And FechaInicial=0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._fechafinal /*long*/ ==0 && __ref._fechainicial /*long*/ ==0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=90046474;
 //BA.debugLineNum = 90046474;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Indica Fecha";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Indica Fecha Inicial y Fecha Final","Aviso");
RDebugUtils.currentLine=90046475;
 //BA.debugLineNum = 90046475;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "btnactualizarinfo_click"), _msa);
this.state = 30;
return;
case 30:
//C
this.state = 4;
;
RDebugUtils.currentLine=90046476;
 //BA.debugLineNum = 90046476;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=90046478;
 //BA.debugLineNum = 90046478;BA.debugLine="If FechaFinal=0 And FechaInicial<>0 Then";

case 4:
//if
this.state = 7;
if (__ref._fechafinal /*long*/ ==0 && __ref._fechainicial /*long*/ !=0) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=90046479;
 //BA.debugLineNum = 90046479;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Indica Fecha";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Indica Fecha Final","Aviso");
RDebugUtils.currentLine=90046480;
 //BA.debugLineNum = 90046480;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "btnactualizarinfo_click"), _msa);
this.state = 31;
return;
case 31:
//C
this.state = 7;
;
RDebugUtils.currentLine=90046481;
 //BA.debugLineNum = 90046481;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=90046483;
 //BA.debugLineNum = 90046483;BA.debugLine="If FechaFinal<>0 And FechaInicial=0 Then";

case 7:
//if
this.state = 10;
if (__ref._fechafinal /*long*/ !=0 && __ref._fechainicial /*long*/ ==0) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=90046484;
 //BA.debugLineNum = 90046484;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Indica Fecha";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Indica Fecha Inicial","Aviso");
RDebugUtils.currentLine=90046485;
 //BA.debugLineNum = 90046485;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "btnactualizarinfo_click"), _msa);
this.state = 32;
return;
case 32:
//C
this.state = 10;
;
RDebugUtils.currentLine=90046486;
 //BA.debugLineNum = 90046486;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=90046488;
 //BA.debugLineNum = 90046488;BA.debugLine="If DateTime.Date(FechaInicial)=DateTime.date(Fech";

case 10:
//if
this.state = 15;
if ((parent.__c.DateTime.Date(__ref._fechainicial /*long*/ )).equals(parent.__c.DateTime.Date(__ref._fechafinal /*long*/ ))) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=90046490;
 //BA.debugLineNum = 90046490;BA.debugLine="PeriodoInforme=txtFechaFinal.Text.Replace(\"/\",\"-";
__ref._periodoinforme /*String*/  = __ref._txtfechafinal /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText().replace("/","-");
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=90046493;
 //BA.debugLineNum = 90046493;BA.debugLine="PeriodoInforme=\"Periodo \" & txtFechaFinal.Text.R";
__ref._periodoinforme /*String*/  = "Periodo "+__ref._txtfechafinal /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText().replace("/","-")+" a "+__ref._txtfechafinal /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText().replace("/","-");
 if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=90046496;
 //BA.debugLineNum = 90046496;BA.debugLine="CargandoItemsCboTipoInforme=True";
__ref._cargandoitemscbotipoinforme /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=90046497;
 //BA.debugLineNum = 90046497;BA.debugLine="cboTipoInforme.Value=\"\"";
__ref._cbotipoinforme /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue((Object)(""));
RDebugUtils.currentLine=90046502;
 //BA.debugLineNum = 90046502;BA.debugLine="lstDocumentosExpedidos.Initialize";
__ref._lstdocumentosexpedidos /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=90046503;
 //BA.debugLineNum = 90046503;BA.debugLine="lstDocumentosExpedidosUnicos.Initialize";
__ref._lstdocumentosexpedidosunicos /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=90046504;
 //BA.debugLineNum = 90046504;BA.debugLine="lstInfoDocumentos.Initialize";
__ref._lstinfodocumentos /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=90046505;
 //BA.debugLineNum = 90046505;BA.debugLine="Log(\"inicio CargaDocumentosExpedidosPeriodoTransp";
parent.__c.LogImpl("890046505","inicio CargaDocumentosExpedidosPeriodoTransporteExterno",0);
RDebugUtils.currentLine=90046506;
 //BA.debugLineNum = 90046506;BA.debugLine="Wait For (CargaDocumentosExpedidosPeriodoTranspor";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "btnactualizarinfo_click"), __ref._cargadocumentosexpedidosperiodotransporteexterno /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._fechainicial /*long*/ ,__ref._fechafinal /*long*/ ));
this.state = 33;
return;
case 33:
//C
this.state = 16;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=90046507;
 //BA.debugLineNum = 90046507;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
if (true) break;

case 16:
//if
this.state = 19;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=90046508;
 //BA.debugLineNum = 90046508;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error en quer";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error en query DocumentosExpedidosPeriodoTransporteExterno /Conexion servidor ","Error");
RDebugUtils.currentLine=90046509;
 //BA.debugLineNum = 90046509;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "btnactualizarinfo_click"), _msa);
this.state = 34;
return;
case 34:
//C
this.state = 19;
;
RDebugUtils.currentLine=90046510;
 //BA.debugLineNum = 90046510;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=90046512;
 //BA.debugLineNum = 90046512;BA.debugLine="Log(\"fin CargaDocumentosExpedidosPeriodoTransport";
parent.__c.LogImpl("890046512","fin CargaDocumentosExpedidosPeriodoTransporteExterno",0);
RDebugUtils.currentLine=90046513;
 //BA.debugLineNum = 90046513;BA.debugLine="Log(\"inicio CargaDocumentosAsignadosARepartoPerio";
parent.__c.LogImpl("890046513","inicio CargaDocumentosAsignadosARepartoPeriodo",0);
RDebugUtils.currentLine=90046514;
 //BA.debugLineNum = 90046514;BA.debugLine="Wait For (CargaDocumentosAsignadosARepartoPeriodo";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "btnactualizarinfo_click"), __ref._cargadocumentosasignadosarepartoperiodo /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._fechainicial /*long*/ ,__ref._fechafinal /*long*/ ));
this.state = 35;
return;
case 35:
//C
this.state = 20;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=90046515;
 //BA.debugLineNum = 90046515;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
if (true) break;

case 20:
//if
this.state = 23;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=90046516;
 //BA.debugLineNum = 90046516;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error en quer";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error en query DocumentosAsignadosARepartoPeriodo /Conexion servidor ","Error");
RDebugUtils.currentLine=90046517;
 //BA.debugLineNum = 90046517;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "btnactualizarinfo_click"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 23;
;
RDebugUtils.currentLine=90046518;
 //BA.debugLineNum = 90046518;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=90046520;
 //BA.debugLineNum = 90046520;BA.debugLine="Log(\"fin CargaDocumentosAsignadosARepartoPeriodo\"";
parent.__c.LogImpl("890046520","fin CargaDocumentosAsignadosARepartoPeriodo",0);
RDebugUtils.currentLine=90046521;
 //BA.debugLineNum = 90046521;BA.debugLine="Log(\"fin carga docs\")";
parent.__c.LogImpl("890046521","fin carga docs",0);
RDebugUtils.currentLine=90046522;
 //BA.debugLineNum = 90046522;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=90046523;
 //BA.debugLineNum = 90046523;BA.debugLine="If lstDocumentosExpedidos.Size=0 Then";
if (true) break;

case 24:
//if
this.state = 29;
if (__ref._lstdocumentosexpedidos /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 29;
RDebugUtils.currentLine=90046524;
 //BA.debugLineNum = 90046524;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay docume";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay documentos expedidos/asignados a reparto en el periodo seleccionado","Aviso");
RDebugUtils.currentLine=90046525;
 //BA.debugLineNum = 90046525;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "btnactualizarinfo_click"), _msa);
this.state = 37;
return;
case 37:
//C
this.state = 29;
;
 if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=90046527;
 //BA.debugLineNum = 90046527;BA.debugLine="lblTipoInforme.Visible=True";
__ref._lbltipoinforme /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(parent.__c.True);
RDebugUtils.currentLine=90046528;
 //BA.debugLineNum = 90046528;BA.debugLine="cboTipoInforme.Visible=True";
__ref._cbotipoinforme /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setVisible(parent.__c.True);
 if (true) break;

case 29:
//C
this.state = -1;
;
RDebugUtils.currentLine=90046530;
 //BA.debugLineNum = 90046530;BA.debugLine="CargandoItemsCboTipoInforme=False";
__ref._cargandoitemscbotipoinforme /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=90046532;
 //BA.debugLineNum = 90046532;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargadocumentosexpedidosperiodotransporteexterno(b4j.docU.cinformesexpedicionesclientes __ref,long _fechin,long _fechfin) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "cargadocumentosexpedidosperiodotransporteexterno", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargadocumentosexpedidosperiodotransporteexterno", new Object[] {_fechin,_fechfin}));}
ResumableSub_CargaDocumentosExpedidosPeriodoTransporteExterno rsub = new ResumableSub_CargaDocumentosExpedidosPeriodoTransporteExterno(this,__ref,_fechin,_fechfin);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaDocumentosExpedidosPeriodoTransporteExterno extends BA.ResumableSub {
public ResumableSub_CargaDocumentosExpedidosPeriodoTransporteExterno(b4j.docU.cinformesexpedicionesclientes parent,b4j.docU.cinformesexpedicionesclientes __ref,long _fechin,long _fechfin) {
this.parent = parent;
this.__ref = __ref;
this._fechin = _fechin;
this._fechfin = _fechfin;
this.__ref = parent;
}
b4j.docU.cinformesexpedicionesclientes __ref;
b4j.docU.cinformesexpedicionesclientes parent;
long _fechin;
long _fechfin;
anywheresoftware.b4a.objects.collections.Map _m = null;
b4j.docU.dbrequestmanager _req = null;
b4j.docU.main._dbcommand _cmd = null;
b4j.docU.httpjob _j = null;
b4j.docU.main._dbresult _res = null;
Object[] _records = null;
anywheresoftware.b4a.objects.collections.Map _mdoc = null;
int _i = 0;
String _sval = "";
anywheresoftware.b4a.BA.IterableList group16;
int index16;
int groupLen16;
int step19;
int limit19;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=90112001;
 //BA.debugLineNum = 90112001;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=90112002;
 //BA.debugLineNum = 90112002;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=90112003;
 //BA.debugLineNum = 90112003;BA.debugLine="m.Put(\"ConnOK\",False)";
_m.Put((Object)("ConnOK"),(Object)(parent.__c.False));
RDebugUtils.currentLine=90112004;
 //BA.debugLineNum = 90112004;BA.debugLine="m.Put(\"ReqOK\",False)";
_m.Put((Object)("ReqOK"),(Object)(parent.__c.False));
RDebugUtils.currentLine=90112005;
 //BA.debugLineNum = 90112005;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.WAIT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT);
RDebugUtils.currentLine=90112006;
 //BA.debugLineNum = 90112006;BA.debugLine="Dim Req As DBRequestManager = CreateRequest";
_req = __ref._createrequest /*b4j.docU.dbrequestmanager*/ (null);
RDebugUtils.currentLine=90112007;
 //BA.debugLineNum = 90112007;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"DocumentosE";
_cmd = __ref._createcommand /*b4j.docU.main._dbcommand*/ (null,"DocumentosExpedidosPeriodoTransporteExterno",new Object[]{(Object)(_fechin),(Object)(_fechfin)});
RDebugUtils.currentLine=90112008;
 //BA.debugLineNum = 90112008;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "cargadocumentosexpedidosperiodotransporteexterno"), (Object)(_req._executequery /*b4j.docU.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 25;
return;
case 25:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=90112009;
 //BA.debugLineNum = 90112009;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 24;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 23;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=90112010;
 //BA.debugLineNum = 90112010;BA.debugLine="m.Put(\"ConnOK\",True)";
_m.Put((Object)("ConnOK"),(Object)(parent.__c.True));
RDebugUtils.currentLine=90112011;
 //BA.debugLineNum = 90112011;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=90112012;
 //BA.debugLineNum = 90112012;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "cargadocumentosexpedidosperiodotransporteexterno"), (Object)(_req));
this.state = 26;
return;
case 26:
//C
this.state = 4;
_res = (b4j.docU.main._dbresult) result[1];
;
RDebugUtils.currentLine=90112013;
 //BA.debugLineNum = 90112013;BA.debugLine="If res.Rows.Size>0 Then";
if (true) break;

case 4:
//if
this.state = 21;
if (_res.Rows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 6;
}else {
this.state = 20;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=90112014;
 //BA.debugLineNum = 90112014;BA.debugLine="m.Put(\"ReqOK\",True)";
_m.Put((Object)("ReqOK"),(Object)(parent.__c.True));
RDebugUtils.currentLine=90112015;
 //BA.debugLineNum = 90112015;BA.debugLine="jamLoadingIndicator1.show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=90112016;
 //BA.debugLineNum = 90112016;BA.debugLine="For Each records() As Object In res.Rows";
if (true) break;

case 7:
//for
this.state = 18;
group16 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index16 = 0;
groupLen16 = group16.getSize();
this.state = 27;
if (true) break;

case 27:
//C
this.state = 18;
if (index16 < groupLen16) {
this.state = 9;
_records = (Object[])(group16.Get(index16));}
if (true) break;

case 28:
//C
this.state = 27;
index16++;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=90112017;
 //BA.debugLineNum = 90112017;BA.debugLine="Dim mDoc As Map";
_mdoc = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=90112018;
 //BA.debugLineNum = 90112018;BA.debugLine="mDoc.Initialize";
_mdoc.Initialize();
RDebugUtils.currentLine=90112019;
 //BA.debugLineNum = 90112019;BA.debugLine="For i=0 To  res.Columns.Size-1";
if (true) break;

case 10:
//for
this.state = 13;
step19 = 1;
limit19 = (int) (_res.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
_i = (int) (0) ;
this.state = 29;
if (true) break;

case 29:
//C
this.state = 13;
if ((step19 > 0 && _i <= limit19) || (step19 < 0 && _i >= limit19)) this.state = 12;
if (true) break;

case 30:
//C
this.state = 29;
_i = ((int)(0 + _i + step19)) ;
if (true) break;

case 12:
//C
this.state = 30;
RDebugUtils.currentLine=90112024;
 //BA.debugLineNum = 90112024;BA.debugLine="Dim sVal As String=records(i)";
_sval = BA.ObjectToString(_records[_i]);
RDebugUtils.currentLine=90112026;
 //BA.debugLineNum = 90112026;BA.debugLine="mDoc.Put(res.Columns.GetKeyAt(i),sVal.ToUpper";
_mdoc.Put(_res.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .GetKeyAt(_i),(Object)(_sval.toUpperCase()));
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=90112028;
 //BA.debugLineNum = 90112028;BA.debugLine="lstDocumentosExpedidos.Add(mDoc)";
__ref._lstdocumentosexpedidos /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_mdoc.getObject()));
RDebugUtils.currentLine=90112029;
 //BA.debugLineNum = 90112029;BA.debugLine="If lstDocumentosExpedidosUnicos.IndexOf(mDoc.G";
if (true) break;

case 14:
//if
this.state = 17;
if (__ref._lstdocumentosexpedidosunicos /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf(_mdoc.Get((Object)("Documento")))==-1) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=90112030;
 //BA.debugLineNum = 90112030;BA.debugLine="lstDocumentosExpedidosUnicos.Add(mDoc.Get(\"Do";
__ref._lstdocumentosexpedidosunicos /*anywheresoftware.b4a.objects.collections.List*/ .Add(_mdoc.Get((Object)("Documento")));
 if (true) break;

case 17:
//C
this.state = 28;
;
RDebugUtils.currentLine=90112032;
 //BA.debugLineNum = 90112032;BA.debugLine="Log(\"Doc tte externo: \" & mDoc.Get(\"Documento\"";
parent.__c.LogImpl("890112032","Doc tte externo: "+BA.ObjectToString(_mdoc.Get((Object)("Documento"))),0);
RDebugUtils.currentLine=90112034;
 //BA.debugLineNum = 90112034;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Documento";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Documentos Expedidos Transporte Externo y Asignados a Reparto: "+BA.NumberToString(__ref._lstdocumentosexpedidosunicos /*anywheresoftware.b4a.objects.collections.List*/ .getSize())));
 if (true) break;
if (true) break;

case 18:
//C
this.state = 21;
;
RDebugUtils.currentLine=90112036;
 //BA.debugLineNum = 90112036;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
 if (true) break;

case 20:
//C
this.state = 21;
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
 if (true) break;

case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=90112043;
 //BA.debugLineNum = 90112043;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=90112044;
 //BA.debugLineNum = 90112044;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.DEFAULT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT);
RDebugUtils.currentLine=90112045;
 //BA.debugLineNum = 90112045;BA.debugLine="Return m";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_m));return;};
RDebugUtils.currentLine=90112046;
 //BA.debugLineNum = 90112046;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargadocumentosasignadosarepartoperiodo(b4j.docU.cinformesexpedicionesclientes __ref,long _fechin,long _fechfin) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "cargadocumentosasignadosarepartoperiodo", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargadocumentosasignadosarepartoperiodo", new Object[] {_fechin,_fechfin}));}
ResumableSub_CargaDocumentosAsignadosARepartoPeriodo rsub = new ResumableSub_CargaDocumentosAsignadosARepartoPeriodo(this,__ref,_fechin,_fechfin);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaDocumentosAsignadosARepartoPeriodo extends BA.ResumableSub {
public ResumableSub_CargaDocumentosAsignadosARepartoPeriodo(b4j.docU.cinformesexpedicionesclientes parent,b4j.docU.cinformesexpedicionesclientes __ref,long _fechin,long _fechfin) {
this.parent = parent;
this.__ref = __ref;
this._fechin = _fechin;
this._fechfin = _fechfin;
this.__ref = parent;
}
b4j.docU.cinformesexpedicionesclientes __ref;
b4j.docU.cinformesexpedicionesclientes parent;
long _fechin;
long _fechfin;
anywheresoftware.b4a.objects.collections.Map _m = null;
b4j.docU.dbrequestmanager _req = null;
b4j.docU.main._dbcommand _cmd = null;
b4j.docU.httpjob _j = null;
b4j.docU.main._dbresult _res = null;
Object[] _records = null;
anywheresoftware.b4a.objects.collections.Map _mdoc = null;
int _i = 0;
String _sval = "";
anywheresoftware.b4a.BA.IterableList group16;
int index16;
int groupLen16;
int step19;
int limit19;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=90177537;
 //BA.debugLineNum = 90177537;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=90177538;
 //BA.debugLineNum = 90177538;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=90177539;
 //BA.debugLineNum = 90177539;BA.debugLine="m.Put(\"ConnOK\",False)";
_m.Put((Object)("ConnOK"),(Object)(parent.__c.False));
RDebugUtils.currentLine=90177540;
 //BA.debugLineNum = 90177540;BA.debugLine="m.Put(\"ReqOK\",False)";
_m.Put((Object)("ReqOK"),(Object)(parent.__c.False));
RDebugUtils.currentLine=90177541;
 //BA.debugLineNum = 90177541;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.WAIT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT);
RDebugUtils.currentLine=90177542;
 //BA.debugLineNum = 90177542;BA.debugLine="Dim Req As DBRequestManager = CreateRequest";
_req = __ref._createrequest /*b4j.docU.dbrequestmanager*/ (null);
RDebugUtils.currentLine=90177543;
 //BA.debugLineNum = 90177543;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"DocumentosA";
_cmd = __ref._createcommand /*b4j.docU.main._dbcommand*/ (null,"DocumentosAsignadosARepartoPeriodo",new Object[]{(Object)(_fechin),(Object)(_fechfin)});
RDebugUtils.currentLine=90177544;
 //BA.debugLineNum = 90177544;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "cargadocumentosasignadosarepartoperiodo"), (Object)(_req._executequery /*b4j.docU.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 25;
return;
case 25:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=90177545;
 //BA.debugLineNum = 90177545;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 24;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 23;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=90177546;
 //BA.debugLineNum = 90177546;BA.debugLine="m.Put(\"ConnOK\",True)";
_m.Put((Object)("ConnOK"),(Object)(parent.__c.True));
RDebugUtils.currentLine=90177547;
 //BA.debugLineNum = 90177547;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=90177548;
 //BA.debugLineNum = 90177548;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "cargadocumentosasignadosarepartoperiodo"), (Object)(_req));
this.state = 26;
return;
case 26:
//C
this.state = 4;
_res = (b4j.docU.main._dbresult) result[1];
;
RDebugUtils.currentLine=90177549;
 //BA.debugLineNum = 90177549;BA.debugLine="If res.Rows.Size>0 Then";
if (true) break;

case 4:
//if
this.state = 21;
if (_res.Rows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 6;
}else {
this.state = 20;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=90177550;
 //BA.debugLineNum = 90177550;BA.debugLine="m.Put(\"ReqOK\",True)";
_m.Put((Object)("ReqOK"),(Object)(parent.__c.True));
RDebugUtils.currentLine=90177551;
 //BA.debugLineNum = 90177551;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=90177552;
 //BA.debugLineNum = 90177552;BA.debugLine="For Each records() As Object In res.Rows";
if (true) break;

case 7:
//for
this.state = 18;
group16 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index16 = 0;
groupLen16 = group16.getSize();
this.state = 27;
if (true) break;

case 27:
//C
this.state = 18;
if (index16 < groupLen16) {
this.state = 9;
_records = (Object[])(group16.Get(index16));}
if (true) break;

case 28:
//C
this.state = 27;
index16++;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=90177553;
 //BA.debugLineNum = 90177553;BA.debugLine="Dim mDoc As Map";
_mdoc = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=90177554;
 //BA.debugLineNum = 90177554;BA.debugLine="mDoc.Initialize";
_mdoc.Initialize();
RDebugUtils.currentLine=90177555;
 //BA.debugLineNum = 90177555;BA.debugLine="For i=0 To  res.Columns.Size-1";
if (true) break;

case 10:
//for
this.state = 13;
step19 = 1;
limit19 = (int) (_res.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
_i = (int) (0) ;
this.state = 29;
if (true) break;

case 29:
//C
this.state = 13;
if ((step19 > 0 && _i <= limit19) || (step19 < 0 && _i >= limit19)) this.state = 12;
if (true) break;

case 30:
//C
this.state = 29;
_i = ((int)(0 + _i + step19)) ;
if (true) break;

case 12:
//C
this.state = 30;
RDebugUtils.currentLine=90177557;
 //BA.debugLineNum = 90177557;BA.debugLine="Dim sVal As String=records(i)";
_sval = BA.ObjectToString(_records[_i]);
RDebugUtils.currentLine=90177559;
 //BA.debugLineNum = 90177559;BA.debugLine="mDoc.Put(res.Columns.GetKeyAt(i),sVal.ToUpper";
_mdoc.Put(_res.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .GetKeyAt(_i),(Object)(_sval.toUpperCase()));
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=90177562;
 //BA.debugLineNum = 90177562;BA.debugLine="lstDocumentosExpedidos.Add(mDoc)";
__ref._lstdocumentosexpedidos /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_mdoc.getObject()));
RDebugUtils.currentLine=90177563;
 //BA.debugLineNum = 90177563;BA.debugLine="If lstDocumentosExpedidosUnicos.IndexOf(mDoc.G";
if (true) break;

case 14:
//if
this.state = 17;
if (__ref._lstdocumentosexpedidosunicos /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf(_mdoc.Get((Object)("Documento")))==-1) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=90177564;
 //BA.debugLineNum = 90177564;BA.debugLine="lstDocumentosExpedidosUnicos.Add(mDoc.Get(\"Do";
__ref._lstdocumentosexpedidosunicos /*anywheresoftware.b4a.objects.collections.List*/ .Add(_mdoc.Get((Object)("Documento")));
 if (true) break;

case 17:
//C
this.state = 28;
;
RDebugUtils.currentLine=90177566;
 //BA.debugLineNum = 90177566;BA.debugLine="Log(\"Doc Reparto: \" &  mDoc.Get(\"Documento\"))";
parent.__c.LogImpl("890177566","Doc Reparto: "+BA.ObjectToString(_mdoc.Get((Object)("Documento"))),0);
RDebugUtils.currentLine=90177568;
 //BA.debugLineNum = 90177568;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Documento";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Documentos Expedidos Transporte Externo y Asignados a Reparto: "+BA.NumberToString(__ref._lstdocumentosexpedidosunicos /*anywheresoftware.b4a.objects.collections.List*/ .getSize())));
 if (true) break;
if (true) break;

case 18:
//C
this.state = 21;
;
RDebugUtils.currentLine=90177570;
 //BA.debugLineNum = 90177570;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
 if (true) break;

case 20:
//C
this.state = 21;
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
 if (true) break;

case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=90177577;
 //BA.debugLineNum = 90177577;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=90177578;
 //BA.debugLineNum = 90177578;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.DEFAULT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT);
RDebugUtils.currentLine=90177579;
 //BA.debugLineNum = 90177579;BA.debugLine="Return m";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_m));return;};
RDebugUtils.currentLine=90177580;
 //BA.debugLineNum = 90177580;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnfechafinal_click(b4j.docU.cinformesexpedicionesclientes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "btnfechafinal_click", false))
	 {return ((String) Debug.delegate(ba, "btnfechafinal_click", null));}
RDebugUtils.currentLine=89849856;
 //BA.debugLineNum = 89849856;BA.debugLine="Sub btnFechaFinal_Click";
RDebugUtils.currentLine=89849857;
 //BA.debugLineNum = 89849857;BA.debugLine="SeleccionFecha(\"Final\")";
__ref._seleccionfecha /*void*/ (null,"Final");
RDebugUtils.currentLine=89849858;
 //BA.debugLineNum = 89849858;BA.debugLine="End Sub";
return "";
}
public void  _seleccionfecha(b4j.docU.cinformesexpedicionesclientes __ref,String _tipo) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "seleccionfecha", false))
	 {Debug.delegate(ba, "seleccionfecha", new Object[] {_tipo}); return;}
ResumableSub_SeleccionFecha rsub = new ResumableSub_SeleccionFecha(this,__ref,_tipo);
rsub.resume(ba, null);
}
public static class ResumableSub_SeleccionFecha extends BA.ResumableSub {
public ResumableSub_SeleccionFecha(b4j.docU.cinformesexpedicionesclientes parent,b4j.docU.cinformesexpedicionesclientes __ref,String _tipo) {
this.parent = parent;
this.__ref = __ref;
this._tipo = _tipo;
this.__ref = parent;
}
b4j.docU.cinformesexpedicionesclientes __ref;
b4j.docU.cinformesexpedicionesclientes parent;
String _tipo;
int _result = 0;
Object _msa = null;
long _setd = 0L;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=89915393;
 //BA.debugLineNum = 89915393;BA.debugLine="Dialog.Title = \"Fechas Informe\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Fechas Informe");
RDebugUtils.currentLine=89915394;
 //BA.debugLineNum = 89915394;BA.debugLine="InicializarCalendario";
__ref._inicializarcalendario /*String*/ (null);
RDebugUtils.currentLine=89915395;
 //BA.debugLineNum = 89915395;BA.debugLine="Wait For (Dialog.ShowTemplate(DateTemplate, \"OK\",";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "seleccionfecha"), __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ),(Object)("OK"),(Object)(""),(Object)("Cancel")));
this.state = 35;
return;
case 35:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=89915396;
 //BA.debugLineNum = 89915396;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 34;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=89915398;
 //BA.debugLineNum = 89915398;BA.debugLine="Select True";
if (true) break;

case 4:
//select
this.state = 33;
switch (BA.switchObjectToInt(parent.__c.True,(_tipo).equals("Inicial"),(_tipo).equals("Final"))) {
case 0: {
this.state = 6;
if (true) break;
}
case 1: {
this.state = 20;
if (true) break;
}
}
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=89915400;
 //BA.debugLineNum = 89915400;BA.debugLine="If FechaFinal>0 And FechaUnica=False Then";
if (true) break;

case 7:
//if
this.state = 14;
if (__ref._fechafinal /*long*/ >0 && __ref._fechaunica /*boolean*/ ==parent.__c.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=89915401;
 //BA.debugLineNum = 89915401;BA.debugLine="If DateTemplate.Date>FechaFinal Then";
if (true) break;

case 10:
//if
this.state = 13;
if (__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._getdate /*long*/ (null)>__ref._fechafinal /*long*/ ) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=89915402;
 //BA.debugLineNum = 89915402;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La fecha";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"La fecha inicial no puede ser posterior a la fecha final","Aviso");
RDebugUtils.currentLine=89915403;
 //BA.debugLineNum = 89915403;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "seleccionfecha"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 13;
;
RDebugUtils.currentLine=89915404;
 //BA.debugLineNum = 89915404;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=89915407;
 //BA.debugLineNum = 89915407;BA.debugLine="FechaInicial=DateTemplate.Date";
__ref._fechainicial /*long*/  = __ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._getdate /*long*/ (null);
RDebugUtils.currentLine=89915408;
 //BA.debugLineNum = 89915408;BA.debugLine="Log(\"fecha Inicial: \" & CRLF & FechaInicial)";
parent.__c.LogImpl("889915408","fecha Inicial: "+parent.__c.CRLF+BA.NumberToString(__ref._fechainicial /*long*/ ),0);
RDebugUtils.currentLine=89915409;
 //BA.debugLineNum = 89915409;BA.debugLine="txtFechaInicial.Text=DateTime.Date(DateTemplat";
__ref._txtfechainicial /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(parent.__c.DateTime.Date(__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._getdate /*long*/ (null)));
RDebugUtils.currentLine=89915410;
 //BA.debugLineNum = 89915410;BA.debugLine="If FechaUnica Then";
if (true) break;

case 15:
//if
this.state = 18;
if (__ref._fechaunica /*boolean*/ ) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=89915411;
 //BA.debugLineNum = 89915411;BA.debugLine="Dim SetD As Long= DateUtils.SetDateAndTime(Da";
_setd = parent._dateutils._setdateandtime(parent.__c.DateTime.GetYear(__ref._fechainicial /*long*/ ),parent.__c.DateTime.GetMonth(__ref._fechainicial /*long*/ ),parent.__c.DateTime.GetDayOfMonth(__ref._fechainicial /*long*/ ),(int) (23),(int) (59),(int) (59));
RDebugUtils.currentLine=89915412;
 //BA.debugLineNum = 89915412;BA.debugLine="FechaFinal=SetD";
__ref._fechafinal /*long*/  = _setd;
RDebugUtils.currentLine=89915413;
 //BA.debugLineNum = 89915413;BA.debugLine="txtFechaFinal.Text=txtFechaInicial.text";
__ref._txtfechafinal /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._txtfechainicial /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
RDebugUtils.currentLine=89915414;
 //BA.debugLineNum = 89915414;BA.debugLine="Log(\"Fecha Final: \" & CRLF &  FechaFinal)";
parent.__c.LogImpl("889915414","Fecha Final: "+parent.__c.CRLF+BA.NumberToString(__ref._fechafinal /*long*/ ),0);
 if (true) break;

case 18:
//C
this.state = 33;
;
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=89915418;
 //BA.debugLineNum = 89915418;BA.debugLine="If FechaInicial>0 And FechaUnica=False Then";
if (true) break;

case 21:
//if
this.state = 28;
if (__ref._fechainicial /*long*/ >0 && __ref._fechaunica /*boolean*/ ==parent.__c.False) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=89915419;
 //BA.debugLineNum = 89915419;BA.debugLine="If DateTemplate.Date<FechaInicial Then";
if (true) break;

case 24:
//if
this.state = 27;
if (__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._getdate /*long*/ (null)<__ref._fechainicial /*long*/ ) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=89915420;
 //BA.debugLineNum = 89915420;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La fecha";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"La fecha final no puede ser anterior a la fecha final","Aviso");
RDebugUtils.currentLine=89915421;
 //BA.debugLineNum = 89915421;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "seleccionfecha"), _msa);
this.state = 37;
return;
case 37:
//C
this.state = 27;
;
RDebugUtils.currentLine=89915422;
 //BA.debugLineNum = 89915422;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=89915426;
 //BA.debugLineNum = 89915426;BA.debugLine="Dim SetD As Long= DateUtils.SetDateAndTime(Dat";
_setd = parent._dateutils._setdateandtime(parent.__c.DateTime.GetYear(__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._getdate /*long*/ (null)),parent.__c.DateTime.GetMonth(__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._getdate /*long*/ (null)),parent.__c.DateTime.GetDayOfMonth(__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._getdate /*long*/ (null)),(int) (23),(int) (59),(int) (59));
RDebugUtils.currentLine=89915427;
 //BA.debugLineNum = 89915427;BA.debugLine="FechaFinal=SetD";
__ref._fechafinal /*long*/  = _setd;
RDebugUtils.currentLine=89915428;
 //BA.debugLineNum = 89915428;BA.debugLine="Log(\"Fecha Final: \" & CRLF &  FechaFinal)";
parent.__c.LogImpl("889915428","Fecha Final: "+parent.__c.CRLF+BA.NumberToString(__ref._fechafinal /*long*/ ),0);
RDebugUtils.currentLine=89915429;
 //BA.debugLineNum = 89915429;BA.debugLine="txtFechaFinal.Text=DateTime.Date(FechaFinal)";
__ref._txtfechafinal /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(parent.__c.DateTime.Date(__ref._fechafinal /*long*/ ));
RDebugUtils.currentLine=89915430;
 //BA.debugLineNum = 89915430;BA.debugLine="If FechaUnica Then";
if (true) break;

case 29:
//if
this.state = 32;
if (__ref._fechaunica /*boolean*/ ) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=89915431;
 //BA.debugLineNum = 89915431;BA.debugLine="FechaInicial=DateUtils.SetDateAndTime(DateTim";
__ref._fechainicial /*long*/  = parent._dateutils._setdateandtime(parent.__c.DateTime.GetYear(__ref._fechafinal /*long*/ ),parent.__c.DateTime.GetMonth(__ref._fechafinal /*long*/ ),parent.__c.DateTime.GetDayOfMonth(__ref._fechafinal /*long*/ ),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=89915432;
 //BA.debugLineNum = 89915432;BA.debugLine="txtFechaInicial.Text=txtFechaFinal.text";
__ref._txtfechainicial /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._txtfechafinal /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
RDebugUtils.currentLine=89915433;
 //BA.debugLineNum = 89915433;BA.debugLine="Log(\"fecha Inicial: \" & CRLF & FechaInicial)";
parent.__c.LogImpl("889915433","fecha Inicial: "+parent.__c.CRLF+BA.NumberToString(__ref._fechainicial /*long*/ ),0);
 if (true) break;

case 32:
//C
this.state = 33;
;
 if (true) break;

case 33:
//C
this.state = 34;
;
 if (true) break;

case 34:
//C
this.state = -1;
;
RDebugUtils.currentLine=89915437;
 //BA.debugLineNum = 89915437;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnfechainicial_click(b4j.docU.cinformesexpedicionesclientes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "btnfechainicial_click", false))
	 {return ((String) Debug.delegate(ba, "btnfechainicial_click", null));}
RDebugUtils.currentLine=89784320;
 //BA.debugLineNum = 89784320;BA.debugLine="Sub btnFechaInicial_Click";
RDebugUtils.currentLine=89784321;
 //BA.debugLineNum = 89784321;BA.debugLine="SeleccionFecha(\"Inicial\")";
__ref._seleccionfecha /*void*/ (null,"Inicial");
RDebugUtils.currentLine=89784322;
 //BA.debugLineNum = 89784322;BA.debugLine="End Sub";
return "";
}
public void  _btngenerarinformesemail_click(b4j.docU.cinformesexpedicionesclientes __ref) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "btngenerarinformesemail_click", false))
	 {Debug.delegate(ba, "btngenerarinformesemail_click", null); return;}
ResumableSub_btnGenerarInformesEmail_Click rsub = new ResumableSub_btnGenerarInformesEmail_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnGenerarInformesEmail_Click extends BA.ResumableSub {
public ResumableSub_btnGenerarInformesEmail_Click(b4j.docU.cinformesexpedicionesclientes parent,b4j.docU.cinformesexpedicionesclientes __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cinformesexpedicionesclientes __ref;
b4j.docU.cinformesexpedicionesclientes parent;
Object _msa = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbaviso = null;
int _result = 0;
int _ncontactosseleccionadossinemail = 0;
int _ncontactosseleccionadosconemail = 0;
int _ncontactosemailenviado = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _lstemaddrerr = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbemadderr = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _emailaddress = "";
anywheresoftware.b4a.objects.collections.List _lstpedptes = null;
int _numemailsenviar = 0;
int _intervalo = 0;
anywheresoftware.b4a.objects.collections.List _lstinfodocsenviadoscontacto = null;
anywheresoftware.b4a.objects.collections.List _lstpedptescontacto = null;
String _codigodestinatario = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
anywheresoftware.b4a.objects.collections.Map _mp = null;
boolean _ctaprotec = false;
boolean _rbool = false;
anywheresoftware.b4a.objects.collections.List _lstinfodocsenviadoscomercial = null;
anywheresoftware.b4a.objects.collections.List _lstpedptescomercial = null;
anywheresoftware.b4a.BA.IterableList group83;
int index83;
int groupLen83;
anywheresoftware.b4a.BA.IterableList group110;
int index110;
int groupLen110;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=91095042;
 //BA.debugLineNum = 91095042;BA.debugLine="If txtEmailAlternativo.Text<>\"\" Then";
if (true) break;

case 1:
//if
this.state = 8;
if ((__ref._txtemailalternativo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("") == false) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=91095043;
 //BA.debugLineNum = 91095043;BA.debugLine="If IsEmail(txtEmailAlternativo.Text)=False Then";
if (true) break;

case 4:
//if
this.state = 7;
if (__ref._isemail /*boolean*/ (null,__ref._txtemailalternativo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())==parent.__c.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=91095044;
 //BA.debugLineNum = 91095044;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La dirección";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"La dirección de email "+__ref._txtemailalternativo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()+" no es una dirección de email válida","Aviso");
RDebugUtils.currentLine=91095045;
 //BA.debugLineNum = 91095045;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"), _msa);
this.state = 85;
return;
case 85:
//C
this.state = 7;
;
RDebugUtils.currentLine=91095046;
 //BA.debugLineNum = 91095046;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=91095050;
 //BA.debugLineNum = 91095050;BA.debugLine="Dim sbAviso As StringBuilder";
_sbaviso = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=91095051;
 //BA.debugLineNum = 91095051;BA.debugLine="sbAviso.Initialize";
_sbaviso.Initialize();
RDebugUtils.currentLine=91095052;
 //BA.debugLineNum = 91095052;BA.debugLine="sbAviso.Append(\"¿Enviar los informes para los des";
_sbaviso.Append("¿Enviar los informes para los destinatarios seleccionados?");
RDebugUtils.currentLine=91095053;
 //BA.debugLineNum = 91095053;BA.debugLine="If txtEmailAlternativo.Text<>\"\" Then";
if (true) break;

case 9:
//if
this.state = 14;
if ((__ref._txtemailalternativo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("") == false) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=91095054;
 //BA.debugLineNum = 91095054;BA.debugLine="sbAviso.Append(CRLF).append(CRLF).Append(\"Se ha";
_sbaviso.Append(parent.__c.CRLF).Append(parent.__c.CRLF).Append("Se ha indicado una dirección de email alternativo. Todos los informes seleccionados se enviarán a esa dirección, en lugar del destinatario correspondiente.");
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=91095056;
 //BA.debugLineNum = 91095056;BA.debugLine="sbAviso.Append(CRLF).append(CRLF).Append(\"NO se";
_sbaviso.Append(parent.__c.CRLF).Append(parent.__c.CRLF).Append("NO se ha indicado una dirección de email alternativo. Todos los informes seleccionados se enviarán al destinatario correspondiente.");
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=91095059;
 //BA.debugLineNum = 91095059;BA.debugLine="Dim msa As Object=xui.Msgbox2Async(sbAviso.ToStri";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,_sbaviso.ToString(),"Confirma:","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=91095061;
 //BA.debugLineNum = 91095061;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"), _msa);
this.state = 86;
return;
case 86:
//C
this.state = 15;
_result = (int) result[1];
;
RDebugUtils.currentLine=91095062;
 //BA.debugLineNum = 91095062;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
if (true) break;

case 15:
//if
this.state = 18;
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=91095063;
 //BA.debugLineNum = 91095063;BA.debugLine="Log(\"envío de informes cancelado\")";
parent.__c.LogImpl("891095063","envío de informes cancelado",0);
RDebugUtils.currentLine=91095064;
 //BA.debugLineNum = 91095064;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=91095068;
 //BA.debugLineNum = 91095068;BA.debugLine="lblProgress.Text=\"Generando informes y enviando e";
__ref._lblprogress /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText("Generando informes y enviando emails.");
RDebugUtils.currentLine=91095069;
 //BA.debugLineNum = 91095069;BA.debugLine="lstErrores.Initialize";
__ref._lsterrores /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=91095070;
 //BA.debugLineNum = 91095070;BA.debugLine="Dim nContactosSeleccionadosSinEmail As Int=mSQL.E";
_ncontactosseleccionadossinemail = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select count(Codigo) from tblDestinatarios where Seleccionado=? and Email=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(1),(Object)("")}))));
RDebugUtils.currentLine=91095072;
 //BA.debugLineNum = 91095072;BA.debugLine="Dim nContactosSeleccionadosConEmail As Int=mSQL.E";
_ncontactosseleccionadosconemail = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select count(Codigo) from tblDestinatarios where Seleccionado=? and Email<>?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(1),(Object)("")}))));
RDebugUtils.currentLine=91095074;
 //BA.debugLineNum = 91095074;BA.debugLine="If nContactosSeleccionadosConEmail=0 Then";
if (true) break;

case 19:
//if
this.state = 22;
if (_ncontactosseleccionadosconemail==0) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=91095075;
 //BA.debugLineNum = 91095075;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay selecc";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay seleccionado ningún destinatario para el informe","Aviso");
RDebugUtils.currentLine=91095076;
 //BA.debugLineNum = 91095076;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"), _msa);
this.state = 87;
return;
case 87:
//C
this.state = 22;
;
RDebugUtils.currentLine=91095077;
 //BA.debugLineNum = 91095077;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=91095082;
 //BA.debugLineNum = 91095082;BA.debugLine="Dim nContactosEmailEnviado As Int=mSQL.ExecQueryS";
_ncontactosemailenviado = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select count(Codigo) from tblDestinatarios where Seleccionado=? and Email=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(1),(Object)("")}))));
RDebugUtils.currentLine=91095086;
 //BA.debugLineNum = 91095086;BA.debugLine="If nContactosSeleccionadosSinEmail>0 Then";
if (true) break;

case 23:
//if
this.state = 30;
if (_ncontactosseleccionadossinemail>0) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=91095087;
 //BA.debugLineNum = 91095087;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=91095088;
 //BA.debugLineNum = 91095088;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=91095089;
 //BA.debugLineNum = 91095089;BA.debugLine="sb.Append(\"Hay contactos seleccionados sin direc";
_sb.Append("Hay contactos seleccionados sin dirección de email.");
RDebugUtils.currentLine=91095090;
 //BA.debugLineNum = 91095090;BA.debugLine="sb.Append(CRLF).Append(CRLF)";
_sb.Append(parent.__c.CRLF).Append(parent.__c.CRLF);
RDebugUtils.currentLine=91095091;
 //BA.debugLineNum = 91095091;BA.debugLine="sb.Append(\"¿Continuar sin enviar informe a estos";
_sb.Append("¿Continuar sin enviar informe a estos contactos?");
RDebugUtils.currentLine=91095092;
 //BA.debugLineNum = 91095092;BA.debugLine="sb.Append(CRLF).Append(CRLF)";
_sb.Append(parent.__c.CRLF).Append(parent.__c.CRLF);
RDebugUtils.currentLine=91095093;
 //BA.debugLineNum = 91095093;BA.debugLine="sb.Append(\"(Puedes cancelar esta acción, configu";
_sb.Append("(Puedes cancelar esta acción, configurar la dirección de email en navision, y volver a lanzar el informe.)");
RDebugUtils.currentLine=91095094;
 //BA.debugLineNum = 91095094;BA.debugLine="Dim msa As Object=xui.Msgbox2Async(sb.ToString,\"";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,_sb.ToString(),"Aviso","Sí","Cancelar","",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=91095095;
 //BA.debugLineNum = 91095095;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"), _msa);
this.state = 88;
return;
case 88:
//C
this.state = 26;
_result = (int) result[1];
;
RDebugUtils.currentLine=91095096;
 //BA.debugLineNum = 91095096;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
if (true) break;

case 26:
//if
this.state = 29;
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=91095097;
 //BA.debugLineNum = 91095097;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 29:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=91095102;
 //BA.debugLineNum = 91095102;BA.debugLine="Dim lstEmAddrErr As List";
_lstemaddrerr = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=91095103;
 //BA.debugLineNum = 91095103;BA.debugLine="lstEmAddrErr.Initialize";
_lstemaddrerr.Initialize();
RDebugUtils.currentLine=91095104;
 //BA.debugLineNum = 91095104;BA.debugLine="Dim sbEmAddErr As StringBuilder";
_sbemadderr = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=91095105;
 //BA.debugLineNum = 91095105;BA.debugLine="sbEmAddErr.Initialize";
_sbemadderr.Initialize();
RDebugUtils.currentLine=91095106;
 //BA.debugLineNum = 91095106;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery2(\"select * fro";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2("select * from tblDestinatarios where Seleccionado=? and Email<>?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(1),""}));
RDebugUtils.currentLine=91095107;
 //BA.debugLineNum = 91095107;BA.debugLine="Do While rs.NextRow";
if (true) break;

case 31:
//do while
this.state = 38;
while (_rs.NextRow()) {
this.state = 33;
if (true) break;
}
if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=91095108;
 //BA.debugLineNum = 91095108;BA.debugLine="Dim EmailAddress As String=rs.GetString(\"Email\")";
_emailaddress = _rs.GetString("Email");
RDebugUtils.currentLine=91095109;
 //BA.debugLineNum = 91095109;BA.debugLine="If IsEmail(EmailAddress.Trim)=False Then";
if (true) break;

case 34:
//if
this.state = 37;
if (__ref._isemail /*boolean*/ (null,_emailaddress.trim())==parent.__c.False) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=91095110;
 //BA.debugLineNum = 91095110;BA.debugLine="lstEmAddrErr.Add(EmailAddress)";
_lstemaddrerr.Add((Object)(_emailaddress));
RDebugUtils.currentLine=91095111;
 //BA.debugLineNum = 91095111;BA.debugLine="sbEmAddErr.Append(EmailAddress).Append(\",\")";
_sbemadderr.Append(_emailaddress).Append(",");
 if (true) break;

case 37:
//C
this.state = 31;
;
 if (true) break;

case 38:
//C
this.state = 39;
;
RDebugUtils.currentLine=91095114;
 //BA.debugLineNum = 91095114;BA.debugLine="rs.close";
_rs.Close();
RDebugUtils.currentLine=91095116;
 //BA.debugLineNum = 91095116;BA.debugLine="If lstEmAddrErr.Size>0 Then";
if (true) break;

case 39:
//if
this.state = 42;
if (_lstemaddrerr.getSize()>0) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=91095117;
 //BA.debugLineNum = 91095117;BA.debugLine="sbEmAddErr.Remove(sbEmAddErr.Length-1,sbEmAddErr";
_sbemadderr.Remove((int) (_sbemadderr.getLength()-1),_sbemadderr.getLength());
RDebugUtils.currentLine=91095118;
 //BA.debugLineNum = 91095118;BA.debugLine="Dim msa As Object=xui.Msgbox2Async(\"Las siguient";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"Las siguientes direcciones de email seleccionadas son erróneas."+parent.__c.CRLF+_sbemadderr.ToString()+parent.__c.CRLF+parent.__c.CRLF+"Es necesario corregirlas, o desmarcarlas.","Aviso","Sí","Cancelar","",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=91095119;
 //BA.debugLineNum = 91095119;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La fecha inic";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"La fecha inicial no puede ser posterior a la fecha final","Aviso");
RDebugUtils.currentLine=91095120;
 //BA.debugLineNum = 91095120;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"), _msa);
this.state = 89;
return;
case 89:
//C
this.state = 42;
;
RDebugUtils.currentLine=91095121;
 //BA.debugLineNum = 91095121;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 42:
//C
this.state = 43;
;
RDebugUtils.currentLine=91095124;
 //BA.debugLineNum = 91095124;BA.debugLine="jamCircularProgressBar1.Value=0";
__ref._jamcircularprogressbar1 /*b4j.docU.jamcircularprogressbar*/ ._setvalue /*float*/ (null,(float) (0));
RDebugUtils.currentLine=91095125;
 //BA.debugLineNum = 91095125;BA.debugLine="jamCircularProgressBar1.Visible=True";
__ref._jamcircularprogressbar1 /*b4j.docU.jamcircularprogressbar*/ ._setvisible /*boolean*/ (null,parent.__c.True);
RDebugUtils.currentLine=91095127;
 //BA.debugLineNum = 91095127;BA.debugLine="Select True";
if (true) break;

case 43:
//select
this.state = 78;
switch (BA.switchObjectToInt(parent.__c.True,(__ref._tipodestinatarioinforme /*String*/ ).equals("Clientes"),(__ref._tipodestinatarioinforme /*String*/ ).equals("Comerciales"))) {
case 0: {
this.state = 45;
if (true) break;
}
case 1: {
this.state = 65;
if (true) break;
}
}
if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=91095131;
 //BA.debugLineNum = 91095131;BA.debugLine="Dim lstPedPtes As List";
_lstpedptes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=91095132;
 //BA.debugLineNum = 91095132;BA.debugLine="Dim NumEmailsEnviar As Int=Utilidades.FixNullIn";
_numemailsenviar = parent._utilidades._fixnullint /*int*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select count(*) from tblDestinatarios where Seleccionado=? and Email<>?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(1),""}))));
RDebugUtils.currentLine=91095133;
 //BA.debugLineNum = 91095133;BA.debugLine="Dim Intervalo As Int=Round((100/NumEmailsEnviar";
_intervalo = (int) (parent.__c.Round((100/(double)_numemailsenviar)));
RDebugUtils.currentLine=91095134;
 //BA.debugLineNum = 91095134;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery2(\"select * f";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2("select * from tblDestinatarios where Seleccionado=? and Email<>?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(1),""}));
RDebugUtils.currentLine=91095135;
 //BA.debugLineNum = 91095135;BA.debugLine="Do While rs.NextRow";
if (true) break;

case 46:
//do while
this.state = 63;
while (_rs.NextRow()) {
this.state = 48;
if (true) break;
}
if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=91095137;
 //BA.debugLineNum = 91095137;BA.debugLine="Dim lstInfoDocsEnviadosContacto As List";
_lstinfodocsenviadoscontacto = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=91095138;
 //BA.debugLineNum = 91095138;BA.debugLine="lstInfoDocsEnviadosContacto.Initialize";
_lstinfodocsenviadoscontacto.Initialize();
RDebugUtils.currentLine=91095140;
 //BA.debugLineNum = 91095140;BA.debugLine="Dim lstPedPtesContacto As List";
_lstpedptescontacto = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=91095141;
 //BA.debugLineNum = 91095141;BA.debugLine="lstPedPtesContacto.Initialize";
_lstpedptescontacto.Initialize();
RDebugUtils.currentLine=91095142;
 //BA.debugLineNum = 91095142;BA.debugLine="Dim CodigoDestinatario As String=rs.GetString(";
_codigodestinatario = _rs.GetString("Codigo");
RDebugUtils.currentLine=91095143;
 //BA.debugLineNum = 91095143;BA.debugLine="Wait For (CargaPedidosVentaNoAbiertosPendiente";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"), __ref._cargapedidosventanoabiertospendientescontacto /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_codigodestinatario));
this.state = 90;
return;
case 90:
//C
this.state = 49;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=91095144;
 //BA.debugLineNum = 91095144;BA.debugLine="If mResult.Get(\"ReqOK\")=True Then";
if (true) break;

case 49:
//if
this.state = 56;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.True))) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=91095145;
 //BA.debugLineNum = 91095145;BA.debugLine="Dim lstPedPtes As List=mResult.Get(\"lstPedido";
_lstpedptes = new anywheresoftware.b4a.objects.collections.List();
_lstpedptes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstPedidosPendientesContacto"))));
RDebugUtils.currentLine=91095146;
 //BA.debugLineNum = 91095146;BA.debugLine="For Each mP As Map In lstPedPtes";
if (true) break;

case 52:
//for
this.state = 55;
_mp = new anywheresoftware.b4a.objects.collections.Map();
group83 = _lstpedptes;
index83 = 0;
groupLen83 = group83.getSize();
this.state = 91;
if (true) break;

case 91:
//C
this.state = 55;
if (index83 < groupLen83) {
this.state = 54;
_mp = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group83.Get(index83)));}
if (true) break;

case 92:
//C
this.state = 91;
index83++;
if (true) break;

case 54:
//C
this.state = 92;
RDebugUtils.currentLine=91095147;
 //BA.debugLineNum = 91095147;BA.debugLine="lstPedPtesContacto.Add(mP)";
_lstpedptescontacto.Add((Object)(_mp.getObject()));
 if (true) break;
if (true) break;

case 55:
//C
this.state = 56;
;
 if (true) break;

case 56:
//C
this.state = 57;
;
RDebugUtils.currentLine=91095150;
 //BA.debugLineNum = 91095150;BA.debugLine="Dim CtaProtec As Boolean";
_ctaprotec = false;
RDebugUtils.currentLine=91095151;
 //BA.debugLineNum = 91095151;BA.debugLine="If rs.GetInt(\"ClienteProtec\")=1 Then";
if (true) break;

case 57:
//if
this.state = 62;
if (_rs.GetInt("ClienteProtec")==1) { 
this.state = 59;
}else {
this.state = 61;
}if (true) break;

case 59:
//C
this.state = 62;
RDebugUtils.currentLine=91095152;
 //BA.debugLineNum = 91095152;BA.debugLine="CtaProtec=True";
_ctaprotec = parent.__c.True;
 if (true) break;

case 61:
//C
this.state = 62;
RDebugUtils.currentLine=91095154;
 //BA.debugLineNum = 91095154;BA.debugLine="CtaProtec=False";
_ctaprotec = parent.__c.False;
 if (true) break;

case 62:
//C
this.state = 46;
;
RDebugUtils.currentLine=91095157;
 //BA.debugLineNum = 91095157;BA.debugLine="wait for(ExportarDatosInformeAExcel(CtaProtec,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"), __ref._exportardatosinformeaexcel /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_ctaprotec,_rs.GetString("Codigo"),_rs.GetString("Nombre"),_rs.GetString("Email"),_lstpedptescontacto));
this.state = 93;
return;
case 93:
//C
this.state = 46;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=91095163;
 //BA.debugLineNum = 91095163;BA.debugLine="jamCircularProgressBar1.Value=Min(jamCircularP";
__ref._jamcircularprogressbar1 /*b4j.docU.jamcircularprogressbar*/ ._setvalue /*float*/ (null,(float) (parent.__c.Min(__ref._jamcircularprogressbar1 /*b4j.docU.jamcircularprogressbar*/ ._getvalue /*float*/ (null)+_intervalo,100)));
RDebugUtils.currentLine=91095164;
 //BA.debugLineNum = 91095164;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"),(int) (0));
this.state = 94;
return;
case 94:
//C
this.state = 46;
;
 if (true) break;

case 63:
//C
this.state = 78;
;
RDebugUtils.currentLine=91095166;
 //BA.debugLineNum = 91095166;BA.debugLine="rs.Close";
_rs.Close();
 if (true) break;

case 65:
//C
this.state = 66;
RDebugUtils.currentLine=91095175;
 //BA.debugLineNum = 91095175;BA.debugLine="Dim NumEmailsEnviar As Int=Utilidades.FixNullIn";
_numemailsenviar = parent._utilidades._fixnullint /*int*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select count(*) from tblDestinatarios where Seleccionado=? and Email<>?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(1),""}))));
RDebugUtils.currentLine=91095176;
 //BA.debugLineNum = 91095176;BA.debugLine="Dim Intervalo As Int=Round((100/NumEmailsEnviar";
_intervalo = (int) (parent.__c.Round((100/(double)_numemailsenviar)));
RDebugUtils.currentLine=91095177;
 //BA.debugLineNum = 91095177;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery2(\"select * f";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2("select * from tblDestinatarios where Seleccionado=? and Email<>?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(1),""}));
RDebugUtils.currentLine=91095178;
 //BA.debugLineNum = 91095178;BA.debugLine="Do While rs.NextRow";
if (true) break;

case 66:
//do while
this.state = 77;
while (_rs.NextRow()) {
this.state = 68;
if (true) break;
}
if (true) break;

case 68:
//C
this.state = 69;
RDebugUtils.currentLine=91095181;
 //BA.debugLineNum = 91095181;BA.debugLine="Dim lstInfoDocsEnviadosComercial As List";
_lstinfodocsenviadoscomercial = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=91095182;
 //BA.debugLineNum = 91095182;BA.debugLine="lstInfoDocsEnviadosComercial.Initialize";
_lstinfodocsenviadoscomercial.Initialize();
RDebugUtils.currentLine=91095183;
 //BA.debugLineNum = 91095183;BA.debugLine="Dim lstPedPtesComercial As List";
_lstpedptescomercial = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=91095184;
 //BA.debugLineNum = 91095184;BA.debugLine="lstPedPtesComercial.Initialize";
_lstpedptescomercial.Initialize();
RDebugUtils.currentLine=91095187;
 //BA.debugLineNum = 91095187;BA.debugLine="Wait For (CargaPedidosVentaNoAbiertosPendiente";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"), __ref._cargapedidosventanoabiertospendientescomercial /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_rs.GetString("Codigo")));
this.state = 95;
return;
case 95:
//C
this.state = 69;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=91095188;
 //BA.debugLineNum = 91095188;BA.debugLine="If mResult.Get(\"ReqOK\")=True Then";
if (true) break;

case 69:
//if
this.state = 76;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.True))) { 
this.state = 71;
}if (true) break;

case 71:
//C
this.state = 72;
RDebugUtils.currentLine=91095189;
 //BA.debugLineNum = 91095189;BA.debugLine="Dim lstPedPtes As List=mResult.Get(\"lstPedido";
_lstpedptes = new anywheresoftware.b4a.objects.collections.List();
_lstpedptes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstPedidosPendientesComercial"))));
RDebugUtils.currentLine=91095190;
 //BA.debugLineNum = 91095190;BA.debugLine="For Each mP As Map In lstPedPtes";
if (true) break;

case 72:
//for
this.state = 75;
_mp = new anywheresoftware.b4a.objects.collections.Map();
group110 = _lstpedptes;
index110 = 0;
groupLen110 = group110.getSize();
this.state = 96;
if (true) break;

case 96:
//C
this.state = 75;
if (index110 < groupLen110) {
this.state = 74;
_mp = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group110.Get(index110)));}
if (true) break;

case 97:
//C
this.state = 96;
index110++;
if (true) break;

case 74:
//C
this.state = 97;
RDebugUtils.currentLine=91095191;
 //BA.debugLineNum = 91095191;BA.debugLine="lstPedPtesComercial.Add(mP)";
_lstpedptescomercial.Add((Object)(_mp.getObject()));
 if (true) break;
if (true) break;

case 75:
//C
this.state = 76;
;
 if (true) break;

case 76:
//C
this.state = 66;
;
RDebugUtils.currentLine=91095194;
 //BA.debugLineNum = 91095194;BA.debugLine="wait for(ExportarDatosInformeAExcel(False, rs.";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"), __ref._exportardatosinformeaexcel /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent.__c.False,_rs.GetString("Codigo"),_rs.GetString("Nombre"),_rs.GetString("Email"),_lstpedptescomercial));
this.state = 98;
return;
case 98:
//C
this.state = 66;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=91095196;
 //BA.debugLineNum = 91095196;BA.debugLine="jamCircularProgressBar1.Value=Min(jamCircularP";
__ref._jamcircularprogressbar1 /*b4j.docU.jamcircularprogressbar*/ ._setvalue /*float*/ (null,(float) (parent.__c.Min(__ref._jamcircularprogressbar1 /*b4j.docU.jamcircularprogressbar*/ ._getvalue /*float*/ (null)+_intervalo,100)));
RDebugUtils.currentLine=91095197;
 //BA.debugLineNum = 91095197;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"),(int) (0));
this.state = 99;
return;
case 99:
//C
this.state = 66;
;
 if (true) break;

case 77:
//C
this.state = 78;
;
RDebugUtils.currentLine=91095199;
 //BA.debugLineNum = 91095199;BA.debugLine="rs.Close";
_rs.Close();
 if (true) break;

case 78:
//C
this.state = 79;
;
RDebugUtils.currentLine=91095202;
 //BA.debugLineNum = 91095202;BA.debugLine="lblProgress.Text=\"\"";
__ref._lblprogress /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText("");
RDebugUtils.currentLine=91095203;
 //BA.debugLineNum = 91095203;BA.debugLine="btnInformeErroresUltimoEnvio.Visible=lstErrores.S";
__ref._btninformeerroresultimoenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__ref._lsterrores /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0);
RDebugUtils.currentLine=91095204;
 //BA.debugLineNum = 91095204;BA.debugLine="jamCircularProgressBar1.Value=0";
__ref._jamcircularprogressbar1 /*b4j.docU.jamcircularprogressbar*/ ._setvalue /*float*/ (null,(float) (0));
RDebugUtils.currentLine=91095205;
 //BA.debugLineNum = 91095205;BA.debugLine="jamCircularProgressBar1.Visible=False";
__ref._jamcircularprogressbar1 /*b4j.docU.jamcircularprogressbar*/ ._setvisible /*boolean*/ (null,parent.__c.False);
RDebugUtils.currentLine=91095206;
 //BA.debugLineNum = 91095206;BA.debugLine="If lstErrores.Size>0 Then";
if (true) break;

case 79:
//if
this.state = 84;
if (__ref._lsterrores /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 81;
}else {
this.state = 83;
}if (true) break;

case 81:
//C
this.state = 84;
RDebugUtils.currentLine=91095218;
 //BA.debugLineNum = 91095218;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Proceso ejecu";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Proceso ejecutado con "+BA.NumberToString(__ref._lsterrores /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" errores. Consulta el informe de errores mediante el botón Informe Errores ültimo Envío."+parent.__c.CRLF+parent.__c.CRLF+" IMPORTANTE:Este informe se elimina al ejecutar un nuevo envío o al salir de la aplicación.","Aviso");
RDebugUtils.currentLine=91095220;
 //BA.debugLineNum = 91095220;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"), _msa);
this.state = 100;
return;
case 100:
//C
this.state = 84;
;
 if (true) break;

case 83:
//C
this.state = 84;
RDebugUtils.currentLine=91095223;
 //BA.debugLineNum = 91095223;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Proceso final";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Proceso finalizado sin errores","Aviso");
RDebugUtils.currentLine=91095224;
 //BA.debugLineNum = 91095224;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"), _msa);
this.state = 101;
return;
case 101:
//C
this.state = 84;
;
 if (true) break;

case 84:
//C
this.state = -1;
;
RDebugUtils.currentLine=91095226;
 //BA.debugLineNum = 91095226;BA.debugLine="ActualizarTableViewDestinatarios";
__ref._actualizartableviewdestinatarios /*void*/ (null);
RDebugUtils.currentLine=91095227;
 //BA.debugLineNum = 91095227;BA.debugLine="Wait For ActualizarTableViewDestinatarios_Complet";
parent.__c.WaitFor("actualizartableviewdestinatarios_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"), null);
this.state = 102;
return;
case 102:
//C
this.state = -1;
;
RDebugUtils.currentLine=91095228;
 //BA.debugLineNum = 91095228;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _isemail(b4j.docU.cinformesexpedicionesclientes __ref,String _emailaddress) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "isemail", false))
	 {return ((Boolean) Debug.delegate(ba, "isemail", new Object[] {_emailaddress}));}
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matchemail = null;
RDebugUtils.currentLine=91553792;
 //BA.debugLineNum = 91553792;BA.debugLine="Sub IsEmail(EmailAddress As String) As Boolean";
RDebugUtils.currentLine=91553793;
 //BA.debugLineNum = 91553793;BA.debugLine="Dim MatchEmail As Matcher = Regex.Matcher(\"^(?i)[";
_matchemail = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matchemail = __c.Regex.Matcher("^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$",_emailaddress);
RDebugUtils.currentLine=91553794;
 //BA.debugLineNum = 91553794;BA.debugLine="If MatchEmail.Find = True Then";
if (_matchemail.Find()==__c.True) { 
RDebugUtils.currentLine=91553795;
 //BA.debugLineNum = 91553795;BA.debugLine="Log(MatchEmail.Match)";
__c.LogImpl("891553795",_matchemail.getMatch(),0);
RDebugUtils.currentLine=91553797;
 //BA.debugLineNum = 91553797;BA.debugLine="Return True";
if (true) return __c.True;
 }else {
RDebugUtils.currentLine=91553799;
 //BA.debugLineNum = 91553799;BA.debugLine="Log(\"Oops, please double check your email addres";
__c.LogImpl("891553799","Oops, please double check your email address",0);
RDebugUtils.currentLine=91553800;
 //BA.debugLineNum = 91553800;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=91553802;
 //BA.debugLineNum = 91553802;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargapedidosventanoabiertospendientescontacto(b4j.docU.cinformesexpedicionesclientes __ref,String _contacto) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "cargapedidosventanoabiertospendientescontacto", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargapedidosventanoabiertospendientescontacto", new Object[] {_contacto}));}
ResumableSub_CargaPedidosVentaNoAbiertosPendientesContacto rsub = new ResumableSub_CargaPedidosVentaNoAbiertosPendientesContacto(this,__ref,_contacto);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaPedidosVentaNoAbiertosPendientesContacto extends BA.ResumableSub {
public ResumableSub_CargaPedidosVentaNoAbiertosPendientesContacto(b4j.docU.cinformesexpedicionesclientes parent,b4j.docU.cinformesexpedicionesclientes __ref,String _contacto) {
this.parent = parent;
this.__ref = __ref;
this._contacto = _contacto;
this.__ref = parent;
}
b4j.docU.cinformesexpedicionesclientes __ref;
b4j.docU.cinformesexpedicionesclientes parent;
String _contacto;
anywheresoftware.b4a.objects.collections.List _lstpedidospendientescontacto = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
b4j.docU.dbrequestmanager _req = null;
b4j.docU.main._dbcommand _cmd = null;
b4j.docU.httpjob _j = null;
b4j.docU.main._dbresult _res = null;
Object[] _records = null;
anywheresoftware.b4a.objects.collections.Map _mped = null;
int _i = 0;
anywheresoftware.b4a.BA.IterableList group18;
int index18;
int groupLen18;
int step21;
int limit21;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=91160577;
 //BA.debugLineNum = 91160577;BA.debugLine="Dim lstPedidosPendientesContacto As List";
_lstpedidospendientescontacto = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=91160578;
 //BA.debugLineNum = 91160578;BA.debugLine="lstPedidosPendientesContacto.Initialize";
_lstpedidospendientescontacto.Initialize();
RDebugUtils.currentLine=91160579;
 //BA.debugLineNum = 91160579;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=91160580;
 //BA.debugLineNum = 91160580;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=91160581;
 //BA.debugLineNum = 91160581;BA.debugLine="m.Put(\"ConnOK\",False)";
_m.Put((Object)("ConnOK"),(Object)(parent.__c.False));
RDebugUtils.currentLine=91160582;
 //BA.debugLineNum = 91160582;BA.debugLine="m.Put(\"ReqOK\",False)";
_m.Put((Object)("ReqOK"),(Object)(parent.__c.False));
RDebugUtils.currentLine=91160583;
 //BA.debugLineNum = 91160583;BA.debugLine="m.Put(\"lstPedidosPendientesContacto\",lstPedidosPe";
_m.Put((Object)("lstPedidosPendientesContacto"),(Object)(_lstpedidospendientescontacto.getObject()));
RDebugUtils.currentLine=91160584;
 //BA.debugLineNum = 91160584;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.WAIT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT);
RDebugUtils.currentLine=91160585;
 //BA.debugLineNum = 91160585;BA.debugLine="Dim Req As DBRequestManager = CreateRequestNav";
_req = __ref._createrequestnav /*b4j.docU.dbrequestmanager*/ (null);
RDebugUtils.currentLine=91160586;
 //BA.debugLineNum = 91160586;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"InfoPedidos";
_cmd = __ref._createcommand /*b4j.docU.main._dbcommand*/ (null,"InfoPedidosVentaNoAbiertosPendientesContacto",new Object[]{(Object)(_contacto)});
RDebugUtils.currentLine=91160587;
 //BA.debugLineNum = 91160587;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "cargapedidosventanoabiertospendientescontacto"), (Object)(_req._executequery /*b4j.docU.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=91160588;
 //BA.debugLineNum = 91160588;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 20;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=91160589;
 //BA.debugLineNum = 91160589;BA.debugLine="m.Put(\"ConnOK\",True)";
_m.Put((Object)("ConnOK"),(Object)(parent.__c.True));
RDebugUtils.currentLine=91160590;
 //BA.debugLineNum = 91160590;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=91160591;
 //BA.debugLineNum = 91160591;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "cargapedidosventanoabiertospendientescontacto"), (Object)(_req));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_res = (b4j.docU.main._dbresult) result[1];
;
RDebugUtils.currentLine=91160592;
 //BA.debugLineNum = 91160592;BA.debugLine="If res.Rows.Size>0 Then";
if (true) break;

case 4:
//if
this.state = 17;
if (_res.Rows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 6;
}else {
this.state = 16;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=91160593;
 //BA.debugLineNum = 91160593;BA.debugLine="m.Put(\"ReqOK\",True)";
_m.Put((Object)("ReqOK"),(Object)(parent.__c.True));
RDebugUtils.currentLine=91160594;
 //BA.debugLineNum = 91160594;BA.debugLine="For Each records() As Object In res.Rows";
if (true) break;

case 7:
//for
this.state = 14;
group18 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index18 = 0;
groupLen18 = group18.getSize();
this.state = 23;
if (true) break;

case 23:
//C
this.state = 14;
if (index18 < groupLen18) {
this.state = 9;
_records = (Object[])(group18.Get(index18));}
if (true) break;

case 24:
//C
this.state = 23;
index18++;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=91160595;
 //BA.debugLineNum = 91160595;BA.debugLine="Dim mPed As Map";
_mped = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=91160596;
 //BA.debugLineNum = 91160596;BA.debugLine="mPed.Initialize";
_mped.Initialize();
RDebugUtils.currentLine=91160597;
 //BA.debugLineNum = 91160597;BA.debugLine="For i=0 To  res.Columns.Size-1";
if (true) break;

case 10:
//for
this.state = 13;
step21 = 1;
limit21 = (int) (_res.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
_i = (int) (0) ;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 13;
if ((step21 > 0 && _i <= limit21) || (step21 < 0 && _i >= limit21)) this.state = 12;
if (true) break;

case 26:
//C
this.state = 25;
_i = ((int)(0 + _i + step21)) ;
if (true) break;

case 12:
//C
this.state = 26;
RDebugUtils.currentLine=91160599;
 //BA.debugLineNum = 91160599;BA.debugLine="mPed.Put(res.Columns.GetKeyAt(i),records(i))";
_mped.Put(_res.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .GetKeyAt(_i),_records[_i]);
 if (true) break;
if (true) break;

case 13:
//C
this.state = 24;
;
RDebugUtils.currentLine=91160604;
 //BA.debugLineNum = 91160604;BA.debugLine="lstPedidosPendientesContacto.Add(mPed)";
_lstpedidospendientescontacto.Add((Object)(_mped.getObject()));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 17;
;
 if (true) break;

case 16:
//C
this.state = 17;
 if (true) break;

case 17:
//C
this.state = 20;
;
RDebugUtils.currentLine=91160609;
 //BA.debugLineNum = 91160609;BA.debugLine="m.Put(\"lstPedidosPendientesContacto\",lstPedidosP";
_m.Put((Object)("lstPedidosPendientesContacto"),(Object)(_lstpedidospendientescontacto.getObject()));
 if (true) break;

case 19:
//C
this.state = 20;
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=91160613;
 //BA.debugLineNum = 91160613;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=91160614;
 //BA.debugLineNum = 91160614;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.DEFAULT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT);
RDebugUtils.currentLine=91160615;
 //BA.debugLineNum = 91160615;BA.debugLine="Return m";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_m));return;};
RDebugUtils.currentLine=91160616;
 //BA.debugLineNum = 91160616;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _exportardatosinformeaexcel(b4j.docU.cinformesexpedicionesclientes __ref,boolean _cuentaprotec,String _codigocontacto,String _nombrecontacto,String _emailcontacto,anywheresoftware.b4a.objects.collections.List _lstpedidospendientesdestinatario) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "exportardatosinformeaexcel", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "exportardatosinformeaexcel", new Object[] {_cuentaprotec,_codigocontacto,_nombrecontacto,_emailcontacto,_lstpedidospendientesdestinatario}));}
ResumableSub_ExportarDatosInformeAExcel rsub = new ResumableSub_ExportarDatosInformeAExcel(this,__ref,_cuentaprotec,_codigocontacto,_nombrecontacto,_emailcontacto,_lstpedidospendientesdestinatario);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ExportarDatosInformeAExcel extends BA.ResumableSub {
public ResumableSub_ExportarDatosInformeAExcel(b4j.docU.cinformesexpedicionesclientes parent,b4j.docU.cinformesexpedicionesclientes __ref,boolean _cuentaprotec,String _codigocontacto,String _nombrecontacto,String _emailcontacto,anywheresoftware.b4a.objects.collections.List _lstpedidospendientesdestinatario) {
this.parent = parent;
this.__ref = __ref;
this._cuentaprotec = _cuentaprotec;
this._codigocontacto = _codigocontacto;
this._nombrecontacto = _nombrecontacto;
this._emailcontacto = _emailcontacto;
this._lstpedidospendientesdestinatario = _lstpedidospendientesdestinatario;
this.__ref = parent;
}
b4j.docU.cinformesexpedicionesclientes __ref;
b4j.docU.cinformesexpedicionesclientes parent;
boolean _cuentaprotec;
String _codigocontacto;
String _nombrecontacto;
String _emailcontacto;
anywheresoftware.b4a.objects.collections.List _lstpedidospendientesdestinatario;
String _nombreinforme = "";
boolean _result = false;
String _fechahorageneracioninforme = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
boolean _rbool = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=91291649;
 //BA.debugLineNum = 91291649;BA.debugLine="If txtEmailAlternativo.Text<>\"\" Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((__ref._txtemailalternativo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("") == false) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=91291650;
 //BA.debugLineNum = 91291650;BA.debugLine="Dim NombreInforme As String=\"Informe Expedicione";
_nombreinforme = "Informe Expediciones - Pedidos Pendientes "+__ref._periodoinforme /*String*/ +"  "+_nombrecontacto;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=91291652;
 //BA.debugLineNum = 91291652;BA.debugLine="Dim NombreInforme As String=\"Informe Expedicione";
_nombreinforme = "Informe Expediciones - Pedidos Pendientes "+__ref._periodoinforme /*String*/ ;
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=91291655;
 //BA.debugLineNum = 91291655;BA.debugLine="Dim result As Boolean=CrearInformeExcel(NombreInf";
_result = __ref._crearinformeexcel /*boolean*/ (null,_nombreinforme,_codigocontacto,_nombrecontacto,__ref._lstinfodocumentos /*anywheresoftware.b4a.objects.collections.List*/ ,_lstpedidospendientesdestinatario);
RDebugUtils.currentLine=91291656;
 //BA.debugLineNum = 91291656;BA.debugLine="If result Then";
if (true) break;

case 7:
//if
this.state = 16;
if (_result) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=91291657;
 //BA.debugLineNum = 91291657;BA.debugLine="Dim FechaHoraGeneracionInforme As String";
_fechahorageneracioninforme = "";
RDebugUtils.currentLine=91291658;
 //BA.debugLineNum = 91291658;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy HH:mm:ss\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy HH:mm:ss");
RDebugUtils.currentLine=91291659;
 //BA.debugLineNum = 91291659;BA.debugLine="FechaHoraGeneracionInforme=DateTime.Date(DateTim";
_fechahorageneracioninforme = parent.__c.DateTime.Date(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=91291660;
 //BA.debugLineNum = 91291660;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=91291661;
 //BA.debugLineNum = 91291661;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=91291662;
 //BA.debugLineNum = 91291662;BA.debugLine="Select True";
if (true) break;

case 10:
//select
this.state = 15;
switch (BA.switchObjectToInt(parent.__c.True,(__ref._tipodestinatarioinforme /*String*/ ).equals("Clientes"),(__ref._tipodestinatarioinforme /*String*/ ).equals("Comerciales"))) {
case 0: {
this.state = 12;
if (true) break;
}
case 1: {
this.state = 14;
if (true) break;
}
}
if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=91291665;
 //BA.debugLineNum = 91291665;BA.debugLine="sb.Append(\"Estimado cliente,\")";
_sb.Append("Estimado cliente,");
RDebugUtils.currentLine=91291666;
 //BA.debugLineNum = 91291666;BA.debugLine="sb.Append(CRLF).Append(CRLF)";
_sb.Append(parent.__c.CRLF).Append(parent.__c.CRLF);
RDebugUtils.currentLine=91291667;
 //BA.debugLineNum = 91291667;BA.debugLine="sb.Append(\"En la tabla adjunta se incluye la s";
_sb.Append("En la tabla adjunta se incluye la siguiente información:");
RDebugUtils.currentLine=91291668;
 //BA.debugLineNum = 91291668;BA.debugLine="sb.Append(CRLF).Append(CRLF)";
_sb.Append(parent.__c.CRLF).Append(parent.__c.CRLF);
RDebugUtils.currentLine=91291669;
 //BA.debugLineNum = 91291669;BA.debugLine="sb.Append(\"1) Datos relativos a las expedicion";
_sb.Append("1) Datos relativos a las expediciones del periodo indicado en el asunto del mensaje.");
RDebugUtils.currentLine=91291670;
 //BA.debugLineNum = 91291670;BA.debugLine="sb.Append(CRLF).Append(CRLF)";
_sb.Append(parent.__c.CRLF).Append(parent.__c.CRLF);
RDebugUtils.currentLine=91291671;
 //BA.debugLineNum = 91291671;BA.debugLine="sb.Append(\"2) Datos relativos a los pedidos pe";
_sb.Append("2) Datos relativos a los pedidos pendientes. Estos se se refieren al momento de generación de este informe ("+_fechahorageneracioninforme+")");
RDebugUtils.currentLine=91291672;
 //BA.debugLineNum = 91291672;BA.debugLine="sb.Append(CRLF).Append(CRLF)";
_sb.Append(parent.__c.CRLF).Append(parent.__c.CRLF);
RDebugUtils.currentLine=91291673;
 //BA.debugLineNum = 91291673;BA.debugLine="sb.Append(\"Saludos\")";
_sb.Append("Saludos");
RDebugUtils.currentLine=91291674;
 //BA.debugLineNum = 91291674;BA.debugLine="sb.Append(CRLF).Append(CRLF).Append(CRLF)";
_sb.Append(parent.__c.CRLF).Append(parent.__c.CRLF).Append(parent.__c.CRLF);
RDebugUtils.currentLine=91291675;
 //BA.debugLineNum = 91291675;BA.debugLine="sb.Append(\"Este correo ha sido enviado desde u";
_sb.Append("Este correo ha sido enviado desde una dirección de e-mail que no acepta correos entrantes. Por favor, no responda a este e-mail.").Append(parent.__c.CRLF);
RDebugUtils.currentLine=91291676;
 //BA.debugLineNum = 91291676;BA.debugLine="sb.Append(\"En caso de duda, por favor contacte";
_sb.Append("En caso de duda, por favor contacte con su responsable de cuenta, indicado en la excel.");
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=91291678;
 //BA.debugLineNum = 91291678;BA.debugLine="sb.Append(\"En la tabla adjunta se incluye la s";
_sb.Append("En la tabla adjunta se incluye la siguiente información:");
RDebugUtils.currentLine=91291679;
 //BA.debugLineNum = 91291679;BA.debugLine="sb.Append(CRLF).Append(CRLF)";
_sb.Append(parent.__c.CRLF).Append(parent.__c.CRLF);
RDebugUtils.currentLine=91291680;
 //BA.debugLineNum = 91291680;BA.debugLine="sb.Append(\"1) Datos relativos a las expedicion";
_sb.Append("1) Datos relativos a las expediciones del periodo indicado en el asunto del mensaje.");
RDebugUtils.currentLine=91291681;
 //BA.debugLineNum = 91291681;BA.debugLine="sb.Append(CRLF).Append(CRLF)";
_sb.Append(parent.__c.CRLF).Append(parent.__c.CRLF);
RDebugUtils.currentLine=91291682;
 //BA.debugLineNum = 91291682;BA.debugLine="sb.Append(\"2) Datos relativos a los pedidos pe";
_sb.Append("2) Datos relativos a los pedidos pendientes. Estos se se refieren al momento de generación de este informe ("+_fechahorageneracioninforme+")");
RDebugUtils.currentLine=91291683;
 //BA.debugLineNum = 91291683;BA.debugLine="sb.Append(CRLF).Append(CRLF).Append(CRLF)";
_sb.Append(parent.__c.CRLF).Append(parent.__c.CRLF).Append(parent.__c.CRLF);
RDebugUtils.currentLine=91291684;
 //BA.debugLineNum = 91291684;BA.debugLine="sb.Append(\"Este correo ha sido enviado desde u";
_sb.Append("Este correo ha sido enviado desde una dirección de e-mail que no acepta correos entrantes. Por favor, no responda a este e-mail.").Append(parent.__c.CRLF);
RDebugUtils.currentLine=91291685;
 //BA.debugLineNum = 91291685;BA.debugLine="sb.Append(\"En caso de duda, por favor contacte";
_sb.Append("En caso de duda, por favor contacte con su responsable de cuenta, indicado en la excel.");
 if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=91291687;
 //BA.debugLineNum = 91291687;BA.debugLine="DateTime.DateFormat=\"dd/MM/yy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yy");
RDebugUtils.currentLine=91291688;
 //BA.debugLineNum = 91291688;BA.debugLine="wait for (EnviarEmailContacto(CuentaProtec, Codi";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "exportardatosinformeaexcel"), __ref._enviaremailcontacto /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_cuentaprotec,_codigocontacto,_nombrecontacto,_emailcontacto.trim(),_nombreinforme,_sb.ToString(),parent.__c.File.DirData("Expediciones"),_nombreinforme+".xlsx"));
this.state = 17;
return;
case 17:
//C
this.state = 16;
_rbool = (boolean) result[1];
;
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=91291692;
 //BA.debugLineNum = 91291692;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=91291693;
 //BA.debugLineNum = 91291693;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargapedidosventanoabiertospendientescomercial(b4j.docU.cinformesexpedicionesclientes __ref,String _comercial) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "cargapedidosventanoabiertospendientescomercial", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargapedidosventanoabiertospendientescomercial", new Object[] {_comercial}));}
ResumableSub_CargaPedidosVentaNoAbiertosPendientesComercial rsub = new ResumableSub_CargaPedidosVentaNoAbiertosPendientesComercial(this,__ref,_comercial);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaPedidosVentaNoAbiertosPendientesComercial extends BA.ResumableSub {
public ResumableSub_CargaPedidosVentaNoAbiertosPendientesComercial(b4j.docU.cinformesexpedicionesclientes parent,b4j.docU.cinformesexpedicionesclientes __ref,String _comercial) {
this.parent = parent;
this.__ref = __ref;
this._comercial = _comercial;
this.__ref = parent;
}
b4j.docU.cinformesexpedicionesclientes __ref;
b4j.docU.cinformesexpedicionesclientes parent;
String _comercial;
anywheresoftware.b4a.objects.collections.List _lstpedidospendientescomercial = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
b4j.docU.dbrequestmanager _req = null;
b4j.docU.main._dbcommand _cmd = null;
b4j.docU.httpjob _j = null;
b4j.docU.main._dbresult _res = null;
Object[] _records = null;
anywheresoftware.b4a.objects.collections.Map _mped = null;
int _i = 0;
anywheresoftware.b4a.BA.IterableList group18;
int index18;
int groupLen18;
int step21;
int limit21;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=91226113;
 //BA.debugLineNum = 91226113;BA.debugLine="Dim lstPedidosPendientesComercial As List";
_lstpedidospendientescomercial = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=91226114;
 //BA.debugLineNum = 91226114;BA.debugLine="lstPedidosPendientesComercial.Initialize";
_lstpedidospendientescomercial.Initialize();
RDebugUtils.currentLine=91226115;
 //BA.debugLineNum = 91226115;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=91226116;
 //BA.debugLineNum = 91226116;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=91226117;
 //BA.debugLineNum = 91226117;BA.debugLine="m.Put(\"ConnOK\",False)";
_m.Put((Object)("ConnOK"),(Object)(parent.__c.False));
RDebugUtils.currentLine=91226118;
 //BA.debugLineNum = 91226118;BA.debugLine="m.Put(\"ReqOK\",False)";
_m.Put((Object)("ReqOK"),(Object)(parent.__c.False));
RDebugUtils.currentLine=91226119;
 //BA.debugLineNum = 91226119;BA.debugLine="m.Put(\"lstPedidosPendientesComercial\",lstPedidosP";
_m.Put((Object)("lstPedidosPendientesComercial"),(Object)(_lstpedidospendientescomercial.getObject()));
RDebugUtils.currentLine=91226120;
 //BA.debugLineNum = 91226120;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.WAIT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT);
RDebugUtils.currentLine=91226121;
 //BA.debugLineNum = 91226121;BA.debugLine="Dim Req As DBRequestManager = CreateRequestNav";
_req = __ref._createrequestnav /*b4j.docU.dbrequestmanager*/ (null);
RDebugUtils.currentLine=91226123;
 //BA.debugLineNum = 91226123;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"InfoPedidos";
_cmd = __ref._createcommand /*b4j.docU.main._dbcommand*/ (null,"InfoPedidosVentaTransferenciaPendientesVendedor",new Object[]{(Object)(_comercial)});
RDebugUtils.currentLine=91226124;
 //BA.debugLineNum = 91226124;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "cargapedidosventanoabiertospendientescomercial"), (Object)(_req._executequery /*b4j.docU.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=91226125;
 //BA.debugLineNum = 91226125;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 20;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=91226126;
 //BA.debugLineNum = 91226126;BA.debugLine="m.Put(\"ConnOK\",True)";
_m.Put((Object)("ConnOK"),(Object)(parent.__c.True));
RDebugUtils.currentLine=91226127;
 //BA.debugLineNum = 91226127;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=91226128;
 //BA.debugLineNum = 91226128;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "cargapedidosventanoabiertospendientescomercial"), (Object)(_req));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_res = (b4j.docU.main._dbresult) result[1];
;
RDebugUtils.currentLine=91226129;
 //BA.debugLineNum = 91226129;BA.debugLine="If res.Rows.Size>0 Then";
if (true) break;

case 4:
//if
this.state = 17;
if (_res.Rows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 6;
}else {
this.state = 16;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=91226130;
 //BA.debugLineNum = 91226130;BA.debugLine="m.Put(\"ReqOK\",True)";
_m.Put((Object)("ReqOK"),(Object)(parent.__c.True));
RDebugUtils.currentLine=91226131;
 //BA.debugLineNum = 91226131;BA.debugLine="For Each records() As Object In res.Rows";
if (true) break;

case 7:
//for
this.state = 14;
group18 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index18 = 0;
groupLen18 = group18.getSize();
this.state = 23;
if (true) break;

case 23:
//C
this.state = 14;
if (index18 < groupLen18) {
this.state = 9;
_records = (Object[])(group18.Get(index18));}
if (true) break;

case 24:
//C
this.state = 23;
index18++;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=91226132;
 //BA.debugLineNum = 91226132;BA.debugLine="Dim mPed As Map";
_mped = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=91226133;
 //BA.debugLineNum = 91226133;BA.debugLine="mPed.Initialize";
_mped.Initialize();
RDebugUtils.currentLine=91226134;
 //BA.debugLineNum = 91226134;BA.debugLine="For i=0 To  res.Columns.Size-1";
if (true) break;

case 10:
//for
this.state = 13;
step21 = 1;
limit21 = (int) (_res.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
_i = (int) (0) ;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 13;
if ((step21 > 0 && _i <= limit21) || (step21 < 0 && _i >= limit21)) this.state = 12;
if (true) break;

case 26:
//C
this.state = 25;
_i = ((int)(0 + _i + step21)) ;
if (true) break;

case 12:
//C
this.state = 26;
RDebugUtils.currentLine=91226135;
 //BA.debugLineNum = 91226135;BA.debugLine="Log(res.Columns.GetKeyAt(i))";
parent.__c.LogImpl("891226135",BA.ObjectToString(_res.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .GetKeyAt(_i)),0);
RDebugUtils.currentLine=91226136;
 //BA.debugLineNum = 91226136;BA.debugLine="mPed.Put(res.Columns.GetKeyAt(i),records(i))";
_mped.Put(_res.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .GetKeyAt(_i),_records[_i]);
 if (true) break;
if (true) break;

case 13:
//C
this.state = 24;
;
RDebugUtils.currentLine=91226141;
 //BA.debugLineNum = 91226141;BA.debugLine="lstPedidosPendientesComercial.Add(mPed)";
_lstpedidospendientescomercial.Add((Object)(_mped.getObject()));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 17;
;
 if (true) break;

case 16:
//C
this.state = 17;
 if (true) break;

case 17:
//C
this.state = 20;
;
RDebugUtils.currentLine=91226146;
 //BA.debugLineNum = 91226146;BA.debugLine="m.Put(\"lstPedidosPendientesComercial\",lstPedidos";
_m.Put((Object)("lstPedidosPendientesComercial"),(Object)(_lstpedidospendientescomercial.getObject()));
 if (true) break;

case 19:
//C
this.state = 20;
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=91226150;
 //BA.debugLineNum = 91226150;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=91226151;
 //BA.debugLineNum = 91226151;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.DEFAULT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT);
RDebugUtils.currentLine=91226152;
 //BA.debugLineNum = 91226152;BA.debugLine="Return m";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_m));return;};
RDebugUtils.currentLine=91226153;
 //BA.debugLineNum = 91226153;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btninformeerroresultimoenvio_click(b4j.docU.cinformesexpedicionesclientes __ref) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "btninformeerroresultimoenvio_click", false))
	 {Debug.delegate(ba, "btninformeerroresultimoenvio_click", null); return;}
ResumableSub_btnInformeErroresUltimoEnvio_Click rsub = new ResumableSub_btnInformeErroresUltimoEnvio_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnInformeErroresUltimoEnvio_Click extends BA.ResumableSub {
public ResumableSub_btnInformeErroresUltimoEnvio_Click(b4j.docU.cinformesexpedicionesclientes parent,b4j.docU.cinformesexpedicionesclientes __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cinformesexpedicionesclientes __ref;
b4j.docU.cinformesexpedicionesclientes parent;
Object _msa = null;
String _userfolder = "";
String _dateformatant = "";
String _timeformatant = "";
anywheresoftware.b4j.objects.FileChooserWrapper _fch = null;
String _nombrefichero = "";
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=91684865;
 //BA.debugLineNum = 91684865;BA.debugLine="If lstErrores.Size=0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._lsterrores /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=91684866;
 //BA.debugLineNum = 91684866;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos de errores del último envío de correos.","Aviso");
RDebugUtils.currentLine=91684867;
 //BA.debugLineNum = 91684867;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "btninformeerroresultimoenvio_click"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 4;
;
RDebugUtils.currentLine=91684868;
 //BA.debugLineNum = 91684868;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=91684871;
 //BA.debugLineNum = 91684871;BA.debugLine="Dim UserFolder As String=FindUserDocumentsFolder";
_userfolder = __ref._finduserdocumentsfolder /*String*/ (null);
RDebugUtils.currentLine=91684873;
 //BA.debugLineNum = 91684873;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=91684874;
 //BA.debugLineNum = 91684874;BA.debugLine="DateTime.DateFormat=\"dd-MM-yyy\"";
parent.__c.DateTime.setDateFormat("dd-MM-yyy");
RDebugUtils.currentLine=91684875;
 //BA.debugLineNum = 91684875;BA.debugLine="Dim TimeFormatAnt As String=DateTime.TimeFormat";
_timeformatant = parent.__c.DateTime.getTimeFormat();
RDebugUtils.currentLine=91684876;
 //BA.debugLineNum = 91684876;BA.debugLine="DateTime.Timeformat=\"HH-mm-ss\"";
parent.__c.DateTime.setTimeFormat("HH-mm-ss");
RDebugUtils.currentLine=91684878;
 //BA.debugLineNum = 91684878;BA.debugLine="Dim fCH As FileChooser";
_fch = new anywheresoftware.b4j.objects.FileChooserWrapper();
RDebugUtils.currentLine=91684879;
 //BA.debugLineNum = 91684879;BA.debugLine="fCH.Initialize";
_fch.Initialize();
RDebugUtils.currentLine=91684880;
 //BA.debugLineNum = 91684880;BA.debugLine="fCH.InitialDirectory=UserFolder";
_fch.setInitialDirectory(_userfolder);
RDebugUtils.currentLine=91684881;
 //BA.debugLineNum = 91684881;BA.debugLine="fCH.InitialFileName=$\"ErroresEnvioEmail $DateTime";
_fch.setInitialFileName(("ErroresEnvioEmail "+parent.__c.SmartStringFormatter("datetime",(Object)(parent.__c.DateTime.getNow()))+""));
RDebugUtils.currentLine=91684882;
 //BA.debugLineNum = 91684882;BA.debugLine="fCH.SetExtensionFilter(\"Ficheros Excel\",Array As";
_fch.SetExtensionFilter("Ficheros Excel",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"*.xlsx"}));
RDebugUtils.currentLine=91684883;
 //BA.debugLineNum = 91684883;BA.debugLine="Dim NombreFichero As String=fCH.ShowSave(frm)";
_nombrefichero = _fch.ShowSave(__ref._frm /*anywheresoftware.b4j.objects.Form*/ );
RDebugUtils.currentLine=91684884;
 //BA.debugLineNum = 91684884;BA.debugLine="If NombreFichero=\"\" Then Return";
if (true) break;

case 5:
//if
this.state = 10;
if ((_nombrefichero).equals("")) { 
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
RDebugUtils.currentLine=91684901;
 //BA.debugLineNum = 91684901;BA.debugLine="wait for(CreateWorkbook(NombreFichero)) complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "btninformeerroresultimoenvio_click"), __ref._createworkbook /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_nombrefichero));
this.state = 16;
return;
case 16:
//C
this.state = 11;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=91684902;
 //BA.debugLineNum = 91684902;BA.debugLine="If Success=False Then";
if (true) break;

case 11:
//if
this.state = 14;
if (_success==parent.__c.False) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=91684903;
 //BA.debugLineNum = 91684903;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error generan";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error generando fichero excel.","Error");
RDebugUtils.currentLine=91684904;
 //BA.debugLineNum = 91684904;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "btninformeerroresultimoenvio_click"), _msa);
this.state = 17;
return;
case 17:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=91684907;
 //BA.debugLineNum = 91684907;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=91684908;
 //BA.debugLineNum = 91684908;BA.debugLine="DateTime.Timeformat=TimeFormatAnt";
parent.__c.DateTime.setTimeFormat(_timeformatant);
RDebugUtils.currentLine=91684909;
 //BA.debugLineNum = 91684909;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _finduserdocumentsfolder(b4j.docU.cinformesexpedicionesclientes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "finduserdocumentsfolder", false))
	 {return ((String) Debug.delegate(ba, "finduserdocumentsfolder", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _fs = null;
RDebugUtils.currentLine=91750400;
 //BA.debugLineNum = 91750400;BA.debugLine="Sub FindUserDocumentsFolder As String";
RDebugUtils.currentLine=91750401;
 //BA.debugLineNum = 91750401;BA.debugLine="If DetectOS = \"windows\" Then";
if ((__ref._detectos /*String*/ (null)).equals("windows")) { 
RDebugUtils.currentLine=91750402;
 //BA.debugLineNum = 91750402;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=91750403;
 //BA.debugLineNum = 91750403;BA.debugLine="Dim fs As JavaObject = jo.InitializeStatic(\"java";
_fs = new anywheresoftware.b4j.object.JavaObject();
_fs = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.InitializeStatic("javax.swing.filechooser.FileSystemView").RunMethod("getFileSystemView",(Object[])(__c.Null))));
RDebugUtils.currentLine=91750404;
 //BA.debugLineNum = 91750404;BA.debugLine="Return fs.RunMethodJO(\"getDefaultDirectory\", Nul";
if (true) return BA.ObjectToString(_fs.RunMethodJO("getDefaultDirectory",(Object[])(__c.Null)).RunMethod("getPath",(Object[])(__c.Null)));
 }else {
RDebugUtils.currentLine=91750406;
 //BA.debugLineNum = 91750406;BA.debugLine="Return GetSystemProperty(\"user.home\", \"\") & \"/Do";
if (true) return __c.GetSystemProperty("user.home","")+"/Documents";
 };
RDebugUtils.currentLine=91750408;
 //BA.debugLineNum = 91750408;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _createworkbook(b4j.docU.cinformesexpedicionesclientes __ref,String _rutafichero) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "createworkbook", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "createworkbook", new Object[] {_rutafichero}));}
ResumableSub_CreateWorkbook rsub = new ResumableSub_CreateWorkbook(this,__ref,_rutafichero);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CreateWorkbook extends BA.ResumableSub {
public ResumableSub_CreateWorkbook(b4j.docU.cinformesexpedicionesclientes parent,b4j.docU.cinformesexpedicionesclientes __ref,String _rutafichero) {
this.parent = parent;
this.__ref = __ref;
this._rutafichero = _rutafichero;
this.__ref = parent;
}
b4j.docU.cinformesexpedicionesclientes __ref;
b4j.docU.cinformesexpedicionesclientes parent;
String _rutafichero;
b4j.docU.xlutils _xl = null;
b4j.docU.xlworkbookwriter _workbook = null;
b4j.docU.xlsheetwriter _sheet1 = null;
b4j.docU.xlstyle _titlestyle = null;
int _i = 0;
b4j.docU.main._errorprocesoinformecliente _e = null;
int _col0 = 0;
String _f = "";
boolean _success = false;
anywheresoftware.b4a.BA.IterableList group16;
int index16;
int groupLen16;
int step29;
int limit29;
int step32;
int limit32;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=91881473;
 //BA.debugLineNum = 91881473;BA.debugLine="Dim xl As XLUtils";
_xl = new b4j.docU.xlutils();
RDebugUtils.currentLine=91881474;
 //BA.debugLineNum = 91881474;BA.debugLine="xl.Initialize";
_xl._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=91881475;
 //BA.debugLineNum = 91881475;BA.debugLine="Dim Workbook As XLWorkbookWriter = xl.CreateWrite";
_workbook = _xl._createwriterblank /*b4j.docU.xlworkbookwriter*/ (null);
RDebugUtils.currentLine=91881476;
 //BA.debugLineNum = 91881476;BA.debugLine="Dim sheet1 As XLSheetWriter = Workbook.CreateShee";
_sheet1 = _workbook._createsheetwriterbyname /*b4j.docU.xlsheetwriter*/ (null,"Sheet1");
RDebugUtils.currentLine=91881477;
 //BA.debugLineNum = 91881477;BA.debugLine="Dim TitleStyle As XLStyle = Workbook.CreateStyle";
_titlestyle = _workbook._createstyle /*b4j.docU.xlstyle*/ (null);
RDebugUtils.currentLine=91881478;
 //BA.debugLineNum = 91881478;BA.debugLine="TitleStyle.ForegroundColor(xl.COLOR_GREY_80_PERCE";
_titlestyle._foregroundcolor /*b4j.docU.xlstyle*/ (null,_xl._color_grey_80_percent /*short*/ )._fontboldcolor /*b4j.docU.xlstyle*/ (null,(short) (12),(int) (_xl._color_white /*short*/ ))._horizontalalignment /*b4j.docU.xlstyle*/ (null,"CENTER");
RDebugUtils.currentLine=91881479;
 //BA.debugLineNum = 91881479;BA.debugLine="sheet1.PutString(xl.AddressName(\"A1\"), \"Proceso\")";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addressname /*b4j.docU.xlutils._xladdress*/ (null,"A1"),"Proceso")._setstyles /*b4j.docU.xlsheetwriter*/ (null,_sheet1._lastaccessed /*b4j.docU.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_titlestyle),(Object)(_workbook._createstyle /*b4j.docU.xlstyle*/ (null)._borderleft /*b4j.docU.xlstyle*/ (null,"THIN"))}));
RDebugUtils.currentLine=91881480;
 //BA.debugLineNum = 91881480;BA.debugLine="sheet1.PutString(xl.AddressName(\"B1\"), \"Cliente\")";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addressname /*b4j.docU.xlutils._xladdress*/ (null,"B1"),"Cliente")._setstyle /*b4j.docU.xlsheetwriter*/ (null,_sheet1._lastaccessed /*b4j.docU.xlutils._xladdress*/ ,_titlestyle);
RDebugUtils.currentLine=91881481;
 //BA.debugLineNum = 91881481;BA.debugLine="sheet1.PutString(xl.AddressName(\"C1\"), \"NombreCli";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addressname /*b4j.docU.xlutils._xladdress*/ (null,"C1"),"NombreCliente")._setstyle /*b4j.docU.xlsheetwriter*/ (null,_sheet1._lastaccessed /*b4j.docU.xlutils._xladdress*/ ,_titlestyle);
RDebugUtils.currentLine=91881482;
 //BA.debugLineNum = 91881482;BA.debugLine="sheet1.PutString(xl.AddressName(\"D1\"), \"Responsab";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addressname /*b4j.docU.xlutils._xladdress*/ (null,"D1"),"Responsable Cuenta")._setstyle /*b4j.docU.xlsheetwriter*/ (null,_sheet1._lastaccessed /*b4j.docU.xlutils._xladdress*/ ,_titlestyle);
RDebugUtils.currentLine=91881483;
 //BA.debugLineNum = 91881483;BA.debugLine="sheet1.PutString(xl.AddressName(\"E1\"), \"Codigo Co";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addressname /*b4j.docU.xlutils._xladdress*/ (null,"E1"),"Codigo Contacto")._setstyle /*b4j.docU.xlsheetwriter*/ (null,_sheet1._lastaccessed /*b4j.docU.xlutils._xladdress*/ ,_titlestyle);
RDebugUtils.currentLine=91881484;
 //BA.debugLineNum = 91881484;BA.debugLine="sheet1.PutString(xl.AddressName(\"F1\"), \"Nombre Co";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addressname /*b4j.docU.xlutils._xladdress*/ (null,"F1"),"Nombre Contacto")._setstyle /*b4j.docU.xlsheetwriter*/ (null,_sheet1._lastaccessed /*b4j.docU.xlutils._xladdress*/ ,_titlestyle);
RDebugUtils.currentLine=91881485;
 //BA.debugLineNum = 91881485;BA.debugLine="sheet1.PutString(xl.AddressName(\"G1\"), \"Email\").S";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addressname /*b4j.docU.xlutils._xladdress*/ (null,"G1"),"Email")._setstyles /*b4j.docU.xlsheetwriter*/ (null,_sheet1._lastaccessed /*b4j.docU.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_titlestyle),(Object)(_workbook._createstyle /*b4j.docU.xlstyle*/ (null)._borderright /*b4j.docU.xlstyle*/ (null,"THIN"))}));
RDebugUtils.currentLine=91881486;
 //BA.debugLineNum = 91881486;BA.debugLine="sheet1.PutString(xl.AddressName(\"H1\"), \"Descripci";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addressname /*b4j.docU.xlutils._xladdress*/ (null,"H1"),"Descripcion Error")._setstyles /*b4j.docU.xlsheetwriter*/ (null,_sheet1._lastaccessed /*b4j.docU.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_titlestyle),(Object)(_workbook._createstyle /*b4j.docU.xlstyle*/ (null)._borderright /*b4j.docU.xlstyle*/ (null,"THIN"))}));
RDebugUtils.currentLine=91881488;
 //BA.debugLineNum = 91881488;BA.debugLine="Dim i As Int=2";
_i = (int) (2);
RDebugUtils.currentLine=91881489;
 //BA.debugLineNum = 91881489;BA.debugLine="For Each E As ErrorProcesoInformeCliente In lstEr";
if (true) break;

case 1:
//for
this.state = 4;
group16 = __ref._lsterrores /*anywheresoftware.b4a.objects.collections.List*/ ;
index16 = 0;
groupLen16 = group16.getSize();
this.state = 12;
if (true) break;

case 12:
//C
this.state = 4;
if (index16 < groupLen16) {
this.state = 3;
_e = (b4j.docU.main._errorprocesoinformecliente)(group16.Get(index16));}
if (true) break;

case 13:
//C
this.state = 12;
index16++;
if (true) break;

case 3:
//C
this.state = 13;
RDebugUtils.currentLine=91881490;
 //BA.debugLineNum = 91881490;BA.debugLine="sheet1.PutString(xl.AddressOne(\"A\", i), E.Proces";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addressone /*b4j.docU.xlutils._xladdress*/ (null,"A",_i),_e.ProcesoError /*String*/ );
RDebugUtils.currentLine=91881491;
 //BA.debugLineNum = 91881491;BA.debugLine="sheet1.PutString(xl.AddressOne(\"B\", i), E.Client";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addressone /*b4j.docU.xlutils._xladdress*/ (null,"B",_i),_e.Cliente /*String*/ );
RDebugUtils.currentLine=91881492;
 //BA.debugLineNum = 91881492;BA.debugLine="sheet1.PutString(xl.AddressOne(\"C\", i), E.Nombre";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addressone /*b4j.docU.xlutils._xladdress*/ (null,"C",_i),_e.NombreCliente /*String*/ );
RDebugUtils.currentLine=91881493;
 //BA.debugLineNum = 91881493;BA.debugLine="sheet1.PutString(xl.AddressOne(\"D\", i), E.Nombre";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addressone /*b4j.docU.xlutils._xladdress*/ (null,"D",_i),_e.NombreResponsableCuenta /*String*/ );
RDebugUtils.currentLine=91881494;
 //BA.debugLineNum = 91881494;BA.debugLine="sheet1.PutString(xl.AddressOne(\"E\", i), E.Codigo";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addressone /*b4j.docU.xlutils._xladdress*/ (null,"E",_i),_e.CodigoContacto /*String*/ );
RDebugUtils.currentLine=91881495;
 //BA.debugLineNum = 91881495;BA.debugLine="sheet1.PutString(xl.AddressOne(\"F\", i), E.Nombre";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addressone /*b4j.docU.xlutils._xladdress*/ (null,"F",_i),_e.NombreContacto /*String*/ );
RDebugUtils.currentLine=91881496;
 //BA.debugLineNum = 91881496;BA.debugLine="sheet1.PutString(xl.AddressOne(\"G\", i), E.Direcc";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addressone /*b4j.docU.xlutils._xladdress*/ (null,"G",_i),_e.DireccionEmail /*String*/ );
RDebugUtils.currentLine=91881497;
 //BA.debugLineNum = 91881497;BA.debugLine="sheet1.PutString(xl.AddressOne(\"H\", i), E.Descri";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addressone /*b4j.docU.xlutils._xladdress*/ (null,"H",_i),_e.DescripcionError /*String*/ );
RDebugUtils.currentLine=91881498;
 //BA.debugLineNum = 91881498;BA.debugLine="i=i+1";
_i = (int) (_i+1);
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=91881502;
 //BA.debugLineNum = 91881502;BA.debugLine="sheet1.SetAutoFilter(xl.CreateXLRange(xl.AddressN";
_sheet1._setautofilter /*b4j.docU.xlsheetwriter*/ (null,_xl._createxlrange /*b4j.docU.xlutils._xlrange*/ (null,_xl._addressname /*b4j.docU.xlutils._xladdress*/ (null,"A1"),_xl._addressone /*b4j.docU.xlutils._xladdress*/ (null,"E",_i)));
RDebugUtils.currentLine=91881506;
 //BA.debugLineNum = 91881506;BA.debugLine="Workbook.EvaluateFormulas";
_workbook._evaluateformulas /*String*/ (null);
RDebugUtils.currentLine=91881507;
 //BA.debugLineNum = 91881507;BA.debugLine="For col0 = xl.AddressName(\"A\").Col0Based To xl.Ad";
if (true) break;

case 5:
//for
this.state = 8;
step29 = 1;
limit29 = _xl._addressname /*b4j.docU.xlutils._xladdress*/ (null,"H").Col0Based /*int*/ ;
_col0 = _xl._addressname /*b4j.docU.xlutils._xladdress*/ (null,"A").Col0Based /*int*/  ;
this.state = 14;
if (true) break;

case 14:
//C
this.state = 8;
if ((step29 > 0 && _col0 <= limit29) || (step29 < 0 && _col0 >= limit29)) this.state = 7;
if (true) break;

case 15:
//C
this.state = 14;
_col0 = ((int)(0 + _col0 + step29)) ;
if (true) break;

case 7:
//C
this.state = 15;
RDebugUtils.currentLine=91881508;
 //BA.debugLineNum = 91881508;BA.debugLine="sheet1.AutoSizeColumn(col0)";
_sheet1._autosizecolumn /*b4j.docU.xlsheetwriter*/ (null,_col0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=91881512;
 //BA.debugLineNum = 91881512;BA.debugLine="For col0  = 0 To 7";

case 8:
//for
this.state = 11;
step32 = 1;
limit32 = (int) (7);
_col0 = (int) (0) ;
this.state = 16;
if (true) break;

case 16:
//C
this.state = 11;
if ((step32 > 0 && _col0 <= limit32) || (step32 < 0 && _col0 >= limit32)) this.state = 10;
if (true) break;

case 17:
//C
this.state = 16;
_col0 = ((int)(0 + _col0 + step32)) ;
if (true) break;

case 10:
//C
this.state = 17;
RDebugUtils.currentLine=91881513;
 //BA.debugLineNum = 91881513;BA.debugLine="sheet1.PoiSheet.SetColumnWidth(col0, sheet1.PoiS";
_sheet1._poisheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .SetColumnWidth(_col0,(int) (_sheet1._poisheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .GetColumnWidth(_col0)+1200));
 if (true) break;
if (true) break;

case 11:
//C
this.state = -1;
;
RDebugUtils.currentLine=91881517;
 //BA.debugLineNum = 91881517;BA.debugLine="Dim f As String = Workbook.SaveAs(File.GetFilePar";
_f = _workbook._saveas /*String*/ (null,parent.__c.File.GetFileParent(_rutafichero),parent.__c.File.GetName(_rutafichero),parent.__c.True);
RDebugUtils.currentLine=91881518;
 //BA.debugLineNum = 91881518;BA.debugLine="Wait For (xl.OpenExcel(f)) Complete (Success As B";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "createworkbook"), _xl._openexcel /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_f));
this.state = 18;
return;
case 18:
//C
this.state = -1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=91881520;
 //BA.debugLineNum = 91881520;BA.debugLine="Return Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_success));return;};
RDebugUtils.currentLine=91881522;
 //BA.debugLineNum = 91881522;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnsalir_click(b4j.docU.cinformesexpedicionesclientes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=90570752;
 //BA.debugLineNum = 90570752;BA.debugLine="Sub btnSalir_Click";
RDebugUtils.currentLine=90570753;
 //BA.debugLineNum = 90570753;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=90570754;
 //BA.debugLineNum = 90570754;BA.debugLine="End Sub";
return "";
}
public String  _salirmodulo(b4j.docU.cinformesexpedicionesclientes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "salirmodulo", false))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
RDebugUtils.currentLine=90636288;
 //BA.debugLineNum = 90636288;BA.debugLine="private Sub SalirModulo";
RDebugUtils.currentLine=90636289;
 //BA.debugLineNum = 90636289;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=90636290;
 //BA.debugLineNum = 90636290;BA.debugLine="MainMenu2.Show";
_mainmenu2._show /*void*/ ();
RDebugUtils.currentLine=90636291;
 //BA.debugLineNum = 90636291;BA.debugLine="End Sub";
return "";
}
public void  _btnseleccionarninguncontacto_click(b4j.docU.cinformesexpedicionesclientes __ref) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "btnseleccionarninguncontacto_click", false))
	 {Debug.delegate(ba, "btnseleccionarninguncontacto_click", null); return;}
ResumableSub_btnSeleccionarNingunContacto_Click rsub = new ResumableSub_btnSeleccionarNingunContacto_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSeleccionarNingunContacto_Click extends BA.ResumableSub {
public ResumableSub_btnSeleccionarNingunContacto_Click(b4j.docU.cinformesexpedicionesclientes parent,b4j.docU.cinformesexpedicionesclientes __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cinformesexpedicionesclientes __ref;
b4j.docU.cinformesexpedicionesclientes parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=90963969;
 //BA.debugLineNum = 90963969;BA.debugLine="mSQL.ExecNonQuery(\"update tblDestinatarios set Se";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("update tblDestinatarios set Seleccionado=0");
RDebugUtils.currentLine=90963970;
 //BA.debugLineNum = 90963970;BA.debugLine="CargandoDatos=True";
__ref._cargandodatos /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=90963971;
 //BA.debugLineNum = 90963971;BA.debugLine="ActualizarTableViewDestinatarios";
__ref._actualizartableviewdestinatarios /*void*/ (null);
RDebugUtils.currentLine=90963972;
 //BA.debugLineNum = 90963972;BA.debugLine="Wait For ActualizarTableViewDestinatarios_Complet";
parent.__c.WaitFor("actualizartableviewdestinatarios_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "btnseleccionarninguncontacto_click"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=90963973;
 //BA.debugLineNum = 90963973;BA.debugLine="CargandoDatos=False";
__ref._cargandodatos /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=90963974;
 //BA.debugLineNum = 90963974;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnseleccionartodoscontactos_click(b4j.docU.cinformesexpedicionesclientes __ref) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "btnseleccionartodoscontactos_click", false))
	 {Debug.delegate(ba, "btnseleccionartodoscontactos_click", null); return;}
ResumableSub_btnSeleccionarTodosContactos_Click rsub = new ResumableSub_btnSeleccionarTodosContactos_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSeleccionarTodosContactos_Click extends BA.ResumableSub {
public ResumableSub_btnSeleccionarTodosContactos_Click(b4j.docU.cinformesexpedicionesclientes parent,b4j.docU.cinformesexpedicionesclientes __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cinformesexpedicionesclientes __ref;
b4j.docU.cinformesexpedicionesclientes parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=90898433;
 //BA.debugLineNum = 90898433;BA.debugLine="mSQL.ExecNonQuery(\"update tblDestinatarios set Se";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("update tblDestinatarios set Seleccionado=1");
RDebugUtils.currentLine=90898434;
 //BA.debugLineNum = 90898434;BA.debugLine="CargandoDatos=True";
__ref._cargandodatos /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=90898435;
 //BA.debugLineNum = 90898435;BA.debugLine="ActualizarTableViewDestinatarios";
__ref._actualizartableviewdestinatarios /*void*/ (null);
RDebugUtils.currentLine=90898436;
 //BA.debugLineNum = 90898436;BA.debugLine="Wait For ActualizarTableViewDestinatarios_Complet";
parent.__c.WaitFor("actualizartableviewdestinatarios_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "btnseleccionartodoscontactos_click"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=90898437;
 //BA.debugLineNum = 90898437;BA.debugLine="CargandoDatos=False";
__ref._cargandodatos /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=90898438;
 //BA.debugLineNum = 90898438;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargadatosnavdocumentoinformeclientes(b4j.docU.cinformesexpedicionesclientes __ref,String _doc) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "cargadatosnavdocumentoinformeclientes", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargadatosnavdocumentoinformeclientes", new Object[] {_doc}));}
ResumableSub_CargaDatosNAVDocumentoInformeClientes rsub = new ResumableSub_CargaDatosNAVDocumentoInformeClientes(this,__ref,_doc);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaDatosNAVDocumentoInformeClientes extends BA.ResumableSub {
public ResumableSub_CargaDatosNAVDocumentoInformeClientes(b4j.docU.cinformesexpedicionesclientes parent,b4j.docU.cinformesexpedicionesclientes __ref,String _doc) {
this.parent = parent;
this.__ref = __ref;
this._doc = _doc;
this.__ref = parent;
}
b4j.docU.cinformesexpedicionesclientes __ref;
b4j.docU.cinformesexpedicionesclientes parent;
String _doc;
anywheresoftware.b4a.objects.collections.Map _m = null;
b4j.docU.dbrequestmanager _req = null;
b4j.docU.main._dbcommand _cmd = null;
b4j.docU.httpjob _j = null;
b4j.docU.main._dbresult _res = null;
Object[] _records = null;
anywheresoftware.b4a.objects.collections.Map _mdoc = null;
int _i = 0;
anywheresoftware.b4a.BA.IterableList group15;
int index15;
int groupLen15;
int step18;
int limit18;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=90308609;
 //BA.debugLineNum = 90308609;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=90308610;
 //BA.debugLineNum = 90308610;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=90308611;
 //BA.debugLineNum = 90308611;BA.debugLine="m.Put(\"ConnOK\",False)";
_m.Put((Object)("ConnOK"),(Object)(parent.__c.False));
RDebugUtils.currentLine=90308612;
 //BA.debugLineNum = 90308612;BA.debugLine="m.Put(\"ReqOK\",False)";
_m.Put((Object)("ReqOK"),(Object)(parent.__c.False));
RDebugUtils.currentLine=90308613;
 //BA.debugLineNum = 90308613;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.WAIT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT);
RDebugUtils.currentLine=90308614;
 //BA.debugLineNum = 90308614;BA.debugLine="Dim Req As DBRequestManager = CreateRequestNav";
_req = __ref._createrequestnav /*b4j.docU.dbrequestmanager*/ (null);
RDebugUtils.currentLine=90308615;
 //BA.debugLineNum = 90308615;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"InfoDocInfo";
_cmd = __ref._createcommand /*b4j.docU.main._dbcommand*/ (null,"InfoDocInformeExpediciones",new Object[]{(Object)(_doc)});
RDebugUtils.currentLine=90308616;
 //BA.debugLineNum = 90308616;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "cargadatosnavdocumentoinformeclientes"), (Object)(_req._executequery /*b4j.docU.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=90308617;
 //BA.debugLineNum = 90308617;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 20;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=90308618;
 //BA.debugLineNum = 90308618;BA.debugLine="m.Put(\"ConnOK\",True)";
_m.Put((Object)("ConnOK"),(Object)(parent.__c.True));
RDebugUtils.currentLine=90308619;
 //BA.debugLineNum = 90308619;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=90308620;
 //BA.debugLineNum = 90308620;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "cargadatosnavdocumentoinformeclientes"), (Object)(_req));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_res = (b4j.docU.main._dbresult) result[1];
;
RDebugUtils.currentLine=90308621;
 //BA.debugLineNum = 90308621;BA.debugLine="If res.Rows.Size>0 Then";
if (true) break;

case 4:
//if
this.state = 17;
if (_res.Rows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 6;
}else {
this.state = 16;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=90308622;
 //BA.debugLineNum = 90308622;BA.debugLine="m.Put(\"ReqOK\",True)";
_m.Put((Object)("ReqOK"),(Object)(parent.__c.True));
RDebugUtils.currentLine=90308623;
 //BA.debugLineNum = 90308623;BA.debugLine="For Each records() As Object In res.Rows";
if (true) break;

case 7:
//for
this.state = 14;
group15 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index15 = 0;
groupLen15 = group15.getSize();
this.state = 23;
if (true) break;

case 23:
//C
this.state = 14;
if (index15 < groupLen15) {
this.state = 9;
_records = (Object[])(group15.Get(index15));}
if (true) break;

case 24:
//C
this.state = 23;
index15++;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=90308624;
 //BA.debugLineNum = 90308624;BA.debugLine="Dim mDoc As Map";
_mdoc = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=90308625;
 //BA.debugLineNum = 90308625;BA.debugLine="mDoc.Initialize";
_mdoc.Initialize();
RDebugUtils.currentLine=90308626;
 //BA.debugLineNum = 90308626;BA.debugLine="For i=0 To  res.Columns.Size-1";
if (true) break;

case 10:
//for
this.state = 13;
step18 = 1;
limit18 = (int) (_res.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
_i = (int) (0) ;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 13;
if ((step18 > 0 && _i <= limit18) || (step18 < 0 && _i >= limit18)) this.state = 12;
if (true) break;

case 26:
//C
this.state = 25;
_i = ((int)(0 + _i + step18)) ;
if (true) break;

case 12:
//C
this.state = 26;
RDebugUtils.currentLine=90308628;
 //BA.debugLineNum = 90308628;BA.debugLine="mDoc.Put(res.Columns.GetKeyAt(i),records(i))";
_mdoc.Put(_res.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .GetKeyAt(_i),_records[_i]);
 if (true) break;
if (true) break;

case 13:
//C
this.state = 24;
;
RDebugUtils.currentLine=90308632;
 //BA.debugLineNum = 90308632;BA.debugLine="lstInfoDocumentos.Add(mDoc)";
__ref._lstinfodocumentos /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_mdoc.getObject()));
RDebugUtils.currentLine=90308633;
 //BA.debugLineNum = 90308633;BA.debugLine="Log (mDoc)";
parent.__c.LogImpl("890308633",BA.ObjectToString(_mdoc),0);
 if (true) break;
if (true) break;

case 14:
//C
this.state = 17;
;
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=90308636;
 //BA.debugLineNum = 90308636;BA.debugLine="Log(\"Documento sin info \" & Doc)";
parent.__c.LogImpl("890308636","Documento sin info "+_doc,0);
 if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=90308641;
 //BA.debugLineNum = 90308641;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=90308642;
 //BA.debugLineNum = 90308642;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.DEFAULT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT);
RDebugUtils.currentLine=90308643;
 //BA.debugLineNum = 90308643;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=90308645;
 //BA.debugLineNum = 90308645;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public b4j.docU.dbrequestmanager  _createrequestnav(b4j.docU.cinformesexpedicionesclientes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "createrequestnav", false))
	 {return ((b4j.docU.dbrequestmanager) Debug.delegate(ba, "createrequestnav", null));}
b4j.docU.dbrequestmanager _req = null;
RDebugUtils.currentLine=89325568;
 //BA.debugLineNum = 89325568;BA.debugLine="Sub CreateRequestNav As DBRequestManager";
RDebugUtils.currentLine=89325569;
 //BA.debugLineNum = 89325569;BA.debugLine="Dim req As DBRequestManager";
_req = new b4j.docU.dbrequestmanager();
RDebugUtils.currentLine=89325570;
 //BA.debugLineNum = 89325570;BA.debugLine="req.Initialize(Me, Main.rdcLinkNav)";
_req._initialize /*String*/ (null,ba,this,_main._rdclinknav /*String*/ );
RDebugUtils.currentLine=89325571;
 //BA.debugLineNum = 89325571;BA.debugLine="Return req";
if (true) return _req;
RDebugUtils.currentLine=89325572;
 //BA.debugLineNum = 89325572;BA.debugLine="End Sub";
return null;
}
public b4j.docU.main._dbcommand  _createcommand(b4j.docU.cinformesexpedicionesclientes __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((b4j.docU.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4j.docU.main._dbcommand _cmd = null;
RDebugUtils.currentLine=89391104;
 //BA.debugLineNum = 89391104;BA.debugLine="Sub CreateCommand(name As String, Parameters() As";
RDebugUtils.currentLine=89391105;
 //BA.debugLineNum = 89391105;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4j.docU.main._dbcommand();
RDebugUtils.currentLine=89391106;
 //BA.debugLineNum = 89391106;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=89391107;
 //BA.debugLineNum = 89391107;BA.debugLine="cmd.Name = name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=89391108;
 //BA.debugLineNum = 89391108;BA.debugLine="If Parameters <> Null Then";
if (_parameters!= null) { 
RDebugUtils.currentLine=89391109;
 //BA.debugLineNum = 89391109;BA.debugLine="cmd.Parameters = Parameters";
_cmd.Parameters /*Object[]*/  = _parameters;
 };
RDebugUtils.currentLine=89391112;
 //BA.debugLineNum = 89391112;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=89391113;
 //BA.debugLineNum = 89391113;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargadatosnavdocumentoinformecomerciales(b4j.docU.cinformesexpedicionesclientes __ref,String _doc,String _tipo) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "cargadatosnavdocumentoinformecomerciales", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargadatosnavdocumentoinformecomerciales", new Object[] {_doc,_tipo}));}
ResumableSub_CargaDatosNAVDocumentoInformeComerciales rsub = new ResumableSub_CargaDatosNAVDocumentoInformeComerciales(this,__ref,_doc,_tipo);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaDatosNAVDocumentoInformeComerciales extends BA.ResumableSub {
public ResumableSub_CargaDatosNAVDocumentoInformeComerciales(b4j.docU.cinformesexpedicionesclientes parent,b4j.docU.cinformesexpedicionesclientes __ref,String _doc,String _tipo) {
this.parent = parent;
this.__ref = __ref;
this._doc = _doc;
this._tipo = _tipo;
this.__ref = parent;
}
b4j.docU.cinformesexpedicionesclientes __ref;
b4j.docU.cinformesexpedicionesclientes parent;
String _doc;
String _tipo;
anywheresoftware.b4a.objects.collections.Map _m = null;
b4j.docU.dbrequestmanager _req = null;
b4j.docU.main._dbcommand _cmd = null;
b4j.docU.httpjob _j = null;
b4j.docU.main._dbresult _res = null;
Object[] _records = null;
anywheresoftware.b4a.objects.collections.Map _mdoc = null;
int _i = 0;
anywheresoftware.b4a.BA.IterableList group20;
int index20;
int groupLen20;
int step23;
int limit23;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=90439681;
 //BA.debugLineNum = 90439681;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=90439682;
 //BA.debugLineNum = 90439682;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=90439683;
 //BA.debugLineNum = 90439683;BA.debugLine="m.Put(\"ConnOK\",False)";
_m.Put((Object)("ConnOK"),(Object)(parent.__c.False));
RDebugUtils.currentLine=90439684;
 //BA.debugLineNum = 90439684;BA.debugLine="m.Put(\"ReqOK\",False)";
_m.Put((Object)("ReqOK"),(Object)(parent.__c.False));
RDebugUtils.currentLine=90439685;
 //BA.debugLineNum = 90439685;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.WAIT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT);
RDebugUtils.currentLine=90439686;
 //BA.debugLineNum = 90439686;BA.debugLine="Dim Req As DBRequestManager = CreateRequestNav";
_req = __ref._createrequestnav /*b4j.docU.dbrequestmanager*/ (null);
RDebugUtils.currentLine=90439687;
 //BA.debugLineNum = 90439687;BA.debugLine="Select True";
if (true) break;

case 1:
//select
this.state = 6;
switch (BA.switchObjectToInt(parent.__c.True,(_tipo).equals("ALBV"),(_tipo).equals("RT"))) {
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
this.state = 6;
RDebugUtils.currentLine=90439689;
 //BA.debugLineNum = 90439689;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"AlbaranVe";
_cmd = __ref._createcommand /*b4j.docU.main._dbcommand*/ (null,"AlbaranVentaInformeExpedicionComerciales",new Object[]{(Object)(_doc)});
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=90439691;
 //BA.debugLineNum = 90439691;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"RTInforme";
_cmd = __ref._createcommand /*b4j.docU.main._dbcommand*/ (null,"RTInformeExpedicionComerciales",new Object[]{(Object)(_doc)});
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=90439694;
 //BA.debugLineNum = 90439694;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "cargadatosnavdocumentoinformecomerciales"), (Object)(_req._executequery /*b4j.docU.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 27;
return;
case 27:
//C
this.state = 7;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=90439695;
 //BA.debugLineNum = 90439695;BA.debugLine="If j.Success Then";
if (true) break;

case 7:
//if
this.state = 26;
if (_j._success /*boolean*/ ) { 
this.state = 9;
}else {
this.state = 25;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=90439696;
 //BA.debugLineNum = 90439696;BA.debugLine="m.Put(\"ConnOK\",True)";
_m.Put((Object)("ConnOK"),(Object)(parent.__c.True));
RDebugUtils.currentLine=90439697;
 //BA.debugLineNum = 90439697;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=90439698;
 //BA.debugLineNum = 90439698;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "cargadatosnavdocumentoinformecomerciales"), (Object)(_req));
this.state = 28;
return;
case 28:
//C
this.state = 10;
_res = (b4j.docU.main._dbresult) result[1];
;
RDebugUtils.currentLine=90439699;
 //BA.debugLineNum = 90439699;BA.debugLine="If res.Rows.Size>0 Then";
if (true) break;

case 10:
//if
this.state = 23;
if (_res.Rows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 12;
}else {
this.state = 22;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=90439700;
 //BA.debugLineNum = 90439700;BA.debugLine="m.Put(\"ReqOK\",True)";
_m.Put((Object)("ReqOK"),(Object)(parent.__c.True));
RDebugUtils.currentLine=90439701;
 //BA.debugLineNum = 90439701;BA.debugLine="For Each records() As Object In res.Rows";
if (true) break;

case 13:
//for
this.state = 20;
group20 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index20 = 0;
groupLen20 = group20.getSize();
this.state = 29;
if (true) break;

case 29:
//C
this.state = 20;
if (index20 < groupLen20) {
this.state = 15;
_records = (Object[])(group20.Get(index20));}
if (true) break;

case 30:
//C
this.state = 29;
index20++;
if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=90439702;
 //BA.debugLineNum = 90439702;BA.debugLine="Dim mDoc As Map";
_mdoc = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=90439703;
 //BA.debugLineNum = 90439703;BA.debugLine="mDoc.Initialize";
_mdoc.Initialize();
RDebugUtils.currentLine=90439704;
 //BA.debugLineNum = 90439704;BA.debugLine="For i=0 To  res.Columns.Size-1";
if (true) break;

case 16:
//for
this.state = 19;
step23 = 1;
limit23 = (int) (_res.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
_i = (int) (0) ;
this.state = 31;
if (true) break;

case 31:
//C
this.state = 19;
if ((step23 > 0 && _i <= limit23) || (step23 < 0 && _i >= limit23)) this.state = 18;
if (true) break;

case 32:
//C
this.state = 31;
_i = ((int)(0 + _i + step23)) ;
if (true) break;

case 18:
//C
this.state = 32;
RDebugUtils.currentLine=90439706;
 //BA.debugLineNum = 90439706;BA.debugLine="mDoc.Put(res.Columns.GetKeyAt(i),records(i))";
_mdoc.Put(_res.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .GetKeyAt(_i),_records[_i]);
RDebugUtils.currentLine=90439707;
 //BA.debugLineNum = 90439707;BA.debugLine="Log(res.Columns.GetKeyAt(i) & \": \" & records(";
parent.__c.LogImpl("890439707",BA.ObjectToString(_res.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .GetKeyAt(_i))+": "+BA.ObjectToString(_records[_i]),0);
 if (true) break;
if (true) break;

case 19:
//C
this.state = 30;
;
RDebugUtils.currentLine=90439709;
 //BA.debugLineNum = 90439709;BA.debugLine="lstInfoDocumentos.Add(mDoc)";
__ref._lstinfodocumentos /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_mdoc.getObject()));
 if (true) break;
if (true) break;

case 20:
//C
this.state = 23;
;
 if (true) break;

case 22:
//C
this.state = 23;
 if (true) break;

case 23:
//C
this.state = 26;
;
 if (true) break;

case 25:
//C
this.state = 26;
 if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=90439717;
 //BA.debugLineNum = 90439717;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=90439718;
 //BA.debugLineNum = 90439718;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.DEFAULT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT);
RDebugUtils.currentLine=90439719;
 //BA.debugLineNum = 90439719;BA.debugLine="Return m";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_m));return;};
RDebugUtils.currentLine=90439720;
 //BA.debugLineNum = 90439720;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public b4j.docU.dbrequestmanager  _createrequest(b4j.docU.cinformesexpedicionesclientes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "createrequest", false))
	 {return ((b4j.docU.dbrequestmanager) Debug.delegate(ba, "createrequest", null));}
b4j.docU.dbrequestmanager _req = null;
RDebugUtils.currentLine=89260032;
 //BA.debugLineNum = 89260032;BA.debugLine="Sub CreateRequest As DBRequestManager";
RDebugUtils.currentLine=89260033;
 //BA.debugLineNum = 89260033;BA.debugLine="Dim req As DBRequestManager";
_req = new b4j.docU.dbrequestmanager();
RDebugUtils.currentLine=89260034;
 //BA.debugLineNum = 89260034;BA.debugLine="req.Initialize(Me, Main.rdclinkMySqlDatosComunes)";
_req._initialize /*String*/ (null,ba,this,_main._rdclinkmysqldatoscomunes /*String*/ );
RDebugUtils.currentLine=89260035;
 //BA.debugLineNum = 89260035;BA.debugLine="Return req";
if (true) return _req;
RDebugUtils.currentLine=89260036;
 //BA.debugLineNum = 89260036;BA.debugLine="End Sub";
return null;
}
public String  _cargaitemscbo(b4j.docU.cinformesexpedicionesclientes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "cargaitemscbo", false))
	 {return ((String) Debug.delegate(ba, "cargaitemscbo", null));}
RDebugUtils.currentLine=89653248;
 //BA.debugLineNum = 89653248;BA.debugLine="Sub CargaItemsCbo";
RDebugUtils.currentLine=89653249;
 //BA.debugLineNum = 89653249;BA.debugLine="cboTipoInforme.Items.AddAll(Array As String(\"\",\"C";
__ref._cbotipoinforme /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"","Clientes","Comerciales"}));
RDebugUtils.currentLine=89653250;
 //BA.debugLineNum = 89653250;BA.debugLine="cboTipoInforme.Value=\"\"";
__ref._cbotipoinforme /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue((Object)(""));
RDebugUtils.currentLine=89653251;
 //BA.debugLineNum = 89653251;BA.debugLine="CallSubDelayed(Me,\"CargaItemsCbo_Completed\")";
__c.CallSubDelayed(ba,this,"CargaItemsCbo_Completed");
RDebugUtils.currentLine=89653252;
 //BA.debugLineNum = 89653252;BA.debugLine="End Sub";
return "";
}
public String  _cbotipoinforme_valuechanged(b4j.docU.cinformesexpedicionesclientes __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "cbotipoinforme_valuechanged", false))
	 {return ((String) Debug.delegate(ba, "cbotipoinforme_valuechanged", new Object[] {_value}));}
RDebugUtils.currentLine=91488256;
 //BA.debugLineNum = 91488256;BA.debugLine="Sub cboTipoInforme_ValueChanged (Value As Object)";
RDebugUtils.currentLine=91488257;
 //BA.debugLineNum = 91488257;BA.debugLine="If CargandoItemsCboTipoInforme Then";
if (__ref._cargandoitemscbotipoinforme /*boolean*/ ) { 
RDebugUtils.currentLine=91488258;
 //BA.debugLineNum = 91488258;BA.debugLine="Log(\"Cargando items cbo\")";
__c.LogImpl("891488258","Cargando items cbo",0);
RDebugUtils.currentLine=91488259;
 //BA.debugLineNum = 91488259;BA.debugLine="Return";
if (true) return "";
 }else {
RDebugUtils.currentLine=91488261;
 //BA.debugLineNum = 91488261;BA.debugLine="Log(\"Cambio en items cbo, no carga\")";
__c.LogImpl("891488261","Cambio en items cbo, no carga",0);
RDebugUtils.currentLine=91488264;
 //BA.debugLineNum = 91488264;BA.debugLine="TipoDestinatarioInforme=Value";
__ref._tipodestinatarioinforme /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=91488265;
 //BA.debugLineNum = 91488265;BA.debugLine="Log(\"Tipo Destinatario Informe \" & TipoDestinata";
__c.LogImpl("891488265","Tipo Destinatario Informe "+__ref._tipodestinatarioinforme /*String*/ ,0);
RDebugUtils.currentLine=91488266;
 //BA.debugLineNum = 91488266;BA.debugLine="Select True";
switch (BA.switchObjectToInt(__c.True,(_value).equals((Object)("")),(_value).equals((Object)("Clientes")),(_value).equals((Object)("Comerciales")))) {
case 0: {
RDebugUtils.currentLine=91488268;
 //BA.debugLineNum = 91488268;BA.debugLine="lstInfoDocumentos.Initialize";
__ref._lstinfodocumentos /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=91488269;
 //BA.debugLineNum = 91488269;BA.debugLine="lstVendedores.Initialize";
__ref._lstvendedores /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=91488270;
 //BA.debugLineNum = 91488270;BA.debugLine="lstResponsablesCuenta.Initialize";
__ref._lstresponsablescuenta /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=91488271;
 //BA.debugLineNum = 91488271;BA.debugLine="lstContactosPedidos.Initialize";
__ref._lstcontactospedidos /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=91488272;
 //BA.debugLineNum = 91488272;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblDestinatario";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblDestinatarios");
RDebugUtils.currentLine=91488273;
 //BA.debugLineNum = 91488273;BA.debugLine="tvDestinatarios.Items.Clear";
__ref._tvdestinatarios /*anywheresoftware.b4j.objects.TableViewWrapper*/ .getItems().Clear();
RDebugUtils.currentLine=91488274;
 //BA.debugLineNum = 91488274;BA.debugLine="pnlFondoDestinatarios.Visible=False";
__ref._pnlfondodestinatarios /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/ .setVisible(__c.False);
 break; }
case 1: {
RDebugUtils.currentLine=91488276;
 //BA.debugLineNum = 91488276;BA.debugLine="InformeClientes";
__ref._informeclientes /*void*/ (null);
 break; }
case 2: {
RDebugUtils.currentLine=91488278;
 //BA.debugLineNum = 91488278;BA.debugLine="InformeComerciales";
__ref._informecomerciales /*void*/ (null);
 break; }
}
;
 };
RDebugUtils.currentLine=91488282;
 //BA.debugLineNum = 91488282;BA.debugLine="End Sub";
return "";
}
public void  _informeclientes(b4j.docU.cinformesexpedicionesclientes __ref) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "informeclientes", false))
	 {Debug.delegate(ba, "informeclientes", null); return;}
ResumableSub_InformeClientes rsub = new ResumableSub_InformeClientes(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_InformeClientes extends BA.ResumableSub {
public ResumableSub_InformeClientes(b4j.docU.cinformesexpedicionesclientes parent,b4j.docU.cinformesexpedicionesclientes __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cinformesexpedicionesclientes __ref;
b4j.docU.cinformesexpedicionesclientes parent;
int _cont = 0;
String _doc = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
Object _robj = null;
Object _msa = null;
anywheresoftware.b4a.BA.IterableList group4;
int index4;
int groupLen4;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=90243073;
 //BA.debugLineNum = 90243073;BA.debugLine="lstInfoDocumentos.Initialize";
__ref._lstinfodocumentos /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=90243075;
 //BA.debugLineNum = 90243075;BA.debugLine="Dim Cont As Int=1";
_cont = (int) (1);
RDebugUtils.currentLine=90243081;
 //BA.debugLineNum = 90243081;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=90243083;
 //BA.debugLineNum = 90243083;BA.debugLine="For Each Doc As String In lstDocumentosExpedidosU";
if (true) break;

case 1:
//for
this.state = 8;
group4 = __ref._lstdocumentosexpedidosunicos /*anywheresoftware.b4a.objects.collections.List*/ ;
index4 = 0;
groupLen4 = group4.getSize();
this.state = 15;
if (true) break;

case 15:
//C
this.state = 8;
if (index4 < groupLen4) {
this.state = 3;
_doc = BA.ObjectToString(group4.Get(index4));}
if (true) break;

case 16:
//C
this.state = 15;
index4++;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=90243091;
 //BA.debugLineNum = 90243091;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Analizando";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Analizando Documento "+BA.NumberToString(_cont)+" de "+BA.NumberToString(__ref._lstdocumentosexpedidosunicos /*anywheresoftware.b4a.objects.collections.List*/ .getSize())));
RDebugUtils.currentLine=90243095;
 //BA.debugLineNum = 90243095;BA.debugLine="Log(\"Documento único \" & Cont & \" \" & Doc)";
parent.__c.LogImpl("890243095","Documento único "+BA.NumberToString(_cont)+" "+_doc,0);
RDebugUtils.currentLine=90243099;
 //BA.debugLineNum = 90243099;BA.debugLine="Doc=Doc.ToUpperCase";
_doc = _doc.toUpperCase();
RDebugUtils.currentLine=90243100;
 //BA.debugLineNum = 90243100;BA.debugLine="If Doc.StartsWith(\"ALBV\") Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_doc.startsWith("ALBV")) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=90243101;
 //BA.debugLineNum = 90243101;BA.debugLine="Log(\"DatosNAVDocumentoInformeClientes \" & Doc)";
parent.__c.LogImpl("890243101","DatosNAVDocumentoInformeClientes "+_doc,0);
RDebugUtils.currentLine=90243106;
 //BA.debugLineNum = 90243106;BA.debugLine="Dim rSub As ResumableSub=CargaDatosNAVDocumento";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._cargadatosnavdocumentoinformeclientes /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_doc);
RDebugUtils.currentLine=90243107;
 //BA.debugLineNum = 90243107;BA.debugLine="Wait For (rSub) complete (rObj As Object)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "informeclientes"), _rsub);
this.state = 17;
return;
case 17:
//C
this.state = 7;
_robj = (Object) result[1];
;
 if (true) break;

case 7:
//C
this.state = 16;
;
RDebugUtils.currentLine=90243110;
 //BA.debugLineNum = 90243110;BA.debugLine="Cont=Cont+1";
_cont = (int) (_cont+1);
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=90243114;
 //BA.debugLineNum = 90243114;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=90243116;
 //BA.debugLineNum = 90243116;BA.debugLine="If lstInfoDocumentos.Size>0 Then";
if (true) break;

case 9:
//if
this.state = 14;
if (__ref._lstinfodocumentos /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=90243117;
 //BA.debugLineNum = 90243117;BA.debugLine="wait for (AnalisisDestinatarios) complete (rObj";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "informeclientes"), __ref._analisisdestinatarios /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 18;
return;
case 18:
//C
this.state = 14;
_robj = (Object) result[1];
;
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=90243119;
 //BA.debugLineNum = 90243119;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay docume";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay documentos para generar informe de expediciones-pedidos pendientes","Aviso");
RDebugUtils.currentLine=90243120;
 //BA.debugLineNum = 90243120;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "informeclientes"), _msa);
this.state = 19;
return;
case 19:
//C
this.state = 14;
;
RDebugUtils.currentLine=90243121;
 //BA.debugLineNum = 90243121;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=90243123;
 //BA.debugLineNum = 90243123;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _informecomerciales(b4j.docU.cinformesexpedicionesclientes __ref) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "informecomerciales", false))
	 {Debug.delegate(ba, "informecomerciales", null); return;}
ResumableSub_InformeComerciales rsub = new ResumableSub_InformeComerciales(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_InformeComerciales extends BA.ResumableSub {
public ResumableSub_InformeComerciales(b4j.docU.cinformesexpedicionesclientes parent,b4j.docU.cinformesexpedicionesclientes __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cinformesexpedicionesclientes __ref;
b4j.docU.cinformesexpedicionesclientes parent;
int _i = 0;
String _doc = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _robj = null;
Object _msa = null;
int step3;
int limit3;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=90374145;
 //BA.debugLineNum = 90374145;BA.debugLine="lstInfoDocumentos.Initialize";
__ref._lstinfodocumentos /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=90374149;
 //BA.debugLineNum = 90374149;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=90374150;
 //BA.debugLineNum = 90374150;BA.debugLine="For i=0 To lstDocumentosExpedidosUnicos.Size-1";
if (true) break;

case 1:
//for
this.state = 11;
step3 = 1;
limit3 = (int) (__ref._lstdocumentosexpedidosunicos /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
this.state = 18;
if (true) break;

case 18:
//C
this.state = 11;
if ((step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3)) this.state = 3;
if (true) break;

case 19:
//C
this.state = 18;
_i = ((int)(0 + _i + step3)) ;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=90374153;
 //BA.debugLineNum = 90374153;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Analizando";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Analizando Documento "+BA.NumberToString((_i+1))+" de "+BA.NumberToString(__ref._lstdocumentosexpedidosunicos /*anywheresoftware.b4a.objects.collections.List*/ .getSize())));
RDebugUtils.currentLine=90374157;
 //BA.debugLineNum = 90374157;BA.debugLine="Dim Doc As String=lstDocumentosExpedidosUnicos.G";
_doc = BA.ObjectToString(__ref._lstdocumentosexpedidosunicos /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=90374160;
 //BA.debugLineNum = 90374160;BA.debugLine="If Doc.StartsWith(\"ALBV\") Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_doc.startsWith("ALBV")) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=90374166;
 //BA.debugLineNum = 90374166;BA.debugLine="Wait For(CargaDatosNAVDocumentoInformeComercial";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "informecomerciales"), __ref._cargadatosnavdocumentoinformecomerciales /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_doc.toUpperCase(),"ALBV"));
this.state = 20;
return;
case 20:
//C
this.state = 7;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
 if (true) break;
;
RDebugUtils.currentLine=90374170;
 //BA.debugLineNum = 90374170;BA.debugLine="If Doc.StartsWith(\"RT\") Then";

case 7:
//if
this.state = 10;
if (_doc.startsWith("RT")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=90374175;
 //BA.debugLineNum = 90374175;BA.debugLine="Wait For(CargaDatosNAVDocumentoInformeComercial";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "informecomerciales"), __ref._cargadatosnavdocumentoinformecomerciales /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_doc.toUpperCase(),"RT"));
this.state = 21;
return;
case 21:
//C
this.state = 10;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
 if (true) break;

case 10:
//C
this.state = 19;
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=90374184;
 //BA.debugLineNum = 90374184;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=90374185;
 //BA.debugLineNum = 90374185;BA.debugLine="If lstInfoDocumentos.Size>0 Then";
if (true) break;

case 12:
//if
this.state = 17;
if (__ref._lstinfodocumentos /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
RDebugUtils.currentLine=90374186;
 //BA.debugLineNum = 90374186;BA.debugLine="wait for (AnalisisDestinatarios) complete (rObj";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "informecomerciales"), __ref._analisisdestinatarios /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 22;
return;
case 22:
//C
this.state = 17;
_robj = (Object) result[1];
;
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=90374188;
 //BA.debugLineNum = 90374188;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay docume";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay documentos para generar informe de expediciones-pedidos pendientes","Aviso");
RDebugUtils.currentLine=90374189;
 //BA.debugLineNum = 90374189;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "informecomerciales"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 17;
;
RDebugUtils.currentLine=90374190;
 //BA.debugLineNum = 90374190;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 17:
//C
this.state = -1;
;
RDebugUtils.currentLine=90374192;
 //BA.debugLineNum = 90374192;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _chbsel_checkedchange(b4j.docU.cinformesexpedicionesclientes __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "chbsel_checkedchange", false))
	 {return ((String) Debug.delegate(ba, "chbsel_checkedchange", new Object[] {_checked}));}
anywheresoftware.b4j.objects.CheckboxWrapper _chb = null;
b4j.docU.main._cellindex _ci = null;
int _ridx = 0;
Object[] _row = null;
anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper _p = null;
String _codigo = "";
int _n = 0;
RDebugUtils.currentLine=91029504;
 //BA.debugLineNum = 91029504;BA.debugLine="Sub chbSel_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=91029505;
 //BA.debugLineNum = 91029505;BA.debugLine="If CargandoDatos Then Return";
if (__ref._cargandodatos /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=91029506;
 //BA.debugLineNum = 91029506;BA.debugLine="Dim chb As CheckBox=Sender";
_chb = new anywheresoftware.b4j.objects.CheckboxWrapper();
_chb = (anywheresoftware.b4j.objects.CheckboxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.CheckboxWrapper(), (javafx.scene.control.CheckBox)(__c.Sender(ba)));
RDebugUtils.currentLine=91029507;
 //BA.debugLineNum = 91029507;BA.debugLine="Dim ci As CellIndex=chb.Tag";
_ci = (b4j.docU.main._cellindex)(_chb.getTag());
RDebugUtils.currentLine=91029508;
 //BA.debugLineNum = 91029508;BA.debugLine="Dim rIdx As Int=ci.Row";
_ridx = _ci.Row /*int*/ ;
RDebugUtils.currentLine=91029509;
 //BA.debugLineNum = 91029509;BA.debugLine="Dim row() As Object=tvDestinatarios.Items.Get(rId";
_row = (Object[])(__ref._tvdestinatarios /*anywheresoftware.b4j.objects.TableViewWrapper*/ .getItems().Get(_ridx));
RDebugUtils.currentLine=91029510;
 //BA.debugLineNum = 91029510;BA.debugLine="Dim p As AnchorPane=row(1)";
_p = new anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper();
_p = (anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper(), (javafx.scene.layout.AnchorPane)(_row[(int) (1)]));
RDebugUtils.currentLine=91029511;
 //BA.debugLineNum = 91029511;BA.debugLine="Dim Codigo As String=p.Tag";
_codigo = BA.ObjectToString(_p.getTag());
RDebugUtils.currentLine=91029512;
 //BA.debugLineNum = 91029512;BA.debugLine="Dim n As Int";
_n = 0;
RDebugUtils.currentLine=91029513;
 //BA.debugLineNum = 91029513;BA.debugLine="If Checked Then";
if (_checked) { 
RDebugUtils.currentLine=91029514;
 //BA.debugLineNum = 91029514;BA.debugLine="n=1";
_n = (int) (1);
 }else {
RDebugUtils.currentLine=91029516;
 //BA.debugLineNum = 91029516;BA.debugLine="n=0";
_n = (int) (0);
 };
RDebugUtils.currentLine=91029518;
 //BA.debugLineNum = 91029518;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDestinatarios set S";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblDestinatarios set Seleccionado=? where Codigo=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_n),(Object)(_codigo)}));
RDebugUtils.currentLine=91029519;
 //BA.debugLineNum = 91029519;BA.debugLine="End Sub";
return "";
}
public String  _chkfechaunica_checkedchange(b4j.docU.cinformesexpedicionesclientes __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "chkfechaunica_checkedchange", false))
	 {return ((String) Debug.delegate(ba, "chkfechaunica_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=89980928;
 //BA.debugLineNum = 89980928;BA.debugLine="Sub chkFechaUnica_CheckedChange(Checked As Boolean";
RDebugUtils.currentLine=89980929;
 //BA.debugLineNum = 89980929;BA.debugLine="If CargandoDatos Then Return";
if (__ref._cargandodatos /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=89980930;
 //BA.debugLineNum = 89980930;BA.debugLine="FechaUnica=Checked";
__ref._fechaunica /*boolean*/  = _checked;
RDebugUtils.currentLine=89980931;
 //BA.debugLineNum = 89980931;BA.debugLine="If FechaUnica Then";
if (__ref._fechaunica /*boolean*/ ) { 
RDebugUtils.currentLine=89980932;
 //BA.debugLineNum = 89980932;BA.debugLine="If FechaInicial>0 Then";
if (__ref._fechainicial /*long*/ >0) { 
RDebugUtils.currentLine=89980933;
 //BA.debugLineNum = 89980933;BA.debugLine="FechaFinal=FechaInicial+DateTime.TicksPerDay";
__ref._fechafinal /*long*/  = (long) (__ref._fechainicial /*long*/ +__c.DateTime.TicksPerDay);
RDebugUtils.currentLine=89980934;
 //BA.debugLineNum = 89980934;BA.debugLine="txtFechaFinal.Text=txtFechaInicial.text";
__ref._txtfechafinal /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._txtfechainicial /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
 }else {
RDebugUtils.currentLine=89980936;
 //BA.debugLineNum = 89980936;BA.debugLine="If FechaFinal>0 Then";
if (__ref._fechafinal /*long*/ >0) { 
RDebugUtils.currentLine=89980937;
 //BA.debugLineNum = 89980937;BA.debugLine="FechaInicial=FechaFinal-DateTime.TicksPerDay";
__ref._fechainicial /*long*/  = (long) (__ref._fechafinal /*long*/ -__c.DateTime.TicksPerDay);
RDebugUtils.currentLine=89980938;
 //BA.debugLineNum = 89980938;BA.debugLine="txtFechaInicial.Text=txtFechaFinal.text";
__ref._txtfechainicial /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._txtfechafinal /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
 };
 };
 };
RDebugUtils.currentLine=89980942;
 //BA.debugLineNum = 89980942;BA.debugLine="Log(\"fecha Inicial: \" & CRLF & FechaInicial)";
__c.LogImpl("889980942","fecha Inicial: "+__c.CRLF+BA.NumberToString(__ref._fechainicial /*long*/ ),0);
RDebugUtils.currentLine=89980943;
 //BA.debugLineNum = 89980943;BA.debugLine="Log(\"Fecha Final: \" & CRLF &  FechaFinal)";
__c.LogImpl("889980943","Fecha Final: "+__c.CRLF+BA.NumberToString(__ref._fechafinal /*long*/ ),0);
RDebugUtils.currentLine=89980944;
 //BA.debugLineNum = 89980944;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.cinformesexpedicionesclientes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinformesexpedicionesclientes";
RDebugUtils.currentLine=89128960;
 //BA.debugLineNum = 89128960;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=89128962;
 //BA.debugLineNum = 89128962;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=89128963;
 //BA.debugLineNum = 89128963;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=89128964;
 //BA.debugLineNum = 89128964;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=89128967;
 //BA.debugLineNum = 89128967;BA.debugLine="Dim lblVersion As Label";
_lblversion = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=89128968;
 //BA.debugLineNum = 89128968;BA.debugLine="Dim lblProgress As Label";
_lblprogress = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=89128970;
 //BA.debugLineNum = 89128970;BA.debugLine="Dim mSQL As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=89128972;
 //BA.debugLineNum = 89128972;BA.debugLine="Private lstDocumentosExpedidos As List";
_lstdocumentosexpedidos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=89128973;
 //BA.debugLineNum = 89128973;BA.debugLine="Private lstDocumentosExpedidosUnicos As List";
_lstdocumentosexpedidosunicos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=89128974;
 //BA.debugLineNum = 89128974;BA.debugLine="Private lstInfoDocumentos As List";
_lstinfodocumentos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=89128975;
 //BA.debugLineNum = 89128975;BA.debugLine="Private lstVendedores As List";
_lstvendedores = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=89128976;
 //BA.debugLineNum = 89128976;BA.debugLine="Private lstResponsablesCuenta As List";
_lstresponsablescuenta = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=89128977;
 //BA.debugLineNum = 89128977;BA.debugLine="Private lstContactosPedidos As List";
_lstcontactospedidos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=89128981;
 //BA.debugLineNum = 89128981;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=89128983;
 //BA.debugLineNum = 89128983;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=89128984;
 //BA.debugLineNum = 89128984;BA.debugLine="Private DateTemplate As B4XDateTemplate";
_datetemplate = new b4j.docU.b4xdatetemplate();
RDebugUtils.currentLine=89128986;
 //BA.debugLineNum = 89128986;BA.debugLine="Private btnFechaFinal As Button";
_btnfechafinal = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=89128987;
 //BA.debugLineNum = 89128987;BA.debugLine="Private btnFechaInicial As Button";
_btnfechainicial = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=89128988;
 //BA.debugLineNum = 89128988;BA.debugLine="Private lblTitleFechaFIn As Label";
_lbltitlefechafin = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=89128989;
 //BA.debugLineNum = 89128989;BA.debugLine="Private lblTitleFechaIn As Label";
_lbltitlefechain = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=89128990;
 //BA.debugLineNum = 89128990;BA.debugLine="Private pnlFondoInformeExpediciones As Pane";
_pnlfondoinformeexpediciones = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=89128991;
 //BA.debugLineNum = 89128991;BA.debugLine="Private txtFechaInicial As TextField";
_txtfechainicial = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=89128992;
 //BA.debugLineNum = 89128992;BA.debugLine="Private txtFechaFinal As TextField";
_txtfechafinal = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=89128993;
 //BA.debugLineNum = 89128993;BA.debugLine="Private FechaInicial, FechaFinal As Long";
_fechainicial = 0L;
_fechafinal = 0L;
RDebugUtils.currentLine=89128994;
 //BA.debugLineNum = 89128994;BA.debugLine="Private btnSalir As Button";
_btnsalir = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=89128995;
 //BA.debugLineNum = 89128995;BA.debugLine="Private chkFechaUnica As CheckBox";
_chkfechaunica = new anywheresoftware.b4j.objects.CheckboxWrapper();
RDebugUtils.currentLine=89128996;
 //BA.debugLineNum = 89128996;BA.debugLine="Private FechaUnica As Boolean";
_fechaunica = false;
RDebugUtils.currentLine=89128999;
 //BA.debugLineNum = 89128999;BA.debugLine="Private btnActualizarInfo As Button";
_btnactualizarinfo = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=89129006;
 //BA.debugLineNum = 89129006;BA.debugLine="Private pnlFondoDestinatarios As Pane";
_pnlfondodestinatarios = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=89129007;
 //BA.debugLineNum = 89129007;BA.debugLine="Private tvDestinatarios As TableView";
_tvdestinatarios = new anywheresoftware.b4j.objects.TableViewWrapper();
RDebugUtils.currentLine=89129008;
 //BA.debugLineNum = 89129008;BA.debugLine="Private btnSeleccionarTodosContactos As Button";
_btnseleccionartodoscontactos = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=89129009;
 //BA.debugLineNum = 89129009;BA.debugLine="Private btnSeleccionarNingunContacto As Button";
_btnseleccionarninguncontacto = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=89129010;
 //BA.debugLineNum = 89129010;BA.debugLine="Private CargandoDatos As Boolean";
_cargandodatos = false;
RDebugUtils.currentLine=89129011;
 //BA.debugLineNum = 89129011;BA.debugLine="Private btnGenerarInformesEmail As Button";
_btngenerarinformesemail = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=89129012;
 //BA.debugLineNum = 89129012;BA.debugLine="Private TipoDestinatarioInforme As String";
_tipodestinatarioinforme = "";
RDebugUtils.currentLine=89129013;
 //BA.debugLineNum = 89129013;BA.debugLine="Private PeriodoInforme As String";
_periodoinforme = "";
RDebugUtils.currentLine=89129015;
 //BA.debugLineNum = 89129015;BA.debugLine="Private lstErrores As List";
_lsterrores = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=89129016;
 //BA.debugLineNum = 89129016;BA.debugLine="Private cboTipoInforme As ComboBox";
_cbotipoinforme = new anywheresoftware.b4j.objects.ComboBoxWrapper();
RDebugUtils.currentLine=89129017;
 //BA.debugLineNum = 89129017;BA.debugLine="Private CargandoItemsCboTipoInforme As Boolean";
_cargandoitemscbotipoinforme = false;
RDebugUtils.currentLine=89129020;
 //BA.debugLineNum = 89129020;BA.debugLine="Private lstCamposInformeDocumentosExpedidosClient";
_lstcamposinformedocumentosexpedidosclientes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=89129021;
 //BA.debugLineNum = 89129021;BA.debugLine="Private lstCamposInformeDocumentosExpedidosComerc";
_lstcamposinformedocumentosexpedidoscomerciales = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=89129022;
 //BA.debugLineNum = 89129022;BA.debugLine="Private lstCamposInformePedidosPendientesClientes";
_lstcamposinformepedidospendientesclientes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=89129023;
 //BA.debugLineNum = 89129023;BA.debugLine="Private lstCamposInformePedidosPendientesComercia";
_lstcamposinformepedidospendientescomerciales = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=89129025;
 //BA.debugLineNum = 89129025;BA.debugLine="Private lblTipoInforme As Label";
_lbltipoinforme = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=89129026;
 //BA.debugLineNum = 89129026;BA.debugLine="Private txtEmailAlternativo As TextField";
_txtemailalternativo = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=89129027;
 //BA.debugLineNum = 89129027;BA.debugLine="Private lblInfoEmailAlternativo As Label";
_lblinfoemailalternativo = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=89129028;
 //BA.debugLineNum = 89129028;BA.debugLine="Private EmProin As String";
_emproin = "";
RDebugUtils.currentLine=89129029;
 //BA.debugLineNum = 89129029;BA.debugLine="Private EmProtec As String";
_emprotec = "";
RDebugUtils.currentLine=89129030;
 //BA.debugLineNum = 89129030;BA.debugLine="Private PasswProin As String";
_passwproin = "";
RDebugUtils.currentLine=89129031;
 //BA.debugLineNum = 89129031;BA.debugLine="Private PassProtec As String";
_passprotec = "";
RDebugUtils.currentLine=89129034;
 //BA.debugLineNum = 89129034;BA.debugLine="Private btnInformeErroresUltimoEnvio As B4XView";
_btninformeerroresultimoenvio = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=89129036;
 //BA.debugLineNum = 89129036;BA.debugLine="Private jamCircularProgressBar1 As jamCircularPro";
_jamcircularprogressbar1 = new b4j.docU.jamcircularprogressbar();
RDebugUtils.currentLine=89129037;
 //BA.debugLineNum = 89129037;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
_jamloadingindicator1 = new b4j.docU.jamloadingindicator();
RDebugUtils.currentLine=89129038;
 //BA.debugLineNum = 89129038;BA.debugLine="End Sub";
return "";
}
public boolean  _crearinformeexcel(b4j.docU.cinformesexpedicionesclientes __ref,String _nombreficheroexcel,String _codigocontacto,String _nombrecontacto,anywheresoftware.b4a.objects.collections.List _lstdatosdocumentos,anywheresoftware.b4a.objects.collections.List _lstdatospedidospendientes) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "crearinformeexcel", false))
	 {return ((Boolean) Debug.delegate(ba, "crearinformeexcel", new Object[] {_nombreficheroexcel,_codigocontacto,_nombrecontacto,_lstdatosdocumentos,_lstdatospedidospendientes}));}
anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb = null;
anywheresoftware.b4j.objects.PoiCellStyleWrapper _csfecha = null;
anywheresoftware.b4j.objects.PoiFontWrapper _fnegritaazul = null;
anywheresoftware.b4j.objects.PoiCellStyleWrapper _csencabezado = null;
anywheresoftware.b4j.objects.PoiSheetWrapper _sheet1 = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.objects.PoiRowWrapper _filaencabezados = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
int _nk = 0;
String _k = "";
anywheresoftware.b4j.objects.PoiCellWrapper _c = null;
int _numfilaexcel = 0;
String _campo = "";
int _i = 0;
anywheresoftware.b4j.objects.PoiRowWrapper _filaexcel = null;
int _j = 0;
String _ky = "";
anywheresoftware.b4j.objects.PoiSheetWrapper _sheet2 = null;
anywheresoftware.b4j.objects.PoiRowWrapper _filaencabezados2 = null;
b4j.docU.main._errorprocesoinformecliente _e = null;
RDebugUtils.currentLine=91357184;
 //BA.debugLineNum = 91357184;BA.debugLine="public Sub CrearInformeExcel(NombreFicheroExcel As";
RDebugUtils.currentLine=91357186;
 //BA.debugLineNum = 91357186;BA.debugLine="Dim wb As PoiWorkbook";
_wb = new anywheresoftware.b4j.objects.PoiWorkbookWrapper();
RDebugUtils.currentLine=91357187;
 //BA.debugLineNum = 91357187;BA.debugLine="wb.InitializeNew(True) 'crear nuevo libro";
_wb.InitializeNew(__c.True);
RDebugUtils.currentLine=91357189;
 //BA.debugLineNum = 91357189;BA.debugLine="Dim csFecha As PoiCellStyle";
_csfecha = new anywheresoftware.b4j.objects.PoiCellStyleWrapper();
RDebugUtils.currentLine=91357190;
 //BA.debugLineNum = 91357190;BA.debugLine="csFecha.Initialize(wb)";
_csfecha.Initialize(_wb);
RDebugUtils.currentLine=91357191;
 //BA.debugLineNum = 91357191;BA.debugLine="csFecha.SetDataFormat(wb,\"dd/MM/yyyy\")";
_csfecha.SetDataFormat(_wb,"dd/MM/yyyy");
RDebugUtils.currentLine=91357193;
 //BA.debugLineNum = 91357193;BA.debugLine="Dim fNegritaAzul As PoiFont";
_fnegritaazul = new anywheresoftware.b4j.objects.PoiFontWrapper();
RDebugUtils.currentLine=91357194;
 //BA.debugLineNum = 91357194;BA.debugLine="fNegritaAzul.Initialize(wb)";
_fnegritaazul.Initialize(_wb);
RDebugUtils.currentLine=91357195;
 //BA.debugLineNum = 91357195;BA.debugLine="fNegritaAzul.Bold = True";
_fnegritaazul.setBold(__c.True);
RDebugUtils.currentLine=91357197;
 //BA.debugLineNum = 91357197;BA.debugLine="fNegritaAzul.SetColor(0xFF1E90FF)";
_fnegritaazul.SetColor(((int)0xff1e90ff));
RDebugUtils.currentLine=91357200;
 //BA.debugLineNum = 91357200;BA.debugLine="Dim csEncabezado As PoiCellStyle";
_csencabezado = new anywheresoftware.b4j.objects.PoiCellStyleWrapper();
RDebugUtils.currentLine=91357201;
 //BA.debugLineNum = 91357201;BA.debugLine="csEncabezado.Initialize(wb)";
_csencabezado.Initialize(_wb);
RDebugUtils.currentLine=91357202;
 //BA.debugLineNum = 91357202;BA.debugLine="csEncabezado.SetFont(fNegritaAzul)";
_csencabezado.SetFont(_fnegritaazul);
RDebugUtils.currentLine=91357221;
 //BA.debugLineNum = 91357221;BA.debugLine="Dim sheet1 As PoiSheet";
_sheet1 = new anywheresoftware.b4j.objects.PoiSheetWrapper();
RDebugUtils.currentLine=91357222;
 //BA.debugLineNum = 91357222;BA.debugLine="sheet1 = wb.AddSheet(\"Documentos Expedidos\",0)";
_sheet1 = _wb.AddSheet("Documentos Expedidos",(int) (0));
RDebugUtils.currentLine=91357224;
 //BA.debugLineNum = 91357224;BA.debugLine="Dim jo As JavaObject=sheet1";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_sheet1.getObject()));
RDebugUtils.currentLine=91357225;
 //BA.debugLineNum = 91357225;BA.debugLine="Try";
try {RDebugUtils.currentLine=91357226;
 //BA.debugLineNum = 91357226;BA.debugLine="jo.RunMethod(\"trackAllColumnsForAutoSizing\",Null";
_jo.RunMethod("trackAllColumnsForAutoSizing",(Object[])(__c.Null));
 } 
       catch (Exception e19) {
			ba.setLastException(e19);RDebugUtils.currentLine=91357229;
 //BA.debugLineNum = 91357229;BA.debugLine="Log(LastException)";
__c.LogImpl("891357229",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=91357235;
 //BA.debugLineNum = 91357235;BA.debugLine="Dim FilaEncabezados As PoiRow = sheet1.CreateRow(";
_filaencabezados = new anywheresoftware.b4j.objects.PoiRowWrapper();
_filaencabezados = _sheet1.CreateRow((int) (0));
RDebugUtils.currentLine=91357238;
 //BA.debugLineNum = 91357238;BA.debugLine="Dim m As Map=lstDatosDocumentos.Get(0)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstdatosdocumentos.Get((int) (0))));
RDebugUtils.currentLine=91357239;
 //BA.debugLineNum = 91357239;BA.debugLine="Dim nK As Int";
_nk = 0;
RDebugUtils.currentLine=91357240;
 //BA.debugLineNum = 91357240;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group24 = _m.Keys();
final int groupLen24 = group24.getSize()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_k = BA.ObjectToString(group24.Get(index24));
RDebugUtils.currentLine=91357242;
 //BA.debugLineNum = 91357242;BA.debugLine="Select True";
switch (BA.switchObjectToInt(__c.True,(__ref._tipodestinatarioinforme /*String*/ ).equals("Clientes"),(__ref._tipodestinatarioinforme /*String*/ ).equals("Comerciales"))) {
case 0: {
RDebugUtils.currentLine=91357244;
 //BA.debugLineNum = 91357244;BA.debugLine="If lstCamposInformeDocumentosExpedidosClientes";
if (__ref._lstcamposinformedocumentosexpedidosclientes /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_k))>-1) { 
RDebugUtils.currentLine=91357245;
 //BA.debugLineNum = 91357245;BA.debugLine="FilaEncabezados.CreateCellString(nK,k)";
_filaencabezados.CreateCellString(_nk,_k);
RDebugUtils.currentLine=91357246;
 //BA.debugLineNum = 91357246;BA.debugLine="Dim c As PoiCell=FilaEncabezados.GetCell(nK)";
_c = new anywheresoftware.b4j.objects.PoiCellWrapper();
_c = _filaencabezados.GetCell(_nk);
RDebugUtils.currentLine=91357247;
 //BA.debugLineNum = 91357247;BA.debugLine="c.CellStyle=csEncabezado";
_c.setCellStyle(_csencabezado);
RDebugUtils.currentLine=91357248;
 //BA.debugLineNum = 91357248;BA.debugLine="nK=nK+1";
_nk = (int) (_nk+1);
 };
 break; }
case 1: {
RDebugUtils.currentLine=91357255;
 //BA.debugLineNum = 91357255;BA.debugLine="If lstCamposInformeDocumentosExpedidosComercia";
if (__ref._lstcamposinformedocumentosexpedidoscomerciales /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_k))>-1) { 
RDebugUtils.currentLine=91357256;
 //BA.debugLineNum = 91357256;BA.debugLine="FilaEncabezados.CreateCellString(nK,k)";
_filaencabezados.CreateCellString(_nk,_k);
RDebugUtils.currentLine=91357257;
 //BA.debugLineNum = 91357257;BA.debugLine="Dim c As PoiCell=FilaEncabezados.GetCell(nK)";
_c = new anywheresoftware.b4j.objects.PoiCellWrapper();
_c = _filaencabezados.GetCell(_nk);
RDebugUtils.currentLine=91357258;
 //BA.debugLineNum = 91357258;BA.debugLine="c.CellStyle=csEncabezado";
_c.setCellStyle(_csencabezado);
RDebugUtils.currentLine=91357259;
 //BA.debugLineNum = 91357259;BA.debugLine="nK=nK+1";
_nk = (int) (_nk+1);
 };
 break; }
}
;
 }
};
RDebugUtils.currentLine=91357265;
 //BA.debugLineNum = 91357265;BA.debugLine="Dim NumFilaExcel As Int=1";
_numfilaexcel = (int) (1);
RDebugUtils.currentLine=91357268;
 //BA.debugLineNum = 91357268;BA.debugLine="Dim Campo As String";
_campo = "";
RDebugUtils.currentLine=91357269;
 //BA.debugLineNum = 91357269;BA.debugLine="Select True";
switch (BA.switchObjectToInt(__c.True,(__ref._tipodestinatarioinforme /*String*/ ).equals("Clientes"),(__ref._tipodestinatarioinforme /*String*/ ).equals("Comerciales"))) {
case 0: {
RDebugUtils.currentLine=91357271;
 //BA.debugLineNum = 91357271;BA.debugLine="Campo=\"Contacto\"";
_campo = "Contacto";
 break; }
case 1: {
RDebugUtils.currentLine=91357273;
 //BA.debugLineNum = 91357273;BA.debugLine="Campo=\"Comercial\"";
_campo = "Comercial";
 break; }
}
;
RDebugUtils.currentLine=91357275;
 //BA.debugLineNum = 91357275;BA.debugLine="For i=0 To lstDatosDocumentos.Size-1";
{
final int step50 = 1;
final int limit50 = (int) (_lstdatosdocumentos.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit50 ;_i = _i + step50 ) {
RDebugUtils.currentLine=91357276;
 //BA.debugLineNum = 91357276;BA.debugLine="Dim m As Map=lstDatosDocumentos.Get(i)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstdatosdocumentos.Get(_i)));
RDebugUtils.currentLine=91357278;
 //BA.debugLineNum = 91357278;BA.debugLine="If m.Get(Campo)=CodigoContacto Then";
if ((_m.Get((Object)(_campo))).equals((Object)(_codigocontacto))) { 
RDebugUtils.currentLine=91357279;
 //BA.debugLineNum = 91357279;BA.debugLine="Dim FilaExcel As PoiRow = sheet1.CreateRow(NumF";
_filaexcel = new anywheresoftware.b4j.objects.PoiRowWrapper();
_filaexcel = _sheet1.CreateRow(_numfilaexcel);
RDebugUtils.currentLine=91357280;
 //BA.debugLineNum = 91357280;BA.debugLine="Dim nK As Int";
_nk = 0;
RDebugUtils.currentLine=91357281;
 //BA.debugLineNum = 91357281;BA.debugLine="Select True";
switch (BA.switchObjectToInt(__c.True,(__ref._tipodestinatarioinforme /*String*/ ).equals("Clientes"),(__ref._tipodestinatarioinforme /*String*/ ).equals("Comerciales"))) {
case 0: {
RDebugUtils.currentLine=91357283;
 //BA.debugLineNum = 91357283;BA.debugLine="For j=0 To m.Size-1";
{
final int step57 = 1;
final int limit57 = (int) (_m.getSize()-1);
_j = (int) (0) ;
for (;_j <= limit57 ;_j = _j + step57 ) {
RDebugUtils.currentLine=91357284;
 //BA.debugLineNum = 91357284;BA.debugLine="Dim ky As String=m.GetKeyAt(j)";
_ky = BA.ObjectToString(_m.GetKeyAt(_j));
RDebugUtils.currentLine=91357286;
 //BA.debugLineNum = 91357286;BA.debugLine="If lstCamposInformeDocumentosExpedidosClient";
if (__ref._lstcamposinformedocumentosexpedidosclientes /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_ky))>-1) { 
RDebugUtils.currentLine=91357288;
 //BA.debugLineNum = 91357288;BA.debugLine="Select True";
switch (BA.switchObjectToInt(__c.True,_ky.contains("Cantidad"),_ky.contains("Fecha"))) {
case 0: {
RDebugUtils.currentLine=91357291;
 //BA.debugLineNum = 91357291;BA.debugLine="FilaExcel.CreateCellNumeric(nK,m.GetValue";
_filaexcel.CreateCellNumeric(_nk,(double)(BA.ObjectToNumber(_m.GetValueAt(_j))));
 break; }
case 1: {
RDebugUtils.currentLine=91357294;
 //BA.debugLineNum = 91357294;BA.debugLine="FilaExcel.CreateCellString(nK,DateTime.Da";
_filaexcel.CreateCellString(_nk,__c.DateTime.Date(BA.ObjectToLongNumber(_m.GetValueAt(_j))));
 break; }
default: {
RDebugUtils.currentLine=91357300;
 //BA.debugLineNum = 91357300;BA.debugLine="FilaExcel.CreateCellString(nK,m.GetValueA";
_filaexcel.CreateCellString(_nk,BA.ObjectToString(_m.GetValueAt(_j)));
 break; }
}
;
RDebugUtils.currentLine=91357302;
 //BA.debugLineNum = 91357302;BA.debugLine="nK=nK+1";
_nk = (int) (_nk+1);
 };
 }
};
 break; }
case 1: {
RDebugUtils.currentLine=91357308;
 //BA.debugLineNum = 91357308;BA.debugLine="For j=0 To m.Size-1";
{
final int step72 = 1;
final int limit72 = (int) (_m.getSize()-1);
_j = (int) (0) ;
for (;_j <= limit72 ;_j = _j + step72 ) {
RDebugUtils.currentLine=91357309;
 //BA.debugLineNum = 91357309;BA.debugLine="Dim ky As String=m.GetKeyAt(j)";
_ky = BA.ObjectToString(_m.GetKeyAt(_j));
RDebugUtils.currentLine=91357311;
 //BA.debugLineNum = 91357311;BA.debugLine="If lstCamposInformeDocumentosExpedidosComerc";
if (__ref._lstcamposinformedocumentosexpedidoscomerciales /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_ky))>-1) { 
RDebugUtils.currentLine=91357313;
 //BA.debugLineNum = 91357313;BA.debugLine="Select True";
switch (BA.switchObjectToInt(__c.True,_ky.contains("Cantidad"),_ky.contains("Fecha"))) {
case 0: {
RDebugUtils.currentLine=91357316;
 //BA.debugLineNum = 91357316;BA.debugLine="FilaExcel.CreateCellNumeric(nK,m.GetValue";
_filaexcel.CreateCellNumeric(_nk,(double)(BA.ObjectToNumber(_m.GetValueAt(_j))));
 break; }
case 1: {
RDebugUtils.currentLine=91357319;
 //BA.debugLineNum = 91357319;BA.debugLine="FilaExcel.CreateCellString(nK,DateTime.Da";
_filaexcel.CreateCellString(_nk,__c.DateTime.Date(BA.ObjectToLongNumber(_m.GetValueAt(_j))));
 break; }
default: {
RDebugUtils.currentLine=91357321;
 //BA.debugLineNum = 91357321;BA.debugLine="FilaExcel.CreateCellString(nK,m.GetValueA";
_filaexcel.CreateCellString(_nk,BA.ObjectToString(_m.GetValueAt(_j)));
 break; }
}
;
RDebugUtils.currentLine=91357323;
 //BA.debugLineNum = 91357323;BA.debugLine="nK=nK+1";
_nk = (int) (_nk+1);
 };
 }
};
 break; }
}
;
RDebugUtils.currentLine=91357328;
 //BA.debugLineNum = 91357328;BA.debugLine="NumFilaExcel=NumFilaExcel+1";
_numfilaexcel = (int) (_numfilaexcel+1);
 };
 }
};
RDebugUtils.currentLine=91357332;
 //BA.debugLineNum = 91357332;BA.debugLine="Dim m As Map=lstDatosDocumentos.Get(0)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstdatosdocumentos.Get((int) (0))));
RDebugUtils.currentLine=91357333;
 //BA.debugLineNum = 91357333;BA.debugLine="Dim nK As Int";
_nk = 0;
RDebugUtils.currentLine=91357334;
 //BA.debugLineNum = 91357334;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group92 = _m.Keys();
final int groupLen92 = group92.getSize()
;int index92 = 0;
;
for (; index92 < groupLen92;index92++){
_k = BA.ObjectToString(group92.Get(index92));
RDebugUtils.currentLine=91357335;
 //BA.debugLineNum = 91357335;BA.debugLine="Try";
try {RDebugUtils.currentLine=91357336;
 //BA.debugLineNum = 91357336;BA.debugLine="jo.RunMethod(\"autoSizeColumn\",Array(nK))";
_jo.RunMethod("autoSizeColumn",new Object[]{(Object)(_nk)});
 } 
       catch (Exception e96) {
			ba.setLastException(e96);RDebugUtils.currentLine=91357338;
 //BA.debugLineNum = 91357338;BA.debugLine="Log(LastException)";
__c.LogImpl("891357338",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=91357340;
 //BA.debugLineNum = 91357340;BA.debugLine="nK=nK+1";
_nk = (int) (_nk+1);
 }
};
RDebugUtils.currentLine=91357346;
 //BA.debugLineNum = 91357346;BA.debugLine="Dim sheet2 As PoiSheet";
_sheet2 = new anywheresoftware.b4j.objects.PoiSheetWrapper();
RDebugUtils.currentLine=91357347;
 //BA.debugLineNum = 91357347;BA.debugLine="sheet2 = wb.AddSheet(\"Pedidos Pendientes\",1)";
_sheet2 = _wb.AddSheet("Pedidos Pendientes",(int) (1));
RDebugUtils.currentLine=91357356;
 //BA.debugLineNum = 91357356;BA.debugLine="If lstDatosPedidosPendientes.Size>0 Then";
if (_lstdatospedidospendientes.getSize()>0) { 
RDebugUtils.currentLine=91357360;
 //BA.debugLineNum = 91357360;BA.debugLine="Dim FilaEncabezados2 As PoiRow = sheet2.CreateRo";
_filaencabezados2 = new anywheresoftware.b4j.objects.PoiRowWrapper();
_filaencabezados2 = _sheet2.CreateRow((int) (0));
RDebugUtils.currentLine=91357362;
 //BA.debugLineNum = 91357362;BA.debugLine="Dim m As Map=lstDatosPedidosPendientes.Get(0)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstdatospedidospendientes.Get((int) (0))));
RDebugUtils.currentLine=91357363;
 //BA.debugLineNum = 91357363;BA.debugLine="Dim nK As Int";
_nk = 0;
RDebugUtils.currentLine=91357364;
 //BA.debugLineNum = 91357364;BA.debugLine="Select True";
switch (BA.switchObjectToInt(__c.True,(__ref._tipodestinatarioinforme /*String*/ ).equals("Clientes"),(__ref._tipodestinatarioinforme /*String*/ ).equals("Comerciales"))) {
case 0: {
RDebugUtils.currentLine=91357366;
 //BA.debugLineNum = 91357366;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group108 = _m.Keys();
final int groupLen108 = group108.getSize()
;int index108 = 0;
;
for (; index108 < groupLen108;index108++){
_k = BA.ObjectToString(group108.Get(index108));
RDebugUtils.currentLine=91357367;
 //BA.debugLineNum = 91357367;BA.debugLine="If lstCamposInformePedidosPendientesClientes.";
if (__ref._lstcamposinformepedidospendientesclientes /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_k))>-1) { 
RDebugUtils.currentLine=91357368;
 //BA.debugLineNum = 91357368;BA.debugLine="FilaEncabezados2.CreateCellString(nK,k)";
_filaencabezados2.CreateCellString(_nk,_k);
RDebugUtils.currentLine=91357369;
 //BA.debugLineNum = 91357369;BA.debugLine="Dim c As PoiCell=FilaEncabezados2.GetCell(nK";
_c = new anywheresoftware.b4j.objects.PoiCellWrapper();
_c = _filaencabezados2.GetCell(_nk);
RDebugUtils.currentLine=91357370;
 //BA.debugLineNum = 91357370;BA.debugLine="c.CellStyle=csEncabezado";
_c.setCellStyle(_csencabezado);
RDebugUtils.currentLine=91357371;
 //BA.debugLineNum = 91357371;BA.debugLine="nK=nK+1";
_nk = (int) (_nk+1);
 };
 }
};
 break; }
case 1: {
RDebugUtils.currentLine=91357381;
 //BA.debugLineNum = 91357381;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group117 = _m.Keys();
final int groupLen117 = group117.getSize()
;int index117 = 0;
;
for (; index117 < groupLen117;index117++){
_k = BA.ObjectToString(group117.Get(index117));
RDebugUtils.currentLine=91357382;
 //BA.debugLineNum = 91357382;BA.debugLine="If lstCamposInformePedidosPendientesComercial";
if (__ref._lstcamposinformepedidospendientescomerciales /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_k))>-1) { 
RDebugUtils.currentLine=91357383;
 //BA.debugLineNum = 91357383;BA.debugLine="FilaEncabezados2.CreateCellString(nK,k)";
_filaencabezados2.CreateCellString(_nk,_k);
RDebugUtils.currentLine=91357384;
 //BA.debugLineNum = 91357384;BA.debugLine="Dim c As PoiCell=FilaEncabezados2.GetCell(nK";
_c = new anywheresoftware.b4j.objects.PoiCellWrapper();
_c = _filaencabezados2.GetCell(_nk);
RDebugUtils.currentLine=91357385;
 //BA.debugLineNum = 91357385;BA.debugLine="c.CellStyle=csEncabezado";
_c.setCellStyle(_csencabezado);
RDebugUtils.currentLine=91357386;
 //BA.debugLineNum = 91357386;BA.debugLine="nK=nK+1";
_nk = (int) (_nk+1);
 };
 }
};
 break; }
}
;
RDebugUtils.currentLine=91357392;
 //BA.debugLineNum = 91357392;BA.debugLine="Dim NumFilaExcel As Int=1";
_numfilaexcel = (int) (1);
RDebugUtils.currentLine=91357393;
 //BA.debugLineNum = 91357393;BA.debugLine="For i=0 To lstDatosPedidosPendientes.Size-1";
{
final int step127 = 1;
final int limit127 = (int) (_lstdatospedidospendientes.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit127 ;_i = _i + step127 ) {
RDebugUtils.currentLine=91357394;
 //BA.debugLineNum = 91357394;BA.debugLine="Dim m As Map=lstDatosPedidosPendientes.Get(i)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstdatospedidospendientes.Get(_i)));
RDebugUtils.currentLine=91357395;
 //BA.debugLineNum = 91357395;BA.debugLine="Dim FilaExcel As PoiRow = sheet2.CreateRow(NumF";
_filaexcel = new anywheresoftware.b4j.objects.PoiRowWrapper();
_filaexcel = _sheet2.CreateRow(_numfilaexcel);
RDebugUtils.currentLine=91357396;
 //BA.debugLineNum = 91357396;BA.debugLine="Dim nK As Int";
_nk = 0;
RDebugUtils.currentLine=91357397;
 //BA.debugLineNum = 91357397;BA.debugLine="Select True";
switch (BA.switchObjectToInt(__c.True,(__ref._tipodestinatarioinforme /*String*/ ).equals("Clientes"),(__ref._tipodestinatarioinforme /*String*/ ).equals("Comerciales"))) {
case 0: {
RDebugUtils.currentLine=91357399;
 //BA.debugLineNum = 91357399;BA.debugLine="For j=0 To m.Size-1";
{
final int step133 = 1;
final int limit133 = (int) (_m.getSize()-1);
_j = (int) (0) ;
for (;_j <= limit133 ;_j = _j + step133 ) {
RDebugUtils.currentLine=91357400;
 //BA.debugLineNum = 91357400;BA.debugLine="Dim ky As String=m.GetKeyAt(j)";
_ky = BA.ObjectToString(_m.GetKeyAt(_j));
RDebugUtils.currentLine=91357402;
 //BA.debugLineNum = 91357402;BA.debugLine="If lstCamposInformePedidosPendientesClientes";
if (__ref._lstcamposinformepedidospendientesclientes /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_ky))>-1) { 
RDebugUtils.currentLine=91357403;
 //BA.debugLineNum = 91357403;BA.debugLine="Select True";
switch (BA.switchObjectToInt(__c.True,_ky.contains("Cantidad"),_ky.contains("Fecha"))) {
case 0: {
RDebugUtils.currentLine=91357406;
 //BA.debugLineNum = 91357406;BA.debugLine="FilaExcel.CreateCellNumeric(nK,m.GetValue";
_filaexcel.CreateCellNumeric(_nk,(double)(BA.ObjectToNumber(_m.GetValueAt(_j))));
 break; }
case 1: {
RDebugUtils.currentLine=91357410;
 //BA.debugLineNum = 91357410;BA.debugLine="If m.GetValueAt(j)<DateTime.DateParse(\"01";
if ((double)(BA.ObjectToNumber(_m.GetValueAt(_j)))<__c.DateTime.DateParse("01/01/2000")) { 
RDebugUtils.currentLine=91357411;
 //BA.debugLineNum = 91357411;BA.debugLine="FilaExcel.CreateCellString(nK,\"\")";
_filaexcel.CreateCellString(_nk,"");
 }else {
RDebugUtils.currentLine=91357413;
 //BA.debugLineNum = 91357413;BA.debugLine="FilaExcel.CreateCellString(nK,DateTime.D";
_filaexcel.CreateCellString(_nk,__c.DateTime.Date(BA.ObjectToLongNumber(_m.GetValueAt(_j))));
 };
 break; }
default: {
RDebugUtils.currentLine=91357416;
 //BA.debugLineNum = 91357416;BA.debugLine="FilaExcel.CreateCellString(nK,m.GetValueA";
_filaexcel.CreateCellString(_nk,BA.ObjectToString(_m.GetValueAt(_j)));
 break; }
}
;
RDebugUtils.currentLine=91357418;
 //BA.debugLineNum = 91357418;BA.debugLine="nK=nK+1";
_nk = (int) (_nk+1);
 };
 }
};
RDebugUtils.currentLine=91357422;
 //BA.debugLineNum = 91357422;BA.debugLine="NumFilaExcel=NumFilaExcel+1";
_numfilaexcel = (int) (_numfilaexcel+1);
 break; }
case 1: {
RDebugUtils.currentLine=91357426;
 //BA.debugLineNum = 91357426;BA.debugLine="For j=0 To m.Size-1";
{
final int step153 = 1;
final int limit153 = (int) (_m.getSize()-1);
_j = (int) (0) ;
for (;_j <= limit153 ;_j = _j + step153 ) {
RDebugUtils.currentLine=91357427;
 //BA.debugLineNum = 91357427;BA.debugLine="Dim ky As String=m.GetKeyAt(j)";
_ky = BA.ObjectToString(_m.GetKeyAt(_j));
RDebugUtils.currentLine=91357429;
 //BA.debugLineNum = 91357429;BA.debugLine="If lstCamposInformePedidosPendientesComercia";
if (__ref._lstcamposinformepedidospendientescomerciales /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_ky))>-1) { 
RDebugUtils.currentLine=91357430;
 //BA.debugLineNum = 91357430;BA.debugLine="Select True";
switch (BA.switchObjectToInt(__c.True,_ky.contains("Cantidad"),_ky.contains("Fecha"))) {
case 0: {
RDebugUtils.currentLine=91357433;
 //BA.debugLineNum = 91357433;BA.debugLine="FilaExcel.CreateCellNumeric(nK,m.GetValue";
_filaexcel.CreateCellNumeric(_nk,(double)(BA.ObjectToNumber(_m.GetValueAt(_j))));
 break; }
case 1: {
RDebugUtils.currentLine=91357436;
 //BA.debugLineNum = 91357436;BA.debugLine="If m.GetValueAt(j)<DateTime.DateParse(\"01";
if ((double)(BA.ObjectToNumber(_m.GetValueAt(_j)))<__c.DateTime.DateParse("01/01/2000")) { 
RDebugUtils.currentLine=91357437;
 //BA.debugLineNum = 91357437;BA.debugLine="FilaExcel.CreateCellString(nK,\"\")";
_filaexcel.CreateCellString(_nk,"");
 }else {
RDebugUtils.currentLine=91357439;
 //BA.debugLineNum = 91357439;BA.debugLine="FilaExcel.CreateCellString(nK,DateTime.D";
_filaexcel.CreateCellString(_nk,__c.DateTime.Date(BA.ObjectToLongNumber(_m.GetValueAt(_j))));
 };
 break; }
default: {
RDebugUtils.currentLine=91357443;
 //BA.debugLineNum = 91357443;BA.debugLine="FilaExcel.CreateCellString(nK,m.GetValueA";
_filaexcel.CreateCellString(_nk,BA.ObjectToString(_m.GetValueAt(_j)));
 break; }
}
;
RDebugUtils.currentLine=91357445;
 //BA.debugLineNum = 91357445;BA.debugLine="nK=nK+1";
_nk = (int) (_nk+1);
 };
 }
};
RDebugUtils.currentLine=91357448;
 //BA.debugLineNum = 91357448;BA.debugLine="NumFilaExcel=NumFilaExcel+1";
_numfilaexcel = (int) (_numfilaexcel+1);
 break; }
}
;
 }
};
RDebugUtils.currentLine=91357454;
 //BA.debugLineNum = 91357454;BA.debugLine="Dim m As Map=lstDatosPedidosPendientes.Get(0)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstdatospedidospendientes.Get((int) (0))));
RDebugUtils.currentLine=91357455;
 //BA.debugLineNum = 91357455;BA.debugLine="Dim nK As Int";
_nk = 0;
RDebugUtils.currentLine=91357456;
 //BA.debugLineNum = 91357456;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group176 = _m.Keys();
final int groupLen176 = group176.getSize()
;int index176 = 0;
;
for (; index176 < groupLen176;index176++){
_k = BA.ObjectToString(group176.Get(index176));
RDebugUtils.currentLine=91357457;
 //BA.debugLineNum = 91357457;BA.debugLine="Try";
try {RDebugUtils.currentLine=91357458;
 //BA.debugLineNum = 91357458;BA.debugLine="jo.RunMethod(\"autoSizeColumn\",Array(nK))";
_jo.RunMethod("autoSizeColumn",new Object[]{(Object)(_nk)});
 } 
       catch (Exception e180) {
			ba.setLastException(e180);RDebugUtils.currentLine=91357460;
 //BA.debugLineNum = 91357460;BA.debugLine="Log(LastException)";
__c.LogImpl("891357460",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=91357462;
 //BA.debugLineNum = 91357462;BA.debugLine="nK=nK+1";
_nk = (int) (_nk+1);
 }
};
 }else {
RDebugUtils.currentLine=91357465;
 //BA.debugLineNum = 91357465;BA.debugLine="Dim FilaExcel As PoiRow = sheet2.CreateRow(0)";
_filaexcel = new anywheresoftware.b4j.objects.PoiRowWrapper();
_filaexcel = _sheet2.CreateRow((int) (0));
RDebugUtils.currentLine=91357466;
 //BA.debugLineNum = 91357466;BA.debugLine="FilaExcel.CreateCellString(0,\"Sin pedidos pendie";
_filaexcel.CreateCellString((int) (0),"Sin pedidos pendientes");
 };
RDebugUtils.currentLine=91357471;
 //BA.debugLineNum = 91357471;BA.debugLine="Try";
try {RDebugUtils.currentLine=91357472;
 //BA.debugLineNum = 91357472;BA.debugLine="wb.Save(File.DirData(\"Expediciones\"), NombreFich";
_wb.Save(__c.File.DirData("Expediciones"),_nombreficheroexcel+".xlsx");
RDebugUtils.currentLine=91357473;
 //BA.debugLineNum = 91357473;BA.debugLine="wb.Close";
_wb.Close();
RDebugUtils.currentLine=91357474;
 //BA.debugLineNum = 91357474;BA.debugLine="lblProgress.Text=\"Excel informe para \" & NombreC";
__ref._lblprogress /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText("Excel informe para "+_nombrecontacto+" grabada.");
RDebugUtils.currentLine=91357475;
 //BA.debugLineNum = 91357475;BA.debugLine="Return True";
if (true) return __c.True;
 } 
       catch (Exception e194) {
			ba.setLastException(e194);RDebugUtils.currentLine=91357479;
 //BA.debugLineNum = 91357479;BA.debugLine="Dim E As ErrorProcesoInformeCliente";
_e = new b4j.docU.main._errorprocesoinformecliente();
RDebugUtils.currentLine=91357480;
 //BA.debugLineNum = 91357480;BA.debugLine="E.Initialize";
_e.Initialize();
RDebugUtils.currentLine=91357481;
 //BA.debugLineNum = 91357481;BA.debugLine="E.CodigoContacto=CodigoContacto";
_e.CodigoContacto /*String*/  = _codigocontacto;
RDebugUtils.currentLine=91357482;
 //BA.debugLineNum = 91357482;BA.debugLine="E.NombreContacto=NombreContacto";
_e.NombreContacto /*String*/  = _nombrecontacto;
RDebugUtils.currentLine=91357483;
 //BA.debugLineNum = 91357483;BA.debugLine="E.ProcesoError=\"Creación Fichero Excel\"";
_e.ProcesoError /*String*/  = "Creación Fichero Excel";
RDebugUtils.currentLine=91357484;
 //BA.debugLineNum = 91357484;BA.debugLine="E.DescripcionError=LastException.Message";
_e.DescripcionError /*String*/  = __c.LastException(ba).getMessage();
RDebugUtils.currentLine=91357485;
 //BA.debugLineNum = 91357485;BA.debugLine="lstErrores.Add(E)";
__ref._lsterrores /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_e));
RDebugUtils.currentLine=91357486;
 //BA.debugLineNum = 91357486;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("891357486",__c.LastException(ba).getMessage(),0);
RDebugUtils.currentLine=91357487;
 //BA.debugLineNum = 91357487;BA.debugLine="lblProgress.Text=\"Error al intentar grabar excel";
__ref._lblprogress /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText("Error al intentar grabar excel informe para "+_nombrecontacto+".");
RDebugUtils.currentLine=91357488;
 //BA.debugLineNum = 91357488;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=91357491;
 //BA.debugLineNum = 91357491;BA.debugLine="End Sub";
return false;
}
public String  _detectos(b4j.docU.cinformesexpedicionesclientes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "detectos", false))
	 {return ((String) Debug.delegate(ba, "detectos", null));}
String _os = "";
RDebugUtils.currentLine=91815936;
 //BA.debugLineNum = 91815936;BA.debugLine="Sub DetectOS As String";
RDebugUtils.currentLine=91815937;
 //BA.debugLineNum = 91815937;BA.debugLine="Dim os As String = GetSystemProperty(\"os.name\", \"";
_os = __c.GetSystemProperty("os.name","").toLowerCase();
RDebugUtils.currentLine=91815938;
 //BA.debugLineNum = 91815938;BA.debugLine="If os.Contains(\"win\") Then";
if (_os.contains("win")) { 
RDebugUtils.currentLine=91815939;
 //BA.debugLineNum = 91815939;BA.debugLine="Return \"windows\"";
if (true) return "windows";
 }else 
{RDebugUtils.currentLine=91815940;
 //BA.debugLineNum = 91815940;BA.debugLine="Else If os.Contains(\"mac\") Then";
if (_os.contains("mac")) { 
RDebugUtils.currentLine=91815941;
 //BA.debugLineNum = 91815941;BA.debugLine="Return \"mac\"";
if (true) return "mac";
 }else {
RDebugUtils.currentLine=91815943;
 //BA.debugLineNum = 91815943;BA.debugLine="Return \"linux\"";
if (true) return "linux";
 }}
;
RDebugUtils.currentLine=91815945;
 //BA.debugLineNum = 91815945;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviaremailcontacto(b4j.docU.cinformesexpedicionesclientes __ref,boolean _cuentaprotec,String _codigocontacto,String _nombrecontacto,String _destinatario,String _subject,String _body,String _dirfileatt,String _fileatt) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "enviaremailcontacto", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviaremailcontacto", new Object[] {_cuentaprotec,_codigocontacto,_nombrecontacto,_destinatario,_subject,_body,_dirfileatt,_fileatt}));}
ResumableSub_EnviarEmailContacto rsub = new ResumableSub_EnviarEmailContacto(this,__ref,_cuentaprotec,_codigocontacto,_nombrecontacto,_destinatario,_subject,_body,_dirfileatt,_fileatt);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnviarEmailContacto extends BA.ResumableSub {
public ResumableSub_EnviarEmailContacto(b4j.docU.cinformesexpedicionesclientes parent,b4j.docU.cinformesexpedicionesclientes __ref,boolean _cuentaprotec,String _codigocontacto,String _nombrecontacto,String _destinatario,String _subject,String _body,String _dirfileatt,String _fileatt) {
this.parent = parent;
this.__ref = __ref;
this._cuentaprotec = _cuentaprotec;
this._codigocontacto = _codigocontacto;
this._nombrecontacto = _nombrecontacto;
this._destinatario = _destinatario;
this._subject = _subject;
this._body = _body;
this._dirfileatt = _dirfileatt;
this._fileatt = _fileatt;
this.__ref = parent;
}
b4j.docU.cinformesexpedicionesclientes __ref;
b4j.docU.cinformesexpedicionesclientes parent;
boolean _cuentaprotec;
String _codigocontacto;
String _nombrecontacto;
String _destinatario;
String _subject;
String _body;
String _dirfileatt;
String _fileatt;
boolean _envioemailok = false;
anywheresoftware.b4a.net.SMTPWrapper _smtp = null;
boolean _success = false;
b4j.docU.main._errorprocesoinformecliente _e = null;
String _cliente = "";
String _nombrecliente = "";
String _nombreresponsablecuenta = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=91422721;
 //BA.debugLineNum = 91422721;BA.debugLine="Dim EnvioEmailOK As Boolean";
_envioemailok = false;
RDebugUtils.currentLine=91422723;
 //BA.debugLineNum = 91422723;BA.debugLine="Dim SMTP As SMTP";
_smtp = new anywheresoftware.b4a.net.SMTPWrapper();
RDebugUtils.currentLine=91422724;
 //BA.debugLineNum = 91422724;BA.debugLine="If CuentaProtec Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_cuentaprotec) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=91422725;
 //BA.debugLineNum = 91422725;BA.debugLine="SMTP.Initialize(\"smtp.office365.com\", 587, EmPro";
_smtp.Initialize("smtp.office365.com",(int) (587),__ref._emprotec /*String*/ ,__ref._passprotec /*String*/ ,"SMTP");
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=91422727;
 //BA.debugLineNum = 91422727;BA.debugLine="SMTP.Initialize(\"smtp.office365.com\", 587, EmPro";
_smtp.Initialize("smtp.office365.com",(int) (587),__ref._emproin /*String*/ ,__ref._passwproin /*String*/ ,"SMTP");
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=91422730;
 //BA.debugLineNum = 91422730;BA.debugLine="SMTP.StartTLSMode = True";
_smtp.setStartTLSMode(parent.__c.True);
RDebugUtils.currentLine=91422731;
 //BA.debugLineNum = 91422731;BA.debugLine="SMTP.UseSSL = True";
_smtp.setUseSSL(parent.__c.True);
RDebugUtils.currentLine=91422732;
 //BA.debugLineNum = 91422732;BA.debugLine="SMTP.AuthMethod = SMTP.AUTH_LOGIN";
_smtp.setAuthMethod(_smtp.AUTH_LOGIN);
RDebugUtils.currentLine=91422735;
 //BA.debugLineNum = 91422735;BA.debugLine="Log(\"Destinatario: \" & Destinatario)";
parent.__c.LogImpl("891422735","Destinatario: "+_destinatario,0);
RDebugUtils.currentLine=91422737;
 //BA.debugLineNum = 91422737;BA.debugLine="If txtEmailAlternativo.Text<>\"\" Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((__ref._txtemailalternativo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("") == false) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=91422738;
 //BA.debugLineNum = 91422738;BA.debugLine="Destinatario=txtEmailAlternativo.Text.Trim";
_destinatario = __ref._txtemailalternativo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText().trim();
RDebugUtils.currentLine=91422740;
 //BA.debugLineNum = 91422740;BA.debugLine="Log(\"Destinatario alternativo: \" & Destinatario)";
parent.__c.LogImpl("891422740","Destinatario alternativo: "+_destinatario,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=91422743;
 //BA.debugLineNum = 91422743;BA.debugLine="SMTP.To.Add(Destinatario)";
_smtp.getTo().Add((Object)(_destinatario));
RDebugUtils.currentLine=91422745;
 //BA.debugLineNum = 91422745;BA.debugLine="SMTP.Subject = Subject";
_smtp.setSubject(_subject);
RDebugUtils.currentLine=91422746;
 //BA.debugLineNum = 91422746;BA.debugLine="SMTP.Body = Body";
_smtp.setBody(_body);
RDebugUtils.currentLine=91422747;
 //BA.debugLineNum = 91422747;BA.debugLine="If FileAtt<>\"\" And DirFileAtt<>\"\" Then";
if (true) break;

case 11:
//if
this.state = 14;
if ((_fileatt).equals("") == false && (_dirfileatt).equals("") == false) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=91422748;
 //BA.debugLineNum = 91422748;BA.debugLine="SMTP.AddAttachment(DirFileAtt, FileAtt)";
_smtp.AddAttachment(_dirfileatt,_fileatt);
 if (true) break;
;
RDebugUtils.currentLine=91422750;
 //BA.debugLineNum = 91422750;BA.debugLine="Try";

case 14:
//try
this.state = 25;
this.catchState = 24;
this.state = 16;
if (true) break;

case 16:
//C
this.state = 17;
this.catchState = 24;
RDebugUtils.currentLine=91422751;
 //BA.debugLineNum = 91422751;BA.debugLine="SMTP.Send";
_smtp.Send(ba);
RDebugUtils.currentLine=91422752;
 //BA.debugLineNum = 91422752;BA.debugLine="Wait For SMTP_MessageSent(Success As Boolean)";
parent.__c.WaitFor("smtp_messagesent", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "enviaremailcontacto"), null);
this.state = 26;
return;
case 26:
//C
this.state = 17;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=91422754;
 //BA.debugLineNum = 91422754;BA.debugLine="If Success Then";
if (true) break;

case 17:
//if
this.state = 22;
if (_success) { 
this.state = 19;
}else {
this.state = 21;
}if (true) break;

case 19:
//C
this.state = 22;
RDebugUtils.currentLine=91422755;
 //BA.debugLineNum = 91422755;BA.debugLine="EnvioEmailOK=True";
_envioemailok = parent.__c.True;
RDebugUtils.currentLine=91422758;
 //BA.debugLineNum = 91422758;BA.debugLine="Log(\"Email enviado con éxito a \"  & Destinatari";
parent.__c.LogImpl("891422758","Email enviado con éxito a "+_destinatario,0);
RDebugUtils.currentLine=91422759;
 //BA.debugLineNum = 91422759;BA.debugLine="lblProgress.Text=\"Email enviado a \"  & Destinat";
__ref._lblprogress /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText("Email enviado a "+_destinatario);
RDebugUtils.currentLine=91422760;
 //BA.debugLineNum = 91422760;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDestinatarios set";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblDestinatarios set EnviadoEmail=? where Codigo=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(parent.__c.True),(Object)(_codigocontacto)}));
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=91422762;
 //BA.debugLineNum = 91422762;BA.debugLine="EnvioEmailOK=False";
_envioemailok = parent.__c.False;
RDebugUtils.currentLine=91422766;
 //BA.debugLineNum = 91422766;BA.debugLine="Dim E As ErrorProcesoInformeCliente";
_e = new b4j.docU.main._errorprocesoinformecliente();
RDebugUtils.currentLine=91422767;
 //BA.debugLineNum = 91422767;BA.debugLine="E.Initialize";
_e.Initialize();
RDebugUtils.currentLine=91422768;
 //BA.debugLineNum = 91422768;BA.debugLine="E.CodigoContacto=CodigoContacto";
_e.CodigoContacto /*String*/  = _codigocontacto;
RDebugUtils.currentLine=91422769;
 //BA.debugLineNum = 91422769;BA.debugLine="E.NombreContacto=NombreContacto";
_e.NombreContacto /*String*/  = _nombrecontacto;
RDebugUtils.currentLine=91422770;
 //BA.debugLineNum = 91422770;BA.debugLine="E.DireccionEmail=Destinatario";
_e.DireccionEmail /*String*/  = _destinatario;
RDebugUtils.currentLine=91422771;
 //BA.debugLineNum = 91422771;BA.debugLine="E.ProcesoError=\"Envio email\"";
_e.ProcesoError /*String*/  = "Envio email";
RDebugUtils.currentLine=91422772;
 //BA.debugLineNum = 91422772;BA.debugLine="E.DescripcionError=LastException.Message";
_e.DescripcionError /*String*/  = parent.__c.LastException(ba).getMessage();
RDebugUtils.currentLine=91422773;
 //BA.debugLineNum = 91422773;BA.debugLine="Dim Cliente As String=Utilidades.FixNull(mSQL.E";
_cliente = parent._utilidades._fixnull /*String*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select Cliente from tblDestinatarios where Codigo=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_codigocontacto}))));
RDebugUtils.currentLine=91422774;
 //BA.debugLineNum = 91422774;BA.debugLine="Dim NombreCliente As String=Utilidades.FixNull(";
_nombrecliente = parent._utilidades._fixnull /*String*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select NombreCliente from tblDestinatarios where Codigo=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_codigocontacto}))));
RDebugUtils.currentLine=91422775;
 //BA.debugLineNum = 91422775;BA.debugLine="Dim NombreResponsableCuenta As String=Utilidade";
_nombreresponsablecuenta = parent._utilidades._fixnull /*String*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select NombreResponsableCuenta from tblDestinatarios where Codigo=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_codigocontacto}))));
RDebugUtils.currentLine=91422776;
 //BA.debugLineNum = 91422776;BA.debugLine="E.Cliente=Cliente";
_e.Cliente /*String*/  = _cliente;
RDebugUtils.currentLine=91422777;
 //BA.debugLineNum = 91422777;BA.debugLine="E.NombreCliente=NombreCliente";
_e.NombreCliente /*String*/  = _nombrecliente;
RDebugUtils.currentLine=91422778;
 //BA.debugLineNum = 91422778;BA.debugLine="E.NombreResponsableCuenta=NombreResponsableCuen";
_e.NombreResponsableCuenta /*String*/  = _nombreresponsablecuenta;
RDebugUtils.currentLine=91422780;
 //BA.debugLineNum = 91422780;BA.debugLine="lstErrores.Add(E)";
__ref._lsterrores /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_e));
RDebugUtils.currentLine=91422781;
 //BA.debugLineNum = 91422781;BA.debugLine="Log(LastException.Message)";
parent.__c.LogImpl("891422781",parent.__c.LastException(ba).getMessage(),0);
RDebugUtils.currentLine=91422782;
 //BA.debugLineNum = 91422782;BA.debugLine="lblProgress.Text=\"Error al intentar enviar emai";
__ref._lblprogress /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText("Error al intentar enviar email a "+_destinatario+".");
 if (true) break;

case 22:
//C
this.state = 25;
;
 if (true) break;

case 24:
//C
this.state = 25;
this.catchState = 0;
RDebugUtils.currentLine=91422788;
 //BA.debugLineNum = 91422788;BA.debugLine="EnvioEmailOK=False";
_envioemailok = parent.__c.False;
RDebugUtils.currentLine=91422789;
 //BA.debugLineNum = 91422789;BA.debugLine="Log(LastException.Message)";
parent.__c.LogImpl("891422789",parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 25:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=91422792;
 //BA.debugLineNum = 91422792;BA.debugLine="Return EnvioEmailOK";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_envioemailok));return;};
RDebugUtils.currentLine=91422793;
 //BA.debugLineNum = 91422793;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public String  _frm_closerequest(b4j.docU.cinformesexpedicionesclientes __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=89522176;
 //BA.debugLineNum = 89522176;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=89522177;
 //BA.debugLineNum = 89522177;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=89522178;
 //BA.debugLineNum = 89522178;BA.debugLine="End Sub";
return "";
}
public String  _inicializarcalendario(b4j.docU.cinformesexpedicionesclientes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "inicializarcalendario", false))
	 {return ((String) Debug.delegate(ba, "inicializarcalendario", null));}
RDebugUtils.currentLine=89718784;
 //BA.debugLineNum = 89718784;BA.debugLine="Sub InicializarCalendario";
RDebugUtils.currentLine=89718785;
 //BA.debugLineNum = 89718785;BA.debugLine="DateTemplate.Initialize";
__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=89718786;
 //BA.debugLineNum = 89718786;BA.debugLine="DateTemplate.MinYear = 2018";
__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._minyear /*int*/  = (int) (2018);
RDebugUtils.currentLine=89718787;
 //BA.debugLineNum = 89718787;BA.debugLine="DateTemplate.MaxYear = 2050";
__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._maxyear /*int*/  = (int) (2050);
RDebugUtils.currentLine=89718788;
 //BA.debugLineNum = 89718788;BA.debugLine="DateTemplate.FirstDay=1";
__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._firstday /*int*/  = (int) (1);
RDebugUtils.currentLine=89718789;
 //BA.debugLineNum = 89718789;BA.debugLine="DateTemplate.Date=DateTime.Now";
__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._setdate /*long*/ (null,__c.DateTime.getNow());
RDebugUtils.currentLine=89718790;
 //BA.debugLineNum = 89718790;BA.debugLine="End Sub";
return "";
}
public void  _lblinfoemailalternativo_mousereleased(b4j.docU.cinformesexpedicionesclientes __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "lblinfoemailalternativo_mousereleased", false))
	 {Debug.delegate(ba, "lblinfoemailalternativo_mousereleased", new Object[] {_eventdata}); return;}
ResumableSub_lblInfoEmailAlternativo_MouseReleased rsub = new ResumableSub_lblInfoEmailAlternativo_MouseReleased(this,__ref,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblInfoEmailAlternativo_MouseReleased extends BA.ResumableSub {
public ResumableSub_lblInfoEmailAlternativo_MouseReleased(b4j.docU.cinformesexpedicionesclientes parent,b4j.docU.cinformesexpedicionesclientes __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
this.__ref = parent;
}
b4j.docU.cinformesexpedicionesclientes __ref;
b4j.docU.cinformesexpedicionesclientes parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=91619329;
 //BA.debugLineNum = 91619329;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"El email alter";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"El email alternativo se emplea para realizar pruebas. Los emails NO serán enviados a los emails de los destinatarios, sino al email alternativo indicado.","Información");
RDebugUtils.currentLine=91619330;
 //BA.debugLineNum = 91619330;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "lblinfoemailalternativo_mousereleased"), _msa);
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=91619331;
 //BA.debugLineNum = 91619331;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _loadcred(b4j.docU.cinformesexpedicionesclientes __ref) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";
if (Debug.shouldDelegate(ba, "loadcred", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "loadcred", null));}
ResumableSub_LoadCred rsub = new ResumableSub_LoadCred(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_LoadCred extends BA.ResumableSub {
public ResumableSub_LoadCred(b4j.docU.cinformesexpedicionesclientes parent,b4j.docU.cinformesexpedicionesclientes __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cinformesexpedicionesclientes __ref;
b4j.docU.cinformesexpedicionesclientes parent;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
String _emp = "";
anywheresoftware.b4a.BA.IterableList group15;
int index15;
int groupLen15;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinformesexpedicionesclientes";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=89587713;
 //BA.debugLineNum = 89587713;BA.debugLine="Dim Comando As String=\"ConfigNoReply\"";
_comando = "ConfigNoReply";
RDebugUtils.currentLine=89587714;
 //BA.debugLineNum = 89587714;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=89587716;
 //BA.debugLineNum = 89587716;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "loadcred"), null);
this.state = 23;
return;
case 23:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=89587718;
 //BA.debugLineNum = 89587718;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 22;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 22;
RDebugUtils.currentLine=89587719;
 //BA.debugLineNum = 89587719;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=89587720;
 //BA.debugLineNum = 89587720;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "loadcred"), _msa);
this.state = 24;
return;
case 24:
//C
this.state = 22;
;
RDebugUtils.currentLine=89587721;
 //BA.debugLineNum = 89587721;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=89587723;
 //BA.debugLineNum = 89587723;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
if (true) break;

case 6:
//if
this.state = 21;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.False))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 21;
RDebugUtils.currentLine=89587724;
 //BA.debugLineNum = 89587724;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos config. email."+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Aviso");
RDebugUtils.currentLine=89587725;
 //BA.debugLineNum = 89587725;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinformesexpedicionesclientes", "loadcred"), _msa);
this.state = 25;
return;
case 25:
//C
this.state = 21;
;
RDebugUtils.currentLine=89587726;
 //BA.debugLineNum = 89587726;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=89587728;
 //BA.debugLineNum = 89587728;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=89587729;
 //BA.debugLineNum = 89587729;BA.debugLine="For Each mData As Map In lstReg";
if (true) break;

case 11:
//for
this.state = 20;
_mdata = new anywheresoftware.b4a.objects.collections.Map();
group15 = _lstreg;
index15 = 0;
groupLen15 = group15.getSize();
this.state = 26;
if (true) break;

case 26:
//C
this.state = 20;
if (index15 < groupLen15) {
this.state = 13;
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group15.Get(index15)));}
if (true) break;

case 27:
//C
this.state = 26;
index15++;
if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=89587730;
 //BA.debugLineNum = 89587730;BA.debugLine="Dim Emp As String=mData.Get(\"Empresa\")";
_emp = BA.ObjectToString(_mdata.Get((Object)("Empresa")));
RDebugUtils.currentLine=89587731;
 //BA.debugLineNum = 89587731;BA.debugLine="Select Emp";
if (true) break;

case 14:
//select
this.state = 19;
switch (BA.switchObjectToInt(_emp,"PROIN","PROTEC")) {
case 0: {
this.state = 16;
if (true) break;
}
case 1: {
this.state = 18;
if (true) break;
}
}
if (true) break;

case 16:
//C
this.state = 19;
RDebugUtils.currentLine=89587733;
 //BA.debugLineNum = 89587733;BA.debugLine="EmProin=mData.Get(\"Cuenta\")";
__ref._emproin /*String*/  = BA.ObjectToString(_mdata.Get((Object)("Cuenta")));
RDebugUtils.currentLine=89587734;
 //BA.debugLineNum = 89587734;BA.debugLine="PasswProin=mData.Get(\"Passw\")";
__ref._passwproin /*String*/  = BA.ObjectToString(_mdata.Get((Object)("Passw")));
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=89587736;
 //BA.debugLineNum = 89587736;BA.debugLine="EmProtec=mData.Get(\"Cuenta\")";
__ref._emprotec /*String*/  = BA.ObjectToString(_mdata.Get((Object)("Cuenta")));
RDebugUtils.currentLine=89587737;
 //BA.debugLineNum = 89587737;BA.debugLine="PassProtec=mData.Get(\"Passw\")";
__ref._passprotec /*String*/  = BA.ObjectToString(_mdata.Get((Object)("Passw")));
 if (true) break;

case 19:
//C
this.state = 27;
;
 if (true) break;
if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=89587740;
 //BA.debugLineNum = 89587740;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 21:
//C
this.state = 22;
;
 if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=89587743;
 //BA.debugLineNum = 89587743;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}