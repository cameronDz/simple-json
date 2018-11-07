package org.md.util.simple;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RandomNumberListGeneratorTest {
	private static final RandomNumberListGenerator GENERATOR = new RandomNumberListGenerator();

	@Test
	public void toString_test() {
		String expected = "RandomNumberListGenerator []";
		String actual = GENERATOR.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void createListOfRandomIntegers_zeros_returnEmptyList() {
		int expected = 0;
		int actual = GENERATOR.createListOfRandomIntegers(-1, 0, 0).size();
		assertEquals(expected, actual);
	}

	@Test
	public void createListOfRandomIntegers_shortList_returnThreeList() {
		int expected = 3;
		int actual = GENERATOR.createListOfRandomIntegers(1, 3, 3).size();
		assertEquals(expected, actual);
	}
}
