package com.naver;

public class Board {
	
	private String todayPost;
	private boolean isok;
	
	
	public Board() {
		// TODO Auto-generated constructor stub
	}
	public String getTodayPost() {
		if(!isok) {
			synchronized (this) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return todayPost;
	}
	public void setTodayPost(String todayPost) {
		this.todayPost = todayPost;
		
		isok = true;
		
		synchronized (this) {
			notify();
		}
	}
	
	
}
