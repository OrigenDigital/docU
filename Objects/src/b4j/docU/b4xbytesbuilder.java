package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xbytesbuilder extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.b4xbytesbuilder", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.b4xbytesbuilder.class).invoke(this, new Object[] {null});
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
public byte[] _mbuffer = null;
public int _mlength = 0;
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
public b4j.docU.b4xbytesbuilder  _append(b4j.docU.b4xbytesbuilder __ref,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "append", true))
	 {return ((b4j.docU.b4xbytesbuilder) Debug.delegate(ba, "append", new Object[] {_data}));}
RDebugUtils.currentLine=135266304;
 //BA.debugLineNum = 135266304;BA.debugLine="Public Sub Append(Data() As Byte) As B4XBytesBuild";
RDebugUtils.currentLine=135266305;
 //BA.debugLineNum = 135266305;BA.debugLine="Return Append2(Data, 0, Data.Length)";
if (true) return __ref._append2 /*b4j.docU.b4xbytesbuilder*/ (null,_data,(int) (0),_data.length);
RDebugUtils.currentLine=135266306;
 //BA.debugLineNum = 135266306;BA.debugLine="End Sub";
return null;
}
public b4j.docU.b4xbytesbuilder  _append2(b4j.docU.b4xbytesbuilder __ref,byte[] _data,int _startindex,int _length) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "append2", true))
	 {return ((b4j.docU.b4xbytesbuilder) Debug.delegate(ba, "append2", new Object[] {_data,_startindex,_length}));}
int _oldlength = 0;
RDebugUtils.currentLine=135331840;
 //BA.debugLineNum = 135331840;BA.debugLine="Public Sub Append2(Data() As Byte, StartIndex As I";
RDebugUtils.currentLine=135331841;
 //BA.debugLineNum = 135331841;BA.debugLine="Dim OldLength As Int = ChangeLength(mLength + Len";
_oldlength = __ref._changelength /*int*/ (null,(int) (__ref._mlength /*int*/ +_length));
RDebugUtils.currentLine=135331842;
 //BA.debugLineNum = 135331842;BA.debugLine="Bit.ArrayCopy(Data, StartIndex, mBuffer, OldLengt";
__c.Bit.ArrayCopy((Object)(_data),_startindex,(Object)(__ref._mbuffer /*byte[]*/ ),_oldlength,_length);
RDebugUtils.currentLine=135331843;
 //BA.debugLineNum = 135331843;BA.debugLine="Return Me";
if (true) return (b4j.docU.b4xbytesbuilder)(this);
RDebugUtils.currentLine=135331844;
 //BA.debugLineNum = 135331844;BA.debugLine="End Sub";
return null;
}
public int  _changelength(b4j.docU.b4xbytesbuilder __ref,int _newlength) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "changelength", true))
	 {return ((Integer) Debug.delegate(ba, "changelength", new Object[] {_newlength}));}
int _oldlength = 0;
byte[] _b = null;
RDebugUtils.currentLine=135200768;
 //BA.debugLineNum = 135200768;BA.debugLine="Private Sub ChangeLength (NewLength As Int) As Int";
RDebugUtils.currentLine=135200769;
 //BA.debugLineNum = 135200769;BA.debugLine="Dim OldLength As Int = mLength";
_oldlength = __ref._mlength /*int*/ ;
RDebugUtils.currentLine=135200770;
 //BA.debugLineNum = 135200770;BA.debugLine="mLength = NewLength";
__ref._mlength /*int*/  = _newlength;
RDebugUtils.currentLine=135200771;
 //BA.debugLineNum = 135200771;BA.debugLine="If mBuffer.Length < mLength Then";
