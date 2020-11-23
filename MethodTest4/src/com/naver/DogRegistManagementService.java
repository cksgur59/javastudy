package com.naver;

public class DogRegistManagementService {
	
	private Dot dog;
	private String name;
	private int age;
	
	public DogRegistManagementService() {
		// TODO Auto-generated constructor stub
	}

	public Dot getDog() {
		return dog;
	}

	public void setDog(Dot dog) {
		this.dog = dog;
	}
	
	public Dot makeDog(String name, int age) {
		return new Dot(name , age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
