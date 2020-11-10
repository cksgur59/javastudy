package com.naver;

import java.util.Scanner;

public class CommandUpdate implements command{

	@Override
	public void ex(Scanner sc) {
		
		System.out.println("ID를 입력해 주세요");
		String id = sc.nextLine();
		
		System.out.println("수정할 이름을 입력해주세요.");
		String name = sc.nextLine();
		
		System.out.println("수정할 나이를 입력해주세요.");
		int age = sc.nextInt();
		sc.nextLine();
		
		DB.db.set(DB.db.indexOf(new MemberDTO(id, null, 0)), new MemberDTO(id, name, age));
		
	}

}