if (__ref._mbuffer /*byte[]*/ .length<__ref._mlength /*int*/ ) { 
RDebugUtils.currentLine=135200772;
 //BA.debugLineNum = 135200772;BA.debugLine="Dim b(Max(mBuffer.Length * 2, NewLength)) As Byt";
_b = new byte[(int) (__c.Max(__ref._mbuffer /*byte[]*/ .length*2,_newlength))];
;
RDebugUtils.currentLine=135200773;
 //BA.debugLineNum = 135200773;BA.debugLine="Bit.ArrayCopy(mBuffer, 0, b, 0, mBuffer.Length)";
__c.Bit.ArrayCopy((Object)(__ref._mbuffer /*byte[]*/ ),(int) (0),(Object)(_b),(int) (0),__ref._mbuffer /*byte[]*/ .length);
RDebugUtils.currentLine=135200774;
 //BA.debugLineNum = 135200774;BA.debugLine="mBuffer = b";
__ref._mbuffer /*byte[]*/  = _b;
 };
RDebugUtils.currentLine=135200776;
 //BA.debugLineNum = 135200776;BA.debugLine="Return OldLength";
if (true) return _oldlength;
RDebugUtils.currentLine=135200777;
 //BA.debugLineNum = 135200777;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4j.docU.b4xbytesbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
RDebugUtils.currentLine=135069696;
 //BA.debugLineNum = 135069696;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=135069697;
 //BA.debugLineNum = 135069697;BA.debugLine="Private mBuffer() As Byte";
_mbuffer = new byte[(int) (0)];
;
RDebugUtils.currentLine=135069698;
 //BA.debugLineNum = 135069698;BA.debugLine="Private mLength As Int";
_mlength = 0;
RDebugUtils.currentLine=135069699;
 //BA.debugLineNum = 135069699;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4j.docU.b4xbytesbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=135397376;
 //BA.debugLineNum = 135397376;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=135397377;
 //BA.debugLineNum = 135397377;BA.debugLine="ChangeLength(0)";
__ref._changelength /*int*/ (null,(int) (0));
RDebugUtils.currentLine=135397378;
 //BA.debugLineNum = 135397378;BA.debugLine="End Sub";
return "";
}
public byte[]  _getbuffer(b4j.docU.b4xbytesbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "getbuffer", true))
	 {return ((byte[]) Debug.delegate(ba, "getbuffer", null));}
RDebugUtils.currentLine=135921664;
 //BA.debugLineNum = 135921664;BA.debugLine="Private Sub getBuffer As Byte() 'ignore";
RDebugUtils.currentLine=135921665;
 //BA.debugLineNum = 135921665;BA.debugLine="End Sub";
return null;
}
public byte[]  _getinternalbuffer(b4j.docU.b4xbytesbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "getinternalbuffer", true))
	 {return ((byte[]) Debug.delegate(ba, "getinternalbuffer", null));}
RDebugUtils.currentLine=136118272;
 //BA.debugLineNum = 136118272;BA.debugLine="Public Sub getInternalBuffer As Byte()";
RDebugUtils.currentLine=136118273;
 //BA.debugLineNum = 136118273;BA.debugLine="Return mBuffer";
if (true) return __ref._mbuffer /*byte[]*/ ;
RDebugUtils.currentLine=136118274;
 //BA.debugLineNum = 136118274;BA.debugLine="End Sub";
return null;
}
public int  _getlength(b4j.docU.b4xbytesbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "getlength", true))
	 {return ((Integer) Debug.delegate(ba, "getlength", null));}
RDebugUtils.currentLine=135790592;
 //BA.debugLineNum = 135790592;BA.debugLine="Public Sub getLength As Int";
RDebugUtils.currentLine=135790593;
 //BA.debugLineNum = 135790593;BA.debugLine="Return mLength";
if (true) return __ref._mlength /*int*/ ;
RDebugUtils.currentLine=135790594;
 //BA.debugLineNum = 135790594;BA.debugLine="End Sub";
return 0;
}
public int  _indexof(b4j.docU.b4xbytesbuilder __ref,byte[] _searchfor) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "indexof", true))
	 {return ((Integer) Debug.delegate(ba, "indexof", new Object[] {_searchfor}));}
RDebugUtils.currentLine=135987200;
 //BA.debugLineNum = 135987200;BA.debugLine="Public Sub IndexOf(SearchFor() As Byte) As Int";
RDebugUtils.currentLine=135987201;
 //BA.debugLineNum = 135987201;BA.debugLine="Return IndexOf2(SearchFor, 0)";
