package com.javaex.ex04;

public class BaseApp {

	public static void main(String[] args) {
		
		Base w1 = new Base("낮");
		w1.daynight(true);
		
		Base w2 = new Base("밤");
		w2.daynight(false);
		
		Base w3 = new Base("낮", "오후");
		w3.duringday(true);
	
		

		
		
//		System.out.println(diary.toString());
	}

}
