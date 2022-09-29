<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%--  <%@ taglib prefix="dat152" uri="dat152-tags"%> --%>

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
		<p>
			<fmt:message key="Greetings" />
		</p>
		
		<a href="productsServlet"> 
			<fmt:message key="Products" />
		</a>

	</fmt:bundle>
<!-- <dat152:RomanNumeral since="2008"/> -->
</body>
</html>
