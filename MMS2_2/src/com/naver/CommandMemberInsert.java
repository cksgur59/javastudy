package com.naver;

import java.util.Scanner;

public class CommandMemberInsert implements CommadMemberInter{

	@Override
	public void cmi(Scanner sc) {
		
		System.out.println("����Ͻ� ID�� �Է��� �ּ���.");
		String id = sc.nextLine();
		
		System.out.println("�̸��� �Է��� �ּ���.");
		String name = sc.nextLine();
		
		System.out.println("���̸� �Է��� �ּ���.");
		int age = sc.nextInt();
		sc.nextLine();
		
		MemberDTO mem = new MemberDTO(id, name, age);
		DB.memdb.add(mem);
	}

	@Override
	public String toString() {
		return " ȸ�� ���";
	}

	
	
}
