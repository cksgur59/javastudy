package kr.co.ezen;

import java.util.List;
import java.util.Scanner;

import com.naver.CommadMemberInter;
import com.naver.CommadMonsterInter;
import com.naver.DB;
import com.naver.PublicUser;
import com.naver.UserDTO;
import com.naver.login;

public class MainEx {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DB db = new DB();
		List<CommadMemberInter> coml = db.commandlist();
		List<CommadMonsterInter> comml = db.commandMonList();
		login log = new login();
		UserDTO user = new UserDTO();
		
		boolean ist = true;
		int comlsc =0;
		int menu = 0;
		String id;
		String password;
		
		
		
		while (ist) {
			System.out.println("1.로그인   2. 회원가입   3.    4.회원관리");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {

				System.out.println("ID를 입력해 주세요");
				id = sc.nextLine();
				System.out.println("Password를 입력해 주세요");
				password = sc.nextLine();
				user = log.login1(id, password);
				System.out.println(user);

			}
			if(menu == 2) {
				PublicUser pbu = new PublicUser();
				pbu.userProfillInsert(sc);
			}
			
			if (menu == 4) {
				//회원 관리================
				while (ist) {
					System.out.println("매뉴를 선택해 주세요");
					for (int i = 0; i < coml.size(); i++) {
						System.out.print(i + "." + coml.get(i));
						if (i < coml.size())
							System.out.print(" , ");
					}
					System.out.print("4. 종료");
					System.out.println();
					try {
						comlsc = sc.nextInt();
						sc.nextLine();
						if (comlsc == 4)
							break;
						coml.get(comlsc).cmi(sc);
					} catch (Exception e) {
						System.out.println("1~5까지의 숫자만 입력해 주세요.  확인 (엔터)");
						sc.nextLine();
					}
				}
				//======================
			} 
		}
		sc.close();
	}
}
