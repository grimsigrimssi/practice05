package com.javaex.ex04;

public class Base {
	
	private String daynight;
	private String duringday;
	
	public Base(String daynight) {
		this.daynight = daynight;
	}
	
	public Base(String daynight, String duringday) {
		this.daynight = daynight;
		this.duringday = duringday;
	}

	public String getDaynight() {
		return daynight;
	}

	public void setDaynight(String daynight) {
		this.daynight = daynight;
	}	
	
	public String getDuringday() {
		return duringday;
	}

	public void setDuringday(String duringday) {
		this.duringday = duringday;
	}

	public void daynight(boolean day) {
		if(day == true) {
			System.out.println(daynight + "에는 열심히 수업듣자");
		}else {
			System.out.println(daynight + "에는 숙면");
		}
	}
		
	public void duringday(boolean day) {
		if(day == true) {
			System.out.println(duringday + "도 " + daynight + "과 마찬가지로 열심히 공부해야 합니다");
		}
	}	
//	public String getDay() {
//		return day;
//	}
//
//	public String getNight() {
//		return night;
//	}
//
//	public String getNoon() {
//		return noon;
//	}

//	@Override
//	public String toString() {
//		return "Base [daynight=" + daynight + "]";
	
}
