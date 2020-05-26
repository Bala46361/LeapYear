package com.bnpp.kata;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class LeapYearTest {

	LeapYear leapYear;

	@Before
	public void initialize() {
		leapYear = new LeapYear();
	}

	@Test
	public void shouldReturnTrueWhenYear1996IsPassedAsInput() {
		leapYear.setYear(1996);

		assertTrue(leapYear.isLeapYear());
	}

	@Test
	public void shouldReturnTrueWhenYear1992IsDivisibleBy4() {
		leapYear.setYear(1992);

		assertTrue(leapYear.isLeapYear());
	}

}
