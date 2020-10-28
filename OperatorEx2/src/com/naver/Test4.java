package com.naver;

public class Test4 {
	
	private int a;
	private int b;
	
	public Test4() {
		// TODO Auto-generated constructor stub
	
		a=3;
		b=5;
	
	}
	
	public void com1() {
		
		int c =  a>=b ? 'a':'z';
		
		
	}
	
	public void comd2() {
		
		String c = a != b ? "hello" : "no";
	}
	
	public int me1() {
		return 3;
	}
	
	public void me2() {
		System.out.println(44);
		
	}
	
	public void cond4() {
		
		int c = a> b*2 ? me1() : a;
				
	}
	
	public void me3() {
		
		
		int c = a==b?44:33;
		
	}
	

}
