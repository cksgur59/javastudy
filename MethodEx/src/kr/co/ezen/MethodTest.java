package kr.co.ezen;

public class MethodTest {

	int a;
	boolean b = true;

	public MethodTest() {

	}

	public void stand() {
		System.out.println("����ȯ ���Ķ�");
	}

	public void sleep() {
		System.out.println("public : ���������ڷ� ������Ʈ ��ü���� sleep�ż��尡 ȣ�� �� �� ������ �ǹ���");

		System.out.println("void : ��ȯ���̶� �ϰ�, �̴� ��ȯ�Ǵ� �������� �ڷ����� �ǹ��Ѵ�. void�� ��ȯ�Ǵ� ����Ÿ�� ���ٴ� ���� �ǹ��Ѵ�.");

		System.out.println("slepp : �޼����� �̸��̰�, ���߿� �޼��带 ȣ���� �� �� �̸��� ���� �����μ� �޼��� ���� �ȿ� �ִ� �ڵ带 �����ϰ� �Ѵ�.");

		System.out.println("(): �ĸ�����, �Ű����� �����ϴ� ������ ��ġ ������ �����ϵ� �ۼ��ϸ� ��. �Ķ���Ͱ� �ΰ� �̻��� ���� ,�� �����ڷ� �ؼ� ������ ����.");

		System.out.println("{} : �ż����� ����..�޼��� ȣ�� �� �����ϰ� ���� �ڵ带 �ۼ�����.");

		System.out.println(
				"�޼��� ȣ�� : �޼��� ȣ�� : �޼��带 ����ϴ� ���� �ǹ�. ������ �޼������ ���� �Ұ�ȣ�� Ĩ�ϴ�. �׸��� �Ұ�ȣ �ȿ� �Ķ������ �ڷ����� �´� ���� �־��ݴϴ�.");

	}

	public void sayHello() {
		System.out.println("Hello~");
	}

	public void sitDown() {
		System.out.println("�� �ڸ��� ��� ����");
	}

	public void callName(String c) {
		System.out.println("�ȳ��ϼ��� " + c);
	}

	public void printDan(int dan, int inp) {
		int i;
		for (i = 1; i <= inp; i++) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
		}
	}

	public void printScore(String name, int score) {
		System.out.println(name + " " + score + " ��");

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