if (true) return __ref._indexof2 /*int*/ (null,_searchfor,(int) (0));
RDebugUtils.currentLine=135987202;
 //BA.debugLineNum = 135987202;BA.debugLine="End Sub";
return 0;
}
public int  _indexof2(b4j.docU.b4xbytesbuilder __ref,byte[] _searchfor,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "indexof2", true))
	 {return ((Integer) Debug.delegate(ba, "indexof2", new Object[] {_searchfor,_index}));}
int _i1 = 0;
int _i2 = 0;
RDebugUtils.currentLine=136052736;
 //BA.debugLineNum = 136052736;BA.debugLine="Public Sub IndexOf2(SearchFor() As Byte, Index As";
RDebugUtils.currentLine=136052737;
 //BA.debugLineNum = 136052737;BA.debugLine="For i1 = Index To mLength - SearchFor.Length";
{
final int step1 = 1;
final int limit1 = (int) (__ref._mlength /*int*/ -_searchfor.length);
_i1 = _index ;
for (;_i1 <= limit1 ;_i1 = _i1 + step1 ) {
RDebugUtils.currentLine=136052738;
 //BA.debugLineNum = 136052738;BA.debugLine="For i2 = 0 To SearchFor.Length - 1";
{
final int step2 = 1;
final int limit2 = (int) (_searchfor.length-1);
_i2 = (int) (0) ;
for (;_i2 <= limit2 ;_i2 = _i2 + step2 ) {
RDebugUtils.currentLine=136052739;
 //BA.debugLineNum = 136052739;BA.debugLine="If SearchFor(i2) <> mBuffer(i1 + i2) Then";
if (_searchfor[_i2]!=__ref._mbuffer /*byte[]*/ [(int) (_i1+_i2)]) { 
RDebugUtils.currentLine=136052740;
 //BA.debugLineNum = 136052740;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=136052743;
 //BA.debugLineNum = 136052743;BA.debugLine="If i2 = SearchFor.Length Then";
if (_i2==_searchfor.length) { 
RDebugUtils.currentLine=136052744;
 //BA.debugLineNum = 136052744;BA.debugLine="Return i1";
if (true) return _i1;
 };
 }
};
RDebugUtils.currentLine=136052747;
 //BA.debugLineNum = 136052747;BA.debugLine="Return -1";
if (true) return (int) (-1);
RDebugUtils.currentLine=136052748;
 //BA.debugLineNum = 136052748;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4j.docU.b4xbytesbuilder __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=135135232;
 //BA.debugLineNum = 135135232;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=135135233;
 //BA.debugLineNum = 135135233;BA.debugLine="Dim mBuffer(100) As Byte";
_mbuffer = new byte[(int) (100)];
;
RDebugUtils.currentLine=135135234;
 //BA.debugLineNum = 135135234;BA.debugLine="mLength = 0";
__ref._mlength /*int*/  = (int) (0);
RDebugUtils.currentLine=135135235;
 //BA.debugLineNum = 135135235;BA.debugLine="End Sub";
return "";
}
public String  _insert(b4j.docU.b4xbytesbuilder __ref,int _index,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "insert", true))
	 {return ((String) Debug.delegate(ba, "insert", new Object[] {_index,_data}));}
byte[] _afterindex = null;
RDebugUtils.currentLine=135462912;
 //BA.debugLineNum = 135462912;BA.debugLine="Public Sub Insert(Index As Int, Data() As Byte)";
RDebugUtils.currentLine=135462913;
 //BA.debugLineNum = 135462913;BA.debugLine="If Index >= mLength Then";
if (_index>=__ref._mlength /*int*/ ) { 
RDebugUtils.currentLine=135462914;
 //BA.debugLineNum = 135462914;BA.debugLine="If Index > mLength Then Log(\"Index too large\")";
if (_index>__ref._mlength /*int*/ ) { 
__c.LogImpl("9135462914","Index too large",0);};
RDebugUtils.currentLine=135462915;
 //BA.debugLineNum = 135462915;BA.debugLine="Append(Data)";
__ref._append /*b4j.docU.b4xbytesbuilder*/ (null,_data);
 }else {
RDebugUtils.currentLine=135462917;
 //BA.debugLineNum = 135462917;BA.debugLine="Dim AfterIndex() As Byte = SubArray(Index)";
_afterindex = __ref._subarray /*byte[]*/ (null,_index);
RDebugUtils.currentLine=135462918;
 //BA.debugLineNum = 135462918;BA.debugLine="ChangeLength(mLength + Data.Length)";
__ref._changelength /*int*/ (null,(int) (__ref._mlength /*int*/ +_data.length));
RDebugUtils.currentLine=135462919;
 //BA.debugLineNum = 135462919;BA.debugLine="Bit.ArrayCopy(Data, 0, mBuffer, Index, Data.Leng";
__c.Bit.ArrayCopy((Object)(_data),(int) (0),(Object)(__ref._mbuffer /*byte[]*/ ),_index,_data.length);
RDebugUtils.currentLine=135462920;
 //BA.debugLineNum = 135462920;BA.debugLine="Bit.ArrayCopy(AfterIndex, 0, mBuffer, Index + Da";
__c.Bit.ArrayCopy((Object)(_afterindex),(int) (0),(Object)(__ref._mbuffer /*byte[]*/ ),(int) (_index+_data.length),_afterindex.length);
 };
RDebugUtils.currentLine=135462922;
 //BA.debugLineNum = 135462922;BA.debugLine="End Sub";
return "";
}
public byte[]  _subarray(b4j.docU.b4xbytesbuilder __ref,int _beginindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "subarray", true))
	 {return ((byte[]) Debug.delegate(ba, "subarray", new Object[] {_beginindex}));}
