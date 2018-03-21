<!DOCTYPE html >
<%@page import="br.edu.ucsal.model.Usuario"%>
<html>
<head>
<title>Formulario</title>
</head>
<body>
<form action="/aulaweb/Salvar" method="post">



<%Usuario u = (Usuario) request.getAttribute("usuario"); 
	if(u==null){
		u = new Usuario("");
		u.setSenha("");
	}
%>
<input type="hidden" name="id" value="<%=u.getLogin() %>">
Login: <input type="text" name="login" value="<%=u.getLogin() %>"><br>
Senha: <input type="password" name="senha" value="<%=u.getSenha()%>"><br>

<input type="submit" value="Salvar">
</form> 
</body>
</html>