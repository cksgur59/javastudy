package kr.co.ezen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.naver.Command;
import com.naver.CommandDelete;
import com.naver.CommandInsert;
import com.naver.CommandList;
import com.naver.CommandSelect;
import com.naver.CommandUpdate;
import com.naver.MemberDTO;

public class MainEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		CommandList coml = new CommandList();
		List<Command> list = coml.cmdl();

		boolean ist = true;
		int idx = -1;
		
		try {
			while(ist) {
				System.out.println("메뉴 선택");
				for (int i = 0; i < list.size(); i++) {
					Command com = list.get(i);
					System.out.print(i+":");
					System.out.print(com);
					if (i==list.size()-1) {
						System.out.print(", ");
					}
				}
				System.out.println();
				idx = sc.nextInt();
				sc.nextLine();
				
				list.get(idx).ex(sc);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("잘못된 값입력");
		}finally {
			sc.close();
		}
		
		
		
		
		
	}
	
}
