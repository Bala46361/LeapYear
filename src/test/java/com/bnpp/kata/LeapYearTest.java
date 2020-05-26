package com.bnpp.kata;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LeapYearTest {

	@Test
	public void shouldReturnTrueWhenYear1996IsPassedAsInput() {
		LeapYear leapYear = new LeapYear();
		leapYear.setYear(1996);
		assertTrue(leapYear.isLeapYear());
	}
	
	
	@Test
	public void shouldReturnTrueWhenYear1992IsDivisibleBy4() {
		LeapYear leapYear = new LeapYear();
		leapYear.setYear(1992);
		assertTrue(leapYear.isLeapYear());
	}

}
