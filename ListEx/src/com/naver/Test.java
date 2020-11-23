package com.naver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	public void me1() {

		List<Apple> list = new ArrayList<Apple>();
		list.add(new Apple());
		
		Apple iphone12 = list.get(0);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	public void me2() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(3));
		list.add(new Integer(4));
		list.add(new Integer(5));
		list.add(new Integer(6));
		
		int a = list.get(2);
		list.set(list.indexOf(4), 100);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list);
		list.remove(new Integer(100));
//		list.remove(1);
		System.out.println(list);
	}
	public void me3() {
		List<Float> list = new ArrayList<Float>();
		list.add(3.5F);
		list.add(4.1F);
		list.add(9.8F);
		
		float a = list.get(1);
		list.set(list.size()-1, 1.1F);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for (int i = list.size()-1; i >= 0; i--) {
			list.remove(i);
		}
		System.out.println(list);
	}
	public void me4() {
		List<StringBuffer> list = new ArrayList<StringBuffer>();
		list.add(new StringBuffer());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for (int i = list.size()-1; i >= 0; i--) {
			list.remove(i);
		}
	}
	public void me5() {
		List<Thread> list = new ArrayList<Thread>();
		list.add(new Thread());
		list.add(new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		}));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	public void me6() {
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		list.add(new HashMap<String, Object>());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		list.clear();
	}
	public List<MemberDTO> me7() {
		List<MemberDTO> ap = new ArrayList<MemberDTO>();
		ap.add(new MemberDTO("m001", "kim", 5));
		ap.add(new MemberDTO("m002", "lee", 12));
		ap.add(new MemberDTO("m003", "park", 53));
		ap.add(new MemberDTO("m004", "kang", 55));
		ap.add(new MemberDTO("m005", "choi", 11));
		
		
//		for (int i = 0; i < ap.size(); i++) {
//			System.out.println(ap.get(i));
//		}
		return ap;
	}
	public void me8() {
		List<Apple> list = new ArrayList<Apple>();
		list.add(new Apple("a001", "사과1", 1500,"대구"));
		list.add(new Apple("a002", "사과2", 2000,"대전"));
		list.add(new Apple("a005", "사과5", 1000,"청송"));
		list.add(new Apple("a003", "사과3", 3000,"서울"));
		list.add(new Apple("a004", "사과4", 2500,"부산"));
		System.out.println("=================");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("=================");
		int a=list.indexOf(new Apple("a004", "사과4", 2500,"부산"));
		System.out.println(a);
		for (int i = 0; i < list.size(); i++) {
			Apple ap = list.get(i);
			if (i==0) continue;
			System.out.println(ap);
		}
		
	}
}
