package com.naver;

public class Hero {

	private Weapon[] wl;
	private int hs;
	
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

	public int getHs() {
		return hs;
	}

	public void setHs(int hs) {
		this.hs = hs;
	}
	
	public void attack(Monster mon) {
		System.out.println(wl[hs].getName()+"으로 공격합니다.");
		mon.setHp(mon.getHp()-wl[hs].getPower());
		System.out.println(mon);
	}
	public void changeW(int wps) {
		hs = wps;
	}
	
}
