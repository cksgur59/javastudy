package com.naver;

import java.util.Scanner;

public class CommandInsert implements command{

	@Override
	public void ex(Scanner sc) {
		System.out.println("����� ID�� �Է����ּ���.");
		String id = sc.nextLine();
		
		System.out.println("�̸��� �Է��� �ּ���");
		String name = sc.nextLine();
		
		System.out.println("���̸� �Է��� �ּ���.");
		int age = sc.nextInt();
		sc.nextLine();
		
		MemberDTO dto = new MemberDTO(id, name, age);
		DB.db.add(dto);
		
	}

}
