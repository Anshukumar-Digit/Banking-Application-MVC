<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>
<%
 session=request.getSession();
 out.println("Transaction failed due to : "+session.getAttribute("trans_error")+"<br>");
 
%>
<br>


</h3>

</body>
</html>