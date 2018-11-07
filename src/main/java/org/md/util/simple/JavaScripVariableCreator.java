package org.md.util.simple;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @author Cameron
 */
public class JavaScripVariableCreator {

	/**
	 * 
	 */
	public JavaScripVariableCreator() {
		super();
	}

	/**
	 * 
	 * @param list
	 * @return
	 */
	public String createJavaScriptArrayString(List<Integer> list) {
		StringBuilder sb = new StringBuilder();
		sb.append("var list = '");
		try {
			ObjectMapper mapper = new ObjectMapper();
			sb.append(mapper.writeValueAsString(list));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		sb.append("'");
		return sb.toString();
	}

	@Override
	public String toString() {
		return "JavaScripVariableCreator []";
	}
}
