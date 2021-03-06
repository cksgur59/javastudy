package com.naver;

import java.io.Serializable;

public class MemberDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private int point;
	private int money;
	
	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}

	public MemberDTO(String id, String name, int point, int money) {
		super();
		this.id = id;
		this.name = name;
		this.point = point;
		this.money = money;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		MemberDTO other = (MemberDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", name=" + name + ", point=" + point + ", money=" + money + "]";
	}
	
	
}
