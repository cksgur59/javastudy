package kr.co.ezen;

import com.naver.MemberDAO;
import com.naver.MemberDTO;
import com.naver.OderDAO;
import com.naver.OderDTO;

public class MainEx {

	public static void main(String[] args) {
		
		MemberDAO md = new MemberDAO();
		OderDAO od = new OderDAO();
		
		OderDTO odt = new OderDTO();
		odt =  md.selectp("������ũ");
		md.update("������", odt);
		
	
		
	}
	
}
