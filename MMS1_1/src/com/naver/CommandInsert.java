package com.naver;

import java.util.Scanner;

public class CommandInsert implements Command{

	@Override
	public void ex(Scanner sc) {
		
		System.out.println("사용할 id를 입력하세요");
		String id = sc.nextLine();
		
		System.out.println("이름을 입력해 주세요.");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력해 주세요.");
		int age = sc.nextInt();
		sc.nextLine();
		
		MemberDTO dto = new MemberDTO(name, id, age);
		DB.db.add(dto);
		
	}
	@Override
	public String toString() {
		return "가입";
	}
	
	
}
