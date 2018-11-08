package org.md.util.simple;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class RollingAverageCalculatorTest {

	private static final RollingAverageCalculator CALCULATOR = new RollingAverageCalculator();
	private static final List<Integer> LIST = Arrays
			.asList(new Integer[] { 5, 9, 3, 1, 9, 3, 7, 5, 8, 3, 2, 9, 9, 5, 3, 4 });

	@Test
	public void calculateRollingAverage_validList_returnRollingAverage() {
		List<Integer> expected = Arrays.asList(new Integer[] { 5, 5, 4, 5, 5, 4, 5, 6, 6, 5 });
		List<Integer> actual = CALCULATOR.calculateRollingAverage(LIST);
		assertEquals(expected, actual);
	}

	@Test
	public void calculateRollingAverage_tooShortList_returnOriginalList() {
		List<Integer> expected = Arrays.asList(new Integer[] { 5, 9, 3, 1 });
		List<Integer> actual = CALCULATOR.calculateRollingAverage(expected);
		assertEquals(expected, actual);
	}

	@Test
	public void calculateRollingAverage_nullList_returnOriginalList() {
		List<Integer> expected = null;
		List<Integer> actual = CALCULATOR.calculateRollingAverage(expected);
		assertEquals(expected, actual);
	}
}
