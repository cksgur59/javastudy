package kr.co.daum;

public class Dog {
	
	int inp_Dog_1;
	
	public Dog(int inp_Main_1) {
		this.inp_Dog_1 = inp_Main_1;
	}
	
	public void gree_Dog_1() {
		if(inp_Dog_1 == 1) {
			System.out.println("1. Hello");
		}
		if(inp_Dog_1 == 2) {
			System.out.println("2. Good Morning");
		}
		if(inp_Dog_1 == 3) {
			System.out.println("3. Happy");
		}
	}

}
