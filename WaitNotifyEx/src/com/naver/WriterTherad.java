package com.naver;

public class WriterTherad extends Thread{

	private Board board;
	
	public WriterTherad() {
		// TODO Auto-generated constructor stub
	}

	public WriterTherad(Board board) {
		super();
		this.board = board;
	}

	@Override
	public void run() {
		board.setTodayPost("¿À´Ã Áøµµ ³¡");
	}
	
	
}
