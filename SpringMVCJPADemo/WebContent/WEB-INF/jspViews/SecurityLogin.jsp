<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Security Login Page</title>

</head>
<body >

<center>
	<h1>Employee Management Secure and Validate Login Form [Custom]</h1>

						<c:if test="${param.error != null}"><%--Display the exception or error message if req param "error" exists --%>
									Invalid username and password.
									<!-- to display error message due to multiple login from one principal  -->
									<h2 style="color:red">
										<c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}"/>
									</h2>
							</c:if>
							<c:if test="${param.logout != null}"><%--Display the success message if req param "logout" exists --%>
									You have been logged out successfully.
							</c:if>

		<h2>Login with Username and Password</h2>

		<form name='loginForm' action="<c:url value='/cstValidateSecureLogin'/>" method='POST'>

		  <table border="2">
			<tr>
				<td>User:</td>
				<td><input type='text' name='msd_uname123' ></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='msd_pwd123' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="submit" /></td>
			</tr>
		  </table>

		 <%--  <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" /> --%>

		</form>
		<a href="index.jsp">Home</a>
</center>
</body>
</html>