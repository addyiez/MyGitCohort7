<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1> Registration Form</h1>

<sf:form action="save.html" method="POST" modelAttribute="usr">
<table>
<tr>
<td>Enter Username</td>
<td><sf:input path="Username"/></td>
<td><sf:errors path="Username" cssStyle="color:red"/></td>
</tr>

<tr>
<td>Enter Password</td>
<td><sf:password path="password"/></td>
<td><sf:errors path="password" cssStyle="color:red"/></td>
</tr>

<tr>
<td>Enter Gender</td>
<td>
    <sf:radiobutton path="gender" value="male"/>Male
    <sf:radiobutton path="gender" value="female"/>Female
</td>
<td><sf:errors path="gender" cssStyle="color:red"/></td>
</tr>

<tr>
<td>Enter Date Of Birth</td>
<td><sf:input path="dateOfBirth"/></td>
<td><sf:errors path="dateOfBirth" cssStyle="color:red"/></td>
</tr>

<tr>
<td>Enter Email ID </td>
<td><sf:input path="email"/></td>
<td><sf:errors path="email" cssStyle="color:red"/></td>
</tr>

<tr>
<td>Select Your Skills</td>
<td>
    <sf:checkbox path="skills" value="java"/>Java
    <sf:checkbox path="skills" value="spring"/>Spring
    <sf:checkbox path="skills" value="hibernate"/>Hibernate
    <sf:checkbox path="skills" value="hybris"/>Hybris Commerce
 </td>
<td><sf:errors path="skills"/></td>
</tr>

<tr>
<td>Select Your City</td>
<td>
    <sf:select path="city">
     <sf:option value="mysore">Mysore</sf:option>
     <sf:option value="bangaore">Bangalore</sf:option>
     <sf:option value="mumbai">Mumbai</sf:option>
     <sf:option value="pune">Pune</sf:option>
    </sf:select> 
</td>
<td><sf:errors path="city"/></td>

<tr>
 <td>
 <input type="submit" value="Register"/>
 </td>
 <td>
 <input type="reset" value="Clear"/>
 </td>
</tr>
</table>
</sf:form>
</center>
</body>
</html>