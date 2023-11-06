package com.java.hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {

	Connection connection;
	PreparedStatement pst;
	
	
	@Override
	public List<Customer> showCustomerDAO() throws ClassNotFoundException, SQLException {
		
		List<Customer> customerList = new ArrayList<>();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
		connection=ConnectionHelper.getConnection();
		String cmd="select * from customer";
		pst=connection.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		Customer customer=null;
		while(rs.next()) {
			customer=new Customer();
			customer.setCustomerId(rs.getInt("customerId"));
			customer.setCustomerName(rs.getString("customerName"));
			customer.setCheckIn(rs.getDate("CheckIn"));
			customer.setCheckOut(rs.getDate("CheckOut"));
			customer.setRoomNo(rs.getInt("roomNo"));
			customerList.add(customer);
			
		}
		return customerList;
		
	}


	@Override
	public String addCustomerDAO(Customer customer) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into customer values(?,?,?,?,?)";
		pst=connection.prepareStatement(cmd);
		
		if(customer.getCustomerId()>0) {
			
			pst.setInt(1, customer.getCustomerId());
			pst.setString(2, customer.getCustomerName());
			pst.setDate(3, customer.getCheckIn());
			pst.setDate(4, customer.getCheckOut());
			pst.setInt(1, customer.getRoomNo());
			pst.executeUpdate();
		}
		return "Customer Added...";
	}

}
