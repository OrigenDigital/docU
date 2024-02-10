B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=6.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
	Private xui As XUI

	
End Sub

'dimensiones en base al tamaño de la pantalla del usuario
Sub DimensionesPantalla As Map
	Dim mDim As Map
	mDim.Initialize
	mDim.Put("X",fx.PrimaryScreen.MaxX - fx.PrimaryScreen.MinX)
	mDim.Put("Y",fx.PrimaryScreen.MaxY - fx.PrimaryScreen.MinY)
	Return mDim
End Sub

Sub SetFormMaximized(f As Form)
	'Create a new JavaObject and assign the form
	Dim joForm As JavaObject = f
	'Get the stage field from the form
	Dim joStage As JavaObject = joForm.GetField("stage")
	'Apply the API method setFullScreen to the stage which is bind to the form
	joStage.RunMethod("setMaximized", Array(True))
End Sub

Sub CenterFormOnScreen(f As Form)
	Dim Stage As JavaObject = f
	Stage = Stage.GetField("stage")
	Stage.RunMethod("centerOnScreen",Null)
End Sub



Sub SetFormIconified(f As Form, State As Boolean)
	'Create a new JavaObject and assign the form
	Dim joForm As JavaObject = f
	'Get the stage field from the form
	Dim joStage As JavaObject = joForm.GetField("stage")
	'Apply the API method setFullScreen to the stage which is bind to the form
	joStage.RunMethod("setMinimized", Array(State))
End Sub

Sub SetToolTipFont(N As Control,F As Font)
	Dim JoN As JavaObject = N
	JoN.RunMethodJO("getTooltip",Null).RunMethod("setFont",Array (F))
End Sub

public Sub FixNull(sObj As Object) As String
	Dim sValue As String
	If sObj = Null Then
		sValue = ""
	Else
		sValue = CStr(sObj)
	End If
	sValue = sValue.Replace("NULL","").Replace("null","")
	Return sValue
End Sub

public Sub FixNullDouble(sObj As Object) As Double
	Dim dValue As Double
	If sObj = Null Then
		dValue = 0
	Else
		dValue = CDbl(sObj)
	End If
	Return dValue
End Sub

public Sub FixNullInt(sObj As Object) As Int
	Dim dValue As Int
	If sObj = Null Then
		dValue = 0
	Else
		dValue = CInt(sObj)
	End If
	Return dValue
End Sub

public Sub FixNullLong(sObj As Object) As Long
	Dim dValue As Long
	If sObj = Null Then
		dValue = 0
	Else
		dValue = CLng(sObj)
	End If
	Return dValue
End Sub

public Sub CStr(o As Object) As String
	Return "" & o
End Sub

'return numeric values from a string
public Sub GetNumbers(value As String) As String
	Dim strCnt As Int
	Dim str As String
	Dim sb As StringBuilder
	sb.Initialize
	Dim master As String = "0123456789-."
	For strCnt = 0 To value.Length - 1
		str = value.CharAt(strCnt)
		If master.IndexOf(str) >= 0 Then
			sb.Append(str)
		End If
	Next
	Return sb.tostring
End Sub

'convert string to long
public Sub CLng(o As Object) As Long
	Try
		Dim ox As String = o
		ox = GetNumbers(ox)
		If ox = "" Then ox = "0"
		Return Floor(ox)
	Catch
		Return 0
	End Try
End Sub

'convert string to double
public Sub CDbl(o As Object) As Double
	Try
		Dim ox As String = o
		If(IsNumber(ox) And (ox.ToLowerCase.Contains(".") Or ox.ToLowerCase.Contains("e"))) Then
			ox = NumberFormat2(o,0,9,0,False)
		End If
		ox = GetNumbers(ox)
		If ox = "" Then ox = "0"
		Return ox
	Catch
		Return 0
	End Try
End Sub

'convert string to int
public Sub CInt(o As Object) As Int
	Try
		Dim ox As String = o
		ox = GetNumbers(ox)
		If ox = "" Then ox = "0"
		Return Floor(ox)
	Catch
		Return 0
	End Try
End Sub

' Para devolver un STRING formateado a partir de un numero
Public Sub FormatoNumerico(Numero As Double, MinIntegers As Int, MaxFracciones As Int) As String
	Dim formatter As B4XFormatter
	formatter.Initialize
	formatter.GetDefaultFormat.MinimumIntegers = MinIntegers
	formatter.GetDefaultFormat.MaximumFractions = MaxFracciones
	formatter.GetDefaultFormat.DecimalPoint=","
	Return formatter.Format(Numero)
End Sub

' Para devolver un STRING formateado a partir de un numero
' Posibilidad de añadir mínimo de fracciones y caracter de agrupacion de miles.
Public Sub FormatoNumerico2(Numero As Double, MinIntegers As Int, MaxFracciones As Int, MinFracciones As Int, UsarAgrupacion As Boolean) As String
	Dim formatter As B4XFormatter
	formatter.Initialize
	formatter.GetDefaultFormat.MinimumIntegers = MinIntegers
	formatter.GetDefaultFormat.MaximumFractions = MaxFracciones
	formatter.GetDefaultFormat.MinimumFractions = MinFracciones
	formatter.GetDefaultFormat.DecimalPoint=","
	If UsarAgrupacion Then
		formatter.GetDefaultFormat.GroupingCharacter="."
	Else
		formatter.GetDefaultFormat.GroupingCharacter=""
	End If
	Return formatter.Format(Numero)
End Sub

' Para devolver un STRING formateado a partir de un numero
' Posibilidad de añadir mínimo de fracciones y caracter de agrupacion de miles.
' También carcateres para prefijos y/o sufijos
Public Sub FormatoNumerico3(Numero As Double, MinIntegers As Int, MaxFracciones As Int, MinFracciones As Int, UsarAgrupacion As Boolean, _
		Prefijo As String, Sufijo As String) As String
	Dim formatter As B4XFormatter
	formatter.Initialize
	formatter.GetDefaultFormat.MinimumIntegers = MinIntegers
	formatter.GetDefaultFormat.MaximumFractions = MaxFracciones
	formatter.GetDefaultFormat.MinimumFractions = MinFracciones
	formatter.GetDefaultFormat.DecimalPoint=","
	If UsarAgrupacion Then
		formatter.GetDefaultFormat.GroupingCharacter="."
	Else
		formatter.GetDefaultFormat.GroupingCharacter=""
	End If
	If Prefijo<>"" Then formatter.GetDefaultFormat.Prefix=Prefijo
	If Sufijo<>"" Then formatter.GetDefaultFormat.Postfix=Sufijo
	Return formatter.Format(Numero)
End Sub

Sub ResizeToFit(tv As TableView, ColumnIndex As Int)
	Dim JavaVersion As Int=	GetSystemProperty("java.version","").SubString2(0,2)
	If JavaVersion>=11 Then Return

    Dim tvjo As JavaObject = tv
   Dim r As Reflector
   r.Target = tvjo.RunMethod("getSkin", Null)
   r.RunMethod4("resizeColumnToFitContent", Array(tvjo.RunMethodJO("getColumns", Null).RunMethod("get", Array(ColumnIndex)), -1), _
      Array As String("javafx.scene.control.TableColumn", "java.lang.int"))
End Sub


' ajusta el ancho de las columnas de un tableview
public Sub AjusteAutoMaxColumna(tv As TableView) As List
	Dim colChars(tv.ColumnsCount) As Int
	' Get the max length of the string data by looking in all rows and cols
	For Each row() As Object In tv.Items
		For c = 0 To tv.ColumnsCount - 1
			Dim sContenido As String=row(c)
			colChars(c) = Max(sContenido.Length, colChars(c))
		Next
	Next
  
	Dim totalChars As Int    ' Total length in chars of all the widest cols
	For i = 0 To colChars.Length - 1
		If colChars(i) < tv.GetColumnHeader(i).Length Then
			colChars(i) = tv.GetColumnHeader(i).Length        ' Enforce minimum width to column header length
		End If
		totalChars = totalChars + colChars(i)
	Next
  
	' Set the size of the columns proportionally based on character widths
	Dim lstAnchos As List
	lstAnchos.Initialize
	For i = 0 To colChars.Length - 1
		'lstAnchos.Add((colChars(i) / totalChars) * (fx.PrimaryScreen.MaxX-50))  ' -20 to allow for scroll bar
		Log("Ancho columna " & tv.GetColumnHeader(i) & " = " & ((colChars(i) * 8)+20))
		lstAnchos.Add(((colChars(i) * 8)+20))
	Next
	Return lstAnchos
