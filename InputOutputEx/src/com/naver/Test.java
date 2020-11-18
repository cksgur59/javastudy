package com.naver;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.locks.Condition;

public class Test {

	public void me1() {
		//byte stream���� �Է°� ���õ� �ֻ��� �θ�Ŭ������ InputStream
		//byte stream���� ��°� ���õ� �ֻ��� �θ�Ŭ������ OutputStream
		//InputStream, OutputStream �߻�Ŭ�����Դϴ�.
		//��ü ������ ��....
		// I / O ��ü�� �ݵ�� ������ �� �޸𸮸� �������Ѿ���.
		//1. stream�� ���� �մϴ�
		//2. try~catch~finally ������ ����
		//3. finally �ȿ� try~catch
		//4. finally �ȿ� �ִ� try�� close( ) ȣ�� , catch�� ����ó���� ����
		//5. ���� catch�� ����ó�� ����
		//6. ���� try�� �ڵ���.
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			out = new FileOutputStream("C:/test_copy.jpg");
			
			int what = -1;
			// ���� ó������ ������ �����͸� 1����Ʈ�� �о� ��
			// �� ���� �ݺ����� ����ؾ� �ϳ�? -> �𸣱� ������ while�� ���
			while(true) {
				what = in.read();
				if(what == -1) {
					break;
				}
				
				out.write(what);
			}
			
			System.out.println("file copy end");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace(); 
			}
		}	
	}
	
	
	public void me11() {
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in =new FileInputStream("C:"+File.separator+"test.jpg");
			out = new FileOutputStream("C:"+File.separator+"test_copy.jpg");
			
			int what = -1;
			while(true) {
				what = in.read();
				if(what == -1) {
					break;
				}
				out.write(what);
			}
			System.out.println("file copy end");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in!= null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	
	}
	
	public void me12() {
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			out = new FileOutputStream("C:" + File.separator +"test_copy.jpg");
			
			int what =0;
			
			while(true) {
				what = in.read();
				if(what == -1) {
					break;
				}
				out.write(what);
			}
			System.out.println("file copy end");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me13() {
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			out =new FileOutputStream("C:"+File.separator+"test_Copy.jpg");
			
			int what = 9;
			
			while(true) {
				what = in.read();
				if (what == -1) {
					break;
				}
				out.write(what);
			}
			
			System.out.println("file copy end");
			
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me14() {
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("C:" + File.separator+"test.jpg");
			out = new FileOutputStream("C:"+File.separator+"test_me14.jpg");
			
			int a= 0;
			boolean b = true;
			while(b) {
				a = in.read();
				if(a==-1) {
					break;
				}
				out.write(a);
			}
			System.out.println("file copy end");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null) in.close();
				if(out != null) out.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me2() {
		InputStream in = null;
		BufferedInputStream bis = null;
		OutputStream out = null;
		BufferedOutputStream bos = null;
		
		try {
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			bis = new BufferedInputStream(in);
			out = new FileOutputStream("C:"+File.separator+"test_me2.jpg");
			bos = new BufferedOutputStream(out);
			
			int what = 0;
			
			while(true) {
				what = in.read();
				if(what == -1) {
					break;
					
					
				}
				out.wait(what);
			}
			System.out.println("file end");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis != null) bis.close();
				if(bos != null) bos.close();
				if(in != null) in.close();
				if(out != null) out.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me21() {
		InputStream in = null;
		BufferedInputStream bis=null;
		OutputStream out = null;
		BufferedOutputStream bos = null;
		
		try {
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			bis = new BufferedInputStream(in);
			out = new FileOutputStream("C:"+File.separator+"test_me21.jpg");
			bos = new BufferedOutputStream(out);
			
			int a = 0;
			while(true) {
				a = in.read();
				if(a==-1) break;
				out.write(a);
			}
			System.out.println("file cp end");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis != null) bis.close();
				if(bos != null) bos.close();
				if(in != null) in.close();
				if(out != null) out.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
	public void me3() {
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			out = new FileOutputStream("C:"+File.separator+"me3.jpg");
			int what = -1;
			
			byte[] arr = new byte[1024];
			
			
			
			
			while(true) {
				int leght = in.read(arr);
				if(leght == -1) break;
				out.write(arr, 0, leght);
			}
			System.out.println("file copy end");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null) in.close();
				if(out != null)out.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me31() {
		InputStream in = null;
		OutputStream out=null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			bis = new BufferedInputStream(in);
			out = new FileOutputStream("C:"+File.separator+"me31.jpg");
			bos = new BufferedOutputStream(out);
			
			int a = 0;
			byte[] w = new byte[1024];
			
			while(true) {
				a = in.read(w);
				if(a==-1) break;
				out.write(w, 0, a);		
			}
			System.out.println("end");
	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis != null) bis.close();
				if(bos != null) bos.close();
				if(in != null) in.close();
				if(out != null) out.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me4() {
		InputStream in = null;
		BufferedInputStream bis = null;
		OutputStream out = null;
		BufferedOutputStream bos = null;
		
		try {
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			bis = new BufferedInputStream(in);
			out = new FileOutputStream("C:"+File.separator+"me4.jpg");
			bos= new BufferedOutputStream(out);
			
			int len = 0;
			byte[] w = new byte[1024];
			
			while(true) {
				len = in.read(w);
				if(len == -1) break;
				out.write(w, 0, len);
				
			}
			System.out.println("end");	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bis != null )bis.close();
				if (bos != null )bos.close();
				if (out != null )out.close();
				if (in != null )in.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
	
	public void me41() {
		
		InputStream in = null;
		OutputStream out = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			bis = new BufferedInputStream(in);
			out = new FileOutputStream("C:"+File.separator+"me41.jpg");
			bos = new BufferedOutputStream(out);
			
			byte[] w = new byte[1024];
			int len = 0;
			
			while(true) {
				len = in.read(w);
				if(len == -1) break;
				out.write(w, 0, len);
			}
			System.out.println("end");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis != null) bis.close();
				if(bos != null) bos.close();
				if(out != null) out.close();
				if(in != null) in.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	public void me5() {
	
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			out = new FileOutputStream(".+File.separator+src+File.separator+Upload"+File.separator+"me3.jpg");
			int what = -1;
			
			byte[] arr = new byte[1024];
			
			
			
			
			while(true) {
				int leght = in.read(arr);
				if(leght == -1) break;
				out.write(arr, 0, leght);
			}
			System.out.println("file copy end");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null) in.close();
				if(out != null)out.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
