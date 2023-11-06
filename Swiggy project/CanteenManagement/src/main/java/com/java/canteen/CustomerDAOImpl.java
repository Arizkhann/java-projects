package com.java.canteen;

import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class CustomerDAOImpl {

	SessionFactory sf;

	Session session;

	

	public String signUpDao(Customer customer) {

		String encr = EncryptPassword.getCode(customer.getCusPassword());

		
		SessionFactory sf = SessionHelper.getConnection();

		Session session = sf.openSession();
		
		Map<String,Object> sessionmap= 
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();


		Criteria cr = session.createCriteria(Customer.class);

		

		cr.add(Restrictions.eq("cusUserName",customer.getCusUserName()));

		cr.setProjection(Projections.rowCount());

		long usernameCount = (Long) cr.uniqueResult();

		if(usernameCount >0) {

			System.out.println("Exit");

			return "UserName already exist";

		}

		customer.setCusPassword(encr.trim());

		session.beginTransaction();

		session.save(customer);

		session.getTransaction().commit();

		

		String subject = "Welcome to My app";

		String messageText = "Hello,\n\nThank you for signing up for YourApp. Your account has been successfully created.";

		MailSend.mailOtp(customer.getCusEmail(), subject, messageText);

		

		return "LoginCustomer.jsp?faces-redirect=true";

	}
	
	

	public List<Customer> showCustomerDao(){

		SessionFactory sf = SessionHelper.getConnection();

		Session session = sf.openSession();

		Criteria cr = session.createCriteria(Customer.class);

		return cr.list();
	
	
}
	public String searchCustomerByUserName(){

		 

		Map<String,Object> sessionMap =

				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();

		String cname = (String)sessionMap.get("cusUser");

		System.out.println(cname);

		sf= SessionHelper.getConnection();

		session = sf.openSession();

		 Criteria criteria = session.createCriteria(Customer.class);

		 criteria.add(Restrictions.eq("cusUserName",cname));

		 Customer customerFound = (Customer)criteria.uniqueResult();

		 System.out.println("Customer Data " +customerFound);

		 sessionMap.put("sessionCustomer", customerFound);

         return "ShowCustomer.jsp?faces-redirect=true";

       }
	
	
}
