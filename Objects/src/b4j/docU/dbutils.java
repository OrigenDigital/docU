package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class dbutils extends Object{
public static dbutils mostCurrent = new dbutils();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.dbutils", null);
		ba.loadHtSubs(dbutils.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.docU.dbutils", ba);
		}
	}
    public static Class<?> getObject() {
		return dbutils.class;
	}

 
public static class _dbfieldinfo{
public boolean IsInitialized;
public String FieldName;
public String DataType;
public boolean CanBeNull;
public Object DefValue;
public void Initialize() {
IsInitialized = true;
FieldName = "";
DataType = "";
CanBeNull = false;
DefValue = new Object();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _db_real = "";
public static String _db_integer = "";
public static String _db_blob = "";
public static String _db_text = "";
public static String _htmlcss = "";
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.docU.main _main = null;
public static b4j.docU.mainmenu2 _mainmenu2 = null;
public static b4j.docU.utilidades _utilidades = null;
public static b4j.docU.cmauxcorreosexpress _cmauxcorreosexpress = null;
public static b4j.docU.cmauxtxt _cmauxtxt = null;
public static b4j.docU.jrdcquery _jrdcquery = null;
public static b4j.docU.transfermode _transfermode = null;
public static b4j.docU.jamrecordformbuilder _jamrecordformbuilder = null;
public static b4j.docU.b4xcollections _b4xcollections = null;
public static b4j.docU.jamlinknavision _jamlinknavision = null;
public static b4j.docU.cmpermisos _cmpermisos = null;
public static b4j.docU.jamtableviewcamposbuilder _jamtableviewcamposbuilder = null;
public static b4j.docU.httputils2service _httputils2service = null;
public static b4j.docU.xuiviewsutils _xuiviewsutils = null;
public static boolean  _insertmaps(anywheresoftware.b4j.objects.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.List _listofmaps) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "insertmaps", true))
	 {return ((Boolean) Debug.delegate(ba, "insertmaps", new Object[] {_sql,_tablename,_listofmaps}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
boolean _res = false;
int _i1 = 0;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _col = "";
Object _value = null;
RDebugUtils.currentLine=115605504;
 //BA.debugLineNum = 115605504;BA.debugLine="Public Sub InsertMaps(SQL As SQL, TableName As Str";
RDebugUtils.currentLine=115605505;
 //BA.debugLineNum = 115605505;BA.debugLine="Dim sb, columns, values As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=115605506;
 //BA.debugLineNum = 115605506;BA.debugLine="Dim res As Boolean = False";
_res = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=115605508;
 //BA.debugLineNum = 115605508;BA.debugLine="If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = Li";
if (_listofmaps.getSize()>1 && (_listofmaps.Get((int) (0))).equals(_listofmaps.Get((int) (1)))) { 
RDebugUtils.currentLine=115605509;
 //BA.debugLineNum = 115605509;BA.debugLine="Log(\"Same Map found twice in list. Each item in";
anywheresoftware.b4a.keywords.Common.LogImpl("9115605509","Same Map found twice in list. Each item in the list should include a different map object.",0);
RDebugUtils.currentLine=115605510;
 //BA.debugLineNum = 115605510;BA.debugLine="Return res";
if (true) return _res;
 };
RDebugUtils.currentLine=115605512;
 //BA.debugLineNum = 115605512;BA.debugLine="SQL.BeginTransaction";
_sql.BeginTransaction();
RDebugUtils.currentLine=115605513;
 //BA.debugLineNum = 115605513;BA.debugLine="Try";
try {RDebugUtils.currentLine=115605514;
 //BA.debugLineNum = 115605514;BA.debugLine="For i1 = 0 To ListOfMaps.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_listofmaps.getSize()-1);
_i1 = (int) (0) ;
for (;_i1 <= limit9 ;_i1 = _i1 + step9 ) {
RDebugUtils.currentLine=115605515;
 //BA.debugLineNum = 115605515;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=115605516;
 //BA.debugLineNum = 115605516;BA.debugLine="columns.Initialize";
_columns.Initialize();
RDebugUtils.currentLine=115605517;
 //BA.debugLineNum = 115605517;BA.debugLine="values.Initialize";
_values.Initialize();
RDebugUtils.currentLine=115605518;
 //BA.debugLineNum = 115605518;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=115605519;
 //BA.debugLineNum = 115605519;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
RDebugUtils.currentLine=115605520;
 //BA.debugLineNum = 115605520;BA.debugLine="sb.Append(\"INSERT INTO [\" & TableName & \"] (\")";
_sb.Append("INSERT INTO ["+_tablename+"] (");
RDebugUtils.currentLine=115605521;
 //BA.debugLineNum = 115605521;BA.debugLine="Dim m As Map = ListOfMaps.Get(i1)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_listofmaps.Get(_i1)));
RDebugUtils.currentLine=115605522;
 //BA.debugLineNum = 115605522;BA.debugLine="For Each col As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group17 = _m.Keys();
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_col = BA.ObjectToString(group17.Get(index17));
RDebugUtils.currentLine=115605523;
 //BA.debugLineNum = 115605523;BA.debugLine="Dim value As Object = m.Get(col)";
_value = _m.Get((Object)(_col));
RDebugUtils.currentLine=115605524;
 //BA.debugLineNum = 115605524;BA.debugLine="If listOfValues.Size > 0 Then";
if (_listofvalues.getSize()>0) { 
RDebugUtils.currentLine=115605525;
 //BA.debugLineNum = 115605525;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
RDebugUtils.currentLine=115605526;
 //BA.debugLineNum = 115605526;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
RDebugUtils.currentLine=115605528;
 //BA.debugLineNum = 115605528;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(_escapefield(_col));
RDebugUtils.currentLine=115605529;
 //BA.debugLineNum = 115605529;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
RDebugUtils.currentLine=115605530;
 //BA.debugLineNum = 115605530;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add(_value);
 }
};
RDebugUtils.currentLine=115605532;
 //BA.debugLineNum = 115605532;BA.debugLine="sb.Append(columns.ToString).Append(\") VALUES (\"";
_sb.Append(_columns.ToString()).Append(") VALUES (").Append(_values.ToString()).Append(")");
RDebugUtils.currentLine=115605534;
 //BA.debugLineNum = 115605534;BA.debugLine="If i1 = 0 Then Log(\"InsertMaps (first query out";
if (_i1==0) { 
anywheresoftware.b4a.keywords.Common.LogImpl("9115605534","InsertMaps (first query out of "+BA.NumberToString(_listofmaps.getSize())+"): "+_sb.ToString(),0);};
RDebugUtils.currentLine=115605536;
 //BA.debugLineNum = 115605536;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, listOfValues)";
_sql.ExecNonQuery2(_sb.ToString(),_listofvalues);
 }
};
RDebugUtils.currentLine=115605538;
 //BA.debugLineNum = 115605538;BA.debugLine="SQL.TransactionSuccessful";
_sql.TransactionSuccessful();
RDebugUtils.currentLine=115605539;
 //BA.debugLineNum = 115605539;BA.debugLine="res = True";
_res = anywheresoftware.b4a.keywords.Common.True;
 } 
       catch (Exception e34) {
			ba.setLastException(e34);RDebugUtils.currentLine=115605541;
 //BA.debugLineNum = 115605541;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("9115605541",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
RDebugUtils.currentLine=115605543;
 //BA.debugLineNum = 115605543;BA.debugLine="SQL.Rollback";
_sql.Rollback();
 };
RDebugUtils.currentLine=115605549;
 //BA.debugLineNum = 115605549;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=115605550;
 //BA.debugLineNum = 115605550;BA.debugLine="End Sub";
return false;
}
public static anywheresoftware.b4a.objects.collections.List  _executememorytable(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs,int _limit) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executememorytable", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "executememorytable", new Object[] {_sql,_query,_stringargs,_limit}));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _values = null;
int _col = 0;
RDebugUtils.currentLine=115671040;
 //BA.debugLineNum = 115671040;BA.debugLine="Public Sub ExecuteMemoryTable(SQL As SQL, Query As";
