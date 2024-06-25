<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Customer</title>
</head>
<body>
<%@ page import="java.util.*"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="com.accenture.lkm.businessbean.CustomerBean"%>
<%@ page import="com.accenture.lkm.dao.*"%>
<%@ page import="com.accenture.lkm.entity.*"%>
<%@ page import="com.accenture.lkm.resources.*"%>
<%@ page import="com.accenture.lkm.service.*"%>
<%@ page import="com.accenture.lkm.utility.*"%>
<%
int id = 0;

try {
	 
	CustomerBean customerBean = new CustomerBean();

	String customerName = request.getParameter("customerName");
	String purchaseDateStr = request.getParameter("purchaseDate");
	double bill = Double.parseDouble(request.getParameter("bill"));

	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	Date purchaseDate = dateFormat.parse(purchaseDateStr);

	customerBean.setCustomerName(customerName);
	customerBean.setPurchaseDate(purchaseDate);
	customerBean.setBill(bill);

	CustomerServiceIMPL customerService = new CustomerServiceIMPL();

	id = customerService.addCustomer(customerBean);
} catch (Exception ex) {
	out.print("Exception " + ex);
}
%>
<center>
	<h3 style="color: green">
	<%="Customer Added Successfully, Customer Id " + id%>
	</h3>
    <br>
    <a href="index.jsp">Home</a>
</center>
</body>
</html>
