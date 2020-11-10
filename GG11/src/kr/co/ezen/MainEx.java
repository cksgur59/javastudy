package kr.co.ezen;

import java.util.Scanner;

import com.naver.Bow;
import com.naver.Gun;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.Sword;
import com.naver.Weapon;

public class MainEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Monster mon = new Monster(300);
		Weapon[] wl = { new Bow("활", 2), new Sword("검", 5), new Gun("총", 10) };
		Hero hero = new Hero(wl);

		System.out.println(mon);
		int me = 0;
		boolean ist = true;

		while (ist) {
			System.out.println("0. 공격, 1.무기변경, 2.종료");
			me = sc.nextInt();
			sc.nextLine();

			if (me == 0) {

				hero.attack(mon);
			}
			if (me == 1) {

				for (int i = 0; i < wl.length; i++) {
					System.out.print(i+". "+wl[i].getName()+", ");
				}
				System.out.println();
				int wps = sc.nextInt();
				sc.nextLine();
				hero.changeW(wps);
			}
			if (me == 2) {

				break;
			}
		}

		System.out.println("end");
		sc.close();
	}

}
