<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> search </title>
</head>
<body>
  <div style="margin: auto;padding:auto;box-shadow: 2px 2px 2px cyan;">
  <form method="POST" action="show">
  <label for="name">Enter Employee NAME :</label>
    <input type="search"  id="name" name="empname"><br>
     <button>Submit</button>
     </form>
  </div>
  
  <br>
  <br>
  <h1 style="color: cyan;text-align: center;">${dis}</h1>
  
  <br>
  <br>
  <a href="report">return to report :</a>
</body>
</html>