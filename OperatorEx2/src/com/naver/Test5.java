package com.naver;

public class Test5 {

	
	private int a = 2;
	
	private int b=  5;
	
	public void h1() {
		int c= b&a;
		System.out.println(c);
	}
	
	public void h2() {
		int c= b|a;
		System.out.println(c);
	}
	
	public void h3() {
		int c= b^a;
		System.out.println(c);
	}
	
	public void h4() {
		int c = ~a;
		System.out.println(c);
	}
	
	public void h5(int c) {
		char a ='*';
		char b =' ';

		for(int i=1;i<=c;i++) {
			for(int j=c;j>i;j--) {
				System.out.print(b);
			}
			for(int k=1;k<=((i*2)-1);k++) {
				System.out.print(a);
			}
			System.out.println("");
		}
	}
	
	public void h6(int c) {
		char a ='*';
		char b =' ';
		
		for(int i=0;i<c;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(b);
			}
			for(int k=1;k<=(((c-i)*2)-1);k++) {
				System.out.print(a);
			}
			System.out.println("");
		}
	}
	
	
}