RDebugUtils.currentLine=115671041;
 //BA.debugLineNum = 115671041;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=115671042;
 //BA.debugLineNum = 115671042;BA.debugLine="If StringArgs = Null Then";
if (_stringargs== null) { 
RDebugUtils.currentLine=115671043;
 //BA.debugLineNum = 115671043;BA.debugLine="Dim StringArgs(0) As String";
_stringargs = new String[(int) (0)];
java.util.Arrays.fill(_stringargs,"");
 };
RDebugUtils.currentLine=115671045;
 //BA.debugLineNum = 115671045;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = _sql.ExecQuery2(_query,anywheresoftware.b4a.keywords.Common.ArrayToList(_stringargs));
RDebugUtils.currentLine=115671047;
 //BA.debugLineNum = 115671047;BA.debugLine="Log(\"ExecuteMemoryTable: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("9115671047","ExecuteMemoryTable: "+_query,0);
RDebugUtils.currentLine=115671049;
 //BA.debugLineNum = 115671049;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=115671050;
 //BA.debugLineNum = 115671050;BA.debugLine="table.Initialize";
_table.Initialize();
RDebugUtils.currentLine=115671051;
 //BA.debugLineNum = 115671051;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=115671052;
 //BA.debugLineNum = 115671052;BA.debugLine="Dim values(cur.ColumnCount) As String";
_values = new String[_cur.getColumnCount()];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=115671053;
 //BA.debugLineNum = 115671053;BA.debugLine="For col = 0 To cur.ColumnCount - 1";
{
final int step11 = 1;
final int limit11 = (int) (_cur.getColumnCount()-1);
_col = (int) (0) ;
for (;_col <= limit11 ;_col = _col + step11 ) {
RDebugUtils.currentLine=115671054;
 //BA.debugLineNum = 115671054;BA.debugLine="values(col) = cur.GetString2(col)";
_values[_col] = _cur.GetString2(_col);
 }
};
RDebugUtils.currentLine=115671056;
 //BA.debugLineNum = 115671056;BA.debugLine="table.Add(values)";
_table.Add((Object)(_values));
RDebugUtils.currentLine=115671057;
 //BA.debugLineNum = 115671057;BA.debugLine="If Limit > 0 And table.Size >= Limit Then Exit";
if (_limit>0 && _table.getSize()>=_limit) { 
if (true) break;};
 }
;
RDebugUtils.currentLine=115671059;
 //BA.debugLineNum = 115671059;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=115671060;
 //BA.debugLineNum = 115671060;BA.debugLine="Return table";
if (true) return _table;
RDebugUtils.currentLine=115671061;
 //BA.debugLineNum = 115671061;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _executelist(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs,int _limit) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executelist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "executelist", new Object[] {_sql,_query,_stringargs,_limit}));}
anywheresoftware.b4a.objects.collections.List _table = null;
anywheresoftware.b4a.objects.collections.List _res = null;
String[] _cols = null;
RDebugUtils.currentLine=115933184;
 //BA.debugLineNum = 115933184;BA.debugLine="Public Sub ExecuteList(SQL As SQL, Query As String";
RDebugUtils.currentLine=115933185;
 //BA.debugLineNum = 115933185;BA.debugLine="Dim Table As List = ExecuteMemoryTable(SQL, Query";
_table = new anywheresoftware.b4a.objects.collections.List();
_table = _executememorytable(_sql,_query,_stringargs,_limit);
RDebugUtils.currentLine=115933186;
 //BA.debugLineNum = 115933186;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=115933187;
 //BA.debugLineNum = 115933187;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=115933188;
 //BA.debugLineNum = 115933188;BA.debugLine="For Each Cols() As String In Table";
{
final anywheresoftware.b4a.BA.IterableList group4 = _table;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_cols = (String[])(group4.Get(index4));
RDebugUtils.currentLine=115933189;
 //BA.debugLineNum = 115933189;BA.debugLine="res.Add(Cols(0))";
_res.Add((Object)(_cols[(int) (0)]));
 }
};
RDebugUtils.currentLine=115933191;
 //BA.debugLineNum = 115933191;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=115933192;
 //BA.debugLineNum = 115933192;BA.debugLine="End Sub";
return null;
}
public static String  _droptable(anywheresoftware.b4j.objects.SQL _sql,String _tablename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "droptable", true))
	 {return ((String) Debug.delegate(ba, "droptable", new Object[] {_sql,_tablename}));}
String _query = "";
RDebugUtils.currentLine=115539968;
 //BA.debugLineNum = 115539968;BA.debugLine="Public Sub DropTable(SQL As SQL, TableName As Stri";
RDebugUtils.currentLine=115539969;
 //BA.debugLineNum = 115539969;BA.debugLine="Dim query As String = \"DROP TABLE IF EXISTS\" & Es";
_query = "DROP TABLE IF EXISTS"+_escapefield(_tablename);
RDebugUtils.currentLine=115539971;
 //BA.debugLineNum = 115539971;BA.debugLine="Log(\"DropTable: \" & query)";
anywheresoftware.b4a.keywords.Common.LogImpl("9115539971","DropTable: "+_query,0);
RDebugUtils.currentLine=115539973;
 //BA.debugLineNum = 115539973;BA.debugLine="SQL.ExecNonQuery(query)";
