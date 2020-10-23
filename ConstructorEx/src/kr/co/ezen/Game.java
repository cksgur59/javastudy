package kr.co.ezen;

public class Game {
	
	private String name;
	private int year;
	private String ab;
	private String cd;
	private String ef;
	private Dog dog;
	public Game(String name, int year, String ab, String cd, String ef,Dog dog) {
		super();
		this.name = name;
		this.year = year;
		this.ab = ab;
		this.cd = cd;
		this.ef = ef;
		this.dog = dog;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getAb() {
		return ab;
	}
	public void setAb(String ab) {
		this.ab = ab;
	}
	public String getCd() {
		return cd;
	}
	public void setCd(String cd) {
		this.cd = cd;
	}
	public String getEf() {
		return ef;
	}
	public void setEf(String ef) {
		this.ef = ef;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	
	
	
	
	
}
