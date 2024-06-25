<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details within Date Range</title>
<style>
.cst_table {
	border: 1px solid black;
	border-collapse: collapse;
	width: 80%;
	margin: 20px auto;
}

.cst_table th, .cst_table td {
	border: 1px solid black;
	padding: 8px;
	text-align: left;
}
</style>
</head>
<body>
	<h2>Employee Details within Date Range</h2>

	<c:if test="${not empty employees}">
		<table class="cst_table">
			<tr>
				<th>Employee ID</th>
				<th>Name</th>
				<th>Role</th>
				<th>Insert Time</th>
				<th>Salary</th>
			</tr>
			<c:forEach items="${employees}" var="employee">
				<tr>
					<td>${employee.id}</td>
					<td>${employee.name}</td>
					<td>${employee.role}</td>
					<td><fmt:formatDate value="${employee.insertTime}"
							pattern="yyyy-MM-dd HH:mm:ss" /></td>
					<td>${employee.salary}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>

	<c:if test="${empty employees}">
		<p>No employees found within the specified date range.</p>
	</c:if>

</body>
</html>
