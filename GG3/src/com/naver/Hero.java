package com.naver;

public class Hero {
	
	private int handWeapon ;
	private Weapon[] weaponlist;
	
	public Hero() {
		// TODO Auto-generated constructor stub
	}

	public Hero(int handWeapon, Weapon[] weaponlist) {
		super();
		this.handWeapon = handWeapon;
		this.weaponlist = weaponlist;
	}

	public int getHandWeapon() {
		return handWeapon;
	}

	public void setHandWeapon(int handWeapon) {
		this.handWeapon = handWeapon;
	}

	public Weapon[] getWeaponlist() {
		return weaponlist;
	}

	public void setWeaponlist(Weapon[] weaponlist) {
		this.weaponlist = weaponlist;
	}

	
	
	
	public void attack(Monster mon) {
		// handWeapon 으로 mon 공격
		String name = weaponlist[handWeapon].getName();
		int power = weaponlist[handWeapon].getPower();
		int mhp = mon.getMonHp()-power;
		mon.setMonHp(mhp);
		System.out.println(name+"으로 몬스터를 공격");
		System.out.println(mon);
		System.out.println();
		
	}

	public void changeWeapon(int selectWeapon) {
		// handWeapon 변경
		handWeapon = selectWeapon;
		
	}

	
	
}
