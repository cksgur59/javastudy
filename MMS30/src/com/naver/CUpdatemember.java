package com.naver;

import java.util.Scanner;

public class CUpdatemember implements Command{

	@Override
	public void ex(Scanner sc,MemberDAO dao) {
		MemberDTO dto = null;
		System.out.println("������ �ʿ��� id");
		String id = sc.nextLine();
		try {
			dto = dao.selectm(id);
			if (dto == null) {
				System.out.println("�������� �ʴ� id");
				return;
			}
		} catch (Exception e1) {
			System.out.println("�������� �ʴ� id");
			return;
		}
		System.out.println("���ο� �̸�");
		String name = sc.nextLine();
		System.out.println("���ο� ����");
		int age;
		try {
			age = sc.nextInt();
		} catch (Exception e) {
			sc.nextLine();
			System.out.println("���ڸ� �Է�");
			return;
		}
		
		dto.setName(name);
		dto.setAge(age);
		
		dao.update(dto);
		System.out.println("��������");
	}

	@Override
	public String toString() {
		return "ȸ������";
	}
}
