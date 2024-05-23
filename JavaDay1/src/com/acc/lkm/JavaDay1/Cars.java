package com.acc.lkm.JavaDay1;

public class Cars {
	
	private String color;
	private String model;
	private int year;
	private String category;
	
	
	public void accelaration() {
		System.out.println("Accelarated");
	}
	
	public void brake() {
		System.out.println("Put Brakes");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public Cars(String color, String model, int year, String category) {
		super();
		this.color = color;
		this.model = model;
		this.year = year;
		this.category = category;
	}

	public static void main(String[] args) {
			Cars cars = new Cars("black", "xyz", 2019, "Super Car");
			System.out.println(cars.getColor());
			System.out.println(cars.getModel());
			System.out.println(cars.getYear());
			System.out.println(cars.getCategory());
			cars.accelaration();
			cars.brake();
	}

}
