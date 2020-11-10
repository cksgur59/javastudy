package com.naver;

import java.util.Scanner;

public class CommandDelete implements command{

	@Override
	public void ex(Scanner sc) {
		
		System.out.println("삭제할 ID를 입력해 주세요.");
		String id = sc.nextLine();
		
		MemberDTO dto = new MemberDTO(id, null, 0);
		boolean a = DB.db.remove(dto);
		if (a) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
	}

}
