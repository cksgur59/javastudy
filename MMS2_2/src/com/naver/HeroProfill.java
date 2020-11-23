package com.naver;

public class HeroProfill {

	private int hp;
	private int mp;
	private int power;
	private int gold;
	private int exp;
	
	public HeroProfill() {
		// TODO Auto-generated constructor stub
	}

	public HeroProfill(int hp, int mp, int power, int gold, int exp) {
		super();
		this.hp = hp;
		this.mp = mp;
		this.power = power;
		this.gold = gold;
		this.exp = exp;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "hp=" + hp + ", mp=" + mp + ", power=" + power + ", gold=" + gold + ", exp=" + exp ;
	}
	
	
	
}
