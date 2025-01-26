<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


     <h1>Weclome :</h1>

    Number :${Lid}
    Name :${Ldname}
    Address:
  
  
  
  <c:forEach var="ad" items="${Ldaddr}">
   
       ${ad}
  
  </c:forEach>