End Sub




'' ajusta el ancho de las columnas de un tableview
'public Sub AjusteAutoMaxColumnaNombreColumna(tv As TableView) As List
'	Dim lstAnchos As List
'	lstAnchos.Initialize
'	Dim colChars(tv.ColumnsCount) As Int
'	' Get the max length of the string data by looking in all rows and cols
'	For Each row() As Object In tv.Items
'		For c = 0 To tv.ColumnsCount - 1
'			Dim sContenido As String=row(c)
'			colChars(c) = Max(sContenido.Length, colChars(c))
'		Next
'	Next
'  
'	Dim totalChars As Int    ' Total length in chars of all the widest cols
'	For i = 0 To colChars.Length - 1
'		If colChars(i) < tv.GetColumnHeader(i).Length Then
'			colChars(i) = tv.GetColumnHeader(i).Length        ' Enforce minimum width to column header length
'		End If
'		totalChars = totalChars + colChars(i)
'	Next
'  
'	' Set the size of the columns proportionally based on character widths
'
'	For i = 0 To colChars.Length - 1
'		'lstAnchos.Add((colChars(i) / totalChars) * (fx.PrimaryScreen.MaxX-50))  ' -20 to allow for scroll bar
'		Dim m As Map=CreateMap("NombreColumna":tv.GetColumnHeader(i),"AnchoColumna":colChars(i) * 8+10)
'		lstAnchos.Add(m)
'	Next
'	Return lstAnchos
'End Sub


Sub GetTablePragma(SQL As SQL,TableName As String) As List  '' devuelve PRAGMA de una tabla
	Private lstFields As List
	lstFields.Initialize
	Private TBQuery As String
	TBQuery = "PRAGMA table_info(" & TableName & ")"
	Dim rs As ResultSet=SQL.ExecQuery(TBQuery)
	Do While rs.NextRow
		Dim ColumnParmsMap As Map
		ColumnParmsMap.Initialize
		For i=0 To rs.ColumnCount-1
			#if debug
			Log ("     " & i & ": " &  rs.GetColumnName(i) & "->" & rs.GetString2(i))
			#end if
			ColumnParmsMap.Put(rs.GetColumnName(i), rs.GetString2(i))
		Next
		lstFields.Add(ColumnParmsMap)
	Loop
	rs.Close
	Return lstFields
End Sub


Sub GetFileType(FilePath As String) As String
	Dim MediaType As JavaObject
 MediaType.InitializeStatic("com.google.common.net.MediaType")
 ' see https://google.github.io/guava/releases/23.0/api/docs/com/google/common/net/MediaType.html for types
 Dim fileType As String = asJO(Me).RunMethod("getType",Array(FilePath)) ' the file to examine
 'what nio sees it as
 Log(fileType)
 ' use guava to group them into types of file video, image, text etc
 If fileType<>"null" Then
  If MediaType.RunMethodJO("parse",Array(fileType)).RunMethod("is",Array(MediaType.GetField("ANY_IMAGE_TYPE"))) Then
   Log("Image file")
  else if MediaType.RunMethodJO("parse",Array(fileType)).RunMethod("is",Array(MediaType.GetField("ANY_VIDEO_TYPE"))) Then
   Log("Video file")
  else if MediaType.RunMethodJO("parse",Array(fileType)).RunMethod("is",Array(MediaType.GetField("ANY_TEXT_TYPE"))) Then
   Log("Text file")
  Else
   Log("File is  : "&MediaType.RunMethod("parse",Array(fileType)))
  End If
 End If
 Return fileType
End Sub
Sub asJO(o As JavaObject)As JavaObject
	Return o
End Sub
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	Return True
End Sub
#if java
import java.nio.file.*;
import java.io.*;
public static String getType(String filePath) throws IOException , SecurityException{
 return Files.probeContentType(Paths.get(filePath));
}
#End If

'Sub InsertarListaMapasTablaSQL(SQL As SQL,NombreTabla As String)
'	Dim lstInfoCampos As List=DBUtils.GetFieldsInfo(mSQLExpedicionesAbiertas,tblExpedicionesTXTAbiertas)
'	Dim lstValores As List
'	lstValores.Initialize
'	Dim sbInsertarRegistro As StringBuilder
'	sbInsertarRegistro.Initialize
'	sbInsertarRegistro.Append("INSERT INTO tblExpedicionesTXTAbiertas (")
'	lstRes.Add(mDatosExpedicion)
'	For Each k As String In mDatosExpedicion.Keys
'		Log(k & ": " & mDatosExpedicion.Get(k))
'		If DBUtils.
'	Next
'End Sub

'Igual que InsertMaps de DBUtils, pero sólo para los campos que coincidan
' Si hay 1 clave que no coincida, no casca, muestra 1 log ...
Sub InsertarMapsSoloCamposCoincidentes(mSQL As SQL, TableName As String, ListOfMaps As List)
	Dim sb, columns, values As StringBuilder
	'Small check for a common error where the same map is used in a loop
	If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = ListOfMaps.Get(1) Then
		LogColor("ERROR InsertarMapsSoloCamposCoincidentes, hay al menos 1 mapa repetido", xui.Color_Red)
		Return
	End If
	
	Dim lstMapsCamposTabla As List=GetTablePragma(mSQL,TableName)
	Dim lstNombresCamposTabla As List
	lstNombresCamposTabla.Initialize
	For Each mCamposTabla As Map In lstMapsCamposTabla
		Dim NombreCampo As String=mCamposTabla.Get("name")
		lstNombresCamposTabla.Add(NombreCampo)
	Next
	mSQL.BeginTransaction
	Try
		For i1 = 0 To ListOfMaps.Size - 1
			sb.Initialize
			columns.Initialize
			values.Initialize
			Dim listOfValues As List
			listOfValues.Initialize
			sb.Append("INSERT INTO [" & TableName & "] (")
			Dim m As Map
			m = ListOfMaps.Get(i1)
			For i2 = 0 To m.Size - 1
				Dim NombreKey As String=m.GetKeyAt(i2)
				If lstNombresCamposTabla.IndexOf(NombreKey)>-1 Then
					Dim col As String
					Dim value As Object
					col = m.GetKeyAt(i2)
					value = m.GetValueAt(i2)
					If i2 > 0 And columns.Length>0 Then
						columns.Append(", ")
						values.Append(", ")
					End If
					columns.Append("[").Append(col).Append("]")
					values.Append("?")
					listOfValues.Add(value)
				Else
					#if debug
					LogColor("AVISO InsertarMapsSoloCamposCoincidentes: Campo " & NombreKey & " no existe en tabla " & TableName & "...¿error?", xui.Color_Magenta)
					#end if
				End If
			Next
			sb.Append(columns.ToString).Append(") VALUES (").Append(values.ToString).Append(")")
			If i1 = 0 Then Log("InsertMaps (first query out of " & ListOfMaps.Size & "): " & sb.ToString)
			mSQL.ExecNonQuery2(sb.ToString, listOfValues)
		Next
		mSQL.TransactionSuccessful
	Catch

		LogColor("ERROR InsertarMapsSoloCamposCoincidentes " & LastException, xui.Color_Red)
		mSQL.Rollback
	End Try
End Sub



Sub SetLightThemeDialog(dlg As B4XDialog)
	dlg.BackgroundColor = xui.Color_White
	dlg.ButtonsColor = xui.Color_White
	dlg.BorderColor = xui.Color_Gray
	dlg.ButtonsTextColor = xui.Color_ARGB(0xFF, 0x00, 0x7D, 0xC3)
End Sub

Sub SetLightThemeList(list As B4XListTemplate)
	Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B, 0x5B, 0x5B)
	list.CustomListView1.sv.ScrollViewInnerPanel.Color = xui.Color_ARGB(0xFF, 0xDF, 0xDF, 0xDF)
	list.CustomListView1.sv.Color = xui.Color_White
	list.CustomListView1.DefaultTextBackgroundColor = xui.Color_White
	list.CustomListView1.DefaultTextColor = TextColor