_sql.ExecNonQuery(_query);
RDebugUtils.currentLine=115539974;
 //BA.debugLineNum = 115539974;BA.debugLine="End Sub";
return "";
}
public static String  _createtable(anywheresoftware.b4j.objects.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _fieldsandtypes,String _primarykey) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "createtable", true))
	 {return ((String) Debug.delegate(ba, "createtable", new Object[] {_sql,_tablename,_fieldsandtypes,_primarykey}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
String _field = "";
String _ftype = "";
String _query = "";
RDebugUtils.currentLine=115474432;
 //BA.debugLineNum = 115474432;BA.debugLine="Public Sub CreateTable(SQL As SQL, TableName As St";
RDebugUtils.currentLine=115474433;
 //BA.debugLineNum = 115474433;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=115474434;
 //BA.debugLineNum = 115474434;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=115474435;
 //BA.debugLineNum = 115474435;BA.debugLine="sb.Append(\"(\")";
_sb.Append("(");
RDebugUtils.currentLine=115474436;
 //BA.debugLineNum = 115474436;BA.debugLine="For i = 0 To FieldsAndTypes.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_fieldsandtypes.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=115474437;
 //BA.debugLineNum = 115474437;BA.debugLine="Dim field, ftype As String";
_field = "";
_ftype = "";
RDebugUtils.currentLine=115474438;
 //BA.debugLineNum = 115474438;BA.debugLine="field = FieldsAndTypes.GetKeyAt(i)";
_field = BA.ObjectToString(_fieldsandtypes.GetKeyAt(_i));
RDebugUtils.currentLine=115474439;
 //BA.debugLineNum = 115474439;BA.debugLine="ftype = FieldsAndTypes.GetValueAt(i)";
_ftype = BA.ObjectToString(_fieldsandtypes.GetValueAt(_i));
RDebugUtils.currentLine=115474440;
 //BA.debugLineNum = 115474440;BA.debugLine="If i > 0 Then sb.Append(\", \")";
if (_i>0) { 
_sb.Append(", ");};
RDebugUtils.currentLine=115474441;
 //BA.debugLineNum = 115474441;BA.debugLine="sb.Append(EscapeField(field)).Append(\" \").Append";
_sb.Append(_escapefield(_field)).Append(" ").Append(_ftype);
RDebugUtils.currentLine=115474442;
 //BA.debugLineNum = 115474442;BA.debugLine="If field = PrimaryKey Then sb.Append(\" PRIMARY K";
if ((_field).equals(_primarykey)) { 
_sb.Append(" PRIMARY KEY");};
 }
};
RDebugUtils.currentLine=115474444;
 //BA.debugLineNum = 115474444;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=115474445;
 //BA.debugLineNum = 115474445;BA.debugLine="Dim query As String = \"CREATE TABLE IF NOT EXISTS";
_query = "CREATE TABLE IF NOT EXISTS "+_escapefield(_tablename)+" "+_sb.ToString();
RDebugUtils.currentLine=115474447;
 //BA.debugLineNum = 115474447;BA.debugLine="Log(\"CreateTable: \" & query)";
anywheresoftware.b4a.keywords.Common.LogImpl("9115474447","CreateTable: "+_query,0);
RDebugUtils.currentLine=115474449;
 //BA.debugLineNum = 115474449;BA.debugLine="SQL.ExecNonQuery(query)";
_sql.ExecNonQuery(_query);
RDebugUtils.currentLine=115474450;
 //BA.debugLineNum = 115474450;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _executemap(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executemap", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "executemap", new Object[] {_sql,_query,_stringargs}));}
anywheresoftware.b4a.objects.collections.Map _res = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cur = null;
int _i = 0;
RDebugUtils.currentLine=115736576;
 //BA.debugLineNum = 115736576;BA.debugLine="Public Sub ExecuteMap(SQL As SQL, Query As String,";
RDebugUtils.currentLine=115736577;
 //BA.debugLineNum = 115736577;BA.debugLine="Dim res As Map";
_res = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=115736578;
 //BA.debugLineNum = 115736578;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=115736579;
 //BA.debugLineNum = 115736579;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=115736580;
 //BA.debugLineNum = 115736580;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = _sql.ExecQuery2(_query,anywheresoftware.b4a.keywords.Common.ArrayToList(_stringargs));
 }else {
RDebugUtils.currentLine=115736582;
 //BA.debugLineNum = 115736582;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = _sql.ExecQuery(_query);
 };
RDebugUtils.currentLine=115736585;
 //BA.debugLineNum = 115736585;BA.debugLine="Log(\"ExecuteMap: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("9115736585","ExecuteMap: "+_query,0);
RDebugUtils.currentLine=115736587;
 //BA.debugLineNum = 115736587;BA.debugLine="If cur.NextRow = False Then";
if (_cur.NextRow()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=115736589;
 //BA.debugLineNum = 115736589;BA.debugLine="Log(\"No records found.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("9115736589","No records found.",0);
RDebugUtils.currentLine=115736591;
 //BA.debugLineNum = 115736591;BA.debugLine="Return res";
if (true) return _res;
 };
RDebugUtils.currentLine=115736593;
 //BA.debugLineNum = 115736593;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=115736594;
 //BA.debugLineNum = 115736594;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step14 = 1;
final int limit14 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=115736595;
 //BA.debugLineNum = 115736595;BA.debugLine="res.Put(cur.GetColumnName(i).ToLowerCase, cur.Ge";
_res.Put((Object)(_cur.GetColumnName(_i).toLowerCase()),(Object)(_cur.GetString2(_i)));
 }
};
RDebugUtils.currentLine=115736597;
 //BA.debugLineNum = 115736597;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=115736598;
 //BA.debugLineNum = 115736598;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=115736599;
 //BA.debugLineNum = 115736599;BA.debugLine="End Sub";
return null;
}
public static String  _copydbfromassets(String _filename,String _appname) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "copydbfromassets", true))
	 {return ((String) Debug.delegate(ba, "copydbfromassets", new Object[] {_filename,_appname}));}
String _targetdir = "";
RDebugUtils.currentLine=115343360;
 //BA.debugLineNum = 115343360;BA.debugLine="Public Sub CopyDBFromAssets (FileName As String, A";
RDebugUtils.currentLine=115343361;
 //BA.debugLineNum = 115343361;BA.debugLine="Dim TargetDir As String = GetDBFolder(AppName)";