RDebugUtils.currentLine=135659520;
 //BA.debugLineNum = 135659520;BA.debugLine="Public Sub SubArray(BeginIndex As Int) As Byte()";
RDebugUtils.currentLine=135659521;
 //BA.debugLineNum = 135659521;BA.debugLine="Return SubArray2(BeginIndex, mLength)";
if (true) return __ref._subarray2 /*byte[]*/ (null,_beginindex,__ref._mlength /*int*/ );
RDebugUtils.currentLine=135659522;
 //BA.debugLineNum = 135659522;BA.debugLine="End Sub";
return null;
}
public byte[]  _remove(b4j.docU.b4xbytesbuilder __ref,int _beginindex,int _endindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "remove", true))
	 {return ((byte[]) Debug.delegate(ba, "remove", new Object[] {_beginindex,_endindex}));}
byte[] _res = null;
byte[] _afterendindex = null;
RDebugUtils.currentLine=135593984;
 //BA.debugLineNum = 135593984;BA.debugLine="Public Sub Remove(BeginIndex As Int, EndIndex As I";
RDebugUtils.currentLine=135593985;
 //BA.debugLineNum = 135593985;BA.debugLine="Dim res() As Byte = SubArray2(BeginIndex, EndInde";
_res = __ref._subarray2 /*byte[]*/ (null,_beginindex,_endindex);
RDebugUtils.currentLine=135593986;
 //BA.debugLineNum = 135593986;BA.debugLine="If EndIndex <= mLength Then";
if (_endindex<=__ref._mlength /*int*/ ) { 
RDebugUtils.currentLine=135593987;
 //BA.debugLineNum = 135593987;BA.debugLine="Dim AfterEndIndex() As Byte = SubArray(EndIndex)";
_afterendindex = __ref._subarray /*byte[]*/ (null,_endindex);
RDebugUtils.currentLine=135593988;
 //BA.debugLineNum = 135593988;BA.debugLine="Bit.ArrayCopy(AfterEndIndex, 0, mBuffer, BeginIn";
__c.Bit.ArrayCopy((Object)(_afterendindex),(int) (0),(Object)(__ref._mbuffer /*byte[]*/ ),_beginindex,_afterendindex.length);
 };
RDebugUtils.currentLine=135593990;
 //BA.debugLineNum = 135593990;BA.debugLine="ChangeLength(mLength - (EndIndex - BeginIndex))";
