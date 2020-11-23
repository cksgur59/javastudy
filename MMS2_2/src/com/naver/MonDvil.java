package com.naver;

public class MonDvil implements CommadMonsterInter{

	@Override
	public void monProfile() {
		
		String name = "Dvil";
		int hp = 2000;
		int power = 100;
		
		DB.mondb.add(new MonsterDTO(name, hp, power));
	}

}
