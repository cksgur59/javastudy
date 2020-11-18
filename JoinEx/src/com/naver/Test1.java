package com.naver;

public class Test1 extends Thread{

	
	
	public Test1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Test1(Runnable target, String name) {
		super(target, name);
		// TODO Auto-generated constructor stub
	}

	public Test1(Runnable target) {
		super(target);
		// TODO Auto-generated constructor stub
	}

	public Test1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Test1(ThreadGroup group, Runnable target, String name, long stackSize) {
		super(group, target, name, stackSize);
		// TODO Auto-generated constructor stub
	}

	public Test1(ThreadGroup group, Runnable target, String name) {
		super(group, target, name);
		// TODO Auto-generated constructor stub
	}

	public Test1(ThreadGroup group, Runnable target) {
		super(group, target);
		// TODO Auto-generated constructor stub
	}

	public Test1(ThreadGroup group, String name) {
		super(group, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
	
		String name = this.getName();
		System.out.println(name);
		
		for (int i = 0; i < 10; i++) {
			System.out.println(name+" : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
	
	
	
}
