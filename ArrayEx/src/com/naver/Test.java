package com.naver;

import java.security.PublicKey;

public class Test {

	public int[] me01() {
		int[] arrInt = {3,6,3,7};
		for (int i = 0; i<arrInt.length;i++) {
			System.out.println(arrInt[i]);
		}
		return arrInt;
	}
	
	public void me1() {
		int[] arrint = new int[4];
		
		for (int i = 0; i < arrint.length; i++) {
			arrint[i]=i*2+1;
		}
	
//		System.out.println("length = "+arrint.length);
//		arrint[0] = 100;
//		arrint[1] = 200;
//		arrint[2] = 300;
//		arrint[3] = 400;
//		
//		for(int i = 0 ; i < arrint.length; i++) {
//			System.out.print(arrint[i]+" ");
//		}
	}
	
	public void me11() {
		StringBuffer[] arrsb = new StringBuffer[100];
		StringBuffer sb1 = new StringBuffer();
		arrsb[1]=sb1;
		System.out.println(arrsb[1]);
		
		int[] arrint = {};
		
		for(int i = arrsb.length-1 ; i >= 0; i--) {
			System.out.println(arrsb[i]+" ");
		}
	}
	
	public void me12(Dog[] dogs) {
		System.out.println(dogs.length);
		dogs[dogs.length-1] = null;
		
		
		for(int i = 0; i < dogs.length; i++) {
		Dog dog = dogs[i];
		if (dog != null) {
		String name = dog.getName();
		System.out.println(name);
		}
		}
	}
	
	public void me13() {
		String data = "teacheryo#seoul#226#-1";
		String[] arrdata =data.split("#");
//		System.out.println(arrdata[arrdata.length-1]);
		
		arrdata[arrdata.length-1]="100";
//		System.out.println(arrdata[arrdata.length-1]);
		arrdata[0]="ezen";
		
		
		
		for(int i = 0 ; i < arrdata.length ; i++) {
			System.out.println(arrdata[i].charAt(0));
		}
	}
	
	public void me131() {
		String a = "leechanhyuk@yanggu@unhunmian@hapari@2789";
		String[] arra =a.split("@");
		System.out.println(arra.length);
		System.out.println(arra[2]);
	}
	
	public void me2() {
		int a=1;
		int[] arrint = {a,4,6};
//		System.out.println(arrint.length);
//		System.out.println(arrint[1]);
		arrint[1] = 333;
		for(int i = 0 ; i<arrint.length;i++) {
			if (i==1) continue;
			if(arrint[i]==6) continue;
			System.out.println(arrint[i]);
		}
	}
	
	public void me21() {
		Dog as1 = new Dog();
		Dog as2 = new Dog();
		Dog[] arrDog = {as1,as2};
//		System.out.println(arrDog.length);
		
		arrDog[arrDog.length-1] = null;
		
		for (int i = 0; i < arrDog.length; i++) {
			System.out.println(arrDog[i]);
			if(i==1 && arrDog[i] != null) System.out.println(arrDog[1].getName());
		}
	}
	
	public void me22(String[] arrStr) {
		System.out.println(arrStr.length);
		arrStr[1] = "12";
		System.out.println(arrStr[1]);
		int[][] arr2Int = {
				{1,3,5,7},{0,2,3,6}
		};
		System.out.println(arr2Int[1][1]);
	}
	
	public void me3() {
		int[] arrint = new int[] {1,3,5,7};
		System.out.println(arrint);
	}
	
	public void me31() {
		float[] arrFloat = new float[] {3.14F,4.2F,9.8F};
		System.out.println(arrFloat.length);
	}
	
	public void me32(Dog[] dogs) {
		System.out.println(dogs.length);
	}
	
	public void me323(int a,int b) {
		int[][][][] arrInt = {};
		int[] aarr = new int[4];
		if (a>110&&a<=239) {
			aarr[0]=a/1000-1;
			aarr[1]=(a%1000)/100-1;
			aarr[2]=(a%100)/10-1;
			aarr[3]=a%10-1;
			System.out.println(arrInt[aarr[0]][aarr[1]][aarr[2]][aarr[3]]);
		}else {
			System.out.println("111~239");
		}
	
	}
	public void arrinp(int b) {
		//숫자분류
		int[] barr = new int[4];
		if (b>999 && b<10000) {
			barr[0]=b/1000+1;
			barr[1]=(b%1000)/100+1;
			barr[2]=(b%100)/10+1;
			barr[3]=b%10+1;
		//==================
			
		int[][][][] aarr = new int[barr[0]][barr[1]][barr[2]][barr[3]];
		
		for (int i = 1; i < barr[0]; i++) {
			System.out.println("{ 4-"+(i-1)+"start");
			for (int j = 1; j < barr[1]; j++) {
				System.out.println("     { 3-"+(j-1)+"start");
				for (int k = 1; k < barr[2]; k++) {
					System.out.println("          { 2-"+(k-1)+"start");
					for (int l = 1; l < barr[3]; l++) {
						
						int c = (i*1000)+(j*100)+(k*10)+l;
						aarr[i-1][j-1][k-1][l-1]=c;
						System.out.print(" {"+c+"}"+" ");
					}
					System.out.println("          } 2-"+(k-1)+" end");
				}
				System.out.println("     } 3-"+(j-1)+" end");
			}
			System.out.println("} 4-"+(i-1)+" end");
		}
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
