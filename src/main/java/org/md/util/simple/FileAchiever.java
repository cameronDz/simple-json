package org.md.util.simple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author Cameron
 */
public class FileAchiever {

	private static final String PLACE_HOLDER_CONTENT = "/* REPLACE THIS LINE WITH REPORT GENERATED OBJECT */";

	/**
	 * 
	 */
	public FileAchiever() {
		super();
	}

	/**
	 * 
	 * @param replacementLine
	 * @throws IOException
	 */
	public void modifyIndexFile(String replacementLine) {
		File fileToBeModified = new File("src/main/resources/index.html");
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileToBeModified));
			String line = reader.readLine();
			while (line != null) {
				if (line.contains(PLACE_HOLDER_CONTENT)) {
					sb.append(replacementLine);
				} else {
					sb.append(line);
				}
				sb.append(System.lineSeparator());
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileWriter writer = new FileWriter(new File("target/index.html"));
			writer.write(sb.toString());
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "FileAchiever []";
	}
}
