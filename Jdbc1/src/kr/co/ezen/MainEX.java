package kr.co.ezen;

import java.util.Calendar;
import java.util.Date;

import com.naver.MemberDAO;
import com.naver.MemberDTO;
import com.naver.Test;
import com.naver.test2;

public class MainEX {

	
	public static void main(String[] args) {
		
		Test dao = new Test();
		
		MemberDAO mdao = new MemberDAO();
		
		MemberDTO dto = new MemberDTO();
		
//		mdao.insert(dto);
		
//		mdao.delete(new MemberDTO("m009", null, null, null));
		
		test2 t2 = new test2();
		
//		t2.insert(new MemberDTO("m009", "qwe", "x", new java.sql.Date(Calendar.getInstance().getTimeInMillis())));
		t2.delete(new MemberDTO("m009", null, null, null));
	}
	
}