_targetdir = _getdbfolder(_appname);
RDebugUtils.currentLine=115343362;
 //BA.debugLineNum = 115343362;BA.debugLine="If File.Exists(TargetDir, FileName) = False Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_targetdir,_filename)==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=115343363;
 //BA.debugLineNum = 115343363;BA.debugLine="File.Copy(File.DirAssets, FileName, TargetDir, F";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_filename,_targetdir,_filename);
 };
RDebugUtils.currentLine=115343365;
 //BA.debugLineNum = 115343365;BA.debugLine="Return TargetDir";
if (true) return _targetdir;
RDebugUtils.currentLine=115343366;
 //BA.debugLineNum = 115343366;BA.debugLine="End Sub";
return "";
}
public static String  _getdbfolder(String _appname) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "getdbfolder", true))
	 {return ((String) Debug.delegate(ba, "getdbfolder", new Object[] {_appname}));}
RDebugUtils.currentLine=115277824;
 //BA.debugLineNum = 115277824;BA.debugLine="Public Sub GetDBFolder (AppName As String) As Stri";
RDebugUtils.currentLine=115277825;
 //BA.debugLineNum = 115277825;BA.debugLine="Return File.DirData(AppName)";
if (true) return anywheresoftware.b4a.keywords.Common.File.DirData(_appname);
RDebugUtils.currentLine=115277826;
 //BA.debugLineNum = 115277826;BA.debugLine="End Sub";
return "";
}
public static String  _escapefield(String _f) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "escapefield", true))
	 {return ((String) Debug.delegate(ba, "escapefield", new Object[] {_f}));}
RDebugUtils.currentLine=115408896;
 //BA.debugLineNum = 115408896;BA.debugLine="Private Sub EscapeField(f As String) As String";
RDebugUtils.currentLine=115408897;
 //BA.debugLineNum = 115408897;BA.debugLine="Return \"[\" & f & \"]\"";
if (true) return "["+_f+"]";
RDebugUtils.currentLine=115408898;
 //BA.debugLineNum = 115408898;BA.debugLine="End Sub";
return "";
}
public static String  _deleterecord(anywheresoftware.b4j.objects.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "deleterecord", true))
	 {return ((String) Debug.delegate(ba, "deleterecord", new Object[] {_sql,_tablename,_wherefieldequals}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _args = null;
String _col = "";
RDebugUtils.currentLine=116391936;
 //BA.debugLineNum = 116391936;BA.debugLine="Public Sub DeleteRecord(SQL As SQL, TableName As S";
RDebugUtils.currentLine=116391937;
 //BA.debugLineNum = 116391937;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=116391938;
 //BA.debugLineNum = 116391938;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=116391939;
 //BA.debugLineNum = 116391939;BA.debugLine="sb.Append(\"DELETE FROM \" & EscapeField(TableName)";
_sb.Append("DELETE FROM "+_escapefield(_tablename)+" WHERE ");
RDebugUtils.currentLine=116391940;
 //BA.debugLineNum = 116391940;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
if (_wherefieldequals.getSize()==0) { 
RDebugUtils.currentLine=116391941;
 //BA.debugLineNum = 116391941;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("9116391941","WhereFieldEquals map empty!",0);
RDebugUtils.currentLine=116391942;
 //BA.debugLineNum = 116391942;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=116391944;
 //BA.debugLineNum = 116391944;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=116391945;
 //BA.debugLineNum = 116391945;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=116391946;
 //BA.debugLineNum = 116391946;BA.debugLine="For Each col As String In WhereFieldEquals.Keys";
{
final anywheresoftware.b4a.BA.IterableList group10 = _wherefieldequals.Keys();
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_col = BA.ObjectToString(group10.Get(index10));
RDebugUtils.currentLine=116391947;
 //BA.debugLineNum = 116391947;BA.debugLine="If args.Size > 0 Then sb.Append(\" AND \")";
if (_args.getSize()>0) { 
_sb.Append(" AND ");};
RDebugUtils.currentLine=116391948;
 //BA.debugLineNum = 116391948;BA.debugLine="sb.Append(EscapeField(col)).Append(\" = ?\")";
_sb.Append(_escapefield(_col)).Append(" = ?");
RDebugUtils.currentLine=116391949;
 //BA.debugLineNum = 116391949;BA.debugLine="args.Add(WhereFieldEquals.Get(col))";
_args.Add(_wherefieldequals.Get((Object)(_col)));
 }
};
RDebugUtils.currentLine=116391952;
 //BA.debugLineNum = 116391952;BA.debugLine="Log(\"DeleteRecord: \" & sb.ToString)";
anywheresoftware.b4a.keywords.Common.LogImpl("9116391952","DeleteRecord: "+_sb.ToString(),0);
RDebugUtils.currentLine=116391954;
 //BA.debugLineNum = 116391954;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
_sql.ExecNonQuery2(_sb.ToString(),_args);
RDebugUtils.currentLine=116391955;
 //BA.debugLineNum = 116391955;BA.debugLine="End Sub";
return "";
}
public static String  _executehtml(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs,int _limit,boolean _clickable) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executehtml", true))
	 {return ((String) Debug.delegate(ba, "executehtml", new Object[] {_sql,_query,_stringargs,_limit,_clickable}));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _row = 0;
RDebugUtils.currentLine=116064256;
 //BA.debugLineNum = 116064256;BA.debugLine="Public Sub ExecuteHtml(SQL As SQL, Query As String";
RDebugUtils.currentLine=116064257;
 //BA.debugLineNum = 116064257;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=116064258;
 //BA.debugLineNum = 116064258;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=116064259;
 //BA.debugLineNum = 116064259;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = _sql.ExecQuery2(_query,anywheresoftware.b4a.keywords.Common.ArrayToList(_stringargs));
 }else {
RDebugUtils.currentLine=116064261;
 //BA.debugLineNum = 116064261;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = _sql.ExecQuery(_query);
 };
RDebugUtils.currentLine=116064264;
 //BA.debugLineNum = 116064264;BA.debugLine="Log(\"ExecuteHtml: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("9116064264","ExecuteHtml: "+_query,0);
RDebugUtils.currentLine=116064267;
 //BA.debugLineNum = 116064267;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=116064268;
 //BA.debugLineNum = 116064268;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=116064269;
 //BA.debugLineNum = 116064269;BA.debugLine="sb.Append(\"<html><body>\").Append(CRLF)";
_sb.Append("<html><body>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=116064270;
 //BA.debugLineNum = 116064270;BA.debugLine="sb.Append(\"<style type='text/css'>\").Append(HtmlC";
_sb.Append("<style type='text/css'>").Append(_htmlcss).Append("</style>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=116064271;
 //BA.debugLineNum = 116064271;BA.debugLine="sb.Append(\"<table><thead><tr>\").Append(CRLF)";
_sb.Append("<table><thead><tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=116064272;
 //BA.debugLineNum = 116064272;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step13 = 1;
final int limit13 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=116064273;
 //BA.debugLineNum = 116064273;BA.debugLine="sb.Append(\"<th>\").Append(cur.GetColumnName(i)).A";
_sb.Append("<th>").Append(_cur.GetColumnName(_i)).Append("</th>");
 }
};
RDebugUtils.currentLine=116064275;
 //BA.debugLineNum = 116064275;BA.debugLine="sb.Append(\"</thead>\")";
_sb.Append("</thead>");
RDebugUtils.currentLine=116064285;
 //BA.debugLineNum = 116064285;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=116064286;
 //BA.debugLineNum = 116064286;BA.debugLine="Dim row As Int";
_row = 0;
RDebugUtils.currentLine=116064287;
 //BA.debugLineNum = 116064287;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=116064288;
 //BA.debugLineNum = 116064288;BA.debugLine="If row Mod 2 = 0 Then";
if (_row%2==0) { 
RDebugUtils.currentLine=116064289;
 //BA.debugLineNum = 116064289;BA.debugLine="sb.Append(\"<tr>\")";
_sb.Append("<tr>");
 }else {
RDebugUtils.currentLine=116064291;
 //BA.debugLineNum = 116064291;BA.debugLine="sb.Append(\"<tr class='odd'>\")";
_sb.Append("<tr class='odd'>");
 };
RDebugUtils.currentLine=116064293;
 //BA.debugLineNum = 116064293;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step25 = 1;
final int limit25 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=116064294;
 //BA.debugLineNum = 116064294;BA.debugLine="sb.Append(\"<td>\")";
_sb.Append("<td>");
RDebugUtils.currentLine=116064295;
 //BA.debugLineNum = 116064295;BA.debugLine="If Clickable Then";
if (_clickable) { 
RDebugUtils.currentLine=116064296;
 //BA.debugLineNum = 116064296;BA.debugLine="sb.Append(\"<a href='http://\").Append(i).Append";
_sb.Append("<a href='http://").Append(BA.NumberToString(_i)).Append(".");
RDebugUtils.currentLine=116064297;
 //BA.debugLineNum = 116064297;BA.debugLine="sb.Append(row)";
_sb.Append(BA.NumberToString(_row));
RDebugUtils.currentLine=116064298;
 //BA.debugLineNum = 116064298;BA.debugLine="sb.Append(\".stub'>\").Append(cur.GetString2(i))";
_sb.Append(".stub'>").Append(_cur.GetString2(_i)).Append("</a>");
 }else {
RDebugUtils.currentLine=116064300;
 //BA.debugLineNum = 116064300;BA.debugLine="sb.Append(cur.GetString2(i))";
_sb.Append(_cur.GetString2(_i));
 };
RDebugUtils.currentLine=116064302;
 //BA.debugLineNum = 116064302;BA.debugLine="sb.Append(\"</td>\")";
_sb.Append("</td>");
 }
};
RDebugUtils.currentLine=116064304;
 //BA.debugLineNum = 116064304;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=116064305;
 //BA.debugLineNum = 116064305;BA.debugLine="row = row + 1";
_row = (int) (_row+1);
 }
