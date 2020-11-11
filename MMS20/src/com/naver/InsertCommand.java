package com.naver;

import java.util.Scanner;

public class InsertCommand implements Command{

	@Override
	public void ex(Scanner sc) {
		System.out.println("id를 입력해주세요.");
		String id = sc.nextLine();
		
		System.out.println("name을 입력해주세요.");
		String name = sc.nextLine();
		
		System.out.println(" 나이를 입력해주세요.");
		int age = sc.nextInt();
		sc.nextLine();
		
		DB.db.add(new MemberDTO(id, name, age));
	}

}
