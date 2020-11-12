package com.naver;

import java.util.Random;

public class Test {

	public void me1() {
		Random rmd = new Random();
	}
	
	public void me2() {
		Random rmd = new Random(System.currentTimeMillis());
	}
	
	public void me3() {
		Random rmd = new Random();
		for (int i = 0; i < 100 ;i++) {
			int num = rmd.nextInt(101);
			System.out.println(num);
		}
	}
	public void me4() {
		//������ ���� ������ 3~10������ ���ڰ� �ǵ��� ���α׷��� �ϼ���
		Random rmd = new Random();
		int num = rmd.nextInt(8)+3;
		System.out.println(num);
	}
	public void me5(int start , int end) {
		//start ~ end ������ �ִ� ���ڰ� ���Ƿ� �������� ���α׷��� �ϼ���.
		Random rmd = new Random();
		for (int i = 0; i < 100; i++) {
			int a = rmd.nextInt(end+1-start)+start;
			System.out.println(a);
		}
	}
	public void me51(int a , int b) {
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int c = r.nextInt(b + 1 - a) + a;
			System.out.println(c);
		}
	}
	public void me6() {
		Random rmd1 = new Random(3);
		Random rmd2 = new Random(3);
		
		int num1 = rmd1.nextInt(5);
		int num2 = rmd2.nextInt(5);
		
		System.out.println(num1);
		System.out.println(num2);
	}
}
