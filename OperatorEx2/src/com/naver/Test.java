package com.naver;

public class Test {
	
	public boolean me1(int a , int b) {
		boolean c = a>b;
		return c;
	}
	
	public boolean me2 (long a, long b) {
		return (a>=b);
	}
	
	public String me3 (float a , float b) {
		if (a<b) {
			return "Ok";
		}
		else {
			return "No";
		}
		
	}
	public char me31 (int a , int b) {
		if ( a > b ) {
			return 'a';
		}else {
			return 'z';
		}
	}
	
	public boolean me4 (byte a , byte b) {
		boolean c = a <= b;
		return c;
	}
	
	public boolean me5(short a , short b) {
		boolean c = a==b;
		return c;
	}
	
	public void me51(boolean a , boolean b) {
		System.out.println(a==b);
	}
	public void me6(boolean a , boolean b) {
		System.out.println(a!=b);
	}
	

}
