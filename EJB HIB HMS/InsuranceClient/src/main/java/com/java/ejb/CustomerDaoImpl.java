package com.java.ejb;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustomerDaoImpl implements CustomerDao{


	SessionFactory sf ;
	Session session;
	
	
	
	@Override
	public List<Customer> showCustomer() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(Customer.class);
		
		List<Customer> list = cr.list();
		return list	;
		
	}



	@Override
	public String addCustomer(Customer customer) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.save(customer);
		trans.commit();
		return "ShowCustomer.jsp?faces-redirect=true";
	}
	
	}


