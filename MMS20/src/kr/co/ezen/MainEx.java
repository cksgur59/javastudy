package kr.co.ezen;

import java.util.Scanner;

import com.naver.Command;
import com.naver.InsertCommand;
import com.naver.SelectCommand;

public class MainEx {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Command[] cm = {new InsertCommand(),new SelectCommand()};
		
		int me = 0;
		boolean ist = true;
		
		while(ist) {
			System.out.println("0. ȸ�� ����, 1.ȸ�� ��ȸ 2.����");
			me = sc.nextInt();
			sc.nextLine();
			
			if(me==cm.length) {
				break;
			}
			cm[me].ex(sc);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
