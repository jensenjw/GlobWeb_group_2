<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
		<ul>
			<jsp:include page="navbar.jsp" />
		</ul>
		<h1>
			Product works
		</h1>

	</fmt:bundle>

</body>
</html>