End Sub

Sub SetLightThemeInput(input As B4XInputTemplate)
	Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B, 0x5B, 0x5B)
	input.TextField1.TextColor = TextColor
	input.lblTitle.TextColor = TextColor
	input.SetBorderColor(TextColor, xui.Color_Red)
End Sub

Sub SetLightThemeSearch(search As B4XSearchTemplate)
	Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B, 0x5B, 0x5B)
	search.SearchField.TextField.TextColor = TextColor
	search.SearchField.NonFocusedHintColor = TextColor
	search.CustomListView1.sv.ScrollViewInnerPanel.Color = xui.Color_ARGB(0xFF, 0xDF, 0xDF, 0xDF)
	search.CustomListView1.sv.Color = xui.Color_White
	search.CustomListView1.DefaultTextBackgroundColor = xui.Color_White
	search.CustomListView1.DefaultTextColor = TextColor
	If search.SearchField.lblV.IsInitialized Then search.SearchField.lblV.TextColor = TextColor
	If search.SearchField.lblClear.IsInitialized Then search.SearchField.lblClear.TextColor = TextColor
End Sub

Sub SetLightThemeDate(datetemplate As B4XDateTemplate)
	Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B, 0x5B, 0x5B)
	datetemplate.DaysInWeekColor = xui.Color_Black
	datetemplate.SelectedColor = xui.Color_ARGB(0xFF, 0x39, 0xD7, 0xCE)
	datetemplate.HighlightedColor = xui.Color_ARGB(0xFF, 0x00, 0xCE, 0xFF)
	datetemplate.DaysInMonthColor = TextColor
	datetemplate.lblMonth.TextColor = TextColor
	datetemplate.lblYear.TextColor = TextColor
	datetemplate.SelectedColor = xui.Color_ARGB(0xFF, 0xFF, 0xA7, 0x61)
	For Each x As B4XView In Array(datetemplate.btnMonthLeft, datetemplate.btnMonthRight, datetemplate.btnYearLeft, datetemplate.btnYearRight)
		x.Color = xui.Color_Transparent
	Next
End Sub




'''
'''' Sub para pasar el NOMBRE del MODULO como parámetro
''''Ejemplo
''''<code>
''''Wait For(Utilidades.PermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"ModuloXYZ")) complete (sRes As string)
''''select case sRes
''''	case "ErrConn"
''''		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query.","Error")
''''		Wait For (msa) Msgbox_Result
''''		Return
''''	case "SinPermiso"
''''		Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
''''		Wait For (msa) Msgbox_Result
''''		Return
''''	Case "ERROR"
''''		Dim msa As Object=xui.MsgboxAsync(sRes,"Error")
''''		Wait For (msa) Msgbox_Result
''''		Return
''''	case "DENIED"
''''		Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
''''		Wait For (msa) Msgbox_Result
''''		Return
'''' 	case else
''''		Dim PermisoModuloUsuario as string=sRes
''''end Select
''''</code>
'''Public Sub PermisosAplicacionUsuarioObjetoPermiso(rdcLinkCommandPermisos As String, ComandoPermisos As String,  Aplicacion As String, Usuario As String, NombreObjetoPermiso As String) As ResumableSub
'''	Dim sRes As String
'''	JRDCQuery.DatosJRDC(rdcLinkCommandPermisos,ComandoPermisos,Array(Aplicacion), Me)
'''	Wait For DatosJRDC_Completed (mresult As Map)
'''	If mresult.Get("ConnOK")=False Then
'''		sRes="ErrConn"
'''	Else
'''		If mresult.Get("ReqOK")=False Then
'''			sRes="SinPermiso"
'''		Else
'''			Dim lstReg As List=mresult.Get("lstRes")
'''			Dim mPerm As Map=lstReg.Get(0)
'''			Dim sPerm As String=mPerm.GetValueAt(0)
'''			If sPerm.StartsWith("ERROR") Then
'''				sRes="ERROR " & sPerm
'''			Else
'''				Dim PermisoAplicacionTodosUsuariosTodosObjetos As String
'''				Dim PermisoAplicacionTodosUsuariosObjeto As String
'''				Dim PermisoAplicacionUsuarioTodosObjetos As String
'''				Dim PermisoAplicacionUsuarioObjeto As String
'''				Dim OSApp As String
'''				#If B4J
'''				OSApp="Windows"
'''				#End if
'''				#If B4A
'''				OSApp="Android"
'''				#End if
'''				For Each mPerm As Map In lstReg
'''					Dim OSPerm As String=mPerm.Get("OS")
'''					If OSPerm<>"" And OSPerm.ToUpperCase<>OSApp.ToUpperCase Then Continue
'''					Dim UserPerm As String=mPerm.Get("IDUsuario")
'''					Dim ObjetoPerm As String=mPerm.Get("ObjetoPermiso")
'''					Dim TipoPerm As String=mPerm.Get("TipoPermiso")
'''					
'''					If UserPerm<>"" And UserPerm.ToUpperCase<>Usuario.ToUpperCase Then Continue  ' si se indica explicitamente un usuario y éste no es el usuario pasado en el parámetro, pasar a siguiente iteracion
'''					
'''					If UserPerm.ToUpperCase=Usuario.ToUpperCase And ObjetoPerm.ToUpperCase=NombreObjetoPermiso.ToUpperCase Then
'''						PermisoAplicacionUsuarioObjeto=TipoPerm
'''						' es el caso más concreto de todos los posibles. Salir del loop. Para el resto de casos, hay que recorrer todo el loop
'''						Exit
'''					End If
'''
'''					If UserPerm.ToUpperCase=Usuario.ToUpperCase And ObjetoPerm="" Then PermisoAplicacionUsuarioTodosObjetos=TipoPerm
'''					
'''					If ObjetoPerm.ToUpperCase=NombreObjetoPermiso.ToUpperCase And UserPerm="" Then PermisoAplicacionTodosUsuariosObjeto=TipoPerm
'''					
'''					If UserPerm="" And ObjetoPerm="" Then PermisoAplicacionTodosUsuariosTodosObjetos=TipoPerm
'''
'''				Next
'''				
'''				' evaluar de más generico a más concreto
'''				If PermisoAplicacionTodosUsuariosTodosObjetos<>"" Then sRes=PermisoAplicacionTodosUsuariosTodosObjetos
'''				If PermisoAplicacionUsuarioTodosObjetos<>"" Then sRes=PermisoAplicacionUsuarioTodosObjetos
'''				If PermisoAplicacionTodosUsuariosObjeto<>"" Then sRes=PermisoAplicacionTodosUsuariosObjeto
'''				' al contrario que NAVISION (ver https://blog.aitana.es/2017/03/21/roles-permisos-microsoft-dynamics-nav/) , si tenemos simultáneamente
'''				' PermisoAplicacionUsuarioTodosObjetos y PermisoAplicacionTodosUsuariosObjeto, aplicamos el MAS RECTRICTIVO de los 2.
'''				
'''				If PermisoAplicacionUsuarioTodosObjetos<>"" And PermisoAplicacionTodosUsuariosObjeto<>"" And PermisoAplicacionUsuarioTodosObjetos<>PermisoAplicacionTodosUsuariosObjeto Then
'''					If PermisoAplicacionUsuarioTodosObjetos="ADMIN" Then
'''						sPerm="ADMIN"
'''					Else
'''						If PermisoAplicacionUsuarioTodosObjetos="DENIED" Or PermisoAplicacionTodosUsuariosObjeto="DENIED" Then
'''							sPerm="DENIED"
'''						Else
'''							If PermisoAplicacionUsuarioTodosObjetos="R" Or PermisoAplicacionTodosUsuariosObjeto="R" Then
'''								sPerm="R"
'''							Else
'''								If PermisoAplicacionUsuarioTodosObjetos="RW" Or PermisoAplicacionTodosUsuariosObjeto="RW" Then
'''									sPerm="RW"
'''									'							Else
'''									If PermisoAplicacionUsuarioTodosObjetos="ADMIN" Or PermisoAplicacionTodosUsuariosObjeto="ADMIN" Then
'''										sPerm="ADMIN"
'''									End If
'''								End If
'''							End If
'''						End If
'''					End If
'''				End If
'''				
'''				If PermisoAplicacionUsuarioObjeto<>"" Then sRes=PermisoAplicacionUsuarioObjeto
'''
'''				If sRes="" Then
'''					sRes="SinPermiso"
'''				End If
'''			End If
'''		End If
'''	End If
'''	LogColor("Check Permiso " & Aplicacion & " USUARIO: " & Usuario & " Nombre OBJETO Permiso: " & NombreObjetoPermiso & ":" & "PERMISO: " & sRes, 0xFFFF1493)
'''	Return sRes
'''End Sub


