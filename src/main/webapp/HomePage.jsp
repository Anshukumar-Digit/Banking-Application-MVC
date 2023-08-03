<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center"> Welcome to the bank</h1>
<%
  session=request.getSession();
  String s1=(String)session.getAttribute("cust_name");
  out.println(s1+" welcome to your Account");

%>
<br>
<br>
<a href="CheckBalance">1.Check Balance</a><br><br>
<a href="ChangePin.html">2.Change pin</a><br><br>
<a href="Loan.jsp">3. Apply for Loan</a><br><br>
<a href="Transfer.html">4. Transfer Amount</a><br><br>
<a href="Transactionhistory.jsp">5. Show All Transaction History</a><br><br>
<a href="Logout">6. Log Out</a><br><br>
</body>
</html>