<%@page import="br.com.alura.gerenciador.servlet.Empresa"%>
<%@page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	Lista de empresas: <br />
    <ul>
	    <%
	        List<Empresa> lista = (List<Empresa>)request.getAttribute("empresas");
	        for (Empresa empresa : lista) { 
	    %>
	        <li><%= empresa.getNome() %></li>
	    <%
	        }
	    %>
    </ul>



</body>
</html>