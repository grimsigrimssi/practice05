package com.javaex.ex06;

public class CalcExchRate {


	public static double exchRatio;
	private int won;
	private double dollar;
	
	public CalcExchRate() {}
	
	public CalcExchRate(int won) {
		this.won = won;
	}

	public int getWon() {
		return won;
	}

	public void setWon(int won) {
		this.won = won;
	}
	
	public int calcExchRatio(int exchwon) {
		  exchwon = dollar / exchRatio;
	}
	
	
	
	
	public void result() {
		System.out.println(wonKo + "원은 " + exchRate * won +"입니다.");
		
	}
	
	
	
	
	
	
	
}
