package com.naver;

public class Test6 {

	public Test6() {
		
		new inter1() {
			@Override
			public void me1() {
				System.out.println(1111);
			}
		}.me1();
		
	}
	
}
