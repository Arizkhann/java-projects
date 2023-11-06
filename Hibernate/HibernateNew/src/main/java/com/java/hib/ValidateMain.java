package com.java.hib;

public class ValidateMain {

	public static void main(String[] args) {
		Login log=new Login();
		log.setUserName("AMIT");
		log.setPassCode("amit");
		Login login=new LoginDAOImpl().authenticate(log);
		if(login!=null) {
			System.out.println("correct");
		}
		else {
			System.out.println("invalid");
		}
	}
	
}
