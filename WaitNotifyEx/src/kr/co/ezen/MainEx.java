package kr.co.ezen;

import com.naver.Board;
import com.naver.ReaderThread;
import com.naver.WriterTherad;

public class MainEx {

	
	public static void main(String[] args) {
		
		Board board = new Board();
		ReaderThread rt = new ReaderThread(board);
		WriterTherad wt = new WriterTherad(board);
		
		rt.start();
		wt.start();
		
		
		
		
		
		
		
		
		
	}
	
}
