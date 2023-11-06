<%@page import="com.java.hotel.Customer"%>
<%@page import="java.util.List"%>
<%@page import="com.java.hotel.CustomerDAOImpl"%>
<%@page import="com.java.hotel.CustomerDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
CustomerDAO dao=new CustomerDAOImpl();
List<Customer> customerList=dao.showCustomerDAO();
%>


<form  Method="get" action="CustomerShow.jsp">
	
	
		<table border="5" align="center">
		<tr>
			<th>CustomerId</th>
			<th>Customer Name</th>
			<th>Check In</th>
			<th>Check out</th>
			<th>Room no</th>
		</tr>
		<%
		for(Customer customer: customerList){
		%>
			<tr>
				<td><%=customer.getCustomerId() %></td>
				<td><%=customer.getCustomerName() %></td>
				<td><%=customer.getCheckIn() %></td>
				<td><%=customer.getCheckOut() %></td>
				<td><%=customer.getRoomNo() %></td>
			<td>
			<a href=CustomerUpdate.jsp?customerId=<%=customer.getCustomerId() %> >update</a>
			</td>
			<td>
			<a href=CustomerDelete.jsp?customerId=<%=customer.getCustomerId() %> >Delete</a>
			</td>
		</tr>
		
		<%
		}
		%>
		
		</table>
		<a href="CustomerAdd.jsp">Add Customer</a>
		
</form>


</body>
</html>