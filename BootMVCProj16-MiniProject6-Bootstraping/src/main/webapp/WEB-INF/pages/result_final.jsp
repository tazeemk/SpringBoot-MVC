<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1 style="text-align: center;">Employees Are :</h1>
<div style="display: flex;justify-content: space-between; margin: auto;">

<table border="1" align="center">

<tr>
<td>EmpNO</td>
<td>EName</td>
<td>Job</td>
<td>Salary</td>
</tr>

<c:forEach var="emp" items="${result}">
<tr>
<td>${emp.empno}</td>
<td>${emp.ename}</td>
<td>${emp.job}</td>
<td>${emp.sal}</td>

</tr>
</c:forEach>
</table>
</div>
<div style="display: flex;justify-content: space-between; margin: auto;">
<div style=" margin: 10px; /* optional, for spacing */
  padding: 20px;
  margin:auto;
  background-color: lightblue;
  border: 1px solid #000;">
<button> <a href="report"><img  src="images/report.png"> return to report :</a></button>
</div>
<div style=" margin: 10px; /* optional, for spacing */
  padding: 20px;
  margin:auto;
  background-color: lightblue;
  border: 1px solid #000;">
<button><a href="./"><img src="images/home.jpeg"/> Home: </a></button>
</div>
</div>
</body>
</html>