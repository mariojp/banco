<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<jsp:useBean id="sala" class="br.edu.ucsal.chat.model.Sala" scope="application" /> 

</head>
<body>


<form action="ChatController"  method="post">
<input type="text" name="usuario">
<input type="submit" value="Entrar">

</form>

</body>
</html>