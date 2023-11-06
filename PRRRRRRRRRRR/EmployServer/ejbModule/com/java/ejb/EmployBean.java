package com.java.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Session Bean implementation class EmployBean
 */
@Stateless
@Remote(EmployBeanRemote.class)
public class EmployBean implements EmployBeanRemote {

	@PersistenceContext(unitName="EmploySir")
	private EntityManager entityManager;
	
    /**
     * Default constructor. 
     */
    public EmployBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<Employ> showEmployDao() {
		
		System.out.println("Entity manager is"+entityManager);
		Query query=entityManager.createQuery("Select e from Employ e");
		
		return(List<Employ>) query.getResultList();
		
	}

	@Override
	public String addEmployDao(Employ employ) {
		
		System.out.println("Entity Manager is "+entityManager);
		entityManager.merge(employ);
		return "ShowEmploy.jsp? faces-redirect=true";
		
		
		
	}

}
