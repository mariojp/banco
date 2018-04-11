<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<jsp:useBean id="sala" class="br.edu.ucsal.chat.model.Sala" scope="application" /> 
<jsp:useBean id="usuario" class="br.edu.ucsal.chat.model.Usuario" scope="session" />
</head>
<body>

<textarea name="area" cols="50" rows="30" >
<%=usuario.mensagens()%>
</textarea>

<%=usuario%>
<%=sala.getUsuarios().size() %>
<form action="MensagemController" method="post">
<select name="destinatario" > 
	<option value="TODOS" >TODOS</option>
	<c:forEach var="u" items="${sala.usuarios}">
		<option value="${u}" >${u}</option>
	</c:forEach>
</select>
<input type="text" name="mensagem" value="">
<button type="submit">Enviar</button>
</form>

</body>
</html>