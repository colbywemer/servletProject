<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Interest Program Answer</title>
</head>
<body>
<p>
<h1>Interest Calculator</h1>
<p>
If you invested ${interest.getFormattedInvestment() } with an interest rate of ${interest.getRate() }% for ${interest.getYears() } years you would have ${interest.getAnswer() }
</p>
<a href = "index.jsp">back to menu</a>
</body>
</html>