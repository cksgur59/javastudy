package com.naver;

public class Test3 {

	private String msg;
	
	
	public static class StaticInnerClass {

		private int age;
		public static String name;
		
		
		public void sic() {
			Test3 t3 = new Test3();
			System.out.println("sic");
			System.out.println(t3.msg);
			t3.me1();
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		

	}

	public void me1() {
		
	}
}
