package com.java.otp;

public class SignUp {
	private int Cust_ID;
	private String customer_Firstname;
	private String customer_LastName;
	private String customer_UserName;
	private String customer_Password;
	private String customer_Email ;
	private String customer_PhoneNo;
	private String Customer_Status;
	private String Customer_ActivatedOn;
	public SignUp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SignUp(int cust_ID, String customer_Firstname, String customer_LastName, String customer_UserName,
			String customer_Password, String customer_Email, String customer_PhoneNo, String customer_Status,
			String customer_ActivatedOn) {
		super();
		Cust_ID = cust_ID;
		this.customer_Firstname = customer_Firstname;
		this.customer_LastName = customer_LastName;
		this.customer_UserName = customer_UserName;
		this.customer_Password = customer_Password;
		this.customer_Email = customer_Email;
		this.customer_PhoneNo = customer_PhoneNo;
		Customer_Status = customer_Status;
		Customer_ActivatedOn = customer_ActivatedOn;
	}
	@Override
	public String toString() {
		return "Login [Cust_ID=" + Cust_ID + ", customer_Firstname=" + customer_Firstname + ", customer_LastName="
				+ customer_LastName + ", customer_UserName=" + customer_UserName + ", customer_Password="
				+ customer_Password + ", customer_Email=" + customer_Email + ", customer_PhoneNo=" + customer_PhoneNo
				+ ", Customer_Status=" + Customer_Status + ", Customer_ActivatedOn=" + Customer_ActivatedOn + "]";
	}
	public int getCust_ID() {
		return Cust_ID;
	}
	public void setCust_ID(int cust_ID) {
		Cust_ID = cust_ID;
	}
	public String getCustomer_Firstname() {
		return customer_Firstname;
	}
	public void setCustomer_Firstname(String customer_Firstname) {
		this.customer_Firstname = customer_Firstname;
	}
	public String getCustomer_LastName() {
		return customer_LastName;
	}
	public void setCustomer_LastName(String customer_LastName) {
		this.customer_LastName = customer_LastName;
	}
	public String getCustomer_UserName() {
		return customer_UserName;
	}
	public void setCustomer_UserName(String customer_UserName) {
		this.customer_UserName = customer_UserName;
	}
	public String getCustomer_Password() {
		return customer_Password;
	}
	public void setCustomer_Password(String customer_Password) {
		this.customer_Password = customer_Password;
	}
	public String getCustomer_Email() {
		return customer_Email;
	}
	public void setCustomer_Email(String customer_Email) {
		this.customer_Email = customer_Email;
	}
	public String getCustomer_PhoneNo() {
		return customer_PhoneNo;
	}
	public void setCustomer_PhoneNo(String customer_PhoneNo) {
		this.customer_PhoneNo = customer_PhoneNo;
	}
	public String getCustomer_Status() {
		return Customer_Status;
	}
	public void setCustomer_Status(String customer_Status) {
		Customer_Status = customer_Status;
	}
	public String getCustomer_ActivatedOn() {
		return Customer_ActivatedOn;
	}
	public void setCustomer_ActivatedOn(String customer_ActivatedOn) {
		Customer_ActivatedOn = customer_ActivatedOn;
	}
	
	
	
	
}
