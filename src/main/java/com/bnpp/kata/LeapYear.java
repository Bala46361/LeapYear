package com.bnpp.kata;

public class LeapYear {
	private static final int FOUR = 4;
	private static final int ZERO = 0;
	private int year;

	public boolean isLeapYear() {
		return year % FOUR == ZERO;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
