package kr.co.ezen;

import java.util.Date;

import com.nate.Bobo;
import com.nate.Team;
import com.naver.Car;
import com.naver.Person;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		car.setCarNo("23¼ö 4559");
		car.setModelName("k7");
		car.setPrice(23000000);
		
		car.showMeprice();
		car.run(200);
		
		Dog dog = new Dog();
		dog.sleep("ÇĞ¿ø");
		
		
		Person person = new Person("12", "123", new Dog(), new Car("1233", "1231231", 500));
		person.printCarPrice();
		person.sleep("Áı");
		
	
		Team team = new Team(new Person("cksgur", "ÂùÇõ", new Dog(50, "ÀÌÂùÇõ", new Date()), new Car("aldla", "4559", 2520000)), new Person("cksgur", "ÂùÇõ", new Dog(50, "ÀÌÂùÇõ", new Date()), new Car("aldla", "4559", 2520000)), new Person("cksgur", "ÂùÇõ", new Dog(50, "ÀÌÂùÇõ", new Date()), new Car("±×·»Á®", "4559", 2520000)));
		team.showCaptainCarPrice();
		team.mem1Sleep("ÁöÇÏÃ¶¿ª");
		team.mem2PrintCarModelName();
		
		Bobo bobo = new Bobo("ÀÌÂùÇõ", 26, "010-3956-5***", new Car("½î³ªÅ¸", null, 0), new Dog(0, "ÃßÃß", null));
		bobo.chanPorfile();
	}

}
