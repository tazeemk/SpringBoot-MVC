<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="cp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<h1 style="color: red; text-align: center; "><cp:message code="home.title"/> </h1>
<br>
<br>
    <a href="r"><cp:message code="home.link"/></a> 
   
<br>
<br>


<div class="d-flex justify-content-center flex-wrap align-items-center ">
<div class="  bg-dark text-white"  style="padding: 20px;">
<a  href="?lang=fr_FR"  class="text-center ">French</a>
</div>
<div class="  bg-dark text-white"  style="padding: 20px;" >
<a  href="?lang=de_DE">German</a>
</div>
<div class="  bg-color" >
<a  href="?lang=hi_IN">Hindi</a>
</div>
<div class="  bg-color" >
<a  href="?lang=en_US">English</a>
</div>


<div class="d-flex border border-1">
<div>
<h1>Current Active Locale is ::${pageContext.response.locale}</h1>
<fmt:setLocale value="${pageContext.response.locale}"/>
<jsp:useBean id="dt" class="java.util.Date"></jsp:useBean>
<fmt:formatDate var="fdt" value="${date}" type="time" dateStyle="FULL"/>
<b>Fomatted Date ${fdt}</b>
</div>
</div>

</div>
