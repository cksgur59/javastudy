package com.naver;

public class Weapon {


	private int power;
	private String name;
	
	public Weapon() {
		// TODO Auto-generated constructor stub
	}
	
	public Weapon(int power, String name) {
		super();
		this.power = power;
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void attack(Monster mon) {
		int mhp = mon.getHp()-power;
		mon.setHp(mhp);
		System.out.println("몬스터의 HP : "+mhp);
	}

	@Override
	public String toString() {
		return getName();
	}
	
	
	
}
