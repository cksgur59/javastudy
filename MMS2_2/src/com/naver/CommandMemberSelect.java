package com.naver;

import java.util.Scanner;

public class CommandMemberSelect implements CommadMemberInter{

	@Override
	public void cmi(Scanner sc) {
		int a= 0;
		for (int i = 0; i < DB.memdb.size(); i++) {
			System.out.println(DB.memdb.get(i));
			a= i+1;
		}
		System.out.println("ȸ�� �ο� :"+a);
	}
	@Override
	public String toString() {
		return " ȸ�� ��ȸ";
	}
}