' Permiso GENERAL para la aplicacion
' Si hay error de conexion, otro tipo de error, si se deniega expresamente el acceso a la aplicacion para el usuario=> se cierra la aplicacion
' Si no hay registro para "Aplicacion" para el usuario (="SinPermiso"), se puede optar por no dar acceso, o permitirlo.
' Es decir, podemos querer dar acceso a todos los usuarios,excepto excepciones, o tener que dar permiso explícitamente.
'Ejemplo
' retocar las 2 lineas después del wait for, según lo que se necesite
'<code>
'jamLoadingIndicator1.show
'Wait For(Utilidades.CheckPermisoAplicacionUsuario(rdclinkMySqlDatosComunes, "PermisosAplicacion",NombreAplicacion,DatosUsuario.NombreUsuarioWindows)) complete (sRes As string)
'jamLoadingIndicator1.Close
''Comentar este if, si se quiere dar acceso por defecto a la aplicacion
'if sRes="PermisoNoEspecificado" then
' 	Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a esta aplicación","Aviso")
'	Wait For (msa) Msgbox_Result
'	ExitApplication
'End if
'Dim PermisoAplicacionUsuario As String=sRes
'</code>
public Sub CheckPermisoAplicacionUsuario(rdcLinkCommandPermisos As String, ComandoPermisos As String,  Aplicacion As String, Usuario As String) As ResumableSub
	Wait For(PermisosAplicacionUsuarioObjetoPermiso(rdcLinkCommandPermisos, ComandoPermisos,Aplicacion,Usuario,"Aplicacion")) complete (sRes As String)
	Select Case sRes
		Case "ErrConn"
			Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query.","Error")
			Wait For (msa) Msgbox_Result
			ExitApplication
			Return Null
		Case "SinPermiso"  ' no se especifica el permiso para el usuario.
			Return "PermisoNoEspecificado"
		Case "ERROR"
			Dim msa As Object=xui.MsgboxAsync(sRes,"Error")
			Wait For (msa) Msgbox_Result
			ExitApplication
			Return Null
		Case "DENIED"
			Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a esta aplicacón.","Aviso")
			Wait For (msa) Msgbox_Result
			ExitApplication
			Return Null
		Case Else
			Return sRes
	End Select
End Sub





'Ejemplo
' retocar las 2 lineas después del wait for, según lo que se necesite
'<code>
'jamLoadingIndicator1.show
'Wait For(Utilidades.CheckPermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"ModuloXYZ")) complete (sRes As string)
'jamLoadingIndicator1.Close
'if sRes="NO" or sRes="ERROR" or sRes="DENIED" then return
'Dim PermisoModuloUsuario As String=sRes
'</code>
public Sub CheckPermisosAplicacionUsuarioObjetoPermiso(rdcLinkCommandPermisos As String, ComandoPermisos As String,  Aplicacion As String, Usuario As String, NombreObjetoPermiso As String) As ResumableSub
	Wait For(PermisosAplicacionUsuarioObjetoPermiso(rdcLinkCommandPermisos, ComandoPermisos,Aplicacion,Usuario,NombreObjetoPermiso)) complete (sRes As String)
	Select Case sRes
		Case "ErrConn"
			Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query.","Error")
			Wait For (msa) Msgbox_Result
			Return "ERROR"
		Case "SinPermiso"
			Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
			Wait For (msa) Msgbox_Result
			Return "NO"
		Case "ERROR"
			Dim msa As Object=xui.MsgboxAsync(sRes,"Error")
			Wait For (msa) Msgbox_Result
			Return "ERROR"
		Case "DENIED"
			Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
			Wait For (msa) Msgbox_Result
			Return "DENIED"
		Case Else
			Return sRes
	End Select
End Sub


' Sub para pasar el NOMBRE del MODULO como parámetro
'Ejemplo
'<code>
'Wait For(Utilidades.PermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"ModuloXYZ")) complete (sRes As string)
'select case sRes
'	case "ErrConn"
'		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query.","Error")
'		Wait For (msa) Msgbox_Result
'		Return
'	case "SinPermiso"
'		Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
'		Wait For (msa) Msgbox_Result
'		Return
'	Case "ERROR"
'		Dim msa As Object=xui.MsgboxAsync(sRes,"Error")
'		Wait For (msa) Msgbox_Result
'		Return
'	case "DENIED"
'		Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
'		Wait For (msa) Msgbox_Result
'		Return
' 	case else
'		Dim PermisoModuloUsuario as string=sRes
'end Select
'</code>
private Sub PermisosAplicacionUsuarioObjetoPermiso(rdcLinkCommandPermisos As String, ComandoPermisos As String,  Aplicacion As String, Usuario As String, NombreObjetoPermiso As String) As ResumableSub
	Dim sRes As String
	JRDCQuery.DatosJRDC(rdcLinkCommandPermisos,ComandoPermisos,Array(Aplicacion), Me)
	Wait For DatosJRDC_Completed (mresult As Map)
	If mresult.Get("ConnOK")=False Then
		sRes="ErrConn"
	Else
		If mresult.Get("ReqOK")=False Then
			sRes="SinPermiso"
		Else
			Dim lstReg As List=mresult.Get("lstRes")
			Dim mPerm As Map=lstReg.Get(0)
			Dim sPerm As String=mPerm.GetValueAt(0)
			If sPerm.StartsWith("ERROR") Then
				sRes="ERROR " & sPerm
			Else
				Dim PermisoAplicacionTodosUsuariosTodosObjetos As String
				Dim PermisoAplicacionTodosUsuariosObjeto As String
				Dim PermisoAplicacionUsuarioTodosObjetos As String
				Dim PermisoAplicacionUsuarioObjeto As String
				Dim OSApp As String
				#If B4J
					OSApp="Windows"
				#End if
				#If B4A
				OSApp="Android"
				#End if
				For Each mPerm As Map In lstReg
					Dim OSPerm As String=mPerm.Get("OS")
					If OSPerm<>"" And OSPerm.ToUpperCase<>OSApp.ToUpperCase Then Continue
					Dim UserPerm As String=mPerm.Get("IDUsuario")
					Dim ObjetoPerm As String=mPerm.Get("ObjetoPermiso")
					Dim TipoPerm As String=mPerm.Get("TipoPermiso")
					
					If UserPerm<>"" And UserPerm.ToUpperCase<>Usuario.ToUpperCase Then Continue  ' si se indica explicitamente un usuario y éste no es el usuario pasado en el parámetro, pasar a siguiente iteracion
					
					If UserPerm.ToUpperCase=Usuario.ToUpperCase And ObjetoPerm.ToUpperCase=NombreObjetoPermiso.ToUpperCase Then
						PermisoAplicacionUsuarioObjeto=TipoPerm
						' es el caso más concreto de todos los posibles. Salir del loop. Para el resto de casos, hay que recorrer todo el loop
						Exit
					End If

					If UserPerm.ToUpperCase=Usuario.ToUpperCase And ObjetoPerm="" Then PermisoAplicacionUsuarioTodosObjetos=TipoPerm
					
					If ObjetoPerm.ToUpperCase=NombreObjetoPermiso.ToUpperCase And UserPerm="" Then PermisoAplicacionTodosUsuariosObjeto=TipoPerm
					
					If UserPerm="" And ObjetoPerm="" Then PermisoAplicacionTodosUsuariosTodosObjetos=TipoPerm

				Next
				
				' evaluar de más generico a más concreto
				If PermisoAplicacionTodosUsuariosTodosObjetos<>"" Then sRes=PermisoAplicacionTodosUsuariosTodosObjetos
				If PermisoAplicacionUsuarioTodosObjetos<>"" Then sRes=PermisoAplicacionUsuarioTodosObjetos
				If PermisoAplicacionTodosUsuariosObjeto<>"" Then sRes=PermisoAplicacionTodosUsuariosObjeto
				' al contrario que NAVISION (ver https://blog.aitana.es/2017/03/21/roles-permisos-microsoft-dynamics-nav/) , si tenemos simultáneamente 
				' PermisoAplicacionUsuarioTodosObjetos y PermisoAplicacionTodosUsuariosObjeto, aplicamos el MAS RECTRICTIVO de los 2.
				If PermisoAplicacionUsuarioTodosObjetos<>"" And PermisoAplicacionTodosUsuariosObjeto<>"" And PermisoAplicacionUsuarioTodosObjetos<>PermisoAplicacionTodosUsuariosObjeto Then
					If PermisoAplicacionUsuarioTodosObjetos="ADMIN" Then
						sPerm="ADMIN"
					Else
						If PermisoAplicacionUsuarioTodosObjetos="DENIED" Or PermisoAplicacionTodosUsuariosObjeto="DENIED" Then
							sPerm="DENIED"
						Else
							If PermisoAplicacionUsuarioTodosObjetos="R" Or PermisoAplicacionTodosUsuariosObjeto="R" Then
								sPerm="R"
							Else
								If PermisoAplicacionUsuarioTodosObjetos="RW" Or PermisoAplicacionTodosUsuariosObjeto="RW" Then
									sPerm="RW"
	'							Else
									If PermisoAplicacionUsuarioTodosObjetos="ADMIN" Or PermisoAplicacionTodosUsuariosObjeto="ADMIN" Then
										sPerm="ADMIN"
									End If
								End If
							End If
						End If
					End If
				End If
				If PermisoAplicacionUsuarioObjeto<>"" Then sRes=PermisoAplicacionUsuarioObjeto

				If sRes="" Then
					sRes="SinPermiso"
				End If
			End If
		End If
	End If
	
	#if debug
	LogColor("Check Permiso " & Aplicacion & " USUARIO: " & Usuario & " Nombre OBJETO Permiso: " & NombreObjetoPermiso & ":" & "PERMISO: " & sRes, 0xFFFF1493)
	#End If
	
	Return sRes
