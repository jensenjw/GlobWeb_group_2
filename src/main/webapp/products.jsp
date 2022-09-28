<%@page import="models.Product"%>
<%@page import="java.util.ArrayList"%>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>



<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Group 2</title>
</head>

<body>
	<p><jsp:include page="chooseLanguage.jsp" /></p>
	<ul> 
		<jsp:include page="navbar.jsp" />
	</ul>
	<fmt:bundle basename="language.Messages">
		<h1>
			Product works
		</h1>
		<table>
		
		<c:forEach var="p" items="${products}">
			<tr>
				<td>${p.pNo}</td>
				<td>${p.pName}</td>
				<td>${p.priceInEuro}</td>
				<td><img src="${p.imageFile}" alt="${p.pName}"></td>
				<td>${p.description}</td>
				<td>
			<form action=cart method="post">
				<input type="text">
				<button name="addToCart" value="${p}" type="submit"></button>
			</form>
				</td>
				</tr>
		</c:forEach>
	</table>

	</fmt:bundle>

</body>
</html>
