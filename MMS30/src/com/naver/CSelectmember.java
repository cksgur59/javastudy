package com.naver;

import java.util.List;
import java.util.Scanner;

public class CSelectmember implements Command{

	@Override
	public void ex(Scanner sc,MemberDAO dao) {
		List<MemberDTO> list = dao.select();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

	@Override
	public String toString() {
		return "회원조회";
	}
}
