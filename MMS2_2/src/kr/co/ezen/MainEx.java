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
		
		while (ist) {
			System.out.println("매뉴를 선택해 주세요");
			for (int i = 0; i < coml.size(); i++) {
				System.out.print(i+"."+coml.get(i));
				if(i<coml.size()-1) System.out.print(" , ");
			}
			System.out.println();
			try {
				comlsc = sc.nextInt();
				sc.nextLine();
				coml.get(comlsc).cmi(sc);
			} catch (Exception e) {
				System.out.println("1~4까지의 숫자만 입력해 주세요.  확인 (엔터)");
				sc.nextLine();
			} 
			
			
			
		}
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
