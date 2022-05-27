package com.Thaitheyasudan.pojo;

import java.sql.Date;

public class restaurants {
   private int Restaurant_No;
   private String RestaurantName;
   private String Food_Types;
   private long Phone_number;
   private String city;
   private Date offer;
public int getRestaurant_No() {
	return Restaurant_No;
}
public void setRestaurant_No(int restaurant_No) {
	Restaurant_No = restaurant_No;
}
public String getRestaurantName() {
	return RestaurantName;
}
public void setRestaurantName(String restaurantName) {
	RestaurantName = restaurantName;
}
public String getFood_Types() {
	return Food_Types;
}
public void setFood_Types(String food_Types) {
	Food_Types = food_Types;
}
public long getPhone_number() {
	return Phone_number;
}
public void setPhone_number(long phone_number) {
	Phone_number = phone_number;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Date getOffer() {
	return offer;
}
public void setOffer(Date offer) {
	this.offer = offer;
}
}
