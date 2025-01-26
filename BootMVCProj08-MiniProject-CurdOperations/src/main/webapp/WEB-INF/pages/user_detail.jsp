<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  
   
    <table border="1" align="center">
    
    <tr>
    <th>Employee Id</th>
    <th>Employee Name</th>
    <th>Employee Job</th>
    <th>Employee Salary</th>
    </tr>
    <c:forEach var="emi" items="${emp1}">   
   
   <tr>
    <td>${emi.empno }></td> 
    <td>${emi.ename}</td> 
    <td>${emi.job}</td> 
    <td>${emi.sal}</td> 
   </tr>
   </table>
   </c:forEach>
  
</body>
</html>