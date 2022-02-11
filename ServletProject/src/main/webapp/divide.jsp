<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Division Application</title>
</head>
<body>
<h1>Division Application</h1>
<form action = "getDivisionAnswerServlet" method = "post">
Enter the first value to Divide
<input type = "text" name = "value1" size = "10">
<br>
<br>
Enter the second value to Divide
<input type = "text" name = "value2" size = "10">
<br>
<br>
<input type = "submit" value = "Divide"/>
</form>
</body>
</html>