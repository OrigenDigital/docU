package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.shell.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("b4j.docU", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.docU.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 600, 600);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4j.example.cssutils._process_globals();
b4j.example.dateutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static class _datosconfiguracionaplicacion{
public boolean IsInitialized;
public String DominioRed;
public String NombreUsuarioRed;
public String PasswordUsuarioRed;
public String ServidorEnvioEmail;
public int PuertoEnvioEmail;
public String DireccionEnvioEmail;
public String PasswordEnvioEmail;
public String EmailDesarrollador1;
public String EmailDesarrollador2;
public void Initialize() {
IsInitialized = true;
DominioRed = "";
NombreUsuarioRed = "";
PasswordUsuarioRed = "";
ServidorEnvioEmail = "";
PuertoEnvioEmail = 0;
DireccionEnvioEmail = "";
PasswordEnvioEmail = "";
EmailDesarrollador1 = "";
EmailDesarrollador2 = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _datosusuario{
public boolean IsInitialized;
public String Dispositivo;
public String NombreUsuarioWindows;
public boolean Administrador;
public String DominioUsuarioWindows;
public String NombreADUsuarioWindows;
public String IPConexion;
public void Initialize() {
IsInitialized = true;
Dispositivo = "";
NombreUsuarioWindows = "";
Administrador = false;
DominioUsuarioWindows = "";
NombreADUsuarioWindows = "";
IPConexion = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _configuracionusuario{
public boolean IsInitialized;
public String IPImpresoraEtiquetasOSUB;
public String IPImpresoraEtiquetasEmbalajes;
public String IPImpresoraEtiquetasTallas;
public void Initialize() {
IsInitialized = true;
IPImpresoraEtiquetasOSUB = "";
IPImpresoraEtiquetasEmbalajes = "";
IPImpresoraEtiquetasTallas = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _datosimpresora{
public boolean IsInitialized;
public String Almacen;
public String IPImpresora;
public String NombreImpresora;
public int PuertoImpresora;
public void Initialize() {
IsInitialized = true;
Almacen = "";
IPImpresora = "";
NombreImpresora = "";
PuertoImpresora = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _vendedor{
public boolean IsInitialized;
public String Codigo;
public String Nombre;
public String Email;
public boolean Seleccionado;
public void Initialize() {
IsInitialized = true;
Codigo = "";
Nombre = "";
Email = "";
Seleccionado = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _responsablecuenta{
public boolean IsInitialized;
public String Codigo;
public String Nombre;
public String Email;
public boolean Seleccionado;
public void Initialize() {
IsInitialized = true;
Codigo = "";
Nombre = "";
Email = "";
Seleccionado = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _contactocliente{
public boolean IsInitialized;
public int ClienteProtec;
public String Codigo;
public String Nombre;
public String Email;
public boolean Seleccionado;
public String Cliente;
public String NombreCliente;
public String NombreResponsableCuenta;
public void Initialize() {
IsInitialized = true;
ClienteProtec = 0;
Codigo = "";
Nombre = "";
Email = "";
Seleccionado = false;
Cliente = "";
NombreCliente = "";
NombreResponsableCuenta = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _cellindex{
public boolean IsInitialized;
public int Row;
public int Column;
public int IDClaveUnicaRegistro;
public String CampoColumna;
public Object ValorCelda;
public void Initialize() {
IsInitialized = true;
Row = 0;
Column = 0;
IDClaveUnicaRegistro = 0;
CampoColumna = "";
ValorCelda = new Object();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _errorprocesoinformecliente{
public boolean IsInitialized;
public String CodigoContacto;
public String NombreContacto;
public String DireccionEmail;
public String ProcesoError;
public String DescripcionError;
public String Cliente;
public String NombreCliente;
public String NombreResponsableCuenta;
public void Initialize() {
IsInitialized = true;
CodigoContacto = "";
NombreContacto = "";
DireccionEmail = "";
ProcesoError = "";
DescripcionError = "";
Cliente = "";
NombreCliente = "";
NombreResponsableCuenta = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _tiporespuestajrdc{
public boolean IsInitialized;
public String Accion;
public String Error;
public String Aviso;
public anywheresoftware.b4a.objects.collections.List lstReg;
public void Initialize() {
IsInitialized = true;
Accion = "";
Error = "";
Aviso = "";
lstReg = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _dbresult{
public boolean IsInitialized;
public Object Tag;
public anywheresoftware.b4a.objects.collections.Map Columns;
public anywheresoftware.b4a.objects.collections.List Rows;
public void Initialize() {
IsInitialized = true;
Tag = new Object();
Columns = new anywheresoftware.b4a.objects.collections.Map();
Rows = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _dbcommand{
public boolean IsInitialized;
public String Name;
public Object[] Parameters;
public void Initialize() {
IsInitialized = true;
Name = "";
Parameters = new Object[0];
{
int d0 = Parameters.length;
for (int i0 = 0;i0 < d0;i0++) {
Parameters[i0] = new Object();
}
}
;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _version = "";
public static String _nombreaplicacion = "";
public static String _nombreaplicacionforms = "";
public static b4j.docU.main._datosconfiguracionaplicacion _datosconfiguracionaplicacion = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _frm = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public static String _prefijotitleforms = "";
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _iconoformularios = null;
public static String _sufijotitleforms = "";
public static String _nombreficheroiconoaplicacion = "";
public static String _rdclinkmysqlalmconexion = "";
public static String _almacenconexion = "";
public static String _rdclinkmysqldatoscomunes = "";
public static String _rdclinknav = "";
public static String _rdclinkmysqlalmproin = "";
public static String _rdclinkmysqlalmprotec = "";
public static b4j.docU.main._configuracionusuario _configuracionusuario = null;
public static anywheresoftware.b4a.objects.collections.Map _mconfiguracionusuario = null;
public static int _xscreen = 0;
public static int _yscreen = 0;
public static anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _treeitemmenuabreform = null;
public static String _alineacioncentroderecha = "";
public static String _alineacioncentro = "";
public static String _alineacioncentroizquierda = "";
public static String _userfolder = "";
public static String _usertempfolder = "";
public static b4j.docU.main._datosusuario _datosusuario = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _awesome = null;
public static anywheresoftware.b4a.objects.collections.List _lstselitem = null;
public static anywheresoftware.b4j.object.JavaObject _robot = null;
public static String _almacenipconexion = "";
public static anywheresoftware.b4a.objects.B4XViewWrapper _imageviewsplashscreen = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblsplashscreenappversion = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _pnlfondosplashscreen = null;
public static String _scamposfiltradoslistaincidenciasproveedor = "";
public static anywheresoftware.b4a.objects.collections.List _lstvaloresfiltroslistaincidenciasproveedor = null;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.dateutils _dateutils = null;
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
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "application_error", false))
	 {return ((Boolean) Debug.delegate(ba, "application_error", new Object[] {_error,_stacktrace}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _serrmsg = "";
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="LogError(StackTrace)";
anywheresoftware.b4a.keywords.Common.LogError(_stacktrace);
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="If File.Exists(xui.DefaultFolder,\"logCrash.txt\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_xui.getDefaultFolder(),"logCrash.txt")) { 
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="File.Delete(xui.DefaultFolder,\"logCrash.txt\")";
anywheresoftware.b4a.keywords.Common.File.Delete(_xui.getDefaultFolder(),"logCrash.txt");
 };
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="DateTime.DateFormat=\"dd/MM/yy hh:mm:ss\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd/MM/yy hh:mm:ss");
RDebugUtils.currentLine=524297;
 //BA.debugLineNum = 524297;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=524298;
 //BA.debugLineNum = 524298;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=524299;
 //BA.debugLineNum = 524299;BA.debugLine="sb.Append(\"Error \" & DateTime.Date(DateTime.Now))";
_sb.Append("Error "+anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow())).Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(_stacktrace);
RDebugUtils.currentLine=524300;
 //BA.debugLineNum = 524300;BA.debugLine="sb.Append(CRLF).Append(Error)";
_sb.Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(BA.ObjectToString(_error));
RDebugUtils.currentLine=524301;
 //BA.debugLineNum = 524301;BA.debugLine="Dim sErrMsg As String=sb.ToString";
_serrmsg = _sb.ToString();
RDebugUtils.currentLine=524303;
 //BA.debugLineNum = 524303;BA.debugLine="File.WriteString(xui.DefaultFolder,\"logCrash.txt\"";
anywheresoftware.b4a.keywords.Common.File.WriteString(_xui.getDefaultFolder(),"logCrash.txt",_serrmsg);
RDebugUtils.currentLine=524304;
 //BA.debugLineNum = 524304;BA.debugLine="EnviarEmailErrorApp";
_enviaremailerrorapp();
RDebugUtils.currentLine=524305;
 //BA.debugLineNum = 524305;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=524306;
 //BA.debugLineNum = 524306;BA.debugLine="End Sub";
return false;
}
public static void  _enviaremailerrorapp() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "enviaremailerrorapp", false))
	 {Debug.delegate(ba, "enviaremailerrorapp", null); return;}
ResumableSub_EnviarEmailErrorApp rsub = new ResumableSub_EnviarEmailErrorApp(null);
rsub.resume(ba, null);
}
public static class ResumableSub_EnviarEmailErrorApp extends BA.ResumableSub {
public ResumableSub_EnviarEmailErrorApp(b4j.docU.main parent) {
this.parent = parent;
}
b4j.docU.main parent;
anywheresoftware.b4a.net.SMTPWrapper _smtp = null;
Object _sendemail = null;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Dim SMTP As SMTP";
_smtp = new anywheresoftware.b4a.net.SMTPWrapper();
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="SMTP.Initialize(DatosConfiguracionAplicacion.Serv";
_smtp.Initialize(parent._datosconfiguracionaplicacion.ServidorEnvioEmail /*String*/ ,parent._datosconfiguracionaplicacion.PuertoEnvioEmail /*int*/ ,parent._datosconfiguracionaplicacion.DireccionEnvioEmail /*String*/ ,parent._datosconfiguracionaplicacion.PasswordEnvioEmail /*String*/ ,"SMTP");
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="SMTP.StartTLSMode = True";
_smtp.setStartTLSMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="SMTP.UseSSL = True 'Gmail requires SSL.";
_smtp.setUseSSL(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="SMTP.AuthMethod = SMTP.AUTH_LOGIN";
_smtp.setAuthMethod(_smtp.AUTH_LOGIN);
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="If DatosConfiguracionAplicacion.EmailDesarrollado";
if (true) break;

case 1:
//if
this.state = 17;
if ((parent._datosconfiguracionaplicacion.EmailDesarrollador1 /*String*/ ).equals("") == false || (parent._datosconfiguracionaplicacion.EmailDesarrollador2 /*String*/ ).equals("") == false) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="If DatosConfiguracionAplicacion.EmailDesarrollad";
if (true) break;

case 4:
//if
this.state = 7;
if ((parent._datosconfiguracionaplicacion.EmailDesarrollador1 /*String*/ ).equals("") == false) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="SMTP.To.Add(DatosConfiguracionAplicacion.EmailD";
_smtp.getTo().Add((Object)(parent._datosconfiguracionaplicacion.EmailDesarrollador1 /*String*/ ));
 if (true) break;
;
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="If DatosConfiguracionAplicacion.EmailDesarrollad";

case 7:
//if
this.state = 10;
if ((parent._datosconfiguracionaplicacion.EmailDesarrollador2 /*String*/ ).equals("") == false) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=589837;
 //BA.debugLineNum = 589837;BA.debugLine="SMTP.To.Add(DatosConfiguracionAplicacion.EmailD";
_smtp.getTo().Add((Object)(parent._datosconfiguracionaplicacion.EmailDesarrollador2 /*String*/ ));
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=589840;
 //BA.debugLineNum = 589840;BA.debugLine="SMTP.Subject = \"App crash \" & NombreAplicacion";
_smtp.setSubject("App crash "+parent._nombreaplicacion);
RDebugUtils.currentLine=589843;
 //BA.debugLineNum = 589843;BA.debugLine="SMTP.Body = \"Error en versión \" & Version & CRLF";
_smtp.setBody("Error en versión "+parent._version+anywheresoftware.b4a.keywords.Common.CRLF+parent._datosusuario.Dispositivo /*String*/ +"   "+parent._datosusuario.NombreUsuarioWindows /*String*/ );
RDebugUtils.currentLine=589845;
 //BA.debugLineNum = 589845;BA.debugLine="SMTP.AddAttachment(xui.DefaultFolder,\"logCrash.t";
_smtp.AddAttachment(parent._xui.getDefaultFolder(),"logCrash.txt");
RDebugUtils.currentLine=589847;
 //BA.debugLineNum = 589847;BA.debugLine="Dim SendEmail As Object =SMTP.Send";
_sendemail = _smtp.Send(ba);
RDebugUtils.currentLine=589848;
 //BA.debugLineNum = 589848;BA.debugLine="Wait For (SendEmail) SMTP_MessageSent(Success As";
anywheresoftware.b4a.keywords.Common.WaitFor("smtp_messagesent", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "enviaremailerrorapp"), _sendemail);
this.state = 18;
return;
case 18:
//C
this.state = 11;
_success = (boolean) result[0];
;
RDebugUtils.currentLine=589849;
 //BA.debugLineNum = 589849;BA.debugLine="If Success Then";
if (true) break;

case 11:
//if
this.state = 16;
if (_success) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
RDebugUtils.currentLine=589850;
 //BA.debugLineNum = 589850;BA.debugLine="File.Delete(xui.DefaultFolder,\"logCrash.txt\")";
anywheresoftware.b4a.keywords.Common.File.Delete(parent._xui.getDefaultFolder(),"logCrash.txt");
RDebugUtils.currentLine=589851;
 //BA.debugLineNum = 589851;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=589853;
 //BA.debugLineNum = 589853;BA.debugLine="Log(\"Error enviando fichero appCrash por email\"";
anywheresoftware.b4a.keywords.Common.LogImpl("8589853","Error enviando fichero appCrash por email",0);
RDebugUtils.currentLine=589854;
 //BA.debugLineNum = 589854;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = -1;
;
RDebugUtils.currentLine=589858;
 //BA.debugLineNum = 589858;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args}));}
butt.droid.awtRobot.AWTRobot _rb = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _msys = null;
anywheresoftware.b4a.objects.collections.Map _minfosystem = null;
anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper _local = null;
anywheresoftware.b4a.objects.collections.Map _mscreendim = null;
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="xui.SetDataFolder(NombreAplicacion)";
_xui.SetDataFolder(_nombreaplicacion);
RDebugUtils.currentLine=65541;
 //BA.debugLineNum = 65541;BA.debugLine="Log(\"File.DirApp \" & File.DirApp)";
anywheresoftware.b4a.keywords.Common.LogImpl("865541","File.DirApp "+anywheresoftware.b4a.keywords.Common.File.getDirApp(),0);
RDebugUtils.currentLine=65551;
 //BA.debugLineNum = 65551;BA.debugLine="Robot = Robot.InitializeStatic(\"com.sun.glass.ui.";
_robot = _robot.InitializeStatic("com.sun.glass.ui.Application").RunMethodJO("GetApplication",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethodJO("createRobot",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=65553;
 //BA.debugLineNum = 65553;BA.debugLine="mConfiguracionUsuario.Initialize";
_mconfiguracionusuario.Initialize();
RDebugUtils.currentLine=65557;
 //BA.debugLineNum = 65557;BA.debugLine="Dim rb As AWTRobot";
_rb = new butt.droid.awtRobot.AWTRobot();
RDebugUtils.currentLine=65558;
 //BA.debugLineNum = 65558;BA.debugLine="DatosUsuario.Dispositivo=rb.SystemHostNameAndIPAd";
_datosusuario.Dispositivo /*String*/  = _rb.SystemHostNameAndIPAddress();
RDebugUtils.currentLine=65559;
 //BA.debugLineNum = 65559;BA.debugLine="DatosUsuario.NombreUsuarioWindows=GetSystemProper";
_datosusuario.NombreUsuarioWindows /*String*/  = anywheresoftware.b4a.keywords.Common.GetSystemProperty("user.name","default");
RDebugUtils.currentLine=65561;
 //BA.debugLineNum = 65561;BA.debugLine="Dim JO As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=65562;
 //BA.debugLineNum = 65562;BA.debugLine="JO.InitializeStatic(\"java.lang.System\")";
_jo.InitializeStatic("java.lang.System");
RDebugUtils.currentLine=65564;
 //BA.debugLineNum = 65564;BA.debugLine="Dim mSys As JavaObject=JO.RunMethodJO(\"getenv\",Nu";
_msys = new anywheresoftware.b4j.object.JavaObject();
_msys = _jo.RunMethodJO("getenv",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=65565;
 //BA.debugLineNum = 65565;BA.debugLine="Log(mSys)";
anywheresoftware.b4a.keywords.Common.LogImpl("865565",BA.ObjectToString(_msys),0);
RDebugUtils.currentLine=65566;
 //BA.debugLineNum = 65566;BA.debugLine="Dim mInfoSystem As Map=mSys";
_minfosystem = new anywheresoftware.b4a.objects.collections.Map();
_minfosystem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_msys.getObject()));
RDebugUtils.currentLine=65567;
 //BA.debugLineNum = 65567;BA.debugLine="DatosUsuario.DominioUsuarioWindows=mInfoSystem.Ge";
_datosusuario.DominioUsuarioWindows /*String*/  = BA.ObjectToString(_minfosystem.Get((Object)("USERDOMAIN")));
RDebugUtils.currentLine=65568;
 //BA.debugLineNum = 65568;BA.debugLine="DatosUsuario.NombreADUsuarioWindows=DatosUsuario.";
_datosusuario.NombreADUsuarioWindows /*String*/  = _datosusuario.DominioUsuarioWindows /*String*/ +"\\"+_datosusuario.NombreUsuarioWindows /*String*/ ;
RDebugUtils.currentLine=65570;
 //BA.debugLineNum = 65570;BA.debugLine="Dim local As ServerSocket";
_local = new anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper();
RDebugUtils.currentLine=65571;
 //BA.debugLineNum = 65571;BA.debugLine="local.Initialize(1, \"\")";
_local.Initialize(ba,(int) (1),"");
RDebugUtils.currentLine=65573;
 //BA.debugLineNum = 65573;BA.debugLine="DatosUsuario.IPConexion=local.GetMyIP";
_datosusuario.IPConexion /*String*/  = _local.GetMyIP();
RDebugUtils.currentLine=65575;
 //BA.debugLineNum = 65575;BA.debugLine="If DatosUsuario.IPConexion.StartsWith(\"192.168.10";
if (_datosusuario.IPConexion /*String*/ .startsWith("192.168.10.")) { 
RDebugUtils.currentLine=65576;
 //BA.debugLineNum = 65576;BA.debugLine="AlmacenIPConexion=\"PROIN\"";
_almacenipconexion = "PROIN";
 };
RDebugUtils.currentLine=65579;
 //BA.debugLineNum = 65579;BA.debugLine="If DatosUsuario.IPConexion.StartsWith(\"192.168.20";
if (_datosusuario.IPConexion /*String*/ .startsWith("192.168.20.")) { 
RDebugUtils.currentLine=65580;
 //BA.debugLineNum = 65580;BA.debugLine="AlmacenIPConexion=\"PROTEC\"";
_almacenipconexion = "PROTEC";
 };
RDebugUtils.currentLine=65583;
 //BA.debugLineNum = 65583;BA.debugLine="If DatosUsuario.IPConexion.StartsWith(\"10.0.0.\")";
if (_datosusuario.IPConexion /*String*/ .startsWith("10.0.0.")) { 
RDebugUtils.currentLine=65584;
 //BA.debugLineNum = 65584;BA.debugLine="AlmacenIPConexion=\"PROTEC\"";
_almacenipconexion = "PROTEC";
 };
RDebugUtils.currentLine=65587;
 //BA.debugLineNum = 65587;BA.debugLine="If DatosUsuario.IPConexion.StartsWith(\"192.168.11";
if (_datosusuario.IPConexion /*String*/ .startsWith("192.168.11")) { 
RDebugUtils.currentLine=65588;
 //BA.debugLineNum = 65588;BA.debugLine="AlmacenIPConexion=\"PROIN\"";
_almacenipconexion = "PROIN";
 };
RDebugUtils.currentLine=65591;
 //BA.debugLineNum = 65591;BA.debugLine="If AlmacenIPConexion<>\"\" Then";
if ((_almacenipconexion).equals("") == false) { 
RDebugUtils.currentLine=65592;
 //BA.debugLineNum = 65592;BA.debugLine="AlmacenConexion=AlmacenIPConexion";
_almacenconexion = _almacenipconexion;
 };
RDebugUtils.currentLine=65617;
 //BA.debugLineNum = 65617;BA.debugLine="Dim mScreenDim As Map";
_mscreendim = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=65618;
 //BA.debugLineNum = 65618;BA.debugLine="mScreenDim.Initialize";
_mscreendim.Initialize();
RDebugUtils.currentLine=65619;
 //BA.debugLineNum = 65619;BA.debugLine="mScreenDim=Utilidades.DimensionesPantalla";
_mscreendim = _utilidades._dimensionespantalla /*anywheresoftware.b4a.objects.collections.Map*/ ();
RDebugUtils.currentLine=65620;
 //BA.debugLineNum = 65620;BA.debugLine="xScreen=mScreenDim.Get(\"X\")";
_xscreen = (int)(BA.ObjectToNumber(_mscreendim.Get((Object)("X"))));
RDebugUtils.currentLine=65621;
 //BA.debugLineNum = 65621;BA.debugLine="yScreen=mScreenDim.Get(\"Y\")";
_yscreen = (int)(BA.ObjectToNumber(_mscreendim.Get((Object)("Y"))));
RDebugUtils.currentLine=65625;
 //BA.debugLineNum = 65625;BA.debugLine="awesome = fx.CreateFontAwesome(14)";
_awesome = _fx.CreateFontAwesome(14);
RDebugUtils.currentLine=65636;
 //BA.debugLineNum = 65636;BA.debugLine="lstSelItem.Initialize";
_lstselitem.Initialize();
RDebugUtils.currentLine=65638;
 //BA.debugLineNum = 65638;BA.debugLine="Inicio";
_inicio();
RDebugUtils.currentLine=65687;
 //BA.debugLineNum = 65687;BA.debugLine="End Sub";
return "";
}
public static void  _inicio() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "inicio", false))
	 {Debug.delegate(ba, "inicio", null); return;}
ResumableSub_Inicio rsub = new ResumableSub_Inicio(null);
rsub.resume(ba, null);
}
public static class ResumableSub_Inicio extends BA.ResumableSub {
public ResumableSub_Inicio(b4j.docU.main parent) {
this.parent = parent;
}
b4j.docU.main parent;
boolean _success = false;
anywheresoftware.b4a.objects.collections.List _files = null;
int _i = 0;
String _sresp = "";
Object _msa = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
String _accion = "";
Object _robj = null;
int step15;
int limit15;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="IconoFormularios=fx.LoadImage(File.DirAssets,\"doc";
parent._iconoformularios = parent._fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"docU32.png");
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="SufijoTitleForms=\"   \" & NombreAplicacion & \"  v\"";
parent._sufijotitleforms = "   "+parent._nombreaplicacion+"  v"+parent._version+"    Usuario: "+parent._datosusuario.NombreUsuarioWindows /*String*/ ;
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="NombreFicheroIconoAplicacion=\"docU32.png\"";
parent._nombreficheroiconoaplicacion = "docU32.png";
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="PrefijoTitleForms=NombreAplicacionForms & \"  v\" &";
parent._prefijotitleforms = parent._nombreaplicacionforms+"  v"+parent._version+"    Usuario: "+parent._datosusuario.NombreUsuarioWindows /*String*/ +anywheresoftware.b4a.keywords.Common.TAB+" ";
RDebugUtils.currentLine=131088;
 //BA.debugLineNum = 131088;BA.debugLine="Log(\"DatosUsuario \" & DatosUsuario)";
anywheresoftware.b4a.keywords.Common.LogImpl("8131088","DatosUsuario "+BA.ObjectToString(parent._datosusuario),0);
RDebugUtils.currentLine=131096;
 //BA.debugLineNum = 131096;BA.debugLine="PrefijoTitleForms=NombreAplicacionForms & \"  v\" &";
parent._prefijotitleforms = parent._nombreaplicacionforms+"  v"+parent._version+"    Usuario: "+parent._datosusuario.NombreUsuarioWindows /*String*/ +"\\"+parent._datosusuario.DominioUsuarioWindows /*String*/ +anywheresoftware.b4a.keywords.Common.TAB+" ";
RDebugUtils.currentLine=131099;
 //BA.debugLineNum = 131099;BA.debugLine="UserFolder=GetSystemProperty(\"user.home\",\"\") & \"\\";
parent._userfolder = anywheresoftware.b4a.keywords.Common.GetSystemProperty("user.home","")+"\\AppData\\Roaming\\"+parent._nombreaplicacion;
RDebugUtils.currentLine=131100;
 //BA.debugLineNum = 131100;BA.debugLine="UserTempFolder=UserFolder & \"\\Temp\"";
parent._usertempfolder = parent._userfolder+"\\Temp";
RDebugUtils.currentLine=131101;
 //BA.debugLineNum = 131101;BA.debugLine="Log(\"UserFolder \" & UserFolder)";
anywheresoftware.b4a.keywords.Common.LogImpl("8131101","UserFolder "+parent._userfolder,0);
RDebugUtils.currentLine=131106;
 //BA.debugLineNum = 131106;BA.debugLine="If File.Exists(UserTempFolder,\"\")=False Then";
if (true) break;

case 1:
//if
this.state = 14;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent._usertempfolder,"")==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 14;
RDebugUtils.currentLine=131107;
 //BA.debugLineNum = 131107;BA.debugLine="File.MakeDir(UserTempFolder,\"\")";
anywheresoftware.b4a.keywords.Common.File.MakeDir(parent._usertempfolder,"");
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=131109;
 //BA.debugLineNum = 131109;BA.debugLine="Wait For (File.ListFilesAsync(UserTempFolder)) C";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "inicio"), anywheresoftware.b4a.keywords.Common.File.ListFilesAsync(ba,parent._usertempfolder));
this.state = 45;
return;
case 45:
//C
this.state = 6;
_success = (boolean) result[0];
_files = (anywheresoftware.b4a.objects.collections.List) result[1];
;
RDebugUtils.currentLine=131110;
 //BA.debugLineNum = 131110;BA.debugLine="If Success Then";
if (true) break;

case 6:
//if
this.state = 13;
if (_success) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=131111;
 //BA.debugLineNum = 131111;BA.debugLine="For i=0 To Files.Size-1";
if (true) break;

case 9:
//for
this.state = 12;
step15 = 1;
limit15 = (int) (_files.getSize()-1);
_i = (int) (0) ;
this.state = 46;
if (true) break;

case 46:
//C
this.state = 12;
if ((step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15)) this.state = 11;
if (true) break;

case 47:
//C
this.state = 46;
_i = ((int)(0 + _i + step15)) ;
if (true) break;

case 11:
//C
this.state = 47;
RDebugUtils.currentLine=131112;
 //BA.debugLineNum = 131112;BA.debugLine="File.Delete(UserTempFolder,Files.Get(i))";
anywheresoftware.b4a.keywords.Common.File.Delete(parent._usertempfolder,BA.ObjectToString(_files.Get(_i)));
 if (true) break;
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
 if (true) break;
;
RDebugUtils.currentLine=131118;
 //BA.debugLineNum = 131118;BA.debugLine="If File.Exists(xui.DefaultFolder,\"SQLGestionVenta";

case 14:
//if
this.state = 19;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent._xui.getDefaultFolder(),"SQLGestionVentas.db")) { 
this.state = 16;
;}if (true) break;

case 16:
//C
this.state = 19;
anywheresoftware.b4a.keywords.Common.File.Delete(parent._xui.getDefaultFolder(),"SQLGestionVentas.db");
if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=131121;
 //BA.debugLineNum = 131121;BA.debugLine="wait for(CargaPermisosUsuario) complete (sResp As";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "inicio"), _cargapermisosusuario());
this.state = 48;
return;
case 48:
//C
this.state = 20;
_sresp = (String) result[0];
;
RDebugUtils.currentLine=131122;
 //BA.debugLineNum = 131122;BA.debugLine="If sResp=\"NO\" Then";
if (true) break;

case 20:
//if
this.state = 23;
if ((_sresp).equals("NO")) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=131123;
 //BA.debugLineNum = 131123;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=131124;
 //BA.debugLineNum = 131124;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=131127;
 //BA.debugLineNum = 131127;BA.debugLine="If sResp=\"ADMIN\" Then DatosUsuario.Administrador=";

case 23:
//if
this.state = 28;
if ((_sresp).equals("ADMIN")) { 
this.state = 25;
;}if (true) break;

case 25:
//C
this.state = 28;
parent._datosusuario.Administrador /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=131129;
 //BA.debugLineNum = 131129;BA.debugLine="If CargaDatosGrabadosConfiguracionUsuario=False T";
if (true) break;

case 29:
//if
this.state = 32;
if (_cargadatosgrabadosconfiguracionusuario()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=131130;
 //BA.debugLineNum = 131130;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error al carg";
_msa = parent._xui.MsgboxAsync(ba,"Error al cargar la configuración de usuario. No es posible iniciar la aplicación.","Error");
RDebugUtils.currentLine=131131;
 //BA.debugLineNum = 131131;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "inicio"), _msa);
this.state = 49;
return;
case 49:
//C
this.state = 32;
;
RDebugUtils.currentLine=131132;
 //BA.debugLineNum = 131132;BA.debugLine="frm.Close";
parent._frm.Close();
 if (true) break;

case 32:
//C
this.state = 33;
;
RDebugUtils.currentLine=131137;
 //BA.debugLineNum = 131137;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._xui.CreatePanel(ba,"");
RDebugUtils.currentLine=131138;
 //BA.debugLineNum = 131138;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 1dip, 1dip)";
_p.SetLayoutAnimated((int) (0),0,0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=131139;
 //BA.debugLineNum = 131139;BA.debugLine="cvs.Initialize(p)";
parent._cvs.Initialize(ba,_p);
RDebugUtils.currentLine=131152;
 //BA.debugLineNum = 131152;BA.debugLine="CargarDatosConfiguracionAplicacion";
_cargardatosconfiguracionaplicacion();
RDebugUtils.currentLine=131153;
 //BA.debugLineNum = 131153;BA.debugLine="Wait For CargarDatosConfiguracionAplicacion_Compl";
anywheresoftware.b4a.keywords.Common.WaitFor("cargardatosconfiguracionaplicacion_complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "inicio"), null);
this.state = 50;
return;
case 50:
//C
this.state = 33;
_accion = (String) result[0];
;
RDebugUtils.currentLine=131155;
 //BA.debugLineNum = 131155;BA.debugLine="If Accion=\"ErrConn\" Then";
if (true) break;

case 33:
//if
this.state = 44;
if ((_accion).equals("ErrConn")) { 
this.state = 35;
}else {
this.state = 37;
}if (true) break;

case 35:
//C
this.state = 44;
RDebugUtils.currentLine=131156;
 //BA.debugLineNum = 131156;BA.debugLine="frm.Initialize(\"frm\",xScreen, yScreen)";
parent._frm.Initialize(ba,"frm",parent._xscreen,parent._yscreen);
RDebugUtils.currentLine=131157;
 //BA.debugLineNum = 131157;BA.debugLine="frm.Icon = IconoFormularios";
parent._frm.setIcon((javafx.scene.image.Image)(parent._iconoformularios.getObject()));
RDebugUtils.currentLine=131158;
 //BA.debugLineNum = 131158;BA.debugLine="frm.RootPane.LoadLayout(\"scrMain\") 'Load the lay";
parent._frm.getRootPane().LoadLayout(ba,"scrMain");
RDebugUtils.currentLine=131159;
 //BA.debugLineNum = 131159;BA.debugLine="frm.Show";
parent._frm.Show();
RDebugUtils.currentLine=131160;
 //BA.debugLineNum = 131160;BA.debugLine="frm.Title=\"TOJ\"";
parent._frm.setTitle("TOJ");
RDebugUtils.currentLine=131161;
 //BA.debugLineNum = 131161;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = parent._xui.MsgboxAsync(ba,"Error de conexion servidor (DatosConfigAlmacen). No es posible iniciar la aplicación.","Error");
RDebugUtils.currentLine=131162;
 //BA.debugLineNum = 131162;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "inicio"), _msa);
this.state = 51;
return;
case 51:
//C
this.state = 44;
;
RDebugUtils.currentLine=131163;
 //BA.debugLineNum = 131163;BA.debugLine="frm.Close";
parent._frm.Close();
 if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=131165;
 //BA.debugLineNum = 131165;BA.debugLine="If Accion=\"ErrNoConf\" Then";
if (true) break;

case 38:
//if
this.state = 43;
if ((_accion).equals("ErrNoConf")) { 
this.state = 40;
}else {
this.state = 42;
}if (true) break;

case 40:
//C
this.state = 43;
RDebugUtils.currentLine=131166;
 //BA.debugLineNum = 131166;BA.debugLine="frm.Initialize(\"frm\",xScreen, yScreen)";
parent._frm.Initialize(ba,"frm",parent._xscreen,parent._yscreen);
RDebugUtils.currentLine=131167;
 //BA.debugLineNum = 131167;BA.debugLine="frm.Icon = IconoFormularios";
parent._frm.setIcon((javafx.scene.image.Image)(parent._iconoformularios.getObject()));
RDebugUtils.currentLine=131168;
 //BA.debugLineNum = 131168;BA.debugLine="frm.RootPane.LoadLayout(\"scrMain\") 'Load the la";
parent._frm.getRootPane().LoadLayout(ba,"scrMain");
RDebugUtils.currentLine=131169;
 //BA.debugLineNum = 131169;BA.debugLine="frm.Show";
parent._frm.Show();
RDebugUtils.currentLine=131170;
 //BA.debugLineNum = 131170;BA.debugLine="frm.Title=\"TOJ\"";
parent._frm.setTitle("TOJ");
RDebugUtils.currentLine=131171;
 //BA.debugLineNum = 131171;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Falta config";
_msa = parent._xui.MsgboxAsync(ba,"Falta configuración de la aplicación, avisar al administrador de la aplicación","Error");
RDebugUtils.currentLine=131172;
 //BA.debugLineNum = 131172;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "inicio"), _msa);
this.state = 52;
return;
case 52:
//C
this.state = 43;
;
RDebugUtils.currentLine=131173;
 //BA.debugLineNum = 131173;BA.debugLine="frm.Close";
parent._frm.Close();
 if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=131183;
 //BA.debugLineNum = 131183;BA.debugLine="Wait For(ShowSplashScreen2) complete (rObj As O";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "inicio"), _showsplashscreen2());
this.state = 53;
return;
case 53:
//C
this.state = 43;
_robj = (Object) result[0];
;
RDebugUtils.currentLine=131184;
 //BA.debugLineNum = 131184;BA.debugLine="MainMenu2.Show";
parent._mainmenu2._show /*void*/ ();
 if (true) break;

case 43:
//C
this.state = 44;
;
 if (true) break;

case 44:
//C
this.state = -1;
;
RDebugUtils.currentLine=131188;
 //BA.debugLineNum = 131188;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static boolean  _cargadatosgrabadosconfiguracionusuario() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "cargadatosgrabadosconfiguracionusuario", false))
	 {return ((Boolean) Debug.delegate(ba, "cargadatosgrabadosconfiguracionusuario", null));}
boolean _confusuario = false;
anywheresoftware.b4a.randomaccessfile.B4XSerializator _ser = null;
Object[] _opt = null;
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub CargaDatosGrabadosConfiguracionUsuario As Bool";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="Dim ConfUsuario As Boolean=True";
_confusuario = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="Try";
try {RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="If File.Exists(UserFolder, \"ConfiguracionUsuario";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_userfolder,"ConfiguracionUsuario.txt")) { 
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="Dim ser As B4XSerializator";
_ser = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="Dim opt() As Object = ser.ConvertBytesToObject(";
_opt = (Object[])(_ser.ConvertBytesToObject(anywheresoftware.b4a.keywords.Common.File.ReadBytes(_userfolder,"ConfiguracionUsuario.txt")));
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="mConfiguracionUsuario = opt(0)";
_mconfiguracionusuario = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_opt[(int) (0)]));
 };
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=393225;
 //BA.debugLineNum = 393225;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("8393225",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
RDebugUtils.currentLine=393227;
 //BA.debugLineNum = 393227;BA.debugLine="ConfUsuario=False";
_confusuario = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=393229;
 //BA.debugLineNum = 393229;BA.debugLine="Return ConfUsuario";
if (true) return _confusuario;
RDebugUtils.currentLine=393230;
 //BA.debugLineNum = 393230;BA.debugLine="End Sub";
return false;
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargapermisosusuario() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "cargapermisosusuario", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargapermisosusuario", null));}
ResumableSub_CargaPermisosUsuario rsub = new ResumableSub_CargaPermisosUsuario(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaPermisosUsuario extends BA.ResumableSub {
public ResumableSub_CargaPermisosUsuario(b4j.docU.main parent) {
this.parent = parent;
}
b4j.docU.main parent;
String _permisoapp = "";
String _sres = "";
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Dim PermisoAPP As String";
_permisoapp = "";
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="Wait For(cmPermisos.PermisosAplicacionUsuarioObje";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "cargapermisosusuario"), parent._cmpermisos._permisosaplicacionusuarioobjetopermiso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._rdclinkmysqldatoscomunes,"PermisosAplicacion",parent._nombreaplicacion,parent._datosusuario.NombreUsuarioWindows /*String*/ ,"Aplicacion"));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_sres = (String) result[0];
;
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="Select Case sRes";
if (true) break;

case 1:
//select
this.state = 12;
switch (BA.switchObjectToInt(_sres,"ErrConn","SinPermiso","ERROR","DENIED")) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
case 2: {
this.state = 7;
if (true) break;
}
case 3: {
this.state = 9;
if (true) break;
}
default: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 12;
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de con";
_msa = parent._xui.MsgboxAsync(ba,"Error de conexion servidor/query.","Error");
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "cargapermisosusuario"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="PermisoAPP=\"NO\"";
_permisoapp = "NO";
 if (true) break;

case 5:
//C
this.state = 12;
RDebugUtils.currentLine=655373;
 //BA.debugLineNum = 655373;BA.debugLine="PermisoAPP=\"OK\"";
_permisoapp = "OK";
 if (true) break;

case 7:
//C
this.state = 12;
RDebugUtils.currentLine=655375;
 //BA.debugLineNum = 655375;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sRes,\"Error\")";
_msa = parent._xui.MsgboxAsync(ba,_sres,"Error");
RDebugUtils.currentLine=655376;
 //BA.debugLineNum = 655376;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "cargapermisosusuario"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 12;
;
RDebugUtils.currentLine=655377;
 //BA.debugLineNum = 655377;BA.debugLine="PermisoAPP=\"NO\"";
_permisoapp = "NO";
 if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=655379;
 //BA.debugLineNum = 655379;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes pe";
_msa = parent._xui.MsgboxAsync(ba,"No tienes permiso para acceder a  esta aplicación.","Aviso");
RDebugUtils.currentLine=655380;
 //BA.debugLineNum = 655380;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "cargapermisosusuario"), _msa);
this.state = 16;
return;
case 16:
//C
this.state = 12;
;
RDebugUtils.currentLine=655381;
 //BA.debugLineNum = 655381;BA.debugLine="PermisoAPP=\"NO\"";
_permisoapp = "NO";
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=655384;
 //BA.debugLineNum = 655384;BA.debugLine="PermisoAPP=sRes";
_permisoapp = _sres;
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=655386;
 //BA.debugLineNum = 655386;BA.debugLine="Return PermisoAPP";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_permisoapp));return;};
RDebugUtils.currentLine=655387;
 //BA.debugLineNum = 655387;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _cargardatosconfiguracionaplicacion() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "cargardatosconfiguracionaplicacion", false))
	 {Debug.delegate(ba, "cargardatosconfiguracionaplicacion", null); return;}
ResumableSub_CargarDatosConfiguracionAplicacion rsub = new ResumableSub_CargarDatosConfiguracionAplicacion(null);
rsub.resume(ba, null);
}
public static class ResumableSub_CargarDatosConfiguracionAplicacion extends BA.ResumableSub {
public ResumableSub_CargarDatosConfiguracionAplicacion(b4j.docU.main parent) {
this.parent = parent;
}
b4j.docU.main parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _m = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="JRDCQuery.DatosJRDC(rdclinkMySqlDatosComunes,\"Dat";
parent._jrdcquery._datosjrdc /*void*/ (parent._rdclinkmysqldatoscomunes,"DatosConfigAlmacen",new Object[]{(Object)("PROTEC")},main.getObject());
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
anywheresoftware.b4a.keywords.Common.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "cargardatosconfiguracionaplicacion"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 12;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="Accion=\"ErrConn\"";
_accion = "ErrConn";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
if (true) break;

case 6:
//if
this.state = 11;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
RDebugUtils.currentLine=458766;
 //BA.debugLineNum = 458766;BA.debugLine="Accion=\"ErrNoConf\"";
_accion = "ErrNoConf";
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=458768;
 //BA.debugLineNum = 458768;BA.debugLine="Dim lstReg As List=mresult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=458769;
 //BA.debugLineNum = 458769;BA.debugLine="Dim m As Map=lstReg.Get(0)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=458770;
 //BA.debugLineNum = 458770;BA.debugLine="DatosConfiguracionAplicacion.DireccionEnvioEmai";
parent._datosconfiguracionaplicacion.DireccionEnvioEmail /*String*/  = BA.ObjectToString(_m.Get((Object)("EmailSenderError")));
RDebugUtils.currentLine=458773;
 //BA.debugLineNum = 458773;BA.debugLine="DatosConfiguracionAplicacion.PasswordEnvioEmail";
parent._datosconfiguracionaplicacion.PasswordEnvioEmail /*String*/  = BA.ObjectToString(_m.Get((Object)("EmailPsswSenderError")));
RDebugUtils.currentLine=458775;
 //BA.debugLineNum = 458775;BA.debugLine="DatosConfiguracionAplicacion.PuertoEnvioEmail=m";
parent._datosconfiguracionaplicacion.PuertoEnvioEmail /*int*/  = (int)(BA.ObjectToNumber(_m.Get((Object)("PortServerError"))));
RDebugUtils.currentLine=458776;
 //BA.debugLineNum = 458776;BA.debugLine="DatosConfiguracionAplicacion.ServidorEnvioEmail";
parent._datosconfiguracionaplicacion.ServidorEnvioEmail /*String*/  = BA.ObjectToString(_m.Get((Object)("SMTPServerError")));
RDebugUtils.currentLine=458777;
 //BA.debugLineNum = 458777;BA.debugLine="DatosConfiguracionAplicacion.EmailDesarrollador";
parent._datosconfiguracionaplicacion.EmailDesarrollador1 /*String*/  = BA.ObjectToString(_m.Get((Object)("EmailDeveloper1")));
RDebugUtils.currentLine=458778;
 //BA.debugLineNum = 458778;BA.debugLine="DatosConfiguracionAplicacion.EmailDesarrollador";
parent._datosconfiguracionaplicacion.EmailDesarrollador2 /*String*/  = BA.ObjectToString(_m.Get((Object)("EmailDeveloper2")));
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
RDebugUtils.currentLine=458784;
 //BA.debugLineNum = 458784;BA.debugLine="CallSubDelayed2(Me,\"CargarDatosConfiguracionAplic";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(ba,main.getObject(),"CargarDatosConfiguracionAplicacion_Complete",(Object)(_accion));
RDebugUtils.currentLine=458785;
 //BA.debugLineNum = 458785;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.objects.collections.Map  _getsystemproperties() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getsystemproperties", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getsystemproperties", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _m = null;
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub GetSystemProperties As Map";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="jo = jo.InitializeStatic(\"java.lang.management.Ma";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.InitializeStatic("java.lang.management.ManagementFactory").RunMethod("getRuntimeMXBean",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="Dim m As JavaObject";
_m = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="m.InitializeNewInstance(\"anywheresoftware.b4a.obj";
_m.InitializeNewInstance("anywheresoftware.b4a.objects.collections.Map$MyMap",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="m.RunMethod(\"putAll\", Array(jo.RunMethod(\"getSyst";
_m.RunMethod("putAll",new Object[]{_jo.RunMethod("getSystemProperties",(Object[])(anywheresoftware.b4a.keywords.Common.Null))});
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="Return m";
if (true) return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_m.getObject()));
RDebugUtils.currentLine=196615;
 //BA.debugLineNum = 196615;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _showsplashscreen2() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "showsplashscreen2", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "showsplashscreen2", null));}
ResumableSub_ShowSplashScreen2 rsub = new ResumableSub_ShowSplashScreen2(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ShowSplashScreen2 extends BA.ResumableSub {
public ResumableSub_ShowSplashScreen2(b4j.docU.main parent) {
this.parent = parent;
}
b4j.docU.main parent;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _b4xbitmapsplash = null;
anywheresoftware.b4j.objects.Form _sp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="Dim B4XBitmapSplash As B4XBitmap=xui.LoadBitmap(F";
_b4xbitmapsplash = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_b4xbitmapsplash = parent._xui.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"docUSplash2.png");
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="Dim sp As Form";
_sp = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="sp.Initialize(\"sp\", B4XBitmapSplash.Width+20dip,";
_sp.Initialize(ba,"sp",_b4xbitmapsplash.getWidth()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)),_b4xbitmapsplash.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="sp.SetFormStyle(\"TRANSPARENT\")";
_sp.SetFormStyle("TRANSPARENT");
RDebugUtils.currentLine=327689;
 //BA.debugLineNum = 327689;BA.debugLine="sp.BackColor = fx.Colors.Transparent";
_sp.setBackColor(parent._fx.Colors.Transparent);
RDebugUtils.currentLine=327692;
 //BA.debugLineNum = 327692;BA.debugLine="sp.RootPane.LoadLayout(\"scrSplashScreen\")";
_sp.getRootPane().LoadLayout(ba,"scrSplashScreen");
RDebugUtils.currentLine=327695;
 //BA.debugLineNum = 327695;BA.debugLine="ImageViewSplashScreen.SetBitmap(B4XBitmapSplash)";
parent._imageviewsplashscreen.SetBitmap((javafx.scene.image.Image)(_b4xbitmapsplash.getObject()));
RDebugUtils.currentLine=327697;
 //BA.debugLineNum = 327697;BA.debugLine="lblSplashScreenAppVersion.TextColor=xui.Color_Lig";
parent._lblsplashscreenappversion.setTextColor(parent._xui.Color_LightGray);
RDebugUtils.currentLine=327698;
 //BA.debugLineNum = 327698;BA.debugLine="lblSplashScreenAppVersion.Text=$\"${NombreAplicaci";
parent._lblsplashscreenappversion.setText((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._nombreaplicacion))+" v "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._version))+""));
RDebugUtils.currentLine=327699;
 //BA.debugLineNum = 327699;BA.debugLine="CSSUtils.SetBorder(ImageViewSplashScreen,1dip,fx.";
parent._cssutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(parent._imageviewsplashscreen.getObject())),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)),(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffd3d3d3)))),10);
RDebugUtils.currentLine=327702;
 //BA.debugLineNum = 327702;BA.debugLine="sp.Show";
_sp.Show();
RDebugUtils.currentLine=327704;
 //BA.debugLineNum = 327704;BA.debugLine="Utilidades.CenterFormOnScreen(sp)";
parent._utilidades._centerformonscreen /*String*/ (_sp);
RDebugUtils.currentLine=327705;
 //BA.debugLineNum = 327705;BA.debugLine="sp.RootPane.Alpha = 0";
_sp.getRootPane().setAlpha(0);
RDebugUtils.currentLine=327706;
 //BA.debugLineNum = 327706;BA.debugLine="sp.RootPane.SetAlphaAnimated(500, 1)";
_sp.getRootPane().SetAlphaAnimated((int) (500),1);
RDebugUtils.currentLine=327707;
 //BA.debugLineNum = 327707;BA.debugLine="Wait For (sp.RootPane) sp_AnimationCompleted";
anywheresoftware.b4a.keywords.Common.WaitFor("sp_animationcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "showsplashscreen2"), (Object)(_sp.getRootPane().getObject()));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=327708;
 //BA.debugLineNum = 327708;BA.debugLine="Sleep(2000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "showsplashscreen2"),(int) (2000));
this.state = 2;
return;
case 2:
//C
this.state = -1;
;
RDebugUtils.currentLine=327709;
 //BA.debugLineNum = 327709;BA.debugLine="sp.RootPane.SetAlphaAnimated(500, 0)";
_sp.getRootPane().SetAlphaAnimated((int) (500),0);
RDebugUtils.currentLine=327710;
 //BA.debugLineNum = 327710;BA.debugLine="Wait For (sp.RootPane) sp_AnimationCompleted";
anywheresoftware.b4a.keywords.Common.WaitFor("sp_animationcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "showsplashscreen2"), (Object)(_sp.getRootPane().getObject()));
this.state = 3;
return;
case 3:
//C
this.state = -1;
;
RDebugUtils.currentLine=327711;
 //BA.debugLineNum = 327711;BA.debugLine="sp.Close";
_sp.Close();
RDebugUtils.currentLine=327713;
 //BA.debugLineNum = 327713;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
RDebugUtils.currentLine=327714;
 //BA.debugLineNum = 327714;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _showsplashscreen() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "showsplashscreen", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "showsplashscreen", null));}
ResumableSub_ShowSplashScreen rsub = new ResumableSub_ShowSplashScreen(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ShowSplashScreen extends BA.ResumableSub {
public ResumableSub_ShowSplashScreen(b4j.docU.main parent) {
this.parent = parent;
}
b4j.docU.main parent;
anywheresoftware.b4j.objects.Form _sp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="Dim sp As Form";
_sp = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="sp.Initialize(\"sp\", 500, 224)";
_sp.Initialize(ba,"sp",500,224);
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="sp.SetFormStyle(\"TRANSPARENT\")";
_sp.SetFormStyle("TRANSPARENT");
RDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="sp.BackColor = fx.Colors.Transparent";
_sp.setBackColor(parent._fx.Colors.Transparent);
RDebugUtils.currentLine=262156;
 //BA.debugLineNum = 262156;BA.debugLine="CSSUtils.SetBackgroundImage(sp.RootPane, File.Dir";
parent._cssutils._setbackgroundimage((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_sp.getRootPane().getObject())),anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"docUSplash2.png");
RDebugUtils.currentLine=262159;
 //BA.debugLineNum = 262159;BA.debugLine="sp.Show";
_sp.Show();
RDebugUtils.currentLine=262161;
 //BA.debugLineNum = 262161;BA.debugLine="Utilidades.CenterFormOnScreen(sp)";
parent._utilidades._centerformonscreen /*String*/ (_sp);
RDebugUtils.currentLine=262162;
 //BA.debugLineNum = 262162;BA.debugLine="sp.RootPane.Alpha = 0";
_sp.getRootPane().setAlpha(0);
RDebugUtils.currentLine=262163;
 //BA.debugLineNum = 262163;BA.debugLine="sp.RootPane.SetAlphaAnimated(500, 1)";
_sp.getRootPane().SetAlphaAnimated((int) (500),1);
RDebugUtils.currentLine=262164;
 //BA.debugLineNum = 262164;BA.debugLine="Wait For (sp.RootPane) sp_AnimationCompleted";
anywheresoftware.b4a.keywords.Common.WaitFor("sp_animationcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "showsplashscreen"), (Object)(_sp.getRootPane().getObject()));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=262165;
 //BA.debugLineNum = 262165;BA.debugLine="Sleep(2000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "showsplashscreen"),(int) (2000));
this.state = 2;
return;
case 2:
//C
this.state = -1;
;
RDebugUtils.currentLine=262166;
 //BA.debugLineNum = 262166;BA.debugLine="sp.RootPane.SetAlphaAnimated(1000, 0)";
_sp.getRootPane().SetAlphaAnimated((int) (1000),0);
RDebugUtils.currentLine=262167;
 //BA.debugLineNum = 262167;BA.debugLine="Wait For (sp.RootPane) sp_AnimationCompleted";
anywheresoftware.b4a.keywords.Common.WaitFor("sp_animationcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "showsplashscreen"), (Object)(_sp.getRootPane().getObject()));
this.state = 3;
return;
case 3:
//C
this.state = -1;
;
RDebugUtils.currentLine=262168;
 //BA.debugLineNum = 262168;BA.debugLine="sp.Close";
_sp.Close();
RDebugUtils.currentLine=262170;
 //BA.debugLineNum = 262170;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
RDebugUtils.currentLine=262171;
 //BA.debugLineNum = 262171;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}