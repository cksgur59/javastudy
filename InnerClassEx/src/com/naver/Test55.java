package com.naver;

public class Test55 {

	public void t55me1() {
		new inter1() {
			
			@Override
			public void me1() {
				// TODO Auto-generated method stub
				System.out.println("noº¯¼ö");
			}
		}.me1();
	}
	
	public inter1 it1 = new inter1() {
		
		@Override
		public void me1() {
			// TODO Auto-generated method stub
			System.out.println("yes");
		}
	};
	
}
