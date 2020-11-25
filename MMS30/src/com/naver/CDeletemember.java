package com.naver;

import java.util.Scanner;

public class CDeletemember implements Command{

	@Override
	public void ex(Scanner sc,MemberDAO dao) {
		System.out.println("삭제할 id");
		String id =sc.nextLine();
		
		try {
			DB.db.remove(DB.db.indexOf(new MemberDTO(id, null, 0)));
			System.out.println("id 삭제 성공");
		} catch (Exception e) {
			System.out.println("존재하지 않는 id");
		}

		
	}
	
	@Override
	public String toString() {
		return "회원삭제";
	}

}
