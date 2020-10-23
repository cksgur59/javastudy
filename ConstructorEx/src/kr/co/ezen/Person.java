package kr.co.ezen;

public class Person {
	private String name;
	private String address;
	private String job;
	private String age;
	private String dog;
	public Person() {
		
	}
	public Person(String name, String address, String job, String age, String dog) {
		super();
		this.name = name;
		this.address = address;
		this.job = job;
		this.age = age;
		this.dog = dog;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDog() {
		return dog;
	}
	public void setDog(String dog) {
		this.dog = dog;
	}
	
	
	
	

}
