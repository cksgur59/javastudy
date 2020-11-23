package com.naver;

public class Test {

	public void me1() {
		
		int[][] arr;
		
	}
	
	public void me2() {
		StringBuffer[][] arr = new StringBuffer[5][3];
		System.out.println(arr[0].length);
	}
	
	public void me21() {
		Dog[][] arr = new Dog[10][2];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			for (int j = 0; j< arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
	
	public void me22() {
		int[][] arr = new int[5][4];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		System.out.println("=========");
		System.out.println(arr[0][2]);
		System.out.println("=========");
		System.out.println(arr[arr.length-1][0]=100);
	}
	public void me3() {
		int[][] arr1 = {
				{4,1,0},{4,1,8},{5,7,1}	
		};
		
		String[][] arr2 = {
				{"good","oh","my"},{"god","thank","you"}
		};
		
		int[][][] arr3 = {
				{
					{5,6,7,8}
				},
				{
					{9,0,1,2}
				},
				{
					{3,4,5,6}
				}
		};
		
		int[][] arr4 ={
				{5,6,7},{8,9,0},{1,2,3},{4,5,6},{7,8,9}
		};
		
		arr4[2][1] = 100;
		for (int i = 0; i < arr4[2].length; i++) {
			System.out.println(arr4[2][i]);
		}
		int[] sub2 = arr3[arr3.length-1][0];
		System.out.println(sub2[0]);
	}
	
	public void me4() {
		int[][] arr=new int[3][10];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i==0) {
				arr[i][j]= j;}
				else if (i==1) {
					arr[i][j]= j*2;}	
				else if (i==2) {
			    	arr[i][j]= j*3;}
			}
		}		
		System.out.println(arr[1][7]);
	}
	
	public void me5() {
		int[][] arr = new int[5][];
		
		arr[0] = new int[] {1,2,3,4};
		arr[1] = new int[] {0,2,4};
		arr[2] = new int[] {1,3,5,7,9};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
			
	}
	
	public int[] numbersplit(int b) {
		//숫자분류
		int[] barr = {};
		if (b>-1 && b < 10) {
			barr = new int[1];
			barr[0] = b+1 ;
		}
		if (b > 9 && b < 100) {
			barr = new int[2];
			barr[0] = b / 10 + 1;
			barr[1] = b % 10 + 1;
		} 
		if (b > 99 && b < 1000) {
			barr = new int[3];
			barr[0] = b / 100 + 1;
			barr[1] = (b % 100) / 10 + 1;
			barr[2] = b % 10 + 1;
		}
		if (b > 999 && b < 10000) {
			barr = new int[4];
			barr[0] = b / 1000 + 1;
			barr[1] = (b % 1000) / 100 + 1;
			barr[2] = (b % 100) / 10 + 1;
			barr[3] = b % 10 + 1;
		}
		return barr;
		// ==================
	}
	
	public void arrinp4(int b) {
		// 4차원 배열 생성
		int[] barr = numbersplit(b);

		int[][][][] aarr = new int[barr[0]][barr[1]][barr[2]][barr[3]];

		for (int i = 0; i < barr[0]; i++) {
			System.out.println("{ (4)-" + i);
			for (int j = 0; j < barr[1]; j++) {
				System.out.println("       { (3)-" + j);
				for (int k = 0; k < barr[2]; k++) {
					System.out.println("              { (2)-" + k);
					for (int l = 0; l <= barr[3]; l++) {
						if (l == barr[3]) {
							System.out.print("}");
							break;
						}
						int c = (i * 1000) + (j * 100) + (k * 10) + l;
						String d = String.format("%04d", c);
						aarr[i][j][k][l] = c;
						if (l == 0) {
							System.out.print("                    ");
							System.out.print("1-" + (l + k) + " {");
						}
						if (l != barr[3] - 1) {
							System.out.print(d + ", ");
						} else {
							System.out.print(d);
						}
					}
					System.out.println();
					System.out.println("              }");
				}
				System.out.println("        }");
			}
			System.out.println("} ");
			System.out.println();
		}
		// ==========================================
	}
	
	public void arrinp3(int b) {

		int[] barr = numbersplit(b);
		int[][][] aarr = new int[barr[0]][barr[1]][barr[2]];

		// 3차원배열
		for (int i = 0; i < barr[0]; i++) {
			System.out.println("{ (3)-" + i);
			for (int j = 0; j < barr[1]; j++) {
				System.out.println("          { (2)-" + j);
				for (int k = 0; k <= barr[2]; k++) {
					if (k == barr[2]) {
						System.out.println("}");
						break;
					}
					int c = (i * 100) + (j * 10) + k;
					String d = String.format("%03d", c);
					aarr[i][j][k] = c;
					if (k == 0) {
						System.out.print("                    ");
						System.out.print("1-" + (j + k) + " {");
					}
					if (k != barr[2] - 1) {
						System.out.print(d + ", ");
					} else {
						System.out.print(d);
					}

				}
				System.out.println("          }");
			}
			System.out.println("} ");
		}
		// =======================
	}
	
	public void arrinp2(int b) {

		int[] barr = numbersplit(b);
		int[][] aarr = new int[barr[0]][barr[1]];

		// 2차원배열
		for (int i = 0; i < barr[0]; i++) {
			System.out.println("{ (2)-" + i);
			for (int j = 0; j < barr[1]; j++) {
				if (j == barr[1]) {
					System.out.println("}");
					break;
				}
				int c = (i * 10) + j;
				String d = String.format("%02d", c);
				aarr[i][j] = c;
				if (j == 0) {
					System.out.print("          ");
					System.out.print("1-" + (j + j) + " {");
				}
				if (j != barr[1] - 1) {
					System.out.print(d + ", ");
				} else {
					System.out.print(d);
				}
			}
			System.out.println("} ");
			System.out.println("} ");
		}
		// =======================
	}
	
	public void arrinp1(int b) {
		int[] aarr = new int[b];

		// 2차원배열
			for (int i = 0; i < aarr.length; i++) {
				aarr[i]=i;
				if (i==0) System.out.print(" { ");
				if (i==aarr.length-1) {
					System.out.println(aarr[i]+" }");
					}else {
				System.out.print(aarr[i]+", ");
					}
			}
		
			// =======================
		}
		
	public void arrayMaker(int a) {
		if (a>999 && a<10000) arrinp4(a);
		if (a>99 && a<1000) arrinp3(a);
		if (a>9 && a<100) arrinp2(a);
		if (a>-1 && a<10) arrinp1(a);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

