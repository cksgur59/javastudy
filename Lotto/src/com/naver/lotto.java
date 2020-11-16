package com.naver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class lotto {

	public void me1() {
		Random rdm = new Random();
		Set<Integer> set = new HashSet<Integer>();
		while(set.size()<6) {
			set.add(rdm.nextInt(45)+1);
		}
		List<Integer> list = new ArrayList<Integer>();
		Iterator<Integer> it= set.iterator();
		while (it.hasNext()) {
			Integer integer =  it.next();
			list.add(integer);
		}
		// 적은 숫자부터 정렬기능
		Collections.sort(list);
		
		
		System.out.println(list);
	}
	
}