;
RDebugUtils.currentLine=116064307;
 //BA.debugLineNum = 116064307;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=116064308;
 //BA.debugLineNum = 116064308;BA.debugLine="sb.Append(\"</table></body></html>\")";
_sb.Append("</table></body></html>");
RDebugUtils.currentLine=116064309;
 //BA.debugLineNum = 116064309;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=116064310;
 //BA.debugLineNum = 116064310;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _executejson(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.collections.List _dbtypes) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executejson", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "executejson", new Object[] {_sql,_query,_stringargs,_limit,_dbtypes}));}
anywheresoftware.b4a.objects.collections.List _table = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _root = null;
RDebugUtils.currentLine=115998720;
 //BA.debugLineNum = 115998720;BA.debugLine="Public Sub ExecuteJSON (SQL As SQL, Query As Strin";
RDebugUtils.currentLine=115998721;
 //BA.debugLineNum = 115998721;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=115998722;
 //BA.debugLineNum = 115998722;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=115998723;
 //BA.debugLineNum = 115998723;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=115998724;
 //BA.debugLineNum = 115998724;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = _sql.ExecQuery2(_query,anywheresoftware.b4a.keywords.Common.ArrayToList(_stringargs));
 }else {
RDebugUtils.currentLine=115998726;
 //BA.debugLineNum = 115998726;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = _sql.ExecQuery(_query);
 };
RDebugUtils.currentLine=115998729;
 //BA.debugLineNum = 115998729;BA.debugLine="Log(\"ExecuteJSON: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("9115998729","ExecuteJSON: "+_query,0);
RDebugUtils.currentLine=115998731;
 //BA.debugLineNum = 115998731;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=115998732;
 //BA.debugLineNum = 115998732;BA.debugLine="table.Initialize";
_table.Initialize();
RDebugUtils.currentLine=115998733;
 //BA.debugLineNum = 115998733;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=115998734;
 //BA.debugLineNum = 115998734;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=115998735;
 //BA.debugLineNum = 115998735;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=115998736;
 //BA.debugLineNum = 115998736;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step14 = 1;
final int limit14 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=115998737;
 //BA.debugLineNum = 115998737;BA.debugLine="Select DBTypes.Get(i)";
switch (BA.switchObjectToInt(_dbtypes.Get(_i),(Object)(_db_text),(Object)(_db_integer),(Object)(_db_real))) {
case 0: {
RDebugUtils.currentLine=115998739;
 //BA.debugLineNum = 115998739;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetString2(i)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetString2(_i)));
 break; }
case 1: {
RDebugUtils.currentLine=115998741;
 //BA.debugLineNum = 115998741;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetLong2(i))";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetLong2(_i)));
 break; }
case 2: {
RDebugUtils.currentLine=115998743;
 //BA.debugLineNum = 115998743;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetDouble2(i)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetDouble2(_i)));
 break; }
default: {
RDebugUtils.currentLine=115998745;
 //BA.debugLineNum = 115998745;BA.debugLine="Log(\"Invalid type: \" & DBTypes.Get(i))";
anywheresoftware.b4a.keywords.Common.LogImpl("9115998745","Invalid type: "+BA.ObjectToString(_dbtypes.Get(_i)),0);
 break; }
}
;
 }
};
RDebugUtils.currentLine=115998748;
 //BA.debugLineNum = 115998748;BA.debugLine="table.Add(m)";
