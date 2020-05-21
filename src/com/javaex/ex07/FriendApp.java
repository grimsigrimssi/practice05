package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		
		String name;
		String hp;
		String school;
		
		Scanner sc01 = new Scanner(System.in);
		Scanner sc02 = new Scanner(System.in);
		Scanner sc03 = new Scanner(System.in);
		
		System.out.println("친구 3명을 등록해 주세요");
		System.out.print("이름: ");
		name = sc01.next();
		
		System.out.print("핸드폰: ");
		hp = sc01.next();
		
		System.out.print("학교: ");
		school = sc01.next();
		
		Friend f01 = new Friend(name, hp, school);
		
		System.out.println("------------------------");
		
		System.out.print("이름: ");
		name = sc02.next();
		
		System.out.print("핸드폰: ");
		hp = sc02.next();
		
		System.out.print("학교: ");
		school = sc02.next();
		
		Friend f02 = new Friend(name, hp, school);
		
		System.out.println("------------------------");
		
		System.out.print("이름: ");
		name = sc03.next();
		
		System.out.print("핸드폰: ");
		hp = sc03.next();
		
		System.out.print("학교: ");
		school = sc03.next();
		
		Friend f03 = new Friend(name, hp, school);
		
		System.out.println("------------------------");
		
		Friend[] fArray = new Friend[3];
		
		fArray[0] = f01;
		fArray[1] = f02;
		fArray[2] = f03;
	
		for(int i=0; i<fArray.length; i++) {
			fArray[i].showInfo();
		}	
		
	}

}
