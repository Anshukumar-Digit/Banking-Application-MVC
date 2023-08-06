<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Loan Application</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f2f2f2;
      margin: 0;
      padding: 0;
    }

    .container {
      max-width: 600px;
      margin: 20px auto;
      padding: 20px;
      background-color: #fff;
      box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
      border-radius: 8px;
      text-align: center;
    }

    h2 {
      margin-bottom: 20px;
      color: #007bff;
    }

    select, input[type="text"] {
      padding: 10px;
      border: 1px solid #ccc;
      border-radius: 4px;
      width: 100%;
      margin-bottom: 10px;
    }

    input[type="submit"] {
      background-color: #007bff;
      color: white;
      border: none;
      padding: 10px 20px;
      border-radius: 4px;
      cursor: pointer;
      transition: background-color 0.3s;
    }

    input[type="submit"]:hover {
      background-color: #007bff;
    }

    p {
      text-align: left;
      margin-bottom: 5px;
      font-weight: bold;
    }
  </style>
</head>
<body>
  <div class="container">
    <h2>Loan Application</h2>
    <form action="Loan" method="post">
      <p>Select a loan option:</p>
      <select name="lid">
        <option value="1">Home Loan</option>
        <option value="2">Education Loan</option>
        <option value="3">Vehicle Loan</option>
        <option value="4">Gold Loan</option>
        <option value="5">Personal Loan</option>
      </select>
      
      <input type="submit" value="Apply for Loan">
    </form>
  </div>
</body>
</html>


