<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<fmt:bundle basename="i18n.Messages">
	<li><a href="index.html"> 
			<fmt:message key="Home" />
		</a>
	</li>
	<li><a href="productsServlet"> 
			<fmt:message key="Products" />
		</a>
	</li>
	<li><a href="cartServlet"> 
			<fmt:message key="Cart" />
		</a>
	</li>
</fmt:bundle>