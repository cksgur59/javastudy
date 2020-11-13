package com.naver;

import java.util.Scanner;

public class CommandMemberInsert implements CommadMemberInter{

	@Override
	public void cmi(Scanner sc) {
		
		System.out.println("사용하실 ID를 입력해 주세요.");
		String id = sc.nextLine();
		
		System.out.println("이름을 입력해 주세요.");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력해 주세요.");
		int age = sc.nextInt();
		sc.nextLine();
		
		MemberDTO mem = new MemberDTO(id, name, age);
		DB.memdb.add(mem);
	}

	@Override
	public String toString() {
		return " 회원 등록";
	}

	
	
}