_table.Add((Object)(_m.getObject()));
RDebugUtils.currentLine=115998749;
 //BA.debugLineNum = 115998749;BA.debugLine="If Limit > 0 And table.Size >= Limit Then Exit";
if (_limit>0 && _table.getSize()>=_limit) { 
if (true) break;};
 }
;
RDebugUtils.currentLine=115998751;
 //BA.debugLineNum = 115998751;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=115998752;
 //BA.debugLineNum = 115998752;BA.debugLine="Dim root As Map";
_root = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=115998753;
 //BA.debugLineNum = 115998753;BA.debugLine="root.Initialize";
_root.Initialize();
RDebugUtils.currentLine=115998754;
 //BA.debugLineNum = 115998754;BA.debugLine="root.Put(\"root\", table)";
_root.Put((Object)("root"),(Object)(_table.getObject()));
RDebugUtils.currentLine=115998755;
 //BA.debugLineNum = 115998755;BA.debugLine="Return root";
if (true) return _root;
RDebugUtils.currentLine=115998756;
 //BA.debugLineNum = 115998756;BA.debugLine="End Sub";
return null;
}
public static String  _executelist2(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.collections.List _list) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executelist2", true))
	 {return ((String) Debug.delegate(ba, "executelist2", new Object[] {_sql,_query,_stringargs,_limit,_list}));}
RDebugUtils.currentLine=115867648;
 //BA.debugLineNum = 115867648;BA.debugLine="Public Sub ExecuteList2(SQL As SQL, Query As Strin";
RDebugUtils.currentLine=115867649;
 //BA.debugLineNum = 115867649;BA.debugLine="List.Clear";
_list.Clear();
RDebugUtils.currentLine=115867650;
 //BA.debugLineNum = 115867650;BA.debugLine="List.AddAll(ExecuteList(SQL, Query, StringArgs, L";
_list.AddAll(_executelist(_sql,_query,_stringargs,_limit));
RDebugUtils.currentLine=115867651;
 //BA.debugLineNum = 115867651;BA.debugLine="End Sub";
return "";
}
public static String  _executetableview(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4j.objects.TableViewWrapper _tableview1) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executetableview", true))
	 {return ((String) Debug.delegate(ba, "executetableview", new Object[] {_sql,_query,_stringargs,_limit,_tableview1}));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.objects.collections.List _cols = null;
int _i = 0;
String[] _values = null;
int _col = 0;
RDebugUtils.currentLine=115802112;
 //BA.debugLineNum = 115802112;BA.debugLine="Public Sub ExecuteTableView(SQL As SQL, Query As S";
RDebugUtils.currentLine=115802114;
 //BA.debugLineNum = 115802114;BA.debugLine="TableView1.Items.Clear";
_tableview1.getItems().Clear();
RDebugUtils.currentLine=115802115;
 //BA.debugLineNum = 115802115;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=115802116;
 //BA.debugLineNum = 115802116;BA.debugLine="If StringArgs = Null Then";
if (_stringargs== null) { 
RDebugUtils.currentLine=115802117;
 //BA.debugLineNum = 115802117;BA.debugLine="Dim StringArgs(0) As String";
_stringargs = new String[(int) (0)];
java.util.Arrays.fill(_stringargs,"");
 };
RDebugUtils.currentLine=115802119;
 //BA.debugLineNum = 115802119;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = _sql.ExecQuery2(_query,anywheresoftware.b4a.keywords.Common.ArrayToList(_stringargs));
RDebugUtils.currentLine=115802120;
 //BA.debugLineNum = 115802120;BA.debugLine="Dim cols As List";
_cols = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=115802121;
 //BA.debugLineNum = 115802121;BA.debugLine="cols.Initialize";
_cols.Initialize();
RDebugUtils.currentLine=115802122;
 //BA.debugLineNum = 115802122;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step9 = 1;
final int limit9 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=115802123;
 //BA.debugLineNum = 115802123;BA.debugLine="cols.Add(cur.GetColumnName(i))";
_cols.Add((Object)(_cur.GetColumnName(_i)));
 }
};
RDebugUtils.currentLine=115802125;
 //BA.debugLineNum = 115802125;BA.debugLine="TableView1.SetColumns(cols)";
_tableview1.SetColumns(_cols);
RDebugUtils.currentLine=115802126;
 //BA.debugLineNum = 115802126;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=115802127;
 //BA.debugLineNum = 115802127;BA.debugLine="Dim values(cur.ColumnCount) As String";
_values = new String[_cur.getColumnCount()];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=115802128;
 //BA.debugLineNum = 115802128;BA.debugLine="For col = 0 To cur.ColumnCount - 1";
{
final int step15 = 1;
final int limit15 = (int) (_cur.getColumnCount()-1);
_col = (int) (0) ;
for (;_col <= limit15 ;_col = _col + step15 ) {
RDebugUtils.currentLine=115802129;
 //BA.debugLineNum = 115802129;BA.debugLine="values(col) = cur.GetString2(col)";
_values[_col] = _cur.GetString2(_col);
 }
};
RDebugUtils.currentLine=115802131;
 //BA.debugLineNum = 115802131;BA.debugLine="TableView1.Items.Add(values)";
_tableview1.getItems().Add((Object)(_values));
RDebugUtils.currentLine=115802132;
 //BA.debugLineNum = 115802132;BA.debugLine="If Limit > 0 And TableView1.Items.Size >= Limit";
if (_limit>0 && _tableview1.getItems().getSize()>=_limit) { 
if (true) break;};
 }
;
RDebugUtils.currentLine=115802134;
 //BA.debugLineNum = 115802134;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=115802135;
 //BA.debugLineNum = 115802135;BA.debugLine="End Sub";
return "";
}
public static int  _getdbversion(anywheresoftware.b4j.objects.SQL _sql) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "getdbversion", true))
	 {return ((Integer) Debug.delegate(ba, "getdbversion", new Object[] {_sql}));}
int _version = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=116129792;
 //BA.debugLineNum = 116129792;BA.debugLine="Public Sub GetDBVersion (SQL As SQL) As Int";
RDebugUtils.currentLine=116129793;
 //BA.debugLineNum = 116129793;BA.debugLine="Dim version As Int";
_version = 0;
RDebugUtils.currentLine=116129794;
 //BA.debugLineNum = 116129794;BA.debugLine="If TableExists(SQL, \"DBVersion\") Then";
