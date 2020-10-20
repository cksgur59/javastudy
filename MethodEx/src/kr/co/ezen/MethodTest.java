package kr.co.ezen;

public class MethodTest {

	int a;
	boolean b = true;

	public MethodTest() {

	}

	public void stand() {
		System.out.println("무반환 무파람");
	}

	public void sleep() {
		System.out.println("public : 접근제한자로 프로젝트 전체에서 sleep매서드가 호출 될 수 있음을 의미함");

		System.out.println("void : 반환형이라 하고, 이는 반환되는 데이터의 자료형을 의미한다. void는 반환되는 데이타가 없다는 것을 의미한다.");

		System.out.println("slepp : 메서드의 이름이고, 나중에 메서드를 호출할 때 그 이름을 적어 줌으로서 메서드 본문 안에 있는 코드를 실행하게 한다.");

		System.out.println("(): 파리미터, 매개변수 선언하는 곳으로 마치 변수를 선언하듯 작성하면 됨. 파라미터가 두개 이상일 때는 ,를 구분자로 해서 구분을 해줌.");

		System.out.println("{} : 매서드의 본문..메서드 호출 때 실행하고 싶은 코드를 작성해줌.");

		System.out.println(
				"메서드 호출 : 메서드 호출 : 메서드를 사용하는 것을 의미. 사용법은 메서드명을 적고 소괄호를 칩니다. 그리고 소괄호 안에 파라미터의 자료형에 맞는 값을 넣어줍니다.");

	}

	public void sayHello() {
		System.out.println("Hello~");
	}

	public void sitDown() {
		System.out.println("그 자리에 즉시 앉음");
	}

	public void callName(String c) {
		System.out.println("안녕하세요 " + c);
	}

	public void printDan(int dan, int inp) {
		int i;
		for (i = 1; i <= inp; i++) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
		}
	}

	public void printScore(String name, int score) {
		System.out.println(name + " " + score + " 점");

	}

	public void carlc(int left, int right) {
		System.out.println(left + " + " + right + " = " + (left + right));
		System.out.println(left + " - " + right + " = " + (left - right));
		System.out.println(left + " * " + right + " = " + (left * right));
		System.out.println(left + " / " + right + " = " + (left / right));
	}

	public void star(char star, int high) {
		int i;
		int j;
		int abc=1;
		for (i=1;i<=high;i++) {
			for (j=1;j<=high;j++) {
			if (abc == i) {
				System.out.print(" ");
			}
			else {
				System.out.print("*");
			}
			}
			System.out.println("");
			abc = i;
		}
		

	}

	public void greeh(int inp) {
		System.out.println("1. Hello");
		System.out.println("2. Hi");
		System.out.println("3. Happy");
		System.out.println("4. Good morning");
	}

}
