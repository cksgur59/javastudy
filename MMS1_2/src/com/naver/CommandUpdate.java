package com.naver;

import java.util.Scanner;

public class CommandUpdate implements command{

	@Override
	public void ex(Scanner sc) {
		
		System.out.println("ID�� �Է��� �ּ���");
		String id = sc.nextLine();
		
		System.out.println("������ �̸��� �Է����ּ���.");
		String name = sc.nextLine();
		
		System.out.println("������ ���̸� �Է����ּ���.");
		int age = sc.nextInt();
		sc.nextLine();
		
		DB.db.set(DB.db.indexOf(new MemberDTO(id, null, 0)), new MemberDTO(id, name, age));
		
	}

}
