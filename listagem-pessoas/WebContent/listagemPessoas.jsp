<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<title>Insert title here</title>
</head>
<body>

<table class="table table-striped">
		<c:forEach items="${requestScope.listaPessoas}" var="pessoa">
		<tr>
		<td><c:out value="${pessoa.nome}"></c:out></td>
		<td><c:out value="${pessoa.profissao}"></c:out></td>
		<td><c:out value="${pessoa.id}"></c:out></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>