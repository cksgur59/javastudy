package com.naver;

public class Sm5 extends Car{
	
	public Sm5() {
		// TODO Auto-generated constructor stub
		run();
	}
	
	
	public Sm5(String model, String company, int price) {
		super(model, company, price);
		// TODO Auto-generated constructor stub
	}
	
	public void me1() {
		System.out.println(getModel());
	}


	@Override
	public void run() {
		System.out.println("Sm5ÀÇ run( )");
		
	}
	
	


	
}

