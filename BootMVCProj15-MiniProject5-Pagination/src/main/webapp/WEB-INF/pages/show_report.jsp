<%@ page isELIgnored="false"  import ="java.util.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
 
 <html>
 <body>
<script src="js/msg.js"></script>
<div style="padding:20px;margin-top:40px; border: medium;box-sizing: border-box;">   
<c:choose>
<c:when test="${!empty empdata.getContent()}">
   <table border="1" align="center" bgcolor="cyan"> 
    <tr style="background-color:red;">
    <th>EmployeeID :</th>
    <th>Employee Name :</th>
    <th>Employee Job:</th>
    <th>Employee SALARY :</th>
    <th>Operations</th>
    </tr>
    <c:forEach var="empl" items="${empdata.getContent()}">
     <tr>
     <td>${empl.empno}</td>
     <td>${empl.ename}</td>
     <td>${empl.job}</td>
     <td>${empl.sal}</td>
    <td> <a href="edit?no=${empl.empno}">Edit :</a>
    <td> <a onclick="return confirm('Are you sure want to delete')" href="delete?no=${empl.empno}">Delete :</a>
    </td>
    </tr></c:forEach>
     </table>
     
     <p style="text-align: center;">
     <c:if test="${empdata.hasPrevious()}">
     <a href="report?page=${empdata.getPageable().getPageNumber()-1}">Previous </a> &nbsp; 

     </c:if>
     <c:if test="${!empdata.isFirst()}">
     <a href="report?page=0">First</a>&nbps;&nbps;
     </c:if>
     
     <c:forEach  var="i" begin="1" end="${empdata.getTotalPages()}" step="1">
    <a href="report?page=${i-1}">${i}</a>&nbps;&nbps;    
     </c:forEach>
     
     <c:if test="${!empdata.isLast()}">
     <a href="report?page=${empdata.getTotalPages()-1}">Last</a> &nbps;&nbps;
     </c:if>
     
     <c:if test="${empdata.hasNext()}">
     <a href="report?page=${empdata.getPageable().getPageNumber()+1}">next</a>
     </c:if>
     
     </p>
     </c:when>
     <c:otherwise>
     <h1>Record not found :</h1>
     </c:otherwise>
     </c:choose>
     
     
     
     
     </div>
     <br><br>
     <h1 style="color: cyan;text-align: center;">${result}</h1>
     
     <br><br>
     <h1 style="color: cyan;text-align: center;">${show}</h1>
     <br><br>
      <div style="height: 300px;width: 800px;margin:auto;box-sizing: border-box;justify-content:space-between;display: flex;">   
   
   
     <div style=" margin: 10px; /* optional, for spacing */
  padding: 20px;
  
  background-color: lightblue;
  border: 1px solid #000;" >
     <a href="addEmp"><img src="images/add.jpeg"/> Add Employee</a>
   </div>
   
   
    <div style=" margin: 10px; /* optional, for spacing */
  padding: 20px;

  background-color: lightblue;
  border: 1px solid #000;">
   <a href="./"><img src="images/home.jpeg"/> Home</a>
   </div>
   
    <div style=" margin: 10px; /* optional, for spacing */
  padding: 20px;
  margin:auto;
  background-color: lightblue;
  border: 1px solid #000;">
   <a href="search"><img src="images/search.jpeg"/> Search Employee</a>
   </div>
   </div>
   
   
   </body>
   </html>