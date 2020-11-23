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
		member1.getHappy().sleep("��");
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
		System.out.println(a+" �� "+b+"�� �ο�ϴ�");
		//System.out.println(this.captain.getName()+" �� "+bTeam.captain.getName()+"�� �ο�ϴ�");
	}

	public void fightMem1(Team aTeam) {
		// TODO Auto-generated method stub
		String a = this.member1.getName();
		String b= aTeam.member1.getName();
		System.out.println(a+" �� "+b+"�� �ο�ϴ�");
		
	}

	public void fightMem2Dog(Team bTeam) {
		// TODO Auto-generated method stub
		System.out.println(this.member2.getHappy().getName()+" �� "+bTeam.member2.getHappy().getName()+"�� �ο�ϴ�");
	}

	public void carRace(Team aTeam) {
		// TODO Auto-generated method stub
		Car acar = this.member1.getK7();
		Car bcar = aTeam.member1.getK7();
		
		System.out.println(acar.getModelName()+" �� "+bcar.getModelName()+"�� ���");
		System.out.println("1����-> "+this.member1.getName());
		System.out.println("���� - "+acar.getCarNo()+"// ���� "+acar.getPrice());
		System.out.println("2����-> "+aTeam.member1.getName());
		System.out.println("���� - "+bcar.getCarNo()+"// ���� "+bcar.getPrice());
		
	}

}
