package com.naver;

import java.io.Serializable;

public class MonsterDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private int hp;
	private int power;
	
	public MonsterDTO() {
		// TODO Auto-generated constructor stub
	}

	public MonsterDTO(String name, int hp, int power) {
		super();
		this.name = name;
		this.hp = hp;
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "MonsterDTO [name=" + name + ", hp=" + hp + ", power=" + power + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MonsterDTO other = (MonsterDTO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
	
}
