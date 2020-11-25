package com.naver;

import java.util.Scanner;

public class CUpdatemember implements Command{

	@Override
	public void ex(Scanner sc,MemberDAO dao) {
		MemberDTO dto = null;
		System.out.println("수정이 필요한 id");
		String id = sc.nextLine();
		try {
			dto = dao.selectm(id);
			if (dto == null) {
				System.out.println("존재하지 않는 id");
				return;
			}
		} catch (Exception e1) {
			System.out.println("존재하지 않는 id");
			return;
		}
		System.out.println("새로운 이름");
		String name = sc.nextLine();
		System.out.println("새로운 나이");
		int age;
		try {
			age = sc.nextInt();
		} catch (Exception e) {
			sc.nextLine();
			System.out.println("숫자만 입력");
			return;
		}
		
		dto.setName(name);
		dto.setAge(age);
		
		dao.update(dto);
		System.out.println("수정성공");
	}

	@Override
	public String toString() {
		return "회원수정";
	}
}
