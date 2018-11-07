package org.md.util.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 
 * @author Cameron
 */
public class RandomNumberListGenerator {

	/**
	 * 
	 */
	public RandomNumberListGenerator() {
		super();
	}

	/**
	 * 
	 * @param floor
	 * @param ceiling
	 * @param size
	 * @return
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
