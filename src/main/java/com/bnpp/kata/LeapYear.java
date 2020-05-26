package com.bnpp.kata;

public class LeapYear {
	private int year;

	public boolean isLeapYear() {
		if (year % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void setYear(int year) {
		this.year = year;
	}

}
