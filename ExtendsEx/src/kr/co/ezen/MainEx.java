package kr.co.ezen;

import com.naver.Bmw;
import com.naver.Car;
import com.naver.Person;
import com.naver.Sonata;

public class MainEx {

	public static void main(String[] args) {
		// 다중성 : 객체를 생성하는 다양한 방법
		// (신규) 부모자료형 변수명 = new 자식생성자( );
		// (기존) 자식자료형 변수명 = new 자식생성자( );
		
		Car sonata1 = new Sonata("      Sonata1", "Hyundai", 2500);
		Car bmw1 = new Bmw("Bmw_S", "BMW", 6500);
		Car sonata2 = new Sonata("Sonata3", "KIA", 4000);
		Car bmw2 = new Bmw("Bmw_C", "BMW", 3300);
		
		Car[] arrCar = {sonata1,bmw1,sonata2,bmw2};
		
		Person person = new Person(arrCar);
		
		sonata1.equals(sonata2);//equals( ) 메서드의 파라미터 자료형이 Object
		
//		person.profile();
//		
//		person.me90("2020m11m6m맑음m금요일m5시m40분m종료", "m");
		
		
//		sonata1.run();
		
		Sonata s = null;
		
		if(sonata2 instanceof Sonata) {
			s = (Sonata)sonata2;
			s.only();
		}
		
		if (sonata2 instanceof Car) {
			s= (Sonata)sonata2;
			s.only();
		}
		
		
		if(sonata2.getClass() == Sonata.class) {
			s=(Sonata)sonata2;
			s.only();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
