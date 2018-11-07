package org.md.util.simple;

import java.util.List;

/**
 * @author Cameron
 */
public class App {
	public static void main(String[] args) {
		List<Integer> list = new RandomNumberListGenerator().createListOfRandomIntegers(1, 100, 100);
		String jsArray = new JavaScripVariableCreator().createJavaScriptArrayString(list);
		new FileAchiever().achieveJavaScriptStringAsFile(jsArray);
	}
}
