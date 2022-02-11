<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Interest Calculator Application</title>
</head>
<body>
<h1>Interest Calculator Application</h1>
<form action = "getInterestServlet" method = "post">
Investment: 
<input type = "text" name = "investment" size = "10">
<br>
<br>
Interest Rate %: 
<input type = "text" name = "interestRate" size = "10">
<br>
<br>
Years: 
<input type = "text" name = "years" size = "10">
<br>
<br>
<input type = "submit" value = "Calculate Interest"/>
</form>

</body>
</html>