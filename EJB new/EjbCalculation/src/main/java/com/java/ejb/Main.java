package com.java.ejb;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Main {
	public static void main(String[] args) {

	try {

		CalculationBeanRemote service =

				(CalculationBeanRemote) new InitialContext().lookup("CalculationBean/remote");

		System.out.println(service.sum(12,4));

		System.out.println(service.sub(10,4));

		System.out.println(service.mult(12,4));

	} catch (NamingException e) {

		// TODO Auto-generated catch block

		e.printStackTrace();

	}
	
	}
	
}
