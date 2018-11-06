package org.md.util.simple;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Cameron
 */
public class App {
	public static void main(String[] args) {
		List<Integer> list = generateListOfRandomIntegers(100, 1, 100);
		String array = createJsonArrayString(list);
		achieveNodeAsJsonFile(array);
	}

	/**
	 * 
	 * @param size
	 * @param floor
	 * @param ceiling
	 * @return
	 */
	private static List<Integer> generateListOfRandomIntegers(int size, int floor, int ceiling) {
		List<Integer> list = new ArrayList<Integer>();
		if (size > 0) {
			Random rand = new Random();
			for (int i = 0; i < size; i++) {
				list.add(rand.nextInt(ceiling) + floor);
			}
		}
		return list;
	}

	/**
	 * 
	 * @param list
	 * @return
	 */
	private static String createJsonArrayString(List<Integer> list) {
		String array = "[]";
		ObjectMapper mapper = new ObjectMapper();
		try {
			array = mapper.writeValueAsString(list);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return array;
	}

	/**
	 * 
	 * @param array
	 */
	private static void achieveNodeAsJsonFile(String array) {
		PrintStream out;
		try {
			out = new PrintStream(new FileOutputStream("target/list.json"));
			out.print(array);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
