package kr.co.ezen;

import com.naver.Cat;
import com.naver.Dog;
import com.naver.Test2;
import com.naver.Test3;

public class MainEx {
public static void main(String[] args) {
	
	Test2 t2 = new Test2();
	t2.printInt(32);
	t2.printBoolean(true);
	t2.printCat(new Cat() {
	});
	
	System.out.println(":::::::::::::::::::::::::::::::::");
	
	Test3 t3 = new Test3();
	t3.printDa(55);
	
	
}
}
