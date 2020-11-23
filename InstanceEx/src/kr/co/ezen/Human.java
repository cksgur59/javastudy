package kr.co.ezen;

import com.nate.Bobo;
import com.naver.Person;

public class Human {

	private String human1;

	private String human2;

	private String human3;

	private String human4;

	private String human5;

	private String human6;

	private String human7;

	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String human1, String human2, String human3, String human4, String human5, String human6,
			String human7) {
		super();
		this.human1 = human1;
		this.human2 = human2;
		this.human3 = human3;
		this.human4 = human4;
		this.human5 = human5;
		this.human6 = human6;
		this.human7 = human7;
	}

	public String getHuman1() {
		return human1;
	}

	public void setHuman1(String human1) {
		this.human1 = human1;
	}

	public String getHuman2() {
		return human2;
	}

	public void setHuman2(String human2) {
		this.human2 = human2;
	}

	public String getHuman3() {
		return human3;
	}

	public void setHuman3(String human3) {
		this.human3 = human3;
	}

	public String getHuman4() {
		return human4;
	}

	public void setHuman4(String human4) {
		this.human4 = human4;
	}

	public String getHuman5() {
		return human5;
	}

	public void setHuman5(String human5) {
		this.human5 = human5;
	}

	public String getHuman6() {
		return human6;
	}

	public void setHuman6(String human6) {
		this.human6 = human6;
	}

	public String getHuman7() {
		return human7;
	}

	public void setHuman7(String human7) {
		this.human7 = human7;
	}

	public void humanList() {
		// TODO Auto-generated method stub
		System.out.println(human1);
		System.out.println(human2);
		System.out.println(human3);
		System.out.println(human4);
		System.out.println(human5);
		System.out.println(human6);
		System.out.println(human7);

	}

}
