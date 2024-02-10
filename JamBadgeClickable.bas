B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=5.9
@EndOfDesignText@
'v0.01

#Event: BadgeClick(Data as JamBadgeClickableData)

Sub Class_Globals
	Private xui As XUI
	
	Private mCallBack As Object
	Private mEventName As String
'	Private mParentView As B4XView
'	Private mDataType As String 
'	Private mColorFondo As Int
'	Private mColorTexto As Int
'	Private mRadio As Int
'	Private mValor As Object
	
	Private views As Map
	Private stub As B4XView 'ignore
'	Private radius As Int = 15dip
'	Private animationDuration As Int = 500
'	Private cx, cy As Float

	Private lstBadges As List
	
	Private xui As XUI
'	Private color As Int = xui.Color_Red
'	Private textColor As Int = xui.Color_White
	
	Type JamBadgeClickableData(ParentView As B4XView, DataType As String, Value As Object, _
		Panel As B4XView, Radius As Int, BackGroundColor As Int, TextColor As Int, TextSize As Float, AnimationDuration As Int)
	
	Public const DataTypeString As String="string"
	Public const DataTypeInt As String="int"
End Sub

' Inicializa la clase, que contiene todos los badges del Callback
Public Sub Initialize(CallBack As Object, EventName As String)
	mCallBack=CallBack
	mEventName = EventName
	views.Initialize
	lstBadges.Initialize
End Sub
'
'Public Sub SetBadgeInt(view As B4XView, Badge As Int)
'	If views.ContainsKey(view) Then
'		If Badge = 0 Then
'			RemoveBadge(view)
'		Else
'			ReplaceLabelInt(view, Badge)
'		End If
'	Else
'		If Badge > 0 Then
'			Dim p As B4XView = CreateNewPanel(view)
'			CreateLabel(p, Badge)
'			p.SetLayoutAnimated(animationDuration, cx - radius, cy - radius, radius * 2, radius * 2)
'			views.Put(view, p)
'		End If
'	End If
'End Sub


' Ejemplo
'<code>
'	Dim jamBdg As JamBadgeClickableData
'	jamBdg.AnimationDuration=300
'	jamBdg.BackGroundColor=xui.Color_Red
'	jamBdg.TextColor=xui.Color_White
'	jamBdg.TextSize=16
'	jamBdg.DataType=JamBadgeClickableDataTypeString
'	jamBdg.Radius=15dip
'	jamBdg.Value="a"
'   jamSetBadge.SetBadge(NombreViewAlqueSeLeAsignaElBadge,jamBdg)
'</code>
Public Sub SetBadge(view As B4XView, BadgeData As JamBadgeClickableData) As ResumableSub


	If views.ContainsKey(view) Then
		wait for(ReplaceLabel(view, BadgeData.Value)) complete (rObj As Object)
	Else
		If BadgeData.BackGroundColor=0 Then BadgeData.BackGroundColor=xui.Color_Red
		If BadgeData.TextColor=0 Then BadgeData.TextColor=xui.Color_White
		If BadgeData.TextSize=0 Then BadgeData.TextSize=16
		If BadgeData.DataType=Null Then BadgeData.DataType=DataTypeString
		If BadgeData.DataType="" Then BadgeData.DataType=DataTypeString
		If BadgeData.AnimationDuration=0 Then BadgeData.AnimationDuration=250
		If BadgeData.Radius=0 Then BadgeData.Radius=15dip
		
		views.Put(view, BadgeData)
		Dim p As B4XView = CreateNewPanel(view)
		BadgeData.Panel=p
		BadgeData.ParentView=view
		CreateLabel(BadgeData)
		p.SetLayoutAnimated(BadgeData.AnimationDuration, GetCx(view) - BadgeData.radius, GetCy(view) - BadgeData.radius, BadgeData.Radius * 2, BadgeData.Radius * 2)
	End If
	Return Null
End Sub

Public Sub RemoveBadge(view As B4XView) As ResumableSub
	Dim DataBadge As JamBadgeClickableData=GetDataBadge(view)
	Dim p As B4XView = GetPanel(view)
	GetLabel(p).RemoveViewFromParent
	views.Remove(view)
	p.SetLayoutAnimated(DataBadge.AnimationDuration, GetCx(view), GetCy(view), 0, 0)
	Sleep(DataBadge.AnimationDuration)
	p.RemoveViewFromParent
	Return Null
End Sub

