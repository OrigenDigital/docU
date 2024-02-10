B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.31
@EndOfDesignText@
'Static code module
Sub Process_Globals
	'Private fx As JFX
End Sub


Sub CreateRequest(rdcLink As String) As DBRequestManager
	Dim req As DBRequestManager
	req.Initialize(Me, rdcLink)   'originalmente  req.Initialize(Me, rdclinkMySql)
	Return req
End Sub


Sub CreateCommand(name As String, Parameters() As Object) As DBCommand
	Dim cmd As DBCommand
	cmd.Initialize
	cmd.Name = name
	If Parameters <> Null Then
		cmd.Parameters = Parameters
	End If
	'cmd.Parameters = Parameters
	Return cmd
End Sub


'public Sub DatosJRDC(rdcLink As String,ComandoConfigProperties As String, Parametros() As Object, CallModule As Object) As ResumableSub
public Sub DatosJRDC(rdcLink As String,ComandoConfigProperties As String, Parametros() As Object, CallModule As Object)
	
'	Dim lstNodosDeshabilitados As List
'	lstNodosDeshabilitados.Initialize
'	If SubExists(CallModule,"FormularioBase") Then
'		Dim frmBase As Form=CallSub(CallModule,"FormularioBase")
'		For Each n As Node In frmBase.RootPane.GetAllViewsRecursive
'			If n.Enabled=True Then
'				n.Enabled=False
'				lstNodosDeshabilitados.Add(n)
'			End If
'		Next
'	End If
	
	Dim lstRes As List
	lstRes.Initialize
	Dim m As Map
	m.Initialize
	m.Put("ConnOK",False)
	m.Put("QryOK",False)  ' añadido 14/10/22
	m.Put("ReqOK",False)
	m.Put("lstRes",lstRes)
	
' ***añadido 14/10/22
	m.Put("ErrMsg","")
	#if DEBUG
	Log("inicio check test JRDC")
	#End If
	Dim jobTest As HttpJob
	jobTest.Initialize("",Me)
	Dim rdcLastPos As Int=rdcLink.LastIndexOf("/rdc")
	Dim URLTestJRDC As String=rdcLink.SubString2(0,rdcLastPos) & "/test"
	Dim ser As B4XSerializator
	Dim data() As Byte = ser.ConvertObjectToBytes("") ' enviamos cadena vacía, ya que en Test no hay parámetro
	jobTest.PostBytes(URLTestJRDC,data)
	jobTest.GetRequest.Timeout=10000
	Wait For (jobTest) JobDone(jobTest As HttpJob)
	#if DEBUG
	Log("Success check test JRDC: " & jobTest.Success)
	#End If
	If Not(jobTest.Success) Then
		Log("jobTest.Response.ErrorMessage: " & jobTest.ErrorMessage)
		m.Put("ErrMsg",jobTest.ErrorMessage)
		jobTest.Release
		CallSubDelayed2(CallModule, "DatosJRDC_Completed",m)
		Return
	End If
	jobTest.Release
	
' ****fin añadido 14/10/22	
	
	
	
	
	
	
	
	Dim req As DBRequestManager = CreateRequest(rdcLink)
	Dim cmd As DBCommand = CreateCommand(ComandoConfigProperties,Parametros)
	
'	Log("Antes de DatosJRDC " & ComandoConfigProperties & ", " & Parametros )
	Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)
'	Log("j DatosJRDC "& ComandoConfigProperties & " success " & j.success)
	If j.Success Then
		m.Put("ConnOK",True)
		req.HandleJobAsync(j, "req")
		Wait For (req) req_Result(res As DBResult)
		'req.PrintTable(res)
		If res.Rows.Size>0 Then
			m.Put("ReqOK",True)
			For Each records() As Object In res.Rows
				Dim mReg As Map
				mReg.Initialize
				For i=0 To  res.Columns.Size-1
					'Log(res.Columns.GetKeyAt(i))
					mReg.Put(res.Columns.GetKeyAt(i),records(i))
					
				Next

				lstRes.Add(mReg)
			Next

		Else

		End If
	Else
	End If
	j.Release
'	
'	For Each n As Node In lstNodosDeshabilitados
'		n.Enabled=True
'	Next
	
	CallSubDelayed2(CallModule, "DatosJRDC_Completed",m)
	'Return Null
End Sub

'For Each Row() As Object In Table.Rows
' Dim Status As Int = Row(Table.Columns.Get("Status"))
' Log(Status)
'Next


Sub EjecutarBatch(rdcLink As String, ListaCmds As List, CallModule As Object)
	Wait For(ExecuteBatch(rdcLink, ListaCmds))  complete (bresult As Boolean)
	CallSubDelayed2(CallModule, "EjecutarBatch_Completed",bresult)
End Sub

Sub ExecuteBatch(rdcLink As String, ListaCmds As List) As ResumableSub
	Dim j As HttpJob = CreateRequest(rdcLink).ExecuteBatch(ListaCmds, Null)
	Wait For(j) JobDone(j As HttpJob)
	If j.Success Then
		Log("Inserted successfully!")
	Else
		Log("Error, no insertado")
	End If
	j.Release
	Return j.Success
End Sub

'''' llamada estandar a query JRDC

''''	JRDCQuery.DatosJRDC(rdcLink, "GestionAprovisionamiento5",Null, Me) 
''''	Wait For DatosJRDC_Completed (mresult As Map)
''''	
''''	If mresult.Get("ConnOK")=False Then
''''		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query","Error")
''''		Wait For (msa) Msgbox_Result
''''		'' codigo callback
''''	Else
''''		If mresult.Get("ReqOK")=False Then
''''			Dim msa As Object=xui.MsgboxAsync("Tabla sin registros","Aviso")
''''			Wait For (msa) Msgbox_Result
''''			'' codigo callback
''''		Else
''''			Dim lstRegistros As List=mresult.Get("lstRes")
''''			'' codigo callback
''''		End If
''''	End If

