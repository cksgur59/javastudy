package com.naver;

public class Test2 extends Thread{

	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		me1();
	}

	public void me1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Test: 2: "+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
