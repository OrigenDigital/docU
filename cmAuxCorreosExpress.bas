B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=9.3
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
	
	Public lstCodigosIncidenciasCorreosExpress As List
	Public lstEstadosCorreosExpress As List
End Sub

Sub CargaListaEstadosCorreosExpress
	lstEstadosCorreosExpress.Initialize
	Dim su As StringUtils
	lstEstadosCorreosExpress=su.LoadCSV(File.DirAssets,"CodigosEstadosCorreosExpress.csv",";")
End Sub

Sub CargaListaIncidenciasCorreosExpress
	lstCodigosIncidenciasCorreosExpress.Initialize
	Dim su As StringUtils
	lstCodigosIncidenciasCorreosExpress=su.LoadCSV(File.DirAssets,"CodigosIncidenciasCorreosExpress.csv",";")
End Sub
