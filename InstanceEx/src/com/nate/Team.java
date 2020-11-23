package com.nate;

import com.naver.Car;
import com.naver.Person;

import kr.co.ezen.Dog;

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
	
	public char getCaptainCarModelNameFirstChar() {
		String msgg = captain.getK7().getModelName();
		return msgg.charAt(0);
		
	}
	
	public void changeMem1DogName(String changeMem1DogName) {
		member1.getHappy().setName(changeMem1DogName);
		System.out.println(member1.getHappy().getName());
	}
	
	public void changeMem1Dog(Dog changeMem1Dog) {
		member1.setHappy(changeMem1Dog);
	}

	public void fight(Team otherTeam) {
		// TODO Auto-generated method stub
		String a=this.captain.getName();
		String b=otherTeam.captain.getName();
		System.out.println(a+" °ú "+b+"ÀÌ ½Î¿ó´Ï´Ù");
		//System.out.println(this.captain.getName()+" °ú "+bTeam.captain.getName()+"ÀÌ ½Î¿ó´Ï´Ù");
	}

	public void fightMem1(Team aTeam) {
		// TODO Auto-generated method stub
		String a = this.member1.getName();
		String b= aTeam.member1.getName();
		System.out.println(a+" °ú "+b+"ÀÌ ½Î¿ó´Ï´Ù");
		
	}

	public void fightMem2Dog(Team bTeam) {
		// TODO Auto-generated method stub
		System.out.println(this.member2.getHappy().getName()+" ¿Í "+bTeam.member2.getHappy().getName()+"°¡ ½Î¿ó´Ï´Ù");
	}

	public void carRace(Team aTeam) {
		// TODO Auto-generated method stub
		Car acar = this.member1.getK7();
		Car bcar = aTeam.member1.getK7();
		
		System.out.println(acar.getModelName()+" ¿Í "+bcar.getModelName()+"ÀÇ °æ±â");
		System.out.println("1¹øÂ÷-> "+this.member1.getName());
		System.out.println("Â÷¹ø - "+acar.getCarNo()+"// °¡°Ý "+acar.getPrice());
		System.out.println("2¹øÂ÷-> "+aTeam.member1.getName());
		System.out.println("Â÷¹ø - "+bcar.getCarNo()+"// °¡°Ý "+bcar.getPrice());
		
	}

}
