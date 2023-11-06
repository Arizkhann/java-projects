package com.java.ejb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class PatientImpl implements PatientDAO {

	
	Connection connection;
	PreparedStatement pst;
	
	
	@Override
	public List<PatientMaster> showPatientDao() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		connection = ConnectionHelper.getConnection();

		String cmd = "Select * from patient_master";

		pst = connection.prepareStatement(cmd);

		ResultSet rs = pst.executeQuery();

		List<PatientMaster> patientList = new ArrayList<PatientMaster>();

		PatientMaster patient = null;

		while(rs.next()) {

			patient = new PatientMaster();

			

			patient.setPid(rs.getString("pid"));

			patient.setName(rs.getString("name"));

			patient.setAge(rs.getInt("age"));

			patient.setWeight(rs.getInt("weight"));

			patient.setGender(rs.getString("gender"));

			patient.setAddress(rs.getString("address"));

			patient.setPhoneno(rs.getString("phoneno"));

			patient.setDisease(rs.getString("disease"));

			patient.setDrId(rs.getString("doctor_id"));

			

			patientList.add(patient);

			

		}

		return patientList;

	
	}


	@Override
	public String addPatient(PatientMaster patient) throws ClassNotFoundException, SQLException {
		
			connection = ConnectionHelper.getConnection();
			String cmd = "Insert into Patient_Master(pid,name,age,weight,gender,address,phoneno,disease,doctor_id) "
	         		+ " values(?,?,?,?,?,?,?,?,?)";
	        PreparedStatement pst = connection.prepareStatement(cmd);
	        pst.setString(1, patient.getPid());
	        pst.setString(2, patient.getName());
	        pst.setInt(3, patient.getWeight());
	        pst.setInt(4, patient.getAge());
	        pst.setString(5, patient.getGender());
	       
	        pst.setString(6, patient.getAddress());
	        pst.setString(7, patient.getPhoneno());
	        pst.setString(8, patient.getDisease());
	        pst.setString(9, patient.getDrId());
	        
	        
	        pst.executeUpdate();
	        return "Patient Record Inserted...";
		}
	

}
