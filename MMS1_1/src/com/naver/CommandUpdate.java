package com.naver;

import java.util.Scanner;

public class CommandUpdate implements Command{

	@Override
	public void ex(Scanner sc) {
		System.out.println("id를 입력하세요");
		String id = sc.nextLine();
		
		System.out.println("수정할 이름을 입력하세요.");
		String name = sc.nextLine();
		
		System.out.println("수정할 나이를 입력해주세요.");
		int age = sc.nextInt();
		sc.nextLine();
		
		MemberDTO dto = new MemberDTO(name, id, age);
		DB.db.set(DB.db.indexOf(dto), dto);
		
	}
	@Override
	public String toString() {
		return "수정";
	}
}
