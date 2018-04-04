<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<html>
<head>
<title>Listar</title>

<jsp:useBean id="lista" class="java.util.ArrayList" scope="application"></jsp:useBean>
</head>
<body>


	<a href="Novo">Novo</a>
	
	<select name="selecao"> 
		<option>
		
	</select>

	<table>
		<tr>
			<th>Login:</th>
			<th>Senha:</th>
			<th></th>
			
		</tr>
		<c:forEach items="${lista}" var="u">
		<tr>
			<td>${u.login}</td>
			<td>${u.senha}</td>
			<td><a href="Delete?id=${u.login}" >X</a></td>
			<td><a href="Novo?id=${u.login}" >A</a></td>
		</tr>
		</c:forEach>
	</table>
	
	
	
	<display:table  name="${lista}" >
		<display:column property="login"  title="Login:"/>
		<display:column property="senha" title="Senha:" /> 
		<display:column href="Novo" paramId="id" paramProperty="login" >A</display:column>> 
		  
		
	</display:table>
	
</body>
</html>