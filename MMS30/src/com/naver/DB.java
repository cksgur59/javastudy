package com.naver;

import java.util.ArrayList;
import java.util.List;

public class DB {

	public static List<MemberDTO> db = new ArrayList<MemberDTO>();
	
	public List<Command> commdb() {
		List<Command> cdb = new ArrayList<Command>();
		cdb.add(new CInsertmember());
		cdb.add(new CUpdatemember());
		cdb.add(new CSelectmember());
		cdb.add(new CDeletemember());
		return cdb;
	}
	
}
