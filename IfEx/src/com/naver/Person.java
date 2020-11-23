package com.naver;

public class Person {

	private TV tv1;
	private TV tv2;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(TV tv1, TV tv2) {
		super();
		this.tv1 = tv1;
		this.tv2 = tv2;
	}

	public TV getTv1() {
		return tv1;
	}

	public void setTv1(TV tv1) {
		this.tv1 = tv1;
	}

	public TV getTv2() {
		return tv2;
	}

	public void setTv2(TV tv2) {
		this.tv2 = tv2;
	}
	
	public void tvOn() {
		System.out.println("TV¸¦ ÄÕ´Ï´Ù");
		tv1.powerOn();
	}
	
	public void tvOff() {
		System.out.println("TV¸¦ ²ü´Ï´Ù");
		tv1.powerOff();
	}
	
}
