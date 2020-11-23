package com.naver;

public class Bmw extends Car {
	
	public Bmw() {
		// TODO Auto-generated constructor stub
	}

	public Bmw(String model, String company, int price) {
		super(model, company, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println("BMWÀÇ run( )");
	}
	
	
	
}
