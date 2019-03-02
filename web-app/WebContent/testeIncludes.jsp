<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Include</title>
</head>
<body>

   <jsp:forward page="/home.jsp" ></jsp:forward>
 
   Testa jsp:include page : 
      
      <c:if test="${param.cmd eq 'ok'}">
        <jsp:forward page="/jspInclude.jsp">
          <jsp:param value="cmd" name="ok"/>
        </jsp:forward>
      </c:if>
      
     
       <jsp:include page="/jspInclude.jsp">
     <jsp:param value="Pasando para pego com jsp:param" name="titulo"/>
   </jsp:include>
    <br>
   Testa @include file :  <%@ include file="/include.jsp" %> <br>
</body>
</html>