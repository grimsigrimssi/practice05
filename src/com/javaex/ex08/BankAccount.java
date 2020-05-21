package com.javaex.ex08;

public class BankAccount {
	
	private int no;
	private int won;
	
	public BankAccount() {}
	
	public BankAccount(int no, int won) {
		this.no = no;
		this.won = won;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		switch(no){
		case 1 : 
			System.out.print("예금액>");
			break;
		case 2 : 
			System.out.print("출금액>");
			break;
		case 3 : 
			System.out.println("잔고액>");
			break;
		case 4 : 
			System.out.println("프로그램 종료");		
			break;
		default: 	
			System.out.println("다시입력해주세요");
		
		}
	}

	public int getWon() {
		return won;
	}

	public void setWon(int won) {
		this.won = won;
	}
	
	
	
	

}
