package com.java.canteen;

 

import java.util.Map;

 

import javax.faces.context.FacesContext;

 

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

 

public class LoginDAOImpl {
		SessionFactory sf;
		Session session;

		public String validateMe(Login login) {
			String encr = EncryptPassword.getCode(login.getPassWord());
			Map<String,Object> sessionMap = 
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap();	

			SessionFactory sf = SessionHelper.getConnection();
			Session session = sf.openSession();
			Criteria cr = session.createCriteria(Customer.class);
			cr.add(Restrictions.eq("cusUserName", login.getUserName()));
			cr.add(Restrictions.eq("cusPassword", encr.trim()));

			cr.setProjection(Projections.rowCount());

			long  count =(Long)cr.uniqueResult();

			if (count==1) {
				sessionMap.put("cusUser",login.getUserName());
				return "DashBoard.jsp?faces-redirect=true";			
			} else {
				sessionMap.put("errorMessage", "Invalid Credentials...");
				return "Login.jsp?faces-redirect=true";
			}
		}
}