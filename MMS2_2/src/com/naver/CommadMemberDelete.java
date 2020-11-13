package com.naver;

import java.util.Scanner;

public class CommadMemberDelete implements CommadMemberInter{

	@Override
	public void cmi(Scanner sc) {
		System.out.println("삭제하실 ID를 입력해 주세요.");
		String id =sc.nextLine();
		MemberDTO mem = new MemberDTO(id, null, 0);
		try {
			DB.memdb.remove(DB.memdb.indexOf(mem));
			System.out.println("삭제 완료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("입력한 ID가 존재하지 않습니다.");
		}
		
	}
	@Override
	public String toString() {
		return " 회원 삭제";
	}
}
