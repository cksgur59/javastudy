package kr.co.ezen;

public class MainEx {

	public static void main(String[] args) {

		Test1 t1 = new Test1(5, 6);

		Person kim0 = new Person();

		kim0.setAddress("s01");
		kim0.setAge("26");
		kim0.setDog("dogi");
		kim0.setJob("good");
		kim0.setName("ÂùÇõ");

		System.out.println(kim0.getAddress());
		System.out.println(kim0.getAge());
		System.out.println(kim0.getDog());
		System.out.println(kim0.getJob());
		System.out.println(kim0.getName());

		Person kim1 = new Person("add", "asd", "awd", "axd", "asd");

		System.out.println(kim1.getAddress());
		System.out.println(kim1.getAge());
		System.out.println(kim1.getDog());
		System.out.println(kim1.getJob());
		System.out.println(kim1.getName());
		
		Game gm = new Game("123", 26, "1", "2", "3", new Dog(123, 456, 789, 159 , new Cat(1, 2, 3, 4, new Mouse(5, 6, 7, 8,new Dongki(9, 10, 11, 12, new Dudu(13, 14, 15, 16))))));
		
		System.out.println(gm);
		
		System.out.println(gm.getName());
		System.out.println(gm.getYear());
		System.out.println(gm.getAb());
		System.out.println(gm.getCd());
		System.out.println(gm.getEf());
		System.out.println(gm.getDog());
		System.out.println(gm.getDog().getAsd());
		System.out.println(gm.getDog().getQwe());
		System.out.println(gm.getDog().getRfv());
		System.out.println(gm.getDog().getZxc());
		System.out.println(gm.getDog().getPp().getEee());
		System.out.println(gm.getDog().getPp().getQqq());
		System.out.println(gm.getDog().getPp().getWww());
		System.out.println(gm.getDog().getPp().getZxc());
		System.out.println(gm.getDog().getPp().getMse().getFff());
		System.out.println(gm.getDog().getPp().getMse().getCcc());
		System.out.println(gm.getDog().getPp().getMse().getXxx());
		System.out.println(gm.getDog().getPp().getMse().getZzz());
		System.out.println(gm.getDog().getPp().getMse().getDongki().getRrr());
		System.out.println(gm.getDog().getPp().getMse().getDongki().getTtt());
		System.out.println(gm.getDog().getPp().getMse().getDongki().getUuu());
		System.out.println(gm.getDog().getPp().getMse().getDongki().getYyy());
		System.out.println(gm.getDog().getPp().getMse().getDongki().getDudu().getGgg());
		System.out.println(gm.getDog().getPp().getMse().getDongki().getDudu().getHhh());
		System.out.println(gm.getDog().getPp().getMse().getDongki().getDudu().getJjj());
		System.out.println(gm.getDog().getPp().getMse().getDongki().getDudu().getOoo());
		
		
		

		
		
		
		
		
		
		
		
		
	}

}
