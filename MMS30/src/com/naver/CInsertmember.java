package com.naver;

import java.util.Scanner;

public class CInsertmember implements Command{

	@Override
	public void ex(Scanner sc,MemberDAO dao) {

		int age = 0;
		System.out.println("사용할 ID 입력");
		String id = sc.nextLine();
		System.out.println("이름 입력");
		String name = sc.nextLine();
		System.out.println("나이 입력");
		try {
			age = sc.nextInt();
			sc.nextLine();
		} catch (Exception e) {
			sc.nextLine();
			System.out.println("숫자만 입력");
			return;
		}
		
		MemberDTO dto = new MemberDTO(id, name, age);
		dao.insert(dto);
	}

	@Override
	public String toString() {
		return "회원가입";
	}
	
	

}
