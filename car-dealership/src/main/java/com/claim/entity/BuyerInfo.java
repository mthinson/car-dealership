package com.claim.entity;

public class BuyerInfo {

	private String firstName;
	private String lastName;
	private String email;
	private boolean bid;
	private Cars cars;
	private String amount;
	
	
	
	
	public BuyerInfo(String firstName, String lastName, String email, boolean bid, Cars cars, String amount) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.bid = bid;
		this.cars = cars;
		this.amount = amount;
		
	}
	
	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public BuyerInfo() {
		
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isBid() {
		return bid;
	}
	public void setBid(boolean bid) {
		this.bid = bid;
	}
	public Cars getCars() {
		return cars;
	}
	public void setCars(Cars cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "BuyerInfo [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", bid=" + bid
				+ ", cars=" + cars +  "]";
	}

	
}
