package kr.co.ezen;

import java.util.List;
import java.util.Scanner;

import com.naver.Command;
import com.naver.DB;
import com.naver.MemberDAO;

public class MainEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DB mdb = new DB();
		MemberDAO dao = new MemberDAO();
		List<Command> cmdlist = mdb.commdb();
		int menu = 0;
		
		while(true) {
			
			System.out.println("매뉴선택");
			for (int i = 0; i < cmdlist.size(); i++) {
				System.out.print(i+"."+cmdlist.get(i));
				if(i!=cmdlist.size()-1) System.out.print(" , ");
			}
				try {
					menu = sc.nextInt();
					sc.nextLine();
					cmdlist.get(menu).ex(sc,dao);
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
					System.out.println("숫자만 입력7");
				}
				
			
		}

		
		
		
	}
	
}