End Sub


Sub EnviarEmailSolicitudPermisoObjetoApp(Objeto As String) As ResumableSub
	Dim SMTP As SMTP
	SMTP.Initialize(Main.DatosConfiguracionAplicacion.ServidorEnvioEmail, Main.DatosConfiguracionAplicacion.PuertoEnvioEmail, _
			 Main.DatosConfiguracionAplicacion.DireccionEnvioEmail, Main.DatosConfiguracionAplicacion.PasswordEnvioEmail, "SMTP")
	SMTP.StartTLSMode = True
	SMTP.UseSSL = True 'Gmail requires SSL.
	If Main.DatosConfiguracionAplicacion.EmailDesarrollador1<>"" Or Main.DatosConfiguracionAplicacion.EmailDesarrollador2<>"" Then
		If Main.DatosConfiguracionAplicacion.EmailDesarrollador1<>"" Then
			SMTP.To.Add(Main.DatosConfiguracionAplicacion.EmailDesarrollador1)
		End If
			
		If Main.DatosConfiguracionAplicacion.EmailDesarrollador2<>"" Then
			SMTP.To.Add(Main.DatosConfiguracionAplicacion.EmailDesarrollador2)
		End If
			
		SMTP.Subject = "Solicitud permiso Usuario " & Main.DatosUsuario.NombreUsuarioWindows & " aplicación: " & Main.NombreAplicacion & " modulo: " & Objeto
		SMTP.Body = $"
		Aplicación ${Main.NombreAplicacion}
		
		Versión ${Main.Version}
		
		Dispositivo${Main.DatosUsuario.Dispositivo}
		
		NombreUsuarioWindows${Main.DatosUsuario.NombreUsuarioWindows}
		
		Modulo ${Objeto}}
		"$
		
		Dim SendEmail As Object =SMTP.Send
		Wait For (SendEmail) SMTP_MessageSent(Success As Boolean)
		If Success Then
		Else
			Log("Error enviando email solicitud permiso")
		End If
	Else
		
	End If
	
End Sub


public Sub FindUserDocumentsFolder As String
	If DetectOS = "windows" Then
		Dim jo As JavaObject
		Dim fs As JavaObject = jo.InitializeStatic("javax.swing.filechooser.FileSystemView").RunMethod("getFileSystemView", Null)
		Return fs.RunMethodJO("getDefaultDirectory", Null).RunMethod("getPath", Null)
	Else
		Return GetSystemProperty("user.home", "") & "/Documents"
	End If
End Sub

private Sub DetectOS As String
	Dim os As String = GetSystemProperty("os.name", "").ToLowerCase
	If os.Contains("win") Then
		Return "windows"
	Else If os.Contains("mac") Then
		Return "mac"
	Else
		Return "linux"
	End If
End Sub


Private Sub EscapeField(f As String) As String
	Return "[" & f & "]"
End Sub


'Crea un string para crear una tabla y lo devuelve al log,
' para ser copiado y MODIFICADO para ajustarlo a lo que necesitemos realmente
'MapPrimerRegistro: pasar el primer registro del recordset de datos como mapa, con campo-valor
'Revisar los tipos de datos, para ajustarlos.
'PrimaryKey - The column that will be the primary key. Pass empty string if not needed.
Public Sub LogStringCrearTablaDesdeMap(TableName As String, MapPrimerRegistro As Map, PrimaryKey As String)
	If MapPrimerRegistro.IsInitialized=False Then
		LogColor("******** Crear Tabla***********",xui.Color_Blue)
		LogColor("Mapa Registro no inicializado",xui.Color_Blue)
		LogColor("******** Fin Crear Tabla***********",xui.Color_Blue)
		Return
	End If
	If MapPrimerRegistro.Size=0 Then
		LogColor("******** Crear Tabla***********",xui.Color_Blue)
		LogColor("Mapa Registro vacío",xui.Color_Blue)
		LogColor("******** Fin Crear Tabla***********",xui.Color_Blue)
		Return
	End If
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("(")
	For i = 0 To MapPrimerRegistro.Size - 1
		Dim field, ftype, sValor As String
		field = MapPrimerRegistro.GetKeyAt(i)
		sValor=MapPrimerRegistro.Get(field)
		Select True
			Case EsInteger(sValor)
				ftype=DBUtils.DB_INTEGER
			Case EsLong(sValor)
				ftype=DBUtils.DB_INTEGER
			Case EsFraccional(sValor)
				ftype=DBUtils.DB_REAL
			Case Else
				ftype=DBUtils.DB_TEXT
		End Select
		If i > 0 Then sb.Append(", ")
		sb.Append(EscapeField(field)).Append(" ").Append(ftype)
		If field = PrimaryKey Then sb.Append(" PRIMARY KEY")
	Next
	sb.Append(")")
	Dim query As String = "CREATE TABLE IF NOT EXISTS " & EscapeField(TableName) & " " & sb.ToString
	'#IF Not(DBUTILS_NOLOGS)
'	Log("CreateTable: " & query)
	'#End If
'	SQL.ExecNonQuery(query)
	LogColor("******** Crear Tabla***********",xui.Color_Blue)
	LogColor(query,xui.Color_Blue)
	LogColor("******** Fin Crear Tabla***********",xui.Color_Blue)
End Sub


'https://stackoverflow.com/questions/2811031/decimal-or-numeric-values-in-regular-expression-validation/39399503#39399503
Sub EsInteger(s As String) As Boolean
	If IsNumber(s) And Regex.IsMatch("^-?(0|[1-9]\d*)$",s) Then
		Try
			Dim sInt As Int=s
			Return True
		Catch
			Log(LastException)
			Return False
		End Try
	Else
		Return False
	End If
End Sub

' doble o float
Sub EsFraccional(s As String) As Boolean
	Return IsNumber(s) And Regex.IsMatch("^-?(0|[1-9]\d*)?(\.\d+)?(?<=\d)$",s)
	
End Sub

