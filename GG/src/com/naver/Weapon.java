package com.naver;

public class Weapon {

	private String name;
	private int power;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public Weapon() {
		// TODO Auto-generated constructor stub
	}

	public Weapon(String name, int power) {
		super();
		this.name = name;
		this.power = power;
	}

	public Weapon(int power) {
		super();
		this.power = power;
	}
	
	public void attack(Monster mon) {
		int aHp = mon.getHp() -power;
		mon.setHp(aHp);
		System.out.println("Monster¿« Hp: "+aHp);
	}
	
	@Override
	public String toString() {
		return getName();
	}


	
	
}
