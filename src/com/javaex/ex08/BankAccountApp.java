package com.javaex.ex08;

import java.util.Scanner;

public class BankAccountApp {

	public static void main(String[] args) {
		
		int no;
		int won;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("312-89562-123456 계좌가 개설되었습니다.");
		System.out.println("");
		System.out.println("----------------------------------");
		System.out.println("1.예금  | 2.출금  | 3.잔고  | 4.종료");
		System.out.println("----------------------------------");
		System.out.print("선택>");
		no = sc.nextInt();
		
		BankAccount no01 = new BankAccount();
		no01.setNo(no);
		
		won = sc.nextInt();
		no01.setWon(won);
		
		System.out.println("");
		System.out.println("----------------------------------");
		System.out.println("1.예금  | 2.출금  | 3.잔고  | 4.종료");
		System.out.println("----------------------------------");
		System.out.print("선택>");
		no = sc.nextInt();
		
		BankAccount no02 = new BankAccount(no, won);
		no02.setNo(no);
		
		won = sc.nextInt();
		no02.setWon(won);
		
		System.out.println("");
		System.out.println("----------------------------------");
		System.out.println("1.예금  | 2.출금  | 3.잔고  | 4.종료");
		System.out.println("----------------------------------");
		System.out.print("선택>");
		no = sc.nextInt();
		
		BankAccount no03 = new BankAccount(no, won);
		
		
		
		
		
	}

}