Sub EsDouble(s As String) As Boolean
	If IsNumber(s)=False Then Return False
	s=asJO(Me).RunMethod("TextoSinNotacionCientifica",Array(s))
	If EsFraccional(s) Then
		Try
			Dim NumDouble As Double=s
			Return True
		Catch
			Log(LastException)
			Return False
		End Try
	Else
		Return False
	End If
End Sub

Sub EsFloat(s As String) As Boolean
	If IsNumber(s)=False Then Return False
	s=asJO(Me).RunMethod("TextoSinNotacionCientifica",Array(s))
	
	If EsFraccional(s) Then
		Try
			Dim NumDouble As Float=s
			Return True
		Catch
			Log(LastException)
			Return False
		End Try
	Else
		Return False
	End If
End Sub

#If java
	import java.math.*;
	public static String TextoSinNotacionCientifica(Object o){
		String s=new BigDecimal(o.toString()).toPlainString();
		return s;
	}		
#End If

Sub EsLong(s As String) As Boolean
	If EsInteger(s) Then
		Try
			Dim Numlong As Long=s
			Return True
		Catch
			Log(LastException)
			Return False
		End Try
	Else
		Return False
	End If
End Sub

Sub FontAwesomeToBitmap (Text As String, FontSize As Float, Color As Int) As B4XBitmap
	Dim xui As XUI
	Dim p As Pane = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, FontSize+2dip, FontSize+2dip)
	Dim cvs1 As B4XCanvas
	cvs1.Initialize(p)
	Dim fnt As B4XFont = xui.CreateFontAwesome(FontSize)
	Dim r As B4XRect = cvs1.MeasureText(Text, fnt)
	Dim BaseLine As Int = cvs1.TargetRect.CenterY - r.Height / 2 - r.Top
	cvs1.DrawText(Text, cvs1.TargetRect.CenterX, BaseLine, fnt, Color, "CENTER")
	Dim b As B4XBitmap = cvs1.CreateBitmap
	cvs1.Release
	Return b
End Sub

Sub MaterialIconsToBitmap (Text As String, FontSize As Float, Color As Int) As B4XBitmap
	Dim xui As XUI
	Dim p As Pane = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, FontSize+2dip, FontSize+2dip)
	Dim cvs1 As B4XCanvas
	cvs1.Initialize(p)
	Dim fnt As B4XFont = xui.CreateMaterialIcons(FontSize)
	Dim r As B4XRect = cvs1.MeasureText(Text, fnt)
	Dim BaseLine As Int = cvs1.TargetRect.CenterY - r.Height / 2 - r.Top
	cvs1.DrawText(Text, cvs1.TargetRect.CenterX, BaseLine, fnt, Color, "CENTER")
	Dim b As B4XBitmap = cvs1.CreateBitmap
	cvs1.Release
	Return b
End Sub

Public Sub SetFontToBitmap (FontText As String, FontType As B4XFont , FontSize As Float, FontColor As Int) As B4XBitmap
	Dim xui As XUI
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, 32dip, 32dip)
	Dim cvs1 As B4XCanvas
	cvs1.Initialize(p)
	Dim r As B4XRect = cvs1.MeasureText(FontText, xui.CreateFont2(FontType, FontSize))
	Dim BaseLine As Int = cvs1.TargetRect.CenterY - r.Height / 2 - r.Top
	cvs1.DrawText(FontText, cvs1.TargetRect.CenterX, BaseLine, xui.CreateFont2(FontType, FontSize), FontColor, "CENTER")
	cvs1.Invalidate
	Dim b As B4XBitmap = cvs1.CreateBitmap
	cvs1.Release
	Return b
End Sub



'NativeFontSize is needed only for B4J or B4I.
'ejemplo
'<code>
'Dim PackageImg As Image=SetFontToBitmap(Chr(0xf3d6), CreateB4XFont("materialdesignicons-webfont.ttf",32,32),32,xui.Color_Black)
'</code>
Public Sub CreateB4XFont(FontFileName As String, FontSize As Float, NativeFontSize As Float) As B4XFont
    #If B4A
        Return xui.CreateFont(Typeface.LoadFromAssets(FontFileName), FontSize)
    #Else If B4i
        Return xui.CreateFont(Font.CreateNew2(FontFileName, NativeFontSize), FontSize)
    #Else    ' B4J
	Return xui.CreateFont(fx.LoadFont(File.DirAssets, FontFileName, NativeFontSize), FontSize)
    #End If
End Sub

Sub GetImageBytes(Dir As String, Filename As String) As Byte()
	Dim bytes() As Byte = Bit.InputStreamToBytes(File.OpenInput(Dir,Filename))
	Return bytes
End Sub



' Convert text string to an image using a hidden label.
' Example with FontAwesome:
' Dim img As Image = TextToImage(MainForm.RootPane, Chr(0xF0AA), 16)
' This can be used to add f.e. a fontawesome icon dynamically to a menu item:
' Dim mi As MenuItem ... mi.Image = img
private Sub TextToImageAwesome(s As String, FontSize As Double) As Image
	Dim img As Image
	Dim lbl As Label
	lbl.Initialize("lbl")
	lbl.Font = fx.CreateFontAwesome(FontSize)
	lbl.Text = s
	'Dim p As Pane=mBase
	Dim p As Pane=xui.CreatePanel("")
	p.AddNode(lbl, -1, -1, -1, -1)
	' img = lbl.Snapshot
	img = lbl.Snapshot2(fx.Colors.Transparent) ' snapshot2, para que el icono tenga fondo transparente al seleccionarlo
	lbl.Visible = False

	p.RemoveNodeAt(p.NumberOfNodes-1)
	Return img
End Sub

private Sub TextToImageMaterialIcons(s As String, FontSize As Double) As Image
	Dim img As Image
	Dim lbl As Label
	lbl.Initialize("lbl")
	lbl.Font = fx.CreateMaterialIcons(FontSize)
	lbl.Text = s
	' Dim p As Pane=mBase
	Dim p As Pane=xui.CreatePanel("")
	p.AddNode(lbl, -1, -1, -1, -1)
	' img = lbl.Snapshot
	img = lbl.Snapshot2(fx.Colors.Transparent) ' snapshot2, para que el icono tenga fondo transparente al seleccionarlo
	lbl.Visible = False

	p.RemoveNodeAt(p.NumberOfNodes-1)
	Return img
End Sub

'ejemplo
'<code>
'wait for(Utilidades.MsgBoxXUI("Titulo","Mensaje")) complete (rObj as Object)
'</code>
'<code>
'Dim msa As Object=xui.MsgboxAsync(TextoMensaje,TituloMsg)
'Wait For (msa) Msgbox_Result
'</code>
Sub MsgBoxXUI(TituloMsg As String, TextoMensaje As String) As ResumableSub
	Dim msa As Object=xui.MsgboxAsync(TextoMensaje,TituloMsg)
	Wait For (msa) Msgbox_Result
	
	Return Null
End Sub

'ejemplo
'<code>
'wait for(Utilidades.MsgBox2XUI("Titulo","Mensaje","OK","Cancelar","NOK",Null)) complete (rInt as int)
'	If rInt<>xui.DialogResponse_Positive then Return	
'</code>
'<code>
'Dim msa As Object = xui.Msgbox2Async(TextoMensaje,TituloMsg, TextoOK,TextoCancelar, TextNOK, Null)
'Wait For (msa) Msgbox_Result (rInt As Int)
'</code>
Sub MsgBox2XUI(TituloMsg As String, TextoMensaje As String,TextoOK As String,TextoCancelar As String, TextNOK As String,  ImagenIcono As Image) As ResumableSub
	If ImagenIcono.IsInitialized Then
		Dim msa As Object = xui.Msgbox2Async(TextoMensaje,TituloMsg, TextoOK,TextoCancelar, TextNOK, ImagenIcono)
		Sleep(0)
	Else
		Dim msa As Object = xui.Msgbox2Async(TextoMensaje,TituloMsg, TextoOK,TextoCancelar, TextNOK, Null)
		Sleep(0)
	End If
	Wait For (msa) Msgbox_Result (rInt As Int)

	Return rInt
End Sub

'algorithm is often used "MD5"
Sub Get_Hash(Text As String, algorithm As String) As String
	Dim bc As ByteConverter
	Dim md As MessageDigest

	Dim data() As Byte
	Dim encrypted() As Byte

	data = bc.StringToBytes(Text, "UTF-8")
	encrypted = md.GetMessageDigest(data, algorithm)
	Dim res As String = bc.HexFromBytes(encrypted)
	Return (res)
