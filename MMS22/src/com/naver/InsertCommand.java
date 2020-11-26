package com.naver;

import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

public class InsertCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("ȸ�� ���� ������ �����մϴ�.");
		System.out.println("���̵� �Է��ϼ���");
		String id = sc.nextLine();
		System.out.println("������ �Է��ϼ���.");
		String name = sc.nextLine();
		System.out.println("������ �Է��ϼ���");
		String job = sc.nextLine();
		System.out.println("����⵵�� �Է� �ϼ���.");
		int year = sc.nextInt();
		sc.nextLine();
		System.out.println("������� �Է��ϼ���.");
		int month = sc.nextInt();
		sc.nextLine();
		System.out.println("������� �Է��ϼ���.");
		int date = sc.nextInt();
		sc.nextLine();
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, date);
		Date birth = new Date(cal.getTimeInMillis());
		
		MemberDTO dto = new MemberDTO(id, name, job, birth);
		
		MemberDAO dao = new MemberDAO();
		dao.insert(dto);
	}

}
