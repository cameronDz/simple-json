package org.md.util.simple;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class JavaScripVariableCreatorTest {

	private static final JavaScripVariableCreator CREATOR = new JavaScripVariableCreator();
	private static final List<Integer> POPULATED_LIST = Arrays.asList(new Integer[] { 1, 2, 3 });
	private static final List<Integer> EMPTY_LIST = Arrays.asList(new Integer[] {});

	private static final String EMPTY_VAR = "var list = '[]'";
	private static final String POPULATED_VAR = "var list = '[1,2,3]'";

	@Test
	public void toString_test() {
		String expected = "JavaScripVariableCreator []";
		String actual = CREATOR.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void createJavaScriptArrayString_nullList_returnsUnpopulatedJavaScriptVar() {
		String expected = EMPTY_VAR;
		String actual = CREATOR.createJavaScriptArrayString(null);
		assertEquals(expected, actual);
	}

	@Test
	public void createJavaScriptArrayString_emptyList_returnsUnpopulatedJavaScriptVar() {
		String expected = EMPTY_VAR;
		String actual = CREATOR.createJavaScriptArrayString(EMPTY_LIST);
		assertEquals(expected, actual);
	}

	@Test
	public void createJavaScriptArrayString_fullList_returnsPopulatedJavaScriptVar() {
		String expected = POPULATED_VAR;
		String actual = CREATOR.createJavaScriptArrayString(POPULATED_LIST);
		assertEquals(expected, actual);
	}
}
