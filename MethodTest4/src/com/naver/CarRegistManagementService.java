package com.naver;

public class CarRegistManagementService {

	private String carName;
	
	public CarRegistManagementService() {
		carName = "¼Ò³ªÅ¸";
		
	}
	public void carName(String carName) {
		this.carName = carName;
	}
	
	public String getCarName() {
		return this.carName;
	}
	
	public int getCountCarName(String carName) {
		int size = carName.length();
		return size;
	}
	
	
	public int add1(int a, int b) {
		int c = a + b;
		return c;	
	}
	
	
}
