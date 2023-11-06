package com.java.ejb;

import java.util.List;

import javax.naming.NamingException;

public interface PatientDao {

	List<Patient> showPatientDao();
	
	String addPatient(Patient patient) throws NamingException;
	

   
	
}
