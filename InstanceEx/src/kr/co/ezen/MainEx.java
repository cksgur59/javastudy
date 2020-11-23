package kr.co.ezen;

import java.util.Calendar;
import java.util.Date;

import com.nate.Bobo;
import com.nate.Team;
import com.naver.Car;
import com.naver.Person;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Car car = new Car();
//		car.setCarNo("23¼ö 4559");
//		car.setModelName("k7");
//		car.setPrice(23000000);
//		
//		car.showMeprice();
//		car.run(200);
//		
//		Dog dog = new Dog();
//		dog.sleep("ÇĞ¿ø");
//		
//		
//		Person person = new Person("12", "123", new Dog(), new Car("1233", "1231231", 500));
//		person.printCarPrice();
//		person.sleep("Áı");
//		
//	
//		Team team = new Team(new Person("cksgur", "ÂùÇõ", new Dog(50, "ÀÌÂùÇõ", new Date()), new Car("aldla", "4559", 2520000)), new Person("cksgur", "ÂùÇõ", new Dog(50, "ÀÌÂùÇõ", new Date()), new Car("aldla", "4559", 2520000)), new Person("cksgur", "ÂùÇõ", new Dog(50, "ÀÌÂùÇõ", new Date()), new Car("±×·»Á®", "4559", 2520000)));
//		team.showCaptainCarPrice();
//		team.mem1Sleep("ÁöÇÏÃ¶¿ª");
//		team.mem2PrintCarModelName();
//		
//		Bobo bobo = new Bobo("ÀÌÂùÇõ", 26, "010-3956-5***", new Car("½î³ªÅ¸", null, 0), new Dog(0, "ÃßÃß", null));
//		bobo.chanPorfile();
//		
//		team.changeMem1DogName("»Ç»ß");
//		team.changeMem1Dog(new Dog(10, "ÀÌ¸®", null));

		Car car1 = new Car("K7", "¼­¿ï 34ÀÚ 1234", 4000);
		// car1.showMeprice();
		Car car2 = new Car("BMW", "¼­¿ï 33»ç 9876", 5000);

		Car car3 = new Car("SM5", "°æ±â 31ÀÚ 1234", 4000);

		Dog dog1 = new Dog(1, "happy", new Date(11));

		Dog dog2 = new Dog(2, "merry", new Date());

		Dog dog3 = new Dog(3, "¹é±¸", new Date(Calendar.getInstance().getTimeInMillis()));

		Person captain = new Person("P1", "AÆÀÁÖÀå", dog1, car1);

		Person member1 = new Person("P2", "±èÀ¯½Å", dog2, car2);

		Person member2 = new Person("P3", "ÀÌ¼ø½Å", dog3, car3);

		Team aTeam = new Team(captain, member1, member2);

		Car car4 = new Car("½î³ªÅ¸", "°æ±â 30ÀÚ 4559", 3000);

		Car car5 = new Car("½î³ªÅ¸", "°æ±â 30ÀÚ 4558", 3500);

		Car car6 = new Car("½î³ªÅ¸", "°æ±â 30ÀÚ 4557", 3800);

		Dog dog4 = new Dog(4, "¿ø¼şÀÌ", new Date(110));

		Dog dog5 = new Dog(5, "»Ç»ß", new Date());

		Dog dog6 = new Dog(6, "Èæ±¸", new Date(Calendar.getInstance().getTimeInMillis()));

		Person captain2 = new Person("P4", "BÆÀÁÖÀå", dog4, car4);

		Person member3 = new Person("P5", "À¯¹Î»ó", dog5, car5);

		Person member4 = new Person("P6", "±èÁØÇö", dog6, car6);

		Team bTeam = new Team(captain2, member3, member4);

		Bobo captain1Profile = new Bobo(captain.getName(), 32, "010-4885-8711", car1, dog1);
		
		captain1Profile.chanPorfile();
		
		
		
//		aTeam.fight(bTeam);
//
//		bTeam.fightMem1(aTeam);
//
//		aTeam.fightMem2Dog(bTeam);
		
		bTeam.carRace(aTeam);
		
		Human human = new Human(captain.getName(), member1.getName(), member2.getName(), captain2.getName(), member3.getName(), member4.getName(), captain1Profile.getName1());
		
		human.humanList();
		

	}

}
