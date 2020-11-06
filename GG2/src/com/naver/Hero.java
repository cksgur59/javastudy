package com.naver;

public class Hero {
	
	private Weapon[] wparr;
	private Weapon handWeapon; 

	public Hero() {
		// TODO Auto-generated constructor stub
	}
	
	public Hero(Weapon[] wparr, int a) {
		super();
		this.wparr = wparr;
		this.handWeapon = wparr[a];
	}



	public void attack(Monster mon) {
		handWeapon.attack(mon);
	}
	
	public void changWeapon(int a) {
		if(a>=wparr.length || wparr.length<0) a= wparr.length-1;
		else {			
			handWeapon = wparr[a];
		}
		System.out.println(wparr[a]+" 로 변경되었습니다.");
	}
	
}
