package com.naver;

import java.util.Scanner;

public class CommandMemberUpdate implements CommadMemberInter{

	@Override
	public void cmi(Scanner sc) {
		System.out.println("������ �ʿ��� ID�� �Է��� �ּ���.");
		String id = sc.nextLine();
		
		System.out.println("���ο� �̸��� �Է��� �ּ���.");
		String name = sc.nextLine();
		
		System.out.println("���ο� ���̸� �Է��� �ּ���.");
		int age = sc.nextInt();
		sc.nextLine();
		
		MemberDTO mem = new MemberDTO(id, name, age);
		try {
			DB.memdb.set(DB.memdb.indexOf(mem), mem);
			System.out.println("���� �Ϸ�");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("�Է��Ͻ� ID�� �������� �ʽ��ϴ�.");
		}
	}
	
	@Override
	public String toString() {
		return " ȸ�� ����";
	}

}
