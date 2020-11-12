package com.naver;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test {

	public void me1() {
		//1. Calendar 클래스 객체 생성 방법
		Calendar c= Calendar.getInstance();
	}
	
	public void me2() {
		// Calendar 클래스를 이용해서 객체 c를 생성하시오.
		Calendar c = Calendar.getInstance();
		
		// c 를 이용해서 연도 정보 추출하기.
		int year = c.get(Calendar.YEAR);
		// 월 정보 int month
		int month = c.get(Calendar.MONTH)+1;
		// 일 정보 int date
		int date = c.get(Calendar.DATE);
		// 요일정보 int day
		int day = c.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		System.out.println(day);
		
	}
	
	public void me3() {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.set(1950, 6-1, 25);
		System.out.println(c1);
		System.out.println(c2);
	}
	public void me31() {
		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.MONTH, Calendar.MAY);
		System.out.println(c1);
	}
	public void me32() {
		//1. 1950년 6월 25일은 무슨 요일일까요? 화면에 출력하시오
		Calendar c = Calendar.getInstance();
		c.set(1950, 6-1, 25);
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
	}
	public void me4() {
		Calendar c= Calendar.getInstance();
		int maxDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(maxDate);
	}
	public void me41() {
		// 1950년 2월의 마지막날은 며칠까지 있을까요?
		// 그리고 그날의 요일은?
		// 둘 다 각각 출력하시오.
		Calendar c= Calendar.getInstance();
		c.set(Calendar.YEAR, 1950);
		c.set(Calendar.MONTH, 2-1);
		int maxdate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		c.set(Calendar.DATE, maxdate);
		System.out.println(maxdate+" "+Calendar.DATE);
	}
	public void me5() {//안 중요한 예제..공부x
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력하세요");
		try {
			int year = sc.nextInt();
			sc.nextLine();
			System.out.println("월을 입력하세요");
			int month = sc.nextInt();
			sc.nextLine();
			Calendar c = Calendar.getInstance();
			c.set(year, month-1, 1);
			int lastDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
			int firstDateDay = c.get(Calendar.DAY_OF_WEEK);
			System.out.println(year+"년 "+month+"월");
			System.out.println(" SU   MO   TU   WE   TH   FR   SA ");
			for (int i = 1; i < lastDate+1; i++) {
				c.set(year, month, i);
				if((i+firstDateDay-1)%Calendar.SATURDAY ==0) System.out.println();
				if(i==1) {
					for (int j = 1; j < firstDateDay; j++) {
						System.out.print("  ");
						if(j==firstDateDay-1) System.out.print("   "+i);
					}
				}else {
					if (i<10) {System.out.print(" "+i+"   ");
					}else {
						System.out.print(" "+i+"  ");
					}
					
				}
			}
//			for (int i = 1; i < firstDateDay; i++) {
//				System.out.print("    ");
//			}
//			for (int i = 1; i < lastDate+1; i++) {
//				String malffa = i<10? " "+i: i+"";
//				System.out.print(malffa);
//				if((i+firstDateDay-1)%Calendar.SATURDAY ==0) System.out.println();
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
	}
	public void me6() {
		Calendar c= Calendar.getInstance();
		System.out.println(c.getTime());
		// 2020 11 월 12 일
		// 20일 후?
		// 2020 12 월 2 일
		// add( ) 는 Calendar 객체의 정보를 변경합니다.
		// 특정 필드의 값에 주어진 값을 더해서 변경합니다.
		c.add(Calendar.DATE, 20);
		System.out.println(c.getTime());
	}
	public void me7() {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		c.roll(Calendar.DATE, 20);
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
	}
	public void me61() {
		Calendar c= Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		Calendar c3 = (Calendar)c2.clone();
		c3.add(Calendar.DATE, 20);
	}
	public void me8() {
		// 자바에서는 Calendar 클래스를 쓰자.
		// 그러나 DB에서는 Calendar 클래스보다는 Date클래스를 많이 사용한다.
		// 따라서 반드시 두 타입을 변환할 수 있어야 한다.
		Calendar c = Calendar.getInstance();
		Date d = new Date(c.getTimeInMillis());
		c.setTime(d);
		System.out.println(d);
	}
	public void me9() {
		System.out.println(String.format("%4d,%3s", 33,"hel"));
		Calendar c= Calendar.getInstance();
		System.out.println(c.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 dd일 hh시 mm분 ss초");
		String msg = sdf.format(c.getTime());
		System.out.println(msg);
	}
}
