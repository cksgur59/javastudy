package com.naver;

import java.util.Scanner;

public class InsertCommand implements Command{

	@Override
	public void ex(Scanner sc) {
		System.out.println("id�� �Է����ּ���.");
		String id = sc.nextLine();
		
		System.out.println("name�� �Է����ּ���.");
		String name = sc.nextLine();
		
		System.out.println(" ���̸� �Է����ּ���.");
		int age = sc.nextInt();
		sc.nextLine();
		
		DB.db.add(new MemberDTO(id, name, age));
	}

}
