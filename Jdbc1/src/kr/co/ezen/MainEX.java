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
		
		MemberDAO dao2 = new MemberDAO();
		
		MemberDTO odto = dao2.selectByMid("m005");
		
		MemberDTO dto =new MemberDTO("m005", "Âù", odto.getJob(), odto.getBirth());
		
		dao2.update(dto);
		
	}
	
}
