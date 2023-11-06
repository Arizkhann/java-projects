package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

public class PatientEjbImpl {

	public List<PatientMaster> showPatientEjb() throws ClassNotFoundException, SQLException, NamingException{
		
		HmsEjbBeanRemote remote=
							RemoteHelper.lookupRemoteStatelessEmploy();
		return remote.showPatient();
		
		}
	
public String addPatientEjb(PatientMaster patient) throws NamingException, ClassNotFoundException, SQLException {
		
		HmsEjbBeanRemote remote=
							RemoteHelper.lookupRemoteStatelessEmploy();
		 remote.addPatient(patient);
		 return "ShowPatient.jsp?faces-redirect=true";
	}
	
	
}