__ref._changelength /*int*/ (null,(int) (__ref._mlength /*int*/ -(_endindex-_beginindex)));
RDebugUtils.currentLine=135593991;
 //BA.debugLineNum = 135593991;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=135593992;
 //BA.debugLineNum = 135593992;BA.debugLine="End Sub";
return null;
}
public byte[]  _subarray2(b4j.docU.b4xbytesbuilder __ref,int _beginindex,int _endindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "subarray2", true))
	 {return ((byte[]) Debug.delegate(ba, "subarray2", new Object[] {_beginindex,_endindex}));}
byte[] _b = null;
RDebugUtils.currentLine=135725056;
 //BA.debugLineNum = 135725056;BA.debugLine="Public Sub SubArray2(BeginIndex As Int, EndIndex A";
RDebugUtils.currentLine=135725057;
 //BA.debugLineNum = 135725057;BA.debugLine="Dim b(EndIndex - BeginIndex) As Byte";
_b = new byte[(int) (_endindex-_beginindex)];
;
RDebugUtils.currentLine=135725058;
 //BA.debugLineNum = 135725058;BA.debugLine="Bit.ArrayCopy(mBuffer, BeginIndex, b, 0, b.Length";
__c.Bit.ArrayCopy((Object)(__ref._mbuffer /*byte[]*/ ),_beginindex,(Object)(_b),(int) (0),_b.length);
RDebugUtils.currentLine=135725059;
 //BA.debugLineNum = 135725059;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=135725060;
 //BA.debugLineNum = 135725060;BA.debugLine="End Sub";
return null;
}
public String  _set(b4j.docU.b4xbytesbuilder __ref,int _index,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "set", true))
	 {return ((String) Debug.delegate(ba, "set", new Object[] {_index,_data}));}
RDebugUtils.currentLine=135528448;
 //BA.debugLineNum = 135528448;BA.debugLine="Public Sub Set(Index As Int, Data() As Byte)";
RDebugUtils.currentLine=135528449;
 //BA.debugLineNum = 135528449;BA.debugLine="If Index >= mLength Then";
if (_index>=__ref._mlength /*int*/ ) { 
RDebugUtils.currentLine=135528450;
 //BA.debugLineNum = 135528450;BA.debugLine="If Index > mLength Then Log(\"Index too large\")";
if (_index>__ref._mlength /*int*/ ) { 
__c.LogImpl("9135528450","Index too large",0);};
RDebugUtils.currentLine=135528451;
 //BA.debugLineNum = 135528451;BA.debugLine="Append(Data)";
__ref._append /*b4j.docU.b4xbytesbuilder*/ (null,_data);
 }else {
RDebugUtils.currentLine=135528453;
 //BA.debugLineNum = 135528453;BA.debugLine="If Data.Length + Index > mLength Then";
if (_data.length+_index>__ref._mlength /*int*/ ) { 
RDebugUtils.currentLine=135528454;
 //BA.debugLineNum = 135528454;BA.debugLine="ChangeLength(Data.Length + Index)";
__ref._changelength /*int*/ (null,(int) (_data.length+_index));
 };
RDebugUtils.currentLine=135528456;
 //BA.debugLineNum = 135528456;BA.debugLine="Bit.ArrayCopy(Data, 0, mBuffer, Index, Data.Leng";
__c.Bit.ArrayCopy((Object)(_data),(int) (0),(Object)(__ref._mbuffer /*byte[]*/ ),_index,_data.length);
 };
RDebugUtils.currentLine=135528458;
 //BA.debugLineNum = 135528458;BA.debugLine="End Sub";
return "";
}
public byte[]  _toarray(b4j.docU.b4xbytesbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "toarray", true))
	 {return ((byte[]) Debug.delegate(ba, "toarray", null));}
RDebugUtils.currentLine=135856128;
 //BA.debugLineNum = 135856128;BA.debugLine="Public Sub ToArray() As Byte()";
RDebugUtils.currentLine=135856129;
 //BA.debugLineNum = 135856129;BA.debugLine="Return SubArray(0)";
if (true) return __ref._subarray /*byte[]*/ (null,(int) (0));
RDebugUtils.currentLine=135856130;
 //BA.debugLineNum = 135856130;BA.debugLine="End Sub";
return null;
}
}