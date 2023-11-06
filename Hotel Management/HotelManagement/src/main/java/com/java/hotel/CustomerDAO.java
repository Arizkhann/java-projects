package com.java.hotel;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDAO {

List<Customer> showCustomerDAO() throws ClassNotFoundException, SQLException;

String addCustomerDAO(Customer customer) throws ClassNotFoundException, SQLException;
	
}
