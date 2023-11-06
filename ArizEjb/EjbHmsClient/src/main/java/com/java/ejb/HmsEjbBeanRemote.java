package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remote;

@Remote
public interface HmsEjbBeanRemote {

	List<DoctorMaster> showDoctor() throws ClassNotFoundException, SQLException;
	List<PatientMaster> showPatient() throws ClassNotFoundException, SQLException;
	
	String addPatient(PatientMaster patient) throws ClassNotFoundException, SQLException;
	
	
}
