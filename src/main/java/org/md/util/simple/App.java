package org.md.util.simple;

import java.util.List;

import org.apache.log4j.Logger;

/**
 * PoC project for Jenkins/Reporting. Create a list of random integers and write
 * list in index.html file as a variable replacing a specific line.
 * 
 * @author Cameron
 */
public class App {

	private final static Logger LOG = Logger.getLogger(App.class);
	public static void main(String[] args) {
		List<Integer> list = new RandomNumberListGenerator().createListOfRandomIntegers(1, 100, 100);
		LOG.info("list: " + list.toString());
		List<Integer> rollingAverage = new RollingAverageCalculator().calculateRollingAverage(list);
		LOG.info("rollingAverage: " + rollingAverage.toString());
		String jsArray = new JavaScripVariableCreator().createJavaScriptArrayString(rollingAverage);
		new FileModifier().modifyIndexFile(jsArray);
	}
}
