<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>Banking Website</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f2f2f2;
      margin: 0;
      padding: 0;
    }

    header {
      background-color: #007bff;
      color: white;
      text-align: center;
      padding: 10px;
    }

    nav {
      text-align: center;
      padding: 10px;
    }

    nav a {
      display: block;
      color: #007bff;
      text-decoration: none;
      padding: 8px 20px;
      margin: 10px auto;
      background-color: #fff;
      border: 2px solid #007bff;
      border-radius: 20px; /* Increased border radius */
      transition: background-color 0.3s, color 0.3s;
      max-width: 200px;
    }

    nav a:hover {
      background-color: #007bff;
      color: white;
    }

    .container {
      max-width: 800px;
      margin: 20px auto;
      padding: 20px;
      background-color: white;
      box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
      border-radius: 4px;
    }

    footer {
      background-color: #007bff;
      color: white;
      text-align: center;
      padding: 10px;
      position: fixed;
      bottom: 0;
      left: 0;
      width: 100%;
    }
  </style>
</head>

<body>
<header>
    <h1>
    <%
  session=request.getSession();
  String s2=(String)session.getAttribute("cust_name");
  out.println(s2);

%>
    , Welcome to the Bank</h1>
  </header>
  <nav>
    <a href="CheckBalance">Check Balance</a>
    <a href="ChangePin.html">Change Pin</a>
    <a href="Loan.jsp">Apply for Loan</a>
    <a href="Transfer.html">Transfer Amount</a>
    <a href="Transactionhistory.jsp">Transaction History</a>
    <a href="Logout">Log Out</a>
  </nav>

  <footer>
    &copy; 2023 Digit Banking. All rights reserved.
  </footer>
</body>

</html>


