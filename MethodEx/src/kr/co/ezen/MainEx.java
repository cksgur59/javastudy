package kr.co.ezen;

import com.naver.Cat;
import com.naver.Dog;
import com.naver.MethodTest3;

public class MainEx {

	public static void main(String[] args) {

		//Test12 asd = new Test12();

		//asd.sayHello();

		//asd.printScore("ȫ�浿", 100);

		//MethodTest2 mt5 = new MethodTest2();
		//int re1 = mt5.giveMeTheMoney();

		//MethodTest2 mt6 = new MethodTest2();
		//int re2 = mt6.giveMeTheMoney();

		//int re3 = mt5.giveMeTheMoney();
		
		
		MethodTest3 mt1 = new MethodTest3();
		Test12 re2 = mt1.getTest33();
		System.out.println(re2);
		
		
		
		
		Dog dogi = new Dog();
		boolean mt3 = dogi.dog1();
		System.out.println(mt3);
		
		int asdf = dogi.dog3(20);
		System.out.println(asdf);
		
		
		Cat catt = new Cat();
		int recat = catt.bobobo();
		

	}

}
