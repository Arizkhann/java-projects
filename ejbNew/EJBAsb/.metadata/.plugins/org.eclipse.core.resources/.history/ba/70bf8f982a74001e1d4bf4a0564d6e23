package com.java.ejb;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class InsuranceDAOImpl implements InsuranceDAO {

	SessionFactory sf;
	Session session;
	
	@Override
	public List<InsuranceDetails> showInsurance() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(InsuranceDetails.class);
		return cr.list();
	}

}
