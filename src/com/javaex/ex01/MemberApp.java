package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member memberInfo = new Member();
			
		memberInfo.setId("jws");
		memberInfo.setName("정우성");
		memberInfo.setPoint(50000);	
		
		memberInfo.showInfo();
		
		
		memberInfo.setId("yjs");
		memberInfo.setName("유재석");
		memberInfo.setPoint(30000);			
	
		memberInfo.showInfo();
		
		
		memberInfo.setId("lhr");
		memberInfo.setName("이효리");
		memberInfo.setPoint(40000);	
	
		memberInfo.showInfo();
	
	}

}
