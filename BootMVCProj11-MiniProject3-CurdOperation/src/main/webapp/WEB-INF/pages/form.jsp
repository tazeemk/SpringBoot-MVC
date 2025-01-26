<%@page isELIgnored="false"  %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>

<frm:form modelAttribute="emp">
   <table border="1" align="center">
  <tr>
    <td>EName</td>
    <td><frm:input path="ename"/> </td>
    </tr>
    <tr>
    <td> jOB</td>
    <td><frm:input path="job"/></td>
    </tr>
    <tr>
   <td> Salary</td>
   <td><frm:input path="sal"/></td>
   
   </tr>
  <tr>
  <td> <frm:button>Submit</frm:button></td>
  <td><input type="reset">Cancel</td>
     </tr>
</table>
   </frm:form>