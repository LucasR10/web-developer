<!-- pode ter combinacao de varis tags -->
<%@page import="br.com.webdeveloper.tags.Employee"%>
<%@page import="br.com.webdeveloper.tags.Tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ taglib prefix="f" uri="/jspfunc" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EL - Expresão Lenguage</title>
</head>
<body>

    <%@ taglib prefix="f" uri="/jspfunc" %>
    
    ${f:soma(4,5)}
     
     
     <c:forTokens var="l" items="a,b,c,d,f" delims=",">
     <c:out escapeXml="false" value="<h1>${l}<h1> <br> "></c:out>
     </c:forTokens>
     <%
       application.setAttribute("html", "<h3>Hello word</h3>");
     %>
     <c:out value="${html}"  escapeXml="false"  default="ddd"></c:out>
</body>
</html>