<!-- pode ter combinacao de varis tags -->
<%@page import="br.com.webdeveloper.tags.Tags"%>
<%@ page 
language="java" 
contentType="text/html; charset=ISO-8859-1" 
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TAG</title>
</head>
<body>


	<jsp:useBean id="nomeDoMeuUserBean"
	    class="br.com.webdeveloper.tags.Tags"
		type="br.com.webdeveloper.tags.Tags" 
		scope="page">
	</jsp:useBean>

	<jsp:setProperty name="nomeDoMeuUserBean" property="nome" value="lucas" />

	<jsp:getProperty name="nomeDoMeuUserBean" property="nome" /> 
	<jsp:param value="nome meu" name="cmd"/> 
	
</body>
</html>