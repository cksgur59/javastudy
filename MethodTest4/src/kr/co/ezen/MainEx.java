package kr.co.ezen;

import com.naver.CarRegistManagementService;
import com.naver.DogRegistManagementService;
import com.naver.Dot;

public class MainEx {
public static void main(String[] args) {
	//CarRegistManagementService crms = new CarRegistManagementService();
	//crms.carName("K7");
	//System.out.println(crms);
	//String carName = crms.getCarName();
	//System.out.println();
	
	//CarRegistManagementService crms2 = new CarRegistManagementService();
	//int result = crms2.add1(4, 5);
	//System.out.println(result);
	
	DogRegistManagementService drms = new DogRegistManagementService();
	drms.makeDog("ȫ�浿", 26);
	System.out.println(drms.getDog());
	
}
}
