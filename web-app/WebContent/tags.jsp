<!-- pode ter combinacao de varis tags -->
<%@page import="br.com.webdeveloper.tags.Employee"%>
<%@page import="br.com.webdeveloper.tags.Tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TAG</title>
</head>
<body>



		<form action="tags.jsp">
		  <fieldset>
		    <legend>Personalia:</legend>
		    Nome: <input name="nome"  type="text"><br>
		    Email: <input name="email" type="text"><br>
		    <input type="submit">
		  </fieldset>
		
		
		<jsp:useBean id="pessoa"  class="br.com.webdeveloper.tags.Employee">
<%-- 		   <jsp:setProperty name="pessoa" property="pessoa.salario"    /> --%>
		   <jsp:setProperty   name="pessoa" property="email" />
		</jsp:useBean>
</form>

	<jsp:useBean id="nomeDoMeuUserBean"
		class="br.com.webdeveloper.tags.Tags"
		type="br.com.webdeveloper.tags.Tags" scope="page">
	</jsp:useBean>

	<jsp:setProperty name="nomeDoMeuUserBean" property="nome" value="lucas" />

	<jsp:getProperty name="nomeDoMeuUserBean" property="nome" />
	

	<%=request.getAttribute("key") %>
	
     <!-- Nome do atributo que vem do  request é person. -->
     <jsp:useBean  id="person"    scope="request"  type="br.com.webdeveloper.tags.Person"   class="br.com.webdeveloper.tags.Employee">
        
        <jsp:setProperty name="person" property="nome" value="se n;ao existi cria para mim" />
     </jsp:useBean>
     
     <jsp:getProperty property="nome" name="person"/>
     <hr>
     
     <!--  EL -->
     
     ${person.nome} <br>
     ${person[nome]} <br>
     <br>
     ${mylist["1"]}
     ${mylist[2]}
     <br>
     cidade 1 : 
     ${maymap["2"]} -
     Cidade 2  <br>
     
     ${maymap[ indece[1] ]}
     ${maymap[ indece[2]+ 1 ]}
     ${maymap[ indece["4"] ] }
     ${maymap[ indece[ indece[3] ]  ] }
     
     
</body>
</html>