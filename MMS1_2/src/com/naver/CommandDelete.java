package com.naver;

import java.util.Scanner;

public class CommandDelete implements command{

	@Override
	public void ex(Scanner sc) {
		
		System.out.println("������ ID�� �Է��� �ּ���.");
		String id = sc.nextLine();
		
		MemberDTO dto = new MemberDTO(id, null, 0);
		boolean a = DB.db.remove(dto);
		if (a) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
	}

}
