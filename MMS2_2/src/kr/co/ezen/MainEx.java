package kr.co.ezen;

import java.util.List;
import java.util.Scanner;

import com.naver.CommadMemberInter;
import com.naver.DB;

public class MainEx {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DB db = new DB();
		List<CommadMemberInter> coml = db.commandlist();
		
		boolean ist = true;
		int comlsc =0;
		int restart = 0;
		
		while (ist) {
			System.out.println("�Ŵ��� ������ �ּ���");
			for (int i = 0; i < coml.size(); i++) {
				System.out.print(i+"."+coml.get(i));
				if(i!=coml.size()) System.out.print(" , ");
			}
			System.out.println();
			try {
				comlsc = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("���ڸ� �Է��� �ּ���.");
				break;
			}
			
			coml.get(comlsc).cmi(sc);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}