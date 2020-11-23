package kr.co.ezezn;

import java.util.Scanner;

import com.naver.Bow;
import com.naver.Gun;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.Sword;
import com.naver.Weapon;

public class Gg2MainTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Monster mon = new Monster(100);

		System.out.println(mon);

		Weapon[] wparr = { new Bow(1, "활"), new Sword(5, "검"), new Gun(10, "총") };

		Hero h = new Hero(wparr, 1);

		boolean isTrue = true;
		int menu = 0;
		
		while(isTrue) {
			System.out.println("[ 0. 공격 , 1. 무기 변경 , 2. 종료 ");
			System.out.print("=  ");
			menu = sc.nextInt();
			sc.nextLine();
			
			if(menu == 0) {
				h.attack(mon);
			}
			if(menu == 1) {
				System.out.println("무기 선택");
				int weaponSelect = 0;
				for (int i = 0; i < wparr.length; i++) {
					System.out.print(i+". "+wparr[i]+",  ");
				}
				System.out.println();
				System.out.println("=  ");
				weaponSelect = sc.nextInt();
				sc.nextLine();
				h.changWeapon(weaponSelect);
			}
			if(menu == 2) {
				break;
			}
			
			
			
		}

		System.out.println("end");
		sc.close();
	}
	
}