if (_tableexists(_sql,"DBVersion")) { 
RDebugUtils.currentLine=116129795;
 //BA.debugLineNum = 116129795;BA.debugLine="version = SQL.ExecQuerySingleResult(\"SELECT vers";
_version = (int)(Double.parseDouble(_sql.ExecQuerySingleResult("SELECT version FROM DBVersion")));
 }else {
RDebugUtils.currentLine=116129801;
 //BA.debugLineNum = 116129801;BA.debugLine="Dim m As Map = CreateMap(\"version\": DB_INTEGER)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("version"),(Object)(_db_integer)});
RDebugUtils.currentLine=116129802;
 //BA.debugLineNum = 116129802;BA.debugLine="CreateTable(SQL, \"DBVersion\", m, \"version\")";
_createtable(_sql,"DBVersion",_m,"version");
RDebugUtils.currentLine=116129804;
 //BA.debugLineNum = 116129804;BA.debugLine="SQL.ExecNonQuery(\"INSERT INTO DBVersion VALUES (";
_sql.ExecNonQuery("INSERT INTO DBVersion VALUES (1)");
RDebugUtils.currentLine=116129805;
 //BA.debugLineNum = 116129805;BA.debugLine="version = 1";
_version = (int) (1);
 };
RDebugUtils.currentLine=116129807;
 //BA.debugLineNum = 116129807;BA.debugLine="Return version";
if (true) return _version;
RDebugUtils.currentLine=116129808;
 //BA.debugLineNum = 116129808;BA.debugLine="End Sub";
return 0;
}
public static boolean  _tableexists(anywheresoftware.b4j.objects.SQL _sql,String _tablename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "tableexists", true))
	 {return ((Boolean) Debug.delegate(ba, "tableexists", new Object[] {_sql,_tablename}));}
int _count = 0;
RDebugUtils.currentLine=116457472;
 //BA.debugLineNum = 116457472;BA.debugLine="Public Sub TableExists(SQL As SQL, TableName As St";
RDebugUtils.currentLine=116457473;
 //BA.debugLineNum = 116457473;BA.debugLine="Dim count As Int = SQL.ExecQuerySingleResult2(\"SE";
_count = (int)(Double.parseDouble(_sql.ExecQuerySingleResult2("SELECT count(name) FROM sqlite_master WHERE type='table' AND name=? COLLATE NOCASE",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_tablename}))));
RDebugUtils.currentLine=116457474;
 //BA.debugLineNum = 116457474;BA.debugLine="Return count > 0";
if (true) return _count>0;
RDebugUtils.currentLine=116457475;
 //BA.debugLineNum = 116457475;BA.debugLine="End Sub";
return false;
}
public static anywheresoftware.b4a.objects.collections.List  _getfieldsinfo(anywheresoftware.b4j.objects.SQL _db,String _tablename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "getfieldsinfo", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getfieldsinfo", new Object[] {_db,_tablename}));}
anywheresoftware.b4a.objects.collections.List _lstfieldsinfo = null;
anywheresoftware.b4a.objects.collections.List _fieldslist = null;
String[] _values = null;
b4j.docU.dbutils._dbfieldinfo _fieldinfo = null;
RDebugUtils.currentLine=116588544;
 //BA.debugLineNum = 116588544;BA.debugLine="Public Sub GetFieldsInfo(DB As SQL, TableName As S";
RDebugUtils.currentLine=116588545;
 //BA.debugLineNum = 116588545;BA.debugLine="Dim lstFieldsInfo As List";
_lstfieldsinfo = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=116588546;
 //BA.debugLineNum = 116588546;BA.debugLine="lstFieldsInfo.Initialize";
_lstfieldsinfo.Initialize();
RDebugUtils.currentLine=116588547;
 //BA.debugLineNum = 116588547;BA.debugLine="Dim FieldsList As List = ExecuteMemoryTable(DB, \"";
_fieldslist = new anywheresoftware.b4a.objects.collections.List();
_fieldslist = _executememorytable(_db,"PRAGMA table_info ('"+_tablename+"')",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0));
RDebugUtils.currentLine=116588548;
 //BA.debugLineNum = 116588548;BA.debugLine="For Each values() As String In FieldsList";
{
final anywheresoftware.b4a.BA.IterableList group4 = _fieldslist;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_values = (String[])(group4.Get(index4));
RDebugUtils.currentLine=116588549;
 //BA.debugLineNum = 116588549;BA.debugLine="Dim FieldInfo As DBFieldInfo";
_fieldinfo = new b4j.docU.dbutils._dbfieldinfo();
RDebugUtils.currentLine=116588550;
 //BA.debugLineNum = 116588550;BA.debugLine="FieldInfo.Initialize";
_fieldinfo.Initialize();
RDebugUtils.currentLine=116588551;
 //BA.debugLineNum = 116588551;BA.debugLine="FieldInfo.FieldName = values(1)";
_fieldinfo.FieldName /*String*/  = _values[(int) (1)];
RDebugUtils.currentLine=116588552;
 //BA.debugLineNum = 116588552;BA.debugLine="FieldInfo.DataType = values(2)";
_fieldinfo.DataType /*String*/  = _values[(int) (2)];
RDebugUtils.currentLine=116588553;
 //BA.debugLineNum = 116588553;BA.debugLine="FieldInfo.CanBeNull = (values(3) = 1)";
_fieldinfo.CanBeNull /*boolean*/  = ((_values[(int) (3)]).equals(BA.NumberToString(1)));
RDebugUtils.currentLine=116588554;
 //BA.debugLineNum = 116588554;BA.debugLine="FieldInfo.DefValue = values(4)";
_fieldinfo.DefValue /*Object*/  = (Object)(_values[(int) (4)]);
RDebugUtils.currentLine=116588555;
 //BA.debugLineNum = 116588555;BA.debugLine="lstFieldsInfo.Add(FieldInfo)";
_lstfieldsinfo.Add((Object)(_fieldinfo));
 }
};
RDebugUtils.currentLine=116588558;
 //BA.debugLineNum = 116588558;BA.debugLine="Return lstFieldsInfo";
if (true) return _lstfieldsinfo;
RDebugUtils.currentLine=116588559;
 //BA.debugLineNum = 116588559;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _gettables(anywheresoftware.b4j.objects.SQL _db) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "gettables", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "gettables", new Object[] {_db}));}
RDebugUtils.currentLine=116523008;
 //BA.debugLineNum = 116523008;BA.debugLine="Public Sub GetTables(DB As SQL) As List";
RDebugUtils.currentLine=116523009;
 //BA.debugLineNum = 116523009;BA.debugLine="Return ExecuteList(DB, \"SELECT name FROM sqlite_m";
if (true) return _executelist(_db,"SELECT name FROM sqlite_master WHERE type = 'table'",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0));
RDebugUtils.currentLine=116523010;
 //BA.debugLineNum = 116523010;BA.debugLine="End Sub";
