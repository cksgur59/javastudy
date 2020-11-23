package com.naver;

public class Car {

	public static String company;
	private String carName;
	private int carPrice;
	
	static {
		company = "KIA";
	}
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String carName, int carPrice) {
		super();
		this.carName = carName;
		this.carPrice = carPrice;
	}

	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		Car.company = company;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	
	public static void  companyProfile() {
		Car car1 = new Car("Spotigi", 57000000);
		System.out.println(Car.company);
		System.out.println(car1.getCarName());
		System.out.println(car1.getCarPrice());
	}
	
	
}
