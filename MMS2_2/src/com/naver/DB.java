package com.naver;

import java.util.ArrayList;
import java.util.List;

public class DB {

	public static List<MemberDTO> memdb = new ArrayList<MemberDTO>();
	public static List<MonsterDTO> mondb = new ArrayList<MonsterDTO>();
	
	
	public List<CommadMemberInter> commandlist() {
		List<CommadMemberInter> coml = new ArrayList<CommadMemberInter>();
		
		coml.add(new CommandMemberInsert());
		coml.add(new CommandMemberSelect());
		coml.add(new CommandMemberUpdate());
		coml.add(new CommadMemberDelete());
		
		return coml;
	}
	
	public List<CommadMonsterInter> commandMonList() {
		List<CommadMonsterInter> comml = new ArrayList<CommadMonsterInter>();
		
		
		
		
		
		
		
		return comml;
	}
	
}
