package com.naver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

import javax.sound.sampled.Line;

public class Test {

	public void me1() {
		Writer out = null;
		String[] arr = {"hello","world","good"};
		
		try {
			out = new FileWriter("C:"+File.separator+"ss.txt");
			out.write("kim");
			out.write(System.getProperty("line.separator"));
			
			for (int i = 0; i < arr.length; i++) {
				out.write(arr[i]);
				out.write(System.getProperty("line.separator"));
			}
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) out.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me11() {
		Writer out = null;
		String[] arr = {"hello", "good", "nice"};
		
		
		try {
			out= new FileWriter("C:"+File.separator+"me11.txt");
			out.write("lee");
			out.write(System.getProperty("line.separator"));
			for (int i = 0; i < arr.length; i++) {
				out.write(arr[i]);
				out.write(System.getProperty("line.separator"));
			}
			
			out.flush();
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) out.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me2() {
		Reader in = null;
		
		
		try {
			in = new FileReader("C:"+File.separator+"ss.txt");
			int what = 0;
			
			char[] arr = new char[1024];
			int len =0;
			
			while(true) {
				len=in.read(arr);
				if(len == -1) break;
				for (int i = 0; i < len; i++) {
					System.out.print(arr[i]);
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null) in.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
	public void me21() {
		Reader in = null;
		
		try {
			in = new FileReader("C:"+File.separator+"me11.txt");
			char[] arr = new char[1024];
			int what = 0;
			
			while(true) {
				what=in.read(arr);
				if(what == -1) break;
				for (int i = 0; i < what; i++) {
					System.out.print(arr[i]);
				}
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (in != null) in.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
	public void me3() {
		Reader in = null;
		Writer out = null;
		
		try {
			out = new FileWriter("C:"+File.separator+"me3.txt");
			
			out.write("1");
			out.write(System.getProperty("line.separator"));
			out.write("2");
			out.write(System.getProperty("line.separator"));
			out.write("3");
			out.write(System.getProperty("line.separator"));
			out.write('4');
			out.write(System.getProperty("line.separator"));
			out.write("목요일");
			out.write(System.getProperty("line.separator"));
			out.write("5");
			out.flush();
			in = new FileReader("C:"+File.separator+"me3.txt");
			char[] arr = new char[1024];
			int len = 0;
			
			while(true) {
				len = in.read(arr);
				if(len==-1) break;
				for (int i = 0; i < len; i++) {
					System.out.print(arr[i]);
				}
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null)in.close();
				if(out != null) out.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me4() {
		Reader in =null;
		BufferedReader br = null;
		try {
			in = new FileReader("C:"+File.separator+"me3.txt");
			br = new BufferedReader(in);
			
		
			
			while(true) {
				String msg =  br.readLine();
				if (msg == null) break;
				System.out.println(msg);
			}
			System.out.println("end");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(in!= null) in.close();
				if(br!= null) br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me41() {
		Reader rd = null;
		BufferedReader br = null;
		
		try {
			rd = new FileReader("C:"+File.separator+"me3.txt");
			br = new BufferedReader(rd);
			
			while(true) {
				String msg = br.readLine();
				if (msg == null) break;
				System.out.println(msg);
			}
			
			System.out.println("me41 end");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rd != null) rd.close();
				if(br != null) br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me5() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("당신이 가장 좋아하는 숫자 하나를 입력해주세요.");
		
		String sNum = br.readLine();
		int num = Integer.parseInt(sNum);
		
		System.out.println("당신이 가장 싫어하는 숫자 하나를 입력하세요.");
		String sNum2 = br.readLine();
		int num2 = Integer.valueOf(sNum2);
		
		System.out.println("두 수의 합은 ="+(num+num2));
		
		if(br == null) {
			br.close();
		}
		
		
		
		
	}
	
	public void me51() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1");
		String n1 = br.readLine();
		
		System.out.println("2");
		String n2 = br.readLine();
		
		int n3 = Integer.parseInt(n1);
		int n4 = Integer.parseInt(n2);
		
		System.out.println("두수의합 ="+(n3+n4));
	}
	
	
	public void me6() {
		InputStream in = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			in = new FileInputStream("C:"+File.separator+"me3.txt");
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			
			while(true) {
				String msg = br.readLine();
				if(msg == null)break;
				System.out.println(msg);
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) br.close();
				if (isr != null) isr.close();
				if (in != null) in.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me7() {
		Writer out = null;
		PrintWriter pr = null;
		
		try {
			out = new FileWriter("aaa.txt");
			pr = new PrintWriter(out);		
			pr.print(false);
			pr.println(false);
			pr.println(false);		
			pr.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(out != null) out.close();
				if(pr != null)pr.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me71() {
		Writer out = null;
		PrintWriter pr = null;
		Reader rd = null;
		BufferedReader bd = null;
		
		try {
			out = new FileWriter("aab.txt");
			pr = new PrintWriter(out);
			
			
			pr.print("aldlsl");
			pr.println("asdaf");
			
			rd = new FileReader("."+File.separator+"aab.txt");
			bd = new BufferedReader(rd);
			
			while(true) {
				String msg=bd.readLine();
				if (msg == null) break;
				System.out.println(msg);
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null)out.close();
				if(pr != null)pr.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


