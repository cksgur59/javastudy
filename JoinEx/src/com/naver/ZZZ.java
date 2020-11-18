package com.naver;

public class ZZZ extends Thread {
	private Test1 t1;
	
	public ZZZ(Test1 t,String name) {
		super(name);
		this.t1 = t;
	}
	
	@Override
	public void run() {
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.getName());
	}

	public ZZZ() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ZZZ(Runnable target, String name) {
		super(target, name);
		// TODO Auto-generated constructor stub
	}

	public ZZZ(Runnable target) {
		super(target);
		// TODO Auto-generated constructor stub
	}

	public ZZZ(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public ZZZ(ThreadGroup group, Runnable target, String name, long stackSize) {
		super(group, target, name, stackSize);
		// TODO Auto-generated constructor stub
	}

	public ZZZ(ThreadGroup group, Runnable target, String name) {
		super(group, target, name);
		// TODO Auto-generated constructor stub
	}

	public ZZZ(ThreadGroup group, Runnable target) {
		super(group, target);
		// TODO Auto-generated constructor stub
	}

	public ZZZ(ThreadGroup group, String name) {
		super(group, name);
		// TODO Auto-generated constructor stub
	}
	
	

	
	
}
