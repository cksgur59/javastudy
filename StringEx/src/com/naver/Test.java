package com.naver;

import java.util.StringTokenizer;

public class Test {

	public void me1() {
		//명시적 객체 생성법
		String msg2 = new String("hello");
	}
	
	public void me2() {
		//암시적 객체 생성법
		String msg = "hello";
	}
	
	public void me3() {
		String msg1 = new String("a");
		String msg2 = new String("a");
		String msg3 = "a";
		String msg4 = "a";
		System.out.println(msg3==msg4);
		
	}
	
	public void me4() {
		StringBuffer sb = new StringBuffer();
		String msg = "hello";
		msg = "good";
		//문자형이 계속해서 누적 되는 경우에는
		//String클래스를 사용하면
		//성능 저하가 발생
		//StringBuffer를 사용
		
		sb.append("안녕하세요");
		sb.append("홍길동 입니다");
		sb.append("123123");
		msg= sb.toString();
	}
	
	public void me5() {
		String str = "hello";
		//1. 배열의 크기를 아고 싶을 때 호출되는 속성? length
		//2. 문자열의 크기를 알고 싶으 때 사용하는 메서드? length( )
		System.out.println(str.length());
		//3. ArrayList<String> list = new ArrayList();
		// list.size();
	}
	
	public void me6() {
		String msg = "hello";
		//문자열의 특정 인덱스에 있는 문자를 알고 싶을 때, charAt()
		// msg의 가장 큰 인덱스에 해당하는 문자를 출력하시오
		System.out.println(msg.charAt(msg.length()-1));
		System.out.println("=============");
		// msg 문자열의 각 문자를 한 글자씩 모두 출력하시오.
		
		for (int i = 0; i < msg.length(); i++) {
			System.out.println(msg.charAt(i));
		}
	}
	
	public void me7(String msg) {	
		// msg에 'z'가 들어 있나?
		// msg에 'w'가 들어 있나?
		// msg에 'el'이 들어 있나?
		// msg에 'ow'가 들어 있나?
		// contains( ) or indexOf( )
		
		boolean result = msg.contains("z");
		// 특정 문자 또는 문자열의 시작 문자의 인덱스를 반환하는 메서드 indexOf( )
		// 단, 해당 문자 또는 문자열이 없으면 -1 반환....
		int idx = msg.indexOf('z');
		System.out.println(result);
		System.out.println(idx);
		
		System.out.println(msg.indexOf('l'));
		//문자열에서 검색된 동일 문자 중 가장 마지막 문자의 인덱스는 lastIndexOf( );
		idx = msg.lastIndexOf('l');
		System.out.println(idx);
		
		// 문자열에서 검색된 동일 문자 중 중간에 있는 문자의 인덱스는 어떻게 구할까?
		idx = msg.indexOf('l', msg.indexOf('l')+1);
		System.out.println(idx);
	}
	
	public void me8() {
		// 문자열이 특정 문자열로 끝났는지 여부를 알고 싶을 때, endsWith( )
		String msg1 = "abcd.jpg";
		String msg2 = "efgh.txt";
		
		boolean result1 = msg1.endsWith("jpg");
		System.out.println(result1);
		
		boolean result2 = msg2.endsWith(".txt");
		System.out.println(result2);
	}
	
	public void me9() {
		// 문자열이 특정 문자열로 시작하는지 알고 싶을 때, startsWith( )
		String msg = "hello";
		boolean result = msg.startsWith("he");
		System.out.println(result);
	}
	
	public void me10() {
		// 문자열끼리 데이터 값이 같은지 여부를 확인하고 싶을 때, equals( )/ equalsIgnoreCase( )
		String msg1 = "hello";
		String msg2 = new String("hello");
		String msg3 = "HELLO";
		
		boolean result1 = msg1.equals(msg2);
		boolean result2 = msg1.equals(msg3);
		System.out.println(result1);
		System.out.println(result2);
		
		boolean result3 = msg1.equalsIgnoreCase(msg3);
		System.out.println(result3);
	}
	
	public void me11() {
		// "he     llo"
				// 좌우 공백을 제거하고 싶을 때, trim( )

		String msg = "          he        llo                    ";
		System.out.println(msg.trim());
	}
	
	public void me12() {
		// + 연산자는 문자열에도 적용된다.
		// - 연산자는 문자열에 적용되지 않는다.
		// "hello world"에서
		// "hello "를 잘라내고 "world"만 남게 하고 싶다면?  substring( )
		
		String msg1 = "hello world";
		String submsg = msg1.substring(msg1.indexOf('w'));
		System.out.println(msg1);
		System.out.println(submsg);
		String submsg2=msg1.substring(msg1.indexOf('l')+1, msg1.lastIndexOf('l'));
		System.out.println(submsg2);
	}
	
