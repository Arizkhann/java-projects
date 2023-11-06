package com.java.canteen;

public class Restaurant {

	
	private int restaurantID;

	private String restaurantName;

	private  String branch;

	private String city;

	private  String mobileNo;

	private String email;

	private Double rating;

	public int getRestaurantID() {
		return restaurantID;
	}

	public void setRestaurantID(int restaurantID) {
		this.restaurantID = restaurantID;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantID=" + restaurantID + ", restaurantName=" + restaurantName + ", branch=" + branch
				+ ", city=" + city + ", mobileNo=" + mobileNo + ", email=" + email + ", rating=" + rating + "]";
	}

	public Restaurant(int restaurantID, String restaurantName, String branch, String city, String mobileNo,
			String email, Double rating) {
		super();
		this.restaurantID = restaurantID;
		this.restaurantName = restaurantName;
		this.branch = branch;
		this.city = city;
		this.mobileNo = mobileNo;
		this.email = email;
		this.rating = rating;
	}

	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
