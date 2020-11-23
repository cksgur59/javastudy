package com.naver;

import java.util.Scanner;

public class CommandDelete implements Command{

	@Override
	public void ex(Scanner sc) {
		
		System.out.println("삭제할 id를 입력해주세요.");
		String id = sc.nextLine();
		
		boolean a = DB.db.remove(new MemberDTO(null, id, 0));
		if (a) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
	}

	@Override
	public String toString() {
		return "삭제";
	}
	
	

	
	
}
