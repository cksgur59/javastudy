package com.naver;

import java.util.Scanner;

public class CDeletemember implements Command{

	@Override
	public void ex(Scanner sc,MemberDAO dao) {
		System.out.println("������ id");
		String id =sc.nextLine();
		
		try {
			DB.db.remove(DB.db.indexOf(new MemberDTO(id, null, 0)));
			System.out.println("id ���� ����");
		} catch (Exception e) {
			System.out.println("�������� �ʴ� id");
		}

		
	}
	
	@Override
	public String toString() {
		return "ȸ������";
	}

}
