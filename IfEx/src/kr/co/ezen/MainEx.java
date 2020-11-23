package kr.co.ezen;

import com.naver.Person;
import com.naver.TV;
import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		
//		Test t1 = new Test();
//		
//		t1.me1();
//		
//		t1.me2(30);
//		
//		t1.me3(3);
//		
//		System.out.println(t1.me4(11));
//		
//		t1.me5(-5);
//		
//		t1.me6(17);
//		
//		System.out.println(t1.me7(88));
		
		TV tv1 = new TV(99, 998, false);
//		tv.powerOn();
//		tv.chUp();
//		tv.volUp();
//		tv.chUp();
//		tv.volUp();
//		tv.powerOff();
//		tv.chUp();
//		tv.volUp();
//		tv.chUp();
//		tv.volUp();
//		tv.powerOn();
//		tv.chUp();
//		tv.volUp();
//		tv.chUp();
//		tv.volUp();
		
		Person kim = new Person(tv1, null);
		kim.tvOn();
		
		TV tv12 = kim.getTv1();
		tv12.chUp();
		
		kim.getTv1().volDown();
		
		kim.getTv1().setVol(50);
		System.out.println(kim.getTv1().getVol());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
