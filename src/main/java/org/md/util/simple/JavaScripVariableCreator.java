package org.md.util.simple;

import java.util.List;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Used to create a JavaScript array on integers as String
 * 
 * @author Cameron
 */
public class JavaScripVariableCreator {

	private final static Logger LOG = Logger.getLogger(JavaScripVariableCreator.class);

	/**
	 * Empty constructor
	 */
	public JavaScripVariableCreator() {
		super();
	}

	/**
	 * Create String to be used in a JavaScript file/script of a list of Integers
	 * 
	 * @param list
	 *            List of integers to be used as the list in the JavaScript script.
	 * @return String of a JavaScript array variable.
	 */
	public String createJavaScriptArrayString(List<Integer> list) {
		StringBuilder sb = new StringBuilder();
		sb.append("var list = '");
		if (list == null || list.isEmpty()) {
			sb.append("[]");
		} else {
			try {
				ObjectMapper mapper = new ObjectMapper();
				sb.append(mapper.writeValueAsString(list));
			} catch (JsonProcessingException e) {
				LOG.error(e);
			}
		}
		sb.append("'");
		return sb.toString();
	}

	@Override
	public String toString() {
		return "JavaScripVariableCreator []";
	}
}
