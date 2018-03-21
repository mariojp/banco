<%@ page language="java" %>
<!DOCTYPE html >
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<form action="" method="post" >

Usuario: <input type="text" id="user" name="u" ><br>
Senha: <input type="password" id="pass" name="p" ><br>
<button type="submit">Enviar</button>


<%

System.out.println("Servidor");

String usuario = request.getParameter("u");
System.out.println("Usuario: "+usuario);

//out.print("Usuario: "+usuario);
%>

<%="Usuario: "+usuario%>

</form>
</body>
</html>