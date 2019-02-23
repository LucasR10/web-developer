<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
    <%@ page import="br.com.webdeveloper.jsps.ContatoJSP" %>
<%--     <%@ taglib tagdir="/WEB-INF/tags/user"  prefix="user"%> --%>
<%--     <%@ include file="index.jsf"  %> --%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    Bem vindo..
    
    <%
      out.println( ContatoJSP.NOME );
    %>
   
    <%!  /* <- Anula o metodo jspInit() usando essa declaração
               vc pode chamr o getServletConfig(), getServletContext() de dentro do JPS
      */
      public void jspInit(){
    	 ServletConfig config = getServletConfig();
    	 //TODO:
    	 ServletContext context = getServletContext();
    	 //TODO:
        }
    %>
    
   
<!--    Configurando atributo do escopo page -->
      <% Float one = new Float(4.5); %>
      <% pageContext.setAttribute("nome", "Ze filho!"); %>
    
<!--     Obtendo um atributo do escopo page ; O tipo retornado e um object -->
 	  <% Object nome  = pageContext.getAttribute("nome");  %>
    
<!--    Usando o PageContex Para configura um atributo do escopo session; -->
      <%  pageContext.setAttribute("nome", "Jose Algusto", PageContext.SESSION_SCOPE); %>
 
 <!--    Usando o PageContex Para obter  um atributo do escopo session; -->
      <%  pageContext.getAttribute("nome", PageContext.SESSION_SCOPE); %>
<!--        São equivalentes -->
      <%  session.getAttribute("nome"); %>
    
<!--    Usando o PageContex Para obter  um atributo do escopo application; -->
      <%  pageContext.getAttribute("nome", PageContext.APPLICATION_SCOPE); %>
      <!-- Dento de um JSp o código acima e idêntico o --> 
      <%= application.getAttribute("nome") %>
      
 <!--    Por ultimo, usando o pageContex para encontrar um atributo quando vc não sabe o escopo. -->
 		<% pageContext.findAttribute("nome"); %>

</body>
</html>