package com.naver;

public class login {

	public UserDTO login1(String userId , String password) {
		UserDTO us = new UserDTO(userId, password, null);
		UserDTO usprofill =new UserDTO();
		int a = 0;
		try {
			a = DB.userdb.indexOf(us);
			usprofill = DB.userdb.get(a);
		} catch (Exception e) {
			System.out.println("입력하신 Id와 password를 확인해 주세요.");
		}
		return usprofill;
	}
	
	
}