End Sub

Sub GetSHA1MD5String(hString As String) As String

	Dim md As MessageDigest
	Dim ByteCon As ByteConverter
	Dim passwordhash() As Byte
	Dim passwordhash2() As Byte
	passwordhash = md.GetMessageDigest(hString.GetBytes("UTF8"),"MD5")
	Dim md5string As String
	md5string = ByteCon.HexFromBytes(passwordhash)
	md5string = md5string.ToLowerCase
	Log(md5string)
	passwordhash2 = md.GetMessageDigest(md5string.GetBytes("UTF8"),"SHA-1")
	Dim SHA1string As String
	SHA1string = ByteCon.HexFromBytes(passwordhash2)
	SHA1string = SHA1string.ToLowerCase
	Log(SHA1string)
	Return SHA1string
End Sub

'crear objeto java tipo Date , a partir de ticks (long)
Sub TicksToDate (ticks As Long) As Object
	Dim jo As JavaObject
	jo.InitializeNewInstance("java.util.Date", Array(ticks))
	Return jo
End Sub

Sub ConvertMillisecondsToString(t As Long) As String
	Dim hours, minutes, seconds As Int
	hours = t / DateTime.TicksPerHour
	minutes = (t Mod DateTime.TicksPerHour) / DateTime.TicksPerMinute
	seconds = (t Mod DateTime.TicksPerMinute) / DateTime.TicksPerSecond
	Return $"$1.0{hours}:$2.0{minutes}:$2.0{seconds}"$
End Sub

public Sub GenerarUUIDv4 As String
	Dim sb As StringBuilder
	sb.Initialize
	For Each stp As Int In Array(8, 4, 4, 4, 12)
		If sb.Length > 0 Then sb.Append("-")
		For n = 1 To stp
			Dim c As Int = Rnd(0, 16)
			If c < 10 Then c = c + 48 Else c = c + 55
			If sb.Length = 19 Then c = Asc("8")
			If sb.Length = 14 Then c = Asc("4")
			sb.Append(Chr(c))
		Next
	Next
	Return sb.ToString.ToLowerCase
End Sub

' Cambiar tamaño página WORD (XLUtils, jPOI)
Private Sub SetPageSize(doc As WordDocument, Width As Long, Height As Long)
	Dim document As JavaObject = doc.XWPFDocument.RunMethod("getDocument", Null)
	Dim body As JavaObject = document.RunMethod("getBody", Null)
	If body.RunMethod("isSetSectPr", Null).As(Boolean) = False Then
		body.RunMethod("addNewSectPr", Null)
	End If
	Dim section As JavaObject = body.RunMethod("getSectPr", Null)
	If section.RunMethod("isSetPgSz", Null).As(Boolean) = False Then
		section.RunMethod("addNewPgSz", Null)
	End If
	Dim pageSize As JavaObject = section.RunMethod("getPgSz", Null)
	Dim BigInteger As JavaObject
	BigInteger.InitializeStatic("java.math.BigInteger")
	pageSize.RunMethod("setW", Array(BigInteger.RunMethod("valueOf", Array(Width * 20))))
	pageSize.RunMethod("setH", Array(BigInteger.RunMethod("valueOf", Array(Height * 20))))
End Sub

