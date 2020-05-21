package com.javaex.ex05;

public class Print {
	private int num1;
	private boolean value;
	private double num2;
	private String name;
	
	
	public Print() {
	}
	
	public Print(int num1, boolean value, double num2, String name) {
		this.num1 = num1;
		this.value = value;
		this.num2 = num2;
		this.name = name;
	}

	public int getNum1() {
		return num1;
	}


	public void setNum1(int num1) {
		this.num1 = num1;
	}


	public boolean isValue() {
		return value;
	}


	public void setValue(boolean value) {
		this.value = value;
	}


	public double getNum2() {
		return num2;
	}


	public void setNum2(double num2) {
		this.num2 = num2;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println(num1);
		System.out.println(value);
		System.out.println(num2);
		System.out.println(name);
	}
	
	
}
