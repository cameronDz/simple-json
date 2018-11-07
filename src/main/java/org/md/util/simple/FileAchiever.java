package org.md.util.simple;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * 
 * @author Cameron
 */
public class FileAchiever {

	/**
	 * 
	 */
	public FileAchiever() {
		super();
	}

	/**
	 * 
	 * @param jsArray
	 */
	public void achieveJavaScriptStringAsFile(String jsArray) {
		PrintStream out;
		try {
			out = new PrintStream(new FileOutputStream("target/list.js"));
			out.print(jsArray);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "FileAchiever []";
	}
}