Private Sub ReplaceLabel(view As B4XView, Value As Object) As ResumableSub
	Dim DataBadge As JamBadgeClickableData=GetDataBadge(view)
	Dim lbl As B4XView = GetLabel(GetPanel(view))
	lbl.SetLayoutAnimated(DataBadge.AnimationDuration / 2, DataBadge.Radius + 8dip, 0, DataBadge.Radius * 2, DataBadge.Radius * 2)
	DataBadge.Value=Value
	CreateLabel(DataBadge)
	Sleep(DataBadge.AnimationDuration / 2)
	lbl.RemoveViewFromParent
	Return Null
End Sub

'Public Sub GetBadge(view As B4XView) As Int
'	If views.ContainsKey(view) Then
'		Dim lbl As B4XView = GetLabel(GetPanel(view))
'		Return lbl.Text
'	Else
'		Return 0
'	End If
'End Sub

Public Sub GetDataBadge(view As Object) As JamBadgeClickableData
	
	If views.ContainsKey(view) Then
		Dim DataBadge As JamBadgeClickableData=views.Get(view)
	Else
		Dim DataBadge As JamBadgeClickableData
		DataBadge.Initialize
	End If
	Return	DataBadge
End Sub

Private Sub GetPanel (view As Object) As B4XView
	'Return views.Get(view)
	Dim DataBadge As JamBadgeClickableData=views.Get(view)
	Dim p As B4XView=DataBadge.panel
	Return p
End Sub

private Sub GetCx(view As B4XView) As Float
	Dim cx As Float= view.Left + view.Width
	Return cx
End Sub

private Sub GetCy(view As B4XView) As Float
	Dim cy As Float= view.Top
	Return cy
End Sub

Private Sub GetLabel(panel As B4XView) As B4XView
	Return panel.GetView(panel.NumberOfViews - 1)
End Sub

Private Sub CreateNewPanel(view As B4XView) As B4XView
	Dim DataBadge As JamBadgeClickableData=GetDataBadge(view)
#if B4J
	Dim p As Pane
#else
	Dim p As Panel
#end if
	p.Initialize("")
#if B4A
	p.SetElevationAnimated(animationDuration, 8dip)
#end if
	Dim xp As B4XView = p
	xp.SetColorAndBorder(DataBadge.BackGroundColor, 0, DataBadge.BackGroundColor, DataBadge.Radius)
'	cx = view.Left + view.Width
'	cy = view.Top
	Dim parent As B4XView = view.Parent
	parent.AddView(xp, GetCx(view), GetCy(view), 0, 0)
	Return p
End Sub

Private Sub CreateLabel(DataBadge As JamBadgeClickableData)
	Dim p As B4XView=DataBadge.Panel
	Dim lbl As Label
	lbl.Initialize("lblBadge")
	Dim xlbl As B4XView = lbl
	xlbl.Font = xui.CreateDefaultBoldFont(DataBadge.TextSize)
	xlbl.TextColor = DataBadge.TextColor
	Select Case DataBadge.DataType
		Case "string"
			Dim sValue As String=DataBadge.Value
			xlbl.Text = sValue
		Case "int"
			Dim intValue As Int=DataBadge.Value
			xlbl.Text =intValue
	End Select
	
	p.AddView(xlbl, DataBadge.Radius, DataBadge.Radius-Max((DataBadge.TextSize/2),0), 0, 0)
	xlbl.SetTextAlignment("CENTER", "CENTER")
	Dim duration As Int = DataBadge.AnimationDuration	
	xlbl.SetLayoutAnimated(duration, 0, 0, DataBadge.Radius * 2, DataBadge.Radius * 2)
	xlbl.Visible = False
	xlbl.SetVisibleAnimated(DataBadge.AnimationDuration, True)
End Sub


Sub lblBadge_MouseReleased (EventData As MouseEvent)
	Dim lblBadge As B4XView=Sender
	If SubExists(mCallBack,mEventName & "_BadgeClick") Then
		Dim p As B4XView=lblBadge.Parent
		'Dim ParentView As B4XView=p.Parent
		Dim bFound As Boolean
		For Each B4Xv As B4XView In views.Keys
			Dim DataBadge As JamBadgeClickableData=GetDataBadge(B4Xv)
			If p=DataBadge.Panel Then
				bFound=True
				Exit
			End If
		Next
		If bFound Then CallSub2(mCallBack,mEventName & "_BadgeClick",DataBadge)
	End If
End Sub