return null;
}
public static String  _setdbversion(anywheresoftware.b4j.objects.SQL _sql,int _version) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "setdbversion", true))
	 {return ((String) Debug.delegate(ba, "setdbversion", new Object[] {_sql,_version}));}
RDebugUtils.currentLine=116195328;
 //BA.debugLineNum = 116195328;BA.debugLine="Public Sub SetDBVersion (SQL As SQL, Version As In";
RDebugUtils.currentLine=116195329;
 //BA.debugLineNum = 116195329;BA.debugLine="SQL.ExecNonQuery2(\"UPDATE DBVersion set version =";
_sql.ExecNonQuery2("UPDATE DBVersion set version = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_version)}));
RDebugUtils.currentLine=116195330;
 //BA.debugLineNum = 116195330;BA.debugLine="End Sub";
return "";
}
public static String  _updaterecord(anywheresoftware.b4j.objects.SQL _sql,String _tablename,String _field,Object _newvalue,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "updaterecord", true))
	 {return ((String) Debug.delegate(ba, "updaterecord", new Object[] {_sql,_tablename,_field,_newvalue,_wherefieldequals}));}
RDebugUtils.currentLine=116260864;
 //BA.debugLineNum = 116260864;BA.debugLine="Public Sub UpdateRecord(SQL As SQL, TableName As S";
RDebugUtils.currentLine=116260866;
 //BA.debugLineNum = 116260866;BA.debugLine="UpdateRecord2(SQL, TableName, CreateMap(Field: Ne";
_updaterecord2(_sql,_tablename,anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)(_field),_newvalue}),_wherefieldequals);
RDebugUtils.currentLine=116260867;
 //BA.debugLineNum = 116260867;BA.debugLine="End Sub";
return "";
}
public static String  _updaterecord2(anywheresoftware.b4j.objects.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _fields,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "updaterecord2", true))
	 {return ((String) Debug.delegate(ba, "updaterecord2", new Object[] {_sql,_tablename,_fields,_wherefieldequals}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _args = null;
String _col = "";
RDebugUtils.currentLine=116326400;
 //BA.debugLineNum = 116326400;BA.debugLine="Public Sub UpdateRecord2(SQL As SQL, TableName As";
RDebugUtils.currentLine=116326401;
 //BA.debugLineNum = 116326401;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
if (_wherefieldequals.getSize()==0) { 
RDebugUtils.currentLine=116326402;
 //BA.debugLineNum = 116326402;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("9116326402","WhereFieldEquals map empty!",0);
RDebugUtils.currentLine=116326403;
 //BA.debugLineNum = 116326403;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=116326405;
 //BA.debugLineNum = 116326405;BA.debugLine="If Fields.Size = 0 Then";
if (_fields.getSize()==0) { 
RDebugUtils.currentLine=116326406;
 //BA.debugLineNum = 116326406;BA.debugLine="Log(\"Fields empty\")";
anywheresoftware.b4a.keywords.Common.LogImpl("9116326406","Fields empty",0);
RDebugUtils.currentLine=116326407;
 //BA.debugLineNum = 116326407;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=116326409;
 //BA.debugLineNum = 116326409;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=116326410;
 //BA.debugLineNum = 116326410;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=116326411;
 //BA.debugLineNum = 116326411;BA.debugLine="sb.Append(\"UPDATE \").Append(EscapeField(TableName";
_sb.Append("UPDATE ").Append(_escapefield(_tablename)).Append(" SET ");
RDebugUtils.currentLine=116326412;
 //BA.debugLineNum = 116326412;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=116326413;
 //BA.debugLineNum = 116326413;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=116326414;
 //BA.debugLineNum = 116326414;BA.debugLine="For Each col As String In Fields.Keys";
{
final anywheresoftware.b4a.BA.IterableList group14 = _fields.Keys();
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_col = BA.ObjectToString(group14.Get(index14));
RDebugUtils.currentLine=116326415;
 //BA.debugLineNum = 116326415;BA.debugLine="sb.Append(EscapeField(col)).Append(\"=?\")";
_sb.Append(_escapefield(_col)).Append("=?");
RDebugUtils.currentLine=116326416;
 //BA.debugLineNum = 116326416;BA.debugLine="sb.Append(\",\")";
_sb.Append(",");
RDebugUtils.currentLine=116326417;
 //BA.debugLineNum = 116326417;BA.debugLine="args.Add(Fields.Get(col))";
_args.Add(_fields.Get((Object)(_col)));
 }
};
RDebugUtils.currentLine=116326419;
 //BA.debugLineNum = 116326419;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
RDebugUtils.currentLine=116326420;
 //BA.debugLineNum = 116326420;BA.debugLine="sb.Append(\" WHERE \")";
_sb.Append(" WHERE ");
RDebugUtils.currentLine=116326421;
 //BA.debugLineNum = 116326421;BA.debugLine="For Each col As String In WhereFieldEquals.Keys";
{
final anywheresoftware.b4a.BA.IterableList group21 = _wherefieldequals.Keys();
final int groupLen21 = group21.getSize()
;int index21 = 0;
;
for (; index21 < groupLen21;index21++){
_col = BA.ObjectToString(group21.Get(index21));
RDebugUtils.currentLine=116326422;
 //BA.debugLineNum = 116326422;BA.debugLine="sb.Append(EscapeField(col)).Append(\" = ?\")";
_sb.Append(_escapefield(_col)).Append(" = ?");
RDebugUtils.currentLine=116326423;
 //BA.debugLineNum = 116326423;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
RDebugUtils.currentLine=116326424;
 //BA.debugLineNum = 116326424;BA.debugLine="args.Add(WhereFieldEquals.Get(col))";
_args.Add(_wherefieldequals.Get((Object)(_col)));
 }
};
RDebugUtils.currentLine=116326426;
 //BA.debugLineNum = 116326426;BA.debugLine="sb.Remove(sb.Length - \" AND \".Length, sb.Length)";
_sb.Remove((int) (_sb.getLength()-" AND ".length()),_sb.getLength());
RDebugUtils.currentLine=116326428;
 //BA.debugLineNum = 116326428;BA.debugLine="Log(\"UpdateRecord: \" & sb.ToString)";
anywheresoftware.b4a.keywords.Common.LogImpl("9116326428","UpdateRecord: "+_sb.ToString(),0);
RDebugUtils.currentLine=116326430;
 //BA.debugLineNum = 116326430;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
_sql.ExecNonQuery2(_sb.ToString(),_args);
RDebugUtils.currentLine=116326431;
 //BA.debugLineNum = 116326431;BA.debugLine="End Sub";
return "";
}
}