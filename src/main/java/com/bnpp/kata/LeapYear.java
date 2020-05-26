package com.bnpp.kata;

public class LeapYear {
	private int year;

	public boolean isLeapYear() {
		return year % 4 == 0;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
