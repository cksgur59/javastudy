package com.naver;

public class MonOrger implements CommadMonsterInter{

	@Override
	public void monProfile() {
		
		String name = "Orger";
		int hp = 500;
		int power = 30;
		
		DB.mondb.add(new MonsterDTO(name, hp, power));
	}

}
