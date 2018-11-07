package org.md.util.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Used to generate a list of random integers.
 * 
 * @author Cameron
 */
public class RandomNumberListGenerator {

	/**
	 * Empty constructor
	 */
	public RandomNumberListGenerator() {
		super();
	}

	/**
	 * Generate a list of random positive integers.
	 * 
	 * @param floor
	 *            Integer of floor of random numbers generate. If less than zero,
	 *            will be set to zero.
	 * @param ceiling
	 *            Integer of ceiling of random numbers generated. If less than the
	 *            floor, set to floor plus one.
	 * @param size
	 *            Integer of number of random integers to be generated
	 * @return List of Integers
	 */
	public List<Integer> createListOfRandomIntegers(int floor, int ceiling, int size) {
		List<Integer> list = new ArrayList<Integer>();
		if (size > 0) {
			Random rand = new Random();
			floor = (floor < 0 ? 0 : floor);
			ceiling = (ceiling < floor ? floor + 1 : ceiling);
			for (int i = 0; i < size; i++) {
				list.add(rand.nextInt(ceiling) + floor);
			}
		}
		return list;
	}

	@Override
	public String toString() {
		return "RandomNumberListGenerator []";
	}
}
