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
String customer =dao.addCustomerDAO(Customer cst);
%>
	<form  Method="get" action="CustomerAdd.jsp"/> <br><br>
		<center>
		Customer Id:
		<input type="number" name="customerId"/> <br><br>
		
		Customer Name:
		<input type="text" name="customerName"/><br><br>
		
		CheckIn Date: 
		<input type="date" name="checkIn"/><br><br>
		
		CheckOut Date: 
		<input type="date" name="checkOut"/><br><br>
		
		Room No:
		<input type="number" name="roomNo"/><br><br>
		
		<input type="submit" Value="ADD MEMBER"/>
		
		</center>
		
	</form>
</body>
</html>