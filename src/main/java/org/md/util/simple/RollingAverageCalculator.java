package org.md.util.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Cameron
 */
public class RollingAverageCalculator {

	/**
	 * Empty constructor
	 */
	public RollingAverageCalculator() {
		// empty
	}

	/**
	 * 
	 * @param list
	 * @return
	 */
	public List<Integer> calculateRollingAverage(List<Integer> list) {
		List<Integer> averages = new ArrayList<Integer>();
		if (list == null || list.size() < 9) {
			// TODO add log
			averages = list;
		} else {
			for (int i = 3; i < list.size() - 3; i++) {
				Integer sum = list.get(i - 3) + list.get(i - 2) + list.get(i - 1) + list.get(i) + list.get(i + 1)
						+ list.get(i + 2);
				Integer ave = sum / 6;
				averages.add(ave);
			}
		}
		return averages;
	}
}
