<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div style="box-sizing: border-box;display: flex;justify-content: center;
  margin: auto;padding-top: 80px ">
   <form action="request" method="POST">
   
      <table style="background:cyan;">
     
      <tr> 
     <td> <label> Enter ID</label></td>
     <td> <input type ="text"  name="did"> </td>
     </tr>
      <tr> 
     <td> <label> Enter Name </label></td>
     <td> <input type ="text"  name="name"> </td>
     </tr>       
      <tr> 
     <td> <label> Enter Dancer Type :</label></td>
     <td> <input type ="text"  name="dancerType"></td> 
     </tr>
      <tr> 
     <td> <label> Enter fee </label></td>
     <td> <input type ="text"  name="fee"></td> 
     </tr>
      <tr> 
     <td> <input type="submit" value ="send"> </td>
     <td> <input type ="reset"  value="cancel"> </td>
     </tr>
      
      
      </table>
   </form>
</div>

</body>
</html>