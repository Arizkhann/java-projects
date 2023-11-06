package com.java.canteen;

public class Customer {

	
	private int cusID;
	private String cusName;
	private String cusPhoneNo;
	private String cusUserName;
	private String cusPassword;
	private String cusEmail;
	public int getCusID() {
		return cusID;
	}
	public void setCusID(int cusID) {
		this.cusID = cusID;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusPhoneNo() {
		return cusPhoneNo;
	}
	public void setCusPhoneNo(String cusPhoneNo) {
		this.cusPhoneNo = cusPhoneNo;
	}
	public String getCusUserName() {
		return cusUserName;
	}
	public void setCusUserName(String cusUserName) {
		this.cusUserName = cusUserName;
	}
	public String getCusPassword() {
		return cusPassword;
	}
	public void setCusPassword(String cusPassword) {
		this.cusPassword = cusPassword;
	}
	public String getCusEmail() {
		return cusEmail;
	}
	public void setCusEmail(String cusEmail) {
		this.cusEmail = cusEmail;
	}
	@Override
	public String toString() {
		return "Customer [cusID=" + cusID + ", cusName=" + cusName + ", cusPhoneNo=" + cusPhoneNo + ", cusUserName="
				+ cusUserName + ", cusPassword=" + cusPassword + ", cusEmail=" + cusEmail + "]";
	}
	public Customer(int cusID, String cusName, String cusPhoneNo, String cusUserName, String cusPassword,
			String cusEmail) {
		super();
		this.cusID = cusID;
		this.cusName = cusName;
		this.cusPhoneNo = cusPhoneNo;
		this.cusUserName = cusUserName;
		this.cusPassword = cusPassword;
		this.cusEmail = cusEmail;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
