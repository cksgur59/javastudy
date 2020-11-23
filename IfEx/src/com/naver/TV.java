package com.naver;

public class TV {

	private int vol;
	private int ch;
	private boolean power;
		
	public TV() {
		// TODO Auto-generated constructor stub
	}
	public TV(int vol, int ch, boolean power) {
		super();
		this.vol = vol;
		this.ch = ch;
		this.power = power;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public void chLimit() {
		if (ch > 999) {
			ch = 1;
		}
		if (ch < 1) {
			ch = 999;
		}
	}

	public void volLimit() {
		if (vol < 0) {
			vol = 1;
		}
		if (vol > 100) {
			vol = 100;
		}
	}

	public void volUp() {
		if (power) {
			vol++;
			volLimit();
			System.out.println("vol ="+vol);
		}
	}

	public void volDown() {
		if (power) {
			vol--;
			volLimit();
			System.out.println("vol ="+vol);
		}
	}

	public void chUp() {
		if (!power) {
			return;
		}
			ch++;
			chLimit();
			System.out.println("ch  ="+ch);
	}

	public void chDown() {
		if (!power) {
			return;
		}
			ch--;
			chLimit();
			System.out.println("ch  ="+ch);
	}

	public void powerOn() {
		power = true;
		System.out.println("POWER ON");
	}

	public void powerOff() {
		power = false;
		System.out.println("POWER OFF");
	}
	

	
	
	
	
	
	
	
	
	
	
}
