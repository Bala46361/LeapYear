package com.bnpp.kata;

public class LeapYear {
	private static final int FOUR_HUNDRED = 400;
	private static final int HUNDRED = 100;
	private static final int FOUR = 4;
	private static final int ZERO = 0;
	private int year;

	public boolean isLeapYear() {
		return (isYearDivisibleBy4() && isYearNotDivisibleBy100()) || isYearDivisibleBy400();
	}

	private boolean isYearDivisibleBy400() {
		return year % FOUR_HUNDRED == ZERO;
	}

	private boolean isYearNotDivisibleBy100() {
		return year % HUNDRED != ZERO;
	}

	private boolean isYearDivisibleBy4() {
		return year % FOUR == ZERO;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
