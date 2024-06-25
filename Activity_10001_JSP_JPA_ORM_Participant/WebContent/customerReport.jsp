<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Report</title>
</head>
<body>
<center>
<h2> Customer Report</h2>

<table border="1">
    <tr>
        <th>Customer ID</th>
        <th>Customer Name</th>
        <th>Purchase Date</th>
        <th>Bill</th>
    </tr>
    
    <!-- Retrieve and display customer details here -->
    <% 
        try {
            // Retrieve customer details from the service layer
            com.accenture.lkm.service.CustomerService customerService = com.accenture.lkm.utility.Factory.createCustomerService();
            java.util.List<com.accenture.lkm.businessbean.CustomerBean> customerList = customerService.getCustomerDetails();
            
            // Loop through each customer and display their details in a row
            for (com.accenture.lkm.businessbean.CustomerBean customer : customerList) {
                out.println("<tr>");
                out.println("<td>" + customer.getCustomerId() + "</td>");
                out.println("<td>" + customer.getCustomerName() + "</td>");
                out.println("<td>" + customer.getPurchaseDate() + "</td>");
                out.println("<td>" + customer.getBill() + "</td>");
                out.println("</tr>");
            }
        } catch (Exception e) {
            out.println("<tr><td colspan='4'>Error retrieving customer details: " + e.getMessage() + "</td></tr>");
            e.printStackTrace();
        }
    %>
</table>

<br>
<a href="index.jsp">Home</a>

</center>
</body>
</html>
