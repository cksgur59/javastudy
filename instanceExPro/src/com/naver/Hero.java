package com.naver;

public class Hero {

	private Bow bow;
	private Sword sword;
	private Spear spear;

	public Hero() {

	}

	public Hero(Bow bow, Sword sword) {
		super();
		this.bow = bow;
		this.sword = sword;
	}

	public Sword getSword() {
		return sword;
	}

	public void setSword(Sword sword) {
		this.sword = sword;
	}

	public Hero(Bow bow) {
		super();
		this.bow = bow;
	}

	public Bow getBow() {
		return bow;
	}

	public void setBow(Bow bow) {
		this.bow = bow;
	}

	public void attack(Monster mon) {

		bow.attack(mon);
	}

	public void attack(Monster mon, Sword sword) {
		sword.attack(mon);
	}
	
	public void attack(Monster mon , Spear spear) {
		spear.attack(mon);
	}

	public void attack(Monster mon, Hammer hammer) {
		// TODO Auto-generated method stub
		hammer.attack(mon);
		
	}

}
