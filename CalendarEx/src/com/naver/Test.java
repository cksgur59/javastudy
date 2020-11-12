package com.naver;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test {

	public void me1() {
		//1. Calendar Ŭ���� ��ü ���� ���
		Calendar c= Calendar.getInstance();
	}
	
	public void me2() {
		// Calendar Ŭ������ �̿��ؼ� ��ü c�� �����Ͻÿ�.
		Calendar c = Calendar.getInstance();
		
		// c �� �̿��ؼ� ���� ���� �����ϱ�.
		int year = c.get(Calendar.YEAR);
		// �� ���� int month
		int month = c.get(Calendar.MONTH)+1;
		// �� ���� int date
		int date = c.get(Calendar.DATE);
		// �������� int day
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
		//1. 1950�� 6�� 25���� ���� �����ϱ��? ȭ�鿡 ����Ͻÿ�
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
		// 1950�� 2���� ���������� ��ĥ���� �������?
		// �׸��� �׳��� ������?
		// �� �� ���� ����Ͻÿ�.
		Calendar c= Calendar.getInstance();
		c.set(Calendar.YEAR, 1950);
		c.set(Calendar.MONTH, 2-1);
		int maxdate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		c.set(Calendar.DATE, maxdate);
		System.out.println(maxdate+" "+Calendar.DATE);
	}
	public void me5() {//�� �߿��� ����..����x
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		try {
			int year = sc.nextInt();
			sc.nextLine();
			System.out.println("���� �Է��ϼ���");
			int month = sc.nextInt();
			sc.nextLine();
			Calendar c = Calendar.getInstance();
			c.set(year, month-1, 1);
			int lastDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
			int firstDateDay = c.get(Calendar.DAY_OF_WEEK);
			System.out.println(year+"�� "+month+"��");
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
		// 2020 11 �� 12 ��
		// 20�� ��?
		// 2020 12 �� 2 ��
		// add( ) �� Calendar ��ü�� ������ �����մϴ�.
		// Ư�� �ʵ��� ���� �־��� ���� ���ؼ� �����մϴ�.
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
		// �ڹٿ����� Calendar Ŭ������ ����.
		// �׷��� DB������ Calendar Ŭ�������ٴ� DateŬ������ ���� ����Ѵ�.
		// ���� �ݵ�� �� Ÿ���� ��ȯ�� �� �־�� �Ѵ�.
		Calendar c = Calendar.getInstance();
		Date d = new Date(c.getTimeInMillis());
		c.setTime(d);
		System.out.println(d);
	}
	public void me9() {
		System.out.println(String.format("%4d,%3s", 33,"hel"));
		Calendar c= Calendar.getInstance();
		System.out.println(c.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY�� MM�� dd�� hh�� mm�� ss��");
		String msg = sdf.format(c.getTime());
		System.out.println(msg);
	}
}
