<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
     <%@ taglib uri="/WEB-INF/tlds/dat152.tld" prefix="dat152"%> 
    
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
				<fmt:message key="YourCart" />
			</h1>
	
		
		<table>
			<c:forEach var="p" items="${itemCart}" varStatus="loop">
				<tr>
					<td>${p.pno}</td>
					<td><fmt:message key="${p.pName}" /></td>
					<td>${p.priceInEuro}</td>
					<td><img src="${p.imageFile}" alt="<fmt:message key="${p.pName}" />"></td>
				<td><dat152:MaxLenght max="10"><fmt:message key="${p.description}" /></dat152:MaxLenght></td>
					<td>
				<form action=cartServlet method="post">
					<input type="hidden" name="remove_product" value="${loop.index}" />
					<button name="remove" type="submit"><fmt:message key="RemoveButton" /></button>
				</form>
					</td>
					</tr>
			</c:forEach>
		</table>
	</fmt:bundle>
	
	<br>
	 <dat152:RomanNumeral since="2020"></dat152:RomanNumeral> 
</body>
</html>