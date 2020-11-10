package kr.co.ezen;

import java.util.Scanner;

import com.naver.CommandDelete;
import com.naver.CommandInsert;
import com.naver.CommandSelect;
import com.naver.CommandUpdate;
import com.naver.command;

public class MainEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		command[] cmd = { new CommandInsert(), new CommandUpdate(), new CommandSelect(), new CommandDelete() };

		boolean ist = true;
		int me = 0;

		while (ist) {
			System.out.println("0.회원 가입  1.회원정보 수정  2.회원 조회  3.회원 삭제  4.종료");
			me = sc.nextInt();
			sc.nextLine();

			if (me == cmd.length) {
				break;
			}
			cmd[me].ex(sc);
		}

		sc.close();
	}

}
