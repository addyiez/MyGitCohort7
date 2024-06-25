<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>
</head>
<body>
<center>
<h1>LoginForm</h1>
<sf:form action="afterlogin.html" method="POST" modelAttribute="login">
Enter Username:<sf:input path="username"/>
<sf:errors path="username" cssStyle="color:red"></sf:errors><br><br>
Enter Password:<sf:password path="password"/>
<sf:errors path="password" cssStyle="color:red"></sf:errors><br><br>
<input type="submit" value="Login">
</sf:form>

</center>
</body>
</html>