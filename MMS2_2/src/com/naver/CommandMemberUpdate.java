package com.naver;

import java.util.Scanner;

public class CommandMemberUpdate implements CommadMemberInter{

	@Override
	public void cmi(Scanner sc) {
		System.out.println("수정이 필요한 ID를 입력해 주세요.");
		String id = sc.nextLine();
		
		System.out.println("새로운 이름을 입력해 주세요.");
		String name = sc.nextLine();
		
		System.out.println("새로운 나이를 입력해 주세요.");
		int age = sc.nextInt();
		sc.nextLine();
		
		MemberDTO mem = new MemberDTO(id, name, age);
		try {
			DB.memdb.set(DB.memdb.indexOf(mem), mem);
			System.out.println("수정 완료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("입력하신 ID가 존재하지 않습니다.");
		}
	}
	
	@Override
	public String toString() {
		return " 회원 수정";
	}

}
