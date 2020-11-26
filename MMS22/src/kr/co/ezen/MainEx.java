package kr.co.ezen;

import java.util.Scanner;

import com.naver.Command;
import com.naver.DeleteCommand;
import com.naver.Endcommnad;
import com.naver.InsertCommand;
import com.naver.MemberDAO;
import com.naver.MemberDTO;
import com.naver.SelectCommand;
import com.naver.UpdateCommand;

public class MainEx {

	
	public static void main(String[] args) {
	
		Command[] menus = {new InsertCommand(),new SelectCommand()
				,new UpdateCommand(), new DeleteCommand(), new Endcommnad()};
		
		Scanner sc = new Scanner(System.in);
		
		boolean istrue = true;
		
		while(istrue) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("0. 등록, 1. 조회, 2.수정, 3.삭제, 4. 종료");
			int idx=sc.nextInt();
			sc.nextLine();
			menus[idx].execute(sc);
		}
		

		
		
		
		
		
		
		
		
	}
}
