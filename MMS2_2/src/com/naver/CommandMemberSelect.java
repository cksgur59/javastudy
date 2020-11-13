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
		System.out.println("회원 인원 :"+a);
	}
	@Override
	public String toString() {
		return " 회원 조회";
	}
}
