package com.java.otp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Random;

public class SignUpDAOImpl implements SignUpDAO {

	PreparedStatement pst;
	Connection connection;
	
	public static int generateOtp() {
		Random r = new Random( System.currentTimeMillis() );
	    return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
	}
	
	@Override
	public String addCustomer(SignUp signup) throws ClassNotFoundException, SQLException {
		String userId = signup.getCustomer_UserName();
		SignUp customerFound = searchByUserName(userId);
		if (customerFound==null) {
			connection = ConnectionHelper.getConnection();
			customer.setStatus("OTP PENDING");
			String pwd = EncryptPassword.getCode(customer.getPassword());
			String cmd = "Insert into Customer(customer_Firstname,customer_LastName,customer_UserName,"
					+ "customer_Password,customer_Email,customer_PhoneNo,Customer_Status) values(?,?,?,?,?,?,?)";
			pst = connection.prepareStatement(cmd);
			pst.setString(1, customer.getFirstName());
			pst.setString(2, customer.getLastName());
			pst.setString(3, customer.getUserName());
			pst.setString(4, pwd);
			pst.setString(5, customer.getEmail());
			pst.setString(6, customer.getPhoneNo());
			pst.setString(7, customer.getStatus());
			pst.executeUpdate();
			int otp = generateOtp();
			Date obj = new Date();
			java.sql.Date sqlDate = new java.sql.Date(obj.getTime());
			cmd = "Insert into otp(customer_UserName,otpCode,GeneratedOn) values(?,?,?)";
			pst = connection.prepareStatement(cmd);
			pst.setString(1, customer.getUserName());
			pst.setInt(2, otp);
			pst.setDate(3, sqlDate);
			pst.executeUpdate();
			String body ="Welcome to Mr/Miss  " +customer.getFirstName() + "\r\n"+
					"Your OTP Generated Successfully..." +"\r\n" + 
					"OTP is " +otp;
			MailSend.mailOtp(customer.getEmail(), "Otp Send Succesfully...", body);
			return "User Created Successfully...";
		} else {
		// TODO Auto-generated method stub
		return "User-Name already Exists...";
		}
	}
	@Override
	public Customer searchByUserName(String userName) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Customer where customer_UserName=?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, userName);
		ResultSet rs = pst.executeQuery();
		SignUp signup = null;
		if (rs.next()) {
			signup = new SignUp();
			signup.setCustomerId(rs.getInt("Cust_ID"));
			signup.setFirstName(rs.getString("customer_Firstname"));
			signup.setLastName(rs.getString("customer_LastName"));
			signup.setUserName(rs.getString("customer_UserName"));
			signup.setPassword(rs.getString("customer_Password"));
			signup.setEmail(rs.getString("customer_Email"));
			signup.setPhoneNo(rs.getString("customer_PhoneNo"));
			signup.setStatus(rs.getString("Customer_Status"));
		}
		return customer;
	}

	
}
