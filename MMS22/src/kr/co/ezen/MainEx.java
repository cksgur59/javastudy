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
			System.out.println("�޴��� �����ϼ���.");
			System.out.println("0. ���, 1. ��ȸ, 2.����, 3.����, 4. ����");
			int idx=sc.nextInt();
			sc.nextLine();
			menus[idx].execute(sc);
		}
		

		
		
		
		
		
		
		
		
	}
}
