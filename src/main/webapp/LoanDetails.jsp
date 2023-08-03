<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loan Details</title>
</head>
<body>

<h3>
<%
 session=request.getSession();
 out.println("Interest = "+session.getAttribute("interest")+"%"+"<br>");
 out.println("Description = "+session.getAttribute("description"));

%>
<br>


</h3>
<a href="HomePage.jsp"> Redirect</a> 

</body>
</html>