package org.md.util.simple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Used to updated an index.html page with a JavaScript variable String to be
 * used in Chart.js chart.
 * 
 * @author Cameron
 */
public class FileModifier {

	private static final String PLACE_HOLDER_CONTENT = "/* REPLACE THIS LINE WITH REPORT GENERATED OBJECT */";
	private static final String ORIGINAL_INDEX = "src/main/resources/index.html";
	private static final String MODIFIED_INDEX = "target/index.html";

	/**
	 * Empty constructor
	 */
	public FileModifier() {
		super();
	}

	/**
	 * Modifies and index.html file from /resources and writes it to target
	 * directory.
	 * 
	 * @param replacementLine
	 *            String of line being replaced in file, assumed to be a JavaScript
	 *            var String
	 */
	public void modifyIndexFile(String replacementLine) {
		String modifiedIndexFile = modifyIndexFileWithReplacementLine(replacementLine);
		writeModifiedIndexToTargetDirectory(modifiedIndexFile);
	}

	/**
	 * Create String based off index.html in /resources that replaces the line
	 * containing the PLACE_HOLDER String with replacementLine; assuming the
	 * replacementLine is a JavaScript variable.
	 * 
	 * @param replacementLine
	 *            String of line being replaced in file, assumed to be a JavaScript
	 *            var String
	 * @return String of a index.html page with a replaced line.
	 */
	private String modifyIndexFileWithReplacementLine(String replacementLine) {
		File fileToBeModified = new File(ORIGINAL_INDEX);
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
		return sb.toString();
	}

	/**
	 * Writes modifeid index.html file to the /target directory.
	 * 
	 * @param modifiedIndexFile
	 *            String of modified index.html file.
	 */
	private void writeModifiedIndexToTargetDirectory(String modifiedIndexFile) {
		try {
			FileWriter writer = new FileWriter(new File(MODIFIED_INDEX));
			writer.write(modifiedIndexFile);
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
