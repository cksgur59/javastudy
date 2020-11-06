package kr.co.ezen;

import com.naver.Bow;
import com.naver.Gun;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.Sword;
import com.naver.Weapon;

public class MainEx {
public static void main(String[] args) {
	Monster mon = new Monster(100);
	
	Weapon[] weapons = {
			new Bow("È°", 1) ,
			new Sword("°Ë", 5) ,
			new Gun("ÃÑ", 10)
			};
	
	Weapon w = weapons[2];
	Hero spyderman = new Hero(weapons, w);
	
	spyderman.attack(mon);
	spyderman.attack(mon);
	spyderman.attack(mon);
	spyderman.attack(mon);
	
	spyderman.changeWeapon(0);
	
	System.out.println(mon);
	
	
}

	
	
}
