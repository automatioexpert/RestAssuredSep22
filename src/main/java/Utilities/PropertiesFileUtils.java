package Utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.testng.Assert;

public class PropertiesFileUtils {
	private Properties properties;

	/*
	 * 1. Problem with Hard Coding file path 2. No Exception handled 3. Exception
	 * handling on Non found of Key 4. Key should be valid 5. Multiple times of
	 * loading of properties file
	 */
	public String getDataFromPropertiesFile(String fileName, String key) throws IOException {

		InputStream is = PropertiesFileUtils.class.getClassLoader()
				.getResourceAsStream("propertiesFiles/" + fileName + ".properties");
		// FileInputStream fis = new FileInputStream(propertiesFilePath);
		Properties properties = new Properties();
		try {
			properties.load(is);
		} catch (NullPointerException e) {
			System.out.println("File is not found..Please provide correct file");
			// e.printStackTrace();
			System.out.println(e.getMessage());
			Assert.fail("File is not found so terminating the execution.");
		}

		String val = properties.getProperty(key);
		if (val == null) {
			return "Key" + key + " not found";
		} else

			return properties.getProperty(key);
	}
	
	private String getValue(String key) {
		String val = properties.getProperty(key);
		if (val == null) {
			return "Key" + key + " not found";
		} else

			return properties.getProperty(key);
	}
	
	public Map<String,String> getValue(List<String> keys) {
		Map<String,String> values = new  HashMap<>();
		
		for(String key:keys) {
			values.put(key, getValue(key));
		}
		
		return values;
	}

	

}
