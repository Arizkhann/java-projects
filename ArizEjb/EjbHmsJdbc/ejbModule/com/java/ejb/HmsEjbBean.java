package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HmsEjbBean
 */
@Stateless
@Remote(HmsEjbBeanRemote.class)
public class HmsEjbBean implements HmsEjbBeanRemote {

	static DoctorDAO daoImpl;
	static PatientDAO patientImpl;
	static {
		daoImpl = new DoctorImpl();
		patientImpl=new PatientImpl();
	}
	
	
    public HmsEjbBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<DoctorMaster> showDoctor() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return daoImpl.showDoctorDao();
	}

	@Override
	public List<PatientMaster> showPatient() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return patientImpl.showPatientDao();
	}

	@Override
	public String addPatient(PatientMaster patient) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return patientImpl.addPatient(patient);
	}

}
