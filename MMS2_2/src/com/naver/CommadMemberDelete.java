package com.naver;

import java.util.Scanner;

public class CommadMemberDelete implements CommadMemberInter{

	@Override
	public void cmi(Scanner sc) {
		System.out.println("�����Ͻ� ID�� �Է��� �ּ���.");
		String id =sc.nextLine();
		MemberDTO mem = new MemberDTO(id, null, 0);
		try {
			DB.memdb.remove(DB.memdb.indexOf(mem));
			System.out.println("���� �Ϸ�");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("�Է��� ID�� �������� �ʽ��ϴ�.");
		}
		
	}
	@Override
	public String toString() {
		return " ȸ�� ����";
	}
}
