package com.naver;

public class Test {

	
	public void me1() {
		boolean a = false;
		char b = ' ';
		byte c=0;
		short d= 0;
		int e=0;
		long f= 0l;
		float g= 0.0f;
		double h = 0.0;
	}
	public void me2() {//Wrapper class
		//AutoBoxing
		Boolean a = false;
		Character b= ' ';
		Byte c = 0;
		Short d = 0;
		Integer e = 0;
		Long f = 0l;
		Float g = 0.0f;
		Double h = 0.0;
		}
	public void me3() {
		//AutoUnBoxing
		boolean a = new Boolean(false);
		Character b = new Character('c');
		char bb= b;
	}
	public void me4() { //String 형 문자열을 각각에 맞는 자료형으로 변환시켜주기 (pars~~~)사용
		String msg = "123";
		int i =Integer.parseInt(msg);
		System.out.println(i);
	}
	public void me41() {
		String msg = "false";
		boolean a = Boolean.parseBoolean(msg);
	}
	public void me5() {
		String msg = "h";
		
		char c=msg.charAt(0);
	    System.out.println(c);
	}
}
