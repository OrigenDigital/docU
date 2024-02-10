Dim olApp as Object
Dim objMailItem as Object
Set olApp = CreateObject("Outlook.Application")
Set objMailItem = olApp.CreateItem(0)
objMailItem.SentOnBehalfOfName = WScript.Arguments(0)
objMailItem.To = WScript.Arguments(1)
objMailItem.Subject = WScript.Arguments(2)
objMailItem.Body = WScript.Arguments(3)
objMailItem.Attachments.Add = WScript.Arguments(4)
objMailItem.Send
Set olApp = Nothing
Set objMailItem = Nothing