package com.naver;

import java.util.Scanner;

public class PublicUser {

	public void userProfillInsert(Scanner sc) {
		System.out.println("����Ͻ� ID�� �Է��� �ּ���.");
		String userId = sc.nextLine();
		
		System.out.println("����Ͻ� ��й�ȣ�� �Է����ּ���");
		String password = sc.nextLine();
		
		System.out.println("�̸��� �Է��� �ּ���.");
		String name = sc.nextLine();
		
		System.out.println("���̸� �Է��� �ּ���.");
		int age = sc.nextInt();
		sc.nextLine();
		
		DB.userdb.add(new UserDTO(userId, password, new HeroProfill(300, 300, 10, 0, 0)));
		DB.memdb.add(new MemberDTO(userId, name, age));
	}
	
}
