package com.nate;

import com.naver.Car;
import com.naver.Person;

public class Team {
	
	private Person captain;
	private Person member1;
	private Person member2;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}

	public Team(Person captain, Person member1, Person member2) {
		super();
		this.captain = captain;
		this.member1 = member1;
		this.member2 = member2;
	}

	public Person getCaptain() {
		return captain;
	}

	public void setCaptain(Person captain) {
		this.captain = captain;
	}

	public Person getMember1() {
		return member1;
	}

	public void setMember1(Person member1) {
		this.member1 = member1;
	}

	public Person getMember2() {
		return member2;
	}

	public void setMember2(Person member2) {
		this.member2 = member2;
	}
	
	public void showCaptainCarPrice() {
		Car captainCar = captain.getK7();
		captainCar.showMeprice();
	}
	public void mem1Sleep(String where) {
		member1.getHappy().sleep("¹æ");
	}
	
	public void mem2PrintCarModelName() {
		String TCMN = member2.getK7().getModelName();
		System.out.println(TCMN);
	}

}
