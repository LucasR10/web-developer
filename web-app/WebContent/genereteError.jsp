<%@ page errorPage="badePage.jsp" language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Incluindo na pagina</title>
</head>
<body>

<%--  <c:redirect  url=""></c:redirect> --%>
	<ol>
		<c:forTokens var="l" items="A,B,C;D,F" delims=",">
	      <li>${l}</li>
	    </c:forTokens>
	    <ol>
	    <c:forEach var="valor" step="1" begin="1" end="10">
	      <li>  ${valor}  <li>
	    </c:forEach>
	    <ol>
	</ol>
</body>
</html>