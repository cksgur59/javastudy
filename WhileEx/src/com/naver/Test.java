package com.naver;

public class Test {

	public void me1() {
		int i = 0;
		while(i<101) {
			System.out.println(i);
			i++;
		}
	}
	
	public void me11() {
		int i = 100;
		while(i>=0) {
			System.out.println(i);
			i--;
		}
	} 
	
	public void me2() {
		int i = 0;
		while (i<47) {
			if (i%2==0) 
			System.out.println(i);
			i++;
		}
	}
	
	public void me21() {
		int i=99;
		while (i>20) {
			System.out.println(i);
			i=i-2;
		}
	}
	
	public void dan(int a) {
		int i  = 1 ;
		while (i<10) {
			StringBuffer sb = new StringBuffer(a);
			sb.append(a);
			sb.append(" X ");
			sb.append(i);
			sb.append(" = ");
			sb.append(a*i);
			String msg = sb.toString();
			System.out.println(msg);		
			i++;
		}
	}
	
	public void dan2(int a) {
		int i  = 2 ;
		while (i<10) {
			StringBuffer sb = new StringBuffer(a);
			sb.append(i);
			sb.append(" X ");
			sb.append(a);
			sb.append(" = ");
			sb.append(a*i);
			if(a*i<10)
				sb.append("   ");
			if(a*i>=10)
				sb.append("  ");
			String msg = sb.toString();
			System.out.print(msg);		
			i++;
		}
		System.out.println("");
	}
	
	public void gugudan() {
		int i = 1;
		while (i<10) {
			dan2(i);
			i++;
		}
	}
	
	public void me3() {
		int i = 0;
		while(i<10) {
			System.out.print("*");
			i++;
		}
	}
	
	public void me31(int a,char b) {
		int i = 0;
		while(i<a) {
			System.out.print(b);
			i++;
		}
	}
	
	public void printStar(int a) {
		int i = 1;
		while(i<=a) {
			me31(i,'*');
			i++;
		}
	}
	
	public void printpibo(int dal) {
		int a=1;
		int b=1;
		int c;
		for(int i = 1; i <= dal ; i++) {
			c= a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
	
	public void printStarBRC(int a) {
		if(a % 5 == 0) {
			System.out.println("5의 배수입니다");
			return;
			}
		for (int i = 1 ; i <= a ; i++) {
			if (i%7==0) continue;
			me31(i,'*');
			if (i>30) {
				System.out.println("30줄 이상은 출력 불가입니다");
				break;
			}
		}
	}
	
	public void printStarM(int a) {
		int b;
		int i = 1;
		while (i <=a ) {
			b=a*2-i*2;
			me31(i,'*');
			me31(b-1,' ');
			me31(i*2-1,'*');
			me31(b-1,' ');
			if (i==a) me31(i-2,'*');
			if (i!=a) me31(i,'*');
			System.out.println("");
			i++;
		}
	}
	
	public void me4() {
		int i = 0;
		while (i < 10) {

			if (i != 0 && i % 5 == 0)
				break;

			System.out.println(i);

			i++;
		}
		System.out.println("me4() 끝");

	}

	public void me5() {
		int i = 0;
		while(i<10) {
			if (i != 0 && i%5 == 0) {i++; continue;}
			System.out.println(i);
			i++;
		}
		System.out.println();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
