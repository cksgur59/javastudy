package com.naver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	
	public void me1() {
		//1. Map, HashMap
		//2. map ��ü�� ���弼��.
		//��, Key: String , Value: Integer
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//map�� ������ �Է�
		map.put("�߷°��ӵ�", 5);
		map.put("�츮�� ��й�ȣ", 12345);
		map.put("����� �λ갣�� �Ÿ�", 300);
		
		int g = map.get("�߷°��ӵ�");
		System.out.println(g);
		int password = map.get("�츮�� ��й�ȣ");
		System.out.println(password);
		int km = map.get("����� �λ갣�� �Ÿ�");
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
		
		map.put("������", list1);
		map.put("�����", list2);
		
		List<String> kc = list2;
		System.out.println(map.get("������"));
		
		System.out.println(map.get("�����"));
		System.out.println(map);
		
		
	}
	
	public void me4() {
		Map<String, List<Dog>> map = new HashMap<String, List<Dog>>();
		List<Dog> list1 = new ArrayList<Dog>();
		list1.add(new Dog("d001", "������", "������", 3));
		list1.add(new Dog("d002", "�鱸", "������2", 4));
		
		List<Dog> list2 = new ArrayList<Dog>();
		list2.add(new Dog("d003", "happy", "������1", 3));
		list2.add(new Dog("d004", "Ÿũ", "������2", 2));
		
		map.put("������", list1);
		map.put("���۵�", list2);
		
		List<Dog> jindo = list1;
		List<Dog> sapud = list2;
		
		System.out.println(map.get("������"));
		for (int i = 0; i < jindo.size(); i++) {
			System.out.println(jindo.get(i));
		}
		System.out.println(map.get("���۵�"));
		for (int i = 0; i < sapud.size(); i++) {
			System.out.println(sapud.get(i));
		}
		System.out.println(map);
	}
	
	public void me5(String filename) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("txt", "��������");
		map.put("png", "�̹�������");
		map.put("gif", "�̹�������");
		map.put("jpeg", "�̹�������");
		map.put("jpg", "�̹�������");
		
		int idx = filename.lastIndexOf(".");
		String key = filename.substring(idx+1);
		String msg = map.get(key.toLowerCase());
		if (msg==null) {
			System.out.println("�ý��� ����");
		}else {
			System.out.println(msg);
		}
	}
	
	public void me51(String filename) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("txt", "��������");
		map.put("png", "�̹�������");
		map.put("gif", "�̹�������");
		map.put("jpeg", "�̹�������");
		map.put("jpg", "�̹�������");
		
		int a= filename.lastIndexOf(".");
		String b =filename.substring(a+1);
		String msg = map.get(b.toLowerCase());
		if (msg==null) {
			System.out.println("�ý��� ����");
		}else {
			System.out.println(map.get(b));
		}

	}
	
	public void me52(String file) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("txt", "��������");
		map.put("png", "�̹�������");
		map.put("gif", "�̹�������");
		map.put("jpeg", "�̹�������");
		map.put("jpg", "�̹�������");
		
		String na = file.substring(file.lastIndexOf(".")+1);
		String msg =map.get(na);
		if(msg==null) {
			System.out.println("�ý��� ����");
		}else System.out.println(map.get(na));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
