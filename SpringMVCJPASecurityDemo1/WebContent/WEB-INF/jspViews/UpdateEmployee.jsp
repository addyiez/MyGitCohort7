<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Employee Page</title>
<style>
.error {
color: #ff0000;
font-style: italic;
}
</style>
</head>
<body>
<center>
<h2>Update Employee Details</h2>
<h3>Welcome : ${pageContext.request.userPrincipal.name} | <a href="<c:url value="/cstlogout" />" > Logout</a></h3>
<form:form modelAttribute="empObj" method="POST"
action="LoadUpdateEmployee2.html">
<br>
<table border="2">
<tr>
<th>Employee ID</th>
<td><form:input path="id" onchange="submit()"/></td>

</tr>
</table>
</form:form>
<c:if test="${not empty empObj2 && message==null }">
<h3>Below are the details of Employee</h3>
<form:form modelAttribute="empObj2" method="POST"
action="UpdateEmployee.html">
<table border="2">
<tr>
<th>Employee Name</th>
<td>
<form:input path="name"/>
</td>
</tr>
<tr>
<th>Role</th>
<td>
<form:select path="role">
<form:option value="" label="--Select--"></form:option>
<form:option value="TL" label="TeamLead"></form:option>
<form:option value="M" label="Manager"></form:option>
<form:option value="SM" label="Senior manager"></form:option>
<form:option value="SSE" label="Senior Software Engineer"></form:option>
<form:option value="AM" label="Associate manager"></form:option>
</form:select>
</td>
</tr>
<tr>
<th>
Salary </th>
<td>
<form:input path="salary"/>
</td>
</tr>
<tr>
<th>Employee DOJ</th>
<td>
<form:input path="insert_time"/>
</td>
</tr>
</table>
<input type="submit" value="Update">
</form:form>
</c:if>
</center>
</body>
</html>