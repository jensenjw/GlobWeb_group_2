<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cart</title>
</head>
<body>
	<p><jsp:include page="chooseLanguage.jsp" /></p>
	<fmt:bundle basename="i18n.Messages">
			<ul>
				<jsp:include page="navbar.jsp" />
			</ul>
			<h1>
				Your products
			</h1>
	
		
		<table>
			<c:forEach var="product" items="${products}">
				<tr>
					<td>${product.pno}</td>
					<td>${product.pName}</td>
					<td>${product.priceInEuro}</td>
					<td><img src="${product.imageFile}" alt="${product.pName}"></td>
					<td>${product.description}</td>
					<td>
				<form action=cart method="post">
					<button name="remove" value="${product}" type="submit"></button>
				</form>
					</td>
					</tr>
			</c:forEach>
		</table>
	</fmt:bundle>
</body>
</html>