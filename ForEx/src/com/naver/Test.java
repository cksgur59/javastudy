package com.naver;

public class Test {

	public void me1() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " Hello World");
		}
	}

	public void me2() {
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
	}

	public void me3() {
		for (int i = 0; i < 51; i++) {
			System.out.println(i * 2);
		}
	}

	public void me4() {
		for (int i = 0; i < 51; i++) {
			System.out.println(i * 2 + 1);
		}
	}

	public void me4(int a) {
		for (int i = 0; i < a; i++) {
			System.out.println(i * 2 + 1);

		}
	}
	
	public void dan(int n) {
		for(int i = 1; i < 10 ; i++) {
			System.out.println(n+" X "+i+" = "+n*i);
		}
		System.out.println();
	}
	
	public void dan2(int a) {
		for (int i = 2 ; i < 10; i++) {
			if(a*i>9) {
				System.out.print(i+" X "+a+" = "+a*i+"  ");
			}else {
			System.out.print(i+" X "+a+" = "+a*i+"   ");
			}
		}
		System.out.println();
	}
	
	public void isSossu(int n) {
		for (int i = 2 ; i < n ; i++ ) {
			if(n%i==0) {
				System.out.println("소수가 아닙니다");
				return;
			}
		}
		System.out.println("소수입니다.");
	}
	
	public void isSossu2(int m) {
		
		int count = 0;

		for (int i = 1;; i++) {
			
			for (int j = 2; j <= i; j++) {
				
				if (i != j && i % j == 0) {
					break;
				}
				if (i == j) {
					count++;
					System.out.println("(" + count + ") " + i);
					if (count == m) {
						return;
					}
				}
			}
		}
	}
	
	public void me5() {
		char a = '*';
		
		for (int i = 0 ; i <10 ; i++) {
			System.out.print(a);
		}
		System.out.println();
	}
	
	public void me5(int n) {
		char a = 'O';
		
		for (int i = 0 ; i <n ; i++) {
			System.out.print(a);
		}
	}
	public void me51(int n) {
		char a =' ';
		
		for (int i = 0; i < n ; i++) {
			System.out.print(a);
		}
	}
	
	
	
	public void gugudan() {
		for(int i=2; i<10 ; i++) {
			dan(i);
		}
	}
	
	public void gugudan2() {
		for(int i = 0; i<9 ; i++) {
			dan2(i+1);
		}
	}
	
	public void printStar(int a) {
		for (int i=0;i<a;i++) {
			me5(i+1);
			System.out.println();
		}
	}
	public void printStar2(int a) {
		for (int i=a ; i>0 ; i--) {
			me5(i);
			System.out.println();
		}
	}
	
	public void halfDiamond(int a) {
//		printStar(a);
//		printStar2(a-1);

		char star = '*';
		
		for (int i=0;i<a;i++) {
			me5(i+1);
			if (i+1==a) {
				for (int j=a-1; j>0;j--) {
					me5(j);
				}
			}
		}
	}
	
	public void piramid(int a) {
		for (int i = 1; i <a+1; i++) {
			me51(a-i);
			me5(i*2-1);
			System.out.println();
		}
	}
	
	public void piramid2(int a) {
		for (int i=1 ; i <a+1; i++) {
			me51(i-1);
			me5((a-i+1)*2-1);
			System.out.println();
		}
	}
	public void piramid22(int a) {
		for (int i=1 ; i <a+1; i++) {
			me51(i);
			me5((a-i+1)*2-1);
			System.out.println();
		}
	}
	
	public void diamond(int a) {
		if (a % 2 == 1) {
			piramid(a / 2 + 1);
			piramid22(a / 2);
		}
		if (a % 2 == 0) {
			piramid(a / 2);
			piramid2(a / 2);
		}
	}
	
	public void star(int a) {
		int count =0;
		piramid(a/4);
		for (int i=1 ; i <(a/4)+1; i++) {
			me51(i-1);
			me5((a*2)-i);
			System.out.println();
			count++;
		}
		
		for (int j = 1; j <(a/4)+1; j++) {
			me51(count-j);
			me5((a*2)-j);
			System.out.println();
		}
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
