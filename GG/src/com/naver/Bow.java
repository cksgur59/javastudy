package com.naver;

public class Bow extends Weapon {

	public Bow() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bow(int power) {
		super(power);
		// TODO Auto-generated constructor stub
	}

	public Bow(String name, int power) {
		super(name, power);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return getName();
	}
	
	
}
