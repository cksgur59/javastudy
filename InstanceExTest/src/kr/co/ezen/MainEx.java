package kr.co.ezen;

import com.naver.Hero;
import com.naver.Monster;
import com.naver.Weapon;

public class MainEx {
	public static void main(String[] args) {
		
		
		Hero hero = new Hero();
		
		Monster mon = new Monster("오크");
		Monster gob = new Monster("고블린");
		
		Weapon weapon = new Weapon();
		String bow = weapon.getBow();
		String sword = weapon.getSword();
		String spear = weapon.getSpear();
		String hammer = weapon.getHammer();
		String lance = weapon.getLance();
		
		String orger = mon.orger();
		
		hero.attack(mon, bow);
		hero.attack(mon, sword);
		hero.attack(mon, hammer);
		hero.attack(gob, spear);
		hero.attack(gob, lance);
		
        

	}
}