Sub EliminarDuplicadosTablaSQLite(mSQL As SQL,NombreTabla As String)
	mSQL.ExecNonQuery($"
delete from ${NombreTabla} where RowID in
(Select RowID from ${NombreTabla}
where EXISTS
(Select 1 from ${NombreTabla} t2
where ${NombreTabla}.NumTarifa=t2.NumTarifa
And ${NombreTabla}.ROWID>t2.ROWID))"$)
End Sub

Sub TiempoDesdeTicks(TicksDato As Long) As String
	Dim p As Period
	p.Initialize
	p = DateUtils.PeriodBetweenInDays(TicksDato,DateTime.Now)
	Dim sTiempoDesdeDato As String
	If p.Days>0 Then
		sTiempoDesdeDato=sTiempoDesdeDato & $"$1.0{p.Days} días "$
	End If
	If p.Hours>0 Then
		sTiempoDesdeDato=sTiempoDesdeDato & $"$2.0{p.Hours} h "$
	End If
	If p.Minutes>0 Then
		sTiempoDesdeDato=sTiempoDesdeDato & $"$2.0{p.Minutes} m "$
	End If
	If p.Seconds>0 Then
		sTiempoDesdeDato=sTiempoDesdeDato & $"$2.0{p.Seconds} s "$
	End If
	Return sTiempoDesdeDato
End Sub


Private Sub FileExistDirAssets(FileName As String) As Boolean
	'If File.Exists(File.DirAssets, "ftypes") Then Return True
	Dim r As Reflector
	r.Target = Me
	r.Target = r.RunMethod("getClass")
	Dim In As InputStream = r.RunMethod2("getResourceAsStream", "/Files/" &  FileName, "java.lang.String")
	If In.IsInitialized = False Then Return False
	In.Close
	Return True
End Sub

 'This sub gets the text value of the cell (what is displayed to the user) rather than the underlying cell value.
 ' al IMPORTAR datos desde excel, para cuando necesitemos leer 1 columna como TEXTO
 ' por ejemplo, cuando la columna tiene números y texto. El clasico ejemplo son las TALLAS
 'Si los primeros datos de la tabla son numericos, interpretará "erroneamente", que la columna es numérica.
 ' con esta funcion se puede obtener el valor numerico
Sub PoiGetFormattedCellValue(ExcelCell As PoiCell) As String
	Dim JOCell As JavaObject = ExcelCell
	Dim JODataFormatter As JavaObject
	Dim JOConditionalFormattingEvaluator As JavaObject
	Dim JOFormulaEvaluator As JavaObject =JOCell.RunMethodJO("getSheet",Null).RunMethodJO("getWorkbook",Null).RunMethodJO("getCreationHelper",Null).RunMethodJO("createFormulaEvaluator",Null)
	JOConditionalFormattingEvaluator.InitializeNewInstance("org.apache.poi.ss.formula.ConditionalFormattingEvaluator",Array As Object (JOCell.RunMethodJO("getSheet",Null).RunMethodJO("getWorkbook",Null),JOCell.RunMethodJO("getSheet",Null).RunMethodJO("getWorkbook",Null).RunMethodJO("getCreationHelper",Null).RunMethodJO("createFormulaEvaluator",Null)))
	Return JODataFormatter.InitializeNewInstance("org.apache.poi.ss.usermodel.DataFormatter",Null).RunMethod("formatCellValue",Array As Object (JOCell,JOFormulaEvaluator,JOConditionalFormattingEvaluator))
   
End Sub

' 
Sub isCellInternalDateFormatted(Cell As PoiCell) As Boolean
	Dim JODateFormated As JavaObject
	JODateFormated.InitializeStatic("org.apache.poi.ss.usermodel.DateUtil")
	Return JODateFormated.RunMethod("isCellInternalDateFormatted",Array(Cell))
End Sub


Sub JSONtoCSV(s As String,  header As Boolean, delimiter As String) As ResumableSub
	Dim json As JSONParser
	Dim jmap As Map
	Dim vlist As List
	vlist.Initialize
		
	Try
		json.Initialize(s)
	Catch
		Log(LastException.Message)
		wait for(MsgBoxXUI("Error","Error initializing our parser...")) complete (rObj As Object)
		Return ""
	End Try
				
	Try
		jmap = json.NextObject
	Catch
		Log(LastException.Message)
		wait for(MsgBoxXUI("Error","Some problem reading the json...")) complete (rObj As Object)
		Return ""
	End Try

	vlist = jmap.Get("root")
	Dim sb As StringBuilder
	sb.Initialize
	
'	Dim header As Boolean = True
	
	For Each lilwalker As Map In vlist
		Dim i As Int
		If header Then
			header = False
			i = 0
			For Each key As String In lilwalker.Keys
				If i > 0 Then sb.Append(delimiter)
				sb.Append( key )
				i = i + 1
			Next
			sb.Append(CRLF)
		End If
		
		i = 0
		For Each v As String In lilwalker.Values
			If i > 0 Then sb.Append(delimiter)
'			Dim v As String = lilwalker.GetValueAt(i)
		
			Dim fieldHasCommas As Boolean = False
			Dim fieldHasQuote As Boolean = False
			
			If v.Contains(delimiter) Then fieldHasCommas = True
			If v.Contains(QUOTE) Then fieldHasQuote = True
			v = v.Replace(QUOTE, QUOTE & QUOTE)
			If fieldHasCommas Or fieldHasQuote Then
				v = QUOTE & v & QUOTE
			End If
			
			sb.Append(v)
			i = i + 1
		Next
		sb.Append(CRLF)
	Next
	Return(sb.ToString)
End Sub


Sub AddImageToLabel(lbl As Label, DirImage As String, FileImage As String)
	Dim xLblSalir As B4XView=lbl
	xLblSalir.Width=16dip
	xLblSalir.Height=16dip
	Dim imgV As ImageView
	imgV.Initialize("")
	Dim xImgV As B4XView=imgV
	xImgV.Width=xLblSalir.Width
	xImgV.Height=xLblSalir.Height

	Dim bmp As B4XBitmap = xui.LoadBitmap(DirImage, FileImage)

	FillImageToView(bmp, xImgV)
	Dim JOlblSalirJamTableView As JavaObject=lbl
	JOlblSalirJamTableView.RunMethod("setGraphic", Array(imgV))
End Sub

'Fill (without distortion) = Crops the image To make it with the same aspect ratio As the container aspect ratio And Then resizes the image.
Sub FillImageToView(bmp As B4XBitmap, ImageView As B4XView)
	Dim bmpRatio As Float = bmp.Width / bmp.Height
	Dim viewRatio As Float = ImageView.Width / ImageView.Height
	If viewRatio > bmpRatio Then
		Dim NewHeight As Int = bmp.Width / viewRatio
		bmp = bmp.Crop(0, bmp.Height / 2 - NewHeight / 2, bmp.Width, NewHeight)
	Else if viewRatio < bmpRatio Then
		Dim NewWidth As Int = bmp.Height * viewRatio
		bmp = bmp.Crop(bmp.Width / 2 - NewWidth / 2, 0, NewWidth, bmp.Height)
	End If
	Dim scale As Float = 1
    #if B4i
    scale = GetDeviceLayoutValues.NonnormalizedScale
    #End If
	ImageView.SetBitmap(bmp.Resize(ImageView.Width * scale, ImageView.Height * scale, True))
End Sub

Sub MeasureMultilineTextHeight (Font As Font, Width As Double, Text As String) As Double
	Dim jo As JavaObject = Me
	Return jo.RunMethod("MeasureMultilineTextHeight", Array(Font, Text, Width))
End Sub

#if Java
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javafx.scene.text.Font;
import javafx.scene.text.TextBoundsType;
public static double MeasureMultilineTextHeight(Font f, String text, double width) throws Exception {
  Method m = Class.forName("com.sun.javafx.scene.control.skin.Utils").getDeclaredMethod("computeTextHeight",
  Font.class, String.class, double.class, TextBoundsType.class);
  m.setAccessible(true);
  return (Double)m.invoke(null, f, text, width, TextBoundsType.LOGICAL_VERTICAL_CENTER);
  }
#End If

Sub isoGetWeekOfYear(ticks As Long) As Int
	Dim offset As Int =  0
	Dim FirstDay As Long  = DateUtils.SetDate(DateTime.GetYear(ticks), 1, 1)
	If DateTime.GetDayOfWeek(FirstDay) >5 Then ' is Thursday in Week?
		Do While(DateTime.GetDayOfWeek(FirstDay) <> 1) ' Find first Sunday
			FirstDay=DateTime.Add (FirstDay,0,0,1)
			offset=offset-1
		Loop
	Else
		Do While(DateTime.GetDayOfWeek(FirstDay) <> 1) 'Find first Sunday
			FirstDay=DateTime.Add (FirstDay,0,0,-1)
			offset=offset+1
		Loop
	End If
	Return Floor((DateTime.GetDayOfYear(ticks) + offset) / 7) +1
End Sub





Sub EnviarMensajeHttpPA(SenderAccount As String, ToAccounts As String, CCAccounts As String, CCOAccounts As String, Subject As String, Body As String) As ResumableSub

	Wait For(CargaDatosConfiguracionHttpRequestEnvioCorreoDesdeBuzonCompartido) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		Return "ERROR"
	End If
	Dim mData0 As Map=mRes.Get("mData0")
	Dim Link As String=mData0.Get("Link")
	
	Dim mData As Map
	mData.Initialize
	mData.Put("Remitente",SenderAccount)
	mData.Put("Destinatario",ToAccounts)
	mData.Put("CC",CCAccounts)
	mData.Put("CCO",CCOAccounts)
	mData.Put("Asunto",Subject)
	mData.Put("CuerpoMensaje",Body)
	

	Dim jGEn As JSONGenerator
	jGEn.Initialize(mData)
	Dim sJSON As String=jGEn.ToString

	Dim job As HttpJob
	job.Initialize("",Me)

	job.PostString(Link,sJSON)
	job.GetRequest.SetContentType("application/JSON")
	
	Wait For (job) JobDone(j As HttpJob)

	If j.Success Then
		Log("job.response.StatusCode: " & job.response.StatusCode)
		Log(j.GetString)
		Dim sRespuestaWebService As String=j.GetString
		j.Release
		Return sRespuestaWebService
	Else
		
		Dim sErrorJobResponse As String="ERROR HTTPJob " & j.ErrorMessage
		j.Release
		Return sErrorJobResponse
	End If
End Sub


Sub CargaDatosConfiguracionHttpRequestEnvioCorreoDesdeBuzonCompartido As ResumableSub
	Dim Accion As String
	Dim Error As String
	Dim mData0 As Map
	mData0.Initialize
	Dim mRes As Map
	mRes.Initialize
'	mRes.Put("Accion",Accion)
'	mRes.Put("mData0",mData0)
	Dim Comando As String="ConfiguracionHttpRequestEnvioCorreoDesdeBuzonCompartido"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Null, Me)
	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
'		jamLoadingIndicator1.Close
'		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
'		Wait For (msa) Msgbox_Result
		Accion="NOK"
		Error=$"Error de conexion servidor/query ${Comando}."$
		'mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
'			jamLoadingIndicator1.Close
'			Dim msa As Object=xui.MsgboxAsync($"No existe configuración para envio automático de email nueva tarea incidencia."$,"Aviso")
'			Wait For (msa) Msgbox_Result
			Accion="OK"
			Error=$"No existe configuración para envio automático de email nueva tarea incidencia."$
			'mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Accion="OK"
			Error=""
			'mRes.Put("Accion", Accion)
			Dim mData0 As Map=lstReg.Get(0)
			'mRes.Put("mData0", mData0)
'			Dim mData0 As Map=lstReg.Get(0)
'			Utilidades.LogStringCrearTablaDesdeMap("tblIncidenciasProveedorCuentasEmailIncidencias",mData0,"")
'			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblIncidenciasProveedorCuentasEmailIncidencias", lstReg)
		End If
	End If
	mRes.Put("Accion",Accion)
	mRes.Put("Error",Error)
	mRes.Put("mData0",mData0)
	Return mRes
End Sub


Sub FindNextTime(Times As List) As Long
	Times.Sort(True)
	For Each st As Double In Times
		If SetHours(st) > DateTime.Now Then
			Return SetHours(st)
		End If
	Next
	Return DateTime.Add(SetHours(Times.Get(0)), 0, 0, 1)
End Sub

Sub SetHours(st As Double) As Long
	Dim hours As Int = Floor(st)
	Dim minutes As Int = Round(60 * (st - hours))
	Return DateUtils.SetDateAndTime(DateTime.GetYear(DateTime.Now), _
  DateTime.GetMonth(DateTime.Now), DateTime.GetDayOfMonth(DateTime.Now), hours, minutes, 0)
End Sub

Sub CopyObject(o As Object) As Object
	Dim s As B4XSerializator
	Return s.ConvertBytesToObject(s.ConvertObjectToBytes(o))
End Sub




