package com.java.hib;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmployInsertMain {

	
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Employ employ=new Employ();
		System.out.println("enter employ no");
		employ.setEmpno(sc.nextInt());
		System.out.println("enter employ name");
		employ.setName(sc.next());
		System.out.println("enter gender(male/female)");
		employ.setGender(Gender.valueOf(sc.next()));
		System.out.println("enter DEPARTMENT");
		employ.setDept(sc.next());
		System.out.println("enter Designation");
		employ.setDesig(sc.next());
		System.out.println("enter Basic");
		employ.setBasic(sc.nextDouble());
		
		EmployDAO dao=new EmployDAOImpl();
		System.out.println(dao.addEmployDAO(employ));
		
	
}
}