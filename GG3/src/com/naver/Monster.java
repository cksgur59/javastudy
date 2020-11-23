package com.naver;

public class Monster {

	private int monHp ;
	
	public Monster() {
		// TODO Auto-generated constructor stub
	}

	public Monster(int monHp) {
		super();
		this.monHp = monHp;
	}

	public int getMonHp() {
		return monHp;
	}

	public void setMonHp(int monHp) {
		this.monHp = monHp;
	}

	@Override
	public String toString() {
		return "몬스터의 Hp = "+monHp;
	}
	
	
	
	
	
}
