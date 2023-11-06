package com.java.canteen;

public class Menu {

	
	private int menId;

	 

	private String menItem;

 

	private Double menPrice;

 

	private int restaurantID;

 

	private Double menCalories;

 

	private String menSpeciality;



	public int getMenId() {
		return menId;
	}



	public void setMenId(int menId) {
		this.menId = menId;
	}



	public String getMenItem() {
		return menItem;
	}



	public void setMenItem(String menItem) {
		this.menItem = menItem;
	}



	public Double getMenPrice() {
		return menPrice;
	}



	public void setMenPrice(Double menPrice) {
		this.menPrice = menPrice;
	}



	public int getRestaurantID() {
		return restaurantID;
	}



	public void setRestaurantID(int restaurantID) {
		this.restaurantID = restaurantID;
	}



	public Double getMenCalories() {
		return menCalories;
	}



	public void setMenCalories(Double menCalories) {
		this.menCalories = menCalories;
	}



	public String getMenSpeciality() {
		return menSpeciality;
	}



	public void setMenSpeciality(String menSpeciality) {
		this.menSpeciality = menSpeciality;
	}



	@Override
	public String toString() {
		return "Menu [menId=" + menId + ", menItem=" + menItem + ", menPrice=" + menPrice + ", restaurantID="
				+ restaurantID + ", menCalories=" + menCalories + ", menSpeciality=" + menSpeciality + "]";
	}



	public Menu(int menId, String menItem, Double menPrice, int restaurantID, Double menCalories,
			String menSpeciality) {
		super();
		this.menId = menId;
		this.menItem = menItem;
		this.menPrice = menPrice;
		this.restaurantID = restaurantID;
		this.menCalories = menCalories;
		this.menSpeciality = menSpeciality;
	}


	

	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
