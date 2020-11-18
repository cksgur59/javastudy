package com.naver;

public class Board2 {

	private String todayPost;
	private boolean isok;
	
	
	public Board2() {
		// TODO Auto-generated constructor stub
	}


	public String getTodayPost() {
		if(!isok) {
			synchronized (todayPost) {
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
