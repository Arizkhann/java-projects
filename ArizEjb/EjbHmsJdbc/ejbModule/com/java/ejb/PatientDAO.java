package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

public interface PatientDAO {

	List<PatientMaster> showPatientDao() throws SQLException, ClassNotFoundException;
	
	String addPatient(PatientMaster patient) throws ClassNotFoundException, SQLException;
}
