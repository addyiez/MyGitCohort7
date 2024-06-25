<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Registration </title>
<style>
.error{
color:#ff0000;
font-style:italic;
}
</style>
</head>
<body>
<center>
<h2>Add Employee Details</h2>
<h3>Welcome : ${pageContext.request.userPrincipal.name} | <a href="<c:url value="/cstlogout" />" > Logout</a></h3>
<form:form modelAttribute="empObj" method="GET"
action="saveEmployee.html">
<br>
<table border="2">
<tr>
<th>EmployeeName</th>
<td><form:input path="name"/></td>
</tr>
<tr>
<th>Role</th>
<td>

<form:select path="role">
<form:option value="" label="---SELECT---"></form:option>
<form:option value="TL" label="TeamLead"></form:option>
<form:option value="SSE" label="Senior Software Engineer"></form:option>
<form:option value="M" label="Manager"></form:option>
<form:option value="SM" label="Senior Manager"></form:option>
<form:option value="AM" label="Associate Manager"></form:option>
</form:select>
</td>
</tr>
<tr>
<th>
Salary</th>
<td>
<form:input path="Salary"/>
</td>
</tr>
<tr>
<th>Employee DOJ </th>
<td>
<form:input path="insert_time"/>
</td>
</tr>
</table>
<input type="submit" value="Register">
</form:form>
</center>
</body>
</html>