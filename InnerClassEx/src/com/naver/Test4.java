package com.naver;

import java.security.PublicKey;

public class Test4 {

	public void me1() {
		int a= 101;
		
		class LocalInnerClass{
			public void lic() {
				System.out.println(a);
				
			}
		}
		
		LocalInnerClass lic1 = new LocalInnerClass();
		lic1.lic();
	}
	
}
