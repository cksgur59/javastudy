package com.naver;

import java.util.Scanner;

public class CInsertmember implements Command{

	@Override
	public void ex(Scanner sc,MemberDAO dao) {

		int age = 0;
		System.out.println("����� ID �Է�");
		String id = sc.nextLine();
		System.out.println("�̸� �Է�");
		String name = sc.nextLine();
		System.out.println("���� �Է�");
		try {
			age = sc.nextInt();
			sc.nextLine();
		} catch (Exception e) {
			sc.nextLine();
			System.out.println("���ڸ� �Է�");
			return;
		}
		
		MemberDTO dto = new MemberDTO(id, name, age);
		dao.insert(dto);
	}

	@Override
	public String toString() {
		return "ȸ������";
	}
	
	

}
