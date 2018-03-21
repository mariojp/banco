<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="br.edu.ucsal.model.Usuario"%>
<html>
<head>
<title>Listar</title>
</head>
<body>


	<a href="Novo">Novo</a>

	<table>
		<tr>
			<th>Login:</th>
			<th>Senha:</th>
			<th></th>
			
		</tr>
		<%
		
		if(application.getAttribute("lista") == null ){
			application.setAttribute("lista", new ArrayList<Usuario>());
		}
		
		List<Usuario> usuarios = (List) application.getAttribute("lista");
		
		for(Usuario usuario : usuarios){ %>
		<tr>
			<td><%=usuario.getLogin()%></td>
			<td><%=usuario.getSenha()%></td>
			<td><a href="Delete?id=<%=usuario.getLogin()%>" >X</a></td>
			<td><a href="Novo?id=<%=usuario.getLogin()%>" >A</a></td>
		</tr>
		
		<% } %>
	</table>
</body>
</html>