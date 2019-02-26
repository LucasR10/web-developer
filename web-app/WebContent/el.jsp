<!-- pode ter combinacao de varis tags -->
<%@page import="br.com.webdeveloper.tags.Employee"%>
<%@page import="br.com.webdeveloper.tags.Tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EL - Expression Lengauge</title>
</head>
<body>
 
   Email 
   Email - ${initParam.email}<br>
   User -  ${initParam.user}<br>
   Pass -  ${initParam.pas}<br>
    
    Cookie - ${cookie.nome.value}<br>
    
   CMD - ${param.cmd } <br>
   ${header["User-Agent"]} <br>
   ${header.User-Agent} <br>
   
   ${"" > -1}<br>
   
    Size - ${fn:length(maymap)}
    
    ${maymap["1"]}<br>
    ${maymap.AC}


	<c:choose >   
	<c:when  test="${hour < 12}">     
		<c:out value="Good Morning" />  
	</c:when>   <c:when test="${hour > 12}">     
		<c:out value="Good Evening" />   
	</c:when>   
	<c:otherwise >     
		<c:out value="Good Afternoon" />   
	</c:otherwise>
	</c:choose>



</body>
</html>