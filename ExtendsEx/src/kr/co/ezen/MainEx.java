package kr.co.ezen;

import com.naver.Bmw;
import com.naver.Car;
import com.naver.Person;
import com.naver.Sonata;

public class MainEx {

	public static void main(String[] args) {
		// ���߼� : ��ü�� �����ϴ� �پ��� ���
		// (�ű�) �θ��ڷ��� ������ = new �ڽĻ�����( );
		// (����) �ڽ��ڷ��� ������ = new �ڽĻ�����( );
		
		Car sonata1 = new Sonata("      Sonata1", "Hyundai", 2500);
		Car bmw1 = new Bmw("Bmw_S", "BMW", 6500);
		Car sonata2 = new Sonata("Sonata3", "KIA", 4000);
		Car bmw2 = new Bmw("Bmw_C", "BMW", 3300);
		
		Car[] arrCar = {sonata1,bmw1,sonata2,bmw2};
		
		Person person = new Person(arrCar);
		
		sonata1.equals(sonata2);//equals( ) �޼����� �Ķ���� �ڷ����� Object
		
//		person.profile();
//		
//		person.me90("2020m11m6m����m�ݿ���m5��m40��m����", "m");
		
		
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
