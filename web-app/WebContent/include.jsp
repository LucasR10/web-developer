<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Include</title>
</head>
<body>
<c:set  value="valor doendone" var="done"></c:set>
${done}
<%--   <c:set var="userVar" scope="session"  value="teste"> --%>
<!--          usado como o corpo da variavel  -->
<%--        </c:set> --%>
       
        ${userVar}
    <c:set var="bodyBuilder"> colocando valo no corpo da tag</c:set> 
     ${bodyBuilder}  
      <br>
      <c:set var="nome" value="meu nom é jhon" ></c:set>
     Colocando no escopo :n<p style="color:red;"> ${nome} </p><br>
     
     
     Colocando no escopo :<p style="color:red;"> ${nome} </p>
     
     <c:import url="/jstl.jsp">
       <c:param name="nome" value="we take the out of SOAP"></c:param>
     </c:import>
     
     
     
<%--      <c:import url="/https://docs.jboss.org/jbossas/docs/Server_Configuration_Guide/4/html/J2EE_Declarative_Security_Overview-Web_Content_Security_Constraints.html"></c:import> --%>
    
</body>
</html>