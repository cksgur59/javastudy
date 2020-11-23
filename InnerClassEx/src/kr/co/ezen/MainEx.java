package kr.co.ezen;

import com.naver.Test1;
import com.naver.Test2;
import com.naver.Test3;
import com.naver.Test5;
import com.naver.Test55;
import com.naver.Test6_1;

public class MainEx {

	public static void main(String[] args) {
		Test2.MemberClass mc1 = new Test2().new MemberClass();
		mc1.mc1();
		
		Test1.a=1;
		
		Test3.StaticInnerClass sic1 = new Test3.StaticInnerClass();
		
		Test5 t1 = new Test5();
		t1.ano.me1();
		
		Test6_1 t6_1 = new Test6_1();
		
		t6_1.t6me1();
		
		Test55 t55 = new Test55();
		
		t55.t55me1();
		t55.it1.me1();
		
		
		
		
	}
	
}
