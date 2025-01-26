<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Bootstrap</title>
<link rel="stylesheet" href="../node_modules/bootstrap-icons/font/bootstrap-icons.css">
<link rel="stylesheet" href="../node_modules/bootstrap/dist/css/bootstrap.css">
<script src="../node_modules/bootstrap/dist/js/bootstrap.bundle.js"></script>
</head>
    <body class="container-fluid">
    <frm:form modelAttribute="emp">
    <table border="1" align="center">
    <tr>
    <td>EmpNo</td>
    <td><frm:input  path="empno" readonly="true"/>  </td>
    </tr>
    <tr>
    <td>Ename</td>
    <td><frm:input path="ename"/>  </td>
     <tr>
    <td>Job</td>
    <td><frm:input path="job"/>  </td> 
    </tr>
    <tr>
    <td>Salary</td>
    <td><frm:input path="sal"/>  </td>
    </tr>
    
    
    <tr>
    <td>DeptNo :</td>
    <td>
    <frm:select path="deptno">
    <frm:option value="10"></frm:option>
    <frm:option value="20"></frm:option>
    <frm:option value="30"></frm:option>
   </frm:select>
   </td>
    </tr>
   
    <tr>
    <td><button class="btn btn-primary,btn btn-danger"> Submit  </button></td>
    <td><input type="reset"></td>
    </tr>
    </table> 
    </frm:form>
    </body>
    </html>