package com.naver;

import java.util.StringTokenizer;

public class Person {

	private Car[] arrCar;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(Car[] arrCar) {
		super();
		this.arrCar = arrCar;
	}
	
	public void profile() {
		for (int i = 0; i < arrCar.length; i++) {
			System.out.println(i+1);
			System.out.println(arrCar[i].getCompany());
			System.out.println(arrCar[i].getModel().trim().toUpperCase());
			System.out.println(arrCar[i].getPrice());
			System.out.println();
		}
	}
	
	public void me90(String msg,String delim) {
		StringTokenizer ms = new StringTokenizer(msg, delim);
		String[] msarr = new String[ms.countTokens()];
		int i = 0;
		while(ms.hasMoreTokens()) {
			msarr[i] = ms.nextToken();
			System.out.println(msarr[i++]);
		}
	}
	
}
