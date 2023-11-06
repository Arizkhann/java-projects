package com.java.ejb;

public class Dummy {
	public static void main(String[] args) {
		
		PatientReportsBeanRemote remote = new PatientReportsBean();
		
		System.out.println(remote.showPatientReportsDao());
	}

}
