<!DOCTYPE html>
<html>
<head>
  <title>Transfer Success</title>
  <meta charset="UTF-8">
  <!-- Add Bootstrap 4 CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <!-- Add custom CSS -->
  <style>
    body {
      background-color: #f8f8f8;
    }
    .container {
      max-width: 400px;
      margin: 100px auto;
      padding: 40px;
      border: 1px solid #ccc;
      background-color: #fff;
      box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
      text-align: center;
    }
    .logo {
      margin-bottom: 30px;
    }
    .logo img {
      width: 80px;
      height: 80px;
      border-radius: 50%;
      background-color: #337ab7;
      padding: 10px;
    }
    .success-icon {
      font-size: 80px;
      color: #ff0000;
      animation: scaleUp 0.6s ease-in-out;
    }
    .success-message {
      font-size: 24px;
      font-weight: bold;
      color: #ff0000;
      animation: fadeIn 1s;
    }
    .return-home {
      margin-top: 40px;
      font-size: 18px;
      color: #888;
      animation: fadeIn 1s;
    }
    /* Animations */
    @keyframes scaleUp {
      0% {
        transform: scale(0);
        opacity: 0;
      }
      100% {
        transform: scale(1);
        opacity: 1;
      }
    }
    @keyframes fadeIn {
      0% {
        opacity: 0;
      }
      100% {
        opacity: 1;
      }
    }
  </style>
</head>
<body>
  <div class="container">
    <div class="logo">
      <img src="https://static.vecteezy.com/system/resources/previews/000/287/488/original/bank-vector-icon.jpg" alt="YourBank Logo">
    </div>
    <div class="success-icon">&#10008;</div>
    <div class="success-message">Transfer Failed</div>
    <%
 session=request.getSession();
 out.println(session.getAttribute("trans_error"));
 
%>
    
    <!--<div class="return-home">You will be redirected to the home page shortly.</div>-->
  </div>
</body>
</html>
