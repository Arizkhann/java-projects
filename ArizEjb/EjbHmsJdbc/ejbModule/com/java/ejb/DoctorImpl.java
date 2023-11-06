package com.java.ejb;

 

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;

import java.util.List;

 

import com.java.ejb.DoctorMaster;

 

public class DoctorImpl implements DoctorDAO{

 

	Connection connection;

	PreparedStatement pst;

	

	@Override

	public List<DoctorMaster> showDoctorDao() throws ClassNotFoundException, SQLException {

		connection = ConnectionHelper.getConnection();

		String cmd = "Select * from doctor_master";

		pst = connection.prepareStatement(cmd);

		ResultSet rs = pst.executeQuery();

		List<DoctorMaster> doctorList = new ArrayList<DoctorMaster>();

		DoctorMaster doctor = null;

		while(rs.next()) {

			doctor = new DoctorMaster();

			

			doctor.setDrId(rs.getString("dr_id"));

			doctor.setDrName(rs.getString("dr_name"));

			doctor.setDept(rs.getString("dept"));

			doctorList.add(doctor);

		

	}

		return doctorList;

 

 

}

}