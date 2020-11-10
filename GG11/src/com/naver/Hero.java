package com.naver;

public class Hero {

	private Weapon[] wl;
	private int hw;
	
	public Hero() {
		// TODO Auto-generated constructor stub
	}

	public Hero(Weapon[] wl) {
		super();
		this.wl = wl;
	}

	public Weapon[] getWl() {
		return wl;
	}

	public void setWl(Weapon[] wl) {
		this.wl = wl;
	}

	public int getHw() {
		return hw;
	}

	public void setHw(int hw) {
		this.hw = hw;
	}
	
	public void attack(Monster mon) {
		System.out.println(wl[hw].getName()+"으로 공격합니다");
		mon.setHp(mon.getHp()-wl[hw].getPower());
		System.out.println(mon);
	}

	public void changeW(int wps) {
		// TODO Auto-generated method stub
		hw = wps;
	}
}
