package UnitTest;

import java.io.IOException;

import Utilities.PropertiesFileUtils;

public class TestPropertiesFileUtils {
	public static void main(String[] args) throws IOException {

		/*
		 * PropertiesFileUtils utils = new PropertiesFileUtils(); String fName =
		 * utils.getDataFromPropertiesFile(".\\config.properties", null);
		 * 
		 * System.out.println(fName); System.out.println(fName.length());
		 */ 

		PropertiesFileUtils pro = new PropertiesFileUtils();
		String val = pro.getDataFromPropertiesFile("config", "frameworkName");

		System.out.println(val);
		
		

	}

}
