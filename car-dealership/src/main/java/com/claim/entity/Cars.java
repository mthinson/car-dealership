package com.claim.entity;

public class Cars {

	private String make;
	private String model;
	private String price;
	private String description;
	private int year;
	private String color;
	private int milage;
	private String image;
	private int vin;
	private int days;
	private boolean forSale;


	public Cars() {

	}

	public Cars(String make, String model, String price, String description, int year, String color, int milage,
			String image, int vin, int days, boolean forSale) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
		this.description = description;
		this.year = year;
		this.color = color;
		this.milage = milage;
		this.image = image;
		this.vin = vin;
		this.days = days;
		this.forSale = forSale;

	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getVin() {
		return vin;
	}

	public void setVin(int vin) {
		this.vin = vin;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public boolean isForSale() {
		return forSale;
	}

	public void setForSale(boolean forSale) {
		this.forSale = forSale;
	}



	@Override
	public String toString() {
		return "Cars [make=" + make + ", model=" + model + ", price=" + price + ", description=" + description
				+ ", year=" + year + ", color=" + color + ", milage=" + milage + ", image=" + image + ", vin=" + vin
				+ ", days=" + days + ", forSale=" + forSale + "]";
	}
	

}
