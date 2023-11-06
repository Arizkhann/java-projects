package com.java.ejb;

import java.io.Serializable;

import java.util.Date;

public class Customer implements Serializable {
	
	private int custId;
	private String firstName;
	private String lastName;
	private String gender;
	private Date dob;
	private String userName;
	private String password;
	private String status;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getdob() {
		return dob;
	}
	public void setdob(Date dob) {
		this.dob = dob;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", dob=" + dob + ", userName=" + userName + ", password=" + password + ", status=" + status
				+ "]";
	}
	public Customer(int custId, String firstName, String lastName, String gender, Date dob, String userName,
			String password, String status) {
		super();
		this.custId = custId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
		this.userName = userName;
		this.password = password;
		this.status = status;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
