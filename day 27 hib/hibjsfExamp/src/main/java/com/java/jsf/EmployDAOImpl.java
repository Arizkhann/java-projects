package com.java.jsf;

import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
//import org.hibernate.mapping.Map;

public class EmployDAOImpl {

	
	SessionFactory sf;
	Session session;
	
	
	
	
	private String localCode;
	
	
	public String getLocalCode() {
		return localCode;
	}




	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}
	public void employLocalCodeChanged(ValueChangeEvent e) {

		this.localCode=e.getNewValue().toString();

		

		

	}


	public List<Employ> showEmployDao(){
		SessionFactory sf=SessionHelper.getConnection();
		
		Session session=sf.openSession();
		Criteria cr=session.createCriteria(Employ.class);
		
		return cr.list();
		
		
		
	}
	
	

	public List<String> getDepartment(){
		SessionFactory sf=SessionHelper.getConnection();
		Session session=sf.openSession();
		Criteria cr=session.createCriteria(Employ.class);
		Projection projection=Projections.distinct(Projections.property("dept"));
		cr.setProjection(projection);
		List<String> list=cr.list();
		return list;
		
	}
	
	
	
	
	public List<String> getNames(){
		
		sf=SessionHelper.getConnection();
		session=sf.openSession();
		Criteria cr=session.createCriteria(Employ.class);
		System.out.println(cr.list().size());
		Projection projection=Projections.property("name");
		cr.setProjection(projection);
		List<String> list=cr.list();
		System.out.println("LIst of names are " +list);
		return list;
			
	}
	
	public List<Employ> getEmployListByDept(String dept){
		
		SessionFactory sf=SessionHelper.getConnection();
		session=sf.openSession();
	
		Criteria cr=session.createCriteria(Employ.class);
		cr.add(Restrictions.eq("dept", dept));
		List<Employ> employList=cr.list();
		return employList;
	}
	
	public String validateMe(Login login) {
		
		String encr=EncryptPassword.getCode(login.getPassCode());
		Map<String,Object> sessionMap=
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		
		SessionFactory sf=SessionHelper.getConnection();
		Session session=sf.openSession();
		Criteria cr=session.createCriteria(Login.class);

		cr.add(Restrictions.eq("userName", login.getUserName()));
		cr.add(Restrictions.eq("passCode", encr.trim()));
		cr.setProjection(Projections.rowCount());
		long count=(Long)cr.uniqueResult();
		if (count==1) {
			return"ShowDept.xhtml?faces-redirect=true";
		}
		else {
			
			sessionMap.put("errorMessage", "Invalid Credentials");
			return"Login.xhtml?faces-redirect=true";
		}
		
		
		
		
		
	}
	
	
	
	
	
}
