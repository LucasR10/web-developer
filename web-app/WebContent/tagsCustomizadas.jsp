<%@ page errorPage="true" language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@taglib prefix="mytag" tagdir="WEB-INF/taglib.tld" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tags Customizadas</title>
</head>
<body>

   <form  method="post" action="j_security_check">
      <input type="text" name="j_username" >
      <input type="password" name="j_password" >
      <input type="submit" value="login" >
   </form>


  Customizados tagas
  <mytag:numero faixa="5"/>
   </body>
</html>