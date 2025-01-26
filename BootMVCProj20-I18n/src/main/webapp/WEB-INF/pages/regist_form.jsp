<%@page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="d"%>
<frm:form modelAttribute="cust" method="POST">
<table>
<tr>
<td><d:message code="register.cust.name"/> </td>
<td><input type="text"></td>
</tr>
<tr>
<td><d:message code="register.cust.addr"/> </td>
<td><input type="text"></td>
</tr>
<tr>
<td><d:message code="register.cust.mobileno"/> </td>
<td><input type="text"></td>
</tr>
<tr>
<td><d:message code="register.cust.sal"/> </td>
<td><input type="text"></td>
</tr>

<tr>
<td><button><d:message code="register.cust.register"/></button> </td>

</tr>


</table>
</frm:form>

<br>
<br>
<div class="" >
<a  href="?lang=fr_FR">French</a>
<a  href="?lang=de_DE">German</a>
<a  href="?lang=hi_IN">Hindi</a>
<a  href="?lang=en_US">English</a>
</div>

