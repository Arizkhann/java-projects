package com .java.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Session Bean implementation class HmsBean
 */
@Stateless
@Remote(HmsBeanRemote.class)
public class HmsBean implements HmsBeanRemote {

	@PersistenceContext(unitName="EmpMgmtPU") 
	private EntityManager entityManager;
	
    /**
     * Default constructor. 
     */
    public HmsBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<Doctor> showDoctor() {
		System.out.println("Entity Manager is "+entityManager);
		Query query=entityManager.createQuery("SELECT a from Doctor a");
		return(List<Doctor>)query.getResultList();
	}

}
