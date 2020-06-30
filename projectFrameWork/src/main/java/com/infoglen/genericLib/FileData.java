package com.infoglen.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileData {

	public String fetchDatafrom(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/main/resources/GmapCommonData.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	}
}
