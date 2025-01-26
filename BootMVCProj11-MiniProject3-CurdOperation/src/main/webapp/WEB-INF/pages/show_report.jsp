<%@ page isELIgnored="false"  import ="java.util.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<script src="js/msg.js"></script>
<div style="padding:20px;margin-top:40px; border: medium;box-sizing: border-box;">   
   <table border="1" align="center" bgcolor="cyan"> 
    <tr style="background-color:red;">
    <th>EmployeeID :</th>
    <th>Employee Name :</th>
    <th>Employee Job:</th>
    <th>Employee SALARY :</th>
    <th>Operations</th>
    </tr>
    <c:forEach var="empl" items="${empdata}">
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