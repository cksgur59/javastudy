package com.naver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	
	public void me1() {
		//1. Map, HashMap
		//2. map 객체를 만드세여.
		//단, Key: String , Value: Integer
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//map에 데이터 입력
		map.put("중력가속도", 5);
		map.put("우리집 비밀번호", 12345);
		map.put("서울과 부산간의 거리", 300);
		
		int g = map.get("중력가속도");
		System.out.println(g);
		int password = map.get("우리집 비밀번호");
		System.out.println(password);
		int km = map.get("서울과 부산간의 거리");
		System.out.println(km);
		
		System.out.println(map);
	}
	
	public void me2() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "kim");
		map.put(0, "lee");
		map.put(2, "park");
		map.put(1, "kang");
		
		System.out.println(map.get(0));
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map);

	}
	
	public void me3() {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		
		List<String> list1 = new ArrayList<String>();
		list1.add("sonata");
		list1.add("exel");
		list1.add("genesis");
		list1.add("grandure");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("k7");
		list2.add("k5");
		list2.add("price");
		list2.add("jeep");
		
		map.put("현대차", list1);
		map.put("기아차", list2);
		
		List<String> kc = list2;
		System.out.println(map.get("현대차"));
		
		System.out.println(map.get("기아차"));
		System.out.println(map);
		
		
	}
	
	public void me4() {
		Map<String, List<Dog>> map = new HashMap<String, List<Dog>>();
		List<Dog> list1 = new ArrayList<Dog>();
		list1.add(new Dog("d001", "누렁이", "진도인", 3));
		list1.add(new Dog("d002", "백구", "진도인2", 4));
		
		List<Dog> list2 = new ArrayList<Dog>();
		list2.add(new Dog("d003", "happy", "독일인1", 3));
		list2.add(new Dog("d004", "타크", "독일인2", 2));
		
		map.put("진돗개", list1);
		map.put("셰퍼드", list2);
		
		List<Dog> jindo = list1;
		List<Dog> sapud = list2;
		
		System.out.println(map.get("진돗개"));
		for (int i = 0; i < jindo.size(); i++) {
			System.out.println(jindo.get(i));
		}
		System.out.println(map.get("셰퍼드"));
		for (int i = 0; i < sapud.size(); i++) {
			System.out.println(sapud.get(i));
		}
		System.out.println(map);
	}
	
	public void me5(String filename) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("txt", "문서파일");
		map.put("png", "이미지파일");
		map.put("gif", "이미지파일");
		map.put("jpeg", "이미지파일");
		map.put("jpg", "이미지파일");
		
		int idx = filename.lastIndexOf(".");
		String key = filename.substring(idx+1);
		String msg = map.get(key.toLowerCase());
		if (msg==null) {
			System.out.println("시스템 파일");
		}else {
			System.out.println(msg);
		}
	}
	
	public void me51(String filename) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("txt", "문서파일");
		map.put("png", "이미지파일");
		map.put("gif", "이미지파일");
		map.put("jpeg", "이미지파일");
		map.put("jpg", "이미지파일");
		
		int a= filename.lastIndexOf(".");
		String b =filename.substring(a+1);
		String msg = map.get(b.toLowerCase());
		if (msg==null) {
			System.out.println("시스템 파일");
		}else {
			System.out.println(map.get(b));
		}

	}
	
	public void me52(String file) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("txt", "문서파일");
		map.put("png", "이미지파일");
		map.put("gif", "이미지파일");
		map.put("jpeg", "이미지파일");
		map.put("jpg", "이미지파일");
		
		String na = file.substring(file.lastIndexOf(".")+1);
		String msg =map.get(na);
		if(msg==null) {
			System.out.println("시스템 파일");
		}else System.out.println(map.get(na));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
