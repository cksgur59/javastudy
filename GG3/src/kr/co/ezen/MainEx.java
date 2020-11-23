package kr.co.ezen;

import java.util.Scanner;

import com.naver.Bow;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.Sword;
import com.naver.Weapon;
import com.naver.hammer;

public class MainEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		boolean isTrue = true;
		
		Monster mon = new Monster(100);
		Weapon[] weapons = {new Bow("활" , 2) , new Sword("검" , 5), new hammer("해머" , 30)};
		Hero hero = new Hero(0, weapons);
		
		
		System.out.println(mon);
		while(isTrue) {
			//몬스터의 hP 표현

			System.out.println("0. 공격 , 1. 무기 변경 , 2. 종료");
			menu = sc.nextInt();
			sc.nextLine();
			
			if (menu == 0) {
				hero.attack(mon);
			}
			if (menu == 1) {
				System.out.println("무기를 선택해 주세요");
				for (int i = 0; i < weapons.length; i++) {
					System.out.print(i+"번 "+weapons[i].getName()+",  ");
				}
				System.out.println();
				int selectWeapon =  sc.nextInt();
				sc.nextLine();
				hero.changeWeapon(selectWeapon);

			}
			if (menu == 2) {
				break;
			}
		}
		
		
		System.out.println("end");
		sc.close();
	}
	
}
