package com.naver;

public class MonGobrin implements CommadMonsterInter{

	@Override
	public void monProfile() {
		
		String name = "Gobrin";
		int hp = 100;
		int power = 10;
		
		DB.mondb.add(new MonsterDTO(name, hp, power));
	}

}
