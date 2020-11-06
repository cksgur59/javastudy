package kr.co.ezezn;

import com.naver.Bow;
import com.naver.Gun;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.Sword;
import com.naver.Weapon;

public class MainEx {

	public static void main(String[] args) {
		
		Monster mon = new Monster(100);
		
		System.out.println(mon);
		
		Weapon[] wparr = {new Bow(1, "È°"),
			new Sword(5, "°Ë"),
			new Gun(10, "ÃÑ")};
		
		Hero h = new Hero(wparr, 1);
		
		h.changWeapon(0);
		h.attack(mon);
		h.changWeapon(1);
		h.attack(mon);
		h.changWeapon(2);
		h.attack(mon);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
