package com.naver;

import java.util.Scanner;

public class CommandUpdate implements Command{

	@Override
	public void ex(Scanner sc) {
		System.out.println("id�� �Է��ϼ���");
		String id = sc.nextLine();
		
		System.out.println("������ �̸��� �Է��ϼ���.");
		String name = sc.nextLine();
		
		System.out.println("������ ���̸� �Է����ּ���.");
		int age = sc.nextInt();
		sc.nextLine();
		
		MemberDTO dto = new MemberDTO(name, id, age);
		DB.db.set(DB.db.indexOf(dto), dto);
		
	}
	@Override
	public String toString() {
		return "����";
	}
}
