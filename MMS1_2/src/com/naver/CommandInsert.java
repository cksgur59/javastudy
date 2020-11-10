package com.naver;

import java.util.Scanner;

public class CommandInsert implements command{

	@Override
	public void ex(Scanner sc) {
		System.out.println("사용할 ID를 입력해주세요.");
		String id = sc.nextLine();
		
		System.out.println("이름을 입력해 주세요");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력해 주세요.");
		int age = sc.nextInt();
		sc.nextLine();
		
		MemberDTO dto = new MemberDTO(id, name, age);
		DB.db.add(dto);
		
	}

}
