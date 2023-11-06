package com.java.ejb;

import java.util.List;
import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class CustomerDAOImpl implements CustomerDAO {

	
	SessionFactory sf;
	Session session;
	
	public static int generateOtp() {
		Random r = new Random(System.currentTimeMillis());
		return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
	}
	
	public CustomerAuthorization searchUsername(String userName) {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(CustomerAuthorization.class);
		cr.add(Restrictions.eq("userName", userName));
		CustomerAuthorization custauth = (CustomerAuthorization) cr.uniqueResult();
		return custauth;
	}
	
	public String verifyOtp(CustomerAuthorization custauth) {
		System.out.println("Inside verifyotp");
		SessionFactory sf = SessionHelper.getConnection();
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(CustomerAuthorization.class);
		cr.add(Restrictions.eq("userName", custauth.getUserName()));
		Projection projection = Projections.property("otp");
		cr.setProjection(projection);
		String otp = (String)cr.uniqueResult();
		String pass = custauth.getPassWord();
		String pwd = EncryptPassword.getCode(pass);
		
		session.close();
		sf.close();
		if(otp.equals(custauth.getOtp())) {
			CustomerAuthorization custFound = searchUsername(custauth.getUserName());
			custFound.setPassWord(pwd);
			custFound.setStatus("ACTIVE");
			sf = SessionHelper.getConnection();
			session = sf.openSession();
			Transaction trans = session.beginTransaction();
			session.update(custFound);
			trans.commit();
			return "CreatePassword.jsp?faces-redirect=true";
		}
		else {
			return "Hello.jsp.jsp?faces-redirect=true";
		}
	} 
	@Override
	public String addCustomer(Customer customer) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Transaction trans = session.beginTransaction();
		customer.setStatus("PENDING");
		session.save(customer);
		trans.commit();
		
		int otp = generateOtp();
		String body = "Welcome to Mr/Miss  " + customer.getFirstName() + "\r\n" + "Your OTP Generated Successfully..."
				+ "\r\n" + "OTP is " + otp;
		MailSend.mailOtp(customer.getEmail(), "Otp Send Successfully...", body);
		
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Transaction trans2 = session.beginTransaction();
		CustomerAuthorization cust = new CustomerAuthorization();
		cust.setCustId(customer.getCustId());
		cust.setUserName(customer.getUserName());
		cust.setOtp(String.valueOf(otp));
		session.save(cust);
		session.getTransaction().commit();		
		return "OtpVerification.jsp?faces-redirect=true";
	}

	@Override
	public List<Customer> showCustomer() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr =session.createCriteria(Customer.class);
		return cr.list();
		
	}

}
