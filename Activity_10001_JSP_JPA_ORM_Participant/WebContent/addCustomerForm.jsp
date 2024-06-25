<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Customer Form</title>
</head>
<body>
<center>
<h2> Add Customer Form</h2>

<form action="addCustomer.jsp" method="post">
    <table>
        <tr>
            <td>Customer Name:</td>
            <td><input type="text" name="customerName" required></td>
        </tr>
        <tr>
            <td>Purchase Date:</td>
            <td><input type="date" name="purchaseDate" required></td>
        </tr>
        <tr>
            <td>Bill:</td>
            <td><input type="number" name="bill" required></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Add Customer"></td>
        </tr>
    </table>
</form>

<br>
<a href="index.jsp">Home</a>

</center>
</body>
</html>
