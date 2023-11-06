package com.java.ejb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Doctor_Master")
public class Doctor implements Serializable  {


	@Id
	@GeneratedValue
	@Column(name="dr_id")
	private String drId;
	
	@Column(name="dr_name")
	private String drName;
	
	@Column(name="dept")
	private String dept;
	
	public String getDrId() {
		return drId;
	}
	public void setDrId(String drId) {
		this.drId = drId;
	}
	public String getDrName() {
		return drName;
	}
	public void setDrName(String drName) {
		this.drName = drName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "DoctorMaster [drId=" + drId + ", drName=" + drName + ", dept=" + dept + "]";
	}
	public Doctor(String drId, String drName, String dept) {
		super();
		this.drId = drId;
		this.drName = drName;
		this.dept = dept;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
