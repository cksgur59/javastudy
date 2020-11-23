package com.naver;

import java.util.Scanner;

public class PublicUser {

	public void userProfillInsert(Scanner sc) {
		System.out.println("사용하실 ID를 입력해 주세요.");
		String userId = sc.nextLine();
		
		System.out.println("사용하실 비밀번호를 입력해주세요");
		String password = sc.nextLine();
		
		System.out.println("이름을 입력해 주세요.");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력해 주세요.");
		int age = sc.nextInt();
		sc.nextLine();
		
		DB.userdb.add(new UserDTO(userId, password, new HeroProfill(300, 300, 10, 0, 0)));
		DB.memdb.add(new MemberDTO(userId, name, age));
	}
	
}
