package com.naver;

import java.util.Scanner;

public class SelectCommand implements Command{

	@Override
	public void ex(Scanner sc) {
		for (int i = 0; i < DB.db.size(); i++) {
			System.out.println(DB.db.get(i));
			
		}
		
	}

}
