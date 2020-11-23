package com.naver;

import java.util.StringTokenizer;

public class Test {

	public void me1() {
		//����� ��ü ������
		String msg2 = new String("hello");
	}
	
	public void me2() {
		//�Ͻ��� ��ü ������
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
		//�������� ����ؼ� ���� �Ǵ� ��쿡��
		//StringŬ������ ����ϸ�
		//���� ���ϰ� �߻�
		//StringBuffer�� ���
		
		sb.append("�ȳ��ϼ���");
		sb.append("ȫ�浿 �Դϴ�");
		sb.append("123123");
		msg= sb.toString();
	}
	
	public void me5() {
		String str = "hello";
		//1. �迭�� ũ�⸦ �ư� ���� �� ȣ��Ǵ� �Ӽ�? length
		//2. ���ڿ��� ũ�⸦ �˰� ���� �� ����ϴ� �޼���? length( )
		System.out.println(str.length());
		//3. ArrayList<String> list = new ArrayList();
		// list.size();
	}
	
	public void me6() {
		String msg = "hello";
		//���ڿ��� Ư�� �ε����� �ִ� ���ڸ� �˰� ���� ��, charAt()
		// msg�� ���� ū �ε����� �ش��ϴ� ���ڸ� ����Ͻÿ�
		System.out.println(msg.charAt(msg.length()-1));
		System.out.println("=============");
		// msg ���ڿ��� �� ���ڸ� �� ���ھ� ��� ����Ͻÿ�.
		
		for (int i = 0; i < msg.length(); i++) {
			System.out.println(msg.charAt(i));
		}
	}
	
	public void me7(String msg) {	
		// msg�� 'z'�� ��� �ֳ�?
		// msg�� 'w'�� ��� �ֳ�?
		// msg�� 'el'�� ��� �ֳ�?
		// msg�� 'ow'�� ��� �ֳ�?
		// contains( ) or indexOf( )
		
		boolean result = msg.contains("z");
		// Ư�� ���� �Ǵ� ���ڿ��� ���� ������ �ε����� ��ȯ�ϴ� �޼��� indexOf( )
		// ��, �ش� ���� �Ǵ� ���ڿ��� ������ -1 ��ȯ....
		int idx = msg.indexOf('z');
		System.out.println(result);
		System.out.println(idx);
		
		System.out.println(msg.indexOf('l'));
		//���ڿ����� �˻��� ���� ���� �� ���� ������ ������ �ε����� lastIndexOf( );
		idx = msg.lastIndexOf('l');
		System.out.println(idx);
		
		// ���ڿ����� �˻��� ���� ���� �� �߰��� �ִ� ������ �ε����� ��� ���ұ�?
		idx = msg.indexOf('l', msg.indexOf('l')+1);
		System.out.println(idx);
	}
	
	public void me8() {
		// ���ڿ��� Ư�� ���ڿ��� �������� ���θ� �˰� ���� ��, endsWith( )
		String msg1 = "abcd.jpg";
		String msg2 = "efgh.txt";
		
		boolean result1 = msg1.endsWith("jpg");
		System.out.println(result1);
		
		boolean result2 = msg2.endsWith(".txt");
		System.out.println(result2);
	}
	
	public void me9() {
		// ���ڿ��� Ư�� ���ڿ��� �����ϴ��� �˰� ���� ��, startsWith( )
		String msg = "hello";
		boolean result = msg.startsWith("he");
		System.out.println(result);
	}
	
	public void me10() {
		// ���ڿ����� ������ ���� ������ ���θ� Ȯ���ϰ� ���� ��, equals( )/ equalsIgnoreCase( )
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
				// �¿� ������ �����ϰ� ���� ��, trim( )

		String msg = "          he        llo                    ";
		System.out.println(msg.trim());
	}
	
	public void me12() {
		// + �����ڴ� ���ڿ����� ����ȴ�.
		// - �����ڴ� ���ڿ��� ������� �ʴ´�.
		// "hello world"����
		// "hello "�� �߶󳻰� "world"�� ���� �ϰ� �ʹٸ�?  substring( )
		
		String msg1 = "hello world";
		String submsg = msg1.substring(msg1.indexOf('w'));
		System.out.println(msg1);
		System.out.println(submsg);
		String submsg2=msg1.substring(msg1.indexOf('l')+1, msg1.lastIndexOf('l'));
		System.out.println(submsg2);
	}
	
	public void me13() {
		// Ư�� ���� ����(delim)�� �̿��Ͽ� ���� �ٸ� �ǹ̸� ���� �ִ� ���ڿ�(=token, ��ū)�� ��Ȱ�ϱ�
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
		String msg = "2020@11@05@�����@����@�ϴú���";
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
		String msg = "2020@11@05@�����@����@�ϴú���";
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
		String msg = "2020@11@05@   �����   @����@�ϴú���";
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

				// 1( ù��° �� ã��
				for (int j = 0; j < msgtArry[i].length(); j++) {
					if (msgtArry[i].charAt(j)!=' ') {
						a=j+1;
						break;
					}
				}
				// )1
				
				// 2( ������ �� ã��
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
		//���ڿ��� ���ڸ� + ������ ������� �ʰ� ǥ���ϴ� ���
		String msg = ("ȫ�浿�� "+age+" ���Դϴ�.");
		System.out.println(msg);
		
		String msg2 = "ȫ�浿�� %d ���Դϴ�.";
		System.out.println(String.format(msg2, age));
		
		int month= 3;
		String msg3 = "������ 2020��%2d��20���Դϴ�.";
		System.out.println(String.format(msg3, month));
		
		int date = 5;
		String msg4 = "������ 2020��11��%-2d���Դϴ�.";
		System.out.println(String.format(msg4, date));
		
		int money = 1000000;
		String msg5 = "�� ������� %,d�Դϴ�.";
		System.out.println(String.format(msg5, money));
		
		String msg7 = "�� ������� %,15d�� �Դϴ�.";
		System.out.println(String.format(msg7, money));
		
		//�ڸ����� �������ְ�, �̸� �� �� ä���� �� ���� ������ 0���� ä���
		// �ڸ���: 5, ���ڴ� 11�̸� ->00011
		int a = 26;
		String msg8 = "�� ���ȣ�� %03d�Դϴ�.";
		System.out.println(String.format(msg8, a));
		
		String msg10 = "%d + %d = %d�Դϴ�.";
		System.out.println(String.format(msg10, 5,2,7));
		
		String msg11 = "%3.2f%% �Դϴ�.";
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
