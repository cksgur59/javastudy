package com.naver;

import java.util.Scanner;

public class CommandDelete implements Command{

	@Override
	public void ex(Scanner sc) {
		
		System.out.println("������ id�� �Է����ּ���.");
		String id = sc.nextLine();
		
		boolean a = DB.db.remove(new MemberDTO(null, id, 0));
		if (a) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
	}

	@Override
	public String toString() {
		return "����";
	}
	
	

	
	
}
