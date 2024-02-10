package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class canalisisdisponiblefichaestadocomentarioalmacenarticulotalla extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _tipodatosanalisisdisponiblefichaalmacenarticulotalla{
public boolean IsInitialized;
public boolean DatosModificados;
public boolean ConComentario;
public String Estado;
public String Comentario;
public void Initialize() {
IsInitialized = true;
DatosModificados = false;
ConComentario = false;
Estado = "";
Comentario = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4j.docU.b4xdialog _dialog = null;
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mparent = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _background = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlbase = null;
public String _malmacen = "";
public String _mnombrealmacen = "";
public String _marticulo = "";
public String _mdescripcionarticulo = "";
public String _mtalla = "";
public b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._tipodatosanalisisdisponiblefichaalmacenarticulotalla _datosanalisisdisponiblefichaalmacenarticulotalla = null;
public b4j.docU.jamloadingindicator _jamloadingindicator1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnselnuevafecha = null;
public anywheresoftware.b4j.objects.ChoiceBoxWrapper _chbonuevoestado = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtalmacen = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtareacomentario = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtarticulo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtdescripcionarticulo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtestadoactual = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtfechaactual = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtnombrealmacen = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtnuevafecha = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtnuevousuario = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txttalla = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtusuarioactual = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btngrabarfichaestadocomentarioalmacenarticulotalla = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btncancelarfichaestadocomentarioalmacenarticulotalla = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btneliminarfichaestadocomentarioalmacenarticulotalla = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblmodofichaestadocomentario = null;
public String _modoficha = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltitlepanel = null;
public double _downx = 0;
public double _downy = 0;
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
public String  _background_mouseclicked(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisisdisponiblefichaestadocomentarioalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "background_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "background_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=40960000;
 //BA.debugLineNum = 40960000;BA.debugLine="Private Sub background_MouseClicked (EventData As";
RDebugUtils.currentLine=40960001;
 //BA.debugLineNum = 40960001;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=40960002;
 //BA.debugLineNum = 40960002;BA.debugLine="End Sub";
return "";
}
public void  _btncancelarfichaestadocomentarioalmacenarticulotalla_click(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblefichaestadocomentarioalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "btncancelarfichaestadocomentarioalmacenarticulotalla_click", false))
	 {Debug.delegate(ba, "btncancelarfichaestadocomentarioalmacenarticulotalla_click", null); return;}
ResumableSub_btnCancelarFichaEstadoComentarioAlmacenArticuloTalla_Click rsub = new ResumableSub_btnCancelarFichaEstadoComentarioAlmacenArticuloTalla_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnCancelarFichaEstadoComentarioAlmacenArticuloTalla_Click extends BA.ResumableSub {
public ResumableSub_btnCancelarFichaEstadoComentarioAlmacenArticuloTalla_Click(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent,b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref;
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblefichaestadocomentarioalmacenarticulotalla";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=41091073;
 //BA.debugLineNum = 41091073;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",\"¿Salir";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla", "btncancelarfichaestadocomentarioalmacenarticulotalla_click"), parent._utilidades._msgbox2xui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Confirma","¿Salir sin realizar ningún cambio?","OK","Cancelar","",(anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(parent.__c.Null))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_rint = (int) result[1];
;
RDebugUtils.currentLine=41091074;
 //BA.debugLineNum = 41091074;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=41091075;
 //BA.debugLineNum = 41091075;BA.debugLine="SalirForm";
__ref._salirform /*String*/ (null);
RDebugUtils.currentLine=41091076;
 //BA.debugLineNum = 41091076;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _salirform(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisisdisponiblefichaestadocomentarioalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "salirform", false))
	 {return ((String) Debug.delegate(ba, "salirform", null));}
RDebugUtils.currentLine=40763392;
 //BA.debugLineNum = 40763392;BA.debugLine="Sub SalirForm";
RDebugUtils.currentLine=40763393;
 //BA.debugLineNum = 40763393;BA.debugLine="Background.RemoveViewFromParent";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=40763395;
 //BA.debugLineNum = 40763395;BA.debugLine="CallSubDelayed2(mCallBack,\"cAnalisisDisponibleFic";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,"cAnalisisDisponibleFichaEstadoComentarioAlmacenArticuloTalla_Done",(Object)(__ref._datosanalisisdisponiblefichaalmacenarticulotalla /*b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._tipodatosanalisisdisponiblefichaalmacenarticulotalla*/ ));
RDebugUtils.currentLine=40763396;
 //BA.debugLineNum = 40763396;BA.debugLine="End Sub";
return "";
}
public void  _btngrabarfichaestadocomentarioalmacenarticulotalla_click(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblefichaestadocomentarioalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "btngrabarfichaestadocomentarioalmacenarticulotalla_click", false))
	 {Debug.delegate(ba, "btngrabarfichaestadocomentarioalmacenarticulotalla_click", null); return;}
ResumableSub_btnGrabarFichaEstadoComentarioAlmacenArticuloTalla_Click rsub = new ResumableSub_btnGrabarFichaEstadoComentarioAlmacenArticuloTalla_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnGrabarFichaEstadoComentarioAlmacenArticuloTalla_Click extends BA.ResumableSub {
public ResumableSub_btnGrabarFichaEstadoComentarioAlmacenArticuloTalla_Click(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent,b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref;
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblefichaestadocomentarioalmacenarticulotalla";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=41156609;
 //BA.debugLineNum = 41156609;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",\"¿Graba";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla", "btngrabarfichaestadocomentarioalmacenarticulotalla_click"), parent._utilidades._msgbox2xui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Confirma","¿Grabar los datos de la ficha?","OK","Cancelar","",(anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(parent.__c.Null))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_rint = (int) result[1];
;
RDebugUtils.currentLine=41156610;
 //BA.debugLineNum = 41156610;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=41156611;
 //BA.debugLineNum = 41156611;BA.debugLine="GrabarDatosFicha";
__ref._grabardatosficha /*void*/ (null);
RDebugUtils.currentLine=41156612;
 //BA.debugLineNum = 41156612;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _grabardatosficha(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblefichaestadocomentarioalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "grabardatosficha", false))
	 {Debug.delegate(ba, "grabardatosficha", null); return;}
ResumableSub_GrabarDatosFicha rsub = new ResumableSub_GrabarDatosFicha(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_GrabarDatosFicha extends BA.ResumableSub {
public ResumableSub_GrabarDatosFicha(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent,b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref;
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
String _estadosel = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblefichaestadocomentarioalmacenarticulotalla";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=41222145;
 //BA.debugLineNum = 41222145;BA.debugLine="Wait For(NuevoEditarEstadoComentarioAnalisisDispA";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla", "grabardatosficha"), __ref._nuevoeditarestadocomentarioanalisisdispalmarttalla /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=41222146;
 //BA.debugLineNum = 41222146;BA.debugLine="Dim Accion As String=mRes.get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=41222147;
 //BA.debugLineNum = 41222147;BA.debugLine="If Accion=\"NOK\" Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if ((_accion).equals("NOK")) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=41222148;
 //BA.debugLineNum = 41222148;BA.debugLine="DatosAnalisisDisponibleFichaAlmacenArticuloTalla.";
__ref._datosanalisisdisponiblefichaalmacenarticulotalla /*b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._tipodatosanalisisdisponiblefichaalmacenarticulotalla*/ .DatosModificados /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=41222149;
 //BA.debugLineNum = 41222149;BA.debugLine="DatosAnalisisDisponibleFichaAlmacenArticuloTalla.";
__ref._datosanalisisdisponiblefichaalmacenarticulotalla /*b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._tipodatosanalisisdisponiblefichaalmacenarticulotalla*/ .ConComentario /*boolean*/  = (__ref._txtareacomentario /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText().trim()).equals("") == false;
RDebugUtils.currentLine=41222150;
 //BA.debugLineNum = 41222150;BA.debugLine="DatosAnalisisDisponibleFichaAlmacenArticuloTalla.";
__ref._datosanalisisdisponiblefichaalmacenarticulotalla /*b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._tipodatosanalisisdisponiblefichaalmacenarticulotalla*/ .Comentario /*String*/  = __ref._txtareacomentario /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=41222151;
 //BA.debugLineNum = 41222151;BA.debugLine="Dim EstadoSel As String";
_estadosel = "";
RDebugUtils.currentLine=41222152;
 //BA.debugLineNum = 41222152;BA.debugLine="If chboNuevoEstado.SelectedIndex=-1 Then";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._chbonuevoestado /*anywheresoftware.b4j.objects.ChoiceBoxWrapper*/ .getSelectedIndex()==-1) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=41222153;
 //BA.debugLineNum = 41222153;BA.debugLine="EstadoSel=\"\"";
_estadosel = "";
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=41222155;
 //BA.debugLineNum = 41222155;BA.debugLine="EstadoSel=chboNuevoEstado.Items.Get(chboNuevoEst";
_estadosel = BA.ObjectToString(__ref._chbonuevoestado /*anywheresoftware.b4j.objects.ChoiceBoxWrapper*/ .getItems().Get(__ref._chbonuevoestado /*anywheresoftware.b4j.objects.ChoiceBoxWrapper*/ .getSelectedIndex()));
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=41222157;
 //BA.debugLineNum = 41222157;BA.debugLine="DatosAnalisisDisponibleFichaAlmacenArticuloTalla.";
__ref._datosanalisisdisponiblefichaalmacenarticulotalla /*b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._tipodatosanalisisdisponiblefichaalmacenarticulotalla*/ .Estado /*String*/  = _estadosel;
RDebugUtils.currentLine=41222158;
 //BA.debugLineNum = 41222158;BA.debugLine="SalirForm";
__ref._salirform /*String*/ (null);
RDebugUtils.currentLine=41222159;
 //BA.debugLineNum = 41222159;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnselnuevafecha_click(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblefichaestadocomentarioalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "btnselnuevafecha_click", false))
	 {Debug.delegate(ba, "btnselnuevafecha_click", null); return;}
ResumableSub_btnSelNuevaFecha_Click rsub = new ResumableSub_btnSelNuevaFecha_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSelNuevaFecha_Click extends BA.ResumableSub {
public ResumableSub_btnSelNuevaFecha_Click(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent,b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref;
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent;
b4j.docU.b4xdatetemplate _b4xdatedlg = null;
String _dateformatant = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
long _nuevafechasel = 0L;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblefichaestadocomentarioalmacenarticulotalla";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=41025537;
 //BA.debugLineNum = 41025537;BA.debugLine="Dialog.Title=\"Indica Fecha Registro\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Indica Fecha Registro");
RDebugUtils.currentLine=41025539;
 //BA.debugLineNum = 41025539;BA.debugLine="Dim B4XDateDlg As B4XDateTemplate";
_b4xdatedlg = new b4j.docU.b4xdatetemplate();
RDebugUtils.currentLine=41025540;
 //BA.debugLineNum = 41025540;BA.debugLine="B4XDateDlg.Initialize";
_b4xdatedlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=41025541;
 //BA.debugLineNum = 41025541;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=41025542;
 //BA.debugLineNum = 41025542;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=41025543;
 //BA.debugLineNum = 41025543;BA.debugLine="B4XDateDlg.Date=DateTime.DateParse(txtNuevaFecha.";
_b4xdatedlg._setdate /*long*/ (null,parent.__c.DateTime.DateParse(__ref._txtnuevafecha /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()));
RDebugUtils.currentLine=41025544;
 //BA.debugLineNum = 41025544;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=41025547;
 //BA.debugLineNum = 41025547;BA.debugLine="B4XDateDlg.CloseOnSelection=True";
_b4xdatedlg._closeonselection /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=41025548;
 //BA.debugLineNum = 41025548;BA.debugLine="B4XDateDlg.FirstDay=1";
_b4xdatedlg._firstday /*int*/  = (int) (1);
RDebugUtils.currentLine=41025549;
 //BA.debugLineNum = 41025549;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XD";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xdatedlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=41025552;
 //BA.debugLineNum = 41025552;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=41025553;
 //BA.debugLineNum = 41025553;BA.debugLine="bCancel.TextSize=15";
_bcancel.setTextSize(15);
RDebugUtils.currentLine=41025554;
 //BA.debugLineNum = 41025554;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=41025555;
 //BA.debugLineNum = 41025555;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=41025556;
 //BA.debugLineNum = 41025556;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla", "btnselnuevafecha_click"), _rsub);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_rint = (int) result[1];
;
RDebugUtils.currentLine=41025557;
 //BA.debugLineNum = 41025557;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=41025558;
 //BA.debugLineNum = 41025558;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=41025560;
 //BA.debugLineNum = 41025560;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=41025561;
 //BA.debugLineNum = 41025561;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=41025562;
 //BA.debugLineNum = 41025562;BA.debugLine="Dim NuevaFechaSel As Long=B4XDateDlg.Date";
_nuevafechasel = _b4xdatedlg._getdate /*long*/ (null);
RDebugUtils.currentLine=41025563;
 //BA.debugLineNum = 41025563;BA.debugLine="txtNuevaFecha.Text=DateTime.Date(NuevaFechaSel)";
__ref._txtnuevafecha /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(parent.__c.DateTime.Date(_nuevafechasel));
RDebugUtils.currentLine=41025564;
 //BA.debugLineNum = 41025564;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=41025566;
 //BA.debugLineNum = 41025566;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargadatosfichaestadocomentarioalmacenarticulotalla(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblefichaestadocomentarioalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "cargadatosfichaestadocomentarioalmacenarticulotalla", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargadatosfichaestadocomentarioalmacenarticulotalla", null));}
ResumableSub_CargaDatosFichaEstadoComentarioAlmacenArticuloTalla rsub = new ResumableSub_CargaDatosFichaEstadoComentarioAlmacenArticuloTalla(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaDatosFichaEstadoComentarioAlmacenArticuloTalla extends BA.ResumableSub {
public ResumableSub_CargaDatosFichaEstadoComentarioAlmacenArticuloTalla(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent,b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref;
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent;
anywheresoftware.b4a.objects.collections.List _lstregistros = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
String _comando = "";
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblefichaestadocomentarioalmacenarticulotalla";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=40894465;
 //BA.debugLineNum = 40894465;BA.debugLine="Dim lstRegistros As List";
_lstregistros = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=40894466;
 //BA.debugLineNum = 40894466;BA.debugLine="lstRegistros.Initialize";
_lstregistros.Initialize();
RDebugUtils.currentLine=40894467;
 //BA.debugLineNum = 40894467;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=40894468;
 //BA.debugLineNum = 40894468;BA.debugLine="Dim mResult As Map";
_mresult = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=40894469;
 //BA.debugLineNum = 40894469;BA.debugLine="mResult.Initialize";
_mresult.Initialize();
RDebugUtils.currentLine=40894470;
 //BA.debugLineNum = 40894470;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=40894471;
 //BA.debugLineNum = 40894471;BA.debugLine="mResult.Put(\"lstRegistros\",lstRegistros)";
_mresult.Put((Object)("lstRegistros"),(Object)(_lstregistros.getObject()));
RDebugUtils.currentLine=40894472;
 //BA.debugLineNum = 40894472;BA.debugLine="Dim Comando As String";
_comando = "";
RDebugUtils.currentLine=40894473;
 //BA.debugLineNum = 40894473;BA.debugLine="Comando=\"AnalisisDisponiblesFichaEstadoComentario";
_comando = "AnalisisDisponiblesFichaEstadoComentarioAlmacenArticuloTalla";
RDebugUtils.currentLine=40894475;
 //BA.debugLineNum = 40894475;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,new Object[]{(Object)(__ref._malmacen /*String*/ ),(Object)(__ref._marticulo /*String*/ ),(Object)(__ref._mtalla /*String*/ )},parent);
RDebugUtils.currentLine=40894476;
 //BA.debugLineNum = 40894476;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla", "cargadatosfichaestadocomentarioalmacenarticulotalla"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=40894478;
 //BA.debugLineNum = 40894478;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 12;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
RDebugUtils.currentLine=40894479;
 //BA.debugLineNum = 40894479;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=40894481;
 //BA.debugLineNum = 40894481;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando,"Error");
RDebugUtils.currentLine=40894482;
 //BA.debugLineNum = 40894482;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla", "cargadatosfichaestadocomentarioalmacenarticulotalla"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=40894483;
 //BA.debugLineNum = 40894483;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=40894484;
 //BA.debugLineNum = 40894484;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=40894486;
 //BA.debugLineNum = 40894486;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
if (true) break;

case 6:
//if
this.state = 11;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.False))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
RDebugUtils.currentLine=40894489;
 //BA.debugLineNum = 40894489;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=40894490;
 //BA.debugLineNum = 40894490;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=40894492;
 //BA.debugLineNum = 40894492;BA.debugLine="lstRegistros=mResult.Get(\"lstRes\")";
_lstregistros = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=40894493;
 //BA.debugLineNum = 40894493;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=40894494;
 //BA.debugLineNum = 40894494;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=40894495;
 //BA.debugLineNum = 40894495;BA.debugLine="mResult.Put(\"lstRegistros\",lstRegistros)";
_mresult.Put((Object)("lstRegistros"),(Object)(_lstregistros.getObject()));
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
RDebugUtils.currentLine=40894498;
 //BA.debugLineNum = 40894498;BA.debugLine="Return mResult";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mresult));return;};
RDebugUtils.currentLine=40894499;
 //BA.debugLineNum = 40894499;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisisdisponiblefichaestadocomentarioalmacenarticulotalla";
RDebugUtils.currentLine=40435712;
 //BA.debugLineNum = 40435712;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=40435713;
 //BA.debugLineNum = 40435713;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=40435714;
 //BA.debugLineNum = 40435714;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=40435716;
 //BA.debugLineNum = 40435716;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=40435719;
 //BA.debugLineNum = 40435719;BA.debugLine="Private mCallBack As Object";
_mcallback = new Object();
RDebugUtils.currentLine=40435720;
 //BA.debugLineNum = 40435720;BA.debugLine="Private mParent As B4XView";
_mparent = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=40435721;
 //BA.debugLineNum = 40435721;BA.debugLine="Dim Background As B4XView";
_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=40435722;
 //BA.debugLineNum = 40435722;BA.debugLine="Dim pnlBase As B4XView";
_pnlbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=40435724;
 //BA.debugLineNum = 40435724;BA.debugLine="Private mAlmacen As String";
_malmacen = "";
RDebugUtils.currentLine=40435725;
 //BA.debugLineNum = 40435725;BA.debugLine="Private mNombreAlmacen As String";
_mnombrealmacen = "";
RDebugUtils.currentLine=40435726;
 //BA.debugLineNum = 40435726;BA.debugLine="Private mArticulo As String";
_marticulo = "";
RDebugUtils.currentLine=40435727;
 //BA.debugLineNum = 40435727;BA.debugLine="Private mDescripcionArticulo As String";
_mdescripcionarticulo = "";
RDebugUtils.currentLine=40435728;
 //BA.debugLineNum = 40435728;BA.debugLine="Private mTalla As String";
_mtalla = "";
RDebugUtils.currentLine=40435730;
 //BA.debugLineNum = 40435730;BA.debugLine="Type TipoDatosAnalisisDisponibleFichaAlmacenArtic";
;
RDebugUtils.currentLine=40435731;
 //BA.debugLineNum = 40435731;BA.debugLine="Private DatosAnalisisDisponibleFichaAlmacenArticu";
_datosanalisisdisponiblefichaalmacenarticulotalla = new b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._tipodatosanalisisdisponiblefichaalmacenarticulotalla();
RDebugUtils.currentLine=40435733;
 //BA.debugLineNum = 40435733;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
_jamloadingindicator1 = new b4j.docU.jamloadingindicator();
RDebugUtils.currentLine=40435735;
 //BA.debugLineNum = 40435735;BA.debugLine="Private btnSelNuevaFecha As B4XView";
_btnselnuevafecha = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=40435736;
 //BA.debugLineNum = 40435736;BA.debugLine="Private chboNuevoEstado As ChoiceBox";
_chbonuevoestado = new anywheresoftware.b4j.objects.ChoiceBoxWrapper();
RDebugUtils.currentLine=40435737;
 //BA.debugLineNum = 40435737;BA.debugLine="Private txtAlmacen As B4XView";
_txtalmacen = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=40435738;
 //BA.debugLineNum = 40435738;BA.debugLine="Private txtAreaComentario As B4XView";
_txtareacomentario = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=40435739;
 //BA.debugLineNum = 40435739;BA.debugLine="Private txtArticulo As B4XView";
_txtarticulo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=40435740;
 //BA.debugLineNum = 40435740;BA.debugLine="Private txtDescripcionArticulo As B4XView";
_txtdescripcionarticulo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=40435741;
 //BA.debugLineNum = 40435741;BA.debugLine="Private txtEstadoActual As B4XView";
_txtestadoactual = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=40435742;
 //BA.debugLineNum = 40435742;BA.debugLine="Private txtFechaActual As B4XView";
_txtfechaactual = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=40435743;
 //BA.debugLineNum = 40435743;BA.debugLine="Private txtNombreAlmacen As B4XView";
_txtnombrealmacen = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=40435744;
 //BA.debugLineNum = 40435744;BA.debugLine="Private txtNuevaFecha As B4XView";
_txtnuevafecha = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=40435745;
 //BA.debugLineNum = 40435745;BA.debugLine="Private txtNuevoUsuario As B4XView";
_txtnuevousuario = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=40435746;
 //BA.debugLineNum = 40435746;BA.debugLine="Private txtTalla As B4XView";
_txttalla = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=40435747;
 //BA.debugLineNum = 40435747;BA.debugLine="Private txtUsuarioActual As B4XView";
_txtusuarioactual = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=40435748;
 //BA.debugLineNum = 40435748;BA.debugLine="Private btnGrabarFichaEstadoComentarioAlmacenArti";
_btngrabarfichaestadocomentarioalmacenarticulotalla = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=40435749;
 //BA.debugLineNum = 40435749;BA.debugLine="Private btnCancelarFichaEstadoComentarioAlmacenAr";
_btncancelarfichaestadocomentarioalmacenarticulotalla = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=40435750;
 //BA.debugLineNum = 40435750;BA.debugLine="Private btnEliminarFichaEstadoComentarioAlmacenAr";
_btneliminarfichaestadocomentarioalmacenarticulotalla = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=40435751;
 //BA.debugLineNum = 40435751;BA.debugLine="Private lblModoFichaEstadoComentario As B4XView";
_lblmodofichaestadocomentario = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=40435753;
 //BA.debugLineNum = 40435753;BA.debugLine="Private ModoFicha As String";
_modoficha = "";
RDebugUtils.currentLine=40435754;
 //BA.debugLineNum = 40435754;BA.debugLine="Private lblTitlePanel As B4XView";
_lbltitlepanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=40435756;
 //BA.debugLineNum = 40435756;BA.debugLine="Private DownX As Double";
_downx = 0;
RDebugUtils.currentLine=40435757;
 //BA.debugLineNum = 40435757;BA.debugLine="Private DownY As Double";
_downy = 0;
RDebugUtils.currentLine=40435758;
 //BA.debugLineNum = 40435758;BA.debugLine="End Sub";
return "";
}
public String  _controleshabilitados(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref,boolean _habilitados) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisisdisponiblefichaestadocomentarioalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "controleshabilitados", false))
	 {return ((String) Debug.delegate(ba, "controleshabilitados", new Object[] {_habilitados}));}
RDebugUtils.currentLine=40697856;
 //BA.debugLineNum = 40697856;BA.debugLine="Sub ControlesHabilitados(Habilitados As Boolean)";
RDebugUtils.currentLine=40697859;
 //BA.debugLineNum = 40697859;BA.debugLine="btnGrabarFichaEstadoComentarioAlmacenArticuloTall";
__ref._btngrabarfichaestadocomentarioalmacenarticulotalla /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(_habilitados);
RDebugUtils.currentLine=40697860;
 //BA.debugLineNum = 40697860;BA.debugLine="btnCancelarFichaEstadoComentarioAlmacenArticuloTa";
__ref._btncancelarfichaestadocomentarioalmacenarticulotalla /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(_habilitados);
RDebugUtils.currentLine=40697861;
 //BA.debugLineNum = 40697861;BA.debugLine="btnSelNuevaFecha.Enabled=Habilitados";
__ref._btnselnuevafecha /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(_habilitados);
RDebugUtils.currentLine=40697862;
 //BA.debugLineNum = 40697862;BA.debugLine="txtAreaComentario.Enabled=Habilitados";
__ref._txtareacomentario /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(_habilitados);
RDebugUtils.currentLine=40697863;
 //BA.debugLineNum = 40697863;BA.debugLine="chboNuevoEstado.Enabled=Habilitados";
__ref._chbonuevoestado /*anywheresoftware.b4j.objects.ChoiceBoxWrapper*/ .setEnabled(_habilitados);
RDebugUtils.currentLine=40697864;
 //BA.debugLineNum = 40697864;BA.debugLine="End Sub";
return "";
}
public String  _frm_closerequest(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisisdisponiblefichaestadocomentarioalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=40632320;
 //BA.debugLineNum = 40632320;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=40632321;
 //BA.debugLineNum = 40632321;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=40632322;
 //BA.debugLineNum = 40632322;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _nuevoeditarestadocomentarioanalisisdispalmarttalla(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblefichaestadocomentarioalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "nuevoeditarestadocomentarioanalisisdispalmarttalla", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "nuevoeditarestadocomentarioanalisisdispalmarttalla", null));}
ResumableSub_NuevoEditarEstadoComentarioAnalisisDispAlmArtTalla rsub = new ResumableSub_NuevoEditarEstadoComentarioAnalisisDispAlmArtTalla(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_NuevoEditarEstadoComentarioAnalisisDispAlmArtTalla extends BA.ResumableSub {
public ResumableSub_NuevoEditarEstadoComentarioAnalisisDispAlmArtTalla(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent,b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref;
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
String _dateformatant = "";
long _nuevafecha = 0L;
String _estadosel = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.Map _mresp = null;
String _sresp = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblefichaestadocomentarioalmacenarticulotalla";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=41353217;
 //BA.debugLineNum = 41353217;BA.debugLine="Dim lstReg As List";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=41353218;
 //BA.debugLineNum = 41353218;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=41353219;
 //BA.debugLineNum = 41353219;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=41353220;
 //BA.debugLineNum = 41353220;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=41353221;
 //BA.debugLineNum = 41353221;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=41353222;
 //BA.debugLineNum = 41353222;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=41353223;
 //BA.debugLineNum = 41353223;BA.debugLine="mRes.Put(\"lstRegistros\",lstReg)";
_mres.Put((Object)("lstRegistros"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=41353224;
 //BA.debugLineNum = 41353224;BA.debugLine="Dim Comando As String";
_comando = "";
RDebugUtils.currentLine=41353225;
 //BA.debugLineNum = 41353225;BA.debugLine="Comando=\"NuevoEditarEstadoComentarioAnalisisDispA";
_comando = "NuevoEditarEstadoComentarioAnalisisDispAlmArtTalla";
RDebugUtils.currentLine=41353226;
 //BA.debugLineNum = 41353226;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=41353227;
 //BA.debugLineNum = 41353227;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=41353228;
 //BA.debugLineNum = 41353228;BA.debugLine="Dim NuevaFecha As Long=DateTime.DateParse(txtNuev";
_nuevafecha = parent.__c.DateTime.DateParse(__ref._txtnuevafecha /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText());
RDebugUtils.currentLine=41353229;
 //BA.debugLineNum = 41353229;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=41353230;
 //BA.debugLineNum = 41353230;BA.debugLine="Dim EstadoSel As String";
_estadosel = "";
RDebugUtils.currentLine=41353231;
 //BA.debugLineNum = 41353231;BA.debugLine="If chboNuevoEstado.SelectedIndex=-1 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._chbonuevoestado /*anywheresoftware.b4j.objects.ChoiceBoxWrapper*/ .getSelectedIndex()==-1) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=41353232;
 //BA.debugLineNum = 41353232;BA.debugLine="EstadoSel=\"\"";
_estadosel = "";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=41353234;
 //BA.debugLineNum = 41353234;BA.debugLine="EstadoSel=chboNuevoEstado.Items.Get(chboNuevoEst";
_estadosel = BA.ObjectToString(__ref._chbonuevoestado /*anywheresoftware.b4j.objects.ChoiceBoxWrapper*/ .getItems().Get(__ref._chbonuevoestado /*anywheresoftware.b4j.objects.ChoiceBoxWrapper*/ .getSelectedIndex()));
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=41353236;
 //BA.debugLineNum = 41353236;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,new Object[]{(Object)(_nuevafecha),(Object)(parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ),(Object)(__ref._malmacen /*String*/ ),(Object)(__ref._marticulo /*String*/ ),(Object)(__ref._mtalla /*String*/ ),(Object)(__ref._txtareacomentario /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()),(Object)(_estadosel)},parent);
RDebugUtils.currentLine=41353239;
 //BA.debugLineNum = 41353239;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla", "nuevoeditarestadocomentarioanalisisdispalmarttalla"), null);
this.state = 25;
return;
case 25:
//C
this.state = 7;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=41353241;
 //BA.debugLineNum = 41353241;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
if (true) break;

case 7:
//if
this.state = 24;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 24;
RDebugUtils.currentLine=41353242;
 //BA.debugLineNum = 41353242;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=41353244;
 //BA.debugLineNum = 41353244;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando,"Error");
RDebugUtils.currentLine=41353245;
 //BA.debugLineNum = 41353245;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla", "nuevoeditarestadocomentarioanalisisdispalmarttalla"), _msa);
this.state = 26;
return;
case 26:
//C
this.state = 24;
;
RDebugUtils.currentLine=41353246;
 //BA.debugLineNum = 41353246;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=41353247;
 //BA.debugLineNum = 41353247;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=41353249;
 //BA.debugLineNum = 41353249;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
if (true) break;

case 12:
//if
this.state = 23;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.False))) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 23;
RDebugUtils.currentLine=41353251;
 //BA.debugLineNum = 41353251;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=41353252;
 //BA.debugLineNum = 41353252;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=41353254;
 //BA.debugLineNum = 41353254;BA.debugLine="lstReg=mResult.Get(\"lstRes\")";
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=41353255;
 //BA.debugLineNum = 41353255;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
_mresp = new anywheresoftware.b4a.objects.collections.Map();
_mresp = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=41353256;
 //BA.debugLineNum = 41353256;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
_sresp = BA.ObjectToString(_mresp.GetValueAt((int) (0)));
RDebugUtils.currentLine=41353257;
 //BA.debugLineNum = 41353257;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERR\") Then";
if (true) break;

case 17:
//if
this.state = 22;
if (_sresp.toUpperCase().startsWith("ERR")) { 
this.state = 19;
}else {
this.state = 21;
}if (true) break;

case 19:
//C
this.state = 22;
RDebugUtils.currentLine=41353258;
 //BA.debugLineNum = 41353258;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SP Nu";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SP NuevoEditarEstadoComentarioAnalisisDispAlmArtTalla"+parent.__c.CRLF+parent.__c.CRLF+_sresp,"Error");
RDebugUtils.currentLine=41353259;
 //BA.debugLineNum = 41353259;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla", "nuevoeditarestadocomentarioanalisisdispalmarttalla"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 22;
;
RDebugUtils.currentLine=41353260;
 //BA.debugLineNum = 41353260;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=41353261;
 //BA.debugLineNum = 41353261;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=41353263;
 //BA.debugLineNum = 41353263;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=41353264;
 //BA.debugLineNum = 41353264;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 22:
//C
this.state = 23;
;
 if (true) break;

case 23:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=41353268;
 //BA.debugLineNum = 41353268;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=41353269;
 //BA.debugLineNum = 41353269;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _inicio(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblefichaestadocomentarioalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "inicio", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "inicio", null));}
ResumableSub_Inicio rsub = new ResumableSub_Inicio(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Inicio extends BA.ResumableSub {
public ResumableSub_Inicio(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent,b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref;
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
String _dateformatant = "";
anywheresoftware.b4a.objects.collections.Map _mdata = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblefichaestadocomentarioalmacenarticulotalla";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=40828930;
 //BA.debugLineNum = 40828930;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando dat";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando datos..."));
RDebugUtils.currentLine=40828931;
 //BA.debugLineNum = 40828931;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=40828933;
 //BA.debugLineNum = 40828933;BA.debugLine="wait for(CargaDatosFichaEstadoComentarioAlmacenAr";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla", "inicio"), __ref._cargadatosfichaestadocomentarioalmacenarticulotalla /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=40828935;
 //BA.debugLineNum = 40828935;BA.debugLine="If mResult.Get(\"Accion\")<>\"OK\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_mresult.Get((Object)("Accion"))).equals((Object)("OK")) == false) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=40828937;
 //BA.debugLineNum = 40828937;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=40828938;
 //BA.debugLineNum = 40828938;BA.debugLine="SalirForm";
__ref._salirform /*String*/ (null);
RDebugUtils.currentLine=40828939;
 //BA.debugLineNum = 40828939;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=40828941;
 //BA.debugLineNum = 40828941;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=40828943;
 //BA.debugLineNum = 40828943;BA.debugLine="chboNuevoEstado.Items.AddAll(Array As String(\"\",\"";
__ref._chbonuevoestado /*anywheresoftware.b4j.objects.ChoiceBoxWrapper*/ .getItems().AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"","OK","PENDIENTE","OBSOLETO"}));
RDebugUtils.currentLine=40828945;
 //BA.debugLineNum = 40828945;BA.debugLine="txtAlmacen.Text=mAlmacen";
__ref._txtalmacen /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._malmacen /*String*/ );
RDebugUtils.currentLine=40828946;
 //BA.debugLineNum = 40828946;BA.debugLine="txtNombreAlmacen.Text=mNombreAlmacen";
__ref._txtnombrealmacen /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._mnombrealmacen /*String*/ );
RDebugUtils.currentLine=40828947;
 //BA.debugLineNum = 40828947;BA.debugLine="txtArticulo.Text=mArticulo";
__ref._txtarticulo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._marticulo /*String*/ );
RDebugUtils.currentLine=40828948;
 //BA.debugLineNum = 40828948;BA.debugLine="txtDescripcionArticulo.Text=mDescripcionArticulo";
__ref._txtdescripcionarticulo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._mdescripcionarticulo /*String*/ );
RDebugUtils.currentLine=40828949;
 //BA.debugLineNum = 40828949;BA.debugLine="txtTalla.Text=mTalla";
__ref._txttalla /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._mtalla /*String*/ );
RDebugUtils.currentLine=40828951;
 //BA.debugLineNum = 40828951;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=40828952;
 //BA.debugLineNum = 40828952;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=40828953;
 //BA.debugLineNum = 40828953;BA.debugLine="txtNuevaFecha.Text=DateTime.Date(DateTime.Now)";
__ref._txtnuevafecha /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(parent.__c.DateTime.Date(parent.__c.DateTime.getNow()));
RDebugUtils.currentLine=40828954;
 //BA.debugLineNum = 40828954;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=40828956;
 //BA.debugLineNum = 40828956;BA.debugLine="txtNuevoUsuario.Text=Main.DatosUsuario.NombreUsua";
__ref._txtnuevousuario /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ );
RDebugUtils.currentLine=40828958;
 //BA.debugLineNum = 40828958;BA.debugLine="If lstReg.Size=0 Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_lstreg.getSize()==0) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=40828959;
 //BA.debugLineNum = 40828959;BA.debugLine="btnEliminarFichaEstadoComentarioAlmacenArticuloT";
__ref._btneliminarfichaestadocomentarioalmacenarticulotalla /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=40828960;
 //BA.debugLineNum = 40828960;BA.debugLine="ModoFicha=\"NUEVO\"";
__ref._modoficha /*String*/  = "NUEVO";
RDebugUtils.currentLine=40828961;
 //BA.debugLineNum = 40828961;BA.debugLine="lblModoFichaEstadoComentario.Text=\"Modo: \" & Mod";
__ref._lblmodofichaestadocomentario /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("Modo: "+__ref._modoficha /*String*/ );
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=40828964;
 //BA.debugLineNum = 40828964;BA.debugLine="ModoFicha=\"EDICION\"";
__ref._modoficha /*String*/  = "EDICION";
RDebugUtils.currentLine=40828965;
 //BA.debugLineNum = 40828965;BA.debugLine="lblModoFichaEstadoComentario.Text=\"Modo: \" & Mod";
__ref._lblmodofichaestadocomentario /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("Modo: "+__ref._modoficha /*String*/ );
RDebugUtils.currentLine=40828967;
 //BA.debugLineNum = 40828967;BA.debugLine="Dim mData As Map=lstReg.Get(0)";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=40828968;
 //BA.debugLineNum = 40828968;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=40828969;
 //BA.debugLineNum = 40828969;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=40828970;
 //BA.debugLineNum = 40828970;BA.debugLine="txtFechaActual.Text=DateTime.Date(mData.Get(\"Fec";
__ref._txtfechaactual /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(parent.__c.DateTime.Date(BA.ObjectToLongNumber(_mdata.Get((Object)("FechaLong")))));
RDebugUtils.currentLine=40828971;
 //BA.debugLineNum = 40828971;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=40828972;
 //BA.debugLineNum = 40828972;BA.debugLine="txtEstadoActual.Text=mData.Get(\"Estado\")";
__ref._txtestadoactual /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Estado"))));
RDebugUtils.currentLine=40828973;
 //BA.debugLineNum = 40828973;BA.debugLine="txtUsuarioActual.Text=mData.Get(\"Usuario\")";
__ref._txtusuarioactual /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Usuario"))));
RDebugUtils.currentLine=40828974;
 //BA.debugLineNum = 40828974;BA.debugLine="txtAreaComentario.Text=mData.Get(\"Comentario\")";
__ref._txtareacomentario /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Comentario"))));
RDebugUtils.currentLine=40828975;
 //BA.debugLineNum = 40828975;BA.debugLine="txtAreaComentario.SetSelection(txtAreaComentario";
__ref._txtareacomentario /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetSelection(__ref._txtareacomentario /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText().length(),__ref._txtareacomentario /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText().length());
RDebugUtils.currentLine=40828976;
 //BA.debugLineNum = 40828976;BA.debugLine="chboNuevoEstado.SelectedIndex=chboNuevoEstado.It";
__ref._chbonuevoestado /*anywheresoftware.b4j.objects.ChoiceBoxWrapper*/ .setSelectedIndex(__ref._chbonuevoestado /*anywheresoftware.b4j.objects.ChoiceBoxWrapper*/ .getItems().IndexOf(_mdata.Get((Object)("Estado"))));
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=40828981;
 //BA.debugLineNum = 40828981;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=40828983;
 //BA.debugLineNum = 40828983;BA.debugLine="ControlesHabilitados(True)";
__ref._controleshabilitados /*String*/ (null,parent.__c.True);
RDebugUtils.currentLine=40828985;
 //BA.debugLineNum = 40828985;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=40828986;
 //BA.debugLineNum = 40828986;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref,anywheresoftware.b4a.BA _ba,Object _callback,anywheresoftware.b4a.objects.B4XViewWrapper _parent,String _almacen,String _nombrealmacen,String _articulo,String _descripcionarticulo,String _talla) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="canalisisdisponiblefichaestadocomentarioalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_parent,_almacen,_nombrealmacen,_articulo,_descripcionarticulo,_talla}));}
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=40501248;
 //BA.debugLineNum = 40501248;BA.debugLine="Public Sub Initialize(CallBack As Object,Parent As";
RDebugUtils.currentLine=40501250;
 //BA.debugLineNum = 40501250;BA.debugLine="mCallBack=CallBack";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=40501251;
 //BA.debugLineNum = 40501251;BA.debugLine="mParent=Parent";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _parent;
RDebugUtils.currentLine=40501253;
 //BA.debugLineNum = 40501253;BA.debugLine="For Each v As B4XView In mParent.GetAllViewsRecur";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group3.Get(index3)));
RDebugUtils.currentLine=40501254;
 //BA.debugLineNum = 40501254;BA.debugLine="If v.Tag <> Null And v.Tag = \"b4xdialog_backgrou";
if (_v.getTag()!= null && (_v.getTag()).equals((Object)("b4xdialog_background"))) { 
RDebugUtils.currentLine=40501255;
 //BA.debugLineNum = 40501255;BA.debugLine="v.RemoveViewFromParent";
_v.RemoveViewFromParent();
RDebugUtils.currentLine=40501256;
 //BA.debugLineNum = 40501256;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=40501260;
 //BA.debugLineNum = 40501260;BA.debugLine="Background= xui.CreatePanel(\"background\")";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"background");
RDebugUtils.currentLine=40501261;
 //BA.debugLineNum = 40501261;BA.debugLine="Background.Tag = \"b4xdialog_background\"";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("b4xdialog_background"));
RDebugUtils.currentLine=40501262;
 //BA.debugLineNum = 40501262;BA.debugLine="Background.Color=0xaa000000";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xaa000000));
RDebugUtils.currentLine=40501263;
 //BA.debugLineNum = 40501263;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=40501265;
 //BA.debugLineNum = 40501265;BA.debugLine="mAlmacen=Almacen";
__ref._malmacen /*String*/  = _almacen;
RDebugUtils.currentLine=40501266;
 //BA.debugLineNum = 40501266;BA.debugLine="mNombreAlmacen=NombreAlmacen";
__ref._mnombrealmacen /*String*/  = _nombrealmacen;
RDebugUtils.currentLine=40501267;
 //BA.debugLineNum = 40501267;BA.debugLine="mArticulo=Articulo";
__ref._marticulo /*String*/  = _articulo;
RDebugUtils.currentLine=40501268;
 //BA.debugLineNum = 40501268;BA.debugLine="mDescripcionArticulo=DescripcionArticulo";
__ref._mdescripcionarticulo /*String*/  = _descripcionarticulo;
RDebugUtils.currentLine=40501269;
 //BA.debugLineNum = 40501269;BA.debugLine="mTalla=Talla";
__ref._mtalla /*String*/  = _talla;
RDebugUtils.currentLine=40501271;
 //BA.debugLineNum = 40501271;BA.debugLine="DatosAnalisisDisponibleFichaAlmacenArticuloTalla.";
__ref._datosanalisisdisponiblefichaalmacenarticulotalla /*b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._tipodatosanalisisdisponiblefichaalmacenarticulotalla*/ .DatosModificados /*boolean*/  = __c.False;
RDebugUtils.currentLine=40501273;
 //BA.debugLineNum = 40501273;BA.debugLine="End Sub";
return "";
}
public String  _pnlbase_touch(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisisdisponiblefichaestadocomentarioalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "pnlbase_touch", false))
	 {return ((String) Debug.delegate(ba, "pnlbase_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=41287680;
 //BA.debugLineNum = 41287680;BA.debugLine="Private Sub pnlBase_Touch(Action As Int, X As Floa";
RDebugUtils.currentLine=41287681;
 //BA.debugLineNum = 41287681;BA.debugLine="If Action = pnlBase.TOUCH_ACTION_DOWN Then";
if (_action==__ref._pnlbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN) { 
RDebugUtils.currentLine=41287682;
 //BA.debugLineNum = 41287682;BA.debugLine="DownX  = X";
__ref._downx /*double*/  = _x;
RDebugUtils.currentLine=41287683;
 //BA.debugLineNum = 41287683;BA.debugLine="DownY  = y";
__ref._downy /*double*/  = _y;
 }else 
{RDebugUtils.currentLine=41287684;
 //BA.debugLineNum = 41287684;BA.debugLine="Else if Action = pnlBase.TOUCH_ACTION_MOVE Then";
if (_action==__ref._pnlbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE) { 
RDebugUtils.currentLine=41287685;
 //BA.debugLineNum = 41287685;BA.debugLine="pnlBase.Top = Min(Max(pnlBase.Top + y - DownY,0)";
__ref._pnlbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop(__c.Min(__c.Max(__ref._pnlbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()+_y-__ref._downy /*double*/ ,0),__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._pnlbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=41287686;
 //BA.debugLineNum = 41287686;BA.debugLine="pnlBase.Left = Min(Max(pnlBase.Left + x - DownX,";
__ref._pnlbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(__c.Min(__c.Max(__ref._pnlbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+_x-__ref._downx /*double*/ ,0),__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._pnlbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()));
 }}
;
RDebugUtils.currentLine=41287689;
 //BA.debugLineNum = 41287689;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblefichaestadocomentarioalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent,b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla __ref;
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent;
Object _robj = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblefichaestadocomentarioalmacenarticulotalla";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=40566795;
 //BA.debugLineNum = 40566795;BA.debugLine="pnlBase=xui.CreatePanel(\"pnlBase\")";
__ref._pnlbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnlBase");
RDebugUtils.currentLine=40566796;
 //BA.debugLineNum = 40566796;BA.debugLine="pnlBase.SetLayoutAnimated(0,0,0,800dip,500dip)";
__ref._pnlbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,parent.__c.DipToCurrent((int) (800)),parent.__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=40566797;
 //BA.debugLineNum = 40566797;BA.debugLine="pnlBase.Color=xui.Color_White";
__ref._pnlbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=40566798;
 //BA.debugLineNum = 40566798;BA.debugLine="pnlBase.LoadLayout(\"scrAnalisisDisponibleEstadoCo";
__ref._pnlbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("scrAnalisisDisponibleEstadoComentarioAlmacenArticuloTalla",ba);
RDebugUtils.currentLine=40566800;
 //BA.debugLineNum = 40566800;BA.debugLine="Background.AddView(pnlBase,(Background.Width-800d";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._pnlbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-parent.__c.DipToCurrent((int) (800)))/(double)2,(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-parent.__c.DipToCurrent((int) (500)))/(double)2,parent.__c.DipToCurrent((int) (800)),parent.__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=40566802;
 //BA.debugLineNum = 40566802;BA.debugLine="ControlesHabilitados(False)";
__ref._controleshabilitados /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=40566808;
 //BA.debugLineNum = 40566808;BA.debugLine="lblTitlePanel.Text=\"Ficha Estado/Comentario Almac";
__ref._lbltitlepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("Ficha Estado/Comentario Almacén-Artículo-Talla");
RDebugUtils.currentLine=40566810;
 //BA.debugLineNum = 40566810;BA.debugLine="Dialog.Initialize(pnlBase)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,__ref._pnlbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=40566811;
 //BA.debugLineNum = 40566811;BA.debugLine="jamLoadingIndicator1.Initialize(Me,pnlBase)";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._initialize /*String*/ (null,ba,parent,__ref._pnlbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=40566813;
 //BA.debugLineNum = 40566813;BA.debugLine="btnEliminarFichaEstadoComentarioAlmacenArticuloTa";
__ref._btneliminarfichaestadocomentarioalmacenarticulotalla /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=40566817;
 //BA.debugLineNum = 40566817;BA.debugLine="Wait For(Inicio) complete (rObj As Object)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla", "show"), __ref._inicio /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=40566818;
 //BA.debugLineNum = 40566818;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}