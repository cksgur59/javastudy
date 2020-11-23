package com.nate;

import com.naver.Car;

import kr.co.ezen.Dog;

public class Bobo {
	
	private String name1;
	private int age;
	private String poneNumber;
	private Car chanCar;
	private Dog chanDog;
	
	public Bobo() {
		// TODO Auto-generated constructor stub
	}

	public Bobo(String name1, int age, String poneNumber, Car chanCar, Dog chanDog) {
		super();
		this.name1 = name1;
		this.age = age;
		this.poneNumber = poneNumber;
		this.chanCar = chanCar;
		this.chanDog = chanDog;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPoneNumber() {
		return poneNumber;
	}

	public void setPoneNumber(String poneNumber) {
		this.poneNumber = poneNumber;
	}

	public Car getChanCar() {
		return chanCar;
	}

	public void setChanCar(Car chanCar) {
		this.chanCar = chanCar;
	}

	public Dog getChanDog() {
		return chanDog;
	}

	public void setChanDog(Dog chanDog) {
		this.chanDog = chanDog;
	}
	
	
	public void chanPorfile() {
		String a= chanCar.getModelName();
		String b= chanDog.getName();
		System.out.println(name1);
		System.out.println(age);
		System.out.println(poneNumber);
		System.out.println(a);
		System.out.println(b);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
