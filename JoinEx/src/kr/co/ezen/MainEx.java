package kr.co.ezen;

import com.naver.Test1;
import com.naver.ZZZ;

public class MainEx {

	public static void main(String[] args) {
		
		Thread ct =Thread.currentThread();
		String name = ct.getName();
		
		System.out.println("main start");
		
		Test1 t1 = new Test1("����");
		Test1 t2 = new Test1("�κ�");
		ZZZ t3 = new ZZZ(t1, "�̴Ͼ�");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("main end");
	}
	
}
