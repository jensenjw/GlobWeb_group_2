<%@page import="models.Product"%>
<%@page import="java.util.ArrayList"%>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri="/WEB-INF/tlds/dat152.tld" prefix="dat152"%> 



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
	<fmt:bundle basename="i18n.Messages">
		<h1>
			<fmt:message key="ShopName" />
		</h1>
		<table>
		
		<c:forEach var="p" items="${products}">
			<tr>
				<td>${p.pno}</td>
				<td><fmt:message key="${p.pName}" /></td>
				<td>${p.priceInEuro}</td>
				<td><img src="${p.imageFile}" alt="<fmt:message key="${p.pName}" />"></td>
				<td><dat152:MaxLenght max="10"><fmt:message key="${p.description}" /></dat152:MaxLenght></td>
				<td>
			<form action=productsServlet method="post">
				<input type="hidden" name="product_id" value="${p.pno}" />
				<button name="addToCart" type="submit"><fmt:message key="AddToCart" /></button>
			</form>
				</td>
				</tr>
		</c:forEach>
	</table>

	</fmt:bundle>
 <dat152:RomanNumeral since="2020"></dat152:RomanNumeral> 
</body>
</html>
