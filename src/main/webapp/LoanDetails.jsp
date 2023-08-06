<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Loan Details</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f2f2f2;
      margin: 0;
      padding: 0;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
    }

    .container {
      max-width: 400px;
      padding: 20px;
      background-color: #fff;
      box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
      border-radius: 8px;
      text-align: left;
    }

    h1 {
      color: #0047ab;
      margin-bottom: 20px;
      text-align: center;
    }

    p {
      margin: 5px 0;
    }

    a {
      display: block;
      background-color: #0047ab;
      color: white;
      text-decoration: none;
      padding: 10px 20px;
      border-radius: 4px;
      font-weight: bold;
      text-align: center;
      transition: background-color 0.3s, color 0.3s;
    }

    a:hover {
      background-color: #002e71;
    }
  </style>
</head>
<body>
  <div class="container">
    <h1>Loan Details</h1>
    <p><strong>Loan Type:</strong> Home Loan</p>

    
    <%
 session=request.getSession();
 out.println("<strong>Interest Rate : </strong>"+session.getAttribute("interest")+"%"+"<br>");
 out.println("<strong>Description : </strong>"+session.getAttribute("description")+"<br><br>");

%>

    <a href="HomePage.jsp">Back to Home</a>
  </div>
</body>
</html>

