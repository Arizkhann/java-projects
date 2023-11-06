package com.java.hib;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmployDeleteMain {

	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employ no");
		int empno=sc.nextInt();
		
	

		Configuration cfg=new AnnotationConfiguration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Query query = session.createQuery("from Employ where empno = "+empno);
		List<Employ> employList=query.list();
		if(employList.size()>0) {
			Employ employee=employList.get(0);
			Transaction tran=session.beginTransaction();
			session.delete(employee);
			tran.commit();
			System.out.println("...record deleted ");

		}else {
			System.out.println(" employ record not found..");
		}
}
}