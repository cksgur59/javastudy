package com.naver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test {

	public void me1() {
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		
//		int size = set.size();
//		System.out.println(size);
		
		
		Iterator<Integer> it = set.iterator();
		List<Integer> list = new ArrayList<Integer>();
		while (it.hasNext()) {
			list.add(it.next());
			System.out.println(list);
		}
		// data �߿� 3���� ����ϰ� �ʹ�.
		// while�� �ۿ���..
		Collections.sort(list);
		System.out.println(list.get(2));
//		
//		
//		set.remove(new Integer(4));
//		System.out.println(set);
		
		set.clear();
	}
	public void me2() {
		Set<String> set = new HashSet<String>();
		set.add("hello");
		set.add("Hello");
		set.add("HELLO");
		
		int size = set.size();
//		System.out.println(size);
		
		Iterator<String> it = set.iterator();
		List<String> list = new ArrayList<String>();
		while (it.hasNext()) {
			String string =  it.next();
			System.out.println(string);
			list.add(string);
		}
		int a =list.indexOf("HELLO");
		System.out.println(list.get(a));
		
//		set.remove(new String("HELLO"));
//		System.out.println(set);
	}
	public void me3() {
		Set<Apple> set = new HashSet<Apple>();
		set.add(new Apple("a001", "���1", 1500,"�뱸"));
		set.add(new Apple("a002", "���2", 2000,"����"));
		set.add(new Apple("a003", "���3", 3000,"����"));
		set.add(new Apple("a004", "���4", 2500,"�λ�"));
		set.add(new Apple("a005", "���5", 1000,"û��"));
		
		int size = set.size();
//		System.out.println(size);
		
		Iterator<Apple> it = set.iterator();
		List<Apple> list = new ArrayList<Apple>();
		
		while (it.hasNext()) {
			Apple apple = it.next();
			System.out.println(apple);
			list.add(apple);
		}
		int idx = list.indexOf(new Apple("a003", null, 0, null));
		System.out.println(list.get(idx));
		
//		set.remove(new Apple("a002", null, 0, null));
//		System.out.println(set);
	}
	public void me4() {
		Set<MemberDTO> set = new HashSet<MemberDTO>();
		set.add(new MemberDTO("m001", "kim", 4));
		set.add(new MemberDTO("m002", "lee", 11));
		set.add(new MemberDTO("m005", "park", 32));
		
		MemberDTO[] arr = new MemberDTO[set.size()];
		Iterator<MemberDTO> it = set.iterator();
		int i = 0;
		while (it.hasNext()) {
			MemberDTO memberDTO =  it.next();
			arr[i] = memberDTO;
			i++;
		}
		System.out.println(arr[1].getAge());
//		set.remove(new MemberDTO("m001", null, 0));
//		System.out.println(set);
	}
}
