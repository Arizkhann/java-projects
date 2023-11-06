package com.java.ejb;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface PatientReportsBeanRemote {

	List<PatientReports> showPatientReportsDao();
	
	String addReport(PatientReports patientreport);
}
