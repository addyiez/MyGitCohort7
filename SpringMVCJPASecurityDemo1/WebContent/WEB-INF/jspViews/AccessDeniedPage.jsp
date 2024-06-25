<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<%session.invalidate(); %>
	<h3>Logged in User: ${pageContext.request.userPrincipal.name} is not authorized to access the page</h3>
	<h4><a href="${pageContext.request.contextPath}/index.jsp"> Try Again</a></h4>
	
		
</center>
</body>
</html>