package com.naver;

public class Hero {
	
	Weapon[] weapons;
	Weapon w;
	
	// ====================================================
	public Hero() {
		weapons = new Weapon[] { new Bow("활", 1), new Sword("검", 5), new Gun("총", 10) };

		w = weapons[2];
	}

	public Hero(Weapon[] weapons, Weapon w) {
		super();
		this.weapons = weapons;
		this.w = w;
	}

	// ====================================================
	public void attack(Monster mon) {
		w.attack(mon);
	}
	
	public void changeWeapon(int a) {
		try {
			w = weapons[a];
		} catch (Exception e) {
			// TODO Auto-generated catch block
			a =  weapons.length-1;
		}
		System.out.println(w+" 로 변경되었습니다.");
	}
	
}