	public void me13() {
		// 특정 기준 문자(delim)를 이용하여 서로 다른 의미를 갖고 있는 문자열(=token, 토큰)을 분활하기
		String msg = "teacheryo#1234##vip#1000#g#";
		//======================================================
		String[] arr = msg.split("#");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//=======================================================
		System.out.println("=================");
		
		StringTokenizer st = new StringTokenizer(msg, "#");
		String[] tArr = new String[st.countTokens()];
		
		int i = 0;
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			tArr[i] = token;
			i++;
		}
		
	}
	
	public void me131() {
		String msg = "2020@11@05@목요일@맑음@하늘보리";
		StringTokenizer sg = new StringTokenizer(msg, "@");
		String[] sgArr = new String[sg.countTokens()];
		
		int i = 0;
		while(sg.hasMoreTokens()) {
			String token = sg.nextToken();
			sgArr[i] = token;
			System.out.println(sgArr[i]);
			i++;
		}
		System.out.println("===============");
		System.out.println(sgArr[2]);
	}
	
	public void me132() {
		String msg = "2020@11@05@목요일@맑음@하늘보리";
		StringTokenizer msgT = new StringTokenizer(msg, "@");
		String[] msgTArr = new String[msgT.countTokens()];
		
		int i = 0;
		while(msgT.hasMoreTokens()) {
			msgTArr[i]=msgT.nextToken();
			System.out.println(msgTArr[i]);
			i++;
		}
		
	}
	
	public void me133() {
		String msg = "2020@11@05@   목요일   @맑음@하늘보리";
		StringTokenizer msgt = new StringTokenizer(msg, "@");
		String[] msgtArry = new String[msgt.countTokens()];
		
		int a=0;
		int b=0;
		int i = 0;
		while(msgt.hasMoreTokens()) {
			String token = msgt.nextToken();
			msgtArry[i] = token;
			System.out.println(msgtArry[i]);
			System.out.println(msgtArry[i].charAt(0));
			System.out.println("==========");
			if (msgtArry[i].charAt(0)==' ') {

				// 1( 첫번째 글 찾기
				for (int j = 0; j < msgtArry[i].length(); j++) {
					if (msgtArry[i].charAt(j)!=' ') {
						a=j+1;
						break;
					}
				}
				// )1
				
				// 2( 마지막 글 찾기
				for (int j = msgtArry[i].length()-1; j >= 0; j--) {
					if (msgtArry[i].charAt(j)!=' ') {
						b=j;
						break;
					}
				}
				// )2
				
				msgtArry[i] = token.substring(token.indexOf(a), token.indexOf(b));
			} 
			else {
				msgtArry[i] = msgt.nextToken();
			}
			System.out.println(msgtArry[i++]);
		}
	}
	
	public void me134(String msg) {
		int a = 0;
		int b = 0;
		if (msg.charAt(0)==' ') {
			
			for (int j = 0; j < msg.length(); j++) {
				if (msg.charAt(j)!=' ') {
			
					a=j;
					break;
				}
			}
			
			for (int j = msg.length()-1; j >=0 ; j--) {
				if (msg.charAt(j) != ' ') {
					b=j;
					break;
				}
			}
			System.out.println(a);
			System.out.println(b);
			System.out.println(msg.charAt(a));
			System.out.println();
			String msg2 = msg.substring(a, b+1);
			System.out.println(msg2);
			
		}
		
	}
	
	public void me14(int age) {
		//문자열의 숫자를 + 연산을 사용하지 않고 표현하는 방법
		String msg = ("홍길동은 "+age+" 살입니다.");
		System.out.println(msg);
		
		String msg2 = "홍길동은 %d 살입니다.";
		System.out.println(String.format(msg2, age));
		
		int month= 3;
		String msg3 = "오늘은 2020년%2d월20일입니다.";
		System.out.println(String.format(msg3, month));
		
		int date = 5;
		String msg4 = "오늘은 2020년11월%-2d일입니다.";
		System.out.println(String.format(msg4, date));
		
		int money = 1000000;
		String msg5 = "내 전재산은 %,d입니다.";
		System.out.println(String.format(msg5, money));
		
		String msg7 = "내 전재산은 %,15d원 입니다.";
		System.out.println(String.format(msg7, money));
		
		//자리수를 지종해주고, 이를 다 못 채웠을 때 앞의 공백을 0으로 채우기
		// 자릿수: 5, 숫자는 11이면 ->00011
		int a = 26;
		String msg8 = "내 등번호는 %03d입니다.";
		System.out.println(String.format(msg8, a));
		
		String msg10 = "%d + %d = %d입니다.";
		System.out.println(String.format(msg10, 5,2,7));
		
		String msg11 = "%3.2f%% 입니다.";
		System.out.println(String.format(msg11, 51.627));
		
		
	}
		
		public void me15() {
			String msg1 = "hello";
			String msg2 = "Hello";
			String msg3 = "HELLO";
			
			System.out.println(msg1.toUpperCase());
			System.out.println(msg2.toLowerCase());
			System.out.println(msg3.toLowerCase());
			
		}
		
		public void me135(String msg) {
			StringTokenizer ms = new StringTokenizer(msg, "$");
			String[] msarr = new String[ms.countTokens()];
			int i = 0;
			while(ms.hasMoreTokens()) {
				msarr[i] = ms.nextToken();
				
					System.out.println(msarr[i++].trim());
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
