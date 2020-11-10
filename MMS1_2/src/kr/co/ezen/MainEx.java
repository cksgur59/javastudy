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
			System.out.println("0.ȸ�� ����  1.ȸ������ ����  2.ȸ�� ��ȸ  3.ȸ�� ����  4.����");
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
