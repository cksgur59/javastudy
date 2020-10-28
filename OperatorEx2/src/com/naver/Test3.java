package com.naver;

public class Test3 {

	private int a;

	private int b;

	public Test3() {
		a = 0;
		b = 0;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void plus1() {
		System.out.println(a);
		++a;
		System.out.println(a);
	}

	public void plus11() {
		System.out.println(++a);
	}

	public void plus2() {
		System.out.println(b);
		b++;
		System.out.println(b);
	}

	public void plus21() {
		System.out.println(b++);

	}
	
	public void minus1() {
		System.out.println(--a);
	}

}
