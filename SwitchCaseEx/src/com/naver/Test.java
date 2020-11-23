package com.naver;

public class Test {

	public void me1(int a) {
		
		switch (a) {
		case 3:
			System.out.println(3333);
			System.out.println(1111);		
			break;
		case 4:
			System.out.println(4444);
			System.out.println("end");
			break;
		default:
			System.out.println("fine");
			break;
		}
	}
	
	public void me2 (int a) {
		switch (a) {
		case 3:
			System.out.println(3333);
			break;
		case 4:
			System.out.println(4444);
			break;
		default:
			System.out.println(9999);
			break;
		}
		System.out.println("::::::::::::::::");
	}
	
	public void me3 (int a) {
		switch (a/10) {
		case 1:
			System.out.println("10~19");
			break;
		case 2:
			System.out.println("20~29");
			break;
		default:
			System.out.println("end");
			break;
		}
		System.out.println("**************************");
	}
	
	public void me31(int a) {
		int data = a/10;
		
		switch (data) {
		case 1:
			
			break;

		default:
			break;
		}
	}
	
//	public void me4(int a) {
//		switch (a) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
//	}
	
//	public void me5(long a) {
//		switch (a) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
//	}
	
	
	public void me6(int month) {
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(30);
			break;
		case 2:
			System.out.println("28일 까지 있습니다");
			break;
		
		default:
			System.out.println(31);
			break;
		}
	}
	
	
//	public void me7 (int score) {
//		switch (score/10) {
//		case 10:
//		case 9:
//			System.out.println("수");
//			break;
//		case 8:
//			System.out.println("우");
//			break;
//		case 7:
//			System.out.println("미");
//			break;
//		case 6:
//			System.out.println("양");
//			break;
//
//		default:
//			System.out.println("가");
//			break;
//		}
//	}
	

//	public void m8 (int )
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
