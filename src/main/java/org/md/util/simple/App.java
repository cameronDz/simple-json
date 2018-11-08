package org.md.util.simple;

import java.util.List;

/**
 * PoC project for Jenkins/Reporting. Create a list of random integers and write
 * list in index.html file as a variable replacing a specific line.
 * 
 * @author Cameron
 */
public class App {
	public static void main(String[] args) {
		List<Integer> list = new RandomNumberListGenerator().createListOfRandomIntegers(1, 100, 100);
		System.out.println("list: " + list.toString());
		List<Integer> rollingAverage = new RollingAverageCalculator().calculateRollingAverage(list);
		System.out.println("rollingAverage: " + rollingAverage.toString());
		String jsArray = new JavaScripVariableCreator().createJavaScriptArrayString(rollingAverage);
		new FileModifier().modifyIndexFile(jsArray);
	}
}
