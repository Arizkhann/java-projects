package com.java.hib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class EmployDAOImpl implements EmployDAO {

	SessionFactory sf;
	Session session;
	
	public List<Employ> showEmployCr(){
		sf=SessionHelper.getConnection();
		session=sf.openSession();
		Criteria cr=session.createCriteria(Employ.class);
		cr.addOrder(Order.asc("basic"));
		List<Employ> employList=cr.list();
		return employList;
		
	}
	public Employ searchEmployCr(int empno) {
		
		sf=SessionHelper.getConnection();
		session=sf.openSession();
		Criteria cr=session.createCriteria(Employ.class);
		cr.add(Restrictions.eq( "empno",empno));
		Employ employ=(Employ)cr.uniqueResult();
		return employ;
	
	}
	
	
	
	
	
	@Override
	public List<Employ> showEmployDAO() {
		sf=SessionHelper.getConnection();
		session=sf.openSession();
		Query query=session.createQuery("from Employ");
		List<Employ> employList=query.list();
		return employList;
	}


	@Override
	public Employ searchEmployDAO(int empno) {
		
		sf=SessionHelper.getConnection();
		session=sf.openSession();
		Query query=session.createQuery("from Employ where empno="+empno);
		List<Employ> employList=query.list();
		
		if(employList.size()>0) {
		
			return employList.get(0);
			
		}
		return null;
		
	}


	@Override
	public String addEmployDAO(Employ employ) {

		sf=SessionHelper.getConnection();
		session=sf.openSession();
		Transaction trans=session.beginTransaction();
		session.save(employ);
		trans.commit();
		return"employ record inserted...";
		
		
		
	}


	@Override
	public String deleteEmployDAO(int empno) {
		
		Employ employFound=searchEmployDAO(empno);
		if(employFound!=null) {
			sf=SessionHelper.getConnection();
			session=sf.openSession();
			Transaction trans=session.beginTransaction();
			session.delete(employFound);
			trans.commit();
			return "Employ record Deleted";
			
		}
		return "Employ record Not found";
		
	}

}
